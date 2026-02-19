/*
 * Decompiled with CFR 0.152.
 */
package com.data.serialization;

import a.bE;
import com.app.rendering.graphics.VisualizationRenderer;
import com.app.state.management.StateTransitionHandler;
import com.app.streaming.StreamProcessingEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.rendering.RenderingContextManager757;
import com.graphics.theme.GraphicalThemeRenderer;
import com.network.allocation.NetworkResourceAllocator;
import com.network.protocol.NetworkProtocolDefinition;
import com.networking.link.DataLinkEstablisher;
import com.scientific.measurement.PrecisionMeasurementCalibrator;
import com.security.authorization.ContextualAccessController;
import com.security.protocol.CryptographicProtocolHandler;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DataSerializationManager
extends StreamProcessingEngine
implements NetworkProtocolDefinition {
    private final GraphicalThemeRenderer M9;
    private PrecisionMeasurementCalibrator Mo;
    private boolean M2;
    private static final String[] vb;
    private static final long ab;
    private static final long[] fb;
    private final GraphicalThemeRenderer Mh;
    private GraphicalRenderEngine1082 MM;
    private static final Integer[] lb;
    private static final Object[] ub;
    private PrecisionMeasurementCalibrator MA;
    private final String MO;
    private static final Map qb;
    private final NetworkResourceAllocator M3;
    private final List<AbstractComputationKernel> MX;

    static PrecisionMeasurementCalibrator t(DataSerializationManager dataSerializationManager) {
        return dataSerializationManager.MA;
    }

    /*
     * Loose catch block
     */
    public void Y() {
        block15: {
            block16: {
                long l = ab ^ 0x6F0D9D651B97L;
                if (this.Mo != null) break block16;
                this.M3.X(true);
                try {
                    double d2 = this.w();
                    this.MM = new GraphicalRenderEngine1082(d2, this.b() - this.M3.b());
                    this.Mo = GraphicalRenderingController.v(this, this.MM, PrecisionMeasurementCalibrator.class);
                    this.Mo.u(18.0);
                    this.Mo.T(d2);
                    this.MM.d().f((String)((Object)DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)29754, (long)(0x2CB7EED99D2770C8L ^ l)), (long)4968991543703705380L, (long)l)));
                    this.Mo.A();
                    this.MM.n(new VisualizationRenderer(DataSerializationManager.M.S, 0.5, d2), new Object[0]);
                    this.MM.n(new bE(0.0, 0.5), new Object[0]);
                    ArrayList<AbstractComputationKernel> arrayList = new ArrayList<AbstractComputationKernel>();
                    for (AbstractComputationKernel abstractComputationKernel : this.MX) {
                        block14: {
                            this.MM.o(abstractComputationKernel);
                            abstractComputationKernel.Q(DataSerializationManager.M.a);
                            if (abstractComputationKernel.k() == null) break block14;
                            try {
                                block17: {
                                    if (abstractComputationKernel.k().G() == null) break block14;
                                    break block17;
                                    catch (Exception exception) {
                                        throw DataSerializationManager.a(exception);
                                    }
                                }
                                abstractComputationKernel.Q(DataSerializationManager.M.a);
                            }
                            catch (Exception exception) {
                                throw DataSerializationManager.a(exception);
                            }
                        }
                        try {
                            this.m(abstractComputationKernel, d2);
                            if (!abstractComputationKernel.f()) continue;
                            arrayList.add(abstractComputationKernel);
                        }
                        catch (Exception exception) {
                            throw DataSerializationManager.a(exception);
                        }
                    }
                    try {
                        this.Mo.A();
                        if (arrayList.size() != 1 || !(arrayList.get(0) instanceof RenderingContextManager757)) break block15;
                    }
                    catch (Exception exception) {
                        throw DataSerializationManager.a(exception);
                    }
                    RenderingContextManager757 renderingContextManager757 = (RenderingContextManager757)arrayList.get(0);
                    renderingContextManager757.l();
                }
                catch (Exception exception) {
                    TemporalMetadataResolver.W(exception);
                }
                break block15;
            }
            try {
                this.M3.x();
                this.X();
                if (this.MA != null) {
                    GraphicalRenderingController.z(this.MA);
                    this.MA = null;
                }
            }
            catch (Exception exception) {
                throw DataSerializationManager.a(exception);
            }
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (vb[n4] != null) {
            return n4;
        }
        Object object = ub[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 12;
                break;
            }
            case 4: {
                n3 = 21;
                break;
            }
            case 5: {
                n3 = 41;
                break;
            }
            case 6: {
                n3 = 56;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 62;
                break;
            }
            case 10: {
                n3 = 36;
                break;
            }
            case 11: {
                n3 = 9;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 34;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 2;
                break;
            }
            case 17: {
                n3 = 15;
                break;
            }
            case 18: {
                n3 = 8;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 61;
                break;
            }
            case 22: {
                n3 = 55;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 6;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 30;
                break;
            }
            case 29: {
                n3 = 20;
                break;
            }
            case 30: {
                n3 = 54;
                break;
            }
            case 31: {
                n3 = 23;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 33;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 63;
                break;
            }
            case 36: {
                n3 = 16;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 60;
                break;
            }
            case 39: {
                n3 = 17;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 13;
                break;
            }
            case 46: {
                n3 = 51;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 58;
                break;
            }
            case 49: {
                n3 = 18;
                break;
            }
            case 50: {
                n3 = 46;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 1;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 26;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 52;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 5;
                break;
            }
            case 62: {
                n3 = 25;
                break;
            }
            default: {
                n3 = 29;
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
        DataSerializationManager.vb[n4] = new String(cArray);
        return n4;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public NetworkResourceAllocator N() {
        return this.M3;
    }

    public RenderingContextManager757 j(String string, AbstractComputationKernel ... abstractComputationKernelArray) {
        RenderingContextManager757 renderingContextManager757 = new RenderingContextManager757(string, 0.9, abstractComputationKernelArray);
        renderingContextManager757.N(new CryptographicProtocolHandler(this, renderingContextManager757));
        return renderingContextManager757;
    }

    @Override
    public void V() {
        CallSite callSite;
        GraphicalThemeRenderer graphicalThemeRenderer;
        boolean bl;
        long l = ab ^ 0x764C58ED898AL;
        try {
            this.y();
            this.N().x();
            DataSerializationManager dataSerializationManager = this;
            bl = !this.M2;
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
        dataSerializationManager.M2 = bl;
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            boolean bl2;
            AbstractComputationKernel abstractComputationKernel2;
            try {
                if (!abstractComputationKernel.b()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataSerializationManager.a(customSystemException);
            }
            try {
                abstractComputationKernel2 = abstractComputationKernel;
                bl2 = !this.M2;
            }
            catch (CustomSystemException customSystemException) {
                throw DataSerializationManager.a(customSystemException);
            }
            abstractComputationKernel2.N(bl2);
        }
        try {
            if (this.M2) {
                this.z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
        try {
            graphicalThemeRenderer = this.M9;
            callSite = this.M2 ? DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)25174, (long)(0x718B8921DE1474BEL ^ l)), (long)-2960977964538690247L, (long)l) : DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)2586, (long)(0x7267369CB9859CF6L ^ l)), (long)-2960977964538690247L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
        graphicalThemeRenderer.u((String)((Object)callSite));
        this.h(true);
    }

    private static Field o(long l, long l2) {
        int n = DataSerializationManager.m(l, l2);
        Object object = ub[n];
        if (object instanceof String) {
            String string = vb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataSerializationManager.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataSerializationManager.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataSerializationManager.g(clazz3, string2, clazz2)) != null) {
                    DataSerializationManager.ub[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataSerializationManager.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataSerializationManager.ub[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataSerializationManager.n(237805362594133L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void db() {
        Object[] objectArray = ub;
        ub[0] = "*\u0015\"";
        objectArray[1] = Integer.TYPE;
        DataSerializationManager.vb[1] = "java/lang/Integer";
        objectArray[2] = "9-\nxhW2\"\u001b7\u0015O!%\u0012~";
        objectArray[3] = "\u0007\u000b\u0013jHU\f\u0004\u0002%)[\u0007\u000f\u0006\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u00072C\u0018\u0018\u0013\u001anCu\u0018Wd}\u001b\t\u000fL\u000e|\u001dHs\u0015\u0000gF\u0012\u0014\u0012\u0005m\tu";
    }

    public void z() {
    }

    static PrecisionMeasurementCalibrator w(DataSerializationManager dataSerializationManager, PrecisionMeasurementCalibrator precisionMeasurementCalibrator) {
        dataSerializationManager.MA = precisionMeasurementCalibrator;
        return dataSerializationManager.MA;
    }

    public DataSerializationManager(String string, String string2, boolean bl, boolean bl2) {
        CallSite callSite;
        GraphicalThemeRenderer graphicalThemeRenderer;
        GraphicalThemeRenderer graphicalThemeRenderer2;
        long l = ab ^ 0x23C146086D1L;
        this.M2 = false;
        this.MX = new ArrayList<AbstractComputationKernel>();
        this.MO = string2;
        EventDistributionHub eventDistributionHub = this.d();
        try {
            GraphicalThemeRenderer graphicalThemeRenderer3;
            eventDistributionHub.o(false);
            eventDistributionHub.y(false);
            eventDistributionHub.m(false);
            eventDistributionHub.i(false);
            eventDistributionHub.f((String)((Object)DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)28706, (long)(0x14BDD204040D6994L ^ l)), (long)-2759850829821998494L, (long)l)));
            DataSerializationManager dataSerializationManager = this;
            graphicalThemeRenderer2 = graphicalThemeRenderer3;
            graphicalThemeRenderer = graphicalThemeRenderer3;
            callSite = this.M2 ? DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)10777, (long)(0x79BBB8BD61E0B3ABL ^ l)), (long)-2759850829821998494L, (long)l) : DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)17589, (long)(0x4DD1D5F07449DD04L ^ l)), (long)-2759850829821998494L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
        graphicalThemeRenderer2((String)((Object)callSite), 0.25);
        dataSerializationManager.M9 = graphicalThemeRenderer;
        this.M9.N(new StateTransitionHandler(this));
        this.Mh = new GraphicalThemeRenderer((String)((Object)DataSerializationManager.f("J", (int)DataSerializationManager.d("y", (int)7398, (long)(0x343B232497E00556L ^ l)), (long)-2759850829821998494L, (long)l)), 0.9);
        this.Mh.N(new DataLinkEstablisher(this));
        this.M3 = new NetworkResourceAllocator(this, string, string2);
        this.a(this.M3);
        if (bl) {
            this.N().w(new ContextualAccessController(this.M9, false));
        }
        try {
            if (bl2) {
                this.N().A(this.Mh);
                this.N().M().N(this::Y);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
        this.N().g().N(this::y);
    }

    public void L(String string, boolean bl) {
        for (AbstractComputationKernel abstractComputationKernel : this.H(new ArrayList<AbstractComputationKernel>(Arrays.asList(this)), 0)) {
            try {
                try {
                    if (!(abstractComputationKernel instanceof RenderingContextManager757) || !((RenderingContextManager757)abstractComputationKernel).S().equals(string)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataSerializationManager.a(customSystemException);
                }
                abstractComputationKernel.N(bl);
            }
            catch (CustomSystemException customSystemException) {
                throw DataSerializationManager.a(customSystemException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void y() {
        if (this.MA != null) {
            GraphicalRenderingController.z(this.MA);
            this.MA = null;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    this.MX.forEach(arg_0 -> DataSerializationManager.lambda$onSettingsBack$0(arrayList, arg_0));
                    if (arrayList.size() != 1 || !(arrayList.get(0) instanceof RenderingContextManager757)) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataSerializationManager.a(customSystemException);
                }
                this.M3.x();
                this.X();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DataSerializationManager.a(customSystemException);
            }
        }
        try {
            if (this.Mo == null) return;
            this.Y();
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public List<AbstractComputationKernel> o() {
        return this.MX;
    }

    public PrecisionMeasurementCalibrator G() {
        return this.Mo;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataSerializationManager.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataSerializationManager.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataSerializationManager.m(l, l2);
            object = ub[n];
            try {
                if (!(object instanceof String)) break block2;
                DataSerializationManager.ub[n] = clazz = Class.forName(vb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataSerializationManager.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = DataSerializationManager.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataSerializationManager.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
                DataSerializationManager.ab = MultiContainerRegistry.a(-467743091064023521L, -1914197668021153591L, MethodHandles.lookup().lookupClass()).a(233835358186736L);
                DataSerializationManager.ub = new Object[5];
                DataSerializationManager.vb = new String[5];
                DataSerializationManager.db();
                DataSerializationManager.qb = new HashMap<K, V>(13);
                var0 = DataSerializationManager.ab ^ 41413460184236L;
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
                var6_5 = "Y\u0081_\u00f6<\u00f5\u0010\u00a7v\u0089k\\7\u00a0x\u0086 \u00c5\u0004J\u00a3\u008c;mHK\u00eb+*\u000e\u00a5\u00c9\u0097IP\u009a\u00df\u00db\u00b6\u001a";
                var7_6 = "Y\u0081_\u00f6<\u00f5\u0010\u00a7v\u0089k\\7\u00a0x\u0086 \u00c5\u0004J\u00a3\u008c;mHK\u00eb+*\u000e\u00a5\u00c9\u0097IP\u009a\u00df\u00db\u00b6\u001a".length();
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
                    var6_5 = "\u008b\u00f2\u00fa\u0000\u00f7\u00fa\f\u008e\u00a5\u001c\u00fa\u00dd\u00fe\u00c9\u00d5\u00b0";
                    var7_6 = "\u008b\u00f2\u00fa\u0000\u00f7\u00fa\f\u008e\u00a5\u001c\u00fa\u00dd\u00fe\u00c9\u00d5\u00b0".length();
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
        DataSerializationManager.fb = var8_3;
        DataSerializationManager.lb = new Integer[7];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataSerializationManager.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void X() {
        try {
            if (this.Mo != null) {
                GraphicalRenderingController.z(this.Mo);
                this.Mo = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
    }

    public void V(AbstractComputationKernel ... abstractComputationKernelArray) {
        this.MX.addAll(Arrays.asList(abstractComputationKernelArray));
        for (AbstractComputationKernel abstractComputationKernel : this.MX) {
            try {
                try {
                    abstractComputationKernel.Q(DataSerializationManager.M.E);
                    if (abstractComputationKernel.k() == null || abstractComputationKernel.k().G() == null) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataSerializationManager.a(customSystemException);
                }
                abstractComputationKernel.Q(DataSerializationManager.M.a);
            }
            catch (CustomSystemException customSystemException) {
                throw DataSerializationManager.a(customSystemException);
            }
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == 'B' || c == '\u00c7' || c == 'G') {
                field = DataSerializationManager.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataSerializationManager.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public GraphicalThemeRenderer L() {
        return this.Mh;
    }

    private void m(AbstractComputationKernel abstractComputationKernel, double d2) {
        abstractComputationKernel.J(true);
        abstractComputationKernel.T(d2);
        abstractComputationKernel.Y(d2);
        for (AbstractComputationKernel abstractComputationKernel2 : abstractComputationKernel.A()) {
            this.m(abstractComputationKernel2, d2);
        }
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    super.d();
                    if (this.MM == null || this.Mo == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataSerializationManager.a(customSystemException);
                }
                this.MM.A();
                this.Mo.A();
            }
            catch (CustomSystemException customSystemException) {
                throw DataSerializationManager.a(customSystemException);
            }
        }
    }

    @Override
    public String A() {
        return this.MO;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void lambda$onSettingsBack$0(ArrayList arrayList, AbstractComputationKernel abstractComputationKernel) {
        try {
            if (abstractComputationKernel.f()) {
                arrayList.add(abstractComputationKernel);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataSerializationManager.a(customSystemException);
        }
    }

    @Override
    public void A() {
        super.h(true);
        this.N().z();
    }

    private static Method p(long l, long l2) {
        int n = DataSerializationManager.m(l, l2);
        Object object = ub[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = vb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataSerializationManager.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataSerializationManager.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataSerializationManager.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataSerializationManager.ub[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataSerializationManager.n(237805362594133L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataSerializationManager.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataSerializationManager.ub[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataSerializationManager.n(237805362594133L, 0L);
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
    public boolean W() {
        return this.M2;
    }

    public DataSerializationManager(String string, String string2) {
        this(string, string2, true, true);
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4000;
        if (lb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])qb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    qb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataSerializationManager.lb[n2] = n3;
        }
        return lb[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataSerializationManager.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataSerializationManager.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

