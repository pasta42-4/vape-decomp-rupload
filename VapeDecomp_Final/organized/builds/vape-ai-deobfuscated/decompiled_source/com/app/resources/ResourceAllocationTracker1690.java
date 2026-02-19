/*
 * Decompiled with CFR 0.152.
 */
package com.app.resources;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.exception.system.CustomSystemException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ResourceAllocationTracker1690 {
    public static final ResourceAllocationTracker1690 H = new ResourceAllocationTracker1690();
    private final Map<Class<? extends BytecodeTransformer>, List<Consumer<BytecodeTransformer>>> K = new LinkedHashMap<Class<? extends BytecodeTransformer>, List<Consumer<BytecodeTransformer>>>();

    public <T extends BytecodeTransformer> void E(T t) {
        List<Consumer<BytecodeTransformer>> list = this.K.get(t.getClass());
        try {
            if (list == null) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw ResourceAllocationTracker1690.a(throwable);
        }
        try {
            for (Consumer<BytecodeTransformer> consumer : list) {
                consumer.accept(t);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static List lambda$listen$0(Consumer consumer, Class clazz, List list) {
        List list2;
        try {
            list2 = list != null ? list : new ArrayList();
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1690.a(customSystemException);
        }
        List list3 = list2;
        list3.add(consumer);
        return list3;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public <T extends BytecodeTransformer> void t(Class<T> clazz, Consumer<T> consumer) {
        this.K.compute(clazz, (arg_0, arg_1) -> ResourceAllocationTracker1690.lambda$listen$0(consumer, arg_0, arg_1));
    }
}

