/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.transaction.logging;

import a.bE;
import a.fH;
import a.fu;
import com.app.rendering.graphics.VisualizationRenderer;
import com.app.streaming.StreamProcessingEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataEncodingTransformer;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.network.connection.ConnectionPoolOrchestrator;
import com.network.connection.NetworkConnectionEstablisher;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.metadata.ReflectionMetadataResolver1754;
import com.reflection.utils.ReflectionProxyHandler;
import com.resource.lifecycle.ResourceLifecycleOrchestrator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicKeyManager426;
import com.security.cryptography.CryptographicContextManager153;
import com.security.cryptography.EncryptionKeyGenerator;
import com.security.session.CryptographicSessionManager299;
import com.system.interceptor.InterceptorConfigurationManager;
import com.system.orchestration.SystemOrchestrationManager;
import com.system.resource.ComputationalResourceAllocator;
import com.system.resources.ResourceAllocationManager2603;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TransactionLogOrchestrator
extends fu {
    private Object j8;
    private static final String[] xb;
    private static final Map tb;
    private static final long[] rb;
    private static final long ab;
    private long jv;
    private static final Integer[] sb;
    private long jZ;
    private static final Object[] wb;
    private final ComputationalResourceAllocator jO;
    private final List<AbstractComputationKernel> jU;

    private static void db() {
        Object[] objectArray = wb;
        wb[0] = "4\u0003C5";
        objectArray[1] = " h1\u001e6C+g QK[8`)\u0018";
        objectArray[2] = Long.TYPE;
        TransactionLogOrchestrator.xb[2] = "java/lang/Long";
        objectArray[3] = "s\u001c\u000e";
        objectArray[4] = Integer.TYPE;
        TransactionLogOrchestrator.xb[4] = "java/lang/Integer";
        objectArray[5] = "XT/>";
        objectArray[6] = Boolean.TYPE;
        TransactionLogOrchestrator.xb[6] = "java/lang/Boolean";
        objectArray[7] = "BSI\u0012MCI\\X],MBW\\\u0007";
        objectArray[8] = "1\u000b]V-%a\u0016G\rM.ps\u0000\u000e={7\u001a^[3y\u000bJ\u0001L.?gNTP7E";
        objectArray[9] = "f\u0013bfV\tfRnd51]Wb7H[;Rn#\u000bc";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "eI(%\u0019QbA\u007f^J8`\u0016h=YTdCt$#\u0001?Sb,]S>\u0016v^";
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == 'I' || c == 'e' || c == 'q') {
                field = TransactionLogOrchestrator.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionLogOrchestrator.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'n' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void w(AbstractComputationKernel abstractComputationKernel) {
        this.n(abstractComputationKernel, new Object[0]);
        this.jU.add(abstractComputationKernel);
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransactionLogOrchestrator.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = TransactionLogOrchestrator.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionLogOrchestrator.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public String A() {
        long l = ab ^ 0x4726EC372CE5L;
        return TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)30436, (long)(0x362D403A2E6D1BA2L ^ l)), (long)4869285904394091542L, (long)l);
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionLogOrchestrator.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionLogOrchestrator.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public TransactionLogOrchestrator() {
        long l = ab ^ 0x551690D7FCF1L;
        super(RecursiveNodeGraph.p);
        this.jU = new ArrayList<AbstractComputationKernel>();
        this.Q(TransactionLogOrchestrator.M.a);
        this.b(32.0);
        this.M(32.0);
        this.d().m(false);
        this.d().f((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)27011, (long)(0x5267D24148E9D4D0L ^ l)), (long)-7816208761007559678L, (long)l)));
        this.jO = new ComputationalResourceAllocator(this);
        this.a(this.jO);
        this.y();
        this.B(false, true);
    }

    private static Field s(long l, long l2) {
        int n = TransactionLogOrchestrator.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = xb[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionLogOrchestrator.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionLogOrchestrator.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionLogOrchestrator.i(clazz3, string2, clazz2)) != null) {
                    TransactionLogOrchestrator.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionLogOrchestrator.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionLogOrchestrator.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionLogOrchestrator.r(534348067683654L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionLogOrchestrator.q(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionLogOrchestrator.wb[n] = clazz = Class.forName(xb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void v() {
        block7: {
            block5: {
                long l;
                block6: {
                    l = ab ^ 0x153D7448228BL;
                    try {
                        try {
                            if (!this.jU.isEmpty()) break block5;
                            this.w(new VisualizationRenderer(TransactionLogOrchestrator.M.g));
                            this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)26038, (long)(0x163FCB1BA0068692L ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)1537, (long)(0x5EB373B0A3D4E52DL ^ l)), (long)5619788238845047416L, (long)l))));
                            this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)1310, (long)(0xFD756534E4CE638L ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)7053, (long)(0x6E7FEA29E2FF78AFL ^ l)), (long)5619788238845047416L, (long)l))));
                            this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)22164, (long)(0x15828EC52CD3B5BEL ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)9408, (long)(0x1A66B31A8685C7EDL ^ l)), (long)5619788238845047416L, (long)l))));
                            this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)9801, (long)(0x7602687F2AC74568L ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)13048, (long)(0x40A12AB7E4FCD1C5L ^ l)), (long)5619788238845047416L, (long)l))));
                            this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)5384, (long)(0x2113BFDDEF82F623L ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)23551, (long)(0x7C138FB6D603B8DAL ^ l)), (long)5619788238845047416L, (long)l))).R(-1));
                            this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)583, (long)(0x6E58950F8AF2E17BL ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)31859, (long)(0x74F8537A327A1F50L ^ l)), (long)5619788238845047416L, (long)l))));
                            if (TransactionLogOrchestrator.j("n", (Object)TemporalMetadataResolver.h, (long)5619662636288518916L, (long)l) == false) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionLogOrchestrator.a(customSystemException);
                        }
                        this.w(new ResourceAllocationManager2603((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)2959, (long)(0x7016D211148DE8AFL ^ l)), (long)5619788238845047416L, (long)l)), (String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)21127, (long)(0x172FA6484E9131B8L ^ l)), (long)5619788238845047416L, (long)l))).R(1));
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionLogOrchestrator.a(customSystemException);
                    }
                }
                this.w(new bE(1.0, 2.0));
                this.w(new CryptographicContextManager153((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)22600, (long)(0x221C003E5224BB67L ^ l)), (long)5619788238845047416L, (long)l)), 0.625));
                this.w(new bE(1.0, 2.0));
                this.w(new VisualizationRenderer(TransactionLogOrchestrator.M.g));
                this.w(new CryptographicSessionManager299((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)22412, (long)(0x29C83B2D2CFB4A2L ^ l)), (long)5619788238845047416L, (long)l)), null, ReflectionProxyHandler.class).N(new ReflectionMetadataResolver1754(this, ReflectionProxyHandler.class)));
                this.w(new InterceptorConfigurationManager().N(new ReflectionMetadataResolver1754(this, DataEncodingTransformer.class)));
                this.w(new CryptographicSessionManager299((String)((Object)TransactionLogOrchestrator.j("N", (int)TransactionLogOrchestrator.e("q", (int)1268, (long)(0x11A60AFBC3267D3L ^ l)), (long)5619788238845047416L, (long)l)), null, fH.class).N(new ReflectionMetadataResolver1754(this, fH.class)));
                this.w(new VisualizationRenderer(TransactionLogOrchestrator.M.g));
                this.w(new ConnectionPoolOrchestrator());
                break block7;
            }
            for (AbstractComputationKernel abstractComputationKernel : this.jU) {
                this.n(abstractComputationKernel, new Object[0]);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void d() {
        block68: {
            var1_1 = TransactionLogOrchestrator.ab ^ 136472699522913L;
            var3_2 = StreamProcessingEngine.X();
            try {
                block69: {
                    block66: {
                        block83: {
                            block67: {
                                block81: {
                                    block65: {
                                        block79: {
                                            block78: {
                                                block58: {
                                                    block60: {
                                                        block75: {
                                                            block64: {
                                                                block63: {
                                                                    block61: {
                                                                        block62: {
                                                                            block56: {
                                                                                block57: {
                                                                                    block70: {
                                                                                        var4_3 = GraphicalRenderingController.D(EncryptionKeyGenerator.class);
                                                                                        var5_5 = GraphicalRenderingController.D(CryptographicKeyManager426.class);
                                                                                        v0 = this.j8;
                                                                                        if (var3_2 == null) break block56;
                                                                                        if (v0 != null) break block57;
                                                                                        break block70;
                                                                                        catch (Throwable v1) {
                                                                                            throw TransactionLogOrchestrator.a(v1);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block71: {
                                                                                            v0 = this;
                                                                                            if (var3_2 == null) break block56;
                                                                                            break block71;
                                                                                            catch (Throwable v2) {
                                                                                                throw TransactionLogOrchestrator.a(v2);
                                                                                            }
                                                                                        }
                                                                                        if (v0.jZ != 0L) break block57;
                                                                                    }
                                                                                    catch (Throwable v3) {
                                                                                        throw TransactionLogOrchestrator.a(v3);
                                                                                    }
                                                                                    var6_6 = (Class)ReflectionMetadataResolver.E()[0];
                                                                                    try {
                                                                                        var7_8 = var6_6.getMethods();
                                                                                        var8_10 = var7_8.length;
                                                                                        var9_12 = 0;
                                                                                        while (var9_12 < var8_10) {
                                                                                            block72: {
                                                                                                block59: {
                                                                                                    block73: {
                                                                                                        var10_13 = var7_8[var9_12];
                                                                                                        var11_15 = var10_13.getName();
                                                                                                        var12_16 = TransactionLogOrchestrator.j("N", var11_15, (long)-6910900082216253884L, (long)var1_1);
                                                                                                        if (var3_2 == null) break block72;
                                                                                                        cfr_temp_0 = var12_16 - 3448060219L;
                                                                                                        v4 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                                                        if (var3_2 == null) break block58;
                                                                                                        break block73;
                                                                                                        catch (Throwable v5) {
                                                                                                            throw TransactionLogOrchestrator.a(v5);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        block74: {
                                                                                                            if (v4 /* !! */ ) break block59;
                                                                                                            break block74;
                                                                                                            catch (Throwable v6) {
                                                                                                                throw TransactionLogOrchestrator.a(v6);
                                                                                                            }
                                                                                                        }
                                                                                                        this.j8 = MethodHandles.lookup().unreflect(var10_13);
                                                                                                        this.jZ = this.jv = ((MethodHandle)this.j8).invoke();
                                                                                                    }
                                                                                                    catch (Throwable v7) {
                                                                                                        throw TransactionLogOrchestrator.a(v7);
                                                                                                    }
                                                                                                }
                                                                                                ++var9_12;
                                                                                            }
                                                                                            if (var3_2 != null) continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    catch (Throwable var7_9) {
                                                                                        this.jZ = 1L;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v8 /* !! */  = this;
                                                                                    if (var3_2 == null) break block60;
                                                                                    v0 = v8 /* !! */ .j8;
                                                                                }
                                                                                catch (Throwable v9) {
                                                                                    throw TransactionLogOrchestrator.a(v9);
                                                                                }
                                                                            }
                                                                            if (v0 == null) break block75;
                                                                            var6_7 = ((MethodHandle)this.j8).invoke();
                                                                            var8_11 = var6_7 - this.jZ;
                                                                            var10_14 = var6_7 - this.jv;
                                                                            cfr_temp_1 = var10_14 - 117030L;
                                                                            v10 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                            if (var3_2 == null) break block61;
                                                                            try {
                                                                                block76: {
                                                                                    if (v10 < 0) break block62;
                                                                                    break block76;
                                                                                    catch (Throwable v11) {
                                                                                        throw TransactionLogOrchestrator.a(v11);
                                                                                    }
                                                                                }
                                                                                this.j8 = null;
                                                                            }
                                                                            catch (Throwable v12) {
                                                                                throw TransactionLogOrchestrator.a(v12);
                                                                            }
                                                                        }
                                                                        v10 = (cfr_temp_2 = var8_11 - 1117030L) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                                    }
                                                                    if (var3_2 == null) break block63;
                                                                    try {
                                                                        block77: {
                                                                            if (v10 <= 0) break block64;
                                                                            break block77;
                                                                            catch (Throwable v13) {
                                                                                throw TransactionLogOrchestrator.a(v13);
                                                                            }
                                                                        }
                                                                        cfr_temp_3 = var6_7 - 1795321218903L;
                                                                        v10 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                                                    }
                                                                    catch (Throwable v14) {
                                                                        throw TransactionLogOrchestrator.a(v14);
                                                                    }
                                                                }
                                                                if (v10 > 0) {
                                                                    var12_17 = null;
                                                                    var13_18 = GraphicalRenderingController.K.S().Y().iterator();
                                                                    while (var13_18.hasNext()) {
                                                                        var12_17 = var14_19 = var13_18.next();
                                                                        try {
                                                                            if (var3_2 != null) {
                                                                                if (var3_2 != null) continue;
                                                                                break;
                                                                            }
                                                                            break block64;
                                                                        }
                                                                        catch (Throwable v15) {
                                                                            throw TransactionLogOrchestrator.a(v15);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (var12_17 != null) {
                                                                            GraphicalRenderingController.K.S().d(var12_17);
                                                                        }
                                                                    }
                                                                    catch (Throwable v16) {
                                                                        throw TransactionLogOrchestrator.a(v16);
                                                                    }
                                                                }
                                                            }
                                                            this.jv = var6_7;
                                                        }
                                                        v8 /* !! */  = var4_3;
                                                    }
                                                    v4 /* !! */  = v8 /* !! */ .f();
                                                }
                                                if (var3_2 == null) break block65;
                                                if (v4 /* !! */ ) ** GOTO lbl153
                                                break block78;
                                                catch (Throwable v17) {
                                                    throw TransactionLogOrchestrator.a(v17);
                                                }
                                            }
                                            v18 = var5_5.f();
                                            if (var3_2 == null) break block66;
                                            break block79;
                                            catch (Throwable v19) {
                                                throw TransactionLogOrchestrator.a(v19);
                                            }
                                        }
                                        try {
                                            block80: {
                                                if (!v18) ** GOTO lbl188
                                                break block80;
                                                catch (Throwable v20) {
                                                    throw TransactionLogOrchestrator.a(v20);
                                                }
                                            }
                                            this.r(false, false);
                                            v4 /* !! */  = var4_3.f();
                                        }
                                        catch (Throwable v21) {
                                            throw TransactionLogOrchestrator.a(v21);
                                        }
                                    }
                                    if (var3_2 == null) break block67;
                                    if (!v4 /* !! */ ) ** GOTO lbl174
                                    break block81;
                                    catch (Throwable v22) {
                                        throw TransactionLogOrchestrator.a(v22);
                                    }
                                }
                                try {
                                    block82: {
                                        this.m(var4_3.G(), var4_3.W());
                                        if (var3_2 != null) break block68;
                                        break block82;
                                        catch (Throwable v23) {
                                            throw TransactionLogOrchestrator.a(v23);
                                        }
                                    }
                                    v4 /* !! */  = var5_5.f();
                                }
                                catch (Throwable v24) {
                                    throw TransactionLogOrchestrator.a(v24);
                                }
                            }
                            if (!v4 /* !! */ ) break block68;
                            this.m(var5_5.G(), var5_5.W());
                            if (var3_2 != null) break block68;
                            break block83;
                            catch (Throwable v25) {
                                throw TransactionLogOrchestrator.a(v25);
                            }
                        }
                        try {
                            block84: {
                                v26 = this;
                                if (var3_2 == null) break block69;
                                break block84;
                                catch (Throwable v27) {
                                    throw TransactionLogOrchestrator.a(v27);
                                }
                            }
                            v18 = v26.f();
                        }
                        catch (Throwable v28) {
                            throw TransactionLogOrchestrator.a(v28);
                        }
                    }
                    if (v18) break block68;
                    v26 = this;
                }
                v26.r(true, false);
            }
            catch (Throwable var4_4) {
                // empty catch block
            }
        }
    }

    public void y() {
        block7: {
            block6: {
                try {
                    this.k();
                    if (!((NetworkConnectionEstablisher)GraphicalRenderingController.K.Z.J()).equals(GraphicalRenderingController.K.n) || this.jO.h().a().length() <= 0) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionLogOrchestrator.a(customSystemException);
                }
                for (ContextualExecutionFramework contextualExecutionFramework : TemporalMetadataResolver.h.U().q()) {
                    try {
                        if (contextualExecutionFramework.t().equals(RecursiveNodeGraph.p)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionLogOrchestrator.a(customSystemException);
                    }
                    String string = contextualExecutionFramework.O().toLowerCase();
                    if (!string.contains(this.jO.h().a().toLowerCase())) continue;
                    SystemOrchestrationManager systemOrchestrationManager = new SystemOrchestrationManager(this, contextualExecutionFramework);
                    this.n(systemOrchestrationManager, new Object[0]);
                    systemOrchestrationManager.C();
                }
                break block7;
            }
            this.v();
        }
    }

    @Override
    public void i() {
    }

    @Override
    public void u() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransactionLogOrchestrator.ab = MultiContainerRegistry.a(-4965177827191525055L, 740063133864381870L, MethodHandles.lookup().lookupClass()).a(70475743337868L);
                TransactionLogOrchestrator.wb = new Object[11];
                TransactionLogOrchestrator.xb = new String[11];
                TransactionLogOrchestrator.db();
                TransactionLogOrchestrator.tb = new HashMap<K, V>(13);
                var0 = TransactionLogOrchestrator.ab ^ 37904700896233L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "\u00e9\u00e0\u00d9 M\u00f3DM\u00862\u0010\u00db\u0017\u0088\u0092\u00ed<\u00caI\u00e5\u0019\u00a5E\u009e\u00d7Pt\u0014$\t\u00df\u00ad4t?\u0081\u00ae\u0007\u0003\u00d7{\u00a4%t8\u00af\u0094\u00abtd+\u0015\u0084\u00d64J\u0092\u0086\u00c6\u0093\u00e72%\u00fb\u00bcwQ\u00bd\u0080 \u00b7\u0012\u00eap:*\u008a`y\u00f4+W\u00bc\u001bD\u00a8\u00b8\u008f\\_N\u008du9\u00c9\u00c3\u009d\u0006\u0092J58\u00bf\u00e6K\u00e5\u001ep\u00df\u00e5\u00ff\u0090\u00c7k*\u00e4\u00d0`0H\u00c79\u009a\u00e1\u000e\u000bw\u00f7\u00a1\u0098\u00bcg\u00e5';\u00b1";
                var7_6 = "\u00e9\u00e0\u00d9 M\u00f3DM\u00862\u0010\u00db\u0017\u0088\u0092\u00ed<\u00caI\u00e5\u0019\u00a5E\u009e\u00d7Pt\u0014$\t\u00df\u00ad4t?\u0081\u00ae\u0007\u0003\u00d7{\u00a4%t8\u00af\u0094\u00abtd+\u0015\u0084\u00d64J\u0092\u0086\u00c6\u0093\u00e72%\u00fb\u00bcwQ\u00bd\u0080 \u00b7\u0012\u00eap:*\u008a`y\u00f4+W\u00bc\u001bD\u00a8\u00b8\u008f\\_N\u008du9\u00c9\u00c3\u009d\u0006\u0092J58\u00bf\u00e6K\u00e5\u001ep\u00df\u00e5\u00ff\u0090\u00c7k*\u00e4\u00d0`0H\u00c79\u009a\u00e1\u000e\u000bw\u00f7\u00a1\u0098\u00bcg\u00e5';\u00b1".length();
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
                    var6_5 = "\u001ca\u00be\u00f9\u008dTx\u0011\u00f9\u000f9\u00f0\u001aAvo";
                    var7_6 = "\u001ca\u00be\u00f9\u008dTx\u0011\u00f9\u000f9\u00f0\u001aAvo".length();
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
        TransactionLogOrchestrator.rb = var8_3;
        TransactionLogOrchestrator.sb = new Integer[19];
    }

    public static long a(String string) {
        long l;
        block8: {
            byte[] byArray;
            long l2 = ab ^ 0x3C435B221CDFL;
            long l3 = 3988292384L;
            String[] stringArray = StreamProcessingEngine.X();
            long l4 = 0xFFFFFFFFL;
            byte[] byArray2 = byArray = string.getBytes();
            int n = byArray2.length;
            int n2 = 0;
            block4: while (true) {
                int n3 = n2;
                block5: while (n3 < n) {
                    byte by = byArray2[n2];
                    l = l4 ^ (long)by & 0xFFL;
                    if (stringArray == null) break block8;
                    l4 = l;
                    for (int i = 0; i < 8; ++i) {
                        long l5;
                        block9: {
                            try {
                                l5 = l4 & 1L;
                                if (stringArray == null) break block9;
                                long l6 = l5 - 1L;
                                n3 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                                if (stringArray == null) continue block5;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionLogOrchestrator.a(customSystemException);
                            }
                            if (n3 == 0) {
                                l4 = l4 >>> 1 ^ l3;
                                try {
                                    if (stringArray != null) continue;
                                    AbstractComputationKernel.I(new String[1]);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransactionLogOrchestrator.a(customSystemException);
                                }
                            }
                            l5 = l4 >>> 1;
                        }
                        l4 = l5;
                        if (stringArray != null) continue;
                    }
                    ++n2;
                    if (stringArray != null) continue block4;
                }
                break;
            }
            l = l4 ^ 0xFFFFFFFFL;
        }
        return l;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2ED2;
        if (sb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = rb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransactionLogOrchestrator.sb[n2] = n3;
        }
        return sb[n2];
    }

    private void lambda$resetSearch$0() {
        this.jO.h().y("");
        this.y();
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionLogOrchestrator.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void N() {
        try {
            if (GraphicalRenderingController.D(ResourceLifecycleOrchestrator.class).f()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionLogOrchestrator.a(customSystemException);
        }
        super.N();
    }

    @Override
    public void y(JsonObject jsonObject) {
        super.y(jsonObject);
        this.y();
        GraphicalRenderingController.j();
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        ResourceLifecycleOrchestrator resourceLifecycleOrchestrator;
        block7: {
            resourceLifecycleOrchestrator = GraphicalRenderingController.D(ResourceLifecycleOrchestrator.class);
            try {
                try {
                    if (resourceLifecycleOrchestrator.D() != 3 && resourceLifecycleOrchestrator.D() != 4) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionLogOrchestrator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionLogOrchestrator.a(customSystemException);
            }
        }
        try {
            if (resourceLifecycleOrchestrator.f()) {
                resourceLifecycleOrchestrator.w(3);
                resourceLifecycleOrchestrator.R();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionLogOrchestrator.a(customSystemException);
        }
        super.S(userInteractionEventDispatcher);
    }

    public ComputationalResourceAllocator o() {
        return this.jO;
    }

    private static Method t(long l, long l2) {
        int n = TransactionLogOrchestrator.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n];
                int n3 = string2.indexOf(8);
                clazz3 = TransactionLogOrchestrator.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionLogOrchestrator.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionLogOrchestrator.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionLogOrchestrator.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionLogOrchestrator.r(534348067683654L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionLogOrchestrator.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionLogOrchestrator.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionLogOrchestrator.r(534348067683654L, 0L);
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

    public void Y() {
        GraphicalRenderingController.st.execute(this::lambda$resetSearch$0);
    }

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (xb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 52;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 37;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 43;
                break;
            }
            case 6: {
                n3 = 58;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 27;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 61;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 42;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 14;
                break;
            }
            case 18: {
                n3 = 21;
                break;
            }
            case 19: {
                n3 = 60;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 59;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 51;
                break;
            }
            case 26: {
                n3 = 16;
                break;
            }
            case 27: {
                n3 = 10;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 28;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 53;
                break;
            }
            case 38: {
                n3 = 4;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 62;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 44;
                break;
            }
            case 44: {
                n3 = 31;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 30;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 26;
                break;
            }
            case 52: {
                n3 = 6;
                break;
            }
            case 53: {
                n3 = 40;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 23;
                break;
            }
            case 58: {
                n3 = 25;
                break;
            }
            case 59: {
                n3 = 22;
                break;
            }
            case 60: {
                n3 = 7;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 5;
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
        TransactionLogOrchestrator.xb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionLogOrchestrator.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(TransactionLogOrchestrator.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

