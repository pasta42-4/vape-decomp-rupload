/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package com.graphics.resources;

import a.E8;
import a.Ec;
import a.KB;
import a.Ne;
import a.Qh;
import a.Qv;
import a.V3;
import a._Y;
import a.a;
import a.s_;
import a.tl;
import a.z6;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.core.DataCompressionHandler;
import com.config.validation.ConfigurationValidator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.context.ContextualDataBroker868;
import com.data.flow.DataFlowAnalyzer;
import com.data.streaming.DataStreamProcessor1600;
import com.data.transformation.DataTransformationEngine1209;
import com.data.transformation.TransformationEngine;
import com.event.core.EventDispatcher;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.filtering.selection.SelectionFilterRegistry;
import com.financial.transactions.TransactionValidator1679;
import com.game.actions.ActionSequenceHandler;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.rendering.RenderEventDispatcher;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.math.transformation.NumericTransformationService;
import com.message.processing.MessageQueueProcessor;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.MultiProtocolContextManager;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolInteractionController;
import com.network.transmission.PacketTransmissionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.context.RuntimeContextResolver;
import com.security.access.SecurityAccessController1588;
import com.security.exchange.SecureDataExchanger793;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.execution.ConditionalExecutionManager;
import com.system.mapping.DynamicMappingRegistry;
import com.system.monitoring.ExecutionStateTracker;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.flow.TransactionFlowController;
import com.transaction.management.TransactionOrchestrator1017;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class GraphicalResourceManager
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker P;
    private static final String[] lb;
    private final Color X;
    private final NumericPrecisionTransformer m;
    private static final Integer[] gb;
    private final ConcurrentHashMap<Integer, String> Ic;
    private final ContextualDataBroker868 Z;
    private final NumericPrecisionTransformer b;
    private final AuthenticationStateTracker h;
    private final Qv[] A;
    private final AuthenticationStateTracker d;
    private final NumericPrecisionTransformer B;
    private static final String v;
    private final AuthenticationStateTracker R;
    private static final long[] fb;
    private final AuthenticationStateTracker F;
    private final NumericPrecisionTransformer o;
    private static final Object[] kb;
    private static final long bb;
    private final AuthenticationStateTracker w;
    private final Color e;
    private final AuthenticationStateTracker V;
    private final AuthenticationStateTracker O;
    private final AuthenticationStateTracker x;
    private final AuthenticationStateTracker r;
    private final AuthenticationStateTracker K;
    private static final String G;
    private final NumericPrecisionTransformer Y;
    private static final String t;
    private final AuthenticationStateTracker l;
    private static final String T;
    private final AuthenticationStateTracker Iz;
    private final AuthenticationStateTracker L;
    private final AuthenticationStateTracker z;
    private final AuthenticationStateTracker n;
    private final AuthenticationStateTracker N;
    private final AuthenticationStateTracker j;
    private static final Map hb;

    private String K(TransactionOrchestrator1017 transactionOrchestrator1017, MultiProtocolContextManager multiProtocolContextManager, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        float f;
        double d2;
        float f2;
        double d3;
        double d4;
        String string;
        long l;
        block11: {
            boolean bl5;
            block10: {
                SecurityAccessController1588 securityAccessController1588;
                l = bb ^ 0x2884E5E98847L;
                String string2 = multiProtocolContextManager.B();
                string = DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)5972, (long)(0x70488CB89CD50D1CL ^ l)), (long)-8367666450913659408L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)2230, (long)(0x5BE3851989749290L ^ l)), (long)-8367666450913659408L, (long)l)) + string2;
                bl5 = transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ);
                if (bl5 && (securityAccessController1588 = TemporalMetadataResolver.h.j().A(multiProtocolContextManager.g())) != null) {
                    int n;
                    string = securityAccessController1588.x();
                    try {
                        if (TemporalMetadataResolver.h.j().b.s().booleanValue() || TemporalMetadataResolver.h.j().b.s().booleanValue()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalResourceManager.a(customSystemException);
                    }
                    char[] cArray = string2.toCharArray();
                    for (int i = n = string2.indexOf(string); i > 0; --i) {
                        char c = cArray[i];
                        if (c != '\u00a7') continue;
                        c = cArray[i + 1];
                        String string3 = String.valueOf(c);
                        string = '\u00a7' + string3 + string;
                        break;
                    }
                }
            }
            if (bl) {
                string = DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)10633, (long)(0x1C1DCBAB12C7B3A6L ^ l)), (long)-8367666450913659408L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)29137, (long)(0x25C420BB98BAEBA9L ^ l)), (long)-8367666450913659408L, (long)l)) + (int)multiProtocolContextManager.u() + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)128, (long)(0x7CAA7A1AB9A59AD7L ^ l)), (long)-8367666450913659408L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)18086, (long)(0x1773EAC4E9725CC5L ^ l)), (long)-8367666450913659408L, (long)l)) + string;
            }
            try {
                if (!bl5 || !multiProtocolContextManager.A().G()) break block11;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalResourceManager.a(customSystemException);
            }
            string = DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)25154, (long)(0x6257BABCBCF6782CL ^ l)), (long)-8367666450913659408L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)15912, (long)(0x1F72CC1D35422468L ^ l)), (long)-8367666450913659408L, (long)l)) + string;
        }
        CallSite callSite = (d4 = 100.0 * ((d3 = (double)((f2 = transactionOrchestrator1017.e()) / 2.0f)) / (d2 = (double)(transactionOrchestrator1017.K() / 2.0f)))) > 75.0 ? GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)24963, (long)(0x34298A04EBCAFBD3L ^ l)), (long)-8367666450913659408L, (long)l) : (d4 > 50.0 ? GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)15068, (long)(0xEB0A1BA8F9B209EL ^ l)), (long)-8367666450913659408L, (long)l) : (d4 > 25.0 ? GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)21793, (long)(0x56EDF2F88A1ECF08L ^ l)), (long)-8367666450913659408L, (long)l) : GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)22486, (long)(0x1E104EECB0F1CDFCL ^ l)), (long)-8367666450913659408L, (long)l)));
        String string4 = this.Z.x(Math.floor((d3 + 0.25) / 0.5) * 0.5);
        if (bl2) {
            string = String.format((String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)8507, (long)(0x5EC38892A5C33B7DL ^ l)), (long)-8367666450913659408L, (long)l)), string, DynamicContextBroker.u, callSite, string4);
        }
        if (bl4 && (f = multiProtocolContextManager.G()) > 0.0f) {
            String string5 = this.Z.x(Math.floor(((double)f + 0.25) / 0.5) * 0.5);
            string = String.format((String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)1864, (long)(0x149341A1237B1D6FL ^ l)), (long)-8367666450913659408L, (long)l)), string, DynamicContextBroker.u, GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)7017, (long)(0x2CC20F29E4B28142L ^ l)), (long)-8367666450913659408L, (long)l), string5);
        }
        if (bl3) {
            string = String.format((String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)16004, (long)(0x79A2A17536A4A4F5L ^ l)), (long)-8367666450913659408L, (long)l)), string, multiProtocolContextManager.w());
        }
        return string;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void r(E8 e8, LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController, int n, int n2, double d2) {
        double d3;
        double d4;
        int n3;
        int n4;
        long l = bb ^ 0x665A66E51051L;
        try {
            Map<Qv, Short> map = RuntimeContextResolver.j(lightweightExecutionContext);
            int n5 = 0;
            block4: for (Map.Entry<Qv, Short> entry : map.entrySet()) {
                Qv qv2 = entry.getKey();
                n4 = entry.getValue().shortValue();
                for (Qv qv3 : this.A) {
                    if (!qv2.equals(qv3)) continue;
                    String string = qv2.G(n4).substring(0, 1).toLowerCase();
                    string = n4 > 99 ? string + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)18330, (long)(0x11041C7590D545D8L ^ l)), (long)1438439853075918310L, (long)l)) : string + n4;
                    double d5 = 0.7;
                    double d6 = 1.0 / d5;
                    this.R(e8, string, (int)((double)n * d6), (int)((double)(-2 + (n2 + n5)) * d6), d5, d2);
                    n5 += 6;
                    continue block4;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((n3 = protocolInteractionController.v()) > 0 && (d4 = 1.0 - (d3 = (double)lightweightExecutionContext.b() / (double)n3)) < 1.0) {
            block8: {
                block7: {
                    ConfigurationManager.f = false;
                    n4 = (int)Math.round(255.0 - d3 * 255.0);
                    try {
                        if (!ConfigurationManager.U()) break block7;
                        DataFlowAnalyzer.c(n + 2, n2 + 13, 13.0f, 2.0f, Color.BLACK);
                        DataFlowAnalyzer.c(n + 2, n2 + 13, 12.0f, 1.0f, new Color((255 - n4) / 4, 64, 0, 255));
                        DataFlowAnalyzer.c(n + 2, n2 + 13, (float)(13.0 * d4), 1.0f, GraphicsBufferAllocator.o((float)d4));
                        break block8;
                    }
                    catch (Exception exception) {
                        throw GraphicalResourceManager.a(exception);
                    }
                }
                ConfigurationManager.H(n + 2, n2 + 13, 13.0f, 2.0f, Color.BLACK);
                ConfigurationManager.H(n + 2, n2 + 13, 12.0f, 1.0f, new Color((255 - n4) / 4, 64, 0, 255));
                ConfigurationManager.A(n + 2, n2 + 13, 13.0 * d4, 1.0, GraphicsBufferAllocator.o((float)d4));
            }
            ConfigurationManager.f = true;
        }
    }

    @DataExchangeProtocol2090(F=true)
    public void B(RenderEventDispatcher renderEventDispatcher) {
        try {
            if (renderEventDispatcher.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = renderEventDispatcher.getThePlayer();
        CryptographicTransformer cryptographicTransformer = renderEventDispatcher.getEntity();
        try {
            if (!this.B(cryptographicTransformer, renderEventDispatcher.getWorld(), systemConfigurationOrchestrator)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
        renderEventDispatcher.setCanceled(true);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicalResourceManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = GraphicalResourceManager.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = GraphicalResourceManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicalResourceManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicalResourceManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicalResourceManager.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicalResourceManager.b(277926391462952L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicalResourceManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicalResourceManager.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicalResourceManager.b(277926391462952L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1182;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicalResourceManager.gb[n2] = n3;
        }
        return gb[n2];
    }

    private void R(E8 e8, String string, int n, int n2, double d2, double d3) {
        long l = bb ^ 0x352616628DD4L;
        int n3 = ((int)d3 & 0xFF) << 24 | GraphicalResourceManager.a("n", (int)895, (long)(0xB97C7F413119C8BL ^ l));
        double d4 = 1.0 / d2;
        boolean bl = GL11.glIsEnabled((int)2896);
        try {
            if (bl) {
                Ne.h.z(2896);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
        try {
            Ne.h.x(d2, d2, d2);
            e8.m(string, n, n2, n3);
            Ne.h.x(d4, d4, d4);
            if (bl) {
                Ne.h.y(2896);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GraphicalResourceManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicalResourceManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = GraphicalResourceManager.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicalResourceManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicalResourceManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicalResourceManager.a(clazz3, string2, clazz2)) != null) {
                    GraphicalResourceManager.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicalResourceManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicalResourceManager.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicalResourceManager.b(277926391462952L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean B(CryptographicTransformer cryptographicTransformer, NetworkProtocolNegotiator networkProtocolNegotiator, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block63: {
            boolean bl;
            block66: {
                block65: {
                    MultiProtocolContextManager multiProtocolContextManager;
                    block64: {
                        block61: {
                            block62: {
                                block59: {
                                    block60: {
                                        block58: {
                                            block57: {
                                                block56: {
                                                    block55: {
                                                        try {
                                                            block54: {
                                                                try {
                                                                    try {
                                                                        if (cryptographicTransformer.Y() || systemConfigurationOrchestrator.Y()) break block54;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalResourceManager.a(customSystemException);
                                                                    }
                                                                    if (!networkProtocolNegotiator.Y()) break block55;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GraphicalResourceManager.a(customSystemException);
                                                                }
                                                            }
                                                            return false;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GraphicalResourceManager.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (ReflectionMetadataResolver.PR == null || !cryptographicTransformer.B(ReflectionMetadataResolver.PR)) break block56;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GraphicalResourceManager.a(customSystemException);
                                                        }
                                                        return false;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GraphicalResourceManager.a(customSystemException);
                                                    }
                                                }
                                                try {
                                                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                                                        return false;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                try {
                                                    if (systemConfigurationOrchestrator.M().equals(cryptographicTransformer.M())) {
                                                        return false;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                try {
                                                    if (!networkProtocolNegotiator.L().contains(cryptographicTransformer.M())) {
                                                        return false;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer);
                                                multiProtocolContextManager = ConditionalExecutionManager.a(transactionOrchestrator1017, systemConfigurationOrchestrator);
                                                try {
                                                    if (multiProtocolContextManager.m()) {
                                                        return false;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                try {
                                                    try {
                                                        if (!this.Iz.s().booleanValue() || !multiProtocolContextManager.I()) break block57;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GraphicalResourceManager.a(customSystemException);
                                                    }
                                                    return false;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (!this.w.s().booleanValue() || !multiProtocolContextManager.H()) break block58;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                return false;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalResourceManager.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) break block59;
                                                if (this.N.s().booleanValue()) break block60;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalResourceManager.a(customSystemException);
                                            }
                                            return false;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalResourceManager.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if ((Double)this.B.J() == 0.0 || !(multiProtocolContextManager.u() > (Double)this.B.J())) break block59;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalResourceManager.a(customSystemException);
                                        }
                                        return false;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalResourceManager.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (!_Y.H(cryptographicTransformer)) break block61;
                                        if (this.z.s().booleanValue()) break block62;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalResourceManager.a(customSystemException);
                                    }
                                    return false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalResourceManager.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if ((Double)this.Y.J() == 0.0 || !(multiProtocolContextManager.u() > (Double)this.Y.J())) break block61;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalResourceManager.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalResourceManager.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (!_Y.k(cryptographicTransformer)) break block63;
                                if (this.l.s().booleanValue()) break block64;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalResourceManager.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalResourceManager.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if ((Double)this.m.J() != 0.0 && multiProtocolContextManager.u() > (Double)this.m.J()) break block65;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalResourceManager.a(customSystemException);
                        }
                        bl = true;
                        break block66;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalResourceManager.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return true;
    }

    double U(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (lightweightExecutionContext == null) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        int n = protocolInteractionController.v();
        try {
            if (n > 0) {
                return (double)lightweightExecutionContext.b() / (double)n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
        return 0.0;
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

    private void W(NumericComputationEngine1131 numericComputationEngine1131, Ec ec2, E8 e8, SystemConfigurationOrchestrator systemConfigurationOrchestrator, float f, float f2, ExecutionStateTracker executionStateTracker, TransactionOrchestrator1017 transactionOrchestrator1017, MultiProtocolContextManager multiProtocolContextManager, double d2, double d3, double d4, float f3, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, DataTransformationEngine1209 dataTransformationEngine1209) {
        block75: {
            LightweightExecutionContext[] lightweightExecutionContextArray;
            LightweightExecutionContext lightweightExecutionContext;
            Qh qh;
            double d5;
            block76: {
                int n;
                boolean bl6;
                boolean bl7;
                block74: {
                    TransactionValidator1679 transactionValidator1679;
                    Object object;
                    int n2;
                    int n3;
                    Object object2;
                    long l;
                    block71: {
                        block72: {
                            float f4;
                            ColorCompositionEngine colorCompositionEngine;
                            Object object3;
                            block69: {
                                block70: {
                                    block67: {
                                        double d6;
                                        double d7;
                                        double d8;
                                        block68: {
                                            Color color;
                                            ColorCompositionEngine colorCompositionEngine2;
                                            ColorCompositionEngine colorCompositionEngine3;
                                            block63: {
                                                boolean bl8;
                                                Qh qh2;
                                                l = bb ^ 0xA9B3516109FL;
                                                if (GameVersionEnumerator.MC_1_21_10.H()) {
                                                    bl3 = false;
                                                }
                                                d5 = (Double)this.b.J();
                                                if (multiProtocolContextManager.G()) {
                                                    d5 = 1.0;
                                                }
                                                bl7 = transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ);
                                                try {
                                                    qh2 = bl7 ? new Qh(transactionOrchestrator1017.M()) : null;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                qh = qh2;
                                                lightweightExecutionContext = null;
                                                lightweightExecutionContextArray = new LightweightExecutionContext[4];
                                                bl6 = false;
                                                try {
                                                    if (!bl3 || !bl7) break block63;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                lightweightExecutionContext = multiProtocolContextManager.O();
                                                try {
                                                    bl8 = lightweightExecutionContext != null;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                bl6 = bl8;
                                                object2 = qh.l().G();
                                                int n4 = 0;
                                                while (true) {
                                                    block65: {
                                                        block66: {
                                                            block64: {
                                                                try {
                                                                    try {
                                                                        if (n4 >= ((Object[])object2).length) break;
                                                                        if (object2[n4] != null) break block64;
                                                                        break block65;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalResourceManager.a(customSystemException);
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GraphicalResourceManager.a(customSystemException);
                                                                }
                                                            }
                                                            object3 = new LightweightExecutionContext(object2[n4]);
                                                            try {
                                                                if (!((LightweightExecutionContext)object3).Y()) break block66;
                                                                break block65;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GraphicalResourceManager.a(customSystemException);
                                                            }
                                                        }
                                                        bl6 = true;
                                                        lightweightExecutionContextArray[n4] = object3;
                                                    }
                                                    ++n4;
                                                }
                                            }
                                            try {
                                                if (!this.Ic.containsKey(transactionOrchestrator1017.X())) {
                                                    this.Ic.put(transactionOrchestrator1017.X(), this.K(transactionOrchestrator1017, multiProtocolContextManager, bl2, bl, bl4, bl5));
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalResourceManager.a(customSystemException);
                                            }
                                            object2 = this.Ic.get(transactionOrchestrator1017.X());
                                            try {
                                                ColorCompositionEngine colorCompositionEngine4;
                                                colorCompositionEngine3 = colorCompositionEngine4;
                                                colorCompositionEngine2 = colorCompositionEngine4;
                                                color = multiProtocolContextManager.h() ? this.e : this.X;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalResourceManager.a(customSystemException);
                                            }
                                            colorCompositionEngine3(color);
                                            colorCompositionEngine = colorCompositionEngine2;
                                            object3 = new ColorCompositionEngine(colorCompositionEngine);
                                            n3 = this.G(transactionOrchestrator1017, multiProtocolContextManager, colorCompositionEngine, (ColorCompositionEngine)object3, d5);
                                            colorCompositionEngine.I((int)((double)colorCompositionEngine.getAlpha() * d5));
                                            ((ColorCompositionEngine)object3).I((int)((double)((ColorCompositionEngine)object3).getAlpha() * d5));
                                            ColorCompositionEngine colorCompositionEngine5 = new ColorCompositionEngine(n3);
                                            colorCompositionEngine5.I((int)((double)colorCompositionEngine5.getAlpha() * d5));
                                            n3 = colorCompositionEngine5.Y();
                                            f4 = (float)(0.03333335 * (Double)this.o.J());
                                            if (this.F.s().booleanValue()) {
                                                float f5;
                                                float f6 = f3;
                                                try {
                                                    f5 = (double)f6 / 5.0 <= 2.0 ? 2.0f : (float)((double)f6 / 5.0);
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                float f7 = f5;
                                                f4 = (float)(0.01666666753590107 * ((double)f7 * (Double)this.o.J()));
                                            }
                                            n2 = e8.L((String)object2) / 2;
                                            n = -(e8.B((String)object2) - 1);
                                            try {
                                                try {
                                                    if (GeometryCalculator.C() < 35) break block67;
                                                    CryptoContextNegotiator684.D(numericComputationEngine1131);
                                                    if (executionStateTracker.V() != 0) break block68;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalResourceManager.a(customSystemException);
                                                }
                                                Ne.h.m(d2, d3 + (double)multiProtocolContextManager.v() + 0.2, d4);
                                                Ne.h.t(0.0f, 1.0f, 0.0f);
                                                Ne.h.f(-f, 0.0f, 1.0f, 0.0f);
                                                Ne.h.f(-f2, -1.0f, 0.0f, 0.0f);
                                                break block69;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalResourceManager.a(customSystemException);
                                            }
                                        }
                                        object = ec2.v();
                                        try {
                                            d8 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.b() - ((DataCompressionHandler)object).w().X();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalResourceManager.a(customSystemException);
                                        }
                                        double d9 = d8;
                                        try {
                                            d7 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.S() - ((DataCompressionHandler)object).w().F();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalResourceManager.a(customSystemException);
                                        }
                                        double d10 = d7;
                                        try {
                                            d6 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.n() - ((DataCompressionHandler)object).w().f();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalResourceManager.a(customSystemException);
                                        }
                                        double d11 = d6;
                                        Ne.h.m(d2 + d9, d3 + d10 + (double)multiProtocolContextManager.v() + (double)0.4f, d4 + d11);
                                        Ne.h.t(0.0f, 1.0f, 0.0f);
                                        Ne.h.f(-f, 0.0f, 1.0f, 0.0f);
                                        Ne.h.f(f2, 1.0f, 0.0f, 0.0f);
                                        break block69;
                                    }
                                    try {
                                        Ne.h.d((float)(d2 + 0.0), (float)(d3 + (double)multiProtocolContextManager.v() + 0.5), (float)d4);
                                        Ne.h.t(0.0f, 1.0f, 0.0f);
                                        if (executionStateTracker.V() != 2) break block70;
                                        Ne.h.f(-f, 0.0f, 1.0f, 0.0f);
                                        Ne.h.f(f2, -1.0f, 0.0f, 0.0f);
                                        break block69;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalResourceManager.a(customSystemException);
                                    }
                                }
                                Ne.h.f(-f, 0.0f, 1.0f, 0.0f);
                                Ne.h.f(f2, 1.0f, 0.0f, 0.0f);
                            }
                            try {
                                try {
                                    try {
                                        Ne.h.J(-f4, -f4, f4);
                                        tl.P();
                                        tl.R(false);
                                        tl.w();
                                        tl.N();
                                        tl.l(770, 771, 1, 0);
                                        tl.M();
                                        tl.R();
                                        GraphicsBufferAllocator.n((double)(-n2) - 2.0, n, (double)n2 + 2.0, 2.0, 1.0, colorCompositionEngine, (Color)object3);
                                        tl.B();
                                        tl.w();
                                        if (GeometryCalculator.C() < 35) break block71;
                                        if (dataTransformationEngine1209 == null) break block72;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalResourceManager.a(customSystemException);
                                    }
                                    if (dataTransformationEngine1209.Y()) break block72;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalResourceManager.a(customSystemException);
                                }
                                if (dataTransformationEngine1209.B(ReflectionMetadataResolver.YH)) break block71;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalResourceManager.a(customSystemException);
                            }
                        }
                        dataTransformationEngine1209 = DataTransformationEngine1209.i();
                    }
                    if (ConfigurationManager.U()) {
                        block73: {
                            object = new SecureDataExchanger793().Z();
                            try {
                                ((SecureDataExchanger793)object).E(z6.J);
                                ((SecureDataExchanger793)object).E(z6.D.i());
                                if (GeometryCalculator.C() < 50) break block73;
                                e8.Y((String)object2, -n2, n + 2, n3, false, (SecureDataExchanger793)object, PacketTransmissionController.F());
                                break block74;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalResourceManager.a(customSystemException);
                            }
                        }
                        CallSite callSite = GraphicalResourceManager.a("n", (int)22935, (long)(0x5F9EDD3325B3DB6AL ^ l));
                        transactionValidator1679 = ApplicationLifecycleManager.n().e();
                        DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y((String)object2);
                        e8.V(dataStreamProcessor1600, (float)(-n2), (float)(n + 2), n3, false, ((SecureDataExchanger793)object).B(), transactionValidator1679, true, 0, (int)callSite);
                        transactionValidator1679.d();
                    } else if (GeometryCalculator.C() >= 35) {
                        dataTransformationEngine1209.g();
                        object = numericComputationEngine1131.O();
                        dataTransformationEngine1209.T((EventDispatcher)object);
                        dataTransformationEngine1209.T(EventDispatcher.o(180.0f, 0.0f, 180.0f, true));
                        DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y((String)object2);
                        transactionValidator1679 = TransactionValidator1679.B(TransactionFlowController.g().D());
                        CallSite callSite = GraphicalResourceManager.a("n", (int)1255, (long)(0x33918A5E21360649L ^ l));
                        ActionSequenceHandler objectLifecycleTracker = dataTransformationEngine1209.p().n();
                        e8.V(dataStreamProcessor1600, (float)(-n2), (float)(n + 2), n3, false, objectLifecycleTracker, transactionValidator1679, true, 0, (int)callSite);
                        transactionValidator1679.d();
                        dataTransformationEngine1209.v();
                    } else {
                        e8.u((String)object2, -n2, n + 2, n3);
                    }
                }
                boolean bl9 = false;
                if (bl5) {
                    List<V3> list = multiProtocolContextManager.z(transactionOrchestrator1017);
                    int n5 = -(list.size() * 10) - 5;
                    for (V3 v3 : list) {
                        try {
                            tl.a(1.0f, 1.0f, 1.0f, 1.0f);
                            ApplicationLifecycleManager.s().q(TransformationEngine.U());
                            Ne.h.x(0.5, 0.5, 0.5);
                            if (GeometryCalculator.C() >= 35) {
                                dataTransformationEngine1209.g();
                                dataTransformationEngine1209.T(numericComputationEngine1131.O());
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalResourceManager.a(customSystemException);
                        }
                        ConfigurationValidator.y(v3, n5 + 6, n - 30, 18, 18, 1.0f, true);
                        e8.I(s_.T(v3.y() + 1), n5 + 6, n - 30, -1, dataTransformationEngine1209);
                        n5 += 20;
                        bl9 = true;
                        try {
                            if (GeometryCalculator.C() >= 35) {
                                dataTransformationEngine1209.v();
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalResourceManager.a(customSystemException);
                        }
                        Ne.h.x(2.0, 2.0, 2.0);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (!bl3 || !bl7) break block75;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalResourceManager.a(customSystemException);
                            }
                            if (!bl6) break block75;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalResourceManager.a(customSystemException);
                        }
                        CryptoContextNegotiator684.D(numericComputationEngine1131);
                        if (!bl9) break block76;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalResourceManager.a(customSystemException);
                    }
                    Ne.h.m(0.0, -8.0, 0.0);
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager.a(customSystemException);
                }
            }
            this.a(numericComputationEngine1131, ec2, e8, qh, f, f2, multiProtocolContextManager, d5, dataTransformationEngine1209, lightweightExecutionContext, lightweightExecutionContextArray);
        }
        tl.k();
        tl.R(true);
        tl.j();
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicalResourceManager.bb = MultiContainerRegistry.a(-8186271249213165934L, -3345843919493934317L, MethodHandles.lookup().lookupClass()).a(193018187072123L);
                var11 = GraphicalResourceManager.bb ^ 122344394041861L;
                GraphicalResourceManager.kb = new Object[5];
                GraphicalResourceManager.lb = new String[5];
                GraphicalResourceManager.a();
                GraphicalResourceManager.hb = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[77];
                var3_4 = 0;
                var4_5 = "c\u00a4~\u00fa\u00b2!\u00877\u00d2\u0080\f\u0097\u0088&\\>i(w\u00b0\u00f0\u0013\u0016\u00dbD`\u00faY\u00ee1\u008er\u0085\u0086\u0094\u0085\u00edo\u0015\u00baz\b\u008d\u00c2\fe\u00ee\u0096jU\u00d0{\u00a0\u00bfm\u00d8\u00ce\u001d\u00ff3\u008d~\u00d4E\u0014\u0000a\u00ba\u00fbO\u001d\u00ce*\u00e0\u00db\f\u0015\u00fd*b\u00e2 e[\u0091\\5@\u00cf\u0087\u0081\u00efZ\u00c1@\u00eb\u00aa\u0004\u00ddo\u00c9\u00fe\u0081d(\u00f6T\u008a~\u00c2T\u00ef\u0090\u00a3mJ\u00d5\u00eb+\u00abDo\u00e2F}*\u0095J\u00b5\u00d5{\u001d\u00d1\u00dc?\u00f0ro\t/\u00fcz\u00b9\u00b4m\u0087\u0084\u00d8A\u00d3Y\u0011\u00b4F\u00d9U\u00a8\u00a2\u00a9\u009a\u0098\u00f5\u0002uV\u00e4\u00c2jd\u0083\u00ba\u00f9\u0019\u0010(\u00cd\u000b\u00c0eR\u0003\u00f2\u00fa\u00b5\u00ca\u001f\u0003x\u00c4\u0089\t=U\u008a5\u0095\u0099Wo\u00f3s\u0086K\u00a1JVw\u00c1ri\u0081t\u00ba\u00a5\u0017\u00cc#q\u0097\u00a8>k\u00f8L\u00a3qE\u00af\u0090\u000b;\u0090\u00aa\u00e9~\u0084j\u00afb\u009b\t\u0089\u0017\u0002\u0004\u00fd\u00bd\u00e3@\u0016\u009c\u00c7 \u0016(\u008fB[aXX\u00b0\u0087\u0019\u00db3\u00c6\u00da\u00bc\u0083`\u00fb\u00b4\u00e4\u0001\u000eCVX\u00a8\u00eb\u00b0_I\u00e9\u009b\u00f2\u0081`7\u00ea.\u001c\u0093\u00b5\u00073\u00aaO\u00f9\u00d4\u0007\u0006\u00a1\u00f6\u00fa\u00d0S\u00a6[\u0013k\u0018M2\u00feU\u000e\u00a4\u00fdk\u001a\u0000-I\u00a5C\u00df\u00d2\u00cb\u00cf\t=}\u0088\u00d2b\u00da\u00b3;%]MT\u00e7\u00df\u00aea\u00ec\u00af\u00f4\u0092D\u0005u%{\u00d1\u0093}7<}m\u0007p\\P\u00c2$\"\u00d6h4\u0010\u000e-?\u00e5\u00dd\u00b7-76\u007f*\u008e\u00c8\u00d4\u000e\u009ddy^\u00e2n\\\u009f\u00a5\u0018\u0084\u00faAO\t\u0092oU\u00a1i?E\u00c4je\u00d6\u00d68\u0006\u00a8\u00cf\u00edW\u00f5\u00af\u0095\u001e\u00b4\u00eb>\u00e0\u00e2\u00f7$bx\u00b4\u00d7\u00a5h\u00d7\u00ae\u00e8\u008cX\u00df\u00b5@\u00f6\u00b9\u00fd\u00d1\u000b;\u00b4m\u009a_bJ\u0005\u0094Y;\u00dcj\u0080\\\u00b5-B\u0094\u00b9\u00fc\u00915\u00e1\u00c5\n\u00f9K\u00c1\u00184tR\u009f iU\u001e\u0005\u00f0$\u00bf\u00f8\u0083\u00f0\u008f\u00cfoZ\u00a0\u00b3.\u0094\u00b5\u00ac^\u00d7\u0093\tJ\u001d\u0010=\u00f1\u00aa\u00f1I_\u00c421\u00afj\u001c\u0087\r\u00a5+\"\u00db\u0087\u0013\u00d5%E<\u00c8\u0080\u00ce\u0088\u00ee\u00a2\u00c1E\u008b&\u0016\b'\u00a7\u00fff;8\u00fc\u008f\u00e1U\u00e3C\u00b7|\u00e2\u00cb\u0093\u00e2v\u00c9\u00e7\u009a>\u00d2$2(3\u00bbE\u0083\u0014\u00e41\u00c7R%\u001c\u00a9i4Q\u0000\u00cdv1\u00d0\u00f3\u00be";
                var5_6 = "c\u00a4~\u00fa\u00b2!\u00877\u00d2\u0080\f\u0097\u0088&\\>i(w\u00b0\u00f0\u0013\u0016\u00dbD`\u00faY\u00ee1\u008er\u0085\u0086\u0094\u0085\u00edo\u0015\u00baz\b\u008d\u00c2\fe\u00ee\u0096jU\u00d0{\u00a0\u00bfm\u00d8\u00ce\u001d\u00ff3\u008d~\u00d4E\u0014\u0000a\u00ba\u00fbO\u001d\u00ce*\u00e0\u00db\f\u0015\u00fd*b\u00e2 e[\u0091\\5@\u00cf\u0087\u0081\u00efZ\u00c1@\u00eb\u00aa\u0004\u00ddo\u00c9\u00fe\u0081d(\u00f6T\u008a~\u00c2T\u00ef\u0090\u00a3mJ\u00d5\u00eb+\u00abDo\u00e2F}*\u0095J\u00b5\u00d5{\u001d\u00d1\u00dc?\u00f0ro\t/\u00fcz\u00b9\u00b4m\u0087\u0084\u00d8A\u00d3Y\u0011\u00b4F\u00d9U\u00a8\u00a2\u00a9\u009a\u0098\u00f5\u0002uV\u00e4\u00c2jd\u0083\u00ba\u00f9\u0019\u0010(\u00cd\u000b\u00c0eR\u0003\u00f2\u00fa\u00b5\u00ca\u001f\u0003x\u00c4\u0089\t=U\u008a5\u0095\u0099Wo\u00f3s\u0086K\u00a1JVw\u00c1ri\u0081t\u00ba\u00a5\u0017\u00cc#q\u0097\u00a8>k\u00f8L\u00a3qE\u00af\u0090\u000b;\u0090\u00aa\u00e9~\u0084j\u00afb\u009b\t\u0089\u0017\u0002\u0004\u00fd\u00bd\u00e3@\u0016\u009c\u00c7 \u0016(\u008fB[aXX\u00b0\u0087\u0019\u00db3\u00c6\u00da\u00bc\u0083`\u00fb\u00b4\u00e4\u0001\u000eCVX\u00a8\u00eb\u00b0_I\u00e9\u009b\u00f2\u0081`7\u00ea.\u001c\u0093\u00b5\u00073\u00aaO\u00f9\u00d4\u0007\u0006\u00a1\u00f6\u00fa\u00d0S\u00a6[\u0013k\u0018M2\u00feU\u000e\u00a4\u00fdk\u001a\u0000-I\u00a5C\u00df\u00d2\u00cb\u00cf\t=}\u0088\u00d2b\u00da\u00b3;%]MT\u00e7\u00df\u00aea\u00ec\u00af\u00f4\u0092D\u0005u%{\u00d1\u0093}7<}m\u0007p\\P\u00c2$\"\u00d6h4\u0010\u000e-?\u00e5\u00dd\u00b7-76\u007f*\u008e\u00c8\u00d4\u000e\u009ddy^\u00e2n\\\u009f\u00a5\u0018\u0084\u00faAO\t\u0092oU\u00a1i?E\u00c4je\u00d6\u00d68\u0006\u00a8\u00cf\u00edW\u00f5\u00af\u0095\u001e\u00b4\u00eb>\u00e0\u00e2\u00f7$bx\u00b4\u00d7\u00a5h\u00d7\u00ae\u00e8\u008cX\u00df\u00b5@\u00f6\u00b9\u00fd\u00d1\u000b;\u00b4m\u009a_bJ\u0005\u0094Y;\u00dcj\u0080\\\u00b5-B\u0094\u00b9\u00fc\u00915\u00e1\u00c5\n\u00f9K\u00c1\u00184tR\u009f iU\u001e\u0005\u00f0$\u00bf\u00f8\u0083\u00f0\u008f\u00cfoZ\u00a0\u00b3.\u0094\u00b5\u00ac^\u00d7\u0093\tJ\u001d\u0010=\u00f1\u00aa\u00f1I_\u00c421\u00afj\u001c\u0087\r\u00a5+\"\u00db\u0087\u0013\u00d5%E<\u00c8\u0080\u00ce\u0088\u00ee\u00a2\u00c1E\u008b&\u0016\b'\u00a7\u00fff;8\u00fc\u008f\u00e1U\u00e3C\u00b7|\u00e2\u00cb\u0093\u00e2v\u00c9\u00e7\u009a>\u00d2$2(3\u00bbE\u0083\u0014\u00e41\u00c7R%\u001c\u00a9i4Q\u0000\u00cdv1\u00d0\u00f3\u00be".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "#\u00b9\u0017\u0091^`S\u00c4A\u00dd\u00e0\u00a3\u00c3\u00b2k\u001a";
                    var5_6 = "#\u00b9\u0017\u0091^`S\u00c4A\u00dd\u00e0\u00a3\u00c3\u00b2k\u001a".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        GraphicalResourceManager.fb = var6_3;
        GraphicalResourceManager.gb = new Integer[77];
        GraphicalResourceManager.G = DynamicContextBroker.u + (String)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)28724, (long)(4110961769593686062L ^ var11)), (long)-6223318881208215630L, (long)var11);
        GraphicalResourceManager.T = DynamicContextBroker.u + (String)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)32068, (long)(5377848153651037530L ^ var11)), (long)-6223318881208215630L, (long)var11);
        GraphicalResourceManager.t = DynamicContextBroker.u + (String)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)1069, (long)(8408549816589761573L ^ var11)), (long)-6223318881208215630L, (long)var11);
        GraphicalResourceManager.v = DynamicContextBroker.u + (String)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)29662, (long)(4052875299955002359L ^ var11)), (long)-6223318881208215630L, (long)var11);
    }

    private void a(NumericComputationEngine1131 numericComputationEngine1131, Ec ec2, E8 e8, Qh qh, float f, float f2, MultiProtocolContextManager multiProtocolContextManager, double d2, DataTransformationEngine1209 dataTransformationEngine1209, @Nullable LightweightExecutionContext lightweightExecutionContext, @Nullable LightweightExecutionContext[] lightweightExecutionContextArray) {
        double d3 = 1.1;
        double d4 = 1.0 / d3;
        try {
            if (GeometryCalculator.C() >= 35) {
                Ne.h.f(f + 180.0f, 0.0f, -1.0f, 0.0f);
                Ne.h.f(f2, -1.0f, 0.0f, 0.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager.a(customSystemException);
        }
        Ne.h.x(d3, d3, d3);
        NumericTransformationService numericTransformationService = SelectionFilterRegistry.Y.m(qh);
        if (numericTransformationService != null) {
            int n;
            block12: {
                n = 0;
                try {
                    try {
                        if (lightweightExecutionContext == null || lightweightExecutionContext.D() <= 1) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalResourceManager.a(customSystemException);
                    }
                    if (lightweightExecutionContext.J() <= 1) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager.a(customSystemException);
                }
                n = lightweightExecutionContext.J();
            }
            double[] dArray = new double[5];
            dArray[0] = this.U(lightweightExecutionContext);
            if (lightweightExecutionContextArray != null) {
                try {
                    for (int i = 0; i < lightweightExecutionContextArray.length; ++i) {
                        dArray[i + 1] = this.U(lightweightExecutionContextArray[i]);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager.a(customSystemException);
                }
            }
            numericTransformationService.Q(-numericTransformationService.t() / 2.0, -26.0, n, dArray, dataTransformationEngine1209, numericComputationEngine1131, true);
        }
        Ne.h.x(d4, d4, d4);
    }

    public String t(SystemConfigurationOrchestrator systemConfigurationOrchestrator, MultiProtocolContextManager multiProtocolContextManager, Qh qh) {
        float f;
        float f2;
        String string;
        block12: {
            block11: {
                Object object;
                string = T;
                LightweightExecutionContext lightweightExecutionContext = multiProtocolContextManager.Z();
                f2 = 0.0f;
                try {
                    if (lightweightExecutionContext == null || !lightweightExecutionContext.r()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager.a(customSystemException);
                }
                f2 += RuntimeResourceTracker.g(lightweightExecutionContext);
                if (qh.e(ObjectPipelineManager.G) && ((V3)(object = qh.W(ObjectPipelineManager.G))).V() > 0) {
                    f2 = (float)((double)f2 * (1.375 * (double)((V3)object).y()));
                }
            }
            for (Object object : qh.l().G()) {
                Object object2 = new LightweightExecutionContext(object);
                f2 = (float)((double)f2 + RuntimeResourceTracker.i((LightweightExecutionContext)object2));
            }
            f = RuntimeResourceTracker.d(systemConfigurationOrchestrator);
            try {
                if (!this.h.s().booleanValue() || !systemConfigurationOrchestrator.e(ObjectPipelineManager.G)) break block12;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalResourceManager.a(customSystemException);
            }
            V3 v3 = systemConfigurationOrchestrator.W(ObjectPipelineManager.G);
            if (v3.V() > 0) {
                f = (float)((double)f * (1.375 * (double)v3.y()));
            }
        }
        for (Object object2 : systemConfigurationOrchestrator.l().G()) {
            LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(object2);
            f = (float)((double)f + RuntimeResourceTracker.i(lightweightExecutionContext));
        }
        if (f > f2) {
            string = v;
        } else if (f < f2) {
            string = t;
        }
        return string;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f3' || c == 't' || c == '\u00f0' || c == '\u00fa') {
                field = GraphicalResourceManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicalResourceManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicalResourceManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicalResourceManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicalResourceManager.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicalResourceManager.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "l3\\";
        objectArray[1] = Integer.TYPE;
        GraphicalResourceManager.lb[1] = "java/lang/Integer";
        objectArray[2] = "\n4\u0005\u0002\u001e\u0000\u0001;\u0014Mc\u0018\u0012<\u001d\u0004";
        objectArray[3] = "\bG~Cl\u001e\u0003Ho\f\r\u0010\bCkV";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0006X_/.\u001c[X\u0012V4\u001f8\u001e\u001bf\"\n\u0002XG'fd\u0001@A:4\tS\u001e\u0018)_";
    }

    private static int lambda$onRenderWorldLast$0(DynamicMappingRegistry dynamicMappingRegistry, DynamicMappingRegistry dynamicMappingRegistry2) {
        return Double.compare(((MultiProtocolContextManager)dynamicMappingRegistry2.p()).u(), ((MultiProtocolContextManager)dynamicMappingRegistry.p()).u());
    }

    public GraphicalResourceManager() {
        long l = bb ^ 0x1E76BCBD1C83L;
        super(a.cs((int)GraphicalResourceManager.a("n", (int)16867, (long)(0x1F20DB0CFD3A4F6AL ^ l))), (int)GraphicalResourceManager.a("n", (int)30544, (long)(0x7B0CE46E7D9579F9L ^ l)), RecursiveNodeGraph.z, a.cs((int)GraphicalResourceManager.a("n", (int)13699, (long)(0x2F085998CA00BB2DL ^ l))));
        this.X = new Color(20, 20, 20, 128);
        this.e = new Color(115, 0, 4, 128);
        this.w = AuthenticationStateTracker.R(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)10753, (long)(0x3FB202B85C0DA4B0L ^ l)), (long)2243959471196004660L, (long)l)), false, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)28428, (long)(0x2EC4E1BB5F7E61B8L ^ l)), (long)2243959471196004660L, (long)l)));
        this.F = AuthenticationStateTracker.R(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)26328, (long)(0xA4D009F1EA6684AL ^ l)), (long)2243959471196004660L, (long)l)), true, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)19054, (long)(0x4BE7F396F6ADC4C6L ^ l)), (long)2243959471196004660L, (long)l)));
        this.Iz = AuthenticationStateTracker.R(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)31195, (long)(0x28093294E7EB7741L ^ l)), (long)2243959471196004660L, (long)l)), true, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)14627, (long)(0x328BFC2985E5B781L ^ l)), (long)2243959471196004660L, (long)l)));
        this.N = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)29193, (long)(0x41A1EE0AA1837C84L ^ l)), (long)2243959471196004660L, (long)l)), true);
        this.x = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)21620, (long)(0x17028F6A40CC5A98L ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.R = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)1044, (long)(0x70E1C96949F8A9FL ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.P = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)18747, (long)(0x5A151E1BAC6BC7BEL ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.V = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)20952, (long)(0x1649706AC4DADF50L ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.B = NumericPrecisionTransformer.D(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)290, (long)(0x3F1B2242A7C8F99L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)32398, (long)(0x8150BB9FB80F010L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)6290, (long)(0x41077BEC88271615L ^ l)), (long)2243959471196004660L, (long)l)), 0.0, 0.0, 250.0, 1.0, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)21237, (long)(0x15B63F59494EDC4FL ^ l)), (long)2243959471196004660L, (long)l)));
        this.d = AuthenticationStateTracker.R(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)27972, (long)(0x6B49354D84E463DDL ^ l)), (long)2243959471196004660L, (long)l)), false, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)22355, (long)(0x736D69F2FB3AD9B4L ^ l)), (long)2243959471196004660L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)3112, (long)(0x3F4406DA813002CCL ^ l)), (long)2243959471196004660L, (long)l)) + G + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)16413, (long)(0xE50983535D1CEADL ^ l)), (long)2243959471196004660L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)22742, (long)(0x1C314ED29EE7D668L ^ l)), (long)2243959471196004660L, (long)l)) + G + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)23543, (long)(0x470DC59D47B2D560L ^ l)), (long)2243959471196004660L, (long)l)) + DynamicContextBroker.u + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)10830, (long)(0x554784BF9AFCA4EBL ^ l)), (long)2243959471196004660L, (long)l)) + G + (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)9496, (long)(0x6CB4CD1CE5F2B99L ^ l)), (long)2243959471196004660L, (long)l)));
        this.h = AuthenticationStateTracker.R(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)8551, (long)(0x55443D7DB7282FD1L ^ l)), (long)2243959471196004660L, (long)l)), false, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)18303, (long)(0x2B3382984B4C9EAL ^ l)), (long)2243959471196004660L, (long)l)));
        this.z = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)31888, (long)(0x6B4390931B507227L ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.j = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)9356, (long)(0x43B3B28013852A33L ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.L = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)30986, (long)(0x1B3FEC0B5A68F7A1L ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.O = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)9814, (long)(0x6717755F1485A8EFL ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.Y = NumericPrecisionTransformer.D(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)18445, (long)(0x3BB554D86CF4690L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)19543, (long)(0x352D0C57570DC2C6L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)12285, (long)(0x57F88C1B6952A17DL ^ l)), (long)2243959471196004660L, (long)l)), 0.0, 0.0, 250.0, 1.0, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)2900, (long)(0x395AFF8EAA6085B1L ^ l)), (long)2243959471196004660L, (long)l)));
        this.l = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)16202, (long)(0x18BA085567ED31F7L ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.n = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)29949, (long)(0xE3495512299FA5CL ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.K = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)24771, (long)(0x48F62073D8FF6E5CL ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)20500, (long)(0x51F530198D015E9EL ^ l)), (long)2243959471196004660L, (long)l)), false);
        this.m = NumericPrecisionTransformer.D(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)9407, (long)(0x12EA278D82BAAA07L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)21111, (long)(0x14FE8940DFD75C91L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)4199, (long)(0x51B9F0E123211ECAL ^ l)), (long)2243959471196004660L, (long)l)), 0.0, 0.0, 250.0, 1.0, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)16335, (long)(0x2424489186BB317CL ^ l)), (long)2243959471196004660L, (long)l)));
        this.o = NumericPrecisionTransformer.N(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)6999, (long)(0x3612132E66C695F7L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)4611, (long)(0x276A39B2287A9C95L ^ l)), (long)2243959471196004660L, (long)l)), "", 0.1, 1.0, 1.5, 0.1);
        this.b = NumericPrecisionTransformer.t(this, (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)11816, (long)(0x109037AAE55720A7L ^ l)), (long)2243959471196004660L, (long)l)), (String)((Object)GraphicalResourceManager.c("\u00a5", (int)GraphicalResourceManager.a("n", (int)22346, (long)(0x7AAC42A41F2CD9E6L ^ l)), (long)2243959471196004660L, (long)l)), "", 0.0, 1.0, 1.0);
        this.Z = new ContextualDataBroker868(1);
        this.A = new Qv[]{Qv.x(), Qv.A(), Qv.o(), Qv.f(), Qv.j(), Qv.M(), Qv.w(), Qv.k(), Qv.r(), Qv.t(), Qv.S(), Qv.s(), Qv.i()};
        this.Ic = new ConcurrentHashMap();
        this.N.l(this.x, this.R, this.V, this.B, this.P, this.d);
        this.z.l(this.j, this.L, this.O, this.Y);
        this.l.l(this.n, this.K, this.r, this.m);
        this.d.l(this.h);
        this.N(this.w, this.F, this.o, this.Iz, this.N, this.x, this.R, this.V, this.B, this.P, this.d, this.h, this.z, this.j, this.L, this.O, this.Y, this.l, this.n, this.K, this.r, this.m);
    }

    /*
     * Could not resolve type clashes
     * Loose catch block
     */
    @DataExchangeProtocol2090
    public void d(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        float f;
        float f2;
        boolean bl = Ne.h.k(2884);
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchRegistry2111.getThePlayer();
        ConnectionConfigurationResolver connectionConfigurationResolver = eventDispatchRegistry2111.getWorld();
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        double d5 = systemConfigurationOrchestrator.b() + (systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.b()) * (double)eventDispatchRegistry2111.getTicks() - d2;
        double d6 = systemConfigurationOrchestrator.q() + (systemConfigurationOrchestrator.V() - systemConfigurationOrchestrator.q()) * (double)eventDispatchRegistry2111.getTicks() - d3;
        double d7 = systemConfigurationOrchestrator.I() + (systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.I()) * (double)eventDispatchRegistry2111.getTicks() - d4;
        ArrayList<DynamicMappingRegistry<Object, MultiProtocolContextManager>> arrayList = new ArrayList<DynamicMappingRegistry<Object, MultiProtocolContextManager>>();
        for (Object e : connectionConfigurationResolver.L()) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            if (!this.B(cryptographicTransformer, connectionConfigurationResolver, systemConfigurationOrchestrator)) continue;
            TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer);
            Object object = ConditionalExecutionManager.a(transactionOrchestrator1017, systemConfigurationOrchestrator);
            arrayList.add(DynamicMappingRegistry.U(transactionOrchestrator1017, object));
        }
        arrayList.sort(GraphicalResourceManager::lambda$onRenderWorldLast$0);
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        try {
            f2 = ResourceAllocationManager.b() ? ResourceAllocationManager.m() : eventDispatchRegistry2111.getRenderManager().k();
        }
        catch (Exception exception) {
            throw GraphicalResourceManager.a(exception);
        }
        float f3 = f2;
        try {
            f = ResourceAllocationManager.b() ? ResourceAllocationManager.H() : eventDispatchRegistry2111.getRenderManager().r();
        }
        catch (Exception exception) {
            throw GraphicalResourceManager.a(exception);
        }
        float f4 = f;
        ConfigurationManager.f = true;
        for (Object object : arrayList) {
            block23: {
                TransactionOrchestrator1017 transactionOrchestrator1017 = (TransactionOrchestrator1017)((DynamicMappingRegistry)object).r();
                MultiProtocolContextManager multiProtocolContextManager = (MultiProtocolContextManager)((DynamicMappingRegistry)object).p();
                double d8 = transactionOrchestrator1017.b();
                double d9 = transactionOrchestrator1017.q();
                double d10 = transactionOrchestrator1017.I();
                double d11 = d8 + (transactionOrchestrator1017.F() - d8) * (double)eventDispatchRegistry2111.getTicks() - d2;
                double d12 = d9 + (transactionOrchestrator1017.V() - d9) * (double)eventDispatchRegistry2111.getTicks() - d3;
                double d13 = d10 + (transactionOrchestrator1017.B() - d10) * (double)eventDispatchRegistry2111.getTicks() - d4;
                float f5 = (float)_Y.V(d11, d12, d13, d5, d6, d7);
                Ne.h.z();
                try {
                    block24: {
                        block22: {
                            if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
                                try {
                                    if (!this.N.s().booleanValue()) break block22;
                                    this.W(eventDispatchRegistry2111.getRenderManager(), eventDispatchRegistry2111.getEntityRenderer(), eventDispatchRegistry2111.getFontRenderer(), systemConfigurationOrchestrator, f3, f4, executionStateTracker, transactionOrchestrator1017, multiProtocolContextManager, d11, d12, d13, f5, this.x.s(), this.R.s(), this.P.s(), this.d.s(), this.V.s(), eventDispatchRegistry2111.getMatrixStack());
                                    break block23;
                                }
                                catch (Exception exception) {
                                    throw GraphicalResourceManager.a(exception);
                                }
                            }
                        }
                        if (!_Y.H((CryptographicTransformer)transactionOrchestrator1017)) break block24;
                        try {
                            block25: {
                                if (!this.z.s().booleanValue()) break block24;
                                break block25;
                                catch (Exception exception) {
                                    throw GraphicalResourceManager.a(exception);
                                }
                            }
                            this.W(eventDispatchRegistry2111.getRenderManager(), eventDispatchRegistry2111.getEntityRenderer(), eventDispatchRegistry2111.getFontRenderer(), systemConfigurationOrchestrator, f3, f4, executionStateTracker, transactionOrchestrator1017, multiProtocolContextManager, d11, d12, d13, f5, this.j.s(), this.L.s(), false, false, this.O.s(), eventDispatchRegistry2111.getMatrixStack());
                            break block23;
                        }
                        catch (Exception exception) {
                            throw GraphicalResourceManager.a(exception);
                        }
                    }
                    if (!_Y.k(transactionOrchestrator1017)) break block23;
                    try {
                        block26: {
                            if (!this.l.s().booleanValue()) break block23;
                            break block26;
                            catch (Exception exception) {
                                throw GraphicalResourceManager.a(exception);
                            }
                        }
                        this.W(eventDispatchRegistry2111.getRenderManager(), eventDispatchRegistry2111.getEntityRenderer(), eventDispatchRegistry2111.getFontRenderer(), systemConfigurationOrchestrator, f3, f4, executionStateTracker, transactionOrchestrator1017, multiProtocolContextManager, d11, d12, d13, f5, this.n.s(), this.K.s(), false, false, this.r.s(), eventDispatchRegistry2111.getMatrixStack());
                    }
                    catch (Exception exception) {
                        throw GraphicalResourceManager.a(exception);
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            Ne.h.X();
        }
        try {
            if (bl) {
                tl.V();
            }
        }
        catch (Exception exception) {
            throw GraphicalResourceManager.a(exception);
        }
        ConfigurationManager.f = false;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 51;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 37;
                break;
            }
            case 3: {
                n3 = 40;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 8;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 53;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 63;
                break;
            }
            case 15: {
                n3 = 31;
                break;
            }
            case 16: {
                n3 = 46;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 5;
                break;
            }
            case 19: {
                n3 = 3;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 58;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 45;
                break;
            }
            case 24: {
                n3 = 39;
                break;
            }
            case 25: {
                n3 = 38;
                break;
            }
            case 26: {
                n3 = 16;
                break;
            }
            case 27: {
                n3 = 7;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 6;
                break;
            }
            case 30: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 24;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 13;
                break;
            }
            case 38: {
                n3 = 12;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 48;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 34;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 59;
                break;
            }
            case 49: {
                n3 = 60;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 50;
                break;
            }
            case 52: {
                n3 = 55;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 0;
                break;
            }
            case 55: {
                n3 = 62;
                break;
            }
            case 56: {
                n3 = 35;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 22;
                break;
            }
            default: {
                n3 = 54;
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
        GraphicalResourceManager.lb[n4] = new String(cArray);
        return n4;
    }

    private int G(TransactionOrchestrator1017 transactionOrchestrator1017, MultiProtocolContextManager multiProtocolContextManager, ColorCompositionEngine colorCompositionEngine, ColorCompositionEngine colorCompositionEngine2, double d2) {
        long l = bb ^ 0x733CA9D4543BL;
        Object object = GraphicalResourceManager.a("n", (int)14264, (long)(0x7D8D6161B21BF1A6L ^ l));
        if (TemporalMetadataResolver.h.j().b.s().booleanValue()) {
            boolean bl;
            block7: {
                bl = multiProtocolContextManager.Y();
                try {
                    if (!multiProtocolContextManager.T() && !bl) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager.a(customSystemException);
                }
                object = GraphicalResourceManager.a("n", (int)21514, (long)(0x68EDAAD831289216L ^ l));
                colorCompositionEngine2.G(36);
                colorCompositionEngine2.o(255);
                colorCompositionEngine2.D(255);
                colorCompositionEngine2.I((int)(64.0 * d2));
            }
            if (multiProtocolContextManager.E()) {
                object = GraphicalResourceManager.a("n", (int)20218, (long)(0x27342EA702BB08A2L ^ l));
                colorCompositionEngine2.G(255);
                colorCompositionEngine2.o(29);
                colorCompositionEngine2.D(29);
                colorCompositionEngine2.I((int)(128.0 * d2));
            }
            if (bl) {
                object = TemporalMetadataResolver.h.j().u.G();
                colorCompositionEngine2.S(TemporalMetadataResolver.h.j().u.L());
            }
        }
        if (TemporalMetadataResolver.h.U().K(MessageQueueProcessor.class).H(transactionOrchestrator1017)) {
            object = GraphicalResourceManager.a("n", (int)31112, (long)(0x6C13EF48937EBFABL ^ l));
        }
        if (multiProtocolContextManager.H()) {
            object = GraphicalResourceManager.a("n", (int)4709, (long)(0x5D34C0C9D3ED545EL ^ l));
        }
        return (int)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicalResourceManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090
    public void O(KB kB) {
        this.Ic.clear();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicalResourceManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(GraphicalResourceManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

