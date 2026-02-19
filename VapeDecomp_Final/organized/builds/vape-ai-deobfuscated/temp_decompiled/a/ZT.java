/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Af;
import a.N9;
import a.O_;
import a.WK;
import a.Y6;
import a.d8;
import a.oo;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zt {
    private int o;
    private static oo[] P;
    private static oo[] j;
    private static final long b;
    private final WK<Y6> K;
    private long H;
    private static final long a;
    private final Map<N9, Vector<Y6>> f;

    public long a() {
        return this.H;
    }

    /*
     * WARNING - void declaration
     */
    public Vector<Y6> x(N9 n9, N9 n92, int n2, Vector<Y6> vector) {
        void var15_19;
        Object object;
        Object object2;
        int n3;
        int n4;
        int n5;
        block39: {
            int n6;
            block38: {
                int n7;
                block37: {
                    int n8;
                    block36: {
                        int n10;
                        block35: {
                            int n11;
                            block34: {
                                long l10 = a ^ 0x100037E81231L;
                                try {
                                    ++this.o;
                                    if (this.f.containsKey(n9)) {
                                        return this.f.get(n9);
                                    }
                                }
                                catch (O_ o_2) {
                                    throw zt.a(o_2);
                                }
                                try {
                                    if (n2 > this.K.B()) {
                                        return null;
                                    }
                                }
                                catch (O_ o_3) {
                                    throw zt.a(o_3);
                                }
                                n11 = n92.x() - n9.x();
                                n8 = n92.J() - n9.J();
                                n6 = n92.b() - n9.b();
                                try {
                                    if (n11 <= 0) break block34;
                                    n10 = 5;
                                    break block35;
                                }
                                catch (O_ o_4) {
                                    throw zt.a(o_4);
                                }
                            }
                            try {
                                n10 = n11 < 0 ? 4 : -1;
                            }
                            catch (O_ o_5) {
                                throw zt.a(o_5);
                            }
                        }
                        n5 = n10;
                        try {
                            if (n8 <= 0) break block36;
                            n7 = 1;
                            break block37;
                        }
                        catch (O_ o_6) {
                            throw zt.a(o_6);
                        }
                    }
                    try {
                        n7 = n8 < 0 ? 0 : -1;
                    }
                    catch (O_ o_7) {
                        throw zt.a(o_7);
                    }
                }
                n4 = n7;
                try {
                    if (n6 <= 0) break block38;
                    n3 = 3;
                    break block39;
                }
                catch (O_ o_8) {
                    throw zt.a(o_8);
                }
            }
            try {
                n3 = n6 < 0 ? 2 : -1;
            }
            catch (O_ o_9) {
                throw zt.a(o_9);
            }
        }
        int n12 = n3;
        int[] nArray = new int[]{n5, n4, n12};
        ArrayList<Y6> arrayList = new ArrayList<Y6>();
        for (int n11 : nArray) {
            try {
                if (n11 == -1) {
                    continue;
                }
            }
            catch (O_ o_10) {
                throw zt.a(o_10);
            }
            object2 = n9;
            object = j[n11];
            N9 n93 = ((N9)object2).m((oo)object);
            if (!this.K.X(n93)) continue;
            Y6 y62 = new Y6((N9)object2, (oo)object);
            y62.d = n2;
            arrayList.add(y62);
        }
        arrayList.sort(Comparator.comparingInt(arg_0 -> this.lambda$recurFindPlacePathTargets$0(vector, n2, arg_0)));
        Object var15_15 = null;
        int n13 = (int)b;
        for (Y6 y63 : arrayList) {
            block40: {
                object = y63.o.m(y63.N);
                object2 = new Vector<Y6>(vector);
                ((Vector)object2).add(y63);
                if (((N9)object).equals(n92)) {
                    Vector<Y6> vector2 = object2;
                    break;
                }
                Vector<Y6> vector3 = this.x((N9)object, n92, n2 + 1, (Vector<Y6>)object2);
                try {
                    if (vector3 == null || vector3.isEmpty()) break block40;
                }
                catch (O_ o_11) {
                    throw zt.a(o_11);
                }
                object2 = new Vector<Y6>(vector3);
            }
            try {
                if (((Vector)object2).isEmpty()) {
                    break;
                }
            }
            catch (O_ o_12) {
                throw zt.a(o_12);
            }
            try {
                if (n2 == 0) {
                    Af.G.add(new Vector<Y6>((Collection<Y6>)object2));
                }
            }
            catch (O_ o_13) {
                throw zt.a(o_13);
            }
            int n14 = this.K.e((Vector<Y6>)object2, n2);
            try {
                void var15_16;
                if (var15_16 != null && n14 >= n13) continue;
            }
            catch (O_ o_14) {
                throw zt.a(o_14);
            }
            Vector<Y6> vector4 = object2;
            n13 = n14;
        }
        this.f.put(n9, (Vector<Y6>)var15_19);
        return var15_19;
    }

    public zt(WK<Y6> wK2) {
        this.K = wK2;
        this.H = 0L;
        this.o = 0;
        this.f = new HashMap<N9, Vector<Y6>>();
        if (j == null) {
            j = oo.G();
            P = oo.Y();
        }
    }

    public Vector<Y6> A(N9 n9, N9 n92) {
        this.f.clear();
        long l10 = System.nanoTime();
        this.o = 0;
        Vector<Y6> vector = this.x(n9, n92, 0, new Vector<Y6>());
        long l11 = System.nanoTime();
        this.H = l11 - l10;
        return vector;
    }

    private int lambda$recurFindPlacePathTargets$0(Vector vector, int n2, Y6 y62) {
        Vector<Y6> vector2 = new Vector<Y6>(vector);
        vector2.add(y62);
        return this.K.e(vector2, n2);
    }

    public int i() {
        return this.o;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(-3185647550475494224L, -8721124334018016467L, MethodHandles.lookup().lookupClass()).a(253159759247560L);
        long l10 = a ^ 0x52851610C338L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -3739900320094217775L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

