/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class CryptographicParameterGenerator {
    protected double w = 0.0;
    protected boolean N = true;
    private static int F;
    protected int o;
    protected HashMap<String, Double> m = new HashMap();
    protected HashMap<String, String> t = new HashMap();
    private static final long c;
    private static final long a;

    public abstract void S(String var1, double var2, double var4, int var6);

    protected void Y(char c, float[] fArray) {
        try {
            if (c == '4') {
                fArray[0] = 1.0f;
                fArray[1] = 0.0f;
                fArray[2] = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == 'c') {
                fArray[0] = 1.0f;
                fArray[1] = 0.33f;
                fArray[2] = 0.33f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '6') {
                fArray[0] = 1.0f;
                fArray[1] = 0.66f;
                fArray[2] = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == 'e') {
                fArray[0] = 1.0f;
                fArray[1] = 1.0f;
                fArray[2] = 0.33f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '2') {
                fArray[0] = 0.0f;
                fArray[1] = 0.66f;
                fArray[2] = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == 'a') {
                fArray[0] = 0.33f;
                fArray[1] = 1.0f;
                fArray[2] = 0.33f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == 'b') {
                fArray[0] = 0.33f;
                fArray[1] = 1.0f;
                fArray[2] = 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '3') {
                fArray[0] = 0.0f;
                fArray[1] = 0.66f;
                fArray[2] = 0.66f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '1') {
                fArray[0] = 0.0f;
                fArray[1] = 0.0f;
                fArray[2] = 0.66f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '9') {
                fArray[0] = 0.33f;
                fArray[1] = 0.33f;
                fArray[2] = 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == 'd') {
                fArray[0] = 1.0f;
                fArray[1] = 0.33f;
                fArray[2] = 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '5') {
                fArray[0] = 0.66f;
                fArray[1] = 0.0f;
                fArray[2] = 0.66f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == 'f') {
                fArray[0] = 1.0f;
                fArray[1] = 1.0f;
                fArray[2] = 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '7') {
                fArray[0] = 0.66f;
                fArray[1] = 0.66f;
                fArray[2] = 0.66f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '8') {
                fArray[0] = 0.33f;
                fArray[1] = 0.33f;
                fArray[2] = 0.33f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        try {
            if (c == '0') {
                fArray[0] = 0.0f;
                fArray[1] = 0.0f;
                fArray[2] = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
    }

    public int r() {
        return this.o;
    }

    public void r(String string, double d2, double d3, int n) {
        this.P(string, d2 - this.D(string) / 2.0, d3, n);
    }

    public void z(String string, double d2, double d3, int n, boolean bl) {
        String string2 = this.t.get(string);
        if (string2 == null) {
            String string3 = "";
            char[] cArray = string.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                char c = cArray[i];
                try {
                    if (c == '\u00a7') {
                        ++i;
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicParameterGenerator.b(customSystemException);
                }
                string3 = string3 + c;
            }
            this.t.put(string, string3);
            string2 = string3;
        }
        string = string2;
        this.c(string, d2, d3, n, bl);
    }

    public void Y(String string, double d2, double d3, int n) {
        this.z(string, d2, d3, n, false);
    }

    public double D(String string) {
        return this.l(string, false);
    }

    public abstract double g(String var1, boolean var2);

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(7484741380623373107L, 3793938229081658234L, MethodHandles.lookup().lookupClass()).a(4871066034674L);
        long l = a ^ 0x2B73388FFF4EL;
        CryptographicParameterGenerator.M(0);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -819371177911602288L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void K(String string, double d2, double d3, Color color, Color color2) {
        this.D(string, d2, d3, color, color2, false);
    }

    public abstract void c(String var1, double var2, double var4, int var6, boolean var7);

    public abstract void D(String var1, double var2, double var4, Color var6, Color var7, boolean var8);

    public static int V() {
        int n = CryptographicParameterGenerator.S();
        try {
            if (n == 0) {
                return 45;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicParameterGenerator.b(customSystemException);
        }
        return 0;
    }

    public void R(String string, double d2, double d3, Color color) {
        int n = color.getRGB();
        if (color instanceof ColorCompositionEngine) {
            n = ((ColorCompositionEngine)color).Y();
        }
        this.c(string, d2, d3, n, false);
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

    public static void M(int n) {
        F = n;
    }

    public abstract void W(String var1, double var2, double var4, Color var6);

    public void P(String string, double d2, double d3, int n) {
        this.c(string, d2, d3, n, false);
    }

    public void u(String string, double d2, double d3, Color color, boolean bl) {
        int n = color.getRGB();
        if (color instanceof ColorCompositionEngine) {
            n = ((ColorCompositionEngine)color).Y();
        }
        this.c(string, d2, d3, n, bl);
    }

    public void P(String string, double d2, double d3, Color color) {
        block3: {
            block2: {
                long l = a ^ 0x13EFBB2AA39AL;
                try {
                    if (!GraphicalRenderingController.P()) break block2;
                    this.r(string, d2 + 0.5, d3 + 0.5, (int)c);
                    this.Q(string, d2, d3, color);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicParameterGenerator.b(customSystemException);
                }
            }
            this.Y(string, d2 - this.D(string) / 2.0, d3, color);
        }
    }

    public abstract void t(String var1, double var2, double var4, Color var6, boolean var7);

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public abstract double l(String var1, boolean var2);

    public static int S() {
        return F;
    }

    public void V(boolean bl) {
        this.N = bl;
    }

    public void Y(String string, double d2, double d3, Color color) {
        this.t(string, d2, d3, color, false);
    }
}

