/*
 * Decompiled with CFR 0.152.
 */
package com.distributed.resource;

import a.fH;
import a.hQ;
import a.hr;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine;
import com.graphics.rendering.GraphicalRenderingController249;
import com.graphics.rendering.GraphicalRenderingController52;
import com.graphics.theme.GraphicalThemeRenderer;
import com.rendering.style.RenderStyleController;
import com.security.auth.AuthenticationTokenGenerator268;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.vape.state.VapeStateManager;
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

public class DistributedResourceTracker
extends hQ {
    private final hr xC;
    private static final long ab;
    private AdaptiveCipherEngine xd;
    private final GraphicalThemeRenderer V;
    private static final Integer[] db;
    private GraphicalRenderEngine xp;
    private GraphicalRenderingController52 x0;
    private static final long[] bb;
    private static final Object[] fb;
    private GraphicalRenderingController249 Y;
    private fH b;
    private static final String[] jb;
    private final RenderStyleController xY;
    private AuthenticationTokenGenerator268 xr;
    private static final Map eb;
    private final hr xQ;
    private AuthenticationTokenGenerator268 D;
    private boolean L;
    private GraphicalRenderingController52 xn;

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedResourceTracker.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedResourceTracker.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedResourceTracker.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
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
                n3 = 13;
                break;
            }
            case 2: {
                n3 = 56;
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
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 39;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 8;
                break;
            }
            case 12: {
                n3 = 29;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 12;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 16;
                break;
            }
            case 20: {
                n3 = 22;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 20;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 21;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 47;
                break;
            }
            case 32: {
                n3 = 17;
                break;
            }
            case 33: {
                n3 = 31;
                break;
            }
            case 34: {
                n3 = 59;
                break;
            }
            case 35: {
                n3 = 32;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 53;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 15;
                break;
            }
            case 41: {
                n3 = 48;
                break;
            }
            case 42: {
                n3 = 7;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 26;
                break;
            }
            case 45: {
                n3 = 60;
                break;
            }
            case 46: {
                n3 = 51;
                break;
            }
            case 47: {
                n3 = 38;
                break;
            }
            case 48: {
                n3 = 28;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 57;
                break;
            }
            case 53: {
                n3 = 44;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 10;
                break;
            }
            case 57: {
                n3 = 63;
                break;
            }
            case 58: {
                n3 = 35;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 14;
                break;
            }
            case 61: {
                n3 = 3;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 55;
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
        DistributedResourceTracker.jb[n4] = new String(cArray);
        return n4;
    }

    private void lambda$setInitialMode$4() {
        this.N(false);
        this.b.S((DistributedResourceTracker)null);
    }

    @Override
    public void G() {
        double d2;
        long l;
        block16: {
            Color color;
            GraphicalThemeRenderer graphicalThemeRenderer;
            double d3;
            block18: {
                block17: {
                    double d4;
                    GraphicalRenderEngine graphicalRenderEngine;
                    l = ab ^ 0x26C7FAEAA160L;
                    CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.9);
                    double d5 = cryptographicParameterGenerator.B(this.D.w());
                    double d6 = this.W() + 9.0 - d5 / 2.0;
                    d2 = this.W() + 9.0;
                    double d7 = this.G() + 10.0;
                    try {
                        this.xp.b(d7);
                        this.xp.M(d6);
                        graphicalRenderEngine = this.xp;
                        d4 = this.L ? this.w() - 20.0 - 8.0 : 65.0 - this.Y.w();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTracker.a(customSystemException);
                    }
                    try {
                        graphicalRenderEngine.a(d4);
                        if (this.L) {
                            ConfigurationManager.S(this.G() + 5.0 - 0.5, this.W() + 0.5, this.w() - 10.0 + 1.0, this.b() - 1.0, DistributedResourceTracker.M.S);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTracker.a(customSystemException);
                    }
                    ConfigurationManager.S(this.G() + 5.0, this.W() + 1.0, this.w() - 10.0, this.b() - 2.0, DistributedResourceTracker.M.g);
                    if (this.L) {
                        d3 = this.G() + 5.0;
                        double d8 = this.W() + 20.0;
                        double d9 = this.w() - 10.0;
                        this.xn.b(d3);
                        this.xn.M(d8);
                        this.xn.T(d9);
                        this.xd.b(d3);
                        this.xd.M(d8 += this.xn.b());
                        this.xd.T(d9 - 6.0);
                        d8 += this.xd.b();
                        if (this.xd.i().s().booleanValue()) {
                            this.x0.N(true);
                            this.x0.b(d3);
                            this.x0.M(d8);
                            this.x0.T(d9);
                            d8 += this.x0.b();
                        } else {
                            this.x0.N(false);
                            d8 += 5.0;
                        }
                        double d10 = (this.w() - 25.0) / 5.0;
                        double d11 = this.G() + 10.0;
                        try {
                            if (this.xY != null) {
                                this.xY.b(d11);
                                this.xY.M(d8);
                                this.xY.w(18.0);
                                this.xY.T(d10);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTracker.a(customSystemException);
                        }
                        this.xQ.b(d11 += d10 + 2.5);
                        this.xQ.M(d8);
                        this.xQ.w(18.0);
                        this.xQ.T(d10 * 2.0);
                        this.xC.b(d11 += d10 * 2.0 + 2.5);
                        this.xC.M(d8);
                        this.xC.w(18.0);
                        this.xC.T(d10 * 2.0);
                    }
                    d3 = this.G() + this.w() - 15.0;
                    try {
                        try {
                            if (!this.V.f()) break block16;
                            graphicalThemeRenderer = this.V;
                            if (!this.L) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTracker.a(customSystemException);
                        }
                        color = DistributedResourceTracker.M.q;
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTracker.a(customSystemException);
                    }
                }
                color = null;
            }
            graphicalThemeRenderer.h(color);
            this.V.b(d3);
            this.V.M(this.W());
            this.V.w(18.0);
            d3 -= 5.0;
        }
        if (!this.L) {
            this.Y.V.a(20.0);
            this.Y.b(d3 -= this.Y.w());
            this.Y.M(this.W() + 4.0);
            ConfigurationManager.x((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)1655, (long)(0x3106767E855614A2L ^ l)), (long)8938361933839346067L, (long)l)), d3 -= 9.0, d2, 8.0, 8.0, DistributedResourceTracker.M.K);
        }
    }

    private void lambda$new$3(fH fH2) {
        try {
            if (!this.V.f()) {
                fH2.S((DistributedResourceTracker)null);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTracker.a(customSystemException);
        }
        this.V.l();
    }

    private void lambda$new$0(fH fH2, DistributedResourceTracker distributedResourceTracker, AuthenticationTokenGenerator268 authenticationTokenGenerator268) {
        block5: {
            block4: {
                boolean bl;
                try {
                    DistributedResourceTracker distributedResourceTracker2 = this;
                    bl = !this.L;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTracker.a(customSystemException);
                }
                try {
                    distributedResourceTracker2.L = bl;
                    if (!this.L) break block4;
                    fH2.S(distributedResourceTracker);
                    this.xr = AuthenticationTokenGenerator268.I(authenticationTokenGenerator268.w()).Q(authenticationTokenGenerator268.h());
                    this.xd.N(true);
                    this.xn.N(true);
                    this.x0.N(true);
                    this.xQ.N(true);
                    this.xC.N(true);
                    this.xY.N(true);
                    this.Y.N(false);
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTracker.a(customSystemException);
                }
            }
            fH2.S((DistributedResourceTracker)null);
            this.xd.N(false);
            this.xn.N(false);
            this.x0.N(false);
            this.xQ.N(false);
            this.xC.N(false);
            this.xY.N(false);
            this.Y.N(true);
        }
        fH2.A();
    }

    @Override
    public void d() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void a() {
        long l = ab ^ 0x2FCF3BA0F996L;
        this.V.l();
        this.V.N(false);
        this.Y.N(false);
        this.xY.N(false);
        this.xQ.z((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)16185, (long)(0x5049C7D5B512F51FL ^ l)), (long)2665420533915742565L, (long)l)));
        this.xQ.Q(new Color(0, 0, 0, 0), DistributedResourceTracker.M.O);
        this.xC.z((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)1531, (long)(0x6EBE3A2BB8184FDAL ^ l)), (long)2665420533915742565L, (long)l)));
        this.xC.Q(new Color(0, 0, 0, 0), DistributedResourceTracker.M.Y);
        this.xQ.C(this::lambda$setInitialMode$4);
        this.xC.C(this::lambda$setInitialMode$5);
    }

    private void lambda$setInitialMode$5() {
        this.D = AuthenticationTokenGenerator268.I(this.D.w()).Q(this.D.h());
        TemporalMetadataResolver.h.E().y(this.D);
        this.N(false);
        this.b.S((DistributedResourceTracker)null);
    }

    private static Field g(long l, long l2) {
        int n = DistributedResourceTracker.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedResourceTracker.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedResourceTracker.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedResourceTracker.c(clazz3, string2, clazz2)) != null) {
                    DistributedResourceTracker.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedResourceTracker.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedResourceTracker.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedResourceTracker.f(256877078079990L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedResourceTracker.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00db' || c == '\u00e1' || c == '\u00b5' || c == '\u00cd') {
                field = DistributedResourceTracker.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedResourceTracker.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DistributedResourceTracker.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedResourceTracker.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void lambda$new$1(AuthenticationTokenGenerator268 authenticationTokenGenerator268, fH fH2) {
        TemporalMetadataResolver.h.E().X(authenticationTokenGenerator268);
        fH2.S((DistributedResourceTracker)null);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public AuthenticationTokenGenerator268 B() {
        return this.D;
    }

    private void lambda$new$2(AuthenticationTokenGenerator268 authenticationTokenGenerator268) {
        try {
            if (this.xr != null) {
                authenticationTokenGenerator268.Q(this.xr.h());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTracker.a(customSystemException);
        }
        this.V.l();
    }

    @Override
    public void U() {
    }

    public DistributedResourceTracker(fH fH2, AuthenticationTokenGenerator268 authenticationTokenGenerator268) {
        long l = ab ^ 0x1F3DCB83C6A5L;
        this.xC = new hr((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)10304, (long)(0x262F8648DCBC5D53L ^ l)), (long)2003619322340527702L, (long)l)), 0.8, DistributedResourceTracker.M.Y).I(DistributedResourceTracker.M.S);
        this.xQ = new hr((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)4935, (long)(0x7F0DF59B69626656L ^ l)), (long)2003619322340527702L, (long)l)), 0.8, DistributedResourceTracker.M.Y).I(DistributedResourceTracker.M.S);
        this.xY = new RenderStyleController((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)25534, (long)(0x7A309667024B16A8L ^ l)), (long)2003619322340527702L, (long)l)), 0.8, DistributedResourceTracker.M.O);
        this.V = new GraphicalThemeRenderer((String)((Object)DistributedResourceTracker.c("T", (int)DistributedResourceTracker.b("v", (int)17320, (long)(0x4274464B3FB7B6BFL ^ l)), (long)2003619322340527702L, (long)l)));
        this.xC.q(false);
        this.xQ.q(false);
        this.b = fH2;
        this.D = authenticationTokenGenerator268;
        this.Y = new GraphicalRenderingController249(authenticationTokenGenerator268);
        DistributedResourceTracker distributedResourceTracker = this;
        this.V.N(() -> this.lambda$new$0(fH2, distributedResourceTracker, authenticationTokenGenerator268));
        this.xn = new GraphicalRenderingController52(authenticationTokenGenerator268.F());
        this.x0 = new GraphicalRenderingController52(authenticationTokenGenerator268.m());
        this.xd = new AdaptiveCipherEngine(authenticationTokenGenerator268.C());
        this.xd.l(new VapeStateManager(this, fH2));
        this.xY.N(() -> DistributedResourceTracker.lambda$new$1(authenticationTokenGenerator268, fH2));
        this.xQ.N(() -> this.lambda$new$2(authenticationTokenGenerator268));
        this.xC.N(() -> this.lambda$new$3(fH2));
        this.xd.N(false);
        this.xd.J(true);
        this.xd.Q(DistributedResourceTracker.M.g);
        this.xn.N(false);
        this.xn.J(true);
        this.xn.Q(DistributedResourceTracker.M.g);
        this.x0.N(false);
        this.x0.J(true);
        this.x0.Q(DistributedResourceTracker.M.g);
        this.xQ.N(false);
        this.xC.N(false);
        this.xY.N(false);
        this.xY.Q(DistributedResourceTracker.M.g);
        this.xp = new GraphicalRenderEngine(authenticationTokenGenerator268.w(), 40.0, 0.9, DistributedResourceTracker.M.n, DistributedResourceTracker.M.g, false, false);
        this.o(this.xp, this.V, this.Y, this.xd, this.xn, this.x0, this.xQ, this.xC, this.xY);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedResourceTracker.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedResourceTracker.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public double z() {
        double d2;
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if (!this.L) break block4;
                            if (!this.xd.i().s().booleanValue()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTracker.a(customSystemException);
                        }
                        d2 = 120.0;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTracker.a(customSystemException);
                    }
                }
                d2 = 90.0;
                break block6;
            }
            d2 = 18.0;
        }
        return d2;
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6EDC;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedResourceTracker.db[n2] = n3;
        }
        return db[n2];
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "\tc\u007f";
        objectArray[1] = Integer.TYPE;
        DistributedResourceTracker.jb[1] = "java/lang/Integer";
        objectArray[2] = "x(8<'\u001es')sZ\u0006`  :";
        objectArray[3] = "{\u000bB3\u001e?p\u0004S|\u007f1{\u000fW&";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "x{]\r\u001c\u0019\u007fd]3\u0016\u0010\u0019fGNM\u0019&p\u001f\f}R``_\u0003E\bx`C3";
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block8: {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (this.b.V() == null || !this.b.V().equals(this)) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceTracker.a(customSystemException);
                            }
                            if (this.C().O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTracker.a(customSystemException);
                        }
                        if (this.V.f()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTracker.a(customSystemException);
                    }
                    this.b.S((DistributedResourceTracker)null);
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTracker.a(customSystemException);
                }
            }
            this.V.l();
            return;
        }
        super.Z(userInteractionEventDispatcher);
    }

    private static Method h(long l, long l2) {
        int n = DistributedResourceTracker.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DistributedResourceTracker.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedResourceTracker.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedResourceTracker.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedResourceTracker.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedResourceTracker.f(256877078079990L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedResourceTracker.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedResourceTracker.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedResourceTracker.f(256877078079990L, 0L);
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DistributedResourceTracker.ab = MultiContainerRegistry.a(-90186635812369509L, 6393507816957200774L, MethodHandles.lookup().lookupClass()).a(220850797677052L);
                DistributedResourceTracker.fb = new Object[5];
                DistributedResourceTracker.jb = new String[5];
                DistributedResourceTracker.i();
                DistributedResourceTracker.eb = new HashMap<K, V>(13);
                var0 = DistributedResourceTracker.ab ^ 43302570471031L;
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
                var6_5 = "i\u0013\u00ab\u0001\u00fb\u00f6\u00a28}_\u0087D\u00f6,5Za=\u00dbt/\u0081\u00e7Hl{\u00f8\u0093L\u00e0\u00c2V\u00f9(\u00fdMkb\u00be\u00d5";
                var7_6 = "i\u0013\u00ab\u0001\u00fb\u00f6\u00a28}_\u0087D\u00f6,5Za=\u00dbt/\u0081\u00e7Hl{\u00f8\u0093L\u00e0\u00c2V\u00f9(\u00fdMkb\u00be\u00d5".length();
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
                    var6_5 = "][\u00b9Bq\u001d\u00f2 \u00a7\u0006\u00f7\u0092\u00d5#x\u00c4";
                    var7_6 = "][\u00b9Bq\u001d\u00f2 \u00a7\u0006\u00f7\u0092\u00d5#x\u00c4".length();
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
        DistributedResourceTracker.bb = var8_3;
        DistributedResourceTracker.db = new Integer[7];
    }

    @Override
    public void g() {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedResourceTracker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DistributedResourceTracker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

