/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.crypto;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolDefinition;
import com.security.session.CipherSessionManager;
import com.ui.rendering.GraphicalRenderingController;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CipherContextManager1101
extends CipherSessionManager {
    private AbstractComputationKernel y8;
    private boolean y9;
    private CipherSessionManager yj;
    private static String yp;
    private CipherSessionManager yZ;
    private AbstractComputationKernel yg;

    public static String t() {
        return yp;
    }

    @Nullable
    public <T extends AbstractComputationKernel> T o(Class<T> clazz) {
        AbstractComputationKernel abstractComputationKernel;
        try {
            abstractComputationKernel = clazz.isInstance(this.yg) ? (AbstractComputationKernel)clazz.cast(this.yg) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager1101.a(customSystemException);
        }
        return (T)abstractComputationKernel;
    }

    @Override
    public void i() {
    }

    public static void I(String string) {
        yp = string;
    }

    public AbstractComputationKernel S() {
        return this.yg;
    }

    static {
        if (CipherContextManager1101.t() != null) {
            CipherContextManager1101.I("VEBWo");
        }
    }

    @Override
    public void E() {
        super.E();
    }

    @Override
    public String A() {
        return null;
    }

    public CipherSessionManager T() {
        return this.yj;
    }

    @Override
    public void o(boolean bl) {
    }

    @Override
    public void u() {
    }

    public AbstractComputationKernel N() {
        return this.y8;
    }

    public CipherContextManager1101(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2) {
        this.y8 = abstractComputationKernel;
        this.yZ = this.yj = abstractComputationKernel.V();
        try {
            while (this.yZ instanceof CipherContextManager1101) {
                this.yZ = ((CipherContextManager1101)this.yZ).T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager1101.a(customSystemException);
        }
        this.yg = abstractComputationKernel2;
        this.n(abstractComputationKernel2, new Object[0]);
        this.b(abstractComputationKernel.G());
        this.M(abstractComputationKernel.W());
        this.A();
    }

    @Override
    public void S() {
    }

    @Override
    public void L() {
        boolean bl;
        CipherContextManager1101 cipherContextManager1101;
        block8: {
            block7: {
                this.A();
                GraphicalRenderingController.K.s(this.yj, this);
                boolean bl2 = false;
                if (this.yj instanceof NetworkProtocolDefinition) {
                    bl2 = ((NetworkProtocolDefinition)((Object)this.yj)).W();
                }
                try {
                    try {
                        try {
                            cipherContextManager1101 = this;
                            if (!this.yj.f() || bl2) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager1101.a(customSystemException);
                        }
                        if (!this.y8.f()) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager1101.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager1101.a(customSystemException);
                }
            }
            bl = false;
        }
        cipherContextManager1101.N(bl);
    }

    @Override
    public void N(boolean bl) {
        super.N(bl);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void d(boolean bl) {
        this.y9 = bl;
    }

    public CipherSessionManager P() {
        return this.yZ;
    }

    public boolean K() {
        return this.y9;
    }
}

