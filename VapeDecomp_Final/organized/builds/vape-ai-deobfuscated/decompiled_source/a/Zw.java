/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dv;
import a.N9;
import a.Qh;
import a._Y;
import a.kg;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.core.identification.UniqueIdentifierGenerator;
import com.collections.management.MultiContainerRegistry;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.entity.EntityCollectionManager;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolNegotiationStrategy;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.crypto.CryptoParameterGenerator;
import com.security.transform.CryptographicTransformer;
import com.session.management.MultiProtocolSessionManager;
import com.simulation.core.ModelSimulationEngine;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.text.processing.PatternMatchingOrchestrator;
import com.validation.core.ObjectValidator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Zw {
    private static final Integer[] c;
    private static final long[] b;
    private static AdaptiveConfigurationManager[] H;
    private static final long a;
    private static final Map d;
    private static AdaptiveConfigurationManager[] T;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Zw.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Exception decompiling
     */
    public static ContextualEventDispatcher g(SystemConfigurationOrchestrator var0, NetworkProtocolNegotiator var1_1, ContextualEventDispatcher var2_2, MultiProtocolSessionManager var3_3, float var4_4, float var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[UNCONDITIONALDOLOOP]], but top level block is 9[TRYBLOCK]
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

    private static void s(double d2, double d3, double d4, kg kg2, float f, float f2, PriorityQueue<UniqueIdentifierGenerator> priorityQueue) {
        double d5 = Zw.C(kg2, new kg(d2, d3, d4), f, f2);
        priorityQueue.add(new UniqueIdentifierGenerator(d2, d3, d4, d5));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void Z(oQ oQ2, int n, kg kg2, float f, float f2, PriorityQueue<UniqueIdentifierGenerator> priorityQueue) {
        double d2 = (oQ2.F() + oQ2.f()) / 2.0;
        double d3 = (oQ2.c() + oQ2.P()) / 2.0;
        double d4 = (oQ2.v() + oQ2.R()) / 2.0;
        try {
            switch (n) {
                case 0: {
                    Zw.s(d2, oQ2.c(), d4, kg2, f, f2, priorityQueue);
                    return;
                }
                case 1: {
                    Zw.s(d2, oQ2.P(), d4, kg2, f, f2, priorityQueue);
                    return;
                }
                case 2: {
                    Zw.s(d2, d3, oQ2.v(), kg2, f, f2, priorityQueue);
                    return;
                }
                case 3: {
                    Zw.s(d2, d3, oQ2.R(), kg2, f, f2, priorityQueue);
                    return;
                }
                case 4: {
                    Zw.s(oQ2.F(), d3, d4, kg2, f, f2, priorityQueue);
                    return;
                }
                case 5: {
                    Zw.s(oQ2.f(), d3, d4, kg2, f, f2, priorityQueue);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
    }

    public static ContextualEventDispatcher m(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, ContextualEventDispatcher contextualEventDispatcher, MultiProtocolSessionManager multiProtocolSessionManager) {
        ContextualEventDispatcher contextualEventDispatcher2;
        block62: {
            double d2;
            oQ oQ2;
            AdaptiveConfigurationManager adaptiveConfigurationManager;
            N9 n9;
            boolean bl;
            block61: {
                boolean bl2;
                contextualEventDispatcher2 = null;
                try {
                    bl2 = GeometryCalculator.C() < GeometryCalculator.C;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                bl = bl2;
                n9 = multiProtocolSessionManager.o;
                adaptiveConfigurationManager = multiProtocolSessionManager.N;
                oQ2 = PatternMatchingOrchestrator.y(networkProtocolNegotiator, n9);
                d2 = 0.002f;
                if (adaptiveConfigurationManager != null) break block61;
                contextualEventDispatcher2 = _Y.U(contextualEventDispatcher, oQ2, 0.0, 0.0, 0.0).l();
                break block62;
            }
            Dv dv = adaptiveConfigurationManager.n();
            oQ2 = oQ2.v(d2, d2, d2);
            double d3 = oQ2.f() - oQ2.F();
            double d4 = oQ2.R() - oQ2.v();
            double d5 = oQ2.P() - oQ2.c();
            double d6 = dv.o();
            double d7 = dv.q();
            double d8 = dv.j();
            for (int i = 0; i <= 100; i += 10) {
                double d9;
                double d10;
                double d11;
                double d12;
                double d13;
                double d14;
                double d15;
                block57: {
                    double d16;
                    block56: {
                        double d17;
                        double d18;
                        block55: {
                            double d19;
                            block54: {
                                double d20;
                                double d21;
                                block53: {
                                    double d22;
                                    block52: {
                                        double d23;
                                        double d24;
                                        block51: {
                                            block50: {
                                                double d25;
                                                double d26;
                                                block49: {
                                                    block48: {
                                                        double d27;
                                                        double d28;
                                                        block47: {
                                                            block46: {
                                                                double d29 = 1.0 - (double)i / 100.0;
                                                                d22 = d3 / 2.0 * d29;
                                                                d19 = d4 / 2.0 * d29;
                                                                d16 = d5 / 2.0 * d29;
                                                                try {
                                                                    d28 = oQ2.F();
                                                                    if (!(d6 > 0.0)) break block46;
                                                                    d27 = d3;
                                                                    break block47;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw Zw.a(customSystemException);
                                                                }
                                                            }
                                                            try {
                                                                d27 = d6 < 0.0 ? 0.0 : d22;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw Zw.a(customSystemException);
                                                            }
                                                        }
                                                        d15 = d28 + d27;
                                                        try {
                                                            d26 = oQ2.c();
                                                            if (!(d7 > 0.0)) break block48;
                                                            d25 = d5;
                                                            break block49;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw Zw.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        d25 = d7 < 0.0 ? 0.0 : d19;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw Zw.a(customSystemException);
                                                    }
                                                }
                                                d14 = d26 + d25;
                                                try {
                                                    d24 = oQ2.v();
                                                    if (!(d8 > 0.0)) break block50;
                                                    d23 = d4;
                                                    break block51;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw Zw.a(customSystemException);
                                                }
                                            }
                                            try {
                                                d23 = d8 < 0.0 ? 0.0 : d16;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                        }
                                        d13 = d24 + d23;
                                        try {
                                            d21 = oQ2.f();
                                            if (!(d6 < 0.0)) break block52;
                                            d20 = d3;
                                            break block53;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                    }
                                    try {
                                        d20 = d6 > 0.0 ? 0.0 : d22;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                }
                                d12 = d21 - d20;
                                try {
                                    d18 = oQ2.P();
                                    if (!(d7 < 0.0)) break block54;
                                    d17 = d5;
                                    break block55;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                            }
                            try {
                                d17 = d7 > 0.0 ? 0.0 : d19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        d11 = d18 - d17;
                        try {
                            d10 = oQ2.R();
                            if (!(d8 < 0.0)) break block56;
                            d9 = d4;
                            break block57;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                    }
                    try {
                        d9 = d8 > 0.0 ? 0.0 : d16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
                double d30 = d10 - d9;
                ContextualEventDispatcher[] contextualEventDispatcherArray = new ContextualEventDispatcher[]{};
                int n = adaptiveConfigurationManager.p();
                if (n == 0) {
                    contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d15, d14, d13), ContextualEventDispatcher.N(d15, d14, d30), ContextualEventDispatcher.N(d12, d14, d30), ContextualEventDispatcher.N(d12, d14, d13)};
                }
                if (n == 1) {
                    contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d15, d11, d13), ContextualEventDispatcher.N(d12, d11, d13), ContextualEventDispatcher.N(d12, d11, d30), ContextualEventDispatcher.N(d15, d11, d30)};
                }
                if (n == 2) {
                    contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d15, d14, d13), ContextualEventDispatcher.N(d12, d14, d13), ContextualEventDispatcher.N(d12, d11, d13), ContextualEventDispatcher.N(d15, d11, d13)};
                }
                if (n == 5) {
                    contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d12, d14, d13), ContextualEventDispatcher.N(d12, d14, d30), ContextualEventDispatcher.N(d12, d11, d30), ContextualEventDispatcher.N(d12, d11, d13)};
                }
                if (n == 3) {
                    contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d15, d14, d30), ContextualEventDispatcher.N(d12, d14, d30), ContextualEventDispatcher.N(d12, d11, d30), ContextualEventDispatcher.N(d15, d11, d30)};
                }
                if (n == 4) {
                    contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d15, d14, d13), ContextualEventDispatcher.N(d15, d14, d30), ContextualEventDispatcher.N(d15, d11, d30), ContextualEventDispatcher.N(d15, d11, d13)};
                }
                for (ContextualEventDispatcher contextualEventDispatcher3 : contextualEventDispatcherArray) {
                    boolean bl3;
                    block58: {
                        boolean bl4;
                        block60: {
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                            block59: {
                                ContextualEventDispatcher contextualEventDispatcher4 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
                                networkPacketInterceptor1107 = networkProtocolNegotiator.g(contextualEventDispatcher4, contextualEventDispatcher3, false, false, bl, systemConfigurationOrchestrator);
                                bl3 = false;
                                try {
                                    try {
                                        if (!networkPacketInterceptor1107.h() || networkPacketInterceptor1107.K().p() != n) break block58;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (GeometryCalculator.C() <= GeometryCalculator.W) break block59;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl3 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(n9));
                                break block58;
                            }
                            try {
                                try {
                                    try {
                                        if (networkPacketInterceptor1107.p() != n9.x() || networkPacketInterceptor1107.b() != n9.J()) break block60;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (networkPacketInterceptor1107.m() != n9.b()) break block60;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl4 = true;
                                break block58;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        bl4 = bl3 = false;
                    }
                    if (!bl3) continue;
                    contextualEventDispatcher2 = contextualEventDispatcher3;
                    break;
                }
                try {
                    if (contextualEventDispatcher2 == null) continue;
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
            }
        }
        return contextualEventDispatcher2;
    }

    public static Stack<EntityCollectionManager> X(N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager, AdaptiveConfigurationManager adaptiveConfigurationManager2, ProtocolNegotiationStrategy<EntityCollectionManager> protocolNegotiationStrategy, int n) {
        AdaptiveConfigurationManager adaptiveConfigurationManager3;
        int[] nArray;
        long l;
        block44: {
            int n2;
            AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray;
            block43: {
                l = a ^ 0x2BDBA1BA1F88L;
                try {
                    try {
                        if (n <= protocolNegotiationStrategy.B() && protocolNegotiationStrategy.O(n9)) break block43;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    return null;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
            }
            try {
                if (T == null) {
                    T = AdaptiveConfigurationManager.G();
                    H = AdaptiveConfigurationManager.Y();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            int n3 = adaptiveConfigurationManager2.g();
            int n4 = H[n3].p();
            try {
                adaptiveConfigurationManagerArray = H;
                n2 = n3 == 0 ? 3 : n3 - 1;
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            int n5 = adaptiveConfigurationManagerArray[n2].p();
            int n6 = H[(n3 + 1) % 4].p();
            int n7 = 0;
            nArray = new int[]{n4, n5, n6, n7};
            try {
                try {
                    if (adaptiveConfigurationManager == null || adaptiveConfigurationManager.p() == 0) break block44;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                if (adaptiveConfigurationManager.p() == adaptiveConfigurationManager2.p()) break block44;
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            nArray = new int[]{n4};
        }
        try {
            adaptiveConfigurationManager3 = adaptiveConfigurationManager == null ? null : adaptiveConfigurationManager.z();
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
        AdaptiveConfigurationManager adaptiveConfigurationManager4 = adaptiveConfigurationManager3;
        Object object = Zw.a("r", (int)3874, (long)(0x6EBDF63747E87D4DL ^ l));
        Stack<Object> stack = null;
        for (int n8 : nArray) {
            Stack<Object> stack2;
            block51: {
                AdaptiveConfigurationManager adaptiveConfigurationManager5;
                N9 n92;
                EntityCollectionManager entityCollectionManager;
                EntityCollectionManager entityCollectionManager2;
                Object object2;
                boolean bl;
                AdaptiveConfigurationManager adaptiveConfigurationManager6;
                block53: {
                    block52: {
                        N9 n93;
                        block48: {
                            AdaptiveConfigurationManager adaptiveConfigurationManager7;
                            N9 n94;
                            EntityCollectionManager entityCollectionManager3;
                            EntityCollectionManager entityCollectionManager4;
                            block50: {
                                block49: {
                                    boolean bl2;
                                    block47: {
                                        block46: {
                                            adaptiveConfigurationManager6 = T[n8];
                                            try {
                                                try {
                                                    if (adaptiveConfigurationManager4 != null && adaptiveConfigurationManager6.p() == adaptiveConfigurationManager4.p()) {
                                                        continue;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw Zw.a(customSystemException);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                            try {
                                                if (adaptiveConfigurationManager6.p() == adaptiveConfigurationManager2.z().p()) {
                                                    continue;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                            n93 = n9.m(adaptiveConfigurationManager6);
                                            try {
                                                try {
                                                    if (adaptiveConfigurationManager != null && adaptiveConfigurationManager.p() == 0) break block46;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw Zw.a(customSystemException);
                                                }
                                                bl2 = true;
                                                break block47;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                        }
                                        bl2 = false;
                                    }
                                    bl = bl2;
                                    stack2 = new Stack<Object>();
                                    try {
                                        try {
                                            EntityCollectionManager entityCollectionManager5;
                                            if (!protocolNegotiationStrategy.X(n93)) break block48;
                                            entityCollectionManager4 = entityCollectionManager5;
                                            entityCollectionManager3 = entityCollectionManager5;
                                            n94 = n9;
                                            if (adaptiveConfigurationManager != null) break block49;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                        adaptiveConfigurationManager7 = null;
                                        break block50;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                }
                                adaptiveConfigurationManager7 = adaptiveConfigurationManager4;
                            }
                            entityCollectionManager4(n94, adaptiveConfigurationManager7, bl);
                            object2 = entityCollectionManager3;
                            ((EntityCollectionManager)object2).c = adaptiveConfigurationManager6;
                            stack2.add(object2);
                            break block51;
                        }
                        object2 = Zw.X(n93, adaptiveConfigurationManager6, adaptiveConfigurationManager2, protocolNegotiationStrategy, n + 1);
                        try {
                            try {
                                EntityCollectionManager entityCollectionManager6;
                                try {
                                    if (object2 == null || ((Vector)object2).isEmpty()) break block51;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                entityCollectionManager2 = entityCollectionManager6;
                                entityCollectionManager = entityCollectionManager6;
                                n92 = n9;
                                if (adaptiveConfigurationManager != null) break block52;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                            adaptiveConfigurationManager5 = null;
                            break block53;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                    }
                    adaptiveConfigurationManager5 = adaptiveConfigurationManager4;
                }
                entityCollectionManager2(n92, adaptiveConfigurationManager5, bl);
                EntityCollectionManager entityCollectionManager7 = entityCollectionManager;
                entityCollectionManager7.c = adaptiveConfigurationManager6;
                stack2.addAll((Collection<Object>)object2);
                stack2.add(entityCollectionManager7);
            }
            try {
                if (stack2.isEmpty()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            int n10 = protocolNegotiationStrategy.d(stack2);
            try {
                if (stack != null && n10 >= object) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            stack = stack2;
            object = n10;
        }
        return stack;
    }

    /*
     * Unable to fully structure code
     */
    private static void T(UniqueIdentifierGenerator var0, int var1_1, kg var2_2, float var3_3, float var4_4, PriorityQueue<UniqueIdentifierGenerator> var5_5, Set<UniqueIdentifierGenerator> var6_6) {
        var7_7 = 0.05;
        switch (var1_1) {
            case 0: 
            case 1: {
                block29: for (var9_8 = -var7_7; var9_8 <= var7_7; var9_8 += var7_7) {
                    var11_11 = -var7_7;
                    while (true) {
                        try {
                            try {
                                try {
                                    if (!(var11_11 <= var7_7)) continue block29;
                                    if (var9_8 == 0.0) {
                                    }
                                    ** GOTO lbl22
                                }
                                catch (CustomSystemException v0) {
                                    throw Zw.a(v0);
                                }
                                if (var11_11 != 0.0) ** GOTO lbl22
                                ** GOTO lbl30
                            }
                            catch (CustomSystemException v1) {
                                throw Zw.a(v1);
                            }
                        }
                        catch (CustomSystemException v2) {
                            throw Zw.a(v2);
                        }
lbl22:
                        // 2 sources

                        var13_14 = var0.M + var9_8;
                        var15_17 = var0.w + var11_11;
                        try {
                            if (!var6_6.contains(var5_5)) {
                                Zw.s(var13_14, var0.i, var15_17, var2_2, var3_3, var4_4, var5_5);
                            }
                        }
                        catch (CustomSystemException v3) {
                            throw Zw.a(v3);
                        }
lbl30:
                        // 2 sources

                        var11_11 += var7_7;
                    }
                }
                break;
            }
            case 2: 
            case 3: {
                block31: for (var9_9 = -var7_7; var9_9 <= var7_7; var9_9 += var7_7) {
                    var11_12 = -var7_7;
                    while (true) {
                        try {
                            try {
                                try {
                                    if (!(var11_12 <= var7_7)) continue block31;
                                    if (var9_9 == 0.0) {
                                    }
                                    ** GOTO lbl52
                                }
                                catch (CustomSystemException v4) {
                                    throw Zw.a(v4);
                                }
                                if (var11_12 != 0.0) ** GOTO lbl52
                                ** GOTO lbl60
                            }
                            catch (CustomSystemException v5) {
                                throw Zw.a(v5);
                            }
                        }
                        catch (CustomSystemException v6) {
                            throw Zw.a(v6);
                        }
lbl52:
                        // 2 sources

                        var13_15 = var0.M + var9_9;
                        var15_18 = var0.i + var11_12;
                        try {
                            if (!var6_6.contains(var5_5)) {
                                Zw.s(var13_15, var15_18, var0.w, var2_2, var3_3, var4_4, var5_5);
                            }
                        }
                        catch (CustomSystemException v7) {
                            throw Zw.a(v7);
                        }
lbl60:
                        // 2 sources

                        var11_12 += var7_7;
                    }
                }
                break;
            }
            case 4: 
            case 5: {
                block33: for (var9_10 = -var7_7; var9_10 <= var7_7; var9_10 += var7_7) {
                    var11_13 = -var7_7;
                    while (true) {
                        try {
                            try {
                                try {
                                    if (!(var11_13 <= var7_7)) continue block33;
                                    if (var9_10 == 0.0) {
                                    }
                                    ** GOTO lbl82
                                }
                                catch (CustomSystemException v8) {
                                    throw Zw.a(v8);
                                }
                                if (var11_13 != 0.0) ** GOTO lbl82
                                ** GOTO lbl90
                            }
                            catch (CustomSystemException v9) {
                                throw Zw.a(v9);
                            }
                        }
                        catch (CustomSystemException v10) {
                            throw Zw.a(v10);
                        }
lbl82:
                        // 2 sources

                        var13_16 = var0.i + var9_10;
                        var15_19 = var0.w + var11_13;
                        try {
                            if (!var6_6.contains(var5_5)) {
                                Zw.s(var0.M, var13_16, var15_19, var2_2, var3_3, var4_4, var5_5);
                            }
                        }
                        catch (CustomSystemException v11) {
                            throw Zw.a(v11);
                        }
lbl90:
                        // 2 sources

                        var11_13 += var7_7;
                    }
                }
                break;
            }
        }
    }

    public static boolean n(ContextualEventDispatcher contextualEventDispatcher, Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager) {
        boolean bl;
        block47: {
            oQ oQ2;
            boolean bl2;
            block54: {
                boolean bl3;
                boolean bl4;
                block43: {
                    boolean bl5;
                    block46: {
                        block45: {
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                            block44: {
                                boolean bl6;
                                block42: {
                                    block41: {
                                        boolean bl7;
                                        bl = false;
                                        try {
                                            bl7 = GeometryCalculator.C() < GeometryCalculator.C;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                        bl2 = bl7;
                                        oQ2 = PatternMatchingOrchestrator.y(networkProtocolNegotiator, n9);
                                        oQ2 = oQ2.v(0.002f, 0.002f, 0.002f);
                                        if (adaptiveConfigurationManager != null) break block54;
                                        ContextualEventDispatcher contextualEventDispatcher2 = _Y.t(qh, oQ2, 0.0, 0.0, 0.0).l();
                                        networkPacketInterceptor1107 = networkProtocolNegotiator.g(contextualEventDispatcher, contextualEventDispatcher2, false, false, bl2, systemConfigurationOrchestrator);
                                        try {
                                            try {
                                                if (!networkPacketInterceptor1107.Y() && !networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block41;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                            bl6 = true;
                                            break block42;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                    }
                                    bl6 = false;
                                }
                                bl4 = bl6;
                                bl3 = false;
                                try {
                                    try {
                                        if (bl4 || !networkPacketInterceptor1107.h()) break block43;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (GeometryCalculator.C() <= GeometryCalculator.W) break block44;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl3 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(n9));
                                break block43;
                            }
                            try {
                                try {
                                    try {
                                        if (networkPacketInterceptor1107.p() != n9.x() || networkPacketInterceptor1107.b() != n9.J()) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (networkPacketInterceptor1107.m() != n9.b()) break block45;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl5 = true;
                                break block46;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        bl5 = false;
                    }
                    bl3 = bl5;
                }
                try {
                    if (!bl4 && !bl3) break block47;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                bl = true;
                break block47;
            }
            double d2 = oQ2.F();
            double d3 = oQ2.c();
            double d4 = oQ2.v();
            double d5 = oQ2.f();
            double d6 = oQ2.P();
            double d7 = oQ2.R();
            ContextualEventDispatcher[] contextualEventDispatcherArray = new ContextualEventDispatcher[]{};
            int n = adaptiveConfigurationManager.p();
            if (n == 0) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d2, d3, d4), ContextualEventDispatcher.N(d2, d3, d7), ContextualEventDispatcher.N(d5, d3, d7), ContextualEventDispatcher.N(d5, d3, d4)};
            }
            if (n == 1) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d2, d6, d4), ContextualEventDispatcher.N(d5, d6, d4), ContextualEventDispatcher.N(d5, d6, d7), ContextualEventDispatcher.N(d2, d6, d7)};
            }
            if (n == 2) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d2, d3, d4), ContextualEventDispatcher.N(d5, d3, d4), ContextualEventDispatcher.N(d5, d6, d4), ContextualEventDispatcher.N(d2, d6, d4)};
            }
            if (n == 5) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d5, d3, d4), ContextualEventDispatcher.N(d5, d3, d7), ContextualEventDispatcher.N(d5, d6, d7), ContextualEventDispatcher.N(d5, d6, d4)};
            }
            if (n == 3) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d2, d3, d7), ContextualEventDispatcher.N(d5, d3, d7), ContextualEventDispatcher.N(d5, d6, d7), ContextualEventDispatcher.N(d2, d6, d7)};
            }
            if (n == 4) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d2, d3, d4), ContextualEventDispatcher.N(d2, d3, d7), ContextualEventDispatcher.N(d2, d6, d7), ContextualEventDispatcher.N(d2, d6, d4)};
            }
            for (ContextualEventDispatcher contextualEventDispatcher3 : contextualEventDispatcherArray) {
                boolean bl8;
                boolean bl9;
                block50: {
                    boolean bl10;
                    block53: {
                        block52: {
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                            block51: {
                                boolean bl11;
                                block49: {
                                    block48: {
                                        ContextualEventDispatcher contextualEventDispatcher4 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
                                        networkPacketInterceptor1107 = networkProtocolNegotiator.g(contextualEventDispatcher4, contextualEventDispatcher3, false, false, bl2, systemConfigurationOrchestrator);
                                        try {
                                            try {
                                                if (!networkPacketInterceptor1107.Y() && !networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block48;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                            bl11 = true;
                                            break block49;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                    }
                                    bl11 = false;
                                }
                                bl9 = bl11;
                                bl8 = false;
                                try {
                                    try {
                                        if (bl9 || !networkPacketInterceptor1107.h()) break block50;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (GeometryCalculator.C() <= GeometryCalculator.W) break block51;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl8 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(n9));
                                break block50;
                            }
                            try {
                                try {
                                    try {
                                        if (networkPacketInterceptor1107.p() != n9.x() || networkPacketInterceptor1107.b() != n9.J()) break block52;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (networkPacketInterceptor1107.m() != n9.b()) break block52;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl10 = true;
                                break block53;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        bl10 = false;
                    }
                    bl8 = bl10;
                }
                try {
                    if (!bl9 && !bl8) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                bl = true;
                break;
            }
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6E3A;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Zw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Zw.c[n2] = n3;
        }
        return c[n2];
    }

    public static boolean h(NetworkProtocolNegotiator networkProtocolNegotiator, CryptographicTransformer cryptographicTransformer, oQ oQ2, ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2) {
        boolean bl = true;
        List list = networkProtocolNegotiator.R(cryptographicTransformer, oQ2);
        if (!list.isEmpty()) {
            for (Object e : list) {
                block9: {
                    try {
                        if (e == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    CryptographicTransformer cryptographicTransformer2 = new CryptographicTransformer(e);
                    if (!cryptographicTransformer2.m()) continue;
                    float f = cryptographicTransformer2.g();
                    oQ oQ3 = cryptographicTransformer2.L().B(f, f, f);
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107 = oQ3.x(contextualEventDispatcher, contextualEventDispatcher2);
                    try {
                        try {
                            if (oQ3.j(contextualEventDispatcher)) break block9;
                            if (networkPacketInterceptor1107 == null) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                        if (!networkPacketInterceptor1107.r()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
                bl = false;
            }
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    public static boolean m(ContextualEventDispatcher var0, NetworkProtocolNegotiator var1_1, N9 var2_2, AdaptiveConfigurationManager var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    public static Vector<MultiProtocolSessionManager> W(N9 n9, ContextualEventDispatcher contextualEventDispatcher, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, N9 n92, AdaptiveConfigurationManager adaptiveConfigurationManager, AdaptiveConfigurationManager adaptiveConfigurationManager2, ProtocolNegotiationStrategy<MultiProtocolSessionManager> protocolNegotiationStrategy, int n) {
        long l;
        block37: {
            block38: {
                block36: {
                    l = a ^ 0xD2D21DAC402L;
                    try {
                        try {
                            if (n <= protocolNegotiationStrategy.B() && protocolNegotiationStrategy.O(n92)) break block36;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                        return null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
                TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n92.x(), n92.J(), n92.b());
                boolean bl = PatternMatchingOrchestrator.N(transactionCorrelationEngine);
                boolean bl2 = PatternMatchingOrchestrator.a(transactionCorrelationEngine);
                try {
                    try {
                        if (bl) break block37;
                        if (!bl2) break block38;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    if (!Zw.u(n9, systemConfigurationOrchestrator, networkProtocolNegotiator, n92, adaptiveConfigurationManager2.z())) break block38;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                Vector<MultiProtocolSessionManager> vector = new Vector<MultiProtocolSessionManager>();
                MultiProtocolSessionManager multiProtocolSessionManager = new MultiProtocolSessionManager(n92, adaptiveConfigurationManager2.z(), false);
                multiProtocolSessionManager.d = n;
                vector.add(multiProtocolSessionManager);
                return vector;
            }
            return null;
        }
        try {
            if (T == null) {
                T = AdaptiveConfigurationManager.G();
                H = AdaptiveConfigurationManager.Y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
        int n2 = adaptiveConfigurationManager.g();
        if (n2 == -1) {
            n2 = 0;
        }
        int n3 = H[n2].p();
        int n4 = H[(n2 + 1) % 4].p();
        int n5 = H[(n2 + 3) % 4].p();
        int n6 = H[(n2 + 2) % 4].p();
        int[] nArray = new int[]{0, n3, n4, n5, n6, 1};
        Object object = Zw.a("r", (int)3874, (long)(0x6EBDD0C1C788A6C7L ^ l));
        Vector<MultiProtocolSessionManager> vector = null;
        for (int n7 : nArray) {
            Vector<MultiProtocolSessionManager> vector2;
            block41: {
                MultiProtocolSessionManager multiProtocolSessionManager;
                AdaptiveConfigurationManager adaptiveConfigurationManager3;
                AdaptiveConfigurationManager adaptiveConfigurationManager4 = T[n7];
                try {
                    if (adaptiveConfigurationManager4.p() == adaptiveConfigurationManager.z().p()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                N9 n93 = n92.m(adaptiveConfigurationManager4);
                TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n93.x(), n93.J(), n93.b());
                try {
                    adaptiveConfigurationManager3 = PatternMatchingOrchestrator.a(transactionCorrelationEngine) ? null : adaptiveConfigurationManager4.z();
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                AdaptiveConfigurationManager adaptiveConfigurationManager5 = adaptiveConfigurationManager3;
                try {
                    if (!Zw.m(contextualEventDispatcher, networkProtocolNegotiator, n93, adaptiveConfigurationManager5)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                vector2 = new Vector<MultiProtocolSessionManager>();
                if (protocolNegotiationStrategy.X(n93)) {
                    AdaptiveConfigurationManager adaptiveConfigurationManager6;
                    block40: {
                        block39: {
                            boolean bl = PatternMatchingOrchestrator.N(transactionCorrelationEngine);
                            try {
                                try {
                                    try {
                                        if (!bl && !Zw.u(n9, systemConfigurationOrchestrator, networkProtocolNegotiator, n93, adaptiveConfigurationManager5)) continue;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (!bl) break block39;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                adaptiveConfigurationManager6 = adaptiveConfigurationManager4.z();
                                break block40;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        adaptiveConfigurationManager6 = adaptiveConfigurationManager5;
                    }
                    adaptiveConfigurationManager5 = adaptiveConfigurationManager6;
                    multiProtocolSessionManager = new MultiProtocolSessionManager(n93, adaptiveConfigurationManager5);
                    multiProtocolSessionManager.d = n;
                    vector2.addElement(multiProtocolSessionManager);
                } else {
                    Vector<MultiProtocolSessionManager> vector3 = Zw.W(n9, contextualEventDispatcher, systemConfigurationOrchestrator, networkProtocolNegotiator, n93, adaptiveConfigurationManager, adaptiveConfigurationManager4, protocolNegotiationStrategy, n + 1);
                    try {
                        if (vector3 == null || vector3.isEmpty()) break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    multiProtocolSessionManager = new MultiProtocolSessionManager(n93, adaptiveConfigurationManager4.z());
                    multiProtocolSessionManager.d = n;
                    vector2.addAll(vector3);
                    vector2.add(multiProtocolSessionManager);
                }
            }
            try {
                if (vector2.isEmpty()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            int n8 = protocolNegotiationStrategy.d(vector2);
            try {
                if (vector != null && n8 >= object) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            vector = vector2;
            object = n8;
        }
        return vector;
    }

    public static float o(ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, float f, float f2) {
        double d2 = contextualEventDispatcher.X() - contextualEventDispatcher2.X();
        double d3 = contextualEventDispatcher.f() - contextualEventDispatcher2.f();
        double d4 = contextualEventDispatcher.F() - contextualEventDispatcher2.F();
        double d5 = AdaptiveComputationEngine.C(d2 * d2 + d3 * d3);
        float f3 = (float)_Y.F(contextualEventDispatcher.X(), contextualEventDispatcher.f(), f, contextualEventDispatcher2.X(), contextualEventDispatcher2.f());
        float f4 = AdaptiveComputationEngine.v((float)Math.toDegrees(CryptoParameterGenerator.o((float)d4, (float)d5)));
        float f5 = Math.abs(AdaptiveComputationEngine.v(f3));
        float f6 = Math.abs(AdaptiveComputationEngine.v(f4 - f2));
        return f5 * f5 + f6 * f6;
    }

    public static float C(kg kg2, kg kg3, float f, float f2) {
        double d2 = kg2.R() - kg3.R();
        double d3 = kg2.U() - kg3.U();
        double d4 = kg2.L() - kg3.L();
        double d5 = AdaptiveComputationEngine.C(d2 * d2 + d3 * d3);
        float f3 = (float)_Y.F(kg2.R(), kg2.U(), f, kg3.R(), kg3.U());
        float f4 = AdaptiveComputationEngine.v((float)Math.toDegrees(CryptoParameterGenerator.o((float)d4, (float)d5)));
        float f5 = Math.abs(AdaptiveComputationEngine.v(f3));
        float f6 = Math.abs(AdaptiveComputationEngine.v(f4 - f2));
        return (float)Math.sqrt(f5 * f5 + f6 * f6);
    }

    public static boolean u(N9 n9, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, N9 n92, AdaptiveConfigurationManager adaptiveConfigurationManager) {
        boolean bl;
        block49: {
            double d2;
            oQ oQ2;
            boolean bl2;
            block56: {
                boolean bl3;
                boolean bl4;
                block45: {
                    boolean bl5;
                    block48: {
                        block47: {
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                            block46: {
                                boolean bl6;
                                block44: {
                                    block43: {
                                        boolean bl7;
                                        bl = false;
                                        try {
                                            bl7 = GeometryCalculator.C() < GeometryCalculator.C;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                        bl2 = bl7;
                                        oQ2 = PatternMatchingOrchestrator.y(networkProtocolNegotiator, n92);
                                        oQ2 = oQ2.v(0.002f, 0.002f, 0.002f);
                                        try {
                                            double d3 = d2 = GeometryCalculator.C() > 13 ? (double)systemConfigurationOrchestrator.E() : 0.0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                        if (adaptiveConfigurationManager != null) break block56;
                                        ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N((double)n9.x() + 0.5, systemConfigurationOrchestrator.y() + d2, (double)n9.b() + 0.5);
                                        ContextualEventDispatcher contextualEventDispatcher2 = _Y.t(systemConfigurationOrchestrator, oQ2, 0.0, 0.0, 0.0).l();
                                        networkPacketInterceptor1107 = networkProtocolNegotiator.g(contextualEventDispatcher, contextualEventDispatcher2, false, false, bl2, systemConfigurationOrchestrator);
                                        try {
                                            try {
                                                if (!networkPacketInterceptor1107.Y() && !networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block43;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                            bl6 = true;
                                            break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                    }
                                    bl6 = false;
                                }
                                bl4 = bl6;
                                bl3 = false;
                                try {
                                    try {
                                        if (bl4 || !networkPacketInterceptor1107.h()) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (GeometryCalculator.C() <= GeometryCalculator.W) break block46;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl3 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(n92));
                                break block45;
                            }
                            try {
                                try {
                                    try {
                                        if (networkPacketInterceptor1107.p() != n92.x() || networkPacketInterceptor1107.b() != n92.J()) break block47;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (networkPacketInterceptor1107.m() != n92.b()) break block47;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl5 = true;
                                break block48;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        bl5 = false;
                    }
                    bl3 = bl5;
                }
                try {
                    if (!bl4 && !bl3) break block49;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                bl = true;
                break block49;
            }
            ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N((double)n9.x() + 0.5, systemConfigurationOrchestrator.y() + d2, (double)n9.b() + 0.5);
            double d4 = oQ2.F();
            double d5 = oQ2.c();
            double d6 = oQ2.v();
            double d7 = oQ2.f();
            double d8 = oQ2.P();
            double d9 = oQ2.R();
            ContextualEventDispatcher[] contextualEventDispatcherArray = new ContextualEventDispatcher[]{};
            int n = adaptiveConfigurationManager.p();
            if (n == 0) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d4, d5, d6), ContextualEventDispatcher.N(d4, d5, d9), ContextualEventDispatcher.N(d7, d5, d9), ContextualEventDispatcher.N(d7, d5, d6)};
            }
            if (n == 1) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d4, d8, d6), ContextualEventDispatcher.N(d7, d8, d6), ContextualEventDispatcher.N(d7, d8, d9), ContextualEventDispatcher.N(d4, d8, d9)};
            }
            if (n == 2) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d4, d5, d6), ContextualEventDispatcher.N(d7, d5, d6), ContextualEventDispatcher.N(d7, d8, d6), ContextualEventDispatcher.N(d4, d8, d6)};
            }
            if (n == 5) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d7, d5, d6), ContextualEventDispatcher.N(d7, d5, d9), ContextualEventDispatcher.N(d7, d8, d9), ContextualEventDispatcher.N(d7, d8, d6)};
            }
            if (n == 3) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d4, d5, d9), ContextualEventDispatcher.N(d7, d5, d9), ContextualEventDispatcher.N(d7, d8, d9), ContextualEventDispatcher.N(d4, d8, d9)};
            }
            if (n == 4) {
                contextualEventDispatcherArray = new ContextualEventDispatcher[]{ContextualEventDispatcher.N(d4, d5, d6), ContextualEventDispatcher.N(d4, d5, d9), ContextualEventDispatcher.N(d4, d8, d9), ContextualEventDispatcher.N(d4, d8, d6)};
            }
            for (ContextualEventDispatcher contextualEventDispatcher3 : contextualEventDispatcherArray) {
                boolean bl8;
                boolean bl9;
                block52: {
                    boolean bl10;
                    block55: {
                        block54: {
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                            block53: {
                                boolean bl11;
                                block51: {
                                    block50: {
                                        ContextualEventDispatcher contextualEventDispatcher4 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
                                        networkPacketInterceptor1107 = networkProtocolNegotiator.g(contextualEventDispatcher4, contextualEventDispatcher3, false, false, bl2, systemConfigurationOrchestrator);
                                        try {
                                            try {
                                                if (!networkPacketInterceptor1107.Y() && !networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block50;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                            bl11 = true;
                                            break block51;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                    }
                                    bl11 = false;
                                }
                                bl9 = bl11;
                                bl8 = false;
                                try {
                                    try {
                                        if (bl9 || !networkPacketInterceptor1107.h()) break block52;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (GeometryCalculator.C() <= GeometryCalculator.W) break block53;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl8 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(n92));
                                break block52;
                            }
                            try {
                                try {
                                    try {
                                        if (networkPacketInterceptor1107.p() != n92.x() || networkPacketInterceptor1107.b() != n92.J()) break block54;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    if (networkPacketInterceptor1107.m() != n92.b()) break block54;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                bl10 = true;
                                break block55;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        bl10 = false;
                    }
                    bl8 = bl10;
                }
                try {
                    if (!bl9 && !bl8) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                bl = true;
                break;
            }
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    private static void W(oQ var0, int var1_1, kg var2_2, float var3_3, float var4_4, PriorityQueue<UniqueIdentifierGenerator> var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[SWITCH]
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Zw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static Vector<MultiProtocolSessionManager> k(N9 n9, N9 n92, ProtocolNegotiationStrategy<MultiProtocolSessionManager> protocolNegotiationStrategy, int n) {
        int n2;
        int n3;
        int n4;
        long l;
        block39: {
            int n5;
            block38: {
                int n6;
                block37: {
                    int n7;
                    block36: {
                        int n8;
                        block35: {
                            int n10;
                            block34: {
                                l = a ^ 0xF2F42383914L;
                                try {
                                    if (n > protocolNegotiationStrategy.B()) {
                                        return null;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                try {
                                    if (T == null) {
                                        T = AdaptiveConfigurationManager.G();
                                        H = AdaptiveConfigurationManager.Y();
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                                n10 = n92.x() - n9.x();
                                n7 = n92.J() - n9.J();
                                n5 = n92.b() - n9.b();
                                try {
                                    if (n10 <= 0) break block34;
                                    n8 = 5;
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                            }
                            try {
                                n8 = n10 < 0 ? 4 : -1;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        n4 = n8;
                        try {
                            if (n7 <= 0) break block36;
                            n6 = 1;
                            break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                    }
                    try {
                        n6 = n7 < 0 ? 0 : -1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
                n3 = n6;
                try {
                    if (n5 <= 0) break block38;
                    n2 = 3;
                    break block39;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
            }
            try {
                n2 = n5 < 0 ? 2 : -1;
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
        }
        int n11 = n2;
        int[] nArray = new int[]{n4, n3, n11};
        Object object = Zw.a("r", (int)18304, (long)(0x4997DF4A939A9372L ^ l));
        Vector<Object> vector = null;
        for (int n12 : nArray) {
            Vector<Object> vector2;
            block40: {
                Object object2;
                N9 n93;
                N9 n94;
                AdaptiveConfigurationManager adaptiveConfigurationManager;
                block41: {
                    try {
                        if (n12 == -1) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    adaptiveConfigurationManager = T[n12];
                    n94 = n9;
                    n93 = n94.m(adaptiveConfigurationManager);
                    vector2 = new Vector<Object>();
                    try {
                        if (!protocolNegotiationStrategy.X(n93)) break block40;
                        if (!n93.equals(n92)) break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    object2 = new MultiProtocolSessionManager(n94, adaptiveConfigurationManager);
                    ((MultiProtocolSessionManager)object2).d = n;
                    vector2.addElement(object2);
                    break block40;
                }
                object2 = Zw.k(n93, n92, protocolNegotiationStrategy, n + 1);
                try {
                    if (object2 == null || ((Vector)object2).isEmpty()) break block40;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                MultiProtocolSessionManager multiProtocolSessionManager = new MultiProtocolSessionManager(n94, adaptiveConfigurationManager);
                multiProtocolSessionManager.d = n;
                vector2.addAll((Collection<Object>)object2);
                vector2.add(multiProtocolSessionManager);
            }
            try {
                if (vector2.isEmpty()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            try {
                if (n == 0) {
                    ModelSimulationEngine.G.add(new Vector(vector2));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            int n13 = protocolNegotiationStrategy.e(vector2, n);
            try {
                if (vector != null && n13 >= object) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw Zw.a(customSystemException);
            }
            vector = vector2;
            object = n13;
        }
        return vector;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i(oQ oQ2, int n, kg kg2, float f, float f2, PriorityQueue<UniqueIdentifierGenerator> priorityQueue) {
        double d2 = oQ2.F();
        double d3 = oQ2.c();
        double d4 = oQ2.v();
        double d5 = oQ2.f();
        double d6 = oQ2.P();
        double d7 = oQ2.R();
        try {
            switch (n) {
                case 0: {
                    Zw.s(d2, d3, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d3, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d3, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d3, d4, kg2, f, f2, priorityQueue);
                    return;
                }
                case 1: {
                    Zw.s(d2, d6, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d6, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d6, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d6, d7, kg2, f, f2, priorityQueue);
                    return;
                }
                case 2: {
                    Zw.s(d2, d3, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d3, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d6, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d6, d4, kg2, f, f2, priorityQueue);
                    return;
                }
                case 5: {
                    Zw.s(d5, d3, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d3, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d6, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d6, d4, kg2, f, f2, priorityQueue);
                    return;
                }
                case 3: {
                    Zw.s(d2, d3, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d3, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d5, d6, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d6, d7, kg2, f, f2, priorityQueue);
                    return;
                }
                case 4: {
                    Zw.s(d2, d3, d4, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d3, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d6, d7, kg2, f, f2, priorityQueue);
                    Zw.s(d2, d6, d4, kg2, f, f2, priorityQueue);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
    }

    private static double lambda$findClosestHitVecOnFaceClaude$0(UniqueIdentifierGenerator uniqueIdentifierGenerator) {
        return uniqueIdentifierGenerator.R;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(8149250323419763336L, 740164221804691997L, MethodHandles.lookup().lookupClass()).a(194433058346699L);
        d = new HashMap(13);
        long l = a ^ 0x2AE1FDA079BCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u0010zE$\u00c4M\u00a7W\u009f\u00c7)\u00a7\u00c2\u00f7\u0085\u00f5";
        int n2 = "\u0010zE$\u00c4M\u00a7W\u009f\u00c7)\u00a7\u00c2\u00f7\u0085\u00f5".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    public static boolean R(NetworkProtocolNegotiator networkProtocolNegotiator, CryptographicTransformer cryptographicTransformer, N9 n9) {
        boolean bl = true;
        oQ oQ2 = PatternMatchingOrchestrator.y(networkProtocolNegotiator, n9);
        List list = networkProtocolNegotiator.R(cryptographicTransformer, oQ2);
        if (!list.isEmpty()) {
            for (Object e : list) {
                try {
                    if (e == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                CryptographicTransformer cryptographicTransformer2 = new CryptographicTransformer(e);
                try {
                    try {
                        if (cryptographicTransformer2.O() || !cryptographicTransformer2.S()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                    if (cryptographicTransformer2.equals(cryptographicTransformer)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                oQ oQ3 = cryptographicTransformer2.L();
                if (!oQ3.e(oQ2)) continue;
                bl = false;
                break;
            }
        }
        return bl;
    }

    public static ContextualEventDispatcher e(SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, ContextualEventDispatcher contextualEventDispatcher, MultiProtocolSessionManager multiProtocolSessionManager, float f, float f2) {
        ContextualEventDispatcher contextualEventDispatcher2;
        boolean bl;
        kg kg2 = null;
        try {
            bl = GeometryCalculator.C() < GeometryCalculator.C;
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
        boolean bl2 = bl;
        N9 n9 = multiProtocolSessionManager.o;
        AdaptiveConfigurationManager adaptiveConfigurationManager = multiProtocolSessionManager.N;
        oQ oQ2 = PatternMatchingOrchestrator.y(networkProtocolNegotiator, n9);
        double d2 = 0.002f;
        try {
            if (adaptiveConfigurationManager == null) {
                return _Y.U(contextualEventDispatcher, oQ2, 0.0, 0.0, 0.0).l();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
        kg kg3 = new kg(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
        ContextualEventDispatcher contextualEventDispatcher3 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
        Dv dv = adaptiveConfigurationManager.n();
        oQ2 = oQ2.v(d2, d2, d2);
        double d3 = oQ2.f() - oQ2.F();
        double d4 = oQ2.R() - oQ2.v();
        double d5 = oQ2.P() - oQ2.c();
        double d6 = dv.o();
        double d7 = dv.q();
        double d8 = dv.j();
        double d9 = Double.MAX_VALUE;
        ContextualEventDispatcher contextualEventDispatcher4 = ContextualEventDispatcher.N(0.0, 0.0, 0.0);
        kg[] kgArray = new kg[]{new kg(0.0, 0.0, 0.0), new kg(0.0, 0.0, 0.0), new kg(0.0, 0.0, 0.0), new kg(0.0, 0.0, 0.0)};
        for (int i = 0; i <= 70; i += 10) {
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            block78: {
                double d15;
                block77: {
                    double d16;
                    double d17;
                    block76: {
                        double d18;
                        block75: {
                            double d19;
                            double d20;
                            block74: {
                                block73: {
                                    double d21;
                                    double d22;
                                    block72: {
                                        block71: {
                                            double d23 = 1.0 - (double)i / 100.0;
                                            d18 = d3 / 2.0 * d23;
                                            d15 = d5 / 2.0 * d23;
                                            try {
                                                d22 = oQ2.F();
                                                if (!(d6 > 0.0)) break block71;
                                                d21 = d3;
                                                break block72;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw Zw.a(customSystemException);
                                            }
                                        }
                                        try {
                                            d21 = d6 < 0.0 ? 0.0 : d18;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                    }
                                    d14 = d22 + d21;
                                    try {
                                        d20 = oQ2.v();
                                        if (!(d8 > 0.0)) break block73;
                                        d19 = d4;
                                        break block74;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                }
                                try {
                                    d19 = d8 < 0.0 ? 0.0 : d15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                            }
                            d13 = d20 + d19;
                            try {
                                d17 = oQ2.f();
                                if (!(d6 < 0.0)) break block75;
                                d16 = d3;
                                break block76;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        try {
                            d16 = d6 > 0.0 ? 0.0 : d18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                    }
                    d12 = d17 - d16;
                    try {
                        d11 = oQ2.R();
                        if (!(d8 < 0.0)) break block77;
                        d10 = d4;
                        break block78;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
                try {
                    d10 = d8 > 0.0 ? 0.0 : d15;
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
            }
            double d24 = d11 - d10;
            block59: for (int j = 0; j <= 70; j += 10) {
                double d25;
                double d26;
                double d27;
                block82: {
                    double d28;
                    block81: {
                        double d29;
                        double d30;
                        block80: {
                            block79: {
                                double d31 = 1.0 - (double)j / 100.0;
                                d28 = d4 / 2.0 * d31;
                                try {
                                    d30 = oQ2.c();
                                    if (!(d7 > 0.0)) break block79;
                                    d29 = d5;
                                    break block80;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                            }
                            try {
                                d29 = d7 < 0.0 ? 0.0 : d28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                        d27 = d30 + d29;
                        try {
                            d26 = oQ2.P();
                            if (!(d7 < 0.0)) break block81;
                            d25 = d5;
                            break block82;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Zw.a(customSystemException);
                        }
                    }
                    try {
                        d25 = d7 > 0.0 ? 0.0 : d28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
                double d32 = d26 - d25;
                int n = adaptiveConfigurationManager.p();
                try {
                    if (n == 0) {
                        kgArray[0].y(d14, d27, d13);
                        kgArray[1].y(d14, d27, d24);
                        kgArray[2].y(d12, d27, d24);
                        kgArray[3].y(d12, d27, d13);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                try {
                    if (n == 1) {
                        kgArray[0].y(d14, d32, d13);
                        kgArray[1].y(d12, d32, d13);
                        kgArray[2].y(d12, d32, d24);
                        kgArray[3].y(d14, d32, d24);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                try {
                    if (n == 2) {
                        kgArray[0].y(d14, d27, d13);
                        kgArray[1].y(d12, d27, d13);
                        kgArray[2].y(d12, d32, d13);
                        kgArray[3].y(d14, d32, d13);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                try {
                    if (n == 5) {
                        kgArray[0].y(d12, d27, d13);
                        kgArray[1].y(d12, d27, d24);
                        kgArray[2].y(d12, d32, d24);
                        kgArray[3].y(d12, d32, d13);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                try {
                    if (n == 3) {
                        kgArray[0].y(d14, d27, d24);
                        kgArray[1].y(d12, d27, d24);
                        kgArray[2].y(d12, d32, d24);
                        kgArray[3].y(d14, d32, d24);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                try {
                    if (n == 4) {
                        kgArray[0].y(d14, d27, d13);
                        kgArray[1].y(d14, d27, d24);
                        kgArray[2].y(d14, d32, d24);
                        kgArray[3].y(d14, d32, d13);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Zw.a(customSystemException);
                }
                for (kg kg4 : kgArray) {
                    block83: {
                        boolean bl3;
                        double d33;
                        block84: {
                            boolean bl4;
                            block86: {
                                NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                                block85: {
                                    d33 = Zw.C(kg3, kg4, f, f2);
                                    try {
                                        if (!(d33 < d9) || !(d33 > 0.5)) break block83;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    contextualEventDispatcher4.F(kg4.K);
                                    contextualEventDispatcher4.Q(kg4.w);
                                    contextualEventDispatcher4.N(kg4.O);
                                    networkPacketInterceptor1107 = networkProtocolNegotiator.g(contextualEventDispatcher3, contextualEventDispatcher4, false, false, bl2, systemConfigurationOrchestrator);
                                    bl3 = false;
                                    try {
                                        try {
                                            if (!networkPacketInterceptor1107.h() || networkPacketInterceptor1107.K().p() != n) break block84;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                        if (GeometryCalculator.C() <= GeometryCalculator.W) break block85;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    bl3 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(n9));
                                    break block84;
                                }
                                try {
                                    try {
                                        try {
                                            if (networkPacketInterceptor1107.p() != n9.x() || networkPacketInterceptor1107.b() != n9.J()) break block86;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw Zw.a(customSystemException);
                                        }
                                        if (networkPacketInterceptor1107.m() != n9.b()) break block86;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Zw.a(customSystemException);
                                    }
                                    bl4 = true;
                                    break block84;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Zw.a(customSystemException);
                                }
                            }
                            bl4 = bl3 = false;
                        }
                        if (bl3) {
                            d9 = d33;
                            if (kg2 == null) {
                                kg2 = new kg();
                            }
                            try {
                                kg2.y(kg4.K, kg4.w, kg4.O);
                                if (d9 < 1.0) {
                                    return kg2.l();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Zw.a(customSystemException);
                            }
                        }
                    }
                    try {
                        if (j != 0) continue;
                        continue block59;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Zw.a(customSystemException);
                    }
                }
            }
        }
        try {
            contextualEventDispatcher2 = kg2 != null ? kg2.l() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw Zw.a(customSystemException);
        }
        return contextualEventDispatcher2;
    }

    public static boolean j(TransactionCorrelationEngine transactionCorrelationEngine) {
        boolean bl = false;
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : RecursiveNodeTreeBuilder.M) {
            if (!transactionCorrelationEngine.s().equalsIgnoreCase(recursiveNodeTreeBuilder.q())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Zw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

