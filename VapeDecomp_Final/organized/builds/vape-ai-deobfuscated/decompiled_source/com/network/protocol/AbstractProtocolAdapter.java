/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.network.protocol;

import com.data.organization.StringCollectionOrganizer;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public class AbstractProtocolAdapter
extends StringCollectionOrganizer {
    @Override
    public @UnmodifiableView List<String> m() {
        return new ArrayList<String>(TemporalMetadataResolver.h.u().f());
    }
}

