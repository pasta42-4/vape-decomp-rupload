/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.security.session;

import a.hr;
import com.app.data.validation.DataIntegrityValidator2272;
import com.app.transactions.TransactionLifecycleDefinition;
import com.async.scheduling.AsynchronousTaskScheduler685;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionUtilityManager;
import com.event.management.EventDispatchCoordinator511;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.math.transformation.NumericTransformationEngine;
import com.network.allocation.NetworkResourceAllocator;
import com.network.configuration.NetworkConfigurationManager1825;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CipherContextManager1101;
import com.security.encoding.SecureMessageEncoder;
import com.security.protocol.EncryptionProtocolHandler397;
import com.security.transform.GenericCryptoTransformer;
import com.spatial.mapping.CoordinateMapper;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class CipherSessionManager
extends NumericTransformationEngine
implements TransactionLifecycleDefinition {
    private static final Object[] Cb;
    private boolean Oz;
    private static final long[] mb;
    protected boolean Ol;
    protected boolean Od;
    private static final long bb;
    private boolean OQ;
    private static final String[] Db;
    private hr Of;
    private ArrayList<CipherContextManager1101> OK;
    private static AbstractComputationKernel[] OC;
    private static final Map pb;
    private boolean O9;
    private static final Integer[] ob;
    private boolean O_;
    protected CoordinateMapper Ob;
    private boolean OX;

    public double u() {
        double d2 = this.d();
        double d3 = this.H();
        try {
            if (this.G() < d3) {
                return d3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        try {
            if (this.G() > d2) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        return this.G();
    }

    public double D() {
        double d2 = this.L();
        double d3 = this.Z();
        try {
            if (this.W() < d2) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        try {
            if (this.W() > d3) {
                return d3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        return this.W();
    }

    public void L() {
    }

    public void R() {
        GraphicalRenderingController.l(this);
    }

    public boolean i() {
        boolean bl;
        block5: {
            block4: {
                double d2 = this.d();
                double d3 = this.H();
                try {
                    try {
                        if (!(this.G() < d3) && !(this.G() > d2)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void N() {
        if (!this.V().isEmpty()) {
            for (CipherContextManager1101 cipherContextManager1101 : this.V()) {
                try {
                    block8: {
                        try {
                            try {
                                if (cipherContextManager1101.s() || cipherContextManager1101 instanceof CompressionUtilityManager) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherSessionManager.b(customSystemException);
                            }
                            if (!(cipherContextManager1101 instanceof NetworkConfigurationManager1825)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherSessionManager.b(customSystemException);
                        }
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
            }
        }
        super.N();
    }

    public void r(boolean bl, boolean bl2) {
        block12: {
            block11: {
                try {
                    try {
                        if (this.f() == bl || !bl2) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                    TemporalMetadataResolver.h.n();
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
            }
            try {
                try {
                    if (!bl || !bl2) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
                GraphicalRenderingController.A(this);
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        }
        try {
            super.N(bl);
            this.Od = false;
            if (this.N()) {
                this.q();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
    }

    protected void u(double d2, double d3) {
        this.b(this.G() + d2);
        this.M(this.W() + d3);
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                abstractComputationKernel.b(abstractComputationKernel.G() + d2);
                abstractComputationKernel.M(abstractComputationKernel.W() + d3);
                if (abstractComputationKernel instanceof CipherSessionManager) {
                    ((CipherSessionManager)abstractComputationKernel).u(d2, d3);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
            try {
                if (abstractComputationKernel instanceof NumericTransformationEngine) {
                    ((NumericTransformationEngine)abstractComputationKernel).t(d2, d3);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
            try {
                if (!(abstractComputationKernel instanceof NetworkResourceAllocator)) continue;
                ((SecureMessageEncoder)abstractComputationKernel).b(d2, d3);
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        }
    }

    public void s(boolean bl) {
        try {
            if (this.O_ != bl) {
                TemporalMetadataResolver.h.n();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        this.O_ = bl;
    }

    private static Field k(long l, long l2) {
        int n = CipherSessionManager.i(l, l2);
        Object object = Cb[n];
        if (object instanceof String) {
            String string = Db[n];
            int n2 = string.indexOf(8);
            Class clazz = CipherSessionManager.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CipherSessionManager.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CipherSessionManager.e(clazz3, string2, clazz2)) != null) {
                    CipherSessionManager.Cb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CipherSessionManager.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CipherSessionManager.Cb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CipherSessionManager.j(254508967566656L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double H() {
        return -(this.w() * 0.75);
    }

    public abstract String A();

    public boolean r() {
        boolean bl;
        block16: {
            block15: {
                block14: {
                    try {
                        block13: {
                            try {
                                try {
                                    if (this instanceof EventDispatchCoordinator511 || this instanceof AsynchronousTaskScheduler685) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherSessionManager.b(customSystemException);
                                }
                                if (!(this instanceof GenericCryptoTransformer)) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherSessionManager.b(customSystemException);
                            }
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                }
                try {
                    if (this.Q() == null) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
                try {
                    try {
                        if (!this.i() && !this.V()) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                    bl = true;
                    break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean m() {
        return this.Ol;
    }

    private void m() {
        block7: {
            try {
                try {
                    if (this.Od && this.Ol) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        }
        boolean bl = SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal());
        try {
            if (!bl) {
                this.Od = false;
                this.Y(true);
                this.A();
                TemporalMetadataResolver.h.n();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
        double d2 = coordinateMapper.X - this.Ob.X;
        double d3 = coordinateMapper.I - this.Ob.I;
        this.Ob = coordinateMapper;
        this.u(d2, d3);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block11: {
            block10: {
                try {
                    try {
                        if (this.Q() != null && this.f()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (!this.Ol || !userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                    if (!this.Q().M(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
                this.Ob = GraphicsBufferAllocator.b();
                this.Od = true;
                this.B(true);
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        }
    }

    public static void z(AbstractComputationKernel[] abstractComputationKernelArray) {
        OC = abstractComputationKernelArray;
    }

    public boolean F() {
        return this.O_;
    }

    public void g(boolean bl) {
        this.Ol = bl;
    }

    public void D() {
        try {
            if (this.Q() == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        try {
            if (this.V()) {
                this.M(this.D());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void G() {
        block10: {
            try {
                if (!this.f()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
            try {
                if (this.N()) {
                    this.q();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
            try {
                try {
                    this.m();
                    super.G();
                    if (this.Q() == null || !this.Of.f()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
                this.Of.z(this.A());
                this.Of.T(this.Of.w() + 10.0 + 6.0);
                this.Of.w(12.0);
                this.Of.b(this.u() - this.Of.w() / 4.0);
                this.Of.M(this.D());
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        }
    }

    @Override
    public double e() {
        return this.d().C();
    }

    public hr j() {
        return this.Of;
    }

    @Override
    public void M(double d2) {
        super.M(Math.floor(d2));
    }

    public void F() {
        ArrayList<CipherContextManager1101> arrayList = new ArrayList<CipherContextManager1101>(this.OK);
        for (CipherContextManager1101 cipherContextManager1101 : arrayList) {
            GraphicalRenderingController.z(cipherContextManager1101);
        }
    }

    public boolean Z() {
        return GraphicalRenderingController.K.S().Y().contains(this);
    }

    private static void cb() {
        Object[] objectArray = Cb;
        Cb[0] = "Jk\n";
        objectArray[1] = Integer.TYPE;
        CipherSessionManager.Db[1] = "java/lang/Integer";
        objectArray[2] = "S<_q\b\u0006X3N>u\u001eK4Gw";
        objectArray[3] = "\ni#:\u0005]\u0001f2udS\nm6/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "t:\u0007e!\u001c n\f\u0014*\u0018\u001d;\\f;[cz\u001cx0c$m\u0001*1\u001b}x\n~A";
    }

    public void x() {
        try {
            if (this.Q() == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        try {
            if (this.i()) {
                this.b(this.u());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void N(boolean bl) {
        this.r(bl, true);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7774;
        if (ob[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = mb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])pb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherSessionManager.ob[n2] = n3;
        }
        return ob[n2];
    }

    @Override
    public JsonObject E() {
        long l = bb ^ 0x6E3FEE55DD61L;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)10714, (long)(0x1EF50718C9D2D893L ^ l)), (long)-8773773814027798849L, (long)l)), this.A());
        jsonObject.addProperty((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)4284, (long)(0x3D3913E0BC2BE1FCL ^ l)), (long)-8773773814027798849L, (long)l)), (Number)this.G());
        jsonObject.addProperty((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)31697, (long)(0x5D7D3F30BC548A9BL ^ l)), (long)-8773773814027798849L, (long)l)), (Number)this.W());
        jsonObject.addProperty((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)5894, (long)(0x1DD8DF1FAAEEE64DL ^ l)), (long)-8773773814027798849L, (long)l)), Boolean.valueOf(this.f()));
        jsonObject.addProperty((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)9724, (long)(0x40AA03A4E4EFD4B1L ^ l)), (long)-8773773814027798849L, (long)l)), Boolean.valueOf(this.F()));
        return jsonObject;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CipherSessionManager.i(l, l2);
            object = Cb[n];
            try {
                if (!(object instanceof String)) break block2;
                CipherSessionManager.Cb[n] = clazz = Class.forName(Db[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Db[n4] != null) {
            return n4;
        }
        Object object = Cb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 33;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 31;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 11;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 59;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 5;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 42;
                break;
            }
            case 13: {
                n3 = 34;
                break;
            }
            case 14: {
                n3 = 24;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 19;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 58;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 14;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 21;
                break;
            }
            case 29: {
                n3 = 62;
                break;
            }
            case 30: {
                n3 = 48;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 29;
                break;
            }
            case 34: {
                n3 = 2;
                break;
            }
            case 35: {
                n3 = 23;
                break;
            }
            case 36: {
                n3 = 40;
                break;
            }
            case 37: {
                n3 = 60;
                break;
            }
            case 38: {
                n3 = 43;
                break;
            }
            case 39: {
                n3 = 30;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 18;
                break;
            }
            case 42: {
                n3 = 49;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 55;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 53;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 44;
                break;
            }
            case 52: {
                n3 = 0;
                break;
            }
            case 53: {
                n3 = 1;
                break;
            }
            case 54: {
                n3 = 12;
                break;
            }
            case 55: {
                n3 = 61;
                break;
            }
            case 56: {
                n3 = 13;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 4;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 46;
                break;
            }
            default: {
                n3 = 10;
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
        CipherSessionManager.Db[n4] = new String(cArray);
        return n4;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherSessionManager.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void E(boolean bl) {
        this.Od = bl;
    }

    public boolean g() {
        return true;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CipherSessionManager.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void b(double d2) {
        super.b(Math.floor(d2));
    }

    @Override
    public void U() {
        try {
            if (!this.F()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        super.U();
    }

    public void m(double d2, double d3) {
        this.b(d2);
        this.M(d3);
        this.A();
    }

    public CipherSessionManager() {
        long l = bb ^ 0xB12E91634F3L;
        this.Ol = true;
        this.OX = true;
        this.Of = new hr((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)22098, (long)(0x7D0CE589C3E7CE8CL ^ l)), (long)8047701768143658797L, (long)l)), CipherSessionManager.M.W, CipherSessionManager.M.W.brighter()).Q(CipherSessionManager.M.S, CipherSessionManager.M.W);
        this.OK = new ArrayList();
        this.Of.N(new DataIntegrityValidator2272(this));
        this.Of.w(10.0);
    }

    public void L(boolean bl) {
        this.O9 = bl;
    }

    @Override
    public void C() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void y(JsonObject jsonObject) {
        long l = bb ^ 0x717A63502315L;
        Double d2 = EncryptionProtocolHandler397.R(jsonObject, (String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)16485, (long)(0x74AB95626AA44F5FL ^ l)), (long)8667551824007022795L, (long)l)));
        try {
            if (d2 != null) {
                this.b(d2);
                this.H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        Double d3 = EncryptionProtocolHandler397.R(jsonObject, (String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)11179, (long)(0x1F2A347BDC77A49DL ^ l)), (long)8667551824007022795L, (long)l)));
        try {
            if (d3 != null) {
                this.M(d3);
                this.H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        Boolean bl = EncryptionProtocolHandler397.O(jsonObject, (String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)12588, (long)(0x64654ED2CD0DBE10L ^ l)), (long)8667551824007022795L, (long)l)));
        try {
            if (bl != null) {
                this.s(bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
        if (this.OX) {
            Boolean bl2 = EncryptionProtocolHandler397.O(jsonObject, (String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)6227, (long)(0x3B1C852C12549766L ^ l)), (long)8667551824007022795L, (long)l)));
            try {
                if (bl2 == null) return;
                this.r(jsonObject.get((String)((Object)CipherSessionManager.i("\u00e5", (int)CipherSessionManager.c("s", (int)13264, (long)(0x604C3D864AB0BCEBL ^ l)), (long)8667551824007022795L, (long)l))).getAsBoolean(), false);
                GraphicalRenderingController.e(this);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        } else {
            this.r(this.Oz, false);
        }
    }

    private static Method l(long l, long l2) {
        int n = CipherSessionManager.i(l, l2);
        Object object = Cb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Db[n];
                int n3 = string2.indexOf(8);
                clazz3 = CipherSessionManager.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CipherSessionManager.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CipherSessionManager.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        CipherSessionManager.Cb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CipherSessionManager.j(254508967566656L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CipherSessionManager.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CipherSessionManager.Cb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CipherSessionManager.j(254508967566656L, 0L);
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

    public CipherSessionManager L(double d2, double d3) {
        this.b(d2);
        this.M(d3);
        return this;
    }

    public static AbstractComputationKernel[] Q() {
        return OC;
    }

    @Override
    public double z() {
        return this.d().R();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherSessionManager.bb = MultiContainerRegistry.a(6472247717051233286L, -314827140404830833L, MethodHandles.lookup().lookupClass()).a(139518167679595L);
                CipherSessionManager.Cb = new Object[5];
                CipherSessionManager.Db = new String[5];
                CipherSessionManager.cb();
                CipherSessionManager.pb = new HashMap<K, V>(13);
                var0 = CipherSessionManager.bb ^ 67476526525751L;
                CipherSessionManager.z(new AbstractComputationKernel[4]);
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u001f\u00adhk\u00a0\u00f9\u0017i\u00ff\u00c1-k\u00a7\u000e\u009a\u00abE\\\u00e4\u00dd\u0000C\u00e4n,\u00ddN\u0017O\u0005\u00b7\"\u009d\u00abu\u00e6>\u00c2v\u00c8O\u00ee\u00ba\u00a4]\u0013\u00e6C\u00db%\u00af\u00ae\\c\u00f1\u0097\u00c0\u008c\u00cbv\u00b8`]\u0083\u00d0\u0011!\u00c4ZWN\u00a7";
                var7_6 = "\u001f\u00adhk\u00a0\u00f9\u0017i\u00ff\u00c1-k\u00a7\u000e\u009a\u00abE\\\u00e4\u00dd\u0000C\u00e4n,\u00ddN\u0017O\u0005\u00b7\"\u009d\u00abu\u00e6>\u00c2v\u00c8O\u00ee\u00ba\u00a4]\u0013\u00e6C\u00db%\u00af\u00ae\\c\u00f1\u0097\u00c0\u008c\u00cbv\u00b8`]\u0083\u00d0\u0011!\u00c4ZWN\u00a7".length();
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
                    var6_5 = "'!\u00db\u00baq%`\u008fG]\u00c5\u00f6\u00fe\u00b4}a";
                    var7_6 = "'!\u00db\u00baq%`\u008fG]\u00c5\u00f6\u00fe\u00b4}a".length();
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
        CipherSessionManager.mb = var8_3;
        CipherSessionManager.ob = new Integer[11];
    }

    public boolean d() {
        return this.OX;
    }

    public boolean N() {
        return this.O9;
    }

    public void q() {
        block4: {
            int n = (int)((double)ApplicationLifecycleManager.e() / 4.0 / TemporalMetadataResolver.h.a().b() - this.w() / 2.0);
            int n2 = (int)((double)ApplicationLifecycleManager.b() / 4.0 / TemporalMetadataResolver.h.a().b() - this.b() / 2.0);
            try {
                try {
                    if (this.G() == (double)n && this.W() == (double)n2) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
                this.m(n, n2);
                this.h(true);
            }
            catch (CustomSystemException customSystemException) {
                throw CipherSessionManager.b(customSystemException);
            }
        }
    }

    public ArrayList<CipherContextManager1101> V() {
        return this.OK;
    }

    public boolean V() {
        boolean bl;
        block5: {
            block4: {
                double d2 = this.L();
                double d3 = this.Z();
                try {
                    try {
                        if (!(this.W() < d2) && !(this.W() > d3)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherSessionManager.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherSessionManager.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = CipherSessionManager.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CipherSessionManager.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void B(boolean bl, boolean bl2) {
        this.OX = bl;
        this.Oz = bl2;
    }

    public void y(CipherContextManager1101 cipherContextManager1101) {
        try {
            if (this.OK.contains(cipherContextManager1101)) {
                this.OK.remove(cipherContextManager1101);
                this.OK.add(cipherContextManager1101);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherSessionManager.b(customSystemException);
        }
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CipherSessionManager.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CipherSessionManager.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'u' || c == 'v' || c == 'M' || c == 'V') {
                field = CipherSessionManager.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CipherSessionManager.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public double Z() {
        double d2 = (double)ApplicationLifecycleManager.b() / TemporalMetadataResolver.h.a().b();
        return d2 / 2.0 - this.Q().b() * 0.5;
    }

    public double L() {
        return -(this.Q().b() * 0.75);
    }

    public double d() {
        double d2 = (double)ApplicationLifecycleManager.e() / TemporalMetadataResolver.h.a().b();
        return d2 / 2.0 - this.w() * 0.25;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherSessionManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CipherSessionManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

