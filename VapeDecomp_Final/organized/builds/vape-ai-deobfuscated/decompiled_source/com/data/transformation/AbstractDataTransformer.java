/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.data.transformation;

import com.app.resources.ResourceLifecycleManager1543;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.crypto.CryptoKeyGenerator1867;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.ResourceAllocator1606;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class AbstractDataTransformer {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public static ResourceLifecycleManager1543 K(Class clazz, CryptoKeyGenerator1867 cryptoKeyGenerator1867) {
        return AbstractDataTransformer.R(arg_0 -> AbstractDataTransformer.lambda$findSlot$0(clazz, arg_0), cryptoKeyGenerator1867);
    }

    public static boolean D() {
        return ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ);
    }

    private static boolean lambda$findSlot$0(Class clazz, ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!resourceLifecycleManager1543.r() || !resourceLifecycleManager1543.y().r()) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractDataTransformer.a(customSystemException);
                        }
                        if (!resourceLifecycleManager1543.y().C().B(clazz)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractDataTransformer.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractDataTransformer.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Nullable
    public static ResourceLifecycleManager1543 w(ResourceAllocator1606 resourceAllocator1606, Predicate<ResourceLifecycleManager1543> predicate, int n, int n2) {
        for (ResourceLifecycleManager1543 resourceLifecycleManager1543 : resourceAllocator1606.D()) {
            int n3 = resourceLifecycleManager1543.G();
            try {
                try {
                    try {
                        if (n3 < n || n3 > n2) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractDataTransformer.a(customSystemException);
                    }
                    if (!predicate.test(resourceLifecycleManager1543)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractDataTransformer.a(customSystemException);
                }
                return resourceLifecycleManager1543;
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractDataTransformer.a(customSystemException);
            }
        }
        return null;
    }

    @Nullable
    public static ResourceLifecycleManager1543 R(Predicate<ResourceLifecycleManager1543> predicate, CryptoKeyGenerator1867 cryptoKeyGenerator1867) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractDataTransformer.a(customSystemException);
        }
        ResourceAllocator1606 resourceAllocator1606 = systemConfigurationOrchestrator.t();
        try {
            if (resourceAllocator1606.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractDataTransformer.a(customSystemException);
        }
        return AbstractDataTransformer.w(resourceAllocator1606, predicate, cryptoKeyGenerator1867.A(), cryptoKeyGenerator1867.i());
    }

    public static boolean K() {
        try {
            if (!AbstractDataTransformer.D()) {
                OutputEncoder.r(ApplicationLifecycleManager.N().R(), true, true);
                OutputEncoder.r(ApplicationLifecycleManager.N().R(), false, false);
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractDataTransformer.a(customSystemException);
        }
        return false;
    }

    public static boolean y() {
        return ApplicationLifecycleManager.X().r();
    }

    public static boolean S() {
        block4: {
            block5: {
                try {
                    try {
                        if (!AbstractDataTransformer.y()) break block4;
                        if (!ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Yu)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractDataTransformer.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractDataTransformer.a(customSystemException);
                }
            }
            ApplicationLifecycleManager.U().E();
            return true;
        }
        return false;
    }
}

