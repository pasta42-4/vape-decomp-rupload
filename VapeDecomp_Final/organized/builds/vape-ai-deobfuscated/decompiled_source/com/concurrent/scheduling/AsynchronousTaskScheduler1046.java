/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.scheduling;

import a.HD;
import a.Wz;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.security.access.SecurityAccessController;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.event.management.EventDispatchProtocol;
import com.exception.system.CustomSystemException;
import com.execution.scheduling.TimedExecutionCoordinator;
import com.media.core.MediaResourceController;
import com.network.config.NetworkConfigurationResolver2717;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicMode;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class AsynchronousTaskScheduler1046
implements NetworkConfigurationResolver2717 {
    private final ArrayBlockingQueue<EventDispatchProtocol> a = new ArrayBlockingQueue(20);
    private final Map<CryptographicMode, AuthenticationStateTracker> U;
    private long F;
    private static AbstractComputationKernel[] A;
    private final Map<CryptoConfigurationRegistry383, MediaResourceController> b = new HashMap<CryptoConfigurationRegistry383, MediaResourceController>();
    private static final long c;

    public void e(EventDispatchProtocol eventDispatchProtocol, boolean bl) {
        block20: {
            try {
                if (!this.T(eventDispatchProtocol)) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler1046.a(customSystemException);
            }
            try {
                try {
                    if (TemporalMetadataResolver.h.F().C.s().booleanValue() || bl) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler1046.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler1046.a(customSystemException);
            }
        }
        try {
            if (!this.v(eventDispatchProtocol.q().p())) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
        try {
            if (this.b.containsKey((Object)eventDispatchProtocol.q())) {
                TemporalMetadataResolver.h.R().m(this.b.get((Object)eventDispatchProtocol.q()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
        double d2 = eventDispatchProtocol.s() + 16.0;
        for (EventDispatchProtocol eventDispatchProtocol2 : this.a) {
            d2 += eventDispatchProtocol2.s() + 2.0;
        }
        try {
            eventDispatchProtocol.E(-d2);
            eventDispatchProtocol.K(0.0);
            eventDispatchProtocol.R(-eventDispatchProtocol.S());
            if (this.a.remainingCapacity() == 0) {
                this.a.remove();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
        try {
            if (!this.a.contains(eventDispatchProtocol)) {
                this.a.add(eventDispatchProtocol);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
    }

    public ArrayBlockingQueue<EventDispatchProtocol> q() {
        return this.a;
    }

    /*
     * Exception decompiling
     */
    public void p() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP]], but top level block is 6[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private boolean T(EventDispatchProtocol eventDispatchProtocol) {
        block29: {
            Wz wz2;
            block28: {
                block27: {
                    block26: {
                        block25: {
                            block24: {
                                wz2 = SystemLifecycleController.C.q().f();
                                try {
                                    try {
                                        if (eventDispatchProtocol.q() != CryptoConfigurationRegistry383.FRIENDS_GENERAL || wz2.P.s().booleanValue()) break block24;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AsynchronousTaskScheduler1046.a(customSystemException);
                                    }
                                    return false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousTaskScheduler1046.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (eventDispatchProtocol.q() != CryptoConfigurationRegistry383.FRIENDS_NEW_REQUEST || wz2.h.s().booleanValue()) break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousTaskScheduler1046.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler1046.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (eventDispatchProtocol.q() != CryptoConfigurationRegistry383.FRIENDS_NEW_CHAT || wz2.l.s().booleanValue()) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler1046.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskScheduler1046.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (eventDispatchProtocol.q() != CryptoConfigurationRegistry383.FRIENDS_ONLINE || wz2.p.s().booleanValue()) break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskScheduler1046.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskScheduler1046.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (eventDispatchProtocol.q() != CryptoConfigurationRegistry383.FRIENDS_PARTY_GENERAL || wz2.A.s().booleanValue()) break block28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskScheduler1046.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler1046.a(customSystemException);
                }
            }
            try {
                try {
                    if (eventDispatchProtocol.q() != CryptoConfigurationRegistry383.FRIENDS_PARTY_INVITE || wz2.Y.s().booleanValue()) break block29;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler1046.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler1046.a(customSystemException);
            }
        }
        return true;
    }

    public void C(String string, String string2, CryptoConfigurationRegistry383 cryptoConfigurationRegistry383, long l, boolean bl) {
        this.e(new TimedExecutionCoordinator(cryptoConfigurationRegistry383, string, new SecurityAccessController(string2), 0.0, 0.0, l), bl);
    }

    @DataExchangeProtocol2090
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        try {
            if (!userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
        for (EventDispatchProtocol eventDispatchProtocol : this.a) {
            eventDispatchProtocol.z(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY());
        }
    }

    public static double M(double d2, double d3, long l, double d4) {
        try {
            if (d2 == d3) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
        double d5 = Math.max(d4 * (double)Math.max(1L, l) / 16.666666666666668, 0.1);
        return d3 + AdaptiveComputationEngine.Z(d2 - d3, -d5, d5);
    }

    public static void E(AbstractComputationKernel[] abstractComputationKernelArray) {
        A = abstractComputationKernelArray;
    }

    public void t(String string, String string2, CryptoConfigurationRegistry383 cryptoConfigurationRegistry383, long l) {
        this.C(string, string2, cryptoConfigurationRegistry383, l, false);
    }

    public void L(String string, String string2, long l) {
        this.t(string, string2, CryptoConfigurationRegistry383.INFO, l);
    }

    private boolean v(CryptographicMode cryptographicMode) {
        try {
            if (!this.U.containsKey((Object)cryptographicMode)) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler1046.a(customSystemException);
        }
        return this.U.get((Object)cryptographicMode).s();
    }

    public AsynchronousTaskScheduler1046() {
        this.U = new HashMap<CryptographicMode, AuthenticationStateTracker>();
        this.b.put(CryptoConfigurationRegistry383.FRIENDS_NEW_CHAT, HD.o);
        this.b.put(CryptoConfigurationRegistry383.FRIENDS_PARTY_INVITE, HD.p);
        this.U.put(CryptographicMode.FRIENDS, TemporalMetadataResolver.h.F().r);
    }

    public void h(EventDispatchProtocol eventDispatchProtocol) {
        this.e(eventDispatchProtocol, false);
    }

    static {
        c = MultiContainerRegistry.a(4276883645690760811L, -636794449723800010L, MethodHandles.lookup().lookupClass()).a(176865740714206L);
        if (AsynchronousTaskScheduler1046.O() == null) {
            AsynchronousTaskScheduler1046.E(new AbstractComputationKernel[1]);
        }
    }

    public static AbstractComputationKernel[] O() {
        return A;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

