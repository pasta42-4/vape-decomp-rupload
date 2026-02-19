/*
 * Decompiled with CFR 0.152.
 */
package com.diagnostics.error;

import a._0;
import com.app.configuration.management.ConfigurationStateTracker;
import com.app.element.management.ElementConflictManager;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.analysis.DecompilationErrorHandler;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.core.exception.CustomRuntimeException;
import com.dataprocessing.transformation.DataTransformationEngine1936;
import com.debugging.analysis.ExceptionAnalyzer;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.deobfuscation.io.ByteStreamEncoder;
import com.event.management.EventDispatchCoordinator1708;
import com.network.serialization.SerializableDataContainer;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.mapping.ReflectionClassMapper;
import java.util.ArrayList;

public class ExceptionDiagnosticHandler
extends _0 {
    public static BytecodeExceptionHandler v(ClassPoolRegistry classPoolRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) throws BytecodeProcessingException {
        DecompilationErrorHandler[] decompilationErrorHandlerArray;
        BinaryCodeAnalyzer binaryCodeAnalyzer = bytecodeInspectionEngine.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                return null;
            }
        }
        catch (SerializableDataContainer serializableDataContainer) {
            throw ExceptionDiagnosticHandler.b(serializableDataContainer);
        }
        try {
            decompilationErrorHandlerArray = DecompilationErrorHandler.k(bytecodeInspectionEngine, binaryCodeAnalyzer, true);
        }
        catch (SerializableDataContainer serializableDataContainer) {
            return null;
        }
        try {
            if (decompilationErrorHandlerArray == null) {
                return null;
            }
        }
        catch (SerializableDataContainer serializableDataContainer) {
            throw ExceptionDiagnosticHandler.b(serializableDataContainer);
        }
        ExceptionDiagnosticHandler exceptionDiagnosticHandler = new ExceptionDiagnosticHandler(classPoolRegistry, bytecodeInspectionEngine, binaryCodeAnalyzer);
        try {
            exceptionDiagnosticHandler.L(decompilationErrorHandlerArray, binaryCodeAnalyzer.X());
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new BytecodeProcessingException(bytecodeInspectionEngine, (Throwable)bytecodeProcessingException);
        }
        return exceptionDiagnosticHandler.G(decompilationErrorHandlerArray);
    }

    private void l(DecompilationErrorHandler decompilationErrorHandler, int n, ExceptionAnalyzer[] exceptionAnalyzerArray) throws BytecodeProcessingException {
        int n2 = this.F.length;
        ExceptionAnalyzer[] exceptionAnalyzerArray2 = ExceptionAnalyzer.i(n2);
        int n3 = ExceptionDiagnosticHandler.a(n2, this.F, exceptionAnalyzerArray2);
        decompilationErrorHandler.j(n, exceptionAnalyzerArray, n3, exceptionAnalyzerArray2);
    }

    private ExceptionAnalyzer e(ExceptionAnalyzer exceptionAnalyzer, ExceptionAnalyzer exceptionAnalyzer2) throws BytecodeProcessingException {
        block10: {
            try {
                if (exceptionAnalyzer == exceptionAnalyzer2) {
                    return exceptionAnalyzer2;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
            }
            try {
                try {
                    if (!(exceptionAnalyzer2 instanceof ReflectionClassMapper) && !(exceptionAnalyzer2 instanceof ElementConflictManager)) break block10;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
                }
                return exceptionAnalyzer2;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
            }
        }
        try {
            if (exceptionAnalyzer2 instanceof DataTransformationEngine1936) {
                ((DataTransformationEngine1936)exceptionAnalyzer2).O(exceptionAnalyzer);
                return exceptionAnalyzer2;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
        }
        throw new RuntimeException("fatal: this should never happen");
    }

    public BytecodeExceptionHandler G(DecompilationErrorHandler[] decompilationErrorHandlerArray) {
        EventDispatchCoordinator1708 eventDispatchCoordinator1708 = new EventDispatchCoordinator1708(32);
        int n = decompilationErrorHandlerArray.length;
        DecompilationErrorHandler decompilationErrorHandler = decompilationErrorHandlerArray[0];
        int n2 = decompilationErrorHandler.F;
        try {
            if (decompilationErrorHandler.C > 0) {
                eventDispatchCoordinator1708.a(0);
                --n2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ExceptionDiagnosticHandler.b(runtimeException);
        }
        for (int i = 1; i < n; ++i) {
            DecompilationErrorHandler decompilationErrorHandler2 = decompilationErrorHandlerArray[i];
            if (this.q(decompilationErrorHandler2, decompilationErrorHandlerArray[i - 1])) {
                decompilationErrorHandler2.V();
                int n3 = ExceptionDiagnosticHandler.J(decompilationErrorHandler.w, decompilationErrorHandler.I, decompilationErrorHandler2.w, decompilationErrorHandler2.I);
                this.H(eventDispatchCoordinator1708, decompilationErrorHandler2, n3, n2, decompilationErrorHandler);
                n2 = decompilationErrorHandler2.F - 1;
                decompilationErrorHandler = decompilationErrorHandler2;
                continue;
            }
            if (decompilationErrorHandler2.C == 0) {
                eventDispatchCoordinator1708.a(n2);
                n2 = decompilationErrorHandler2.F - 1;
                continue;
            }
            n2 += decompilationErrorHandler2.F;
        }
        return eventDispatchCoordinator1708.x(this.N);
    }

    private void S(byte[] byArray, DecompilationErrorHandler decompilationErrorHandler) throws BytecodeProcessingException {
        int n;
        int n2;
        block7: {
            block8: {
                n2 = decompilationErrorHandler.q;
                n = decompilationErrorHandler.F - 3;
                try {
                    try {
                        if (n >= 0) break block7;
                        if (n != -1) break block8;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
                    }
                    byArray[n2] = 0;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
                }
            }
            byArray[n2 + decompilationErrorHandler.F - 1] = -65;
            decompilationErrorHandler.C = 1;
            this.U(decompilationErrorHandler, 0);
            return;
        }
        decompilationErrorHandler.C = 0;
        try {
            for (int i = 0; i < n; ++i) {
                byArray[n2 + i] = 0;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
        }
        byArray[n2 + n] = -89;
        ConfigurationManager2137.e(-n, byArray, n2 + n + 1);
    }

    private static int W(ExceptionAnalyzer[] exceptionAnalyzerArray, int n, int n2) {
        int n3 = 0;
        while (n < n2) {
            ExceptionAnalyzer exceptionAnalyzer = exceptionAnalyzerArray[n++];
            try {
                ++n3;
                if (!exceptionAnalyzer.n()) continue;
                ++n;
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
        }
        return n3;
    }

    private void c(byte[] byArray, ConfigurationStateTracker configurationStateTracker) throws BytecodeProcessingException {
        while (configurationStateTracker != null) {
            block7: {
                DecompilationErrorHandler decompilationErrorHandler;
                block5: {
                    block6: {
                        decompilationErrorHandler = (DecompilationErrorHandler)configurationStateTracker.G;
                        try {
                            try {
                                if (!decompilationErrorHandler.V()) break block5;
                                this.v(decompilationErrorHandler, false);
                                if (decompilationErrorHandler.v >= 1) break block6;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
                            }
                            throw new BytecodeProcessingException("bad catch clause: " + configurationStateTracker.e);
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
                        }
                    }
                    decompilationErrorHandler.Y[0] = this.e(this.E(configurationStateTracker.e), decompilationErrorHandler.Y[0]);
                    break block7;
                }
                this.U(decompilationErrorHandler, configurationStateTracker.e);
                ExceptionDiagnosticHandler exceptionDiagnosticHandler = new ExceptionDiagnosticHandler(this);
                exceptionDiagnosticHandler.c(byArray, decompilationErrorHandler);
            }
            configurationStateTracker = configurationStateTracker.B;
        }
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public StackMapDescriptor L(BytecodeAnalyzer bytecodeAnalyzer, DecompilationErrorHandler[] decompilationErrorHandlerArray) {
        int n;
        int n2;
        boolean bl;
        ByteStreamEncoder byteStreamEncoder = new ByteStreamEncoder();
        int n3 = decompilationErrorHandlerArray.length;
        boolean[] blArray = new boolean[n3];
        DecompilationErrorHandler decompilationErrorHandler = decompilationErrorHandlerArray[0];
        try {
            boolean[] blArray2 = blArray;
            int n4 = 0;
            bl = decompilationErrorHandler.C > 0;
        }
        catch (RuntimeException runtimeException) {
            throw ExceptionDiagnosticHandler.b(runtimeException);
        }
        try {
            blArray2[n4] = bl;
            n2 = blArray[0] ? 1 : 0;
        }
        catch (RuntimeException runtimeException) {
            throw ExceptionDiagnosticHandler.b(runtimeException);
        }
        int n5 = n2;
        for (n = 1; n < n3; ++n) {
            DecompilationErrorHandler decompilationErrorHandler2 = decompilationErrorHandlerArray[n];
            blArray[n] = this.q(decompilationErrorHandler2, decompilationErrorHandlerArray[n - 1]);
            if (!blArray[n]) continue;
            decompilationErrorHandler2.V();
            decompilationErrorHandler = decompilationErrorHandler2;
            ++n5;
        }
        try {
            if (n5 == 0) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ExceptionDiagnosticHandler.b(runtimeException);
        }
        byteStreamEncoder.v(n5);
        n = 0;
        while (true) {
            block13: {
                try {
                    try {
                        if (n >= n3) break;
                        if (!blArray[n]) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ExceptionDiagnosticHandler.b(runtimeException);
                    }
                    this.H(byteStreamEncoder, bytecodeAnalyzer, decompilationErrorHandlerArray[n].q, decompilationErrorHandlerArray[n]);
                }
                catch (RuntimeException runtimeException) {
                    throw ExceptionDiagnosticHandler.b(runtimeException);
                }
            }
            ++n;
        }
        return byteStreamEncoder.G(bytecodeAnalyzer);
    }

    private void o(byte[] byArray, DecompilationErrorHandler[] decompilationErrorHandlerArray) throws CustomRuntimeException, BytecodeProcessingException {
        ArrayList<ExceptionAnalyzer> arrayList = new ArrayList<ExceptionAnalyzer>();
        int n = decompilationErrorHandlerArray.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3;
            DecompilationErrorHandler decompilationErrorHandler = decompilationErrorHandlerArray[i];
            if (!decompilationErrorHandler.V()) continue;
            int n4 = decompilationErrorHandler.I.length;
            for (n3 = 0; n3 < n4; ++n3) {
                n2 = decompilationErrorHandler.I[n3].N(arrayList, n2, this.A);
            }
            n4 = decompilationErrorHandler.v;
            for (n3 = 0; n3 < n4; ++n3) {
                n2 = decompilationErrorHandler.Y[n3].N(arrayList, n2, this.A);
            }
        }
    }

    protected static void T(int n, ExceptionAnalyzer[] exceptionAnalyzerArray, ExceptionAnalyzer[] exceptionAnalyzerArray2) {
        System.arraycopy(exceptionAnalyzerArray, 0, exceptionAnalyzerArray2, 0, n);
    }

    public static StackMapDescriptor I(ClassPoolRegistry classPoolRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) throws BytecodeProcessingException {
        DecompilationErrorHandler[] decompilationErrorHandlerArray;
        BinaryCodeAnalyzer binaryCodeAnalyzer = bytecodeInspectionEngine.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                return null;
            }
        }
        catch (SerializableDataContainer serializableDataContainer) {
            throw ExceptionDiagnosticHandler.b(serializableDataContainer);
        }
        try {
            decompilationErrorHandlerArray = DecompilationErrorHandler.k(bytecodeInspectionEngine, binaryCodeAnalyzer, true);
        }
        catch (SerializableDataContainer serializableDataContainer) {
            return null;
        }
        try {
            if (decompilationErrorHandlerArray == null) {
                return null;
            }
        }
        catch (SerializableDataContainer serializableDataContainer) {
            throw ExceptionDiagnosticHandler.b(serializableDataContainer);
        }
        ExceptionDiagnosticHandler exceptionDiagnosticHandler = new ExceptionDiagnosticHandler(classPoolRegistry, bytecodeInspectionEngine, binaryCodeAnalyzer);
        try {
            exceptionDiagnosticHandler.L(decompilationErrorHandlerArray, binaryCodeAnalyzer.X());
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new BytecodeProcessingException(bytecodeInspectionEngine, (Throwable)bytecodeProcessingException);
        }
        return exceptionDiagnosticHandler.L(bytecodeInspectionEngine.v(), decompilationErrorHandlerArray);
    }

    private void a(ByteStreamEncoder byteStreamEncoder, BytecodeAnalyzer bytecodeAnalyzer, ExceptionAnalyzer[] exceptionAnalyzerArray, int n) {
        ExceptionAnalyzer exceptionAnalyzer;
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < n; ++n2) {
            exceptionAnalyzer = exceptionAnalyzerArray[n2];
            try {
                try {
                    if (exceptionAnalyzer == null || !exceptionAnalyzer.n()) continue;
                }
                catch (RuntimeException runtimeException) {
                    throw ExceptionDiagnosticHandler.b(runtimeException);
                }
                ++n3;
                ++n2;
                continue;
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
        }
        byteStreamEncoder.v(n - n3);
        for (n2 = 0; n2 < n; ++n2) {
            exceptionAnalyzer = exceptionAnalyzerArray[n2];
            try {
                byteStreamEncoder.R(exceptionAnalyzer.G(), exceptionAnalyzer.C(bytecodeAnalyzer));
                if (!exceptionAnalyzer.n()) continue;
                ++n2;
                continue;
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
        }
    }

    protected ExceptionDiagnosticHandler(ExceptionDiagnosticHandler exceptionDiagnosticHandler) {
        super(exceptionDiagnosticHandler);
    }

    private void D(byte[] byArray, DecompilationErrorHandler[] decompilationErrorHandlerArray) throws BytecodeProcessingException {
        for (DecompilationErrorHandler decompilationErrorHandler : decompilationErrorHandlerArray) {
            if (decompilationErrorHandler.V()) continue;
            this.S(byArray, decompilationErrorHandler);
            ConfigurationStateTracker configurationStateTracker = decompilationErrorHandler.B;
            if (configurationStateTracker == null) continue;
            DecompilationErrorHandler decompilationErrorHandler2 = (DecompilationErrorHandler)configurationStateTracker.G;
            try {
                if (decompilationErrorHandler2.V()) continue;
                this.U(decompilationErrorHandler2, configurationStateTracker.e);
                this.S(byArray, decompilationErrorHandler2);
                decompilationErrorHandler2.C = 1;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
            }
        }
    }

    void L(DecompilationErrorHandler[] decompilationErrorHandlerArray, byte[] byArray) throws BytecodeProcessingException {
        this.c(byArray, decompilationErrorHandlerArray[0]);
        this.D(byArray, decompilationErrorHandlerArray);
        try {
            this.o(byArray, decompilationErrorHandlerArray);
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new BytecodeProcessingException("failed to resolve types", (Throwable)customRuntimeException);
        }
    }

    private boolean q(DecompilationErrorHandler decompilationErrorHandler, DecompilationErrorHandler decompilationErrorHandler2) {
        int n = decompilationErrorHandler.C;
        try {
            if (n > 1) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ExceptionDiagnosticHandler.b(runtimeException);
        }
        try {
            if (n < 1) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ExceptionDiagnosticHandler.b(runtimeException);
        }
        return decompilationErrorHandler2.m;
    }

    private void H(ByteStreamEncoder byteStreamEncoder, BytecodeAnalyzer bytecodeAnalyzer, int n, DecompilationErrorHandler decompilationErrorHandler) {
        byteStreamEncoder.v(n);
        this.a(byteStreamEncoder, bytecodeAnalyzer, decompilationErrorHandler.I, decompilationErrorHandler.w);
        this.a(byteStreamEncoder, bytecodeAnalyzer, decompilationErrorHandler.Y, decompilationErrorHandler.v);
    }

    private int[] b(int n, int n2, int[] nArray, ExceptionAnalyzer[] exceptionAnalyzerArray) {
        int n3 = ExceptionDiagnosticHandler.W(exceptionAnalyzerArray, n2, n2 + n);
        BytecodeAnalyzer bytecodeAnalyzer = this.N;
        int[] nArray2 = new int[n3];
        int n4 = 0;
        for (int i = 0; i < n; ++i) {
            ExceptionAnalyzer exceptionAnalyzer = exceptionAnalyzerArray[n2 + i];
            try {
                nArray2[n4] = exceptionAnalyzer.G();
                nArray[n4] = exceptionAnalyzer.C(bytecodeAnalyzer);
                if (exceptionAnalyzer.n()) {
                    ++i;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
            ++n4;
        }
        return nArray2;
    }

    protected static int a(int n, ExceptionAnalyzer[] exceptionAnalyzerArray, ExceptionAnalyzer[] exceptionAnalyzerArray2) {
        int n2 = -1;
        for (int i = 0; i < n; ++i) {
            ExceptionAnalyzer exceptionAnalyzer = ExceptionDiagnosticHandler.w(exceptionAnalyzerArray, n, i);
            exceptionAnalyzerArray2[i] = exceptionAnalyzer.c();
            if (exceptionAnalyzer == C) continue;
            n2 = i + 1;
        }
        return n2 + 1;
    }

    private void v(DecompilationErrorHandler decompilationErrorHandler, boolean bl) throws BytecodeProcessingException {
        int n;
        int n2 = this.F.length;
        try {
            for (n = 0; n < n2; ++n) {
                decompilationErrorHandler.I[n] = this.e(ExceptionDiagnosticHandler.w(this.F, n2, n), decompilationErrorHandler.I[n]);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
        }
        if (bl) {
            n2 = this.v;
            try {
                for (n = 0; n < n2; ++n) {
                    decompilationErrorHandler.Y[n] = this.e(this.o[n], decompilationErrorHandler.Y[n]);
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
            }
        }
    }

    private static boolean H(ExceptionAnalyzer[] exceptionAnalyzerArray, ExceptionAnalyzer[] exceptionAnalyzerArray2, int n) {
        int n2 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n2 >= n) break;
                        if (exceptionAnalyzerArray[n2].o(exceptionAnalyzerArray2[n2])) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ExceptionDiagnosticHandler.b(runtimeException);
                    }
                    return false;
                }
                catch (RuntimeException runtimeException) {
                    throw ExceptionDiagnosticHandler.b(runtimeException);
                }
            }
            ++n2;
        }
        return true;
    }

    private ReflectionClassMapper E(int n) {
        String string = n == 0 ? "java.lang.Throwable" : this.N.u(n);
        return new ReflectionClassMapper(string);
    }

    public ExceptionDiagnosticHandler(ClassPoolRegistry classPoolRegistry, BytecodeInspectionEngine bytecodeInspectionEngine, BinaryCodeAnalyzer binaryCodeAnalyzer) {
        super(classPoolRegistry, bytecodeInspectionEngine.v(), binaryCodeAnalyzer.Q(), binaryCodeAnalyzer.i(), DecompilationErrorHandler.Z(bytecodeInspectionEngine.b()));
    }

    private static ExceptionAnalyzer w(ExceptionAnalyzer[] exceptionAnalyzerArray, int n, int n2) {
        ExceptionAnalyzer exceptionAnalyzer;
        block6: {
            exceptionAnalyzer = exceptionAnalyzerArray[n2];
            try {
                try {
                    try {
                        if (!exceptionAnalyzer.n() || n2 + 1 >= n) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ExceptionDiagnosticHandler.b(runtimeException);
                    }
                    if (exceptionAnalyzerArray[n2 + 1] == C) break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw ExceptionDiagnosticHandler.b(runtimeException);
                }
                return C;
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
        }
        return exceptionAnalyzer;
    }

    private void V(DecompilationErrorHandler decompilationErrorHandler) throws BytecodeProcessingException {
        ExceptionAnalyzer[] exceptionAnalyzerArray = ExceptionAnalyzer.i(this.o.length);
        int n = this.v;
        ExceptionDiagnosticHandler.a(n, this.o, exceptionAnalyzerArray);
        this.l(decompilationErrorHandler, n, exceptionAnalyzerArray);
    }

    private void H(EventDispatchCoordinator1708 eventDispatchCoordinator1708, DecompilationErrorHandler decompilationErrorHandler, int n, int n2, DecompilationErrorHandler decompilationErrorHandler2) {
        Object object;
        int n3;
        block20: {
            block21: {
                block17: {
                    block19: {
                        block18: {
                            n3 = decompilationErrorHandler.v;
                            try {
                                try {
                                    if (n3 != 0) break block17;
                                    if (n != 0) break block18;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ExceptionDiagnosticHandler.b(runtimeException);
                                }
                                eventDispatchCoordinator1708.a(n2);
                                return;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ExceptionDiagnosticHandler.b(runtimeException);
                            }
                        }
                        try {
                            try {
                                if (0 <= n || n < -3) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ExceptionDiagnosticHandler.b(runtimeException);
                            }
                            eventDispatchCoordinator1708.G(n2, -n);
                            return;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ExceptionDiagnosticHandler.b(runtimeException);
                        }
                    }
                    try {
                        if (0 >= n || n > 3) break block20;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ExceptionDiagnosticHandler.b(runtimeException);
                    }
                    int[] nArray = new int[n];
                    int[] nArray2 = this.b(decompilationErrorHandler.w - decompilationErrorHandler2.w, decompilationErrorHandler2.w, nArray, decompilationErrorHandler.I);
                    eventDispatchCoordinator1708.M(n2, nArray2, nArray);
                    return;
                }
                try {
                    if (n3 != 1 || n != 0) break block21;
                }
                catch (RuntimeException runtimeException) {
                    throw ExceptionDiagnosticHandler.b(runtimeException);
                }
                ExceptionAnalyzer exceptionAnalyzer = decompilationErrorHandler.Y[0];
                eventDispatchCoordinator1708.a(n2, exceptionAnalyzer.G(), exceptionAnalyzer.C(this.N));
                return;
            }
            try {
                if (n3 != 2 || n != 0) break block20;
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
            object = decompilationErrorHandler.Y[0];
            try {
                if (((ExceptionAnalyzer)object).n()) {
                    eventDispatchCoordinator1708.a(n2, ((ExceptionAnalyzer)object).G(), ((ExceptionAnalyzer)object).C(this.N));
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionDiagnosticHandler.b(runtimeException);
            }
        }
        object = new int[n3];
        int[] nArray = this.b(n3, 0, (int[])object, decompilationErrorHandler.Y);
        int[] nArray3 = new int[decompilationErrorHandler.w];
        int[] nArray4 = this.b(decompilationErrorHandler.w, 0, nArray3, decompilationErrorHandler.I);
        eventDispatchCoordinator1708.c(n2, nArray4, nArray3, nArray, (int[])object);
    }

    private void U(DecompilationErrorHandler decompilationErrorHandler, int n) throws BytecodeProcessingException {
        ExceptionAnalyzer[] exceptionAnalyzerArray = ExceptionAnalyzer.i(this.o.length);
        exceptionAnalyzerArray[0] = this.E(n).c();
        this.l(decompilationErrorHandler, 1, exceptionAnalyzerArray);
    }

    private void c(byte[] byArray, DecompilationErrorHandler decompilationErrorHandler) throws BytecodeProcessingException {
        int n;
        ExceptionDiagnosticHandler.T(decompilationErrorHandler.v, decompilationErrorHandler.Y, this.o);
        this.v = decompilationErrorHandler.v;
        ExceptionDiagnosticHandler.T(decompilationErrorHandler.I.length, decompilationErrorHandler.I, this.F);
        this.c(byArray, decompilationErrorHandler.B);
        int n2 = n + decompilationErrorHandler.F;
        for (n = decompilationErrorHandler.q; n < n2; n += this.k(n, byArray)) {
            this.c(byArray, decompilationErrorHandler.B);
        }
        if (decompilationErrorHandler.s != null) {
            for (int i = 0; i < decompilationErrorHandler.s.length; ++i) {
                DecompilationErrorHandler decompilationErrorHandler2 = (DecompilationErrorHandler)decompilationErrorHandler.s[i];
                try {
                    if (decompilationErrorHandler2.V()) {
                        this.v(decompilationErrorHandler2, true);
                        continue;
                    }
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ExceptionDiagnosticHandler.b(bytecodeProcessingException);
                }
                this.V(decompilationErrorHandler2);
                ExceptionDiagnosticHandler exceptionDiagnosticHandler = new ExceptionDiagnosticHandler(this);
                exceptionDiagnosticHandler.c(byArray, decompilationErrorHandler2);
            }
        }
    }

    private static int J(int n, ExceptionAnalyzer[] exceptionAnalyzerArray, int n2, ExceptionAnalyzer[] exceptionAnalyzerArray2) {
        block4: {
            int n3;
            block5: {
                int n4 = n2 - n;
                n3 = n4 > 0 ? n : n2;
                try {
                    try {
                        if (!ExceptionDiagnosticHandler.H(exceptionAnalyzerArray, exceptionAnalyzerArray2, n3)) break block4;
                        if (n4 <= 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ExceptionDiagnosticHandler.b(runtimeException);
                    }
                    return ExceptionDiagnosticHandler.W(exceptionAnalyzerArray2, n3, n2);
                }
                catch (RuntimeException runtimeException) {
                    throw ExceptionDiagnosticHandler.b(runtimeException);
                }
            }
            return -ExceptionDiagnosticHandler.W(exceptionAnalyzerArray, n3, n);
        }
        return -100;
    }
}

