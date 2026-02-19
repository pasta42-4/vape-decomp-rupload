/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package com.version.management;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class VersionMetadataExtractor {
    private static final long a = MultiContainerRegistry.a(2670310030151323366L, -7508849534946770831L, MethodHandles.lookup().lookupClass()).a(149435964469349L);
    private static final long b;
    @Expose
    @SerializedName(value="version")
    private final int n;
    @Expose
    @SerializedName(value="name")
    private final String C;

    public int J() {
        return this.n;
    }

    public VersionMetadataExtractor() {
        long l = a ^ 0x7E286892AEDFL;
        this(a.a.cs((int)b), 1);
    }

    public String G() {
        return this.C;
    }

    public VersionMetadataExtractor(String string, int n) {
        this.C = string;
        this.n = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x18FA1E5F8CFFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -1888882120458294112L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

