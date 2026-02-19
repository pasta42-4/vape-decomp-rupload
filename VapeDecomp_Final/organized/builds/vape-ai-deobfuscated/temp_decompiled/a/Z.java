/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.WI;
import a.Yp;
import a._s;
import a.c4;
import a.d8;
import a.eq;
import a.s5;
import a.sB;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class z {
    private static final Integer[] d;
    eq O;
    String R;
    int b;
    private static final long a;
    private static final Map e;
    List<s5> T;
    String u;
    int[] B;
    int w;
    private static final long[] c;
    public static final int f;
    List<c4> N;
    int A;
    int z;
    String[] n;
    int U;
    List<Yp> m;

    public int c() {
        return this.z;
    }

    public z(DataInputStream dataInputStream) throws IOException {
        this.O(dataInputStream);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public List<c4> L() {
        return this.N;
    }

    public final void R(c4 c42) {
        this.N.add(c42);
    }

    public void D() {
        eq eq2 = this.Z();
        for (c4 object : this.N) {
            object.E(eq2);
        }
        for (Yp yp2 : this.m) {
            yp2.y(eq2);
        }
        this.T = s5.X(this.T, eq2);
        this.O = eq2;
    }

    public void b(c4 c42) throws WI {
        this.i(c42);
        this.N.add(c42);
    }

    public final void j(Yp yp2) {
        this.m.add(yp2);
    }

    public int o() {
        sB sB2 = (sB)this.V("InnerClasses");
        try {
            if (sB2 == null) {
                return -1;
            }
        }
        catch (O_ o_2) {
            throw a.z.a(o_2);
        }
        String string = this.Z();
        int n2 = sB2.H();
        int n3 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n3 >= n2) break;
                        if (!string.equals(sB2.r(n3))) break block8;
                    }
                    catch (O_ o_3) {
                        throw a.z.a(o_3);
                    }
                    return sB2.q(n3);
                }
                catch (O_ o_4) {
                    throw a.z.a(o_4);
                }
            }
            ++n3;
        }
        return -1;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = a.z.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public String Z() {
        return this.R;
    }

    public s5 V(String string) {
        for (s5 s52 : this.T) {
            try {
                if (!s52.n().equals(string)) continue;
                return s52;
            }
            catch (O_ o_2) {
                throw a.z.a(o_2);
            }
        }
        return null;
    }

    private static boolean K(c4 c42) {
        boolean bl2;
        try {
            bl2 = (c42.Z() & 0x40) == 0;
        }
        catch (O_ o_2) {
            throw a.z.a(o_2);
        }
        return bl2;
    }

    public int k() {
        return this.w;
    }

    public c4 g(String string) {
        for (c4 c42 : this.N) {
            try {
                if (!c42.C().equals(string)) continue;
                return c42;
            }
            catch (O_ o_2) {
                throw a.z.a(o_2);
            }
        }
        return null;
    }

    public void t() {
        s5 s52;
        s5 s53;
        eq eq2 = this.Z();
        ArrayList<s5> arrayList = new ArrayList<s5>();
        s5 s54 = this.V("RuntimeInvisibleAnnotations");
        if (s54 != null) {
            s54 = s54.O(eq2, null);
            arrayList.add(s54);
        }
        if ((s53 = this.V("RuntimeVisibleAnnotations")) != null) {
            s53 = s53.O(eq2, null);
            arrayList.add(s53);
        }
        if ((s52 = this.V("Signature")) != null) {
            s52 = s52.O(eq2, null);
            arrayList.add(s52);
        }
        for (c4 object : this.N) {
            object.Q(eq2);
        }
        for (Yp yp2 : this.m) {
            yp2.T(eq2);
        }
        this.T = arrayList;
        this.O = eq2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public List<Yp> j() {
        return this.m;
    }

    private eq Z() {
        eq eq2 = new eq(this.R);
        this.b = eq2.I();
        String string = this.r();
        try {
            if (string != null) {
                this.A = eq2.l(this.r());
            }
        }
        catch (O_ o_2) {
            throw a.z.a(o_2);
        }
        if (this.B != null) {
            try {
                for (int i10 = 0; i10 < this.B.length; ++i10) {
                    this.B[i10] = eq2.l(this.O.u(this.B[i10]));
                }
            }
            catch (O_ o_3) {
                throw a.z.a(o_3);
            }
        }
        return eq2;
    }

    public String r() {
        try {
            if (this.u == null) {
                this.u = this.O.u(this.A);
            }
        }
        catch (O_ o_2) {
            throw a.z.a(o_2);
        }
        return this.u;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        a = d8.a(128749653886211946L, 7139475619056635365L, MethodHandles.lookup().lookupClass()).a(107284575139718L);
        e = new HashMap(13);
        long l10 = a ^ 0xEF608EC60F4L;
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
        String string = "\u00de\u0001\r\u00d9\u007fn\u00bf\u00f0B\u00b1\u00a8\u00e7N8\u0081\u0098";
        int n3 = "\u00de\u0001\r\u00d9\u007fn\u00bf\u00f0B\u00b1\u00a8\u00e7N8\u0081\u0098".length();
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
        int n6 = 47;
        try {
            Class.forName("java.lang.StringBuilder");
            n6 = 49;
            Class.forName("java.util.zip.DeflaterInputStream");
            n6 = 50;
            Class.forName("java.lang.invoke.CallSite", false, ClassLoader.getSystemClassLoader());
            n6 = 51;
            Class.forName("java.util.function.Function");
            n6 = 52;
            Class.forName("java.lang.Module");
            n6 = 53;
            List.class.getMethod("copyOf", Collection.class);
            n6 = 54;
            Class.forName("java.util.Optional").getMethod("isEmpty", new Class[0]);
            n6 = 55;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        f = n6;
    }

    public void e(DataOutputStream dataOutputStream) throws IOException {
        int n2;
        long l10 = a ^ 0x7C25F8910A0AL;
        dataOutputStream.writeInt((int)a.z.a("s", (int)24131, (long)(0x5100AB29DADAC7AEL ^ l10)));
        dataOutputStream.writeShort(this.U);
        dataOutputStream.writeShort(this.w);
        this.O.j(dataOutputStream);
        dataOutputStream.writeShort(this.z);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.A);
        int n3 = this.B == null ? 0 : this.B.length;
        dataOutputStream.writeShort(n3);
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                dataOutputStream.writeShort(this.B[n2]);
            }
        }
        catch (IOException iOException) {
            throw a.z.a(iOException);
        }
        n3 = this.m.size();
        dataOutputStream.writeShort(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            Yp yp2 = this.m.get(n2);
            yp2.W(dataOutputStream);
        }
        dataOutputStream.writeShort(this.N.size());
        for (c4 c42 : this.N) {
            c42.t(dataOutputStream);
        }
        dataOutputStream.writeShort(this.T.size());
        s5.E(this.T, dataOutputStream);
    }

    private void i(c4 c42) throws WI {
        String string = c42.C();
        String string2 = c42.b();
        ListIterator<c4> listIterator = this.N.listIterator(0);
        while (listIterator.hasNext()) {
            if (!a.z.B(c42, string, string2, listIterator.next(), listIterator)) continue;
            throw new WI("duplicate method: " + string + " in " + this.Z());
        }
    }

    private void O(DataInputStream dataInputStream) throws IOException {
        int n2;
        int n3;
        block18: {
            block17: {
                long l10 = a ^ 0x19045AE9C2D7L;
                int n4 = dataInputStream.readInt();
                try {
                    if (n4 != a.z.a("s", (int)26024, (long)(0x59FFD29564B7B499L ^ l10))) {
                        throw new IOException("bad magic number: " + Integer.toHexString(n4));
                    }
                }
                catch (IOException iOException) {
                    throw a.z.a(iOException);
                }
                this.U = dataInputStream.readUnsignedShort();
                this.w = dataInputStream.readUnsignedShort();
                this.O = new eq(dataInputStream);
                this.z = dataInputStream.readUnsignedShort();
                this.b = dataInputStream.readUnsignedShort();
                this.O.G(this.b);
                this.A = dataInputStream.readUnsignedShort();
                n3 = dataInputStream.readUnsignedShort();
                try {
                    if (n3 != 0) break block17;
                    this.B = null;
                    break block18;
                }
                catch (IOException iOException) {
                    throw a.z.a(iOException);
                }
            }
            this.B = new int[n3];
            try {
                for (n2 = 0; n2 < n3; ++n2) {
                    this.B[n2] = dataInputStream.readUnsignedShort();
                }
            }
            catch (IOException iOException) {
                throw a.z.a(iOException);
            }
        }
        eq eq2 = this.O;
        n3 = dataInputStream.readUnsignedShort();
        this.m = new ArrayList<Yp>();
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                this.j(new Yp(eq2, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw a.z.a(iOException);
        }
        n3 = dataInputStream.readUnsignedShort();
        this.N = new ArrayList<c4>();
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                this.R(new c4(eq2, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw a.z.a(iOException);
        }
        this.T = new ArrayList<s5>();
        n3 = dataInputStream.readUnsignedShort();
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                this.H(s5.R(eq2, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw a.z.a(iOException);
        }
        this.R = this.O.u(this.b);
    }

    public eq X() {
        return this.O;
    }

    public String[] v() {
        try {
            if (this.n != null) {
                return this.n;
            }
        }
        catch (O_ o_2) {
            throw a.z.a(o_2);
        }
        String[] stringArray = null;
        if (this.B == null) {
            stringArray = new String[]{};
        } else {
            String[] stringArray2 = new String[this.B.length];
            try {
                for (int i10 = 0; i10 < this.B.length; ++i10) {
                    stringArray2[i10] = this.O.u(this.B[i10]);
                }
            }
            catch (O_ o_3) {
                throw a.z.a(o_3);
            }
            stringArray = stringArray2;
        }
        this.n = stringArray;
        return stringArray;
    }

    public void H(s5 s52) {
        s5.e(this.T, s52.n());
        this.T.add(s52);
    }

    private static boolean B(c4 c42, String string, String string2, c4 c43, ListIterator<c4> listIterator) {
        block10: {
            block11: {
                try {
                    if (!c43.C().equals(string)) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw a.z.a(o_2);
                }
                String string3 = c43.b();
                try {
                    if (!_s.t(string3, string2)) {
                        return false;
                    }
                }
                catch (O_ o_3) {
                    throw a.z.a(o_3);
                }
                try {
                    try {
                        if (!string3.equals(string2)) break block10;
                        if (!a.z.K(c43)) break block11;
                    }
                    catch (O_ o_4) {
                        throw a.z.a(o_4);
                    }
                    return true;
                }
                catch (O_ o_5) {
                    throw a.z.a(o_5);
                }
            }
            listIterator.remove();
            return false;
        }
        return false;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x329;
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
                throw new RuntimeException("a/z", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            a.z.d[n3] = n4;
        }
        return d[n3];
    }

    public c4 c() {
        return this.g("<clinit>");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

