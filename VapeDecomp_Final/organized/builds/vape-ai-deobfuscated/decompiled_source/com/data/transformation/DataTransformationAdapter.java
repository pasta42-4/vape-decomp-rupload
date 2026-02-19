/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.data.transformation;

import a.Qh;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.organization.StringCollectionOrganizer;
import com.exception.system.CustomSystemException;
import com.network.config.ConnectionConfigurationResolver;
import com.reflection.metadata.ReflectionMetadataResolver;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public class DataTransformationAdapter
extends StringCollectionOrganizer {
    @Override
    public @UnmodifiableView List<String> m() {
        ArrayList<String> arrayList = new ArrayList<String>();
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return arrayList;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationAdapter.a(customSystemException);
        }
        for (Object e : connectionConfigurationResolver.M()) {
            try {
                if (!ReflectionMetadataResolver.UQ.isInstance(e)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationAdapter.a(customSystemException);
            }
            Qh qh = new Qh(e);
            arrayList.add(qh.e());
        }
        return arrayList;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

