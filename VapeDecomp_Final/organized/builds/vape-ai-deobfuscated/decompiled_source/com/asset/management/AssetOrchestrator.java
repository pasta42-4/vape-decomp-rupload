/*
 * Decompiled with CFR 0.152.
 */
package com.asset.management;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.distributed.topology.DistributedResourceTopologyManager;
import java.awt.Color;

class AssetOrchestrator {
    public ColorPaletteRenderer Q;
    final DistributedResourceTopologyManager y;
    public ColorPaletteRenderer Z;
    boolean A;
    boolean h;
    ConnectionPoolOrchestrator1192 G;

    AssetOrchestrator(DistributedResourceTopologyManager distributedResourceTopologyManager, ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        this.y = distributedResourceTopologyManager;
        this.Z = new ColorPaletteRenderer(0.05, new Color(20, 20, 20, 180), new Color(255, 255, 255, 255));
        this.Q = new ColorPaletteRenderer(0.05, new Color(255, 255, 255, 255), new Color(20, 20, 20, 255));
        this.A = true;
        this.G = connectionPoolOrchestrator1192;
    }

    public ColorPaletteRenderer C() {
        return this.Z;
    }

    public void U() {
        this.Z.c();
        this.Q.c();
        this.A = false;
    }

    public void l() {
    }

    public ColorPaletteRenderer B() {
        return this.Q;
    }

    public boolean b() {
        return this.A;
    }

    public void h() {
        this.Z.q();
        this.Q.q();
        this.A = true;
    }
}

