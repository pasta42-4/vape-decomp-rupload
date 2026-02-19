/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.hQ;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.tasks.AsynchronousTaskExecutor1485;
import com.data.processing.CollectionFilterProcessor;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.security.authentication.SecurityTokenGenerator2467;
import com.security.crypto.CryptoContextManager1016;
import com.security.crypto.CryptographicSecurityManager396;
import com.system.configuration.ConfigurationManager;
import com.system.resilience.ResiliencyEventProcessor;
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

public class GraphicalRenderingController249
extends hQ {
    Color b;
    private static final String[] jb;
    private static final Object[] fb;
    private CollectionFilterProcessor Y;
    private Color Y4;
    private boolean YR;
    private static final Integer[] db;
    private final AsynchronousTaskExecutor1485 D;
    private static final long[] bb;
    private static final long ab;
    private int L;
    private static final Map eb;
    public CryptographicSecurityManager396 V;

    public void x(boolean bl) {
        this.YR = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean I() {
        return this.D.F();
    }

    public GraphicalRenderingController249(CollectionFilterProcessor collectionFilterProcessor, Color color) {
        long l = ab ^ 0x74684CA9A8C0L;
        this.Y4 = new Color(255, 255, 255, 100);
        this.L = (int)GraphicalRenderingController249.b("b", (int)30778, (long)(0x785A0FFD327D3B62L ^ l));
        this.b = color;
        this.Y = collectionFilterProcessor;
        this.N(new CryptoContextManager1016(this));
        this.D = new SecurityTokenGenerator2467(this, this.g());
        this.V = new CryptographicSecurityManager396(collectionFilterProcessor == null ? "" : collectionFilterProcessor.t(), (String)((Object)GraphicalRenderingController249.c("D", (int)GraphicalRenderingController249.b("b", (int)23869, (long)(0x766CC77F8AB39E61L ^ l)), (long)-956397128026639173L, (long)l)), "", 50.0, 0.8, color == null ? EventDispatchCoordinator1159.V() : color, false, false);
        this.o(this.V);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x31E3;
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
                throw new RuntimeException("a/h7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicalRenderingController249.db[n2] = n3;
        }
        return db[n2];
    }

    public void b(CollectionFilterProcessor collectionFilterProcessor) {
        this.Y = collectionFilterProcessor;
        this.D.H(collectionFilterProcessor);
        this.V.d(collectionFilterProcessor.t());
    }

    @Override
    public void G() {
        double d2;
        double d3;
        block67: {
            Object object;
            block66: {
                Color color;
                block65: {
                    int n;
                    int n2;
                    int n3;
                    int n4;
                    Color color2;
                    block64: {
                        block59: {
                            Color color3;
                            float f;
                            float f2;
                            long l;
                            block63: {
                                Color color4;
                                block62: {
                                    Object object2;
                                    double d4;
                                    double d5;
                                    double d6;
                                    double d7;
                                    int n5;
                                    int n6;
                                    int n7;
                                    int n8;
                                    Color color5;
                                    Color color6;
                                    block61: {
                                        block60: {
                                            block56: {
                                                CallSite callSite;
                                                float f3;
                                                float f4;
                                                Color color7;
                                                int n9;
                                                int n10;
                                                int n11;
                                                int n12;
                                                Color color8;
                                                Color color9;
                                                block58: {
                                                    block57: {
                                                        block54: {
                                                            block55: {
                                                                block53: {
                                                                    float f5;
                                                                    Color color10;
                                                                    block52: {
                                                                        block51: {
                                                                            Color color11;
                                                                            boolean bl;
                                                                            CryptographicSecurityManager396 cryptographicSecurityManager396;
                                                                            block50: {
                                                                                block49: {
                                                                                    l = ab ^ 0x27E29BA92671L;
                                                                                    try {
                                                                                        try {
                                                                                            cryptographicSecurityManager396 = this.V;
                                                                                            if (this.s() || this.D.F()) break block49;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw GraphicalRenderingController249.a(customSystemException);
                                                                                        }
                                                                                        bl = true;
                                                                                        break block50;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw GraphicalRenderingController249.a(customSystemException);
                                                                                    }
                                                                                }
                                                                                bl = false;
                                                                            }
                                                                            try {
                                                                                cryptographicSecurityManager396.N(bl);
                                                                                if (this.Y == null) {
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw GraphicalRenderingController249.a(customSystemException);
                                                                            }
                                                                            this.V.d(this.Y.t());
                                                                            d3 = this.V.K();
                                                                            d2 = this.V.u();
                                                                            try {
                                                                                color11 = this.b == null ? EventDispatchCoordinator1159.V() : this.b;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw GraphicalRenderingController249.a(customSystemException);
                                                                            }
                                                                            color4 = color11;
                                                                            try {
                                                                                if (!this.YR) break block51;
                                                                                color10 = GraphicalRenderingController249.M.I;
                                                                                break block52;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw GraphicalRenderingController249.a(customSystemException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            color10 = this.Y.v() ? color4 : GraphicalRenderingController249.M.w;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw GraphicalRenderingController249.a(customSystemException);
                                                                        }
                                                                    }
                                                                    Color color12 = color10;
                                                                    this.V.S(color12);
                                                                    this.getClass();
                                                                    f2 = 8.0f / 2.0f;
                                                                    try {
                                                                        f5 = this.w() != 10.0 ? (float)this.w() - 6.0f : f2;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalRenderingController249.a(customSystemException);
                                                                    }
                                                                    f = f5;
                                                                    try {
                                                                        if (!this.D.F()) break block53;
                                                                        this.Y(10.0);
                                                                        this.T(this.y());
                                                                        this.g((String)((Object)GraphicalRenderingController249.c("D", (int)GraphicalRenderingController249.b("b", (int)21851, (long)(0x525928CE841698B0L ^ l)), (long)8938346100381989386L, (long)l)));
                                                                        break block54;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalRenderingController249.a(customSystemException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (this.V.B() != null && !this.V.B().isEmpty()) break block55;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalRenderingController249.a(customSystemException);
                                                                    }
                                                                    this.Y(10.0);
                                                                    this.T(this.y());
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GraphicalRenderingController249.a(customSystemException);
                                                                }
                                                            }
                                                            object = GraphicalRenderingController249.c("D", (int)GraphicalRenderingController249.b("b", (int)31179, (long)(0x284A17072A85B421L ^ l)), (long)8938346100381989386L, (long)l);
                                                            ResiliencyEventProcessor resiliencyEventProcessor = this.V.E() != null ? new ResiliencyEventProcessor(this, (String)object, 0.7, GraphicalRenderingController249.M.w, false, this.V.E().y(), 0.8, GraphicalRenderingController249.M.n, true) : new ResiliencyEventProcessor(this, (String)object, 0.7, GraphicalRenderingController249.M.w, false);
                                                            this.i(resiliencyEventProcessor);
                                                        }
                                                        try {
                                                            try {
                                                                Color color13;
                                                                try {
                                                                    if (!this.s() && !this.D.F()) break block56;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GraphicalRenderingController249.a(customSystemException);
                                                                }
                                                                color9 = color13;
                                                                color8 = color13;
                                                                n12 = 255;
                                                                n11 = 255;
                                                                n10 = 255;
                                                                if (!this.Y.v()) break block57;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GraphicalRenderingController249.a(customSystemException);
                                                            }
                                                            n9 = this.L;
                                                            break block58;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GraphicalRenderingController249.a(customSystemException);
                                                        }
                                                    }
                                                    n9 = 17;
                                                }
                                                color9(n12, n11, n10, n9);
                                                object = color8;
                                                try {
                                                    ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), (Color)object);
                                                    color7 = this.Y.v() ? color4 : GraphicalRenderingController249.M.n;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalRenderingController249.a(customSystemException);
                                                }
                                                try {
                                                    f4 = (float)this.G() + f / 2.0f;
                                                    f3 = (float)this.W() + f2 / 2.0f;
                                                    callSite = this.D.F() ? GraphicalRenderingController249.c("D", (int)GraphicalRenderingController249.b("b", (int)31101, (long)(0x682C88A7F3C7B491L ^ l)), (long)8938346100381989386L, (long)l) : GraphicalRenderingController249.c("D", (int)GraphicalRenderingController249.b("b", (int)20497, (long)(0x78EE0E78C5B71DF9L ^ l)), (long)8938346100381989386L, (long)l);
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalRenderingController249.a(customSystemException);
                                                }
                                                StateTrackingCoordinator.B(color7, f4, f3, (String)((Object)callSite), f2 * 1.5f, f2 * 1.5f, false);
                                                return;
                                            }
                                            try {
                                                try {
                                                    Color color14;
                                                    try {
                                                        if (this.V.B() != null && !this.V.B().isEmpty()) break block59;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GraphicalRenderingController249.a(customSystemException);
                                                    }
                                                    color6 = color14;
                                                    color5 = color14;
                                                    n8 = 255;
                                                    n7 = 255;
                                                    n6 = 255;
                                                    if (!this.Y.v()) break block60;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalRenderingController249.a(customSystemException);
                                                }
                                                n5 = this.L;
                                                break block61;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalRenderingController249.a(customSystemException);
                                            }
                                        }
                                        n5 = 17;
                                    }
                                    color6(n8, n7, n6, n5);
                                    object = color5;
                                    try {
                                        d7 = this.G();
                                        d6 = this.W();
                                        d5 = this.w();
                                        d4 = this.b();
                                        object2 = this.YR ? GraphicalRenderingController249.M.i : object;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalRenderingController249.a(customSystemException);
                                    }
                                    try {
                                        ConfigurationManager.S(d7, d6, d5, d4, (Color)object2);
                                        if (!this.YR) break block62;
                                        color3 = GraphicalRenderingController249.M.o;
                                        break block63;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalRenderingController249.a(customSystemException);
                                    }
                                }
                                try {
                                    color3 = this.Y.v() ? color4 : GraphicalRenderingController249.M.w;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalRenderingController249.a(customSystemException);
                                }
                            }
                            StateTrackingCoordinator.B(color3, (float)this.G() + f / 2.0f, (float)this.W() + f2 / 2.0f, (String)((Object)GraphicalRenderingController249.c("D", (int)GraphicalRenderingController249.b("b", (int)21664, (long)(0x79F2B1AC4E13994FL ^ l)), (long)8938346100381989386L, (long)l)), f2 * 1.5f, f2 * 1.5f, false);
                            return;
                        }
                        try {
                            if (!this.YR) break block64;
                            color = GraphicalRenderingController249.M.i;
                            break block65;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController249.a(customSystemException);
                        }
                    }
                    try {
                        Color color15;
                        color2 = color15;
                        color = color15;
                        n4 = 255;
                        n3 = 255;
                        n2 = 255;
                        n = this.Y.v() ? this.L : 17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController249.a(customSystemException);
                    }
                    color2(n4, n3, n2, n);
                }
                object = color;
                try {
                    if (this.V.B().length() != 1) break block66;
                    this.Y(10.0);
                    this.T(this.y());
                    ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), (Color)object);
                    break block67;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController249.a(customSystemException);
                }
            }
            this.Y(d2 + 5.0);
            this.T(this.y());
            ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), (Color)object);
        }
        this.V.b(this.G() + this.w() / 2.0 - d2 / 2.0);
        this.V.M(this.W() + this.b() / 2.0 - d3 / 2.0);
    }

    public AsynchronousTaskExecutor1485 Q() {
        return this.D;
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
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 12;
                break;
            }
            case 4: {
                n3 = 2;
                break;
            }
            case 5: {
                n3 = 18;
                break;
            }
            case 6: {
                n3 = 36;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 27;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 32;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 43;
                break;
            }
            case 18: {
                n3 = 25;
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
                n3 = 9;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 23;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 29;
                break;
            }
            case 28: {
                n3 = 39;
                break;
            }
            case 29: {
                n3 = 63;
                break;
            }
            case 30: {
                n3 = 60;
                break;
            }
            case 31: {
                n3 = 13;
                break;
            }
            case 32: {
                n3 = 14;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 48;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 42;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 33;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 41;
                break;
            }
            case 44: {
                n3 = 3;
                break;
            }
            case 45: {
                n3 = 40;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 55;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 46;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 26;
                break;
            }
            case 56: {
                n3 = 47;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 0;
                break;
            }
            case 59: {
                n3 = 49;
                break;
            }
            case 60: {
                n3 = 19;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 53;
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
        GraphicalRenderingController249.jb[n4] = new String(cArray);
        return n4;
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/h7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double z() {
        return 10.0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicalRenderingController249.ab = MultiContainerRegistry.a(6408315738359186174L, -5836260700306288503L, MethodHandles.lookup().lookupClass()).a(119732878793093L);
                GraphicalRenderingController249.fb = new Object[5];
                GraphicalRenderingController249.jb = new String[5];
                GraphicalRenderingController249.i();
                GraphicalRenderingController249.eb = new HashMap<K, V>(13);
                var0 = GraphicalRenderingController249.ab ^ 101565189886189L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u0018#\u00a5\u00e4Gi\u00f76\u00a4!\u00d2\u00c0\u00a5\u00ef&x \u0091\u00ab\u00c2Am<5\u00a8\u00fb+\u009c\u00de\u00bcc\u00eeh>\u0081\t\u0012\u0085\"\u0017";
                var7_6 = "\u0018#\u00a5\u00e4Gi\u00f76\u00a4!\u00d2\u00c0\u00a5\u00ef&x \u0091\u00ab\u00c2Am<5\u00a8\u00fb+\u009c\u00de\u00bcc\u00eeh>\u0081\t\u0012\u0085\"\u0017".length();
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
                    var6_5 = "\u0017'\u0013\u0082\u0092/\u0084\u00d2\u00f8\u00fc\u00bb\u0015@H\u00fc\u00a5";
                    var7_6 = "\u0017'\u0013\u0082\u0092/\u0084\u00d2\u00f8\u00fc\u00bb\u0015@H\u00fc\u00a5".length();
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
        GraphicalRenderingController249.bb = var8_3;
        GraphicalRenderingController249.db = new Integer[7];
    }

    static AsynchronousTaskExecutor1485 I(GraphicalRenderingController249 graphicalRenderingController249) {
        return graphicalRenderingController249.D;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = GraphicalRenderingController249.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicalRenderingController249.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicalRenderingController249.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public boolean L() {
        return this.YR;
    }

    @Override
    public double e() {
        return 10.0;
    }

    private static Method h(long l, long l2) {
        int n = GraphicalRenderingController249.e(l, l2);
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
                clazz3 = GraphicalRenderingController249.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicalRenderingController249.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicalRenderingController249.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicalRenderingController249.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicalRenderingController249.f(279267011241158L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicalRenderingController249.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicalRenderingController249.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicalRenderingController249.f(279267011241158L, 0L);
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

    public CollectionFilterProcessor g() {
        return this.Y;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicalRenderingController249.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicalRenderingController249.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public GraphicalRenderingController249(CollectionFilterProcessor collectionFilterProcessor) {
        this(collectionFilterProcessor, null);
    }

    private static Field g(long l, long l2) {
        int n = GraphicalRenderingController249.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicalRenderingController249.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicalRenderingController249.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicalRenderingController249.c(clazz3, string2, clazz2)) != null) {
                    GraphicalRenderingController249.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicalRenderingController249.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicalRenderingController249.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicalRenderingController249.f(279267011241158L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void n(int n) {
        this.L = n;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e5' || c == 'Z' || c == '\u00dc' || c == 'x') {
                field = GraphicalRenderingController249.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicalRenderingController249.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicalRenderingController249.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "f\n~";
        objectArray[1] = Integer.TYPE;
        GraphicalRenderingController249.jb[1] = "java/lang/Integer";
        objectArray[2] = "Se\u0004x,\nXj\u00157Q\u0012Km\u001c~";
        objectArray[3] = "`HU,:}kGDc[s`L@9";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "na}\u0001:%<p{h04_op\u0001 s3mg\u0013[v\"u9\u000b)p<|ph";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/h7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicalRenderingController249.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicalRenderingController249.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicalRenderingController249.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(GraphicalRenderingController249.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

