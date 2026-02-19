/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.eh;
import java.util.HashMap;

public final class _7
extends HashMap<String, eh> {
    private static final long serialVersionUID = 1L;
    private _7 t;

    public _7() {
        this((_7)null);
    }

    public void s(String string, eh eh2) {
        this.put(string, eh2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public eh u(String string) {
        eh eh2;
        block4: {
            eh2 = (eh)this.get(string);
            try {
                try {
                    if (eh2 != null || this.t == null) break block4;
                }
                catch (O_ o_2) {
                    throw _7.a(o_2);
                }
                return this.t.u(string);
            }
            catch (O_ o_3) {
                throw _7.a(o_3);
            }
        }
        return eh2;
    }

    public _7(_7 _72) {
        this.t = _72;
    }
}

