/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._R;
import a.p0;

public class _e
extends _R {
    public static void call(Object object, Object object2, Object object3) {
        try {
            if (!_R.access$000(object)) {
                return;
            }
        }
        catch (O_ o_2) {
            throw _e.a(o_2);
        }
        new p0(object, object2, object3).fire();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

