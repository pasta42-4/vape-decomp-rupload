/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import a.JF;
import a.bE;
import com.app.concurrency.management.ThreadLifecycleManager;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.events.EventDispatchController2308;
import com.app.math.NumericStreamProcessor;
import com.app.transformation.DataTransformationEngine1794;
import com.collections.management.MultiContainerRegistry;
import com.config.parameters.ParameterConfigurationHandler;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.obfuscation.NumericScrambler;
import com.exception.system.CustomSystemException;
import com.game.core.GameStateManager;
import com.graphics.config.RenderConfigurationManager1114;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.processing.numeric.NumericTransformationEngine434;
import com.security.config.CryptoConfigurationEnum;
import com.security.configuration.SecurityEnumRegistry;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.token.CryptographicTokenManager1032;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
public class ConfigurationProfileManager
extends GraphicalRenderEngine1082 {
    private static final Map fb;
    private SymmetricCipherManager H_;
    private final RenderConfigurationManager1114 Hm;
    private boolean Hz;
    private NumericTransformationEngine434 HM;
    private static final Integer[] eb;
    private bE Hx;
    private static final long ab;
    private bE Hw;
    private SymmetricCipherManager Ht;
    private static final long[] bb;
    private boolean HI;
    private final NumericStreamProcessor HY;
    private bE H3;
    private final GameStateManager HE;
    private final UserIdentityManager HV;
    private static final Object[] lb;
    private CryptographicSecurityManager396 HO;
    private GraphicalThemeRenderer H4;
    private GraphicalThemeRenderer Hy;
    private final NumericStreamProcessor HB;
    private static final String[] mb;
    private GraphicalThemeRenderer HD;
    private final GraphicalRenderEngine1082 HZ;

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationProfileManager.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private String f() {
        String string;
        long l = ab ^ 0x222549958731L;
        ApplicationColorSchemeManager applicationColorSchemeManager = this.HV.h();
        try {
            if (applicationColorSchemeManager == ApplicationColorSchemeManager.OFFLINE) {
                return applicationColorSchemeManager.e();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
        String string2 = "";
        String string3 = null;
        Object object = "";
        if (this.HV.W()) {
            string3 = this.HV.X();
        }
        if (string3 != null) {
            string2 = string3;
            object = ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)14490, (long)(0x68331D17C3F4CFBAL ^ l)), (long)1971591025623210116L, (long)l);
        }
        if ((string = this.HV.V()) != null) {
            string2 = string2 + (String)object + string;
        } else if (string3 == null) {
            string2 = string2 + (String)object + applicationColorSchemeManager.e();
        }
        return string2;
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
    public void o(boolean bl) {
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ConfigurationProfileManager(UserIdentityManager userIdentityManager) {
        long l = ab ^ 0x3F28B0DCD3ECL;
        super(99.0, 24.0);
        this.Hm = new RenderConfigurationManager1114(99.0, 24.0);
        this.HZ = new GraphicalRenderEngine1082(20.0, 15.0);
        this.HM = new NumericTransformationEngine434(this);
        this.HY = new NumericStreamProcessor(0.15, 0.0, 180.0);
        this.HB = new NumericStreamProcessor(0.15, 0.0, 180.0);
        this.Hz = false;
        this.Hy = new HardwareYield((String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)19408, (long)(0x156B50BD8C28E820L ^ l)), (long)5728968616667761753L, (long)l)), 1.0, new Color(0, 0, 0, 0), ConfigurationProfileManager.M.S, 10.0, 10.0);
        this.H4 = new HardwareYield((String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)26379, (long)(0x75710E52BCCA44FEL ^ l)), (long)5728968616667761753L, (long)l)), 0.5, new Color(0, 0, 0, 0), ConfigurationProfileManager.M.S, 8.0, 8.0);
        this.HD = new HardwareYield((String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)21275, (long)(0x605CDA39136770E0L ^ l)), (long)5728968616667761753L, (long)l)), 0.5, new Color(0, 0, 0, 0), ConfigurationProfileManager.M.S, 8.0, 8.0);
        this.Hx = new bE(0.0, 0.0);
        this.H3 = new bE(10.0, 0.0);
        this.Hw = new bE(6.0, 2.0);
        this.H_ = new SymmetricCipherManager(20.0);
        this.Ht = new ThreadLifecycleManager(this, 20.0);
        this.HV = userIdentityManager;
        this.HE = new GameStateManager(this, this.HV);
        this.HO = new CryptographicSecurityManager396(userIdentityManager.j(), (String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)18938, (long)(0x6A7D35BEEFECEA03L ^ l)), (long)5728968616667761753L, (long)l)), (String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)6643, (long)(0x720E57A7D0AABA0DL ^ l)), (long)5728968616667761753L, (long)l)), 75.0, 0.8, ConfigurationProfileManager.M.c, false, false);
        this.Hm.l(new EventDispatchController2308(this));
        this.Hm.i(false);
        this.HZ.i(false);
        this.HZ.n(this.H_, new Object[0]);
        this.HZ.n(this.Ht, new Object[0]);
        this.HZ.d().J(true);
        this.H_.o(this.Hw, this.Hy);
        this.Ht.o(this.H3, this.HD, this.Hx, this.H4);
        this.HD.g((String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)26653, (long)(0xB24E6B0CF27CBE2L ^ l)), (long)5728968616667761753L, (long)l)));
        this.H4.g((String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)14974, (long)(0x391D6B4AD82D1989L ^ l)), (long)5728968616667761753L, (long)l)));
        this.H_.N(false);
        this.Hm.o(new bE(18.0, 0.0), this.HO);
        this.Hm.n(this.HZ, ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)19705, (long)(0x2FE16A47CF74EF0DL ^ l)), (long)5728968616667761753L, (long)l));
        this.d().f((String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)11883, (long)(0xAAA42998EFE0D97L ^ l)), (long)5728968616667761753L, (long)l)));
        this.i(false);
        this.HE.N(false);
        this.o(this.Hm, this.HE);
        this.H_.i(false);
        this.Ht.i(false);
        this.Ht.N(false);
    }

    public void x() {
        block18: {
            boolean bl;
            bE bE2;
            JF jF;
            boolean bl2;
            boolean bl3;
            block22: {
                boolean bl4;
                block21: {
                    boolean bl5;
                    block20: {
                        block19: {
                            boolean bl6;
                            block17: {
                                try {
                                    if (!this.Hz) break block17;
                                    this.K().O();
                                    this.H_.N(true);
                                    this.Ht.N(false);
                                    this.HE.N(true);
                                    break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationProfileManager.a(customSystemException);
                                }
                            }
                            try {
                                this.K().Z();
                                this.H_.N(false);
                                this.Ht.N(true);
                                bl6 = TemporalMetadataResolver.h.O().p().Q() != null;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileManager.a(customSystemException);
                            }
                            bl3 = bl6;
                            try {
                                try {
                                    if (!bl3 || !TemporalMetadataResolver.h.O().p().Q().u().contains(this.HV)) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationProfileManager.a(customSystemException);
                                }
                                bl5 = true;
                                break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileManager.a(customSystemException);
                            }
                        }
                        bl5 = false;
                    }
                    boolean bl7 = bl5;
                    try {
                        try {
                            try {
                                if (!bl3 || bl7) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileManager.a(customSystemException);
                            }
                            if (!this.HV.h().equals((Object)ApplicationColorSchemeManager.ONLINE)) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationProfileManager.a(customSystemException);
                        }
                        bl4 = true;
                        break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileManager.a(customSystemException);
                    }
                }
                bl4 = bl2 = false;
            }
            if (bl3 && (jF = TemporalMetadataResolver.h.O().p().Q()).H().contains(this.HV)) {
                bl2 = false;
            }
            boolean bl8 = this.HV.Z();
            this.H4.N(bl8);
            this.HD.N(bl2);
            boolean bl9 = bl8 ^ bl2;
            try {
                this.H3.N(bl9);
                bE2 = this.Hx;
                bl = !bl9;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileManager.a(customSystemException);
            }
            bE2.N(bl);
            this.HE.N(this.HI);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationProfileManager.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationProfileManager.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void d() {
        boolean bl;
        NumericStreamProcessor numericStreamProcessor;
        block8: {
            block7: {
                try {
                    try {
                        numericStreamProcessor = this.HB;
                        if (!this.s() && !this.Hz) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileManager.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileManager.a(customSystemException);
                }
            }
            bl = false;
        }
        try {
            numericStreamProcessor.C(bl);
            if (this.Hz) {
                this.O().G(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == 'D' || c == '\u00a3' || c == 'L') {
                field = ConfigurationProfileManager.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationProfileManager.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public GraphicalThemeRenderer X() {
        return this.H4;
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.Hz ? 24.0 + this.HE.b() : super.z();
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
        return d2;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationProfileManager.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "`\tl";
        objectArray[1] = Integer.TYPE;
        ConfigurationProfileManager.mb[1] = "java/lang/Integer";
        objectArray[2] = "0}\tT\u0001\u0002;r\u0018\u001b|\u001a(u\u0011R";
        objectArray[3] = "\u000e\u0017\tpMa\u0005\u0018\u0018?,o\u000e\u0013\u001ce";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "1,V\u0000\b(k+[:\u001c\"Zo\u0001UJ#&+\u000e\u0002\u0019Yc2N\u0000\u001c6k2^Zw";
    }

    public GraphicalThemeRenderer K() {
        return this.HD;
    }

    private static Field k(long l, long l2) {
        int n = ConfigurationProfileManager.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationProfileManager.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationProfileManager.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationProfileManager.e(clazz3, string2, clazz2)) != null) {
                    ConfigurationProfileManager.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationProfileManager.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationProfileManager.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationProfileManager.j(234071002336709L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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
                n3 = 11;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 31;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 16;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 24;
                break;
            }
            case 8: {
                n3 = 22;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 26;
                break;
            }
            case 14: {
                n3 = 62;
                break;
            }
            case 15: {
                n3 = 60;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 55;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 7;
                break;
            }
            case 26: {
                n3 = 23;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 49;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 21;
                break;
            }
            case 33: {
                n3 = 35;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 30;
                break;
            }
            case 36: {
                n3 = 15;
                break;
            }
            case 37: {
                n3 = 59;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 58;
                break;
            }
            case 40: {
                n3 = 1;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 25;
                break;
            }
            case 45: {
                n3 = 14;
                break;
            }
            case 46: {
                n3 = 39;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 33;
                break;
            }
            case 53: {
                n3 = 56;
                break;
            }
            case 54: {
                n3 = 27;
                break;
            }
            case 55: {
                n3 = 40;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 50;
                break;
            }
            case 59: {
                n3 = 53;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 42;
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
        ConfigurationProfileManager.mb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void w(ConfigurationProfileManager configurationProfileManager, SecurityEnumRegistry securityEnumRegistry) {
        configurationProfileManager.Q(securityEnumRegistry);
    }

    public UserIdentityManager O() {
        return this.HV;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationProfileManager.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationProfileManager.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public GameStateManager K() {
        return this.HE;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C7C;
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
                throw new RuntimeException("a/wW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationProfileManager.eb[n2] = n3;
        }
        return eb[n2];
    }

    @Override
    public void E() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        String string;
        NumericTransformationEngine434 numericTransformationEngine434;
        Color color2;
        CryptographicSecurityManager396 cryptographicSecurityManager396;
        double d6;
        double d7;
        CryptographicSecurityManager396 cryptographicSecurityManager3962;
        boolean bl;
        block24: {
            Color color3;
            float f;
            float f2;
            float f3;
            float f4;
            NumericScrambler numericScrambler;
            block26: {
                block25: {
                    Object object;
                    CryptographicTokenManager1032 cryptographicTokenManager1032;
                    block23: {
                        long l;
                        block22: {
                            Color color4;
                            double d8;
                            double d9;
                            double d10;
                            double d11;
                            l = ab ^ 0x362BF92DF154L;
                            try {
                                if (this.Hz) {
                                    ConfigurationManager.A(this.G() - 3.0, this.W() - 3.0, this.w() + 6.0, this.b() + 6.0, ConfigurationProfileManager.M.W);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileManager.a(customSystemException);
                            }
                            bl = this.HV.h().equals((Object)ApplicationColorSchemeManager.ONLINE);
                            int n = Math.max(this.HY.t().intValue(), this.HB.t().intValue());
                            try {
                                d11 = this.G();
                                d10 = this.W();
                                d9 = this.w();
                                d8 = this.b() - 2.5;
                                color4 = bl ? ConfigurationProfileManager.M.g : new Color(27, 27, 27);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileManager.a(customSystemException);
                            }
                            try {
                                try {
                                    ConfigurationManager.S(d11, d10, d9, d8, color4);
                                    ConfigurationManager.U(this.G(), this.W(), this.w(), this.b() - 2.5, new Color(40, 40, 40, n), 3.0f, 1.0f, 1.0f);
                                    cryptographicTokenManager1032 = CryptographicTokenManager1032.r();
                                    if (!this.HV.W() || this.HV.h().equals((Object)ApplicationColorSchemeManager.OFFLINE)) break block22;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationProfileManager.a(customSystemException);
                                }
                                object = this.HV.X();
                                break block23;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileManager.a(customSystemException);
                            }
                        }
                        object = ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)10331, (long)(0x529CFC219E3CA91BL ^ l)), (long)7870440129555787489L, (long)l);
                    }
                    numericScrambler = cryptographicTokenManager1032.j((String)object, 32);
                    try {
                        try {
                            if (numericScrambler == null) break block24;
                            numericScrambler.p();
                            ConfigurationManager.r((float)this.G() + 4.0f, (float)this.W() + 5.0f, 11.0f, 1.5f, 1.0f, this.HV.h().X());
                            f4 = (float)this.G() + 5.0f;
                            f3 = (float)this.W() + 6.0f;
                            f2 = 9.0f;
                            f = 1.0f;
                            if (!bl) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationProfileManager.a(customSystemException);
                        }
                        color3 = Color.WHITE;
                        break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileManager.a(customSystemException);
                    }
                }
                color3 = new Color(255, 255, 255, 150);
            }
            ConfigurationManager.c(f4, f3, f2, f, color3, numericScrambler);
        }
        try {
            this.HO.d(this.HV.j());
            cryptographicSecurityManager3962 = this.HO;
            d7 = 79.0 - this.Ht.q();
            d6 = this.H_.f() ? this.H_.q() - this.Hw.w() + 3.0 : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
        try {
            cryptographicSecurityManager3962.a(d7 - d6);
            cryptographicSecurityManager396 = this.HO;
            color2 = bl ? ConfigurationProfileManager.M.c : new Color(110, 110, 110);
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
        try {
            cryptographicSecurityManager396.S(color2);
            this.HO.M(this.W() + 4.0);
            numericTransformationEngine434 = this.HM;
            string = this.f();
            d5 = this.G() + 18.0;
            d4 = this.W() + 12.0;
            d3 = this.w() - 18.0 - 4.0;
            d2 = 0.7;
            color = bl ? ConfigurationProfileManager.M.w : new Color(68, 68, 68);
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
        try {
            numericTransformationEngine434.g(string, d5, d4, d3, d2, color);
            super.E();
            this.x();
            if (this.HV.B()) {
                ConfigurationManager.T(this.H4.G() + 5.5, this.H4.W() + 0.5, 2.0, 1.0, ConfigurationProfileManager.M.O);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager.a(customSystemException);
        }
    }

    public GraphicalThemeRenderer l() {
        return this.Hy;
    }

    public void M(boolean bl) {
        this.Hz = bl;
        this.x();
    }

    private void Q(SecurityEnumRegistry securityEnumRegistry) {
        block11: {
            block10: {
                boolean bl;
                long l = ab ^ 0x7D56B30AD00AL;
                try {
                    if (securityEnumRegistry.equals((Object)SecurityEnumRegistry.RIGHT_CLICK)) {
                        ParameterConfigurationHandler.q(this.O().j());
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.SUCCESS, (String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)19904, (long)(0x389372FB586FEDD0L ^ l)), (long)5505405235222400959L, (long)l)) + this.O().j() + (String)((Object)ConfigurationProfileManager.d("\u00a5", (int)ConfigurationProfileManager.c("i", (int)26475, (long)(0x5AC59503496F4777L ^ l)), (long)5505405235222400959L, (long)l))));
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileManager.a(customSystemException);
                }
                try {
                    if (this.Hz) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileManager.a(customSystemException);
                }
                try {
                    ConfigurationProfileManager configurationProfileManager = this;
                    bl = !this.HI;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileManager.a(customSystemException);
                }
                try {
                    configurationProfileManager.HI = bl;
                    this.HE.N(this.HI);
                    if (!this.HI) break block10;
                    this.P(this.Hm.b() + this.HE.b());
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileManager.a(customSystemException);
                }
            }
            this.P(24.0);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationProfileManager.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationProfileManager.f(classArray2[i], string, clazz2, n, classArray);
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
                ConfigurationProfileManager.ab = MultiContainerRegistry.a(-2804926514732541172L, -5147622411788760617L, MethodHandles.lookup().lookupClass()).a(75555085361020L);
                ConfigurationProfileManager.lb = new Object[5];
                ConfigurationProfileManager.mb = new String[5];
                ConfigurationProfileManager.D();
                ConfigurationProfileManager.fb = new HashMap<K, V>(13);
                var0 = ConfigurationProfileManager.ab ^ 44476714681800L;
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
                var6_5 = "\u00f9X\u0016D\u00ec\u00ed6\u00e7m\u00a6\u00f7_\u0014\u0088\u0017[\u00a7\u00f2U\u00b8\b\u009c\u00df\u00fd\u00ba\u00fcQwP\u00c3Lh\u00c4=\u0003`\\O\u00afS`y^p\u00fb\u00d5\u008er\u00f4w\u009cz6*\f\u00d2\u008c\u008fes-\u0099\u009a(\u0006I\u001b\u0013[\u008b\u00db\u00d8\u0012A\u001b\u008a\u0096\u0093>\u001e\u00d2E\u00c2\u00d3\u00ef\u00a2\u00ef\u00c6";
                var7_6 = "\u00f9X\u0016D\u00ec\u00ed6\u00e7m\u00a6\u00f7_\u0014\u0088\u0017[\u00a7\u00f2U\u00b8\b\u009c\u00df\u00fd\u00ba\u00fcQwP\u00c3Lh\u00c4=\u0003`\\O\u00afS`y^p\u00fb\u00d5\u008er\u00f4w\u009cz6*\f\u00d2\u008c\u008fes-\u0099\u009a(\u0006I\u001b\u0013[\u008b\u00db\u00d8\u0012A\u001b\u008a\u0096\u0093>\u001e\u00d2E\u00c2\u00d3\u00ef\u00a2\u00ef\u00c6".length();
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
                    var6_5 = "1\u0011\u0088T;\u00d0\u00d1\u00e6W\u007f\u00930\u00f4\u0095\u009b\u000f";
                    var7_6 = "1\u0011\u0088T;\u00d0\u00d1\u00e6W\u007f\u00930\u00f4\u0095\u009b\u000f".length();
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
        ConfigurationProfileManager.bb = var8_3;
        ConfigurationProfileManager.eb = new Integer[13];
    }

    static SymmetricCipherManager C(ConfigurationProfileManager configurationProfileManager) {
        return configurationProfileManager.Ht;
    }

    private static Method l(long l, long l2) {
        int n = ConfigurationProfileManager.i(l, l2);
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
                clazz3 = ConfigurationProfileManager.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationProfileManager.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationProfileManager.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationProfileManager.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationProfileManager.j(234071002336709L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationProfileManager.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationProfileManager.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationProfileManager.j(234071002336709L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationProfileManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationProfileManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

