/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.system.transformation;

import a.HN;
import a.Y5;
import a.s;
import com.app.configuration.ConfigurationDescriptor;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.core.reflection.ReflectionUtilityResolver910;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1006;
import com.network.protocol.ProtocolInteractionController;
import com.network.security.SecurityContextManager;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.CryptoContextManager989;
import com.security.operations.CryptographicOperationCoordinator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public class DataTransformationUtility {
    private static final Map<ConfigurationDescriptor, List<PluginLifecycleContract>> u;
    private static final Map<String, PluginLifecycleContract> K;

    public static void Z(PluginLifecycleContract pluginLifecycleContract) {
        K.put(pluginLifecycleContract.w(), pluginLifecycleContract);
        u.computeIfAbsent(pluginLifecycleContract.j(), DataTransformationUtility::lambda$register$0).add(pluginLifecycleContract);
    }

    public static @UnmodifiableView Collection<PluginLifecycleContract> i() {
        return K.values();
    }

    @Nullable
    public static PluginLifecycleContract u(LightweightExecutionContext lightweightExecutionContext) {
        PluginLifecycleContract pluginLifecycleContract;
        try {
            if (lightweightExecutionContext.Y()) {
                return Y5.b;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationUtility.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (protocolInteractionController.Y()) {
                return Y5.b;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationUtility.a(customSystemException);
        }
        ArrayList<PluginLifecycleContract> arrayList = new ArrayList<PluginLifecycleContract>();
        for (PluginLifecycleContract pluginLifecycleContract2 : K.values()) {
            try {
                if (!pluginLifecycleContract2.L(lightweightExecutionContext, lightweightExecutionContext.C())) continue;
                arrayList.add(pluginLifecycleContract2);
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationUtility.a(customSystemException);
            }
        }
        try {
            arrayList.sort(DataTransformationUtility::lambda$getByItemStack$1);
            Collections.reverse(arrayList);
            pluginLifecycleContract = arrayList.isEmpty() ? null : (PluginLifecycleContract)arrayList.get(0);
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationUtility.a(customSystemException);
        }
        return pluginLifecycleContract;
    }

    private static int lambda$getByItemStack$1(PluginLifecycleContract pluginLifecycleContract, PluginLifecycleContract pluginLifecycleContract2) {
        boolean bl;
        boolean bl2;
        try {
            bl2 = pluginLifecycleContract.k() != null;
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationUtility.a(customSystemException);
        }
        try {
            bl = pluginLifecycleContract2.k() != null;
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationUtility.a(customSystemException);
        }
        return Boolean.compare(bl2, bl);
    }

    @Nullable
    public static PluginLifecycleContract d(String string) {
        return K.get(string);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static @UnmodifiableView List<PluginLifecycleContract> n(ConfigurationDescriptor configurationDescriptor) {
        return u.get(configurationDescriptor);
    }

    private static List lambda$register$0(ConfigurationDescriptor configurationDescriptor) {
        return new ArrayList();
    }

    static {
        K = new LinkedHashMap<String, PluginLifecycleContract>();
        u = new LinkedHashMap<ConfigurationDescriptor, List<PluginLifecycleContract>>();
        ReflectionUtilityResolver910.l();
        NetworkProtocolEncoder1006.s();
        CryptoContextManager989.z();
        s.n();
        SecurityContextManager.t();
        HN.C();
        CryptographicOperationCoordinator.R();
    }
}

