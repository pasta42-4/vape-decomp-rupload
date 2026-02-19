import java.lang.instrument.Instrumentation;
import java.util.jar.JarFile;

public class SimpleAgent {
    
    public static void agentmain(String args, Instrumentation inst) {
        try {
            System.out.println("[Agent] Starting...");
            
            // Get agent path
            String path = SimpleAgent.class.getProtectionDomain()
                                           .getCodeSource()
                                           .getLocation()
                                           .getPath();
            
            // Decode path
            path = java.net.URLDecoder.decode(path, "UTF-8");
            
            // Windows fix
            if (path.matches("^/[A-Za-z]:.*")) {
                path = path.substring(1);
            }
            
            System.out.println("[Agent] JAR: " + path);
            
            // Get parent directory
            java.io.File agentFile = new java.io.File(path);
            java.io.File parent = agentFile.getParentFile();
            
            // Find target.jar
            java.io.File targetJar = new java.io.File(parent, "target.jar");
            
            if (!targetJar.exists()) {
                System.out.println("[Agent] ERROR: target.jar not found in " + parent);
                return;
            }
            
            System.out.println("[Agent] Found: " + targetJar);
            
            // Load it using Instrumentation (Java 9+ safe)
            inst.appendToSystemClassLoaderSearch(new JarFile(targetJar));
            
            System.out.println("[Agent] SUCCESS - JAR loaded!");
            
            // Try to find Main-Class
            JarFile jar = new JarFile(targetJar);
            java.util.jar.Manifest mf = jar.getManifest();
            if (mf != null) {
                String mainClass = mf.getMainAttributes().getValue("Main-Class");
                if (mainClass != null) {
                    System.out.println("[Agent] Starting: " + mainClass);
                    
                    final String mc = mainClass;
                    new Thread(new Runnable() {
                        public void run() {
                            try {
                                Class.forName(mc).getMethod("main", String[].class)
                                                 .invoke(null, (Object)new String[0]);
                            } catch (Exception e) {
                                System.out.println("[Agent] Main failed: " + e);
                            }
                        }
                    }).start();
                }
            }
            jar.close();
            
        } catch (Exception e) {
            System.out.println("[Agent] FAILED: " + e);
            e.printStackTrace();
        }
    }
    
    public static void premain(String args, Instrumentation inst) {
        agentmain(args, inst);
    }
}
