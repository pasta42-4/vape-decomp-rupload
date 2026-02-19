/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL20
 */
package com.security.transformation;

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
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

public class SecureDataTransformer1049
extends CryptoConfigurationManager {
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final String y = "#version 430 compatibility\nlayout(location = 0) uniform sampler2D image;\nlayout(location = 1) uniform vec2 screen_dimensions;\nlayout(location = 2) uniform float blur_Radius;\nlayout(location = 3) uniform int blur_Direction;\nin vec2 f_Position;\nout vec4 FragmentColor;\n\n// Function to calculate Gaussian weight\nfloat gaussian(float x, float sigma) {\n    return exp(-(x * x) / (2.0 * sigma * sigma)) / (2.0 * 3.14159 * sigma * sigma);\n}\n\nvec4 get_gaussian_blurred() {\n    vec4 blurred = vec4(0.0);\n    vec2 coords = gl_TexCoord[0].xy;\n    float sigma = blur_Radius / 3.0; // Adjust sigma value as needed\n\n    float totalWeight = 0.0;\n    for (float x = -blur_Radius; x <= blur_Radius; x++) {\n        // Calculate weight\n        float weight = gaussian(x, sigma);\n\n        // Sample texture\n        vec2 offset = vec2(x, 0.0) / screen_dimensions;\n        vec4 sample1 = texture(image, coords + offset) * weight;\n\n        // Accumulate weighted sample\n        blurred += sample1;\n        totalWeight += weight;\n    }\n    blurred /= totalWeight;\n    totalWeight = 0.0;\n    vec4 blurred2 = vec4(0.0);\n    for (float y = -blur_Radius; y <= blur_Radius; y++) {\n        // Calculate weight\n        float weight = gaussian(y, sigma);\n\n        // Sample texture\n        vec2 offset = vec2(0.0, y) / screen_dimensions;\n        vec4 sample1 = texture(image, coords + offset) * weight;\n\n        // Accumulate weighted sample\n        blurred2 += sample1;\n        totalWeight += weight;\n    }\n\n    return blurred2 / totalWeight;\n}\n\nvoid main(void) {\n    vec4 blurred = vec4(0.0);\n    vec2 coords = gl_TexCoord[0].xy;\n    float sigma = blur_Radius / 3.0;\n    float totalWeight = 0.0;\n    for (float i = -blur_Radius; i <= blur_Radius; i++) {\n        float weight = gaussian(i, sigma);\n        vec2 offset = blur_Direction == 0 ? vec2(i, 0) : vec2(0, i);\n        offset /= screen_dimensions;\n        vec4 sample1 = texture(image, coords + offset) * weight;\n        blurred += sample1;\n        totalWeight += weight;\n    }\n    gl_FragColor = blurred / totalWeight;\n}";
    private static final long c;
    private static final String b = "#version 430 compatibility\n\nout vec2 f_Position;\nvoid main(void)\n{\nf_Position = gl_Vertex.xy;\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\ngl_TexCoord[0] = gl_TextureMatrix[0] * gl_MultiTexCoord0;\n}";

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x54AA;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
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
                throw new RuntimeException("a/kP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureDataTransformer1049.g[n2] = n3;
        }
        return g[n2];
    }

    public void R(float f, float f2) {
        long l = c ^ 0x2E3E527ECDFEL;
        GL13.glActiveTexture((int)SecureDataTransformer1049.b("d", (int)24692, (long)(0x24AE59BE0FEEDC57L ^ l)));
        GL20.glUniform1i((int)0, (int)0);
        GL20.glUniform2f((int)1, (float)f, (float)f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = MultiContainerRegistry.a(-1177946415907191621L, -3253454439964173360L, MethodHandles.lookup().lookupClass()).a(248666083473909L);
        h = new HashMap(13);
        long l = c ^ 0x159C9D7C5CBEL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00ec\u0019\u00e8!\u000f\u00f8n\u008a\u00e9\u00cd[3\u0016\u0011\u00f2\u00d3v\u009e\u00cb\u00cd\u00e5\u0083\u00f1\u00b9";
        int n2 = "\u00ec\u0019\u00e8!\u000f\u00f8n\u008a\u00e9\u00cd[3\u0016\u0011\u00f2\u00d3v\u009e\u00cb\u00cd\u00e5\u0083\u00f1\u00b9".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[3];
    }

    public SecureDataTransformer1049() {
        long l = c ^ 0x289CA08A2BECL;
        super(a.cs((int)SecureDataTransformer1049.b("d", (int)32413, (long)(0x46DA1295D45924AEL ^ l))), a.cs((int)SecureDataTransformer1049.b("d", (int)1244, (long)(0x617CB3E4B1C5EEEL ^ l))));
    }

    public void p(float f) {
        GL20.glUniform1f((int)2, (float)f);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureDataTransformer1049.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void x(int n) {
        GL20.glUniform1i((int)3, (int)n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureDataTransformer1049.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

