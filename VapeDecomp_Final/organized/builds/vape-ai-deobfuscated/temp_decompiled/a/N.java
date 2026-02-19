/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.J4;
import a.O_;
import a.SE;
import a.X4;
import a.cW;
import a.cq;
import a.d8;
import a.ht;
import a.rK;
import com.google.common.collect.ImmutableList;
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
public class n
implements cW {
    private boolean n = true;
    private static final Integer[] e;
    private double C;
    private boolean W = true;
    private boolean t = true;
    private static int[] F;
    private ImmutableList<ht> c = ImmutableList.of();
    private ht a;
    private ht V;
    private static final long[] d;
    private final LinkedHashMap<ht, cq> I = new LinkedHashMap();
    private final Map<ht, X4> Q = new LinkedHashMap<ht, X4>();
    private boolean E;
    private boolean z = true;
    private boolean H = true;
    private ht D;
    private boolean y = true;
    private static final long b;
    private String m = null;
    private double x;
    private static final String[] i;
    private static final Object[] g;
    private static final Map f;
    private ht w;
    private boolean h = true;
    private ht U;
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
        for (ht ht2 : this.l()) {
            try {
                if (!ht2.f()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
            if (this.J(ht2).equals((Object)J4.LEFT)) continue;
            try {
                if (this.J(ht2).equals((Object)J4.RIGHT)) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw a.n.a(o_3);
            }
            try {
                if (!hashMap.containsKey(ht2.W())) {
                    hashMap.put(ht2.W(), ht2.w());
                    continue;
                }
            }
            catch (O_ o_4) {
                throw a.n.a(o_4);
            }
            hashMap.put(ht2.W(), (Double)hashMap.get(ht2.W()) + ht2.w());
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
        for (ht ht2 : this.l()) {
            try {
                if (!ht2.f()) {
                    continue;
                }
            }
            catch (O_ o_5) {
                throw a.n.a(o_5);
            }
            if (this.J(ht2).equals((Object)J4.LEFT)) continue;
            try {
                if (this.J(ht2).equals((Object)J4.RIGHT)) {
                    continue;
                }
            }
            catch (O_ o_6) {
                throw a.n.a(o_6);
            }
            ht2.T(Math.ceil(ht2.w() * (Double)hashMap2.get(ht2.W())));
            ht2.b(Math.floor((ht2.G() - this.w.G()) * (Double)hashMap2.get(ht2.W()) + this.w.G()));
        }
    }

    public cq W(String string) {
        long l10 = b ^ 0x5E039BE30A1FL;
        cq cq2 = new cq();
        string = string.toLowerCase();
        for (String string2 : string.split((String)((Object)a.n.b("\u00fc", (int)a.n.a("f", (int)12848, (long)(0x39DCEE8485E7D2CL ^ l10)), (long)-4789478569048577957L, (long)l10)))) {
            try {
                this.x(cq2, string2.trim());
            }
            catch (rK rK2) {
                SE.W(rK2);
            }
        }
        return cq2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c6' || c10 == 'd' || c10 == 't' || c10 == '\u00f0') {
                field = a.n.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a.n.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
                a.n.b = d8.a(-3407148653478700132L, 7236119395012004521L, MethodHandles.lookup().lookupClass()).a(280564238208630L);
                a.n.g = new Object[5];
                a.n.i = new String[5];
                a.n.a();
                a.n.f = new HashMap<K, V>(13);
                a.n.g(null);
                var0 = a.n.b ^ 45805608756108L;
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
        a.n.d = var8_3;
        a.n.e = new Integer[31];
    }

    public void v(boolean bl2) {
        this.y = bl2;
    }

    public void U(double d2) {
        this.x = d2;
    }

    public void d(boolean bl2) {
        this.h = bl2;
    }

    private void u(double d2) {
        block17: {
            block19: {
                block18: {
                    double d3 = 0.0;
                    ht ht2 = null;
                    Map<ht, cq> map = this.Y(d2);
                    for (ht ht3 : map.keySet()) {
                        try {
                            if (!ht3.f()) {
                                continue;
                            }
                        }
                        catch (O_ o_2) {
                            throw a.n.a(o_2);
                        }
                        if (!(ht3.b() > d3)) continue;
                        d3 = ht3.b();
                    }
                    for (ht ht3 : map.keySet()) {
                        try {
                            if (!ht3.f()) {
                                continue;
                            }
                        }
                        catch (O_ o_3) {
                            throw a.n.a(o_3);
                        }
                        try {
                            if (ht3.b() < d3) {
                                ht3.w(d3);
                            }
                        }
                        catch (O_ o_4) {
                            throw a.n.a(o_4);
                        }
                        try {
                            if (ht2 != null && !(ht3.W() > ht2.W())) continue;
                        }
                        catch (O_ o_5) {
                            throw a.n.a(o_5);
                        }
                        ht2 = ht3;
                    }
                    try {
                        try {
                            if (this.D == null) break block17;
                            if (ht2 == null) break block18;
                        }
                        catch (O_ o_6) {
                            throw a.n.a(o_6);
                        }
                        this.D.M(ht2.W() + ht2.b());
                        break block19;
                    }
                    catch (O_ o_7) {
                        throw a.n.a(o_7);
                    }
                }
                this.D.M(this.w.W());
            }
            this.D.b(this.w.G());
        }
    }

    public void o(boolean bl2) {
        this.n = bl2;
    }

    private void P() {
        HashMap<Double, Double> hashMap = new HashMap<Double, Double>();
        double d2 = 0.0;
        for (ht object : this.l()) {
            try {
                if (!object.f()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
            try {
                if (this.k(object)) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw a.n.a(o_3);
            }
            if (!(object.w() > d2)) continue;
            d2 = object.w();
        }
        for (Map.Entry entry : this.I.entrySet()) {
            block15: {
                block14: {
                    try {
                        if (!((ht)entry.getKey()).f()) {
                            continue;
                        }
                    }
                    catch (O_ o_4) {
                        throw a.n.a(o_4);
                    }
                    double d3 = d2;
                    if (((cq)entry.getValue()).t() > 0) {
                        d3 *= (double)((cq)entry.getValue()).t();
                    }
                    try {
                        ((ht)entry.getKey()).T(d3);
                        if (hashMap.containsKey(((ht)entry.getKey()).W())) break block14;
                        ((ht)entry.getKey()).b(this.w.G());
                        break block15;
                    }
                    catch (O_ o_5) {
                        throw a.n.a(o_5);
                    }
                }
                ((ht)entry.getKey()).b((Double)hashMap.get(((ht)entry.getKey()).W()));
            }
            hashMap.put(((ht)entry.getKey()).W(), ((ht)entry.getKey()).G() + ((ht)entry.getKey()).w());
        }
    }

    @Override
    public double R() {
        return this.C;
    }

    /*
     * Exception decompiling
     */
    public void x(cq var1_1, String var2_2) throws rK {
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

    public Map<ht, X4> k() {
        return this.Q;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = a.n.a(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                a.n.g[n2] = clazz = Class.forName(i[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = a.n.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public n(ht ht2) {
        this.w = ht2;
    }

    public @UnmodifiableView Map<ht, cq> l() {
        return this.I;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = a.n.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = a.n.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean k(ht ht2) {
        boolean bl2;
        try {
            bl2 = !this.J(ht2).equals((Object)J4.NONE);
        }
        catch (O_ o_2) {
            throw a.n.a(o_2);
        }
        return bl2;
    }

    public n() {
    }

    private void h() {
        block18: {
            block20: {
                block19: {
                    double d2 = this.w.W();
                    double d3 = 0.0;
                    ht ht2 = null;
                    for (ht object : this.l()) {
                        try {
                            if (!object.f()) {
                                continue;
                            }
                        }
                        catch (O_ o_2) {
                            throw a.n.a(o_2);
                        }
                        if (!(object.b() > d3)) continue;
                        d3 = object.b();
                    }
                    for (Map.Entry entry : this.I.entrySet()) {
                        block17: {
                            try {
                                if (!((ht)entry.getKey()).f()) {
                                    continue;
                                }
                            }
                            catch (O_ o_3) {
                                throw a.n.a(o_3);
                            }
                            try {
                                if (this.W) {
                                    ((ht)entry.getKey()).w(d3);
                                }
                            }
                            catch (O_ o_4) {
                                throw a.n.a(o_4);
                            }
                            try {
                                ((ht)entry.getKey()).M(d2);
                                if (ht2 != null && !(((ht)entry.getKey()).W() > ht2.W())) break block17;
                            }
                            catch (O_ o_5) {
                                throw a.n.a(o_5);
                            }
                            ht2 = (ht)entry.getKey();
                        }
                        if (!((cq)entry.getValue()).u()) continue;
                        d2 += ((ht)entry.getKey()).b();
                    }
                    try {
                        try {
                            if (this.D == null) break block18;
                            if (ht2 == null) break block19;
                        }
                        catch (O_ o_6) {
                            throw a.n.a(o_6);
                        }
                        this.D.M(ht2.W() + ht2.b());
                        break block20;
                    }
                    catch (O_ o_7) {
                        throw a.n.a(o_7);
                    }
                }
                this.D.M(this.w.W());
            }
            this.D.b(this.w.G());
        }
    }

    @Override
    public void j(ht ht2, Object ... objectArray) {
        block6: {
            block7: {
                try {
                    try {
                        try {
                            if (objectArray != null && objectArray.length != 0) break block6;
                        }
                        catch (O_ o_2) {
                            throw a.n.a(o_2);
                        }
                        if (this.m == null) break block7;
                    }
                    catch (O_ o_3) {
                        throw a.n.a(o_3);
                    }
                    this.F(ht2, this.m);
                    return;
                }
                catch (O_ o_4) {
                    throw a.n.a(o_4);
                }
            }
            this.F(ht2, "");
            return;
        }
        this.F(ht2, objectArray[0].toString());
    }

    public J4 J(ht ht2) {
        try {
            if (!this.I.containsKey(ht2)) {
                return J4.NONE;
            }
        }
        catch (O_ o_2) {
            throw a.n.a(o_2);
        }
        return this.I.get(ht2).b();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = a.n.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = a.n.b(classArray2[i10], string, clazz2, n2, classArray);
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
        a.n.i[1] = "java/lang/Integer";
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
        catch (O_ o_2) {
            throw a.n.a(o_2);
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d2 = 0.0;
        for (ht ht2 : this.l()) {
            if (!ht2.f()) continue;
            try {
                if (this.k(ht2)) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw a.n.a(o_3);
            }
            if (!arrayList.contains(ht2.W())) {
                d2 += ht2.b();
                arrayList.add(ht2.W());
            }
            ht2.b(ht2.G() + this.a.w());
        }
        try {
            this.a.w(d2);
            if (this.V != null) {
                this.V.T(this.V.w() + this.a.w());
            }
        }
        catch (O_ o_4) {
            throw a.n.a(o_4);
        }
        try {
            if (this.D != null) {
                this.D.T(this.D.w() + this.a.w());
            }
        }
        catch (O_ o_5) {
            throw a.n.a(o_5);
        }
    }

    @Override
    public List<ht> l() {
        try {
            if (this.t) {
                this.c = ImmutableList.copyOf(this.I.keySet());
                this.t = false;
            }
        }
        catch (O_ o_2) {
            throw a.n.a(o_2);
        }
        return this.c;
    }

    public void x(ht ht2, cq cq2) {
        this.I.put(ht2, cq2);
        this.t = true;
    }

    public Map<ht, cq> Y(double d2) {
        LinkedHashMap<ht, cq> linkedHashMap = new LinkedHashMap<ht, cq>();
        for (ht ht2 : this.l()) {
            try {
                if (ht2.W() != d2) continue;
                linkedHashMap.put(ht2, this.I.get(ht2));
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
        }
        return linkedHashMap;
    }

    public void D(boolean bl2) {
        this.z = bl2;
    }

    @Override
    public void c(ht ht2) {
        this.I.remove(ht2);
        this.t = true;
    }

    public static void g(int[] nArray) {
        F = nArray;
    }

    private static Method d(long l10, long l11) {
        int n2 = a.n.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n2];
                int n4 = string2.indexOf(8);
                clazz3 = a.n.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = a.n.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a.n.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        a.n.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a.n.b(218753281858053L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = a.n.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        a.n.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a.n.b(218753281858053L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public void i(boolean bl2) {
        this.r = bl2;
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

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    public void k() {
        double d2 = this.w.W() + this.w.b() / 2.0;
        for (ht ht2 : this.l()) {
            try {
                if (!ht2.f()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
            double d3 = d2 - ht2.b() / 2.0;
            ht2.M(d3);
        }
    }

    public void m(double d2) {
        this.C = d2;
    }

    public void f(String string) {
        this.m = string;
    }

    public void y(boolean bl2) {
        this.H = bl2;
    }

    public static int[] O() {
        return F;
    }

    private static Field c(long l10, long l11) {
        int n2 = a.n.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = i[n2];
            int n3 = string.indexOf(8);
            Class clazz = a.n.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = a.n.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a.n.a(clazz3, string2, clazz2)) != null) {
                    a.n.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = a.n.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        a.n.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a.n.b(218753281858053L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void J(boolean bl2) {
        this.E = bl2;
    }

    public ht u() {
        return this.w;
    }

    public void m(boolean bl2) {
        this.W = bl2;
    }

    @Override
    public void M(ht ht2) {
        this.w = ht2;
    }

    public boolean t() {
        return this.h;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (i[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 13;
                break;
            }
            case 1: {
                n4 = 44;
                break;
            }
            case 2: {
                n4 = 58;
                break;
            }
            case 3: {
                n4 = 50;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 2;
                break;
            }
            case 6: {
                n4 = 1;
                break;
            }
            case 7: {
                n4 = 3;
                break;
            }
            case 8: {
                n4 = 38;
                break;
            }
            case 9: {
                n4 = 40;
                break;
            }
            case 10: {
                n4 = 9;
                break;
            }
            case 11: {
                n4 = 54;
                break;
            }
            case 12: {
                n4 = 62;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 34;
                break;
            }
            case 15: {
                n4 = 53;
                break;
            }
            case 16: {
                n4 = 16;
                break;
            }
            case 17: {
                n4 = 18;
                break;
            }
            case 18: {
                n4 = 32;
                break;
            }
            case 19: {
                n4 = 57;
                break;
            }
            case 20: {
                n4 = 6;
                break;
            }
            case 21: {
                n4 = 48;
                break;
            }
            case 22: {
                n4 = 15;
                break;
            }
            case 23: {
                n4 = 46;
                break;
            }
            case 24: {
                n4 = 30;
                break;
            }
            case 25: {
                n4 = 4;
                break;
            }
            case 26: {
                n4 = 0;
                break;
            }
            case 27: {
                n4 = 5;
                break;
            }
            case 28: {
                n4 = 63;
                break;
            }
            case 29: {
                n4 = 33;
                break;
            }
            case 30: {
                n4 = 21;
                break;
            }
            case 31: {
                n4 = 45;
                break;
            }
            case 32: {
                n4 = 41;
                break;
            }
            case 33: {
                n4 = 17;
                break;
            }
            case 34: {
                n4 = 35;
                break;
            }
            case 35: {
                n4 = 20;
                break;
            }
            case 36: {
                n4 = 61;
                break;
            }
            case 37: {
                n4 = 14;
                break;
            }
            case 38: {
                n4 = 11;
                break;
            }
            case 39: {
                n4 = 27;
                break;
            }
            case 40: {
                n4 = 43;
                break;
            }
            case 41: {
                n4 = 24;
                break;
            }
            case 42: {
                n4 = 8;
                break;
            }
            case 43: {
                n4 = 51;
                break;
            }
            case 44: {
                n4 = 36;
                break;
            }
            case 45: {
                n4 = 26;
                break;
            }
            case 46: {
                n4 = 47;
                break;
            }
            case 47: {
                n4 = 19;
                break;
            }
            case 48: {
                n4 = 22;
                break;
            }
            case 49: {
                n4 = 49;
                break;
            }
            case 50: {
                n4 = 28;
                break;
            }
            case 51: {
                n4 = 12;
                break;
            }
            case 52: {
                n4 = 39;
                break;
            }
            case 53: {
                n4 = 29;
                break;
            }
            case 54: {
                n4 = 7;
                break;
            }
            case 55: {
                n4 = 25;
                break;
            }
            case 56: {
                n4 = 56;
                break;
            }
            case 57: {
                n4 = 55;
                break;
            }
            case 58: {
                n4 = 52;
                break;
            }
            case 59: {
                n4 = 37;
                break;
            }
            case 60: {
                n4 = 10;
                break;
            }
            case 61: {
                n4 = 59;
                break;
            }
            case 62: {
                n4 = 31;
                break;
            }
            default: {
                n4 = 42;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        a.n.i[n5] = new String(cArray);
        return n5;
    }

    public void O(ht ht2, ht ht3) {
        ArrayList<Map.Entry<ht, cq>> arrayList = new ArrayList<Map.Entry<ht, cq>>();
        for (Map.Entry<ht, cq> entry : this.I.entrySet()) {
            try {
                if (entry.getKey().equals(ht2)) {
                    arrayList.add(new AbstractMap.SimpleEntry<ht, cq>(ht3, this.I.get(ht2)));
                    continue;
                }
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
            arrayList.add(entry);
        }
        this.I.clear();
        for (Map.Entry<ht, cq> entry : arrayList) {
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
        catch (O_ o_2) {
            throw a.n.a(o_2);
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d2 = 0.0;
        double d3 = 0.0;
        for (ht ht2 : this.l()) {
            if (!ht2.f()) continue;
            try {
                if (this.k(ht2)) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw a.n.a(o_3);
            }
            double d4 = ht2.G() + ht2.w();
            if (d4 > d3) {
                d3 = d4;
            }
            if (arrayList.contains(ht2.W())) continue;
            d2 += ht2.b();
            arrayList.add(ht2.W());
        }
        try {
            this.U.b(d3);
            this.U.w(d2);
            if (this.V != null) {
                this.V.T(this.V.w() + this.U.w());
            }
        }
        catch (O_ o_4) {
            throw a.n.a(o_4);
        }
        try {
            if (this.D != null) {
                this.D.T(this.D.w() + this.U.w());
            }
        }
        catch (O_ o_5) {
            throw a.n.a(o_5);
        }
    }

    public void F(ht ht2, String string) {
        this.x(ht2, this.W(string));
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7298;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
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
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            a.n.e[n3] = n4;
        }
        return e[n3];
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
        for (ht ht2 : this.l()) {
            try {
                ht2.b(0.0);
                ht2.M(0.0);
                if (this.h) {
                    ht2.w(ht2.F());
                }
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
            try {
                if (!this.z) continue;
                ht2.T(ht2.y());
            }
            catch (O_ o_3) {
                throw a.n.a(o_3);
            }
        }
    }

    public Map<ht, cq> J(double d2) {
        LinkedHashMap<ht, cq> linkedHashMap = new LinkedHashMap<ht, cq>();
        for (ht ht2 : this.l()) {
            try {
                if (ht2.G() != d2) continue;
                linkedHashMap.put(ht2, this.I.get(ht2));
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
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
        Map<ht, cq> map = this.Y(d2);
        for (ht object : map.keySet()) {
            try {
                if (!object.f()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw a.n.a(o_2);
            }
            if (!(object.w() > d3)) continue;
            d3 = object.w();
        }
        for (Map.Entry entry : map.entrySet()) {
            try {
                if (!((ht)entry.getKey()).f()) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw a.n.a(o_3);
            }
            double d4 = d3;
            if (((cq)entry.getValue()).t() > 0) {
                d4 *= (double)((cq)entry.getValue()).t();
            }
            try {
                if (!(((ht)entry.getKey()).w() < d4)) continue;
                ((ht)entry.getKey()).T(d4);
            }
            catch (O_ o_4) {
                throw a.n.a(o_4);
            }
        }
        double d5 = this.w.G();
        for (ht ht2 : map.keySet()) {
            ht2.b(d5);
            d5 += ht2.w();
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = a.n.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
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
            return MethodHandles.lookup().findStatic(n.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(n.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

