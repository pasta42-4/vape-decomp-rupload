/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.constants.CipherConfigurationMode;
import com.security.tokens.SecurityTokenGenerator1999;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hQ
extends AbstractComputationKernel {
    private List<OperationExecutionInterface> R;
    private Color E;
    SecurityTokenGenerator1999 B = new SecurityTokenGenerator1999();
    private static AbstractComputationKernel[] v;
    private boolean F = false;
    private Color n;

    private static void lambda$setSingleFutureListener$1(AtomicBoolean atomicBoolean, Supplier supplier) {
        try {
            if (!atomicBoolean.get()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hQ.e(customSystemException);
        }
        CompletableFuture completableFuture = (CompletableFuture)supplier.get();
        try {
            if (completableFuture == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hQ.e(customSystemException);
        }
        atomicBoolean.set(false);
        completableFuture.whenCompleteAsync((arg_0, arg_1) -> hQ.lambda$null$0(atomicBoolean, arg_0, arg_1));
    }

    public static AbstractComputationKernel[] G() {
        return v;
    }

    public void l() {
        for (OperationExecutionInterface operationExecutionInterface : this.R) {
            operationExecutionInterface.R();
        }
    }

    public void b(boolean bl) {
        this.F = bl;
    }

    public Color H() {
        return this.E;
    }

    public void z(OperationExecutionInterface operationExecutionInterface) {
        this.R.remove(operationExecutionInterface);
    }

    public void R(Color color) {
        this.n = color;
    }

    public void Y() {
        for (OperationExecutionInterface operationExecutionInterface : this.R) {
            operationExecutionInterface.O();
        }
    }

    private static void lambda$null$0(AtomicBoolean atomicBoolean, Object object, Throwable throwable) {
        try {
            atomicBoolean.set(true);
            if (throwable != null) {
                TemporalMetadataResolver.W(throwable);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hQ.e(customSystemException);
        }
    }

    @Override
    public boolean s() {
        try {
            if (this.F) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hQ.e(customSystemException);
        }
        return super.s();
    }

    static {
        if (hQ.G() != null) {
            hQ.r(new AbstractComputationKernel[2]);
        }
    }

    public hQ N(OperationExecutionInterface operationExecutionInterface) {
        this.R.add(operationExecutionInterface);
        return this;
    }

    public SecurityTokenGenerator1999 P() {
        return this.B;
    }

    private static CustomSystemException e(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Color y() {
        return this.n;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block13: {
            block14: {
                try {
                    if (this.B.p()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw hQ.e(customSystemException);
                }
                try {
                    if (this.F) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw hQ.e(customSystemException);
                }
                try {
                    try {
                        if (!this.f()) break block13;
                        if (!userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw hQ.e(customSystemException);
                    }
                    this.l();
                }
                catch (CustomSystemException customSystemException) {
                    throw hQ.e(customSystemException);
                }
            }
            try {
                if (userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.RIGHT_CLICK)) {
                    this.Y();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw hQ.e(customSystemException);
            }
        }
        this.B.N(true);
    }

    public void y() {
        this.R.clear();
    }

    public hQ() {
        this.R = new ArrayList<OperationExecutionInterface>();
    }

    public hQ f(Supplier<@Nullable CompletableFuture<?>> supplier) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.C(() -> hQ.lambda$setSingleFutureListener$1(atomicBoolean, supplier));
        return this;
    }

    public static void r(AbstractComputationKernel[] abstractComputationKernelArray) {
        v = abstractComputationKernelArray;
    }

    public void H(Color color) {
        this.E = color;
    }

    public List<OperationExecutionInterface> a() {
        return this.R;
    }

    public void C(@Nullable OperationExecutionInterface operationExecutionInterface) {
        try {
            this.R = new ArrayList<OperationExecutionInterface>();
            if (operationExecutionInterface != null) {
                this.R.add(operationExecutionInterface);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hQ.e(customSystemException);
        }
    }
}

