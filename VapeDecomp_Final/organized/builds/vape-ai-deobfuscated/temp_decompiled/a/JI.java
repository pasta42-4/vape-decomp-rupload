/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.OY;
import a.O_;
import a.Oe;
import a.Oq;
import a.Qg;
import a.SE;
import a.a;
import a.d8;
import a.jp;
import a.kX;
import a.oQ;
import a.oZ;
import a.p_;
import a.tU;
import a.xi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ji
extends xi {
    private static final Map h;
    private boolean T;
    private static final long[] d;
    private boolean R;
    private static final long b;
    private static final Integer[] e;

    public ji() {
        long l10 = b ^ 0x61BFA88C9DEL;
        super(a.cs((int)ji.a("c", (int)15064, (long)(0x6DA1D920EB9CE66CL ^ l10))), (int)ji.a("c", (int)7630, (long)(0x49452177A185C17BL ^ l10)), Oq.k, a.cs((int)ji.a("c", (int)20976, (long)(0x3386C3E6245A8D47L ^ l10))));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ji" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @OY
    public void C(p_ p_2) {
        block22: {
            Object object;
            Qg qg2;
            tU tU2;
            block24: {
                block23: {
                    boolean bl2;
                    block20: {
                        block21: {
                            try {
                                if (SE.h.U().W(jp.class)) {
                                    return;
                                }
                            }
                            catch (O_ o_2) {
                                throw ji.a(o_2);
                            }
                            tU2 = EP.N().r();
                            qg2 = EP.U();
                            try {
                                try {
                                    if (!this.R) break block20;
                                    if (this.T) break block21;
                                }
                                catch (O_ o_3) {
                                    throw ji.a(o_3);
                                }
                                Oe.r(tU2, false, false);
                            }
                            catch (O_ o_4) {
                                throw ji.a(o_4);
                            }
                        }
                        this.R = false;
                        this.T = false;
                        return;
                    }
                    try {
                        if (tU2.X()) {
                            return;
                        }
                    }
                    catch (O_ o_5) {
                        throw ji.a(o_5);
                    }
                    oZ oZ2 = qg2.W();
                    try {
                        bl2 = oZ2.t() > 0.0f;
                    }
                    catch (O_ o_6) {
                        throw ji.a(o_6);
                    }
                    boolean bl3 = bl2;
                    try {
                        try {
                            if (!bl3 || !qg2.j()) break block22;
                        }
                        catch (O_ o_7) {
                            throw ji.a(o_7);
                        }
                        if (kX.C() < 15) break block23;
                    }
                    catch (O_ o_8) {
                        throw ji.a(o_8);
                    }
                    object = qg2.L();
                    break block24;
                }
                Object object2 = qg2.L();
                object = ((oQ)object2).h();
            }
            double d2 = 0.0;
            double d3 = qg2.q();
            double d4 = 90.0;
            double d5 = Math.cos(Math.toRadians(d3 + d4)) * d2;
            double d6 = Math.sin(Math.toRadians(d3 + d4)) * d2;
            double d7 = -0.1;
            oQ oQ2 = ((oQ)object).s(d5, d7, d6);
            List list = EP.c().v(qg2, oQ2);
            d2 = 1.0;
            d5 = Math.cos(Math.toRadians(d3 + d4)) * d2;
            d6 = Math.sin(Math.toRadians(d3 + d4)) * d2;
            d7 = -2.0;
            oQ2 = ((oQ)object).s(d5, d7, d6);
            List list2 = EP.c().v(qg2, oQ2);
            int n2 = list.size();
            int n3 = list2.size();
            try {
                try {
                    if (n2 != 0 || n3 != 0) break block22;
                }
                catch (O_ o_9) {
                    throw ji.a(o_9);
                }
                this.T = tU2.b();
                Oe.f(tU2, true);
                this.R = true;
            }
            catch (O_ o_10) {
                throw ji.a(o_10);
            }
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6598;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ji", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ji.e[n3] = n4;
        }
        return e[n3];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ji.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = d8.a(-9000353985555696914L, 8359097622453982844L, MethodHandles.lookup().lookupClass()).a(178318158605745L);
        h = new HashMap(13);
        long l10 = b ^ 0x1915275368DL;
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
        String string = "\u00c9\u0010aJ\u00a3\u0087\u00db\u008eaU\u00fe\u00e8G\u009dG\u00f1n\u00da\u0090\u00c9\u00fdS\u001a,";
        int n3 = "\u00c9\u0010aJ\u00a3\u0087\u00db\u008eaU\u00fe\u00e8G\u009dG\u00f1n\u00da\u0090\u00c9\u00fdS\u001a,".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        d = lArray;
        e = new Integer[3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ji.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

