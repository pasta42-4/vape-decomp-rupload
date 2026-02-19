/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package com.app.crypto;

import com.collections.management.MultiContainerRegistry;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class CipherOperationsTracker {
    private static final long a = MultiContainerRegistry.a(-2000549363121075850L, 3298758325626310199L, MethodHandles.lookup().lookupClass()).a(194513696296818L);
    private static final long b;
    private int v;
    private int I = GL30.glGenVertexArrays();

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xFF45D281277L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 116932012729679840L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void a() {
        GL30.glBindVertexArray((int)this.v);
    }

    public int d() {
        return this.I;
    }

    public void h() {
        long l = a ^ 0x5422DF43F2F9L;
        this.v = GL11.glGetInteger((int)((int)b));
        GL30.glBindVertexArray((int)this.I);
    }

    public void V() {
        GL30.glDeleteVertexArrays((int)this.I);
    }
}

