/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.math.computation;

import a.KB;
import a.tl;
import com.app.config.management.ConfigurationRegistry;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.scenarios.ScenarioTemplateManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.streaming.DataStreamOrchestrator686;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionValidationEngine;
import com.math.computation.NumericComputationEngine1131;
import com.math.transformation.NumericTransformationEngine1068;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.query.builder.AdvancedQueryBuilder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthorizationManager;
import com.security.cipher.CryptographicTransformation;
import com.security.encryption.DataEncryptionHandler2660;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.simulation.world.WorldStateTransitioner;
import com.strategy.selection.StrategySelectionController;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.timing.tracking.TimestampTracker;
import com.transaction.management.TransactionOrchestrator1017;
import com.util.numeric.NumericFormattingUtility;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.IntConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NumericComputationEngine
extends ContextTransformationEngine<DataStreamOrchestrator686> {
    private double x;
    private int l;
    private double e;
    private static final long v;
    private final Map<ConnectionLifecycleHandler, NumericTransformationEngine1068> P;
    private final AdaptiveRenderingEngine A;
    private NumericTransformationEngine1068 t;
    private static final Map Z;
    private DataEncryptionHandler2660 z;
    private double B;
    private double T;
    private TransactionOrchestrator1017 N;
    private final ObjectLifecycleMediator d;
    private double h;
    private boolean n;
    private final Map<Integer, TimestampTracker> R;
    private long G;
    private static final String[] fb;
    private static final Integer[] V;
    public final NumericFormattingUtility o;
    private final Map<ConnectionLifecycleHandler, Long> m;
    private double K;
    private static final long[] L;
    private double r;
    private double j;
    private double Y;
    private final AuthenticationStateTracker O;
    private static final Object[] bb;

    @Override
    public void n() {
        ObjectLifecycleMediator.R(this::lambda$reset$3);
    }

    public void i() {
        NumericComputationEngine numericComputationEngine;
        block11: {
            boolean bl;
            long l;
            block9: {
                String string;
                block10: {
                    l = v ^ 0x2AB343A08F19L;
                    string = ScenarioTemplateManager.f();
                    try {
                        try {
                            bl = this.a();
                            if (string == null) break block9;
                            if (!bl) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine.a(customSystemException);
                        }
                        NumericComputationEngine.c("\u00f1", (Object)this, (long)6781094869205621561L, (long)l);
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                }
                try {
                    NumericComputationEngine.c("\u00f1", (Object)this, (long)6781620851908633932L, (long)l);
                    NumericComputationEngine.c("\u00f1", (Object)this, (long)6781171571791732194L, (long)l);
                    numericComputationEngine = this;
                    if (string == null) break block11;
                    bl = numericComputationEngine.U();
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
            }
            try {
                if (bl) {
                    NumericComputationEngine.c("\u00f1", (Object)this, (long)6781094869205621561L, (long)l);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationEngine.a(customSystemException);
            }
            numericComputationEngine = this;
        }
        numericComputationEngine.Y();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void u(WorldStateTransitioner worldStateTransitioner) {
        long l = v ^ 0x15770F05060DL;
        NumericComputationEngine.c("V", (Object)this, (long)-2950098618149811906L, (long)l);
    }

    private void lambda$onReceivePacket$2(int n) {
        block4: {
            long l = v ^ 0x642154410507L;
            try {
                try {
                    this.R.remove(n);
                    if (this.N == null || this.N.X() != n) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                this.N = null;
                NumericComputationEngine.c("\u00f1", (Object)this, (long)-3169118752589999833L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationEngine.a(customSystemException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void p() {
        block22: {
            var1_1 = NumericComputationEngine.v ^ 42654361856176L;
            var3_2 = ScenarioTemplateManager.f();
            try {
                if (this.t == null) {
                    return;
                }
            }
            catch (CustomSystemException v0) {
                throw NumericComputationEngine.a(v0);
            }
            var4_3 = 0;
            var5_4 = 1.7976931348623157E308;
            var7_5 = false;
            var8_6 = 0;
            for (Map.Entry<ConnectionLifecycleHandler, Long> var10_8 : this.m.entrySet()) {
                block26: {
                    block28: {
                        block27: {
                            block25: {
                                block24: {
                                    block23: {
                                        var11_9 = this.P.get(var10_8.getKey());
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 == null) break block22;
                                                    v1 = var11_9;
                                                    if (var3_2 == null) break block23;
                                                }
                                                catch (CustomSystemException v2) {
                                                    throw NumericComputationEngine.a(v2);
                                                }
                                                if (v1 != null) {
                                                }
                                                ** GOTO lbl51
                                            }
                                            catch (CustomSystemException v3) {
                                                throw NumericComputationEngine.a(v3);
                                            }
                                            v1 = NumericComputationEngine.c("\u00f1", (Object)this, (long)-453787912190585396L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v4) {
                                            throw NumericComputationEngine.a(v4);
                                        }
                                    }
                                    var12_10 = NumericTransformationEngine1068.d((NumericTransformationEngine1068)v1, var11_9);
                                    try {
                                        v5 = var12_10 == var5_4 ? 0 : (var12_10 < var5_4 ? -1 : 1);
                                        if (var3_2 == null) break block24;
                                        if (v5 >= 0) break block25;
                                    }
                                    catch (CustomSystemException v6) {
                                        throw NumericComputationEngine.a(v6);
                                    }
                                    var5_4 = var12_10;
                                    var4_3 = var8_6;
                                    v5 = (double)true;
                                }
                                var7_5 = v5;
                            }
                            try {
                                try {
                                    if (var3_2 != null) break block26;
lbl51:
                                    // 2 sources

                                    v7 = this.y(var10_8.getKey());
                                    if (var3_2 == null) break block27;
                                }
                                catch (CustomSystemException v8) {
                                    throw NumericComputationEngine.a(v8);
                                }
                                if (!v7) break block26;
                            }
                            catch (CustomSystemException v9) {
                                throw NumericComputationEngine.a(v9);
                            }
                            v7 = var7_5;
                        }
                        try {
                            if (var3_2 == null) break block28;
                            if (!v7) break block26;
                        }
                        catch (CustomSystemException v10) {
                            throw NumericComputationEngine.a(v10);
                        }
                        var4_3 = var8_6;
                        v7 = false;
                    }
                    var7_5 = v7;
                }
                ++var8_6;
                if (var3_2 != null) continue;
            }
            try {
                if (var5_4 < NumericTransformationEngine1068.d((NumericTransformationEngine1068)NumericComputationEngine.c("\u00f1", (Object)this, (long)-453787912190585396L, (long)var1_1), this.t)) {
                    NumericComputationEngine.c("\u00f1", (Object)this, (int)var4_3, (long)-454082260448210224L, (long)var1_1);
                }
            }
            catch (CustomSystemException v11) {
                throw NumericComputationEngine.a(v11);
            }
        }
    }

    private void S(ConnectionLifecycleHandler connectionLifecycleHandler) {
        block4: {
            Object object;
            long l;
            block5: {
                long l2 = v ^ 0x2E00CD9B239FL;
                long l3 = (long)this.o.l();
                l = System.currentTimeMillis() + l3;
                String string = ScenarioTemplateManager.f();
                try {
                    object = this.m;
                    if (string == null) break block4;
                    if (object.isEmpty()) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                long l4 = (Long)((Map.Entry)this.m.entrySet().toArray()[this.m.size() - 1]).getValue();
                try {
                    if (string == null) break block4;
                    if (l >= l4) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                l = l4 + 1L;
            }
            object = this.m.put(connectionLifecycleHandler, l);
        }
    }

    private static void d() {
        Object[] objectArray = bb;
        bb[0] = "}Z\u001b%";
        objectArray[1] = Void.TYPE;
        NumericComputationEngine.fb[1] = "java/lang/Void";
        objectArray[2] = "|RS\u0001";
        objectArray[3] = "#TR%";
        objectArray[4] = "kt$Q";
        objectArray[5] = Boolean.TYPE;
        NumericComputationEngine.fb[5] = "java/lang/Boolean";
        objectArray[6] = "\b#F\u001c";
        objectArray[7] = Integer.TYPE;
        NumericComputationEngine.fb[7] = "java/lang/Integer";
        objectArray[8] = "X8]";
        objectArray[9] = "Xn\u000ej-,Sa\u001f%P4@f\u0016l";
        objectArray[10] = "d\u007f1\tL9op F-7d{$\u001c";
        objectArray[11] = "\u0012g\u0019e\\=\u00041\u001f\u001bZ_G5G#\u00054\u0010fN+:";
        objectArray[12] = "J$lACI\\rj?C+_w2V@D\u0012vl?";
        objectArray[13] = "^S8\u0010\u000b\u0016H\u0005>n?tK\u0000f\u0007\b\u001b\u0006\u00018n";
        objectArray[14] = "}Cbu\u0019\u0000k\u0015d\u000b\u0007bh\u0010<b\u001a\r%\u0011b\u000b";
        objectArray[15] = "\u0005\u001aT\u0015V)\u0013LRkyKQKR\u0019[\"\u0011MUQ07R\u0014\u0000\u000e_zSJi";
        objectArray[16] = "\u000b\u000fR6 b\u001dYTH%\u0000[\u0010_\")0R\u0000\u00064F:\u0006_\u0001:=8\u0007Z\tH:>\u0001\u000b\n'w?_b";
        objectArray[17] = "\u001cQzv0\u0014\u001fQ<w\f\u000eZ+{ 7\u0017JB;&0_!\u0015*cm_\u001e\u0013 zqe";
        objectArray[18] = "e_\u0007Xi\u000fs\t\u0001&\u007fm7\f\\\\b\u001d3[\u0003D\u000fVvH^T>\na]Q&";
        objectArray[19] = "~\n\n'%\u000eh\\\fY\"lkYT0&\u0003&X\nY";
        objectArray[20] = "61:\u0001\u001b9 g<\u007f\u001f[#bd\u0016\u00184nc:\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "`x~2m?v.xLP]2+%6f-6|z.\u000b!7v*)dl6(C";
    }

    @Override
    public void v() {
        long l = v ^ 0x560309CF173FL;
        NumericComputationEngine.c("V", (Object)this, (long)-4162056561410877428L, (long)l);
    }

    private void lambda$reset$3() {
        long l = v ^ 0xC940722BA8DL;
        NumericComputationEngine.c("\u00f1", (Object)this, (long)7750536613322272429L, (long)l);
        this.R.clear();
        this.N = null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = bb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 57;
                break;
            }
            case 7: {
                n3 = 31;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 60;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 36;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 6;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 47;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 27;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 45;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 32;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 43;
                break;
            }
            case 29: {
                n3 = 0;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 50;
                break;
            }
            case 34: {
                n3 = 34;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 14;
                break;
            }
            case 37: {
                n3 = 39;
                break;
            }
            case 38: {
                n3 = 53;
                break;
            }
            case 39: {
                n3 = 13;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 23;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 59;
                break;
            }
            case 46: {
                n3 = 29;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 48;
                break;
            }
            case 51: {
                n3 = 49;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 17;
                break;
            }
            case 54: {
                n3 = 33;
                break;
            }
            case 55: {
                n3 = 8;
                break;
            }
            case 56: {
                n3 = 51;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 19;
                break;
            }
            case 59: {
                n3 = 30;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 40;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 24;
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
        NumericComputationEngine.fb[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = NumericComputationEngine.a(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericComputationEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericComputationEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericComputationEngine.a(clazz3, string2, clazz2)) != null) {
                    NumericComputationEngine.bb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericComputationEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericComputationEngine.bb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericComputationEngine.b(722253691861091L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void A(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        long l = v ^ 0x2A67D906F93AL;
        NumericTransformationEngine1068 numericTransformationEngine1068 = this.P.remove(networkPacketOrchestrator1222.getPacket());
        try {
            if (numericTransformationEngine1068 != null) {
                this.t = numericTransformationEngine1068;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine.a(customSystemException);
        }
    }

    private void Z() {
        block8: {
            block9: {
                long l = v ^ 0x7311A8F5561L;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                String string = ScenarioTemplateManager.f();
                try {
                    if (string == null) break block8;
                    if (!systemConfigurationOrchestrator.r()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                AuthorizationManager authorizationManager = systemConfigurationOrchestrator.U();
                try {
                    if (string == null) break block8;
                    if (!authorizationManager.r()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                for (ConnectionLifecycleHandler connectionLifecycleHandler : this.m.keySet()) {
                    try {
                        this.d.Q(connectionLifecycleHandler, authorizationManager);
                        if (string != null) {
                            if (string != null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                }
            }
            this.m.clear();
            this.G = 0L;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NumericComputationEngine.v = MultiContainerRegistry.a(4908786409938060376L, -9046044465114428378L, MethodHandles.lookup().lookupClass()).a(172086532700869L);
                NumericComputationEngine.bb = new Object[22];
                NumericComputationEngine.fb = new String[22];
                NumericComputationEngine.d();
                NumericComputationEngine.Z = new HashMap<K, V>(13);
                var0 = NumericComputationEngine.v ^ 106218769532967L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "w\u0001\u00f9F\u00c0=\u00b7G\u00f5q\u00f4\u00bdZ\n\u0081A\u001d\u00d7\u001f\u009d;`\f\u00d9\u00beg@iX\u0003\u00daQ";
                var7_6 = "w\u0001\u00f9F\u00c0=\u00b7G\u00f5q\u00f4\u00bdZ\n\u0081A\u001d\u00d7\u001f\u009d;`\f\u00d9\u00beg@iX\u0003\u00daQ".length();
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
                    var6_5 = "\u0095\u0000f?A3\u00b1l\u0004\u00f9\u0013f\u00ef\u008dm\u00f2";
                    var7_6 = "\u0095\u0000f?A3\u00b1l\u0004\u00f9\u0013f\u00ef\u008dm\u00f2".length();
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
        NumericComputationEngine.L = var8_3;
        NumericComputationEngine.V = new Integer[6];
    }

    private void u(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block2: {
            try {
                if (!this.O.s().booleanValue() || this.N == null) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationEngine.a(customSystemException);
            }
            double d2 = NumericComputationEngine1131.b();
            double d3 = NumericComputationEngine1131.S();
            double d4 = NumericComputationEngine1131.n();
            float f = ApplicationLifecycleManager.K().h();
            double d5 = this.Y + (this.e - this.Y) * (double)f;
            double d6 = this.B + (this.h - this.B) * (double)f;
            double d7 = this.T + (this.r - this.T) * (double)f;
            eventDispatchRegistry2111.getEntityRenderer().H(1.0);
            GL11.glBlendFunc((int)770, (int)771);
            tl.N();
            tl.s();
            tl.R();
            tl.R(false);
            GL11.glLineWidth((float)1.5f);
            double d8 = this.N.S().f() - this.N.S().F() + (double)this.N.g();
            double d9 = d8 / 2.0;
            CryptoContextNegotiator684.Y();
            CryptoContextNegotiator684.x(d5 - d9, d6 + 0.01, d7 - d9, d8, this.N.L(), d8, 1.0, this.A.L().darker().darker(), this.A.L(), d2, d3, d4);
            CryptoContextNegotiator684.J();
            tl.R(true);
            tl.B();
            tl.j();
            eventDispatchRegistry2111.getEntityRenderer().F(1.0);
        }
    }

    private void Y() {
        try {
            if (this.m.isEmpty()) {
                this.G = 0L;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine.a(customSystemException);
        }
    }

    private boolean a() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.m.isEmpty() || this.G <= 0L) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine.a(customSystemException);
                        }
                        if (System.currentTimeMillis() <= this.G) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public NumericComputationEngine(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = v ^ 0x59512AEDCC2CL;
        super(contextualExecutionFramework, string);
        this.o = NumericFormattingUtility.P(this, (String)((Object)NumericComputationEngine.c("\u00c4", (int)NumericComputationEngine.a("t", (int)3511, (long)(0x442E2CA5EFA99C87L ^ l)), (long)2101259936775247442L, (long)l)), (String)((Object)NumericComputationEngine.c("\u00c4", (int)NumericComputationEngine.a("t", (int)6723, (long)(0x53571EBC9B910B77L ^ l)), (long)2101259936775247442L, (long)l)), (String)((Object)NumericComputationEngine.c("\u00c4", (int)NumericComputationEngine.a("t", (int)27592, (long)(0x1CFF84E51557FAFDL ^ l)), (long)2101259936775247442L, (long)l)), 0.0, 50.0, 100.0, 500.0);
        this.O = AuthenticationStateTracker.w(this, (String)((Object)NumericComputationEngine.c("\u00c4", (int)NumericComputationEngine.a("t", (int)25536, (long)(0x3C99F595374972F6L ^ l)), (long)2101259936775247442L, (long)l)), true);
        this.A = AdaptiveRenderingEngine.M(this, (String)((Object)NumericComputationEngine.c("\u00c4", (int)NumericComputationEngine.a("t", (int)1282, (long)(0x51179009969C9435L ^ l)), (long)2101259936775247442L, (long)l)), new Color(5, 134, 105), 100);
        this.d = ObjectLifecycleMediator.P;
        this.m = new LinkedHashMap<ConnectionLifecycleHandler, Long>();
        this.R = new HashMap<Integer, TimestampTracker>();
        this.P = new HashMap<ConnectionLifecycleHandler, NumericTransformationEngine1068>();
        this.z = ConfigurationRegistry.R;
        this.O.l(this.A);
        this.N(this.o, this.O, this.A);
    }

    @Override
    public void h() {
        super.h();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean x(ConnectionLifecycleHandler connectionLifecycleHandler) {
        int n;
        String string;
        block52: {
            long l = v ^ 0xDECEA38F67FL;
            string = ScenarioTemplateManager.f();
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            n = connectionLifecycleHandler.B(ReflectionMetadataResolver.PY);
                                                                                                            if (string == null) return n != 0;
                                                                                                            if (n != 0) return 1 != 0;
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw NumericComputationEngine.a(customSystemException);
                                                                                                        }
                                                                                                        n = connectionLifecycleHandler.B(ReflectionMetadataResolver.U9);
                                                                                                        if (string == null) return n != 0;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw NumericComputationEngine.a(customSystemException);
                                                                                                    }
                                                                                                    if (n != 0) return 1 != 0;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw NumericComputationEngine.a(customSystemException);
                                                                                                }
                                                                                                n = connectionLifecycleHandler.B(ReflectionMetadataResolver.ET);
                                                                                                if (string == null) return n != 0;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw NumericComputationEngine.a(customSystemException);
                                                                                            }
                                                                                            if (n != 0) return 1 != 0;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw NumericComputationEngine.a(customSystemException);
                                                                                        }
                                                                                        n = connectionLifecycleHandler.B(ReflectionMetadataResolver.rI);
                                                                                        if (string == null) return n != 0;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw NumericComputationEngine.a(customSystemException);
                                                                                    }
                                                                                    if (n != 0) return 1 != 0;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw NumericComputationEngine.a(customSystemException);
                                                                                }
                                                                                n = connectionLifecycleHandler.B(ReflectionMetadataResolver.Eb);
                                                                                if (string == null) return n != 0;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw NumericComputationEngine.a(customSystemException);
                                                                            }
                                                                            if (n != 0) return 1 != 0;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw NumericComputationEngine.a(customSystemException);
                                                                        }
                                                                        n = connectionLifecycleHandler.B(ReflectionMetadataResolver.VR);
                                                                        if (string == null) return n != 0;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw NumericComputationEngine.a(customSystemException);
                                                                    }
                                                                    if (n != 0) return 1 != 0;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw NumericComputationEngine.a(customSystemException);
                                                                }
                                                                n = connectionLifecycleHandler.B(ReflectionMetadataResolver.P5);
                                                                if (string == null) return n != 0;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw NumericComputationEngine.a(customSystemException);
                                                            }
                                                            if (n != 0) return 1 != 0;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw NumericComputationEngine.a(customSystemException);
                                                        }
                                                        n = connectionLifecycleHandler.B(ReflectionMetadataResolver.r5);
                                                        if (string == null) return n != 0;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw NumericComputationEngine.a(customSystemException);
                                                    }
                                                    if (n != 0) return 1 != 0;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw NumericComputationEngine.a(customSystemException);
                                                }
                                                n = connectionLifecycleHandler.B(ReflectionMetadataResolver.bI);
                                                if (string == null) return n != 0;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NumericComputationEngine.a(customSystemException);
                                            }
                                            if (n != 0) return 1 != 0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericComputationEngine.a(customSystemException);
                                        }
                                        n = connectionLifecycleHandler.B(ReflectionMetadataResolver.Yh);
                                        if (string == null) return n != 0;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericComputationEngine.a(customSystemException);
                                    }
                                    if (n != 0) return 1 != 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericComputationEngine.a(customSystemException);
                                }
                                n = connectionLifecycleHandler.B(ReflectionMetadataResolver.VU);
                                if (string == null) return n != 0;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericComputationEngine.a(customSystemException);
                            }
                            if (n != 0) return 1 != 0;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine.a(customSystemException);
                        }
                        n = connectionLifecycleHandler.B(ReflectionMetadataResolver.bh);
                        if (string == null) break block52;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                    if (n == 0) return 0 != 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                n = new NetworkConnectionManager1286(connectionLifecycleHandler).h();
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationEngine.a(customSystemException);
            }
        }
        try {
            try {
                if (string == null) return n != 0;
                if (n == ApplicationLifecycleManager.U().X()) return 0 != 0;
                return 1 != 0;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationEngine.a(customSystemException);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine.a(customSystemException);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NumericComputationEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericComputationEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private NumericTransformationEngine1068 h() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        return new NumericTransformationEngine1068(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B());
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericComputationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void k(TransactionOrchestrator1017 transactionOrchestrator1017, NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        long l = v ^ 0x6B267E6BC382L;
        networkPacketOrchestrator1222.setCanceled(true);
        NumericComputationEngine.c("\u00f1", (Object)this, (Object)networkPacketOrchestrator1222.getPacket(), (long)1334806367227254360L, (long)l);
        this.N = transactionOrchestrator1017;
        this.G = 0L;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericComputationEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericComputationEngine.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC19;
        if (V[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = L[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Z.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    Z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericComputationEngine.V[n2] = n3;
        }
        return V[n2];
    }

    private boolean U() {
        return this.m.keySet().stream().noneMatch(this::lambda$shouldFlushOnNoRelevantPackets$0);
    }

    private void lambda$onClientTick$1() {
        long l = v ^ 0x43AD040B17E7L;
        NumericComputationEngine.c("V", (Object)this, (long)-4115562311856656157L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void A(int n) {
        long l = v ^ 0x54E87EF0F6CBL;
        AuthorizationManager authorizationManager = ApplicationLifecycleManager.y();
        Iterator<Map.Entry<ConnectionLifecycleHandler, Long>> iterator = this.m.entrySet().iterator();
        String string = ScenarioTemplateManager.f();
        for (int i = 0; iterator.hasNext() && i <= n; ++i) {
            Map.Entry<ConnectionLifecycleHandler, Long> entry = iterator.next();
            this.d.Q(entry.getKey(), authorizationManager);
            iterator.remove();
            if (string != null) continue;
        }
    }

    private boolean lambda$shouldFlushOnNoRelevantPackets$0(ConnectionLifecycleHandler connectionLifecycleHandler) {
        return this.S(connectionLifecycleHandler);
    }

    private void k(double d2, double d3, double d4) {
        long l = v ^ 0x7AFDF687D24EL;
        this.x = d2;
        this.K = d3;
        this.j = d4;
        this.l = (int)NumericComputationEngine.a("t", (int)7898, (long)(0x5F7DA888B8729189L ^ l));
    }

    @DataExchangeProtocol2090
    public void K(KB kB) {
        block9: {
            NumericComputationEngine numericComputationEngine;
            block8: {
                int n;
                block6: {
                    String string;
                    block7: {
                        long l = v ^ 0x1783B97B5F88L;
                        string = ScenarioTemplateManager.f();
                        try {
                            n = ApplicationLifecycleManager.U().Y();
                            if (string == null) break block6;
                            if (n == 0) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine.a(customSystemException);
                        }
                        return;
                    }
                    try {
                        ObjectLifecycleMediator.R(this::lambda$onClientTick$1);
                        this.Y = this.e;
                        this.B = this.h;
                        this.T = this.r;
                        numericComputationEngine = this;
                        if (string == null) break block8;
                        n = numericComputationEngine.l;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                }
                try {
                    if (n <= 0) break block9;
                    this.e += (this.x - this.e) / (double)this.l;
                    this.h += (this.K - this.h) / (double)this.l;
                    this.r += (this.j - this.r) / (double)this.l;
                    numericComputationEngine = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
            }
            --numericComputationEngine.l;
        }
    }

    private boolean y(ConnectionLifecycleHandler connectionLifecycleHandler) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.rD) && !connectionLifecycleHandler.B(ReflectionMetadataResolver.Fg)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void q(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block4: {
            try {
                try {
                    if (!this.O.s().booleanValue() || this.N == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
                this.u(eventDispatchRegistry2111);
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationEngine.a(customSystemException);
            }
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericComputationEngine.a(l, l2);
            object = bb[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericComputationEngine.bb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private boolean S(ConnectionLifecycleHandler connectionLifecycleHandler) {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (connectionLifecycleHandler.B(ReflectionMetadataResolver.b) || connectionLifecycleHandler.B(ReflectionMetadataResolver.YS)) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericComputationEngine.a(customSystemException);
                                }
                                if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bm)) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericComputationEngine.a(customSystemException);
                            }
                            if (!this.y(connectionLifecycleHandler)) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericComputationEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = NumericComputationEngine.a(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericComputationEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericComputationEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericComputationEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericComputationEngine.bb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericComputationEngine.b(722253691861091L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericComputationEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericComputationEngine.bb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericComputationEngine.b(722253691861091L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'p' || c == 'L' || c == '\u00e0' || c == '\u00aa') {
                field = NumericComputationEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericComputationEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void z(NetworkPacketOrchestrator1222 var1_1) {
        block218: {
            block219: {
                block215: {
                    block217: {
                        block216: {
                            block214: {
                                block210: {
                                    block212: {
                                        block213: {
                                            block211: {
                                                block197: {
                                                    block209: {
                                                        block207: {
                                                            block206: {
                                                                block205: {
                                                                    block203: {
                                                                        block204: {
                                                                            block198: {
                                                                                block201: {
                                                                                    block202: {
                                                                                        block199: {
                                                                                            block200: {
                                                                                                block196: {
                                                                                                    block194: {
                                                                                                        block195: {
                                                                                                            block192: {
                                                                                                                block193: {
                                                                                                                    block190: {
                                                                                                                        block191: {
                                                                                                                            block223: {
                                                                                                                                block189: {
                                                                                                                                    block188: {
                                                                                                                                        block181: {
                                                                                                                                            block187: {
                                                                                                                                                block186: {
                                                                                                                                                    block182: {
                                                                                                                                                        block185: {
                                                                                                                                                            block183: {
                                                                                                                                                                block176: {
                                                                                                                                                                    block180: {
                                                                                                                                                                        block179: {
                                                                                                                                                                            block178: {
                                                                                                                                                                                block177: {
                                                                                                                                                                                    block222: {
                                                                                                                                                                                        block175: {
                                                                                                                                                                                            block174: {
                                                                                                                                                                                                block172: {
                                                                                                                                                                                                    block173: {
                                                                                                                                                                                                        block171: {
                                                                                                                                                                                                            block221: {
                                                                                                                                                                                                                block169: {
                                                                                                                                                                                                                    block170: {
                                                                                                                                                                                                                        block168: {
                                                                                                                                                                                                                            block167: {
                                                                                                                                                                                                                                block166: {
                                                                                                                                                                                                                                    block220: {
                                                                                                                                                                                                                                        block165: {
                                                                                                                                                                                                                                            block164: {
                                                                                                                                                                                                                                                var2_2 = NumericComputationEngine.v ^ 7533954004148L;
                                                                                                                                                                                                                                                var4_3 = ScenarioTemplateManager.f();
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            v0 = var1_1.getWorld().Y();
                                                                                                                                                                                                                                                            if (var4_3 == null) break block164;
                                                                                                                                                                                                                                                            if (v0) break block165;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (CustomSystemException v1) {
                                                                                                                                                                                                                                                            throw NumericComputationEngine.a(v1);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v2 = var1_1;
                                                                                                                                                                                                                                                        if (var4_3 == null) break block166;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (CustomSystemException v3) {
                                                                                                                                                                                                                                                        throw NumericComputationEngine.a(v3);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    v0 = v2.getThePlayer().Y();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (CustomSystemException v4) {
                                                                                                                                                                                                                                                    throw NumericComputationEngine.a(v4);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!v0) break block220;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v2 = var1_1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var5_4 = v2.getPacket();
                                                                                                                                                                                                                                var8_5 = NumericComputationEngine.c("\u00f1", (Object)this, (long)2717907382699248072L, (long)var2_2);
                                                                                                                                                                                                                                var9_6 = null;
                                                                                                                                                                                                                                var10_7 = null;
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v5 = var5_4.B(ReflectionMetadataResolver.b);
                                                                                                                                                                                                                                        if (var4_3 == null) break block167;
                                                                                                                                                                                                                                        if (v5) break block168;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (CustomSystemException v6) {
                                                                                                                                                                                                                                        throw NumericComputationEngine.a(v6);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v5 = var5_4.B(ReflectionMetadataResolver.YS);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (CustomSystemException v7) {
                                                                                                                                                                                                                                    throw NumericComputationEngine.a(v7);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!v5) break block172;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var11_8 = null;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            v8 = var5_4.B(ReflectionMetadataResolver.b);
                                                                                                                                                                                                                            if (var4_3 == null) break block169;
                                                                                                                                                                                                                            if (!v8) break block170;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (CustomSystemException v9) {
                                                                                                                                                                                                                            throw NumericComputationEngine.a(v9);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var12_9 = new StrategySelectionController(var5_4);
                                                                                                                                                                                                                        var11_8 = var12_9.c(var1_1.getWorld());
                                                                                                                                                                                                                        break block221;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v8 = var5_4.B(ReflectionMetadataResolver.YS);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (v8) {
                                                                                                                                                                                                                    var12_9 = new TransactionValidationEngine(var5_4);
                                                                                                                                                                                                                    var11_8 = var1_1.getWorld().I(var12_9.K());
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                v10 = var11_8;
                                                                                                                                                                                                                if (var4_3 == null) break block171;
                                                                                                                                                                                                                if (v10 == null) break block172;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (CustomSystemException v11) {
                                                                                                                                                                                                                throw NumericComputationEngine.a(v11);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v10 = var11_8;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (var4_3 == null) break block173;
                                                                                                                                                                                                                if (!v10.B(ReflectionMetadataResolver.Ut)) break block172;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (CustomSystemException v12) {
                                                                                                                                                                                                                throw NumericComputationEngine.a(v12);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v10 = this.R.get(var11_8.X());
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (CustomSystemException v13) {
                                                                                                                                                                                                            throw NumericComputationEngine.a(v13);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var10_7 = (TimestampTracker)v10;
                                                                                                                                                                                                    if (var11_8.X() == ResourceAllocationTracker401.H.x()) {
                                                                                                                                                                                                        var9_6 = new TransactionOrchestrator1017(var11_8);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v14 = var10_7;
                                                                                                                                                                                                    if (var4_3 == null) break block174;
                                                                                                                                                                                                    if (v14 == null) break block175;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (CustomSystemException v15) {
                                                                                                                                                                                                    throw NumericComputationEngine.a(v15);
                                                                                                                                                                                                }
                                                                                                                                                                                                v14 = var10_7;
                                                                                                                                                                                            }
                                                                                                                                                                                            v16 = v14.P();
                                                                                                                                                                                            break block222;
                                                                                                                                                                                        }
                                                                                                                                                                                        v16 = null;
                                                                                                                                                                                    }
                                                                                                                                                                                    var7_13 = v16;
                                                                                                                                                                                    try {
                                                                                                                                                                                        v17 = var5_4.B(ReflectionMetadataResolver.b);
                                                                                                                                                                                        if (var4_3 == null) break block176;
                                                                                                                                                                                        if (v17) {
                                                                                                                                                                                        }
                                                                                                                                                                                        ** GOTO lbl147
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (CustomSystemException v18) {
                                                                                                                                                                                        throw NumericComputationEngine.a(v18);
                                                                                                                                                                                    }
                                                                                                                                                                                    var11_8 = new StrategySelectionController(var5_4);
                                                                                                                                                                                    try {
                                                                                                                                                                                        v19 = var10_7;
                                                                                                                                                                                        if (var4_3 == null) break block177;
                                                                                                                                                                                        if (v19 == null) break block178;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (CustomSystemException v20) {
                                                                                                                                                                                        throw NumericComputationEngine.a(v20);
                                                                                                                                                                                    }
                                                                                                                                                                                    v19 = var10_7;
                                                                                                                                                                                }
                                                                                                                                                                                v19.S((StrategySelectionController)var11_8);
                                                                                                                                                                                if (var4_3 != null) break block180;
                                                                                                                                                                            }
                                                                                                                                                                            var12_9 = var11_8.c(var1_1.getWorld());
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    v21 = var12_9;
                                                                                                                                                                                    if (var4_3 == null) break block179;
                                                                                                                                                                                    if (!v21.r()) break block180;
                                                                                                                                                                                }
                                                                                                                                                                                catch (CustomSystemException v22) {
                                                                                                                                                                                    throw NumericComputationEngine.a(v22);
                                                                                                                                                                                }
                                                                                                                                                                                v21 = var12_9;
                                                                                                                                                                            }
                                                                                                                                                                            catch (CustomSystemException v23) {
                                                                                                                                                                                throw NumericComputationEngine.a(v23);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var13_14 = TimestampTracker.d((CryptographicTransformer)v21);
                                                                                                                                                                        var13_14.S((StrategySelectionController)var11_8);
                                                                                                                                                                        this.R.put(var12_9.X(), var13_14);
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (var4_3 != null) break block181;
lbl147:
                                                                                                                                                                        // 2 sources

                                                                                                                                                                        v17 = var5_4.B(ReflectionMetadataResolver.YS);
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v24) {
                                                                                                                                                                        throw NumericComputationEngine.a(v24);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (var4_3 == null) break block182;
                                                                                                                                                                    if (v17) {
                                                                                                                                                                    }
                                                                                                                                                                    ** GOTO lbl186
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v25) {
                                                                                                                                                                    throw NumericComputationEngine.a(v25);
                                                                                                                                                                }
                                                                                                                                                                var11_8 = new TransactionValidationEngine(var5_4);
                                                                                                                                                                try {
                                                                                                                                                                    block184: {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                v26 = var10_7;
                                                                                                                                                                                if (var4_3 == null) break block183;
                                                                                                                                                                                if (v26 == null) break block184;
                                                                                                                                                                            }
                                                                                                                                                                            catch (CustomSystemException v27) {
                                                                                                                                                                                throw NumericComputationEngine.a(v27);
                                                                                                                                                                            }
                                                                                                                                                                            var10_7.B((TransactionValidationEngine)var11_8);
                                                                                                                                                                            if (var4_3 != null) break block185;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v28) {
                                                                                                                                                                            throw NumericComputationEngine.a(v28);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v26 = new TimestampTracker(var11_8.I(), var11_8.S(), var11_8.d());
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v29) {
                                                                                                                                                                    throw NumericComputationEngine.a(v29);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            var12_9 = v26;
                                                                                                                                                            this.R.put(var11_8.K(), (TimestampTracker)var12_9);
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (var4_3 != null) break block181;
lbl186:
                                                                                                                                                            // 2 sources

                                                                                                                                                            v17 = var5_4.B(ReflectionMetadataResolver.bm);
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v30) {
                                                                                                                                                            throw NumericComputationEngine.a(v30);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        if (var4_3 == null) break block186;
                                                                                                                                                        if (v17) {
                                                                                                                                                        }
                                                                                                                                                        ** GOTO lbl203
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v31) {
                                                                                                                                                        throw NumericComputationEngine.a(v31);
                                                                                                                                                    }
                                                                                                                                                    var11_8 = new AdvancedQueryBuilder(var5_4);
                                                                                                                                                    try {
                                                                                                                                                        this.R.put(var11_8.D(), new TimestampTracker(var11_8.X(), var11_8.Q(), var11_8.Z()));
                                                                                                                                                        if (var4_3 != null) break block181;
lbl203:
                                                                                                                                                        // 2 sources

                                                                                                                                                        v17 = var5_4.B(ReflectionMetadataResolver.rT);
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v32) {
                                                                                                                                                        throw NumericComputationEngine.a(v32);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (var4_3 == null) break block187;
                                                                                                                                                    if (v17) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl219
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v33) {
                                                                                                                                                    throw NumericComputationEngine.a(v33);
                                                                                                                                                }
                                                                                                                                                var11_8 = new CryptographicTransformation(var5_4);
                                                                                                                                                try {
                                                                                                                                                    Arrays.stream(var11_8.F()).forEach((IntConsumer)LambdaMetafactory.metafactory(null, null, null, (I)V, lambda$onReceivePacket$2(int ), (I)V)((NumericComputationEngine)this));
                                                                                                                                                    if (var4_3 != null) break block181;
lbl219:
                                                                                                                                                    // 2 sources

                                                                                                                                                    v17 = var5_4.B(ReflectionMetadataResolver.rE);
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v34) {
                                                                                                                                                    throw NumericComputationEngine.a(v34);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (v17) {
                                                                                                                                                    this.N = null;
                                                                                                                                                    this.m.clear();
                                                                                                                                                    this.R.clear();
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v35) {
                                                                                                                                                throw NumericComputationEngine.a(v35);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            v36 = var10_7;
                                                                                                                                            if (var4_3 == null) break block188;
                                                                                                                                            if (v36 == null) break block189;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v37) {
                                                                                                                                            throw NumericComputationEngine.a(v37);
                                                                                                                                        }
                                                                                                                                        v36 = var10_7;
                                                                                                                                    }
                                                                                                                                    v38 = v36.P();
                                                                                                                                    break block223;
                                                                                                                                }
                                                                                                                                v38 = null;
                                                                                                                            }
                                                                                                                            var6_15 = v38;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var6_15 == null) break block190;
                                                                                                                                        v39 = var9_6;
                                                                                                                                        if (var4_3 == null) break block191;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v40) {
                                                                                                                                        throw NumericComputationEngine.a(v40);
                                                                                                                                    }
                                                                                                                                    if (v39 == null) break block190;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v41) {
                                                                                                                                    throw NumericComputationEngine.a(v41);
                                                                                                                                }
                                                                                                                                v39 = this.P.put(var5_4, var6_15);
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v42) {
                                                                                                                                throw NumericComputationEngine.a(v42);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        this.k(var6_15.h(), var6_15.i(), var6_15.I());
                                                                                                                        this.N = var9_6;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v43 /* !! */  = this.z.A();
                                                                                                                            if (var4_3 == null) break block192;
                                                                                                                            if (!v43 /* !! */ ) break block193;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v44) {
                                                                                                                            throw NumericComputationEngine.a(v44);
                                                                                                                        }
                                                                                                                        NumericComputationEngine.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v45) {
                                                                                                                        throw NumericComputationEngine.a(v45);
                                                                                                                    }
                                                                                                                }
                                                                                                                v43 /* !! */  = this.d.n(var5_4);
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var4_3 == null) break block194;
                                                                                                                if (!v43 /* !! */ ) break block195;
                                                                                                            }
                                                                                                            catch (CustomSystemException v46) {
                                                                                                                throw NumericComputationEngine.a(v46);
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        v43 /* !! */  = this.m.isEmpty();
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var4_3 == null) break block196;
                                                                                                            if (v43 /* !! */ ) break block197;
                                                                                                        }
                                                                                                        catch (CustomSystemException v47) {
                                                                                                            throw NumericComputationEngine.a(v47);
                                                                                                        }
                                                                                                        v43 /* !! */  = NumericComputationEngine.c("\u00f1", (Object)this, (Object)var5_4, (long)2716158627737713978L, (long)var2_2);
                                                                                                    }
                                                                                                    catch (CustomSystemException v48) {
                                                                                                        throw NumericComputationEngine.a(v48);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (v43 /* !! */ ) break block197;
                                                                                                                    if (var6_15 == null) break block198;
                                                                                                                }
                                                                                                                catch (CustomSystemException v49) {
                                                                                                                    throw NumericComputationEngine.a(v49);
                                                                                                                }
                                                                                                                if (var9_6 == null) break block198;
                                                                                                            }
                                                                                                            catch (CustomSystemException v50) {
                                                                                                                throw NumericComputationEngine.a(v50);
                                                                                                            }
                                                                                                            v51 = this.t;
                                                                                                            if (var4_3 == null) break block199;
                                                                                                        }
                                                                                                        catch (CustomSystemException v52) {
                                                                                                            throw NumericComputationEngine.a(v52);
                                                                                                        }
                                                                                                        if (v51 == null) break block200;
                                                                                                    }
                                                                                                    catch (CustomSystemException v53) {
                                                                                                        throw NumericComputationEngine.a(v53);
                                                                                                    }
                                                                                                    v51 = this.t;
                                                                                                    break block199;
                                                                                                }
                                                                                                catch (CustomSystemException v54) {
                                                                                                    throw NumericComputationEngine.a(v54);
                                                                                                }
                                                                                            }
                                                                                            v51 = var7_13;
                                                                                        }
                                                                                        var11_8 = v51;
                                                                                        var12_10 = NumericTransformationEngine1068.d((NumericTransformationEngine1068)var8_5, (NumericTransformationEngine1068)var11_8);
                                                                                        var14_16 = NumericTransformationEngine1068.d((NumericTransformationEngine1068)var8_5, var6_15);
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_3 == null) break block201;
                                                                                                if (!(var12_10 + 0.001 < var14_16)) break block202;
                                                                                                break block198;
                                                                                            }
                                                                                            catch (CustomSystemException v55) {
                                                                                                throw NumericComputationEngine.a(v55);
                                                                                            }
                                                                                        }
                                                                                        catch (CustomSystemException v56) {
                                                                                            throw NumericComputationEngine.a(v56);
                                                                                        }
                                                                                    }
                                                                                    NumericComputationEngine.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                                }
                                                                                return;
                                                                            }
                                                                            try {
                                                                                v57 = var5_4.B(ReflectionMetadataResolver.bh);
                                                                                if (var4_3 == null) break block203;
                                                                                if (v57 == 0) break block204;
                                                                            }
                                                                            catch (CustomSystemException v58) {
                                                                                throw NumericComputationEngine.a(v58);
                                                                            }
                                                                            var11_8 = new NetworkConnectionManager1286(var5_4);
                                                                            try {
                                                                                try {
                                                                                    v57 = var11_8.h();
                                                                                    if (var4_3 == null) break block203;
                                                                                    if (v57 != ApplicationLifecycleManager.U().X()) break block204;
                                                                                }
                                                                                catch (CustomSystemException v59) {
                                                                                    throw NumericComputationEngine.a(v59);
                                                                                }
                                                                                NumericComputationEngine.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                                return;
                                                                            }
                                                                            catch (CustomSystemException v60) {
                                                                                throw NumericComputationEngine.a(v60);
                                                                            }
                                                                        }
                                                                        v57 = var5_4.B(ReflectionMetadataResolver.UV);
                                                                    }
                                                                    try {
                                                                        if (v57 != 0) {
                                                                            NumericComputationEngine.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                            return;
                                                                        }
                                                                    }
                                                                    catch (CustomSystemException v61) {
                                                                        throw NumericComputationEngine.a(v61);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var6_15 == null || var9_6 == null) break block205;
                                                                                    }
                                                                                    catch (CustomSystemException v62) {
                                                                                        throw NumericComputationEngine.a(v62);
                                                                                    }
                                                                                    v63 = this;
                                                                                    if (var4_3 == null) break block206;
                                                                                }
                                                                                catch (CustomSystemException v64) {
                                                                                    throw NumericComputationEngine.a(v64);
                                                                                }
                                                                                if (v63.t == null) break block205;
                                                                            }
                                                                            catch (CustomSystemException v65) {
                                                                                throw NumericComputationEngine.a(v65);
                                                                            }
                                                                            cfr_temp_0 = var6_15.X(this.t) - 6.0;
                                                                            v66 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                            if (var4_3 == null) break block207;
                                                                        }
                                                                        catch (CustomSystemException v67) {
                                                                            throw NumericComputationEngine.a(v67);
                                                                        }
                                                                        if (v66 <= 0) break block205;
                                                                    }
                                                                    catch (CustomSystemException v68) {
                                                                        throw NumericComputationEngine.a(v68);
                                                                    }
                                                                    var11_8 = this.m.entrySet().iterator();
                                                                    while (var11_8.hasNext()) {
                                                                        var12_11 = var11_8.next();
                                                                        try {
                                                                            block208: {
                                                                                try {
                                                                                    try {
                                                                                        this.d.Q(var12_11.getKey(), var1_1.getNetHandler());
                                                                                        var11_8.remove();
                                                                                        cfr_temp_1 = var6_15.X(this.t) - 6.0;
                                                                                        v66 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                        if (var4_3 == null) break block207;
                                                                                        if (v66 > 0) break block208;
                                                                                    }
                                                                                    catch (CustomSystemException v69) {
                                                                                        throw NumericComputationEngine.a(v69);
                                                                                    }
                                                                                    if (var4_3 != null) break;
                                                                                }
                                                                                catch (CustomSystemException v70) {
                                                                                    throw NumericComputationEngine.a(v70);
                                                                                }
                                                                            }
                                                                            if (var4_3 != null) continue;
                                                                            break;
                                                                        }
                                                                        catch (CustomSystemException v71) {
                                                                            throw NumericComputationEngine.a(v71);
                                                                        }
                                                                    }
                                                                }
                                                                v63 = this;
                                                            }
                                                            try {
                                                                if (var4_3 == null) break block209;
                                                                cfr_temp_2 = v63.G - 0L;
                                                                v66 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                            }
                                                            catch (CustomSystemException v72) {
                                                                throw NumericComputationEngine.a(v72);
                                                            }
                                                        }
                                                        try {
                                                            if (v66 != false) break block197;
                                                            var1_1.setCanceled(true);
                                                            v63 = this;
                                                        }
                                                        catch (CustomSystemException v73) {
                                                            throw NumericComputationEngine.a(v73);
                                                        }
                                                    }
                                                    NumericComputationEngine.c("\u00f1", (Object)v63, (Object)var5_4, (long)2715743890367816046L, (long)var2_2);
                                                    return;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var9_6 == null) break block210;
                                                            v74 = var6_15;
                                                            if (var4_3 == null) break block211;
                                                        }
                                                        catch (CustomSystemException v75) {
                                                            throw NumericComputationEngine.a(v75);
                                                        }
                                                        if (v74 == null) break block210;
                                                    }
                                                    catch (CustomSystemException v76) {
                                                        throw NumericComputationEngine.a(v76);
                                                    }
                                                    v74 = this.t;
                                                }
                                                catch (CustomSystemException v77) {
                                                    throw NumericComputationEngine.a(v77);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_3 == null) break block212;
                                                    if (v74 == null) break block213;
                                                }
                                                catch (CustomSystemException v78) {
                                                    throw NumericComputationEngine.a(v78);
                                                }
                                                v74 = this.t;
                                                break block212;
                                            }
                                            catch (CustomSystemException v79) {
                                                throw NumericComputationEngine.a(v79);
                                            }
                                        }
                                        v74 = var7_13;
                                    }
                                    var11_8 = v74;
                                    var12_12 = NumericTransformationEngine1068.d((NumericTransformationEngine1068)var8_5, (NumericTransformationEngine1068)var11_8);
                                    var14_16 = NumericTransformationEngine1068.d((NumericTransformationEngine1068)var8_5, var6_15);
                                    try {
                                        try {
                                            cfr_temp_3 = var12_12 + 0.001 - var14_16;
                                            v80 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                            if (var4_3 == null) break block214;
                                            if (v80 >= 0) break block210;
                                        }
                                        catch (CustomSystemException v81) {
                                            throw NumericComputationEngine.a(v81);
                                        }
                                        NumericComputationEngine.c("\u00f1", (Object)this, (Object)var9_6, (Object)var1_1, (long)2716010703875918626L, (long)var2_2);
                                        return;
                                    }
                                    catch (CustomSystemException v82) {
                                        throw NumericComputationEngine.a(v82);
                                    }
                                }
                                v80 = (cfr_temp_4 = this.G - 0L) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var4_3 == null) break block215;
                                                if (v80 > 0) {
                                                }
                                                ** GOTO lbl560
                                            }
                                            catch (CustomSystemException v83) {
                                                throw NumericComputationEngine.a(v83);
                                            }
                                            cfr_temp_5 = System.currentTimeMillis() - this.G;
                                            v84 /* !! */  = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                                            if (var4_3 == null) break block216;
                                        }
                                        catch (CustomSystemException v85) {
                                            throw NumericComputationEngine.a(v85);
                                        }
                                        if (v84 /* !! */  < 0) {
                                        }
                                        ** GOTO lbl555
                                    }
                                    catch (CustomSystemException v86) {
                                        throw NumericComputationEngine.a(v86);
                                    }
                                    v87 = this;
                                    v88 = var5_4;
                                    if (var4_3 == null) break block217;
                                }
                                catch (CustomSystemException v89) {
                                    throw NumericComputationEngine.a(v89);
                                }
                                v84 /* !! */  = (long)NumericComputationEngine.c("\u00f1", (Object)v87, (Object)v88, (long)2716158627737713978L, (long)var2_2);
                            }
                            catch (CustomSystemException v90) {
                                throw NumericComputationEngine.a(v90);
                            }
                        }
                        try {
                            if (v84 /* !! */  != false) break block218;
                            var1_1.setCanceled(true);
                            v87 = this;
                            v88 = var5_4;
                        }
                        catch (CustomSystemException v91) {
                            throw NumericComputationEngine.a(v91);
                        }
                    }
                    try {
                        try {
                            try {
                                NumericComputationEngine.c("\u00f1", (Object)v87, (Object)v88, (long)2715743890367816046L, (long)var2_2);
                                if (var4_3 != null) break block218;
lbl555:
                                // 2 sources

                                NumericComputationEngine.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                if (var4_3 != null) break block218;
                            }
                            catch (CustomSystemException v92) {
                                throw NumericComputationEngine.a(v92);
                            }
lbl560:
                            // 2 sources

                            v93 = this;
                            v94 = var5_4;
                            if (var4_3 == null) break block219;
                        }
                        catch (CustomSystemException v95) {
                            throw NumericComputationEngine.a(v95);
                        }
                        v80 = (long)v93.y(v94);
                    }
                    catch (CustomSystemException v96) {
                        throw NumericComputationEngine.a(v96);
                    }
                }
                try {
                    if (v80 == false) break block218;
                    var1_1.setCanceled(true);
                    v93 = this;
                    v94 = var5_4;
                }
                catch (CustomSystemException v97) {
                    throw NumericComputationEngine.a(v97);
                }
            }
            NumericComputationEngine.c("\u00f1", (Object)v93, (Object)v94, (long)2715743890367816046L, (long)var2_2);
            this.G = System.currentTimeMillis() + 25L;
        }
    }

    private void j() {
        block7: {
            int n;
            long l = v ^ 0x223FA5D39829L;
            AuthorizationManager authorizationManager = ApplicationLifecycleManager.y();
            ArrayList<ConnectionLifecycleHandler> arrayList = new ArrayList<ConnectionLifecycleHandler>();
            Iterator<Map.Entry<ConnectionLifecycleHandler, Long>> iterator = this.m.entrySet().iterator();
            String string = ScenarioTemplateManager.f();
            while (iterator.hasNext()) {
                block8: {
                    Map.Entry<ConnectionLifecycleHandler, Long> entry = iterator.next();
                    try {
                        try {
                            try {
                                long l2 = System.currentTimeMillis() - entry.getValue();
                                n = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                if (string == null) break block7;
                                if (string == null) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericComputationEngine.a(customSystemException);
                            }
                            if (n < 0) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine.a(customSystemException);
                        }
                        this.d.Q(entry.getKey(), authorizationManager);
                        arrayList.add(entry.getKey());
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine.a(customSystemException);
                    }
                }
                if (string != null) continue;
            }
            n = this.m.keySet().removeAll(arrayList);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericComputationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NumericComputationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

