/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.fu;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.runtime.context.ContextualExecutionFramework;
import com.security.allocation.SecureResourceAllocator;
import com.system.orchestration.SystemOrchestrationManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fO
extends fu {
    private static final long[] rb;
    private static final long ab;
    private static final String[] xb;
    private static final Integer[] sb;
    private static fO Mk;
    private static final Map tb;
    private static final Object[] wb;

    public static fO q() {
        return Mk;
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fO.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = fO.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fO.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public fO() {
        super(RecursiveNodeGraph.b);
        Mk = this;
    }

    @Override
    public void I() {
        long l = ab ^ 0x643B962757DEL;
        this.gR = new SecureResourceAllocator(this, (String)((Object)fO.j("\u00cf", (int)fO.e("a", (int)7584, (long)(0xDDD9AD3D31D4426L ^ l)), (long)-653006550042294223L, (long)l)), (String)((Object)fO.j("\u00cf", (int)fO.e("a", (int)20400, (long)(0x60FAA53F09DE1637L ^ l)), (long)-653006550042294223L, (long)l)));
        this.a(this.gR);
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 'M' || c == 's' || c == 'w') {
                field = fO.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fO.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void db() {
        Object[] objectArray = wb;
        wb[0] = "\rBj";
        objectArray[1] = Integer.TYPE;
        fO.xb[1] = "java/lang/Integer";
        objectArray[2] = "\u0011Xg5\\\u0017\u001aWvz!\u000f\tP\u007f3";
        objectArray[3] = ";fxO<$0ii\u0000]*;bmZ";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001ep\u0006G-\"\bw_v4ix'\u0001\b5t\u0018oQ\n>\u0012A~\u0001\u001fns\u001d\u007fT\u001b_";
    }

    @Override
    public void u() {
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fO.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field s(long l, long l2) {
        int n = fO.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = xb[n];
            int n2 = string.indexOf(8);
            Class clazz = fO.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fO.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fO.i(clazz3, string2, clazz2)) != null) {
                    fO.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fO.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fO.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fO.r(267741377550567L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F77;
        if (sb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = rb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fO.sb[n2] = n3;
        }
        return sb[n2];
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fO.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fO.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static SystemOrchestrationManager K(ContextualExecutionFramework contextualExecutionFramework) {
        for (AbstractComputationKernel abstractComputationKernel : Mk.A()) {
            try {
                try {
                    if (!(abstractComputationKernel instanceof SystemOrchestrationManager) || !((SystemOrchestrationManager)abstractComputationKernel).D().equals(contextualExecutionFramework)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw fO.a(customSystemException);
                }
                return (SystemOrchestrationManager)abstractComputationKernel;
            }
            catch (CustomSystemException customSystemException) {
                throw fO.a(customSystemException);
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method t(long l, long l2) {
        int n = fO.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n];
                int n3 = string2.indexOf(8);
                clazz3 = fO.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fO.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fO.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        fO.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fO.r(267741377550567L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fO.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fO.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fO.r(267741377550567L, 0L);
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

    @Override
    public void i() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(1336548317624072068L, 2212732675122709652L, MethodHandles.lookup().lookupClass()).a(141199860465440L);
        wb = new Object[5];
        xb = new String[5];
        fO.db();
        tb = new HashMap(13);
        long l = ab ^ 0x48B2AF484CB8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00bc!\u0096\u008b(9:\u00bcbg\u00cc\u00f0\u0080\u0086\u00fe,";
        int n2 = "\u00bc!\u0096\u008b(9:\u00bcbg\u00cc\u00f0\u0080\u0086\u00fe,".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        rb = lArray;
        sb = new Integer[2];
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fO.q(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                fO.wb[n] = clazz = Class.forName(xb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (xb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 38;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 21;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 51;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 42;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 39;
                break;
            }
            case 14: {
                n3 = 36;
                break;
            }
            case 15: {
                n3 = 23;
                break;
            }
            case 16: {
                n3 = 45;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 41;
                break;
            }
            case 19: {
                n3 = 16;
                break;
            }
            case 20: {
                n3 = 18;
                break;
            }
            case 21: {
                n3 = 52;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 57;
                break;
            }
            case 24: {
                n3 = 5;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 60;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 0;
                break;
            }
            case 29: {
                n3 = 50;
                break;
            }
            case 30: {
                n3 = 29;
                break;
            }
            case 31: {
                n3 = 32;
                break;
            }
            case 32: {
                n3 = 20;
                break;
            }
            case 33: {
                n3 = 43;
                break;
            }
            case 34: {
                n3 = 7;
                break;
            }
            case 35: {
                n3 = 62;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 30;
                break;
            }
            case 40: {
                n3 = 28;
                break;
            }
            case 41: {
                n3 = 58;
                break;
            }
            case 42: {
                n3 = 59;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 6;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 56;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 15;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 8;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 13;
                break;
            }
            case 59: {
                n3 = 44;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 53;
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
        fO.xb[n4] = new String(cArray);
        return n4;
    }

    public static void p() {
        Mk.k();
        try {
            CopyOnWriteArrayList<ContextualExecutionFramework> copyOnWriteArrayList = new CopyOnWriteArrayList<ContextualExecutionFramework>(TemporalMetadataResolver.h.S().I());
            for (ContextualExecutionFramework contextualExecutionFramework : copyOnWriteArrayList) {
                SystemOrchestrationManager systemOrchestrationManager = new SystemOrchestrationManager(Mk, contextualExecutionFramework);
                Mk.n(systemOrchestrationManager, new Object[0]);
                systemOrchestrationManager.C();
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fO.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fO.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

