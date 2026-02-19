/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.core;

import com.exception.system.CustomSystemException;
import com.security.crypto.CipherContextManager1101;
import com.security.session.CipherSessionManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkflowOrchestrator {
    private HashMap<CipherSessionManager, Boolean> I;
    private List<CipherSessionManager> g = new ArrayList<CipherSessionManager>();
    private static boolean P;

    static {
        if (WorkflowOrchestrator.e()) {
            WorkflowOrchestrator.G(true);
        }
    }

    public void x(CipherSessionManager cipherSessionManager) {
        try {
            if (this.Y().contains(cipherSessionManager)) {
                this.d(cipherSessionManager);
                this.B(cipherSessionManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator.a(customSystemException);
        }
    }

    public static boolean f() {
        boolean bl = WorkflowOrchestrator.e();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator.a(customSystemException);
        }
        return false;
    }

    public void B(CipherSessionManager cipherSessionManager) {
        try {
            if (this.g.contains(cipherSessionManager)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator.a(customSystemException);
        }
        this.g.add(cipherSessionManager);
    }

    public static void G(boolean bl) {
        P = bl;
    }

    public void d(CipherSessionManager cipherSessionManager) {
        this.g.remove(cipherSessionManager);
    }

    public static boolean e() {
        return P;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void G(CipherSessionManager cipherSessionManager, CipherSessionManager cipherSessionManager2) {
        block10: {
            try {
                try {
                    if (this.g.contains(cipherSessionManager) && this.g.contains(cipherSessionManager2)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw WorkflowOrchestrator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw WorkflowOrchestrator.a(customSystemException);
            }
        }
        if (cipherSessionManager2 instanceof CipherContextManager1101) {
            int n = this.g.indexOf(cipherSessionManager);
            CipherContextManager1101 cipherContextManager1101 = (CipherContextManager1101)cipherSessionManager2;
            ArrayList<CipherContextManager1101> arrayList = cipherContextManager1101.T().V();
            for (int i = 0; i < arrayList.size(); ++i) {
                CipherContextManager1101 cipherContextManager11012 = arrayList.get(i);
                try {
                    this.g.remove(cipherContextManager11012);
                    if (n + i + 1 > this.g.size()) {
                        this.g.add(cipherContextManager11012);
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw WorkflowOrchestrator.a(customSystemException);
                }
                this.g.add(n + i + 1, cipherContextManager11012);
            }
        } else {
            this.g.remove(cipherSessionManager2);
            int n = this.g.indexOf(cipherSessionManager);
            this.g.add(n + 1, cipherSessionManager2);
        }
    }

    public List<CipherSessionManager> Y() {
        return this.g;
    }

    public WorkflowOrchestrator() {
        this.I = new HashMap();
    }
}

