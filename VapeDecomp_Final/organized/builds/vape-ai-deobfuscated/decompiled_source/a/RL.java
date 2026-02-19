/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.exception.system.CustomSystemException;
import com.security.exchange.SecureDataExchanger793;
import java.util.ArrayDeque;
import java.util.Deque;

public class RL {
    private final Deque<SecureDataExchanger793> e = new ArrayDeque<SecureDataExchanger793>();

    public void e(float f, float f2, float f3) {
        this.i().k(f, f2, f3);
    }

    public void F() {
        this.e.push(new SecureDataExchanger793().Z());
    }

    public void I(float f, float f2, float f3) {
        this.i().q(f, f2, f3);
    }

    public void G(float f, float f2, float f3, float f4) {
        this.i().e(f, f2, f3, f4);
    }

    public SecureDataExchanger793 i() {
        return this.e.peek();
    }

    public void d() {
        this.i().Z();
    }

    public void J() {
        try {
            if (this.e.size() > 1) {
                this.e.pop();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RL.a(customSystemException);
        }
    }

    public void t(SecureDataExchanger793 secureDataExchanger793) {
        this.i().E(secureDataExchanger793);
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.i().f(f, f2, f3, f4, f5, f6);
    }

    public RL() {
        this.e.push(new SecureDataExchanger793().Z());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void t(float f) {
        this.i().g(f);
    }
}

