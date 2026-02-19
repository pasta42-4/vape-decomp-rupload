/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.security.token;

import a.Ne;
import a.a;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.TransmissionStateManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.resource.management.ResourceAllocationCoordinator1929;
import com.runtime.context.ContextualExecutionFramework;
import com.security.negotiation.CryptoContextNegotiator684;
import com.simulation.physics.PhysicalSimulationController;
import com.transaction.core.TransactionOrchestrator1565;
import com.ui.rendering.UIRenderingController1597;
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

public class AsynchronousTokenGenerator
extends ContextualExecutionFramework {
    private final AdaptiveRenderingEngine l;
    private final AuthenticationStateTracker X;
    private final AuthenticationStateTracker r;
    private final AdaptiveRenderingEngine j;
    private final AdaptiveRenderingEngine B;
    private final AdaptiveRenderingEngine K;
    private final AuthenticationStateTracker N;
    private final AdaptiveRenderingEngine V;
    private final AdaptiveRenderingEngine n;
    private final AuthenticationStateTracker w;
    private static final long[] d;
    private static final Map h;
    private final AuthenticationStateTracker x;
    private static final Object[] v;
    private final AuthenticationStateTracker o;
    private static final long b;
    private final AdaptiveRenderingEngine Y;
    private static final String[] A;
    private final NumericComputationEngine1131 P;
    private final AuthenticationStateTracker z;
    private static final Integer[] e;
    private final AuthenticationStateTracker T;
    private final AuthenticationStateTracker m;
    private final AdaptiveRenderingEngine t;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousTokenGenerator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousTokenGenerator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousTokenGenerator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public AsynchronousTokenGenerator() {
        long l = b ^ 0x2CAC2BD295AL;
        super(a.cs((int)AsynchronousTokenGenerator.a("l", (int)18283, (long)(0x49CBEF1FCC86D91BL ^ l))), (int)AsynchronousTokenGenerator.a("l", (int)12853, (long)(0x7E3CE35BA30DAC5AL ^ l)), RecursiveNodeGraph.z);
        this.x = AuthenticationStateTracker.R(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)7356, (long)(0x222517041C6E02D4L ^ l)), (long)904753326976304929L, (long)l)), true, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)23736, (long)(0x425DC4066D5542DDL ^ l)), (long)904753326976304929L, (long)l)));
        this.T = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)12787, (long)(0x6F4B73C1F9C2F93L ^ l)), (long)904753326976304929L, (long)l)), true);
        this.w = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)24717, (long)(0x4AC6655302E7EECL ^ l)), (long)904753326976304929L, (long)l)), true);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)11439, (long)(0x7E613AF6625032DCL ^ l)), (long)904753326976304929L, (long)l)), false);
        this.m = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)28720, (long)(0x1F65CD6383FE6E5EL ^ l)), (long)904753326976304929L, (long)l)), false);
        this.o = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)6792, (long)(0x16AF0A5C429004F9L ^ l)), (long)904753326976304929L, (long)l)), false);
        this.z = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)24601, (long)(0x7D195402E456FE7AL ^ l)), (long)904753326976304929L, (long)l)), false);
        this.N = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)2428, (long)(0x6E4D0A85BA4F171BL ^ l)), (long)904753326976304929L, (long)l)), false);
        this.X = AuthenticationStateTracker.w(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)10816, (long)(0x5BDE9751D92E3432L ^ l)), (long)904753326976304929L, (long)l)), false);
        this.l = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)30515, (long)(0x478B9EEEDFCF6958L ^ l)), (long)904753326976304929L, (long)l)), new Color(1, 255, 146, 100));
        this.B = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)5970, (long)(0x23222D6690CD0938L ^ l)), (long)904753326976304929L, (long)l)), new Color(255, 0, 0, 100));
        this.j = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)25553, (long)(0x13570CD91D467DB7L ^ l)), (long)904753326976304929L, (long)l)), new Color(126, 21, 156, 100));
        this.V = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)16178, (long)(0x41521E306A15A15EL ^ l)), (long)904753326976304929L, (long)l)), new Color(138, 138, 138, 255));
        this.K = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)10226, (long)(0x1B86E692EC5FB990L ^ l)), (long)904753326976304929L, (long)l)), new Color(90, 90, 90, 255));
        this.n = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)26016, (long)(0x549CCFD356F4FBC4L ^ l)), (long)904753326976304929L, (long)l)), new Color(1, 20, 200, 100));
        this.Y = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)12373, (long)(0x250D54A7068DAE3CL ^ l)), (long)904753326976304929L, (long)l)), new Color(70, 200, 200, 100));
        this.t = AdaptiveRenderingEngine.C(this, (String)((Object)AsynchronousTokenGenerator.c("B", (int)AsynchronousTokenGenerator.a("l", (int)26053, (long)(0x38935EBFDC377BA8L ^ l)), (long)904753326976304929L, (long)l)), new Color(255, 255, 255, 100));
        this.T.l(this.l);
        this.w.l(this.B);
        this.r.l(this.j);
        this.m.l(this.V);
        this.o.l(this.K);
        this.z.l(this.n);
        this.N.l(this.Y);
        this.X.l(this.t);
        this.N(this.x, this.T, this.l, this.w, this.B, this.r, this.j, this.m, this.V, this.o, this.K, this.z, this.n, this.N, this.Y);
        this.e(this.X, GameVersionEnumerator.MC_1_12_2.R());
        this.e(this.t, GameVersionEnumerator.MC_1_12_2.R());
        this.P = ApplicationLifecycleManager.r();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            int n = AsynchronousTokenGenerator.a(l, l2);
            object = v[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousTokenGenerator.v[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = v;
        v[0] = ".\u007fO";
        objectArray[1] = Integer.TYPE;
        AsynchronousTokenGenerator.A[1] = "java/lang/Integer";
        objectArray[2] = "Q.F\f\u0019\u000bZ!WCd\u0013I&^\n";
        objectArray[3] = ".y2F>\u001b%v#\t_\u0015.}'S";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "'$&\u0013\u007f\u001ea\"npr[\u0018|.\u000f`Nuu/\u0015w !< \u001csQd9%\u0000\u0019";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousTokenGenerator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = AsynchronousTokenGenerator.a(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousTokenGenerator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousTokenGenerator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousTokenGenerator.a(clazz3, string2, clazz2)) != null) {
                    AsynchronousTokenGenerator.v[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousTokenGenerator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousTokenGenerator.v[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousTokenGenerator.b(235855076445699L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = AsynchronousTokenGenerator.a(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousTokenGenerator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousTokenGenerator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousTokenGenerator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousTokenGenerator.v[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousTokenGenerator.b(235855076445699L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousTokenGenerator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousTokenGenerator.v[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousTokenGenerator.b(235855076445699L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x12EE;
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
                throw new RuntimeException("a/AU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousTokenGenerator.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n4] != null) {
            return n4;
        }
        Object object = v[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 27;
                break;
            }
            case 1: {
                n3 = 61;
                break;
            }
            case 2: {
                n3 = 22;
                break;
            }
            case 3: {
                n3 = 29;
                break;
            }
            case 4: {
                n3 = 24;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 26;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 51;
                break;
            }
            case 9: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 2;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 9;
                break;
            }
            case 15: {
                n3 = 46;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 15;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 35;
                break;
            }
            case 20: {
                n3 = 52;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 10;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 44;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 36;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 34;
                break;
            }
            case 32: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 13;
                break;
            }
            case 36: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 30;
                break;
            }
            case 38: {
                n3 = 56;
                break;
            }
            case 39: {
                n3 = 54;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 57;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 19;
                break;
            }
            case 46: {
                n3 = 39;
                break;
            }
            case 47: {
                n3 = 48;
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
                n3 = 25;
                break;
            }
            case 51: {
                n3 = 49;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 12;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 23;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 45;
                break;
            }
            case 62: {
                n3 = 59;
                break;
            }
            default: {
                n3 = 32;
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
        AsynchronousTokenGenerator.A[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void f(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        CryptoContextNegotiator684.Y();
        ApplicationLifecycleManager.U().H(1.0);
        GraphicsBufferAllocator.V();
        boolean bl = Ne.h.k(3042);
        try {
            if (!bl) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTokenGenerator.a(customSystemException);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        Ne.h.E(false);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        for (Object e : ApplicationLifecycleManager.c().v()) {
            Object object;
            TransmissionStateManager transmissionStateManager;
            Color color;
            block39: {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                block40: {
                                    block37: {
                                        int n;
                                        block38: {
                                            color = null;
                                            transmissionStateManager = null;
                                            try {
                                                try {
                                                    if (!this.T.s().booleanValue() && !this.w.s().booleanValue()) break block37;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AsynchronousTokenGenerator.a(customSystemException);
                                                }
                                                if (!ReflectionMetadataResolver.y.isInstance(e)) break block37;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousTokenGenerator.a(customSystemException);
                                            }
                                            object = new TransactionOrchestrator1565(e);
                                            n = ((TransactionOrchestrator1565)object).U();
                                            try {
                                                if (!this.T.s().booleanValue() || n != 0) break block38;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousTokenGenerator.a(customSystemException);
                                            }
                                            color = this.l.L();
                                            transmissionStateManager = object;
                                        }
                                        try {
                                            if (!this.w.s().booleanValue() || n != 1) break block39;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AsynchronousTokenGenerator.a(customSystemException);
                                        }
                                        color = this.B.L();
                                        transmissionStateManager = object;
                                        break block39;
                                    }
                                    try {
                                        if (!this.r.s().booleanValue() || !ReflectionMetadataResolver.Ys.isInstance(e)) break block40;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AsynchronousTokenGenerator.a(customSystemException);
                                    }
                                    color = this.j.L();
                                    transmissionStateManager = new ResourceAllocationCoordinator1929(e);
                                    break block39;
                                }
                                try {
                                    if (!this.m.s().booleanValue() || !ReflectionMetadataResolver.U3.isInstance(e)) break block41;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousTokenGenerator.a(customSystemException);
                                }
                                color = this.V.L();
                                break block39;
                            }
                            try {
                                if (!this.o.s().booleanValue() || !ReflectionMetadataResolver.Ek.isInstance(e)) break block42;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTokenGenerator.a(customSystemException);
                            }
                            color = this.K.L();
                            break block39;
                        }
                        try {
                            if (!this.N.s().booleanValue() || !ReflectionMetadataResolver.Pd.equals(e.getClass())) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTokenGenerator.a(customSystemException);
                        }
                        color = this.Y.L();
                        break block39;
                    }
                    try {
                        if (!this.z.s().booleanValue() || !ReflectionMetadataResolver.Ye.equals(e.getClass())) break block44;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTokenGenerator.a(customSystemException);
                    }
                    color = this.n.L();
                    break block39;
                }
                try {
                    try {
                        if (GeometryCalculator.C() < 23 || !this.X.s().booleanValue()) break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTokenGenerator.a(customSystemException);
                    }
                    if (!ReflectionMetadataResolver.Eu.isInstance(e)) break block39;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTokenGenerator.a(customSystemException);
                }
                color = this.t.L();
            }
            try {
                if (color == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTokenGenerator.a(customSystemException);
            }
            if (transmissionStateManager == null) {
                transmissionStateManager = new TransmissionStateManager(e);
            }
            color = new Color(((Color)color).getRed(), ((Color)color).getGreen(), ((Color)color).getBlue(), ((Color)color).getAlpha());
            if (transmissionStateManager instanceof TransactionOrchestrator1565) {
                TransactionOrchestrator1565 transactionOrchestrator1565 = (TransactionOrchestrator1565)transmissionStateManager;
                object = this.x.s().booleanValue() ? new PhysicalSimulationController(transmissionStateManager.B(), transmissionStateManager.o(), transmissionStateManager.t(), -1, color, transactionOrchestrator1565.D()) : new UIRenderingController1597(transmissionStateManager.B(), transmissionStateManager.o(), transmissionStateManager.t(), -1, color);
            } else if (transmissionStateManager instanceof ResourceAllocationCoordinator1929) {
                TransmissionStateManager transmissionStateManager2 = transmissionStateManager;
                object = new PhysicalSimulationController(transmissionStateManager.B(), transmissionStateManager.o(), transmissionStateManager.t(), -1, color, ((ResourceAllocationCoordinator1929)transmissionStateManager2).W());
            } else {
                object = new UIRenderingController1597(transmissionStateManager.B(), transmissionStateManager.o(), transmissionStateManager.t(), -1, color);
            }
            CryptoContextNegotiator684.s(d2, d3, d4, (UIRenderingController1597)object);
        }
        try {
            Ne.h.E(true);
            Ne.h.y(2929);
            Ne.h.y(3553);
            Ne.h.z(2848);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTokenGenerator.a(customSystemException);
        }
        GraphicsBufferAllocator.E();
        ApplicationLifecycleManager.U().F(1.0);
        CryptoContextNegotiator684.J();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousTokenGenerator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousTokenGenerator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
                AsynchronousTokenGenerator.b = MultiContainerRegistry.a(4765882834186103974L, -4710708006073267413L, MethodHandles.lookup().lookupClass()).a(220502159038023L);
                AsynchronousTokenGenerator.v = new Object[5];
                AsynchronousTokenGenerator.A = new String[5];
                AsynchronousTokenGenerator.a();
                AsynchronousTokenGenerator.h = new HashMap<K, V>(13);
                var0 = AsynchronousTokenGenerator.b ^ 121551589805147L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "*\u00013\u0019\u00ecPv\u00e2\u0090\u00a8.\u00bb\u00b5\u0002ai\u0091\u00e3c`\u009e\u00cd\u00e3\u00a1\u00bc\u00b7\u008f/\u00bc\u00bb%%\u00c6#s\u00a0\u000b5\u00df\u00c2\u009fL\u0010\u00b7\u0098\u00b2\u0007\u0084i\u0002\u00fbT1\u001c\u00c6\u00e8\u00de\u000f\u008f\u00ee\u0094\u00f4n\u00cdy\u00feV]\u0002%b\u00e1A\u00ae\u00c8]N\u00f4\u001f[S\u00e4\u00d5.\u00da1\u00b6\u00bc \u00b8M*\u00b0\u0092d\u00fd\u00ed|w\u0013\u00dc\"\u00dd\u0016\u00a8\u00da?m;\u00a0\u00be\u00ff2\u00b2\u001f\u00cbYY\u0001\u00b9\u00fcXY\u009e\u0094N\u009b\u0083\u00aa7\u0091\u0001a\u0098k\u00d6\u009c/X\r\u00b3\u00a9+\u00e0";
                var7_6 = "*\u00013\u0019\u00ecPv\u00e2\u0090\u00a8.\u00bb\u00b5\u0002ai\u0091\u00e3c`\u009e\u00cd\u00e3\u00a1\u00bc\u00b7\u008f/\u00bc\u00bb%%\u00c6#s\u00a0\u000b5\u00df\u00c2\u009fL\u0010\u00b7\u0098\u00b2\u0007\u0084i\u0002\u00fbT1\u001c\u00c6\u00e8\u00de\u000f\u008f\u00ee\u0094\u00f4n\u00cdy\u00feV]\u0002%b\u00e1A\u00ae\u00c8]N\u00f4\u001f[S\u00e4\u00d5.\u00da1\u00b6\u00bc \u00b8M*\u00b0\u0092d\u00fd\u00ed|w\u0013\u00dc\"\u00dd\u0016\u00a8\u00da?m;\u00a0\u00be\u00ff2\u00b2\u001f\u00cbYY\u0001\u00b9\u00fcXY\u009e\u0094N\u009b\u0083\u00aa7\u0091\u0001a\u0098k\u00d6\u009c/X\r\u00b3\u00a9+\u00e0".length();
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
                    var6_5 = "|u\u00f0\u001bQ\u00b1j{\u000f\\\u00ac\u0088\u00d6\u0098\u00a6_";
                    var7_6 = "|u\u00f0\u001bQ\u00b1j{\u000f\\\u00ac\u0088\u00d6\u0098\u00a6_".length();
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
        AsynchronousTokenGenerator.d = var8_3;
        AsynchronousTokenGenerator.e = new Integer[20];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a2' || c == 't' || c == '\u00e9' || c == '\u00e4') {
                field = AsynchronousTokenGenerator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousTokenGenerator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'v' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousTokenGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousTokenGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

