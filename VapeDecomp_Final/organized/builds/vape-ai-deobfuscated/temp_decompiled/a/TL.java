/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.F8;
import a.Hc;
import a.Na;
import a.Ne;
import a.a;
import a.d8;
import a.kX;
import a.qg;
import a.tA;
import a.ti;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class tl
extends Hc {
    private static Boolean y;
    private static ti V;
    private static final Map e;
    private static final Integer[] d;
    private static final String[] h;
    private static tA a;
    private static final long b;
    private static final Object[] g;
    private static final long[] c;

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = tl.e(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                tl.g[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static int f() {
        try {
            if (tl.v()) {
                return GL11.glGenTextures();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        return qg.g(tl.U.u().L8);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        qg.f(tl.U.u().L8, n2, n3, n4, n5, n6, n7, n8, n9, intBuffer);
    }

    public static int V(int n2) {
        try {
            if (Na.MC_1_21_10.Q()) {
                return -1;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        return tl.U.u().L8.I(n2);
    }

    public static boolean v() {
        block6: {
            boolean bl2;
            block9: {
                block8: {
                    try {
                        block7: {
                            try {
                                try {
                                    if (y != null) break block6;
                                    if (kX.C() == 13) break block7;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw tl.a(illegalArgumentException);
                                }
                                if (!a.a.iv()) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw tl.a(illegalArgumentException);
                            }
                        }
                        bl2 = true;
                        break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tl.a(illegalArgumentException);
                    }
                }
                bl2 = false;
            }
            y = bl2;
        }
        return y;
    }

    public static void l(int n2, int n3, int n4, int n5) {
        try {
            if (tl.v()) {
                GL11.glBlendFunc((int)n2, (int)n3);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.r(tl.U.u().L8, n2, n3, n4, n5);
    }

    public static void M() {
        try {
            if (tl.v()) {
                Ne.h.z(2884);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.U(tl.U.u().L8);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e1' || c10 == '\u00e2' || c10 == 'C' || c10 == '\u00d3') {
                field = tl.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = tl.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void N() {
        try {
            if (kX.C() == 13) {
                Ne.h.y(3042);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        tl.O().M().m(true);
    }

    public static void w() {
        try {
            if (tl.v()) {
                Ne.h.z(2929);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.g(tl.U.u().L8);
    }

    public static void m(float f10, float f11, float f12, float f13) {
        try {
            if (tl.v()) {
                Ne.h.f(f10, f11, f12, f13);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.k(tl.U.u().L8, f10, f11, f12, f13);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static void k() {
        try {
            if (tl.v()) {
                Ne.h.y(2929);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.G(tl.U.u().L8);
    }

    public static void E(int n2) {
        try {
            if (tl.v()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.h(tl.U.u().L8, n2);
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u00122t";
        objectArray[1] = Integer.TYPE;
        tl.h[1] = "java/lang/Integer";
        objectArray[2] = "\\\u0007p\u0013LjW\ba\\1rD\u000fh\u0015";
        objectArray[3] = "9(k'W'2'zh6)9,~2";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "xJdPK$8\u00002>J#I\u0000nXZ9#\u0002w\u0004!bq\u001dbO\u001b!r@7>";
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static void T() {
        try {
            if (F8.U()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (tl.v()) {
                Ne.h.y(2896);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.m(tl.U.u().L8);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = d8.a(-5518353419406489471L, -2708347146067358692L, MethodHandles.lookup().lookupClass()).a(163326171907196L);
        g = new Object[5];
        h = new String[5];
        tl.a();
        e = new HashMap(13);
        long l10 = b ^ 0x38E815B99703L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "I\u00b4\u00e2\u00c4\u0000\u00e3\u00b1\u00f6\u00db\u0083\u009cP\u0006\u00ed\u00bcd";
        int n3 = "I\u00b4\u00e2\u00c4\u0000\u00e3\u00b1\u00f6\u00db\u0083\u009cP\u0006\u00ed\u00bcd".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        c = lArray;
        d = new Integer[2];
        y = null;
        V = null;
        a = null;
    }

    public static int E() {
        long l10 = b ^ 0x4E829FF58926L;
        return GL11.glGetInteger((int)tl.a("m", (int)10020, (long)(0x63BEC8E39C425854L ^ l10)));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/tl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static ArrayList<ti> R() {
        ArrayList<ti> arrayList = new ArrayList<ti>();
        for (Object object : qg.V(tl.U.u().L8)) {
            arrayList.add(new ti(object));
        }
        return arrayList;
    }

    public tl(Object object) {
        super(object);
    }

    public static void j() {
        try {
            if (kX.C() == 13) {
                Ne.h.z(3042);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        tl.O().M().m(false);
    }

    public static void s() {
        try {
            if (F8.U()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (tl.v()) {
                Ne.h.y(3008);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.e(tl.U.u().L8);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = tl.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void O(int n2) {
        try {
            if (kX.C() == 13) {
                GL11.glBindTexture((int)3553, (int)n2);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (V == null) {
                V = new ti(qg.V(tl.U.u().L8)[0]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (n2 != V.C()) {
                V.d(n2);
                GL11.glBindTexture((int)3553, (int)n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 31;
                break;
            }
            case 1: {
                n4 = 35;
                break;
            }
            case 2: {
                n4 = 7;
                break;
            }
            case 3: {
                n4 = 1;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 5;
                break;
            }
            case 6: {
                n4 = 12;
                break;
            }
            case 7: {
                n4 = 10;
                break;
            }
            case 8: {
                n4 = 51;
                break;
            }
            case 9: {
                n4 = 43;
                break;
            }
            case 10: {
                n4 = 25;
                break;
            }
            case 11: {
                n4 = 19;
                break;
            }
            case 12: {
                n4 = 9;
                break;
            }
            case 13: {
                n4 = 48;
                break;
            }
            case 14: {
                n4 = 24;
                break;
            }
            case 15: {
                n4 = 46;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 13;
                break;
            }
            case 18: {
                n4 = 58;
                break;
            }
            case 19: {
                n4 = 26;
                break;
            }
            case 20: {
                n4 = 15;
                break;
            }
            case 21: {
                n4 = 41;
                break;
            }
            case 22: {
                n4 = 45;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 20;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 42;
                break;
            }
            case 27: {
                n4 = 57;
                break;
            }
            case 28: {
                n4 = 4;
                break;
            }
            case 29: {
                n4 = 49;
                break;
            }
            case 30: {
                n4 = 61;
                break;
            }
            case 31: {
                n4 = 17;
                break;
            }
            case 32: {
                n4 = 3;
                break;
            }
            case 33: {
                n4 = 59;
                break;
            }
            case 34: {
                n4 = 21;
                break;
            }
            case 35: {
                n4 = 53;
                break;
            }
            case 36: {
                n4 = 6;
                break;
            }
            case 37: {
                n4 = 18;
                break;
            }
            case 38: {
                n4 = 38;
                break;
            }
            case 39: {
                n4 = 30;
                break;
            }
            case 40: {
                n4 = 55;
                break;
            }
            case 41: {
                n4 = 32;
                break;
            }
            case 42: {
                n4 = 29;
                break;
            }
            case 43: {
                n4 = 60;
                break;
            }
            case 44: {
                n4 = 36;
                break;
            }
            case 45: {
                n4 = 39;
                break;
            }
            case 46: {
                n4 = 22;
                break;
            }
            case 47: {
                n4 = 50;
                break;
            }
            case 48: {
                n4 = 27;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 56;
                break;
            }
            case 51: {
                n4 = 63;
                break;
            }
            case 52: {
                n4 = 54;
                break;
            }
            case 53: {
                n4 = 52;
                break;
            }
            case 54: {
                n4 = 37;
                break;
            }
            case 55: {
                n4 = 2;
                break;
            }
            case 56: {
                n4 = 14;
                break;
            }
            case 57: {
                n4 = 8;
                break;
            }
            case 58: {
                n4 = 33;
                break;
            }
            case 59: {
                n4 = 34;
                break;
            }
            case 60: {
                n4 = 16;
                break;
            }
            case 61: {
                n4 = 47;
                break;
            }
            case 62: {
                n4 = 11;
                break;
            }
            default: {
                n4 = 62;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        tl.h[n5] = new String(cArray);
        return n5;
    }

    public static tA O() {
        try {
            if (a == null) {
                a = new tA(qg.C(tl.U.u().L8));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        return a;
    }

    public static void K(float f10) {
        try {
            if (tl.v()) {
                GL11.glFogf((int)2914, (float)f10);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.R(tl.U.u().L8, f10);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = tl.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public static void V() {
        try {
            if (tl.v()) {
                Ne.h.y(2884);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.x(tl.U.u().L8);
    }

    public static void a(float f10, float f11, float f12, float f13) {
        block13: {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            qg qg2;
            block15: {
                block14: {
                    try {
                        if (tl.v()) {
                            Ne.h.q(f10, f11, f12, f13);
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tl.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (kX.C() < 37) break block13;
                            qg2 = tl.U.u().L8;
                            if (f10 != 1.0f) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw tl.a(illegalArgumentException);
                        }
                        bl5 = true;
                        break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tl.a(illegalArgumentException);
                    }
                }
                bl5 = false;
            }
            try {
                bl4 = f11 == 1.0f;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw tl.a(illegalArgumentException);
            }
            try {
                bl3 = f12 == 1.0f;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw tl.a(illegalArgumentException);
            }
            try {
                bl2 = f13 == 1.0f;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw tl.a(illegalArgumentException);
            }
            qg.v(qg2, bl5, bl4, bl3, bl2);
            return;
        }
        qg.c(tl.U.u().L8, f10, f11, f12, f13);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = tl.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = tl.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static void B() {
        try {
            if (F8.U()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (tl.v()) {
                Ne.h.y(3553);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.P(tl.U.u().L8);
    }

    private static Field g(long l10, long l11) {
        int n2 = tl.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = tl.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = tl.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = tl.c(clazz3, string2, clazz2)) != null) {
                    tl.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = tl.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        tl.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = tl.f(220280731441283L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void Z() {
        try {
            if (F8.U()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (tl.v()) {
                Ne.h.z(3008);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.a(tl.U.u().L8);
    }

    public static void R(boolean bl2) {
        try {
            if (tl.v()) {
                Ne.h.E(bl2);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.Z(tl.U.u().L8, bl2);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/tl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void X() {
        try {
            if (tl.v()) {
                Ne.h.w();
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.T(tl.U.u().L8);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7640;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/tl", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            tl.d[n3] = n4;
        }
        return d[n3];
    }

    public static void P() {
        try {
            if (F8.U()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (tl.v()) {
                Ne.h.z(2896);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.D(tl.U.u().L8);
    }

    private static Method h(long l10, long l11) {
        int n2 = tl.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n2];
                int n4 = string2.indexOf(8);
                clazz3 = tl.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = tl.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = tl.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        tl.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = tl.f(220280731441283L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = tl.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        tl.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = tl.f(220280731441283L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public static void m(int n2, boolean bl2) {
        block26: {
            long l10;
            block35: {
                block36: {
                    block33: {
                        block34: {
                            block31: {
                                block32: {
                                    block29: {
                                        block30: {
                                            block27: {
                                                block28: {
                                                    block24: {
                                                        block25: {
                                                            l10 = b ^ 0x73CCA75C66C9L;
                                                            try {
                                                                try {
                                                                    if (n2 != 2896) break block24;
                                                                    if (!bl2) break block25;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw tl.a(illegalArgumentException);
                                                                }
                                                                tl.T();
                                                                break block26;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw tl.a(illegalArgumentException);
                                                            }
                                                        }
                                                        tl.P();
                                                        break block26;
                                                    }
                                                    try {
                                                        try {
                                                            if (n2 != 2929) break block27;
                                                            if (!bl2) break block28;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw tl.a(illegalArgumentException);
                                                        }
                                                        tl.k();
                                                        break block26;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw tl.a(illegalArgumentException);
                                                    }
                                                }
                                                tl.w();
                                                break block26;
                                            }
                                            try {
                                                try {
                                                    if (n2 != 3042) break block29;
                                                    if (!bl2) break block30;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw tl.a(illegalArgumentException);
                                                }
                                                tl.N();
                                                break block26;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw tl.a(illegalArgumentException);
                                            }
                                        }
                                        tl.j();
                                        break block26;
                                    }
                                    try {
                                        try {
                                            if (n2 != 3553) break block31;
                                            if (!bl2) break block32;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw tl.a(illegalArgumentException);
                                        }
                                        tl.B();
                                        break block26;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw tl.a(illegalArgumentException);
                                    }
                                }
                                tl.R();
                                break block26;
                            }
                            try {
                                try {
                                    if (n2 != 3008) break block33;
                                    if (!bl2) break block34;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw tl.a(illegalArgumentException);
                                }
                                tl.s();
                                break block26;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw tl.a(illegalArgumentException);
                            }
                        }
                        tl.Z();
                        break block26;
                    }
                    try {
                        try {
                            if (n2 != 2884) break block35;
                            if (!bl2) break block36;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw tl.a(illegalArgumentException);
                        }
                        tl.V();
                        break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tl.a(illegalArgumentException);
                    }
                }
                tl.M();
                break block26;
            }
            throw new IllegalArgumentException((String)((Object)tl.b("\u00ee", (int)tl.a("m", (int)7915, (long)(0x6289DD3A19988E75L ^ l10)), (long)-1810700505065881427L, (long)l10)) + n2);
        }
    }

    public static void Y(int n2, int n3) {
        try {
            if (Na.MC_1_20_6.Q()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.V(tl.U.u().L8, n2, n3);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = tl.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = tl.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void P(int n2, int n3) {
        try {
            if (Na.MC_1_21_6.H()) {
                tl.l(n2, n3, n2, n3);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.Y(tl.U.u().L8, n2, n3);
    }

    public static void R() {
        try {
            if (F8.U()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        try {
            if (tl.v()) {
                Ne.h.z(3553);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw tl.a(illegalArgumentException);
        }
        qg.N(tl.U.u().L8);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(tl.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(tl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

