/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import java.util.HashMap;

public final class ku
extends HashMap<String, Integer> {
    private static final long serialVersionUID = 1L;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public int K(String string) {
        int n2;
        try {
            n2 = this.containsKey(string) ? (Integer)this.get(string) : -1;
        }
        catch (O_ o_2) {
            throw ku.a(o_2);
        }
        return n2;
    }

    public void U(String string, int n2) {
        this.put(string, n2);
    }
}

