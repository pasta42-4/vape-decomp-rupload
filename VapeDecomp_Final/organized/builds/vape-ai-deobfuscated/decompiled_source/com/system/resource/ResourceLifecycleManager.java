/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.C_;
import a.JF;
import a.TL;
import a.bE;
import a.hr;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.network.NetworkConnectionBroker2678;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.encoding.CharsetEncodingSpecification;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.network.configuration.NetworkConfigurationManager1825;
import com.network.transformation.ChannelDataTransformer;
import com.security.config.CryptoConfigurationEnum;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicSecurityManager396;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ResourceLifecycleManager
extends GraphicalRenderEngine1082 {
    hr m5;
    GraphicalRenderEngine1082 mk;
    private boolean mD;
    private static final long[] bb;
    bE mc;
    private static final Object[] lb;
    private static final long ab;
    private CryptographicSecurityManager396 mv;
    GraphicalRenderEngine1082 mR;
    private static final String[] mb;
    GraphicalThemeRenderer mP;
    private static final Map fb;
    private static final Integer[] eb;
    private final NetworkConnectionBroker2678 mp;
    bE my;

    private static Field k(long l, long l2) {
        int n = ResourceLifecycleManager.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceLifecycleManager.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceLifecycleManager.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceLifecycleManager.e(clazz3, string2, clazz2)) != null) {
                    ResourceLifecycleManager.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceLifecycleManager.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceLifecycleManager.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceLifecycleManager.j(267700923019691L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void T() {
        block7: {
            block9: {
                long l;
                block8: {
                    l = ab ^ 0x5C888EABC625L;
                    try {
                        if (this.mD) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceLifecycleManager.a(customSystemException);
                    }
                    JF jF = TemporalMetadataResolver.h.O().p().Q();
                    try {
                        try {
                            if (jF == null) break block7;
                            if (!jF.R().equals(TemporalMetadataResolver.h.O().n())) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceLifecycleManager.a(customSystemException);
                        }
                        this.r((String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)27182, (long)(0x3359532706D27A2BL ^ l)), (long)573476358434761211L, (long)l)));
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceLifecycleManager.a(customSystemException);
                    }
                }
                this.r((String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)28685, (long)(0x1ACB67CBB6F1E009L ^ l)), (long)573476358434761211L, (long)l)));
            }
            return;
        }
        this.mD = true;
        this.O();
    }

    private void lambda$acceptInvite$8(TL tL) {
        block8: {
            long l;
            block9: {
                block7: {
                    l = ab ^ 0x7B26F4851DDBL;
                    try {
                        if (tL.w() != CharsetEncodingSpecification.SUCCESSFULLY_ACCEPTED) break block7;
                        TemporalMetadataResolver.h.O().p().H(this.mp);
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceLifecycleManager.a(customSystemException);
                    }
                }
                try {
                    if (tL.w() != CharsetEncodingSpecification.GROUP_FULL) break block9;
                    CipherTextProcessor.g(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)26830, (long)(0x4B9156181897A336L ^ l)), (long)-2590904473170185723L, (long)l)));
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleManager.a(customSystemException);
                }
            }
            try {
                if (tL.w() == CharsetEncodingSpecification.FAILED) {
                    CipherTextProcessor.g(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)24459, (long)(0x2B504353AF9A1477L ^ l)), (long)-2590904473170185723L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceLifecycleManager.a(customSystemException);
            }
        }
    }

    private void lambda$acceptInvite$9() {
        this.mD = false;
    }

    private void lambda$handleLeaveConfirmation$6(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        SecureContextBroker572.h().c().O(ResourceLifecycleManager::lambda$null$4, this::lambda$null$5);
    }

    private void lambda$null$5() {
        this.O();
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "\u0004*\u001f";
        objectArray[1] = Integer.TYPE;
        ResourceLifecycleManager.mb[1] = "java/lang/Integer";
        objectArray[2] = "h!Eriuc.T=\u0014mp)]t";
        objectArray[3] = "S8k\u001b\u0003\u0019X7zTb\u0017S<~\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "!a\u001cG82\"qT81vNk\u0015V0h\u007f,\u0011AZ47r\u0015\u0002&mwi\u00138";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 10;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 14;
                break;
            }
            case 5: {
                n3 = 55;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 41;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 29;
                break;
            }
            case 10: {
                n3 = 13;
                break;
            }
            case 11: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 1;
                break;
            }
            case 17: {
                n3 = 11;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 36;
                break;
            }
            case 20: {
                n3 = 31;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 52;
                break;
            }
            case 25: {
                n3 = 37;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 20;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 17;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 45;
                break;
            }
            case 33: {
                n3 = 60;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 49;
                break;
            }
            case 37: {
                n3 = 34;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 6;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 62;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 63;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 5;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 21;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 56;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 59;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 28;
                break;
            }
            default: {
                n3 = 25;
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
        ResourceLifecycleManager.mb[n4] = new String(cArray);
        return n4;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$new$0() {
        this.T();
    }

    private void lambda$new$3(NetworkConnectionBroker2678 networkConnectionBroker2678) {
        try {
            if (this.mD) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceLifecycleManager.a(customSystemException);
        }
        this.mD = true;
        SecureContextBroker572.h().c().c(networkConnectionBroker2678.k().s(), false, arg_0 -> ResourceLifecycleManager.lambda$null$1(networkConnectionBroker2678, arg_0), this::lambda$null$2);
    }

    public ResourceLifecycleManager(NetworkConnectionBroker2678 networkConnectionBroker2678) {
        long l = ab ^ 0x5FDDE1338667L;
        super(100.0, 16.0);
        this.mR = new GraphicalRenderEngine1082(18.0, 14.0);
        this.mk = new GraphicalRenderEngine1082(14.0, 14.0);
        this.my = new bE(18.0, 16.0);
        this.mc = new bE(2.0, 16.0);
        this.m5 = new hr((String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)29469, (long)(0xE19DC05A252A355L ^ l)), (long)5167712213046061497L, (long)l)), 0.6, ResourceLifecycleManager.M.Y, ResourceLifecycleManager.M.u, 18.0, 8.0);
        this.mP = new HardwareYield((String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)4539, (long)(0x401D77A8707D41F0L ^ l)), (long)5167712213046061497L, (long)l)), 1.0, new Color(255, 255, 255, 0), new Color(255, 255, 255, 25), 8.0, 8.0);
        this.mD = false;
        this.mp = networkConnectionBroker2678;
        this.mv = new CryptographicSecurityManager396(networkConnectionBroker2678.k().j(), (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)2294, (long)(0x114C7F8E391E58BAL ^ l)), (long)5167712213046061497L, (long)l)), 46.0, 0.8, ResourceLifecycleManager.M.c, true);
        this.i(false);
        this.mR.i(false);
        this.mk.i(false);
        this.mR.d().J(true);
        this.mk.d().J(true);
        this.mP.g((String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)30303, (long)(0x183BE38EDB81A612L ^ l)), (long)5167712213046061497L, (long)l)));
        this.m5.N(this::lambda$new$0);
        this.mP.N(() -> this.lambda$new$3(networkConnectionBroker2678));
        this.m5.q(false);
        this.m5.A(Color.WHITE);
        this.mR.o(this.m5);
        this.mk.o(this.mc, this.mP);
        this.o(this.my, this.mv, this.mR, this.mk);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceLifecycleManager.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceLifecycleManager.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$null$4(ChannelDataTransformer channelDataTransformer) {
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ResourceLifecycleManager.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceLifecycleManager.f(classArray[i], string, clazz2);
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
                ResourceLifecycleManager.ab = MultiContainerRegistry.a(8562745663992354856L, -4987390699385351212L, MethodHandles.lookup().lookupClass()).a(251876194103497L);
                ResourceLifecycleManager.lb = new Object[5];
                ResourceLifecycleManager.mb = new String[5];
                ResourceLifecycleManager.x();
                ResourceLifecycleManager.fb = new HashMap<K, V>(13);
                var0 = ResourceLifecycleManager.ab ^ 27910807044032L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00fcR\u00014<\u0096\u0086\u00b7 \u00df\u00cd\u008c)\u0007\u0002\u00f9\u008dx\u00d1m\u00a9\u00f4\u00c2\r\u00c7O^'\u008d\u0014fhT\u0018;\u00b0\u00ddbzd\u00c55\u00ec[\u00f1\u00beG\u00bbX\u00f6\u008f\u00b1\u0091\u0019\u001fs\u008f\u0098\u00fb2\u0016\u00ed\u0086\u0082r\u00b7\u00e3\u00ac\u0094\u008e\u00f2\u0096\u00c0i@\u0016FH\u00cf\u00d3.Z\u0088\u0097\u00e3yF\u0090";
                var7_6 = "\u00fcR\u00014<\u0096\u0086\u00b7 \u00df\u00cd\u008c)\u0007\u0002\u00f9\u008dx\u00d1m\u00a9\u00f4\u00c2\r\u00c7O^'\u008d\u0014fhT\u0018;\u00b0\u00ddbzd\u00c55\u00ec[\u00f1\u00beG\u00bbX\u00f6\u008f\u00b1\u0091\u0019\u001fs\u008f\u0098\u00fb2\u0016\u00ed\u0086\u0082r\u00b7\u00e3\u00ac\u0094\u008e\u00f2\u0096\u00c0i@\u0016FH\u00cf\u00d3.Z\u0088\u0097\u00e3yF\u0090".length();
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
                    var6_5 = "\u00c8\u009b\u001b\u00d3E\u00d1\u000f\u00c9\u00f3\u00d1P\u00b0j\u00c2\u00b3H";
                    var7_6 = "\u00c8\u009b\u001b\u00d3E\u00d1\u000f\u00c9\u00f3\u00d1P\u00b0j\u00c2\u00b3H".length();
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
        ResourceLifecycleManager.bb = var8_3;
        ResourceLifecycleManager.eb = new Integer[13];
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceLifecycleManager.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceLifecycleManager.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void O() {
        SecureContextBroker572.h().c().c(this.mp.k().s(), true, this::lambda$acceptInvite$8, this::lambda$acceptInvite$9);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static void lambda$null$1(NetworkConnectionBroker2678 networkConnectionBroker2678, TL tL) {
        block6: {
            long l;
            block5: {
                l = ab ^ 0x593628B41C58L;
                try {
                    if (tL.w() != CharsetEncodingSpecification.SUCCESSFULLY_DECLINED) break block5;
                    TemporalMetadataResolver.h.O().p().H(networkConnectionBroker2678);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleManager.a(customSystemException);
                }
            }
            try {
                if (tL.w() == CharsetEncodingSpecification.FAILED) {
                    CipherTextProcessor.g(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)18376, (long)(0x51335A0F91138DB9L ^ l)), (long)-2483629594108136570L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceLifecycleManager.a(customSystemException);
            }
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d8' || c == '\u00e3' || c == '\u00d6' || c == '\u00ec') {
                field = ResourceLifecycleManager.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceLifecycleManager.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void r(String string) {
        long l = ab ^ 0x34D46388CA6BL;
        C_ c_ = new C_(string, (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)21692, (long)(0xE5E4D0B8BA048F5L ^ l)), (long)845284650694059445L, (long)l)), (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)312, (long)(0x2901480E38471D7DL ^ l)), (long)845284650694059445L, (long)l)));
        NetworkConfigurationManager1825 networkConfigurationManager1825 = GraphicalRenderingController.v(this.V(), c_, NetworkConfigurationManager1825.class);
        c_.Z().N(() -> this.lambda$handleLeaveConfirmation$6(networkConfigurationManager1825));
        c_.u().N(() -> this.lambda$handleLeaveConfirmation$7(networkConfigurationManager1825));
        networkConfigurationManager1825.r(this.V(), networkConfigurationManager1825);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceLifecycleManager.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17FA;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceLifecycleManager.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceLifecycleManager.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void lambda$null$2() {
        this.mD = false;
    }

    private static Method l(long l, long l2) {
        int n = ResourceLifecycleManager.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceLifecycleManager.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceLifecycleManager.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceLifecycleManager.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceLifecycleManager.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceLifecycleManager.j(267700923019691L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceLifecycleManager.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceLifecycleManager.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceLifecycleManager.j(267700923019691L, 0L);
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

    public NetworkConnectionBroker2678 d() {
        return this.mp;
    }

    private void lambda$handleLeaveConfirmation$7(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        this.mD = false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void G() {
        long l = ab ^ 0x6951B431BDDBL;
        this.m5.q(false);
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b() - 2.0, ResourceLifecycleManager.M.g.brighter());
        float f = (float)(this.G() + 6.0);
        float f2 = (float)(this.W() + 4.0);
        StateTrackingCoordinator.B(ResourceLifecycleManager.M.Y, f, f2, (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)31781, (long)(0x71235A391F7317D6L ^ l)), (long)8938326312868434437L, (long)l)), 7.0f, 6.3f, false);
        StateTrackingCoordinator.B(ResourceLifecycleManager.M.Y, (float)(this.G() + this.w() - 22.0), (float)this.W() - 0.5f, (String)((Object)ResourceLifecycleManager.d("\u00c7", (int)ResourceLifecycleManager.c("t", (int)15747, (long)(0x6705E840ABF25675L ^ l)), (long)8938326312868434437L, (long)l)), 14.5f, 14.5f, false);
        this.mv.M(this.W() + 5.0);
        this.mv.Y(this.w() - 18.0 - this.mP.w() - this.m5.w() - 4.0);
        this.mv.a(this.w() - 18.0 - this.mP.w() - this.m5.w() - 6.0);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceLifecycleManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ResourceLifecycleManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

