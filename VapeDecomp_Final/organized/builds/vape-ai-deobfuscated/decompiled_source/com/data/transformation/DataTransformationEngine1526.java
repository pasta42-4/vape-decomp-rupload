/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver1493;
import com.security.obfuscation.DataObfuscator;
import com.system.component.ComponentRegistryManager;
import com.system.resource.ResourceAllocationTracker144;
import java.util.List;

public class DataTransformationEngine1526
extends ReflectionMetadataResolver1493 {
    private final DataObfuscator[] D;
    private static String[] l;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String[] B() {
        return l;
    }

    public DataTransformationEngine1526(Class clazz, DataObfuscator ... dataObfuscatorArray) {
        super(clazz);
        this.D = dataObfuscatorArray;
    }

    @Override
    public boolean A(ResourceAllocationTracker144 resourceAllocationTracker144) {
        boolean bl;
        ComponentRegistryManager componentRegistryManager = this.E(resourceAllocationTracker144);
        int n = 0;
        int n2 = 0;
        List<DataObfuscator> list = componentRegistryManager.T();
        block4: for (DataObfuscator dataObfuscator : this.D) {
            for (int i = n2; i < list.size(); ++i) {
                n2 = i;
                DataObfuscator dataObfuscator2 = list.get(i);
                try {
                    if (!dataObfuscator.P(dataObfuscator2)) continue;
                    ++n;
                    continue block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine1526.a(customSystemException);
                }
            }
        }
        try {
            bl = n == this.D.length;
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1526.a(customSystemException);
        }
        boolean bl2 = bl;
        return bl2;
    }

    static {
        if (DataTransformationEngine1526.B() == null) {
            DataTransformationEngine1526.m(new String[4]);
        }
    }

    public static void m(String[] stringArray) {
        l = stringArray;
    }
}

