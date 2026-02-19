/*
 * Decompiled with CFR 0.152.
 */
package com.game.entity;

import a.N9;
import com.distributed.coordination.DistributedResourceOrchestrator;
import com.exception.system.CustomSystemException;
import com.system.config.AdaptiveConfigurationManager;
import java.util.ArrayList;
import java.util.HashSet;

public class EntityCollectionManager {
    public ArrayList<DistributedResourceOrchestrator> q;
    public final HashSet<N9> E;
    public int g = 0;
    public final N9 M;
    private static String[] z;
    public final AdaptiveConfigurationManager d;
    public final ArrayList<AdaptiveConfigurationManager> A = new ArrayList();
    public final N9 N;
    public final ArrayList<AdaptiveConfigurationManager> F = new ArrayList();
    public AdaptiveConfigurationManager c;

    static {
        if (EntityCollectionManager.T() == null) {
            EntityCollectionManager.T(new String[3]);
        }
    }

    public boolean p(AdaptiveConfigurationManager adaptiveConfigurationManager) {
        return this.A.contains(AdaptiveConfigurationManager.G()[adaptiveConfigurationManager.p()]);
    }

    public boolean A() {
        this.q.forEach(DistributedResourceOrchestrator::g);
        this.q.clear();
        return true;
    }

    public void q(AdaptiveConfigurationManager adaptiveConfigurationManager) {
        try {
            this.F.add(AdaptiveConfigurationManager.G()[adaptiveConfigurationManager.p()]);
            if (this.M != null) {
                this.E.add(this.M.m(adaptiveConfigurationManager));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EntityCollectionManager.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean J() {
        boolean bl;
        try {
            bl = this.M != null;
        }
        catch (CustomSystemException customSystemException) {
            throw EntityCollectionManager.a(customSystemException);
        }
        return bl;
    }

    public EntityCollectionManager(N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager) {
        this(n9, adaptiveConfigurationManager, true);
    }

    public void N(AdaptiveConfigurationManager adaptiveConfigurationManager) {
        this.A.add(AdaptiveConfigurationManager.G()[adaptiveConfigurationManager.p()]);
        this.E.add(this.N.m(adaptiveConfigurationManager));
    }

    public static String[] T() {
        return z;
    }

    public EntityCollectionManager(N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager, boolean bl) {
        this.E = new HashSet();
        this.q = new ArrayList();
        this.N = n9;
        this.d = adaptiveConfigurationManager;
        this.M = bl ? n9.t(0, 1, 0) : null;
    }

    public EntityCollectionManager(N9 n9) {
        this(n9, null, false);
    }

    public static void T(String[] stringArray) {
        z = stringArray;
    }

    public boolean Q(AdaptiveConfigurationManager adaptiveConfigurationManager) {
        return this.F.contains(AdaptiveConfigurationManager.G()[adaptiveConfigurationManager.p()]);
    }
}

