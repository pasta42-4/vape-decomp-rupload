/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.i5;
import com.collections.management.MultiContainerRegistry;
import com.system.extensions.ExtendedApiResolver;
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
extends ExtendedApiResolver {
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
            int n;
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
                        n = 2;
                        break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                n = 1;
            }
            arrayList2(n);
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
        long l = c ^ 0x439EC7E1325EL;
        this(ay.b(28808, 0x558F6F9556B6D031L ^ l), string);
        if (this.getClass() != ay.class) {
            throw new IllegalStateException();
        }
    }

    ay(List<Object> list) {
        long l = c ^ 0x49FFABBF99A7L;
        super(ay.b(19695, 0x5CA5E0000EE547AEL ^ l));
        this.D = list;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5055;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ay.j[n2] = n3;
        }
        return j[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = MultiContainerRegistry.a(1941744727268938416L, 1387766757096969412L, null).a(119412318051464L);
        k = new HashMap(13);
        long l = c ^ 0x2441EBD010E8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00bc\u001c5\u008f\u001f\u0015M\u0018,!\u00fc\u00b9v\b\u00ce\u008a";
        int n2 = "\u00bc\u001c5\u008f\u001f\u0015M\u0018,!\u00fc\u00b9v\b\u00ce\u008a".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
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
                                                int n;
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
                                                            n = 2;
                                                            break block25;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw ay.a(illegalStateException);
                                                        }
                                                    }
                                                    n = 1;
                                                }
                                                arrayList2(n);
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

    public ay(int n, String string) {
        super(n);
        this.Z = string;
    }

    @Override
    public ExtendedApiResolver d(String string) {
        block7: {
            int n;
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
                        n = 2;
                        break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                n = 1;
            }
            arrayList2(n);
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

    public void n(ExtendedApiResolver extendedApiResolver) {
        block3: {
            block4: {
                try {
                    if (extendedApiResolver == null) break block3;
                    if (this.D == null) break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ay.a(illegalStateException);
                }
                int n = this.D.size();
                for (int i = 0; i < n; i += 2) {
                    String string = (String)this.D.get(i);
                    Object object = this.D.get(i + 1);
                    ay.r(extendedApiResolver, string, object);
                }
            }
            extendedApiResolver.P();
        }
    }

    @Override
    public ExtendedApiResolver B(String string, String string2) {
        block7: {
            int n;
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
                        n = 2;
                        break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                }
                n = 1;
            }
            arrayList2(n);
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

    static void r(ExtendedApiResolver extendedApiResolver, String string, Object object) {
        block10: {
            block11: {
                try {
                    if (extendedApiResolver == null) break block10;
                    if (!(object instanceof String[])) break block11;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ay.a(illegalStateException);
                }
                String[] stringArray = (String[])object;
                extendedApiResolver.n(string, stringArray[0], stringArray[1]);
                break block10;
            }
            if (object instanceof ay) {
                ay ay2 = (ay)object;
                ay2.n(extendedApiResolver.B(string, ay2.Z));
            } else if (object instanceof List) {
                ExtendedApiResolver extendedApiResolver2 = extendedApiResolver.d(string);
                if (extendedApiResolver2 != null) {
                    List list = (List)object;
                    int n = list.size();
                    try {
                        for (int i = 0; i < n; ++i) {
                            ay.r(extendedApiResolver2, null, list.get(i));
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ay.a(illegalStateException);
                    }
                    extendedApiResolver2.P();
                }
            } else {
                extendedApiResolver.l(string, object);
            }
        }
    }
}

