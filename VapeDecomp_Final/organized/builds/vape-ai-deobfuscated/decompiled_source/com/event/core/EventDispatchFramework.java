/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.event.core;

import a.C_;
import a.bE;
import com.app.ui.styling.VisualStyleCompositor;
import com.collections.management.MultiContainerRegistry;
import com.crypto.context.CipherContextFactory;
import com.data.compression.DataCompressionNegotiator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.cryptography.CryptographicContextManager153;
import com.simulation.core.ScenarioSimulationEngine;
import com.transaction.model.TransactionDescriptor;
import com.ui.events.UserInteractionEventDispatcher;
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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class EventDispatchFramework
extends ScenarioSimulationEngine {
    @Nullable
    private Consumer<TransactionDescriptor> CI;
    private static final double Cv = 10.0;
    private final VisualStyleCompositor b;
    private static final String[] jb;
    private final CryptographicSecurityManager396 CB;
    private static final long[] bb;
    private final VisualStyleCompositor C9;
    private static final long ab;
    private static final Object[] fb;
    private static final Map eb;
    private static final Integer[] db;
    @Nullable
    private TransactionDescriptor V;
    private final CryptographicContextManager153 CY;

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "7<]";
        objectArray[1] = Integer.TYPE;
        EventDispatchFramework.jb[1] = "java/lang/Integer";
        objectArray[2] = "m\r&\u0003lkf\u00027L\u0011su\u0005>\u0005";
        objectArray[3] = "lA\fx; gN\u001d7Z.lE\u0019m";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "S\u0014PPu\f\u001d\u0005Q0|\u001bl\\\u000b@w[\f[X]w`U\u001aHM(X\u0000\bZ\u0000\u0017";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = EventDispatchFramework.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventDispatchFramework.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventDispatchFramework.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventDispatchFramework.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventDispatchFramework.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventDispatchFramework.f(264443829735382L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventDispatchFramework.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventDispatchFramework.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventDispatchFramework.f(264443829735382L, 0L);
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

    public EventDispatchFramework(String string, @Nullable TransactionDescriptor transactionDescriptor, TransactionDescriptor ... transactionDescriptorArray) {
        long l = ab ^ 0x316724A0D31CL;
        super(new GraphicalRenderEngine1082(108.0, 135.0));
        this.b = new VisualStyleCompositor((String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)24367, (long)(0x14201A2615F7547EL ^ l)), (long)-188450359648540898L, (long)l)), 5.0f, 5.0f, Color.WHITE);
        this.C9 = new VisualStyleCompositor((String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)9802, (long)(0x73EB22CC3324AD1EL ^ l)), (long)-188450359648540898L, (long)l)), 2.0f, 2.0f, Color.GRAY);
        this.V = transactionDescriptor;
        this.L.d().f((String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)28181, (long)(0x1D4D4B75EB94E540L ^ l)), (long)-188450359648540898L, (long)l)));
        this.L.i(true);
        this.L.C(true);
        this.L.Q(EventDispatchFramework.M.Y);
        this.L.n(new bE(0.0, 10.0), new Object[0]);
        DataCompressionNegotiator dataCompressionNegotiator = new DataCompressionNegotiator(string, 1.0, Color.WHITE);
        dataCompressionNegotiator.q(true);
        dataCompressionNegotiator.w(12.0);
        dataCompressionNegotiator.T(this.L.w());
        this.L.n(dataCompressionNegotiator, new Object[0]);
        this.L.n(new bE(0.0, 4.0), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.L.w(), 104.0);
        graphicalRenderEngine1082.i(false);
        graphicalRenderEngine1082.Q(this.L.l());
        graphicalRenderEngine1082.C(true);
        graphicalRenderEngine1082.d().f((String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)21926, (long)(0x34D0EB4A6A625EFBL ^ l)), (long)-188450359648540898L, (long)l)));
        graphicalRenderEngine1082.i(graphicalRenderEngine1082.b());
        this.L.n(graphicalRenderEngine1082, EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)10257, (long)(0xCA458FFFEFAA343L ^ l)), (long)-188450359648540898L, (long)l));
        for (TransactionDescriptor transactionDescriptor2 : transactionDescriptorArray) {
            CipherContextFactory cipherContextFactory = new CipherContextFactory(transactionDescriptor2.T());
            cipherContextFactory.T(graphicalRenderEngine1082.w());
            cipherContextFactory.w(12.0);
            cipherContextFactory.C(() -> this.lambda$new$1(transactionDescriptor2));
            graphicalRenderEngine1082.n(cipherContextFactory, EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)8181, (long)(0x51387C314C5094A3L ^ l)), (long)-188450359648540898L, (long)l));
            graphicalRenderEngine1082.n(new bE(0.0, 2.0), EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)9011, (long)(0xAFEE8C77247A86FL ^ l)), (long)-188450359648540898L, (long)l));
        }
        this.CY = new CryptographicContextManager153((String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)4191, (long)(0x73AE943641B0FL ^ l)), (long)-188450359648540898L, (long)l)), 0.65f, EventDispatchFramework.M.w);
        this.CB = new CryptographicSecurityManager396("", (String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)3728, (long)(0x7C24E97595B585CEL ^ l)), (long)-188450359648540898L, (long)l)), 58.0, 0.65f, EventDispatchFramework.M.c, false);
        this.CB.T(this.CB.x());
        this.b.g((String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)25201, (long)(0x277D932E4D4CE922L ^ l)), (long)-188450359648540898L, (long)l)));
        this.o(this.CY, this.CB, this.b, this.C9);
        this.n(true);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private void lambda$null$0(TransactionDescriptor transactionDescriptor) {
        try {
            if (this.D != null) {
                GraphicalRenderingController.z(this.D);
                this.D = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchFramework.a(customSystemException);
        }
        this.V = transactionDescriptor;
        Consumer<TransactionDescriptor> consumer = this.CI;
        try {
            if (consumer != null) {
                consumer.accept(transactionDescriptor);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchFramework.a(customSystemException);
        }
    }

    @Nullable
    public TransactionDescriptor Q() {
        return this.V;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EventDispatchFramework.ab = MultiContainerRegistry.a(-3639403100166348907L, -4525946676348855126L, MethodHandles.lookup().lookupClass()).a(242309244193522L);
                EventDispatchFramework.fb = new Object[5];
                EventDispatchFramework.jb = new String[5];
                EventDispatchFramework.i();
                EventDispatchFramework.eb = new HashMap<K, V>(13);
                var0 = EventDispatchFramework.ab ^ 140022435651726L;
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
                var6_5 = "0\u00b2\u0005pA\u00f4F\u00b7e\u001a\u00da?\u00f64.\u00e8JH\u001d8\u00fa\u00c0m\u00a2.\u00ab\u0093Z\u00ff\u00b4\u001ek\f>\u0001\u00ca\u0082\\:\u0098\u009f\u000eP\u00fc\u00ab\u00da\u00dc\u00ea\u001f\t%\u0094u\u0015\n\u0003\u008f3\"%\u00a9N?\u00ae#\u00e6\u008d\u0002\u0005\u00f4f\u000fN\u0085*n\u00a5i\u00bc\u00ebC \u00c5\u0088\u00c3\u00c1w\u00b2";
                var7_6 = "0\u00b2\u0005pA\u00f4F\u00b7e\u001a\u00da?\u00f64.\u00e8JH\u001d8\u00fa\u00c0m\u00a2.\u00ab\u0093Z\u00ff\u00b4\u001ek\f>\u0001\u00ca\u0082\\:\u0098\u009f\u000eP\u00fc\u00ab\u00da\u00dc\u00ea\u001f\t%\u0094u\u0015\n\u0003\u008f3\"%\u00a9N?\u00ae#\u00e6\u008d\u0002\u0005\u00f4f\u000fN\u0085*n\u00a5i\u00bc\u00ebC \u00c5\u0088\u00c3\u00c1w\u00b2".length();
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
                    var6_5 = "0\u000f:\u0001:\u0002eu\u00d5\u00ba\u00ed\u00ae\u0085:\u0099\u0087";
                    var7_6 = "0\u000f:\u0001:\u0002eu\u00d5\u00ba\u00ed\u00ae\u0085:\u0099\u0087".length();
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
        EventDispatchFramework.bb = var8_3;
        EventDispatchFramework.db = new Integer[13];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7634;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventDispatchFramework.db[n2] = n3;
        }
        return db[n2];
    }

    @Override
    public void G() {
        double d2;
        VisualStyleCompositor visualStyleCompositor;
        String string;
        CryptographicSecurityManager396 cryptographicSecurityManager396;
        boolean bl;
        VisualStyleCompositor visualStyleCompositor2;
        try {
            this.CY.b(this.G());
            this.CY.M(this.W());
            visualStyleCompositor2 = this.b;
            bl = this.V == null;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchFramework.a(customSystemException);
        }
        try {
            visualStyleCompositor2.N(bl);
            this.b.b(this.CY.G() + this.CY.D() + 5.0);
            this.b.M(this.W() - 1.0);
            this.CB.b(this.CY.G() + this.CY.D() + 8.0);
            this.CB.M(this.W() + 2.0);
            cryptographicSecurityManager396 = this.CB;
            string = this.V != null ? this.V.T() : "";
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchFramework.a(customSystemException);
        }
        try {
            cryptographicSecurityManager396.d(string);
            visualStyleCompositor = this.C9;
            d2 = this.b.f() ? this.b.G() + this.b.w() + 4.0 : this.CB.G() + this.CB.u() + 2.0;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchFramework.a(customSystemException);
        }
        visualStyleCompositor.b(d2);
        this.C9.M(this.W() + 2.0);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EventDispatchFramework.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventDispatchFramework.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventDispatchFramework.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 0;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 41;
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
                n3 = 7;
                break;
            }
            case 7: {
                n3 = 53;
                break;
            }
            case 8: {
                n3 = 21;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 5;
                break;
            }
            case 14: {
                n3 = 1;
                break;
            }
            case 15: {
                n3 = 63;
                break;
            }
            case 16: {
                n3 = 57;
                break;
            }
            case 17: {
                n3 = 31;
                break;
            }
            case 18: {
                n3 = 17;
                break;
            }
            case 19: {
                n3 = 59;
                break;
            }
            case 20: {
                n3 = 36;
                break;
            }
            case 21: {
                n3 = 54;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 20;
                break;
            }
            case 25: {
                n3 = 8;
                break;
            }
            case 26: {
                n3 = 29;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 39;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 50;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 13;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 46;
                break;
            }
            case 37: {
                n3 = 61;
                break;
            }
            case 38: {
                n3 = 47;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 19;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 32;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 35;
                break;
            }
            case 51: {
                n3 = 4;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 6;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 42;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 58;
                break;
            }
            case 60: {
                n3 = 10;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 60;
                break;
            }
            default: {
                n3 = 12;
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
        EventDispatchFramework.jb[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$new$1(TransactionDescriptor transactionDescriptor) {
        long l = ab ^ 0x5E04110348D6L;
        C_.T(this.V(), (String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)24437, (long)(0x493239272FFC4FE8L ^ l)), (long)7397182206058773716L, (long)l)), (String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)10113, (long)(0x3524DC1211BCB714L ^ l)), (long)7397182206058773716L, (long)l)), (String)((Object)EventDispatchFramework.c("\u00eb", (int)EventDispatchFramework.b("o", (int)320, (long)(0x6255CC48E88111D1L ^ l)), (long)7397182206058773716L, (long)l)), () -> this.lambda$null$0(transactionDescriptor), 100.0, null, null);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventDispatchFramework.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                EventDispatchFramework.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Nullable
    public Consumer<TransactionDescriptor> a() {
        return this.CI;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventDispatchFramework.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        super.Z(userInteractionEventDispatcher);
    }

    public void K(@Nullable Consumer<TransactionDescriptor> consumer) {
        this.CI = consumer;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = EventDispatchFramework.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventDispatchFramework.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == 'j' || c == '\u00f8' || c == '\u00ca') {
                field = EventDispatchFramework.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventDispatchFramework.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l, long l2) {
        int n = EventDispatchFramework.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = EventDispatchFramework.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventDispatchFramework.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventDispatchFramework.c(clazz3, string2, clazz2)) != null) {
                    EventDispatchFramework.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventDispatchFramework.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventDispatchFramework.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventDispatchFramework.f(264443829735382L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EventDispatchFramework.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EventDispatchFramework.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

