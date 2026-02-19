/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.interaction.multimodal;

import a.Ne;
import a._Y;
import a.a;
import a.cA;
import com.app.event.processing.EventStreamProcessor2411;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.SystemConfigurationOrchestrator;
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

public class MultimodalInteractionManager
extends ContextualExecutionFramework {
    private static final Object[] j;
    private static final String[] l;
    private final NumericPrecisionTransformer T;
    private final Color Z;
    private final AuthenticationStateTracker V;
    private static final Map h;
    private static final long[] d;
    private static final long b;
    private static final Integer[] e;
    private final cA O;

    private static void a() {
        Object[] objectArray = j;
        j[0] = "S59";
        objectArray[1] = Integer.TYPE;
        MultimodalInteractionManager.l[1] = "java/lang/Integer";
        objectArray[2] = "OsZ.i~D|Ka\u0014fW{B(";
        objectArray[3] = "@5(Q\u001bCK:9\u001ezM@1=D";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "p.:h9l!},\u0011*-\u001bm*c+=wfhqAoyu0u+, x8\u0011";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == 'p' || c == 'c' || c == '\u00fb') {
                field = MultimodalInteractionManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultimodalInteractionManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n = MultimodalInteractionManager.a(l, l2);
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
                String string2 = MultimodalInteractionManager.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = MultimodalInteractionManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultimodalInteractionManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultimodalInteractionManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultimodalInteractionManager.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultimodalInteractionManager.b(222095417107780L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultimodalInteractionManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultimodalInteractionManager.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultimodalInteractionManager.b(222095417107780L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultimodalInteractionManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultimodalInteractionManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MultimodalInteractionManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultimodalInteractionManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public MultimodalInteractionManager() {
        long l = b ^ 0x259344871ACDL;
        super(a.cs((int)MultimodalInteractionManager.a("v", (int)5063, (long)(0x2C04C517D91BB181L ^ l))), (int)MultimodalInteractionManager.a("v", (int)412, (long)(0x71DBC75E18C7A3D0L ^ l)), RecursiveNodeGraph.z);
        this.Z = new Color(20, 20, 20, 128);
        this.T = NumericPrecisionTransformer.N(this, (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)31867, (long)(0x7D73203340FADE35L ^ l)), (long)-3840596573343468512L, (long)l)), (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)26907, (long)(0x1DF579A96E994B5BL ^ l)), (long)-3840596573343468512L, (long)l)), "", 0.1, 1.0, 1.5, 0.1);
        this.V = AuthenticationStateTracker.w(this, (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)6036, (long)(0x7B4836192FDF35CDL ^ l)), (long)-3840596573343468512L, (long)l)), true);
        this.O = cA.f(this, (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)26764, (long)(0x439E0C9575FCAC3L ^ l)), (long)-3840596573343468512L, (long)l)), (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)3976, (long)(0x1C6C43D7C3EB2DC1L ^ l)), (long)-3840596573343468512L, (long)l)), cA.m, new String[]{MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)14101, (long)(0x31FEDE2B75F99550L ^ l)), (long)-3840596573343468512L, (long)l), MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)14893, (long)(0x4A4A55004431869L ^ l)), (long)-3840596573343468512L, (long)l), MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)15840, (long)(0x17943E6BB1099FA1L ^ l)), (long)-3840596573343468512L, (long)l), MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)8966, (long)(0xF3D3576A2D6814BL ^ l)), (long)-3840596573343468512L, (long)l)});
        this.N(this.T, this.V, this.O);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (MultimodalInteractionManager.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 40;
                break;
            }
            case 1: {
                n3 = 36;
                break;
            }
            case 2: {
                n3 = 20;
                break;
            }
            case 3: {
                n3 = 30;
                break;
            }
            case 4: {
                n3 = 24;
                break;
            }
            case 5: {
                n3 = 58;
                break;
            }
            case 6: {
                n3 = 39;
                break;
            }
            case 7: {
                n3 = 42;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 51;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 16;
                break;
            }
            case 12: {
                n3 = 52;
                break;
            }
            case 13: {
                n3 = 59;
                break;
            }
            case 14: {
                n3 = 19;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 18;
                break;
            }
            case 19: {
                n3 = 2;
                break;
            }
            case 20: {
                n3 = 37;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 22: {
                n3 = 49;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 15;
                break;
            }
            case 25: {
                n3 = 7;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 56;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 12;
                break;
            }
            case 33: {
                n3 = 32;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 44;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 11;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 31;
                break;
            }
            case 45: {
                n3 = 1;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 62;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 63;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 14;
                break;
            }
            case 55: {
                n3 = 23;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 45;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 9;
                break;
            }
            default: {
                n3 = 48;
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
        MultimodalInteractionManager.l[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = MultimodalInteractionManager.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = MultimodalInteractionManager.l[n];
            int n2 = string.indexOf(8);
            Class clazz = MultimodalInteractionManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultimodalInteractionManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultimodalInteractionManager.a(clazz3, string2, clazz2)) != null) {
                    MultimodalInteractionManager.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultimodalInteractionManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultimodalInteractionManager.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultimodalInteractionManager.b(222095417107780L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68FB;
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
                throw new RuntimeException("a/A1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultimodalInteractionManager.e[n2] = n3;
        }
        return e[n2];
    }

    @DataExchangeProtocol2090
    public void i(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        long l = b ^ 0x70CABCEAF553L;
        boolean bl = GL11.glIsEnabled((int)3042);
        try {
            ApplicationLifecycleManager.U().H(1.0);
            CryptoContextNegotiator684.Y();
            if (!bl) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultimodalInteractionManager.a(customSystemException);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.y(2848);
        Ne.h.z(2929);
        GL11.glDepthMask((boolean)false);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw MultimodalInteractionManager.a(customSystemException);
        }
        DataTransformationEngine1209 dataTransformationEngine12092 = dataTransformationEngine1209;
        for (Object e : ApplicationLifecycleManager.c().v()) {
            try {
                if (!ReflectionMetadataResolver.V2.isInstance(e)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultimodalInteractionManager.a(customSystemException);
            }
            EventStreamProcessor2411 eventStreamProcessor2411 = new EventStreamProcessor2411(e);
            String string = eventStreamProcessor2411.j().a();
            try {
                if (!this.O.q(string, true)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultimodalInteractionManager.a(customSystemException);
            }
            String string2 = "";
            if (this.V.s().booleanValue()) {
                String string3 = DynamicContextBroker.u + (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)21416, (long)(0x1EB10B6EFB831E71L ^ l)), (long)2678833199826230206L, (long)l)) + DynamicContextBroker.u + (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)20710, (long)(0x7FB88103BED59D3BL ^ l)), (long)2678833199826230206L, (long)l)) + (int)systemConfigurationOrchestrator.w(eventStreamProcessor2411.B(), eventStreamProcessor2411.o(), eventStreamProcessor2411.t()) + DynamicContextBroker.u + (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)24329, (long)(0x5910EA64E54492DDL ^ l)), (long)2678833199826230206L, (long)l)) + DynamicContextBroker.u + (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)20144, (long)(0x4E77794C1A9D8365L ^ l)), (long)2678833199826230206L, (long)l));
                string2 = string2 + string3 + (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)20561, (long)(0x64E4472F862F1D87L ^ l)), (long)2678833199826230206L, (long)l));
            }
            string2 = string2 + string + (String)((Object)MultimodalInteractionManager.c("\u00d1", (int)MultimodalInteractionManager.a("v", (int)32484, (long)(0x7F1B4E7B52B13338L ^ l)), (long)2678833199826230206L, (long)l));
            CryptoContextNegotiator684.n(string2, (double)eventStreamProcessor2411.B() - d2 + 0.5, (double)eventStreamProcessor2411.o() - d3 - 1.0, (double)eventStreamProcessor2411.t() - d4 + 0.5, (Double)this.T.J(), _Y.m(systemConfigurationOrchestrator, eventStreamProcessor2411.B(), eventStreamProcessor2411.o(), eventStreamProcessor2411.t()), -1, this.Z, 1.4, dataTransformationEngine12092);
        }
        try {
            GL11.glDepthMask((boolean)true);
            Ne.h.y(2929);
            Ne.h.y(3553);
            Ne.h.z(2848);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultimodalInteractionManager.a(customSystemException);
        }
        Ne.h.X();
        ApplicationLifecycleManager.U().F(1.0);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultimodalInteractionManager.b = MultiContainerRegistry.a(2672924899650887775L, 5141986345865402805L, MethodHandles.lookup().lookupClass()).a(98009397821487L);
                MultimodalInteractionManager.j = new Object[5];
                MultimodalInteractionManager.l = new String[5];
                MultimodalInteractionManager.a();
                MultimodalInteractionManager.h = new HashMap<K, V>(13);
                var0 = MultimodalInteractionManager.b ^ 125506601963750L;
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "f\u0094\u007fi\u008f\u00aaK\u0001[\u00c5\u00b9\u0099\u00ec\u00c4_\u00b5\u0015\u0087R5\u001b2\u0096N\u0004\u0081\u0095\u00fe\u00fbM\u001c\u0095\u0000\u0086\u00daSL\u00ff\u00af\u00e1\u00e2)\u00bb\u00c9+9B\u0098\u00c3\u0006\u00eeJ\u0013\\\u00c0\u009faEd\u0087Q\u008f\u00bb\u00b5ej\u00c1a\u00b7\u00c5\u00f1}E\u000b\u00c2\u009c\u0012\u00cd\f\u00f7\u000b^\u008d\u00ff4om\u0013\u00b1\u00d7f\u00a95\u0097\u00a8\u0003\u00a4\u00d4/\u00ccAb\u001b7\u00c8#\u00e9\u000e\u00e4S\u009bl\u00a2Kh\u0087&\u00a02`";
                var7_6 = "f\u0094\u007fi\u008f\u00aaK\u0001[\u00c5\u00b9\u0099\u00ec\u00c4_\u00b5\u0015\u0087R5\u001b2\u0096N\u0004\u0081\u0095\u00fe\u00fbM\u001c\u0095\u0000\u0086\u00daSL\u00ff\u00af\u00e1\u00e2)\u00bb\u00c9+9B\u0098\u00c3\u0006\u00eeJ\u0013\\\u00c0\u009faEd\u0087Q\u008f\u00bb\u00b5ej\u00c1a\u00b7\u00c5\u00f1}E\u000b\u00c2\u009c\u0012\u00cd\f\u00f7\u000b^\u008d\u00ff4om\u0013\u00b1\u00d7f\u00a95\u0097\u00a8\u0003\u00a4\u00d4/\u00ccAb\u001b7\u00c8#\u00e9\u000e\u00e4S\u009bl\u00a2Kh\u0087&\u00a02`".length();
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
                    var6_5 = "\u00e6n\u00f3\u00c1\u001d\u00c4\u00a9\u00f6\u001f\u0098\u00b1\u009d\u0005\u001cb\u00b5";
                    var7_6 = "\u00e6n\u00f3\u00c1\u001d\u00c4\u00a9\u00f6\u001f\u0098\u00b1\u009d\u0005\u001cb\u00b5".length();
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
        MultimodalInteractionManager.d = var8_3;
        MultimodalInteractionManager.e = new Integer[17];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultimodalInteractionManager.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                MultimodalInteractionManager.j[n] = clazz = Class.forName(MultimodalInteractionManager.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultimodalInteractionManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultimodalInteractionManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultimodalInteractionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MultimodalInteractionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

