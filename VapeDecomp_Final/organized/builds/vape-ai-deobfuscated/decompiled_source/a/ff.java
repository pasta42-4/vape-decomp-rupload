/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ok;
import a.SB;
import a.Yw;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.reflection.ReflectionUtilityResolver910;
import com.distributed.identity.DistributedIdentityManager;
import com.exception.system.CustomSystemException;
import com.messaging.async.AsyncMessageBroker;
import com.resource.management.CloneableResourceDescriptor;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.ReplicableSecurityContext;
import com.security.session.CryptographicSessionManager;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ff
extends AbstractComputationKernel {
    private static final long b;
    private static final String[] ab;
    private boolean F;
    private static final Map V;
    @Nullable
    private DistributedIdentityManager R;
    private static final Integer[] D;
    private static final long[] v;
    private final CloneableResourceDescriptor E;
    private float n = 12.0f;
    private static final Object[] Y;
    private float B = 1.0f;
    private float L = 12.0f;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ff" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean C() {
        try {
            if (this.R == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ff.a(customSystemException);
        }
        return this.T();
    }

    private void z() {
        block16: {
            Color color;
            Object object;
            block22: {
                block21: {
                    Object object2;
                    boolean bl;
                    block20: {
                        String string;
                        block18: {
                            block19: {
                                long l;
                                block17: {
                                    block15: {
                                        l = b ^ 0x73862F18B27AL;
                                        bl = this.E.T();
                                        string = this.E.g();
                                        try {
                                            if (!this.E.e()) break block15;
                                            this.g((String)((Object)ff.c("\u00a3", (int)ff.b("f", (int)5520, (long)(0x4B3AE1A83C3700ECL ^ l)), (long)-5474576024348970794L, (long)l)) + this.E.k());
                                            this.t(1.0).Q((String)((Object)ff.c("\u00a3", (int)ff.b("f", (int)23677, (long)(0x15B45D20B40C902L ^ l)), (long)-5474576024348970794L, (long)l)), this.G() + this.w() / 2.0, this.W() + this.b() / 2.0 - 4.0, ff.M.c);
                                            break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ff.a(customSystemException);
                                        }
                                    }
                                    if (this.E.i() != null) {
                                        object = this.E.i();
                                        try {
                                            try {
                                                if (!object.equals(ReflectionUtilityResolver910.v) || !this.C()) break block17;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ff.a(customSystemException);
                                            }
                                            return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ff.a(customSystemException);
                                        }
                                    }
                                }
                                try {
                                    try {
                                        this.g("");
                                        if (string != null) break block18;
                                        if (!this.F) break block19;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ff.a(customSystemException);
                                    }
                                    object2 = ff.c("\u00a3", (int)ff.b("f", (int)22225, (long)(0x534D0BD2280EC3A8L ^ l)), (long)-5474576024348970794L, (long)l);
                                    break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ff.a(customSystemException);
                                }
                            }
                            object2 = null;
                            break block20;
                        }
                        object2 = string;
                    }
                    object = object2;
                    try {
                        try {
                            if (object == null) break block16;
                            if (!bl) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ff.a(customSystemException);
                        }
                        color = Color.WHITE;
                        break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ff.a(customSystemException);
                    }
                }
                color = ff.M.Y;
            }
            StateTrackingCoordinator.B(color, (float)(this.G() + this.w() / 2.0 - (double)(this.n / 2.0f)), (float)(this.W() + this.b() / 2.0 - (double)(this.L / 2.0f)), (String)object, this.n, this.L, false);
        }
    }

    private void k(LightweightExecutionContext lightweightExecutionContext, double d2, double d3, float f) {
        ConfigurationManager.C(d2 - 1.0, d3 - 1.0, 10.0, 10.0, ff.M.m, 5.0f);
        ConfigurationManager.G(lightweightExecutionContext, f, d2, d3);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ff.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ff.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ff.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = Y;
        Y[0] = "+\u000b3";
        objectArray[1] = Integer.TYPE;
        ff.ab[1] = "java/lang/Integer";
        objectArray[2] = "n5l\u000f\r\u0014e:}@p\fv=t\t";
        objectArray[3] = "\u0017\u00173mjA\u001c\u0018\"\"\u000bO\u0017\u0013&x";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">\u0018T\u001f<yb\u0017Dx0h\u0004@\u0016Gkwe\u001eE\u0014<\u0013=\u0016\u0017G5jt\u0000M\u0016[";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ff" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void k(int n, double d2, double d3) {
        Object object;
        long l = b ^ 0x66DC6332ECFCL;
        try {
            object = n >= 10 ? ff.c("\u00a3", (int)ff.b("f", (int)24117, (long)(0x374014A7D26A15CDL ^ l)), (long)-1549111523960066480L, (long)l) : (String)((Object)ff.c("\u00a3", (int)ff.b("f", (int)1946, (long)(0x1FF2A9D0C63D4C61L ^ l)), (long)-1549111523960066480L, (long)l)) + n;
        }
        catch (CustomSystemException customSystemException) {
            throw ff.a(customSystemException);
        }
        CallSite callSite = object;
        ConfigurationManager.C(d2 - 1.0, d3 - 1.0, 10.0, 10.0, ff.M.m, 5.0f);
        this.t(0.8).Q((String)((Object)callSite), d2 + 4.0, d3 + 1.0, ff.M.c);
    }

    public float A() {
        return this.n;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ff.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public CloneableResourceDescriptor C() {
        return this.E;
    }

    private static Field g(long l, long l2) {
        int n = ff.e(l, l2);
        Object object = Y[n];
        if (object instanceof String) {
            String string = ab[n];
            int n2 = string.indexOf(8);
            Class clazz = ff.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ff.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ff.c(clazz3, string2, clazz2)) != null) {
                    ff.Y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ff.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ff.Y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ff.f(221181918393941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public ff(Yw yw) {
        if (yw instanceof DistributedIdentityManager) {
            this.R = (DistributedIdentityManager)yw;
            this.E = this.R.A();
        } else {
            this.E = yw.A();
        }
    }

    public ff(CloneableResourceDescriptor cloneableResourceDescriptor) {
        this.E = cloneableResourceDescriptor;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ff.b = MultiContainerRegistry.a(7337782261762076937L, 7003226188280891815L, MethodHandles.lookup().lookupClass()).a(129136388721723L);
                ff.Y = new Object[5];
                ff.ab = new String[5];
                ff.a();
                ff.V = new HashMap<K, V>(13);
                var0 = ff.b ^ 8776155406249L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u0098\u00e3\u009c\u00baP]\u001f\u00bf\u00b1\u00f7\u00df~{\u00df$\u00ab\u0019\u008f\u0017\u00d1\u009d\u009a\u00c1T";
                var7_6 = "\u0098\u00e3\u009c\u00baP]\u001f\u00bf\u00b1\u00f7\u00df~{\u00df$\u00ab\u0019\u008f\u0017\u00d1\u009d\u009a\u00c1T".length();
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
                    var6_5 = "\u00e7\u00bf\u00c1\u0094\b\u0089\u0016\u00f0\u0006\u00eaI+\u0085\u00cf\u00cd\u00f4";
                    var7_6 = "\u00e7\u00bf\u00c1\u0094\b\u0089\u0016\u00f0\u0006\u00eaI+\u0085\u00cf\u00cd\u00f4".length();
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
        ff.v = var8_3;
        ff.D = new Integer[5];
    }

    public ff(DistributedIdentityManager distributedIdentityManager) {
        this(distributedIdentityManager.A());
        this.R = distributedIdentityManager;
    }

    public boolean Q() {
        return this.F;
    }

    public void k(float f) {
        this.n = f;
    }

    public float Y() {
        return this.L;
    }

    public void h(boolean bl) {
        this.F = bl;
    }

    public void w(float f) {
        this.L = f;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ff.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ff.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == 'n' || c == 'D' || c == 'N') {
                field = ff.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ff.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(long l, long l2) {
        int n = ff.e(l, l2);
        Object object = Y[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ab[n];
                int n3 = string2.indexOf(8);
                clazz3 = ff.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ff.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ff.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ff.Y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ff.f(221181918393941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ff.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ff.Y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ff.f(221181918393941L, 0L);
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

    public float n() {
        return this.B;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ff.e(l, l2);
            object = Y[n];
            try {
                if (!(object instanceof String)) break block2;
                ff.Y[n] = clazz = Class.forName(ab[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void G() {
        block6: {
            block4: {
                float f;
                LightweightExecutionContext lightweightExecutionContext;
                block5: {
                    lightweightExecutionContext = this.E.W();
                    try {
                        if (lightweightExecutionContext == null || lightweightExecutionContext.Y()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ff.a(customSystemException);
                    }
                    this.g("");
                    f = this.B;
                    try {
                        if (!(f >= 1.0f) || !(TemporalMetadataResolver.h.a().b() > 1.0)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ff.a(customSystemException);
                    }
                    f = 0.95f;
                }
                float f2 = 16.0f * f;
                ConfigurationManager.G(lightweightExecutionContext, f, this.G() + this.w() / 2.0 - (double)(f2 / 2.0f), this.W() + this.b() / 2.0 - (double)(f2 / 2.0f));
                break block6;
            }
            this.z();
        }
    }

    private boolean T() {
        block18: {
            double d2;
            double d3;
            double d4;
            double d5;
            int n;
            ArrayList<LightweightExecutionContext> arrayList;
            block21: {
                block20: {
                    double d6;
                    block19: {
                        double d7;
                        block17: {
                            CryptographicSessionManager cryptographicSessionManager = this.R.G();
                            try {
                                if (cryptographicSessionManager == null) {
                                    return false;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ff.a(customSystemException);
                            }
                            arrayList = new ArrayList<LightweightExecutionContext>();
                            block12: for (ReplicableSecurityContext replicableSecurityContext : cryptographicSessionManager.E()) {
                                for (AsyncMessageBroker<?> asyncMessageBroker : replicableSecurityContext.A()) {
                                    if (!asyncMessageBroker.A().equals(Ok.MATERIAL)) continue;
                                    SB sB = (SB)asyncMessageBroker;
                                    for (CloneableResourceDescriptor cloneableResourceDescriptor : sB.c()) {
                                        arrayList.add(cloneableResourceDescriptor.W());
                                    }
                                    continue block12;
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    return false;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ff.a(customSystemException);
                            }
                            n = arrayList.size();
                            d5 = this.G() + 6.0;
                            d4 = this.G() + 18.0;
                            d6 = this.G() + 12.0;
                            d3 = this.W() + 6.0;
                            d7 = this.W() + 12.0;
                            d2 = this.W() + 18.0;
                            try {
                                if (n != 1) break block17;
                                ConfigurationManager.G((LightweightExecutionContext)arrayList.get(0), this.B, this.G() + 7.0, this.W() + 7.0);
                                break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ff.a(customSystemException);
                            }
                        }
                        try {
                            if (n != 2) break block19;
                            this.k((LightweightExecutionContext)arrayList.get(0), d5, d7, this.B * 0.5f);
                            this.k((LightweightExecutionContext)arrayList.get(1), d4, d7, this.B * 0.5f);
                            break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ff.a(customSystemException);
                        }
                    }
                    try {
                        if (n != 3) break block20;
                        this.k((LightweightExecutionContext)arrayList.get(0), d6, d3, this.B * 0.5f);
                        this.k((LightweightExecutionContext)arrayList.get(1), d5, d2, this.B * 0.5f);
                        this.k((LightweightExecutionContext)arrayList.get(2), d4, d2, this.B * 0.5f);
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ff.a(customSystemException);
                    }
                }
                try {
                    if (n != 4) break block21;
                    this.k((LightweightExecutionContext)arrayList.get(0), d5, d3, this.B * 0.5f);
                    this.k((LightweightExecutionContext)arrayList.get(1), d4, d3, this.B * 0.5f);
                    this.k((LightweightExecutionContext)arrayList.get(2), d5, d2, this.B * 0.5f);
                    this.k((LightweightExecutionContext)arrayList.get(3), d4, d2, this.B * 0.5f);
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw ff.a(customSystemException);
                }
            }
            this.k((LightweightExecutionContext)arrayList.get(0), d5, d3, this.B * 0.5f);
            this.k((LightweightExecutionContext)arrayList.get(1), d4, d3, this.B * 0.5f);
            this.k((LightweightExecutionContext)arrayList.get(2), d5, d2, this.B * 0.5f);
            this.k(n - 3, d4, d2);
        }
        return true;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ab[n4] != null) {
            return n4;
        }
        Object object = Y[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 17;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 31;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 14;
                break;
            }
            case 8: {
                n3 = 61;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 34;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 48;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 49;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 23;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 0;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 63;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 12;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 26;
                break;
            }
            case 29: {
                n3 = 30;
                break;
            }
            case 30: {
                n3 = 58;
                break;
            }
            case 31: {
                n3 = 11;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 56;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 24;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 35;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 62;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 52;
                break;
            }
            case 45: {
                n3 = 55;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 10;
                break;
            }
            case 48: {
                n3 = 47;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 8;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 28;
                break;
            }
            case 59: {
                n3 = 39;
                break;
            }
            case 60: {
                n3 = 41;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 20;
                break;
            }
            default: {
                n3 = 27;
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
        ff.ab[n4] = new String(cArray);
        return n4;
    }

    public void r(float f) {
        this.B = f;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x217A;
        if (D[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    V.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ff", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ff.D[n2] = n3;
        }
        return D[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ff.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ff.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

