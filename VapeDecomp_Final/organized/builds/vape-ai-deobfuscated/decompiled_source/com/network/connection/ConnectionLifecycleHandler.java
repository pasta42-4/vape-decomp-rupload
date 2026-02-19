/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.app.system.resources.VirtualResourceAllocator;
import com.data.transform.DataTransformationEngine550;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.state.management.StateTransitionController1864;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.function.Consumer;

public class ConnectionLifecycleHandler
extends ObjectLifecycleTracker {
    private static int[] X;

    static {
        if (ConnectionLifecycleHandler.W() == null) {
            ConnectionLifecycleHandler.D(new int[5]);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void A(ConnectionLifecycleHandler connectionLifecycleHandler, Consumer<ConnectionLifecycleHandler> consumer) {
        block4: {
            block3: {
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H() || !connectionLifecycleHandler.B(ReflectionMetadataResolver.bs)) break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionLifecycleHandler.b(customSystemException);
                }
                StateTransitionController1864 stateTransitionController1864 = new StateTransitionController1864(connectionLifecycleHandler);
                for (ConnectionLifecycleHandler connectionLifecycleHandler2 : stateTransitionController1864.I()) {
                    consumer.accept(connectionLifecycleHandler2);
                }
                break block4;
            }
            consumer.accept(connectionLifecycleHandler);
        }
    }

    public boolean l() {
        return DataTransformationEngine550.W(ConnectionLifecycleHandler.U.u().Lh, this.H);
    }

    public void p(VirtualResourceAllocator virtualResourceAllocator) {
        DataTransformationEngine550.i(ConnectionLifecycleHandler.U.u().Lh, this.H, virtualResourceAllocator.M());
    }

    public static void D(int[] nArray) {
        X = nArray;
    }

    public static int[] W() {
        return X;
    }

    public ConnectionLifecycleHandler(Object object) {
        super(object);
    }
}

