/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.deobfuscation.transformation.BinaryTransformer;
import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;

public class Df
extends ObjectLifecycleTracker {
    public Df(Object object) {
        super(object);
    }

    public BinaryTransformer k() {
        return new BinaryTransformer(Df.U.u().kr.f(this.H));
    }

    public int H() {
        BinaryTransformer binaryTransformer = this.m();
        try {
            if (binaryTransformer.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Df.a(customSystemException);
        }
        return binaryTransformer.i();
    }

    public BinaryTransformer m() {
        return new BinaryTransformer(Df.U.u().kr.S(this.H));
    }

    public int t() {
        BinaryTransformer binaryTransformer = this.k();
        try {
            if (binaryTransformer.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Df.a(customSystemException);
        }
        return binaryTransformer.i();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

