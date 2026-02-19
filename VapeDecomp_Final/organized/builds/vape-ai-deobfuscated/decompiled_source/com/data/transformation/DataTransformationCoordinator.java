/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.bE;
import a.hr;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.serialization.JsonPayloadOrchestrator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.rendering.GraphicalRenderingController249;
import com.security.crypto.CryptographicSecurityManager;
import com.security.cryptography.CryptographicContextManager153;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DataTransformationCoordinator
extends GraphicalRenderEngine1082 {
    private final CryptographicContextManager153 Wn;
    private static final Object[] lb;
    private static final long ab;
    private final hr WU;
    private JsonPayloadOrchestrator W2;
    private static final String[] mb;
    private static final Map fb;
    private final hr WJ;
    private static final Integer[] eb;
    private CryptographicSecurityManager WV;
    private final GraphicalRenderEngine1082 W0;
    private static int WQ;
    private final GraphicalRenderingController249 WC;
    private static final long[] bb;
    private final GraphicalRenderEngine1082 WO;

    public DataTransformationCoordinator() {
        long l = ab ^ 0x70D80B12A03CL;
        super(WQ, 170.0);
        this.WO = new GraphicalRenderEngine1082(192.0, 10.0);
        this.W0 = new GraphicalRenderEngine1082(WQ, 144.0);
        this.Wn = new CryptographicContextManager153((String)((Object)DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)5338, (long)(0x7BE24418617FD430L ^ l)), (long)-3098748532500953027L, (long)l)));
        this.WJ = new hr((String)((Object)DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)16824, (long)(0x33E3E20399BB8153L ^ l)), (long)-3098748532500953027L, (long)l)), 0.633, DataTransformationCoordinator.M.S, DataTransformationCoordinator.M.S, 16.0, 10.0);
        this.WC = new GraphicalRenderingController249(null, DataTransformationCoordinator.M.c);
        this.WU = new hr((String)((Object)DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)12924, (long)(0x6B6945CE24627290L ^ l)), (long)-3098748532500953027L, (long)l)), 0.633, DataTransformationCoordinator.M.W, DataTransformationCoordinator.M.W, 52.0, 10.0);
        this.W0.d().f((String)((Object)DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)21154, (long)(0x1118467D7A33124CL ^ l)), (long)-3098748532500953027L, (long)l)));
        this.W0.i(144.0);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)13602, (long)(0x1FB545D2344AF5CAL ^ l)), (long)-3098748532500953027L, (long)l)));
        cryptographicContextManager153.B(DataTransformationCoordinator.M.w);
        cryptographicContextManager153.q(true);
        this.WU.I(DataTransformationCoordinator.M.S);
        this.WU.i(false);
        this.WU.G(0.75f);
        this.Wn.B(DataTransformationCoordinator.M.c);
        this.Wn.S(0.0f);
        this.Wn.p(1.0);
        this.WC.N(false);
        cryptographicContextManager153.S(0.0f);
        this.WO.d().J(true);
        this.WO.n(this.Wn, new Object[0]);
        this.WO.n(new bE(3.0, 0.0), new Object[0]);
        this.WO.n(this.WJ, new Object[0]);
        this.WO.n(new bE(3.0, 0.0), new Object[0]);
        this.WO.n(this.WC, new Object[0]);
        this.WO.n(this.WU, DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)8588, (long)(0x4609A5783F056161L ^ l)), (long)-3098748532500953027L, (long)l));
        this.d().f((String)((Object)DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)5124, (long)(0x348FF1C8260BD4EDL ^ l)), (long)-3098748532500953027L, (long)l)));
        this.n(this.WO, new Object[0]);
        this.n(new bE(0.0, 4.0), new Object[0]);
        this.n(cryptographicContextManager153, new Object[0]);
        this.n(this.W0, new Object[0]);
        this.WU.N(this::lambda$new$0);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00c8' || c == '\u00c3' || c == '\u00ec') {
                field = DataTransformationCoordinator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataTransformationCoordinator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ya" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataTransformationCoordinator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field k(long l, long l2) {
        int n = DataTransformationCoordinator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataTransformationCoordinator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataTransformationCoordinator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataTransformationCoordinator.e(clazz3, string2, clazz2)) != null) {
                    DataTransformationCoordinator.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataTransformationCoordinator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataTransformationCoordinator.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataTransformationCoordinator.j(240339679692863L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataTransformationCoordinator.ab = MultiContainerRegistry.a(4762938371899137733L, -3693859749530795318L, MethodHandles.lookup().lookupClass()).a(243070665696640L);
                var11 = DataTransformationCoordinator.ab ^ 30219327315515L;
                DataTransformationCoordinator.lb = new Object[5];
                DataTransformationCoordinator.mb = new String[5];
                DataTransformationCoordinator.x();
                DataTransformationCoordinator.fb = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[10];
                var3_4 = 0;
                var4_5 = "\u0014\u00f4?H$E\u00a1\u00cd\u001f\u00dc\u00dd\u0086\u0085R(`\u0084(Mr;8\u0012\u0094\u00e4\u00d1Ao#zP8;\u00ea\u00dd*\u00ff\u0098\u00f1\u00d7E\u00ccc\u0085\u00fe\u0097\u00de\u00e4\u00b0\u0091\u001c\u00e7\u0006\u0096\u0097,j\u0014\u0001\u00f0E*\u00da\u00d3";
                var5_6 = "\u0014\u00f4?H$E\u00a1\u00cd\u001f\u00dc\u00dd\u0086\u0085R(`\u0084(Mr;8\u0012\u0094\u00e4\u00d1Ao#zP8;\u00ea\u00dd*\u00ff\u0098\u00f1\u00d7E\u00ccc\u0085\u00fe\u0097\u00de\u00e4\u00b0\u0091\u001c\u00e7\u0006\u0096\u0097,j\u0014\u0001\u00f0E*\u00da\u00d3".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "=\u00f5}'\u0080\u0003\u0010x\u00a9\u001f\u0014\u0004\u0082\u00a8Qx";
                    var5_6 = "=\u00f5}'\u0080\u0003\u0010x\u00a9\u001f\u0014\u0004\u0082\u00a8Qx".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        DataTransformationCoordinator.bb = var6_3;
        DataTransformationCoordinator.eb = new Integer[10];
        DataTransformationCoordinator.WQ = (int)DataTransformationCoordinator.c("n", (int)11735, (long)(3652660625786983219L ^ var11));
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataTransformationCoordinator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataTransformationCoordinator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ya" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(long l, long l2) {
        int n = DataTransformationCoordinator.i(l, l2);
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
                clazz3 = DataTransformationCoordinator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataTransformationCoordinator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataTransformationCoordinator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataTransformationCoordinator.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataTransformationCoordinator.j(240339679692863L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataTransformationCoordinator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataTransformationCoordinator.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataTransformationCoordinator.j(240339679692863L, 0L);
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

    public void l(JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        this.W2 = jsonPayloadOrchestrator;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1414;
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
                throw new RuntimeException("a/ya", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataTransformationCoordinator.eb[n2] = n3;
        }
        return eb[n2];
    }

    public void R(CryptographicSecurityManager cryptographicSecurityManager) {
        block6: {
            block5: {
                CallSite callSite;
                hr hr2;
                long l = ab ^ 0x499C8407BA1BL;
                try {
                    this.WV = cryptographicSecurityManager;
                    this.Wn.H(cryptographicSecurityManager.O());
                    hr2 = this.WJ;
                    callSite = cryptographicSecurityManager.S() ? DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)25499, (long)(0x643C08FF49DF3953L ^ l)), (long)-3542026250949127654L, (long)l) : DataTransformationCoordinator.d("Z", (int)DataTransformationCoordinator.c("n", (int)31710, (long)(0x56B9F16FEEF5211BL ^ l)), (long)-3542026250949127654L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationCoordinator.a(customSystemException);
                }
                try {
                    hr2.z((String)((Object)callSite));
                    if (!cryptographicSecurityManager.M()) break block5;
                    this.WC.N(true);
                    this.WC.b(cryptographicSecurityManager.u().T());
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationCoordinator.a(customSystemException);
                }
            }
            this.WC.N(false);
        }
        this.W0.k();
        List<AbstractComputationKernel> list = this.W2.q().U(cryptographicSecurityManager);
        for (AbstractComputationKernel abstractComputationKernel : list) {
            this.W0.n(abstractComputationKernel, new Object[0]);
        }
        this.h(true);
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "j\u001cr";
        objectArray[1] = Integer.TYPE;
        DataTransformationCoordinator.mb[1] = "java/lang/Integer";
        objectArray[2] = "\u0004IFd0\u0003\u000fFW+M\u001b\u001cA^b";
        objectArray[3] = "A!\u0014)GtJ.\u0005f&zA%\u0001<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\bnm|[Z\ra&\u0002IGg>#iRX\u0007xp`G<^`a=Z[Vd k\"";
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataTransformationCoordinator.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                DataTransformationCoordinator.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = DataTransformationCoordinator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataTransformationCoordinator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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
                n3 = 15;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 24;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 48;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 55;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 18;
                break;
            }
            case 13: {
                n3 = 37;
                break;
            }
            case 14: {
                n3 = 61;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 58;
                break;
            }
            case 17: {
                n3 = 26;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 60;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 4;
                break;
            }
            case 23: {
                n3 = 59;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 27;
                break;
            }
            case 27: {
                n3 = 31;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 63;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 1;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 33;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 3;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 8;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 45;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 40;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 28;
                break;
            }
            case 50: {
                n3 = 42;
                break;
            }
            case 51: {
                n3 = 34;
                break;
            }
            case 52: {
                n3 = 6;
                break;
            }
            case 53: {
                n3 = 14;
                break;
            }
            case 54: {
                n3 = 39;
                break;
            }
            case 55: {
                n3 = 10;
                break;
            }
            case 56: {
                n3 = 0;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 51;
                break;
            }
            case 59: {
                n3 = 62;
                break;
            }
            case 60: {
                n3 = 16;
                break;
            }
            case 61: {
                n3 = 29;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 17;
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
        DataTransformationCoordinator.mb[n4] = new String(cArray);
        return n4;
    }

    private void lambda$new$0() {
        this.W2.q().p(this.WV);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataTransformationCoordinator.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataTransformationCoordinator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataTransformationCoordinator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

