/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B7;
import a.BL;
import a.Bb;
import a.Bz;
import a.Ce;
import a.F8;
import a.Gi;
import a.I_;
import a.It;
import a.JF;
import a.NE;
import a.O_;
import a.SE;
import a.TB;
import a.TY;
import a.Tr;
import a.bE;
import a.bH;
import a.bM;
import a.bR;
import a.bg;
import a.d8;
import a.h6;
import a.hZ;
import a.hd;
import a.hn;
import a.hw;
import a.sN;
import a.vi;
import a.yG;
import a.yh;
import a.z5;
import a.z_;
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
public class wi
extends yG {
    private final yh Ul;
    private final boolean UO;
    private final h6 UC;
    private final h6 Us;
    protected bg Ub;
    private static final String[] rb;
    private boolean UV;
    private static final Map lb;
    private static final long ab;
    protected final h6 UD;
    private static final Integer[] fb;
    private bM US;
    private static boolean UQ;
    private boolean UE;
    protected final yh UG;
    private final h6 UF;
    private final boolean UX;
    private static final long[] eb;
    private static final Object[] qb;
    protected final z_ UH;

    public static void r(boolean bl2) {
        UQ = bl2;
    }

    private void lambda$onKick$3() {
        this.UE = false;
    }

    private void lambda$onPromote$1() {
        this.UE = false;
    }

    private void lambda$onKick$2(JF jF2, TB tB2) {
        try {
            if (tB2.S() == z5.SUCCESS) {
                jF2.F(this.UH);
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
    }

    @Override
    public void G() {
        super.G();
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    private void lambda$onPromote$0(JF jF2, TY tY2) {
        try {
            if (tY2.K() == NE.SUCCESS) {
                jF2.u(this.UH);
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e0' || c10 == 'X' || c10 == '\u00c6' || c10 == '\u00d6') {
                field = wi.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wi.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public wi(z_ z_2, boolean bl2, boolean bl3) {
        long l10 = ab ^ 0x120FC8937940L;
        super(99.0, 20.0);
        this.Ul = new yh(70.0);
        this.UF = new hd(this, (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)15240, (long)(0x5053F2DCA338E14DL ^ l10)), (long)-4041360356580261025L, (long)l10)), wi.M.S);
        this.UC = new hZ(this, (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)7086, (long)(0x1226BE45D792416FL ^ l10)), (long)-4041360356580261025L, (long)l10)), wi.M.S);
        this.UD = new hn(this, (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)27153, (long)(0x18A1B30F61B830D1L ^ l10)), (long)-4041360356580261025L, (long)l10)), wi.M.S);
        this.Us = new hw(this, (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)31253, (long)(0x273DB71332A020D1L ^ l10)), (long)-4041360356580261025L, (long)l10)), wi.M.S);
        this.UG = new yh(70.0);
        this.UE = false;
        this.UH = z_2;
        this.UO = bl2;
        this.UX = bl3;
        this.US = new bR(this, z_2.j(), (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)10342, (long)(0x3434FF2450B172A8L ^ l10)), (long)-4041360356580261025L, (long)l10)), 72.0, 0.75, wi.M.c, false);
        this.Ub = new bH(this, z_2.X(), 0.55, 0.75, 0.1, 72.0, false, false, wi.M.w);
        this.Ul.n(this.US, new Object[0]);
        this.UG.n(this.Ub, new Object[0]);
        if (bl2) {
            this.UG.o(this.UD);
        } else {
            this.UG.o(this.Us, this.UF, new bE(2.0, 1.0), this.UC);
        }
        this.Ul.d().f((String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)26704, (long)(0x241E37713F18B292L ^ l10)), (long)-4041360356580261025L, (long)l10)));
        this.Ul.o(new bE(0.0, 9.0));
        this.Ul.o(this.UG);
        this.o(new bE(4.0, 1.0), new Ce(z_2, 8.0, 8.0), new bE(4.0, 1.0), this.Ul);
        this.UF.N(this::O);
        this.UC.N(this::V);
        this.UD.N(this::y);
        this.Us.N(this::X);
    }

    private void lambda$onRevoke$5() {
        this.UE = false;
    }

    private void O() {
        try {
            if (this.UE) {
                return;
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
        JF jF2 = SE.h.O().p().Q();
        try {
            if (jF2 == null) {
                return;
            }
        }
        catch (O_ o_3) {
            throw wi.b(o_3);
        }
        this.UE = true;
        I_.h().c().c(this.UH.s(), arg_0 -> this.lambda$onPromote$0(jF2, arg_0), this::lambda$onPromote$1);
    }

    public static boolean r() {
        boolean bl2 = wi.a();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
        return false;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$onRevoke$4(JF jF2, Tr tr2) {
        try {
            if (tr2.m() == It.SUCCESS) {
                jF2.F(this.UH);
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
    }

    private static void x() {
        Object[] objectArray = qb;
        qb[0] = "\b4I";
        objectArray[1] = Integer.TYPE;
        wi.rb[1] = "java/lang/Integer";
        objectArray[2] = "b4\u0003m\u0002Ci;\u0012\"\u007f[z<\u001bk";
        objectArray[3] = "e:;=%?n5*rD1e>.(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0014O@\u0000S%A\u001b\\a\u0004a~SC\u0013Qa\u0004\u001a@\u001fo#\u0001_Y\u001aSe\u0015EBa";
    }

    @Override
    public void E() {
        block31: {
            long l10;
            block30: {
                boolean bl2;
                bg bg2;
                block29: {
                    block28: {
                        boolean bl3;
                        block26: {
                            block24: {
                                block25: {
                                    boolean bl4;
                                    block23: {
                                        block22: {
                                            boolean bl5;
                                            block21: {
                                                block20: {
                                                    l10 = ab ^ 0x4FAEA1A9D393L;
                                                    try {
                                                        try {
                                                            if (!SE.h.M().q().contains(this.UH) && !SE.h.O().u().k(this.UH)) break block20;
                                                        }
                                                        catch (O_ o_2) {
                                                            throw wi.b(o_2);
                                                        }
                                                        bl5 = true;
                                                        break block21;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw wi.b(o_3);
                                                    }
                                                }
                                                bl5 = false;
                                            }
                                            boolean bl6 = bl5;
                                            boolean bl7 = SE.h.O().n().equals(this.UH);
                                            try {
                                                try {
                                                    if (bl6 || bl7) break block22;
                                                }
                                                catch (O_ o_4) {
                                                    throw wi.b(o_4);
                                                }
                                                bl4 = true;
                                                break block23;
                                            }
                                            catch (O_ o_5) {
                                                throw wi.b(o_5);
                                            }
                                        }
                                        bl4 = false;
                                    }
                                    bl3 = bl4;
                                    try {
                                        try {
                                            if (!this.s()) break block24;
                                            if (!this.UX) break block25;
                                        }
                                        catch (O_ o_6) {
                                            throw wi.b(o_6);
                                        }
                                        this.Us.N(bl3);
                                        this.UF.N(false);
                                        this.UC.N(false);
                                        this.UD.N(false);
                                        break block26;
                                    }
                                    catch (O_ o_7) {
                                        throw wi.b(o_7);
                                    }
                                }
                                this.Us.N(bl3);
                                this.UF.N(true);
                                this.UC.N(true);
                                this.UD.N(true);
                                break block26;
                            }
                            this.Us.N(false);
                            this.UF.N(false);
                            this.UC.N(false);
                            this.UD.N(false);
                        }
                        try {
                            block27: {
                                try {
                                    try {
                                        bg2 = this.Ub;
                                        if (!this.s()) break block27;
                                        if (!this.UX) break block28;
                                    }
                                    catch (O_ o_8) {
                                        throw wi.b(o_8);
                                    }
                                    if (bl3) break block28;
                                }
                                catch (O_ o_9) {
                                    throw wi.b(o_9);
                                }
                            }
                            bl2 = true;
                            break block29;
                        }
                        catch (O_ o_10) {
                            throw wi.b(o_10);
                        }
                    }
                    bl2 = false;
                }
                try {
                    bg2.N(bl2);
                    this.A();
                    this.US.d(this.UH.j());
                    if (!this.UO) break block30;
                    this.Ub.V(this.UH.X());
                    break block31;
                }
                catch (O_ o_11) {
                    throw wi.b(o_11);
                }
            }
            this.Ub.V((String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)27473, (long)(0x226B0AE097DC9B45L ^ l10)), (long)7870437872104024460L, (long)l10)) + this.UH.X());
        }
        super.E();
        this.z();
        this.UF.d((double)0.65f);
        this.UC.d((double)0.65f);
        this.UD.d((double)0.65f);
        this.Us.d((double)0.65f);
        this.UF.d(1.0f);
        this.UC.d(1.0f);
        this.UD.d(1.0f);
        this.Us.d(1.0f);
        this.Ul.i(false);
        this.i(false);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wi.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 11;
                break;
            }
            case 1: {
                n4 = 39;
                break;
            }
            case 2: {
                n4 = 34;
                break;
            }
            case 3: {
                n4 = 2;
                break;
            }
            case 4: {
                n4 = 8;
                break;
            }
            case 5: {
                n4 = 36;
                break;
            }
            case 6: {
                n4 = 45;
                break;
            }
            case 7: {
                n4 = 63;
                break;
            }
            case 8: {
                n4 = 30;
                break;
            }
            case 9: {
                n4 = 3;
                break;
            }
            case 10: {
                n4 = 10;
                break;
            }
            case 11: {
                n4 = 26;
                break;
            }
            case 12: {
                n4 = 18;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 41;
                break;
            }
            case 15: {
                n4 = 42;
                break;
            }
            case 16: {
                n4 = 5;
                break;
            }
            case 17: {
                n4 = 16;
                break;
            }
            case 18: {
                n4 = 56;
                break;
            }
            case 19: {
                n4 = 28;
                break;
            }
            case 20: {
                n4 = 33;
                break;
            }
            case 21: {
                n4 = 54;
                break;
            }
            case 22: {
                n4 = 13;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 46;
                break;
            }
            case 25: {
                n4 = 59;
                break;
            }
            case 26: {
                n4 = 7;
                break;
            }
            case 27: {
                n4 = 4;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 27;
                break;
            }
            case 30: {
                n4 = 21;
                break;
            }
            case 31: {
                n4 = 51;
                break;
            }
            case 32: {
                n4 = 6;
                break;
            }
            case 33: {
                n4 = 32;
                break;
            }
            case 34: {
                n4 = 44;
                break;
            }
            case 35: {
                n4 = 14;
                break;
            }
            case 36: {
                n4 = 17;
                break;
            }
            case 37: {
                n4 = 23;
                break;
            }
            case 38: {
                n4 = 62;
                break;
            }
            case 39: {
                n4 = 35;
                break;
            }
            case 40: {
                n4 = 53;
                break;
            }
            case 41: {
                n4 = 43;
                break;
            }
            case 42: {
                n4 = 58;
                break;
            }
            case 43: {
                n4 = 0;
                break;
            }
            case 44: {
                n4 = 12;
                break;
            }
            case 45: {
                n4 = 40;
                break;
            }
            case 46: {
                n4 = 24;
                break;
            }
            case 47: {
                n4 = 9;
                break;
            }
            case 48: {
                n4 = 52;
                break;
            }
            case 49: {
                n4 = 49;
                break;
            }
            case 50: {
                n4 = 50;
                break;
            }
            case 51: {
                n4 = 19;
                break;
            }
            case 52: {
                n4 = 22;
                break;
            }
            case 53: {
                n4 = 38;
                break;
            }
            case 54: {
                n4 = 25;
                break;
            }
            case 55: {
                n4 = 55;
                break;
            }
            case 56: {
                n4 = 29;
                break;
            }
            case 57: {
                n4 = 57;
                break;
            }
            case 58: {
                n4 = 20;
                break;
            }
            case 59: {
                n4 = 1;
                break;
            }
            case 60: {
                n4 = 61;
                break;
            }
            case 61: {
                n4 = 31;
                break;
            }
            case 62: {
                n4 = 15;
                break;
            }
            default: {
                n4 = 37;
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
        wi.rb[n5] = new String(cArray);
        return n5;
    }

    private static Method l(long l10, long l11) {
        int n2 = wi.i(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = wi.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wi.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wi.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        wi.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wi.j(225498334220134L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wi.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wi.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wi.j(225498334220134L, 0L);
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

    private void X() {
        long l10 = ab ^ 0x70A79817E548L;
        try {
            if (this.UE) {
                return;
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
        JF jF2 = SE.h.O().p().Q();
        try {
            if (jF2 == null) {
                return;
            }
        }
        catch (O_ o_3) {
            throw wi.b(o_3);
        }
        for (BL bL2 : SE.h.O().u().C()) {
            try {
                if (!bL2.s().j().equals(this.UH.j())) continue;
                Gi.W(new sN(vi.SUCCESS, (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)8749, (long)(0x19C732AD5ABB64E3L ^ l10)), (long)6620949521221590871L, (long)l10)) + this.UH.j() + (String)((Object)wi.e("\u00eb", (int)wi.c("s", (int)4701, (long)(0x5E239E9B79D35496L ^ l10)), (long)6620949521221590871L, (long)l10))));
                SE.h.O().u().b((Bb)bL2);
                return;
            }
            catch (O_ o_4) {
                throw wi.b(o_4);
            }
        }
        this.UE = true;
        Bz.d(this.UH.j());
        this.UE = false;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wi.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wi.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1D2D;
        if (fb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wi", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wi.fb[n3] = n4;
        }
        return fb[n3];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = wi.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wi.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void y() {
        try {
            if (this.UE) {
                return;
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
        JF jF2 = SE.h.O().p().Q();
        try {
            if (jF2 == null) {
                return;
            }
        }
        catch (O_ o_3) {
            throw wi.b(o_3);
        }
        this.UE = true;
        I_.h().c().O(this.UH.s(), arg_0 -> this.lambda$onRevoke$4(jF2, arg_0), this::lambda$onRevoke$5);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static boolean a() {
        return UQ;
    }

    protected void z() {
        try {
            if (!this.UO) {
                F8.T(this.Ub.G(), this.Ub.W() + 2.0, 2.0, 1.0, B7.P(this.UH.M()));
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private void V() {
        try {
            if (this.UE) {
                return;
            }
        }
        catch (O_ o_2) {
            throw wi.b(o_2);
        }
        JF jF2 = SE.h.O().p().Q();
        try {
            if (jF2 == null) {
                return;
            }
        }
        catch (O_ o_3) {
            throw wi.b(o_3);
        }
        this.UE = true;
        I_.h().c().k(this.UH.s(), arg_0 -> this.lambda$onKick$2(jF2, arg_0), this::lambda$onKick$3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                wi.ab = d8.a(4958668016329870536L, 1736956906515699667L, MethodHandles.lookup().lookupClass()).a(280672180495494L);
                wi.qb = new Object[5];
                wi.rb = new String[5];
                wi.x();
                wi.lb = new HashMap<K, V>(13);
                var0 = wi.ab ^ 17558044341363L;
                wi.r(false);
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
                var6_5 = "\u008c\u0014!\u00bf\u0096\u0010\u009a\u0097\u00a88\u008f\u008eAm_\u00be\u00aa\u00de\u0006\u00b88g\u0093\u0012\u00c6\u00d7,\u009cK\u0081\u00ec\u00e6\u00eaB\u00b2\u000b\u00d6\u00d4\u00f3_\u00ff\u009ej$\u00b6q\f\u0095\u00a1\u00cf;\u00d8\u0016\u009c\u00bdL";
                var7_6 = "\u008c\u0014!\u00bf\u0096\u0010\u009a\u0097\u00a88\u008f\u008eAm_\u00be\u00aa\u00de\u0006\u00b88g\u0093\u0012\u00c6\u00d7,\u009cK\u0081\u00ec\u00e6\u00eaB\u00b2\u000b\u00d6\u00d4\u00f3_\u00ff\u009ej$\u00b6q\f\u0095\u00a1\u00cf;\u00d8\u0016\u009c\u00bdL".length();
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
                    var6_5 = "\u00eb\\\u0015\u00f3\u00b0\u0003-\u00e0\n\u009d\u00ec\u00d6uYWZ";
                    var7_6 = "\u00eb\\\u0015\u00f3\u00b0\u0003-\u00e0\n\u009d\u00ec\u00d6uYWZ".length();
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
        wi.eb = var8_3;
        wi.fb = new Integer[9];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wi.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wi.i(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wi.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public z_ O() {
        return this.UH;
    }

    private static Field k(long l10, long l11) {
        int n2 = wi.i(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wi.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wi.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wi.e(clazz3, string2, clazz2)) != null) {
                    wi.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wi.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wi.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wi.j(225498334220134L, 0L);
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
            return MethodHandles.lookup().findStatic(wi.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(wi.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

