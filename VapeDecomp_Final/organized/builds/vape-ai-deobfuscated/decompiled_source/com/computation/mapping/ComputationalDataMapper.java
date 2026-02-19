/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.computation.mapping;

import a.KB;
import a.tl;
import com.app.command.CommandExecutor;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.scenarios.ScenarioTemplateManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.streaming.DataStreamOrchestrator686;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionValidationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.math.computation.NumericComputationEngine1131;
import com.math.transformation.NumericTransformationEngine1068;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.query.builder.AdvancedQueryBuilder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthenticationTokenGenerator1968;
import com.security.auth.AuthorizationManager;
import com.security.cipher.CryptographicTransformation;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.simulation.world.WorldStateTransitioner;
import com.state.management.StateTransitionController1864;
import com.strategy.selection.StrategySelectionController;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.timing.tracking.TimestampTracker;
import com.transaction.management.TransactionOrchestrator1017;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class ComputationalDataMapper
extends ContextTransformationEngine<DataStreamOrchestrator686> {
    private int B;
    private static final String[] Z;
    private int G;
    private NumericTransformationEngine1068 z;
    private final Map<ConnectionLifecycleHandler, Long> h;
    private static final Map L;
    private double d;
    private final ObjectLifecycleMediator P;
    public final NumericFormattingUtility T;
    private double o;
    private static final long[] n;
    private double t;
    private final AdaptiveRenderingEngine V;
    private boolean A;
    private static final Integer[] K;
    private double N;
    private double e;
    private final Map<Integer, TimestampTracker> R;
    private double l;
    private static final long m;
    private static final Object[] Y;
    private double x;
    private final AuthenticationStateTracker v;
    private double r;
    private int O;
    private double j;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ComputationalDataMapper.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00df' || c == 'I' || c == '\u00f8') {
                field = ComputationalDataMapper.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ComputationalDataMapper.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ComputationalDataMapper.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = Y;
        Y[0] = "\u0010{D1";
        objectArray[1] = Void.TYPE;
        ComputationalDataMapper.Z[1] = "java/lang/Void";
        objectArray[2] = "ED\u007f";
        objectArray[3] = Integer.TYPE;
        ComputationalDataMapper.Z[3] = "java/lang/Integer";
        objectArray[4] = "N!Q\u0007X\u001eE.@H%\u0006V)I\u0001";
        objectArray[5] = "^wRc";
        objectArray[6] = "ix\u0012y[Xbw\u00036:Vi|\u0007l";
        objectArray[7] = "1p`1d.!b`\u000b\u0019\u0016aq84\"habgwZ/63ei7i87!\u000b";
        objectArray[8] = "0:\u0000U5[ (\u0000o`cb/\u0004Ti\u000e$!\u0000\u0010\u000b";
        objectArray[9] = "\f\u001acja\u0000\u001c\bcP\u00158^\u000fgk=U\u0018\u0001c/_";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "zm^\u0015\u0012yxr\u0019Lh,8\u001f]\u001eS$#u\n\u0011VyC$V\u0015Wz{{W\f\u0003G";
    }

    private void B() {
        ObjectLifecycleMediator.R(this::lambda$reset$0);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ComputationalDataMapper.a(l, l2);
            object = Y[n];
            try {
                if (!(object instanceof String)) break block2;
                ComputationalDataMapper.Y[n] = clazz = Class.forName(Z[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ComputationalDataMapper.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ComputationalDataMapper.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean Q(ConnectionLifecycleHandler connectionLifecycleHandler) {
        try {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.UV)) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
            boolean bl;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.Y()) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            NetworkConnectionManager1286 networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler);
            try {
                bl = networkConnectionManager1286.h() == systemConfigurationOrchestrator.X();
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            return bl;
        }
        return false;
    }

    private boolean d(NumericTransformationEngine1068 numericTransformationEngine1068) {
        boolean bl;
        try {
            if (this.z == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        NumericTransformationEngine1068 numericTransformationEngine10682 = this.i();
        try {
            if (numericTransformationEngine10682 == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        double d2 = NumericTransformationEngine1068.d(numericTransformationEngine10682, this.z);
        double d3 = NumericTransformationEngine1068.d(numericTransformationEngine10682, numericTransformationEngine1068);
        try {
            bl = d3 > d2 + 0.001;
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B53;
        if (K[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ComputationalDataMapper.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])L.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    L.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ComputationalDataMapper.K[n2] = n3;
        }
        return K[n2];
    }

    private boolean D(ConnectionLifecycleHandler connectionLifecycleHandler) {
        try {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.UV)) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
            boolean bl;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.Y()) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            NetworkConnectionManager1286 networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler);
            try {
                bl = networkConnectionManager1286.h() == systemConfigurationOrchestrator.X();
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            return bl;
        }
        try {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rD)) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        try {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.Fg)) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        return false;
    }

    private void v(CryptographicTransformer cryptographicTransformer) {
        block7: {
            try {
                if (cryptographicTransformer == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            int n = cryptographicTransformer.X();
            try {
                try {
                    if (n == this.G || n == this.B) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                this.B = n;
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
        }
    }

    @Override
    public void v() {
        long l = m ^ 0x7D5D06F4571L;
        ComputationalDataMapper.c("\u00d1", (Object)this, (long)-4162410682491554297L, (long)l);
    }

    private NumericTransformationEngine1068 i() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        return new NumericTransformationEngine1068(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B());
    }

    private static Method d(long l, long l2) {
        int n = ComputationalDataMapper.a(l, l2);
        Object object = Y[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Z[n];
                int n3 = string2.indexOf(8);
                clazz3 = ComputationalDataMapper.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ComputationalDataMapper.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ComputationalDataMapper.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ComputationalDataMapper.Y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ComputationalDataMapper.b(445282077444304L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ComputationalDataMapper.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ComputationalDataMapper.Y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ComputationalDataMapper.b(445282077444304L, 0L);
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

    private void V() {
        long l = m ^ 0x6DD3D85B3CA9L;
        if (this.B != -1) {
            block8: {
                this.G = this.B;
                this.B = -1;
                this.z = null;
                TimestampTracker timestampTracker = this.R.get(this.G);
                if (timestampTracker != null) {
                    NumericTransformationEngine1068 numericTransformationEngine1068 = timestampTracker.P();
                    this.K(numericTransformationEngine1068.h(), numericTransformationEngine1068.i(), numericTransformationEngine1068.I());
                } else if (ApplicationLifecycleManager.c().r()) {
                    CryptographicTransformer cryptographicTransformer = ApplicationLifecycleManager.c().I(this.G);
                    try {
                        try {
                            if (cryptographicTransformer == null || !cryptographicTransformer.r()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComputationalDataMapper.a(customSystemException);
                        }
                        this.K(cryptographicTransformer.F(), cryptographicTransformer.V(), cryptographicTransformer.B());
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalDataMapper.a(customSystemException);
                    }
                }
            }
            ComputationalDataMapper.c("\u00d1", (Object)this, (long)-4619558968947938699L, (long)l);
        }
    }

    @DataExchangeProtocol2090
    public void e(KB kB) {
        block12: {
            ComputationalDataMapper computationalDataMapper;
            block13: {
                int n;
                block11: {
                    long l = m ^ 0x633C69099E94L;
                    this.l = this.d;
                    String string = ScenarioTemplateManager.f();
                    try {
                        try {
                            try {
                                this.j = this.e;
                                this.N = this.t;
                                n = this.G;
                                if (string == null) break block11;
                                if (n == -1) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ComputationalDataMapper.a(customSystemException);
                            }
                            computationalDataMapper = this;
                            if (string == null) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComputationalDataMapper.a(customSystemException);
                        }
                        n = computationalDataMapper.O;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalDataMapper.a(customSystemException);
                    }
                }
                try {
                    if (n <= 0) break block12;
                    this.d += (this.r - this.d) / (double)this.O;
                    this.e += (this.x - this.e) / (double)this.O;
                    this.t += (this.o - this.t) / (double)this.O;
                    computationalDataMapper = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
            }
            --computationalDataMapper.O;
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                ScenarioTemplateManager.v("UIqszc");
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$reset$0() {
        long l = m ^ 0x44ED179E6F0DL;
        ComputationalDataMapper.c("\u00d1", (Object)this, (long)-1423086178543453743L, (long)l);
        this.R.clear();
        this.G = -1;
        this.B = -1;
        this.z = null;
        this.K(0.0, 0.0, 0.0);
    }

    private static Field c(long l, long l2) {
        int n = ComputationalDataMapper.a(l, l2);
        Object object = Y[n];
        if (object instanceof String) {
            String string = Z[n];
            int n2 = string.indexOf(8);
            Class clazz = ComputationalDataMapper.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ComputationalDataMapper.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ComputationalDataMapper.a(clazz3, string2, clazz2)) != null) {
                    ComputationalDataMapper.Y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ComputationalDataMapper.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ComputationalDataMapper.Y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ComputationalDataMapper.b(445282077444304L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void U(double d2, double d3, double d4) {
        long l = m ^ 0x4B16DF4D29ABL;
        this.r = d2;
        this.x = d3;
        this.o = d4;
        this.O = (int)ComputationalDataMapper.a("x", (int)9236, (long)(0x3F5F47F92B5C45A1L ^ l));
    }

    private void K(double d2, double d3, double d4) {
        this.d = this.l = d2;
        this.r = this.l;
        this.e = this.j = d3;
        this.x = this.j;
        this.t = this.N = d4;
        this.o = this.N;
        this.O = 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ComputationalDataMapper.m = MultiContainerRegistry.a(-2493554071056327980L, 8580702885007510250L, MethodHandles.lookup().lookupClass()).a(168015100801187L);
                ComputationalDataMapper.Y = new Object[11];
                ComputationalDataMapper.Z = new String[11];
                ComputationalDataMapper.a();
                ComputationalDataMapper.L = new HashMap<K, V>(13);
                var0 = ComputationalDataMapper.m ^ 20035490089020L;
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
                var6_5 = "W1\u00b9E\u00b0;ov \u00d5\u0083g\u00ca$ZrA\u00cd8e\u00ba\u00dd\u00cb\u00de\u00a0W\u00a7\t6\u00c2\u00ce\u001b";
                var7_6 = "W1\u00b9E\u00b0;ov \u00d5\u0083g\u00ca$ZrA\u00cd8e\u00ba\u00dd\u00cb\u00de\u00a0W\u00a7\t6\u00c2\u00ce\u001b".length();
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
                    var6_5 = "\u001b\u00d6\u001e!\u00f3\u00ce3\u0015\u0098\u00c9\u00e4\u00b0\u00a8w\u00b3\u009d";
                    var7_6 = "\u001b\u00d6\u001e!\u00f3\u00ce3\u0015\u0098\u00c9\u00e4\u00b0\u00a8w\u00b3\u009d".length();
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
        ComputationalDataMapper.n = var8_3;
        ComputationalDataMapper.K = new Integer[6];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ComputationalDataMapper.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ComputationalDataMapper.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void y(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        CryptographicTransformer cryptographicTransformer;
        block16: {
            try {
                if (!this.v.s().booleanValue()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            try {
                if (this.G == -1) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            try {
                if (ApplicationLifecycleManager.c().Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            cryptographicTransformer = ApplicationLifecycleManager.c().I(this.G);
            try {
                try {
                    if (cryptographicTransformer != null && cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
        }
        TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        float f = ApplicationLifecycleManager.K().h();
        double d5 = this.l + (this.d - this.l) * (double)f;
        double d6 = this.j + (this.e - this.j) * (double)f;
        double d7 = this.N + (this.t - this.N) * (double)f;
        try {
            eventDispatchRegistry2111.getEntityRenderer().H(1.0);
            GL11.glBlendFunc((int)770, (int)771);
            tl.N();
            tl.s();
            tl.R();
            tl.R(false);
            if (GameVersionEnumerator.MC_1_21_4.Q()) {
                GL11.glLineWidth((float)1.5f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalDataMapper.a(customSystemException);
        }
        double d8 = transactionOrchestrator1017.S().f() - transactionOrchestrator1017.S().F() + (double)transactionOrchestrator1017.g();
        double d9 = d8 / 2.0;
        CryptoContextNegotiator684.Y();
        CryptoContextNegotiator684.x(d5 - d9, d6 + 0.01, d7 - d9, d8, transactionOrchestrator1017.L(), d8, 1.0, this.V.L().darker().darker(), this.V.L(), d2, d3, d4);
        CryptoContextNegotiator684.J();
        tl.R(true);
        tl.B();
        tl.j();
        eventDispatchRegistry2111.getEntityRenderer().F(1.0);
    }

    private boolean m(ConnectionLifecycleHandler connectionLifecycleHandler) {
        return false;
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
        if (Z[n4] != null) {
            return n4;
        }
        Object object = Y[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 6;
                break;
            }
            case 1: {
                n3 = 55;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 34;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 60;
                break;
            }
            case 7: {
                n3 = 54;
                break;
            }
            case 8: {
                n3 = 35;
                break;
            }
            case 9: {
                n3 = 19;
                break;
            }
            case 10: {
                n3 = 53;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 40;
                break;
            }
            case 14: {
                n3 = 25;
                break;
            }
            case 15: {
                n3 = 63;
                break;
            }
            case 16: {
                n3 = 7;
                break;
            }
            case 17: {
                n3 = 21;
                break;
            }
            case 18: {
                n3 = 43;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 29;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 0;
                break;
            }
            case 24: {
                n3 = 3;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 14;
                break;
            }
            case 27: {
                n3 = 30;
                break;
            }
            case 28: {
                n3 = 49;
                break;
            }
            case 29: {
                n3 = 61;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 15;
                break;
            }
            case 35: {
                n3 = 1;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 28;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 10;
                break;
            }
            case 41: {
                n3 = 47;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 52;
                break;
            }
            case 44: {
                n3 = 26;
                break;
            }
            case 45: {
                n3 = 37;
                break;
            }
            case 46: {
                n3 = 17;
                break;
            }
            case 47: {
                n3 = 31;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 11;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 20;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 57;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 32;
                break;
            }
            case 60: {
                n3 = 36;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 33;
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
        ComputationalDataMapper.Z[n4] = new String(cArray);
        return n4;
    }

    public ComputationalDataMapper(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = m ^ 0x4A9291692109L;
        super(contextualExecutionFramework, string);
        this.T = NumericFormattingUtility.P(this, (String)((Object)ComputationalDataMapper.c("\u00e2", (int)ComputationalDataMapper.a("x", (int)5982, (long)(0x67CE0DBEB9517E48L ^ l)), (long)-6754099973973830248L, (long)l)), (String)((Object)ComputationalDataMapper.c("\u00e2", (int)ComputationalDataMapper.a("x", (int)22243, (long)(0x39AB8F5E587A3FF3L ^ l)), (long)-6754099973973830248L, (long)l)), (String)((Object)ComputationalDataMapper.c("\u00e2", (int)ComputationalDataMapper.a("x", (int)28304, (long)(0x71BEA1C5BB098784L ^ l)), (long)-6754099973973830248L, (long)l)), 0.0, 50.0, 100.0, 500.0);
        this.v = AuthenticationStateTracker.w(this, (String)((Object)ComputationalDataMapper.c("\u00e2", (int)ComputationalDataMapper.a("x", (int)8204, (long)(0x42FF92EB73EC919L ^ l)), (long)-6754099973973830248L, (long)l)), true);
        this.V = AdaptiveRenderingEngine.M(this, (String)((Object)ComputationalDataMapper.c("\u00e2", (int)ComputationalDataMapper.a("x", (int)30627, (long)(0x1E5C74038A211EB2L ^ l)), (long)-6754099973973830248L, (long)l)), new Color(5, 134, 105), 100);
        this.P = ObjectLifecycleMediator.P;
        this.h = new LinkedHashMap<ConnectionLifecycleHandler, Long>();
        this.R = new HashMap<Integer, TimestampTracker>();
        this.B = -1;
        this.G = -1;
        this.v.l(this.V);
        this.N(this.T, this.v, this.V);
    }

    private void c() {
        block11: {
            block12: {
                long l = m ^ 0x9CF3C547399L;
                String string = ScenarioTemplateManager.f();
                try {
                    if (this.h.isEmpty()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (string == null) break block11;
                    if (!systemConfigurationOrchestrator.r()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                AuthorizationManager authorizationManager = systemConfigurationOrchestrator.U();
                try {
                    if (string == null) break block11;
                    if (!authorizationManager.r()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                for (ConnectionLifecycleHandler connectionLifecycleHandler : this.h.keySet()) {
                    try {
                        this.P.Q(connectionLifecycleHandler, authorizationManager);
                        if (string != null) {
                            if (string != null) continue;
                            break;
                        }
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalDataMapper.a(customSystemException);
                    }
                }
            }
            this.h.clear();
        }
    }

    private NumericTransformationEngine1068 R(ConnectionLifecycleHandler connectionLifecycleHandler, NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block28: {
            Object object;
            int n;
            TimestampTracker timestampTracker;
            block27: {
                block25: {
                    long l = m ^ 0x799FAE3E463CL;
                    timestampTracker = null;
                    n = -1;
                    if (connectionLifecycleHandler.B(ReflectionMetadataResolver.b)) {
                        object = new StrategySelectionController(connectionLifecycleHandler);
                        CryptographicTransformer cryptographicTransformer = ((StrategySelectionController)object).c(networkPacketOrchestrator1222.getWorld());
                        if (cryptographicTransformer.r()) {
                            block24: {
                                n = cryptographicTransformer.X();
                                timestampTracker = this.R.get(n);
                                try {
                                    if (timestampTracker == null) break block24;
                                    timestampTracker.S((StrategySelectionController)object);
                                    break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ComputationalDataMapper.a(customSystemException);
                                }
                            }
                            TimestampTracker timestampTracker2 = TimestampTracker.d(cryptographicTransformer);
                            timestampTracker2.S((StrategySelectionController)object);
                            this.R.put(n, timestampTracker2);
                            timestampTracker = timestampTracker2;
                        }
                    } else if (connectionLifecycleHandler.B(ReflectionMetadataResolver.YS)) {
                        block26: {
                            object = new TransactionValidationEngine(connectionLifecycleHandler);
                            n = ((TransactionValidationEngine)object).K();
                            timestampTracker = this.R.get(n);
                            try {
                                if (timestampTracker == null) break block26;
                                timestampTracker.B((TransactionValidationEngine)object);
                                break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ComputationalDataMapper.a(customSystemException);
                            }
                        }
                        timestampTracker = new TimestampTracker(((TransactionValidationEngine)object).I(), ((TransactionValidationEngine)object).S(), ((TransactionValidationEngine)object).d());
                        this.R.put(n, timestampTracker);
                    } else {
                        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bm)) {
                            AdvancedQueryBuilder advancedQueryBuilder = new AdvancedQueryBuilder(connectionLifecycleHandler);
                            this.R.put(advancedQueryBuilder.D(), new TimestampTracker(advancedQueryBuilder.X(), advancedQueryBuilder.Q(), advancedQueryBuilder.Z()));
                            return null;
                        }
                        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rT)) {
                            CryptographicTransformation cryptographicTransformation = new CryptographicTransformation(connectionLifecycleHandler);
                            for (int n2 : cryptographicTransformation.F()) {
                                try {
                                    this.R.remove(n2);
                                    if (n2 != this.G) continue;
                                    this.G = -1;
                                    this.z = null;
                                    ComputationalDataMapper.c("\u00d1", (Object)this, (long)-4219569541689765664L, (long)l);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ComputationalDataMapper.a(customSystemException);
                                }
                            }
                            return null;
                        }
                        try {
                            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rE)) {
                                ComputationalDataMapper.c("\u00d1", (Object)this, (long)-4219490479124925110L, (long)l);
                                return null;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComputationalDataMapper.a(customSystemException);
                        }
                    }
                }
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H() || !connectionLifecycleHandler.B(ReflectionMetadataResolver.YY)) break block27;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                object = new AuthenticationTokenGenerator1968(connectionLifecycleHandler);
                n = ((AuthenticationTokenGenerator1968)object).h();
                timestampTracker = this.R.get(n);
                try {
                    if (timestampTracker != null) {
                        timestampTracker.j((AuthenticationTokenGenerator1968)object);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
            }
            try {
                if (n != this.G || timestampTracker == null) break block28;
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalDataMapper.a(customSystemException);
            }
            object = timestampTracker.P();
            this.U(((NumericTransformationEngine1068)object).h(), ((NumericTransformationEngine1068)object).i(), ((NumericTransformationEngine1068)object).I());
            return object;
        }
        return null;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void e(NetworkPacketOrchestrator1222 var1_1) {
        block91: {
            block92: {
                block89: {
                    block81: {
                        block87: {
                            block93: {
                                block88: {
                                    block86: {
                                        block80: {
                                            block79: {
                                                block78: {
                                                    block76: {
                                                        block77: {
                                                            block74: {
                                                                block75: {
                                                                    block72: {
                                                                        block69: {
                                                                            block70: {
                                                                                var2_2 = ComputationalDataMapper.m ^ 104979022783558L;
                                                                                var4_3 = ScenarioTemplateManager.f();
                                                                                try {
                                                                                    v0 = this.h.isEmpty();
                                                                                    if (var4_3 == null) break block69;
                                                                                    if (v0 != 0) break block70;
                                                                                }
                                                                                catch (CustomSystemException v1) {
                                                                                    throw ComputationalDataMapper.a(v1);
                                                                                }
                                                                                var5_4 = ApplicationLifecycleManager.y();
                                                                                if (!var5_4.r()) ** GOTO lbl41
                                                                                var6_5 = System.currentTimeMillis();
                                                                                var8_7 = this.h.entrySet().iterator();
                                                                                while (var8_7.hasNext()) {
                                                                                    block71: {
                                                                                        var9_8 = var8_7.next();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var4_3 == null) break block71;
                                                                                                    cfr_temp_0 = var6_5 - var9_8.getValue();
                                                                                                    v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                    if (var4_3 == null) break block69;
                                                                                                }
                                                                                                catch (CustomSystemException v2) {
                                                                                                    throw ComputationalDataMapper.a(v2);
                                                                                                }
                                                                                                if (v0 < 0) break;
                                                                                            }
                                                                                            catch (CustomSystemException v3) {
                                                                                                throw ComputationalDataMapper.a(v3);
                                                                                            }
                                                                                            this.P.Q((ConnectionLifecycleHandler)var9_8.getKey(), (AuthorizationManager)var5_4);
                                                                                            var8_7.remove();
                                                                                        }
                                                                                        catch (CustomSystemException v4) {
                                                                                            throw ComputationalDataMapper.a(v4);
                                                                                        }
                                                                                    }
                                                                                    if (var4_3 != null) continue;
                                                                                    AbstractComputationKernel.I(new String[4]);
                                                                                    break;
                                                                                }
                                                                                try {
                                                                                    if (var4_3 != null) break block70;
lbl41:
                                                                                    // 2 sources

                                                                                    this.h.clear();
                                                                                }
                                                                                catch (CustomSystemException v5) {
                                                                                    throw ComputationalDataMapper.a(v5);
                                                                                }
                                                                            }
                                                                            try {
                                                                                this.V();
                                                                                if (var4_3 == null) break block72;
                                                                                v0 = var1_1.getWorld().Y();
                                                                            }
                                                                            catch (CustomSystemException v6) {
                                                                                throw ComputationalDataMapper.a(v6);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block73: {
                                                                                try {
                                                                                    try {
                                                                                        if (v0 != 0) break block73;
                                                                                        v7 = var1_1;
                                                                                        if (var4_3 == null) break block74;
                                                                                    }
                                                                                    catch (CustomSystemException v8) {
                                                                                        throw ComputationalDataMapper.a(v8);
                                                                                    }
                                                                                    if (!v7.getThePlayer().Y()) break block75;
                                                                                }
                                                                                catch (CustomSystemException v9) {
                                                                                    throw ComputationalDataMapper.a(v9);
                                                                                }
                                                                            }
                                                                            ComputationalDataMapper.c("\u00d1", (Object)this, (long)2813400934001210010L, (long)var2_2);
                                                                            this.G = -1;
                                                                        }
                                                                        catch (CustomSystemException v10) {
                                                                            throw ComputationalDataMapper.a(v10);
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                v7 = var1_1;
                                                            }
                                                            var5_4 = v7.getPacket();
                                                            try {
                                                                v11 = this.P.n((ConnectionLifecycleHandler)var5_4);
                                                                if (var4_3 == null) break block76;
                                                                if (!v11) break block77;
                                                            }
                                                            catch (CustomSystemException v12) {
                                                                throw ComputationalDataMapper.a(v12);
                                                            }
                                                            return;
                                                        }
                                                        v11 = GameVersionEnumerator.MC_1_21_4.H();
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (var4_3 == null) break block78;
                                                                if (v11) {
                                                                }
                                                                ** GOTO lbl114
                                                            }
                                                            catch (CustomSystemException v13) {
                                                                throw ComputationalDataMapper.a(v13);
                                                            }
                                                            v14 = var5_4;
                                                            if (var4_3 == null) break block79;
                                                        }
                                                        catch (CustomSystemException v15) {
                                                            throw ComputationalDataMapper.a(v15);
                                                        }
                                                        v11 = v14.B(ReflectionMetadataResolver.bs);
                                                    }
                                                    catch (CustomSystemException v16) {
                                                        throw ComputationalDataMapper.a(v16);
                                                    }
                                                }
                                                if (!v11) ** GOTO lbl114
                                                var7_9 = new StateTransitionController1864(var5_4);
                                                var6_6 /* !! */  = var7_9.I();
                                                try {
                                                    if (var4_3 != null) break block80;
lbl114:
                                                    // 3 sources

                                                    v14 = var5_4;
                                                }
                                                catch (CustomSystemException v17) {
                                                    throw ComputationalDataMapper.a(v17);
                                                }
                                            }
                                            var6_6 /* !! */  = Collections.singletonList(v14);
                                        }
                                        var7_9 = null;
                                        for (Object var9_8 : var6_6 /* !! */ ) {
                                            block85: {
                                                block84: {
                                                    block83: {
                                                        block82: {
                                                            var10_10 = this.R((ConnectionLifecycleHandler)var9_8, var1_1);
                                                            try {
                                                                try {
                                                                    v18 = var10_10;
                                                                    if (var4_3 == null) break block81;
                                                                    if (var4_3 == null) break block82;
                                                                }
                                                                catch (CustomSystemException v19) {
                                                                    throw ComputationalDataMapper.a(v19);
                                                                }
                                                                if (v18 == null) break block83;
                                                            }
                                                            catch (CustomSystemException v20) {
                                                                throw ComputationalDataMapper.a(v20);
                                                            }
                                                            v21 = var10_10;
                                                        }
                                                        var7_9 = v21;
                                                    }
                                                    try {
                                                        try {
                                                            v22 = this;
                                                            if (var4_3 == null) break block84;
                                                            if (!v22.Q((ConnectionLifecycleHandler)var9_8)) break block85;
                                                        }
                                                        catch (CustomSystemException v23) {
                                                            throw ComputationalDataMapper.a(v23);
                                                        }
                                                        v22 = this;
                                                    }
                                                    catch (CustomSystemException v24) {
                                                        throw ComputationalDataMapper.a(v24);
                                                    }
                                                }
                                                ComputationalDataMapper.c("\u00d1", (Object)v22, (long)2813400934001210010L, (long)var2_2);
                                                return;
                                            }
                                            if (var4_3 != null) continue;
                                        }
                                        try {
                                            try {
                                                try {
                                                    v25 = this.G;
                                                    if (var4_3 == null) break block86;
                                                    if (v25 != -1) break block87;
                                                }
                                                catch (CustomSystemException v26) {
                                                    throw ComputationalDataMapper.a(v26);
                                                }
                                                v27 = this;
                                                if (var4_3 == null) break block88;
                                            }
                                            catch (CustomSystemException v28) {
                                                throw ComputationalDataMapper.a(v28);
                                            }
                                            v25 = (int)v27.h.isEmpty();
                                        }
                                        catch (CustomSystemException v29) {
                                            throw ComputationalDataMapper.a(v29);
                                        }
                                    }
                                    if (v25 != 0) break block93;
                                    v27 = this;
                                }
                                ComputationalDataMapper.c("\u00d1", (Object)v27, (long)2813400934001210010L, (long)var2_2);
                            }
                            return;
                        }
                        v18 = var7_9;
                    }
                    try {
                        if (v18 != null) {
                            this.A = this.d((NumericTransformationEngine1068)var7_9);
                            this.z = var7_9;
                        }
                    }
                    catch (CustomSystemException v30) {
                        throw ComputationalDataMapper.a(v30);
                    }
                    try {
                        try {
                            block90: {
                                try {
                                    try {
                                        v31 = this.A;
                                        if (var4_3 == null) break block89;
                                        if (!v31) break block90;
                                    }
                                    catch (CustomSystemException v32) {
                                        throw ComputationalDataMapper.a(v32);
                                    }
                                    var1_1.setCanceled(true);
                                    ComputationalDataMapper.c("\u00d1", (Object)this, (Object)var5_4, (long)2812747434473252677L, (long)var2_2);
                                    if (var4_3 != null) break block91;
                                }
                                catch (CustomSystemException v33) {
                                    throw ComputationalDataMapper.a(v33);
                                }
                            }
                            v34 = this;
                            if (var4_3 == null) break block92;
                        }
                        catch (CustomSystemException v35) {
                            throw ComputationalDataMapper.a(v35);
                        }
                        v31 = v34.h.isEmpty();
                    }
                    catch (CustomSystemException v36) {
                        throw ComputationalDataMapper.a(v36);
                    }
                }
                if (v31) break block91;
                v34 = this;
            }
            ComputationalDataMapper.c("\u00d1", (Object)v34, (long)2813400934001210010L, (long)var2_2);
        }
    }

    @DataExchangeProtocol2090
    public void s(CommandExecutor commandExecutor) {
        this.v(commandExecutor.getTarget());
    }

    @DataExchangeProtocol2090
    public void s(WorldStateTransitioner worldStateTransitioner) {
        long l = m ^ 0x324B8C78F7CCL;
        ComputationalDataMapper.c("\u00d1", (Object)this, (long)8395008875540710586L, (long)l);
    }

    private void K(ConnectionLifecycleHandler connectionLifecycleHandler) {
        block4: {
            Object object;
            long l;
            block5: {
                long l2 = m ^ 0xC4E03DFE42DL;
                long l3 = (long)this.T.l();
                l = System.currentTimeMillis() + l3;
                String string = ScenarioTemplateManager.f();
                try {
                    object = this.h;
                    if (string == null) break block4;
                    if (object.isEmpty()) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                long l4 = (Long)((Map.Entry)this.h.entrySet().toArray()[this.h.size() - 1]).getValue();
                try {
                    if (string == null) break block4;
                    if (l >= l4) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalDataMapper.a(customSystemException);
                }
                l = l4 + 1L;
            }
            object = this.h.put(connectionLifecycleHandler, l);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ComputationalDataMapper.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ComputationalDataMapper.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

