/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DI;
import a.Dg;
import a.Dx;
import a.EP;
import a.EV;
import a.Hc;
import a.Hh;
import a.O_;
import a.Qg;
import a.sy;
import a.zz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;

public class r7 {
    public static final Queue<Hh> b = new LinkedList<Hh>();

    private static long z(int n2, int n3, int n4) {
        return ((long)n2 & 0x1FFFFFL) << 43 | ((long)n4 & 0x1FFFFFL) << 22 | (long)n3 & 0xFFFL;
    }

    public static Hh S(int n2, int n3, int n4, int n5, int n6) {
        Hh hh2 = b.poll();
        if (hh2 == null) {
            hh2 = new Hh(n2, n3, n4, n5, n6);
        } else {
            hh2.O(n2, n3, n4, n5, n6);
        }
        return hh2;
    }

    private static boolean n(int n2, int n3, int n4, Set<Long> set) {
        int[][] nArrayArray;
        for (int[] nArray : nArrayArray = new int[][]{{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}}) {
            int n5 = n2 + nArray[0];
            int n6 = n3 + nArray[1];
            int n7 = n4 + nArray[2];
            long l10 = r7.z(n5, n6, n7);
            try {
                if (!set.contains(l10)) continue;
                return true;
            }
            catch (O_ o_2) {
                throw r7.a(o_2);
            }
        }
        return false;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static int[] w(long l10) {
        int n2 = (int)(l10 >> 43 & 0x1FFFFFL);
        int n3 = (int)(l10 >> 22 & 0x1FFFFFL);
        int n4 = (int)(l10 & 0xFFFL);
        return new int[]{n2, n4, n3};
    }

    private static void O(char[] cArray, int n2, int n3, int n4, Set<Long> set) {
        for (int i10 = 0; i10 < cArray.length; ++i10) {
            block7: {
                char c10 = cArray[i10];
                int n5 = c10 >> 4;
                try {
                    try {
                        try {
                            if (n5 == 0 || n5 == 8) break block7;
                        }
                        catch (O_ o_2) {
                            throw r7.a(o_2);
                        }
                        if (n5 == 9) break block7;
                    }
                    catch (O_ o_3) {
                        throw r7.a(o_3);
                    }
                    if (n5 != 30) continue;
                }
                catch (O_ o_4) {
                    throw r7.a(o_4);
                }
            }
            int n6 = i10 % 16;
            int n7 = i10 / 256 + n3;
            int n8 = i10 / 16 % 16;
            int n9 = (n2 << 4) + n6;
            int n10 = n7;
            int n11 = (n4 << 4) + n8;
            long l10 = r7.z(n9, n10, n11);
            set.add(l10);
        }
    }

    private static void I(char[] cArray, int n2, int n3, int n4, zz[] zzArray, ArrayList<Hh> arrayList, Set<Long> set, boolean bl2) {
        for (int i10 = 0; i10 < cArray.length; ++i10) {
            int n5;
            char c10 = cArray[i10];
            int n6 = c10 >> 4;
            try {
                if (n6 == 0) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw r7.a(o_2);
            }
            int n7 = c10 & 0xF;
            boolean bl3 = false;
            for (n5 = 0; n5 < zzArray.length; ++n5) {
                zz zz2;
                block19: {
                    block20: {
                        zz2 = zzArray[n5];
                        try {
                            try {
                                if (zz2.Q() != n6) break block19;
                                if (zz2.z() == -1) break block20;
                            }
                            catch (O_ o_3) {
                                throw r7.a(o_3);
                            }
                            if (zz2.z() != n7) break block19;
                        }
                        catch (O_ o_4) {
                            throw r7.a(o_4);
                        }
                    }
                    bl3 = true;
                    break;
                }
                Predicate<Character> predicate = zz2.o();
                try {
                    if (predicate == null || !predicate.test(Character.valueOf(c10))) continue;
                }
                catch (O_ o_5) {
                    throw r7.a(o_5);
                }
                bl3 = true;
                break;
            }
            try {
                if (!bl3) {
                    continue;
                }
            }
            catch (O_ o_6) {
                throw r7.a(o_6);
            }
            n5 = i10 % 16;
            int n8 = i10 / 256 + n3;
            int n9 = i10 / 16 % 16;
            int n10 = (n2 << 4) + n5;
            int n11 = n8;
            int n12 = (n4 << 4) + n9;
            try {
                try {
                    if (bl2 && !r7.n(n10, n11, n12, set)) {
                        continue;
                    }
                }
                catch (O_ o_7) {
                    throw r7.a(o_7);
                }
            }
            catch (O_ o_8) {
                throw r7.a(o_8);
            }
            Hh hh2 = r7.S(n6, n7, n10, n11, n12);
            arrayList.add(hh2);
        }
    }

    public static void L(Hh hh2) {
        b.offer(hh2);
    }

    public static ArrayList<Hh> j(List<zz> list, int n2, boolean bl2) {
        int n3;
        int n4;
        ArrayList<Hh> arrayList = new ArrayList<Hh>();
        HashSet<Long> hashSet = new HashSet<Long>();
        Dg dg = EP.c();
        EV eV2 = dg.G();
        List<DI> list2 = eV2.l();
        Qg qg2 = EP.U();
        double d2 = qg2.F();
        double d3 = qg2.V();
        double d4 = qg2.B();
        if (bl2) {
            for (DI object3 : list2) {
                List<Dx> list3 = object3.O();
                for (Object object : list3) {
                    if (object == null || ((Hc)object).Y()) continue;
                    try {
                        if (((Dx)object).v() == null) {
                            continue;
                        }
                    }
                    catch (O_ o_2) {
                        throw r7.a(o_2);
                    }
                    int n5 = ((Dx)object).o();
                    char[] cArray = ((Dx)object).v();
                    int n6 = object3.c();
                    n4 = object3.Q();
                    n3 = (int)sy.T(d2, 0.0, d4, n6 << 4, 0.0, n4 << 4);
                    try {
                        if (n3 > n2) {
                            continue;
                        }
                    }
                    catch (O_ o_3) {
                        throw r7.a(o_3);
                    }
                    r7.O(cArray, n6, n5, n4, hashSet);
                }
            }
        }
        zz[] zzArray = list.toArray(new zz[0]);
        for (DI dI : list2) {
            Object object;
            List<Dx> list4 = dI.O();
            object = list4.iterator();
            while (object.hasNext()) {
                Dx dx = (Dx)object.next();
                if (dx == null || dx.Y()) continue;
                try {
                    if (dx.v() == null) {
                        continue;
                    }
                }
                catch (O_ o_4) {
                    throw r7.a(o_4);
                }
                int n7 = dx.o();
                char[] cArray = dx.v();
                n4 = dI.c();
                n3 = dI.Q();
                int n8 = (int)sy.T(d2, 0.0, d4, (n4 << 4) + 8, 0.0, (n3 << 4) + 8);
                try {
                    if (n8 > n2) {
                        continue;
                    }
                }
                catch (O_ o_5) {
                    throw r7.a(o_5);
                }
                r7.I(cArray, n4, n7, n3, zzArray, arrayList, hashSet, bl2);
            }
        }
        return arrayList;
    }
}

