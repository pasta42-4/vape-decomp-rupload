/*
 * Decompiled with CFR 0.152.
 */
package com.module.configuration;

import a.Rr;
import a.aX;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class ModuleConfigurationResolver
extends Rr {
    private int m;
    private final EncodingUtilityManager h;
    private int R;
    private final int g;
    private int S;
    private static final long i;
    private int r;
    private final int Y;
    private final int a;
    private final EncodingUtilityManager x;
    private static final long c;
    private final aX B;
    private final EncodingUtilityManager T;
    private final EncodingUtilityManager q;
    private int k;
    private final EncodingUtilityManager X;
    private int p;
    private final EncodingUtilityManager A;
    private int u;

    int U() {
        int n;
        int n2;
        int n3;
        int n4;
        try {
            n4 = 1;
            n3 = this.R > 0 ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationResolver.a(customSystemException);
        }
        try {
            n2 = n4 + n3;
            n = this.S > 0 ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationResolver.a(customSystemException);
        }
        return n2 + n;
    }

    ModuleConfigurationResolver(aX aX2, int n, int n2, int n3) {
        long l = c ^ 0x1BB070C203FAL;
        super((int)i);
        this.B = aX2;
        this.Y = n;
        this.g = n2;
        this.a = n3;
        this.X = new EncodingUtilityManager();
        this.x = new EncodingUtilityManager();
        this.T = new EncodingUtilityManager();
        this.q = new EncodingUtilityManager();
        this.A = new EncodingUtilityManager();
        this.h = new EncodingUtilityManager();
    }

    public void m(String string, int n, String ... stringArray) {
        block4: {
            block3: {
                try {
                    this.T.f(this.B.b((String)string).Z).f(n);
                    if (stringArray != null) break block3;
                    this.T.f(0);
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModuleConfigurationResolver.a(customSystemException);
                }
            }
            this.T.f(stringArray.length);
            for (String string2 : stringArray) {
                this.T.f(this.B.t((String)string2).Z);
            }
        }
        ++this.m;
    }

    public void g() {
    }

    public void N(String string) {
        this.q.f(this.B.c((String)string).Z);
        ++this.r;
    }

    public void F(String string) {
        this.h.f(this.B.b((String)string).Z);
        ++this.R;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void P(String string) {
        this.S = this.B.c((String)string).Z;
    }

    public void w(String string, int n, String string2) {
        int n2;
        EncodingUtilityManager encodingUtilityManager;
        try {
            encodingUtilityManager = this.X.f(this.B.t((String)string).Z).f(n);
            n2 = string2 == null ? 0 : this.B.j(string2);
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationResolver.a(customSystemException);
        }
        encodingUtilityManager.f(n2);
        ++this.p;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = MultiContainerRegistry.a(8213680597694858735L, 4702412748574381835L, null).a(15447872623549L);
        long l = c ^ 0x6DCDF572F8ADL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 3941248619048639309L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                i = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    int J() {
        this.B.j("Module");
        int n = 22 + this.X.I + this.x.I + this.T.I + this.q.I + this.A.I;
        if (this.R > 0) {
            this.B.j("ModulePackages");
            n += 8 + this.h.I;
        }
        try {
            if (this.S > 0) {
                this.B.j("ModuleMainClass");
                n += 8;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationResolver.a(customSystemException);
        }
        return n;
    }

    void E(EncodingUtilityManager encodingUtilityManager) {
        int n = 16 + this.X.I + this.x.I + this.T.I + this.q.I + this.A.I;
        try {
            encodingUtilityManager.f(this.B.j("Module")).y(n).f(this.Y).f(this.g).f(this.a).f(this.p).T(this.X.U, 0, this.X.I).f(this.k).T(this.x.U, 0, this.x.I).f(this.m).T(this.T.U, 0, this.T.I).f(this.r).T(this.q.U, 0, this.q.I).f(this.u).T(this.A.U, 0, this.A.I);
            if (this.R > 0) {
                encodingUtilityManager.f(this.B.j("ModulePackages")).y(2 + this.h.I).f(this.R).T(this.h.U, 0, this.h.I);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationResolver.a(customSystemException);
        }
        try {
            if (this.S > 0) {
                encodingUtilityManager.f(this.B.j("ModuleMainClass")).y(2).f(this.S);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationResolver.a(customSystemException);
        }
    }

    public void J(String string, String ... stringArray) {
        this.A.f(this.B.c((String)string).Z);
        this.A.f(stringArray.length);
        for (String string2 : stringArray) {
            this.A.f(this.B.c((String)string2).Z);
        }
        ++this.u;
    }

    public void f(String string, int n, String ... stringArray) {
        block4: {
            block3: {
                try {
                    this.x.f(this.B.b((String)string).Z).f(n);
                    if (stringArray != null) break block3;
                    this.x.f(0);
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModuleConfigurationResolver.a(customSystemException);
                }
            }
            this.x.f(stringArray.length);
            for (String string2 : stringArray) {
                this.x.f(this.B.t((String)string2).Z);
            }
        }
        ++this.k;
    }
}

