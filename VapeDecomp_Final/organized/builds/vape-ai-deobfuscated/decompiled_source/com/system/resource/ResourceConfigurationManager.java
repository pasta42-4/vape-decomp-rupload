/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.ff;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.resource.management.CloneableResourceDescriptor;
import com.system.configuration.ConfigurationManager;
import com.system.resource.SystemResourceAllocator;

class ResourceConfigurationManager
extends AbstractComputationKernel {
    final SystemResourceAllocator R;
    private final ColorPaletteRenderer Y;
    private final ff F;

    @Override
    public void g() {
        try {
            if (this.s()) {
                this.Y.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceConfigurationManager.a(customSystemException);
        }
    }

    @Override
    public void j() {
        this.Y.c();
    }

    @Override
    public double z() {
        return 14.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void E() {
        this.F.b(this.G());
        this.F.M(this.W());
        this.F.r(0.5f);
        this.F.k(8.0f);
        this.F.w(8.0f);
        this.F.T(this.w());
        this.F.w(this.b());
        super.E();
    }

    ResourceConfigurationManager(SystemResourceAllocator systemResourceAllocator, CloneableResourceDescriptor cloneableResourceDescriptor) {
        this.R = systemResourceAllocator;
        this.Y = new ColorPaletteRenderer(0.15, ResourceConfigurationManager.M.m, ResourceConfigurationManager.M.N);
        this.F = new ff(cloneableResourceDescriptor);
        this.n(true);
        this.o(this.F);
    }

    @Override
    public double e() {
        return 14.0;
    }

    @Override
    public void G() {
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), this.Y.k());
    }
}

