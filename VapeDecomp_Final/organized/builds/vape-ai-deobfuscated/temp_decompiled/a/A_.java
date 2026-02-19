/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.Ge;
import a.O_;
import a.On;
import a.WJ;
import a.X;
import a._H;
import a.aD;
import a.aK;
import a.av;
import a.d8;
import a.e2;
import a.e5;
import a.eF;
import a.eH;
import a.eP;
import a.eR;
import a.em;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_
extends aK {
    private static final long[] h;
    private av H;
    private static final Map k;
    private static final Integer[] i;
    private static final long b;

    @Override
    protected void Z(em em2, int n2, eR eR2, eR eR3) throws _H {
        block8: {
            try {
                if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(this.H.q)) break block8;
            }
            catch (_H _H2) {
                throw a_.a(_H2);
            }
            eR3.z(this);
            GM[] gMArray = this.H.Q;
            try {
                if (gMArray == null) {
                    return;
                }
            }
            catch (_H _H3) {
                throw a_.a(_H3);
            }
            int n3 = gMArray.length;
            try {
                for (int i10 = 0; i10 < n3; ++i10) {
                    this.o(gMArray[i10]);
                }
            }
            catch (_H _H4) {
                throw a_.a(_H4);
            }
        }
        super.Z(em2, n2, eR2, eR3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = d8.a(-2461855529170486887L, 609868666461702050L, MethodHandles.lookup().lookupClass()).a(216502232677431L);
        k = new HashMap(13);
        long l10 = b ^ 0x385F56D0D4CL;
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
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u00cf\u00b3\u00be^\u001d\u00ab\u0090 y\u00bf\u00aa\u008c\u00dc\u0094\u0098\u00b3C\u00e6w\u0089\u001e\u009a\u00f0\u001c";
        int n3 = "\u00cf\u00b3\u00be^\u001d\u00ab\u0090 y\u00bf\u00aa\u008c\u00dc\u0094\u0098\u00b3C\u00e6w\u0089\u001e\u009a\u00f0\u001c".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        h = lArray;
        i = new Integer[3];
    }

    protected void E(e2 e22) throws _H {
        long l10;
        block7: {
            l10 = b ^ 0x7198F3B9018L;
            try {
                try {
                    e22.m().z(this);
                    if (!aD.V(this.j) && this.P <= 0) break block7;
                }
                catch (_H _H2) {
                    throw a_.a(_H2);
                }
                return;
            }
            catch (_H _H3) {
                throw a_.a(_H3);
            }
        }
        GM gM = this.M.b(this.j, this.P, this.w);
        try {
            if (gM instanceof Ge) {
                this.j = (int)a_.b("w", (int)21664, (long)(0x7B741CE376D1145AL ^ l10));
                this.P = 0;
                this.w = "java/lang/Object";
            }
        }
        catch (_H _H4) {
            throw a_.a(_H4);
        }
    }

    protected void n(e2 e22) throws _H {
        block9: {
            GM gM;
            block8: {
                gM = this.H.s;
                try {
                    block7: {
                        try {
                            try {
                                e22.m().z(this);
                                if (this.j == 344 || aD.V(this.j)) break block7;
                            }
                            catch (_H _H2) {
                                throw a_.a(_H2);
                            }
                            if (this.P <= 0) break block8;
                        }
                        catch (_H _H3) {
                            throw a_.a(_H3);
                        }
                    }
                    this.o(gM);
                    break block9;
                }
                catch (_H _H4) {
                    throw a_.a(_H4);
                }
            }
            if (gM instanceof Ge) {
                int n2;
                Ge ge = (Ge)gM;
                this.j = n2 = X.y(ge.y());
                this.P = 0;
                this.w = null;
            }
        }
    }

    public void I(GM gM) throws _H {
        this.N(gM, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void N(GM gM, int n2) throws _H {
        long l10 = b ^ 0xCBC15886034L;
        if (gM.m()) {
            Ge ge = (Ge)gM;
            this.j = X.y(ge.y());
            this.P = n2;
            this.w = null;
            return;
        }
        try {
            if (gM.p()) {
                try {
                    this.N(gM.r(), n2 + 1);
                    return;
                }
                catch (WJ wJ2) {
                    throw new _H("undefined type: " + gM.H());
                }
            }
        }
        catch (_H _H2) {
            throw a_.a(_H2);
        }
        this.j = (int)a_.b("w", (int)21664, (long)(0x7B741746EC62E476L ^ l10));
        this.P = n2;
        this.w = X.i(gM.H());
    }

    @Override
    public void J(eP eP2) throws _H {
        block9: {
            block11: {
                String string;
                long l10;
                block10: {
                    block8: {
                        l10 = b ^ 0x1FE948ED7BBEL;
                        string = eP2.e();
                        try {
                            if (!string.equals(this.H.q)) break block8;
                            this.j = (int)a_.b("w", (int)25205, (long)(0x7366460664E0C92BL ^ l10));
                            this.P = 1;
                            this.w = "java/lang/Object";
                            break block9;
                        }
                        catch (_H _H2) {
                            throw a_.a(_H2);
                        }
                    }
                    try {
                        if (!string.equals("$sig")) break block10;
                        this.j = (int)a_.b("w", (int)21664, (long)(0x7B740413B107FFFCL ^ l10));
                        this.P = 1;
                        this.w = "java/lang/Class";
                        break block9;
                    }
                    catch (_H _H3) {
                        throw a_.a(_H3);
                    }
                }
                try {
                    try {
                        if (!string.equals("$type") && !string.equals("$class")) break block11;
                    }
                    catch (_H _H4) {
                        throw a_.a(_H4);
                    }
                    this.j = (int)a_.b("w", (int)21664, (long)(0x7B740413B107FFFCL ^ l10));
                    this.P = 0;
                    this.w = "java/lang/Class";
                    break block9;
                }
                catch (_H _H5) {
                    throw a_.a(_H5);
                }
            }
            super.J(eP2);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void Y() {
        long l10 = b ^ 0x63D50B13B0EFL;
        try {
            if (this.j == 344) {
                this.j = (int)a_.b("w", (int)21664, (long)(0x7B74782FF2F934ADL ^ l10));
                this.P = 0;
                this.w = "java/lang/Object";
            }
        }
        catch (O_ o_2) {
            throw a_.a(o_2);
        }
    }

    @Override
    public void e(eF eF2, int[] nArray, int[] nArray2, String[] stringArray) throws _H {
        GM[] gMArray = this.H.Q;
        String string = this.H.J;
        int n2 = 0;
        while (eF2 != null) {
            block7: {
                eR eR2;
                block6: {
                    eR2 = eF2.l();
                    try {
                        try {
                            if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(string)) break block6;
                        }
                        catch (_H _H2) {
                            throw a_.a(_H2);
                        }
                        if (gMArray == null) break block7;
                    }
                    catch (_H _H3) {
                        throw a_.a(_H3);
                    }
                    int n3 = gMArray.length;
                    for (int i10 = 0; i10 < n3; ++i10) {
                        GM gM = gMArray[i10];
                        this.I(gM);
                        nArray[n2] = this.j;
                        nArray2[n2] = this.P;
                        stringArray[n2] = this.w;
                        ++n2;
                    }
                    break block7;
                }
                eR2.z(this);
                nArray[n2] = this.j;
                nArray2[n2] = this.P;
                stringArray[n2] = this.w;
                ++n2;
            }
            eF2 = eF2.n();
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = a_.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public a_(GM gM, On on2, av av2) {
        super(gM, on2);
        this.H = av2;
    }

    @Override
    public void f(eH eH2) throws _H {
        eR eR2 = eH2.R();
        if (eR2 instanceof eP) {
            String string;
            block8: {
                string = ((eP)eR2).e();
                try {
                    try {
                        if (this.H.A == null || !string.equals(this.H.c)) break block8;
                    }
                    catch (_H _H2) {
                        throw a_.a(_H2);
                    }
                    this.H.A.u(this, (eF)eH2.V());
                    return;
                }
                catch (_H _H3) {
                    throw a_.a(_H3);
                }
            }
            try {
                if (string.equals("$cflow")) {
                    this.v((eF)eH2.V());
                    return;
                }
            }
            catch (_H _H4) {
                throw a_.a(_H4);
            }
        }
        super.f(eH2);
    }

    protected void o(GM gM) throws _H {
        block3: {
            block2: {
                try {
                    if (gM != GM.M) break block2;
                    this.Y();
                    break block3;
                }
                catch (_H _H2) {
                    throw a_.a(_H2);
                }
            }
            this.I(gM);
        }
    }

    @Override
    public void s(e2 e22) throws _H {
        block10: {
            eF eF2 = e22.l();
            try {
                if (eF2 == null || e22.P() != 0) break block10;
            }
            catch (_H _H2) {
                throw a_.a(_H2);
            }
            eR eR2 = eF2.l();
            try {
                if (!(eR2 instanceof e5) || eF2.n() != null) break block10;
            }
            catch (_H _H3) {
                throw a_.a(_H3);
            }
            String string = ((e5)eR2).e();
            try {
                if (string.equals(this.H.j)) {
                    this.n(e22);
                    return;
                }
            }
            catch (_H _H4) {
                throw a_.a(_H4);
            }
            try {
                if (string.equals("$w")) {
                    this.E(e22);
                    return;
                }
            }
            catch (_H _H5) {
                throw a_.a(_H5);
            }
        }
        super.s(e22);
    }

    @Override
    public int c(eF eF2) {
        String string = this.H.J;
        int n2 = 0;
        while (eF2 != null) {
            block6: {
                block5: {
                    eR eR2 = eF2.l();
                    try {
                        try {
                            if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(string)) break block5;
                        }
                        catch (O_ o_2) {
                            throw a_.a(o_2);
                        }
                        if (this.H.Q == null) break block6;
                    }
                    catch (O_ o_3) {
                        throw a_.a(o_3);
                    }
                    n2 += this.H.Q.length;
                    break block6;
                }
                ++n2;
            }
            eF2 = eF2.n();
        }
        return n2;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7820;
        if (i[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = h[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/a_", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            a_.i[n3] = n4;
        }
        return i[n3];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected void v(eF eF2) throws _H {
        long l10 = b ^ 0x5A555B50B35BL;
        this.j = (int)a_.b("w", (int)11579, (long)(0x24CE9271047DCE81L ^ l10));
        this.P = 0;
        this.w = null;
    }

    void z(eR eR2, String string, String string2, String string3, eF eF2) throws _H {
        eR2.z(this);
        int n2 = this.c(eF2);
        this.e(eF2, new int[n2], new int[n2], new String[n2]);
        this.k(string3);
        this.Y();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

