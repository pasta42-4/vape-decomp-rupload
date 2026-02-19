/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.computation.rules.ComputationalRuleEngine;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.navigation.routing.NavigationPathfinder;

public class RenderEngine
extends TransformationEngine {
    public NavigationPathfinder o() {
        if (GeometryCalculator.C() >= 35) {
            Object object = RenderEngine.U.u().GU.x(this.H);
            return new NavigationPathfinder(ComputationalRuleEngine.C(RenderEngine.U.u().e, object));
        }
        return new NavigationPathfinder(ComputationalRuleEngine.C(RenderEngine.U.u().e, this.H));
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public RenderEngine(Object object) {
        super(object);
    }

    public String H() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.k().i();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RenderEngine.b(customSystemException);
        }
        return this.o().w();
    }
}

