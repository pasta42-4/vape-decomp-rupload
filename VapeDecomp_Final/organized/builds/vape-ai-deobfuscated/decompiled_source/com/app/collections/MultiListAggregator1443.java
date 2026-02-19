/*
 * Decompiled with CFR 0.152.
 */
package com.app.collections;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.event.scheduling.EventScheduler;
import java.util.ArrayList;
import java.util.List;

public class MultiListAggregator1443
extends ConfigurationProfileResolver<List<EventScheduler>, MultiListAggregator1443> {
    public List<EventScheduler> Q() {
        return null;
    }

    @Override
    public MultiListAggregator1443 S() {
        return new MultiListAggregator1443(null, this.x());
    }

    public MultiListAggregator1443(Object object, String string) {
        super(object, string, new ArrayList());
    }

    @Override
    public void i(String string) {
    }

    public void Z(List<EventScheduler> list) {
    }
}

