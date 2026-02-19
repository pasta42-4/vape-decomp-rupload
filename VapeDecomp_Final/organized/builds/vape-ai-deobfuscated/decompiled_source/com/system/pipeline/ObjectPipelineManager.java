/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.pipeline;

import a.V3;
import com.app.exceptions.CustomApplicationException;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.system.resource.ResourceAllocationManager1058;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class ObjectPipelineManager {
    public static final ResourceAllocationManager1058 H;
    public static final ResourceAllocationManager1058 n;
    private static final String[] p;
    public static final ResourceAllocationManager1058 b;
    public static final ResourceAllocationManager1058 U;
    public static final ResourceAllocationManager1058 i;
    public static final ResourceAllocationManager1058 j;
    private static boolean A;
    private static final Map<Short, ResourceAllocationManager1058> Z;
    public static final ResourceAllocationManager1058 T;
    public static final ResourceAllocationManager1058 f;
    public static final ResourceAllocationManager1058 q;
    public static final ResourceAllocationManager1058 d;
    public static final ResourceAllocationManager1058 E;
    public static final ResourceAllocationManager1058 k;
    public static final ResourceAllocationManager1058 S;
    public static final ResourceAllocationManager1058 G;
    public static final ResourceAllocationManager1058 h;
    public static final ResourceAllocationManager1058 W;
    public static final ResourceAllocationManager1058 Q;
    private static final Map<Integer, ResourceAllocationManager1058> l;
    public static final ResourceAllocationManager1058 R;
    public static final ResourceAllocationManager1058 c;
    public static final ResourceAllocationManager1058 r;
    public static final ResourceAllocationManager1058 M;
    public static final ResourceAllocationManager1058 y;
    public static final ResourceAllocationManager1058 s;
    public static final ResourceAllocationManager1058 I;
    public static final ResourceAllocationManager1058 Y;
    public static final ResourceAllocationManager1058 v;
    public static final ResourceAllocationManager1058 o;
    public static final ResourceAllocationManager1058 J;
    public static final ResourceAllocationManager1058 a;
    public static final ResourceAllocationManager1058 P;
    private static final Object[] e;
    public static final ResourceAllocationManager1058 F;
    public static final ResourceAllocationManager1058 K;
    public static final ResourceAllocationManager1058 N;
    public static final ResourceAllocationManager1058 B;
    public static final ResourceAllocationManager1058 X;
    public static final ResourceAllocationManager1058 w;
    public static final ResourceAllocationManager1058 g;
    public static final ResourceAllocationManager1058 D;
    public static final ResourceAllocationManager1058 m;

    private static void a() {
        Object[] objectArray = e;
        e[0] = "f\u0013x";
        objectArray[1] = Integer.TYPE;
        ObjectPipelineManager.p[1] = "java/lang/Integer";
        objectArray[2] = "ZQ$z\n!Q^55w9BY<|";
        objectArray[3] = "r9\u0001\u0011Soy6\u0010^2ar=\u0014\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "m\u0006#Em l\u001d\u007f~v*\u0003M~\u0005`5:\n%\u0014,Q9Ny\u001bdj~O<\u0019\u001d";
    }

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

    @Nullable
    public static ResourceAllocationManager1058 r(short s2) {
        return Z.get(s2);
    }

    @Nullable
    public static ResourceAllocationManager1058 u(V3 v3) {
        return l.get(v3.n());
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Hv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void h() {
        try {
            if (A) {
                return;
            }
        }
        catch (CustomApplicationException customApplicationException) {
            throw ObjectPipelineManager.a(customApplicationException);
        }
        A = true;
        for (Field field : ObjectPipelineManager.class.getDeclaredFields()) {
            if (!field.getType().equals(ResourceAllocationManager1058.class)) continue;
            ResourceAllocationManager1058 resourceAllocationManager1058 = null;
            try {
                resourceAllocationManager1058 = (ResourceAllocationManager1058)field.get(null);
                resourceAllocationManager1058.Y();
            }
            catch (CustomApplicationException customApplicationException) {
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if (resourceAllocationManager1058 == null) {
                    continue;
                }
            }
            catch (CustomApplicationException customApplicationException) {
                throw ObjectPipelineManager.a(customApplicationException);
            }
            Z.put(resourceAllocationManager1058.G(), resourceAllocationManager1058);
            l.put(resourceAllocationManager1058.N(), resourceAllocationManager1058);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ObjectPipelineManager.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ObjectPipelineManager.e[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ObjectPipelineManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static List<ResourceAllocationManager1058> R() {
        return new ArrayList<ResourceAllocationManager1058>(Z.values());
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'P' || c == '\u00ed' || c == '\u00a4') {
                field = ObjectPipelineManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ObjectPipelineManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ObjectPipelineManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ObjectPipelineManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = ObjectPipelineManager.a(l, l2);
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
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = ObjectPipelineManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ObjectPipelineManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ObjectPipelineManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ObjectPipelineManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ObjectPipelineManager.b(252991630660654L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ObjectPipelineManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ObjectPipelineManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ObjectPipelineManager.b(252991630660654L, 0L);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ObjectPipelineManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ObjectPipelineManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static List<ResourceAllocationManager1058> n() {
        ArrayList<ResourceAllocationManager1058> arrayList = new ArrayList<ResourceAllocationManager1058>();
        for (ResourceAllocationManager1058 resourceAllocationManager1058 : Z.values()) {
            try {
                if (resourceAllocationManager1058.f() == null) continue;
                arrayList.add(resourceAllocationManager1058);
            }
            catch (CustomSystemException customSystemException) {
                throw ObjectPipelineManager.a(customSystemException);
            }
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = MultiContainerRegistry.a(5082002196772391321L, -8260770643428425451L, MethodHandles.lookup().lookupClass()).a(30125187705445L) ^ 62648268362703L;
                ObjectPipelineManager.e = new Object[5];
                ObjectPipelineManager.p = new String[5];
                ObjectPipelineManager.a();
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[39];
                var4_4 = 0;
                var5_5 = "U\u00ea\u00d4_\u00aew\u00b8\u0090#E\u0088$\u00fe_\u0082\u00f8\u00f0e\u0019\u0098\n>\u00ce+\u0011\u00966\u0098@j\u0014\u0013\u0089\u00e0]\u00b7`\u00d3D\u00e8\u001eg\u0095}\u0091\u0005$I\u0004lG\u008d(0\u0000\u00ecn_\u00b8\u00e4\u00d2_\u00db\r\u00b6\u00a5\u00bb\u00b0)\u00e0\u00f3\u009e/\u0089n-\"\u00a6\u00db\u008e>\u001e\u0018\u00eb\u0007\u00e9\u001d\u0083\u00a5%\u00a0\u00b9c*\u0082\u001f\u00eb$OE\u00e1],\u009f\u0005\u0089c\u008f\u00aa0\u0081\u00d8\u009c\u008c\u009a\u00a8\u00e5?$\u000ft\u00dd\u000fX\u00b6\u00e9\u00d7p\u0017\u00ce\u00c6\u00b2\u0082\u00cb\u00b7\u00fd\u008edx\u00dc\u001emS\u0095\u0092\u0006\u00ad\u001a\u00cd\n\u0004\u000e\u008dG;\u00b1B\u0017V\u00ff+\u00f2m\u0005\u0018J\u0093\u0088#\u0010\u00e4\u000e\u00cc~\u00f9\u00fc'j\u00f8\u00f9u%|ua\"uwb\u00a6/\u00d2\u0085\u00aa\u0096\u0097\u00c0\u00c4\u00f1(\bg\u001f\u00bbv\u00c0v\u009a!\u0098\u00aa\u0087\u00ab0%m\u0096\u00fbv\u00ae0\u00ddB\u00cd#\u00d4\u00ac{\u0098\u0098z\u00db5\u009e\u00c5\u0083z\u0091\u0095\u007f\u0089\u0005\u00fd\u00b0\u00c3etl\u007f\u0010\u00159\u0003\u00ab\u00b9A\u00b3\u00b1];\u008d(\t\u0083\u00b3\u0005W\u0093\u00df\u000f\u00f3\u009a\u00ca\u009f\u00b8\u00d9\u00e6\u0097%\u00f0bLX\u0016T\u00a5\u00c3\u0099\u000e'\u00c9\u00d3G\u008f\u00cb\u0083";
                var6_6 = "U\u00ea\u00d4_\u00aew\u00b8\u0090#E\u0088$\u00fe_\u0082\u00f8\u00f0e\u0019\u0098\n>\u00ce+\u0011\u00966\u0098@j\u0014\u0013\u0089\u00e0]\u00b7`\u00d3D\u00e8\u001eg\u0095}\u0091\u0005$I\u0004lG\u008d(0\u0000\u00ecn_\u00b8\u00e4\u00d2_\u00db\r\u00b6\u00a5\u00bb\u00b0)\u00e0\u00f3\u009e/\u0089n-\"\u00a6\u00db\u008e>\u001e\u0018\u00eb\u0007\u00e9\u001d\u0083\u00a5%\u00a0\u00b9c*\u0082\u001f\u00eb$OE\u00e1],\u009f\u0005\u0089c\u008f\u00aa0\u0081\u00d8\u009c\u008c\u009a\u00a8\u00e5?$\u000ft\u00dd\u000fX\u00b6\u00e9\u00d7p\u0017\u00ce\u00c6\u00b2\u0082\u00cb\u00b7\u00fd\u008edx\u00dc\u001emS\u0095\u0092\u0006\u00ad\u001a\u00cd\n\u0004\u000e\u008dG;\u00b1B\u0017V\u00ff+\u00f2m\u0005\u0018J\u0093\u0088#\u0010\u00e4\u000e\u00cc~\u00f9\u00fc'j\u00f8\u00f9u%|ua\"uwb\u00a6/\u00d2\u0085\u00aa\u0096\u0097\u00c0\u00c4\u00f1(\bg\u001f\u00bbv\u00c0v\u009a!\u0098\u00aa\u0087\u00ab0%m\u0096\u00fbv\u00ae0\u00ddB\u00cd#\u00d4\u00ac{\u0098\u0098z\u00db5\u009e\u00c5\u0083z\u0091\u0095\u007f\u0089\u0005\u00fd\u00b0\u00c3etl\u007f\u0010\u00159\u0003\u00ab\u00b9A\u00b3\u00b1];\u008d(\t\u0083\u00b3\u0005W\u0093\u00df\u000f\u00f3\u009a\u00ca\u009f\u00b8\u00d9\u00e6\u0097%\u00f0bLX\u0016T\u00a5\u00c3\u0099\u000e'\u00c9\u00d3G\u008f\u00cb\u0083".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00b5\u00a7\u0001'm\u00af\u00beaRU\u0096\u00e8\u0094\u00c3E\u00d2";
                    var6_6 = "\u00b5\u00a7\u0001'm\u00af\u00beaRU\u0096\u00e8\u0094\u00c3E\u00d2".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        ObjectPipelineManager.X = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[37]), (long)-2258445023143560624L, (long)var11)).L((short)0).D(GameVersionEnumerator.MC_1_7_10, 1).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.j = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[0]), (long)-2258445023143560624L, (long)var11)).L((short)1).D(GameVersionEnumerator.MC_1_7_10, 2).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.G = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[14]), (long)-2258445023143560624L, (long)var11)).L((short)2).D(GameVersionEnumerator.MC_1_7_10, 5).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.P = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[25]), (long)-2258445023143560624L, (long)var11)).L((short)3).D(GameVersionEnumerator.MC_1_7_10, 6).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.F = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[9]), (long)-2258445023143560624L, (long)var11)).L((short)4).D(GameVersionEnumerator.MC_1_7_10, 10).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.N = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[22]), (long)-2258445023143560624L, (long)var11)).L((short)5).D(GameVersionEnumerator.MC_1_7_10, 11).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.n = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[1]), (long)-2258445023143560624L, (long)var11)).L((short)6).D(GameVersionEnumerator.MC_1_7_10, 12).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.T = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[10]), (long)-2258445023143560624L, (long)var11)).L((short)7).D(GameVersionEnumerator.MC_1_7_10, 8).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.h = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[3]), (long)-2258445023143560624L, (long)var11)).L((short)8).D(GameVersionEnumerator.MC_1_7_10, 15).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.y = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[29]), (long)-2258445023143560624L, (long)var11)).L((short)9).D(GameVersionEnumerator.MC_1_7_10, 3).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.m = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[4]), (long)-2258445023143560624L, (long)var11)).L((short)10).D(GameVersionEnumerator.MC_1_7_10, 9).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.v = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[15]), (long)-2258445023143560624L, (long)var11)).L((short)11).D(GameVersionEnumerator.MC_1_7_10, 4).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.i = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[26]), (long)-2258445023143560624L, (long)var11)).L((short)12).D(GameVersionEnumerator.MC_1_7_10, 7).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.D = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[38]), (long)-2258445023143560624L, (long)var11)).L((short)13).D(GameVersionEnumerator.MC_1_7_10, 13).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.f = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[12]), (long)-2258445023143560624L, (long)var11)).L((short)14).D(GameVersionEnumerator.MC_1_7_10, 14).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.s = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[11]), (long)-2258445023143560624L, (long)var11)).L((short)15).D(GameVersionEnumerator.MC_1_7_10, 16).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.k = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[8]), (long)-2258445023143560624L, (long)var11)).L((short)16).D(GameVersionEnumerator.MC_1_7_10, 17).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.B = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[34]), (long)-2258445023143560624L, (long)var11)).L((short)17).D(GameVersionEnumerator.MC_1_7_10, 18).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.c = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[32]), (long)-2258445023143560624L, (long)var11)).L((short)18).D(GameVersionEnumerator.MC_1_7_10, 19).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.R = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[5]), (long)-2258445023143560624L, (long)var11)).L((short)19).D(GameVersionEnumerator.MC_1_7_10, 20).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.M = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[18]), (long)-2258445023143560624L, (long)var11)).L((short)20).D(GameVersionEnumerator.MC_1_7_10, 21).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.S = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[35]), (long)-2258445023143560624L, (long)var11)).L((short)21).D(GameVersionEnumerator.MC_1_7_10, 22).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.w = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[24]), (long)-2258445023143560624L, (long)var11)).L((short)22).D(GameVersionEnumerator.MC_1_7_10, 23).b(GameVersionEnumerator.MC_1_7_10).l();
        ObjectPipelineManager.K = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[16]), (long)-2258445023143560624L, (long)var11)).L((short)23).D(GameVersionEnumerator.MC_1_12_2, 24).b(GameVersionEnumerator.MC_1_12_2).l();
        ObjectPipelineManager.o = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[30]), (long)-2258445023143560624L, (long)var11)).L((short)24).D(GameVersionEnumerator.MC_1_12_2, 25).b(GameVersionEnumerator.MC_1_12_2).l();
        ObjectPipelineManager.E = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[19]), (long)-2258445023143560624L, (long)var11)).L((short)25).D(GameVersionEnumerator.MC_1_12_2, 26).b(GameVersionEnumerator.MC_1_12_2).l();
        ObjectPipelineManager.r = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[20]), (long)-2258445023143560624L, (long)var11)).L((short)26).D(GameVersionEnumerator.MC_1_12_2, 27).b(GameVersionEnumerator.MC_1_12_2).l();
        ObjectPipelineManager.Q = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[13]), (long)-2258445023143560624L, (long)var11)).L((short)27).D(GameVersionEnumerator.MC_1_16_5, 28).b(GameVersionEnumerator.MC_1_16_5).l();
        ObjectPipelineManager.J = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[6]), (long)-2258445023143560624L, (long)var11)).L((short)28).D(GameVersionEnumerator.MC_1_16_5, 29).b(GameVersionEnumerator.MC_1_16_5).l();
        ObjectPipelineManager.Y = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[28]), (long)-2258445023143560624L, (long)var11)).L((short)29).D(GameVersionEnumerator.MC_1_16_5, 30).b(GameVersionEnumerator.MC_1_16_5).l();
        ObjectPipelineManager.d = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[7]), (long)-2258445023143560624L, (long)var11)).L((short)30).D(GameVersionEnumerator.MC_1_16_5, 31).b(GameVersionEnumerator.MC_1_16_5).l();
        ObjectPipelineManager.q = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[17]), (long)-2258445023143560624L, (long)var11)).L((short)31).D(GameVersionEnumerator.MC_1_16_5, 32).b(GameVersionEnumerator.MC_1_16_5).l();
        ObjectPipelineManager.g = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[23]), (long)-2258445023143560624L, (long)var11)).L((short)32).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.b = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[31]), (long)-2258445023143560624L, (long)var11)).L((short)33).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.H = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[27]), (long)-2258445023143560624L, (long)var11)).L((short)34).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.U = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[2]), (long)-2258445023143560624L, (long)var11)).L((short)35).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.I = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[33]), (long)-2258445023143560624L, (long)var11)).L((short)36).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.W = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[36]), (long)-2258445023143560624L, (long)var11)).L((short)37).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.a = ResourceAllocationManager1058.I().I((String)ObjectPipelineManager.a("\u00c1", (int)((int)var0_3[21]), (long)-2258445023143560624L, (long)var11)).L((short)38).b(GameVersionEnumerator.MC_1_21_0).l();
        ObjectPipelineManager.Z = new LinkedHashMap<Short, ResourceAllocationManager1058>();
        ObjectPipelineManager.l = new LinkedHashMap<Integer, ResourceAllocationManager1058>();
        ObjectPipelineManager.A = false;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 60;
                break;
            }
            case 1: {
                n3 = 50;
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
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 45;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 25;
                break;
            }
            case 11: {
                n3 = 16;
                break;
            }
            case 12: {
                n3 = 26;
                break;
            }
            case 13: {
                n3 = 30;
                break;
            }
            case 14: {
                n3 = 20;
                break;
            }
            case 15: {
                n3 = 56;
                break;
            }
            case 16: {
                n3 = 21;
                break;
            }
            case 17: {
                n3 = 5;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 21: {
                n3 = 2;
                break;
            }
            case 22: {
                n3 = 46;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 22;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 24;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 39;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 53;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 12;
                break;
            }
            case 34: {
                n3 = 36;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 18;
                break;
            }
            case 38: {
                n3 = 27;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 17;
                break;
            }
            case 42: {
                n3 = 35;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 10;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 61;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 38;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 43;
                break;
            }
            case 58: {
                n3 = 31;
                break;
            }
            case 59: {
                n3 = 19;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 58;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 23;
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
        ObjectPipelineManager.p[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = ObjectPipelineManager.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = ObjectPipelineManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ObjectPipelineManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ObjectPipelineManager.a(clazz3, string2, clazz2)) != null) {
                    ObjectPipelineManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ObjectPipelineManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ObjectPipelineManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ObjectPipelineManager.b(252991630660654L, 0L);
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
            return MethodHandles.lookup().findStatic(ObjectPipelineManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

