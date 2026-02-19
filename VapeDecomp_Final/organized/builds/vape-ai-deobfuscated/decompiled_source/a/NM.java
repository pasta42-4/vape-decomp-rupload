/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.security.crypto.EncryptionContextInitializer;

class NM
extends EncryptionContextInitializer {
    NM A;
    final int O;

    NM(int n, int n2, long l, int n3) {
        super(n, n2, null, null, null, l);
        this.O = n3;
    }

    NM(int n, int n2, String string, String string2, String string3, long l, int n3) {
        super(n, n2, string, string2, string3, l);
        this.O = n3;
    }

    NM(int n, int n2, String string, long l, int n3) {
        super(n, n2, null, null, string, l);
        this.O = n3;
    }

    NM(int n, int n2, String string, int n3) {
        super(n, n2, null, null, string, 0L);
        this.O = n3;
    }

    NM(int n, int n2, String string, String string2, int n3) {
        super(n, n2, null, string, string2, 0L);
        this.O = n3;
    }
}

