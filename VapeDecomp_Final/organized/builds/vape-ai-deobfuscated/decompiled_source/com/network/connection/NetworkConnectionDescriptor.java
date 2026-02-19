/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.Nullable
 */
package com.network.connection;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.collections.TypedCollectionRegistry;
import com.data.transformation.DataTransformationProtocol1874;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public abstract class NetworkConnectionDescriptor<C, T extends NetworkConnectionDescriptor<C, T>>
extends ConfigurationProfileResolver<List<C>, T> {
    private final String o;
    @Nullable
    private DataTransformationProtocol1874 T;

    public List<C> G() {
        return new ArrayList((Collection)this.J());
    }

    @Override
    public String O() {
        return this.o;
    }

    public NetworkConnectionDescriptor(Object object, String string, String string2, List<C> list) {
        super(object, string, ImmutableList.copyOf(list));
        this.d(new TypedCollectionRegistry(this, list));
        this.o = string2;
    }

    @Nullable
    public DataTransformationProtocol1874 M() {
        return this.T;
    }

    public abstract C J(String var1, int var2);

    public T U(DataTransformationProtocol1874 dataTransformationProtocol1874) {
        this.T = dataTransformationProtocol1874;
        return (T)this;
    }

    public NetworkConnectionDescriptor(Object object, String string, String string2) {
        this(object, string, string2, new ArrayList());
    }
}

