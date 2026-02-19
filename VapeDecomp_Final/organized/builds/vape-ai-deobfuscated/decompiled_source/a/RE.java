/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Of;
import a.Rr;
import a.SX;
import a.i5;
import a.iQ;
import com.app.messaging.context.MessageContextBuilder;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.collections.management.MultiContainerRegistry;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RE
extends Rr {
    public List<String> y;
    public List<iQ> h;
    public List<Of> V;
    public List<String> Z;
    public String x;
    public String g;
    public List<MessageContextBuilder> D;
    private static final long c = MultiContainerRegistry.a(-4132556805650134119L, 3387652626538485149L, null).a(14670836237755L);
    public List<SX> a;
    private static final long i;
    public int S;
    public String Q;

    public void g() {
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public void w(String string, int n, String string2) {
        try {
            if (this.D == null) {
                this.D = new ArrayList<MessageContextBuilder>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        this.D.add(new MessageContextBuilder(string, n, string2));
    }

    public RE(String string, int n, String string2) {
        long l = c ^ 0x631FC94A2D19L;
        super((int)i);
        if (this.getClass() != RE.class) {
            throw new IllegalStateException();
        }
        this.Q = string;
        this.S = n;
        this.x = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = c ^ 0x19EB9218D5DBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8683760967624086188L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                i = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void m(String string, int n, String ... stringArray) {
        try {
            if (this.a == null) {
                this.a = new ArrayList<SX>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        this.a.add(new SX(string, n, i5.Y(stringArray)));
    }

    public void N(String string) {
        try {
            if (this.y == null) {
                this.y = new ArrayList<String>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        this.y.add(string);
    }

    public void P(String string) {
        this.g = string;
    }

    public void J(String string, String ... stringArray) {
        try {
            if (this.h == null) {
                this.h = new ArrayList<iQ>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        this.h.add(new iQ(string, i5.Y(stringArray)));
    }

    public void v(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        int n;
        int n2;
        Rr rr = bytecodeMetadataAnalyzer.S(this.Q, this.S, this.x);
        try {
            if (rr == null) {
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        try {
            if (this.g != null) {
                rr.P(this.g);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        if (this.Z != null) {
            n2 = this.Z.size();
            try {
                for (n = 0; n < n2; ++n) {
                    rr.F(this.Z.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw RE.a(illegalStateException);
            }
        }
        if (this.D != null) {
            n2 = this.D.size();
            try {
                for (n = 0; n < n2; ++n) {
                    this.D.get(n).E(rr);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw RE.a(illegalStateException);
            }
        }
        if (this.V != null) {
            n2 = this.V.size();
            try {
                for (n = 0; n < n2; ++n) {
                    this.V.get(n).F(rr);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw RE.a(illegalStateException);
            }
        }
        if (this.a != null) {
            n2 = this.a.size();
            try {
                for (n = 0; n < n2; ++n) {
                    this.a.get(n).E(rr);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw RE.a(illegalStateException);
            }
        }
        if (this.y != null) {
            n2 = this.y.size();
            try {
                for (n = 0; n < n2; ++n) {
                    rr.N(this.y.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw RE.a(illegalStateException);
            }
        }
        if (this.h != null) {
            n2 = this.h.size();
            try {
                for (n = 0; n < n2; ++n) {
                    this.h.get(n).f(rr);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw RE.a(illegalStateException);
            }
        }
    }

    public void F(String string) {
        try {
            if (this.Z == null) {
                this.Z = new ArrayList<String>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        this.Z.add(string);
    }

    public void f(String string, int n, String ... stringArray) {
        try {
            if (this.V == null) {
                this.V = new ArrayList<Of>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw RE.a(illegalStateException);
        }
        this.V.add(new Of(string, n, i5.Y(stringArray)));
    }
}

