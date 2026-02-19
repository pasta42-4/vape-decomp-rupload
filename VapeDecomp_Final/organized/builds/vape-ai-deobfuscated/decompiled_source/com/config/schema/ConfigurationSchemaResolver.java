/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.config.schema;

import a.ec;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ConfigurationSchemaResolver
extends ConfigurationProfileResolver<Map<String, String>, ConfigurationSchemaResolver> {
    private static final Map g;
    private static final long a;
    private static final Integer[] e;
    private final String o;
    private final String n;
    private final String t;
    private static final Object[] h;
    private static final long[] d;
    private static final String[] k;

    @Override
    public void c(String string) {
        ((Map)this.J()).remove(string);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationSchemaResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationSchemaResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = ConfigurationSchemaResolver.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConfigurationSchemaResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationSchemaResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationSchemaResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationSchemaResolver.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationSchemaResolver.f(255203758097734L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationSchemaResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationSchemaResolver.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationSchemaResolver.f(255203758097734L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public String Z() {
        return this.o;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F83;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationSchemaResolver.e[n2] = n3;
        }
        return e[n2];
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        long l = a ^ 0x410C7435520DL;
        try {
            if (!jsonObject.has((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)1536, (long)(0x6353CC0EF0E444C3L ^ l)), (long)-8268313351309544218L, (long)l)))) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSchemaResolver.a(customSystemException);
        }
        JsonObject jsonObject2 = (JsonObject)jsonObject.get((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)26584, (long)(0x5AEC99816116A51EL ^ l)), (long)-8268313351309544218L, (long)l)));
        Set set = jsonObject2.entrySet();
        ((Map)this.J()).clear();
        for (Map.Entry entry : set) {
            String string = (String)entry.getKey();
            String string2 = ((JsonElement)entry.getValue()).getAsString();
            if (string.startsWith((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)11108, (long)(0x1FCBAA36BE6E69A3L ^ l)), (long)-8268313351309544218L, (long)l)))) {
                string = ec.c(string.split((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)7829, (long)(0x614D7326080D5C50L ^ l)), (long)-8268313351309544218L, (long)l)))[1]);
                string2 = ec.c(string2.split((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)27180, (long)(0x48FC9C47DB91A8ECL ^ l)), (long)-8268313351309544218L, (long)l)))[1]);
            }
            this.m(string, string2);
        }
        return true;
    }

    @Override
    public boolean p() {
        boolean bl;
        block5: {
            block4: {
                Map map = (Map)this.J();
                Map map2 = (Map)this.u();
                try {
                    try {
                        if (map.size() != map2.size() || !map.equals(map2)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationSchemaResolver.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationSchemaResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public ConfigurationSchemaResolver(Object object, String string, String string2, String string3) {
        super(object, string, new LinkedHashMap());
        this.H(new LinkedHashMap());
        this.n = string;
        this.o = string2;
        this.t = string3;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void W() {
        try {
            if (this.s()) {
                this.H(new LinkedHashMap());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSchemaResolver.a(customSystemException);
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationSchemaResolver.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationSchemaResolver.h[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationSchemaResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigurationSchemaResolver.a = MultiContainerRegistry.a(1374414438492538664L, 3365657796556934897L, MethodHandles.lookup().lookupClass()).a(217240123631222L);
                ConfigurationSchemaResolver.h = new Object[5];
                ConfigurationSchemaResolver.k = new String[5];
                ConfigurationSchemaResolver.a();
                ConfigurationSchemaResolver.g = new HashMap<K, V>(13);
                var0 = ConfigurationSchemaResolver.a ^ 6873775902357L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00f8\u00fb\u00a29\f\u00ed\u0090&\u00c9\u00e7\u001d\u008f\u009e7\u00cd+\u0088\u00bc\u00bcC%\u00e7;\u00fb\u009e\u00efC\u00ee\u008d\u009e\u00cf&C\u00d7\u00dfU^\u00dc\u0004%\u008d$`\u00f9\u00a9\u00e0\u00fd\u0099OL\u00fc\u00af-\u0012\u00fa\u0096";
                var7_6 = "\u00f8\u00fb\u00a29\f\u00ed\u0090&\u00c9\u00e7\u001d\u008f\u009e7\u00cd+\u0088\u00bc\u00bcC%\u00e7;\u00fb\u009e\u00efC\u00ee\u008d\u009e\u00cf&C\u00d7\u00dfU^\u00dc\u0004%\u008d$`\u00f9\u00a9\u00e0\u00fd\u0099OL\u00fc\u00af-\u0012\u00fa\u0096".length();
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
                    var6_5 = "\u00d3\u00ea\u009b+\u00ba\u00aa\u00e0\u00ce\u0087h\u008c\f\u0085\u00db*\u0006";
                    var7_6 = "\u00d3\u00ea\u009b+\u00ba\u00aa\u00e0\u00ce\u0087h\u008c\f\u0085\u00db*\u0006".length();
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
        ConfigurationSchemaResolver.d = var8_3;
        ConfigurationSchemaResolver.e = new Integer[9];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationSchemaResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationSchemaResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == '\u00a4' || c == 'S' || c == '\u00c7') {
                field = ConfigurationSchemaResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationSchemaResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationSchemaResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void i(String string) {
    }

    public ConfigurationSchemaResolver w() {
        return new ConfigurationSchemaResolver(null, this.n, this.o, this.t);
    }

    public String q() {
        return this.t;
    }

    public static ConfigurationSchemaResolver c(Object object, String string, String string2, String string3) {
        return new ConfigurationSchemaResolver(object, string, string2, string3);
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0001@:";
        objectArray[1] = Integer.TYPE;
        ConfigurationSchemaResolver.k[1] = "java/lang/Integer";
        objectArray[2] = "=~>y[V6q/6&N%v&\u007f";
        objectArray[3] = "\ry\u0018&@F\u0006v\ti!H\r}\r3";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "4+`AD\u0015+2#\u007f\u0013PPm$\u000fB\u0016,3sE\n+i5d\u001a\u001dG>8}\u001dx";
    }

    public void m(String string, String string2) {
        ((Map)this.J()).put(string, string2);
    }

    private static Field g(long l, long l2) {
        int n = ConfigurationSchemaResolver.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationSchemaResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationSchemaResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationSchemaResolver.c(clazz3, string2, clazz2)) != null) {
                    ConfigurationSchemaResolver.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationSchemaResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationSchemaResolver.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationSchemaResolver.f(255203758097734L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 4;
                break;
            }
            case 5: {
                n3 = 53;
                break;
            }
            case 6: {
                n3 = 55;
                break;
            }
            case 7: {
                n3 = 5;
                break;
            }
            case 8: {
                n3 = 50;
                break;
            }
            case 9: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 35;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 39;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 45;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 15;
                break;
            }
            case 20: {
                n3 = 2;
                break;
            }
            case 21: {
                n3 = 59;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 23;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 52;
                break;
            }
            case 28: {
                n3 = 37;
                break;
            }
            case 29: {
                n3 = 31;
                break;
            }
            case 30: {
                n3 = 24;
                break;
            }
            case 31: {
                n3 = 44;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 56;
                break;
            }
            case 34: {
                n3 = 11;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 40;
                break;
            }
            case 39: {
                n3 = 18;
                break;
            }
            case 40: {
                n3 = 16;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 12;
                break;
            }
            case 47: {
                n3 = 51;
                break;
            }
            case 48: {
                n3 = 49;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 6;
                break;
            }
            case 52: {
                n3 = 20;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 48;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 30;
                break;
            }
            case 57: {
                n3 = 13;
                break;
            }
            case 58: {
                n3 = 28;
                break;
            }
            case 59: {
                n3 = 63;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 60;
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
        ConfigurationSchemaResolver.k[n4] = new String(cArray);
        return n4;
    }

    @Override
    public JsonObject k(boolean bl) {
        long l = a ^ 0x417FD3DBF5DCL;
        JsonObject jsonObject = super.k(bl);
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry entry : ((Map)this.J()).entrySet()) {
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            String string3 = (String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)28625, (long)(0x68077ADB17A20AC2L ^ l)), (long)3066965244157727543L, (long)l)) + ec.A(string);
            String string4 = (String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)9271, (long)(0x651F5B63F7284122L ^ l)), (long)3066965244157727543L, (long)l)) + ec.A(string2);
            jsonObject2.addProperty(string3, string4);
        }
        jsonObject.add((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)20620, (long)(0xD51C53074BEB59CL ^ l)), (long)3066965244157727543L, (long)l)), (JsonElement)jsonObject2);
        jsonObject.remove((String)((Object)ConfigurationSchemaResolver.d("\u00f2", (int)ConfigurationSchemaResolver.b("r", (int)30666, (long)(0x2B2875CE2C4B92D0L ^ l)), (long)3066965244157727543L, (long)l)));
        return jsonObject;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationSchemaResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationSchemaResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

