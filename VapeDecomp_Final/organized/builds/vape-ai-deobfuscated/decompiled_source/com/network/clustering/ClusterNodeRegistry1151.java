/*
 * Decompiled with CFR 0.152.
 */
package com.network.clustering;

import com.app.network.connectivity.NetworkConnectionResolver;
import com.app.security.SecurityAccessController1553;
import com.app.transformation.TransformationPipelineFilter;
import com.caching.management.CacheEntryTracker;
import com.collections.management.MultiContainerRegistry;
import com.command.processing.CommandInterpreter;
import com.core.computation.AbstractComputationKernel;
import com.event.management.EventDispatchController2297;
import com.exception.system.CustomSystemException;
import com.messaging.routing.MessageRoutingAgent;
import com.network.monitoring.ConnectionTracker;
import com.networking.transmission.DataTransmissionManager;
import com.networking.transmission.TransmissionController;
import com.performance.monitoring.TimedExecutionTracker;
import com.security.auth.AuthenticationValidator;
import com.state.management.StateChangeMonitor;
import com.system.state.StateMachineController;
import com.vape.network.VapeNetworkOrchestrator;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ClusterNodeRegistry1151 {
    private static final long a = MultiContainerRegistry.a(-5010454280892021133L, -5878391342267410810L, MethodHandles.lookup().lookupClass()).a(271619426130951L);
    private TimedExecutionTracker k;
    private static String[] W;
    public HashMap<Integer, TransformationPipelineFilter> Y = new HashMap();
    private static ClusterNodeRegistry1151 V;
    private StateChangeMonitor Z;
    private long J;
    private StateMachineController X;

    public long q() {
        return this.J;
    }

    public boolean l(int n, long l, long l2) {
        TransformationPipelineFilter transformationPipelineFilter = this.Y.get(n);
        try {
            if (transformationPipelineFilter != null) {
                return transformationPipelineFilter.c(l, l2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClusterNodeRegistry1151.a(customSystemException);
        }
        return false;
    }

    public static String[] S() {
        return W;
    }

    static {
        if (ClusterNodeRegistry1151.S() != null) {
            ClusterNodeRegistry1151.b(new String[1]);
        }
    }

    public void W(long l) {
        this.J = l;
        this.Z.c();
    }

    public static void b(String[] stringArray) {
        W = stringArray;
    }

    public static ClusterNodeRegistry1151 W() {
        try {
            if (V == null) {
                V = new ClusterNodeRegistry1151();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClusterNodeRegistry1151.a(customSystemException);
        }
        return V;
    }

    public ClusterNodeRegistry1151() {
        this.k = new TimedExecutionTracker();
        this.X = new StateMachineController();
        this.Z = new StateChangeMonitor();
    }

    public StateMachineController Y() {
        return this.X;
    }

    public TimedExecutionTracker E() {
        return this.k;
    }

    public void f() {
        long l = a ^ 0x10362E726234L;
        this.Y.put(258, new CacheEntryTracker());
        this.Y.put(256, new ConnectionTracker());
        this.Y.put(257, new CommandInterpreter());
        this.Y.put(260, new ConnectionTracker());
        this.Y.put(261, new CommandInterpreter());
        this.Y.put(513, new MessageRoutingAgent(0));
        this.Y.put(516, new MessageRoutingAgent(1));
        this.Y.put(519, new MessageRoutingAgent(2));
        this.Y.put(514, new NetworkConnectionResolver(0));
        this.Y.put(517, new NetworkConnectionResolver(1));
        String[] stringArray = ClusterNodeRegistry1151.S();
        this.Y.put(520, new NetworkConnectionResolver(2));
        String[] stringArray2 = stringArray;
        try {
            this.Y.put(523, new VapeNetworkOrchestrator());
            this.Y.put(524, new AuthenticationValidator());
            this.Y.put(522, new DataTransmissionManager());
            this.Y.put(512, new TransmissionController());
            this.Y.put(7, new EventDispatchController2297());
            this.Y.put(8, new SecurityAccessController1553());
            if (stringArray2 != null) {
                AbstractComputationKernel.I(new String[5]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClusterNodeRegistry1151.a(customSystemException);
        }
    }

    public StateChangeMonitor S() {
        return this.Z;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

