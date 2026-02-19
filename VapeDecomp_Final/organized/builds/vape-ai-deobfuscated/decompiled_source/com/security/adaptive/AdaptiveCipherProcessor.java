/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.adaptive;

import a.C_;
import com.collections.management.MultiContainerRegistry;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.serialization.JsonPayloadOrchestrator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.security.authentication.CryptographicKeyResolver;
import com.security.crypto.CryptographicParameterGenerator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
import com.workflow.core.WorkflowOrchestrator;
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
import org.jetbrains.annotations.Nullable;

public class AdaptiveCipherProcessor
extends SymmetricCipherManager {
    private boolean Ae;
    private static final long bb;
    private static final Map mb;
    private int AP;
    private static final long[] eb;
    private float AZ;
    @Nullable
    private WorkflowOrchestrator Ai;
    private static final Integer[] lb;
    private static final String[] pb;
    private final VisualRenderContext A1;
    private static final Object[] ob;
    private JsonPayloadOrchestrator At;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveCipherProcessor.bb = MultiContainerRegistry.a(-6868199305603833497L, 8013206688781795514L, MethodHandles.lookup().lookupClass()).a(33621448646080L);
                AdaptiveCipherProcessor.ob = new Object[5];
                AdaptiveCipherProcessor.pb = new String[5];
                AdaptiveCipherProcessor.D();
                AdaptiveCipherProcessor.mb = new HashMap<K, V>(13);
                var0 = AdaptiveCipherProcessor.bb ^ 85479875451621L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "X\u001bi-_\u00a2z\u00d7\u001fW\u009b\u00fdZ\u00cf\r=\u00b3\u0015W\u00d5\u00d5#\u00c5mm\u00a9}Q\u0096\u0093A\u00f4i\u0005\u00ff\u0082J(\u0095-\u00a2\u00f2\u0098\u007f\u00ae\u00a7\u00c2\u009b\u0082nCF\u00984Cv\u00daN\u00dc\u00e9j'\u00ef\u00db\u00ceN\u0085hA\u00b4\u00c4v\u00c2-\u00aa\u0002\u0098x,&";
                var7_6 = "X\u001bi-_\u00a2z\u00d7\u001fW\u009b\u00fdZ\u00cf\r=\u00b3\u0015W\u00d5\u00d5#\u00c5mm\u00a9}Q\u0096\u0093A\u00f4i\u0005\u00ff\u0082J(\u0095-\u00a2\u00f2\u0098\u007f\u00ae\u00a7\u00c2\u009b\u0082nCF\u00984Cv\u00daN\u00dc\u00e9j'\u00ef\u00db\u00ceN\u0085hA\u00b4\u00c4v\u00c2-\u00aa\u0002\u0098x,&".length();
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
                    var6_5 = "\u0014<\u00e2x\u00b8~\u00c6\u000bd\u00aa\u00b6\u008a\u0080\u00ab\u00dc)";
                    var7_6 = "\u0014<\u00e2x\u00b8~\u00c6\u000bd\u00aa\u00b6\u008a\u0080\u00ab\u00dc)".length();
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
        AdaptiveCipherProcessor.eb = var8_3;
        AdaptiveCipherProcessor.lb = new Integer[12];
    }

    private void lambda$new$1(boolean bl) {
        block7: {
            CryptographicKeyResolver cryptographicKeyResolver;
            block8: {
                block6: {
                    long l = bb ^ 0x145F683A01D1L;
                    cryptographicKeyResolver = GraphicalRenderingController.D(CryptographicKeyResolver.class);
                    try {
                        if (!bl) break block6;
                        C_.P(this.V(), (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)25545, (long)(0x7A7D60DF571D5750L ^ l)), (long)-448894835851668767L, (long)l)), (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)23904, (long)(0x7FC9C4163B0E9FAL ^ l)), (long)-448894835851668767L, (long)l)), (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)4645, (long)(0x469FE9C96306A6B5L ^ l)), (long)-448894835851668767L, (long)l)), () -> this.lambda$null$0(cryptographicKeyResolver));
                        break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherProcessor.a(customSystemException);
                    }
                }
                TransactionDescriptor transactionDescriptor = TemporalMetadataResolver.h.o().A();
                TransactionDescriptor transactionDescriptor2 = this.X().P();
                try {
                    try {
                        transactionDescriptor.y();
                        if (transactionDescriptor2 == null || !transactionDescriptor2.equals(transactionDescriptor)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherProcessor.a(customSystemException);
                    }
                    this.j(transactionDescriptor2.X(false));
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherProcessor.a(customSystemException);
                }
            }
            cryptographicKeyResolver.f(this.M());
            cryptographicKeyResolver.e(this.X());
            GraphicalRenderingController.K.T(GraphicalRenderingController.o);
        }
    }

    @Override
    public void E() {
        block3: {
            double d2;
            CryptographicParameterGenerator cryptographicParameterGenerator;
            CryptographicParameterGenerator cryptographicParameterGenerator2;
            long l;
            block2: {
                l = bb ^ 0x43692830952DL;
                super.E();
                cryptographicParameterGenerator2 = this.t(0.8);
                cryptographicParameterGenerator = this.t(0.8);
                d2 = this.A1.g() + 0.5;
                try {
                    if (!this.Ae) break block2;
                    cryptographicParameterGenerator2.R(this.AP + (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)16894, (long)(0x271B74AFFEAAE193L ^ l)), (long)7870431432169440797L, (long)l)), this.G() + (double)this.AZ, d2, AdaptiveCipherProcessor.M.c);
                    cryptographicParameterGenerator.R((String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)32294, (long)(0x16613F2E86CFDE48L ^ l)), (long)7870431432169440797L, (long)l)), this.G() + (double)this.AZ + cryptographicParameterGenerator2.D(this.AP + (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)12236, (long)(0x3DE6C4B379D08FAFL ^ l)), (long)7870431432169440797L, (long)l))), d2, AdaptiveCipherProcessor.M.w);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherProcessor.a(customSystemException);
                }
            }
            cryptographicParameterGenerator2.R(this.AP + (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)27366, (long)(0x7659FF2D718A4A86L ^ l)), (long)7870431432169440797L, (long)l)), this.G() + (double)this.AZ, d2, AdaptiveCipherProcessor.M.c);
            cryptographicParameterGenerator.R((String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)2547, (long)(0x3C25BC7415ABA994L ^ l)), (long)7870431432169440797L, (long)l)), this.G() + (double)this.AZ + cryptographicParameterGenerator2.D(this.AP + (String)((Object)AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)8490, (long)(0x1EF18ACE2E61814EL ^ l)), (long)7870431432169440797L, (long)l))), d2, AdaptiveCipherProcessor.M.w);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field o(long l, long l2) {
        int n = AdaptiveCipherProcessor.m(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveCipherProcessor.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveCipherProcessor.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveCipherProcessor.g(clazz3, string2, clazz2)) != null) {
                    AdaptiveCipherProcessor.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveCipherProcessor.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveCipherProcessor.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveCipherProcessor.n(230093047027224L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveCipherProcessor.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void b(boolean bl) {
        this.Ae = bl;
        this.AP = this.At.d(bl).size();
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D5E;
        if (lb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveCipherProcessor.lb[n2] = n3;
        }
        return lb[n2];
    }

    private void lambda$null$0(CryptographicKeyResolver cryptographicKeyResolver) {
        cryptographicKeyResolver.V();
        this.I();
    }

    public void G(@Nullable WorkflowOrchestrator workflowOrchestrator) {
        this.Ai = workflowOrchestrator;
    }

    @Nullable
    public WorkflowOrchestrator M() {
        return this.Ai;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 26;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 53;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 10;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 58;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 56;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 32;
                break;
            }
            case 17: {
                n3 = 0;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 46;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 27;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 4;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 48;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 1;
                break;
            }
            case 30: {
                n3 = 59;
                break;
            }
            case 31: {
                n3 = 39;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 40;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 18;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 54;
                break;
            }
            case 42: {
                n3 = 5;
                break;
            }
            case 43: {
                n3 = 57;
                break;
            }
            case 44: {
                n3 = 52;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 42;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 25;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 30;
                break;
            }
            case 53: {
                n3 = 49;
                break;
            }
            case 54: {
                n3 = 35;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 29;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 15;
                break;
            }
            default: {
                n3 = 14;
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
        AdaptiveCipherProcessor.pb[n4] = new String(cArray);
        return n4;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveCipherProcessor.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveCipherProcessor.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void I() {
        try {
            if (this.At != null) {
                this.AP = this.At.d(this.Ae).size();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherProcessor.a(customSystemException);
        }
    }

    private static Method p(long l, long l2) {
        int n = AdaptiveCipherProcessor.m(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveCipherProcessor.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveCipherProcessor.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveCipherProcessor.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveCipherProcessor.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveCipherProcessor.n(230093047027224L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveCipherProcessor.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveCipherProcessor.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveCipherProcessor.n(230093047027224L, 0L);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveCipherProcessor.m(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveCipherProcessor.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public AdaptiveCipherProcessor(JsonPayloadOrchestrator jsonPayloadOrchestrator, double d2, boolean bl) {
        CallSite callSite;
        VisualRenderContext visualRenderContext;
        VisualRenderContext visualRenderContext2;
        long l = bb ^ 0x9250778106DL;
        super(110.0);
        this.AZ = 6.0f;
        this.i(false);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2, 12.0);
        try {
            VisualRenderContext visualRenderContext3;
            this.o(new PrecisionMathOrchestrator(2.0, graphicalRenderEngine1082));
            AdaptiveCipherProcessor adaptiveCipherProcessor = this;
            visualRenderContext2 = visualRenderContext3;
            visualRenderContext = visualRenderContext3;
            callSite = bl ? AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)13583, (long)(0x67E32EE5A2891020L ^ l)), (long)-1695277622406167715L, (long)l) : AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)14843, (long)(0x272DD09201AF1CDAL ^ l)), (long)-1695277622406167715L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherProcessor.a(customSystemException);
        }
        visualRenderContext2((String)((Object)callSite), 0.75, false);
        adaptiveCipherProcessor.A1 = visualRenderContext;
        this.A1.T(20.0);
        this.A1.w(14.0);
        graphicalRenderEngine1082.n(this.A1, AdaptiveCipherProcessor.d("w", (int)AdaptiveCipherProcessor.c("v", (int)31784, (long)(0x4639407CB7AE590AL ^ l)), (long)-1695277622406167715L, (long)l));
        graphicalRenderEngine1082.i(false);
        this.A1.c(null);
        this.A1.N(() -> this.lambda$new$1(bl));
        this.j(jsonPayloadOrchestrator);
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = "\f\n\u0007";
        objectArray[1] = Integer.TYPE;
        AdaptiveCipherProcessor.pb[1] = "java/lang/Integer";
        objectArray[2] = "g1\\u\u0019\\l>M:dD\u007f9Ds";
        objectArray[3] = "`LbV \u0016kCs\u0019A\u0018`HwC";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "c\u00183R8q&\n2<-n_\u0015,B~.2]9VF,.\u001fmA*tfZ8<";
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

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == 'a' || c == 'y' || c == 'E') {
                field = AdaptiveCipherProcessor.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveCipherProcessor.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void j(JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        boolean bl;
        VisualRenderContext visualRenderContext;
        try {
            this.At = jsonPayloadOrchestrator;
            this.I();
            visualRenderContext = this.A1;
            bl = jsonPayloadOrchestrator != null;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherProcessor.a(customSystemException);
        }
        visualRenderContext.N(bl);
        this.A();
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveCipherProcessor.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public JsonPayloadOrchestrator X() {
        return this.At;
    }

    public void H(float f) {
        this.AZ = f;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveCipherProcessor.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveCipherProcessor.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveCipherProcessor.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveCipherProcessor.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

