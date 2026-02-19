/*
 * Decompiled with CFR 0.152.
 */
package com.system.cache;

import com.app.resource.ResourceIdentifier;
import com.core.exception.CustomRuntimeException;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.registry.MetaclassDefinitionRegistry;

final class CacheStrategyManager
extends MetaclassDefinitionRegistry {
    protected ClassPoolRegistry Y;
    private MetaclassDefinitionRegistry[] m = null;

    private static CustomRuntimeException a(CustomRuntimeException customRuntimeException) {
        return customRuntimeException;
    }

    @Override
    public MetaclassDefinitionRegistry G() throws CustomRuntimeException {
        return this.Y.g("java.lang.Object");
    }

    @Override
    public MetaclassDefinitionRegistry[] l() throws CustomRuntimeException {
        if (this.m == null) {
            Class<?>[] classArray = Object[].class.getInterfaces();
            this.m = new MetaclassDefinitionRegistry[classArray.length];
            try {
                for (int i = 0; i < classArray.length; ++i) {
                    this.m[i] = this.Y.g(classArray[i].getName());
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw CacheStrategyManager.a(customRuntimeException);
            }
        }
        return this.m;
    }

    @Override
    public ClassPoolRegistry K() {
        return this.Y;
    }

    @Override
    public boolean p() {
        return true;
    }

    @Override
    public MetaclassDefinitionRegistry r() throws CustomRuntimeException {
        String string = this.H();
        return this.Y.g(string.substring(0, string.length() - 2));
    }

    @Override
    public boolean t(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CustomRuntimeException {
        boolean bl;
        block17: {
            block16: {
                try {
                    if (super.t(metaclassDefinitionRegistry)) {
                        return true;
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CacheStrategyManager.a(customRuntimeException);
                }
                String string = metaclassDefinitionRegistry.H();
                try {
                    if (string.equals("java.lang.Object")) {
                        return true;
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CacheStrategyManager.a(customRuntimeException);
                }
                MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = this.l();
                int n = 0;
                while (true) {
                    block15: {
                        try {
                            try {
                                if (n >= metaclassDefinitionRegistryArray.length) break;
                                if (!metaclassDefinitionRegistryArray[n].t(metaclassDefinitionRegistry)) break block15;
                            }
                            catch (CustomRuntimeException customRuntimeException) {
                                throw CacheStrategyManager.a(customRuntimeException);
                            }
                            return true;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw CacheStrategyManager.a(customRuntimeException);
                        }
                    }
                    ++n;
                }
                try {
                    try {
                        if (!metaclassDefinitionRegistry.p() || !this.r().t(metaclassDefinitionRegistry.r())) break block16;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw CacheStrategyManager.a(customRuntimeException);
                    }
                    bl = true;
                    break block17;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CacheStrategyManager.a(customRuntimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public ResourceIdentifier H(String string, String string2) throws CustomRuntimeException {
        return this.G().H(string, string2);
    }

    @Override
    public int a() {
        int n = 16;
        try {
            n |= this.r().a() & 7;
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        return n;
    }

    CacheStrategyManager(String string, ClassPoolRegistry classPoolRegistry) {
        super(string);
        this.Y = classPoolRegistry;
    }
}

