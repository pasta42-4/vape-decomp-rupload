/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.C_;
import a.JF;
import a.bE;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.sensors.SensorCalibrationHandler;
import com.app.transformation.DataTransformationEngine1794;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadSynchronizationController;
import com.encoding.strategy.EncodingScheme;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.network.configuration.NetworkConfigurationManager1825;
import com.network.protocol.CommunicationProtocolValidator;
import com.network.protocol.ConnectionEstablisher1885;
import com.network.protocol.NetworkProtocolEncoder1226;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.config.CryptoConfigurationEnum;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherContextManager1101;
import com.sensor.processing.SensorDataInterpreter;
import com.stream.processing.StreamProcessor;
import com.system.resource.ResourceAllocationController1969;
import com.system.tasks.BackgroundTaskProcessor;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.ApplicationColorSchemeManager;
import com.user.identity.UserIdentityManager;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class wz
extends GraphicalRenderEngine1082 {
    private static final Integer[] eb;
    private static final long[] bb;
    private final SensorDataInterpreter t2;
    private final SensorCalibrationHandler tQ;
    private final UserIdentityManager tj;
    private static final long ab;
    private boolean tP;
    private boolean tU;
    private final AuthenticationStateTracker tp;
    private static final Object[] lb;
    private final SensorCalibrationHandler tb;
    private static final Map fb;
    private final AdaptiveCipherEngine t6;
    private static final String[] mb;

    private void lambda$null$2(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        this.z(userIdentityManager, streamProcessor);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void z(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        long l = ab ^ 0x17B6B313F1C1L;
        try {
            switch (CommunicationProtocolValidator.J[streamProcessor.l().ordinal()]) {
                case 1: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.SUCCESS, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)4936, (long)(0x6E11D8260746D83AL ^ l)), (long)-1587503551491532520L, (long)l)) + userIdentityManager.j() + (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)10613, (long)(0x13B1E218743C6211L ^ l)), (long)-1587503551491532520L, (long)l))));
                    return;
                }
                case 2: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)17157, (long)(0x48B69BAE133F8876L ^ l)), (long)-1587503551491532520L, (long)l))));
                    return;
                }
                case 3: 
                case 4: 
                case 5: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)11073, (long)(0x3D7546CA58CDE03BL ^ l)), (long)-1587503551491532520L, (long)l)) + userIdentityManager.j() + (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)8555, (long)(0xE61AC01E09A6A17L ^ l)), (long)-1587503551491532520L, (long)l))));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException customSystemException) {
            throw wz.a(customSystemException);
        }
    }

    @Override
    public void E() {
        super.E();
    }

    public wz(UserIdentityManager userIdentityManager) {
        Color color;
        double d2;
        ColorPaletteRenderer colorPaletteRenderer;
        ColorPaletteRenderer colorPaletteRenderer2;
        SensorCalibrationHandler sensorCalibrationHandler;
        boolean bl;
        long l;
        block22: {
            block21: {
                boolean bl2;
                boolean bl3;
                block19: {
                    block18: {
                        boolean bl4;
                        boolean bl5;
                        block17: {
                            block16: {
                                l = ab ^ 0x20F2597D663FL;
                                super(99.0, 35.0);
                                this.tQ = new SensorCalibrationHandler((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)9517, (long)(0x345DE63EA0C79A7L ^ l)), (long)9081010203272646374L, (long)l)), 0.2, 20.0, 13.0, wz.M.O, 0.9);
                                this.tb = new ConnectionEstablisher1885(this, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)1376, (long)(0x50F1B6778E3F59E1L ^ l)), (long)9081010203272646374L, (long)l)), 0.2, 20.0, 13.0, wz.M.Y, 0.9);
                                this.t2 = new SensorDataInterpreter((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)31250, (long)(0x1C77C826A3B6269DL ^ l)), (long)9081010203272646374L, (long)l)), 0.7, false, 46.0, 13.0, wz.M.Y, 0.9);
                                this.tp = new ResourceAllocationController1969(this, (Object)null, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)4965, (long)(0x481668215CF7CFE2L ^ l)), (long)9081010203272646374L, (long)l)), false);
                                this.t6 = new AdaptiveCipherEngine((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)11914, (long)(0x1AE2B5E365BC720FL ^ l)), (long)9081010203272646374L, (long)l)), 0.8, this.tp);
                                this.tP = false;
                                this.tj = userIdentityManager;
                                bl5 = TemporalMetadataResolver.h.O().p().Q() != null;
                                try {
                                    try {
                                        if (!bl5 || !TemporalMetadataResolver.h.O().p().Q().u().contains(userIdentityManager)) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw wz.a(customSystemException);
                                    }
                                    bl4 = true;
                                    break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw wz.a(customSystemException);
                                }
                            }
                            bl4 = false;
                        }
                        bl3 = bl4;
                        try {
                            try {
                                if (!bl5 || !TemporalMetadataResolver.h.O().p().Q().H().contains(userIdentityManager)) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw wz.a(customSystemException);
                            }
                            bl2 = true;
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                boolean bl6 = bl2;
                try {
                    block20: {
                        try {
                            try {
                                wz wz2 = this;
                                if (userIdentityManager.h().equals((Object)ApplicationColorSchemeManager.OFFLINE) || bl3) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw wz.a(customSystemException);
                            }
                            if (!bl6) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw wz.a(customSystemException);
                }
            }
            bl = false;
        }
        try {
            ColorPaletteRenderer colorPaletteRenderer3;
            wz2.tU = bl;
            sensorCalibrationHandler = this.tb;
            colorPaletteRenderer2 = colorPaletteRenderer3;
            colorPaletteRenderer = colorPaletteRenderer3;
            d2 = 0.15;
            color = this.tU ? wz.M.g : new Color(45, 45, 45);
        }
        catch (CustomSystemException customSystemException) {
            throw wz.a(customSystemException);
        }
        colorPaletteRenderer2(d2, color, this.tU ? wz.M.g : this.tb.k());
        sensorCalibrationHandler.p(colorPaletteRenderer);
        this.tb.R(new ColorPaletteRenderer(0.15, this.tU ? wz.M.K : wz.M.Z, this.tU ? wz.M.K : wz.M.q));
        this.tp.H(userIdentityManager.h());
        this.i(false);
        this.t6.J(true);
        this.t6.T(90.0);
        this.t6.Y(90.0);
        this.t6.i(false);
        this.d().f((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)13612, (long)(0x37BDE251BA8C69ACL ^ l)), (long)9081010203272646374L, (long)l)));
        this.tQ.g((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)2530, (long)(0x2C93EE62A32F557AL ^ l)), (long)9081010203272646374L, (long)l)));
        this.tb.g((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)21245, (long)(0x1408BCC935A40E74L ^ l)), (long)9081010203272646374L, (long)l)));
        this.t6.g((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)7810, (long)(0x2F23F7C28874420AL ^ l)), (long)9081010203272646374L, (long)l)));
        this.z();
        this.tb.N(() -> this.lambda$new$6(userIdentityManager));
        this.o(new bE(99.0, 1.0), new bE(6.0, 1.0), this.tQ, new bE(2.0, 1.0), this.tb, new bE(2.0, 1.0), this.t2, new bE(99.0, 2.0), new bE(2.0, 1.0), this.t6);
    }

    @Override
    public void d() {
        block27: {
            Color color;
            double d2;
            ColorPaletteRenderer colorPaletteRenderer;
            ColorPaletteRenderer colorPaletteRenderer2;
            SensorCalibrationHandler sensorCalibrationHandler;
            block29: {
                block28: {
                    boolean bl;
                    block26: {
                        block25: {
                            boolean bl2;
                            boolean bl3;
                            block23: {
                                block22: {
                                    boolean bl4;
                                    boolean bl5;
                                    block21: {
                                        block20: {
                                            boolean bl6;
                                            try {
                                                super.d();
                                                bl6 = TemporalMetadataResolver.h.O().p().Q() != null;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw wz.a(customSystemException);
                                            }
                                            bl5 = bl6;
                                            try {
                                                try {
                                                    if (!bl5 || !TemporalMetadataResolver.h.O().p().Q().u().contains(this.tj)) break block20;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw wz.a(customSystemException);
                                                }
                                                bl4 = true;
                                                break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw wz.a(customSystemException);
                                            }
                                        }
                                        bl4 = false;
                                    }
                                    bl3 = bl4;
                                    try {
                                        try {
                                            if (!bl5 || !TemporalMetadataResolver.h.O().p().Q().H().contains(this.tj)) break block22;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw wz.a(customSystemException);
                                        }
                                        bl2 = true;
                                        break block23;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw wz.a(customSystemException);
                                    }
                                }
                                bl2 = false;
                            }
                            boolean bl7 = bl2;
                            try {
                                block24: {
                                    try {
                                        try {
                                            if (this.tj.h().equals((Object)ApplicationColorSchemeManager.OFFLINE) || bl3) break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw wz.a(customSystemException);
                                        }
                                        if (!bl7) break block25;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw wz.a(customSystemException);
                                    }
                                }
                                bl = true;
                                break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw wz.a(customSystemException);
                            }
                        }
                        bl = false;
                    }
                    boolean bl8 = bl;
                    try {
                        try {
                            ColorPaletteRenderer colorPaletteRenderer3;
                            if (this.tU == bl8) break block27;
                            this.tU = bl8;
                            sensorCalibrationHandler = this.tb;
                            colorPaletteRenderer2 = colorPaletteRenderer3;
                            colorPaletteRenderer = colorPaletteRenderer3;
                            d2 = 0.15;
                            if (!this.tU) break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                        color = wz.M.g;
                        break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw wz.a(customSystemException);
                    }
                }
                color = new Color(45, 45, 45);
            }
            colorPaletteRenderer2(d2, color, this.tU ? wz.M.g : this.tb.k());
            sensorCalibrationHandler.p(colorPaletteRenderer);
            this.tb.R(new ColorPaletteRenderer(0.15, this.tU ? wz.M.K : wz.M.Z, this.tU ? wz.M.K : wz.M.q));
        }
    }

    private void lambda$null$0(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        this.z(userIdentityManager, streamProcessor);
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

    @Override
    public double z() {
        return 35.0;
    }

    private void lambda$null$9(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        SecureContextBroker572.h().c().f(this.tj.s(), this::lambda$null$7, this::lambda$null$8);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = wz.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void lambda$null$5() {
        this.tP = false;
    }

    private void z() {
        this.tQ.N(this::lambda$addDeleteListener$11);
    }

    private void lambda$null$8() {
        this.tP = false;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = wz.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                wz.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public SensorDataInterpreter F() {
        return this.t2;
    }

    private void lambda$addDeleteListener$11() {
        long l = ab ^ 0x5E7FA72A20F8L;
        try {
            if (this.tP) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw wz.a(customSystemException);
        }
        this.tP = true;
        C_ c_ = new C_((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)27953, (long)(0x2DA7223AE8807775L ^ l)), (long)4089624872426457121L, (long)l)), (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)23006, (long)(0x3DBB20BA8CE84380L ^ l)), (long)4089624872426457121L, (long)l)), (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)226, (long)(0x2A3E9EAEEB021AAEL ^ l)), (long)4089624872426457121L, (long)l)));
        NetworkConfigurationManager1825 networkConfigurationManager1825 = GraphicalRenderingController.v(this.V(), c_, NetworkConfigurationManager1825.class);
        c_.Z().N(() -> this.lambda$null$9(networkConfigurationManager1825));
        c_.u().N(() -> this.lambda$null$10(networkConfigurationManager1825));
        networkConfigurationManager1825.l(new BackgroundTaskProcessor(this, networkConfigurationManager1825));
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x228F;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wz.eb[n2] = n3;
        }
        return eb[n2];
    }

    private void lambda$null$3() {
        this.tP = false;
    }

    @Override
    public double e() {
        return 99.0;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 't' || c == 'C' || c == '\u00d4' || c == 'R') {
                field = wz.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wz.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$new$6(UserIdentityManager userIdentityManager) {
        block20: {
            block18: {
                JF jF;
                long l;
                block19: {
                    block17: {
                        l = ab ^ 0x7E7559FA73FBL;
                        try {
                            if (this.tP) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                        try {
                            if (userIdentityManager.h() == ApplicationColorSchemeManager.OFFLINE) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                        this.tP = true;
                        jF = TemporalMetadataResolver.h.O().p().Q();
                        try {
                            try {
                                if (jF == null || jF.X()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw wz.a(customSystemException);
                            }
                            this.tP = false;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (jF == null) break block18;
                            if (!jF.u().contains(userIdentityManager)) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw wz.a(customSystemException);
                        }
                        this.tP = false;
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)11427, (long)(0x7D65A969CE2AE5E9L ^ l)), (long)7764878854782753570L, (long)l))));
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw wz.a(customSystemException);
                    }
                }
                try {
                    if (jF.H().contains(userIdentityManager)) {
                        this.tP = false;
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)17671, (long)(0x217A5677D1820C45L ^ l)), (long)7764878854782753570L, (long)l))));
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw wz.a(customSystemException);
                }
                SecureContextBroker572.h().c().l(userIdentityManager.s(), arg_0 -> this.lambda$null$0(userIdentityManager, arg_0), this::lambda$null$1);
                break block20;
            }
            SecureContextBroker572.h().c().W(arg_0 -> this.lambda$null$4(userIdentityManager, arg_0), this::lambda$null$5);
        }
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = wz.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = wz.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static boolean Z(wz wz2) {
        return wz2.tU;
    }

    private void lambda$null$4(UserIdentityManager userIdentityManager, NetworkProtocolEncoder1226 networkProtocolEncoder1226) {
        try {
            if (networkProtocolEncoder1226.c() == EncodingScheme.SUCCESS) {
                this.tP = true;
                SecureContextBroker572.h().c().l(userIdentityManager.s(), arg_0 -> this.lambda$null$2(userIdentityManager, arg_0), this::lambda$null$3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw wz.a(customSystemException);
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = wz.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = wz.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void lambda$null$10(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        this.tP = false;
    }

    private void lambda$null$7(ThreadSynchronizationController threadSynchronizationController) {
        block3: {
            block2: {
                try {
                    if (threadSynchronizationController.T()) break block2;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw wz.a(customSystemException);
                }
            }
            TemporalMetadataResolver.h.j().y(this.tj.u());
            TemporalMetadataResolver.h.M().f(this.tj);
        }
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 23;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 51;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 21;
                break;
            }
            case 6: {
                n3 = 26;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 45;
                break;
            }
            case 10: {
                n3 = 32;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 36;
                break;
            }
            case 13: {
                n3 = 58;
                break;
            }
            case 14: {
                n3 = 13;
                break;
            }
            case 15: {
                n3 = 52;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 15;
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
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 3;
                break;
            }
            case 25: {
                n3 = 14;
                break;
            }
            case 26: {
                n3 = 11;
                break;
            }
            case 27: {
                n3 = 55;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 35;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 12;
                break;
            }
            case 33: {
                n3 = 8;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 28;
                break;
            }
            case 36: {
                n3 = 33;
                break;
            }
            case 37: {
                n3 = 42;
                break;
            }
            case 38: {
                n3 = 4;
                break;
            }
            case 39: {
                n3 = 39;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 61;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 56;
                break;
            }
            case 46: {
                n3 = 10;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 43;
                break;
            }
            case 49: {
                n3 = 16;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 38;
                break;
            }
            case 52: {
                n3 = 30;
                break;
            }
            case 53: {
                n3 = 49;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 57;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 6;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 53;
                break;
            }
            default: {
                n3 = 44;
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
        wz.mb[n4] = new String(cArray);
        return n4;
    }

    static UserIdentityManager e(wz wz2) {
        return wz2.tj;
    }

    private static Method l(long l, long l2) {
        int n = wz.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = wz.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = wz.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wz.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        wz.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wz.j(234360470440987L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = wz.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        wz.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wz.j(234360470440987L, 0L);
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

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = ";\n\u000e";
        objectArray[1] = Integer.TYPE;
        wz.mb[1] = "java/lang/Integer";
        objectArray[2] = "UIq\u001c\u0003\u0014^F`S~\fMAi\u001a";
        objectArray[3] = "\u0019REJI\u0006\u0012]T\u0005(\b\u0019VP_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "m\u001a\u000e4\u007f4rR\u000eT-=\r\u0019Bd;yqCFe/F4B\u0018;\u007f/l_\u0003lF";
    }

    private void lambda$null$1() {
        this.tP = false;
    }

    private static Field k(long l, long l2) {
        int n = wz.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = wz.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = wz.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wz.e(clazz3, string2, clazz2)) != null) {
                    wz.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = wz.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        wz.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wz.j(234360470440987L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                wz.ab = MultiContainerRegistry.a(7829381748943853436L, 3906270624420337746L, MethodHandles.lookup().lookupClass()).a(21871778927331L);
                wz.lb = new Object[5];
                wz.mb = new String[5];
                wz.x();
                wz.fb = new HashMap<K, V>(13);
                var0 = wz.ab ^ 81496845753284L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "!\u00f6m\u00b9\u00f66\u00e9\n\u00ea\u00e2nY\u00b1\u00a0\u00e3G\u00d1\u00e4\u00b5\u0095\u00b5\u00fa7\u00dfOa\u00a0\u0000E\u00b7r\u00f7\u00de\u009e\u00a7\u00c2\u00e0\u0083\u0019\u00e6\u009e0\u00a7\u00a1\u00a7\\\u0099\u0007\u008a\u0002\u00e5V9.\u00c0\u00ce\u00d5Z\u00a9Hs\u00d9\u0097A\u0014\u001d\u0084T\u0014\u00a7\u00ceL\u0015Tb\u00c5\u00cf\u00d3M}Z\u0080X\u0094\u00ec\u00e9J\u001f\u00f1K\u00e9\u00e7\u00fb\u00eb\u00e0,\u00ac\u0018I\u00cf%\u00ec\u00f7\u00b0\u0004\u00dc\u00e1\u0088\u00e3\u00d5C\f\u00beZ\u0007\u00e8\u0007\u00cc\u00eb\u0086k\u008e\u00ea&\u00d4J\u00b51\u00a9\u0017\u00efWk\u00e6!=";
                var7_6 = "!\u00f6m\u00b9\u00f66\u00e9\n\u00ea\u00e2nY\u00b1\u00a0\u00e3G\u00d1\u00e4\u00b5\u0095\u00b5\u00fa7\u00dfOa\u00a0\u0000E\u00b7r\u00f7\u00de\u009e\u00a7\u00c2\u00e0\u0083\u0019\u00e6\u009e0\u00a7\u00a1\u00a7\\\u0099\u0007\u008a\u0002\u00e5V9.\u00c0\u00ce\u00d5Z\u00a9Hs\u00d9\u0097A\u0014\u001d\u0084T\u0014\u00a7\u00ceL\u0015Tb\u00c5\u00cf\u00d3M}Z\u0080X\u0094\u00ec\u00e9J\u001f\u00f1K\u00e9\u00e7\u00fb\u00eb\u00e0,\u00ac\u0018I\u00cf%\u00ec\u00f7\u00b0\u0004\u00dc\u00e1\u0088\u00e3\u00d5C\f\u00beZ\u0007\u00e8\u0007\u00cc\u00eb\u0086k\u008e\u00ea&\u00d4J\u00b51\u00a9\u0017\u00efWk\u00e6!=".length();
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
                    var6_5 = "C\u008e\u00a5\u00a1\u00ca\u00e4\u001b\u00e3\u00a0\u0094\u000b\u00de(\u0097\u0084\u00d6";
                    var7_6 = "C\u008e\u00a5\u00a1\u00ca\u00e4\u001b\u00e3\u00a0\u0094\u000b\u00de(\u0097\u0084\u00d6".length();
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
        wz.bb = var8_3;
        wz.eb = new Integer[19];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = wz.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(wz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

