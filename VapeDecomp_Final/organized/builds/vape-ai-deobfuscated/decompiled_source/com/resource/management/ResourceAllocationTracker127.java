/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import a.JF;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.network.AbstractProtocolHandler;
import com.app.network.NetworkConnectionBroker2678;
import com.app.transformation.DataTransformationEngine1794;
import com.collections.management.MultiContainerRegistry;
import com.encoding.strategy.EncodingScheme;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.network.protocol.NetworkProtocolEncoder1226;
import com.payment.security.PaymentGatewayValidator;
import com.security.config.CryptoConfigurationEnum;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherContextManager1101;
import com.security.session.CipherSessionManager;
import com.stream.processing.StreamProcessor;
import com.system.configuration.ConfigurationProfileManager;
import com.system.resource.ResourceAllocationTracker2301;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.ApplicationColorSchemeManager;
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
public class ResourceAllocationTracker127
extends GraphicalRenderEngine1082 {
    private static final Integer[] eb;
    private static final long[] bb;
    private static int RO;
    private static final Object[] lb;
    private CipherContextManager1101 RH;
    private static final Map fb;
    private static final long ab;
    private UserIdentityManager RS;
    private boolean RE;
    private ConfigurationProfileManager Rz;
    boolean Rw;
    private static final String[] mb;

    public static int Y() {
        return RO;
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
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 62;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 49;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 43;
                break;
            }
            case 11: {
                n3 = 63;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 12;
                break;
            }
            case 14: {
                n3 = 9;
                break;
            }
            case 15: {
                n3 = 28;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 51;
                break;
            }
            case 18: {
                n3 = 30;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 29;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 42;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 16;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 53;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 2;
                break;
            }
            case 30: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 36;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 48;
                break;
            }
            case 34: {
                n3 = 46;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 37;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 8;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 50;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 6;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 33;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 14;
                break;
            }
            case 61: {
                n3 = 24;
                break;
            }
            case 62: {
                n3 = 45;
                break;
            }
            default: {
                n3 = 57;
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
        ResourceAllocationTracker127.mb[n4] = new String(cArray);
        return n4;
    }

    private void z() {
        this.m();
        this.RE = true;
    }

    public static void I(int n) {
        RO = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        long l = ab ^ 0x745BA4EB0080L;
        try {
            switch (streamProcessor.l()) {
                case SUCCESS: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.SUCCESS, (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)15769, (long)(0x1D568811F9A2678DL ^ l)), (long)2699743203302153146L, (long)l)) + userIdentityManager.j() + (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)3007, (long)(0x59372CFDCB50D1AEL ^ l)), (long)2699743203302153146L, (long)l))));
                    return;
                }
                case TOO_MANY_INVITES: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)17939, (long)(0x60FE1CD55B769C00L ^ l)), (long)2699743203302153146L, (long)l))));
                    return;
                }
                case NOT_ONLINE: 
                case ALREADY_INVITED: 
                case FAILED: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)4804, (long)(0x3F5D052FCEA2C8D2L ^ l)), (long)2699743203302153146L, (long)l)) + userIdentityManager.j() + (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)4450, (long)(0x45A6706A88B7CB75L ^ l)), (long)2699743203302153146L, (long)l))));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker127.a(customSystemException);
        }
    }

    private void lambda$null$4(UserIdentityManager userIdentityManager, NetworkProtocolEncoder1226 networkProtocolEncoder1226) {
        try {
            if (networkProtocolEncoder1226.c() == EncodingScheme.SUCCESS) {
                this.Rw = true;
                SecureContextBroker572.h().c().l(userIdentityManager.s(), arg_0 -> this.lambda$null$2(userIdentityManager, arg_0), this::lambda$null$3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker127.a(customSystemException);
        }
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F61;
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
                throw new RuntimeException("a/w7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationTracker127.eb[n2] = n3;
        }
        return eb[n2];
    }

    private void lambda$null$5() {
        this.Rw = false;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationTracker127.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationTracker127.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.RE ? super.z() : this.Rz.b();
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker127.a(customSystemException);
        }
        return d2;
    }

    static void J(ResourceAllocationTracker127 resourceAllocationTracker127) {
        resourceAllocationTracker127.R();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void R() {
        GraphicalRenderingController.z(this.RH);
        this.o(this.Rz);
        this.Rz.M(false);
        this.RE = false;
        this.RH.A();
        this.A();
    }

    private void Y() {
        try {
            if (!this.RE) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker127.a(customSystemException);
        }
        CipherSessionManager cipherSessionManager = this.V();
        this.RH.b(this.G());
        this.RH.M(cipherSessionManager.W() + cipherSessionManager.Q().b());
        double d2 = cipherSessionManager.b() - cipherSessionManager.Q().b() - 50.0;
        this.Rz.K().C().B().P(d2);
        this.Rz.K().C().B().i(d2);
        this.Rz.K().C().B().A();
        this.RH.A();
    }

    private void lambda$null$0(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        this.j(userIdentityManager, streamProcessor);
    }

    public ConfigurationProfileManager x() {
        return this.Rz;
    }

    private void lambda$null$1() {
        this.Rw = false;
    }

    static void j(ResourceAllocationTracker127 resourceAllocationTracker127) {
        resourceAllocationTracker127.z();
    }

    private void lambda$null$2(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        this.j(userIdentityManager, streamProcessor);
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

    private static Field k(long l, long l2) {
        int n = ResourceAllocationTracker127.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationTracker127.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationTracker127.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationTracker127.e(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationTracker127.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationTracker127.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationTracker127.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationTracker127.j(259526310906467L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void m() {
        this.J(this.Rz);
        this.RH = GraphicalRenderingController.v(this, this.Rz, CipherContextManager1101.class);
        this.Rz.M(true);
        this.A();
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == '\u00f4' || c == '\u00d0' || c == 'a') {
                field = ResourceAllocationTracker127.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationTracker127.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
                        l = ab ^ 0x69313CEE55ABL;
                        try {
                            if (this.Rw) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker127.a(customSystemException);
                        }
                        try {
                            if (userIdentityManager.h() == ApplicationColorSchemeManager.OFFLINE) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker127.a(customSystemException);
                        }
                        this.Rw = true;
                        jF = TemporalMetadataResolver.h.O().p().Q();
                        try {
                            try {
                                if (jF == null || jF.X()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker127.a(customSystemException);
                            }
                            this.Rw = false;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker127.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (jF == null) break block18;
                            if (!jF.u().contains(userIdentityManager)) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker127.a(customSystemException);
                        }
                        this.Rw = false;
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)29760, (long)(0x2A3D078AABFFFB7EL ^ l)), (long)8096477386085551761L, (long)l))));
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker127.a(customSystemException);
                    }
                }
                try {
                    if (jF.H().contains(userIdentityManager)) {
                        this.Rw = false;
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)ResourceAllocationTracker127.d("D", (int)ResourceAllocationTracker127.c("t", (int)20914, (long)(0xCB49C6171775E8BL ^ l)), (long)8096477386085551761L, (long)l))));
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker127.a(customSystemException);
                }
                SecureContextBroker572.h().c().l(userIdentityManager.s(), arg_0 -> this.lambda$null$0(userIdentityManager, arg_0), this::lambda$null$1);
                break block20;
            }
            SecureContextBroker572.h().c().W(arg_0 -> this.lambda$null$4(userIdentityManager, arg_0), this::lambda$null$5);
        }
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "\u000fEv";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationTracker127.mb[1] = "java/lang/Integer";
        objectArray[2] = "T\\/W\u0017Z_S>\u0018jBLT7Q";
        objectArray[3] = "\u001dq\u0014^$5\u0016~\u0005\u0011E;\u001du\u0001K";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "}2G?\u000fb}+US]~L6U\"Me)2L>6<0wA,\fc66BS";
    }

    private void lambda$null$3() {
        this.Rw = false;
    }

    @Override
    public void o(boolean bl) {
        super.o(bl);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationTracker127.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int H() {
        int n = ResourceAllocationTracker127.Y();
        try {
            if (n == 0) {
                return 106;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker127.a(customSystemException);
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocationTracker127.ab = MultiContainerRegistry.a(2993600323706952633L, -8960824482131438387L, MethodHandles.lookup().lookupClass()).a(162774192566077L);
                ResourceAllocationTracker127.lb = new Object[5];
                ResourceAllocationTracker127.mb = new String[5];
                ResourceAllocationTracker127.D();
                ResourceAllocationTracker127.fb = new HashMap<K, V>(13);
                var0 = ResourceAllocationTracker127.ab ^ 8226904436873L;
                ResourceAllocationTracker127.I(0);
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
                var6_5 = "\u00cf$x\u00e1Q\u00e3\u00ad\u00b8\u00cc\u0087\u009f\u00f5\u00c0\u0096\u0080\u00c5\u0004Q\u00e7\u0006\u00b1yN\b\u00e2\u008c\u0098\u00e2.\u00e8\u0089\"\u00e9\u0004C\u0089\u00bd\u0099\u0003>";
                var7_6 = "\u00cf$x\u00e1Q\u00e3\u00ad\u00b8\u00cc\u0087\u009f\u00f5\u00c0\u0096\u0080\u00c5\u0004Q\u00e7\u0006\u00b1yN\b\u00e2\u008c\u0098\u00e2.\u00e8\u0089\"\u00e9\u0004C\u0089\u00bd\u0099\u0003>".length();
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
                    var6_5 = "\u008b\u00181\u008b\u00ccH\u00b5\u00d7O-\u00e9\u00bf\u0095\u0018\u00ed\u00ad";
                    var7_6 = "\u008b\u00181\u008b\u00ccH\u00b5\u00d7O-\u00e9\u00bf\u0095\u0018\u00ed\u00ad".length();
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
        ResourceAllocationTracker127.bb = var8_3;
        ResourceAllocationTracker127.eb = new Integer[7];
    }

    @Override
    public void E() {
        super.E();
        this.Y();
    }

    private static Method l(long l, long l2) {
        int n = ResourceAllocationTracker127.i(l, l2);
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
                clazz3 = ResourceAllocationTracker127.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationTracker127.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationTracker127.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationTracker127.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationTracker127.j(259526310906467L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationTracker127.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationTracker127.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationTracker127.j(259526310906467L, 0L);
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

    public ResourceAllocationTracker127(UserIdentityManager userIdentityManager) {
        super(99.0, 24.0);
        this.RS = userIdentityManager;
        this.Rz = new ConfigurationProfileManager(userIdentityManager);
        this.i(false);
        this.o(this.Rz);
        this.Rz.K().S().F().N(new AbstractProtocolHandler(this));
        this.Rz.X().N(new PaymentGatewayValidator(this));
        this.Rz.K().N(() -> this.lambda$new$6(userIdentityManager));
        this.Rz.l().N(new ResourceAllocationTracker2301(this));
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationTracker127.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationTracker127.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void O() {
        TemporalMetadataResolver.h.O().p().h(new NetworkConnectionBroker2678(TemporalMetadataResolver.h.O().n()));
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationTracker127.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationTracker127.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationTracker127.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public UserIdentityManager h() {
        return this.Rz.O();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker127.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker127.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

