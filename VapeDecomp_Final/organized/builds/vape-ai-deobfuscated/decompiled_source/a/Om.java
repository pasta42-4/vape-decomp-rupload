/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.runtime.context.LightweightExecutionContext;

public interface Om {
    default public void W(float f, float f2, int n, int n2, float f3, boolean bl) {
        this.m(f, f2, n, n2, f3);
    }

    public void V(LightweightExecutionContext var1, float var2);

    public void P();

    public void m(float var1, float var2, int var3, int var4, float var5);
}

