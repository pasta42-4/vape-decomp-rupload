/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.data.transformation;

import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public interface DataTransformationProtocol1874 {
    public void I(boolean var1);

    public void b(@Nullable Comparator<String> var1);

    public @UnmodifiableView List<String> m();

    @Nullable
    public Comparator<String> C();

    public boolean e();

    public @UnmodifiableView List<String> U();

    public void R(String var1);
}

