/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.exception.system.CustomSystemException;
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
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>(blArray.length);
        for (boolean bl : blArray) {
            arrayList.add(bl);
        }
        return arrayList;
    }

    static List<Double> n(double[] dArray) {
        try {
            if (dArray == null) {
                return new ArrayList<Double>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
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
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Long> arrayList = new ArrayList<Long>(lArray.length);
        for (long l : lArray) {
            arrayList.add(l);
        }
        return arrayList;
    }

    static List<Byte> t(byte[] byArray) {
        try {
            if (byArray == null) {
                return new ArrayList<Byte>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Byte> arrayList = new ArrayList<Byte>(byArray.length);
        for (byte by : byArray) {
            arrayList.add(by);
        }
        return arrayList;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static List<Integer> N(int[] nArray) {
        try {
            if (nArray == null) {
                return new ArrayList<Integer>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(nArray.length);
        for (int n : nArray) {
            arrayList.add(n);
        }
        return arrayList;
    }

    static <T> List<T> Y(T[] TArray) {
        try {
            if (TArray == null) {
                return new ArrayList();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<T> arrayList = new ArrayList<T>(TArray.length);
        for (T t : TArray) {
            arrayList.add(t);
        }
        return arrayList;
    }

    static <T> List<T> i(List<T> arrayList, T t) {
        ArrayList<T> arrayList2;
        try {
            arrayList2 = arrayList == null ? new ArrayList<T>(1) : arrayList;
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<T> arrayList3 = arrayList2;
        arrayList3.add(t);
        return arrayList3;
    }

    static <T> List<T> T(int n) {
        ArrayList<Object> arrayList = new ArrayList<Object>(n);
        try {
            for (int i = 0; i < n; ++i) {
                arrayList.add(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        return arrayList;
    }

    static List<Short> S(short[] sArray) {
        try {
            if (sArray == null) {
                return new ArrayList<Short>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Short> arrayList = new ArrayList<Short>(sArray.length);
        for (short s2 : sArray) {
            arrayList.add(s2);
        }
        return arrayList;
    }

    static List<Float> A(float[] fArray) {
        try {
            if (fArray == null) {
                return new ArrayList<Float>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Float> arrayList = new ArrayList<Float>(fArray.length);
        for (float f : fArray) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    static <T> List<T> L(int n, T[] TArray) {
        ArrayList<T> arrayList = new ArrayList<T>(n);
        try {
            for (int i = 0; i < n; ++i) {
                arrayList.add(TArray[i]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        return arrayList;
    }

    static List<Character> A(char[] cArray) {
        try {
            if (cArray == null) {
                return new ArrayList<Character>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw i5.a(customSystemException);
        }
        ArrayList<Character> arrayList = new ArrayList<Character>(cArray.length);
        for (char c : cArray) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }
}

