/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.app.workflow;

import a.Ne;
import a.Nu;
import a.vC;
import a.z6;
import com.app.configuration.ConfigurationDescriptor;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.collections.management.MultiContainerRegistry;
import com.data.obfuscation.NumericScrambler;
import com.exception.system.CustomSystemException;
import com.reflection.dispatch.MethodInvocationResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.system.configuration.ConfigurationManager;
import com.system.transformation.DataTransformationUtility;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import org.lwjgl.opengl.GL11;

public class StateTrackingCoordinator {
    private static final long[] b;
    private static final long a;
    public static HashMap<String, NumericScrambler> s;
    private static boolean J;
    private static boolean p;
    private static final Map d;
    private static final Integer[] c;
    private static final Object[] e;
    private static boolean I;
    private static final String[] f;
    private static boolean h;

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 53;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 55;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 35;
                break;
            }
            case 5: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 30;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 17;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 50;
                break;
            }
            case 11: {
                n3 = 45;
                break;
            }
            case 12: {
                n3 = 60;
                break;
            }
            case 13: {
                n3 = 0;
                break;
            }
            case 14: {
                n3 = 43;
                break;
            }
            case 15: {
                n3 = 44;
                break;
            }
            case 16: {
                n3 = 59;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 28;
                break;
            }
            case 20: {
                n3 = 26;
                break;
            }
            case 21: {
                n3 = 46;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 62;
                break;
            }
            case 24: {
                n3 = 33;
                break;
            }
            case 25: {
                n3 = 57;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 8;
                break;
            }
            case 28: {
                n3 = 36;
                break;
            }
            case 29: {
                n3 = 63;
                break;
            }
            case 30: {
                n3 = 38;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 11;
                break;
            }
            case 34: {
                n3 = 25;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 7;
                break;
            }
            case 37: {
                n3 = 39;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 56;
                break;
            }
            case 43: {
                n3 = 61;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 32;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 1;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 20;
                break;
            }
            case 50: {
                n3 = 27;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 2;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 51;
                break;
            }
            case 60: {
                n3 = 16;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 49;
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
        StateTrackingCoordinator.f[n4] = new String(cArray);
        return n4;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                StateTrackingCoordinator.a = MultiContainerRegistry.a(-8841296449504556870L, -7731747595024264489L, MethodHandles.lookup().lookupClass()).a(185496346039585L);
                StateTrackingCoordinator.e = new Object[8];
                StateTrackingCoordinator.f = new String[8];
                StateTrackingCoordinator.a();
                StateTrackingCoordinator.d = new HashMap<K, V>(13);
                var0 = StateTrackingCoordinator.a ^ 39293221994084L;
                StateTrackingCoordinator.e(true);
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
                var8_3 = new long[28];
                var5_4 = 0;
                var6_5 = "\u00ee\u00a6J\u00a6\u00f4H\u00e2\u00ea\u00bb\u0085\u00f7\u0082\u008d\u00a3w\u00e4\t\u00f1\u00ddk{\u00fa w\u00b3\u00e3^\u008f%;\u0019mM:W\u00cc\u008b\u00c4L\u00ff\u00b2E\u00d5\u00bbJ\u00c1\u0097\u00a9\u00ed \u00c7\u00daN@4\u00cd\u001d8\u00eay\u0080\u00ec\u0092\u00bc\u00e7G\u0011l\u00d5\u00a7\u00a1\u00d5*\u0018t\u00f5\u00e5V\u000f\u0019\u00c5t\u0017\u00ce\u0097J\"\u00a0\u00079\u00d6\u008b5Qy,-\u0081]M\u00a38*gt\u000f\u00d4\u00b2\u00ae;\u00e7%\u0088\u0093|$i\u0017X\u00db7\u00d4\r0Y$\u00b2\u00ac\u00e3(\u00b2M\u00fe\u00da\u00a5\u000b\u0096\u0092h\u0018m\u00ae\u0011\u001dy\u00ba\u00db\u00da*\u00bet\u00c3\noc\u00c0\u001e[\u00b1#\u00e6\u00cc=;}\u008d\u00f7\u00e8\u00de{\u00c92\u0093\u00d7\u0003\u0016\u00a3!\u00a7Y\u0011H\u0098\u00fb\u00e0M?L\u00bb\u00ac\u00aeKA-\u00c0\u00c3\u00a8\u00e0\u00a7\u0098^x\u00c9\u0018\u009fC\u0082\u00b3";
                var7_6 = "\u00ee\u00a6J\u00a6\u00f4H\u00e2\u00ea\u00bb\u0085\u00f7\u0082\u008d\u00a3w\u00e4\t\u00f1\u00ddk{\u00fa w\u00b3\u00e3^\u008f%;\u0019mM:W\u00cc\u008b\u00c4L\u00ff\u00b2E\u00d5\u00bbJ\u00c1\u0097\u00a9\u00ed \u00c7\u00daN@4\u00cd\u001d8\u00eay\u0080\u00ec\u0092\u00bc\u00e7G\u0011l\u00d5\u00a7\u00a1\u00d5*\u0018t\u00f5\u00e5V\u000f\u0019\u00c5t\u0017\u00ce\u0097J\"\u00a0\u00079\u00d6\u008b5Qy,-\u0081]M\u00a38*gt\u000f\u00d4\u00b2\u00ae;\u00e7%\u0088\u0093|$i\u0017X\u00db7\u00d4\r0Y$\u00b2\u00ac\u00e3(\u00b2M\u00fe\u00da\u00a5\u000b\u0096\u0092h\u0018m\u00ae\u0011\u001dy\u00ba\u00db\u00da*\u00bet\u00c3\noc\u00c0\u001e[\u00b1#\u00e6\u00cc=;}\u008d\u00f7\u00e8\u00de{\u00c92\u0093\u00d7\u0003\u0016\u00a3!\u00a7Y\u0011H\u0098\u00fb\u00e0M?L\u00bb\u00ac\u00aeKA-\u00c0\u00c3\u00a8\u00e0\u00a7\u0098^x\u00c9\u0018\u009fC\u0082\u00b3".length();
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
                    var6_5 = "\u00f1\fR\u001a\u00cc5\u008a\u00d5\u0010QX\u00f650\u00bd\u0097";
                    var7_6 = "\u00f1\fR\u001a\u00cc5\u008a\u00d5\u0010QX\u00f650\u00bd\u0097".length();
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
        StateTrackingCoordinator.b = var8_3;
        StateTrackingCoordinator.c = new Integer[28];
        StateTrackingCoordinator.s = new HashMap<K, V>();
        StateTrackingCoordinator.h = false;
        StateTrackingCoordinator.p = false;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StateTrackingCoordinator.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                StateTrackingCoordinator.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void v(Color color, Color color2, float f, float f2, String string, float f3, float f4, boolean bl) {
        NumericScrambler numericScrambler = StateTrackingCoordinator.n(string);
        StateTrackingCoordinator.E(color, color2, f, f2, numericScrambler, string, f3, f4, bl, -1.0f);
    }

    public static double V(String string) {
        block4: {
            long l;
            block5: {
                l = a ^ 0x70CC7B6BFAB3L;
                try {
                    try {
                        if (!ConfigurationManager.U()) break block4;
                        if (MethodInvocationResolver.g().O((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)27458, (long)(0x7269A143E20795EDL ^ l)), (long)4626306476911427518L, (long)l))).V(string) != null) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StateTrackingCoordinator.a(customSystemException);
                    }
                    StateTrackingCoordinator.n(string);
                }
                catch (CustomSystemException customSystemException) {
                    throw StateTrackingCoordinator.a(customSystemException);
                }
            }
            return MethodInvocationResolver.g().O((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)9103, (long)(0x27252958C885D35L ^ l)), (long)4626306476911427518L, (long)l))).V((String)string).v;
        }
        return StateTrackingCoordinator.n((String)string).t;
    }

    public static boolean n() {
        return I;
    }

    public static String K(String string, int n) {
        String string2 = "";
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            string2 = string2 + String.valueOf((char)(c ^ n));
        }
        return string2;
    }

    public static void d() {
        try {
            J = true;
            Ne.h.z();
            h = Ne.h.k(3042);
            p = Ne.h.k(3553);
            if (!h) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTrackingCoordinator.a(customSystemException);
        }
        try {
            if (!p) {
                Ne.h.y(3553);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTrackingCoordinator.a(customSystemException);
        }
    }

    public static void u() {
        long l = a ^ 0x55BD546C0458L;
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)5600, (long)(0x79FC453A5A8195AAL ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)29407, (long)(0x1D1703EF2146F29EL ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)216, (long)(0x48B0FA864D98809FL ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)26774, (long)(0x3A0841459ED668D6L ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)2471, (long)(0xB7DACBEB27609EEL ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)14616, (long)(0x73AAEC66711B394BL ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)10638, (long)(0x3B546F9DDAE629C2L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)3621, (long)(0x21791E4203470E79L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)14359, (long)(0x16E8B3B43FCAB845L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)9947, (long)(0x4E3CE57A9A332686L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)26931, (long)(0x70523544F2EE97DL ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)29380, (long)(0x66E175B6D5A3728CL ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)10742, (long)(0x46139E7B23BE29AFL ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)31865, (long)(0x1A869DE00E617C3BL ^ l)), (long)-4694769188963417771L, (long)l)), false, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)8254, (long)(0x34E0D5633F842060L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)20325, (long)(0x687A28312211CF35L ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)11212, (long)(0x48FF8D77480F2B8AL ^ l)), (long)-4694769188963417771L, (long)l)), true, false);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)6047, (long)(0x558CCA25D07D97D4L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)22959, (long)(0x1CBFD29D5F159E2L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
        for (ConfigurationDescriptor notificationDispatchInterface2673 : ConfigurationDescriptor.VALUES) {
            try {
                if (notificationDispatchInterface2673.s() == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StateTrackingCoordinator.a(customSystemException);
            }
            StateTrackingCoordinator.e(notificationDispatchInterface2673.s(), false, true);
        }
        for (PluginLifecycleContract pluginLifecycleContract : DataTransformationUtility.i()) {
            try {
                if (pluginLifecycleContract.Y() == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StateTrackingCoordinator.a(customSystemException);
            }
            StateTrackingCoordinator.e(pluginLifecycleContract.Y(), false, true);
        }
        StateTrackingCoordinator.e((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)14032, (long)(0x68783D4D43463695L ^ l)), (long)-4694769188963417771L, (long)l)), false, true);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00cb' || c == '\u00c4' || c == 'p') {
                field = StateTrackingCoordinator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StateTrackingCoordinator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void y() {
        try {
            GraphicsBufferAllocator.Y(Color.white);
            if (!h) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTrackingCoordinator.a(customSystemException);
        }
        try {
            if (!p) {
                Ne.h.z(3553);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTrackingCoordinator.a(customSystemException);
        }
        Ne.h.X();
        J = false;
    }

    public static void t(NumericScrambler numericScrambler, float f, float f2, float f3, float f4) {
        float f5;
        if (f3 == f4) {
            f5 = (float)numericScrambler.t / (float)numericScrambler.v;
            f3 *= f5;
        }
        numericScrambler.p();
        f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 1.0f;
        float f8 = 1.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f7, (float)f6);
        GL11.glVertex2f((float)(f + f3), (float)f2);
        GL11.glTexCoord2f((float)f5, (float)f6);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glTexCoord2f((float)f5, (float)f8);
        GL11.glVertex2f((float)f, (float)(f2 + f4));
        GL11.glTexCoord2f((float)f7, (float)f8);
        GL11.glVertex2f((float)(f + f3), (float)(f2 + f4));
        GL11.glEnd();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StateTrackingCoordinator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StateTrackingCoordinator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001d)F";
        objectArray[1] = Integer.TYPE;
        StateTrackingCoordinator.f[1] = "java/lang/Integer";
        objectArray[2] = "8Q[V8k3^J\u0019Es YCP";
        objectArray[3] = "\u0010q\u0012f";
        objectArray[4] = "\u000bR";
        objectArray[5] = "uX\\sd5~WM<\u0005;u\\If";
        objectArray[6] = "\u000f\u0013J\u001e\u0006>[GQ\f\u007f\r5FA\u0017F5\u0004\u0000\u0015\rAS\u000f\u0005S\u0019\u0014.GD\u0012\u0001\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "P\u0003am$,L\nb\u001d-(5\u0011t` 6ESz!FjZ\u000e*{w,\u000e\u0014-\u001d";
    }

    public static boolean K() {
        boolean bl = StateTrackingCoordinator.n();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTrackingCoordinator.a(customSystemException);
        }
        return false;
    }

    public static void z(Color color, float f, float f2, NumericScrambler numericScrambler, float f3, float f4, boolean bl) {
        StateTrackingCoordinator.E(color, null, f, f2, numericScrambler, null, f3, f4, bl, -1.0f);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = StateTrackingCoordinator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void d(Color color, float f, float f2, String string, float f3, boolean bl) {
        NumericScrambler numericScrambler = StateTrackingCoordinator.n(string);
        double d2 = 1.0 / (double)f3;
        f = (float)((double)f * d2);
        f2 = (float)((double)f2 * d2);
        StateTrackingCoordinator.E(color, null, f, f2, numericScrambler, string, 32.0f, 32.0f, bl, f3);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3E92;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/X_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StateTrackingCoordinator.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = StateTrackingCoordinator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StateTrackingCoordinator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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

    public static double D(String string) {
        block4: {
            long l;
            block5: {
                l = a ^ 0x115CC1FFB1E7L;
                try {
                    try {
                        if (!ConfigurationManager.U()) break block4;
                        if (MethodInvocationResolver.g().O((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)21773, (long)(0x6BFAA4122FFFE0FDL ^ l)), (long)821784518866285802L, (long)l))).V(string) != null) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StateTrackingCoordinator.a(customSystemException);
                    }
                    StateTrackingCoordinator.n(string);
                }
                catch (CustomSystemException customSystemException) {
                    throw StateTrackingCoordinator.a(customSystemException);
                }
            }
            return MethodInvocationResolver.g().O((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)22946, (long)(0x52FAE608CEBEC45L ^ l)), (long)821784518866285802L, (long)l))).V((String)string).u;
        }
        return StateTrackingCoordinator.n((String)string).v;
    }

    private static NumericScrambler n(String string) {
        return StateTrackingCoordinator.e(string, false, false);
    }

    public static void B(Color color, float f, float f2, String string, float f3, float f4, boolean bl) {
        NumericScrambler numericScrambler = StateTrackingCoordinator.n(string);
        StateTrackingCoordinator.E(color, null, f, f2, numericScrambler, string, f3, f4, bl, -1.0f);
    }

    private static Field c(long l, long l2) {
        int n = StateTrackingCoordinator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = StateTrackingCoordinator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StateTrackingCoordinator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StateTrackingCoordinator.a(clazz3, string2, clazz2)) != null) {
                    StateTrackingCoordinator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StateTrackingCoordinator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StateTrackingCoordinator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StateTrackingCoordinator.b(385857665369111L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/X_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = StateTrackingCoordinator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = StateTrackingCoordinator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StateTrackingCoordinator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StateTrackingCoordinator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        StateTrackingCoordinator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StateTrackingCoordinator.b(385857665369111L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StateTrackingCoordinator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StateTrackingCoordinator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StateTrackingCoordinator.b(385857665369111L, 0L);
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

    public static void e(boolean bl) {
        I = bl;
    }

    public static void Q(NumericScrambler numericScrambler, float f, float f2, float f3, float f4, Color color, Color color2) {
        float f5 = (float)numericScrambler.t / (float)numericScrambler.v;
        f3 *= f5;
        numericScrambler.p();
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 1.0f;
        float f9 = 1.0f;
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glTexCoord2f((float)f8, (float)f7);
        GL11.glVertex2f((float)(f + f3), (float)f2);
        GL11.glTexCoord2f((float)f6, (float)f7);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4d((double)((double)color2.getRed() / 255.0), (double)((double)color2.getGreen() / 255.0), (double)((double)color2.getBlue() / 255.0), (double)((double)color2.getAlpha() / 255.0));
        GL11.glTexCoord2f((float)f6, (float)f9);
        GL11.glVertex2f((float)f, (float)(f2 + f4));
        GL11.glTexCoord2f((float)f8, (float)f9);
        GL11.glVertex2f((float)(f + f3), (float)(f2 + f4));
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
    }

    public static void y(Color color, float f, float f2, String string, float f3) {
        StateTrackingCoordinator.d(color, f, f2, string, f3, true);
    }

    public static NumericScrambler e(String string, boolean bl, boolean bl2) {
        long l = a ^ 0xCBA87F9D781L;
        NumericScrambler numericScrambler = s.get(string);
        try {
            if (numericScrambler != null) {
                return numericScrambler;
            }
        }
        catch (IOException iOException) {
            throw StateTrackingCoordinator.a(iOException);
        }
        try {
            int n;
            ByteArrayInputStream byteArrayInputStream;
            NumericScrambler numericScrambler2;
            NumericScrambler numericScrambler3;
            CallSite callSite;
            block10: {
                callSite = StateTrackingCoordinator.b("f", (String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)10128, (long)(0x1CC13FA10F817413L ^ l)), (long)7854714583724249740L, (long)l)) + string + (String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)9376, (long)(0x14B97E65C1CDF73AL ^ l)), (long)7854714583724249740L, (long)l)), (long)7854814955795884787L, (long)l);
                try {
                    if (callSite != null && ((CallSite)callSite).length != 0) break block10;
                }
                catch (IOException iOException) {
                    throw StateTrackingCoordinator.a(iOException);
                }
                numericScrambler = StateTrackingCoordinator.n((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)25623, (long)(0x6B5A2114D38E3791L ^ l)), (long)7854714583724249740L, (long)l)));
                s.put(string, numericScrambler);
                return numericScrambler;
            }
            if (ConfigurationManager.U()) {
                Nu nu = MethodInvocationResolver.g().O((String)((Object)StateTrackingCoordinator.b("f", (int)StateTrackingCoordinator.a("h", (int)21710, (long)(0x4E887E494DF0874CL ^ l)), (long)7854714583724249740L, (long)l)));
                nu.E(string, (byte[])callSite, bl2);
                return nu.q();
            }
            try {
                NumericScrambler numericScrambler4;
                numericScrambler3 = numericScrambler4;
                numericScrambler2 = numericScrambler4;
                byteArrayInputStream = new ByteArrayInputStream((byte[])callSite);
                n = bl ? 9987 : 9729;
            }
            catch (IOException iOException) {
                throw StateTrackingCoordinator.a(iOException);
            }
            numericScrambler3(byteArrayInputStream, n, bl2 ? vC.WHITE : vC.RGBA);
            numericScrambler = numericScrambler2;
            s.put(string, numericScrambler);
            return numericScrambler;
        }
        catch (IOException iOException) {
            TemporalMetadataResolver.W(iOException);
            return null;
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StateTrackingCoordinator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void E(Color color, Color color2, float f, float f2, NumericScrambler numericScrambler, String string, float f3, float f4, boolean bl, float f5) {
        block30: {
            boolean bl2;
            block31: {
                boolean bl3;
                block29: {
                    block28: {
                        try {
                            if (ConfigurationManager.U()) {
                                z6.v(f, f2, f3, f4, numericScrambler, string, f5, color, color2, bl);
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StateTrackingCoordinator.a(customSystemException);
                        }
                        bl3 = false;
                        bl2 = false;
                        if (!J) {
                            GL11.glPushMatrix();
                            bl3 = GL11.glIsEnabled((int)3042);
                            bl2 = GL11.glIsEnabled((int)3553);
                            try {
                                if (!bl3) {
                                    Ne.h.y(3042);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StateTrackingCoordinator.a(customSystemException);
                            }
                            try {
                                if (!bl2) {
                                    Ne.h.y(3553);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StateTrackingCoordinator.a(customSystemException);
                            }
                        }
                        try {
                            if (Math.signum(f5) >= 0.0f) {
                                GL11.glScaled((double)f5, (double)f5, (double)f5);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StateTrackingCoordinator.a(customSystemException);
                        }
                        try {
                            if (bl) {
                                GraphicsBufferAllocator.Y(new Color(0, 0, 0, 150));
                                StateTrackingCoordinator.t(numericScrambler, f + 0.5f, f2 + 0.5f, f3, f4);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StateTrackingCoordinator.a(customSystemException);
                        }
                        try {
                            GraphicsBufferAllocator.Y(color);
                            if (color2 != null) break block28;
                            StateTrackingCoordinator.t(numericScrambler, f, f2, f3, f4);
                            break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StateTrackingCoordinator.a(customSystemException);
                        }
                    }
                    StateTrackingCoordinator.Q(numericScrambler, f, f2, f3, f4, color, color2);
                }
                try {
                    if (Math.signum(f5) >= 0.0f) {
                        GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw StateTrackingCoordinator.a(customSystemException);
                }
                try {
                    try {
                        if (J) break block30;
                        GraphicsBufferAllocator.Y(Color.white);
                        if (bl3) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StateTrackingCoordinator.a(customSystemException);
                    }
                    Ne.h.z(3042);
                }
                catch (CustomSystemException customSystemException) {
                    throw StateTrackingCoordinator.a(customSystemException);
                }
            }
            try {
                if (!bl2) {
                    Ne.h.z(3553);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StateTrackingCoordinator.a(customSystemException);
            }
            GL11.glPopMatrix();
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/X_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StateTrackingCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(StateTrackingCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

