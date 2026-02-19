/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.deobfuscation.configuration.ConfigurationManager2137;
import com.system.configuration.ConfigurationManager2254;

class Sd
extends ConfigurationManager2254 {
    int o;

    int g(int n, byte[] byArray, int n2, byte[] byArray2) {
        byArray2[n2] = byArray[n];
        ConfigurationManager2137.C(this.o, byArray2, n2 + 1);
        return 5;
    }

    void w(int n, int n2, boolean bl) {
        this.o = Sd.g(this.p, this.o, n, n2, bl);
        super.w(n, n2, bl);
    }

    Sd(int n, int n2) {
        super(n);
        this.o = n2;
    }
}

