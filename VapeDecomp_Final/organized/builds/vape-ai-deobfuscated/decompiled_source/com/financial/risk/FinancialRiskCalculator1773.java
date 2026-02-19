/*
 * Decompiled with CFR 0.152.
 */
package com.financial.risk;

import com.data.contract.DataTransformationContract2366;
import com.identity.management.UniversalIdentityManager;
import com.network.protocol.NetworkProtocolEncoder1013;

public class FinancialRiskCalculator1773
implements DataTransformationContract2366 {
    private UniversalIdentityManager x;

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.x.N(networkProtocolEncoder1013);
    }

    public UniversalIdentityManager Y() {
        return this.x;
    }

    public FinancialRiskCalculator1773(UniversalIdentityManager universalIdentityManager) {
        this.x = universalIdentityManager;
    }

    public FinancialRiskCalculator1773() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.x = new UniversalIdentityManager(networkProtocolEncoder1013);
    }
}

