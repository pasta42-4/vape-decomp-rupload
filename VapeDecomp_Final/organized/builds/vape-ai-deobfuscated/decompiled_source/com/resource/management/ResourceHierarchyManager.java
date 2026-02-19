/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.exception.system.CustomSystemException;
import com.metadata.introspection.MetadataIntrospectionEngine;
import com.util.serialization.SerializationUtility2100;

class ResourceHierarchyManager
extends SerializationUtility2100 {
    private SerializationUtility2100 O = this;
    private SerializationUtility2100 v;
    private SerializationUtility2100 d = this;

    SerializationUtility2100 b() {
        return this.d;
    }

    SerializationUtility2100 Q() {
        return this.v;
    }

    SerializationUtility2100 O() {
        return this;
    }

    @Override
    public int A() {
        return 0;
    }

    SerializationUtility2100 s() {
        return this.d;
    }

    ResourceHierarchyManager(MetadataIntrospectionEngine metadataIntrospectionEngine) {
        super(metadataIntrospectionEngine);
        this.v = this;
        this.v.n = this;
    }

    void F(SerializationUtility2100 serializationUtility2100) {
        serializationUtility2100.n = this;
        this.v.n = serializationUtility2100;
        this.v = serializationUtility2100;
    }

    void U(SerializationUtility2100 serializationUtility2100) {
        block4: {
            try {
                try {
                    serializationUtility2100.n = this.O.n;
                    this.O.n = serializationUtility2100;
                    if (this.O != this.d) break block4;
                    this.d = serializationUtility2100;
                    if (this.O != this.v) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceHierarchyManager.a(customSystemException);
                }
                this.v = serializationUtility2100;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceHierarchyManager.a(customSystemException);
            }
        }
        this.O = serializationUtility2100;
    }

    void l(SerializationUtility2100 serializationUtility2100) {
        try {
            serializationUtility2100.n = this.d.n;
            this.d.n = serializationUtility2100;
            if (this.d == this.v) {
                this.v = serializationUtility2100;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceHierarchyManager.a(customSystemException);
        }
        this.d = serializationUtility2100;
    }

    SerializationUtility2100 x() {
        return this.O;
    }

    @Override
    public String l() {
        return null;
    }

    @Override
    public String I() {
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    SerializationUtility2100 S() {
        return this.O;
    }

    @Override
    protected void r(StringBuilder stringBuilder) {
    }

    static int z(SerializationUtility2100 serializationUtility2100, SerializationUtility2100 serializationUtility21002) {
        int n = 0;
        while (serializationUtility2100 != serializationUtility21002) {
            ++n;
            serializationUtility2100 = serializationUtility2100.n;
        }
        return n;
    }
}

