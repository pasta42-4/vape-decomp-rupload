/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class GenericTypeInspector<T extends AbstractComputationKernel> {
    private final Class<T> I;
    private static int[] b;

    public static void t(int[] nArray) {
        b = nArray;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (GenericTypeInspector.z() == null) {
            GenericTypeInspector.t(new int[5]);
        }
    }

    public Class<T> g() {
        return this.I;
    }

    public GenericTypeInspector(Class<T> clazz) {
        this.I = clazz;
    }

    public abstract boolean f(T var1);

    public static int[] z() {
        return b;
    }

    public ArrayList<AbstractComputationKernel> h(AbstractComputationKernel abstractComputationKernel) {
        block4: {
            try {
                try {
                    if (!this.g().isInstance(abstractComputationKernel) || !this.f(abstractComputationKernel)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericTypeInspector.b(customSystemException);
                }
                return new ArrayList<AbstractComputationKernel>(Arrays.asList(abstractComputationKernel));
            }
            catch (CustomSystemException customSystemException) {
                throw GenericTypeInspector.b(customSystemException);
            }
        }
        return null;
    }
}

