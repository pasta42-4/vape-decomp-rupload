/*
 * Decompiled with CFR 0.152.
 */
package com.security.session;

import a.KB;
import a._Y;
import a.a;
import a.it;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.cipher.CryptographicTransformer1102;
import com.security.keygen.CryptographicKeyGenerator;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationCalibrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.input.UserInputEventMapper;
import com.util.numeric.NumericFormattingUtility;
import com.util.reflection.ReflectionUtility;
import com.validation.core.ObjectValidator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicSessionManager199
extends ContextualExecutionFramework {
    private static final Object[] n;
    private static final long[] h;
    private boolean T;
    private final Random x;
    public final ColorPaletteManager O;
    public final NumericPrecisionTransformer e;
    public final NumericPrecisionTransformer F;
    public final AuthenticationStateTracker r;
    private static final Map m;
    public final ReflectionUtility v;
    public final AuthenticationStateTracker R;
    private final NumericFormattingUtility N;
    private boolean d;
    private static final Integer[] l;
    private static final long b;
    private final NetworkConfigManager t;
    public final AuthenticationStateTracker V;
    public final AuthenticationStateTracker Z;
    private static final String[] o;
    private int j;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ae" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public CryptographicSessionManager199() {
        long l = b ^ 0x2DF39B920224L;
        super(a.cs((int)CryptographicSessionManager199.a("d", (int)31967, (long)(0x751C4372F1A0AA66L ^ l))), (int)CryptographicSessionManager199.a("d", (int)32701, (long)(0x4D090091951E2916L ^ l)), RecursiveNodeGraph.X, "");
        this.v = ReflectionUtility.L(this);
        this.N = NumericFormattingUtility.K(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)16747, (long)(0x56AA1ADBC50017C1L ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)4566, (long)(0x29E0502D106D476AL ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)23472, (long)(0x50593F57EC108D0FL ^ l)), (long)4984438658809506553L, (long)l)), -20.0, 0.0, 0.0, 20.0, 0.1, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)15280, (long)(0x7E051A6EA1FFED00L ^ l)), (long)4984438658809506553L, (long)l)));
        this.V = AuthenticationStateTracker.w(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)18231, (long)(0x25390AF773B69181L ^ l)), (long)4984438658809506553L, (long)l)), false);
        this.r = AuthenticationStateTracker.R(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)18289, (long)(0x281D379FD9D111C0L ^ l)), (long)4984438658809506553L, (long)l)), false, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)29439, (long)(0x7E7BD954A238A448L ^ l)), (long)4984438658809506553L, (long)l)));
        this.R = AuthenticationStateTracker.R(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)9252, (long)(0x15C77E0F70AA729EL ^ l)), (long)4984438658809506553L, (long)l)), false, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)13330, (long)(0x6589F6F55C4062A1L ^ l)), (long)4984438658809506553L, (long)l)));
        this.F = NumericPrecisionTransformer.D(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)26193, (long)(0x335D210E106930FDL ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)25258, (long)(0x65C7F8D7A912B41EL ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)16671, (long)(0x1AB676949CC817AAL ^ l)), (long)4984438658809506553L, (long)l)), 0.0, 0.0, 100.0, 1.0, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)28597, (long)(0xC4C2F67A8AA391BL ^ l)), (long)4984438658809506553L, (long)l)));
        this.e = NumericPrecisionTransformer.D(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)16100, (long)(0x6BF72CE85436E85CL ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)16255, (long)(0x45D497F17221E9C1L ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)8000, (long)(0x6F5A2DB14004C9FBL ^ l)), (long)4984438658809506553L, (long)l)), 0.0, 0.0, 100.0, 1.0, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)15755, (long)(0x5796D69953A06B26L ^ l)), (long)4984438658809506553L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)19150, (long)(0x2527173B3D989C7CL ^ l)), (long)4984438658809506553L, (long)l)), false, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)23988, (long)(0x752F8FA8FB9D8B09L ^ l)), (long)4984438658809506553L, (long)l)));
        this.O = ColorPaletteManager.o(this, (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)16376, (long)(0x7FBBB01B31D36957L ^ l)), (long)4984438658809506553L, (long)l)), (String)((Object)CryptographicSessionManager199.c("\u00c6", (int)CryptographicSessionManager199.a("d", (int)27888, (long)(0x58679321B543BA58L ^ l)), (long)4984438658809506553L, (long)l)), ColorPaletteManager.U, Collections.emptyList());
        this.T = false;
        this.t = new NetworkConfigManager();
        this.x = new Random();
        this.d = false;
        this.j = 0;
        this.Z.l(this.O);
        this.N(this.v, this.N, this.V, this.r, this.R, this.F, this.e, this.Z, this.O);
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

    @DataExchangeProtocol2090
    public void b(UserInputEventMapper userInputEventMapper) {
        block10: {
            boolean bl;
            block14: {
                block13: {
                    block12: {
                        block11: {
                            try {
                                if (!userInputEventMapper.getButtonState() || userInputEventMapper.getButton() != 0) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager199.a(customSystemException);
                            }
                            this.t.m();
                            int n = (int)((Double)this.e.J()).doubleValue();
                            try {
                                try {
                                    if (n <= 0 || this.x.nextInt(100) >= n) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSessionManager199.a(customSystemException);
                                }
                                this.j = 2 + this.x.nextInt(2);
                                break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager199.a(customSystemException);
                            }
                        }
                        this.j = 0;
                    }
                    int n = (int)((Double)this.F.J()).doubleValue();
                    try {
                        try {
                            CryptographicSessionManager199 cryptographicSessionManager199 = this;
                            if (n <= 0 || this.x.nextInt(100) >= n) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager199.a(customSystemException);
                        }
                        bl = true;
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager199.a(customSystemException);
                    }
                }
                bl = false;
            }
            cryptographicSessionManager199.d = bl;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void X(KB kB) {
        float f;
        block22: {
            try {
                if (kB.getThePlayer().Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            try {
                if (!this.t.m(50L)) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            try {
                if (this.T) {
                    CryptographicTransformer1102.B(0, false);
                    this.T = false;
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            try {
                if (!this.l()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            f = (float)(-this.N.l());
            f += (float)this.j;
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
            try {
                if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.q().equals(ObjectValidator.B())) break block22;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            CryptographicTransformer cryptographicTransformer = networkPacketInterceptor1107.l();
            try {
                try {
                    if (!this.A(cryptographicTransformer) || !it.y(f)) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager199.a(customSystemException);
                }
                CryptographicTransformer1102.t(0, false);
                this.T = true;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
        }
        try {
            try {
                if (!this.d || !it.H(f, true)) return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            CryptographicTransformer1102.t(0, false);
            this.T = true;
            this.d = false;
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager199.a(customSystemException);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean l() {
        ObjectLifecycleTracker objectLifecycleTracker;
        block22: {
            block20: {
                try {
                    try {
                        if (!ApplicationLifecycleManager.X().r() && ClusterNodeRegistry1151.W().S().D()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager199.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager199.a(customSystemException);
                }
            }
            try {
                block21: {
                    try {
                        try {
                            if (!ClusterNodeRegistry1151.W().S().D()) break block21;
                            if (!this.V.s().booleanValue()) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager199.a(customSystemException);
                        }
                        if (DynamicContextBroker.e()) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager199.a(customSystemException);
                    }
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
        }
        if (this.Z.s().booleanValue()) {
            objectLifecycleTracker = ApplicationLifecycleManager.U().K();
            try {
                if (!this.O.b((LightweightExecutionContext)objectLifecycleTracker, false)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
        }
        if (this.r.s().booleanValue() && !((CryptographicTransformer)(objectLifecycleTracker = ApplicationLifecycleManager.U())).j()) {
            boolean bl;
            double d2 = ((CryptographicTransformer)objectLifecycleTracker).V() - ((CryptographicTransformer)objectLifecycleTracker).q();
            try {
                bl = d2 < 0.0;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
            boolean bl2 = bl;
            try {
                if (!bl2) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager199.a(customSystemException);
            }
        }
        return true;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n4] != null) {
            return n4;
        }
        Object object = CryptographicSessionManager199.n[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 48;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 22;
                break;
            }
            case 3: {
                n3 = 18;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 17;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 54;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 35;
                break;
            }
            case 12: {
                n3 = 53;
                break;
            }
            case 13: {
                n3 = 49;
                break;
            }
            case 14: {
                n3 = 63;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 12;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 18: {
                n3 = 36;
                break;
            }
            case 19: {
                n3 = 32;
                break;
            }
            case 20: {
                n3 = 14;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 2;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 40;
                break;
            }
            case 26: {
                n3 = 41;
                break;
            }
            case 27: {
                n3 = 30;
                break;
            }
            case 28: {
                n3 = 42;
                break;
            }
            case 29: {
                n3 = 28;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 9;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 6;
                break;
            }
            case 37: {
                n3 = 29;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 33;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 60;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 23;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 31;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 51;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 3;
                break;
            }
            case 62: {
                n3 = 39;
                break;
            }
            default: {
                n3 = 5;
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
        CryptographicSessionManager199.o[n4] = new String(cArray);
        return n4;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicSessionManager199.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicSessionManager199.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "_8i";
        objectArray[1] = Integer.TYPE;
        CryptographicSessionManager199.o[1] = "java/lang/Integer";
        objectArray[2] = "\u0015+^\u000es#\u001e$OA\u000e;\r#F\b";
        objectArray[3] = "4Bb\u000fy4?Ms@\u0018:4Fw\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0001#{;IH\u0006'lIRU8q,%\b\u0016\u0000:u2E.\u0002qy&E\u0015W(r$9";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSessionManager199.b = MultiContainerRegistry.a(5451451014905817582L, -6434023568009931839L, MethodHandles.lookup().lookupClass()).a(127916871514374L);
                CryptographicSessionManager199.n = new Object[5];
                CryptographicSessionManager199.o = new String[5];
                CryptographicSessionManager199.a();
                CryptographicSessionManager199.m = new HashMap<K, V>(13);
                var0 = CryptographicSessionManager199.b ^ 78702829750766L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "\u0085\u00ce\u0092M\n\u0087\u00ab\u00c6Rj\u00072)\u00e1J\u00c7@\u00013\u00f6\u00e3\u00b8\u0097\u00f7'+\u00c70\u00a4\u00del\u0001j\u00fd{\u00ba\u0085\u00c3*\u0091\u007f\u00f8\u00b6|\u00c3Ims\u00be1\u0016\u0093\u009d%\u00f0\u00b63\u00a36\u00eaj\u001f\u0010\u0088(z{\u00fd\u00e7MUW\u00a9E[$$8duW\u00d0<\u0014\u00a4\u00a0\u009f$\r\u00c6e\u00ef6K\t\u001c\u00bb\u009a\u009e\u00ae\u00a9\u0002;\u00ba\u00ce\u0080\u000b+&\u009cF'e\u00a0k%pK\u00fbZ\u00f6\u00e2k\u00b5\u00f1\u009f\u000et\u00e3\\#\u0016\u00e4~\u00d5\u0011\u00ff\u0090\u00c5Ed\u00d4\u0098y\u00c3@Wqe\u0010\u0092\\\u00f6)\t\u00b5\u00f6\u001f\u00b5\u0095\u00a14\u00c9/\u001a\u00a3\u0089\u0095";
                var7_6 = "\u0085\u00ce\u0092M\n\u0087\u00ab\u00c6Rj\u00072)\u00e1J\u00c7@\u00013\u00f6\u00e3\u00b8\u0097\u00f7'+\u00c70\u00a4\u00del\u0001j\u00fd{\u00ba\u0085\u00c3*\u0091\u007f\u00f8\u00b6|\u00c3Ims\u00be1\u0016\u0093\u009d%\u00f0\u00b63\u00a36\u00eaj\u001f\u0010\u0088(z{\u00fd\u00e7MUW\u00a9E[$$8duW\u00d0<\u0014\u00a4\u00a0\u009f$\r\u00c6e\u00ef6K\t\u001c\u00bb\u009a\u009e\u00ae\u00a9\u0002;\u00ba\u00ce\u0080\u000b+&\u009cF'e\u00a0k%pK\u00fbZ\u00f6\u00e2k\u00b5\u00f1\u009f\u000et\u00e3\\#\u0016\u00e4~\u00d5\u0011\u00ff\u0090\u00c5Ed\u00d4\u0098y\u00c3@Wqe\u0010\u0092\\\u00f6)\t\u00b5\u00f6\u001f\u00b5\u0095\u00a14\u00c9/\u001a\u00a3\u0089\u0095".length();
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
                    var6_5 = "\u00e8\u00e8q\u00d5'\u0005\u00fa\u00e2\u00e0baS\u00c6a\u00a4y";
                    var7_6 = "\u00e8\u00e8q\u00d5'\u0005\u00fa\u00e2\u00e0baS\u00c6a\u00a4y".length();
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
        CryptographicSessionManager199.h = var8_3;
        CryptographicSessionManager199.l = new Integer[23];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1393;
        if (CryptographicSessionManager199.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ae", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSessionManager199.l[n2] = n3;
        }
        return CryptographicSessionManager199.l[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(long l, long l2) {
        int n = CryptographicSessionManager199.a(l, l2);
        Object object = CryptographicSessionManager199.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicSessionManager199.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicSessionManager199.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicSessionManager199.a(clazz3, string2, clazz2)) != null) {
                    CryptographicSessionManager199.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicSessionManager199.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicSessionManager199.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicSessionManager199.b(254066426686940L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == '\u00cf' || c == '\u00ee' || c == '\u00e2') {
                field = CryptographicSessionManager199.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicSessionManager199.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean A(CryptographicTransformer cryptographicTransformer) {
        block11: {
            if (this.R.s().booleanValue()) {
                boolean bl;
                block10: {
                    bl = true;
                    CryptographicKeyGenerator cryptographicKeyGenerator = TemporalMetadataResolver.h.U().K(CryptographicKeyGenerator.class);
                    try {
                        try {
                            if (cryptographicKeyGenerator == null || !cryptographicKeyGenerator.Z()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager199.a(customSystemException);
                        }
                        if (!cryptographicKeyGenerator.z()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager199.a(customSystemException);
                    }
                    bl = false;
                }
                try {
                    if (!bl || !cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager199.a(customSystemException);
                }
                DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(cryptographicTransformer.M());
                try {
                    if (_Y.h(dataTransmissionManager2384)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager199.a(customSystemException);
                }
            }
        }
        return this.v.u(cryptographicTransformer);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ae" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicSessionManager199.a(l, l2);
            object = CryptographicSessionManager199.n[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicSessionManager199.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicSessionManager199.a(l, l2);
        Object object = CryptographicSessionManager199.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicSessionManager199.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicSessionManager199.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicSessionManager199.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicSessionManager199.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicSessionManager199.b(254066426686940L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicSessionManager199.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicSessionManager199.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicSessionManager199.b(254066426686940L, 0L);
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
        MethodHandle methodHandle = CryptographicSessionManager199.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicSessionManager199.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicSessionManager199.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSessionManager199.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSessionManager199.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicSessionManager199.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

