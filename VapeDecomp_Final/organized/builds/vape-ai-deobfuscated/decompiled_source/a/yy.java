/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.hr;
import com.app.math.NumericStreamProcessor;
import com.app.resource.management.ResourceAllocationManager2413;
import com.app.security.PermissionResolver;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.network.monitoring.ConnectionStateTracker2449;
import com.network.protocols.NetworkProtocolHandler1846;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;

public class yy
extends GraphicalRenderEngine1082 {
    private NumericStreamProcessor Ou;
    private hr O8 = new ConnectionStateTracker2449(this, "", 0.7, new Color(255, 255, 255, 102), new Color(255, 255, 255));
    private boolean Om;
    private boolean Ot;
    private static boolean Og;
    private hr Ol = new ResourceAllocationManager2413(this, "", 0.7, new Color(255, 255, 255, 102), new Color(255, 255, 255));

    static void F(yy yy2) {
        yy2.X();
    }

    @Override
    public void d() {
    }

    @Override
    public double z() {
        return 12.0;
    }

    @Override
    public void C() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double e() {
        return 100.0;
    }

    public static boolean m() {
        boolean bl = yy.M();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw yy.a(customSystemException);
        }
        return false;
    }

    public yy(String string, String string2, boolean bl) {
        super(100.0, 12.0);
        this.Ou = new NumericStreamProcessor(0.1, 0.0, 49.0);
        this.O8.z(string);
        this.Ol.z(string2);
        this.Om = bl;
        this.Ot = bl;
        this.i(false);
        if (!bl) {
            this.Ou.q();
        }
        this.O8.Y(this.w() / 2.0);
        this.O8.w(12.0);
        this.Ol.Y(this.w() / 2.0);
        this.Ol.w(12.0);
        this.O8.N(new NetworkProtocolHandler1846(this));
        this.Ol.N(new PermissionResolver(this));
        this.o(this.O8, this.Ol);
    }

    public static void x(boolean bl) {
        Og = bl;
    }

    public Boolean P() {
        return this.Om;
    }

    public static boolean M() {
        return Og;
    }

    private void X() {
        boolean bl;
        yy yy2;
        try {
            yy2 = this;
            bl = this.P() == false;
        }
        catch (CustomSystemException customSystemException) {
            throw yy.a(customSystemException);
        }
        yy2.S((Boolean)bl);
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        String string;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        Color color2;
        double d4;
        double d5;
        String string2;
        CryptographicParameterGenerator cryptographicParameterGenerator2;
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), new Color(54, 53, 54, 128));
        ConfigurationManager.c(this.G() + this.Ou.t(), this.W() + 0.5, this.w() / 2.0 + 1.0, this.b() - 1.0, yy.M.k, true, 1.0f, 1.0f, 8.0f, new Color(0, 0, 0, 70));
        boolean bl = this.P();
        CryptographicParameterGenerator cryptographicParameterGenerator3 = this.L(0.6);
        double d6 = (this.O8.b() - cryptographicParameterGenerator3.B(this.O8.O())) / 2.0;
        try {
            cryptographicParameterGenerator2 = cryptographicParameterGenerator3;
            string2 = this.O8.O();
            d5 = this.G() + this.w() * 0.25;
            d4 = this.O8.W() + d6;
            color2 = !bl ? this.O8.a().k() : yy.M.c;
        }
        catch (CustomSystemException customSystemException) {
            throw yy.a(customSystemException);
        }
        try {
            cryptographicParameterGenerator2.Q(string2, d5, d4, color2);
            cryptographicParameterGenerator = cryptographicParameterGenerator3;
            string = this.Ol.O();
            d3 = this.G() + this.w() * 0.75;
            d2 = this.Ol.W() + d6;
            color = bl ? this.Ol.a().k() : yy.M.c;
        }
        catch (CustomSystemException customSystemException) {
            throw yy.a(customSystemException);
        }
        cryptographicParameterGenerator.Q(string, d3, d2, color);
    }

    public void P(String string, String string2) {
        this.O8.g(string);
        this.Ol.g(string2);
    }

    @Override
    public void U() {
    }

    @Override
    public void T(double d2) {
        super.T(d2);
        try {
            this.O8.Y(d2 / 2.0);
            this.Ol.Y(d2 / 2.0);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void u() {
    }

    @Override
    public void i() {
    }

    @Override
    public void g() {
    }

    public void S(Boolean bl) {
        block17: {
            boolean bl2;
            block15: {
                block16: {
                    block13: {
                        block14: {
                            boolean bl3;
                            try {
                                bl3 = this.Om != bl;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw yy.a(customSystemException);
                            }
                            boolean bl4 = bl3;
                            this.Om = bl;
                            if (!bl4) break block17;
                            bl2 = false;
                            try {
                                try {
                                    if (!this.Ot) break block13;
                                    if (!bl.booleanValue()) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw yy.a(customSystemException);
                                }
                                if (this.Ou.t().doubleValue() != this.Ou.p()) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw yy.a(customSystemException);
                            }
                            bl2 = true;
                            break block15;
                        }
                        if (this.Ou.t() == 0.0) {
                            bl2 = true;
                        }
                        break block15;
                    }
                    try {
                        if (!bl.booleanValue()) break block16;
                        if (this.Ou.t() != 0.0) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yy.a(customSystemException);
                    }
                    bl2 = true;
                    break block15;
                }
                if (this.Ou.t().doubleValue() == this.Ou.p()) {
                    bl2 = true;
                }
            }
            try {
                if (bl2) {
                    this.Ou.c();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yy.a(customSystemException);
            }
        }
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    static {
        if (yy.M()) {
            yy.x(true);
        }
    }
}

