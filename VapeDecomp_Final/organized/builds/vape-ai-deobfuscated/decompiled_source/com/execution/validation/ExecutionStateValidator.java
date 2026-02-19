/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.execution.validation;

import a.bE;
import com.adapter.management.GenericAdapterManager;
import com.app.caching.CacheInvalidationTrigger;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.security.PolicyEnforcementStrategy;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.flags.AsyncFlagCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.data.processing.GenericDataPipeline;
import com.exception.system.CustomSystemException;
import com.financial.contract.TransactionContract;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.rendering.RenderingContextManager;
import com.minecraft.event.RenderEventInterface;
import com.network.connection.ConnectionNegotiator;
import com.network.connection.NetworkConnectionEstablisher;
import com.security.authentication.AuthenticationGateway1860;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.cryptography.CryptographicContextManager153;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.ConfigurationResolver;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ExecutionStateValidator<T>
extends AbstractComputationKernel
implements TransactionContract {
    private final ColorPaletteRenderer sP;
    @Nullable
    private CipherContextManager1101 L;
    private final GraphicalRenderEngine1082 sD;
    @Nullable
    private String F;
    private T D;
    private boolean v;
    private boolean n;
    private static String[] V;
    private boolean s3;
    private static final long[] bb;
    private final Map<String, List<T>> R;
    private static final Map eb;
    private static final String[] jb;
    private static final long ab;
    private final float E = 2.0f;
    private static final Integer[] db;
    private static final Object[] fb;
    private boolean B;
    private boolean so;
    private final List<PolicyEnforcementStrategy> sE;
    @Nullable
    private GenericAdapterManager sb;
    private final RenderEventInterface<T> Y;
    private final String sG;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f1' || c == '\u00e3' || c == '\u00df' || c == 'H') {
                field = ExecutionStateValidator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ExecutionStateValidator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$toggleContent$0(Object object) {
        block8: {
            try {
                this.D = object;
                this.b();
                if (this.sb != null) {
                    this.sb.V((NetworkConnectionEstablisher)this.D);
                    this.L(this.sb);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateValidator.a(customSystemException);
            }
            for (PolicyEnforcementStrategy policyEnforcementStrategy : this.sE) {
                policyEnforcementStrategy.b();
            }
            try {
                try {
                    if (this.sb == null || this.sb.w().isEmpty()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateValidator.a(customSystemException);
                }
                this.F().A();
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateValidator.a(customSystemException);
            }
        }
        this.J();
    }

    @Nullable
    public String E() {
        return this.F;
    }

    public static void v(String[] stringArray) {
        V = stringArray;
    }

    private static List lambda$addOption$2(String string) {
        return new ArrayList();
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = " \u0000d";
        objectArray[1] = Boolean.TYPE;
        ExecutionStateValidator.jb[1] = "java/lang/Boolean";
        objectArray[2] = Void.TYPE;
        ExecutionStateValidator.jb[2] = "java/lang/Void";
        objectArray[3] = Integer.TYPE;
        ExecutionStateValidator.jb[3] = "java/lang/Integer";
        objectArray[4] = "z9gxdTq6v7\u0019Lb1\u007f~";
        objectArray[5] = "U{My:3^t\\6[=U\u007fXl";
        objectArray[6] = "C\u0010d0/+UK.Q$''\u0007g4,1\u001bC% E";
        objectArray[7] = "d}\u001aYv\u0019r&P8g\u0015\u0000.LF!\u0010akZ\u0002|\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "\u000fEvfA:\u0019\u001e<\u0007@'k\u0015*|@eTMwvT\\QTwnO&\t\u00147<+";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public @UnmodifiableView List<T> z() {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (List<T> list : this.R.values()) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public void z(@Nullable String string) {
        this.F = string;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ExecutionStateValidator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void b() {
    }

    private static Field g(long l, long l2) {
        int n = ExecutionStateValidator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = ExecutionStateValidator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ExecutionStateValidator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ExecutionStateValidator.c(clazz3, string2, clazz2)) != null) {
                    ExecutionStateValidator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ExecutionStateValidator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ExecutionStateValidator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ExecutionStateValidator.f(394809966517122L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public ExecutionStateValidator(String string, RenderEventInterface<T> renderEventInterface, T ... TArray) {
        this(string, renderEventInterface, Arrays.asList(TArray));
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block14: {
            CipherContextManager1101 cipherContextManager1101;
            block13: {
                try {
                    if (this.B) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateValidator.a(customSystemException);
                }
                cipherContextManager1101 = this.L;
                try {
                    try {
                        if (cipherContextManager1101 == null || !cipherContextManager1101.G()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateValidator.a(customSystemException);
                    }
                    cipherContextManager1101.S(userInteractionEventDispatcher);
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateValidator.a(customSystemException);
                }
            }
            try {
                block15: {
                    try {
                        try {
                            if (this.so) break block14;
                            if (cipherContextManager1101 == null) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionStateValidator.a(customSystemException);
                        }
                        if (cipherContextManager1101.G()) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateValidator.a(customSystemException);
                    }
                }
                this.J();
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateValidator.a(customSystemException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ExecutionStateValidator.ab = MultiContainerRegistry.a(-2772422087939948456L, -9019118989159939640L, MethodHandles.lookup().lookupClass()).a(247256189798577L);
                ExecutionStateValidator.fb = new Object[9];
                ExecutionStateValidator.jb = new String[9];
                ExecutionStateValidator.i();
                ExecutionStateValidator.eb = new HashMap<K, V>(13);
                ExecutionStateValidator.v(new String[4]);
                var0 = ExecutionStateValidator.ab ^ 12962763308071L;
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
                var6_5 = "\u00f17\u00c6\u00a8C\u0002\u00cb\u00d8A\u00ce\u0006pJb\u0014\u00d5b\u00a0`\tYN\u00b8T\u00a1$\u00e2\u00fb^\u00fc\u00e2\u00eb\u00bc\u0018\u00e9M\u00f0QQ~\u00e7\u001c\u009c\u0018p+\u0089\u00f3\u0084\u00a3\u0097\\\u00b7\u00e7!\u00e2";
                var7_6 = "\u00f17\u00c6\u00a8C\u0002\u00cb\u00d8A\u00ce\u0006pJb\u0014\u00d5b\u00a0`\tYN\u00b8T\u00a1$\u00e2\u00fb^\u00fc\u00e2\u00eb\u00bc\u0018\u00e9M\u00f0QQ~\u00e7\u001c\u009c\u0018p+\u0089\u00f3\u0084\u00a3\u0097\\\u00b7\u00e7!\u00e2".length();
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
                    var6_5 = "\u0001\u00c1 \u0094\u00d0\u00f6\u0096\u00f0\u00e7)Qh\u00cc;.\u00ee";
                    var7_6 = "\u0001\u00c1 \u0094\u00d0\u00f6\u0096\u00f0\u00e7)Qh\u00cc;.\u00ee".length();
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
        ExecutionStateValidator.bb = var8_3;
        ExecutionStateValidator.db = new Integer[9];
    }

    public void c(T t) {
        this.D = t;
        if (t instanceof CacheInvalidationTrigger) {
            CacheInvalidationTrigger cacheInvalidationTrigger = (CacheInvalidationTrigger)t;
            this.g(cacheInvalidationTrigger.e());
        } else {
            this.g(null);
        }
    }

    public void C(T t) {
        this.R.computeIfAbsent(null, ExecutionStateValidator::lambda$addOption$1).add(t);
    }

    @Override
    public boolean y() {
        return this.so;
    }

    @Override
    public void T(boolean bl) {
        this.so = bl;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ExecutionStateValidator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ExecutionStateValidator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String[] R() {
        return V;
    }

    public ExecutionStateValidator(String string, RenderEventInterface<T> renderEventInterface, List<T> list) {
        long l = ab ^ 0x5FB11388829EL;
        this.R = new LinkedHashMap<String, List<T>>();
        this.sE = new ArrayList<PolicyEnforcementStrategy>();
        this.getClass();
        this.sP = new ColorPaletteRenderer(0.15, ExecutionStateValidator.M.S, ExecutionStateValidator.M.k);
        this.E = 2.0f;
        this.v = true;
        this.n = false;
        this.sG = string;
        this.Y = renderEventInterface;
        this.T(110.0);
        this.R.put(null, list);
        this.sD = new GraphicalRenderEngine1082(110.0, 20.0);
        this.sD.d().f((String)((Object)ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)16268, (long)(0x301844819334F67DL ^ l)), (long)-5385654145264213219L, (long)l)));
        this.sD.i(120.0);
        this.sD.i(false);
        this.sD.Q(ExecutionStateValidator.M.L);
        this.sD.C(true);
        this.n(true);
    }

    @Override
    public void U() {
    }

    public void E(String string, T ... TArray) {
        for (T t : TArray) {
            this.X(string, t);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static void x(ExecutionStateValidator executionStateValidator) {
        executionStateValidator.J();
    }

    private void a() {
        CipherContextManager1101 cipherContextManager1101 = this.L;
        try {
            if (cipherContextManager1101 != null) {
                cipherContextManager1101.b(this.G() + this.J());
                cipherContextManager1101.M(this.W() + 17.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateValidator.a(customSystemException);
        }
    }

    public String Z() {
        return this.sG;
    }

    @Override
    public void d() {
        block12: {
            long l;
            block11: {
                l = ab ^ 0x3BAD305197CBL;
                try {
                    try {
                        try {
                            if (!this.s3 || this.s()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionStateValidator.a(customSystemException);
                        }
                        if (this.r()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateValidator.a(customSystemException);
                    }
                    this.sP.c();
                    this.s3 = false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateValidator.a(customSystemException);
                }
            }
            if (this.sb != null) {
                NetworkConnectionEstablisher networkConnectionEstablisher = (NetworkConnectionEstablisher)this.sb.J();
                try {
                    try {
                        if (ExecutionStateValidator.c("\u00c5", (long)-6911708624488932358L, (long)l) != false || !networkConnectionEstablisher.p()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateValidator.a(customSystemException);
                    }
                    ExecutionStateValidator.c("\u00c5", (long)-6911678165032220253L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateValidator.a(customSystemException);
                }
            }
        }
    }

    private static List lambda$addOption$1(String string) {
        return new ArrayList();
    }

    @Override
    public void G() {
        CallSite callSite;
        float f;
        float f2;
        Color color;
        Color color2;
        double d2;
        double d3;
        String string;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        double d4;
        double d5;
        String string2;
        CryptographicParameterGenerator cryptographicParameterGenerator2;
        long l;
        block29: {
            Color color3;
            double d6;
            double d7;
            double d8;
            double d9;
            double d10;
            block25: {
                Color color4;
                double d11;
                double d12;
                double d13;
                double d14;
                block27: {
                    block26: {
                        block24: {
                            String string3;
                            block28: {
                                block21: {
                                    Object object;
                                    RenderEventInterface<T> renderEventInterface;
                                    block23: {
                                        block22: {
                                            Object object2;
                                            l = ab ^ 0x622A0EC64BD4L;
                                            this.S();
                                            cryptographicParameterGenerator2 = this.L(0.85);
                                            try {
                                                object2 = this.sb != null ? this.sb.J() : this.D;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ExecutionStateValidator.a(customSystemException);
                                            }
                                            Object object3 = object2;
                                            try {
                                                try {
                                                    if (object3 == null) break block21;
                                                    renderEventInterface = this.Y;
                                                    if (this.sb == null) break block22;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ExecutionStateValidator.a(customSystemException);
                                                }
                                                object = this.sb.J();
                                                break block23;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ExecutionStateValidator.a(customSystemException);
                                            }
                                        }
                                        object = this.D;
                                    }
                                    string3 = renderEventInterface.W(object);
                                    break block28;
                                }
                                try {
                                    string3 = this.F != null ? this.F : "";
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ExecutionStateValidator.a(customSystemException);
                                }
                            }
                            string2 = string3;
                            try {
                                if (!this.v || this.sG.isEmpty()) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExecutionStateValidator.a(customSystemException);
                            }
                            string2 = this.sG + (String)((Object)ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)14178, (long)(0x6763B819AC9B7D8L ^ l)), (long)8937513916114954839L, (long)l)) + string2;
                        }
                        double d15 = cryptographicParameterGenerator2.B(string2);
                        double d16 = this.W() + this.b() / 2.0 - d15 / 2.0;
                        this.getClass();
                        d5 = d16 + (double)(5.0f / 8.0f);
                        d4 = this.W() + this.b() / 2.0 - (double)(this.E / 2.0f);
                        double d17 = this.b();
                        this.getClass();
                        d10 = d17 - 5.0;
                        if (this.r()) {
                            d10 += this.sD.b();
                        }
                        try {
                            try {
                                if (!this.n) break block25;
                                d14 = this.G() + this.J();
                                double d18 = this.W();
                                this.getClass();
                                d13 = d18 + (double)(5.0f / 2.0f) + 0.5;
                                d12 = this.w() - this.J() - 8.0 + 2.0;
                                d11 = d10 - 1.0;
                                if (!this.so) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExecutionStateValidator.a(customSystemException);
                            }
                            color4 = ExecutionStateValidator.M.L.darker();
                            break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionStateValidator.a(customSystemException);
                        }
                    }
                    color4 = ExecutionStateValidator.M.L;
                }
                ConfigurationManager.o(d14, d13, d12, d11, color4, false, 2.0f, 1.0f);
                break block29;
            }
            try {
                d9 = this.G() + this.J();
                double d19 = this.W();
                this.getClass();
                d8 = d19 + (double)(5.0f / 2.0f) + 0.5;
                d7 = this.w() - this.J() - 8.0 + 2.0;
                d6 = d10 - 1.0;
                color3 = this.so ? ExecutionStateValidator.M.S.darker() : ExecutionStateValidator.M.W;
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateValidator.a(customSystemException);
            }
            ConfigurationManager.o(d9, d8, d7, d6, color3, false, 2.0f, 1.0f);
            double d20 = this.G() + this.J();
            double d21 = this.W();
            this.getClass();
            ConfigurationManager.U(d20, d21 + (double)(5.0f / 2.0f), this.w() - this.J() - 8.0 + 2.0, d10 - 1.0, this.sP.k(), 3.0f, 0.75f, 1.0f);
        }
        try {
            cryptographicParameterGenerator = cryptographicParameterGenerator2;
            string = string2;
            d3 = this.G() + this.J() + 5.0;
            d2 = d5;
            color2 = this.so ? ExecutionStateValidator.M.w : ExecutionStateValidator.M.n;
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateValidator.a(customSystemException);
        }
        try {
            cryptographicParameterGenerator.R(string, d3, d2, color2);
            color = ExecutionStateValidator.M.Z;
            float f3 = (float)(this.G() + this.w());
            this.getClass();
            f2 = f3 - 5.0f * 3.0f;
            f = (float)d4;
            callSite = this.r() ? ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)16916, (long)(0x2C7FE43D7D2D42A8L ^ l)), (long)8937513916114954839L, (long)l) : ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)31589, (long)(0x4A0F1669542B7BDBL ^ l)), (long)8937513916114954839L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateValidator.a(customSystemException);
        }
        StateTrackingCoordinator.B(color, f2, f, (String)((Object)callSite), this.E, this.E, false);
    }

    @Override
    public double z() {
        return 20.0;
    }

    public ExecutionStateValidator(GenericAdapterManager genericAdapterManager) {
        this(genericAdapterManager.O(), GenericDataPipeline.D, (Object[])genericAdapterManager.Z());
        this.sb = genericAdapterManager;
        this.L(genericAdapterManager);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public double e() {
        return 50.0;
    }

    public void q(T ... TArray) {
        for (T t : TArray) {
            this.C(t);
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ExecutionStateValidator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ExecutionStateValidator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void g() {
        try {
            if (!this.s3) {
                this.sP.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateValidator.a(customSystemException);
        }
        this.s3 = true;
    }

    public void U(boolean bl) {
        this.v = bl;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ExecutionStateValidator.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                ExecutionStateValidator.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void X(String string, T t) {
        this.R.computeIfAbsent(string, ExecutionStateValidator::lambda$addOption$2).add(t);
    }

    public boolean r() {
        boolean bl;
        try {
            bl = this.L != null;
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateValidator.a(customSystemException);
        }
        return bl;
    }

    static CipherContextManager1101 M(ExecutionStateValidator executionStateValidator) {
        return executionStateValidator.L;
    }

    public boolean T() {
        return this.n;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7CB4;
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
                throw new RuntimeException("a/y2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ExecutionStateValidator.db[n2] = n3;
        }
        return db[n2];
    }

    @Override
    public void E() {
        super.E();
        CipherContextManager1101 cipherContextManager1101 = this.L;
        try {
            if (cipherContextManager1101 != null) {
                this.a();
                this.sD.h(true);
                this.sD.E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateValidator.a(customSystemException);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ExecutionStateValidator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J() {
        long l = ab ^ 0x71BC46C9287L;
        CipherContextManager1101 cipherContextManager1101 = this.L;
        RenderEventInterface<T> renderEventInterface = this.Y;
        synchronized (renderEventInterface) {
            if (cipherContextManager1101 != null) {
                this.L = null;
                GraphicalRenderingController.d = null;
                GraphicalRenderingController.z(cipherContextManager1101);
            } else {
                this.sD.k();
                this.sD.Y(this.w() - this.J() - 8.0 + 2.0);
                this.sD.k(3.0f);
                for (Map.Entry<String, List<T>> entry : this.R.entrySet()) {
                    String string = entry.getKey();
                    List<T> list = entry.getValue();
                    try {
                        if (list.isEmpty()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateValidator.a(customSystemException);
                    }
                    if (string != null) {
                        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153(string, 0.8);
                        cryptographicContextManager153.q(true);
                        cryptographicContextManager153.B(ExecutionStateValidator.M.c);
                        cryptographicContextManager153.T(cryptographicContextManager153.D() * 1.3);
                        double d2 = (this.sD.w() - cryptographicContextManager153.w()) / 2.0;
                        this.sD.n(new GraphicalRenderController(d2, cryptographicContextManager153.b(), d2 - 4.0, 0.5, ExecutionStateValidator.M.k), ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)6866, (long)(0x59E7148FA3A5C339L ^ l)), (long)-6531617230829997308L, (long)l));
                        this.sD.n(cryptographicContextManager153, ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)24161, (long)(0x3D5BAE6952A878BL ^ l)), (long)-6531617230829997308L, (long)l));
                        this.sD.n(new GraphicalRenderController(d2, cryptographicContextManager153.b(), d2 - 4.0, 0.5, ExecutionStateValidator.M.k), ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)13319, (long)(0x5F55CD914CC56DEBL ^ l)), (long)-6531617230829997308L, (long)l));
                    }
                    for (Object e : list) {
                        Object object;
                        String string2 = this.Y.W(e);
                        RenderingContextManager renderingContextManager = new RenderingContextManager(string2, 0.85);
                        if (e instanceof CacheInvalidationTrigger) {
                            object = (CacheInvalidationTrigger)e;
                            renderingContextManager.g(object.e());
                        }
                        if (e instanceof ConfigurationResolver) {
                            object = (ConfigurationResolver)e;
                            renderingContextManager.C((ConfigurationResolver)object);
                        }
                        if (e instanceof AuthenticationGateway1860) {
                            object = (AuthenticationGateway1860)e;
                            renderingContextManager.w(((AsyncFlagCoordinator)object).E(AsyncFlagCoordinator.q));
                        }
                        renderingContextManager.T(this.sD.w() - 1.0);
                        renderingContextManager.w(12.0);
                        renderingContextManager.C(() -> this.lambda$toggleContent$0(e));
                        this.sD.n(renderingContextManager, ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)3029, (long)(0x6B3DF6A1200CD230L ^ l)), (long)-6531617230829997308L, (long)l));
                    }
                }
                this.sD.n(new bE(0.0, 0.5), ExecutionStateValidator.c("\u00c5", (int)ExecutionStateValidator.b("l", (int)5180, (long)(0xC63F7B45C3CCDD2L ^ l)), (long)-6531617230829997308L, (long)l));
                this.sD.P(Math.min(this.sD.Q(), this.sD.d().R()));
                this.sD.h(true);
                this.L = GraphicalRenderingController.v(this, this.sD, CipherContextManager1101.class);
                this.L.P(new ConnectionNegotiator(this));
                GraphicalRenderingController.d = this;
                this.a();
            }
        }
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
                n3 = 7;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 41;
                break;
            }
            case 3: {
                n3 = 3;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 23;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 54;
                break;
            }
            case 9: {
                n3 = 47;
                break;
            }
            case 10: {
                n3 = 14;
                break;
            }
            case 11: {
                n3 = 19;
                break;
            }
            case 12: {
                n3 = 24;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 9;
                break;
            }
            case 15: {
                n3 = 27;
                break;
            }
            case 16: {
                n3 = 29;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 16;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 18;
                break;
            }
            case 23: {
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 34;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 31;
                break;
            }
            case 27: {
                n3 = 55;
                break;
            }
            case 28: {
                n3 = 11;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 6;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 51;
                break;
            }
            case 35: {
                n3 = 58;
                break;
            }
            case 36: {
                n3 = 57;
                break;
            }
            case 37: {
                n3 = 12;
                break;
            }
            case 38: {
                n3 = 0;
                break;
            }
            case 39: {
                n3 = 43;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 38;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 61;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 63;
                break;
            }
            case 50: {
                n3 = 30;
                break;
            }
            case 51: {
                n3 = 53;
                break;
            }
            case 52: {
                n3 = 37;
                break;
            }
            case 53: {
                n3 = 33;
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
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 25;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 32;
                break;
            }
            default: {
                n3 = 8;
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
        ExecutionStateValidator.jb[n4] = new String(cArray);
        return n4;
    }

    public boolean M() {
        return this.v;
    }

    public void Z(boolean bl) {
        this.n = bl;
    }

    public T y() {
        return this.D;
    }

    public ExecutionStateValidator<T> N(PolicyEnforcementStrategy policyEnforcementStrategy) {
        this.sE.add(policyEnforcementStrategy);
        return this;
    }

    private static Method h(long l, long l2) {
        int n = ExecutionStateValidator.e(l, l2);
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
                clazz3 = ExecutionStateValidator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ExecutionStateValidator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ExecutionStateValidator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ExecutionStateValidator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ExecutionStateValidator.f(394809966517122L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ExecutionStateValidator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ExecutionStateValidator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ExecutionStateValidator.f(394809966517122L, 0L);
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
            return MethodHandles.lookup().findStatic(ExecutionStateValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ExecutionStateValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

