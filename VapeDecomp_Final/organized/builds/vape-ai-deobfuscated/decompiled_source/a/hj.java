/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.workflow.StateTrackingCoordinator;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import java.awt.Color;

public class hj
extends GraphicalThemeRenderer {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public hj(String string) {
        super(string);
    }

    @Override
    public void G() {
        block5: {
            Color color;
            float f;
            float f2;
            float f3;
            float f4;
            block4: {
                f4 = (float)StateTrackingCoordinator.V(this.T());
                f3 = (float)StateTrackingCoordinator.D(this.T());
                f2 = (float)(this.G() + this.w() / 2.0);
                f2 -= f4 / 4.0f;
                f = (float)(this.W() + this.b() / 2.0);
                f -= f3 / 4.0f;
                f2 = (int)f2;
                f = (int)f;
                try {
                    if (this.t() == null) break block4;
                    StateTrackingCoordinator.B(this.t(), f2, f, this.T(), f4 / 2.0f, f3 / 2.0f, false);
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw hj.a(customSystemException);
                }
            }
            try {
                color = this.s() ? this.y() : this.H();
            }
            catch (CustomSystemException customSystemException) {
                throw hj.a(customSystemException);
            }
            StateTrackingCoordinator.B(color, f2, f, this.T(), f4 / 2.0f, f3 / 2.0f, false);
        }
    }
}

