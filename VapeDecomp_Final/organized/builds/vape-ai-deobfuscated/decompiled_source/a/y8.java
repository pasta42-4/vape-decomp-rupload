/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.RF;
import a.Ry;
import a.bE;
import com.app.caching.core.CacheInvalidationManager2335;
import com.app.core.generics.GenericTypeResolver;
import com.app.ui.styling.VisualStyleCompositor;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.processing.DataTransformationEngine263;
import com.data.serialization.JsonPayloadOrchestrator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.transformation.GeometricTransformEngine;
import com.network.connection.NetworkConnectionManager1525;
import com.network.protocol.CommunicationProtocolManager;
import com.security.adaptive.AdaptiveCipherProcessor;
import com.security.crypto.CryptographicSecurityManager;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.cryptography.CryptographicContextManager153;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.adaptive.AdaptiveWorkflowController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class y8
extends AdaptiveWorkflowController {
    private static final long eb;
    private static final long[] qb;
    @Nullable
    private Runnable M6;
    protected JsonPayloadOrchestrator MX;
    private boolean Mi;
    private static final Integer[] rb;
    private static final Map sb;
    private static final Object[] Eb;
    private static final String[] Fb;
    protected Ry Mb;

    @Override
    protected void J() {
        AbstractComputationKernel abstractComputationKernel;
        List<CryptographicSecurityManager> list;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        CacheInvalidationManager2335 cacheInvalidationManager2335;
        long l;
        block7: {
            block6: {
                l = eb ^ 0x18ABAE71BAF4L;
                try {
                    super.J();
                    if (this.MX == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw y8.a(customSystemException);
                }
                this.Z();
                this.I().i(false);
                GraphicalRenderEngine1082 graphicalRenderEngine10822 = this.I();
                this.getClass();
                graphicalRenderEngine10822.n(new bE(5.0, 0.0), y8.j("\u00d4", (int)y8.d("q", (int)25, (long)(0x1924C3FC43C9424DL ^ l)), (long)4640754582992442622L, (long)l));
                GraphicalRenderEngine1082 graphicalRenderEngine10823 = new GraphicalRenderEngine1082(this.I().w(), 25.0);
                graphicalRenderEngine10823.i(false);
                graphicalRenderEngine10823.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)30853, (long)(0x1B7B8470B174BADBL ^ l)), (long)4640754582992442622L, (long)l)));
                this.I().n(graphicalRenderEngine10823, new Object[0]);
                this.getClass();
                graphicalRenderEngine10823.n(new bE(5.0, 0.0), y8.j("\u00d4", (int)y8.d("q", (int)27305, (long)(0x7D91191DA47BA8F5L ^ l)), (long)4640754582992442622L, (long)l));
                VisualStyleCompositor visualStyleCompositor = new VisualStyleCompositor((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)14236, (long)(0x3E6C728925F7F5C7L ^ l)), (long)4640754582992442622L, (long)l)), 5.0f, 5.0f);
                String string = this.Mb.e();
                CallSite callSite = y8.j("\u00d4", (int)y8.d("q", (int)24612, (long)(0x50D8618C00EC2272L ^ l)), (long)4640754582992442622L, (long)l);
                double d2 = graphicalRenderEngine10823.w();
                this.getClass();
                CryptographicSecurityManager396 cryptographicSecurityManager396 = new CryptographicSecurityManager396(string, (String)((Object)callSite), d2 - (double)(5.0f * 2.0f) - visualStyleCompositor.w(), 1.0, y8.M.c, true);
                cryptographicSecurityManager396.T(cryptographicSecurityManager396.x());
                cryptographicSecurityManager396.w(10.0);
                graphicalRenderEngine10823.n(cryptographicSecurityManager396, new Object[0]);
                visualStyleCompositor.Y(y8.M.n);
                this.x(graphicalRenderEngine10823);
                cacheInvalidationManager2335 = new CacheInvalidationManager2335((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)28353, (long)(0xA9979783F182C9CL ^ l)), (long)4640754582992442622L, (long)l)), 0.8, true, this, this::lambda$setup$0);
                cacheInvalidationManager2335.J(true);
                cacheInvalidationManager2335.T(graphicalRenderEngine10823.w() - 2.0);
                this.I().n(cacheInvalidationManager2335, new Object[0]);
                this.I().n(new bE(0.0, 6.0), new Object[0]);
                graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.I().w(), this.I().b() - graphicalRenderEngine10823.b());
                this.I().n(graphicalRenderEngine1082, new Object[0]);
                graphicalRenderEngine1082.i(false);
                graphicalRenderEngine1082.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)15004, (long)(0x49838C19B98678C3L ^ l)), (long)4640754582992442622L, (long)l)));
                list = this.MX.x(false);
                try {
                    if (!this.Mi || this.MX.P() == null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw y8.a(customSystemException);
                }
                abstractComputationKernel = new AdaptiveCipherProcessor(this.MX, graphicalRenderEngine1082.w(), false);
                ((AdaptiveCipherProcessor)abstractComputationKernel).G(GraphicalRenderingController.w);
                ((AdaptiveCipherProcessor)abstractComputationKernel).j(this.MX);
                graphicalRenderEngine1082.n(abstractComputationKernel, new Object[0]);
                break block7;
            }
            abstractComputationKernel = new RF(list.size());
            graphicalRenderEngine1082.n(abstractComputationKernel, new Object[0]);
        }
        GraphicalRenderEngine1082 graphicalRenderEngine10824 = new GraphicalRenderEngine1082(graphicalRenderEngine1082.w(), graphicalRenderEngine1082.b() - abstractComputationKernel.b() - cacheInvalidationManager2335.b());
        graphicalRenderEngine10824.i(false);
        graphicalRenderEngine10824.Q(this.l());
        graphicalRenderEngine10824.i(graphicalRenderEngine10824.b() - 6.0);
        graphicalRenderEngine10824.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)5342, (long)(0x14DF4F28D675D686L ^ l)), (long)4640754582992442622L, (long)l)));
        for (CryptographicSecurityManager cryptographicSecurityManager : list) {
            CacheInvalidationManager2335 cacheInvalidationManager23352 = new CacheInvalidationManager2335(cryptographicSecurityManager.O(), 0.8, this, () -> this.lambda$setup$1(cryptographicSecurityManager));
            cacheInvalidationManager23352.J(true);
            cacheInvalidationManager23352.T(graphicalRenderEngine10824.w() - 4.0);
            graphicalRenderEngine10824.n(cacheInvalidationManager23352, new Object[0]);
        }
        graphicalRenderEngine1082.n(graphicalRenderEngine10824, new Object[0]);
    }

    protected void y() {
        long l = eb ^ 0x4C2D37B8FA1AL;
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.I();
        this.getClass();
        graphicalRenderEngine1082.n(new bE(5.0, 0.0), new Object[0]);
        double d2 = this.I().w();
        this.getClass();
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(d2 - 5.0, this.I().b());
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine10822.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)32669, (long)(0x757D3C6CD9FF7D2AL ^ l)), (long)38580978268935184L, (long)l)));
        this.I().n(graphicalRenderEngine10822, new Object[0]);
        graphicalRenderEngine10822.n(new NetworkConnectionManager1525(graphicalRenderEngine10822.w(), 20.0), new Object[0]);
        graphicalRenderEngine10822.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine10822.n(new NetworkConnectionManager1525(graphicalRenderEngine10822.w(), 15.0), new Object[0]);
        graphicalRenderEngine10822.n(new bE(0.0, 3.0), new Object[0]);
        graphicalRenderEngine10822.n(new NetworkConnectionManager1525(graphicalRenderEngine10822.w(), 15.0), new Object[0]);
        graphicalRenderEngine10822.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine10822.n(new NetworkConnectionManager1525(graphicalRenderEngine10822.w(), 110.0), new Object[0]);
    }

    @Override
    public void v() {
        long l = eb ^ 0x40FB6072D69CL;
        super.v();
        this.BM.n(new bE(0.0, 1.5), new Object[0]);
        this.BM.n(new GeometricTransformEngine(this.BM.w(), 1.0, 0.5, 0.0, y8.M.T), y8.j("\u00d4", (int)y8.d("q", (int)20515, (long)(0x505EE06F266E7E1CL ^ l)), (long)3174789128869165206L, (long)l));
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = y8.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = y8.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field s(long l, long l2) {
        int n = y8.q(l, l2);
        Object object = Eb[n];
        if (object instanceof String) {
            String string = Fb[n];
            int n2 = string.indexOf(8);
            Class clazz = y8.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = y8.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y8.i(clazz3, string2, clazz2)) != null) {
                    y8.Eb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = y8.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        y8.Eb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y8.r(247521832942570L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method t(long l, long l2) {
        int n = y8.q(l, l2);
        Object object = Eb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = y8.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = y8.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y8.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        y8.Eb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y8.r(247521832942570L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = y8.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        y8.Eb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y8.r(247521832942570L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = y8.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void g(@Nullable Runnable runnable) {
        this.M6 = runnable;
    }

    private static void eb() {
        Object[] objectArray = Eb;
        Eb[0] = " 9[";
        objectArray[1] = Integer.TYPE;
        y8.Fb[1] = "java/lang/Integer";
        objectArray[2] = "7\f\u001cqe\u0006<\u0003\r>\u0018\u001e/\u0004\u0004w";
        objectArray[3] = "\u0010 Xj`-\u001b/I%\u0001#\u0010$M\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "s-jg\u0000Xxr`W\u0011\u0012Bdz%\b\u0015rz}=zP?sj0\u001b\u0014r,bW";
    }

    public y8(CommunicationProtocolManager communicationProtocolManager, Ry ry, JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        this(communicationProtocolManager, ry, jsonPayloadOrchestrator, false);
    }

    @Nullable
    public Runnable Q() {
        return this.M6;
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = y8.q(l, l2);
            object = Eb[n];
            try {
                if (!(object instanceof String)) break block2;
                y8.Eb[n] = clazz = Class.forName(Fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == 'L' || c == 'X' || c == '\u00ce') {
                field = y8.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y8.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = y8.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    protected void x(GraphicalRenderEngine1082 graphicalRenderEngine1082) {
    }

    public Ry x() {
        return this.Mb;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x238;
        if (rb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = qb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])sb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    sb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y8.rb[n2] = n3;
        }
        return rb[n2];
    }

    public boolean V() {
        return this.Mi;
    }

    private void lambda$setup$1(CryptographicSecurityManager cryptographicSecurityManager) {
        this.c(cryptographicSecurityManager);
    }

    private static int lambda$viewModuleDetails$2(GenericTypeResolver genericTypeResolver, GenericTypeResolver genericTypeResolver2) {
        return Boolean.compare(genericTypeResolver.H(), genericTypeResolver2.H());
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected void c(CryptographicSecurityManager cryptographicSecurityManager) {
        long l = eb ^ 0x30B1707E06A3L;
        this.m();
        double d2 = this.Ba.w();
        this.getClass();
        double d3 = d2 - 5.0;
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d3, 12.0);
        graphicalRenderEngine1082.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)17666, (long)(0x7293085BD98BBB0FL ^ l)), (long)-274598981986129751L, (long)l)));
        graphicalRenderEngine1082.i(false);
        this.Ba.n(graphicalRenderEngine1082, new Object[0]);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153(cryptographicSecurityManager.O(), 1.0);
        cryptographicContextManager153.q(true);
        cryptographicContextManager153.B(y8.M.c);
        graphicalRenderEngine1082.n(cryptographicContextManager153, new Object[0]);
        List list = cryptographicSecurityManager.o().stream().sorted(y8::lambda$viewModuleDetails$2).collect(Collectors.toList());
        for (GenericTypeResolver genericTypeResolver : list) {
            DataTransformationEngine263 dataTransformationEngine263 = new DataTransformationEngine263(this.MX, cryptographicSecurityManager, genericTypeResolver);
            dataTransformationEngine263.T(this.Ba.w() - 5.0);
            dataTransformationEngine263.Q(y8.M.g);
            this.Ba.n(dataTransformationEngine263, new Object[0]);
        }
    }

    public y8(CommunicationProtocolManager communicationProtocolManager, Ry ry, JsonPayloadOrchestrator jsonPayloadOrchestrator, boolean bl) {
        super(communicationProtocolManager);
        this.Mb = ry;
        this.MX = jsonPayloadOrchestrator;
        this.Mi = bl;
        this.J();
    }

    public JsonPayloadOrchestrator k() {
        return this.MX;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                y8.eb = MultiContainerRegistry.a(3958447880778799181L, -6229609181075634371L, MethodHandles.lookup().lookupClass()).a(231320731841366L);
                y8.Eb = new Object[5];
                y8.Fb = new String[5];
                y8.eb();
                y8.sb = new HashMap<K, V>(13);
                var0 = y8.eb ^ 14287038860572L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\\\u001bj%\u00ba\u00bc9f\u008e\u0005\u00c4\u00953\u00c6\u00aa\u000e,\u0093T\t\u0011\u00a9\u00a1F\u0080\u0090HH\u00a1\u00b3\u00ce\u0096&\u0095\u00f6h\u00ef\u00d2\u00b2\u00c1\u00e1\u00e4\u00a7\u00bfb\u00deu\u00b3\u00ae\u00c9n\u00b8\u00e7\u00a8\u00d3=q1bcT\u00b3P\u00c7`\u009c\u0012\u0000\u00bf\u00f7\u00cd\u00d9";
                var7_6 = "\\\u001bj%\u00ba\u00bc9f\u008e\u0005\u00c4\u00953\u00c6\u00aa\u000e,\u0093T\t\u0011\u00a9\u00a1F\u0080\u0090HH\u00a1\u00b3\u00ce\u0096&\u0095\u00f6h\u00ef\u00d2\u00b2\u00c1\u00e1\u00e4\u00a7\u00bfb\u00deu\u00b3\u00ae\u00c9n\u00b8\u00e7\u00a8\u00d3=q1bcT\u00b3P\u00c7`\u009c\u0012\u0000\u00bf\u00f7\u00cd\u00d9".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00aa\u00ac\u0092\u009a\u00a4\u00aa:c\u00c6\u00e7\u00ca\u00bf9m\u0001\u00e0";
                    var7_6 = "\u00aa\u00ac\u0092\u009a\u00a4\u00aa:c\u00c6\u00e7\u00ca\u00bf9m\u0001\u00e0".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        y8.qb = var8_3;
        y8.rb = new Integer[11];
    }

    private void lambda$setup$0() {
        try {
            if (this.M6 != null) {
                this.M6.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw y8.a(customSystemException);
        }
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = y8.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = y8.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Fb[n4] != null) {
            return n4;
        }
        Object object = Eb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 50;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 55;
                break;
            }
            case 5: {
                n3 = 42;
                break;
            }
            case 6: {
                n3 = 11;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 21;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 17;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 0;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 63;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 60;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 12;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 59;
                break;
            }
            case 31: {
                n3 = 29;
                break;
            }
            case 32: {
                n3 = 37;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 24;
                break;
            }
            case 35: {
                n3 = 31;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 46;
                break;
            }
            case 41: {
                n3 = 32;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 56;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 53;
                break;
            }
            case 47: {
                n3 = 22;
                break;
            }
            case 48: {
                n3 = 7;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 43;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 40;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 49;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 38;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        y8.Fb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y8.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(y8.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

