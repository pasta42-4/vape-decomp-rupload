/*
 * Decompiled with CFR 0.152.
 */
package com.navigation.routing;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.metadata.reflection.ReflectionContextResolver;
import com.runtime.context.LightweightExecutionContext;
import com.system.cache.CacheManager;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NavigationPathfinder
extends ObjectLifecycleTracker {
    public LightweightExecutionContext s(int n) {
        return new LightweightExecutionContext(ReflectionContextResolver.f(NavigationPathfinder.U.u().du, this.H, n));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String w() {
        try {
            if (GeometryCalculator.C() > 13) {
                return new CacheManager(this.H).j().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NavigationPathfinder.a(customSystemException);
        }
        return ReflectionContextResolver.i(NavigationPathfinder.U.u().du, this.H);
    }

    public boolean o() {
        block4: {
            block5: {
                try {
                    try {
                        if (GeometryCalculator.C() <= 13) break block4;
                        if (GeometryCalculator.C() < 35) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NavigationPathfinder.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw NavigationPathfinder.a(customSystemException);
                }
            }
            return new CacheManager(this.H).d();
        }
        return ReflectionContextResolver.V(NavigationPathfinder.U.u().du, this.H);
    }

    public int c() {
        return ReflectionContextResolver.Y(NavigationPathfinder.U.u().du, this.H);
    }

    public NavigationPathfinder(Object object) {
        super(object);
    }
}

