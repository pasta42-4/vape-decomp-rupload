/*
 * Decompiled with CFR 0.152.
 */
package com.system.diagnostics;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeRegistry1151;
import com.system.state.StateMachineController;

public class SystemDiagnosticAnalyzer {
    private static StateMachineController v;

    public static boolean F() {
        return SystemDiagnosticAnalyzer.K().J();
    }

    public static int k() {
        return ApplicationLifecycleManager.b() - SystemDiagnosticAnalyzer.K().C();
    }

    public static int m() {
        return SystemDiagnosticAnalyzer.K().b();
    }

    public static boolean L() {
        return SystemDiagnosticAnalyzer.K().B();
    }

    public static long Q() {
        return SystemDiagnosticAnalyzer.K().h();
    }

    public static boolean A(int n) {
        return SystemDiagnosticAnalyzer.K().b(n);
    }

    public static StateMachineController K() {
        try {
            if (v == null) {
                v = ClusterNodeRegistry1151.W().Y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemDiagnosticAnalyzer.a(customSystemException);
        }
        return v;
    }

    public static int a() {
        return SystemDiagnosticAnalyzer.K().F();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int M() {
        return SystemDiagnosticAnalyzer.K().v();
    }
}

