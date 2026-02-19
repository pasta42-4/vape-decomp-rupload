/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.crypto;

import a.yC;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.config.parameters.ParameterConfigurationHandler;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataTransformationProtocol1874;
import com.exception.system.CustomSystemException;
import com.financial.contract.TransactionContract;
import com.network.configuration.NetworkConfigManager;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.access.ResourceAccessController2350;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicParameterGenerator;
import com.simulation.configuration.SimulationConfigurer;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class CipherManager
extends AbstractComputationKernel
implements TransactionContract {
    private boolean N1;
    private int NP;
    private float NH;
    protected double Nu;
    private final List<ResourceAccessController2350> v;
    private float Nb;
    private float F;
    private static final Map jb;
    protected Color b;
    private boolean Nc;
    private static final Integer[] fb;
    protected boolean Nr;
    private static final Object[] ob;
    @Nullable
    private DataTransformationProtocol1874 NU;
    private Color NB;
    protected ColorPaletteRenderer Nf;
    int D;
    protected boolean NI;
    @Nullable
    private Consumer<String> Nz;
    @Nullable
    private CryptographicParameterGenerator B;
    private float V;
    protected boolean n;
    private Color NT;
    private static final String[] pb;
    private final NetworkConfigManager NG;
    private boolean E;
    private static boolean Nx;
    private Color NF;
    private static final long[] eb;
    private String NJ;
    private static final long bb;
    protected yC L;
    private boolean Ne;
    protected int R;
    private boolean Y;
    @Nullable
    private List<String> N8;
    private final NetworkConfigManager NQ;
    private String Nt;

    public void z() {
        this.y("");
    }

    public Color f() {
        return this.NB;
    }

    public void M(@Nullable DataTransformationProtocol1874 dataTransformationProtocol1874) {
        this.NU = dataTransformationProtocol1874;
    }

    public void V(Color color) {
        this.NB = color;
    }

    public void B(boolean bl) {
        this.Nc = bl;
    }

    public CipherManager T(ResourceAccessController2350 resourceAccessController2350) {
        this.v.add(resourceAccessController2350);
        return this;
    }

    public void I() {
        try {
            if (!this.d()) {
                GraphicalRenderingController.d = this;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
    }

    public String x() {
        return this.NJ;
    }

    public void R(float f) {
        this.Nb = f;
    }

    @Override
    public void d() {
        block6: {
            try {
                try {
                    try {
                        if (!this.Y || this.s()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    if (this.d()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                this.Nf.c();
                this.Y = false;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4218;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Cb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherManager.fb[n2] = n3;
        }
        return fb[n2];
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lambda$new$1(char c, int n) {
        block71: {
            block70: {
                block69: {
                    block68: {
                        block67: {
                            block66: {
                                block65: {
                                    block64: {
                                        block63: {
                                            block61: {
                                                List<String> list;
                                                block62: {
                                                    try {
                                                        this.l().m();
                                                        if (n == 27) {
                                                            GraphicalRenderingController.d = null;
                                                            return;
                                                        }
                                                    }
                                                    catch (Exception exception) {
                                                        throw CipherManager.b(exception);
                                                    }
                                                    try {
                                                        if (n == 13) {
                                                            this.O();
                                                            return;
                                                        }
                                                    }
                                                    catch (Exception exception) {
                                                        throw CipherManager.b(exception);
                                                    }
                                                    DataTransformationProtocol1874 dataTransformationProtocol1874 = this.V();
                                                    try {
                                                        if (dataTransformationProtocol1874 == null || n != 9) break block61;
                                                    }
                                                    catch (Exception exception) {
                                                        throw CipherManager.b(exception);
                                                    }
                                                    list = this.N8;
                                                    if (list == null) return;
                                                    try {
                                                        if (!list.isEmpty()) break block62;
                                                        return;
                                                        catch (Exception exception) {
                                                            throw CipherManager.b(exception);
                                                        }
                                                    }
                                                    catch (Exception exception) {
                                                        throw CipherManager.b(exception);
                                                    }
                                                }
                                                try {
                                                    if (this.NP > list.size()) {
                                                        this.NP = 0;
                                                    }
                                                }
                                                catch (Exception exception) {
                                                    throw CipherManager.b(exception);
                                                }
                                                String string = list.get(this.NP);
                                                try {
                                                    this.W(string, false);
                                                    ++this.NP;
                                                    if (this.NP > list.size() - 1) {
                                                        this.NP = 0;
                                                    }
                                                }
                                                catch (Exception exception) {
                                                    throw CipherManager.b(exception);
                                                }
                                                Consumer<String> consumer = this.Nz;
                                                try {
                                                    if (consumer == null) return;
                                                    consumer.accept(string);
                                                    return;
                                                }
                                                catch (Exception exception) {
                                                    throw CipherManager.b(exception);
                                                }
                                            }
                                            if (c != '\u0016') break block63;
                                            try {
                                                block72: {
                                                    if (!DynamicInvocationResolver1041.F(162)) break block63;
                                                    break block72;
                                                    catch (Exception exception) {
                                                        throw CipherManager.b(exception);
                                                    }
                                                }
                                                this.y(ParameterConfigurationHandler.l());
                                                this.R = this.a().length();
                                                return;
                                            }
                                            catch (Exception exception) {
                                                throw CipherManager.b(exception);
                                            }
                                        }
                                        if (c != '\u0003') break block64;
                                        try {
                                            block73: {
                                                if (!DynamicInvocationResolver1041.F(162)) break block64;
                                                break block73;
                                                catch (Exception exception) {
                                                    throw CipherManager.b(exception);
                                                }
                                            }
                                            ParameterConfigurationHandler.q(this.a());
                                            return;
                                        }
                                        catch (Exception exception) {
                                            throw CipherManager.b(exception);
                                        }
                                    }
                                    if (n != 37) break block65;
                                    try {
                                        block74: {
                                            if (this.R <= 0) break block65;
                                            break block74;
                                            catch (Exception exception) {
                                                throw CipherManager.b(exception);
                                            }
                                        }
                                        --this.R;
                                        this.i();
                                        return;
                                    }
                                    catch (Exception exception) {
                                        throw CipherManager.b(exception);
                                    }
                                }
                                if (n != 39) break block66;
                                try {
                                    block75: {
                                        if (this.R >= this.a().length()) break block66;
                                        break block75;
                                        catch (Exception exception) {
                                            throw CipherManager.b(exception);
                                        }
                                    }
                                    ++this.R;
                                    this.i();
                                    return;
                                }
                                catch (Exception exception) {
                                    throw CipherManager.b(exception);
                                }
                            }
                            if (n != 36) break block67;
                            try {
                                block76: {
                                    if (this.R <= 0) break block67;
                                    break block76;
                                    catch (Exception exception) {
                                        throw CipherManager.b(exception);
                                    }
                                }
                                this.R = 0;
                                this.i();
                                return;
                            }
                            catch (Exception exception) {
                                throw CipherManager.b(exception);
                            }
                        }
                        if (n != 35) break block68;
                        try {
                            block77: {
                                if (this.R >= this.a().length()) break block68;
                                break block77;
                                catch (Exception exception) {
                                    throw CipherManager.b(exception);
                                }
                            }
                            this.R = this.a().length();
                            this.i();
                            return;
                        }
                        catch (Exception exception) {
                            throw CipherManager.b(exception);
                        }
                    }
                    if (n != 8) break block69;
                    try {
                        block78: {
                            this.J();
                            if (this.a().length() <= 0) return;
                            break block78;
                            catch (Exception exception) {
                                throw CipherManager.b(exception);
                            }
                        }
                        if (this.R <= 0) return;
                    }
                    catch (Exception exception) {
                        throw CipherManager.b(exception);
                    }
                    --this.R;
                    int n2 = this.R;
                    String string = this.a();
                    String string2 = this.a().substring(0, this.R) + this.a().substring(Math.min(this.R + 1, this.a().length()));
                    try {
                        this.y(string2);
                        if (this.a().equals(string)) return;
                        this.R = n2;
                        return;
                    }
                    catch (Exception exception) {
                        throw CipherManager.b(exception);
                    }
                }
                if (this.D != -1) break block70;
                try {
                    if (!(this.S().D(this.a()) > this.I() * 2.0)) break block71;
                    return;
                    catch (Exception exception) {
                        throw CipherManager.b(exception);
                    }
                }
                catch (Exception exception) {
                    throw CipherManager.b(exception);
                }
            }
            try {
                if (this.a().length() >= this.D) {
                    return;
                }
            }
            catch (Exception exception) {
                throw CipherManager.b(exception);
            }
        }
        if (c == '\u0000') return;
        String string = this.a();
        try {
            if (string.length() <= 0 && this.R != 0) return;
        }
        catch (Exception exception) {
            throw CipherManager.b(exception);
        }
        try {
            String string3 = string.substring(0, this.R) + c + string.substring(this.R);
            this.y(string3);
            return;
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public static void t(boolean bl) {
        Nx = bl;
    }

    public void g(Color color) {
        this.NF = color;
    }

    public ColorPaletteRenderer L() {
        return this.Nf;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block10: {
            block9: {
                boolean bl;
                block8: {
                    bl = this.C().O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY());
                    try {
                        try {
                            if (!bl || !userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.RIGHT_CLICK)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherManager.b(customSystemException);
                        }
                        this.z();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                }
                try {
                    try {
                        if (GraphicalRenderingController.d == null || bl) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    this.n();
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
            }
            GraphicalRenderingController.d = this;
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(boolean bl) {
        this.Ne = bl;
        this.B = null;
    }

    @Override
    public void E() {
        block6: {
            block7: {
                Color color;
                yC yC2;
                try {
                    yC2 = this.L;
                    color = this.b != null ? this.b : M.j();
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                yC2.H(color);
                this.L.R(this.L.H().brighter());
                double d2 = this.W() + (double)(this.V() / 2.0f) + (double)this.k();
                double d3 = this.b() - (double)this.V();
                double d4 = d2 + d3 / 2.0 - this.L.b() / 2.0;
                try {
                    try {
                        this.L.b(this.G() + this.M() - (double)this.q() - (double)this.C() - 8.0 - 2.0);
                        this.L.M(d4);
                        this.L.y(2.0);
                        this.L.c(2.0);
                        if (this instanceof SimulationConfigurer) break block6;
                        if (!this.E) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    ConfigurationManager.U(this.a(), d2, this.M() - (double)(this.C() * 2.0f), d3, this.Nf.k(), 2.0f, 1.0f, 1.0f);
                    ConfigurationManager.S(this.a() + 0.5, this.W() + (double)(this.V() / 2.0f) + 0.5 + (double)this.k(), this.M() - (double)(this.C() * 2.0f) - 1.0, this.b() - (double)this.V() - 1.0, this.NB);
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
            }
            this.R();
        }
        super.E();
    }

    public void R() {
        block33: {
            Color color;
            double d2;
            double d3;
            String string;
            CryptographicParameterGenerator cryptographicParameterGenerator;
            boolean bl;
            boolean bl2;
            String string2;
            double d4;
            double d5;
            CryptographicParameterGenerator cryptographicParameterGenerator2;
            long l;
            block32: {
                block30: {
                    boolean bl3;
                    block29: {
                        block28: {
                            l = bb ^ 0x2C680DE8F6F2L;
                            cryptographicParameterGenerator2 = this.S();
                            d5 = cryptographicParameterGenerator2.B((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)27206, (long)(0x59FE7E8573BA555AL ^ l)), (long)-211904630983615289L, (long)l)));
                            d4 = this.W() + this.b() / 2.0 - d5 / 2.0;
                            string2 = this.a();
                            try {
                                try {
                                    if (!this.d() || !this.N1) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherManager.b(customSystemException);
                                }
                                bl3 = true;
                                break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherManager.b(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    bl = false;
                    try {
                        block31: {
                            try {
                                try {
                                    if (!this.N1) break block30;
                                    if (this.a() == null) break block31;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherManager.b(customSystemException);
                                }
                                if (this.a().length() >= 1) break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherManager.b(customSystemException);
                            }
                        }
                        if (bl2) break block32;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                }
                bl = true;
                string2 = this.x();
            }
            if (string2 == null) {
                string2 = "";
            }
            double d6 = cryptographicParameterGenerator2.D(string2.substring(0, this.R));
            CryptographicParameterGenerator cryptographicParameterGenerator3 = this.L(1.2);
            try {
                this.x();
                if (this.NI) {
                    GraphicsBufferAllocator.e(this.a() + (double)this.q() - this.L(1.2).D((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)32481, (long)(0x3A5A71509041FCL ^ l)), (long)-211904630983615289L, (long)l))), this.W() + 2.5, this.I() + this.L(1.2).D((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)15199, (long)(0x492BB84AA009844DL ^ l)), (long)-211904630983615289L, (long)l))) + 2.0, this.b() - 5.0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
            double d7 = this.a() + (double)this.q() + this.Nu;
            try {
                cryptographicParameterGenerator = cryptographicParameterGenerator2;
                string = string2;
                d3 = d7;
                d2 = d4 + (double)this.k();
                color = bl ? this.NF : this.NT;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
            try {
                cryptographicParameterGenerator.R(string, d3, d2, color);
                this.y(string2, bl, cryptographicParameterGenerator2, d7, d4, d5);
                if (this.NI) {
                    GraphicsBufferAllocator.F();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
            try {
                if (bl2) {
                    this.h(cryptographicParameterGenerator3, this.a() + (double)this.q() + d6 + this.Nu, this.W() + this.b() / 2.0 - cryptographicParameterGenerator3.B((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)16990, (long)(0x291B22EC1EF9FD4BL ^ l)), (long)-211904630983615289L, (long)l))) / 2.0 + (double)this.k());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
            try {
                try {
                    try {
                        if (!bl2 || !DynamicInvocationResolver1041.F(8)) break block33;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    if (!this.Z().m(100L)) break block33;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                this.Z().m();
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
        }
    }

    private static void p() {
        Object[] objectArray = ob;
        ob[0] = "u*y";
        objectArray[1] = Integer.TYPE;
        CipherManager.pb[1] = "java/lang/Integer";
        objectArray[2] = "\u000bG\u0005\u000f=}\u0000H\u0014@@e\u0013O\u001d\t";
        objectArray[3] = "l\u0014\u0012LH\\g\u001b\u0003\u0003)Rl\u0010\u0007Y";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "2\u001a\f-XE5\u001e^_TNR\u0005^>OK5\u0016K`?\f(\u0012W9XQ+\u0019K_";
    }

    public float V() {
        return this.NH;
    }

    public abstract void O();

    private static Field g(long l, long l2) {
        int n = CipherManager.e(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = CipherManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CipherManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CipherManager.c(clazz3, string2, clazz2)) != null) {
                    CipherManager.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CipherManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CipherManager.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CipherManager.f(221906248158564L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void h(CryptographicParameterGenerator cryptographicParameterGenerator, double d2, double d3) {
        long l = bb ^ 0x3A5100B07E8CL;
        try {
            if (!this.l().m(500L)) {
                cryptographicParameterGenerator.R((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)2247, (long)(0x5999B0361EE23FA6L ^ l)), (long)8462615428973106361L, (long)l)), d2, d3, CipherManager.M.n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        try {
            if (this.l().m(1000L)) {
                this.l().m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
    }

    public NetworkConfigManager l() {
        return this.NG;
    }

    public void u(String string) {
        this.NJ = string;
    }

    public void J(Color color) {
        this.NB = color;
    }

    protected void x() {
    }

    public NetworkConfigManager Z() {
        return this.NQ;
    }

    public void q(boolean bl) {
        this.N1 = bl;
    }

    public void a(ColorPaletteRenderer colorPaletteRenderer) {
        this.Nf = colorPaletteRenderer;
    }

    public void E(Color color) {
        this.b = color;
    }

    public boolean x() {
        return this.Ne;
    }

    public void I(boolean bl) {
        this.E = bl;
    }

    public float t() {
        return this.F;
    }

    public float k() {
        return 0.0f;
    }

    public void H(float f) {
        this.NH = f;
    }

    public void H() {
        for (ResourceAccessController2350 resourceAccessController2350 : this.v) {
            resourceAccessController2350.f();
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CipherManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CipherManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void T(boolean bl) {
        boolean bl2;
        try {
            CipherManager cipherManager = this;
            bl2 = !bl;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        cipherManager.N1 = bl2;
    }

    public void n(float f) {
        this.F = f;
        this.B = null;
    }

    public double M() {
        return this.w();
    }

    private static Method h(long l, long l2) {
        int n = CipherManager.e(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CipherManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CipherManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CipherManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CipherManager.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CipherManager.f(221906248158564L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CipherManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CipherManager.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CipherManager.f(221906248158564L, 0L);
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

    @Override
    public void U() {
    }

    @Nullable
    public DataTransformationProtocol1874 V() {
        return this.NU;
    }

    public void W(String string, boolean bl) {
        DataTransformationProtocol1874 dataTransformationProtocol1874;
        boolean bl2;
        block16: {
            long l = bb ^ 0x2C3683B6237L;
            try {
                try {
                    try {
                        if (!this.Nc || string.isEmpty()) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    if (string.matches((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)16367, (long)(0x3E1B912AEED29439L ^ l)), (long)7622913527936026626L, (long)l)))) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
        }
        int n = string.length() - this.Nt.length();
        try {
            this.R += n;
            this.R = AdaptiveComputationEngine.X(this.R, 0, string.length());
            CipherManager cipherManager = this;
            bl2 = this.L(0.9).D(string) > this.I();
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        try {
            cipherManager.NI = bl2;
            if (!this.NI) {
                this.n = false;
                this.Nr = false;
                this.Nu = 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        this.Nt = string;
        this.i();
        if (bl && (dataTransformationProtocol1874 = this.V()) != null) {
            List<String> list;
            block17: {
                dataTransformationProtocol1874.R(this.Nt);
                List<String> list2 = this.N8;
                list = dataTransformationProtocol1874.U();
                try {
                    try {
                        if (list2 == null || list2.equals(list)) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    this.NP = 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
            }
            this.N8 = list;
        }
    }

    public String a() {
        return this.Nt;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean E() {
        boolean bl;
        long l = bb ^ 0x2B2C44A7BADBL;
        try {
            bl = this.a().replaceAll((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)27530, (long)(0x4FFD25D8627518B5L ^ l)), (long)-5681802649130151698L, (long)l)), "").length() > 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        return bl;
    }

    private CryptographicParameterGenerator S() {
        block4: {
            CryptographicParameterGenerator cryptographicParameterGenerator;
            block6: {
                block5: {
                    try {
                        try {
                            if (this.B != null) break block4;
                            CipherManager cipherManager = this;
                            if (!this.Ne) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherManager.b(customSystemException);
                        }
                        cryptographicParameterGenerator = this.t(this.F);
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                }
                cryptographicParameterGenerator = this.L(this.F);
            }
            cipherManager.B = cryptographicParameterGenerator;
        }
        return this.B;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CipherManager.e(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                CipherManager.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherManager.bb = MultiContainerRegistry.a(-2839094544722789731L, 5645007327053513228L, MethodHandles.lookup().lookupClass()).a(218428401059898L);
                CipherManager.ob = new Object[5];
                CipherManager.pb = new String[5];
                CipherManager.p();
                CipherManager.jb = new HashMap<K, V>(13);
                CipherManager.t(false);
                var0 = CipherManager.bb ^ 7218916703337L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "N-:s\u00c8\"\u00af.\u00cf\n\u00eaf\u00f0 \u00d06c\u00ac\u00c1\u0005\u00ae\u0018\u0004\u00f7\u00a4\u0095S\u00c2\u001951\u00afQ9O?{\u008a\u0082\u00a3.\u00db\u009b\u001f|\u009d8A\u00a4\u00c9\u0088\u008b~\u00a8\u00bb\u00b3\u00e2,\u0006|J\u00d0\u00f8>\u00f3zz\u00e1*\u00ce\u0001\u001eX\u00bf\u00fc\u00ba\u0002\tP_";
                var7_6 = "N-:s\u00c8\"\u00af.\u00cf\n\u00eaf\u00f0 \u00d06c\u00ac\u00c1\u0005\u00ae\u0018\u0004\u00f7\u00a4\u0095S\u00c2\u001951\u00afQ9O?{\u008a\u0082\u00a3.\u00db\u009b\u001f|\u009d8A\u00a4\u00c9\u0088\u008b~\u00a8\u00bb\u00b3\u00e2,\u0006|J\u00d0\u00f8>\u00f3zz\u00e1*\u00ce\u0001\u001eX\u00bf\u00fc\u00ba\u0002\tP_".length();
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
                    var6_5 = "\u00f0\u00da&\u0081I\u009c@\u00d2'9\u00c4\u00df^O\u00faA";
                    var7_6 = "\u00f0\u00da&\u0081I\u009c@\u00d2'9\u00c4\u00df^O\u00faA".length();
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
        CipherManager.eb = var8_3;
        CipherManager.fb = new Integer[12];
    }

    public void n() {
        try {
            if (this.d()) {
                GraphicalRenderingController.d = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    @Override
    public void G() {
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CipherManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CipherManager.d(classArray2[i], string, clazz2, n, classArray);
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
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 61;
                break;
            }
            case 3: {
                n3 = 62;
                break;
            }
            case 4: {
                n3 = 20;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 58;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 53;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 12;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 22;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 1;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 37;
                break;
            }
            case 24: {
                n3 = 28;
                break;
            }
            case 25: {
                n3 = 43;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 14;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 45;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 3;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 16;
                break;
            }
            case 38: {
                n3 = 57;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 6;
                break;
            }
            case 43: {
                n3 = 38;
                break;
            }
            case 44: {
                n3 = 27;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 36;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 26;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 25;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 30;
                break;
            }
            case 55: {
                n3 = 32;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 34;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 51;
                break;
            }
            case 61: {
                n3 = 24;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 35;
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
        CipherManager.pb[n4] = new String(cArray);
        return n4;
    }

    public yC O() {
        return this.L;
    }

    public void x(float f) {
        this.V = f;
    }

    private void i() {
        block13: {
            double d2;
            double d3;
            block12: {
                boolean bl;
                boolean bl2;
                long l = bb ^ 0x7E1A61327BA7L;
                try {
                    if (!this.NI) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                d3 = this.L(1.2).D((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)13480, (long)(0x23A3167FC68586EAL ^ l)), (long)8095919268264972690L, (long)l)));
                d2 = this.S().D(this.a().substring(0, this.R));
                try {
                    CipherManager cipherManager = this;
                    bl2 = d2 + this.Nu >= this.I();
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                try {
                    cipherManager.n = bl2;
                    CipherManager cipherManager = this;
                    bl = d2 + this.Nu <= 0.0;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
                try {
                    cipherManager.Nr = bl;
                    if (!this.Nr) break block12;
                    this.Nu = -d2 + d3;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
            }
            try {
                if (this.n) {
                    this.Nu = this.I() - d2 - d3;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherManager.b(customSystemException);
            }
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == 'C' || c == '\u00df' || c == 'M') {
                field = CipherManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CipherManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void o(int n) {
        this.D = n;
    }

    public float q() {
        return this.V;
    }

    public void z(Color color) {
        this.NT = color;
    }

    public Color w() {
        return this.NF;
    }

    @Override
    public void g() {
        try {
            if (!this.Y) {
                this.Nf.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        this.Y = true;
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

    public void J() {
    }

    public float C() {
        return this.Nb;
    }

    public static boolean P() {
        boolean bl = CipherManager.W();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        return false;
    }

    private void y(String string, boolean bl, CryptographicParameterGenerator cryptographicParameterGenerator, double d2, double d3, double d4) {
        int n;
        int n2;
        double d5;
        double d6;
        boolean bl2;
        int n3;
        int n4;
        CryptographicParameterGenerator cryptographicParameterGenerator2;
        long l;
        block30: {
            block29: {
                boolean bl3;
                String string2;
                List<String> list;
                block28: {
                    boolean bl4;
                    block27: {
                        String string3;
                        block26: {
                            l = bb ^ 0x5ECBA035A962L;
                            try {
                                if (bl) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherManager.b(customSystemException);
                            }
                            try {
                                if (!this.d()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherManager.b(customSystemException);
                            }
                            list = this.N8;
                            try {
                                try {
                                    if (list != null && !list.isEmpty()) break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherManager.b(customSystemException);
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherManager.b(customSystemException);
                            }
                        }
                        String string4 = list.get(this.NP);
                        try {
                            string3 = string4.length() >= string.length() ? string4.substring(string.length()) : "";
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherManager.b(customSystemException);
                        }
                        string2 = string3;
                        try {
                            try {
                                if (string2.isEmpty() || !string4.toLowerCase().startsWith(string.toLowerCase())) break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherManager.b(customSystemException);
                            }
                            bl4 = true;
                            break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherManager.b(customSystemException);
                        }
                    }
                    bl4 = bl3 = false;
                }
                if (bl3) {
                    double d7 = d2 + cryptographicParameterGenerator.D(string);
                    cryptographicParameterGenerator.R(string2, d7, d3 + (double)this.k(), this.NT.darker().darker());
                }
                cryptographicParameterGenerator2 = this.t(0.85);
                n4 = (int)cryptographicParameterGenerator2.D((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)13912, (long)(0xEBD00601FB456D6L ^ l)), (long)-6728558713186335913L, (long)l)));
                n3 = (int)d2 + (int)cryptographicParameterGenerator.D(string + string2) + 3;
                try {
                    try {
                        if (list.size() <= 1 || bl3) break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    bl2 = true;
                    break block30;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
            }
            bl2 = false;
        }
        boolean bl5 = bl2;
        try {
            d6 = n3;
            d5 = d3 + (double)this.k() - 1.0;
            n2 = n4 + 6;
            n = bl5 ? 6 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        try {
            ConfigurationManager.C(d6, d5, n2 + n, d4 + 3.0, CipherManager.M.T, 2.5f);
            cryptographicParameterGenerator2.R((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)30235, (long)(0x50FA783FAF51969BL ^ l)), (long)-6728558713186335913L, (long)l)), n3 + 3, d3 + (double)this.k() + 0.5, CipherManager.M.n);
            if (bl5) {
                StateTrackingCoordinator.B(CipherManager.M.n, n3 + 15, (float)d3 + 0.5f, (String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)5621, (long)(0x204C06BB6B56F571L ^ l)), (long)-6728558713186335913L, (long)l)), 4.0f, 5.5f, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
    }

    public static boolean W() {
        return Nx;
    }

    public Color s() {
        return this.NT;
    }

    private void lambda$new$0() {
        this.O();
    }

    @Override
    public boolean y() {
        boolean bl;
        try {
            bl = !this.N1;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        return bl;
    }

    public CipherManager(String string) {
        long l = bb ^ 0x65DEB4974579L;
        this.Nt = "";
        this.N1 = true;
        this.R = 0;
        this.Nf = new ColorPaletteRenderer(0.15, CipherManager.M.g, CipherManager.M.S);
        this.NB = CipherManager.M.a;
        this.L = new yC((String)((Object)CipherManager.d("L", (int)CipherManager.b("h", (int)18150, (long)(0x43288F63CB804A7CL ^ l)), (long)5657753044134768460L, (long)l)), 8.0, 8.0, 12.0, 12.0, M.j(), M.j().brighter(), null);
        this.b = null;
        this.NG = new NetworkConfigManager();
        this.NQ = new NetworkConfigManager();
        this.E = true;
        this.NT = CipherManager.M.c;
        this.NF = CipherManager.M.c;
        this.D = -1;
        this.Nu = 0.0;
        this.n = false;
        this.Nr = false;
        this.NI = false;
        this.NH = 5.0f;
        this.Nb = 5.0f;
        this.V = 5.0f;
        this.NP = 0;
        this.Nc = false;
        this.F = 0.85f;
        this.v = new ArrayList<ResourceAccessController2350>();
        this.NJ = string;
        this.L.N(this::lambda$new$0);
        this.h(this::lambda$new$1);
        this.o(this.L);
    }

    public boolean r() {
        return this.Nc;
    }

    public double I() {
        double d2;
        double d3;
        try {
            d3 = this.M() - (double)this.C() - (double)this.q() - 8.0;
            d2 = this.L.f() ? this.L.w() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
        return d3 - d2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean d() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!this.N1 || GraphicalRenderingController.d == null) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherManager.b(customSystemException);
                        }
                        if (!GraphicalRenderingController.d.equals(this)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherManager.b(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherManager.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void U(@Nullable Consumer<String> consumer) {
        this.Nz = consumer;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CipherManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void y(String string) {
        try {
            this.W(string, true);
            if (this.a().isEmpty()) {
                this.H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherManager.b(customSystemException);
        }
    }

    protected double a() {
        return this.G() + (double)this.C();
    }

    public void v(boolean bl) {
        this.L.N(bl);
    }

    @Nullable
    public Consumer<String> q() {
        return this.Nz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CipherManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

