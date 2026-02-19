/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.NM;
import a.zY;
import com.app.configuration.ConfigurationDescriptor1455;
import com.app.models.EntityDescriptor;
import com.collections.management.MultiContainerRegistry;
import com.crypto.utils.CipherEncryptionUtility;
import com.metadata.analysis.MetadataExtractor;
import com.security.crypto.EncryptionContextInitializer;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class aX {
    private NM[] b;
    private static final Integer[] d;
    private static final long[] c;
    private final CipherEncryptionUtility j;
    private int n;
    private static final Map f;
    private int o;
    private int W;
    private String g;
    private EncodingUtilityManager S;
    private EncodingUtilityManager O;
    private int p;
    private NM[] z;
    private static final long a;
    final MetadataExtractor M;
    private int e;

    EncryptionContextInitializer b(String string) {
        return this.d(20, string);
    }

    EncryptionContextInitializer X(float f) {
        return this.R(4, Float.floatToRawIntBits(f));
    }

    EncryptionContextInitializer S(String string) {
        return this.d(8, string);
    }

    private int w(NM nM) {
        try {
            if (this.z == null) {
                this.z = new NM[16];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        if (this.n == this.z.length) {
            NM[] nMArray = new NM[2 * this.z.length];
            System.arraycopy(this.z, 0, nMArray, 0, this.z.length);
            this.z = nMArray;
        }
        this.z[this.n++] = nM;
        return this.H((NM)nM).Z;
    }

    private NM E(int n, String string, String string2, String string3) {
        int n2 = aX.Y(n, string, string2, string3);
        NM nM = this.f(n2);
        while (true) {
            block13: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (nM == null) break;
                                        if (nM.c != n) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw aX.a(illegalArgumentException);
                                    }
                                    if (nM.O != n2) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw aX.a(illegalArgumentException);
                                }
                                if (!nM.k.equals(string)) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (!nM.V.equals(string2)) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string3)) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        this.O.K(n, this.c((String)string).Z, this.s(string2, string3));
        return this.H(new NM(this.e++, n, string, string2, string3, 0L, n2));
    }

    private void d(int n, int n2, String string, String string2, int n3) {
        int n4 = aX.J(n, string, string2, n3);
        this.I(new NM(n2, n, null, string, string2, n3, n4));
    }

    EncryptionContextInitializer c(String string) {
        return this.d(7, string);
    }

    private void x(int n, int n2, String string) {
        this.I(new NM(n, n2, string, aX.z(n2, string)));
    }

    EncryptionContextInitializer A(ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        int n;
        int n2;
        long l = a ^ 0x453A2BB9A7B8L;
        EncodingUtilityManager encodingUtilityManager = this.S;
        if (encodingUtilityManager == null) {
            encodingUtilityManager = this.S = new EncodingUtilityManager();
        }
        int n3 = objectArray.length;
        int[] nArray = new int[n3];
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                nArray[n2] = this.P((Object)objectArray[n2]).Z;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        n2 = encodingUtilityManager.I;
        encodingUtilityManager.f(this.b((int)configurationDescriptor1455.K(), (String)configurationDescriptor1455.D(), (String)configurationDescriptor1455.Q(), (String)configurationDescriptor1455.i(), (boolean)configurationDescriptor1455.g()).Z);
        encodingUtilityManager.f(n3);
        try {
            for (n = 0; n < n3; ++n) {
                encodingUtilityManager.f(nArray[n]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        n = encodingUtilityManager.I - n2;
        int n4 = configurationDescriptor1455.hashCode();
        for (Object object : objectArray) {
            n4 ^= object.hashCode();
        }
        return this.Z(n2, n, n4 &= aX.a(24592, 0x1DD38157C6428E1CL ^ l));
    }

    private void X(int n, int n2, int n3) {
        this.I(new NM(n, n2, n3, aX.O(n2, n3)));
    }

    private void p(CipherEncryptionUtility cipherEncryptionUtility, char[] cArray) {
        int n;
        long l = a ^ 0x708D070A57DDL;
        byte[] byArray = cipherEncryptionUtility.I;
        int n2 = cipherEncryptionUtility.j();
        for (n = cipherEncryptionUtility.d(n2 - 2); n > 0; --n) {
            String string = cipherEncryptionUtility.R(n2, cArray);
            try {
                if ("BootstrapMethods".equals(string)) {
                    this.o = cipherEncryptionUtility.d(n2 + 6);
                    break;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw aX.a(illegalArgumentException);
            }
            n2 += 6 + cipherEncryptionUtility.D(n2 + 2);
        }
        if (this.o > 0) {
            n = n2 + 8;
            int n3 = cipherEncryptionUtility.D(n2 + 2) - 2;
            this.S = new EncodingUtilityManager(n3);
            this.S.T(byArray, n, n3);
            int n4 = n;
            for (int i = 0; i < this.o; ++i) {
                int n5 = n4 - n;
                int n6 = cipherEncryptionUtility.d(n4);
                int n7 = cipherEncryptionUtility.d(n4 += 2);
                n4 += 2;
                int n8 = cipherEncryptionUtility.D(n6, cArray).hashCode();
                while (n7-- > 0) {
                    int n9 = cipherEncryptionUtility.d(n4);
                    n4 += 2;
                    n8 ^= cipherEncryptionUtility.D(n9, cArray).hashCode();
                }
                this.I(new NM(i, 64, n5, n8 & aX.a(24592, 0x1DD3B4E0EAF17E79L ^ l)));
            }
        }
    }

    int n() {
        return this.O.I;
    }

    EncryptionContextInitializer e(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        EncryptionContextInitializer encryptionContextInitializer = this.A(configurationDescriptor1455, objectArray);
        return this.h(18, string, string2, encryptionContextInitializer.Z);
    }

    CipherEncryptionUtility n() {
        return this.j;
    }

    private static int z(int n, String string) {
        long l = a ^ 0x3D24B7C9BDF3L;
        return aX.a(24592, 0x1DD3F9495A329457L ^ l) & n + string.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-5167424484840417100L, -7704842778026075567L, null).a(159047298957260L);
        f = new HashMap(13);
        long l = a ^ 0x5CE948D13225L;
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
        String string = "\u00ea\u0018\u00d2(\u0019\u00d9M\u00bd\u001d'\u00e2\u00f1\u00c1\u008b\u00d9x";
        int n2 = "\u00ea\u0018\u00d2(\u0019\u00d9M\u00bd\u001d'\u00e2\u00f1\u00c1\u008b\u00d9x".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
    }

    private EncryptionContextInitializer c(int n, long l) {
        int n2 = aX.U(n, l);
        NM nM = this.f(n2);
        while (true) {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (nM == null) break;
                                if (nM.c != n) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.O != n2) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (nM.g != l) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        int n3 = this.e;
        this.O.Z(n).T(l);
        this.e += 2;
        return this.H(new NM(n3, n, l, n2));
    }

    EncryptionContextInitializer M(String string) {
        return this.d(16, string);
    }

    int V(String string, int n) {
        int n2 = aX.B(129, string, n);
        NM nM = this.f(n2);
        while (true) {
            block11: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (nM == null) break;
                                    if (nM.c != 129) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw aX.a(illegalArgumentException);
                                }
                                if (nM.O != n2) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.g != (long)n) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string)) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM.Z;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        return this.w(new NM(this.n, 129, string, n, n2));
    }

    private void v(int n, String string) {
        this.I(new NM(n, 1, string, aX.z(1, string)));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    String B() {
        return this.g;
    }

    private EncryptionContextInitializer R(int n, int n2) {
        int n3 = aX.O(n, n2);
        NM nM = this.f(n3);
        while (true) {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (nM == null) break;
                                if (nM.c != n) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.O != n3) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (nM.g != (long)n2) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        this.O.Z(n).y(n2);
        return this.H(new NM(this.e++, n, n2, n3));
    }

    private static int U(int n, long l) {
        long l2 = a ^ 0x757F256C2CA6L;
        return aX.a(24592, 0x1DD3B112C8970502L ^ l2) & n + (int)l + (int)(l >>> 32);
    }

    private void E(int n, int n2, long l) {
        this.I(new NM(n, n2, l, aX.U(n2, l)));
    }

    private void I(NM nM) {
        ++this.p;
        int n = nM.O % this.b.length;
        nM.A = this.b[n];
        this.b[n] = nM;
    }

    EncryptionContextInitializer P(Object object) {
        block37: {
            int n;
            aX aX2;
            block39: {
                block38: {
                    try {
                        if (object instanceof Integer) {
                            return this.A((Integer)object);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    try {
                        if (object instanceof Byte) {
                            return this.A(((Byte)object).intValue());
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    try {
                        if (object instanceof Character) {
                            return this.A(((Character)object).charValue());
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    try {
                        if (object instanceof Short) {
                            return this.A(((Short)object).intValue());
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (!(object instanceof Boolean)) break block37;
                            aX2 = this;
                            if (!((Boolean)object).booleanValue()) break block38;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        n = 1;
                        break block39;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                }
                n = 0;
            }
            return aX2.A(n);
        }
        try {
            if (object instanceof Float) {
                return this.X(((Float)object).floatValue());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        try {
            if (object instanceof Long) {
                return this.I((Long)object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        try {
            if (object instanceof Double) {
                return this.e((Double)object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        try {
            if (object instanceof String) {
                return this.S((String)object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        if (object instanceof zY) {
            zY zY2 = (zY)object;
            int n = zY2.T();
            try {
                if (n == 10) {
                    return this.c(zY2.W());
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw aX.a(illegalArgumentException);
            }
            try {
                if (n == 11) {
                    return this.M(zY2.d());
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw aX.a(illegalArgumentException);
            }
            return this.c(zY2.d());
        }
        if (object instanceof ConfigurationDescriptor1455) {
            ConfigurationDescriptor1455 configurationDescriptor1455 = (ConfigurationDescriptor1455)object;
            return this.b(configurationDescriptor1455.K(), configurationDescriptor1455.D(), configurationDescriptor1455.Q(), configurationDescriptor1455.i(), configurationDescriptor1455.g());
        }
        if (object instanceof EntityDescriptor) {
            EntityDescriptor entityDescriptor = (EntityDescriptor)object;
            return this.j(entityDescriptor.G(), entityDescriptor.x(), entityDescriptor.u(), entityDescriptor.a());
        }
        throw new IllegalArgumentException("value " + object);
    }

    int H(int n, String string) {
        this.W = n;
        this.g = string;
        return this.c((String)string).Z;
    }

    int P(int n, int n2) {
        int n3;
        long l;
        try {
            l = n < n2 ? (long)n | (long)n2 << 32 : (long)n2 | (long)n << 32;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        long l2 = l;
        int n4 = aX.O(130, n + n2);
        NM nM = this.f(n4);
        while (true) {
            block11: {
                try {
                    try {
                        try {
                            try {
                                if (nM == null) break;
                                if (nM.c != 130) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.O != n4) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (nM.g != l2) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM.K;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        String string = this.z[n].i;
        String string2 = this.z[n2].i;
        this.H((NM)new NM((int)this.n, (int)130, (long)l2, (int)n4)).K = n3 = this.O(this.M.G(string, string2));
        return n3;
    }

    EncryptionContextInitializer V(String string, String string2, String string3, boolean bl) {
        int n;
        try {
            n = bl ? 11 : 10;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        int n2 = n;
        return this.E(n2, string, string2, string3);
    }

    private static int O(int n, int n2) {
        long l = a ^ 0x297B574E4DE9L;
        return aX.a(24592, 0x1DD3ED16BAB5644DL ^ l) & n + n2;
    }

    EncryptionContextInitializer j(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        EncryptionContextInitializer encryptionContextInitializer = this.A(configurationDescriptor1455, objectArray);
        return this.h(17, string, string2, encryptionContextInitializer.Z);
    }

    private EncryptionContextInitializer Z(int n, int n2, int n3) {
        byte[] byArray = this.S.U;
        NM nM = this.f(n3);
        while (true) {
            block11: {
                try {
                    try {
                        if (nM == null) break;
                        if (nM.c != 64) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    if (nM.O != n3) break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
                int n4 = (int)nM.g;
                boolean bl = true;
                int n5 = 0;
                while (true) {
                    block12: {
                        try {
                            if (n5 >= n2) break;
                            if (byArray[n + n5] == byArray[n4 + n5]) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        bl = false;
                        break;
                    }
                    ++n5;
                }
                try {
                    if (bl) {
                        this.S.I = n;
                        return nM;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        return this.H(new NM(this.o++, 64, n, n3));
    }

    EncryptionContextInitializer t(String string) {
        return this.d(19, string);
    }

    int j(String string) {
        int n = aX.z(1, string);
        NM nM = this.f(n);
        while (true) {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (nM == null) break;
                                if (nM.c != 1) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.O != n) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string)) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM.Z;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        this.O.Z(1).i(string);
        return this.H((NM)new NM((int)this.e++, (int)1, (String)string, (int)n)).Z;
    }

    aX(MetadataExtractor metadataExtractor) {
        this.M = metadataExtractor;
        this.j = null;
        this.b = new NM[256];
        this.e = 1;
        this.O = new EncodingUtilityManager();
    }

    void y(EncodingUtilityManager encodingUtilityManager) {
        try {
            if (this.S != null) {
                encodingUtilityManager.f(this.j("BootstrapMethods")).y(this.S.I + 2).f(this.o).T(this.S.U, 0, this.S.I);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
    }

    EncryptionContextInitializer S(int n) {
        return this.z[n];
    }

    private static int U(int n, String string, String string2) {
        long l = a ^ 0x27EE2970B39AL;
        return aX.a(24592, 0x1DD3E383C48B9A3EL ^ l) & n + string.hashCode() * string2.hashCode();
    }

    int L() {
        return this.e;
    }

    int s(String string, String string2) {
        int n = 12;
        int n2 = aX.U(12, string, string2);
        NM nM = this.f(n2);
        while (true) {
            block11: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (nM == null) break;
                                    if (nM.c != 12) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw aX.a(illegalArgumentException);
                                }
                                if (nM.O != n2) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (!nM.V.equals(string)) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string2)) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM.Z;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        this.O.K(12, this.j(string), this.j(string2));
        return this.H((NM)new NM((int)this.e++, (int)12, (String)string, (String)string2, (int)n2)).Z;
    }

    int O(String string) {
        int n = aX.z(128, string);
        NM nM = this.f(n);
        while (true) {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (nM == null) break;
                                if (nM.c != 128) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.O != n) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string)) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM.Z;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        return this.w(new NM(this.n, 128, string, n));
    }

    EncryptionContextInitializer e(double d2) {
        return this.c(6, Double.doubleToRawLongBits(d2));
    }

    private static int B(int n, String string, int n2) {
        long l = a ^ 0x3CCD821F8770L;
        return aX.a(24592, 0x1DD3F8A06FE4AED4L ^ l) & n + string.hashCode() + n2;
    }

    EncryptionContextInitializer I(long l) {
        return this.c(5, l);
    }

    int b() {
        try {
            if (this.S != null) {
                this.j("BootstrapMethods");
                return 8 + this.S.I;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
        return 0;
    }

    aX(MetadataExtractor metadataExtractor, CipherEncryptionUtility cipherEncryptionUtility) {
        this.M = metadataExtractor;
        this.j = cipherEncryptionUtility;
        byte[] byArray = cipherEncryptionUtility.I;
        int n = cipherEncryptionUtility.b(1) - 1;
        int n2 = cipherEncryptionUtility.N - n;
        this.e = cipherEncryptionUtility.R();
        this.O = new EncodingUtilityManager(n2);
        this.O.T(byArray, n, n2);
        this.b = new NM[this.e * 2];
        char[] cArray = new char[cipherEncryptionUtility.P()];
        boolean bl = false;
        int n3 = 1;
        while (n3 < this.e) {
            int n4;
            int n5;
            block19: {
                block18: {
                    int n6 = cipherEncryptionUtility.b(n3);
                    byte by = byArray[n6 - 1];
                    switch (by) {
                        case 9: 
                        case 10: 
                        case 11: {
                            int n7 = cipherEncryptionUtility.b(cipherEncryptionUtility.d(n6 + 2));
                            this.X(n3, by, cipherEncryptionUtility.p(n6, cArray), cipherEncryptionUtility.R(n7, cArray), cipherEncryptionUtility.R(n7 + 2, cArray));
                            break;
                        }
                        case 3: 
                        case 4: {
                            this.X(n3, by, cipherEncryptionUtility.D(n6));
                            break;
                        }
                        case 12: {
                            this.c(n3, cipherEncryptionUtility.R(n6, cArray), cipherEncryptionUtility.R(n6 + 2, cArray));
                            break;
                        }
                        case 5: 
                        case 6: {
                            this.E(n3, by, cipherEncryptionUtility.l(n6));
                            break;
                        }
                        case 1: {
                            this.v(n3, cipherEncryptionUtility.U(n3, cArray));
                            break;
                        }
                        case 15: {
                            int n8 = cipherEncryptionUtility.b(cipherEncryptionUtility.d(n6 + 1));
                            int n7 = cipherEncryptionUtility.b(cipherEncryptionUtility.d(n8 + 2));
                            this.J(n3, cipherEncryptionUtility.N(n6), cipherEncryptionUtility.p(n8, cArray), cipherEncryptionUtility.R(n7, cArray), cipherEncryptionUtility.R(n7 + 2, cArray));
                            break;
                        }
                        case 17: 
                        case 18: {
                            bl = true;
                            int n7 = cipherEncryptionUtility.b(cipherEncryptionUtility.d(n6 + 2));
                            this.d(by, n3, cipherEncryptionUtility.R(n7, cArray), cipherEncryptionUtility.R(n7 + 2, cArray), cipherEncryptionUtility.d(n6));
                            break;
                        }
                        case 7: 
                        case 8: 
                        case 16: 
                        case 19: 
                        case 20: {
                            this.x(n3, by, cipherEncryptionUtility.R(n6, cArray));
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException();
                        }
                    }
                    try {
                        try {
                            n5 = n3;
                            if (by != 5 && by != 6) break block18;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        n4 = 2;
                        break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                }
                n4 = 1;
            }
            n3 = n5 + n4;
        }
        try {
            if (bl) {
                this.p(cipherEncryptionUtility, cArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aX.a(illegalArgumentException);
        }
    }

    private NM f(int n) {
        return this.b[n % this.b.length];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D45;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/aX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            aX.d[n2] = n3;
        }
        return d[n2];
    }

    private void X(int n, int n2, String string, String string2, String string3) {
        this.I(new NM(n, n2, string, string2, string3, 0L, aX.Y(n2, string, string2, string3)));
    }

    private static int r(int n, String string, String string2, String string3, int n2) {
        long l = a ^ 0x267EE5586854L;
        return aX.a(24592, 0x1DD3E21308A341F0L ^ l) & n + string.hashCode() * string2.hashCode() * string3.hashCode() * n2;
    }

    private void J(int n, int n2, String string, String string2, String string3) {
        int n3 = 15;
        int n4 = aX.r(15, string, string2, string3, n2);
        this.I(new NM(n, 15, string, string2, string3, n2, n4));
    }

    private static int Y(int n, String string, String string2, String string3) {
        long l = a ^ 0x48D382AB3716L;
        return aX.a(1382, 0x73B57D05B07FFBC5L ^ l) & n + string.hashCode() * string2.hashCode() * string3.hashCode();
    }

    EncryptionContextInitializer b(int n, String string, String string2, String string3, boolean bl) {
        int n2;
        block19: {
            block18: {
                int n3 = 15;
                n2 = aX.r(15, string, string2, string3, n);
                NM nM = this.f(n2);
                while (true) {
                    block17: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (nM == null) break;
                                                    if (nM.c != 15) break block17;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw aX.a(illegalArgumentException);
                                                }
                                                if (nM.O != n2) break block17;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw aX.a(illegalArgumentException);
                                            }
                                            if (nM.g != (long)n) break block17;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw aX.a(illegalArgumentException);
                                        }
                                        if (!nM.k.equals(string)) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw aX.a(illegalArgumentException);
                                    }
                                    if (!nM.V.equals(string2)) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw aX.a(illegalArgumentException);
                                }
                                if (!nM.i.equals(string3)) break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            return nM;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                    }
                    nM = nM.A;
                }
                try {
                    if (n > 4) break block18;
                    this.O.f(15, n, this.b((String)string, (String)string2, (String)string3).Z);
                    break block19;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            this.O.f(15, n, this.V((String)string, (String)string2, (String)string3, (boolean)bl).Z);
        }
        return this.H(new NM(this.e++, 15, string, string2, string3, n, n2));
    }

    void I(EncodingUtilityManager encodingUtilityManager) {
        encodingUtilityManager.f(this.e).T(this.O.U, 0, this.O.I);
    }

    private void c(int n, String string, String string2) {
        int n2 = 12;
        this.I(new NM(n, 12, string, string2, aX.U(12, string, string2)));
    }

    EncryptionContextInitializer A(int n) {
        return this.R(3, n);
    }

    private EncryptionContextInitializer h(int n, String string, String string2, int n2) {
        int n3 = aX.J(n, string, string2, n2);
        NM nM = this.f(n3);
        while (true) {
            block13: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (nM == null) break;
                                        if (nM.c != n) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw aX.a(illegalArgumentException);
                                    }
                                    if (nM.O != n3) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw aX.a(illegalArgumentException);
                                }
                                if (nM.g != (long)n2) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (!nM.V.equals(string)) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string2)) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        this.O.K(n, n2, this.s(string, string2));
        return this.H(new NM(this.e++, n, null, string, string2, n2, n3));
    }

    private EncryptionContextInitializer d(int n, String string) {
        int n2 = aX.z(n, string);
        NM nM = this.f(n2);
        while (true) {
            block9: {
                try {
                    try {
                        try {
                            try {
                                if (nM == null) break;
                                if (nM.c != n) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw aX.a(illegalArgumentException);
                            }
                            if (nM.O != n2) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw aX.a(illegalArgumentException);
                        }
                        if (!nM.i.equals(string)) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aX.a(illegalArgumentException);
                    }
                    return nM;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aX.a(illegalArgumentException);
                }
            }
            nM = nM.A;
        }
        this.O.I(n, this.j(string));
        return this.H(new NM(this.e++, n, string, n2));
    }

    EncryptionContextInitializer b(String string, String string2, String string3) {
        return this.E(9, string, string2, string3);
    }

    private static int J(int n, String string, String string2, int n2) {
        long l = a ^ 0x5654CDDF9FFFL;
        return aX.a(24592, 0x1DD392392024B65BL ^ l) & n + string.hashCode() * string2.hashCode() * (n2 + 1);
    }

    private NM H(NM nM) {
        int n;
        if (this.p > this.b.length * 3 / 4) {
            n = this.b.length;
            int n2 = n * 2 + 1;
            NM[] nMArray = new NM[n2];
            for (int i = n - 1; i >= 0; --i) {
                NM nM2 = this.b[i];
                while (nM2 != null) {
                    int n3 = nM2.O % n2;
                    NM nM3 = nM2.A;
                    nM2.A = nMArray[n3];
                    nMArray[n3] = nM2;
                    nM2 = nM3;
                }
            }
            this.b = nMArray;
        }
        ++this.p;
        n = nM.O % this.b.length;
        nM.A = this.b[n];
        this.b[n] = nM;
        return this.b[n];
    }

    int q() {
        return this.W;
    }
}

