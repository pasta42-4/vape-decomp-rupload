/*
 * Decompiled with CFR 0.152.
 */
package com.system.state;

import a.d;
import com.exception.system.CustomSystemException;
import com.ui.input.UserInputEventMapper;
import com.ui.rendering.GraphicalRenderingController;
import java.util.HashMap;

public class StateMachineController {
    private HashMap<Integer, Boolean> A = new HashMap();
    private int E;
    private long h = System.nanoTime();
    private int g;
    private int b;
    private boolean B;
    private boolean R;
    private int Y;

    public boolean q(int n) {
        return this.A.getOrDefault(n, false);
    }

    public long h() {
        return this.h;
    }

    public int C() {
        return this.Y;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean b(int n) {
        return this.A.getOrDefault(n, false);
    }

    public boolean S(int n, int n2) {
        try {
            this.b = n;
            this.Y = n2;
            if (!GraphicalRenderingController.K.P) {
                d.handleMouseInput(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateMachineController.a(customSystemException);
        }
        return false;
    }

    public int F() {
        int n = this.g;
        return n;
    }

    public boolean B() {
        return this.R;
    }

    public void H() {
        this.g = 0;
    }

    public boolean g(int n, boolean bl) {
        boolean bl2 = this.A.getOrDefault(n, false);
        boolean bl3 = false;
        if (bl2 != bl) {
            bl3 = this.f(n, bl);
        }
        this.A.put(n, bl);
        return bl3;
    }

    public boolean G(int n) {
        try {
            if (!GraphicalRenderingController.K.P) {
                this.g = n;
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateMachineController.a(customSystemException);
        }
        return false;
    }

    public boolean J() {
        return this.B;
    }

    private boolean f(int n, boolean bl) {
        block4: {
            block5: {
                try {
                    try {
                        this.h = System.nanoTime();
                        this.R = bl;
                        this.E = n;
                        if (GraphicalRenderingController.K.P) break block4;
                        if (!bl) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StateMachineController.a(customSystemException);
                    }
                    d.mouseClicked(null, this.b, this.Y, n);
                }
                catch (CustomSystemException customSystemException) {
                    throw StateMachineController.a(customSystemException);
                }
            }
            this.B = true;
            return true;
        }
        return new UserInputEventMapper(n, bl).fire();
    }

    public int b() {
        return this.E;
    }

    public void Q() {
    }

    public int v() {
        return this.b;
    }
}

