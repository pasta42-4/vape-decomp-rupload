/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ne;
import a.tl;
import a.z6;
import com.app.data.transformation.DataTransformationEngine1165;
import com.collections.management.MultiContainerRegistry;
import com.compliance.management.ComplianceOrchestrator;
import com.config.mapping.ConfigParameterMapper;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.encoding.strategy.EncodingStrategyEnum;
import com.exception.system.CustomSystemException;
import com.financial.transactions.TransactionValidator1679;
import com.game.actions.ActionSequenceHandler;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.PacketTransmissionController;
import com.security.authentication.AuthenticationStateManager675;
import com.security.crypto.CryptographicSessionController;
import com.security.exchange.SecureDataExchanger793;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class E8
extends ObjectLifecycleTracker {
    private static final long a = MultiContainerRegistry.a(1041053405336210097L, -7052369025511403389L, MethodHandles.lookup().lookupClass()).a(62989934249912L);
    private static final long[] b;
    private static final Map d;
    private static final Integer[] c;
    private HashMap<String, Integer> o = new HashMap();

    public int K() {
        return this.I() / 2;
    }

    public void S() {
        E8.U.u().d8.K(this.H);
    }

    public void U(DataTransformationEngine1209 dataTransformationEngine1209, AuthenticationStateManager675 authenticationStateManager675, float f, float f2, int n) {
        ConfigParameterMapper.R(E8.U.u().d8, this.H, dataTransformationEngine1209.M(), authenticationStateManager675.M(), f, f2, n);
    }

    public int V(String string, float f, float f2, int n, boolean bl, ActionSequenceHandler actionSequenceHandler, TransactionValidator1679 transactionValidator1679, PacketTransmissionController packetTransmissionController, int n2, int n3) {
        return ConfigParameterMapper.W(E8.U.u().d8, this.H, string, f, f2, n, bl, actionSequenceHandler.M(), transactionValidator1679.M(), packetTransmissionController.M(), n2, n3);
    }

    public int Y(String string, double d2, double d3, int n, boolean bl, SecureDataExchanger793 secureDataExchanger793, PacketTransmissionController packetTransmissionController) {
        if (secureDataExchanger793 == null) {
            secureDataExchanger793 = new SecureDataExchanger793().Z();
            secureDataExchanger793.E(z6.J);
            secureDataExchanger793.E(z6.D.i());
        }
        SecureDataExchanger793 secureDataExchanger7932 = secureDataExchanger793;
        Supplier<Void> supplier = () -> this.lambda$drawString3D$0(string, d2, d3, n, bl, secureDataExchanger7932, packetTransmissionController);
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(4, EncodingStrategyEnum.MINECRAFT, true).W(supplier);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
        return 0;
    }

    public int F(String string, double d2, double d3, int n, double d4) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        double d5;
        int n2;
        double d6;
        double d7;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d7 = d2;
            d6 = d3;
            n2 = n;
            d5 = d4;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.m(string2, d7, d6, n2, d5, dataTransformationEngine1209);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x7E346E00A73CL;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "2t\u0093%K\u00f4\u00baf=^M=\"\u0000\u00b4O";
        int n2 = "2t\u0093%K\u00f4\u00baf=^M=\"\u0000\u00b4O".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    public int m(String string, double d2, double d3, int n, double d4, DataTransformationEngine1209 dataTransformationEngine1209) {
        double d5 = 1.0 / d4;
        Ne.h.x(d4, d4, d4);
        int n2 = this.c(string, d2 * d5, d3 * d5, n, dataTransformationEngine1209);
        Ne.h.x(d5, d5, d5);
        return n2;
    }

    public int B(String string) {
        return this.I();
    }

    public int U(String string, double d2, double d3, Color color, DataTransformationEngine1209 dataTransformationEngine1209) {
        return this.l(string, d2, d3, color.getRGB(), dataTransformationEngine1209);
    }

    public int T(String string, double d2, double d3, Color color, DataTransformationEngine1209 dataTransformationEngine1209) {
        return this.c(string, d2, d3, color.getRGB(), dataTransformationEngine1209);
    }

    public int U(String string, double d2, double d3, Color color) {
        return this.J(string, d2, d3, color.getRGB());
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = E8.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public int c(String string, double d2, double d3, int n, DataTransformationEngine1209 dataTransformationEngine1209) {
        return this.C(string, d2, d3, n, false, dataTransformationEngine1209);
    }

    public int n(String string, double d2, double d3, int n, boolean bl, SecureDataExchanger793 secureDataExchanger793, PacketTransmissionController packetTransmissionController) {
        long l = a ^ 0x5E3177D55D27L;
        if (secureDataExchanger793 == null) {
            secureDataExchanger793 = new SecureDataExchanger793().Z();
            secureDataExchanger793.E(z6.J);
            secureDataExchanger793.E(z6.D.i());
        }
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            DataTransformationEngine1165 dataTransformationEngine1165 = DataTransformationEngine1165.m(ComplianceOrchestrator.G(16));
            ComplianceOrchestrator complianceOrchestrator = dataTransformationEngine1165.V();
            complianceOrchestrator.C();
            float[] fArray = secureDataExchanger793.d;
            complianceOrchestrator.H(fArray[0]);
            complianceOrchestrator.s(fArray[1]);
            complianceOrchestrator.l(fArray[4]);
            complianceOrchestrator.v(fArray[5]);
            complianceOrchestrator.V(fArray[12]);
            complianceOrchestrator.U(fArray[13]);
            dataTransformationEngine1165.U(ApplicationLifecycleManager.X(), string, (int)d2, (int)d3, n, bl);
            complianceOrchestrator.b();
            return 0;
        }
        TransactionValidator1679 transactionValidator1679 = ApplicationLifecycleManager.n().e();
        int n2 = this.V(string, (float)d2, (float)d3, n, bl, secureDataExchanger793.B(), transactionValidator1679, packetTransmissionController, 0, (int)E8.a("h", (int)22108, (long)(0x78E81264DD80868DL ^ l)));
        transactionValidator1679.d();
        return n2;
    }

    public int o(String string, double d2, double d3, int n, DataTransformationEngine1209 dataTransformationEngine1209) {
        return this.I(string, d2 - (double)(this.L(string) / 2), d3, n, dataTransformationEngine1209);
    }

    public int u(String string, double d2, double d3, int n) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        int n2;
        double d4;
        double d5;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d5 = d2;
            d4 = d3;
            n2 = n;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.c(string2, d5, d4, n2, dataTransformationEngine1209);
    }

    public int J(String string, double d2, double d3, int n) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        int n2;
        double d4;
        double d5;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d5 = d2;
            d4 = d3;
            n2 = n;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.o(string2, d5, d4, n2, dataTransformationEngine1209);
    }

    public int x(DataTransformationEngine1209 dataTransformationEngine1209, String string, int n, int n2, int n3, boolean bl) {
        DataTransformationEngine1165 dataTransformationEngine1165 = DataTransformationEngine1165.F(dataTransformationEngine1209);
        return E8.U.u().d8.t(dataTransformationEngine1165.M(), this.H, string, n, n2, n3, bl);
    }

    public void e(DataTransformationEngine1209 dataTransformationEngine1209, AuthenticationStateManager675 authenticationStateManager675, float f, float f2, int n) {
        ConfigParameterMapper.M(E8.U.u().d8, this.H, dataTransformationEngine1209.M(), authenticationStateManager675.M(), f, f2, n);
    }

    private Void lambda$drawString3D$0(String string, double d2, double d3, int n, boolean bl, SecureDataExchanger793 secureDataExchanger793, PacketTransmissionController packetTransmissionController) {
        long l = a ^ 0x78497213C4CFL;
        TransactionValidator1679 transactionValidator1679 = ApplicationLifecycleManager.n().e();
        tl.w();
        this.V(string, (float)d2, (float)d3, n, bl, secureDataExchanger793.B(), transactionValidator1679, packetTransmissionController, 0, (int)E8.a("h", (int)3879, (long)(0x28730EFD6E73C61FL ^ l)));
        transactionValidator1679.d();
        tl.k();
        return null;
    }

    public int N(String string, float f, float f2, int n, boolean bl, DataTransformationEngine1209 dataTransformationEngine1209) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.C(string, f, f2, n, bl, dataTransformationEngine1209);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() > 13) {
                this.S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return E8.U.u().d8.j(this.H, string, f, f2, n, bl);
    }

    public int m(String string, double d2, double d3, int n) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        int n2;
        double d4;
        double d5;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d5 = d2;
            d4 = d3;
            n2 = n;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.I(string2, d5, d4, n2, dataTransformationEngine1209);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x69DE;
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
                throw new RuntimeException("a/E8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            E8.c[n2] = n3;
        }
        return c[n2];
    }

    public int h(String string, double d2, double d3, Color color) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        Color color2;
        double d4;
        double d5;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d5 = d2;
            d4 = d3;
            color2 = color;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.T(string2, d5, d4, color2, dataTransformationEngine1209);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int I() {
        return E8.U.u().d8.G(this.H);
    }

    public E8(Object object) {
        super(object);
    }

    public int l(String string, double d2, double d3, int n, DataTransformationEngine1209 dataTransformationEngine1209) {
        return this.c(string, (int)d2 - this.L(string) / 2, (int)d3, n, dataTransformationEngine1209);
    }

    public int V(AuthenticationStateManager675 authenticationStateManager675, float f, float f2, int n, boolean bl, ActionSequenceHandler actionSequenceHandler, TransactionValidator1679 transactionValidator1679, boolean bl2, int n2, int n3) {
        return E8.U.u().d8.K(this.H, authenticationStateManager675.M(), f, f2, n, bl, actionSequenceHandler.M(), transactionValidator1679.M(), bl2, n2, n3);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/E8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int C(String string, double d2, double d3, int n, boolean bl, DataTransformationEngine1209 dataTransformationEngine1209) {
        block7: {
            block8: {
                try {
                    if (GeometryCalculator.C() >= 50) {
                        return this.n(string, d2, d3, n, bl, dataTransformationEngine1209.p().n().X(), PacketTransmissionController.F());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw E8.a(customSystemException);
                }
                try {
                    try {
                        if (GeometryCalculator.C() < 35) break block7;
                        if (!bl) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw E8.a(customSystemException);
                    }
                    return E8.U.u().d8.W(this.H, dataTransformationEngine1209.M(), string, (float)d2, (float)d3, n);
                }
                catch (CustomSystemException customSystemException) {
                    throw E8.a(customSystemException);
                }
            }
            return E8.U.u().d8.a(this.H, dataTransformationEngine1209.M(), string, (float)d2, (float)d3, n);
        }
        return E8.U.u().d8.H(this.H, string, (int)d2, (int)d3, n);
    }

    public int I(String string, double d2, double d3, int n, DataTransformationEngine1209 dataTransformationEngine1209) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.C(string, d2, d3, n, true, dataTransformationEngine1209);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 35) {
            int n2 = E8.U.u().d8.W(this.H, dataTransformationEngine1209.M(), string, (float)d2, (float)d3, n);
            return n2;
        }
        try {
            if (GeometryCalculator.C() > 13) {
                return E8.U.u().d8.Z(this.H, string, (float)d2, (float)d3, n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return E8.U.u().d8.A(this.H, string, (int)d2, (int)d3, n);
    }

    public int J(String string, double d2, double d3, Color color) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        Color color2;
        double d4;
        double d5;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d5 = d2;
            d4 = d3;
            color2 = color;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.o(string2, d5, d4, color2, dataTransformationEngine1209);
    }

    public int L(String string) {
        try {
            if (this.o.containsKey(string)) {
                return this.o.get(string);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        int n = E8.U.u().d8.X(this.H, string);
        this.o.put(string, n);
        return n;
    }

    public double s(String string) {
        return this.K();
    }

    public int x(String string, double d2, double d3, int n) {
        DataTransformationEngine1209 dataTransformationEngine1209;
        int n2;
        double d4;
        double d5;
        String string2;
        E8 e8;
        try {
            e8 = this;
            string2 = string;
            d5 = d2;
            d4 = d3;
            n2 = n;
            dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? DataTransformationEngine1209.i() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw E8.a(customSystemException);
        }
        return e8.l(string2, d5, d4, n2, dataTransformationEngine1209);
    }

    public int o(String string, double d2, double d3, Color color, DataTransformationEngine1209 dataTransformationEngine1209) {
        return this.I(string, d2, d3, color.getRGB(), dataTransformationEngine1209);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(E8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

