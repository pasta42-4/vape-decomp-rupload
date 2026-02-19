/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.network.secure;

import a.Ne;
import a.a;
import a.oQ;
import a.tl;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.data.processing.DataTransformationHandler2028;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.TransmissionProtocolHandler1868;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.cryptography.CryptographicResourceManager;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.ConfigurationManager;
import com.validation.core.ObjectValidator;
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
import org.lwjgl.opengl.GL11;

public class SecureChannelNegotiator389
extends ReflectionMetadataExtractor1376 {
    private static final Integer[] e;
    private static final String[] l;
    private static final Map h;
    private static final long[] d;
    private static final Object[] j;
    private AdaptiveRenderingEngine L;
    private static final long b;
    private AdaptiveRenderingEngine P;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureChannelNegotiator389.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureChannelNegotiator389.b = MultiContainerRegistry.a(-4998120532387639390L, 9113593210289952650L, MethodHandles.lookup().lookupClass()).a(44072980616883L);
                SecureChannelNegotiator389.j = new Object[5];
                SecureChannelNegotiator389.l = new String[5];
                SecureChannelNegotiator389.a();
                SecureChannelNegotiator389.h = new HashMap<K, V>(13);
                var0 = SecureChannelNegotiator389.b ^ 57720579681255L;
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
                var6_5 = "\bjq\u0000\u00c3h:@t\u0012\u0096p0Uu\u00b1^E\u00aa\u00f5'\u008a\u001f2";
                var7_6 = "\bjq\u0000\u00c3h:@t\u0012\u0096p0Uu\u00b1^E\u00aa\u00f5'\u008a\u001f2".length();
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
                    var6_5 = "\u008am{\u001f2\u00ca\u008a\u00c8Z\u00c0B\u00fe<\u00de\u00a5\u00fa";
                    var7_6 = "\u008am{\u001f2\u00ca\u008a\u00c8Z\u00c0B\u00fe<\u00de\u00a5\u00fa".length();
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
        SecureChannelNegotiator389.d = var8_3;
        SecureChannelNegotiator389.e = new Integer[5];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3F2A;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/jM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureChannelNegotiator389.e[n2] = n3;
        }
        return e[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecureChannelNegotiator389.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureChannelNegotiator389.b(classArray[i], string, clazz2);
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

    private static void a() {
        Object[] objectArray = j;
        j[0] = "[\r7";
        objectArray[1] = Integer.TYPE;
        SecureChannelNegotiator389.l[1] = "java/lang/Integer";
        objectArray[2] = "Cks.e$Hdba\u0018<[ck(";
        objectArray[3] = "I\u0003\u0007>E,B\f\u0016q$\"I\u0007\u0012+";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ";(Q`)\rx!\u0011\u0010y\u001d\u00076Nw\u007f\u001975\u0010|\u0012\\?)Njp\r~wR\u0010";
    }

    public SecureChannelNegotiator389() {
        long l = b ^ 0x6DF4C97D4238L;
        super(a.cs((int)SecureChannelNegotiator389.a("a", (int)16211, (long)(0x53C12DACFB3ACFC9L ^ l))), CryptographicResourceManager.Y, a.cs((int)SecureChannelNegotiator389.a("a", (int)8100, (long)(0x61B09ED6C6886F3FL ^ l))));
        this.P = AdaptiveRenderingEngine.C(this, (String)((Object)SecureChannelNegotiator389.c("\u00e3", (int)SecureChannelNegotiator389.a("a", (int)28447, (long)(0x20903106BF191F87L ^ l)), (long)5742480639481584969L, (long)l)), new Color(255, 0, 0, 95));
        this.L = AdaptiveRenderingEngine.C(this, (String)((Object)SecureChannelNegotiator389.c("\u00e3", (int)SecureChannelNegotiator389.a("a", (int)24029, (long)(0x7A0889A68EE32D43L ^ l)), (long)5742480639481584969L, (long)l)), new Color(255, 0, 0, 200));
        this.s((String)((Object)SecureChannelNegotiator389.c("\u00e3", (int)SecureChannelNegotiator389.a("a", (int)13845, (long)(0x5B001FAB6AB9468CL ^ l)), (long)5742480639481584969L, (long)l)));
        this.N(this.P, this.L);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = SecureChannelNegotiator389.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = SecureChannelNegotiator389.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureChannelNegotiator389.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureChannelNegotiator389.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureChannelNegotiator389.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureChannelNegotiator389.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureChannelNegotiator389.b(253753192435958L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureChannelNegotiator389.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureChannelNegotiator389.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureChannelNegotiator389.b(253753192435958L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureChannelNegotiator389.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void r(oQ oQ2, Color color) {
        block3: {
            block2: {
                try {
                    if (!ConfigurationManager.U()) break block2;
                    DataFlowAnalyzer.F(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), color);
                    DataFlowAnalyzer.F(oQ2.f(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), color);
                    DataFlowAnalyzer.F(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.v(), color);
                    DataFlowAnalyzer.F(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.R(), color);
                    DataFlowAnalyzer.F(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), color);
                    DataFlowAnalyzer.F(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.v(), color);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureChannelNegotiator389.a(customSystemException);
                }
            }
            Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
            GL11.glBegin((int)7);
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glEnd();
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (SecureChannelNegotiator389.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 47;
                break;
            }
            case 1: {
                n3 = 26;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 33;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 19;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 43;
                break;
            }
            case 10: {
                n3 = 14;
                break;
            }
            case 11: {
                n3 = 17;
                break;
            }
            case 12: {
                n3 = 34;
                break;
            }
            case 13: {
                n3 = 2;
                break;
            }
            case 14: {
                n3 = 11;
                break;
            }
            case 15: {
                n3 = 31;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 48;
                break;
            }
            case 19: {
                n3 = 23;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 29;
                break;
            }
            case 22: {
                n3 = 4;
                break;
            }
            case 23: {
                n3 = 7;
                break;
            }
            case 24: {
                n3 = 37;
                break;
            }
            case 25: {
                n3 = 53;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 16;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 56;
                break;
            }
            case 32: {
                n3 = 45;
                break;
            }
            case 33: {
                n3 = 8;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 55;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 9;
                break;
            }
            case 40: {
                n3 = 6;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 5;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 18;
                break;
            }
            case 47: {
                n3 = 44;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 60;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 54;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 39;
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
        SecureChannelNegotiator389.l[n4] = new String(cArray);
        return n4;
    }

    private void x(oQ oQ2, Color color) {
        block3: {
            block2: {
                try {
                    if (!ConfigurationManager.U()) break block2;
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.P(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.f(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.f(), oQ2.P(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.c(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.c(), oQ2.R(), 2.0f, color);
                    DataFlowAnalyzer.N(oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), 2.0f, color);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureChannelNegotiator389.a(customSystemException);
                }
            }
            Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
            GL11.glBegin((int)1);
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
            GL11.glEnd();
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureChannelNegotiator389.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureChannelNegotiator389.j[n] = clazz = Class.forName(SecureChannelNegotiator389.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureChannelNegotiator389.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureChannelNegotiator389.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void q(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        double d2;
        double d3;
        double d4;
        oQ oQ2;
        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
        block23: {
            networkPacketInterceptor1107 = ConfigurationCalibrator.b.m();
            try {
                if (networkPacketInterceptor1107.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecureChannelNegotiator389.a(customSystemException);
            }
            try {
                if (!networkPacketInterceptor1107.q().equals(ObjectValidator.Y())) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecureChannelNegotiator389.a(customSystemException);
            }
            TransactionCorrelationEngine transactionCorrelationEngine = networkPacketInterceptor1107.M();
            try {
                try {
                    if (transactionCorrelationEngine != null && !transactionCorrelationEngine.Y()) break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureChannelNegotiator389.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SecureChannelNegotiator389.a(customSystemException);
            }
        }
        CryptoContextNegotiator684.Y();
        Ne.h.y(3042);
        Ne.h.y(2929);
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.y(2848);
        Ne.h.h(2.0f);
        Ne.h.z(3553);
        tl.R(false);
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        if (GeometryCalculator.C() <= 13) {
            oQ2 = networkPacketInterceptor1107.M().C(ApplicationLifecycleManager.c(), networkPacketInterceptor1107.p(), networkPacketInterceptor1107.b(), networkPacketInterceptor1107.m());
        } else {
            TransmissionProtocolHandler1868 transmissionProtocolHandler1868;
            DataTransformationHandler2028 dataTransformationHandler2028;
            NetworkConnectionOrchestrator networkConnectionOrchestrator;
            ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.L(AdaptiveComputationEngine.Q((double)networkPacketInterceptor1107.p()), AdaptiveComputationEngine.Q((double)networkPacketInterceptor1107.b()), AdaptiveComputationEngine.Q((double)networkPacketInterceptor1107.m()));
            oQ2 = GeometryCalculator.C() >= 35 ? ((networkConnectionOrchestrator = connectionConfigurationResolver.T(reflectionUtilityBroker)).B(ReflectionMetadataResolver.Q) ? (!(dataTransformationHandler2028 = (transmissionProtocolHandler1868 = new TransmissionProtocolHandler1868(networkConnectionOrchestrator)).U(ApplicationLifecycleManager.U().v().h(), reflectionUtilityBroker)).P() ? dataTransformationHandler2028.y() : null) : networkPacketInterceptor1107.M().l(connectionConfigurationResolver, reflectionUtilityBroker)) : (GeometryCalculator.C() == 23 ? networkPacketInterceptor1107.M().P(ApplicationLifecycleManager.c().T(reflectionUtilityBroker), connectionConfigurationResolver, reflectionUtilityBroker) : networkPacketInterceptor1107.M().l(connectionConfigurationResolver, reflectionUtilityBroker));
        }
        try {
            if (oQ2 == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureChannelNegotiator389.a(customSystemException);
        }
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            d4 = NumericComputationEngine1131.b();
            d3 = NumericComputationEngine1131.S();
            d2 = NumericComputationEngine1131.n();
        } else {
            NumericComputationEngine1131 numericComputationEngine1131 = ApplicationLifecycleManager.r();
            d4 = numericComputationEngine1131.L();
            d3 = numericComputationEngine1131.D();
            d2 = numericComputationEngine1131.s();
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                Ne.h.m((double)networkPacketInterceptor1107.p(), (double)networkPacketInterceptor1107.b(), (double)networkPacketInterceptor1107.m());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureChannelNegotiator389.a(customSystemException);
        }
        oQ2 = oQ2.B(0.002f, 0.002f, 0.002f).V(-d4, -d3, -d2);
        try {
            GraphicsBufferAllocator.V();
            this.r(oQ2, this.P.L());
            Ne.h.h(2.0f);
            this.x(oQ2, this.L.L());
            tl.R(true);
            GraphicsBufferAllocator.E();
            Ne.h.y(3553);
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureChannelNegotiator389.a(customSystemException);
        }
        Ne.h.z(2848);
        CryptoContextNegotiator684.J();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == 'n' || c == 'c' || c == '\u00cf') {
                field = SecureChannelNegotiator389.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureChannelNegotiator389.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(long l, long l2) {
        int n = SecureChannelNegotiator389.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = SecureChannelNegotiator389.l[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureChannelNegotiator389.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureChannelNegotiator389.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureChannelNegotiator389.a(clazz3, string2, clazz2)) != null) {
                    SecureChannelNegotiator389.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureChannelNegotiator389.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureChannelNegotiator389.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureChannelNegotiator389.b(253753192435958L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureChannelNegotiator389.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecureChannelNegotiator389.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

