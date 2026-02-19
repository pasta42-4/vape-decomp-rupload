/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GB;
import a.Jv;
import a.O_;
import a.RN;
import a.Rf;
import a.YI;
import a.ZT;
import a.aV;
import a.ak;
import a.d8;
import java.io.IOException;
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

public class e8
implements RN {
    protected String R;
    private int E;
    protected int b;
    protected float L;
    protected float c;
    protected float Y;
    protected Rf V;
    private static final long a = d8.a(-5830073898303792813L, -5027810087149597915L, MethodHandles.lookup().lookupClass()).a(222464179872734L);
    protected int N;
    protected float w;
    protected float t;
    private static final Integer[] e;
    protected float H;
    protected boolean S;
    protected ZT[] g;
    private static final Map f;
    private static final long[] d;
    protected float K;
    protected static GB X;

    public String toString() {
        this.g();
        return "[Image " + this.R + " " + this.b + "x" + this.N + "  " + this.L + "," + this.w + "," + this.Y + "," + this.c + "]";
    }

    public int w() {
        this.g();
        return this.N;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/e8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = e8.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l10 = a ^ 0x982CC9FBD6BL;
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
        String string = "\u001d\u00a3\u00a3\u00ff\u00f5\u00dfF\u00f4\u009eY\u00a52\u0093\u00b0w8";
        int n3 = "\u001d\u00a3\u00a3\u00ff\u00f5\u00dfF\u00f4\u009eY\u00a52\u0093\u00b0w8".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        d = lArray;
        e = new Integer[2];
        X = aV.Y();
    }

    public void s(float f10, float f11, float f12, float f13) {
        block3: {
            block2: {
                try {
                    this.g();
                    if (this.g != null) break block2;
                    X.C(this.L, this.w);
                    X.h(f10, f11, 0.0f);
                    X.C(this.L, this.w + this.c);
                    X.h(f10, f11 + f13, 0.0f);
                    X.C(this.L + this.Y, this.w + this.c);
                    X.h(f10 + f12, f11 + f13, 0.0f);
                    X.C(this.L + this.Y, this.w);
                    X.h(f10 + f12, f11, 0.0f);
                    break block3;
                }
                catch (O_ o_2) {
                    throw e8.a(o_2);
                }
            }
            this.g[0].t();
            X.C(this.L, this.w);
            X.h(f10, f11, 0.0f);
            this.g[3].t();
            X.C(this.L, this.w + this.c);
            X.h(f10, f11 + f13, 0.0f);
            this.g[2].t();
            X.C(this.L + this.Y, this.w + this.c);
            X.h(f10 + f12, f11 + f13, 0.0f);
            this.g[1].t();
            X.C(this.L + this.Y, this.w);
            X.h(f10 + f12, f11, 0.0f);
        }
    }

    protected void n() {
    }

    public Rf l() {
        return this.V;
    }

    public e8 h(int n2, int n3, int n4, int n5) {
        this.g();
        float f10 = (float)n2 / (float)this.b * this.Y + this.L;
        float f11 = (float)n3 / (float)this.N * this.c + this.w;
        float f12 = (float)n4 / (float)this.b * this.Y;
        float f13 = (float)n5 / (float)this.N * this.c;
        e8 e82 = new e8();
        e82.S = true;
        e82.V = this.V;
        e82.L = f10;
        e82.w = f11;
        e82.Y = f12;
        e82.c = f13;
        e82.b = n4;
        e82.N = n5;
        e82.R = this.R;
        e82.t = n4 / 2;
        e82.K = n5 / 2;
        return e82;
    }

    public void O() {
        this.V.P();
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4586;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/e8", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e8.e[n3] = n4;
        }
        return e[n3];
    }

    public e8(int n2, int n3) throws YI {
        this(n2, n3, 2);
    }

    public e8(int n2, int n3, int n4) throws YI {
        long l10 = a ^ 0x37A51C62F367L;
        this.H = 1.0f;
        this.S = false;
        this.E = (int)e8.a("l", (int)12405, (long)(0x27785B33B4B7E516L ^ l10));
        this.R = super.toString();
        this.E = n4 == 1 ? 9729 : 9728;
        try {
            this.V = Jv.g().j(n2, n3, this.E);
        }
        catch (IOException iOException) {
            ak.j(iOException);
            throw new YI("Failed to create empty image " + n2 + "x" + n3);
        }
        this.g();
    }

    public int Y() {
        this.g();
        return this.b;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    protected final void g() {
        try {
            if (this.S) {
                return;
            }
        }
        catch (O_ o_2) {
            throw e8.a(o_2);
        }
        try {
            this.S = true;
            if (this.V != null) {
                this.b = this.V.k();
                this.N = this.V.I();
                this.L = 0.0f;
                this.w = 0.0f;
                this.Y = this.V.n();
                this.c = this.V.A();
            }
        }
        catch (O_ o_3) {
            throw e8.a(o_3);
        }
        this.n();
        this.t = this.b / 2;
        this.K = this.N / 2;
    }

    protected e8() {
        long l10 = a ^ 0x73910C809810L;
        this.H = 1.0f;
        this.S = false;
        this.E = (int)e8.a("l", (int)26538, (long)(0x20E15121F32259BFL ^ l10));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

