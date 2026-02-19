/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package com.network.protocol;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.crypto.configuration.CryptoConfigurationManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL20;

public class NetworkProtocolEncoder1023
extends CryptoConfigurationManager {
    private static final long[] c;
    private static final Map h;
    private static final String f = "#version 430 compatibility\nlayout(location = 0) uniform float outerRadius;\nlayout(location = 1) uniform float innerRadius;\nlayout(location = 2) uniform float intensity;\nlayout(location = 3) uniform vec2 u_resolution;\nvoid main(void) {\n    vec4 color = vec4(1.0, 1.0, 1.0, 1.0);\n    vec2 relativePosition = gl_FragCoord.xy / u_resolution - .5;\n    float len = length(relativePosition);\n    float vignette = smoothstep(outerRadius, innerRadius, len);\n    color.rbg = mix(color.rgb, color.rgb * vignette, intensity);\n    gl_FragColor = color;}";
    private static final Integer[] g;
    private static final String X = "#version 430 compatibility\n\nvoid main(void)\n{\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\n}";
    private static final long b;

    public void D(float f) {
        GL20.glUniform1f((int)1, (float)f);
    }

    public void N(float f) {
        GL20.glUniform1f((int)2, (float)f);
    }

    public NetworkProtocolEncoder1023(float f, float f2, float f3, float f4, float f5) {
        long l = b ^ 0x49123C8613AFL;
        super(a.cs((int)NetworkProtocolEncoder1023.b("l", (int)21222, (long)(0xB018EE6BBA5436CL ^ l))), a.cs((int)NetworkProtocolEncoder1023.b("l", (int)1341, (long)(0x59A168D1598894B4L ^ l))));
        GL20.glUniform1f((int)0, (float)f);
        GL20.glUniform1f((int)1, (float)f2);
        GL20.glUniform1f((int)2, (float)f3);
        GL20.glUniform2f((int)3, (float)f4, (float)f5);
    }

    public void o(float f) {
        GL20.glUniform1f((int)0, (float)f);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkProtocolEncoder1023.b = MultiContainerRegistry.a(8008774196508636999L, -8250938091433017044L, MethodHandles.lookup().lookupClass()).a(23958135658583L);
                NetworkProtocolEncoder1023.h = new HashMap<K, V>(13);
                var0 = NetworkProtocolEncoder1023.b ^ 110038519723119L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u0014t\u0007\u007f9\u00f7\u00ed\u00ce@E\u00bd<\u00c3x\u00b4\u00eb";
                var7_6 = "\u0014t\u0007\u007f9\u00f7\u00ed\u00ce@E\u00bd<\u00c3x\u00b4\u00eb".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00fe\u0083Dxk\u00c5\tq3}4\u00af$\u00bf\u00f6+";
                    var7_6 = "\u00fe\u0083Dxk\u00c5\tq3}4\u00af$\u00bf\u00f6+".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        NetworkProtocolEncoder1023.c = var8_3;
        NetworkProtocolEncoder1023.g = new Integer[4];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolEncoder1023.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AE1;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/kr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolEncoder1023.g[n2] = n3;
        }
        return g[n2];
    }

    public NetworkProtocolEncoder1023() {
        long l = b ^ 0x7D23CDCE21A7L;
        super(a.cs((int)NetworkProtocolEncoder1023.b("l", (int)4655, (long)(0x355F9653CB5231ACL ^ l))), a.cs((int)NetworkProtocolEncoder1023.b("l", (int)16430, (long)(0x6212CF4E597EE3AEL ^ l))));
    }

    public void m(float f, float f2) {
        GL20.glUniform2f((int)3, (float)f, (float)f2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder1023.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

