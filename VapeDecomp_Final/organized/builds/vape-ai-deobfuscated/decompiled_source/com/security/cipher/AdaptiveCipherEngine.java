/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import com.app.concurrency.synchronization.ThreadSynchronizationHandler;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.math.NumericStreamProcessor;
import com.app.workflow.StateTrackingCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.transformation.NumericTransformationEngine;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.tokenization.SecureTokenGenerator1301;
import com.system.configuration.ConfigurationManager;
import com.system.monitoring.SystemHealthMonitor;
import com.system.monitoring.SystemHealthMonitor2258;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.core.TransactionOrchestrator2354;
import com.ui.rendering.GraphicalRenderingController;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AdaptiveCipherEngine
extends GraphicalRenderEngine1082
implements TransactionOrchestrator2354<AdaptiveCipherEngine> {
    List<String> b7;
    private final float bk = 1.0f;
    private static final String[] ob;
    private boolean bm;
    private String bD;
    private final float bo = 4.0f;
    private boolean bc;
    private final NumericStreamProcessor bg;
    private final AuthenticationStateTracker bW;
    private static final Map lb;
    private static final Integer[] fb;
    private final ColorPaletteRenderer bB;
    private final ThreadSynchronizationHandler bJ;
    private static final long ab;
    private static final long[] eb;
    private final float b_ = 6.0f;
    protected String be;
    protected double b5;
    private static final Object[] mb;
    private SystemHealthMonitor bN;
    private float br = 6.0f;
    protected Color bj;

    private List<String> m() {
        long l = ab ^ 0x4318588B8BD5L;
        String string = this.p();
        try {
            if (string.equals(this.bD)) {
                return this.b7;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherEngine.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.b5);
        String string2 = TemporalMetadataResolver.h.e().l().D(this.p());
        String[] stringArray = string2.split((String)((Object)AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)14615, (long)(0x6ED6DDD21F465F83L ^ l)), (long)-3396671428866483714L, (long)l)));
        double d2 = this.w() - 20.0;
        ArrayList<String> arrayList = new ArrayList<String>();
        double d3 = 0.0;
        String string3 = "";
        for (String string4 : stringArray) {
            double d4 = d3 + cryptographicParameterGenerator.D(string4 + (String)((Object)AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)13725, (long)(0x3A0B123C5C5AD307L ^ l)), (long)-3396671428866483714L, (long)l)));
            if (d4 > d2) {
                d3 = 0.0;
                arrayList.add(string3);
                string3 = string4 + (String)((Object)AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)10290, (long)(0x104F7D0B29404EAFL ^ l)), (long)-3396671428866483714L, (long)l));
                continue;
            }
            d3 = d4;
            string3 = string3 + string4 + (String)((Object)AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)9483, (long)(0x38BAC8D6A06AC394L ^ l)), (long)-3396671428866483714L, (long)l));
        }
        arrayList.add(string3);
        this.b7 = arrayList;
        this.bD = string;
        return arrayList;
    }

    public NumericStreamProcessor R() {
        return this.bg;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveCipherEngine.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public boolean n() {
        return this.bc;
    }

    public void c(boolean bl) {
        block10: {
            block9: {
                block8: {
                    try {
                        try {
                            try {
                                if (this.bW == null) break block8;
                                this.bW.H(bl);
                                if (this.bW.w().size() <= 0) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCipherEngine.a(customSystemException);
                            }
                            if (this.F() == null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCipherEngine.a(customSystemException);
                        }
                        this.F().A();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                }
                try {
                    if (!bl) break block9;
                    this.bJ.o();
                    this.bg.o();
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
            }
            this.bJ.q();
            this.bg.q();
        }
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveCipherEngine.ab = MultiContainerRegistry.a(-3778345845352392403L, 1442317846573650908L, MethodHandles.lookup().lookupClass()).a(24740491232820L);
                AdaptiveCipherEngine.mb = new Object[7];
                AdaptiveCipherEngine.ob = new String[7];
                AdaptiveCipherEngine.x();
                AdaptiveCipherEngine.lb = new HashMap<K, V>(13);
                var0 = AdaptiveCipherEngine.ab ^ 28047173080948L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00a1\u0080\u00e9A\u00bb\u001ao\u001aA^\u008fe\u00e2\u0010\u00eb\u00f7\u00c3K\u00ffX\u0086\u00f4d\u0098\u00909\u00db>?\u00d3b\u00eah\u00b3\u0091\u0018\u0080\u00f6\u00ee\u0095\u00d4|.SZH\u00ce\u00f3\u00aaMx\u000bIu~\u00ae";
                var7_6 = "\u00a1\u0080\u00e9A\u00bb\u001ao\u001aA^\u008fe\u00e2\u0010\u00eb\u00f7\u00c3K\u00ffX\u0086\u00f4d\u0098\u00909\u00db>?\u00d3b\u00eah\u00b3\u0091\u0018\u0080\u00f6\u00ee\u0095\u00d4|.SZH\u00ce\u00f3\u00aaMx\u000bIu~\u00ae".length();
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
                    var6_5 = "b9Y\u00a1w\u00d9$ \u0013\u00b3\u00c3\u00e2U\u00c5\u00d1\u00f0";
                    var7_6 = "b9Y\u00a1w\u00d9$ \u0013\u00b3\u00c3\u00e2U\u00c5\u00d1\u00f0".length();
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
        AdaptiveCipherEngine.eb = var8_3;
        AdaptiveCipherEngine.fb = new Integer[9];
    }

    public SystemHealthMonitor P() {
        return this.bN;
    }

    public void X() {
        block20: {
            block21: {
                boolean bl;
                AuthenticationStateTracker authenticationStateTracker;
                boolean bl2;
                AuthenticationStateTracker authenticationStateTracker2;
                block23: {
                    block22: {
                        block19: {
                            long l = ab ^ 0x4B4888759F8BL;
                            try {
                                try {
                                    if (this.bW == null || !this.bW.l()) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveCipherEngine.a(customSystemException);
                                }
                                AdaptiveCipherEngine.d("\u00eb", (long)-4286761732515686016L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCipherEngine.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (this.bW == null) break block20;
                                    if (!this.bW.s().equals(this.j())) break block21;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveCipherEngine.a(customSystemException);
                                }
                                authenticationStateTracker2 = this.bW;
                                if (this.bW.s().booleanValue()) break block22;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCipherEngine.a(customSystemException);
                            }
                            bl2 = true;
                            break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCipherEngine.a(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                try {
                    if (!authenticationStateTracker2.x(bl2)) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                try {
                    authenticationStateTracker = this.bW;
                    bl = this.bW.s() == false;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                authenticationStateTracker.H(bl);
            }
            try {
                try {
                    if (this.bW.w().size() <= 0 || this.F() == null) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                this.F().A();
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCipherEngine.a(customSystemException);
            }
        }
        this.bJ.c();
        this.bg.c();
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveCipherEngine.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveCipherEngine.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void d() {
        this.V();
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static void x() {
        Object[] objectArray = mb;
        mb[0] = "\u00169\r";
        objectArray[1] = Integer.TYPE;
        AdaptiveCipherEngine.ob[1] = "java/lang/Integer";
        objectArray[2] = "Y,\u001cWNGR#\r\u00183_A$\u0004Q";
        objectArray[3] = Void.TYPE;
        AdaptiveCipherEngine.ob[3] = "java/lang/Void";
        objectArray[4] = "9n69xE2a'v\u0019K9j#,";
        objectArray[5] = "a\u0013;4v7*\u0017cVb8PL4ly,(\u0019=1}R";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\u000e$jajsE 2\u0003nm?xe}=q^zs3h\u0016\u0006%2}egG+xl\u0005";
    }

    @Override
    public void E() {
        block30: {
            Color color;
            double d2;
            double d3;
            long l;
            block29: {
                Color color2;
                block26: {
                    Color color3;
                    double d4;
                    double d5;
                    CallSite callSite;
                    CryptographicParameterGenerator cryptographicParameterGenerator;
                    CallSite callSite2;
                    block28: {
                        block27: {
                            l = ab ^ 0x3AE704363630L;
                            try {
                                try {
                                    super.E();
                                    if (!this.n()) break block26;
                                    this.S();
                                    this.I();
                                    if (!this.j()) break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveCipherEngine.a(customSystemException);
                                }
                                callSite2 = AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)13855, (long)(0x452AF9EF0D266D61L ^ l)), (long)7870568851854615579L, (long)l);
                                break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCipherEngine.a(customSystemException);
                            }
                        }
                        callSite2 = AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)608, (long)(0x6D790ED1861AD91DL ^ l)), (long)7870568851854615579L, (long)l);
                    }
                    CallSite callSite3 = callSite2;
                    CryptographicParameterGenerator cryptographicParameterGenerator2 = this.t(this.b5);
                    try {
                        cryptographicParameterGenerator = cryptographicParameterGenerator2;
                        callSite = callSite3;
                        d5 = this.G() + this.w() - 4.0 - cryptographicParameterGenerator2.D((String)((Object)callSite3));
                        d4 = this.W() + this.b() / 2.0 - cryptographicParameterGenerator2.B((String)((Object)callSite3)) / 2.0;
                        color3 = this.j() ? GraphicalRenderingController.K.Q() : AdaptiveCipherEngine.M.n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                    cryptographicParameterGenerator.R((String)((Object)callSite), d5, d4, color3);
                    return;
                }
                this.A();
                this.br = 5.0f;
                d3 = this.G() + this.w() - 10.0 - (double)this.br;
                d2 = this.W() + this.b() / 2.0 - 3.0;
                try {
                    color2 = this.bJ.k() > 0.0 ? this.bJ.k() : this.bB.k();
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                color = color2;
                try {
                    try {
                        if (!this.s() || !this.bm) break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                    if (!(this.bJ.k() > 0.0)) break block29;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                color = EventDispatchCoordinator1159.P(color, 30.0);
            }
            this.I();
            double d6 = 0.8 / TemporalMetadataResolver.h.a().b();
            try {
                try {
                    try {
                        try {
                            ConfigurationManager.o(d3 - 1.0, d2, 12.5, 6.5, color, false, 3.0f, 1.0f);
                            ConfigurationManager.T((double)((float)d3 + 1.0f + (float)this.bg.t().doubleValue()), (double)((float)d2 + 1.0f), 4.0, d6, AdaptiveCipherEngine.M.W);
                            if (this.k() == null || !(this.k() instanceof SecureTokenGenerator1301)) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCipherEngine.a(customSystemException);
                        }
                        if (((SecureTokenGenerator1301)this.k()).w().isEmpty()) break block30;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                    if (!((SecureTokenGenerator1301)this.k()).y()) break block30;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                if (this.F() == null) break block30;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCipherEngine.a(customSystemException);
            }
            NumericTransformationEngine numericTransformationEngine = this.F();
            List<ConfigurationProfileResolver> list = ((SecureTokenGenerator1301)this.k()).w();
            AbstractComputationKernel abstractComputationKernel = null;
            boolean bl = false;
            for (AbstractComputationKernel abstractComputationKernel2 : numericTransformationEngine.A()) {
                if (abstractComputationKernel2.equals(this)) {
                    bl = true;
                    continue;
                }
                try {
                    if (!list.contains(abstractComputationKernel2.k())) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                if (!bl) continue;
                abstractComputationKernel = abstractComputationKernel2;
                break;
            }
            if (abstractComputationKernel != null) {
                Color color4 = abstractComputationKernel.l();
                StateTrackingCoordinator.B(color4, (float)(this.G() + this.w() / 8.0), (float)(this.W() + this.b() - 2.0), (String)((Object)AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)10516, (long)(0x25C625CE389726DL ^ l)), (long)7870568851854615579L, (long)l)), 7.0f, 3.0f, false);
            }
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveCipherEngine.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3641;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveCipherEngine.fb[n2] = n3;
        }
        return fb[n2];
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ob[n4] != null) {
            return n4;
        }
        Object object = mb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 43;
                break;
            }
            case 2: {
                n3 = 13;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 19;
                break;
            }
            case 8: {
                n3 = 9;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 27;
                break;
            }
            case 13: {
                n3 = 54;
                break;
            }
            case 14: {
                n3 = 44;
                break;
            }
            case 15: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 55;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 23;
                break;
            }
            case 24: {
                n3 = 37;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 59;
                break;
            }
            case 27: {
                n3 = 47;
                break;
            }
            case 28: {
                n3 = 50;
                break;
            }
            case 29: {
                n3 = 36;
                break;
            }
            case 30: {
                n3 = 49;
                break;
            }
            case 31: {
                n3 = 18;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 38;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 20;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 22;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 42;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 45;
                break;
            }
            case 51: {
                n3 = 53;
                break;
            }
            case 52: {
                n3 = 34;
                break;
            }
            case 53: {
                n3 = 2;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 39;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 15;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 61;
                break;
            }
            case 62: {
                n3 = 35;
                break;
            }
            default: {
                n3 = 32;
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
        AdaptiveCipherEngine.ob[n4] = new String(cArray);
        return n4;
    }

    public void y() {
        long l = ab ^ 0x208ADBBF4B64L;
        try {
            if (this.bW.C() != null) {
                this.bN = new SystemHealthMonitor(this.bW.C());
                this.n(this.bN, AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)1663, (long)(0x56D9787F05E2A050L ^ l)), (long)1183878007199439183L, (long)l));
                this.A();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherEngine.a(customSystemException);
        }
    }

    public AuthenticationStateTracker i() {
        return this.bW;
    }

    @Override
    public double z() {
        return 15.0 + (double)(this.m().size() - 1) * this.L(this.b5).B(this.p());
    }

    public void R() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.bW == null) break block4;
                        if (!this.bW.s().booleanValue()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                    this.bJ.L();
                    this.bg.L();
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
            }
            this.bJ.D();
            this.bg.D();
        }
    }

    public AdaptiveCipherEngine(String string) {
        this(string, 0.9);
    }

    private static Field k(long l, long l2) {
        int n = AdaptiveCipherEngine.i(l, l2);
        Object object = mb[n];
        if (object instanceof String) {
            String string = ob[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveCipherEngine.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveCipherEngine.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveCipherEngine.e(clazz3, string2, clazz2)) != null) {
                    AdaptiveCipherEngine.mb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveCipherEngine.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveCipherEngine.mb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveCipherEngine.j(319827041873842L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    protected void I() {
        long l = ab ^ 0x715F13500D36L;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.b5);
        List<String> list = this.m();
        double d2 = cryptographicParameterGenerator.B(this.be) * (double)list.size();
        double d3 = this.W() + this.b() / 2.0 - d2 / 2.0;
        for (String string : list) {
            try {
                if (!string.equals(AdaptiveCipherEngine.d("\u00eb", (int)AdaptiveCipherEngine.c("h", (int)21868, (long)(0x438FA47E8A2E3516L ^ l)), (long)6214874111645736733L, (long)l))) {
                    cryptographicParameterGenerator.R(string, this.G() + this.J(), d3, this.bj);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCipherEngine.a(customSystemException);
            }
            d3 += d2 / (double)list.size();
        }
    }

    public AdaptiveCipherEngine(String string, double d2) {
        this(string, d2, null);
    }

    public boolean T() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.bg.t().equals(this.bg.n()) || this.bg.t().equals(this.bg.p())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.bB.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherEngine.a(customSystemException);
        }
    }

    public String p() {
        return this.be;
    }

    private static Method l(long l, long l2) {
        int n = AdaptiveCipherEngine.i(l, l2);
        Object object = mb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ob[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveCipherEngine.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveCipherEngine.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveCipherEngine.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveCipherEngine.mb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveCipherEngine.j(319827041873842L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveCipherEngine.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveCipherEngine.mb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveCipherEngine.j(319827041873842L, 0L);
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

    public boolean j() {
        return this.bg.d();
    }

    public AdaptiveCipherEngine p(boolean bl) {
        this.bc = bl;
        return this;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveCipherEngine.i(l, l2);
            object = mb[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveCipherEngine.mb[n] = clazz = Class.forName(ob[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void Z() {
        try {
            if (this.bc) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCipherEngine.a(customSystemException);
        }
        this.X();
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == 'E' || c == 'P' || c == '\u00fc') {
                field = AdaptiveCipherEngine.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveCipherEngine.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    protected void V() {
        block6: {
            try {
                try {
                    try {
                        if (this.bW == null || this.bW.s().equals(this.j())) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCipherEngine.a(customSystemException);
                    }
                    if (this.T()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCipherEngine.a(customSystemException);
                }
                this.X();
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCipherEngine.a(customSystemException);
            }
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public AdaptiveCipherEngine(AuthenticationStateTracker authenticationStateTracker) {
        this(authenticationStateTracker != null ? authenticationStateTracker.w() : null, 0.9, authenticationStateTracker);
    }

    public AdaptiveCipherEngine(String string, double d2, AuthenticationStateTracker authenticationStateTracker) {
        super(0.0, 0.0);
        this.bB = new ColorPaletteRenderer(0.15, AdaptiveCipherEngine.M.K, AdaptiveCipherEngine.M.Z);
        this.bJ = new ThreadSynchronizationHandler(0.15, AdaptiveCipherEngine.M.Z);
        this.bg = new NumericStreamProcessor(0.15, 0.0, this.br - 1.0f);
        this.bj = AdaptiveCipherEngine.M.n;
        this.bm = false;
        this.bD = "";
        this.b7 = new ArrayList<String>();
        this.be = string;
        this.b5 = d2;
        this.bW = authenticationStateTracker;
        if (authenticationStateTracker != null) {
            this.L(authenticationStateTracker);
            this.y();
            this.g(authenticationStateTracker.d());
        }
        this.B(0);
        this.l(new SystemHealthMonitor2258(this));
        this.V();
        this.R();
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveCipherEngine.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveCipherEngine.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void m(boolean bl) {
        this.bm = bl;
    }

    @Override
    public void j() {
        this.bB.c();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yE" + " : " + string + " : " + methodType.toString(), exception);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveCipherEngine.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveCipherEngine.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

