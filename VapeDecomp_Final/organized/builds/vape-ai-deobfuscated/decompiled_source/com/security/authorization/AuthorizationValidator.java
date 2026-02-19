/*
 * Decompiled with CFR 0.152.
 */
package com.security.authorization;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.data.serialization.SerializationContext;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.logging.audit.AuditTrailLogger;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.network.messaging.TransmissionPayload;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class AuthorizationValidator
implements ConnectionEstablishmentContract {
    final String y;
    final ArgumentInterceptor R;
    final String x;

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        CryptographicPrimitiveManager cryptographicPrimitiveManager = CryptographicPrimitiveManager.n(35, new TransmissionPayload(this.y), new SerializationContext(this.x));
        cryptographicPrimitiveManager = AuditTrailLogger.e(cryptographicPrimitiveManager, eF2);
        cryptographicPrimitiveManager.z(reflectionMetadataExtractor);
        reflectionMetadataExtractor.Y();
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        CryptographicPrimitiveManager cryptographicPrimitiveManager = CryptographicPrimitiveManager.n(35, new TransmissionPayload(this.y), new SerializationContext(this.x));
        cryptographicPrimitiveManager = AuditTrailLogger.e(cryptographicPrimitiveManager, eF2);
        runtimeDescriptorParser.p(cryptographicPrimitiveManager);
        runtimeDescriptorParser.A();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    AuthorizationValidator(ArgumentInterceptor argumentInterceptor, String string, String string2) {
        this.R = argumentInterceptor;
        this.y = string;
        this.x = string2;
    }
}

