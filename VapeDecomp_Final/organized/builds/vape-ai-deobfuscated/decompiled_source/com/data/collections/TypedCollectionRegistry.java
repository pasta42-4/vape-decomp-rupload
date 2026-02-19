/*
 * Decompiled with CFR 0.152.
 */
package com.data.collections;

import com.network.connection.NetworkConnectionDescriptor;
import java.util.ArrayList;
import java.util.Collection;

class TypedCollectionRegistry
extends ArrayList<C> {
    final NetworkConnectionDescriptor w;

    @Override
    public boolean remove(Object object) {
        return super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public boolean add(C c) {
        return super.add(c);
    }

    TypedCollectionRegistry(NetworkConnectionDescriptor networkConnectionDescriptor, Collection collection) {
        this.w = networkConnectionDescriptor;
        super(collection);
    }
}

