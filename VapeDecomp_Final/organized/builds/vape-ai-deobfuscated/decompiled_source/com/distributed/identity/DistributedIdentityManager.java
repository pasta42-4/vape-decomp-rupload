/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.distributed.identity;

import a.Yw;
import com.app.network.response.ResponseHandlingStrategy;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.collections.management.MultiContainerRegistry;
import com.data.mapping.IntegerMappingRegistry;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.resource.management.CloneableResourceDescriptor;
import com.security.crypto.CryptographicInterface;
import com.security.operations.CryptographicOperationCoordinator;
import com.security.protocol.EncryptionProtocolHandler397;
import com.security.session.CryptographicSessionManager;
import com.system.transformation.DataTransformationUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class DistributedIdentityManager
implements Yw {
    private static final Map e;
    private static final Object[] i;
    @Nullable
    private UUID l;
    @Nullable
    private CryptographicInterface q;
    private static final long[] c;
    @Nullable
    private CryptographicSessionManager n;
    private static final Integer[] d;
    private static final long a;
    private static final String[] j;
    private final CloneableResourceDescriptor v;
    private static String[] X;

    private void L() {
        this.n = null;
        this.l = null;
    }

    @Override
    public void R() {
        this.n = null;
        this.l = null;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\"/o";
        objectArray[1] = Integer.TYPE;
        DistributedIdentityManager.j[1] = "java/lang/Integer";
        objectArray[2] = "_q\u0011\u0001\u0000NT~\u0000N}VGy\t\u0007";
        objectArray[3] = "CD-#P=HK<l13C@86";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "fACKIf.\u001e\f!]wW\u0005\u0018PHe>\u0016\u0016\u001e653F\u0011CU2f\u0018H!";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedIdentityManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedIdentityManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void T(@Nullable CryptographicInterface cryptographicInterface) {
        this.q = cryptographicInterface;
    }

    public DistributedIdentityManager() {
        this.v = new CloneableResourceDescriptor();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedIdentityManager.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedIdentityManager.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == '\u00c4' || c == '\u00ed' || c == '\u00e6') {
                field = DistributedIdentityManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedIdentityManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DistributedIdentityManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedIdentityManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DistributedIdentityManager.a = MultiContainerRegistry.a(7884320498918689123L, 2110319022528299180L, MethodHandles.lookup().lookupClass()).a(222398413378876L);
                DistributedIdentityManager.i = new Object[5];
                DistributedIdentityManager.j = new String[5];
                DistributedIdentityManager.a();
                DistributedIdentityManager.e = new HashMap<K, V>(13);
                DistributedIdentityManager.Q(null);
                var0 = DistributedIdentityManager.a ^ 78555257561258L;
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
                var6_5 = "\u001d\u0085G\u00dc5\u00b1x\u00b21 7\u00c7;\u000b\u00c5+P\u00a4\u00a1\u00f8R\u00ed#0\u0086B\u00c4\u00ef\u00ed\u00b4\u00be\u00daA|\u0094\u00d9\u008d\u00ac5]R\u00a2\u00c8\u00ff\u00ff\u00ed\u0015r\u0087\u00c9\u0007\u00e5\u00bc\u00d5n\u0084\u0015\u00b0,\u0086\u00be1,I\u0094\u00acja\u00c6\u00ca\u0017\u0001";
                var7_6 = "\u001d\u0085G\u00dc5\u00b1x\u00b21 7\u00c7;\u000b\u00c5+P\u00a4\u00a1\u00f8R\u00ed#0\u0086B\u00c4\u00ef\u00ed\u00b4\u00be\u00daA|\u0094\u00d9\u008d\u00ac5]R\u00a2\u00c8\u00ff\u00ff\u00ed\u0015r\u0087\u00c9\u0007\u00e5\u00bc\u00d5n\u0084\u0015\u00b0,\u0086\u00be1,I\u0094\u00acja\u00c6\u00ca\u0017\u0001".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00d8\u00bbvS\u00f3\u0006|\u00ca\u00a1'\u009e&\u00e93\u00f1\u00b2";
                    var7_6 = "\u00d8\u00bbvS\u00f3\u0006|\u00ca\u00a1'\u009e&\u00e93\u00f1\u00b2".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        DistributedIdentityManager.c = var8_3;
        DistributedIdentityManager.d = new Integer[11];
    }

    @Override
    public CloneableResourceDescriptor A() {
        return this.v;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String[] t() {
        return X;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedIdentityManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedIdentityManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    protected CryptographicSessionManager R() {
        return this.n;
    }

    /*
     * Unable to fully structure code
     */
    public JsonObject F(boolean var1_1) {
        block12: {
            block13: {
                var2_2 = DistributedIdentityManager.a ^ 3571182904589L;
                var4_3 = new JsonObject();
                var4_3.add((String)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)11254, (long)(6492551112966904098L ^ var2_2)), (long)-4663133363669969836L, (long)var2_2), this.v.y());
                var5_4 = this.n;
                try {
                    try {
                        if (!var1_1 && var5_4 == null) break block12;
                    }
                    catch (CustomSystemException v0) {
                        throw DistributedIdentityManager.b(v0);
                    }
                    if (var5_4 != null) break block13;
                }
                catch (CustomSystemException v1) {
                    throw DistributedIdentityManager.b(v1);
                }
                var5_4 = this.G();
            }
            try {
                if (var5_4 == null) ** GOTO lbl30
                var4_3.add((String)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)12648, (long)(3990008828487435184L ^ var2_2)), (long)-4663133363669969836L, (long)var2_2), (JsonElement)var5_4.t());
            }
            catch (CustomSystemException v2) {
                throw DistributedIdentityManager.b(v2);
            }
        }
        try {
            if (this.l != null) {
                var4_3.addProperty((String)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)18059, (long)(9054127570266420315L ^ var2_2)), (long)-4663133363669969836L, (long)var2_2), this.l.toString());
            }
        }
        catch (CustomSystemException v3) {
            throw DistributedIdentityManager.b(v3);
        }
lbl30:
        // 3 sources

        var6_5 = this.q;
        try {
            if (var6_5 != null) {
                var4_3.addProperty((String)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)25606, (long)(1974801871396132565L ^ var2_2)), (long)-4663133363669969836L, (long)var2_2), var6_5.s());
            }
        }
        catch (CustomSystemException v4) {
            throw DistributedIdentityManager.b(v4);
        }
        return var4_3;
    }

    private static Method d(long l, long l2) {
        int n = DistributedIdentityManager.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = DistributedIdentityManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedIdentityManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedIdentityManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedIdentityManager.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedIdentityManager.b(270911770546420L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedIdentityManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedIdentityManager.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedIdentityManager.b(270911770546420L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    @Nullable
    public UUID O() {
        return this.l;
    }

    @Override
    public void e(@Nullable CryptographicSessionManager cryptographicSessionManager) {
        block6: {
            block5: {
                try {
                    this.L();
                    if (cryptographicSessionManager == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedIdentityManager.b(customSystemException);
                }
                try {
                    if (!(cryptographicSessionManager instanceof ResponseHandlingStrategy)) break block5;
                    this.l = cryptographicSessionManager.u();
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedIdentityManager.b(customSystemException);
                }
            }
            this.n = cryptographicSessionManager;
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD9A;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/vK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedIdentityManager.d[n2] = n3;
        }
        return d[n2];
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field c(long l, long l2) {
        int n = DistributedIdentityManager.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedIdentityManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedIdentityManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedIdentityManager.a(clazz3, string2, clazz2)) != null) {
                    DistributedIdentityManager.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedIdentityManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedIdentityManager.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedIdentityManager.b(270911770546420L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public CryptographicInterface Z() {
        PluginLifecycleContract pluginLifecycleContract;
        block6: {
            pluginLifecycleContract = this.A().i();
            try {
                if (pluginLifecycleContract != null || this.v.W() == null) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedIdentityManager.b(customSystemException);
            }
            pluginLifecycleContract = DataTransformationUtility.u(this.v.W());
        }
        if (pluginLifecycleContract != null) {
            CryptographicInterface cryptographicInterface = pluginLifecycleContract.A();
            try {
                if (cryptographicInterface != null) {
                    return cryptographicInterface;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedIdentityManager.b(customSystemException);
            }
        }
        return CryptographicOperationCoordinator.a;
    }

    @Override
    public void O() {
        this.v.r(IntegerMappingRegistry.E());
        this.R();
    }

    @Override
    @NotNull
    public CryptographicInterface r() {
        CryptographicInterface cryptographicInterface;
        try {
            cryptographicInterface = this.q != null ? this.q : this.Z();
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedIdentityManager.b(customSystemException);
        }
        return cryptographicInterface;
    }

    public DistributedIdentityManager(JsonObject jsonObject) {
        long l;
        block7: {
            l = a ^ 0x106C1708A490L;
            this.v = new CloneableResourceDescriptor(jsonObject.get((String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)19077, (long)(0x42609DB47A9D79CAL ^ l)), (long)-4696080433271286327L, (long)l))));
            if (jsonObject.has((String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)4792, (long)(0x6E8FFF1F9A6DA1FEL ^ l)), (long)-4696080433271286327L, (long)l)))) {
                block6: {
                    JsonElement jsonElement = jsonObject.get((String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)21043, (long)(0xC9A5E115294E17FL ^ l)), (long)-4696080433271286327L, (long)l)));
                    try {
                        if (!jsonElement.isJsonPrimitive()) break block6;
                        this.l = EncryptionProtocolHandler397.t(jsonObject, (String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)1578, (long)(0x5EE2A6F8D0BAB562L ^ l)), (long)-4696080433271286327L, (long)l)));
                        break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedIdentityManager.b(customSystemException);
                    }
                }
                this.n = new CryptographicSessionManager(jsonObject.getAsJsonObject((String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)9481, (long)(0x3C87E5582BB3164EL ^ l)), (long)-4696080433271286327L, (long)l))));
            }
        }
        try {
            if (jsonObject.has((String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)30225, (long)(0x2CD8B6960491455BL ^ l)), (long)-4696080433271286327L, (long)l)))) {
                this.q = CryptographicOperationCoordinator.s(jsonObject.get((String)((Object)DistributedIdentityManager.c("\u00ea", (int)DistributedIdentityManager.a("z", (int)19552, (long)(0x374F54E5FABFF2BL ^ l)), (long)-4696080433271286327L, (long)l))).getAsString());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedIdentityManager.b(customSystemException);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 46;
                break;
            }
            case 1: {
                n3 = 36;
                break;
            }
            case 2: {
                n3 = 28;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 39;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 14;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 24;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 10;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 25;
                break;
            }
            case 19: {
                n3 = 18;
                break;
            }
            case 20: {
                n3 = 22;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 0;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 42;
                break;
            }
            case 26: {
                n3 = 41;
                break;
            }
            case 27: {
                n3 = 9;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 27;
                break;
            }
            case 33: {
                n3 = 5;
                break;
            }
            case 34: {
                n3 = 23;
                break;
            }
            case 35: {
                n3 = 19;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 34;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 59;
                break;
            }
            case 43: {
                n3 = 11;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 1;
                break;
            }
            case 47: {
                n3 = 51;
                break;
            }
            case 48: {
                n3 = 31;
                break;
            }
            case 49: {
                n3 = 21;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 44;
                break;
            }
            case 56: {
                n3 = 54;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 17;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 3;
                break;
            }
            default: {
                n3 = 57;
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
        DistributedIdentityManager.j[n4] = new String(cArray);
        return n4;
    }

    public static void Q(String[] stringArray) {
        X = stringArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedIdentityManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DistributedIdentityManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

