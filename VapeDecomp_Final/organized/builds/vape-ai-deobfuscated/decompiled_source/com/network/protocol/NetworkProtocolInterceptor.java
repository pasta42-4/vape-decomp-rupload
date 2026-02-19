/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.bE;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.mapping.PrecisionDataMapper;
import com.event.core.EventDispatcher1650;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.network.protocol.NetworkProtocolEncoder220;
import com.security.authentication.AuthenticationTokenManager904;
import com.security.cryptography.CryptographicResourceManager;
import com.security.cryptography.SecurityCipherManager;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkProtocolInterceptor
extends CipherSessionManager {
    private static final Integer[] fb;
    public static NetworkProtocolEncoder220 Jr;
    private ArrayList<VisualRenderContext> Jh;
    private String JY;
    private boolean JM;
    private AuthenticationTokenManager904 JG;
    private static final long[] eb;
    private final GraphicalRenderEngine1082 J6;
    private static final long ab;
    private CryptographicResourceManager J9;
    private static final Object[] qb;
    public static boolean Jl;
    private static final Map lb;
    private static final String[] rb;

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "W!\u0011";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolInterceptor.rb[1] = "java/lang/Integer";
        objectArray[2] = "WI/;{e\\F>t\u0006}OA7=";
        objectArray[3] = "\f\u00150}77\u0007\u001a!2V9\f\u0011%h";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\n<qqw,\u000ea:\f$43v91(7Uv\u007f3Ou\tl~i04\u000fo~\f";
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolInterceptor.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolInterceptor.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void R() {
        this.V();
    }

    @Override
    public void u() {
    }

    @Override
    public double b() {
        return (this.Q().b() + 20.0) * 3.5 + 52.0;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void N() {
        try {
            if (GraphicalRenderingController.D(SecurityCipherManager.class).f()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolInterceptor.a(customSystemException);
        }
        super.N();
    }

    public void V() {
        GraphicalRenderingController.l(this);
        GraphicalRenderingController.l(Jr);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'n' || c == '\u00e4' || c == 'y' || c == '\u00db') {
                field = NetworkProtocolInterceptor.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolInterceptor.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ef' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolInterceptor.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolInterceptor.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public NetworkProtocolEncoder220 R() {
        return Jr;
    }

    @Override
    public double z() {
        return 20.0;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double e() {
        return this.w();
    }

    private static Method p(long l, long l2) {
        int n = NetworkProtocolInterceptor.m(l, l2);
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
                clazz3 = NetworkProtocolInterceptor.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolInterceptor.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolInterceptor.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolInterceptor.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolInterceptor.n(233031164827891L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolInterceptor.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolInterceptor.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolInterceptor.n(233031164827891L, 0L);
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

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolInterceptor.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolInterceptor.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int m(long l, long l2) {
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
                n3 = 48;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 15;
                break;
            }
            case 8: {
                n3 = 22;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 16;
                break;
            }
            case 13: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 49;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 42;
                break;
            }
            case 18: {
                n3 = 5;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 62;
                break;
            }
            case 22: {
                n3 = 57;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 19;
                break;
            }
            case 25: {
                n3 = 23;
                break;
            }
            case 26: {
                n3 = 14;
                break;
            }
            case 27: {
                n3 = 1;
                break;
            }
            case 28: {
                n3 = 43;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 37;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 61;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 26;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 18;
                break;
            }
            case 39: {
                n3 = 32;
                break;
            }
            case 40: {
                n3 = 11;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 60;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 39;
                break;
            }
            case 48: {
                n3 = 25;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 4;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 59;
                break;
            }
            case 54: {
                n3 = 45;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 35;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 50;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 9;
                break;
            }
            default: {
                n3 = 58;
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
        NetworkProtocolInterceptor.rb[n4] = new String(cArray);
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

    public AuthenticationTokenManager904 G() {
        return this.JG;
    }

    @Override
    public double w() {
        return 350.0;
    }

    public String u() {
        return this.JY;
    }

    static CryptographicResourceManager E(NetworkProtocolInterceptor networkProtocolInterceptor, CryptographicResourceManager cryptographicResourceManager) {
        networkProtocolInterceptor.J9 = cryptographicResourceManager;
        return networkProtocolInterceptor.J9;
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        try {
            if (GraphicalRenderingController.D(SecurityCipherManager.class).f()) {
                GraphicalRenderingController.D(SecurityCipherManager.class).Z(userInteractionEventDispatcher);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolInterceptor.a(customSystemException);
        }
        super.S(userInteractionEventDispatcher);
    }

    @Override
    public void E() {
        try {
            super.E();
            if (!this.JM) {
                Jr.O();
                this.JM = true;
                this.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolInterceptor.a(customSystemException);
        }
        this.J6.P(20.0);
        Jr.T(this.w());
        Jr.w(Jr.Q());
        Jr.m(this.G(), this.W() + this.Q().b() + this.JG.b());
        Jr.E();
        this.y();
        this.A();
    }

    @Override
    public String A() {
        long l = ab ^ 0x270101B4D74AL;
        return NetworkProtocolInterceptor.e("F", (int)NetworkProtocolInterceptor.d("h", (int)31652, (long)(0x3D230779B74412C0L ^ l)), (long)4868410681271379800L, (long)l);
    }

    @Override
    public boolean g() {
        return false;
    }

    static CryptographicResourceManager J(NetworkProtocolInterceptor networkProtocolInterceptor) {
        return networkProtocolInterceptor.J9;
    }

    @Override
    public void i() {
    }

    public void j(String string) {
        this.JY = string;
        Jr.O();
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolInterceptor.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public NetworkProtocolInterceptor() {
        long l = ab ^ 0x3E32F3DF7668L;
        this.JG = new AuthenticationTokenManager904(this);
        this.JY = "";
        this.J9 = CryptographicResourceManager.X;
        this.Jh = new ArrayList();
        this.JM = false;
        this.J6 = new GraphicalRenderEngine1082(this.w(), 18.0);
        Jr = new NetworkProtocolEncoder220(this);
        this.d().m(false);
        this.d().o(false);
        this.d().i(false);
        this.d().y(false);
        this.Q(NetworkProtocolInterceptor.M.W);
        this.a(new PrecisionDataMapper(this));
        this.N(true);
        this.B(false, true);
        this.L(true);
        this.g(false);
        this.o(new AbstractComputationKernel[0]);
        this.J6.d().f((String)((Object)NetworkProtocolInterceptor.e("F", (int)NetworkProtocolInterceptor.d("h", (int)31059, (long)(0x4FBB9E91D3693116L ^ l)), (long)-2111615879781398918L, (long)l)));
        bE bE2 = new bE(12.5, 0.0);
        this.J6.n(bE2, new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082((this.J6.w() - bE2.w()) / 2.0, this.J6.b());
        graphicalRenderEngine1082.n(new bE(0.0, 8.0), NetworkProtocolInterceptor.e("F", (int)NetworkProtocolInterceptor.d("h", (int)10423, (long)(0x2E40FBBB4052E0F3L ^ l)), (long)-2111615879781398918L, (long)l));
        this.J6.n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.i(false);
        for (CryptographicResourceManager cryptographicResourceManager : CryptographicResourceManager.U()) {
            VisualRenderContext visualRenderContext = new VisualRenderContext(cryptographicResourceManager.O(), 0.75);
            visualRenderContext.N(new EventDispatcher1650(this, cryptographicResourceManager));
            visualRenderContext.T(visualRenderContext.d());
            visualRenderContext.w(7.0);
            visualRenderContext.N(true);
            this.Jh.add(visualRenderContext);
            graphicalRenderEngine1082.n(visualRenderContext, new Object[0]);
            graphicalRenderEngine1082.n(new bE(17.5, 0.0), new Object[0]);
        }
        this.J6.i(false);
        this.n(this.J6, new Object[0]);
        this.J6.n(this.JG, NetworkProtocolInterceptor.e("F", (int)NetworkProtocolInterceptor.d("h", (int)4117, (long)(0x5342AACD104D5852L ^ l)), (long)-2111615879781398918L, (long)l));
    }

    public CryptographicResourceManager j() {
        return this.J9;
    }

    @Override
    public void r(boolean bl, boolean bl2) {
        try {
            super.r(bl, bl2);
            Jr.r(bl, bl2);
            if (bl) {
                this.V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolInterceptor.a(customSystemException);
        }
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void C(VisualRenderContext visualRenderContext) {
        double d2 = visualRenderContext.W() + 7.0;
        for (double d3 = visualRenderContext.G(); d3 < visualRenderContext.G() + (visualRenderContext.d() + 1.0); d3 += 2.0) {
            ConfigurationManager.r(d3, d2, 1.0, 1.0f, NetworkProtocolInterceptor.M.c);
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolInterceptor.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkProtocolInterceptor.ab = MultiContainerRegistry.a(-8152772312694377675L, 5488699560976326242L, MethodHandles.lookup().lookupClass()).a(58027499917774L);
                NetworkProtocolInterceptor.qb = new Object[5];
                NetworkProtocolInterceptor.rb = new String[5];
                NetworkProtocolInterceptor.T();
                NetworkProtocolInterceptor.lb = new HashMap<K, V>(13);
                var0 = NetworkProtocolInterceptor.ab ^ 106860464946122L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "z\u001d]\u00ec\u008b\u00fdJ\u008euN\u0016N*\u00ba\u00db\u0012";
                var7_6 = "z\u001d]\u00ec\u008b\u00fdJ\u008euN\u0016N*\u00ba\u00db\u0012".length();
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
                    var6_5 = "xn\u008cP\u00e4\u00e1\u00b4T\u008cW\u008f@\u00ea\u00b3\u00c6k";
                    var7_6 = "xn\u008cP\u00e4\u00e1\u00b4T\u008cW\u008f@\u00ea\u00b3\u00c6k".length();
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
        NetworkProtocolInterceptor.eb = var8_3;
        NetworkProtocolInterceptor.fb = new Integer[4];
        NetworkProtocolInterceptor.Jl = false;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2AF6;
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
                throw new RuntimeException("a/fx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolInterceptor.fb[n2] = n3;
        }
        return fb[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field o(long l, long l2) {
        int n = NetworkProtocolInterceptor.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolInterceptor.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolInterceptor.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolInterceptor.g(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolInterceptor.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolInterceptor.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolInterceptor.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolInterceptor.n(233031164827891L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void y() {
        for (VisualRenderContext visualRenderContext : this.Jh) {
            try {
                if (this.j().O().equalsIgnoreCase(visualRenderContext.O())) {
                    visualRenderContext.c(Color.WHITE);
                    this.C(visualRenderContext);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolInterceptor.a(customSystemException);
            }
            visualRenderContext.c(null);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolInterceptor.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolInterceptor.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

