/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.E8;
import a.Ne;
import a.a;
import a.tR;
import a.tl;
import a.z6;
import com.app.event.EventTrigger;
import com.app.geospatial.math.GeospatialCoordinateCalculator;
import com.app.network.NetworkConnectionOptimizer2322;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.core.DataCompressionHandler;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.streaming.DataStreamProcessor1600;
import com.data.transformation.DataTransformationEngine1209;
import com.event.core.EventDispatcher;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.transactions.TransactionValidator1679;
import com.game.actions.ActionSequenceHandler;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.PacketTransmissionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.event.SecureEventOrchestrator;
import com.security.exchange.SecureDataExchanger793;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resources.ResourceAllocationManager;
import com.transaction.flow.TransactionFlowController;
import com.ui.event.UserInterfaceEventBroker;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class GraphicsContextBroker
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker B;
    private static final String[] n;
    private final AuthenticationStateTracker e;
    private static final Integer[] j;
    private final AuthenticationStateTracker F;
    private static final Object[] m;
    private final List<GeospatialCoordinateCalculator> O;
    private final AuthenticationStateTracker X;
    private final ColorPaletteManager b;
    private static final long d;
    private final NumericPrecisionTransformer Y;
    private static final Map l;
    private static final long[] h;
    private final Color R;

    private void lambda$new$0(AuthenticationStateTracker authenticationStateTracker) {
        this.O.clear();
    }

    @DataExchangeProtocol2090
    public void K(EventTrigger eventTrigger) {
        block31: {
            try {
                try {
                    if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.c().Y()) break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
                this.O.clear();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
        }
        List list = ApplicationLifecycleManager.c().L();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        if (!this.F.s().booleanValue()) {
            this.O.clear();
            for (Object e : list) {
                CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.bx)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
                NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(cryptographicTransformer);
                try {
                    try {
                        if (this.e.s().booleanValue() && !this.b.H(networkConnectionOptimizer2322.y())) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicsContextBroker.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
                this.O.add(new GeospatialCoordinateCalculator(this, networkConnectionOptimizer2322));
            }
            return;
        }
        Object object = this.O.iterator();
        while (object.hasNext()) {
            Iterator iterator = object.next();
            try {
                ((GeospatialCoordinateCalculator)((Object)iterator)).e(list, systemConfigurationOrchestrator);
                if (!((GeospatialCoordinateCalculator)((Object)iterator)).L()) continue;
                object.remove();
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
        }
        this.M(systemConfigurationOrchestrator);
        object = new HashSet();
        for (GeospatialCoordinateCalculator geospatialCoordinateCalculator : this.O) {
            object.addAll(geospatialCoordinateCalculator.c());
        }
        for (GeospatialCoordinateCalculator geospatialCoordinateCalculator : list) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(geospatialCoordinateCalculator);
            try {
                if (!cryptographicTransformer.B(ReflectionMetadataResolver.bx)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
            NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(cryptographicTransformer);
            try {
                try {
                    if (this.e.s().booleanValue() && !this.b.H(networkConnectionOptimizer2322.y())) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
            try {
                if (object.contains(networkConnectionOptimizer2322.M())) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
            double d2 = systemConfigurationOrchestrator.y(networkConnectionOptimizer2322);
            double d3 = Math.max(1.5, d2 / 5.0);
            boolean bl = false;
            double d4 = networkConnectionOptimizer2322.F();
            double d5 = networkConnectionOptimizer2322.V();
            double d6 = networkConnectionOptimizer2322.B();
            for (GeospatialCoordinateCalculator geospatialCoordinateCalculator2 : this.O) {
                double d7 = d4 - geospatialCoordinateCalculator2.t;
                double d8 = d5 - geospatialCoordinateCalculator2.l;
                double d9 = d6 - geospatialCoordinateCalculator2.L;
                double d10 = Math.sqrt(d7 * d7 + d8 * d8 + d9 * d9);
                if (!(d10 <= d3)) continue;
                geospatialCoordinateCalculator2.O(networkConnectionOptimizer2322);
                object.add(networkConnectionOptimizer2322.M());
                bl = true;
                break;
            }
            if (bl) continue;
            GeospatialCoordinateCalculator geospatialCoordinateCalculator3 = new GeospatialCoordinateCalculator(this, networkConnectionOptimizer2322);
            this.O.add(geospatialCoordinateCalculator3);
            object.add(networkConnectionOptimizer2322.M());
        }
    }

    private void L(SystemConfigurationOrchestrator systemConfigurationOrchestrator, GeospatialCoordinateCalculator geospatialCoordinateCalculator, double d2, double d3, double d4, DataTransformationEngine1209 dataTransformationEngine1209) {
        int n;
        E8 e8;
        String[] stringArray;
        long l;
        block42: {
            block43: {
                float f;
                Object object;
                int n2;
                block40: {
                    float f2;
                    float f3;
                    block41: {
                        block38: {
                            double d5;
                            double d6;
                            double d7;
                            block39: {
                                float f4;
                                float f5;
                                l = d ^ 0x54B2D71174B3L;
                                NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(geospatialCoordinateCalculator.r());
                                List<LightweightExecutionContext> list = geospatialCoordinateCalculator.O();
                                n2 = 0;
                                stringArray = new String[list.size()];
                                e8 = ApplicationLifecycleManager.X();
                                for (n = 0; n < list.size(); ++n) {
                                    String string;
                                    block37: {
                                        block36: {
                                            object = list.get(n);
                                            string = ((LightweightExecutionContext)object).g();
                                            try {
                                                if (!this.X.s().booleanValue() || n != 0) break block36;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicsContextBroker.a(customSystemException);
                                            }
                                            string = DynamicContextBroker.u + (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)31087, (long)(0x5C1B9EBBC952E78FL ^ l)), (long)-3332620215758363846L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)3663, (long)(0x5A40B7728D4810B8L ^ l)), (long)-3332620215758363846L, (long)l)) + (int)systemConfigurationOrchestrator.y(networkConnectionOptimizer2322) + DynamicContextBroker.u + (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)6068, (long)(0x744D7446432D8947L ^ l)), (long)-3332620215758363846L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)31641, (long)(0x2FD62259BD9656DL ^ l)), (long)-3332620215758363846L, (long)l)) + string;
                                        }
                                        try {
                                            if (((LightweightExecutionContext)object).D() <= 1 || ((LightweightExecutionContext)object).J() <= 1) break block37;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicsContextBroker.a(customSystemException);
                                        }
                                        string = string + DynamicContextBroker.u + (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)24683, (long)(0xC7E437A1D007E94L ^ l)), (long)-3332620215758363846L, (long)l)) + ((LightweightExecutionContext)object).J();
                                    }
                                    n2 = Math.max(e8.L(string) / 2, n2);
                                    stringArray[n] = string;
                                }
                                n = -1;
                                object = this.R;
                                f = (float)(0.03333335 * (Double)this.Y.J());
                                if (this.B.s().booleanValue()) {
                                    float f6;
                                    f3 = systemConfigurationOrchestrator.y(networkConnectionOptimizer2322);
                                    try {
                                        f6 = f3 / 5.0f <= 2.0f ? 2.0f : f3 / 5.0f;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicsContextBroker.a(customSystemException);
                                    }
                                    f2 = f6;
                                    f = (float)(0.01666666753590107 * ((double)f2 * (Double)this.Y.J()));
                                }
                                try {
                                    CryptoContextNegotiator684.Y();
                                    f5 = ResourceAllocationManager.b() ? ResourceAllocationManager.m() : ApplicationLifecycleManager.r().k();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicsContextBroker.a(customSystemException);
                                }
                                f3 = f5;
                                try {
                                    f4 = ResourceAllocationManager.b() ? ResourceAllocationManager.H() : ApplicationLifecycleManager.r().r();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicsContextBroker.a(customSystemException);
                                }
                                f2 = f4;
                                try {
                                    try {
                                        if (GeometryCalculator.C() < 35) break block38;
                                        if (ApplicationLifecycleManager.N().V() != 0) break block39;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicsContextBroker.a(customSystemException);
                                    }
                                    Ne.h.m(d2 + 0.0, d3 + 0.25 + 0.5, d4);
                                    Ne.h.t(0.0f, 1.0f, 0.0f);
                                    Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                                    Ne.h.f(-f2, -1.0f, 0.0f, 0.0f);
                                    break block40;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicsContextBroker.a(customSystemException);
                                }
                            }
                            DataCompressionHandler dataCompressionHandler = ApplicationLifecycleManager.U().v();
                            try {
                                d7 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.b() - dataCompressionHandler.w().X();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicsContextBroker.a(customSystemException);
                            }
                            double d8 = d7;
                            try {
                                d6 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.S() - dataCompressionHandler.w().F();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicsContextBroker.a(customSystemException);
                            }
                            double d9 = d6;
                            try {
                                d5 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.n() - dataCompressionHandler.w().f();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicsContextBroker.a(customSystemException);
                            }
                            double d10 = d5;
                            Ne.h.m(d2 + d8, d3 + d9 + 0.25 + 0.5, d4 + d10);
                            Ne.h.t(0.0f, 1.0f, 0.0f);
                            Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                            Ne.h.f(f2, 1.0f, 0.0f, 0.0f);
                            break block40;
                        }
                        try {
                            Ne.h.m(d2 + 0.0, d3 + 0.25 + 0.5, d4);
                            Ne.h.t(0.0f, 1.0f, 0.0f);
                            if (ApplicationLifecycleManager.N().V() != 2) break block41;
                            Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                            Ne.h.f(f2, -1.0f, 0.0f, 0.0f);
                            break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicsContextBroker.a(customSystemException);
                        }
                    }
                    Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                    Ne.h.f(f2, 1.0f, 0.0f, 0.0f);
                }
                Ne.h.J(-f, -f, f);
                int n3 = e8.I();
                int n4 = n2;
                int n5 = -(n3 * stringArray.length - 1);
                GraphicsBufferAllocator.n((double)(-n4) - 2.0, n5, (double)n4 + 2.0, 2.0, 0.0, (Color)object, (Color)object);
                tl.B();
                tl.w();
                Ne.h.a(1.0f, 1.0f, 1.0f);
                Object var25_24 = null;
                try {
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block42;
                            if (dataTransformationEngine1209 == null) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicsContextBroker.a(customSystemException);
                        }
                        if (dataTransformationEngine1209.Y()) break block43;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicsContextBroker.a(customSystemException);
                    }
                    if (dataTransformationEngine1209.B(ReflectionMetadataResolver.YH)) break block42;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
            }
            dataTransformationEngine1209 = DataTransformationEngine1209.i();
        }
        for (int i = 0; i < stringArray.length; ++i) {
            TransactionValidator1679 transactionValidator1679;
            Object object;
            int n6 = e8.L(stringArray[i]) / 2;
            int n7 = -(e8.B(stringArray[i]) - 1);
            if (ConfigurationManager.U()) {
                object = new SecureDataExchanger793().Z();
                try {
                    ((SecureDataExchanger793)object).E(z6.J);
                    ((SecureDataExchanger793)object).E(z6.D.i());
                    if (GeometryCalculator.C() >= 50) {
                        e8.Y(stringArray[i], -n6, n7 + 2, n, false, (SecureDataExchanger793)object, PacketTransmissionController.F());
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
                CallSite callSite = GraphicsContextBroker.a("w", (int)13652, (long)(0x4FCE219A2A212BAFL ^ l));
                transactionValidator1679 = ApplicationLifecycleManager.n().e();
                DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y(stringArray[i]);
                e8.V(dataStreamProcessor1600, (float)(-n6), (float)(n7 + 2), n, false, ((SecureDataExchanger793)object).B(), transactionValidator1679, true, 0, (int)callSite);
                transactionValidator1679.d();
                continue;
            }
            if (GeometryCalculator.C() >= 35) {
                dataTransformationEngine1209.g();
                object = ApplicationLifecycleManager.r().O();
                dataTransformationEngine1209.T((EventDispatcher)object);
                dataTransformationEngine1209.T(EventDispatcher.o(180.0f, 0.0f, 180.0f, true));
                DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y(stringArray[i]);
                transactionValidator1679 = TransactionValidator1679.B(TransactionFlowController.g().D());
                CallSite callSite = GraphicsContextBroker.a("w", (int)19154, (long)(0x3C34AB8C16F6D42FL ^ l));
                ActionSequenceHandler actionSequenceHandler = dataTransformationEngine1209.p().n();
                e8.V(dataStreamProcessor1600, (float)(-n6), (float)(n7 + 2), n, false, actionSequenceHandler, transactionValidator1679, true, 0, (int)callSite);
                transactionValidator1679.d();
                dataTransformationEngine1209.v();
                continue;
            }
            e8.u(stringArray[i], -n6, n7 + 2, n);
        }
        CryptoContextNegotiator684.J();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicsContextBroker.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(long l, long l2) {
        int n = GraphicsContextBroker.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = GraphicsContextBroker.n[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicsContextBroker.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicsContextBroker.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicsContextBroker.a(clazz3, string2, clazz2)) != null) {
                    GraphicsContextBroker.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicsContextBroker.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicsContextBroker.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicsContextBroker.b(258781584960190L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicsContextBroker.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicsContextBroker.m[n] = clazz = Class.forName(GraphicsContextBroker.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (GraphicsContextBroker.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 14;
                break;
            }
            case 4: {
                n3 = 51;
                break;
            }
            case 5: {
                n3 = 42;
                break;
            }
            case 6: {
                n3 = 59;
                break;
            }
            case 7: {
                n3 = 20;
                break;
            }
            case 8: {
                n3 = 37;
                break;
            }
            case 9: {
                n3 = 8;
                break;
            }
            case 10: {
                n3 = 39;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 53;
                break;
            }
            case 15: {
                n3 = 29;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 30;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 55;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 34;
                break;
            }
            case 28: {
                n3 = 36;
                break;
            }
            case 29: {
                n3 = 46;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 13;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 17;
                break;
            }
            case 35: {
                n3 = 26;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 50;
                break;
            }
            case 38: {
                n3 = 1;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 52;
                break;
            }
            case 41: {
                n3 = 54;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 49;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 9;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 38;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 6;
                break;
            }
            case 53: {
                n3 = 43;
                break;
            }
            case 54: {
                n3 = 63;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 25;
                break;
            }
            case 58: {
                n3 = 27;
                break;
            }
            case 59: {
                n3 = 22;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 62;
                break;
            }
            default: {
                n3 = 0;
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
        GraphicsContextBroker.n[n4] = new String(cArray);
        return n4;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicsContextBroker.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicsContextBroker.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "t\u0013X";
        objectArray[1] = Integer.TYPE;
        GraphicsContextBroker.n[1] = "java/lang/Integer";
        objectArray[2] = "X\b8Q$(S\u0007)\u001eY0@\u0000 W";
        objectArray[3] = ":H^L\u0014O1GO\u0003uA:LKY";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "{R!iO?z\\&TZ<\u0017\u00155/\u0000)j\u000e=+1~i\u001e:1\u000b~)\u001c T";
    }

    public GraphicsContextBroker() {
        long l = d ^ 0x2C38F15D25F2L;
        super(a.cs((int)GraphicsContextBroker.a("w", (int)4604, (long)(0x1E3A7D8DA3785E43L ^ l))), (int)GraphicsContextBroker.a("w", (int)1923, (long)(0x74DD06C50CD54833L ^ l)), RecursiveNodeGraph.z, a.cs((int)GraphicsContextBroker.a("w", (int)2378, (long)(0x501A2966E2C7C6F2L ^ l))));
        this.X = AuthenticationStateTracker.R(this, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)32720, (long)(0x42AB2F9CECFEB074L ^ l)), (long)-9186957207199829381L, (long)l)), false, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)2359, (long)(0x62CB8F06856AC68EL ^ l)), (long)-9186957207199829381L, (long)l)));
        this.F = AuthenticationStateTracker.R(this, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)10649, (long)(0x228C16A28DF6639L ^ l)), (long)-9186957207199829381L, (long)l)), false, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)11505, (long)(0x23D2CA5CB408E352L ^ l)), (long)-9186957207199829381L, (long)l)));
        this.B = AuthenticationStateTracker.R(this, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)21080, (long)(0x14A0E813A2799DE5L ^ l)), (long)-9186957207199829381L, (long)l)), true, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)15674, (long)(0x4B230E844E47F298L ^ l)), (long)-9186957207199829381L, (long)l)));
        this.e = AuthenticationStateTracker.R(this, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)12885, (long)(0x4B9B271461A0FDE1L ^ l)), (long)-9186957207199829381L, (long)l)), false, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)31402, (long)(0x6962C3504CF8B51DL ^ l)), (long)-9186957207199829381L, (long)l)));
        this.b = ColorPaletteManager.o(this, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)25357, (long)(0x69583EEBDF7ACBCL ^ l)), (long)-9186957207199829381L, (long)l)), (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)12586, (long)(0x1719855618D8FE99L ^ l)), (long)-9186957207199829381L, (long)l)), ColorPaletteManager.U, Collections.emptyList());
        this.Y = NumericPrecisionTransformer.N(this, (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)29959, (long)(0x2279D8B5950A3ABCL ^ l)), (long)-9186957207199829381L, (long)l)), (String)((Object)GraphicsContextBroker.c("\u00c1", (int)GraphicsContextBroker.a("w", (int)5318, (long)(0x3695396156B75B63L ^ l)), (long)-9186957207199829381L, (long)l)), "", 0.1, 1.0, 1.5, 0.1);
        this.R = new Color(20, 20, 20, 64);
        this.O = new ArrayList<GeospatialCoordinateCalculator>();
        this.F.P(this::lambda$new$0);
        this.e.l(this.b);
        this.N(this.X, this.F, this.B, this.Y, this.e, this.b);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicsContextBroker.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static AuthenticationStateTracker m(GraphicsContextBroker graphicsContextBroker) {
        return graphicsContextBroker.F;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method d(long l, long l2) {
        int n = GraphicsContextBroker.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = GraphicsContextBroker.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = GraphicsContextBroker.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicsContextBroker.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicsContextBroker.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicsContextBroker.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicsContextBroker.b(258781584960190L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicsContextBroker.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicsContextBroker.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicsContextBroker.b(258781584960190L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F31;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])GraphicsContextBroker.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    GraphicsContextBroker.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicsContextBroker.j[n2] = n3;
        }
        return j[n2];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00cf' || c == 'k' || c == '\u00a2') {
                field = GraphicsContextBroker.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicsContextBroker.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @DataExchangeProtocol2090
    public void l(UserInterfaceEventBroker userInterfaceEventBroker) {
        block7: {
            SecureEventOrchestrator secureEventOrchestrator = userInterfaceEventBroker.getGuiScreen();
            try {
                block6: {
                    try {
                        try {
                            if (secureEventOrchestrator.B(ReflectionMetadataResolver.Uk) || secureEventOrchestrator.B(ReflectionMetadataResolver.B)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicsContextBroker.a(customSystemException);
                        }
                        if (!secureEventOrchestrator.B(ReflectionMetadataResolver.D)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicsContextBroker.a(customSystemException);
                    }
                }
                this.O.clear();
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void M(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        for (int i = 0; i < this.O.size(); ++i) {
            for (int j = i + 1; j < this.O.size(); ++j) {
                GeospatialCoordinateCalculator geospatialCoordinateCalculator = this.O.get(i);
                GeospatialCoordinateCalculator geospatialCoordinateCalculator2 = this.O.get(j);
                NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(geospatialCoordinateCalculator.r());
                NetworkConnectionOptimizer2322 networkConnectionOptimizer23222 = new NetworkConnectionOptimizer2322(geospatialCoordinateCalculator2.r());
                double d2 = systemConfigurationOrchestrator.y(networkConnectionOptimizer2322);
                double d3 = systemConfigurationOrchestrator.y(networkConnectionOptimizer23222);
                double d4 = (d2 + d3) / 2.0;
                double d5 = Math.max(1.5, d4 / 5.0);
                double d6 = geospatialCoordinateCalculator.t - geospatialCoordinateCalculator2.t;
                double d7 = geospatialCoordinateCalculator.l - geospatialCoordinateCalculator2.l;
                double d8 = geospatialCoordinateCalculator.L - geospatialCoordinateCalculator2.L;
                double d9 = Math.sqrt(d6 * d6 + d7 * d7 + d8 * d8);
                try {
                    if (!(d9 <= d5)) continue;
                    geospatialCoordinateCalculator.a(geospatialCoordinateCalculator2);
                    this.O.remove(j);
                    --j;
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsContextBroker.a(customSystemException);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicsContextBroker.d = MultiContainerRegistry.a(4329535304681118376L, 1802595024935112305L, MethodHandles.lookup().lookupClass()).a(105451483613900L);
                GraphicsContextBroker.m = new Object[5];
                GraphicsContextBroker.n = new String[5];
                GraphicsContextBroker.a();
                GraphicsContextBroker.l = new HashMap<K, V>(13);
                var0 = GraphicsContextBroker.d ^ 108589286997740L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "\u00adv\u0085K\u00f9l\u008a\u0098\u00b5\u0000\u008d\u00fc \t\u0004\u00e6k\u0016\u0092D\u00c69#8\u00c3\u00d9\u00892\u009eNs\u00f8\u00d61\u00e1Su\u0086\u00b5\\\u00cb\u00ad#\u0087>\u00cfW\u0019.\u009c\u00f5\u0088W\u00d38\u00cd\u00d1h\u00d7\u0080\u009b\u00fc\u00f9:\r7\u00f0\u0003\u00cdB=\u00dd\u00ce\u00df\tC\u009aKR;\u00e1\u000b\u00b6\u0088\u0014K\u001aEe#\u00fajr\u00b3\u00dd\u001bs\u0084\u0095\u00ed\u001b\u0005\u0010\u00a9\u00d8w\r\u0001\u0014Q\u0018\u007f\u00a1\u009d\u0085\"\u00c7rJ\u00d8\u00c5z\u00a9\u00a2V\u00d65\u0015\u009c\u00ca\u00f0\"\u0085\u0093\u00c4\u00acS\u00a7\u00e9\u00b0\u00cb3\u00b5\u001c\u00ed\u001d\u00c5\u00e2\"\u00a7\u00930O\u00bfx\u00a4\u001f\u00d7\u001cq";
                var7_6 = "\u00adv\u0085K\u00f9l\u008a\u0098\u00b5\u0000\u008d\u00fc \t\u0004\u00e6k\u0016\u0092D\u00c69#8\u00c3\u00d9\u00892\u009eNs\u00f8\u00d61\u00e1Su\u0086\u00b5\\\u00cb\u00ad#\u0087>\u00cfW\u0019.\u009c\u00f5\u0088W\u00d38\u00cd\u00d1h\u00d7\u0080\u009b\u00fc\u00f9:\r7\u00f0\u0003\u00cdB=\u00dd\u00ce\u00df\tC\u009aKR;\u00e1\u000b\u00b6\u0088\u0014K\u001aEe#\u00fajr\u00b3\u00dd\u001bs\u0084\u0095\u00ed\u001b\u0005\u0010\u00a9\u00d8w\r\u0001\u0014Q\u0018\u007f\u00a1\u009d\u0085\"\u00c7rJ\u00d8\u00c5z\u00a9\u00a2V\u00d65\u0015\u009c\u00ca\u00f0\"\u0085\u0093\u00c4\u00acS\u00a7\u00e9\u00b0\u00cb3\u00b5\u001c\u00ed\u001d\u00c5\u00e2\"\u00a7\u00930O\u00bfx\u00a4\u001f\u00d7\u001cq".length();
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
                    var6_5 = "\u00d1\u00f4\r\u0080y)\u00d6\u00f1Z\u008a`{\u00ff\u00cd\u00f29";
                    var7_6 = "\u00d1\u00f4\r\u0080y)\u00d6\u00f1Z\u008a`{\u00ff\u00cd\u00f29".length();
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
        GraphicsContextBroker.h = var8_3;
        GraphicsContextBroker.j = new Integer[22];
    }

    @DataExchangeProtocol2090
    public void H(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        try {
            if (ApplicationLifecycleManager.c().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsContextBroker.a(customSystemException);
        }
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        ApplicationLifecycleManager.U().H(1.0);
        tR.l();
        tl.P();
        tl.R(false);
        tl.w();
        tl.N();
        tl.l(770, 771, 1, 0);
        tl.P();
        for (GeospatialCoordinateCalculator geospatialCoordinateCalculator : this.O) {
            DataTransformationEngine1209 dataTransformationEngine1209;
            double d5;
            double d6;
            double d7;
            GeospatialCoordinateCalculator geospatialCoordinateCalculator2;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator2;
            GraphicsContextBroker graphicsContextBroker;
            try {
                if (geospatialCoordinateCalculator.L()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
            double d8 = geospatialCoordinateCalculator.w + (geospatialCoordinateCalculator.t - geospatialCoordinateCalculator.w) * (double)eventDispatchRegistry2111.getTicks() - d2;
            double d9 = geospatialCoordinateCalculator.J + (geospatialCoordinateCalculator.l - geospatialCoordinateCalculator.J) * (double)eventDispatchRegistry2111.getTicks() - d3;
            double d10 = geospatialCoordinateCalculator.H + (geospatialCoordinateCalculator.L - geospatialCoordinateCalculator.H) * (double)eventDispatchRegistry2111.getTicks() - d4;
            try {
                graphicsContextBroker = this;
                systemConfigurationOrchestrator2 = systemConfigurationOrchestrator;
                geospatialCoordinateCalculator2 = geospatialCoordinateCalculator;
                d7 = d8;
                d6 = d9;
                d5 = d10;
                dataTransformationEngine1209 = GeometryCalculator.C() >= 35 ? eventDispatchRegistry2111.getMatrixStack() : null;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsContextBroker.a(customSystemException);
            }
            graphicsContextBroker.L(systemConfigurationOrchestrator2, geospatialCoordinateCalculator2, d7, d6, d5, dataTransformationEngine1209);
        }
        tl.T();
        tl.k();
        tl.R(true);
        tl.T();
        tl.j();
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        tR.g();
        ApplicationLifecycleManager.U().F(1.0);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GraphicsContextBroker.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicsContextBroker.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicsContextBroker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(GraphicsContextBroker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

