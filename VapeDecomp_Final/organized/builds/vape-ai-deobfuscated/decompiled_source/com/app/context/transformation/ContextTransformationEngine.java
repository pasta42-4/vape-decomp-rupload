/*
 * Decompiled with CFR 0.152.
 */
package com.app.context.transformation;

import com.app.events.EventNotificationBroker2314;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;
import java.util.function.Predicate;

public class ContextTransformationEngine<T extends ContextualExecutionFramework>
extends ContextualExecutionFramework {
    private static int[] w;
    private boolean b;
    private final ContextualExecutionFramework F;
    private final GenericComponentMapper X;

    public static int[] J() {
        return w;
    }

    public ContextTransformationEngine(ContextualExecutionFramework contextualExecutionFramework, String string) {
        this(contextualExecutionFramework, string, true);
    }

    @Override
    protected Predicate<EventNotificationBroker2314> V() {
        return this::lambda$getEventPredicate$0;
    }

    public boolean O() {
        return super.Z();
    }

    public T n() {
        return (T)this.F;
    }

    public boolean X() {
        return this.b;
    }

    static {
        if (ContextTransformationEngine.J() == null) {
            ContextTransformationEngine.N(new int[4]);
        }
    }

    public static void N(int[] nArray) {
        w = nArray;
    }

    private boolean lambda$getEventPredicate$0(EventNotificationBroker2314 eventNotificationBroker2314) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.W()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextTransformationEngine.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextTransformationEngine.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ContextTransformationEngine(ContextualExecutionFramework contextualExecutionFramework, String string, boolean bl) {
        super(string);
        this.F = contextualExecutionFramework;
        this.b = bl;
        this.X = new GenericComponentMapper<ContextTransformationEngine>(this);
    }

    public GenericComponentMapper w() {
        return this.X;
    }

    public boolean W() {
        return this.X.o();
    }
}

