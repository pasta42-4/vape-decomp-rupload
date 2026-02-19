/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.system.resource;

import a.Ne;
import a.tl;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.obfuscation.NumericScrambler;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicSessionController;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.lwjgl.opengl.GL11;

public class ResourceAllocationTracker1227 {
    private int J;
    private int W = -1;
    private int t;
    private static int e;
    private boolean X = false;

    static {
        if (ResourceAllocationTracker1227.x() == 0) {
            ResourceAllocationTracker1227.h(87);
        }
    }

    public void Z(int n, int n2) {
        block4: {
            double d2 = TemporalMetadataResolver.h.a().b();
            n = (int)((double)n * d2);
            n2 = (int)((double)n2 * d2);
            try {
                try {
                    if (this.J != n || this.t != n2) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker1227.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker1227.a(customSystemException);
            }
        }
        this.J = n;
        this.t = n2;
        this.X = false;
    }

    public void q(int n, int n2, float f, float f2) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine;
        Supplier<Void> supplier;
        int n3;
        try {
            if (!ApplicationLifecycleManager.N().s()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1227.a(customSystemException);
        }
        float f3 = 2.0f;
        double d2 = TemporalMetadataResolver.h.a().b();
        n = (int)((double)n * d2);
        n2 = (int)((double)n2 * d2);
        int n4 = ApplicationLifecycleManager.b();
        int n5 = (int)((float)n4 - (float)n2 * f3 - (float)this.t);
        try {
            if (!this.X) {
                this.q();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1227.a(customSystemException);
        }
        float f4 = 0.5f;
        f4 = (float)((double)f4 / d2);
        try {
            Ne.h.z();
            if (!ConfigurationManager.U()) {
                Ne.h.x(f4, f4, f4);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1227.a(customSystemException);
        }
        try {
            if (!ConfigurationManager.U()) {
                GL11.glBindTexture((int)3553, (int)this.W);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1227.a(customSystemException);
        }
        if (ConfigurationManager.U()) {
            block24: {
                n3 = n;
                supplier = () -> this.lambda$renderBlur$0(n3, f3, n5);
                try {
                    try {
                        if (this.J != 0 && this.t != 0) break block24;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker1227.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker1227.a(customSystemException);
                }
            }
            runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().Q(supplier).D(new NumericScrambler(this.W)).E(n, n2, (float)this.J / 2.0f, (float)this.t / 2.0f, f, f2, 1.0f, 0.0f);
            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
        } else {
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n * f3)), (int)n5, (int)this.J, (int)this.t);
            ConfigurationManager.g((float)n * f3, (float)n2 * f3, this.J, this.t, f, f2, 1.0f, 0);
        }
        if (ConfigurationManager.U()) {
            block25: {
                n3 = n;
                supplier = () -> this.lambda$renderBlur$1(n3, f3, n5);
                try {
                    try {
                        if (this.J != 0 && this.t != 0) break block25;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker1227.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker1227.a(customSystemException);
                }
            }
            runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().Q(supplier).D(new NumericScrambler(this.W)).E(n, n2, (float)this.J / 2.0f, (float)this.t / 2.0f, f, f2, 1.0f, 1.0f);
            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
        } else {
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n * f3)), (int)n5, (int)this.J, (int)this.t);
            ConfigurationManager.g((float)n * f3, (float)n2 * f3, this.J, this.t, f, f2, 1.0f, 1);
        }
        Ne.h.X();
        tl.O(0);
    }

    public static void h(int n) {
        e = n;
    }

    private void q() {
        this.W = GL11.glGenTextures();
        GL11.glBindTexture((int)3553, (int)this.W);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glTexImage2D((int)3553, (int)0, (int)6407, (int)this.J, (int)this.t, (int)0, (int)6407, (int)5121, (ByteBuffer)null);
        this.X = true;
    }

    public static int x() {
        return e;
    }

    public static int I() {
        int n = ResourceAllocationTracker1227.x();
        try {
            if (n == 0) {
                return 66;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1227.a(customSystemException);
        }
        return 0;
    }

    private Void lambda$renderBlur$1(int n, float f, int n2) {
        GL11.glBindTexture((int)3553, (int)this.W);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n * f)), (int)n2, (int)this.J, (int)this.t);
        return null;
    }

    private Void lambda$renderBlur$0(int n, float f, int n2) {
        GL11.glBindTexture((int)3553, (int)this.W);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)((float)n * f)), (int)n2, (int)this.J, (int)this.t);
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ResourceAllocationTracker1227(int n, int n2) {
        this.J = n;
        this.t = n2;
    }
}

