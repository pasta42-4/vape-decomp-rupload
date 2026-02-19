/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.resource.management;

import a.KB;
import a.N9;
import a.Ny;
import a.Qv;
import a.Ya;
import a.Zw;
import a.a;
import a.oQ;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.identity.IdentityComparator;
import com.app.messaging.transformation.MessageTransformationBroker1190;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.data.compression.CompressionUtility;
import com.distributed.coordination.DistributedResourceOrchestrator;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.event.management.EventDispatchCoordinator1090;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.entity.EntityCollectionManager;
import com.game.input.GameInputController;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionManager2105;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolInteractionController;
import com.network.protocol.ProtocolNegotiationStrategy;
import com.numeric.precision.NumericPrecisionTransformer;
import com.physics.simulation.PhysicsSimulator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthenticationGateway;
import com.security.authentication.AuthenticationGateway1860;
import com.security.crypto.CryptographicSecurityProvider;
import com.session.management.MultiProtocolSessionManager;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.AssetLoadBalancer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.processing.PatternMatchingOrchestrator;
import com.util.numeric.NumericFormattingUtility;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ResourceAllocationTracker
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker F;
    private final AuthenticationGateway1860 x;
    private static final Object[] gb;
    private final AuthenticationStateTracker n;
    private final NetworkConnectionManager2105 o;
    private final AdaptiveConfigurationManager[] j;
    private final ConnectionLifecycleManager R;
    private final NumericPrecisionTransformer X;
    private final ColorPaletteManager L;
    private MultiProtocolSessionManager B;
    private final AuthenticationStateTracker l;
    private final AdaptiveConfigurationManager[] Y;
    private static final Map fb;
    private static final long[] V;
    private final AuthenticationStateTracker r;
    private int G;
    private boolean d;
    private Ya w;
    private static final String[] hb;
    private PhysicsSimulator O;
    private final NetworkConfigManager P;
    private boolean N;
    private int A;
    private final AuthenticationGateway1860 b;
    private final ArrayList<String> h;
    private static final Integer[] bb;
    private final AuthenticationStateTracker z;
    private final int[][] Z;
    private final NumericFormattingUtility m;
    private final ArrayList<EntityCollectionManager> t;
    private final AuthenticationStateTracker T;
    private final GenericAdapterManager e;
    private final NetworkConfigManager K;
    private static final long v;

    @Override
    public void y(boolean bl, boolean bl2) {
        block12: {
            block11: {
                block8: {
                    boolean bl3;
                    block10: {
                        block9: {
                            try {
                                try {
                                    try {
                                        if (bl || !(this.w instanceof CryptographicSecurityProvider)) break block8;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    ResourceAllocationTracker resourceAllocationTracker = this;
                                    if (this.N) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                                bl3 = true;
                                break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    resourceAllocationTracker.N = bl3;
                    break block12;
                }
                try {
                    super.y(bl, bl2);
                    this.N = false;
                    if (bl) break block11;
                    this.Y();
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
            this.d = false;
        }
    }

    private void H(oQ oQ2) {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    @Override
    public boolean Y() {
        return true;
    }

    private int p(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator) {
        int n;
        block22: {
            boolean bl;
            long l;
            block21: {
                l = v ^ 0x77E07812F82L;
                try {
                    try {
                        if (!systemConfigurationOrchestrator.Y() && !networkProtocolNegotiator.Y()) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    return -1;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
            n = -1;
            try {
                boolean bl2 = bl = this.e.J() == this.b;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
            if (bl) {
                float f = -1.0f;
                int n2 = 0;
                int n3 = 0;
                while (true) {
                    block23: {
                        int n4;
                        float f2;
                        block24: {
                            try {
                                if (n3 >= 9) break block22;
                                if (!this.R(systemConfigurationOrchestrator, networkProtocolNegotiator, n3)) break block23;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.l().F(n3);
                            f2 = PatternMatchingOrchestrator.i(lightweightExecutionContext);
                            n4 = lightweightExecutionContext.J();
                            try {
                                try {
                                    if (f2 > f) break block24;
                                    if (f2 != f) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                                if (n4 <= n2) break block23;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                        }
                        f = f2;
                        n2 = n4;
                        n = n3;
                    }
                    ++n3;
                }
            }
            Object object = ResourceAllocationTracker.a("c", (int)30480, (long)(0x46EE16B62CBCC9F8L ^ l));
            int n5 = 0;
            int n6 = 0;
            while (true) {
                block25: {
                    int n7;
                    int n8;
                    block26: {
                        try {
                            if (n6 >= 9) break;
                            if (!this.R(systemConfigurationOrchestrator, networkProtocolNegotiator, n6)) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.l().F(n6);
                        n8 = this.X(lightweightExecutionContext);
                        n7 = lightweightExecutionContext.J();
                        try {
                            try {
                                if (n8 < object) break block26;
                                if (n8 != object) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            if (n7 <= n5) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                    }
                    object = n8;
                    n5 = n7;
                    n = n6;
                }
                ++n6;
            }
        }
        return n;
    }

    @DataExchangeProtocol2090
    public void q(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        try {
            if (GeometryCalculator.C() >= 37) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker.a(customSystemException);
        }
    }

    private void O(N9 n9, EntityCollectionManager entityCollectionManager, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator) {
        block98: {
            double d2;
            MessageTransformationBroker1190 messageTransformationBroker1190;
            N9 n92;
            Object n;
            block100: {
                block99: {
                    boolean bl;
                    block101: {
                        int n2;
                        boolean bl2;
                        AdaptiveConfigurationManager adaptiveConfigurationManager;
                        AdaptiveConfigurationManager adaptiveConfigurationManager2;
                        Object object3;
                        Object object4;
                        int n22;
                        block85: {
                            boolean bl3;
                            block84: {
                                block83: {
                                    try {
                                        if (entityCollectionManager == null) {
                                            return;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    try {
                                        try {
                                            if (entityCollectionManager.q == null || entityCollectionManager.q.isEmpty()) break block83;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                }
                                n22 = systemConfigurationOrchestrator.d().g();
                                if (entityCollectionManager.c != null && ((AdaptiveConfigurationManager)(object4 = entityCollectionManager.c)).g() != -1) {
                                    n22 = ((AdaptiveConfigurationManager)object4).z().g();
                                }
                                object4 = new HashSet();
                                HashSet<N9> hashSet = new HashSet<N9>();
                                for (int i = this.t.size() - 1; i >= 0; --i) {
                                    object3 = this.t.get(i);
                                    try {
                                        if (((EntityCollectionManager)object3).J()) {
                                            hashSet.add(((EntityCollectionManager)object3).N);
                                            hashSet.add(((EntityCollectionManager)object3).M);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    for (DistributedResourceOrchestrator object22 : ((EntityCollectionManager)object3).q) {
                                        for (MultiProtocolSessionManager bl22 : object22.N) {
                                            try {
                                                if (bl22 == null) {
                                                    continue;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                            n = bl22.h();
                                            ((HashSet)object4).add(n);
                                        }
                                    }
                                }
                                n92 = entityCollectionManager.N;
                                object3 = entityCollectionManager.M;
                                adaptiveConfigurationManager2 = entityCollectionManager.d;
                                adaptiveConfigurationManager = entityCollectionManager.c;
                                messageTransformationBroker1190 = new MessageTransformationBroker1190(this, hashSet, entityCollectionManager, networkProtocolNegotiator, systemConfigurationOrchestrator, (HashSet)object4);
                                try {
                                    try {
                                        if (entityCollectionManager.J() || !((double)n92.J() > systemConfigurationOrchestrator.V())) break block84;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    bl3 = true;
                                    break block85;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                            }
                            bl3 = bl2 = false;
                        }
                        if (bl2) break block101;
                        for (n2 = 0; n2 < 4; ++n2) {
                            Vector<MultiProtocolSessionManager> vector;
                            AdaptiveConfigurationManager bl8;
                            block97: {
                                boolean vector2;
                                boolean contextualEventDispatcher;
                                block95: {
                                    double d3;
                                    Object object;
                                    Object object2;
                                    boolean bl4;
                                    block90: {
                                        block89: {
                                            int transactionCorrelationEngine = (n22 + n2) % 4;
                                            bl8 = this.Y[transactionCorrelationEngine];
                                            try {
                                                try {
                                                    if (adaptiveConfigurationManager2 != null && bl8.p() == adaptiveConfigurationManager2.p()) {
                                                        continue;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceAllocationTracker.a(customSystemException);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                            try {
                                                try {
                                                    if (adaptiveConfigurationManager != null && bl8.p() == adaptiveConfigurationManager.p()) {
                                                        continue;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceAllocationTracker.a(customSystemException);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                            N9 d5 = n92.m(bl8);
                                            TransactionCorrelationEngine transactionCorrelationEngine2 = networkProtocolNegotiator.N(d5.x(), d5.J(), d5.b());
                                            try {
                                                block88: {
                                                    try {
                                                        try {
                                                            if (((HashSet)object4).contains(d5) || entityCollectionManager.p(bl8)) break block88;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ResourceAllocationTracker.a(customSystemException);
                                                        }
                                                        if (!PatternMatchingOrchestrator.q(transactionCorrelationEngine2)) break block89;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ResourceAllocationTracker.a(customSystemException);
                                                    }
                                                }
                                                bl4 = true;
                                                break block90;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                        }
                                        bl4 = false;
                                    }
                                    contextualEventDispatcher = bl4;
                                    vector2 = true;
                                    if (entityCollectionManager.J()) {
                                        boolean bl5;
                                        block93: {
                                            block92: {
                                                object2 = ((N9)object3).m(bl8);
                                                TransactionCorrelationEngine d4 = networkProtocolNegotiator.N(((N9)object2).x(), ((N9)object2).J(), ((N9)object2).b());
                                                try {
                                                    block91: {
                                                        try {
                                                            try {
                                                                if (((HashSet)object4).contains(object2) || entityCollectionManager.Q(bl8)) break block91;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ResourceAllocationTracker.a(customSystemException);
                                                            }
                                                            if (!PatternMatchingOrchestrator.q(d4)) break block92;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ResourceAllocationTracker.a(customSystemException);
                                                        }
                                                    }
                                                    bl5 = true;
                                                    break block93;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceAllocationTracker.a(customSystemException);
                                                }
                                            }
                                            bl5 = false;
                                        }
                                        vector2 = bl5;
                                    }
                                    try {
                                        try {
                                            if (contextualEventDispatcher && vector2) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    try {
                                        object = contextualEventDispatcher ? object3 : n92;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    object2 = object;
                                    try {
                                        d3 = GeometryCalculator.C() > 13 ? (double)systemConfigurationOrchestrator.E() : 0.0;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    double d4 = d3;
                                    ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N((float)n9.x() + 0.5f, systemConfigurationOrchestrator.y() + d4, (float)n9.b() + 0.5f);
                                    vector = Zw.W(n9, contextualEventDispatcher2, systemConfigurationOrchestrator, networkProtocolNegotiator, ((N9)object2).m(bl8), bl8, bl8, messageTransformationBroker1190, 0);
                                    try {
                                        try {
                                            try {
                                                if (vector != null && !vector.isEmpty()) break block95;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                            if (contextualEventDispatcher) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    if (!vector2) {
                                        object2 = object3;
                                        vector = Zw.W(n9, contextualEventDispatcher2, systemConfigurationOrchestrator, networkProtocolNegotiator, ((N9)object2).m(bl8), bl8, bl8, messageTransformationBroker1190, 0);
                                        try {
                                            try {
                                                if (vector == null || vector.isEmpty()) {
                                                    continue;
                                                }
                                                break block97;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                    }
                                    break block97;
                                }
                                try {
                                    if (contextualEventDispatcher || vector2) break block97;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                                MultiProtocolSessionManager multiProtocolSessionManager = new MultiProtocolSessionManager(n92.m(bl8), this.j[1]);
                                multiProtocolSessionManager.d = vector.size();
                                vector.add(multiProtocolSessionManager);
                            }
                            try {
                                try {
                                    if (vector == null || vector.isEmpty()) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                                entityCollectionManager.q.add(new DistributedResourceOrchestrator(bl8, vector));
                                continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                        }
                        n2 = systemConfigurationOrchestrator.d().g();
                        entityCollectionManager.q.sort((arg_0, arg_1) -> ResourceAllocationTracker.lambda$findPlacePath$0(n2, arg_0, arg_1));
                        break block98;
                    }
                    n = AdaptiveConfigurationManager.y();
                    TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n92.x(), n92.J(), n92.b());
                    try {
                        bl = !PatternMatchingOrchestrator.a(transactionCorrelationEngine);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    boolean bl6 = bl;
                    try {
                        try {
                            if (bl6) break block98;
                            if (GeometryCalculator.C() <= 13) break block99;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        d2 = systemConfigurationOrchestrator.E();
                        break block100;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                }
                d2 = 0.0;
            }
            double d5 = d2;
            ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N((float)n9.x() + 0.5f, systemConfigurationOrchestrator.y() + d5, (float)n9.b() + 0.5f);
            Vector<MultiProtocolSessionManager> vector = Zw.W(n9, contextualEventDispatcher, systemConfigurationOrchestrator, networkProtocolNegotiator, n92, (AdaptiveConfigurationManager)n, ((AdaptiveConfigurationManager)n).z(), messageTransformationBroker1190, 0);
            try {
                try {
                    if (vector == null || vector.isEmpty()) break block98;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                entityCollectionManager.q.add(new DistributedResourceOrchestrator((AdaptiveConfigurationManager)n, vector));
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (hb[n4] != null) {
            return n4;
        }
        Object object = gb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 29;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 30;
                break;
            }
            case 4: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 34;
                break;
            }
            case 6: {
                n3 = 59;
                break;
            }
            case 7: {
                n3 = 53;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 56;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 33;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 54;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 18;
                break;
            }
            case 18: {
                n3 = 36;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 4;
                break;
            }
            case 22: {
                n3 = 9;
                break;
            }
            case 23: {
                n3 = 63;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 7;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 2;
                break;
            }
            case 30: {
                n3 = 12;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 58;
                break;
            }
            case 33: {
                n3 = 14;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 17;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 37;
                break;
            }
            case 39: {
                n3 = 25;
                break;
            }
            case 40: {
                n3 = 39;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 38;
                break;
            }
            case 45: {
                n3 = 19;
                break;
            }
            case 46: {
                n3 = 61;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 41;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 46;
                break;
            }
            case 54: {
                n3 = 10;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 15;
                break;
            }
            case 60: {
                n3 = 48;
                break;
            }
            case 61: {
                n3 = 51;
                break;
            }
            case 62: {
                n3 = 55;
                break;
            }
            default: {
                n3 = 23;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        ResourceAllocationTracker.hb[n4] = new String(cArray);
        return n4;
    }

    public float l(SystemConfigurationOrchestrator systemConfigurationOrchestrator, LightweightExecutionContext lightweightExecutionContext, N9 n9) {
        float f;
        block11: {
            f = this.P(lightweightExecutionContext, n9);
            if (f > 1.0f) {
                int n = EventDispatchCoordinator1090.c(Qv.j().e(), lightweightExecutionContext);
                try {
                    if (n <= 0 || !lightweightExecutionContext.r()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                f += (float)(n * n + 1);
            }
        }
        if (systemConfigurationOrchestrator.e(ObjectPipelineManager.y)) {
            f *= 1.0f + (float)(systemConfigurationOrchestrator.W(ObjectPipelineManager.y).y() + 1) * 0.2f;
        }
        if (systemConfigurationOrchestrator.e(ObjectPipelineManager.v)) {
            float f2 = 1.0f;
            switch (systemConfigurationOrchestrator.W(ObjectPipelineManager.v).y()) {
                case 0: {
                    f2 = 0.3f;
                    break;
                }
                case 1: {
                    f2 = 0.09f;
                    break;
                }
                case 2: {
                    f2 = 0.0027f;
                    break;
                }
                default: {
                    f2 = 8.1E-4f;
                }
            }
            f *= f2;
        }
        if (!systemConfigurationOrchestrator.j()) {
            f /= 5.0f;
        }
        return f;
    }

    private Stack<EntityCollectionManager> E(N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager, NetworkProtocolNegotiator networkProtocolNegotiator, ProtocolNegotiationStrategy protocolNegotiationStrategy) {
        Stack<EntityCollectionManager> stack;
        block14: {
            Object object;
            int n;
            long l = v ^ 0x1ECBD97C03F9L;
            stack = null;
            Object object2 = ResourceAllocationTracker.a("c", (int)30480, (long)(0x46EE0F03F241E583L ^ l));
            for (n = 0; n < 4; ++n) {
                int n2 = adaptiveConfigurationManager.g();
                int n3 = (n2 + n) % 4;
                object = this.Y[n3];
                if (((ObjectLifecycleTracker)object).equals(adaptiveConfigurationManager.z())) continue;
                Stack<EntityCollectionManager> stack2 = Zw.X(n9, null, adaptiveConfigurationManager, protocolNegotiationStrategy, 0);
                try {
                    if (stack2 == null || stack2.isEmpty()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                int n4 = this.r(networkProtocolNegotiator, stack2);
                try {
                    if (stack != null && n4 >= object2) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                object2 = n4;
                stack = stack2;
            }
            try {
                if (stack == null || stack.isEmpty()) break block14;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
            for (n = stack.size() - 1; n >= 2; --n) {
                EntityCollectionManager entityCollectionManager = (EntityCollectionManager)stack.get(n);
                EntityCollectionManager entityCollectionManager2 = (EntityCollectionManager)stack.get(n - 1);
                object = (EntityCollectionManager)stack.get(n - 2);
                try {
                    try {
                        try {
                            if (!entityCollectionManager.J() || entityCollectionManager2.J()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        if (!((EntityCollectionManager)object).J()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    entityCollectionManager.N(entityCollectionManager2.c);
                    ((EntityCollectionManager)object).q(((EntityCollectionManager)object).d);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
        }
        return stack;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2AD3;
        if (bb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = V[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationTracker.bb[n2] = n3;
        }
        return bb[n2];
    }

    @Override
    public void v() {
        block2: {
            try {
                if (!this.d || this.r.s().booleanValue()) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
            this.d = false;
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().f();
            connectionPoolOrchestrator1192.e();
        }
    }

    private void G() {
        try {
            if (this.O != null) {
                this.o.m(this);
                ServiceLifecycleController.c.I(this.O);
                this.O = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker.a(customSystemException);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static int c(ResourceAllocationTracker resourceAllocationTracker, NetworkProtocolNegotiator networkProtocolNegotiator, Vector vector) {
        return resourceAllocationTracker.r(networkProtocolNegotiator, vector);
    }

    public boolean s(TransactionCorrelationEngine transactionCorrelationEngine, LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (transactionCorrelationEngine.u().c()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker.a(customSystemException);
        }
        return true;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationTracker.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int r(NetworkProtocolNegotiator networkProtocolNegotiator, Vector<EntityCollectionManager> vector) {
        int n = vector.size();
        for (EntityCollectionManager entityCollectionManager : vector) {
            for (AdaptiveConfigurationManager adaptiveConfigurationManager : this.Y) {
                block31: {
                    TransactionCorrelationEngine transactionCorrelationEngine;
                    N9 n9;
                    block29: {
                        block30: {
                            try {
                                try {
                                    if (entityCollectionManager.c != null && entityCollectionManager.c.p() == adaptiveConfigurationManager.p()) {
                                        continue;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            try {
                                try {
                                    if (entityCollectionManager.d != null && entityCollectionManager.d.p() == adaptiveConfigurationManager.p()) {
                                        continue;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            try {
                                if (!entityCollectionManager.J()) break block29;
                                if (entityCollectionManager.Q(adaptiveConfigurationManager)) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            n9 = entityCollectionManager.M.m(adaptiveConfigurationManager);
                            transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                            try {
                                if (PatternMatchingOrchestrator.a(transactionCorrelationEngine)) {
                                    ++n;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                        }
                        n9 = entityCollectionManager.M;
                        transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                        try {
                            try {
                                if (PatternMatchingOrchestrator.a(transactionCorrelationEngine) || PatternMatchingOrchestrator.z(transactionCorrelationEngine)) break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            ++n;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                    }
                    n9 = entityCollectionManager.N;
                    transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                    try {
                        try {
                            if (PatternMatchingOrchestrator.a(transactionCorrelationEngine) || PatternMatchingOrchestrator.z(transactionCorrelationEngine)) break block31;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        ++n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                }
                if (entityCollectionManager.p(adaptiveConfigurationManager)) continue;
                N9 n9 = entityCollectionManager.N.m(adaptiveConfigurationManager);
                TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                try {
                    if (!PatternMatchingOrchestrator.a(transactionCorrelationEngine)) continue;
                    ++n;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
        }
        return n;
    }

    private boolean M(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator) {
        int n = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.F());
        int n2 = AdaptiveComputationEngine.Q(((oQ)systemConfigurationOrchestrator.L()).c() - 1.0);
        int n3 = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.B());
        TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n, n2, n3);
        return PatternMatchingOrchestrator.q(transactionCorrelationEngine);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationTracker.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationTracker.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int lambda$findPlacePath$0(int n, DistributedResourceOrchestrator distributedResourceOrchestrator, DistributedResourceOrchestrator distributedResourceOrchestrator2) {
        int n2 = Math.abs(n - distributedResourceOrchestrator.Q.p());
        int n3 = Math.abs(n - distributedResourceOrchestrator2.Q.p());
        return Integer.compare(n3, n2);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void a() {
        Object[] objectArray = gb;
        gb[0] = "t}`";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationTracker.hb[1] = "java/lang/Integer";
        objectArray[2] = "\u001e\tE^\u000fF\u0015\u0006T\u0011r^\u0006\u0001]X";
        objectArray[3] = "Jws?\u001d{Axbp|uJsf*";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "^z+VX\u0000M ;$\u000f\u0017?zw\u001c\u0000\u0003]<8H\u0006l\u0006\"\"TX\f\u0000-|Zd";
    }

    public float P(LightweightExecutionContext lightweightExecutionContext, N9 n9) {
        float f = 1.0f;
        if (lightweightExecutionContext.r()) {
            f *= lightweightExecutionContext.B(n9.x(), n9.J(), n9.b());
        }
        return f;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationTracker.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = ResourceAllocationTracker.a(l, l2);
        Object object = gb[n];
        if (object instanceof String) {
            String string = hb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationTracker.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationTracker.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationTracker.a(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationTracker.gb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationTracker.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationTracker.gb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationTracker.b(238946243714721L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ResourceAllocationTracker.a(l, l2);
        Object object = gb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = hb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceAllocationTracker.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = ResourceAllocationTracker.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationTracker.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationTracker.gb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationTracker.b(238946243714721L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationTracker.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationTracker.gb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationTracker.b(238946243714721L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private void V(oQ oQ2, Color color, Color color2, int n) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block15: {
                                            block14: {
                                                block13: {
                                                    block12: {
                                                        try {
                                                            GL11.glBegin((int)7);
                                                            if (n != 0) break block12;
                                                            GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                                            break block13;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ResourceAllocationTracker.a(customSystemException);
                                                        }
                                                    }
                                                    GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                                                }
                                                try {
                                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
                                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
                                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
                                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
                                                    if (n != 1) break block14;
                                                    GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                                    break block15;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceAllocationTracker.a(customSystemException);
                                                }
                                            }
                                            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                                        }
                                        try {
                                            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
                                            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
                                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
                                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
                                            if (n != 2) break block16;
                                            GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                            break block17;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                    }
                                    GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                                }
                                try {
                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
                                    if (n != 5) break block18;
                                    GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                    break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                            }
                            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                        }
                        try {
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
                            if (n != 3) break block20;
                            GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                            break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                    }
                    GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                }
                try {
                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
                    if (n != 4) break block22;
                    GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                    break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        }
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    private void Y() {
        block12: {
            block10: {
                block11: {
                    try {
                        if (!this.z.s().booleanValue() || this.G == -1) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        try {
                            if (!systemConfigurationOrchestrator.r() || this.G == systemConfigurationOrchestrator.l().v()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        systemConfigurationOrchestrator.l().A(this.G);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                }
                this.G = -1;
            }
            try {
                try {
                    this.B = null;
                    this.A = -1;
                    this.t.removeIf(EntityCollectionManager::A);
                    this.G();
                    this.y();
                    if (!this.Z() || this.N) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                super.T(false);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
        }
    }

    private float w(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, N9 n9, LightweightExecutionContext lightweightExecutionContext) {
        float f;
        block5: {
            float f2;
            float f3;
            TransactionCorrelationEngine transactionCorrelationEngine;
            block4: {
                transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                f3 = 1.0f;
                f2 = this.l(systemConfigurationOrchestrator, lightweightExecutionContext, n9);
                try {
                    if (!(f3 < 0.0f)) break block4;
                    f = 0.0f;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
            try {
                f = !this.s(transactionCorrelationEngine, lightweightExecutionContext) ? f2 / f3 / 100.0f : f2 / f3 / 30.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
        }
        return f;
    }

    private boolean b(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block13: {
            block12: {
                block11: {
                    try {
                        try {
                            if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                }
                ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                try {
                    if (!protocolInteractionController.B(ReflectionMetadataResolver.YX)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                try {
                    try {
                        if (this.l.s().booleanValue() && !this.L.q(lightweightExecutionContext)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    bl = true;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationTracker.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationTracker.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private IdentityComparator s(NetworkProtocolNegotiator networkProtocolNegotiator, N9 n9) {
        IdentityComparator identityComparator = null;
        double d2 = Double.MAX_VALUE;
        int n = n9.x();
        int n2 = n9.J();
        int n3 = n9.b();
        int n4 = 10;
        for (int i = -n4; i < n4; ++i) {
            for (int j = -n4; j < n4; ++j) {
                for (int k = -3; k < 3; ++k) {
                    int n5 = n + i;
                    int n6 = n2 + k;
                    int n7 = n3 + j;
                    double d3 = Math.sqrt(Math.pow(n5 - n, 2.0) + Math.pow(n7 - n3, 2.0));
                    try {
                        if (!PatternMatchingOrchestrator.z(networkProtocolNegotiator.N(n5, n6, n7)) || !(d3 < d2)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    double d4 = Math.toDegrees(Math.atan2(n7 - n3, n5 - n)) - 90.0;
                    AdaptiveConfigurationManager adaptiveConfigurationManager = AdaptiveConfigurationManager.s(d4);
                    d2 = d3;
                    identityComparator = new IdentityComparator(n5, n6, n7, adaptiveConfigurationManager.p());
                }
            }
        }
        return identityComparator;
    }

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090
    public void q(KB var1_1) {
        block158: {
            block161: {
                block159: {
                    block160: {
                        block131: {
                            block157: {
                                block162: {
                                    block154: {
                                        block155: {
                                            block148: {
                                                block153: {
                                                    block151: {
                                                        block152: {
                                                            block149: {
                                                                block150: {
                                                                    block147: {
                                                                        block146: {
                                                                            block145: {
                                                                                block144: {
                                                                                    block130: {
                                                                                        block129: {
                                                                                            block128: {
                                                                                                block127: {
                                                                                                    block126: {
                                                                                                        var2_2 = ResourceAllocationTracker.v ^ 26964162436786L;
                                                                                                        var4_3 = var1_1.getThePlayer();
                                                                                                        var5_4 = var1_1.getWorld();
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (!var4_3.Y() && !var5_4.Y()) break block126;
                                                                                                            }
                                                                                                            catch (CustomSystemException v0) {
                                                                                                                throw ResourceAllocationTracker.a(v0);
                                                                                                            }
                                                                                                            this.Y();
                                                                                                            return;
                                                                                                        }
                                                                                                        catch (CustomSystemException v1) {
                                                                                                            throw ResourceAllocationTracker.a(v1);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (!this.N && !this.R.F(this)) break block127;
                                                                                                        }
                                                                                                        catch (CustomSystemException v2) {
                                                                                                            throw ResourceAllocationTracker.a(v2);
                                                                                                        }
                                                                                                        this.Y();
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (CustomSystemException v3) {
                                                                                                        throw ResourceAllocationTracker.a(v3);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (this.R.z(this) || this.R.O(this, this.F.s())) break block128;
                                                                                                    }
                                                                                                    catch (CustomSystemException v4) {
                                                                                                        throw ResourceAllocationTracker.a(v4);
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                                catch (CustomSystemException v5) {
                                                                                                    throw ResourceAllocationTracker.a(v5);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (this.A != -1 && this.R(var4_3, var5_4, this.A)) break block129;
                                                                                                }
                                                                                                catch (CustomSystemException v6) {
                                                                                                    throw ResourceAllocationTracker.a(v6);
                                                                                                }
                                                                                                this.A = this.p(var4_3, var5_4);
                                                                                            }
                                                                                            catch (CustomSystemException v7) {
                                                                                                throw ResourceAllocationTracker.a(v7);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (this.A == -1 || this.N) break block130;
                                                                                                }
                                                                                                catch (CustomSystemException v8) {
                                                                                                    throw ResourceAllocationTracker.a(v8);
                                                                                                }
                                                                                                if (!this.t.isEmpty()) break block130;
                                                                                            }
                                                                                            catch (CustomSystemException v9) {
                                                                                                throw ResourceAllocationTracker.a(v9);
                                                                                            }
                                                                                            this.l(var4_3, var5_4);
                                                                                        }
                                                                                        catch (CustomSystemException v10) {
                                                                                            throw ResourceAllocationTracker.a(v10);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (this.A == -1 || this.t.isEmpty()) break block131;
                                                                                        }
                                                                                        catch (CustomSystemException v11) {
                                                                                            throw ResourceAllocationTracker.a(v11);
                                                                                        }
                                                                                        if (this.N) break block131;
                                                                                    }
                                                                                    catch (CustomSystemException v12) {
                                                                                        throw ResourceAllocationTracker.a(v12);
                                                                                    }
                                                                                    var6_5 = this.t.get(0);
                                                                                    var7_7 = var6_5.N;
                                                                                    try {
                                                                                        if (!Zw.R(var5_4, var4_3, var7_7)) {
                                                                                            this.Y();
                                                                                            TemporalMetadataResolver.h.c().t((String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)23681, (long)(7712171648315528012L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), (String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)21526, (long)(7218545696660560854L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), CryptoConfigurationRegistry383.WARNING, 2000L);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    catch (CustomSystemException v13) {
                                                                                        throw ResourceAllocationTracker.a(v13);
                                                                                    }
                                                                                    var4_3.l().A(this.A);
                                                                                    var8_9 = PatternMatchingOrchestrator.C(var4_3, var7_7);
                                                                                    if (!var8_9) {
                                                                                        var9_10 = (double)var7_7.x() + 0.5;
                                                                                        var11_13 = (double)var7_7.b() + 0.5;
                                                                                        var13_15 = var4_3.w(var9_10, var4_3.V(), var11_13);
                                                                                        try {
                                                                                            if (var13_15 > 1.75) {
                                                                                                this.Y();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        catch (CustomSystemException v14) {
                                                                                            throw ResourceAllocationTracker.a(v14);
                                                                                        }
                                                                                        try {
                                                                                            this.o.E(this);
                                                                                            if (this.O != null) ** GOTO lbl116
                                                                                            this.O = new PhysicsSimulator(var9_10, var11_13);
                                                                                            this.O.d(0.075);
                                                                                            this.O.b(false);
                                                                                            ServiceLifecycleController.c.N(this.O);
                                                                                        }
                                                                                        catch (CustomSystemException v15) {
                                                                                            throw ResourceAllocationTracker.a(v15);
                                                                                        }
                                                                                    } else {
                                                                                        block132: {
                                                                                            try {
                                                                                                if (!this.n.s().booleanValue() || this.d) break block132;
                                                                                            }
                                                                                            catch (CustomSystemException v16) {
                                                                                                throw ResourceAllocationTracker.a(v16);
                                                                                            }
                                                                                            var9_11 = ApplicationLifecycleManager.N().f();
                                                                                            var9_11.p(true);
                                                                                            this.d = true;
                                                                                        }
                                                                                        this.G();
                                                                                    }
lbl116:
                                                                                    // 3 sources

                                                                                    var9_12 = 0;
                                                                                    for (var10_17 = this.t.size() - 1; var10_17 >= 0; --var10_17) {
                                                                                        var11_14 = this.t.get(var10_17);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!var11_14.q.isEmpty() || var11_14.g != 0) continue;
                                                                                                    }
                                                                                                    catch (CustomSystemException v17) {
                                                                                                        throw ResourceAllocationTracker.a(v17);
                                                                                                    }
                                                                                                    this.O(var7_7, var11_14, var4_3, var5_4);
                                                                                                    if (!var11_14.q.isEmpty()) continue;
                                                                                                }
                                                                                                catch (CustomSystemException v18) {
                                                                                                    throw ResourceAllocationTracker.a(v18);
                                                                                                }
                                                                                                if (!var11_14.J()) continue;
                                                                                            }
                                                                                            catch (CustomSystemException v19) {
                                                                                                throw ResourceAllocationTracker.a(v19);
                                                                                            }
                                                                                            ++var9_12;
                                                                                            continue;
                                                                                        }
                                                                                        catch (CustomSystemException v20) {
                                                                                            throw ResourceAllocationTracker.a(v20);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v21 = GeometryCalculator.C() > 13 ? (double)var4_3.E() : 0.0;
                                                                                    }
                                                                                    catch (CustomSystemException v22) {
                                                                                        throw ResourceAllocationTracker.a(v22);
                                                                                    }
                                                                                    var10_18 = v21;
                                                                                    var12_19 = ContextualEventDispatcher.N(var4_3.F(), var4_3.y() + var10_18, var4_3.B());
                                                                                    this.B = null;
                                                                                    var13_16 = 0;
                                                                                    for (var14_20 = this.t.size() - 1; var14_20 >= 0; --var14_20) {
                                                                                        var15_22 = this.t.get(var14_20);
                                                                                        try {
                                                                                            if (var15_22.q.isEmpty() || this.B != null) continue;
                                                                                        }
                                                                                        catch (CustomSystemException v23) {
                                                                                            throw ResourceAllocationTracker.a(v23);
                                                                                        }
                                                                                        var16_24 = var15_22.q;
                                                                                        var17_26 = 0;
                                                                                        block116: while (!var16_24.isEmpty()) {
                                                                                            var18_28 = var16_24.get(0);
                                                                                            var19_29 = var18_28.N;
                                                                                            while (!var19_29.isEmpty()) {
                                                                                                block133: {
                                                                                                    block143: {
                                                                                                        block142: {
                                                                                                            block134: {
                                                                                                                block141: {
                                                                                                                    block140: {
                                                                                                                        block135: {
                                                                                                                            block139: {
                                                                                                                                block138: {
                                                                                                                                    block137: {
                                                                                                                                        block136: {
                                                                                                                                            var20_30 = var19_29.firstElement();
                                                                                                                                            if (var20_30 == null) continue;
                                                                                                                                            var21_31 = var20_30.h();
                                                                                                                                            var22_32 = var5_4.N(var21_31.x(), var21_31.J(), var21_31.b());
                                                                                                                                            try {
                                                                                                                                                if (!PatternMatchingOrchestrator.a(var22_32)) break block133;
                                                                                                                                                if (!Zw.R(var5_4, var4_3, var21_31)) break block134;
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v24) {
                                                                                                                                                throw ResourceAllocationTracker.a(v24);
                                                                                                                                            }
                                                                                                                                            var23_33 = Zw.m(var4_3, (NetworkProtocolNegotiator)var5_4, var12_19, var20_30);
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (var23_33 == null) break block135;
                                                                                                                                                    v25 = var15_22.N.x();
                                                                                                                                                    v26 = var15_22.N.J();
                                                                                                                                                    v27 = var15_22.N.b();
                                                                                                                                                    v28 = var15_22.N.x() + 1;
                                                                                                                                                    v29 = var15_22.N.J();
                                                                                                                                                    if (!var15_22.J()) break block136;
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v30) {
                                                                                                                                                    throw ResourceAllocationTracker.a(v30);
                                                                                                                                                }
                                                                                                                                                v31 = 2;
                                                                                                                                                break block137;
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v32) {
                                                                                                                                                throw ResourceAllocationTracker.a(v32);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v31 = 1;
                                                                                                                                    }
                                                                                                                                    var24_34 = oQ.E(v25, v26, v27, v28, v29 + v31, var15_22.N.b() + 1);
                                                                                                                                    var24_34 = var24_34.B(1.0, 1.0, 1.0);
                                                                                                                                    try {
                                                                                                                                        if (Zw.h(var5_4, var4_3, var24_34, var12_19, var23_33)) {
                                                                                                                                            this.B = var20_30;
                                                                                                                                            this.B.Q = var23_33;
                                                                                                                                            break block116;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v33) {
                                                                                                                                        throw ResourceAllocationTracker.a(v33);
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (var15_22.g != 0) break block138;
                                                                                                                                        ++var17_26;
                                                                                                                                        break block139;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v34) {
                                                                                                                                        throw ResourceAllocationTracker.a(v34);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                ++var13_16;
                                                                                                                            }
                                                                                                                            var16_24.remove(0);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (var15_22.g != 0) break block140;
                                                                                                                            ++var17_26;
                                                                                                                            break block141;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v35) {
                                                                                                                            throw ResourceAllocationTracker.a(v35);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    ++var13_16;
                                                                                                                }
                                                                                                                var16_24.remove(0);
                                                                                                                break;
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var15_22.g != 0) break block142;
                                                                                                                ++var17_26;
                                                                                                                break block143;
                                                                                                            }
                                                                                                            catch (CustomSystemException v36) {
                                                                                                                throw ResourceAllocationTracker.a(v36);
                                                                                                            }
                                                                                                        }
                                                                                                        ++var13_16;
                                                                                                    }
                                                                                                    var16_24.remove(0);
                                                                                                    break;
                                                                                                }
                                                                                                var19_29.removeElementAt(0);
                                                                                            }
                                                                                            try {
                                                                                                if (this.B != null) {
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            catch (CustomSystemException v37) {
                                                                                                throw ResourceAllocationTracker.a(v37);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (var16_24.isEmpty() || var17_26 != 0) continue;
                                                                                                }
                                                                                                catch (CustomSystemException v38) {
                                                                                                    throw ResourceAllocationTracker.a(v38);
                                                                                                }
                                                                                                var16_24.remove(0);
                                                                                                var15_22.g = -1;
                                                                                            }
                                                                                            catch (CustomSystemException v39) {
                                                                                                throw ResourceAllocationTracker.a(v39);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var17_26 <= 0 || this.B != null) continue;
                                                                                                    }
                                                                                                    catch (CustomSystemException v40) {
                                                                                                        throw ResourceAllocationTracker.a(v40);
                                                                                                    }
                                                                                                    if (!var15_22.q.isEmpty()) continue;
                                                                                                }
                                                                                                catch (CustomSystemException v41) {
                                                                                                    throw ResourceAllocationTracker.a(v41);
                                                                                                }
                                                                                                if (var15_22.g != 0) continue;
                                                                                            }
                                                                                            catch (CustomSystemException v42) {
                                                                                                throw ResourceAllocationTracker.a(v42);
                                                                                            }
                                                                                            this.O(var7_7, var15_22, var4_3, var5_4);
                                                                                            ++var15_22.g;
                                                                                            ++var14_20;
                                                                                            continue;
                                                                                        }
                                                                                        catch (CustomSystemException v43) {
                                                                                            throw ResourceAllocationTracker.a(v43);
                                                                                        }
                                                                                    }
                                                                                    if (this.B == null) break block162;
                                                                                    var14_21 = this.B.h();
                                                                                    try {
                                                                                        try {
                                                                                            if (!var8_9 && PatternMatchingOrchestrator.C(var4_3, var14_21)) break block144;
                                                                                        }
                                                                                        catch (CustomSystemException v44) {
                                                                                            throw ResourceAllocationTracker.a(v44);
                                                                                        }
                                                                                        v45 = true;
                                                                                        break block145;
                                                                                    }
                                                                                    catch (CustomSystemException v46) {
                                                                                        throw ResourceAllocationTracker.a(v46);
                                                                                    }
                                                                                }
                                                                                v45 = false;
                                                                            }
                                                                            var15_23 = v45;
                                                                            try {
                                                                                try {
                                                                                    if (!var15_23 || !this.o()) break block146;
                                                                                }
                                                                                catch (CustomSystemException v47) {
                                                                                    throw ResourceAllocationTracker.a(v47);
                                                                                }
                                                                                v48 = true;
                                                                                break block147;
                                                                            }
                                                                            catch (CustomSystemException v49) {
                                                                                throw ResourceAllocationTracker.a(v49);
                                                                            }
                                                                        }
                                                                        v48 = false;
                                                                    }
                                                                    var16_25 = v48;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var16_25) break block148;
                                                                                if (this.w != null) break block149;
                                                                            }
                                                                            catch (CustomSystemException v50) {
                                                                                throw ResourceAllocationTracker.a(v50);
                                                                            }
                                                                            if (!this.F.s().booleanValue()) break block150;
                                                                        }
                                                                        catch (CustomSystemException v51) {
                                                                            throw ResourceAllocationTracker.a(v51);
                                                                        }
                                                                        this.w = new CryptographicSecurityProvider();
                                                                        break block149;
                                                                    }
                                                                    catch (CustomSystemException v52) {
                                                                        throw ResourceAllocationTracker.a(v52);
                                                                    }
                                                                }
                                                                this.w = new AuthenticationGateway(this.B.Q);
                                                            }
                                                            try {
                                                                this.w.N(0.0f);
                                                                this.w.F(true);
                                                                this.w.q(true);
                                                                this.w.J(true);
                                                                this.w.i(true);
                                                                this.w.L(((Double)this.X.J()).floatValue());
                                                                this.w.h(false);
                                                                if (this.w instanceof AuthenticationGateway) {
                                                                    ((AuthenticationGateway)this.w).W(false);
                                                                }
                                                            }
                                                            catch (CustomSystemException v53) {
                                                                throw ResourceAllocationTracker.a(v53);
                                                            }
                                                            try {
                                                                try {
                                                                    if (!this.P.m((long)this.m.l() / 2L)) break block151;
                                                                    if (!(this.w instanceof AuthenticationGateway)) break block152;
                                                                }
                                                                catch (CustomSystemException v54) {
                                                                    throw ResourceAllocationTracker.a(v54);
                                                                }
                                                                ((AuthenticationGateway)this.w).F(this.B.Q);
                                                                break block153;
                                                            }
                                                            catch (CustomSystemException v55) {
                                                                throw ResourceAllocationTracker.a(v55);
                                                            }
                                                        }
                                                        try {
                                                            if (!(this.w instanceof CryptographicSecurityProvider)) ** GOTO lbl366
                                                            ((CryptographicSecurityProvider)this.w).F(this.B.Q);
                                                        }
                                                        catch (CustomSystemException v56) {
                                                            throw ResourceAllocationTracker.a(v56);
                                                        }
                                                    }
                                                    this.w.v(-999.0f, -999.0f);
                                                }
                                                ConfigurationCalibrator.b.W(this.w);
                                                break block158;
                                            }
                                            try {
                                                try {
                                                    if (this.w == null) break block154;
                                                    if (!(this.w instanceof AuthenticationGateway)) break block155;
                                                }
                                                catch (CustomSystemException v57) {
                                                    throw ResourceAllocationTracker.a(v57);
                                                }
                                                ConfigurationCalibrator.b.v(this.w);
                                                break block154;
                                            }
                                            catch (CustomSystemException v58) {
                                                throw ResourceAllocationTracker.a(v58);
                                            }
                                        }
                                        this.w.v(-999.0f, -999.0f);
                                    }
                                    if (this.K.m((long)this.m.l())) {
                                        block156: {
                                            var17_27 = ApplicationLifecycleManager.N().G();
                                            try {
                                                try {
                                                    if (!var17_27.b() && !var17_27.k()) break block156;
                                                }
                                                catch (CustomSystemException v59) {
                                                    throw ResourceAllocationTracker.a(v59);
                                                }
                                                ConnectionPoolOrchestrator1192.d(var17_27, false);
                                            }
                                            catch (CustomSystemException v60) {
                                                throw ResourceAllocationTracker.a(v60);
                                            }
                                        }
                                        var18_28 = ApplicationLifecycleManager.N().D();
                                        var18_28.X(1);
                                        this.K.m();
                                        this.P.m();
                                    }
                                    break block158;
                                }
                                try {
                                    this.Y();
                                    if (var13_16 <= 0) break block157;
                                    TemporalMetadataResolver.h.c().t((String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)22536, (long)(4052364602276190170L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), (String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)7314, (long)(4337870410700215146L ^ var2_2)), (long)7281226644142583553L, (long)var2_2) + var13_16 + (String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)25949, (long)(6016454736279251605L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), CryptoConfigurationRegistry383.WARNING, 2000L);
                                    break block158;
                                }
                                catch (CustomSystemException v61) {
                                    throw ResourceAllocationTracker.a(v61);
                                }
                            }
                            try {
                                if (var9_12 <= 0) ** GOTO lbl444
                                TemporalMetadataResolver.h.c().t((String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)8384, (long)(1486535275356516125L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), (String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)18858, (long)(247799909202429532L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), CryptoConfigurationRegistry383.WARNING, 2000L);
                            }
                            catch (CustomSystemException v62) {
                                throw ResourceAllocationTracker.a(v62);
                            }
                        }
                        try {
                            v63 = this.t.isEmpty() == false;
                        }
                        catch (CustomSystemException v64) {
                            throw ResourceAllocationTracker.a(v64);
                        }
                        var6_6 = v63;
                        try {
                            try {
                                if (this.A != -1) break block159;
                                if (!var6_6) break block160;
                            }
                            catch (CustomSystemException v65) {
                                throw ResourceAllocationTracker.a(v65);
                            }
                            v66 = ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)25073, (long)(2168230010250702379L ^ var2_2)), (long)7281226644142583553L, (long)var2_2);
                            break block161;
                        }
                        catch (CustomSystemException v67) {
                            throw ResourceAllocationTracker.a(v67);
                        }
                    }
                    v66 = ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)9699, (long)(489722751524661799L ^ var2_2)), (long)7281226644142583553L, (long)var2_2);
                    break block161;
                }
                v66 = ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)24582, (long)(6073136417819504577L ^ var2_2)), (long)7281226644142583553L, (long)var2_2);
            }
            var7_8 = v66;
            TemporalMetadataResolver.h.c().t((String)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)11846, (long)(6533676132978385304L ^ var2_2)), (long)7281226644142583553L, (long)var2_2), (String)var7_8, CryptoConfigurationRegistry383.WARNING, 2000L);
            this.Y();
        }
    }

    private IdentityComparator p(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator) {
        IdentityComparator identityComparator = null;
        double d2 = Double.MAX_VALUE;
        IdentityComparator identityComparator2 = new IdentityComparator(systemConfigurationOrchestrator.F(), ((oQ)systemConfigurationOrchestrator.L()).c(), systemConfigurationOrchestrator.B(), 0);
        Stack<EntityCollectionManager> stack = new Stack<EntityCollectionManager>();
        for (int i = 0; i > -2; --i) {
            CompressionUtility compressionUtility = identityComparator2.X(0, i, 0);
            for (int j = 0; j < 4; ++j) {
                double d3;
                TransactionCorrelationEngine transactionCorrelationEngine;
                AdaptiveConfigurationManager adaptiveConfigurationManager;
                block6: {
                    int n = systemConfigurationOrchestrator.d().g();
                    int n2 = (n + j) % 4;
                    adaptiveConfigurationManager = this.Y[n2];
                    CompressionUtility compressionUtility2 = compressionUtility.C(adaptiveConfigurationManager);
                    transactionCorrelationEngine = networkProtocolNegotiator.N(compressionUtility2.z(), compressionUtility2.h(), compressionUtility2.A());
                    try {
                        if (!PatternMatchingOrchestrator.e(transactionCorrelationEngine) || !PatternMatchingOrchestrator.q(networkProtocolNegotiator.N(compressionUtility2.z(), compressionUtility2.h() - 1, compressionUtility2.A()))) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    int[] nArray = this.X(adaptiveConfigurationManager);
                    if (nArray == null) continue;
                    for (int n3 : nArray) {
                        CompressionUtility compressionUtility3 = compressionUtility2.C(AdaptiveConfigurationManager.d(n3));
                        TransactionCorrelationEngine transactionCorrelationEngine2 = networkProtocolNegotiator.N(compressionUtility3.z(), compressionUtility3.h(), compressionUtility3.A());
                        if (!PatternMatchingOrchestrator.q(transactionCorrelationEngine2)) continue;
                        stack.clear();
                        stack.push(new EntityCollectionManager(compressionUtility2.v(), adaptiveConfigurationManager));
                        double d4 = this.r(networkProtocolNegotiator, stack);
                        if (!(d4 < d2)) continue;
                        d2 = d4;
                        identityComparator = new IdentityComparator(compressionUtility2, n3);
                    }
                    continue;
                }
                if (!PatternMatchingOrchestrator.q(transactionCorrelationEngine) || !((d3 = (double)this.r(networkProtocolNegotiator, stack)) < d2)) continue;
                d2 = d3;
                identityComparator = new IdentityComparator(identityComparator2, adaptiveConfigurationManager.p());
            }
        }
        if (identityComparator == null) {
            identityComparator = identityComparator2;
        }
        return identityComparator;
    }

    private boolean o() {
        boolean bl;
        block19: {
            boolean bl2;
            block25: {
                boolean bl3;
                AdaptiveConfigurationManager adaptiveConfigurationManager;
                NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                block24: {
                    block23: {
                        boolean bl4;
                        block26: {
                            boolean bl5;
                            block22: {
                                block21: {
                                    block20: {
                                        bl = false;
                                        if (this.B == null) break block19;
                                        networkPacketInterceptor1107 = ConfigurationCalibrator.b.m();
                                        try {
                                            if (!networkPacketInterceptor1107.h()) break block19;
                                            if (GeometryCalculator.C() <= GeometryCalculator.W) break block20;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                        bl4 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(this.B.o));
                                        break block26;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (networkPacketInterceptor1107.p() != this.B.o.x() || networkPacketInterceptor1107.b() != this.B.o.J()) break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationTracker.a(customSystemException);
                                            }
                                            if (networkPacketInterceptor1107.m() != this.B.o.b()) break block21;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationTracker.a(customSystemException);
                                        }
                                        bl5 = true;
                                        break block22;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                }
                                bl5 = false;
                            }
                            bl4 = bl5;
                        }
                        try {
                            try {
                                if (!bl4) break block19;
                                if (!this.B.L) break block23;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            adaptiveConfigurationManager = this.B.N;
                            break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                    }
                    adaptiveConfigurationManager = null;
                }
                AdaptiveConfigurationManager adaptiveConfigurationManager2 = adaptiveConfigurationManager;
                try {
                    bl3 = adaptiveConfigurationManager2 == null;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                bl2 = bl3;
                try {
                    try {
                        if (adaptiveConfigurationManager2 == null || !adaptiveConfigurationManager2.equals(networkPacketInterceptor1107.K())) break block25;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    if (!(this.B.Q.x(networkPacketInterceptor1107.i()) <= 0.3)) break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                bl2 = true;
            }
            if (bl2) {
                bl = true;
            }
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void f(GameInputController gameInputController) {
        try {
            if (!this.n.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker.a(customSystemException);
        }
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().f();
        int n = DynamicContextBroker.E(connectionPoolOrchestrator1192);
        try {
            if (n == gameInputController.getKey()) {
                gameInputController.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker.a(customSystemException);
        }
    }

    public ResourceAllocationTracker() {
        long l = v ^ 0x1C2D3AE146DBL;
        super(a.cs((int)ResourceAllocationTracker.a("c", (int)6635, (long)(0x4799EFDED7454E4BL ^ l))), (int)ResourceAllocationTracker.a("c", (int)27216, (long)(0x3EC12790AB7BDEAL ^ l)), RecursiveNodeGraph.k, a.cs((int)ResourceAllocationTracker.a("c", (int)2293, (long)(0x17B6801FD2995F56L ^ l))));
        this.x = new AuthenticationGateway1860((String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)2370, (long)(0x3E68BC08E5A2DEE5L ^ l)), (long)-187715612828895384L, (long)l)));
        this.b = new AuthenticationGateway1860((String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)14637, (long)(0x51792BE34E6D6EBFL ^ l)), (long)-187715612828895384L, (long)l)));
        this.Y = AdaptiveConfigurationManager.Y();
        this.j = AdaptiveConfigurationManager.G();
        this.Z = new int[][]{null, null, {5, 4}, {5, 4}, {2, 3}, {2, 3}};
        this.F = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)24790, (long)(0x5804EDE134F23740L ^ l)), (long)-187715612828895384L, (long)l)), false, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)10102, (long)(0x557FF3942FF970CEL ^ l)), (long)-187715612828895384L, (long)l)));
        this.n = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)14637, (long)(0x4C12D87357BBEEB7L ^ l)), (long)-187715612828895384L, (long)l)), false, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)20803, (long)(0x52B383A16D5106E5L ^ l)), (long)-187715612828895384L, (long)l)));
        this.r = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)28141, (long)(0x59F9FC7F5F563A52L ^ l)), (long)-187715612828895384L, (long)l)), true, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)19040, (long)(0x552EBB3FD19B1DFDL ^ l)), (long)-187715612828895384L, (long)l)));
        this.T = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)2327, (long)(0x772E012E2B36DEAEL ^ l)), (long)-187715612828895384L, (long)l)), true, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)9638, (long)(0x202737CF7535F238L ^ l)), (long)-187715612828895384L, (long)l)));
        this.e = GenericAdapterManager.I(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)17512, (long)(0x241DAB47798093CDL ^ l)), (long)-187715612828895384L, (long)l)), (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)31869, (long)(0x14C99DE361B62BC1L ^ l)), (long)-187715612828895384L, (long)l)), this.x, this.x, this.b);
        this.m = NumericFormattingUtility.K(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)29323, (long)(0x514C4C42CD6DA518L ^ l)), (long)-187715612828895384L, (long)l)), (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)26424, (long)(0x316CFD10272309AL ^ l)), (long)-187715612828895384L, (long)l)), (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)7987, (long)(0x3D2995279E51C8A3L ^ l)), (long)-187715612828895384L, (long)l)), 0.0, 0.0, 30.0, 250.0, 1.0, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)11367, (long)(0x4AD055464D89FBFFL ^ l)), (long)-187715612828895384L, (long)l)));
        this.X = NumericPrecisionTransformer.D(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)21309, (long)(0x340C62D0EEDC84A4L ^ l)), (long)-187715612828895384L, (long)l)), (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)21024, (long)(0x67FBFB2E78A3859EL ^ l)), (long)-187715612828895384L, (long)l)), "", 1.0, 12.0, 25.0, 0.1, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)21647, (long)(0x76E6FA3170E40325L ^ l)), (long)-187715612828895384L, (long)l)));
        this.z = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)22178, (long)(0x6C83F09D38378139L ^ l)), (long)-187715612828895384L, (long)l)), true, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)23318, (long)(0x257B620C78720CBEL ^ l)), (long)-187715612828895384L, (long)l)));
        this.l = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)17655, (long)(0x2D454530908C1363L ^ l)), (long)-187715612828895384L, (long)l)), true, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)29222, (long)(0x7C29BF8759ED258DL ^ l)), (long)-187715612828895384L, (long)l)));
        this.L = ColorPaletteManager.o(this, (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)6450, (long)(0x75BD81772E8B4EA5L ^ l)), (long)-187715612828895384L, (long)l)), (String)((Object)ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)6387, (long)(0x233434A317A54F66L ^ l)), (long)-187715612828895384L, (long)l)), ColorPaletteManager.g, RecursiveNodeTreeBuilder.U);
        this.h = new ArrayList<String>(Arrays.asList(ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)24473, (long)(0x704B66F0D281082FL ^ l)), (long)-187715612828895384L, (long)l), ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)25119, (long)(0x611D21734EB1B5ADL ^ l)), (long)-187715612828895384L, (long)l), ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)25052, (long)(0x7151601F0AA9B673L ^ l)), (long)-187715612828895384L, (long)l), ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)5975, (long)(0x1A8E68A2220C40FBL ^ l)), (long)-187715612828895384L, (long)l), ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)8613, (long)(0x36168A6B4F04F618L ^ l)), (long)-187715612828895384L, (long)l), ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)17279, (long)(0x39C0A54AF61794CFL ^ l)), (long)-187715612828895384L, (long)l), ResourceAllocationTracker.c("O", (int)ResourceAllocationTracker.a("c", (int)5142, (long)(0x43211C52DAD4C38AL ^ l)), (long)-187715612828895384L, (long)l)));
        this.R = ConfigurationRegistry.O;
        this.o = ConfigurationRegistry.l;
        this.K = new NetworkConfigManager();
        this.P = new NetworkConfigManager();
        this.G = -1;
        this.A = -1;
        this.t = new ArrayList();
        this.l.l(this.L);
        this.n.l(this.r);
        this.N(this.X, this.m, this.e, this.F, this.n, this.r, this.T, this.z, this.l, this.L);
        this.R.y(this, 9);
    }

    private void n(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, N9 n9) {
        long l = v ^ 0x29A82F80D7C9L;
        Object object = ResourceAllocationTracker.a("c", (int)30480, (long)(0x46EE386004BD31B3L ^ l));
        AssetLoadBalancer assetLoadBalancer = systemConfigurationOrchestrator.l();
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = assetLoadBalancer.F(i);
            float f = this.w(systemConfigurationOrchestrator, networkProtocolNegotiator, n9, lightweightExecutionContext);
            try {
                if (f == 0.0f) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
            int n = (int)(Math.floor(1.0 / (double)f) + 1.0);
            if (n >= object) continue;
            object = n;
        }
    }

    private int[] X(AdaptiveConfigurationManager adaptiveConfigurationManager) {
        return this.Z[adaptiveConfigurationManager.p()];
    }

    private int X(LightweightExecutionContext lightweightExecutionContext) {
        Object object;
        block5: {
            long l = v ^ 0x10DA59AE2FB9L;
            object = ResourceAllocationTracker.a("c", (int)18272, (long)(0x570204758C03F9B7L ^ l));
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                return (int)object;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
        }
        object = this.h.size();
        for (int i = 0; i < this.h.size(); ++i) {
            String string = this.h.get(i);
            if (!lightweightExecutionContext.g().contains(string)) continue;
            object = i;
            break;
        }
        return (int)object;
    }

    static int H(ResourceAllocationTracker resourceAllocationTracker, NetworkProtocolNegotiator networkProtocolNegotiator, Vector vector) {
        return resourceAllocationTracker.U(networkProtocolNegotiator, vector);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int U(NetworkProtocolNegotiator networkProtocolNegotiator, Vector<MultiProtocolSessionManager> vector) {
        int n = vector.size();
        return n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocationTracker.v = MultiContainerRegistry.a(-2165083858884835440L, -4828560085601662983L, MethodHandles.lookup().lookupClass()).a(273049387928650L);
                ResourceAllocationTracker.gb = new Object[5];
                ResourceAllocationTracker.hb = new String[5];
                ResourceAllocationTracker.a();
                ResourceAllocationTracker.fb = new HashMap<K, V>(13);
                var0 = ResourceAllocationTracker.v ^ 79294413941506L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[48];
                var5_4 = 0;
                var6_5 = "\u00fcY\u0017\u00a4\u00c6v\u00cd\u009a\u0081\f\u0086\u00b3\u00c4\u009dR\\\u00cd \u009c\u001c)\u00e6hA\u00fcy\u00bf\u0080\u00e7- \u00d1\u00f4\u00cb(\u00a2!\u001c\u009b\u009f3\u00f7\u00b9\u009d\u00b7;$\u00c8q\u00ad[^\u0002r\u0015\u00c2\u00f0\u0089#F\u009e\u000f7]m\u00ee\u00e6gx\f\u00bd.+\u00e1\u00dd\u00b0y\u00c0\u0095\u00a1q\u0087\u0011w~>h\u00fd\u007f5@\r\u00c8\u0089?[R\u007f\u0094\u00ea\u00ba%\u00de-\u00cc\u00d5F\u001e0\u009e\u00d7\u00bb\u0011\u00f4\u00f8@Z'\u00db\u0004t\u00e6\u00068Oh\u0095\u000b\u00b0\u00c7\u00eb\u00cf,\u008a\u00fen\u00d8x[\u00d6\u00ae\u0098C\u008c5\u00a4\u00c7\u00bcT\u008d\u00d0ZR\u0098\u00ae\u00b0\u00f9%\u0003\u0015\u009f\u00c3\u00daj\u00b7x\r\u00e4l\u0010P\u008ad\u0002\u0015\u00da\u00a0B\u0092\u00f7\u00a2\u00da\u0080\u0091\u008d\u00d8\u00f62\u00cc\u0010ps-<\u00cb\u00a0\u001a\u001e\u0086\u00ab\u0093M\"\u009f\u0080l\u00d1\u00d1\u00f3\u000e\u00f5P\u0006\u008b\u00be\u00be0HFv\u00c9\u00de\u0093\u0081\u00ce\u00e3\u00cc\u001a\u008emH\u00a4\u009a\u00f3 S\u00d3\u00bc\u008a\u001flo\u007f\u00a0\u009b\u008a\u0003\u00b2s\u008e\u00f6\u001eC*\u00c5X\u00b5D\u0014\u00be\u0095~Z]j\r\u00de\u009b\u00c0}\u00af\u00f4\u00e1(i\u008c\u000f\u0093lH\u00e7nhA\u0091\u0083~\u00b5\u009b\u00c4\u00b5\u009d\u00b6\u00e92\u00d0'\u001c\u00f8\u001d\u00bed\u0091\u001c\u00f8\u00df0M\u0002~\u00a5?\u0084\u009c\u0090\u0006<\u00d7\u00dd\u0087LD\u0097\u0090\u00c3\u001b\u00c4S`\u00a3\u00f9\u009ff\u00d7\u00b93\u0084\u00f9\r\u000f\u00b8hD\u00c0\u00b1\u008a\u0003\u00b2(\u00d9\u0011\u007f\u00b5,\u00d9\u00e7\u00b0$\u00be\u001e`4\u008d\u00ba\u00ff\u00e6\u001e\u008e";
                var7_6 = "\u00fcY\u0017\u00a4\u00c6v\u00cd\u009a\u0081\f\u0086\u00b3\u00c4\u009dR\\\u00cd \u009c\u001c)\u00e6hA\u00fcy\u00bf\u0080\u00e7- \u00d1\u00f4\u00cb(\u00a2!\u001c\u009b\u009f3\u00f7\u00b9\u009d\u00b7;$\u00c8q\u00ad[^\u0002r\u0015\u00c2\u00f0\u0089#F\u009e\u000f7]m\u00ee\u00e6gx\f\u00bd.+\u00e1\u00dd\u00b0y\u00c0\u0095\u00a1q\u0087\u0011w~>h\u00fd\u007f5@\r\u00c8\u0089?[R\u007f\u0094\u00ea\u00ba%\u00de-\u00cc\u00d5F\u001e0\u009e\u00d7\u00bb\u0011\u00f4\u00f8@Z'\u00db\u0004t\u00e6\u00068Oh\u0095\u000b\u00b0\u00c7\u00eb\u00cf,\u008a\u00fen\u00d8x[\u00d6\u00ae\u0098C\u008c5\u00a4\u00c7\u00bcT\u008d\u00d0ZR\u0098\u00ae\u00b0\u00f9%\u0003\u0015\u009f\u00c3\u00daj\u00b7x\r\u00e4l\u0010P\u008ad\u0002\u0015\u00da\u00a0B\u0092\u00f7\u00a2\u00da\u0080\u0091\u008d\u00d8\u00f62\u00cc\u0010ps-<\u00cb\u00a0\u001a\u001e\u0086\u00ab\u0093M\"\u009f\u0080l\u00d1\u00d1\u00f3\u000e\u00f5P\u0006\u008b\u00be\u00be0HFv\u00c9\u00de\u0093\u0081\u00ce\u00e3\u00cc\u001a\u008emH\u00a4\u009a\u00f3 S\u00d3\u00bc\u008a\u001flo\u007f\u00a0\u009b\u008a\u0003\u00b2s\u008e\u00f6\u001eC*\u00c5X\u00b5D\u0014\u00be\u0095~Z]j\r\u00de\u009b\u00c0}\u00af\u00f4\u00e1(i\u008c\u000f\u0093lH\u00e7nhA\u0091\u0083~\u00b5\u009b\u00c4\u00b5\u009d\u00b6\u00e92\u00d0'\u001c\u00f8\u001d\u00bed\u0091\u001c\u00f8\u00df0M\u0002~\u00a5?\u0084\u009c\u0090\u0006<\u00d7\u00dd\u0087LD\u0097\u0090\u00c3\u001b\u00c4S`\u00a3\u00f9\u009ff\u00d7\u00b93\u0084\u00f9\r\u000f\u00b8hD\u00c0\u00b1\u008a\u0003\u00b2(\u00d9\u0011\u007f\u00b5,\u00d9\u00e7\u00b0$\u00be\u001e`4\u008d\u00ba\u00ff\u00e6\u001e\u008e".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00f9\u007ff:\u00a7\u0094\u00d1\u00d6\u0088\u00f1uE\u0090\u0001\u00fe\u00f3";
                    var7_6 = "\u00f9\u007ff:\u00a7\u0094\u00d1\u00d6\u0088\u00f1uE\u0090\u0001\u00fe\u00f3".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        ResourceAllocationTracker.V = var8_3;
        ResourceAllocationTracker.bb = new Integer[48];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f4' || c == 'W' || c == '\u00ec' || c == 'L') {
                field = ResourceAllocationTracker.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationTracker.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'O' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void y() {
        block16: {
            try {
                if (this.w != null) {
                    this.w.i(true);
                    this.w.h(false);
                    this.w.J(true);
                    this.w.L(6.0f);
                    ConfigurationCalibrator.b.v(this.w);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
            try {
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    try {
                                        if (ConfigurationCalibrator.b.N() == null || ConfigurationCalibrator.b.N() != this.w) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationTracker.a(customSystemException);
                                    }
                                    if (this.w == null) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                                if (this.w.r()) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                            if (!this.w.F()) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                    }
                    this.w = null;
                    this.R.b(this);
                    if (!this.N) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
                this.N = false;
                super.y(false, true);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
        }
    }

    private boolean R(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, int n) {
        LightweightExecutionContext lightweightExecutionContext;
        block12: {
            block10: {
                try {
                    try {
                        if (!systemConfigurationOrchestrator.Y() && !networkProtocolNegotiator.Y()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker.a(customSystemException);
                }
            }
            lightweightExecutionContext = systemConfigurationOrchestrator.l().F(n);
            try {
                block11: {
                    try {
                        try {
                            if (lightweightExecutionContext.Y() || lightweightExecutionContext.C().Y()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        if (lightweightExecutionContext.J() > 0) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
        }
        return this.b(lightweightExecutionContext);
    }

    private void l(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator) {
        block23: {
            try {
                if (!this.t.isEmpty()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker.a(customSystemException);
            }
            Ny ny = new Ny(this, networkProtocolNegotiator);
            if (this.M(systemConfigurationOrchestrator, networkProtocolNegotiator)) {
                Object object;
                block22: {
                    boolean bl;
                    EntityCollectionManager entityCollectionManager;
                    N9 n9;
                    block21: {
                        IdentityComparator identityComparator = this.p(systemConfigurationOrchestrator, networkProtocolNegotiator);
                        n9 = identityComparator.v();
                        int n = identityComparator.F();
                        entityCollectionManager = new EntityCollectionManager(n9, null);
                        try {
                            if (!this.T.s().booleanValue() || n == 0) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                        IdentityComparator identityComparator2 = this.s(networkProtocolNegotiator, n9);
                        if (identityComparator2 != null) {
                            object = identityComparator2.c();
                            Stack<EntityCollectionManager> stack = this.E(n9, (AdaptiveConfigurationManager)object, networkProtocolNegotiator, ny);
                            try {
                                try {
                                    if (stack == null || stack.isEmpty()) break block21;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationTracker.a(customSystemException);
                                }
                                Collections.reverse(stack);
                                this.t.addAll((Collection<EntityCollectionManager>)stack);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker.a(customSystemException);
                            }
                        }
                    }
                    try {
                        if (this.t.isEmpty()) {
                            this.t.add(entityCollectionManager);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    try {
                        bl = n9.J() == AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.V());
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                    boolean bl2 = bl;
                    object = new ArrayList();
                    for (EntityCollectionManager entityCollectionManager2 : this.t) {
                        try {
                            if (!entityCollectionManager2.J()) continue;
                            ((ArrayList)object).add(new EntityCollectionManager(entityCollectionManager2.M.t(0, 1, 0)));
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker.a(customSystemException);
                        }
                    }
                    try {
                        if (!bl2) break block22;
                        this.t.addAll((Collection<EntityCollectionManager>)object);
                        break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker.a(customSystemException);
                    }
                }
                this.t.addAll(0, (Collection<EntityCollectionManager>)object);
            }
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationTracker.a(l, l2);
            object = gb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationTracker.gb[n] = clazz = Class.forName(hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

