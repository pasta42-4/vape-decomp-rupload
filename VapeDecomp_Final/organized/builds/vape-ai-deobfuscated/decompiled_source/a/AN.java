/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.aX;
import a.zY;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.exception.system.CustomSystemException;
import com.security.crypto.EncryptionContextInitializer;
import com.security.error.DecryptionErrorHandler;
import com.system.extensions.ExtendedApiResolver;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class aN
extends ExtendedApiResolver {
    private final aN G;
    private final boolean d;
    private aN D;
    private int k;
    private final EncodingUtilityManager z;
    private final int P;
    private static final long b = MultiContainerRegistry.a(-1202487061144070624L, -1013862557661356835L, null).a(38941529556745L);
    private static final long c;
    private final aX O;

    public void n(String string, String string2, String string3) {
        try {
            ++this.k;
            if (this.d) {
                this.z.f(this.O.j(string));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        this.z.I(101, this.O.j(string2)).f(this.O.j(string3));
    }

    static int m(aN aN2, aN aN3, aN aN4, aN aN5) {
        int n = 0;
        if (aN2 != null) {
            n += aN2.M("RuntimeVisibleAnnotations");
        }
        if (aN3 != null) {
            n += aN3.M("RuntimeInvisibleAnnotations");
        }
        if (aN4 != null) {
            n += aN4.M("RuntimeVisibleTypeAnnotations");
        }
        if (aN5 != null) {
            n += aN5.M("RuntimeInvisibleTypeAnnotations");
        }
        return n;
    }

    static void i(int n, aN[] aNArray, int n2, EncodingUtilityManager encodingUtilityManager) {
        aN aN2;
        int n3;
        int n4 = 1 + 2 * n2;
        for (n3 = 0; n3 < n2; ++n3) {
            int n5;
            int n6;
            aN2 = aNArray[n3];
            try {
                n6 = n4;
                n5 = aN2 == null ? 0 : aN2.M(null) - 8;
            }
            catch (CustomSystemException customSystemException) {
                throw aN.a(customSystemException);
            }
            n4 = n6 + n5;
        }
        encodingUtilityManager.f(n);
        encodingUtilityManager.y(n4);
        encodingUtilityManager.Z(n2);
        for (n3 = 0; n3 < n2; ++n3) {
            aN2 = aNArray[n3];
            aN aN3 = null;
            int n7 = 0;
            while (aN2 != null) {
                aN2.P();
                ++n7;
                aN3 = aN2;
                aN2 = aN2.G;
            }
            encodingUtilityManager.f(n7);
            aN2 = aN3;
            while (aN2 != null) {
                encodingUtilityManager.T(aN2.z.U, 0, aN2.z.I);
                aN2 = aN2.D;
            }
        }
    }

    public void P() {
        if (this.P != -1) {
            byte[] byArray = this.z.U;
            byArray[this.P] = (byte)(this.k >>> 8);
            byArray[this.P + 1] = (byte)this.k;
        }
    }

    static void r(aX aX2, aN aN2, aN aN3, aN aN4, aN aN5, EncodingUtilityManager encodingUtilityManager) {
        try {
            if (aN2 != null) {
                aN2.r(aX2.j("RuntimeVisibleAnnotations"), encodingUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        try {
            if (aN3 != null) {
                aN3.r(aX2.j("RuntimeInvisibleAnnotations"), encodingUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        try {
            if (aN4 != null) {
                aN4.r(aX2.j("RuntimeVisibleTypeAnnotations"), encodingUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        try {
            if (aN5 != null) {
                aN5.r(aX2.j("RuntimeInvisibleTypeAnnotations"), encodingUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x42D40BFF383AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -5394917849245361704L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    static aN h(aX aX2, int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, aN aN2) {
        EncodingUtilityManager encodingUtilityManager = new EncodingUtilityManager();
        DecryptionErrorHandler.V(n, encodingUtilityManager);
        ErrorDiagnosticTracker.X(errorDiagnosticTracker, encodingUtilityManager);
        encodingUtilityManager.f(aX2.j(string)).f(0);
        return new aN(aX2, true, encodingUtilityManager, aN2);
    }

    public void l(String string, Object object) {
        block44: {
            block51: {
                block50: {
                    block49: {
                        block46: {
                            int n;
                            block48: {
                                block47: {
                                    block45: {
                                        block43: {
                                            try {
                                                ++this.k;
                                                if (this.d) {
                                                    this.z.f(this.O.j(string));
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw aN.a(customSystemException);
                                            }
                                            try {
                                                if (!(object instanceof String)) break block43;
                                                this.z.I(115, this.O.j((String)object));
                                                break block44;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw aN.a(customSystemException);
                                            }
                                        }
                                        try {
                                            if (!(object instanceof Byte)) break block45;
                                            this.z.I(66, this.O.A((int)((Byte)object).byteValue()).Z);
                                            break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw aN.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!(object instanceof Boolean)) break block46;
                                            if (!((Boolean)object).booleanValue()) break block47;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw aN.a(customSystemException);
                                        }
                                        n = 1;
                                        break block48;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw aN.a(customSystemException);
                                    }
                                }
                                n = 0;
                            }
                            int n2 = n;
                            this.z.I(90, this.O.A((int)n2).Z);
                            break block44;
                        }
                        try {
                            if (!(object instanceof Character)) break block49;
                            this.z.I(67, this.O.A((int)((Character)object).charValue()).Z);
                            break block44;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw aN.a(customSystemException);
                        }
                    }
                    try {
                        if (!(object instanceof Short)) break block50;
                        this.z.I(83, this.O.A((int)((Short)object).shortValue()).Z);
                        break block44;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw aN.a(customSystemException);
                    }
                }
                try {
                    if (!(object instanceof zY)) break block51;
                    this.z.I(99, this.O.j(((zY)object).d()));
                    break block44;
                }
                catch (CustomSystemException customSystemException) {
                    throw aN.a(customSystemException);
                }
            }
            if (object instanceof byte[]) {
                byte[] byArray = (byte[])object;
                this.z.I(91, byArray.length);
                for (byte by : byArray) {
                    this.z.I(66, this.O.A((int)by).Z);
                }
            } else if (object instanceof boolean[]) {
                boolean[] blArray = (boolean[])object;
                this.z.I(91, blArray.length);
                for (boolean bl : blArray) {
                    int n;
                    aX aX2;
                    int n3;
                    EncodingUtilityManager encodingUtilityManager;
                    try {
                        encodingUtilityManager = this.z;
                        n3 = 90;
                        aX2 = this.O;
                        n = bl ? 1 : 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw aN.a(customSystemException);
                    }
                    encodingUtilityManager.I(n3, aX2.A((int)n).Z);
                }
            } else if (object instanceof short[]) {
                short[] sArray = (short[])object;
                this.z.I(91, sArray.length);
                for (short s2 : sArray) {
                    this.z.I(83, this.O.A((int)s2).Z);
                }
            } else if (object instanceof char[]) {
                char[] cArray = (char[])object;
                this.z.I(91, cArray.length);
                for (char c : cArray) {
                    this.z.I(67, this.O.A((int)c).Z);
                }
            } else if (object instanceof int[]) {
                int[] nArray = (int[])object;
                this.z.I(91, nArray.length);
                for (int n : nArray) {
                    this.z.I(73, this.O.A((int)n).Z);
                }
            } else if (object instanceof long[]) {
                long[] lArray = (long[])object;
                this.z.I(91, lArray.length);
                for (long l : lArray) {
                    this.z.I(74, this.O.I((long)l).Z);
                }
            } else if (object instanceof float[]) {
                float[] fArray = (float[])object;
                this.z.I(91, fArray.length);
                for (float f : fArray) {
                    this.z.I(70, this.O.X((float)f).Z);
                }
            } else if (object instanceof double[]) {
                double[] dArray = (double[])object;
                this.z.I(91, dArray.length);
                for (double d2 : dArray) {
                    this.z.I(68, this.O.e((double)d2).Z);
                }
            } else {
                EncryptionContextInitializer encryptionContextInitializer = this.O.P(object);
                this.z.I(".s.IFJDCS".charAt(encryptionContextInitializer.c), encryptionContextInitializer.Z);
            }
        }
    }

    void r(int n, EncodingUtilityManager encodingUtilityManager) {
        int n2 = 2;
        int n3 = 0;
        aN aN2 = this;
        aN aN3 = null;
        while (aN2 != null) {
            aN2.P();
            n2 += aN2.z.I;
            ++n3;
            aN3 = aN2;
            aN2 = aN2.G;
        }
        encodingUtilityManager.f(n);
        encodingUtilityManager.y(n2);
        encodingUtilityManager.f(n3);
        aN2 = aN3;
        while (aN2 != null) {
            encodingUtilityManager.T(aN2.z.U, 0, aN2.z.I);
            aN2 = aN2.D;
        }
    }

    aN(aX aX2, boolean bl, EncodingUtilityManager encodingUtilityManager, aN aN2) {
        long l = b ^ 0x2FBAD71FB102L;
        super((int)c);
        this.O = aX2;
        this.d = bl;
        this.z = encodingUtilityManager;
        try {
            this.P = encodingUtilityManager.I == 0 ? -1 : encodingUtilityManager.I - 2;
            this.G = aN2;
            if (aN2 != null) {
                aN2.D = this;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
    }

    int M(String string) {
        try {
            if (string != null) {
                this.O.j(string);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        int n = 8;
        aN aN2 = this;
        while (aN2 != null) {
            n += aN2.z.I;
            aN2 = aN2.G;
        }
        return n;
    }

    static aN H(aX aX2, String string, aN aN2) {
        EncodingUtilityManager encodingUtilityManager = new EncodingUtilityManager();
        encodingUtilityManager.f(aX2.j(string)).f(0);
        return new aN(aX2, true, encodingUtilityManager, aN2);
    }

    public ExtendedApiResolver B(String string, String string2) {
        try {
            ++this.k;
            if (this.d) {
                this.z.f(this.O.j(string));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        this.z.I(64, this.O.j(string2)).f(0);
        return new aN(this.O, true, this.z, null);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static int P(String string, aN[] aNArray, int n) {
        int n2 = 7 + 2 * n;
        for (int i = 0; i < n; ++i) {
            int n3;
            int n4;
            aN aN2 = aNArray[i];
            try {
                n4 = n2;
                n3 = aN2 == null ? 0 : aN2.M(string) - 8;
            }
            catch (CustomSystemException customSystemException) {
                throw aN.a(customSystemException);
            }
            n2 = n4 + n3;
        }
        return n2;
    }

    public ExtendedApiResolver d(String string) {
        try {
            ++this.k;
            if (this.d) {
                this.z.f(this.O.j(string));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw aN.a(customSystemException);
        }
        this.z.I(91, 0);
        return new aN(this.O, false, this.z, null);
    }
}

