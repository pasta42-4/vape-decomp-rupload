/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import a.eF;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

public interface ConnectionEstablishmentContract {
    public void o(RuntimeDescriptorParser var1, ComplexEntityLifecycleManager var2, eF var3) throws CompilationDiagnosticException;

    public void u(ReflectionMetadataExtractor var1, eF var2) throws CompilationDiagnosticException;
}

