/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import a.KB;
import a.a;
import a.oQ;
import com.adapter.management.GenericAdapterManager;
import com.app.command.CommandExecutor;
import com.app.security.tokens.SecurityTokenGenerator2037;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.math.orchestration.NumericTransformationOrchestrator;
import com.math.transformation.NumericTransformationEngine357;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.event.NetworkEventDispatcher;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.security.crypto.CryptographicContextManager1918;
import com.security.execution.CryptoOperationCoordinator;
import com.security.interception.CryptoResourceInterceptor;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AdaptiveCommunicationManager
extends ContextualExecutionFramework {
    public AuthenticationGateway1860 Z;
    private static final long[] d;
    private boolean K;
    private static final String[] m;
    private static final Map j;
    private final AuthenticationGateway1860 A;
    private final AuthenticationGateway1860 e;
    private boolean P;
    private static final Integer[] h;
    private static final long b;
    public GenericAdapterManager r;
    private static final Object[] l;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveCommunicationManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveCommunicationManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveCommunicationManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void h() {
        this.K = false;
    }

    private static Method d(long l, long l2) {
        int n = AdaptiveCommunicationManager.a(l, l2);
        Object object = AdaptiveCommunicationManager.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveCommunicationManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveCommunicationManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveCommunicationManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveCommunicationManager.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveCommunicationManager.b(313258022461726L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveCommunicationManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveCommunicationManager.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveCommunicationManager.b(313258022461726L, 0L);
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

    private void V(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        try {
            if (this.P) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCommunicationManager.a(customSystemException);
        }
        for (double d2 : new double[]{0.040009234827343, 0.0, 0.030009234827343, 0.0}) {
            try {
                if (GeometryCalculator.C() > 13) {
                    systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() + d2, systemConfigurationOrchestrator.B(), false));
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCommunicationManager.a(customSystemException);
            }
            systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.e(systemConfigurationOrchestrator.F(), ((oQ)systemConfigurationOrchestrator.L()).c() + d2, systemConfigurationOrchestrator.V() + d2, systemConfigurationOrchestrator.B(), false));
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5AC9;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveCommunicationManager.h[n2] = n3;
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveCommunicationManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @DataExchangeProtocol2090
    public void X(KB kB) {
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "KnJ";
        objectArray[1] = Integer.TYPE;
        AdaptiveCommunicationManager.m[1] = "java/lang/Integer";
        objectArray[2] = "Lg>wTnGh/8)vTo&q";
        objectArray[3] = Boolean.TYPE;
        AdaptiveCommunicationManager.m[3] = "java/lang/Boolean";
        objectArray[4] = "\u0017\u0000\u001f\u001a\f\u0012\u001c\u000f\u000eUm\u001c\u0017\u0004\n\u000f";
        objectArray[5] = " (\tS(a%+\u0007:2m\u001bc\u0011Uh|%%\u0017\u0004c\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\u00029\u001cQ0\\\u0007:\u00128 A9:\f\\rEK5ZDK\u0000\u00004\\Y \u0003K7\u00078";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == 'E' || c == 'U' || c == 'C') {
                field = AdaptiveCommunicationManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveCommunicationManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void z(boolean bl) {
        this.P = bl;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public AdaptiveCommunicationManager() {
        long l = b ^ 0x4BB375F1D3EFL;
        super(a.cs((int)AdaptiveCommunicationManager.a("z", (int)12786, (long)(0x3702B2E7F6E51525L ^ l))), new Color(193, 183, 92).getRGB(), RecursiveNodeGraph.G, a.cs((int)AdaptiveCommunicationManager.a("z", (int)9241, (long)(0x6D9E734848D780CDL ^ l))));
        this.A = new AuthenticationGateway1860((String)((Object)AdaptiveCommunicationManager.c("\u00f4", (int)AdaptiveCommunicationManager.a("z", (int)14691, (long)(0x16C990938EF89DB6L ^ l)), (long)-135720499625718971L, (long)l)));
        this.e = new AuthenticationGateway1860((String)((Object)AdaptiveCommunicationManager.c("\u00f4", (int)AdaptiveCommunicationManager.a("z", (int)23126, (long)(0x46CD9B8D54B4FE80L ^ l)), (long)-135720499625718971L, (long)l)));
        this.Z = new AuthenticationGateway1860((String)((Object)AdaptiveCommunicationManager.c("\u00f4", (int)AdaptiveCommunicationManager.a("z", (int)17663, (long)(0x28AC74FB8D3A602EL ^ l)), (long)-135720499625718971L, (long)l)));
        this.r = GenericAdapterManager.I(this, (String)((Object)AdaptiveCommunicationManager.c("\u00f4", (int)AdaptiveCommunicationManager.a("z", (int)30359, (long)(0x25FB2AC1A7C3D247L ^ l)), (long)-135720499625718971L, (long)l)), (String)((Object)AdaptiveCommunicationManager.c("\u00f4", (int)AdaptiveCommunicationManager.a("z", (int)2888, (long)(0x2F1E51860A3C2F9BL ^ l)), (long)-135720499625718971L, (long)l)), this.A, this.A, this.Z);
        this.N(this.r);
    }

    @Override
    public boolean j() {
        return true;
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveCommunicationManager.b = MultiContainerRegistry.a(2753718212543671373L, -5219559506495600502L, MethodHandles.lookup().lookupClass()).a(229036583991737L);
                AdaptiveCommunicationManager.l = new Object[7];
                AdaptiveCommunicationManager.m = new String[7];
                AdaptiveCommunicationManager.a();
                AdaptiveCommunicationManager.j = new HashMap<K, V>(13);
                var0 = AdaptiveCommunicationManager.b ^ 50781151167747L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "f\u00c0\u00e8\u0085\u00e2\u0082\u00be\u0088\u008e=\tAWGh\u000b\u00cfd\u00fa.%\u008a\u00fb\u00ff\u00dd\u0080\u00a1{\u00c2\u0097\u00cc\u00bd}=Ue\t<q\t";
                var7_6 = "f\u00c0\u00e8\u0085\u00e2\u0082\u00be\u0088\u008e=\tAWGh\u000b\u00cfd\u00fa.%\u008a\u00fb\u00ff\u00dd\u0080\u00a1{\u00c2\u0097\u00cc\u00bd}=Ue\t<q\t".length();
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
                    var6_5 = "P\u00c8|\u00a2\u000bI%\u00c8\u00fe\u0086o\u00f4tT\u00c8\u00a0";
                    var7_6 = "P\u00c8|\u00a2\u000bI%\u00c8\u00fe\u0086o\u00f4tT\u00c8\u00a0".length();
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
        AdaptiveCommunicationManager.d = var8_3;
        AdaptiveCommunicationManager.h = new Integer[7];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = AdaptiveCommunicationManager.a(l, l2);
        Object object = AdaptiveCommunicationManager.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveCommunicationManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveCommunicationManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveCommunicationManager.a(clazz3, string2, clazz2)) != null) {
                    AdaptiveCommunicationManager.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveCommunicationManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveCommunicationManager.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveCommunicationManager.b(313258022461726L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @DataExchangeProtocol2090
    public void C(CommandExecutor commandExecutor) {
        block18: {
            long l = b ^ 0x7FD6D1965BF0L;
            if (((NetworkConnectionEstablisher)this.r.J()).equals(this.A)) {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block21: {
                    TemporalMetadataResolver temporalMetadataResolver;
                    block20: {
                        temporalMetadataResolver = TemporalMetadataResolver.h;
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            block19: {
                                try {
                                    try {
                                        try {
                                            if (!systemConfigurationOrchestrator.D()) break block18;
                                            if (temporalMetadataResolver.U().W(NumericTransformationOrchestrator.class)) break block19;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdaptiveCommunicationManager.a(customSystemException);
                                        }
                                        if (temporalMetadataResolver.U().W(CryptoResourceInterceptor.class)) break block19;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveCommunicationManager.a(customSystemException);
                                    }
                                    if (!temporalMetadataResolver.U().W(NumericTransformationEngine357.class)) break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveCommunicationManager.a(customSystemException);
                                }
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCommunicationManager.a(customSystemException);
                        }
                    }
                    try {
                        if (commandExecutor.getTarget().Y() || !commandExecutor.getTarget().B(ReflectionMetadataResolver.Ut)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCommunicationManager.a(customSystemException);
                    }
                    TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(commandExecutor.getTarget().M());
                    try {
                        try {
                            if (!transactionOrchestrator1017.B(ReflectionMetadataResolver.Pr) || !temporalMetadataResolver.j().h(transactionOrchestrator1017)) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCommunicationManager.a(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCommunicationManager.a(customSystemException);
                    }
                }
                try {
                    this.V(systemConfigurationOrchestrator);
                    if (AdaptiveCommunicationManager.c("\u00f4", (long)8503427455422037448L, (long)l) != false) {
                        this.K = true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCommunicationManager.a(customSystemException);
                }
            }
        }
    }

    @DataExchangeProtocol2090
    public void I(NetworkEventDispatcher networkEventDispatcher) {
        block17: {
            block18: {
                try {
                    if (!((NetworkConnectionEstablisher)this.r.J()).equals(this.A) || !networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.rZ)) break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCommunicationManager.a(customSystemException);
                }
                CryptoOperationCoordinator cryptoOperationCoordinator = new CryptoOperationCoordinator(networkEventDispatcher.getPacketInstance());
                try {
                    if (!cryptoOperationCoordinator.R().equals(SecurityTokenGenerator2037.M())) break block17;
                    if (this.K) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCommunicationManager.a(customSystemException);
                }
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                if (systemConfigurationOrchestrator.D()) {
                    block21: {
                        TemporalMetadataResolver temporalMetadataResolver;
                        block20: {
                            temporalMetadataResolver = TemporalMetadataResolver.h;
                            try {
                                block19: {
                                    try {
                                        try {
                                            if (temporalMetadataResolver.U().W(NumericTransformationOrchestrator.class) || temporalMetadataResolver.U().W(CryptoResourceInterceptor.class)) break block19;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdaptiveCommunicationManager.a(customSystemException);
                                        }
                                        if (!temporalMetadataResolver.U().W(NumericTransformationEngine357.class)) break block20;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveCommunicationManager.a(customSystemException);
                                    }
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCommunicationManager.a(customSystemException);
                            }
                        }
                        CryptographicTransformer cryptographicTransformer = cryptoOperationCoordinator.d(systemConfigurationOrchestrator.N());
                        try {
                            if (cryptographicTransformer.Y() || !cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCommunicationManager.a(customSystemException);
                        }
                        TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer.M());
                        try {
                            try {
                                if (!transactionOrchestrator1017.B(ReflectionMetadataResolver.Pr) || !temporalMetadataResolver.j().h(transactionOrchestrator1017)) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCommunicationManager.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCommunicationManager.a(customSystemException);
                        }
                    }
                    this.V(systemConfigurationOrchestrator);
                    this.K = true;
                }
                break block17;
            }
            this.K = false;
        }
    }

    public boolean T() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.r.J() != this.Z || !this.Z()) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCommunicationManager.a(customSystemException);
                        }
                        if (GeometryCalculator.C() <= 13) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCommunicationManager.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCommunicationManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = AdaptiveCommunicationManager.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 7;
                break;
            }
            case 1: {
                n3 = 16;
                break;
            }
            case 2: {
                n3 = 27;
                break;
            }
            case 3: {
                n3 = 49;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 41;
                break;
            }
            case 6: {
                n3 = 50;
                break;
            }
            case 7: {
                n3 = 32;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 18;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 5;
                break;
            }
            case 14: {
                n3 = 38;
                break;
            }
            case 15: {
                n3 = 40;
                break;
            }
            case 16: {
                n3 = 33;
                break;
            }
            case 17: {
                n3 = 17;
                break;
            }
            case 18: {
                n3 = 3;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 37;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 12;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 60;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 13;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 62;
                break;
            }
            case 33: {
                n3 = 43;
                break;
            }
            case 34: {
                n3 = 2;
                break;
            }
            case 35: {
                n3 = 59;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 54;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 57;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 11;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 39;
                break;
            }
            case 47: {
                n3 = 6;
                break;
            }
            case 48: {
                n3 = 45;
                break;
            }
            case 49: {
                n3 = 36;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 22;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 34;
                break;
            }
            case 55: {
                n3 = 35;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 4;
                break;
            }
            case 61: {
                n3 = 42;
                break;
            }
            case 62: {
                n3 = 19;
                break;
            }
            default: {
                n3 = 8;
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
        AdaptiveCommunicationManager.m[n4] = new String(cArray);
        return n4;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveCommunicationManager.a(l, l2);
            object = AdaptiveCommunicationManager.l[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveCommunicationManager.l[n] = clazz = Class.forName(m[n]);
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
            throw new RuntimeException("a/xw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveCommunicationManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveCommunicationManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveCommunicationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveCommunicationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

