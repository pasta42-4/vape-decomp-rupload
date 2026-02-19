/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.resources.ResourceLifecycleManager1543;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.sync.MultiThreadResourceSynchronizer;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicParameterGenerator;
import com.state.management.StateTransitionController;
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
public class RK
extends AbstractComputationKernel {
    private boolean D = false;
    private boolean R;
    private boolean Y;
    private boolean V;
    private MultiThreadResourceSynchronizer E;
    private int B;
    private static final Integer[] ab;
    private static final Object[] db;
    private boolean F;
    private static final Map bb;
    private static final String[] eb;
    private static final long b;
    private NetworkConfigManager v = new NetworkConfigManager();
    private static final long[] n;
    private LightweightExecutionContext L;

    @Override
    public double b() {
        return this.E.W();
    }

    @Override
    public void U() {
        this.G();
    }

    public void Z(boolean bl) {
        this.F = bl;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eb[n4] != null) {
            return n4;
        }
        Object object = db[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 48;
                break;
            }
            case 2: {
                n3 = 23;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 41;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 58;
                break;
            }
            case 8: {
                n3 = 33;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 10: {
                n3 = 35;
                break;
            }
            case 11: {
                n3 = 59;
                break;
            }
            case 12: {
                n3 = 63;
                break;
            }
            case 13: {
                n3 = 4;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 22;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 25;
                break;
            }
            case 18: {
                n3 = 54;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 19;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 27;
                break;
            }
            case 24: {
                n3 = 39;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 18;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 42;
                break;
            }
            case 30: {
                n3 = 49;
                break;
            }
            case 31: {
                n3 = 8;
                break;
            }
            case 32: {
                n3 = 55;
                break;
            }
            case 33: {
                n3 = 14;
                break;
            }
            case 34: {
                n3 = 36;
                break;
            }
            case 35: {
                n3 = 24;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 51;
                break;
            }
            case 38: {
                n3 = 30;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 3;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 6;
                break;
            }
            case 45: {
                n3 = 10;
                break;
            }
            case 46: {
                n3 = 20;
                break;
            }
            case 47: {
                n3 = 62;
                break;
            }
            case 48: {
                n3 = 9;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 60;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 38;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 34;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 43;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 29;
                break;
            }
            default: {
                n3 = 45;
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
        RK.eb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RK.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public LightweightExecutionContext o() {
        return ApplicationLifecycleManager.U().t().T(this.B).y();
    }

    @Override
    public double z() {
        return 0.0;
    }

    public boolean U() {
        return this.R;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = RK.e(l, l2);
            object = db[n];
            try {
                if (!(object instanceof String)) break block2;
                RK.db[n] = clazz = Class.forName(eb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    @Override
    public double e() {
        return 0.0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                RK.b = MultiContainerRegistry.a(-7935819358531576800L, 1548816334277691686L, MethodHandles.lookup().lookupClass()).a(257338346352869L);
                RK.db = new Object[5];
                RK.eb = new String[5];
                RK.a();
                RK.bb = new HashMap<K, V>(13);
                var0 = RK.b ^ 56688956232530L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00a0\u0087\u00c1\r\\\u007fp\u00c5\u00a3\u00c5\u0092\u00b6\u00b6\u0093@\u00c7*&VpN\u00d3\u007fv\\Z\u0095\u00b4~\u00d7Rk";
                var7_6 = "\u00a0\u0087\u00c1\r\\\u007fp\u00c5\u00a3\u00c5\u0092\u00b6\u00b6\u0093@\u00c7*&VpN\u00d3\u007fv\\Z\u0095\u00b4~\u00d7Rk".length();
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
                    var6_5 = "\u00c4\u00cb\u00bc\u0081\u0089#zS\u00be\u00f9\u00fb\t\u00b3\u00ab\u0095[";
                    var7_6 = "\u00c4\u00cb\u00bc\u0081\u0089#zS\u00be\u00f9\u00fb\t\u00b3\u00ab\u0095[".length();
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
        RK.n = var8_3;
        RK.ab = new Integer[6];
    }

    public void I(boolean bl) {
        this.D = bl;
    }

    private static Method h(long l, long l2) {
        int n = RK.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n];
                int n3 = string2.indexOf(8);
                clazz3 = RK.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RK.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RK.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        RK.db[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RK.f(215074641897600L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RK.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RK.db[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RK.f(215074641897600L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == 'J' || c == 'r' || c == '\u00d9') {
                field = RK.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RK.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public RK(MultiThreadResourceSynchronizer multiThreadResourceSynchronizer, int n, LightweightExecutionContext lightweightExecutionContext) {
        this.E = multiThreadResourceSynchronizer;
        this.B = n;
        this.L = lightweightExecutionContext;
    }

    public ResourceLifecycleManager1543 A() {
        return ApplicationLifecycleManager.U().t().T(this.B);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x91D;
        if (ab[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = RK.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])bb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/RK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RK.ab[n2] = n3;
        }
        return ab[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = RK.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            String string = eb[n];
            int n2 = string.indexOf(8);
            Class clazz = RK.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RK.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RK.c(clazz3, string2, clazz2)) != null) {
                    RK.db[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RK.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RK.db[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RK.f(215074641897600L, 0L);
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
    @Override
    public void G() {
        block27: {
            block26: {
                block25: {
                    block24: {
                        block30: {
                            block21: {
                                block23: {
                                    block22: {
                                        block28: {
                                            var1_1 = this.C();
                                            if (var1_1.r()) ** GOTO lbl9
                                            if (!this.D) break block21;
                                            break block28;
                                            catch (Exception v0) {
                                                throw RK.a(v0);
                                            }
                                        }
                                        try {
                                            block29: {
                                                this.v.m();
                                                this.R = false;
                                                v1 = this;
                                                if (this.t() > 2) break block22;
                                                break block29;
                                                catch (Exception v2) {
                                                    throw RK.a(v2);
                                                }
                                            }
                                            v3 = true;
                                            break block23;
                                        }
                                        catch (Exception v4) {
                                            throw RK.a(v4);
                                        }
                                    }
                                    v3 = false;
                                }
                                v1.V = v3;
                                break block30;
                            }
                            try {
                                if (this.V) {
                                    this.R = true;
                                    this.V = false;
                                }
                            }
                            catch (Exception v5) {
                                throw RK.a(v5);
                            }
                        }
                        if (!this.R) break block24;
                        try {
                            block31: {
                                if (!this.v.m(4000L)) break block24;
                                break block31;
                                catch (Exception v6) {
                                    throw RK.a(v6);
                                }
                            }
                            this.N(false);
                        }
                        catch (Exception v7) {
                            throw RK.a(v7);
                        }
                    }
                    if (!var1_1.Y()) break block25;
                    try {
                        block32: {
                            if (this.R) break block25;
                            break block32;
                            catch (Exception v8) {
                                throw RK.a(v8);
                            }
                        }
                        this.N(false);
                    }
                    catch (Exception v9) {
                        throw RK.a(v9);
                    }
                }
                try {
                    if (!this.Y) break block26;
                    this.G(var1_1);
                    break block27;
                }
                catch (Exception v10) {
                    throw RK.a(v10);
                }
            }
            try {
                this.e(var1_1);
            }
            catch (Exception var2_2) {
                TemporalMetadataResolver.W(var2_2);
            }
        }
    }

    public LightweightExecutionContext C() {
        try {
            if (this.D) {
                return this.L;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        return this.o();
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = RK.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RK.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RK.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RK.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void e(LightweightExecutionContext lightweightExecutionContext) {
        Object object;
        int n;
        long l = b ^ 0x177D85C87251L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(0.85, true);
        try {
            if (this.R) {
                ConfigurationManager.A((float)this.G() - 2.0f, (float)this.W(), this.E.w(), this.b(), this.E.s(new Color(250, 50, 57, 120)));
                StateTrackingCoordinator.y(this.E.s(RK.M.O), (float)this.G() + 2.0f, (float)this.W() + 3.0f, (String)((Object)RK.c("\u00b5", (int)RK.b("z", (int)22150, (long)(0x7A6283FD74968BBDL ^ l)), (long)-3159803367347475255L, (long)l)), 0.45f);
                StateTrackingCoordinator.y(this.E.s(RK.M.O), (float)this.G() + 23.0f, (float)this.W() + 11.0f, (String)((Object)RK.c("\u00b5", (int)RK.b("z", (int)5879, (long)(0x5E5F21932456CBCDL ^ l)), (long)-3159803367347475255L, (long)l)), 0.2f);
                ConfigurationManager.T(this.G() + 20.0, this.W() + 4.0, 12.0, 2.0f, this.E.s(RK.M.O));
                cryptographicParameterGenerator.R((String)((Object)RK.c("\u00b5", (int)RK.b("z", (int)23705, (long)(0x29053D0C464681A6L ^ l)), (long)-3159803367347475255L, (long)l)), this.G() + 26.0, this.W() + 5.0, this.E.A());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        try {
            if (lightweightExecutionContext.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        float f = (float)this.t() / 100.0f;
        if (f < 0.1f) {
            float f2 = (0.1f - f) / 0.1f;
            n = (int)(30.0f + 30.0f * f2);
            object = this.E.s(new Color(250, 50, 57, n));
            ConfigurationManager.A(this.G() - 2.0, this.W(), this.E.w(), this.b(), (Color)object);
        }
        Color color = EventDispatchCoordinator1159.y(Color.WHITE, 51);
        ConfigurationManager.T(this.G() + 20.0, this.W() + 4.0, 12.0, 2.0f, this.E.s(color));
        StateTransitionController.A(lightweightExecutionContext, (float)(this.G() + 2.0), (float)(this.W() + 2.0), 16, 16, this.E.L(), 1.0f);
        n = this.t();
        try {
            if (n == -1) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        object = String.valueOf(this.t());
        cryptographicParameterGenerator.R((String)object + (String)((Object)RK.c("\u00b5", (int)RK.b("z", (int)15432, (long)(0x2CC23F23FA556176L ^ l)), (long)-3159803367347475255L, (long)l)), this.G() + 26.0, this.W() + 5.0, this.E.A());
        ConfigurationManager.o(this.G() + 26.0, this.W() + 13.0, 20.0, 1.5, this.E.s(new Color(0, 0, 0, 153)), false, 1.0f, 1.0f);
        ConfigurationManager.c(this.G() + 26.0, this.W() + 13.0, 20.0f * f, 1.5, this.E.s(GraphicsBufferAllocator.B(f, true)), true, 1.0f, 1.0f, 4.0f, this.E.s(new Color(0, 0, 0, 75)));
    }

    private void G(LightweightExecutionContext lightweightExecutionContext) {
        long l = b ^ 0xBC222A44D92L;
        try {
            if (this.R) {
                ConfigurationManager.A((float)this.G() - 2.0f, (float)this.W(), this.E.w(), this.b(), this.E.s(new Color(250, 50, 57, 120)));
                StateTrackingCoordinator.y(this.E.s(RK.M.O), (float)this.G() + 4.0f, (float)this.W() + 3.0f, (String)((Object)RK.c("\u00b5", (int)RK.b("z", (int)1989, (long)(0x590EB94A7C1D653EL ^ l)), (long)-1448748219524214006L, (long)l)), 0.45f);
                StateTrackingCoordinator.y(this.E.s(RK.M.O), (float)(this.G() + 1.0), (float)this.W() + 15.0f, (String)((Object)RK.c("\u00b5", (int)RK.b("z", (int)3713, (long)(0x7A93D857D769EC7BL ^ l)), (long)-1448748219524214006L, (long)l)), 0.15f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        try {
            if (lightweightExecutionContext.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        float f = (float)this.t() / 100.0f;
        if (f < 0.1f) {
            float f2 = (0.1f - f) / 0.1f;
            int n = (int)(30.0f + 30.0f * f2);
            Color color = this.E.s(new Color(250, 50, 57, n));
            double d2 = this.b();
            ConfigurationManager.A(this.G() - 2.0, this.W(), this.E.w(), d2, color);
        }
        StateTransitionController.x(lightweightExecutionContext, (float)(this.G() + 3.0), (float)this.W(), 16, 16, this.E.L());
        ConfigurationManager.o(this.G() + 1.0, this.W() + 17.0, 20.0, 1.5, this.E.s(new Color(0, 0, 0, 153)), false, 1.0f, 1.0f);
        ConfigurationManager.c(this.G() + 1.0, this.W() + 17.0, 20.0f * f, 1.5, this.E.s(GraphicsBufferAllocator.B(f, true)), true, 1.0f, 1.0f, 4.0f, this.E.s(new Color(0, 0, 0, 75)));
        if (!this.F) {
            Color color = EventDispatchCoordinator1159.y(Color.WHITE, 51);
            ConfigurationManager.r(this.G() + 7.0, this.W() + 23.0, 8.0, 2.0f, color);
        }
    }

    private static void a() {
        Object[] objectArray = db;
        db[0] = "~4U";
        objectArray[1] = Integer.TYPE;
        RK.eb[1] = "java/lang/Integer";
        objectArray[2] = "\u001d\u0013~\u0007D%\u0016\u001coH9=\u0005\u001bf\u0001";
        objectArray[3] = "\u0000WB\u001df\u001b\u000bXSR\u0007\u0015\u0000SW\b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "oqN4\u0000\u001b=q\u001eM\u000e\u0019\u0000e\u0013-\u0014\rn'O!e[aeR}\u0015\u001b{$RM";
    }

    public void u(boolean bl) {
        this.Y = bl;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RK.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private int t() {
        LightweightExecutionContext lightweightExecutionContext;
        block13: {
            lightweightExecutionContext = this.C();
            try {
                try {
                    if (lightweightExecutionContext != null && !lightweightExecutionContext.Y()) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw RK.a(customSystemException);
                }
                return -1;
            }
            catch (CustomSystemException customSystemException) {
                throw RK.a(customSystemException);
            }
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (protocolInteractionController.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        float f = protocolInteractionController.v();
        float f2 = lightweightExecutionContext.b();
        float f3 = f - f2;
        try {
            if (f3 == 0.0f) {
                return 1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        try {
            if (f3 < 0.0f) {
                return 100;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RK.a(customSystemException);
        }
        return (int)Math.ceil(f3 / f * 100.0f);
    }

    @Override
    public double w() {
        return this.E.w();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RK.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(RK.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

