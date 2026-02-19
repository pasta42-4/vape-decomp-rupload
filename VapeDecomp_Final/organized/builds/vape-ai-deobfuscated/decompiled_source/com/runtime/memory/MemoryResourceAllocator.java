/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.memory;

import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.distributed.topology.DistributedResourceTopologyManager;
import com.exception.system.CustomSystemException;
import com.game.input.GameInputController;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptographicResourceManager;
import com.ui.input.UserInputEventMapper;
import com.ui.rendering.GraphicalRenderingController;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MemoryResourceAllocator
extends ReflectionMetadataExtractor1376 {
    public final AuthenticationGateway1860 V;
    public final AuthenticationStateTracker Z;
    public final AuthenticationGateway1860 h;
    private static final long[] d;
    public final AuthenticationGateway1860 v;
    private static final Object[] l;
    private static final Map j;
    public final AuthenticationStateTracker r;
    private static final String[] m;
    private static final Integer[] e;
    public final GenericAdapterManager T;
    public final AuthenticationGateway1860 K;
    private static final long b;
    public final GenericAdapterManager N;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MemoryResourceAllocator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = MemoryResourceAllocator.a(l, l2);
        Object object = MemoryResourceAllocator.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = MemoryResourceAllocator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MemoryResourceAllocator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MemoryResourceAllocator.a(clazz3, string2, clazz2)) != null) {
                    MemoryResourceAllocator.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MemoryResourceAllocator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MemoryResourceAllocator.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MemoryResourceAllocator.b(220664574884092L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MemoryResourceAllocator.a(l, l2);
            object = MemoryResourceAllocator.l[n];
            try {
                if (!(object instanceof String)) break block2;
                MemoryResourceAllocator.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void X(GameInputController gameInputController) {
        DistributedResourceTopologyManager distributedResourceTopologyManager = GraphicalRenderingController.D(DistributedResourceTopologyManager.class);
        try {
            if (distributedResourceTopologyManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MemoryResourceAllocator.a(customSystemException);
        }
        distributedResourceTopologyManager.a(gameInputController);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MemoryResourceAllocator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MemoryResourceAllocator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public MemoryResourceAllocator() {
        long l = b ^ 0x50AEA907D174L;
        super(a.cs((int)MemoryResourceAllocator.a("l", (int)202, (long)(0x2A83E478AE28643DL ^ l))), CryptographicResourceManager.d, a.cs((int)MemoryResourceAllocator.a("l", (int)6115, (long)(0x406CDA5D48117317L ^ l))), DistributedResourceTopologyManager.class);
        this.V = new AuthenticationGateway1860((String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)801, (long)(0x312F33412D70E7D2L ^ l)), (long)1006621016329240078L, (long)l)));
        this.h = new AuthenticationGateway1860((String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)27940, (long)(0x12C7FD89EFA189D6L ^ l)), (long)1006621016329240078L, (long)l)));
        this.N = GenericAdapterManager.D(this, (String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)2839, (long)(0x1F0D0A2CCA736FE1L ^ l)), (long)1006621016329240078L, (long)l)), this.V, this.V, this.h);
        this.v = new AuthenticationGateway1860((String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)15635, (long)(0x5DF4B9FFB0B459E6L ^ l)), (long)1006621016329240078L, (long)l)));
        this.K = new AuthenticationGateway1860((String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)20634, (long)(0x5DEFD8C78282346BL ^ l)), (long)1006621016329240078L, (long)l)));
        this.T = GenericAdapterManager.D(this, (String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)8162, (long)(0x52ED1A8EE5237B1EL ^ l)), (long)1006621016329240078L, (long)l)), this.v, this.v, this.K);
        this.Z = AuthenticationStateTracker.w(this, (String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)20935, (long)(0x64961E787E873539L ^ l)), (long)1006621016329240078L, (long)l)), true);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)200, (long)(0xED72CED6B80E435L ^ l)), (long)1006621016329240078L, (long)l)), false);
        this.s((String)((Object)MemoryResourceAllocator.c("\u00ff", (int)MemoryResourceAllocator.a("l", (int)10537, (long)(0x3B37B343D95ECDD9L ^ l)), (long)1006621016329240078L, (long)l)));
        this.N(this.N, this.T, this.Z, this.r);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x690D;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MemoryResourceAllocator.e[n2] = n3;
        }
        return e[n2];
    }

    @DataExchangeProtocol2090
    public void T(UserInputEventMapper userInputEventMapper) {
        DistributedResourceTopologyManager distributedResourceTopologyManager = GraphicalRenderingController.D(DistributedResourceTopologyManager.class);
        try {
            if (distributedResourceTopologyManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MemoryResourceAllocator.a(customSystemException);
        }
        try {
            distributedResourceTopologyManager.N(userInputEventMapper);
            if (!userInputEventMapper.getButtonState()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MemoryResourceAllocator.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.X().r()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MemoryResourceAllocator.a(customSystemException);
        }
        distributedResourceTopologyManager.w().T(userInputEventMapper.getButton());
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'c' || c == '\u00c1' || c == '\u00f2' || c == 'd') {
                field = MemoryResourceAllocator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'c' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MemoryResourceAllocator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l, long l2) {
        int n = MemoryResourceAllocator.a(l, l2);
        Object object = MemoryResourceAllocator.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = MemoryResourceAllocator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MemoryResourceAllocator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MemoryResourceAllocator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MemoryResourceAllocator.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MemoryResourceAllocator.b(220664574884092L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MemoryResourceAllocator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MemoryResourceAllocator.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MemoryResourceAllocator.b(220664574884092L, 0L);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MemoryResourceAllocator.b = MultiContainerRegistry.a(-7872510321460883470L, -6145042648001571008L, MethodHandles.lookup().lookupClass()).a(180736245764296L);
                MemoryResourceAllocator.l = new Object[5];
                MemoryResourceAllocator.m = new String[5];
                MemoryResourceAllocator.a();
                MemoryResourceAllocator.j = new HashMap<K, V>(13);
                var0 = MemoryResourceAllocator.b ^ 73040392986325L;
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
                var6_5 = "\u00b5'\u00a2\u009a\u00d2\u009f\u00f8\u00e5\u0001\u00d0\u00e8\u0088\u0019G>\u00ad'%\u009c\u00b5\u0098\u00c8\u0090\u00bfhW\u00af\u00c4\u0087(\u00c2\u0016_\u00f8C\u0096~\u00d2\u00f2[\u00c9\u0007\u00e0m\u00ces\u0010\u00d8\u00da[\u00ffa1u\u0083\u00ads\u00a3u8Wwu\u00ff\u00b5\u00bd\u00c4\u000baQ:\u00d6";
                var7_6 = "\u00b5'\u00a2\u009a\u00d2\u009f\u00f8\u00e5\u0001\u00d0\u00e8\u0088\u0019G>\u00ad'%\u009c\u00b5\u0098\u00c8\u0090\u00bfhW\u00af\u00c4\u0087(\u00c2\u0016_\u00f8C\u0096~\u00d2\u00f2[\u00c9\u0007\u00e0m\u00ces\u0010\u00d8\u00da[\u00ffa1u\u0083\u00ads\u00a3u8Wwu\u00ff\u00b5\u00bd\u00c4\u000baQ:\u00d6".length();
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
                    var6_5 = "\u00b4\u00ceUl\u0015\u00f2\u00bb.\u00c63~Vq\u00d8\u00b7\u00f1";
                    var7_6 = "\u00b4\u00ceUl\u0015\u00f2\u00bb.\u00c63~Vq\u00d8\u00b7\u00f1".length();
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
        MemoryResourceAllocator.d = var8_3;
        MemoryResourceAllocator.e = new Integer[11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MemoryResourceAllocator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MemoryResourceAllocator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MemoryResourceAllocator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "Ww,";
        objectArray[1] = Integer.TYPE;
        MemoryResourceAllocator.m[1] = "java/lang/Integer";
        objectArray[2] = "<\r.2:(7\u0002?}G0$\u000564";
        objectArray[3] = "\u0003\u000biXj#\b\u0004x\u0017\u000b-\u0003\u000f|M";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004! \u001aS\u0001\u0000#{f\u0006\u0006=f%ZP\f[}x\u0001mDA%}\u0014P\u0010Rn'f";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void K(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        DistributedResourceTopologyManager distributedResourceTopologyManager = GraphicalRenderingController.D(DistributedResourceTopologyManager.class);
        try {
            if (distributedResourceTopologyManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MemoryResourceAllocator.a(customSystemException);
        }
        distributedResourceTopologyManager.s(connectionPoolOrchestrator1192, bl);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = MemoryResourceAllocator.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 42;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 35;
                break;
            }
            case 3: {
                n3 = 55;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 39;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 4;
                break;
            }
            case 10: {
                n3 = 25;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 0;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 19;
                break;
            }
            case 17: {
                n3 = 3;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 52;
                break;
            }
            case 20: {
                n3 = 53;
                break;
            }
            case 21: {
                n3 = 59;
                break;
            }
            case 22: {
                n3 = 51;
                break;
            }
            case 23: {
                n3 = 56;
                break;
            }
            case 24: {
                n3 = 5;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 26;
                break;
            }
            case 27: {
                n3 = 31;
                break;
            }
            case 28: {
                n3 = 12;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 37;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 13;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 7;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 49;
                break;
            }
            case 37: {
                n3 = 54;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 46;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 8;
                break;
            }
            case 42: {
                n3 = 33;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 36;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 50;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 45;
                break;
            }
            case 51: {
                n3 = 47;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 40;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 24;
                break;
            }
            case 58: {
                n3 = 14;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 29;
                break;
            }
            default: {
                n3 = 30;
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
        MemoryResourceAllocator.m[n4] = new String(cArray);
        return n4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MemoryResourceAllocator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MemoryResourceAllocator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

