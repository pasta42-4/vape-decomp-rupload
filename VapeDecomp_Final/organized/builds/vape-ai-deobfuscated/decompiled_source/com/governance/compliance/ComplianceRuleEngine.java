/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.governance.compliance;

import com.data.organization.StringCollectionOrganizer;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.runtime.context.ContextualExecutionFramework;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public class ComplianceRuleEngine
extends StringCollectionOrganizer {
    private static int Q;
    private List<String> M;

    public static void p(int n) {
        Q = n;
    }

    public static int Q() {
        return Q;
    }

    static {
        if (ComplianceRuleEngine.Q() == 0) {
            ComplianceRuleEngine.p(10);
        }
    }

    public static int X() {
        int n = ComplianceRuleEngine.Q();
        try {
            if (n == 0) {
                return 112;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComplianceRuleEngine.a(customSystemException);
        }
        return 0;
    }

    @Override
    public @UnmodifiableView List<String> m() {
        if (this.M == null) {
            this.M = new ArrayList<String>();
            for (ContextualExecutionFramework contextualExecutionFramework : TemporalMetadataResolver.h.U().q()) {
                try {
                    if (contextualExecutionFramework.t() == RecursiveNodeGraph.p) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComplianceRuleEngine.a(customSystemException);
                }
                this.M.add(contextualExecutionFramework.O());
            }
        }
        return this.M;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

