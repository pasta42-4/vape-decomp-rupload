/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.transformation;

import a.E8;
import com.app.transaction.coordination.TransactionCoordinator2416;
import com.compliance.management.ComplianceOrchestrator;
import com.concurrency.management.AsyncOperationOrchestrator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.resource.CryptoResourceAllocator;
import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.NetworkConnectionManager1945;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.core.WorkflowCoordinator;

public class DataTransformationEngine1165
extends ObjectLifecycleTracker {
    public static DataTransformationEngine1165 F(DataTransformationEngine1209 dataTransformationEngine1209) {
        block10: {
            block11: {
                try {
                    if (GameVersionEnumerator.MC_1_21_11.H()) {
                        return new DataTransformationEngine1165(CryptoResourceAllocator.K(DataTransformationEngine1165.U.u().L0, ApplicationLifecycleManager.g(), ApplicationLifecycleManager.U().j().M(), 0, new Object[]{0}));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine1165.a(customSystemException);
                }
                try {
                    try {
                        if (!GameVersionEnumerator.MC_1_21_6.H()) break block10;
                        if (dataTransformationEngine1209.M() != null) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationEngine1165.a(customSystemException);
                    }
                    return new DataTransformationEngine1165(CryptoResourceAllocator.K(DataTransformationEngine1165.U.u().L0, ApplicationLifecycleManager.g(), ComplianceOrchestrator.G(16).M(), ApplicationLifecycleManager.n().e().M(), new Object[0]));
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine1165.a(customSystemException);
                }
            }
            try {
                if (dataTransformationEngine1209.B(ReflectionMetadataResolver.rq)) {
                    return DataTransformationEngine1165.m(new ComplianceOrchestrator(dataTransformationEngine1209.M()));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationEngine1165.a(customSystemException);
            }
            ComplianceOrchestrator complianceOrchestrator = ComplianceOrchestrator.G(16);
            complianceOrchestrator.C();
            float[] fArray = dataTransformationEngine1209.p().n().X().d;
            complianceOrchestrator.H(fArray[0]);
            complianceOrchestrator.s(fArray[1]);
            complianceOrchestrator.l(fArray[4]);
            complianceOrchestrator.v(fArray[5]);
            complianceOrchestrator.V(fArray[12]);
            complianceOrchestrator.U(fArray[13]);
            return DataTransformationEngine1165.m(complianceOrchestrator);
        }
        return new DataTransformationEngine1165(CryptoResourceAllocator.K(DataTransformationEngine1165.U.u().L0, ApplicationLifecycleManager.g(), dataTransformationEngine1209.M(), ApplicationLifecycleManager.n().e().M(), new Object[0]));
    }

    public static DataTransformationEngine1165 m(ComplianceOrchestrator complianceOrchestrator) {
        return DataTransformationEngine1165.t(ApplicationLifecycleManager.g(), complianceOrchestrator, ApplicationLifecycleManager.U().j());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DataTransformationEngine1165(Object object) {
        super(object);
    }

    public ComplianceOrchestrator V() {
        return new ComplianceOrchestrator(DataTransformationEngine1165.U.u().L0.d(this.H));
    }

    public static DataTransformationEngine1165 t(Object object, ComplianceOrchestrator complianceOrchestrator, TransactionCoordinator2416 transactionCoordinator2416) {
        try {
            if (GameVersionEnumerator.MC_1_21_11.H()) {
                return new DataTransformationEngine1165(CryptoResourceAllocator.K(DataTransformationEngine1165.U.u().L0, object, complianceOrchestrator.M(), transactionCoordinator2416.M(), new Object[]{0, 0}));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1165.a(customSystemException);
        }
        return new DataTransformationEngine1165(CryptoResourceAllocator.K(DataTransformationEngine1165.U.u().L0, object, complianceOrchestrator.M(), transactionCoordinator2416.M(), new Object[0]));
    }

    public static void k(DataTransformationEngine1209 dataTransformationEngine1209, int n, int n2, int n3, int n4, int n5, WorkflowCoordinator workflowCoordinator) {
        block7: {
            NetworkConnectionManager1945 networkConnectionManager1945;
            block9: {
                block8: {
                    try {
                        if (GameVersionEnumerator.MC_1_21_0.H()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationEngine1165.a(customSystemException);
                    }
                    try {
                        try {
                            if (GeometryCalculator.C() < 37) break block7;
                            if (GeometryCalculator.C() < 50) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationEngine1165.a(customSystemException);
                        }
                        networkConnectionManager1945 = new AsyncOperationOrchestrator(workflowCoordinator.s()).o();
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationEngine1165.a(customSystemException);
                    }
                }
                networkConnectionManager1945 = null;
            }
            NetworkConnectionManager1945 networkConnectionManager19452 = networkConnectionManager1945;
            float[] fArray = workflowCoordinator.c();
            DataTransformationEngine1165.S(networkConnectionManager19452, dataTransformationEngine1209, n, n + n4, n2, n2 + n5, n3, fArray[0], fArray[1], fArray[2], fArray[3]);
            return;
        }
        CryptoResourceAllocator.b(DataTransformationEngine1165.U.u().L0, null, dataTransformationEngine1209.M(), n, n2, n3, n4, n5, workflowCoordinator.M());
    }

    public void U(E8 e8, String string, int n, int n2, int n3, boolean bl) {
        DataTransformationEngine1165.U.u().L0.C(this.H, e8.M(), string, n, n2, n3, bl);
    }

    public TransactionCoordinator2416 d() {
        return new TransactionCoordinator2416(DataTransformationEngine1165.U.u().L0.C(this.H));
    }

    public void X() {
        DataTransformationEngine1165.U.u().L0.K(this.H);
    }

    public static void S(NetworkConnectionManager1945 networkConnectionManager1945, DataTransformationEngine1209 dataTransformationEngine1209, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, float f4) {
        Object object = null;
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1165.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 50) {
            object = DataTransformationEngine1165.F(dataTransformationEngine1209).M();
            CryptoResourceAllocator.e(DataTransformationEngine1165.U.u().L0, object, networkConnectionManager1945.M(), n, n2, n3, n4, n5, f, f2, f3, f4);
            return;
        }
        CryptoResourceAllocator.e(DataTransformationEngine1165.U.u().L0, object, dataTransformationEngine1209.p().n().M(), n, n2, n3, n4, n5, f, f2, f3, f4);
    }
}

