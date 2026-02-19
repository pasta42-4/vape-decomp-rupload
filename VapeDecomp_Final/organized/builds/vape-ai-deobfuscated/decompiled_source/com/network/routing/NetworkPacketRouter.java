/*
 * Decompiled with CFR 0.152.
 */
package com.network.routing;

import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.xml.generation.XmlGenerator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.config.distributed.DistributedConfigurationInterface;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.ProtocolInteractionController;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.monitoring.RuntimeResourceTracker;
import com.util.numeric.NumericFormattingUtility;
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
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NetworkPacketRouter
extends XmlGenerator
implements DistributedConfigurationInterface {
    private final AuthenticationStateTracker r;
    private final AuthenticationGateway1860 K;
    private final Random e;
    private final ColorPaletteManager X;
    private final AuthenticationGateway1860 B;
    private static final Integer[] o;
    private static final String[] N;
    private static final long b;
    private final AuthenticationStateTracker l;
    private final Queue<DimensionalMetricsTracker> R;
    private static final Object[] F;
    private static final Map v;
    private boolean L;
    private final NumericFormattingUtility t;
    private final AuthenticationGateway1860 w;
    private boolean x;
    private final NetworkConfigManager G;
    private static final long[] n;
    private final GenericAdapterManager Y;
    private final AuthenticationStateTracker P;

    private boolean r() {
        boolean bl = false;
        for (int i = 9; i < 36; ++i) {
            boolean bl2;
            LightweightExecutionContext lightweightExecutionContext;
            block12: {
                block11: {
                    LightweightExecutionContext lightweightExecutionContext2 = ApplicationLifecycleManager.U().l().F(i);
                    try {
                        if (lightweightExecutionContext2.Y()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                    ProtocolInteractionController protocolInteractionController = lightweightExecutionContext2.C();
                    try {
                        if (protocolInteractionController.Y()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                    try {
                        try {
                            lightweightExecutionContext = lightweightExecutionContext2;
                            if (!((NetworkConnectionEstablisher)this.Y.J()).equals(this.B) && !((NetworkConnectionEstablisher)this.Y.J()).equals(this.w)) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkPacketRouter.b(customSystemException);
                        }
                        bl2 = true;
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                }
                bl2 = false;
            }
            if (!RuntimeResourceTracker.y(lightweightExecutionContext, bl2)) continue;
            bl = true;
        }
        return bl;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkPacketRouter.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkPacketRouter.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public NetworkPacketRouter() {
        long l = b ^ 0xC852E7A5829L;
        super(a.cs((int)NetworkPacketRouter.c("l", (int)11201, (long)(0x62595019D07E62E1L ^ l))), RecursiveNodeGraph.W, a.cs((int)NetworkPacketRouter.c("l", (int)6105, (long)(0x15626672B5825EF3L ^ l))));
        this.w = new AuthenticationGateway1860((String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)23825, (long)(0xB25C0E00AD59433L ^ l)), (long)3733612965589230190L, (long)l)));
        this.K = new AuthenticationGateway1860((String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)6017, (long)(0x133FFF2D966FDEAAL ^ l)), (long)3733612965589230190L, (long)l)));
        this.B = new AuthenticationGateway1860((String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)11487, (long)(0x775DC4296728E5F6L ^ l)), (long)3733612965589230190L, (long)l)));
        this.Y = GenericAdapterManager.D(this, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)14001, (long)(0x33336270408A7F99L ^ l)), (long)3733612965589230190L, (long)l)), this.w, this.w, this.K, this.B);
        this.X = ColorPaletteManager.o(this, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)17202, (long)(0x4DCCBE88665F0A1DL ^ l)), (long)3733612965589230190L, (long)l)), (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)8706, (long)(0x5552D8FCA4B7EB25L ^ l)), (long)3733612965589230190L, (long)l)), ColorPaletteManager.U, Collections.emptyList());
        this.P = AuthenticationStateTracker.w(this, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)19722, (long)(0x3613A54B885C8426L ^ l)), (long)3733612965589230190L, (long)l)), false);
        this.l = AuthenticationStateTracker.w(this, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)14318, (long)(0x28F106D8D714FECAL ^ l)), (long)3733612965589230190L, (long)l)), false);
        this.r = AuthenticationStateTracker.R(this, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)5832, (long)(0x637F39FAFD51DFE6L ^ l)), (long)3733612965589230190L, (long)l)), false, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)577, (long)(0x556D450053D8CB62L ^ l)), (long)3733612965589230190L, (long)l)));
        this.t = NumericFormattingUtility.y(this, (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)5040, (long)(0x7DAC0EB7DF93DA95L ^ l)), (long)3733612965589230190L, (long)l)), (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)3827, (long)(0x1EF23095387EC7D2L ^ l)), (long)3733612965589230190L, (long)l)), (String)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)16227, (long)(0x94617C21A04764EL ^ l)), (long)3733612965589230190L, (long)l)), 50.0, 75.0, 125.0, 200.0, 5.0);
        this.R = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.e = new Random();
        this.G = new NetworkConfigManager();
        this.r.l(this.X);
        this.N(this.P, this.l, this.r, this.X, this.t, this.Y);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(long l, long l2) {
        int n = NetworkPacketRouter.i(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = N[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkPacketRouter.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkPacketRouter.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkPacketRouter.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkPacketRouter.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkPacketRouter.j(222059877232575L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkPacketRouter.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkPacketRouter.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkPacketRouter.j(222059877232575L, 0L);
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (N[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 49;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 33;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 18;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 4;
                break;
            }
            case 8: {
                n3 = 7;
                break;
            }
            case 9: {
                n3 = 43;
                break;
            }
            case 10: {
                n3 = 52;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 63;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 0;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 44;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 20;
                break;
            }
            case 22: {
                n3 = 23;
                break;
            }
            case 23: {
                n3 = 17;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 30;
                break;
            }
            case 26: {
                n3 = 10;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 37;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 34;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 53;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 61;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 27;
                break;
            }
            case 37: {
                n3 = 55;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 28;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 12;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 35;
                break;
            }
            case 47: {
                n3 = 48;
                break;
            }
            case 48: {
                n3 = 56;
                break;
            }
            case 49: {
                n3 = 21;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 57;
                break;
            }
            case 57: {
                n3 = 25;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 19;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 41;
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
        NetworkPacketRouter.N[n4] = new String(cArray);
        return n4;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkPacketRouter.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private boolean I(LightweightExecutionContext lightweightExecutionContext, List<LightweightExecutionContext> list) {
        for (LightweightExecutionContext lightweightExecutionContext2 : list) {
            try {
                if (lightweightExecutionContext.equals(lightweightExecutionContext2)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkPacketRouter.b(customSystemException);
            }
            try {
                if (!lightweightExecutionContext.M().equals(lightweightExecutionContext2.M())) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkPacketRouter.b(customSystemException);
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        block5: {
            block4: {
                try {
                    if (this.t.q() != 0.0) break block4;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
            }
            if (this.G.m((long)this.t.l())) {
                DimensionalMetricsTracker dimensionalMetricsTracker = this.R.poll();
                dimensionalMetricsTracker.H();
                this.G.m();
            }
            return;
        }
        while (!this.R.isEmpty()) {
            DimensionalMetricsTracker dimensionalMetricsTracker = this.R.poll();
            dimensionalMetricsTracker.H();
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = NetworkPacketRouter.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkPacketRouter.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void v() {
        this.L = false;
    }

    private boolean d(double d2) {
        boolean bl;
        double d3 = Math.max(Math.min(d2, 1.0), 0.0);
        try {
            bl = Math.random() <= d3;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        return bl;
    }

    private void D() {
        TransformationEngine transformationEngine = new TransformationEngine(ApplicationLifecycleManager.X().M());
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = new ArrayList();
        int n = 0;
        List<Integer> list = this.O();
        int n2 = 9;
        while (n2 < 36) {
            block36: {
                block32: {
                    ResourceLifecycleManager1543 resourceLifecycleManager1543 = transformationEngine.R().D().get(n2);
                    Object object = resourceLifecycleManager1543.y();
                    if (!((LightweightExecutionContext)object).Y()) {
                        boolean bl;
                        LightweightExecutionContext lightweightExecutionContext;
                        block35: {
                            block34: {
                                ProtocolInteractionController protocolInteractionController = ((LightweightExecutionContext)object).C();
                                try {
                                    block33: {
                                        try {
                                            try {
                                                if (protocolInteractionController.Y()) break block32;
                                                lightweightExecutionContext = object;
                                                if (((NetworkConnectionEstablisher)this.Y.J()).equals(this.B)) break block33;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NetworkPacketRouter.b(customSystemException);
                                            }
                                            if (!((NetworkConnectionEstablisher)this.Y.J()).equals(this.w)) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NetworkPacketRouter.b(customSystemException);
                                        }
                                    }
                                    bl = true;
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NetworkPacketRouter.b(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        try {
                            if (RuntimeResourceTracker.y(lightweightExecutionContext, bl)) {
                                arrayList.add(n2);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkPacketRouter.b(customSystemException);
                        }
                    }
                }
                try {
                    if (!this.P.s().booleanValue()) break block36;
                    n2 += 9;
                    if (++n != 3) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
                ++n2;
                n2 -= 27;
                n = 0;
                continue;
            }
            ++n2;
        }
        try {
            if (arrayList.isEmpty()) {
                this.x = true;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        try {
            if (this.l.s().booleanValue()) {
                Collections.shuffle(arrayList);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        n2 = 0;
        try {
            while (true) {
                try {
                    if (n2 >= list.size() || n2 >= arrayList.size()) break;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
                arrayList2.add(arrayList.get(n2));
                ++n2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        n2 = 0;
        for (Object object : arrayList2) {
            block39: {
                block38: {
                    boolean bl = false;
                    int n3 = 0;
                    if (this.r.s().booleanValue()) {
                        ProtocolInteractionController protocolInteractionController;
                        n3 = list.get(n2);
                        LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().l().F(n3);
                        if (lightweightExecutionContext.r() && (protocolInteractionController = lightweightExecutionContext.C()).r()) {
                            bl = true;
                        }
                    }
                    try {
                        if (!bl) break block38;
                        this.B(transformationEngine.R().D(), (Integer)object, 0, 0);
                        this.B(transformationEngine.R().D(), 36 + n3, 0, 0);
                        this.B(transformationEngine.R().D(), (Integer)object, 0, 0);
                        break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                }
                try {
                    this.B(transformationEngine.R().D(), (Integer)object, 0, 1);
                    if (this.S()) {
                        this.B(transformationEngine.R().D(), (Integer)object, 0, 1);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
            }
            ++n2;
        }
    }

    @Override
    public void h() {
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                this.T(false);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        try {
            if (this.O().size() == 0) {
                this.T(false);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        try {
            if (!this.r()) {
                this.T(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
    }

    private void B(int n, int n2, int n3, int n4) {
        this.R.add(new DimensionalMetricsTracker(n, n2, n3, n4));
    }

    @DataExchangeProtocol2090
    public void o(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block21: {
            block22: {
                block17: {
                    block20: {
                        block18: {
                            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                            block19: {
                                try {
                                    if (this.L) break block17;
                                    if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NetworkPacketRouter.b(customSystemException);
                                }
                                connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().R();
                                try {
                                    if (GeometryCalculator.C() < 35) break block19;
                                    OutputEncoder.p(connectionPoolOrchestrator1192);
                                    break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NetworkPacketRouter.b(customSystemException);
                                }
                            }
                            OutputEncoder.f(connectionPoolOrchestrator1192, true);
                            OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                            break block20;
                        }
                        this.L = true;
                    }
                    return;
                }
                try {
                    try {
                        if (!this.x) break block21;
                        if (ApplicationLifecycleManager.X().Y()) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                    ApplicationLifecycleManager.U().E();
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
            }
            this.x = false;
            this.R.clear();
            this.T(false);
            return;
        }
        try {
            if (!ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) {
                this.x = true;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        try {
            if (!this.R.isEmpty()) {
                this.e();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
        try {
            this.D();
            if (this.R.isEmpty()) {
                this.x = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketRouter.b(customSystemException);
        }
    }

    private static void d() {
        Object[] objectArray = F;
        F[0] = "0 y";
        objectArray[1] = Integer.TYPE;
        NetworkPacketRouter.N[1] = "java/lang/Integer";
        objectArray[2] = "\u00163|d\u000b$\u001d<m+v<\u000e;db";
        objectArray[3] = "u'W)nL~(Ff\u000fBu#B<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018\u0014=v\u001ay\u001c\u0002y\u0019\u001bgq\u0013adJz\u001e\u0014wip%\u0014\u0001w(\fx\f\u0007x\u0019";
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'A' || c == 'W' || c == 'M' || c == '\u00f3') {
                field = NetworkPacketRouter.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkPacketRouter.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field k(long l, long l2) {
        int n = NetworkPacketRouter.i(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = N[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkPacketRouter.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkPacketRouter.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkPacketRouter.e(clazz3, string2, clazz2)) != null) {
                    NetworkPacketRouter.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkPacketRouter.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkPacketRouter.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkPacketRouter.j(222059877232575L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private List<Integer> O() {
        long l = b ^ 0x727DE00FBDAEL;
        ArrayList<LightweightExecutionContext> arrayList = new ArrayList<LightweightExecutionContext>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Object[] objectArray = ApplicationLifecycleManager.U().l().C();
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext;
            block10: {
                lightweightExecutionContext = new LightweightExecutionContext(objectArray[i]);
                try {
                    if (lightweightExecutionContext.Y()) {
                        arrayList2.add(i);
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
                try {
                    try {
                        if (!this.r.s().booleanValue()) break block10;
                        if (!this.O(lightweightExecutionContext.C(), lightweightExecutionContext, arrayList)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                    arrayList2.add(i);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
            }
            try {
                if (!lightweightExecutionContext.toString().contains((CharSequence)((Object)NetworkPacketRouter.f("\u00d3", (int)NetworkPacketRouter.c("l", (int)28594, (long)(0x3C63F931BEAB4313L ^ l)), (long)-3001917650972915735L, (long)l)))) continue;
                arrayList2.add(i);
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkPacketRouter.b(customSystemException);
            }
        }
        return arrayList2;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkPacketRouter.i(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkPacketRouter.F[n] = clazz = Class.forName(N[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkPacketRouter.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private boolean S() {
        return this.d(0.2);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7AFC;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = NetworkPacketRouter.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkPacketRouter.o[n2] = n3;
        }
        return o[n2];
    }

    private boolean O(ProtocolInteractionController protocolInteractionController, LightweightExecutionContext lightweightExecutionContext, List<LightweightExecutionContext> list) {
        block13: {
            block14: {
                boolean bl;
                LightweightExecutionContext lightweightExecutionContext2;
                block12: {
                    block11: {
                        try {
                            try {
                                lightweightExecutionContext2 = lightweightExecutionContext;
                                if (!((NetworkConnectionEstablisher)this.Y.J()).equals(this.B) && !((NetworkConnectionEstablisher)this.Y.J()).equals(this.w)) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkPacketRouter.b(customSystemException);
                            }
                            bl = true;
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkPacketRouter.b(customSystemException);
                        }
                    }
                    bl = false;
                }
                try {
                    if (RuntimeResourceTracker.y(lightweightExecutionContext2, bl)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
                try {
                    try {
                        if (!this.X.b(lightweightExecutionContext, true)) break block13;
                        if (this.I(lightweightExecutionContext, list)) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketRouter.b(customSystemException);
                    }
                    list.add(lightweightExecutionContext);
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketRouter.b(customSystemException);
                }
            }
            return true;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkPacketRouter.b = MultiContainerRegistry.a(7888264836021508558L, 8608328339647518810L, MethodHandles.lookup().lookupClass()).a(49944479071155L);
                NetworkPacketRouter.F = new Object[5];
                NetworkPacketRouter.N = new String[5];
                NetworkPacketRouter.d();
                NetworkPacketRouter.v = new HashMap<K, V>(13);
                var0 = NetworkPacketRouter.b ^ 39174152654884L;
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "0-\u00a5\u00e0m\u0089\u0094\u0094\u00ba\u008f\u00ad\u007f*\u001aVX\fw\u0012\u00c9x7L\u00bd\u00fb0W\u00b6\u00bc1\u00dbw\u00d7\u00e0\u001a.;\u00aeF\u0088Q4\u00a2\u0005\u00cf\r\u00fd\u0004N\u001b$\u00f8\u00cb\u008a{\u00e5j\u00aeu\u00c0[N\u008f\u0095\u00e5\u00a1\u0087F\u00c0\u000b{\u0006\n\u0089\u0001(\u0097S-\u00e0g^\u00b0\u00d4\u00bc\u008d\u00f1l\u00c4\u0016\u00fd'K\u00be\u00fa\u009a<\u0097\u0096\u0007\u0005\u0084\u008d/C\u00ce9\u00e7\u00fa\u0086\u00cc\u00de";
                var7_6 = "0-\u00a5\u00e0m\u0089\u0094\u0094\u00ba\u008f\u00ad\u007f*\u001aVX\fw\u0012\u00c9x7L\u00bd\u00fb0W\u00b6\u00bc1\u00dbw\u00d7\u00e0\u001a.;\u00aeF\u0088Q4\u00a2\u0005\u00cf\r\u00fd\u0004N\u001b$\u00f8\u00cb\u008a{\u00e5j\u00aeu\u00c0[N\u008f\u0095\u00e5\u00a1\u0087F\u00c0\u000b{\u0006\n\u0089\u0001(\u0097S-\u00e0g^\u00b0\u00d4\u00bc\u008d\u00f1l\u00c4\u0016\u00fd'K\u00be\u00fa\u009a<\u0097\u0096\u0007\u0005\u0084\u008d/C\u00ce9\u00e7\u00fa\u0086\u00cc\u00de".length();
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
                    var6_5 = "\u00a1\u00ce]Fa\u00f8y`k\u0090+\u0094\u00a1\u007f\u00eb\u0002";
                    var7_6 = "\u00a1\u00ce]Fa\u00f8y`k\u0090+\u0094\u00a1\u007f\u00eb\u0002".length();
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
        NetworkPacketRouter.n = var8_3;
        NetworkPacketRouter.o = new Integer[16];
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkPacketRouter.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkPacketRouter.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

