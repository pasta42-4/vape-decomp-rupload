/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ec;
import a.z6;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.game.actions.ActionSequenceHandler;
import com.security.exchange.SecureDataExchanger793;
import com.system.monitoring.ExecutionStateTracker;

public class ZJ {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void n() {
        float f = 0.0f;
        float f2 = (float)ApplicationLifecycleManager.l().z() / 2.0f;
        float f3 = (float)ApplicationLifecycleManager.l().x() / 2.0f;
        float f4 = 0.0f;
        float f5 = -21000.0f;
        float f6 = 21000.0f;
        z6.O = new SecureDataExchanger793().Z().f(f, f2, f3, f4, f6, f5);
        z6.J = new SecureDataExchanger793().Z();
    }

    public static void h(float f) {
        try {
            if (ApplicationLifecycleManager.r().e().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ZJ.a(customSystemException);
        }
        Ec ec2 = ApplicationLifecycleManager.U();
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        ActionSequenceHandler actionSequenceHandler = ec2.W(ec2.v(), f, true);
        DataTransformationEngine1209 dataTransformationEngine1209 = DataTransformationEngine1209.i();
        try {
            ec2.l(dataTransformationEngine1209, f);
            if (executionStateTracker.S()) {
                ec2.Z(dataTransformationEngine1209, f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ZJ.a(customSystemException);
        }
        ActionSequenceHandler actionSequenceHandler2 = dataTransformationEngine1209.p().n();
        actionSequenceHandler.t(actionSequenceHandler2);
        z6.O = actionSequenceHandler.X();
        z6.J = new SecureDataExchanger793().Z();
    }
}

