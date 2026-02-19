/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.instrumentation;

import com.app.bytecode.analysis.BytecodeMetadataExtractor;
import com.app.database.operations.DatabaseStatementHandler;
import com.app.network.ConnectionEstablishmentContract;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.compiler.parsing.SyntaxTokenizer;
import com.data.persistence.PersistenceRecord;
import com.decompiler.diagnostics.DecompilationErrorAnalyzer;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.network.connection.NetworkConnectionHandler1562;
import com.network.connection.NetworkConnectionManager1605;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.security.authorization.AuthorizationValidator;
import com.system.compilation.CompilationDiagnosticException;
import com.system.config.PersistentConfigurationMap;

public class ArgumentInterceptor {
    PersistentConfigurationMap I;
    private ComplexEntityLifecycleManager n;
    RuntimeDescriptorParser z;

    public ComplexEntityLifecycleManager k() {
        return this.n;
    }

    public int n(MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, boolean bl) throws CompilationDiagnosticException {
        return this.z.u(metaclassDefinitionRegistryArray, bl, "$", "$args", "$$", this.I);
    }

    public boolean X(BinaryCodeAnalyzer binaryCodeAnalyzer, int n) throws CompilationDiagnosticException {
        BytecodeMetadataExtractor bytecodeMetadataExtractor = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTable");
        try {
            if (bytecodeMetadataExtractor == null) {
                return false;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ArgumentInterceptor.a(compilationDiagnosticException);
        }
        int n2 = bytecodeMetadataExtractor.o();
        for (int i = 0; i < n2; ++i) {
            int n3 = bytecodeMetadataExtractor.R(i);
            int n4 = bytecodeMetadataExtractor.U(i);
            try {
                try {
                    if (n3 > n || n >= n3 + n4) continue;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ArgumentInterceptor.a(compilationDiagnosticException);
                }
                this.z.N(bytecodeMetadataExtractor.l(i), bytecodeMetadataExtractor.T(i), bytecodeMetadataExtractor.z(i), this.I);
                continue;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ArgumentInterceptor.a(compilationDiagnosticException);
            }
        }
        return true;
    }

    public ArgumentInterceptor(ComplexEntityLifecycleManager complexEntityLifecycleManager, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.z = new RuntimeDescriptorParser(complexEntityLifecycleManager, metaclassDefinitionRegistry, metaclassDefinitionRegistry.K());
        this.I = new PersistentConfigurationMap();
        this.n = complexEntityLifecycleManager;
    }

    public void b(String string) throws CompilationDiagnosticException {
        DecompilationErrorAnalyzer decompilationErrorAnalyzer = new DecompilationErrorAnalyzer(new SyntaxTokenizer(string));
        PersistentConfigurationMap persistentConfigurationMap = new PersistentConfigurationMap(this.I);
        while (decompilationErrorAnalyzer.e()) {
            DatabaseStatementHandler databaseStatementHandler = decompilationErrorAnalyzer.t(persistentConfigurationMap);
            try {
                if (databaseStatementHandler == null) continue;
                databaseStatementHandler.z(this.z);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ArgumentInterceptor.a(compilationDiagnosticException);
            }
        }
    }

    public int W(String string, MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, boolean bl, int n, boolean bl2) throws CompilationDiagnosticException {
        return this.z.k(metaclassDefinitionRegistryArray, bl2, "$", "$args", "$$", bl, n, string, this.I);
    }

    private static CompilationDiagnosticException a(CompilationDiagnosticException compilationDiagnosticException) {
        return compilationDiagnosticException;
    }

    public ArgumentInterceptor(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this(new ComplexEntityLifecycleManager(metaclassDefinitionRegistry.o().X(), 0, 0), metaclassDefinitionRegistry);
    }

    public void O(String string, String string2) throws CompilationDiagnosticException {
        DecompilationErrorAnalyzer decompilationErrorAnalyzer = new DecompilationErrorAnalyzer(new SyntaxTokenizer(string));
        PersistenceRecord persistenceRecord = decompilationErrorAnalyzer.I(this.I);
        String string3 = string2;
        NetworkConnectionManager1605 networkConnectionManager1605 = new NetworkConnectionManager1605(this, string3, persistenceRecord);
        this.z.i(networkConnectionManager1605, "$proceed");
    }

    public void Z(ConnectionEstablishmentContract connectionEstablishmentContract) {
        this.z.i(connectionEstablishmentContract, "$proceed");
    }

    public void z(String string, String string2, String string3, String string4, int n) throws CompilationDiagnosticException {
        DecompilationErrorAnalyzer decompilationErrorAnalyzer = new DecompilationErrorAnalyzer(new SyntaxTokenizer(string));
        PersistenceRecord persistenceRecord = decompilationErrorAnalyzer.I(this.I);
        NetworkConnectionHandler1562 networkConnectionHandler1562 = new NetworkConnectionHandler1562(this, persistenceRecord, n, string4, string2, string3);
        this.z.i(networkConnectionHandler1562, "$proceed");
    }

    public int a(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string) throws CompilationDiagnosticException {
        return this.z.e(metaclassDefinitionRegistry, string, this.I);
    }

    public boolean K(BinaryCodeAnalyzer binaryCodeAnalyzer, int n) throws CompilationDiagnosticException {
        BytecodeMetadataExtractor bytecodeMetadataExtractor = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTable");
        try {
            if (bytecodeMetadataExtractor == null) {
                return false;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ArgumentInterceptor.a(compilationDiagnosticException);
        }
        int n2 = bytecodeMetadataExtractor.o();
        for (int i = 0; i < n2; ++i) {
            int n3 = bytecodeMetadataExtractor.z(i);
            try {
                if (n3 >= n) continue;
                this.z.N(bytecodeMetadataExtractor.l(i), bytecodeMetadataExtractor.T(i), n3, this.I);
                continue;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ArgumentInterceptor.a(compilationDiagnosticException);
            }
        }
        return true;
    }

    public void A(int n) {
        this.z.f(n);
    }

    public void k(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.z.c(metaclassDefinitionRegistry);
    }

    public int Y(MetaclassDefinitionRegistry metaclassDefinitionRegistry, boolean bl) throws CompilationDiagnosticException {
        String string;
        String string2;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry2;
        RuntimeDescriptorParser runtimeDescriptorParser;
        try {
            this.z.c(metaclassDefinitionRegistry);
            runtimeDescriptorParser = this.z;
            metaclassDefinitionRegistry2 = metaclassDefinitionRegistry;
            string2 = "$r";
            string = bl ? "$_" : null;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ArgumentInterceptor.a(compilationDiagnosticException);
        }
        return runtimeDescriptorParser.p(metaclassDefinitionRegistry2, string2, string, this.I);
    }

    public void N(String string, String string2) throws CompilationDiagnosticException {
        String string3 = string;
        String string4 = string2;
        AuthorizationValidator authorizationValidator = new AuthorizationValidator(this, string3, string4);
        this.z.i(authorizationValidator, "$proceed");
    }
}

