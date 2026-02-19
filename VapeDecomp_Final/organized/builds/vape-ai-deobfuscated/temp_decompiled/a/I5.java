/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import java.util.ArrayList;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
final class i5 {
    static List<Boolean> V(boolean[] blArray) {
        try {
            if (blArray == null) {
                return new ArrayList<Boolean>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>(blArray.length);
        for (boolean bl2 : blArray) {
            arrayList.add(bl2);
        }
        return arrayList;
    }

    static List<Double> n(double[] dArray) {
        try {
            if (dArray == null) {
                return new ArrayList<Double>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Double> arrayList = new ArrayList<Double>(dArray.length);
        for (double d2 : dArray) {
            arrayList.add(d2);
        }
        return arrayList;
    }

    static List<Long> u(long[] lArray) {
        try {
            if (lArray == null) {
                return new ArrayList<Long>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Long> arrayList = new ArrayList<Long>(lArray.length);
        for (long l10 : lArray) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    static List<Byte> t(byte[] byArray) {
        try {
            if (byArray == null) {
                return new ArrayList<Byte>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Byte> arrayList = new ArrayList<Byte>(byArray.length);
        for (byte by2 : byArray) {
            arrayList.add(by2);
        }
        return arrayList;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    static List<Integer> N(int[] nArray) {
        try {
            if (nArray == null) {
                return new ArrayList<Integer>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(nArray.length);
        for (int n2 : nArray) {
            arrayList.add(n2);
        }
        return arrayList;
    }

    static <T> List<T> Y(T[] TArray) {
        try {
            if (TArray == null) {
                return new ArrayList();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<T> arrayList = new ArrayList<T>(TArray.length);
        for (T t10 : TArray) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    static <T> List<T> i(List<T> arrayList, T t10) {
        ArrayList<T> arrayList2;
        try {
            arrayList2 = arrayList == null ? new ArrayList<T>(1) : arrayList;
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<T> arrayList3 = arrayList2;
        arrayList3.add(t10);
        return arrayList3;
    }

    static <T> List<T> T(int n2) {
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                arrayList.add(null);
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        return arrayList;
    }

    static List<Short> S(short[] sArray) {
        try {
            if (sArray == null) {
                return new ArrayList<Short>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Short> arrayList = new ArrayList<Short>(sArray.length);
        for (short s10 : sArray) {
            arrayList.add(s10);
        }
        return arrayList;
    }

    static List<Float> A(float[] fArray) {
        try {
            if (fArray == null) {
                return new ArrayList<Float>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Float> arrayList = new ArrayList<Float>(fArray.length);
        for (float f10 : fArray) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    static <T> List<T> L(int n2, T[] TArray) {
        ArrayList<T> arrayList = new ArrayList<T>(n2);
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                arrayList.add(TArray[i10]);
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        return arrayList;
    }

    static List<Character> A(char[] cArray) {
        try {
            if (cArray == null) {
                return new ArrayList<Character>();
            }
        }
        catch (O_ o_2) {
            throw i5.a(o_2);
        }
        ArrayList<Character> arrayList = new ArrayList<Character>(cArray.length);
        for (char c10 : cArray) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }
}

