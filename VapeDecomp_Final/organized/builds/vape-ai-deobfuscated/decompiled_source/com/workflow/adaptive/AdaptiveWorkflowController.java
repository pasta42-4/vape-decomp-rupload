/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.workflow.adaptive;

import com.app.caching.core.CacheInvalidationManager2335;
import com.collections.management.MultiContainerRegistry;
import com.data.transformation.HierarchicalDataTransformer;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.transformation.GeometricTransformEngine;
import com.network.protocol.CommunicationProtocolManager;
import com.security.crypto.CipherContextManager1101;
import java.awt.Color;
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
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AdaptiveWorkflowController
extends HierarchicalDataTransformer {
    @Nullable
    private CacheInvalidationManager2335 BE;
    private static final Map pb;
    private static int Bk;
    protected boolean BX = true;
    protected GraphicalRenderEngine1082 BM;
    protected GraphicalRenderEngine1082 Ba;
    private static final long[] mb;
    protected final CommunicationProtocolManager Bs;
    @Nullable
    private CompletableFuture<?> Bq;
    @Nullable
    private CipherContextManager1101 Bu;
    private static final String[] Db;
    private static final long bb;
    private static final Object[] Cb;
    private static final Integer[] ob;

    public void v() {
        long l = bb ^ 0x33657E78F1E7L;
        this.BM.d().f((String)((Object)AdaptiveWorkflowController.i("\u00d6", (int)AdaptiveWorkflowController.c("d", (int)10229, (long)(0x2C3D32F99A8DB7L ^ l)), (long)3174784035142495669L, (long)l)));
        this.BM.i(false);
        this.BM.k();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveWorkflowController.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Nullable
    public CipherContextManager1101 z() {
        return this.Bu;
    }

    @Nullable
    public CacheInvalidationManager2335 o() {
        return this.BE;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveWorkflowController.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveWorkflowController.h(classArray[i], string, clazz2);
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
                AdaptiveWorkflowController.bb = MultiContainerRegistry.a(2624732973291746670L, 341689244563423922L, MethodHandles.lookup().lookupClass()).a(85204524665044L);
                AdaptiveWorkflowController.Cb = new Object[5];
                AdaptiveWorkflowController.Db = new String[5];
                AdaptiveWorkflowController.db();
                AdaptiveWorkflowController.pb = new HashMap<K, V>(13);
                AdaptiveWorkflowController.F(48);
                var0 = AdaptiveWorkflowController.bb ^ 57799813078090L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u0095b\u00f2\u009b\u00bf\u00fb-\\`\u00ec\u0005\u00d9zB\u0082\u00966\u00c5M:4\u00ad\u00aa\u008e";
                var7_6 = "\u0095b\u00f2\u009b\u00bf\u00fb-\\`\u00ec\u0005\u00d9zB\u0082\u00966\u00c5M:4\u00ad\u00aa\u008e".length();
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
                    var6_5 = "\u0018\u00e3#\u0094\u001a\u0086\u00d5\u00fd\u0097k\u00a23Hw\u00cc\u00b7";
                    var7_6 = "\u0018\u00e3#\u0094\u001a\u0086\u00d5\u00fd\u0097k\u00a23Hw\u00cc\u00b7".length();
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
        AdaptiveWorkflowController.mb = var8_3;
        AdaptiveWorkflowController.ob = new Integer[5];
    }

    private static CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method p(long l, long l2) {
        int n = AdaptiveWorkflowController.m(l, l2);
        Object object = Cb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Db[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveWorkflowController.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveWorkflowController.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveWorkflowController.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveWorkflowController.Cb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveWorkflowController.n(270168361496481L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveWorkflowController.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveWorkflowController.Cb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveWorkflowController.n(270168361496481L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveWorkflowController.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void F(int n) {
        Bk = n;
    }

    @Nullable
    public CompletableFuture<?> K() {
        return this.Bq;
    }

    public void T() {
        block6: {
            CompletableFuture<?> completableFuture = this.Bq;
            try {
                try {
                    try {
                        if (completableFuture == null || completableFuture.isCancelled()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveWorkflowController.e(customSystemException);
                    }
                    if (completableFuture.isCompletedExceptionally()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveWorkflowController.e(customSystemException);
                }
                completableFuture.cancel(true);
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveWorkflowController.e(customSystemException);
            }
        }
    }

    private static CustomSystemException e(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void m() {
        long l = bb ^ 0x4BEDBD3ECD08L;
        this.Ba.d().f((String)((Object)AdaptiveWorkflowController.i("\u00d6", (int)AdaptiveWorkflowController.c("d", (int)27418, (long)(0x2C762EC42345FDB4L ^ l)), (long)1216079422260105562L, (long)l)));
        this.Ba.k();
    }

    public static int Q() {
        int n = AdaptiveWorkflowController.v();
        try {
            if (n == 0) {
                return 57;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowController.e(customSystemException);
        }
        return 0;
    }

    public void x(@Nullable CipherContextManager1101 cipherContextManager1101) {
        this.Bu = cipherContextManager1101;
    }

    public void X(@Nullable CompletableFuture<?> completableFuture) {
        this.Bq = completableFuture;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Db[n4] != null) {
            return n4;
        }
        Object object = Cb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 54;
                break;
            }
            case 1: {
                n3 = 53;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 45;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 57;
                break;
            }
            case 8: {
                n3 = 41;
                break;
            }
            case 9: {
                n3 = 0;
                break;
            }
            case 10: {
                n3 = 56;
                break;
            }
            case 11: {
                n3 = 33;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 15;
                break;
            }
            case 14: {
                n3 = 55;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 38;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 8;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 5;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 47;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 14;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 48;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 20;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 46;
                break;
            }
            case 48: {
                n3 = 7;
                break;
            }
            case 49: {
                n3 = 1;
                break;
            }
            case 50: {
                n3 = 3;
                break;
            }
            case 51: {
                n3 = 43;
                break;
            }
            case 52: {
                n3 = 44;
                break;
            }
            case 53: {
                n3 = 35;
                break;
            }
            case 54: {
                n3 = 63;
                break;
            }
            case 55: {
                n3 = 22;
                break;
            }
            case 56: {
                n3 = 50;
                break;
            }
            case 57: {
                n3 = 40;
                break;
            }
            case 58: {
                n3 = 12;
                break;
            }
            case 59: {
                n3 = 9;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 60;
                break;
            }
            case 62: {
                n3 = 25;
                break;
            }
            default: {
                n3 = 26;
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
        AdaptiveWorkflowController.Db[n4] = new String(cArray);
        return n4;
    }

    protected void J() {
        long l = bb ^ 0x6B35B07B9D8FL;
        this.i(false);
        this.I().f();
        this.I().i(false);
        this.T().f();
        this.T().i(false);
        this.getClass();
        double d2 = 5.0f * 4.0f;
        this.T(this.Bs.w() - d2);
        double d3 = this.Bs.b() - this.Bs.Q().b() - 2.0 - d2;
        this.getClass();
        this.w(d3 - 5.0);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.T();
        try {
            this.T().Y(false);
            this.T().d().f((String)((Object)AdaptiveWorkflowController.i("\u00d6", (int)AdaptiveWorkflowController.c("d", (int)21712, (long)(0x51568C2652E512FBL ^ l)), (long)4640749489064018397L, (long)l)));
            this.T().i(this.T().b());
            this.n(graphicalRenderEngine1082, new Object[0]);
            this.BM = new GraphicalRenderEngine1082(graphicalRenderEngine1082.w(), 30.0);
            this.BM.d().f((String)((Object)AdaptiveWorkflowController.i("\u00d6", (int)AdaptiveWorkflowController.c("d", (int)28618, (long)(0x37507CB326E729E2L ^ l)), (long)4640749489064018397L, (long)l)));
            this.BM.i(false);
            this.Ba = this.BX ? new GraphicalRenderEngine1082(graphicalRenderEngine1082.w() - 1.0, graphicalRenderEngine1082.b() - this.BM.b()) : new GraphicalRenderEngine1082(graphicalRenderEngine1082.w() - 1.0, graphicalRenderEngine1082.b());
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowController.e(customSystemException);
        }
        this.Ba.i(this.Ba.b() + 2.0);
        this.Ba.i(false);
        this.Ba.Q(Color.MAGENTA);
        graphicalRenderEngine1082.n(this.Ba, new Object[0]);
        if (this.BX) {
            graphicalRenderEngine1082.n(this.BM, new Object[0]);
            GeometricTransformEngine geometricTransformEngine = new GeometricTransformEngine(this.BM.w(), 1.0, 1.0, 0.0, AdaptiveWorkflowController.M.w);
            geometricTransformEngine.k(false);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x64E;
        if (ob[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = mb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])pb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveWorkflowController.ob[n2] = n3;
        }
        return ob[n2];
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00fc' || c == '\u00cc' || c == '\u00ff') {
                field = AdaptiveWorkflowController.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveWorkflowController.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveWorkflowController.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveWorkflowController.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public AdaptiveWorkflowController(CommunicationProtocolManager communicationProtocolManager) {
        super(-1.0, -1.0, new GraphicalRenderEngine1082(-1.0, -1.0), new GraphicalRenderEngine1082(-1.0, -1.0));
        this.Bs = communicationProtocolManager;
        this.J();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field o(long l, long l2) {
        int n = AdaptiveWorkflowController.m(l, l2);
        Object object = Cb[n];
        if (object instanceof String) {
            String string = Db[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveWorkflowController.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveWorkflowController.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveWorkflowController.g(clazz3, string2, clazz2)) != null) {
                    AdaptiveWorkflowController.Cb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveWorkflowController.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveWorkflowController.Cb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveWorkflowController.n(270168361496481L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void Z() {
        long l = bb ^ 0x616A8210815DL;
        this.I().d().f((String)((Object)AdaptiveWorkflowController.i("\u00d6", (int)AdaptiveWorkflowController.c("d", (int)4623, (long)(0x5DC5BF5B6F13C8F1L ^ l)), (long)6680328419065437455L, (long)l)));
        this.I().i(false);
        this.I().k();
    }

    public void F(@Nullable CacheInvalidationManager2335 cacheInvalidationManager2335) {
        try {
            if (this.BE != null) {
                this.BE.e(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowController.e(customSystemException);
        }
        this.BE = cacheInvalidationManager2335;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveWorkflowController.m(l, l2);
            object = Cb[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveWorkflowController.Cb[n] = clazz = Class.forName(Db[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static int v() {
        return Bk;
    }

    private static void db() {
        Object[] objectArray = Cb;
        Cb[0] = "g`:";
        objectArray[1] = Integer.TYPE;
        AdaptiveWorkflowController.Db[1] = "java/lang/Integer";
        objectArray[2] = "0W\n'\u0016B;X\u001bhkZ(_\u0012!";
        objectArray[3] = "\u0010Z{@\r\t\u001bUj\u000fl\u0007\u0010^nU";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000e<\u001c~(3\u0013i\u0015B1yl5Tr'<\u0007o\t0+\u0002Uh\u00030<<\f2\u001c+Z";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveWorkflowController.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveWorkflowController.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

