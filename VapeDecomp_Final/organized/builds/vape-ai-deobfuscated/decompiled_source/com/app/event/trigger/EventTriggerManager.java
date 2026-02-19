/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.app.event.trigger;

import a.Ne;
import a.tl;
import com.app.config.management.ConfigurationRegistry;
import com.app.events.EventTriggeringMechanism;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.EventDispatchCoordinator2087;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.temporal.metadata.TemporalMetadataResolver;
import org.lwjgl.opengl.GL11;

public class EventTriggerManager
implements EventTriggeringMechanism {
    private final DataTransformationEngine1209 e;
    private static float L = -1.0f;
    private final float s;
    private static boolean M;

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean fire() {
        block21: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block16: {
                                NumericComputationEngine1131.d(this.s);
                                if (EventDispatchRegistry2111.getEventListeners().G()) ** GOTO lbl9
                                try {
                                    block22: {
                                        if (!EventDispatchCoordinator2087.getEventListeners().G()) break block16;
                                        break block22;
                                        catch (Exception v0) {
                                            throw EventTriggerManager.a(v0);
                                        }
                                    }
                                    v1 = true;
                                    break block17;
                                }
                                catch (Exception v2) {
                                    throw EventTriggerManager.a(v2);
                                }
                            }
                            v1 = false;
                        }
                        var1_1 = v1;
                        var2_2 = false;
                        var3_3 = false;
                        if (EventDispatchRegistry2111.getEventListeners().G()) {
                            var2_2 = new EventDispatchRegistry2111(this.e, this.s).fire();
                        }
                        var4_4 = ApplicationLifecycleManager.N();
                        var5_5 = ApplicationLifecycleManager.U();
                        try {
                            if (!EventDispatchCoordinator2087.getEventListeners().G()) break block18;
                            if (GeometryCalculator.C() < 35) break block19;
                        }
                        catch (Exception v3) {
                            throw EventTriggerManager.a(v3);
                        }
                        try {
                            var6_6 = var4_4.S();
                            var4_4.C(false);
                            var5_5.p(this.s, 0);
                            var3_3 = new EventDispatchCoordinator2087(this.e, this.s).fire();
                            var4_4.C(var6_6);
                        }
                        catch (Exception var6_7) {
                            TemporalMetadataResolver.W(var6_7);
                        }
                        break block18;
                    }
                    ConfigurationRegistry.t.Q();
                    GL11.glPushMatrix();
                    tl.X();
                    var5_5.i(this.s);
                    var3_3 = new EventDispatchCoordinator2087(this.e, this.s).fire();
                    GL11.glPopMatrix();
                    ConfigurationRegistry.t.Z();
                }
                try {
                    if (var1_1) {
                        var5_5.H(1.0);
                        Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                }
                catch (Exception v4) {
                    throw EventTriggerManager.a(v4);
                }
                try {
                    try {
                        EventTriggerManager.L = this.s;
                        if (!var2_2 && !var3_3) break block20;
                    }
                    catch (Exception v5) {
                        throw EventTriggerManager.a(v5);
                    }
                    v6 = true;
                    break block21;
                }
                catch (Exception v7) {
                    throw EventTriggerManager.a(v7);
                }
            }
            v6 = false;
        }
        return v6;
    }

    public EventTriggerManager(float f) {
        this.e = null;
        this.s = f;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public EventTriggerManager(Object object) {
        this.e = new DataTransformationEngine1209(object);
        this.s = ApplicationLifecycleManager.K().h();
    }
}

