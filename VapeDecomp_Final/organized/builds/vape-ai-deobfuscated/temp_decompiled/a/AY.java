/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.aa;
import a.d8;
import a.i5;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class ay
extends aa {
    private static final Map k;
    private static final Integer[] j;
    private static final long[] i;
    public String Z;
    public List<Object> D;
    private static final long c;

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    @Override
    public void P() {
    }

    @Override
    public void n(String string, String string2, String string3) {
        block7: {
            int n2;
            ArrayList<Object> arrayList;
            ArrayList<Object> arrayList2;
            block9: {
                block8: {
                    try {
                        try {
                            ArrayList<Object> arrayList3;
                            if (this.D != null) break block7;
                            ay ay2 = this;
                            arrayList2 = arrayList3;
                            arrayList = arrayList3;
                            if (this.Z == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw ay.a(illegalStateException);
                        }
                        n2 = 2;
                        break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                n2 = 1;
            }
            arrayList2(n2);
            ay2.D = arrayList;
        }
        try {
            if (this.Z != null) {
                this.D.add(string);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ay.a(illegalStateException);
        }
        this.D.add(new String[]{string2, string3});
    }

    public ay(String string) {
        long l10 = c ^ 0x439EC7E1325EL;
        this(ay.b(28808, 0x558F6F9556B6D031L ^ l10), string);
        if (this.getClass() != ay.class) {
            throw new IllegalStateException();
        }
    }

    ay(List<Object> list) {
        long l10 = c ^ 0x49FFABBF99A7L;
        super(ay.b(19695, 0x5CA5E0000EE547AEL ^ l10));
        this.D = list;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5055;
        if (j[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n3];
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
                throw new RuntimeException("a/ay", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ay.j[n3] = n4;
        }
        return j[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = d8.a(1941744727268938416L, 1387766757096969412L, null).a(119412318051464L);
        k = new HashMap(13);
        long l10 = c ^ 0x2441EBD010E8L;
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
        String string = "\u00bc\u001c5\u008f\u001f\u0015M\u0018,!\u00fc\u00b9v\b\u00ce\u008a";
        int n3 = "\u00bc\u001c5\u008f\u001f\u0015M\u0018,!\u00fc\u00b9v\b\u00ce\u008a".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        i = lArray;
        j = new Integer[2];
    }

    @Override
    public void l(String string, Object object) {
        block27: {
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    block28: {
                                        block26: {
                                            block23: {
                                                int n2;
                                                ArrayList<Object> arrayList;
                                                ArrayList<Object> arrayList2;
                                                block25: {
                                                    block24: {
                                                        try {
                                                            try {
                                                                ArrayList<Object> arrayList3;
                                                                if (this.D != null) break block23;
                                                                ay ay2 = this;
                                                                arrayList2 = arrayList3;
                                                                arrayList = arrayList3;
                                                                if (this.Z == null) break block24;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw ay.a(illegalStateException);
                                                            }
                                                            n2 = 2;
                                                            break block25;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw ay.a(illegalStateException);
                                                        }
                                                    }
                                                    n2 = 1;
                                                }
                                                arrayList2(n2);
                                                ay2.D = arrayList;
                                            }
                                            try {
                                                if (this.Z != null) {
                                                    this.D.add(string);
                                                }
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw ay.a(illegalStateException);
                                            }
                                            try {
                                                if (!(object instanceof byte[])) break block26;
                                                this.D.add(i5.t((byte[])object));
                                                break block27;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw ay.a(illegalStateException);
                                            }
                                        }
                                        try {
                                            if (!(object instanceof boolean[])) break block28;
                                            this.D.add(i5.V((boolean[])object));
                                            break block27;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw ay.a(illegalStateException);
                                        }
                                    }
                                    try {
                                        if (!(object instanceof short[])) break block29;
                                        this.D.add(i5.S((short[])object));
                                        break block27;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw ay.a(illegalStateException);
                                    }
                                }
                                try {
                                    if (!(object instanceof char[])) break block30;
                                    this.D.add(i5.A((char[])object));
                                    break block27;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw ay.a(illegalStateException);
                                }
                            }
                            try {
                                if (!(object instanceof int[])) break block31;
                                this.D.add(i5.N((int[])object));
                                break block27;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw ay.a(illegalStateException);
                            }
                        }
                        try {
                            if (!(object instanceof long[])) break block32;
                            this.D.add(i5.u((long[])object));
                            break block27;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw ay.a(illegalStateException);
                        }
                    }
                    try {
                        if (!(object instanceof float[])) break block33;
                        this.D.add(i5.A((float[])object));
                        break block27;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                try {
                    if (!(object instanceof double[])) break block34;
                    this.D.add(i5.n((double[])object));
                    break block27;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ay.a(illegalStateException);
                }
            }
            this.D.add(object);
        }
    }

    public ay(int n2, String string) {
        super(n2);
        this.Z = string;
    }

    @Override
    public aa d(String string) {
        block7: {
            int n2;
            ArrayList<Object> arrayList;
            ArrayList<Object> arrayList2;
            block9: {
                block8: {
                    try {
                        try {
                            ArrayList<Object> arrayList3;
                            if (this.D != null) break block7;
                            ay ay2 = this;
                            arrayList2 = arrayList3;
                            arrayList = arrayList3;
                            if (this.Z == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw ay.a(illegalStateException);
                        }
                        n2 = 2;
                        break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                n2 = 1;
            }
            arrayList2(n2);
            ay2.D = arrayList;
        }
        try {
            if (this.Z != null) {
                this.D.add(string);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ay.a(illegalStateException);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        this.D.add(arrayList);
        return new ay(arrayList);
    }

    public void n(aa aa2) {
        block3: {
            block4: {
                try {
                    if (aa2 == null) break block3;
                    if (this.D == null) break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ay.a(illegalStateException);
                }
                int n2 = this.D.size();
                for (int i10 = 0; i10 < n2; i10 += 2) {
                    String string = (String)this.D.get(i10);
                    Object object = this.D.get(i10 + 1);
                    ay.r(aa2, string, object);
                }
            }
            aa2.P();
        }
    }

    @Override
    public aa B(String string, String string2) {
        block7: {
            int n2;
            ArrayList<Object> arrayList;
            ArrayList<Object> arrayList2;
            block9: {
                block8: {
                    try {
                        try {
                            ArrayList<Object> arrayList3;
                            if (this.D != null) break block7;
                            ay ay2 = this;
                            arrayList2 = arrayList3;
                            arrayList = arrayList3;
                            if (this.Z == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw ay.a(illegalStateException);
                        }
                        n2 = 2;
                        break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                n2 = 1;
            }
            arrayList2(n2);
            ay2.D = arrayList;
        }
        try {
            if (this.Z != null) {
                this.D.add(string);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ay.a(illegalStateException);
        }
        ay ay3 = new ay(string2);
        this.D.add(ay3);
        return ay3;
    }

    static void r(aa aa2, String string, Object object) {
        block10: {
            block11: {
                try {
                    if (aa2 == null) break block10;
                    if (!(object instanceof String[])) break block11;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ay.a(illegalStateException);
                }
                String[] stringArray = (String[])object;
                aa2.n(string, stringArray[0], stringArray[1]);
                break block10;
            }
            if (object instanceof ay) {
                ay ay2 = (ay)object;
                ay2.n(aa2.B(string, ay2.Z));
            } else if (object instanceof List) {
                aa aa3 = aa2.d(string);
                if (aa3 != null) {
                    List list = (List)object;
                    int n2 = list.size();
                    try {
                        for (int i10 = 0; i10 < n2; ++i10) {
                            ay.r(aa3, null, list.get(i10));
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                    aa3.P();
                }
            } else {
                aa2.l(string, object);
            }
        }
    }
}

