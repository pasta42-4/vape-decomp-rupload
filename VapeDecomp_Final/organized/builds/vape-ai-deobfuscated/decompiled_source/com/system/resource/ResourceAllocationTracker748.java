/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.collections.management.MultiContainerRegistry;
import com.data.filtering.PredicateFilter;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.ResourceAllocationManager1749;
import com.system.resource.SystemResourceAllocator1279;
import com.text.processing.PatternMatchingOrchestrator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ResourceAllocationTracker748 {
    private static final String[] f;
    private static final long a;
    private static final Map d;
    private static final Object[] e;
    private final HashSet<PredicateFilter> q;
    private static final long[] b;
    private static final Integer[] c;

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public Predicate<Character> f(String string) {
        for (PredicateFilter predicateFilter : this.q) {
            for (String string2 : predicateFilter.D()) {
                try {
                    if (!string2.equalsIgnoreCase(string)) continue;
                    return predicateFilter.x();
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker748.a(customSystemException);
                }
            }
        }
        return null;
    }

    private void F(PredicateFilter predicateFilter, Class ... classArray) {
        predicateFilter.E(classArray);
        this.q.add(predicateFilter);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationTracker748.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationTracker748.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationTracker748.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationTracker748.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean R(String string, LightweightExecutionContext lightweightExecutionContext) {
        ProtocolInteractionController protocolInteractionController = null;
        if (lightweightExecutionContext.r()) {
            protocolInteractionController = lightweightExecutionContext.C();
        }
        for (PredicateFilter predicateFilter : this.q) {
            for (String string2 : predicateFilter.D()) {
                block22: {
                    block23: {
                        try {
                            try {
                                try {
                                    try {
                                        if (!string2.equalsIgnoreCase(string)) continue;
                                        if (predicateFilter.J() == null) break block22;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker748.a(customSystemException);
                                    }
                                    if (predicateFilter.J().length != 0) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker748.a(customSystemException);
                                }
                                if (!lightweightExecutionContext.Y()) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker748.a(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker748.a(customSystemException);
                        }
                    }
                    for (Class clazz : predicateFilter.J()) {
                        try {
                            try {
                                if (protocolInteractionController == null || !protocolInteractionController.B(clazz)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker748.a(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker748.a(customSystemException);
                        }
                    }
                    continue;
                }
                try {
                    try {
                        try {
                            if (predicateFilter.x() == null || protocolInteractionController == null) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker748.a(customSystemException);
                        }
                        if (!predicateFilter.x().test(protocolInteractionController)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker748.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker748.a(customSystemException);
                }
            }
        }
        return false;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == '\u00fb' || c == '\u00c0' || c == '\u00de') {
                field = ResourceAllocationTracker748.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationTracker748.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public ResourceAllocationTracker748() {
        long l = a ^ 0x69C62511825FL;
        this.q = new HashSet();
        Predicate<ProtocolInteractionController> predicate = ResourceAllocationTracker748::lambda$new$0;
        this.f(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)19252, (long)(0x15AA9919F0B8BBEDL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)28500, (long)(0x2555635FA7F1F87L ^ l)), (long)5438211903430711847L, (long)l)}, null), RuntimeResourceTracker::a);
        this.F(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)6228, (long)(0x6D58A8CA0421E89DL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)27908, (long)(0x2B67EDA61A591DC8L ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)20752, (long)(0x5588FAE351EFA1CBL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)28607, (long)(0x3AC9B23967071F61L ^ l)), (long)5438211903430711847L, (long)l)}, null), ReflectionMetadataResolver.x);
        this.F(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)3333, (long)(0x76B28B67B4437DD3L ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)15163, (long)(0x1E21C26686F14BE3L ^ l)), (long)5438211903430711847L, (long)l)}, null), ReflectionMetadataResolver.EL);
        this.f(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)7487, (long)(0x682EAFC6F79DEDEAL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)15475, (long)(0xA051E288B164CBCL ^ l)), (long)5438211903430711847L, (long)l)}, null), RuntimeResourceTracker::s);
        this.f(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)6961, (long)(0x16780521FC5AEBECL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)22845, (long)(0x2D669338D99BA9E1L ^ l)), (long)5438211903430711847L, (long)l)}, null), predicate);
        this.F(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)31667, (long)(0x18AF004993F90B7BL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)11119, (long)(0x22B90B23BD0DBA2L ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)29945, (long)(0x368F001370E0042BL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)5585, (long)(0xA3AE2F5975D6500L ^ l)), (long)5438211903430711847L, (long)l)}, null), new Class[0]);
        this.F(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)25256, (long)(0x9D8BB3727FD927CL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)3180, (long)(0xB72CC2415ADFCA2L ^ l)), (long)5438211903430711847L, (long)l)}, null), ReflectionMetadataResolver.bO);
        this.F(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)30360, (long)(0x31E5C4F2D5D5064FL ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)5902, (long)(0x614425E6991567D1L ^ l)), (long)5438211903430711847L, (long)l)}, null), ReflectionMetadataResolver.Fl);
        this.P(new PredicateFilter(new String[]{ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)32290, (long)(0x29375567A7380EF2L ^ l)), (long)5438211903430711847L, (long)l), ResourceAllocationTracker748.b("q", (int)ResourceAllocationTracker748.a("i", (int)11626, (long)(0x363851E26D605DB0L ^ l)), (long)5438211903430711847L, (long)l)}, null), PatternMatchingOrchestrator::t);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationTracker748.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "}_A";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationTracker748.f[1] = "java/lang/Integer";
        objectArray[2] = "c\u0013U(h\rh\u001cDg\u0015\u0015{\u001bM.";
        objectArray[3] = "fzpvF+mua9'%f~ec";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0014\u007f\u001a)'?Jr\u0004Pw#)v\u0002/v?Hv\u0003azX\u00104\u0001`uaI5\u0005=\u001c";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationTracker748.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void P(PredicateFilter predicateFilter, Predicate<Character> predicate) {
        predicateFilter.y(predicate);
        this.q.add(predicateFilter);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(long l, long l2) {
        int n = ResourceAllocationTracker748.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationTracker748.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationTracker748.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationTracker748.a(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationTracker748.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationTracker748.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationTracker748.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationTracker748.b(234970514737521L, 0L);
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
                ResourceAllocationTracker748.a = MultiContainerRegistry.a(-5423349318794962286L, -6153265667041668603L, MethodHandles.lookup().lookupClass()).a(149761537377899L);
                ResourceAllocationTracker748.e = new Object[5];
                ResourceAllocationTracker748.f = new String[5];
                ResourceAllocationTracker748.a();
                ResourceAllocationTracker748.d = new HashMap<K, V>(13);
                var0 = ResourceAllocationTracker748.a ^ 76073496302291L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "Q\u00c4\u00c6\u001f(A\u00b9\u00b2>ZCC\u00f8 \u00fb2\u00ee{\u008fq\u0088y\u0002\u0019\u00f6\u000f>0=\u00b5\u008c\u00d47 \u00b6_19\u00d9\u009f\u000f\u00d0\u00a2\u0000\u00d0J\u00fd\u00b2\u0084\u00aa\u00f2*\n\u0001\u00b8#=T\"Q%l\u00fcYN\u0019\u00a7\u00d2\u0003\u00bc&\u0017(\u0080Y\u00ce\u00e9\u00ac\u00bf\u000eo\u009bds\u00ec<71\u00c7\u00edj,\u00f4\u00be\u00c8/\u00f0\u00ca\u00afG\u00b7\u00b5mf\u00ab\u00bdZj\u0019\u0013\u00d4\u00aa\u00ce\u00b9uY\f\u00a8\u00ca:\u00b7\u00f5\u00e1\u00caFUX\u0003\u00ed0\u00f1n\u00cb\u00b3\u00a9\u009by\u00b4>\u00b7\u0005q\u00b3\u00ef4$\u00c2\u00b2\u0018\u00bd\u00bb\u0089\u008d\u001d\u0088\u008a\u00e5\u0005q(";
                var7_6 = "Q\u00c4\u00c6\u001f(A\u00b9\u00b2>ZCC\u00f8 \u00fb2\u00ee{\u008fq\u0088y\u0002\u0019\u00f6\u000f>0=\u00b5\u008c\u00d47 \u00b6_19\u00d9\u009f\u000f\u00d0\u00a2\u0000\u00d0J\u00fd\u00b2\u0084\u00aa\u00f2*\n\u0001\u00b8#=T\"Q%l\u00fcYN\u0019\u00a7\u00d2\u0003\u00bc&\u0017(\u0080Y\u00ce\u00e9\u00ac\u00bf\u000eo\u009bds\u00ec<71\u00c7\u00edj,\u00f4\u00be\u00c8/\u00f0\u00ca\u00afG\u00b7\u00b5mf\u00ab\u00bdZj\u0019\u0013\u00d4\u00aa\u00ce\u00b9uY\f\u00a8\u00ca:\u00b7\u00f5\u00e1\u00caFUX\u0003\u00ed0\u00f1n\u00cb\u00b3\u00a9\u009by\u00b4>\u00b7\u0005q\u00b3\u00ef4$\u00c2\u00b2\u0018\u00bd\u00bb\u0089\u008d\u001d\u0088\u008a\u00e5\u0005q(".length();
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
                    var6_5 = "n~\u0092\u00c9\u00a5\u00a9=\u00e4\u00b5+.q\u00b0@\u00b4J";
                    var7_6 = "n~\u0092\u00c9\u00a5\u00a9=\u00e4\u00b5+.q\u00b0@\u00b4J".length();
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
        ResourceAllocationTracker748.b = var8_3;
        ResourceAllocationTracker748.c = new Integer[22];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3BA5;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Xl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationTracker748.c[n2] = n3;
        }
        return c[n2];
    }

    private void f(PredicateFilter predicateFilter, Predicate<ProtocolInteractionController> predicate) {
        predicateFilter.y(predicate);
        this.q.add(predicateFilter);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationTracker748.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationTracker748.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = ResourceAllocationTracker748.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceAllocationTracker748.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationTracker748.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationTracker748.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationTracker748.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationTracker748.b(234970514737521L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationTracker748.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationTracker748.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationTracker748.b(234970514737521L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 32;
                break;
            }
            case 1: {
                n3 = 36;
                break;
            }
            case 2: {
                n3 = 62;
                break;
            }
            case 3: {
                n3 = 19;
                break;
            }
            case 4: {
                n3 = 39;
                break;
            }
            case 5: {
                n3 = 52;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 7;
                break;
            }
            case 11: {
                n3 = 33;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 1;
                break;
            }
            case 15: {
                n3 = 40;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 43;
                break;
            }
            case 18: {
                n3 = 20;
                break;
            }
            case 19: {
                n3 = 57;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 3;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 26;
                break;
            }
            case 25: {
                n3 = 27;
                break;
            }
            case 26: {
                n3 = 37;
                break;
            }
            case 27: {
                n3 = 51;
                break;
            }
            case 28: {
                n3 = 9;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 0;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 25;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 58;
                break;
            }
            case 40: {
                n3 = 4;
                break;
            }
            case 41: {
                n3 = 21;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 53;
                break;
            }
            case 45: {
                n3 = 48;
                break;
            }
            case 46: {
                n3 = 22;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 13;
                break;
            }
            case 49: {
                n3 = 60;
                break;
            }
            case 50: {
                n3 = 59;
                break;
            }
            case 51: {
                n3 = 54;
                break;
            }
            case 52: {
                n3 = 55;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 6;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 56;
                break;
            }
            case 60: {
                n3 = 30;
                break;
            }
            case 61: {
                n3 = 5;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 61;
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
        ResourceAllocationTracker748.f[n4] = new String(cArray);
        return n4;
    }

    private static boolean lambda$new$0(ProtocolInteractionController protocolInteractionController) {
        try {
            if (!protocolInteractionController.B(ReflectionMetadataResolver.YX)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker748.a(customSystemException);
        }
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            boolean bl;
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            boolean bl2 = resourceAllocationManager1749.c(SystemResourceAllocator1279.Z());
            try {
                bl = !bl2;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker748.a(customSystemException);
            }
            return bl;
        }
        return true;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker748.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker748.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

