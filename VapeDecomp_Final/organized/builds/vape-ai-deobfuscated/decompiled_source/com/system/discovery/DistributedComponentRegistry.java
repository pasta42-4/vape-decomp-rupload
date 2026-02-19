/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.system.discovery;

import a.KB;
import a.Ne;
import a.a;
import a.kg;
import a.tl;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.event.EventTrigger;
import com.app.security.tokens.SecurityTokenGenerator2037;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.event.NetworkEventDispatcher;
import com.network.secure.SecureProtocolNegotiator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthenticationTokenGenerator788;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.execution.CryptoOperationCoordinator;
import com.security.transform.CryptographicTransformer;
import com.simulation.world.WorldStateTransitioner;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.configuration.DisplayConfigurationManager;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class DistributedComponentRegistry
extends ContextualExecutionFramework {
    private CryptographicTransformer V;
    private static final Object[] n;
    private static final Integer[] h;
    private static final long[] e;
    private static final String[] o;
    private ArrayList<SecureProtocolNegotiator> d;
    private String m;
    private static final Map j;
    private ArrayList<SecureProtocolNegotiator> l;
    private SecureProtocolNegotiator x;
    private static final long b;

    @DataExchangeProtocol2090
    public void E(KB kB) {
        ConnectionConfigurationResolver connectionConfigurationResolver;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block11: {
            systemConfigurationOrchestrator = kB.getThePlayer();
            connectionConfigurationResolver = kB.getWorld();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !connectionConfigurationResolver.Y()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
                this.N();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
        }
        this.x = new SecureProtocolNegotiator(systemConfigurationOrchestrator.r());
        this.V = null;
        ArrayList arrayList = new ArrayList(connectionConfigurationResolver.L());
        for (Object e : arrayList) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            try {
                try {
                    try {
                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut) || cryptographicTransformer.equals(systemConfigurationOrchestrator)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedComponentRegistry.a(customSystemException);
                    }
                    if (!(systemConfigurationOrchestrator.y(cryptographicTransformer) < 6.0f)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
                this.V = cryptographicTransformer;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DistributedComponentRegistry.b = MultiContainerRegistry.a(-5345970280160606169L, 8684561569271157197L, MethodHandles.lookup().lookupClass()).a(66159486682618L);
                DistributedComponentRegistry.n = new Object[5];
                DistributedComponentRegistry.o = new String[5];
                DistributedComponentRegistry.a();
                DistributedComponentRegistry.j = new HashMap<K, V>(13);
                var0 = DistributedComponentRegistry.b ^ 107419810238421L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u0094\u0095\u00b0?\u00c1\u009591'\u009cP\u0012\u00a5\r\u0015\u00fe\u00a7Uj\u0004>pK\u0019*\u00ca)\u0097n1E\u008f\u00be\\\u008e\u00f8\u009e\u00fb\u00f6how\u00fb?f\u00d2\u00a0\u00d1";
                var7_6 = "\u0094\u0095\u00b0?\u00c1\u009591'\u009cP\u0012\u00a5\r\u0015\u00fe\u00a7Uj\u0004>pK\u0019*\u00ca)\u0097n1E\u008f\u00be\\\u008e\u00f8\u009e\u00fb\u00f6how\u00fb?f\u00d2\u00a0\u00d1".length();
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
                    var6_5 = "\u0099\u0080\u00fa#5H\u00bc,`\u001e\u00e6\u009e\u0000\u000b\u00ef\u0010";
                    var7_6 = "\u0099\u0080\u00fa#5H\u00bc,`\u001e\u00e6\u009e\u0000\u000b\u00ef\u0010".length();
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
        DistributedComponentRegistry.e = var8_3;
        DistributedComponentRegistry.h = new Integer[8];
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "\u0014$^";
        objectArray[1] = Integer.TYPE;
        DistributedComponentRegistry.o[1] = "java/lang/Integer";
        objectArray[2] = "wf<27P|i-}JHon$4";
        objectArray[3] = "eJ\u001c9usnE\rv\u0014}eN\t,";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "HmSf\u0018G\ff\u0011\fI\\v8\u0017kS\u001cNfN7D'OyL`\u001a\u001e\u0011=\u0015t\"";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = DistributedComponentRegistry.a(l, l2);
        Object object = DistributedComponentRegistry.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedComponentRegistry.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedComponentRegistry.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedComponentRegistry.a(clazz3, string2, clazz2)) != null) {
                    DistributedComponentRegistry.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedComponentRegistry.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedComponentRegistry.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedComponentRegistry.b(235666544053082L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void A() {
        this.l.clear();
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

    public DistributedComponentRegistry() {
        long l = b ^ 0x6E52D8276E58L;
        super(a.cs((int)DistributedComponentRegistry.a("w", (int)19574, (long)(0x4C1137A19723FCCCL ^ l))), -256, RecursiveNodeGraph.K, "");
        this.m = "";
        this.d = new ArrayList();
        this.l = new ArrayList();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedComponentRegistry.a(n, l);
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
            throw new RuntimeException("a/AZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DistributedComponentRegistry.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedComponentRegistry.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void I(double d2, double d3, double d4, double d5) {
        long l = b ^ 0x5523F84E090L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().A(true);
        double d6 = 5.0;
        Color color = new Color(0, 0, 0, 200);
        Color color2 = new Color(255, 255, 255, 200);
        Color color3 = new Color(0, 255, 0, 255);
        ConfigurationManager.q(d2 - d6, d3 - d6, d4 + d6 + d6, d5 + d6 + d6, 1.0, color2, color);
        ConfigurationManager.g(d2, d3 + d5 / 2.0, d2 + d4, d3 + d5 / 2.0, 0.25f, Color.RED);
        float f = 1.0f;
        float f2 = SecureProtocolNegotiator.Z(this.d.get(0)).D();
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f3 = SecureProtocolNegotiator.Z(secureProtocolNegotiator).D() - f2;
            if (Math.abs(f3) > f) {
                f = (float)Math.floor(Math.abs(f3));
            }
            f2 = SecureProtocolNegotiator.Z(secureProtocolNegotiator).D();
        }
        float f4 = -f;
        float f5 = f;
        cryptographicParameterGenerator.Y((String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)6219, (long)(0x2B3CC4CF4BCBA63BL ^ l)), (long)1717284681428972703L, (long)l)) + (int)f + (String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)25231, (long)(0x433C69E33FAA5CFAL ^ l)), (long)1717284681428972703L, (long)l)), d2 + 10.0, d3, Color.WHITE);
        int n = 100;
        GL11.glColor4d((double)((double)color3.getRed() / 255.0), (double)((double)color3.getGreen() / 255.0), (double)((double)color3.getBlue() / 255.0), (double)((double)color3.getAlpha() / 255.0));
        GL11.glLineWidth((float)1.0f);
        Ne.h.y(2848);
        GL11.glBegin((int)3);
        double d7 = d4 / 100.0;
        double d8 = d2;
        f2 = SecureProtocolNegotiator.Z(this.d.get(0)).D();
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f6 = SecureProtocolNegotiator.Z(secureProtocolNegotiator).D() - f2;
            double d9 = d3 + d5 / 2.0 + (double)(f6 / (f4 - f5)) * d5 / 2.0;
            GL11.glVertex2d((double)d8, (double)d9);
            d8 += d7;
            f2 = SecureProtocolNegotiator.Z(secureProtocolNegotiator).D();
        }
        GL11.glEnd();
    }

    private void G(double d2, double d3, double d4, double d5) {
        long l = b ^ 0x7F46184929B9L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().A(true);
        double d6 = 5.0;
        Color color = new Color(0, 0, 0, 200);
        Color color2 = new Color(255, 255, 255, 200);
        Color color3 = new Color(0, 255, 0, 255);
        ConfigurationManager.q(d2 - d6, d3 - d6, d4 + d6 + d6, d5 + d6 + d6, 1.0, color2, color);
        ConfigurationManager.g(d2, d3 + d5 / 2.0, d2 + d4, d3 + d5 / 2.0, 0.25f, Color.RED);
        cryptographicParameterGenerator.Y((String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)31432, (long)(0x3FE6039827E98D97L ^ l)), (long)-2378886566395839050L, (long)l)) + this.d.size(), d2 + 10.0, d3, Color.WHITE);
        float f = -180.0f;
        float f2 = 180.0f;
        int n = 100;
        GL11.glColor4d((double)((double)color3.getRed() / 255.0), (double)((double)color3.getGreen() / 255.0), (double)((double)color3.getBlue() / 255.0), (double)((double)color3.getAlpha() / 255.0));
        GL11.glLineWidth((float)1.0f);
        Ne.h.y(2848);
        GL11.glBegin((int)3);
        double d7 = d4 / 100.0;
        double d8 = d2;
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f3 = AdaptiveComputationEngine.v(SecureProtocolNegotiator.Z(secureProtocolNegotiator).D());
            float f4 = (float)(d3 + d5 - (double)((f3 - f2) / (f - f2)) * d5);
            GL11.glVertex2d((double)d8, (double)f4);
            d8 += d7;
        }
        GL11.glEnd();
    }

    @DataExchangeProtocol2090
    public void j(DisplayConfigurationManager displayConfigurationManager) {
        block19: {
            try {
                if (this.d.isEmpty()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = displayConfigurationManager.getThePlayer();
            ConnectionConfigurationResolver connectionConfigurationResolver = displayConfigurationManager.getWorld();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !connectionConfigurationResolver.Y()) break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
                this.N();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
        }
        ConfigurationManager.a();
        GL11.glPushMatrix();
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        try {
            if (!bl) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComponentRegistry.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComponentRegistry.a(customSystemException);
        }
        double d2 = 200.0;
        double d3 = 90.0;
        try {
            this.G(120.0, 20.0, d2, d3);
            this.I(340.0, 20.0, d2, d3);
            this.Y(120.0, 130.0, d2, d3);
            this.X(340.0, 130.0, d2, d3);
            if (bl2) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComponentRegistry.a(customSystemException);
        }
        try {
            if (!bl) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComponentRegistry.a(customSystemException);
        }
        GL11.glPopMatrix();
        ConfigurationManager.Y();
    }

    @Override
    public void h() {
        this.m = Long.toString(System.currentTimeMillis());
        this.N();
    }

    private void Y(double d2, double d3, double d4, double d5) {
        long l = b ^ 0x3322E4A2994EL;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().A(true);
        double d6 = 5.0;
        Color color = new Color(0, 0, 0, 200);
        Color color2 = new Color(255, 255, 255, 200);
        Color color3 = new Color(0, 255, 0, 255);
        ConfigurationManager.q(d2 - d6, d3 - d6, d4 + d6 + d6, d5 + d6 + d6, 1.0, color2, color);
        ConfigurationManager.g(d2, d3 + d5 / 2.0, d2 + d4, d3 + d5 / 2.0, 0.25f, Color.RED);
        cryptographicParameterGenerator.Y((String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)5345, (long)(0x3EA2ACA03A525348L ^ l)), (long)7929487787587095873L, (long)l)) + this.d.size(), d2 + 10.0, d3, Color.WHITE);
        float f = -90.0f;
        float f2 = 90.0f;
        int n = 100;
        GL11.glColor4d((double)((double)color3.getRed() / 255.0), (double)((double)color3.getGreen() / 255.0), (double)((double)color3.getBlue() / 255.0), (double)((double)color3.getAlpha() / 255.0));
        GL11.glLineWidth((float)1.0f);
        Ne.h.y(2848);
        GL11.glBegin((int)3);
        double d7 = d4 / 100.0;
        double d8 = d2;
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f3 = AdaptiveComputationEngine.v(SecureProtocolNegotiator.Z(secureProtocolNegotiator).g());
            float f4 = (float)(d3 + d5 - (double)((f3 - f2) / (f - f2)) * d5);
            GL11.glVertex2d((double)d8, (double)f4);
            d8 += d7;
        }
        GL11.glEnd();
    }

    @Override
    public void v() {
        this.A();
        this.N();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n4] != null) {
            return n4;
        }
        Object object = DistributedComponentRegistry.n[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 24;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 27;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 57;
                break;
            }
            case 11: {
                n3 = 1;
                break;
            }
            case 12: {
                n3 = 41;
                break;
            }
            case 13: {
                n3 = 28;
                break;
            }
            case 14: {
                n3 = 12;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 60;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 62;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 22;
                break;
            }
            case 23: {
                n3 = 18;
                break;
            }
            case 24: {
                n3 = 36;
                break;
            }
            case 25: {
                n3 = 50;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 44;
                break;
            }
            case 30: {
                n3 = 45;
                break;
            }
            case 31: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 48;
                break;
            }
            case 37: {
                n3 = 4;
                break;
            }
            case 38: {
                n3 = 3;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 61;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 47;
                break;
            }
            case 47: {
                n3 = 14;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 21;
                break;
            }
            case 50: {
                n3 = 55;
                break;
            }
            case 51: {
                n3 = 19;
                break;
            }
            case 52: {
                n3 = 42;
                break;
            }
            case 53: {
                n3 = 59;
                break;
            }
            case 54: {
                n3 = 51;
                break;
            }
            case 55: {
                n3 = 16;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 37;
                break;
            }
            case 59: {
                n3 = 5;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 2;
                break;
            }
            default: {
                n3 = 10;
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
        DistributedComponentRegistry.o[n4] = new String(cArray);
        return n4;
    }

    private void N() {
        this.l.clear();
        this.d.clear();
        this.x = null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'p' || c == 'I' || c == 'h') {
                field = DistributedComponentRegistry.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedComponentRegistry.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @DataExchangeProtocol2090
    public void j(EventTrigger eventTrigger) {
        block15: {
            block14: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventTrigger.getThePlayer();
                ConnectionConfigurationResolver connectionConfigurationResolver = eventTrigger.getWorld();
                try {
                    try {
                        if (!systemConfigurationOrchestrator.Y() && !connectionConfigurationResolver.Y()) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedComponentRegistry.a(customSystemException);
                    }
                    this.N();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (this.x == null || SecureProtocolNegotiator.A(this.x) == null) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedComponentRegistry.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
            while (this.d.size() >= 100) {
                this.d.remove(0);
            }
            try {
                if (this.l.size() >= 100) {
                    this.A();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
            this.l.add(this.x);
            this.d.add(this.x);
        }
    }

    private static Method d(long l, long l2) {
        int n = DistributedComponentRegistry.a(l, l2);
        Object object = DistributedComponentRegistry.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = DistributedComponentRegistry.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedComponentRegistry.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedComponentRegistry.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedComponentRegistry.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedComponentRegistry.b(235666544053082L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedComponentRegistry.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedComponentRegistry.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedComponentRegistry.b(235666544053082L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void h(double d2, double d3, double d4, double d5) {
        long l = b ^ 0x2D6D07ABF844L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().A(true);
        double d6 = 5.0;
        Color color = new Color(0, 0, 0, 200);
        Color color2 = new Color(255, 255, 255, 200);
        Color color3 = new Color(0, 255, 0, 255);
        ConfigurationManager.q(d2 - d6, d3 - d6, d4 + d6 + d6, d5 + d6 + d6, 1.0, color2, color);
        cryptographicParameterGenerator.Y((String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)10909, (long)(0x340C860B4D0B0C3DL ^ l)), (long)1081195338412600395L, (long)l)), d2 + 10.0, d3, Color.WHITE);
        int n = 100;
        GL11.glColor4d((double)((double)color3.getRed() / 255.0), (double)((double)color3.getGreen() / 255.0), (double)((double)color3.getBlue() / 255.0), (double)((double)color3.getAlpha() / 255.0));
        GL11.glLineWidth((float)1.0f);
        Ne.h.y(2848);
        GL11.glBegin((int)3);
        double d7 = d4 / 100.0;
        double d8 = d2;
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f = AdaptiveComputationEngine.v(SecureProtocolNegotiator.Z(secureProtocolNegotiator).D());
            float f2 = AdaptiveComputationEngine.v(SecureProtocolNegotiator.Z(secureProtocolNegotiator).g());
            float f3 = Math.abs(f / f2);
            GL11.glVertex2d((double)d8, (double)(d3 + d5 - (double)f3 * d5));
            d8 += d7;
        }
        GL11.glEnd();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x29A3;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
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
                throw new RuntimeException("a/AZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedComponentRegistry.h[n2] = n3;
        }
        return h[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedComponentRegistry.a(l, l2);
            object = DistributedComponentRegistry.n[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedComponentRegistry.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @DataExchangeProtocol2090
    public void z(NetworkEventDispatcher networkEventDispatcher) {
        CryptoOperationCoordinator cryptoOperationCoordinator;
        ConnectionLifecycleHandler connectionLifecycleHandler;
        block19: {
            block20: {
                block18: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = networkEventDispatcher.getThePlayer();
                    ConnectionConfigurationResolver connectionConfigurationResolver = networkEventDispatcher.getWorld();
                    try {
                        try {
                            if (!systemConfigurationOrchestrator.Y() && !connectionConfigurationResolver.Y()) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedComponentRegistry.a(customSystemException);
                        }
                        this.N();
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedComponentRegistry.a(customSystemException);
                    }
                }
                connectionLifecycleHandler = networkEventDispatcher.getPacket();
                try {
                    if (this.x == null) {
                        this.x = new SecureProtocolNegotiator(ApplicationLifecycleManager.U().r());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
                try {
                    try {
                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.L)) break block19;
                        if (this.V == null) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedComponentRegistry.a(customSystemException);
                    }
                    SecureProtocolNegotiator.f(this.x, new kg(this.V.F(), this.V.V(), this.V.B()));
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedComponentRegistry.a(customSystemException);
                }
            }
            this.x.A(new AuthenticationTokenGenerator788(connectionLifecycleHandler.M()), networkEventDispatcher.getThePlayer());
        }
        try {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bK)) {
                SecureProtocolNegotiator.P(this.x, true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComponentRegistry.a(customSystemException);
        }
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rZ) && (cryptoOperationCoordinator = new CryptoOperationCoordinator(connectionLifecycleHandler.M())).R().equals(SecurityTokenGenerator2037.M())) {
            CryptographicTransformer cryptographicTransformer = cryptoOperationCoordinator.d(networkEventDispatcher.getWorld());
            try {
                if (cryptographicTransformer.equals(this.V)) {
                    SecureProtocolNegotiator.g(this.x, true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedComponentRegistry.a(customSystemException);
            }
        }
    }

    private void X(double d2, double d3, double d4, double d5) {
        long l = b ^ 0x2E5017B71788L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().A(true);
        double d6 = 5.0;
        Color color = new Color(0, 0, 0, 200);
        Color color2 = new Color(255, 255, 255, 200);
        Color color3 = new Color(0, 255, 0, 255);
        ConfigurationManager.q(d2 - d6, d3 - d6, d4 + d6 + d6, d5 + d6 + d6, 1.0, color2, color);
        ConfigurationManager.g(d2, d3 + d5 / 2.0, d2 + d4, d3 + d5 / 2.0, 0.25f, Color.RED);
        float f = 1.0f;
        float f2 = SecureProtocolNegotiator.Z(this.d.get(0)).g();
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f3 = AdaptiveComputationEngine.v(SecureProtocolNegotiator.Z(secureProtocolNegotiator).g() - f2);
            if (Math.abs(f3) > f) {
                f = (float)Math.floor(Math.abs(f3));
            }
            f2 = SecureProtocolNegotiator.Z(secureProtocolNegotiator).g();
        }
        float f4 = -f;
        float f5 = f;
        cryptographicParameterGenerator.Y((String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)23864, (long)(0x7F379195A4F99451L ^ l)), (long)-2248089702303743097L, (long)l)) + (int)f + (String)((Object)DistributedComponentRegistry.c("i", (int)DistributedComponentRegistry.a("w", (int)15761, (long)(0x6EADACBFFDB4F4FAL ^ l)), (long)-2248089702303743097L, (long)l)), d2 + 10.0, d3, Color.WHITE);
        int n = 100;
        GL11.glColor4d((double)((double)color3.getRed() / 255.0), (double)((double)color3.getGreen() / 255.0), (double)((double)color3.getBlue() / 255.0), (double)((double)color3.getAlpha() / 255.0));
        GL11.glLineWidth((float)1.0f);
        Ne.h.y(2848);
        GL11.glBegin((int)3);
        double d7 = d4 / 100.0;
        double d8 = d2;
        f2 = SecureProtocolNegotiator.Z(this.d.get(0)).g();
        for (SecureProtocolNegotiator secureProtocolNegotiator : this.d) {
            float f6 = AdaptiveComputationEngine.v(SecureProtocolNegotiator.Z(secureProtocolNegotiator).g() - f2);
            double d9 = d3 + d5 / 2.0 + (double)(f6 / (f4 - f5)) * d5 / 2.0;
            GL11.glVertex2d((double)d8, (double)d9);
            d8 += d7;
            f2 = SecureProtocolNegotiator.Z(secureProtocolNegotiator).g();
        }
        GL11.glEnd();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedComponentRegistry.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedComponentRegistry.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void p(WorldStateTransitioner worldStateTransitioner) {
        this.N();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedComponentRegistry.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedComponentRegistry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DistributedComponentRegistry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

