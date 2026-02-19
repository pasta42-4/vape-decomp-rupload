/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.a;
import com.analytics.compression.AdvancedMetricCompressor;
import com.classification.sorting.SortedEntityClassifier;
import com.collections.management.MultiContainerRegistry;
import com.event.dispatch.EventDispatchController;
import com.execution.validation.ExecutionStateValidator;
import com.game.core.GameStateController;
import com.geospatial.calculation.GeographicalPositionCalculator;
import com.google.gson.JsonObject;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.state.NetworkStateManager;
import com.resource.lifecycle.ResourceLifecycleOrchestrator;
import com.security.cipher.AdaptiveCipherEngine;
import com.system.resources.ResourceAllocationManager264;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.lifecycle.TransactionLifecycleManager;
import com.ui.rendering.GraphicalRenderingController;
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

public class wj
extends EventDispatchController {
    private NetworkStateManager Sn;
    private ExecutionStateValidator<NetworkConnectionEstablisher> Ss;
    private static final Object[] wb;
    private static final Map vb;
    private static final Integer[] ub;
    private AdaptiveCipherEngine SF;
    private AdaptiveCipherEngine Si;
    private TransactionLifecycleManager SY;
    private AdaptiveCipherEngine ST;
    private GeographicalPositionCalculator Sc;
    private final SortedEntityClassifier SC;
    private AdaptiveCipherEngine Sm;
    private static final long fb;
    private AdaptiveCipherEngine SX;
    private static final long[] lb;
    private AdaptiveCipherEngine S8;
    private NetworkStateManager Sp;
    private ExecutionStateValidator<NetworkConnectionEstablisher> S1;
    private GameStateController Sj;
    private ResourceAllocationManager264 Sh;
    private AdaptiveCipherEngine SE;
    private AdaptiveCipherEngine S2;
    private AdaptiveCipherEngine Sl;
    private static final String[] Hb;
    private ExecutionStateValidator<NetworkConnectionEstablisher> S7;

    private static Field w(long l, long l2) {
        int n = wj.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = Hb[n];
            int n2 = string.indexOf(8);
            Class clazz = wj.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = wj.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wj.k(clazz3, string2, clazz2)) != null) {
                    wj.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = wj.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        wj.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wj.v(231352033628369L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public String A() {
        long l = fb ^ 0x753F08E96ADAL;
        return wj.k("\u00ce", (int)wj.e("q", (int)21660, (long)(0x4ED76192885FB8CDL ^ l)), (long)4868413384691808840L, (long)l);
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = wj.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = wj.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method x(long l, long l2) {
        int n = wj.u(l, l2);
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
                String string2 = Hb[n];
                int n3 = string2.indexOf(8);
                clazz3 = wj.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = wj.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wj.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        wj.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wj.v(231352033628369L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = wj.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        wj.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wj.v(231352033628369L, 0L);
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

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = wj.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        fb = MultiContainerRegistry.a(868402092789968822L, 1099996095945939436L, MethodHandles.lookup().lookupClass()).a(244978191010258L);
        wb = new Object[5];
        Hb = new String[5];
        wj.X();
        vb = new HashMap(13);
        long l = fb ^ 0x4D68AF27F2D0L;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "j\u00b1\u00abz!\u00a0\u0083A\u00e0\u00b7&\u0001L\u0019\f\u00bd\u00dd\u00c5\u00b8\u0002N\u009a\u00107";
        int n2 = "j\u00b1\u00abz!\u00a0\u0083A\u00e0\u00b7&\u0001L\u0019\f\u00bd\u00dd\u00c5\u00b8\u0002N\u009a\u00107".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        lb = lArray;
        ub = new Integer[3];
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Hb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
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
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 10;
                break;
            }
            case 4: {
                n3 = 15;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 52;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 51;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 17;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 16;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 55;
                break;
            }
            case 16: {
                n3 = 11;
                break;
            }
            case 17: {
                n3 = 12;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 0;
                break;
            }
            case 21: {
                n3 = 8;
                break;
            }
            case 22: {
                n3 = 63;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 2;
                break;
            }
            case 25: {
                n3 = 36;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 27;
                break;
            }
            case 29: {
                n3 = 30;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 43;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 42;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 46;
                break;
            }
            case 40: {
                n3 = 1;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 32;
                break;
            }
            case 43: {
                n3 = 53;
                break;
            }
            case 44: {
                n3 = 29;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 37;
                break;
            }
            case 47: {
                n3 = 41;
                break;
            }
            case 48: {
                n3 = 59;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 61;
                break;
            }
            case 51: {
                n3 = 20;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 14;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 35;
                break;
            }
            case 59: {
                n3 = 45;
                break;
            }
            case 60: {
                n3 = 48;
                break;
            }
            case 61: {
                n3 = 23;
                break;
            }
            case 62: {
                n3 = 25;
                break;
            }
            default: {
                n3 = 24;
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
        wj.Hb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = wj.u(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                wj.wb[n] = clazz = Class.forName(Hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'x' || c == '\u00a2' || c == '\u00da') {
                field = wj.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wj.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "v4\u0015";
        objectArray[1] = Integer.TYPE;
        wj.Hb[1] = "java/lang/Integer";
        objectArray[2] = "{#*i\u001aRp,;&gJc+2o";
        objectArray[3] = "YbRf)[RmC)HUYfGs";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "j\\\u0002\u0016tBjZ\u0004s#UT\u001dP\fuVn]\u0000\u000bw.n\u001d\u0019\u0017u\u00160M\u0019\tH";
    }

    @Override
    public void i() {
    }

    public SortedEntityClassifier Q() {
        return this.SC;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = wj.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = wj.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void y(JsonObject jsonObject) {
        super.y(jsonObject);
        GraphicalRenderingController.D(ResourceLifecycleOrchestrator.class).E().c(this.f());
    }

    public wj() {
        long l = fb ^ 0xBEE2FB78DAL;
        super(a.cs((int)wj.e("q", (int)4858, (long)(0x1EA16F19C75B6CAAL ^ l))), a.cs((int)wj.e("q", (int)25357, (long)(0x69DB36C7F3341D5EL ^ l))));
        this.Sh = TemporalMetadataResolver.h.U().K(ResourceAllocationManager264.class);
        this.S1 = new ExecutionStateValidator(this.Sh.R);
        this.Ss = new ExecutionStateValidator(this.Sh.O);
        this.Sn = new NetworkStateManager(this.Sh.N);
        this.S7 = new ExecutionStateValidator(this.Sh.j);
        this.Sm = new AdaptiveCipherEngine(this.Sh.P);
        this.ST = new AdaptiveCipherEngine(this.Sh.n);
        this.Si = new AdaptiveCipherEngine(this.Sh.K);
        this.S8 = new AdaptiveCipherEngine(this.Sh.h);
        this.SF = new AdaptiveCipherEngine(this.Sh.T);
        this.SE = new AdaptiveCipherEngine(this.Sh.t);
        this.Sj = new GameStateController(this.Sh.L);
        this.Sc = new AdvancedMetricCompressor(this.Sh.w);
        this.S2 = new AdaptiveCipherEngine(this.Sh.Y);
        this.SY = new TransactionLifecycleManager(this.Sh.A);
        this.Sl = new AdaptiveCipherEngine(this.Sh.x);
        this.Sp = new NetworkStateManager(this.Sh.z);
        this.SX = new AdaptiveCipherEngine(this.Sh.o);
        this.J(this.S1, this.S7, this.Ss, this.Sn, this.Sc, this.Sm, this.ST, this.Si, this.SX, this.S8, this.SF, this.SE, this.Sj, this.S2, this.SY, this.Sl, this.Sp);
        this.SC = new SortedEntityClassifier(this);
        this.n(this.SC, new Object[0]);
    }

    @Override
    public void u() {
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = wj.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2FC0;
        if (ub[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = lb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])vb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    vb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wj.ub[n2] = n3;
        }
        return ub[n2];
    }

    private static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wj.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(wj.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

