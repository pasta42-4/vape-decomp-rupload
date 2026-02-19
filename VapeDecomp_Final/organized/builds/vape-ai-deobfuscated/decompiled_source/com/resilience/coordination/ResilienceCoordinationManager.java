/*
 * Decompiled with CFR 0.152.
 */
package com.resilience.coordination;

import a.Bz;
import a.JF;
import a.bE;
import a.h6;
import com.api.response.ResponseMapper;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.graphics.GraphicsRenderingUtility1454;
import com.app.transformation.DataTransformationEngine1794;
import com.caching.strategy.CacheInvalidationStrategy1973;
import com.collections.management.MultiContainerRegistry;
import com.connection.pool.ConnectionPoolManager;
import com.core.resource.ResourceLifecycleManager1989;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.stream.StreamProcessor1422;
import com.error.handling.ErrorResolutionStrategy;
import com.event.management.EventDispatchCoordinator2458;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.transformation.GeometricTransformationEngine;
import com.network.connection.NetworkConnectionManager1456;
import com.network.connection.NetworkConnectionManager2517;
import com.network.transmission.DataTransmissionChannel;
import com.security.cipher.CipherConfigurationMode984;
import com.security.config.CryptoConfigurationEnum;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherTransformationRegistry;
import com.security.crypto.CipherTransformationType;
import com.security.crypto.CryptoKeyGenerator1662;
import com.security.crypto.CryptographicSecurityManager396;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.UIRenderingCoordinator;
import com.user.identity.UserIdentityManager;
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
public class ResilienceCoordinationManager
extends GraphicalRenderEngine1082 {
    private final SymmetricCipherManager Ul;
    private final boolean UO;
    private final h6 UC;
    private final h6 Us;
    protected UIRenderingCoordinator Ub;
    private static final String[] rb;
    private boolean UV;
    private static final Map lb;
    private static final long ab;
    protected final h6 UD;
    private static final Integer[] fb;
    private CryptographicSecurityManager396 US;
    private static boolean UQ;
    private boolean UE;
    protected final SymmetricCipherManager UG;
    private final h6 UF;
    private final boolean UX;
    private static final long[] eb;
    private static final Object[] qb;
    protected final UserIdentityManager UH;

    public static void r(boolean bl) {
        UQ = bl;
    }

    private void lambda$onKick$3() {
        this.UE = false;
    }

    private void lambda$onPromote$1() {
        this.UE = false;
    }

    private void lambda$onKick$2(JF jF, NetworkConnectionManager1456 networkConnectionManager1456) {
        try {
            if (networkConnectionManager1456.S() == CipherTransformationRegistry.SUCCESS) {
                jF.F(this.UH);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
    }

    @Override
    public void G() {
        super.G();
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$onPromote$0(JF jF, ResponseMapper responseMapper) {
        try {
            if (responseMapper.K() == CipherConfigurationMode984.SUCCESS) {
                jF.u(this.UH);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e0' || c == 'X' || c == '\u00c6' || c == '\u00d6') {
                field = ResilienceCoordinationManager.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResilienceCoordinationManager.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public ResilienceCoordinationManager(UserIdentityManager userIdentityManager, boolean bl, boolean bl2) {
        long l = ab ^ 0x120FC8937940L;
        super(99.0, 20.0);
        this.Ul = new SymmetricCipherManager(70.0);
        this.UF = new DataTransmissionChannel(this, (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)15240, (long)(0x5053F2DCA338E14DL ^ l)), (long)-4041360356580261025L, (long)l)), ResilienceCoordinationManager.M.S);
        this.UC = new CacheInvalidationStrategy1973(this, (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)7086, (long)(0x1226BE45D792416FL ^ l)), (long)-4041360356580261025L, (long)l)), ResilienceCoordinationManager.M.S);
        this.UD = new ResourceLifecycleManager1989(this, (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)27153, (long)(0x18A1B30F61B830D1L ^ l)), (long)-4041360356580261025L, (long)l)), ResilienceCoordinationManager.M.S);
        this.Us = new ConnectionPoolManager(this, (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)31253, (long)(0x273DB71332A020D1L ^ l)), (long)-4041360356580261025L, (long)l)), ResilienceCoordinationManager.M.S);
        this.UG = new SymmetricCipherManager(70.0);
        this.UE = false;
        this.UH = userIdentityManager;
        this.UO = bl;
        this.UX = bl2;
        this.US = new ErrorResolutionStrategy(this, userIdentityManager.j(), (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)10342, (long)(0x3434FF2450B172A8L ^ l)), (long)-4041360356580261025L, (long)l)), 72.0, 0.75, ResilienceCoordinationManager.M.c, false);
        this.Ub = new EventDispatchCoordinator2458(this, userIdentityManager.X(), 0.55, 0.75, 0.1, 72.0, false, false, ResilienceCoordinationManager.M.w);
        this.Ul.n(this.US, new Object[0]);
        this.UG.n(this.Ub, new Object[0]);
        if (bl) {
            this.UG.o(this.UD);
        } else {
            this.UG.o(this.Us, this.UF, new bE(2.0, 1.0), this.UC);
        }
        this.Ul.d().f((String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)26704, (long)(0x241E37713F18B292L ^ l)), (long)-4041360356580261025L, (long)l)));
        this.Ul.o(new bE(0.0, 9.0));
        this.Ul.o(this.UG);
        this.o(new bE(4.0, 1.0), new GeometricTransformationEngine(userIdentityManager, 8.0, 8.0), new bE(4.0, 1.0), this.Ul);
        this.UF.N(this::O);
        this.UC.N(this::V);
        this.UD.N(this::y);
        this.Us.N(this::X);
    }

    private void lambda$onRevoke$5() {
        this.UE = false;
    }

    private void O() {
        try {
            if (this.UE) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        this.UE = true;
        SecureContextBroker572.h().c().c(this.UH.s(), arg_0 -> this.lambda$onPromote$0(jF, arg_0), this::lambda$onPromote$1);
    }

    public static boolean r() {
        boolean bl = ResilienceCoordinationManager.a();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        return false;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$onRevoke$4(JF jF, StreamProcessor1422 streamProcessor1422) {
        try {
            if (streamProcessor1422.m() == CipherTransformationType.SUCCESS) {
                jF.F(this.UH);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
    }

    private static void x() {
        Object[] objectArray = qb;
        qb[0] = "\b4I";
        objectArray[1] = Integer.TYPE;
        ResilienceCoordinationManager.rb[1] = "java/lang/Integer";
        objectArray[2] = "b4\u0003m\u0002Ci;\u0012\"\u007f[z<\u001bk";
        objectArray[3] = "e:;=%?n5*rD1e>.(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0014O@\u0000S%A\u001b\\a\u0004a~SC\u0013Qa\u0004\u001a@\u001fo#\u0001_Y\u001aSe\u0015EBa";
    }

    @Override
    public void E() {
        block31: {
            long l;
            block30: {
                boolean bl;
                UIRenderingCoordinator uIRenderingCoordinator;
                block29: {
                    block28: {
                        boolean bl2;
                        block26: {
                            block24: {
                                block25: {
                                    boolean bl3;
                                    block23: {
                                        block22: {
                                            boolean bl4;
                                            block21: {
                                                block20: {
                                                    l = ab ^ 0x4FAEA1A9D393L;
                                                    try {
                                                        try {
                                                            if (!TemporalMetadataResolver.h.M().q().contains(this.UH) && !TemporalMetadataResolver.h.O().u().k(this.UH)) break block20;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ResilienceCoordinationManager.b(customSystemException);
                                                        }
                                                        bl4 = true;
                                                        break block21;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ResilienceCoordinationManager.b(customSystemException);
                                                    }
                                                }
                                                bl4 = false;
                                            }
                                            boolean bl5 = bl4;
                                            boolean bl6 = TemporalMetadataResolver.h.O().n().equals(this.UH);
                                            try {
                                                try {
                                                    if (bl5 || bl6) break block22;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResilienceCoordinationManager.b(customSystemException);
                                                }
                                                bl3 = true;
                                                break block23;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResilienceCoordinationManager.b(customSystemException);
                                            }
                                        }
                                        bl3 = false;
                                    }
                                    bl2 = bl3;
                                    try {
                                        try {
                                            if (!this.s()) break block24;
                                            if (!this.UX) break block25;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResilienceCoordinationManager.b(customSystemException);
                                        }
                                        this.Us.N(bl2);
                                        this.UF.N(false);
                                        this.UC.N(false);
                                        this.UD.N(false);
                                        break block26;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResilienceCoordinationManager.b(customSystemException);
                                    }
                                }
                                this.Us.N(bl2);
                                this.UF.N(true);
                                this.UC.N(true);
                                this.UD.N(true);
                                break block26;
                            }
                            this.Us.N(false);
                            this.UF.N(false);
                            this.UC.N(false);
                            this.UD.N(false);
                        }
                        try {
                            block27: {
                                try {
                                    try {
                                        uIRenderingCoordinator = this.Ub;
                                        if (!this.s()) break block27;
                                        if (!this.UX) break block28;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResilienceCoordinationManager.b(customSystemException);
                                    }
                                    if (bl2) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResilienceCoordinationManager.b(customSystemException);
                                }
                            }
                            bl = true;
                            break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResilienceCoordinationManager.b(customSystemException);
                        }
                    }
                    bl = false;
                }
                try {
                    uIRenderingCoordinator.N(bl);
                    this.A();
                    this.US.d(this.UH.j());
                    if (!this.UO) break block30;
                    this.Ub.V(this.UH.X());
                    break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResilienceCoordinationManager.b(customSystemException);
                }
            }
            this.Ub.V((String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)27473, (long)(0x226B0AE097DC9B45L ^ l)), (long)7870437872104024460L, (long)l)) + this.UH.X());
        }
        super.E();
        this.z();
        this.UF.d((double)0.65f);
        this.UC.d((double)0.65f);
        this.UD.d((double)0.65f);
        this.Us.d((double)0.65f);
        this.UF.d(1.0f);
        this.UC.d(1.0f);
        this.UD.d(1.0f);
        this.Us.d(1.0f);
        this.Ul.i(false);
        this.i(false);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResilienceCoordinationManager.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
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
                n3 = 39;
                break;
            }
            case 2: {
                n3 = 34;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 45;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 30;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 26;
                break;
            }
            case 12: {
                n3 = 18;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 41;
                break;
            }
            case 15: {
                n3 = 42;
                break;
            }
            case 16: {
                n3 = 5;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 28;
                break;
            }
            case 20: {
                n3 = 33;
                break;
            }
            case 21: {
                n3 = 54;
                break;
            }
            case 22: {
                n3 = 13;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 46;
                break;
            }
            case 25: {
                n3 = 59;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 27;
                break;
            }
            case 30: {
                n3 = 21;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 32;
                break;
            }
            case 34: {
                n3 = 44;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 35;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 58;
                break;
            }
            case 43: {
                n3 = 0;
                break;
            }
            case 44: {
                n3 = 12;
                break;
            }
            case 45: {
                n3 = 40;
                break;
            }
            case 46: {
                n3 = 24;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 49;
                break;
            }
            case 50: {
                n3 = 50;
                break;
            }
            case 51: {
                n3 = 19;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 29;
                break;
            }
            case 57: {
                n3 = 57;
                break;
            }
            case 58: {
                n3 = 20;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 31;
                break;
            }
            case 62: {
                n3 = 15;
                break;
            }
            default: {
                n3 = 37;
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
        ResilienceCoordinationManager.rb[n4] = new String(cArray);
        return n4;
    }

    private static Method l(long l, long l2) {
        int n = ResilienceCoordinationManager.i(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResilienceCoordinationManager.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResilienceCoordinationManager.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResilienceCoordinationManager.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResilienceCoordinationManager.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResilienceCoordinationManager.j(225498334220134L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResilienceCoordinationManager.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResilienceCoordinationManager.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResilienceCoordinationManager.j(225498334220134L, 0L);
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

    private void X() {
        long l = ab ^ 0x70A79817E548L;
        try {
            if (this.UE) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        for (CryptoKeyGenerator1662 cryptoKeyGenerator1662 : TemporalMetadataResolver.h.O().u().C()) {
            try {
                if (!cryptoKeyGenerator1662.s().j().equals(this.UH.j())) continue;
                CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.SUCCESS, (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)8749, (long)(0x19C732AD5ABB64E3L ^ l)), (long)6620949521221590871L, (long)l)) + this.UH.j() + (String)((Object)ResilienceCoordinationManager.e("\u00eb", (int)ResilienceCoordinationManager.c("s", (int)4701, (long)(0x5E239E9B79D35496L ^ l)), (long)6620949521221590871L, (long)l))));
                TemporalMetadataResolver.h.O().u().b((NetworkConnectionManager2517)cryptoKeyGenerator1662);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResilienceCoordinationManager.b(customSystemException);
            }
        }
        this.UE = true;
        Bz.d(this.UH.j());
        this.UE = false;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResilienceCoordinationManager.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResilienceCoordinationManager.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D2D;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResilienceCoordinationManager.fb[n2] = n3;
        }
        return fb[n2];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ResilienceCoordinationManager.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResilienceCoordinationManager.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void y() {
        try {
            if (this.UE) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        this.UE = true;
        SecureContextBroker572.h().c().O(this.UH.s(), arg_0 -> this.lambda$onRevoke$4(jF, arg_0), this::lambda$onRevoke$5);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static boolean a() {
        return UQ;
    }

    protected void z() {
        try {
            if (!this.UO) {
                ConfigurationManager.T(this.Ub.G(), this.Ub.W() + 2.0, 2.0, 1.0, GraphicsRenderingUtility1454.P(this.UH.M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
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

    private void V() {
        try {
            if (this.UE) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResilienceCoordinationManager.b(customSystemException);
        }
        this.UE = true;
        SecureContextBroker572.h().c().k(this.UH.s(), arg_0 -> this.lambda$onKick$2(jF, arg_0), this::lambda$onKick$3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResilienceCoordinationManager.ab = MultiContainerRegistry.a(4958668016329870536L, 1736956906515699667L, MethodHandles.lookup().lookupClass()).a(280672180495494L);
                ResilienceCoordinationManager.qb = new Object[5];
                ResilienceCoordinationManager.rb = new String[5];
                ResilienceCoordinationManager.x();
                ResilienceCoordinationManager.lb = new HashMap<K, V>(13);
                var0 = ResilienceCoordinationManager.ab ^ 17558044341363L;
                ResilienceCoordinationManager.r(false);
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u008c\u0014!\u00bf\u0096\u0010\u009a\u0097\u00a88\u008f\u008eAm_\u00be\u00aa\u00de\u0006\u00b88g\u0093\u0012\u00c6\u00d7,\u009cK\u0081\u00ec\u00e6\u00eaB\u00b2\u000b\u00d6\u00d4\u00f3_\u00ff\u009ej$\u00b6q\f\u0095\u00a1\u00cf;\u00d8\u0016\u009c\u00bdL";
                var7_6 = "\u008c\u0014!\u00bf\u0096\u0010\u009a\u0097\u00a88\u008f\u008eAm_\u00be\u00aa\u00de\u0006\u00b88g\u0093\u0012\u00c6\u00d7,\u009cK\u0081\u00ec\u00e6\u00eaB\u00b2\u000b\u00d6\u00d4\u00f3_\u00ff\u009ej$\u00b6q\f\u0095\u00a1\u00cf;\u00d8\u0016\u009c\u00bdL".length();
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
                    var6_5 = "\u00eb\\\u0015\u00f3\u00b0\u0003-\u00e0\n\u009d\u00ec\u00d6uYWZ";
                    var7_6 = "\u00eb\\\u0015\u00f3\u00b0\u0003-\u00e0\n\u009d\u00ec\u00d6uYWZ".length();
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
        ResilienceCoordinationManager.eb = var8_3;
        ResilienceCoordinationManager.fb = new Integer[9];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResilienceCoordinationManager.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResilienceCoordinationManager.i(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResilienceCoordinationManager.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public UserIdentityManager O() {
        return this.UH;
    }

    private static Field k(long l, long l2) {
        int n = ResilienceCoordinationManager.i(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResilienceCoordinationManager.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResilienceCoordinationManager.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResilienceCoordinationManager.e(clazz3, string2, clazz2)) != null) {
                    ResilienceCoordinationManager.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResilienceCoordinationManager.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResilienceCoordinationManager.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResilienceCoordinationManager.j(225498334220134L, 0L);
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
            return MethodHandles.lookup().findStatic(ResilienceCoordinationManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ResilienceCoordinationManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

