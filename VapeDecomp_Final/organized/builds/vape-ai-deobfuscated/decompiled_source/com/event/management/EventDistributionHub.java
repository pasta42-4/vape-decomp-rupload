/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.event.management;

import com.analytics.computation.MetricsCalculationEngine;
import com.app.exception.DataValidationException;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.google.common.collect.ImmutableList;
import com.plugin.integration.PluginCommunicationProtocol;
import com.security.protocols.CryptoProtocolEnum;
import com.system.resource.SystemResourceAllocator1136;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.UnmodifiableView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EventDistributionHub
implements PluginCommunicationProtocol {
    private boolean n = true;
    private static final Integer[] e;
    private double C;
    private boolean W = true;
    private boolean t = true;
    private static int[] F;
    private ImmutableList<AbstractComputationKernel> c = ImmutableList.of();
    private AbstractComputationKernel a;
    private AbstractComputationKernel V;
    private static final long[] d;
    private final LinkedHashMap<AbstractComputationKernel, SystemResourceAllocator1136> I = new LinkedHashMap();
    private final Map<AbstractComputationKernel, MetricsCalculationEngine> Q = new LinkedHashMap<AbstractComputationKernel, MetricsCalculationEngine>();
    private boolean E;
    private boolean z = true;
    private boolean H = true;
    private AbstractComputationKernel D;
    private boolean y = true;
    private static final long b;
    private String m = null;
    private double x;
    private static final String[] i;
    private static final Object[] g;
    private static final Map f;
    private AbstractComputationKernel w;
    private boolean h = true;
    private AbstractComputationKernel U;
    private boolean r = true;

    public boolean P() {
        return this.z;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void X() {
        HashMap<Double, Double> hashMap = new HashMap<Double, Double>();
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            if (this.J(abstractComputationKernel).equals((Object)CryptoProtocolEnum.LEFT)) continue;
            try {
                if (this.J(abstractComputationKernel).equals((Object)CryptoProtocolEnum.RIGHT)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            try {
                if (!hashMap.containsKey(abstractComputationKernel.W())) {
                    hashMap.put(abstractComputationKernel.W(), abstractComputationKernel.w());
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            hashMap.put(abstractComputationKernel.W(), (Double)hashMap.get(abstractComputationKernel.W()) + abstractComputationKernel.w());
        }
        double d2 = 0.0;
        for (Object object : hashMap.values()) {
            if (!((Double)object > d2)) continue;
            d2 = (Double)object;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry object : hashMap.entrySet()) {
            hashMap2.put(object.getKey(), (double)Math.round(d2 / (Double)object.getValue() * 100.0) / 100.0);
        }
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            if (this.J(abstractComputationKernel).equals((Object)CryptoProtocolEnum.LEFT)) continue;
            try {
                if (this.J(abstractComputationKernel).equals((Object)CryptoProtocolEnum.RIGHT)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            abstractComputationKernel.T(Math.ceil(abstractComputationKernel.w() * (Double)hashMap2.get(abstractComputationKernel.W())));
            abstractComputationKernel.b(Math.floor((abstractComputationKernel.G() - this.w.G()) * (Double)hashMap2.get(abstractComputationKernel.W()) + this.w.G()));
        }
    }

    public SystemResourceAllocator1136 W(String string) {
        long l = b ^ 0x5E039BE30A1FL;
        SystemResourceAllocator1136 systemResourceAllocator1136 = new SystemResourceAllocator1136();
        string = string.toLowerCase();
        for (String string2 : string.split((String)((Object)EventDistributionHub.b("\u00fc", (int)EventDistributionHub.a("f", (int)12848, (long)(0x39DCEE8485E7D2CL ^ l)), (long)-4789478569048577957L, (long)l)))) {
            try {
                this.x(systemResourceAllocator1136, string2.trim());
            }
            catch (DataValidationException dataValidationException) {
                TemporalMetadataResolver.W(dataValidationException);
            }
        }
        return systemResourceAllocator1136;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'd' || c == 't' || c == '\u00f0') {
                field = EventDistributionHub.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventDistributionHub.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     */
    static {
        block9: {
            block8: {
                EventDistributionHub.b = MultiContainerRegistry.a(-3407148653478700132L, 7236119395012004521L, MethodHandles.lookup().lookupClass()).a(280564238208630L);
                EventDistributionHub.g = new Object[5];
                EventDistributionHub.i = new String[5];
                EventDistributionHub.a();
                EventDistributionHub.f = new HashMap<K, V>(13);
                EventDistributionHub.g(null);
                var0 = EventDistributionHub.b ^ 45805608756108L;
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
                var8_3 = new long[31];
                var5_4 = 0;
                var6_5 = "\u00c3\u00d9\u00c6\u00afn\u0014\u0096\u00c1\u0006\t\u00e8\u00cb\u00c0\u00fd\u0007Sq\u00d3E&\u00e3i\u0080\u00b8.\u0004HF3~+\u0014\u00cb\u008c\u00e5\u00b2t\u0014t.\u00bf'\u00a6M\u00a8\u00f2\u008b\u00f5G\u00a4 Vl\u00a3\u0091\u00f3\u0001\u00e9\u00be\u0097\u0018\u00d9\u00a7J\u008e\u00e6i\u001fh\u00a8%\u009at\u00ab)\u00edD\u009e\u000f\u00fd\u00ae_\u00b7Y+\u001f\u00cb\u00ca\u00ff\u008c\u00fcy\u00c5,\u00ef\u00c4J.(a\u00ce7hG\u001e\u0001\u00ea\u00ee|\u00a8Z)\u001b\u00a5\u001e\u00f0\u00b5\t\u00e7\u00d2\u00ccd\u00e8\u001a\u00cca\u00e3\u0097\u00993\u008a\u00de*]S\u0015\u0080dM\u0085D  FY9v\u00bd\u00aa\u009c\n\u0002{j\u00a8\u0003\u0080\u009d\u00a7\u00e8OhmF\u0082\u00fbx\u00c6\u00b8\u00b6\u00a8\u0092\u0082\u008a\u001bg:\u000f\u00e8\u00c9\u00ca&\u0086\u00ee\u0099a\u00f3P\u00d5|\u00d7\"\\E\u00b7-0U?\u001f\u00a2\u009eT\u009f\u00ca@\u00f9\u00d8\u0005\u00a2\u008f\u00a4\u00ab\u001f<\u00c7\u0014@$\u00dd\b\u00b4\u0096 1P,\u00da\u00de\u00a5\u00cb ";
                var7_6 = "\u00c3\u00d9\u00c6\u00afn\u0014\u0096\u00c1\u0006\t\u00e8\u00cb\u00c0\u00fd\u0007Sq\u00d3E&\u00e3i\u0080\u00b8.\u0004HF3~+\u0014\u00cb\u008c\u00e5\u00b2t\u0014t.\u00bf'\u00a6M\u00a8\u00f2\u008b\u00f5G\u00a4 Vl\u00a3\u0091\u00f3\u0001\u00e9\u00be\u0097\u0018\u00d9\u00a7J\u008e\u00e6i\u001fh\u00a8%\u009at\u00ab)\u00edD\u009e\u000f\u00fd\u00ae_\u00b7Y+\u001f\u00cb\u00ca\u00ff\u008c\u00fcy\u00c5,\u00ef\u00c4J.(a\u00ce7hG\u001e\u0001\u00ea\u00ee|\u00a8Z)\u001b\u00a5\u001e\u00f0\u00b5\t\u00e7\u00d2\u00ccd\u00e8\u001a\u00cca\u00e3\u0097\u00993\u008a\u00de*]S\u0015\u0080dM\u0085D  FY9v\u00bd\u00aa\u009c\n\u0002{j\u00a8\u0003\u0080\u009d\u00a7\u00e8OhmF\u0082\u00fbx\u00c6\u00b8\u00b6\u00a8\u0092\u0082\u008a\u001bg:\u000f\u00e8\u00c9\u00ca&\u0086\u00ee\u0099a\u00f3P\u00d5|\u00d7\"\\E\u00b7-0U?\u001f\u00a2\u009eT\u009f\u00ca@\u00f9\u00d8\u0005\u00a2\u008f\u00a4\u00ab\u001f<\u00c7\u0014@$\u00dd\b\u00b4\u0096 1P,\u00da\u00de\u00a5\u00cb ".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u009f\u0012n\u0001\\\u00b1^\u00b6\u001d\u00bf\u00bcN\u00c6\u00dft\u00b2";
                    var7_6 = "\u009f\u0012n\u0001\\\u00b1^\u00b6\u001d\u00bf\u00bcN\u00c6\u00dft\u00b2".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        EventDistributionHub.d = var8_3;
        EventDistributionHub.e = new Integer[31];
    }

    public void v(boolean bl) {
        this.y = bl;
    }

    public void U(double d2) {
        this.x = d2;
    }

    public void d(boolean bl) {
        this.h = bl;
    }

    private void u(double d2) {
        block17: {
            block19: {
                block18: {
                    double d3 = 0.0;
                    AbstractComputationKernel abstractComputationKernel = null;
                    Map<AbstractComputationKernel, SystemResourceAllocator1136> map = this.Y(d2);
                    for (AbstractComputationKernel abstractComputationKernel2 : map.keySet()) {
                        try {
                            if (!abstractComputationKernel2.f()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        if (!(abstractComputationKernel2.b() > d3)) continue;
                        d3 = abstractComputationKernel2.b();
                    }
                    for (AbstractComputationKernel abstractComputationKernel2 : map.keySet()) {
                        try {
                            if (!abstractComputationKernel2.f()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        try {
                            if (abstractComputationKernel2.b() < d3) {
                                abstractComputationKernel2.w(d3);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        try {
                            if (abstractComputationKernel != null && !(abstractComputationKernel2.W() > abstractComputationKernel.W())) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        abstractComputationKernel = abstractComputationKernel2;
                    }
                    try {
                        try {
                            if (this.D == null) break block17;
                            if (abstractComputationKernel == null) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        this.D.M(abstractComputationKernel.W() + abstractComputationKernel.b());
                        break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDistributionHub.a(customSystemException);
                    }
                }
                this.D.M(this.w.W());
            }
            this.D.b(this.w.G());
        }
    }

    public void o(boolean bl) {
        this.n = bl;
    }

    private void P() {
        HashMap<Double, Double> hashMap = new HashMap<Double, Double>();
        double d2 = 0.0;
        for (AbstractComputationKernel object : this.l()) {
            try {
                if (!object.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            try {
                if (this.k(object)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            if (!(object.w() > d2)) continue;
            d2 = object.w();
        }
        for (Map.Entry entry : this.I.entrySet()) {
            block15: {
                block14: {
                    try {
                        if (!((AbstractComputationKernel)entry.getKey()).f()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDistributionHub.a(customSystemException);
                    }
                    double d3 = d2;
                    if (((SystemResourceAllocator1136)entry.getValue()).t() > 0) {
                        d3 *= (double)((SystemResourceAllocator1136)entry.getValue()).t();
                    }
                    try {
                        ((AbstractComputationKernel)entry.getKey()).T(d3);
                        if (hashMap.containsKey(((AbstractComputationKernel)entry.getKey()).W())) break block14;
                        ((AbstractComputationKernel)entry.getKey()).b(this.w.G());
                        break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDistributionHub.a(customSystemException);
                    }
                }
                ((AbstractComputationKernel)entry.getKey()).b((Double)hashMap.get(((AbstractComputationKernel)entry.getKey()).W()));
            }
            hashMap.put(((AbstractComputationKernel)entry.getKey()).W(), ((AbstractComputationKernel)entry.getKey()).G() + ((AbstractComputationKernel)entry.getKey()).w());
        }
    }

    @Override
    public double R() {
        return this.C;
    }

    /*
     * Exception decompiling
     */
    public void x(SystemResourceAllocator1136 var1_1, String var2_2) throws DataValidationException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 9[SWITCH]
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

    public Map<AbstractComputationKernel, MetricsCalculationEngine> k() {
        return this.Q;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventDistributionHub.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                EventDistributionHub.g[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventDistributionHub.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public EventDistributionHub(AbstractComputationKernel abstractComputationKernel) {
        this.w = abstractComputationKernel;
    }

    public @UnmodifiableView Map<AbstractComputationKernel, SystemResourceAllocator1136> l() {
        return this.I;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EventDistributionHub.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventDistributionHub.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean k(AbstractComputationKernel abstractComputationKernel) {
        boolean bl;
        try {
            bl = !this.J(abstractComputationKernel).equals((Object)CryptoProtocolEnum.NONE);
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        return bl;
    }

    public EventDistributionHub() {
    }

    private void h() {
        block18: {
            block20: {
                block19: {
                    double d2 = this.w.W();
                    double d3 = 0.0;
                    AbstractComputationKernel abstractComputationKernel = null;
                    for (AbstractComputationKernel object : this.l()) {
                        try {
                            if (!object.f()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        if (!(object.b() > d3)) continue;
                        d3 = object.b();
                    }
                    for (Map.Entry entry : this.I.entrySet()) {
                        block17: {
                            try {
                                if (!((AbstractComputationKernel)entry.getKey()).f()) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDistributionHub.a(customSystemException);
                            }
                            try {
                                if (this.W) {
                                    ((AbstractComputationKernel)entry.getKey()).w(d3);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDistributionHub.a(customSystemException);
                            }
                            try {
                                ((AbstractComputationKernel)entry.getKey()).M(d2);
                                if (abstractComputationKernel != null && !(((AbstractComputationKernel)entry.getKey()).W() > abstractComputationKernel.W())) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDistributionHub.a(customSystemException);
                            }
                            abstractComputationKernel = (AbstractComputationKernel)entry.getKey();
                        }
                        if (!((SystemResourceAllocator1136)entry.getValue()).u()) continue;
                        d2 += ((AbstractComputationKernel)entry.getKey()).b();
                    }
                    try {
                        try {
                            if (this.D == null) break block18;
                            if (abstractComputationKernel == null) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        this.D.M(abstractComputationKernel.W() + abstractComputationKernel.b());
                        break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDistributionHub.a(customSystemException);
                    }
                }
                this.D.M(this.w.W());
            }
            this.D.b(this.w.G());
        }
    }

    @Override
    public void j(AbstractComputationKernel abstractComputationKernel, Object ... objectArray) {
        block6: {
            block7: {
                try {
                    try {
                        try {
                            if (objectArray != null && objectArray.length != 0) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDistributionHub.a(customSystemException);
                        }
                        if (this.m == null) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDistributionHub.a(customSystemException);
                    }
                    this.F(abstractComputationKernel, this.m);
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDistributionHub.a(customSystemException);
                }
            }
            this.F(abstractComputationKernel, "");
            return;
        }
        this.F(abstractComputationKernel, objectArray[0].toString());
    }

    public CryptoProtocolEnum J(AbstractComputationKernel abstractComputationKernel) {
        try {
            if (!this.I.containsKey(abstractComputationKernel)) {
                return CryptoProtocolEnum.NONE;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        return this.I.get(abstractComputationKernel).b();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventDistributionHub.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventDistributionHub.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\tB>";
        objectArray[1] = Integer.TYPE;
        EventDistributionHub.i[1] = "java/lang/Integer";
        objectArray[2] = "z\t\t\u00040\u0013q\u0006\u0018KM\u000bb\u0001\u0011\u0002";
        objectArray[3] = "Gwz\u0010-8Lxk_L6Gso\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0005>P_\u001c1^s\u001f1J#9u\u0010\\C5WrBW^X\u0000=H@Z3\u0007&MI!";
    }

    private void w() {
        try {
            if (this.a == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d2 = 0.0;
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            if (!abstractComputationKernel.f()) continue;
            try {
                if (this.k(abstractComputationKernel)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            if (!arrayList.contains(abstractComputationKernel.W())) {
                d2 += abstractComputationKernel.b();
                arrayList.add(abstractComputationKernel.W());
            }
            abstractComputationKernel.b(abstractComputationKernel.G() + this.a.w());
        }
        try {
            this.a.w(d2);
            if (this.V != null) {
                this.V.T(this.V.w() + this.a.w());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        try {
            if (this.D != null) {
                this.D.T(this.D.w() + this.a.w());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
    }

    @Override
    public List<AbstractComputationKernel> l() {
        try {
            if (this.t) {
                this.c = ImmutableList.copyOf(this.I.keySet());
                this.t = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        return this.c;
    }

    public void x(AbstractComputationKernel abstractComputationKernel, SystemResourceAllocator1136 systemResourceAllocator1136) {
        this.I.put(abstractComputationKernel, systemResourceAllocator1136);
        this.t = true;
    }

    public Map<AbstractComputationKernel, SystemResourceAllocator1136> Y(double d2) {
        LinkedHashMap<AbstractComputationKernel, SystemResourceAllocator1136> linkedHashMap = new LinkedHashMap<AbstractComputationKernel, SystemResourceAllocator1136>();
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                if (abstractComputationKernel.W() != d2) continue;
                linkedHashMap.put(abstractComputationKernel, this.I.get(abstractComputationKernel));
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
        }
        return linkedHashMap;
    }

    public void D(boolean bl) {
        this.z = bl;
    }

    @Override
    public void c(AbstractComputationKernel abstractComputationKernel) {
        this.I.remove(abstractComputationKernel);
        this.t = true;
    }

    public static void g(int[] nArray) {
        F = nArray;
    }

    private static Method d(long l, long l2) {
        int n = EventDistributionHub.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventDistributionHub.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventDistributionHub.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventDistributionHub.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventDistributionHub.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventDistributionHub.b(218753281858053L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventDistributionHub.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventDistributionHub.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventDistributionHub.b(218753281858053L, 0L);
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

    public void i(boolean bl) {
        this.r = bl;
    }

    public boolean l() {
        return this.E;
    }

    @Override
    public double C() {
        return this.x;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 30[SWITCH]
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

    public void k() {
        double d2 = this.w.W() + this.w.b() / 2.0;
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            double d3 = d2 - abstractComputationKernel.b() / 2.0;
            abstractComputationKernel.M(d3);
        }
    }

    public void m(double d2) {
        this.C = d2;
    }

    public void f(String string) {
        this.m = string;
    }

    public void y(boolean bl) {
        this.H = bl;
    }

    public static int[] O() {
        return F;
    }

    private static Field c(long l, long l2) {
        int n = EventDistributionHub.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = EventDistributionHub.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventDistributionHub.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventDistributionHub.a(clazz3, string2, clazz2)) != null) {
                    EventDistributionHub.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventDistributionHub.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventDistributionHub.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventDistributionHub.b(218753281858053L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void J(boolean bl) {
        this.E = bl;
    }

    public AbstractComputationKernel u() {
        return this.w;
    }

    public void m(boolean bl) {
        this.W = bl;
    }

    @Override
    public void M(AbstractComputationKernel abstractComputationKernel) {
        this.w = abstractComputationKernel;
    }

    public boolean t() {
        return this.h;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 13;
                break;
            }
            case 1: {
                n3 = 44;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 50;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 3;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 40;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 54;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 34;
                break;
            }
            case 15: {
                n3 = 53;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 18;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 57;
                break;
            }
            case 20: {
                n3 = 6;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 15;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 30;
                break;
            }
            case 25: {
                n3 = 4;
                break;
            }
            case 26: {
                n3 = 0;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 63;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 21;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 17;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 14;
                break;
            }
            case 38: {
                n3 = 11;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 43;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 8;
                break;
            }
            case 43: {
                n3 = 51;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 26;
                break;
            }
            case 46: {
                n3 = 47;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 49;
                break;
            }
            case 50: {
                n3 = 28;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 37;
                break;
            }
            case 60: {
                n3 = 10;
                break;
            }
            case 61: {
                n3 = 59;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 42;
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
        EventDistributionHub.i[n4] = new String(cArray);
        return n4;
    }

    public void O(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2) {
        ArrayList<Map.Entry<AbstractComputationKernel, SystemResourceAllocator1136>> arrayList = new ArrayList<Map.Entry<AbstractComputationKernel, SystemResourceAllocator1136>>();
        for (Map.Entry<AbstractComputationKernel, SystemResourceAllocator1136> entry : this.I.entrySet()) {
            try {
                if (entry.getKey().equals(abstractComputationKernel)) {
                    arrayList.add(new AbstractMap.SimpleEntry<AbstractComputationKernel, SystemResourceAllocator1136>(abstractComputationKernel2, this.I.get(abstractComputationKernel)));
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            arrayList.add(entry);
        }
        this.I.clear();
        for (Map.Entry<AbstractComputationKernel, SystemResourceAllocator1136> entry : arrayList) {
            this.I.put(entry.getKey(), entry.getValue());
        }
        this.t = true;
    }

    private void d() {
        try {
            if (this.U == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d2 = 0.0;
        double d3 = 0.0;
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            if (!abstractComputationKernel.f()) continue;
            try {
                if (this.k(abstractComputationKernel)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            double d4 = abstractComputationKernel.G() + abstractComputationKernel.w();
            if (d4 > d3) {
                d3 = d4;
            }
            if (arrayList.contains(abstractComputationKernel.W())) continue;
            d2 += abstractComputationKernel.b();
            arrayList.add(abstractComputationKernel.W());
        }
        try {
            this.U.b(d3);
            this.U.w(d2);
            if (this.V != null) {
                this.V.T(this.V.w() + this.U.w());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
        try {
            if (this.D != null) {
                this.D.T(this.D.w() + this.U.w());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDistributionHub.a(customSystemException);
        }
    }

    public void F(AbstractComputationKernel abstractComputationKernel, String string) {
        this.x(abstractComputationKernel, this.W(string));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7298;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/n", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventDistributionHub.e[n2] = n3;
        }
        return e[n2];
    }

    public void T() {
        this.V = null;
        this.D = null;
        this.a = null;
        this.U = null;
    }

    public void t() {
        this.T();
        this.C = 0.0;
        this.x = 0.0;
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                abstractComputationKernel.b(0.0);
                abstractComputationKernel.M(0.0);
                if (this.h) {
                    abstractComputationKernel.w(abstractComputationKernel.F());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            try {
                if (!this.z) continue;
                abstractComputationKernel.T(abstractComputationKernel.y());
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
        }
    }

    public Map<AbstractComputationKernel, SystemResourceAllocator1136> J(double d2) {
        LinkedHashMap<AbstractComputationKernel, SystemResourceAllocator1136> linkedHashMap = new LinkedHashMap<AbstractComputationKernel, SystemResourceAllocator1136>();
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                if (abstractComputationKernel.G() != d2) continue;
                linkedHashMap.put(abstractComputationKernel, this.I.get(abstractComputationKernel));
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
        }
        return linkedHashMap;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void e(double d2) {
        double d3 = 0.0;
        Map<AbstractComputationKernel, SystemResourceAllocator1136> map = this.Y(d2);
        for (AbstractComputationKernel object : map.keySet()) {
            try {
                if (!object.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            if (!(object.w() > d3)) continue;
            d3 = object.w();
        }
        for (Map.Entry entry : map.entrySet()) {
            try {
                if (!((AbstractComputationKernel)entry.getKey()).f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
            double d4 = d3;
            if (((SystemResourceAllocator1136)entry.getValue()).t() > 0) {
                d4 *= (double)((SystemResourceAllocator1136)entry.getValue()).t();
            }
            try {
                if (!(((AbstractComputationKernel)entry.getKey()).w() < d4)) continue;
                ((AbstractComputationKernel)entry.getKey()).T(d4);
            }
            catch (CustomSystemException customSystemException) {
                throw EventDistributionHub.a(customSystemException);
            }
        }
        double d5 = this.w.G();
        for (AbstractComputationKernel abstractComputationKernel : map.keySet()) {
            abstractComputationKernel.b(d5);
            d5 += abstractComputationKernel.w();
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EventDistributionHub.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(EventDistributionHub.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(EventDistributionHub.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

