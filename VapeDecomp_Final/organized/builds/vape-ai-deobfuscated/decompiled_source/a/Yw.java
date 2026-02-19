/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package a;

import com.exception.system.CustomSystemException;
import com.resource.management.CloneableResourceDescriptor;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicInterface;
import com.security.session.CryptographicSessionManager;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface Yw {
    public void O();

    default public boolean d(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block5: {
            block4: {
                CryptographicSessionManager cryptographicSessionManager = this.G();
                try {
                    try {
                        if (cryptographicSessionManager != null && !cryptographicSessionManager.h(lightweightExecutionContext)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Yw.c(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw Yw.c(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void R();

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public UUID O();

    @NotNull
    public CryptographicInterface r();

    public CryptographicInterface Z();

    public void e(@Nullable CryptographicSessionManager var1);

    @Nullable
    public CryptographicSessionManager G();

    public void T(@Nullable CryptographicInterface var1);

    public CloneableResourceDescriptor A();
}

