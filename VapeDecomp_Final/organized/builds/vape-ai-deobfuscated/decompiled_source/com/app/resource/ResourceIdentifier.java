/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource;

import a._c;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;

public final class ResourceIdentifier
extends _c {
    protected String r = null;

    public boolean equals(Object object) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (object == null || !(object instanceof ResourceIdentifier)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceIdentifier.a(customSystemException);
                        }
                        if (!((ResourceIdentifier)object).v().equals(this.v())) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceIdentifier.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceIdentifier.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    final String v() {
        try {
            if (this.r == null) {
                this.r = this.G.C() + ReflectionMetadataResolver933.t(this.G.b());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceIdentifier.a(customSystemException);
        }
        return this.r;
    }

    ResourceIdentifier(BytecodeInspectionEngine bytecodeInspectionEngine, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        super(metaclassDefinitionRegistry, bytecodeInspectionEngine);
    }

    public int hashCode() {
        return this.v().hashCode();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String l() {
        return this.G.C();
    }
}

