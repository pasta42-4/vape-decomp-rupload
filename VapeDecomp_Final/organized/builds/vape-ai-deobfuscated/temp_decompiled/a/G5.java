/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.d8;
import a.k2;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class G5 {
    protected double w = 0.0;
    protected boolean N = true;
    private static int F;
    protected int o;
    protected HashMap<String, Double> m = new HashMap();
    protected HashMap<String, String> t = new HashMap();
    private static final long c;
    private static final long a;

    public abstract void S(String var1, double var2, double var4, int var6);

    protected void Y(char c10, float[] fArray) {
        try {
            if (c10 == '4') {
                fArray[0] = 1.0f;
                fArray[1] = 0.0f;
                fArray[2] = 0.0f;
            }
        }
        catch (O_ o_2) {
            throw G5.b(o_2);
        }
        try {
            if (c10 == 'c') {
                fArray[0] = 1.0f;
                fArray[1] = 0.33f;
                fArray[2] = 0.33f;
            }
        }
        catch (O_ o_3) {
            throw G5.b(o_3);
        }
        try {
            if (c10 == '6') {
                fArray[0] = 1.0f;
                fArray[1] = 0.66f;
                fArray[2] = 0.0f;
            }
        }
        catch (O_ o_4) {
            throw G5.b(o_4);
        }
        try {
            if (c10 == 'e') {
                fArray[0] = 1.0f;
                fArray[1] = 1.0f;
                fArray[2] = 0.33f;
            }
        }
        catch (O_ o_5) {
            throw G5.b(o_5);
        }
        try {
            if (c10 == '2') {
                fArray[0] = 0.0f;
                fArray[1] = 0.66f;
                fArray[2] = 0.0f;
            }
        }
        catch (O_ o_6) {
            throw G5.b(o_6);
        }
        try {
            if (c10 == 'a') {
                fArray[0] = 0.33f;
                fArray[1] = 1.0f;
                fArray[2] = 0.33f;
            }
        }
        catch (O_ o_7) {
            throw G5.b(o_7);
        }
        try {
            if (c10 == 'b') {
                fArray[0] = 0.33f;
                fArray[1] = 1.0f;
                fArray[2] = 1.0f;
            }
        }
        catch (O_ o_8) {
            throw G5.b(o_8);
        }
        try {
            if (c10 == '3') {
                fArray[0] = 0.0f;
                fArray[1] = 0.66f;
                fArray[2] = 0.66f;
            }
        }
        catch (O_ o_9) {
            throw G5.b(o_9);
        }
        try {
            if (c10 == '1') {
                fArray[0] = 0.0f;
                fArray[1] = 0.0f;
                fArray[2] = 0.66f;
            }
        }
        catch (O_ o_10) {
            throw G5.b(o_10);
        }
        try {
            if (c10 == '9') {
                fArray[0] = 0.33f;
                fArray[1] = 0.33f;
                fArray[2] = 1.0f;
            }
        }
        catch (O_ o_11) {
            throw G5.b(o_11);
        }
        try {
            if (c10 == 'd') {
                fArray[0] = 1.0f;
                fArray[1] = 0.33f;
                fArray[2] = 1.0f;
            }
        }
        catch (O_ o_12) {
            throw G5.b(o_12);
        }
        try {
            if (c10 == '5') {
                fArray[0] = 0.66f;
                fArray[1] = 0.0f;
                fArray[2] = 0.66f;
            }
        }
        catch (O_ o_13) {
            throw G5.b(o_13);
        }
        try {
            if (c10 == 'f') {
                fArray[0] = 1.0f;
                fArray[1] = 1.0f;
                fArray[2] = 1.0f;
            }
        }
        catch (O_ o_14) {
            throw G5.b(o_14);
        }
        try {
            if (c10 == '7') {
                fArray[0] = 0.66f;
                fArray[1] = 0.66f;
                fArray[2] = 0.66f;
            }
        }
        catch (O_ o_15) {
            throw G5.b(o_15);
        }
        try {
            if (c10 == '8') {
                fArray[0] = 0.33f;
                fArray[1] = 0.33f;
                fArray[2] = 0.33f;
            }
        }
        catch (O_ o_16) {
            throw G5.b(o_16);
        }
        try {
            if (c10 == '0') {
                fArray[0] = 0.0f;
                fArray[1] = 0.0f;
                fArray[2] = 0.0f;
            }
        }
        catch (O_ o_17) {
            throw G5.b(o_17);
        }
    }

    public int r() {
        return this.o;
    }

    public void r(String string, double d2, double d3, int n2) {
        this.P(string, d2 - this.D(string) / 2.0, d3, n2);
    }

    public void z(String string, double d2, double d3, int n2, boolean bl2) {
        String string2 = this.t.get(string);
        if (string2 == null) {
            String string3 = "";
            char[] cArray = string.toCharArray();
            for (int i10 = 0; i10 < cArray.length; ++i10) {
                char c10 = cArray[i10];
                try {
                    if (c10 == '\u00a7') {
                        ++i10;
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw G5.b(o_2);
                }
                string3 = string3 + c10;
            }
            this.t.put(string, string3);
            string2 = string3;
        }
        string = string2;
        this.c(string, d2, d3, n2, bl2);
    }

    public void Y(String string, double d2, double d3, int n2) {
        this.z(string, d2, d3, n2, false);
    }

    public double D(String string) {
        return this.l(string, false);
    }

    public abstract double g(String var1, boolean var2);

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(7484741380623373107L, 3793938229081658234L, MethodHandles.lookup().lookupClass()).a(4871066034674L);
        long l10 = a ^ 0x2B73388FFF4EL;
        G5.M(0);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -819371177911602288L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public void K(String string, double d2, double d3, Color color, Color color2) {
        this.D(string, d2, d3, color, color2, false);
    }

    public abstract void c(String var1, double var2, double var4, int var6, boolean var7);

    public abstract void D(String var1, double var2, double var4, Color var6, Color var7, boolean var8);

    public static int V() {
        int n2 = G5.S();
        try {
            if (n2 == 0) {
                return 45;
            }
        }
        catch (O_ o_2) {
            throw G5.b(o_2);
        }
        return 0;
    }

    public void R(String string, double d2, double d3, Color color) {
        int n2 = color.getRGB();
        if (color instanceof k2) {
            n2 = ((k2)color).Y();
        }
        this.c(string, d2, d3, n2, false);
    }

    protected void X() {
        this.m.clear();
        this.t.clear();
    }

    public double B(String string) {
        return this.g(string, false);
    }

    public void Q(String string, double d2, double d3, Color color) {
        this.r(string, d2, d3, color.getRGB());
    }

    public static void M(int n2) {
        F = n2;
    }

    public abstract void W(String var1, double var2, double var4, Color var6);

    public void P(String string, double d2, double d3, int n2) {
        this.c(string, d2, d3, n2, false);
    }

    public void u(String string, double d2, double d3, Color color, boolean bl2) {
        int n2 = color.getRGB();
        if (color instanceof k2) {
            n2 = ((k2)color).Y();
        }
        this.c(string, d2, d3, n2, bl2);
    }

    public void P(String string, double d2, double d3, Color color) {
        block3: {
            block2: {
                long l10 = a ^ 0x13EFBB2AA39AL;
                try {
                    if (!Ao.P()) break block2;
                    this.r(string, d2 + 0.5, d3 + 0.5, (int)c);
                    this.Q(string, d2, d3, color);
                    break block3;
                }
                catch (O_ o_2) {
                    throw G5.b(o_2);
                }
            }
            this.Y(string, d2 - this.D(string) / 2.0, d3, color);
        }
    }

    public abstract void t(String var1, double var2, double var4, Color var6, boolean var7);

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public abstract double l(String var1, boolean var2);

    public static int S() {
        return F;
    }

    public void V(boolean bl2) {
        this.N = bl2;
    }

    public void Y(String string, double d2, double d3, Color color) {
        this.t(string, d2, d3, color, false);
    }
}

