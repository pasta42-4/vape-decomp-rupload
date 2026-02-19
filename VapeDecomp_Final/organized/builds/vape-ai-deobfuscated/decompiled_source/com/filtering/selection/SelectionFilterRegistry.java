/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.filtering.selection;

import a.Qh;
import com.algorithm.bitmanipulation.BitwiseOperationResolver;
import com.communication.protocol.DataExchangeProtocol2090;
import com.event.dispatch.EventDispatchController1028;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.game.event.GameStateEventEmitter;
import com.math.transformation.NumericTransformationService;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.configuration.NetworkConfigManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.transform.CryptographicTransformer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

public class SelectionFilterRegistry
implements NetworkConfigurationResolver2717 {
    private final HashSet<Integer> o;
    private final NetworkConfigManager P;
    private final HashMap<Long, NumericTransformationService> p = new HashMap();
    public static final SelectionFilterRegistry Y = new SelectionFilterRegistry();
    private final HashMap<Long, Long> V;

    @Nullable
    public NumericTransformationService m(Qh qh) {
        long l = BitwiseOperationResolver.b(qh);
        try {
            this.V.put(l, System.currentTimeMillis());
            if (!this.p.containsKey(l)) {
                this.o.add(qh.X());
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SelectionFilterRegistry.a(customSystemException);
        }
        return this.p.get(l);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void g() {
        this.p.clear();
        this.o.clear();
        this.V.clear();
    }

    public SelectionFilterRegistry() {
        this.o = new HashSet();
        this.V = new HashMap();
        this.P = new NetworkConfigManager();
    }

    private void c(GameStateEventEmitter gameStateEventEmitter) {
        Object object;
        if (this.P.m(1000L)) {
            ArrayList arrayList = new ArrayList();
            for (Long l : this.V.keySet()) {
                if (System.currentTimeMillis() - this.V.get(l) <= 10000L) continue;
                object = this.p.get(l);
                try {
                    if (object == null) continue;
                    arrayList.add(l);
                }
                catch (CustomSystemException customSystemException) {
                    throw SelectionFilterRegistry.a(customSystemException);
                }
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                Long l = (Long)iterator.next();
                object = this.p.get(l);
                try {
                    if (object != null) {
                        ((NumericTransformationService)object).F().k();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SelectionFilterRegistry.a(customSystemException);
                }
                this.p.remove(l);
                this.V.remove(l);
            }
        }
        for (Integer n : this.o) {
            CryptographicTransformer cryptographicTransformer = gameStateEventEmitter.getWorld().I(n);
            try {
                if (!cryptographicTransformer.r() || !cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw SelectionFilterRegistry.a(customSystemException);
            }
            object = new Qh(cryptographicTransformer);
            long l = BitwiseOperationResolver.b((Qh)object);
            this.p.put(l, NumericTransformationService.g((Qh)object));
        }
        this.o.clear();
    }

    @DataExchangeProtocol2090
    public void M(EventTriggerEngine eventTriggerEngine) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SelectionFilterRegistry.a(customSystemException);
        }
        try {
            if (eventTriggerEngine.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SelectionFilterRegistry.a(customSystemException);
        }
        this.c(eventTriggerEngine);
    }

    @DataExchangeProtocol2090
    public void g(EventDispatchController1028 eventDispatchController1028) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SelectionFilterRegistry.a(customSystemException);
        }
        try {
            if (eventDispatchController1028.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SelectionFilterRegistry.a(customSystemException);
        }
        this.c(eventDispatchController1028);
    }
}

