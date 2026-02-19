/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.event.processing;

import a.Cl;
import a.Yw;
import a.bE;
import a.hQ;
import a.vM;
import a.yC;
import com.app.configuration.ConfigurationDescriptor;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.app.processing.DataTransformationHandler2167;
import com.collections.management.MultiContainerRegistry;
import com.computation.adaptive.AdaptiveComputationEngine668;
import com.concurrency.task.AsynchronousTaskOrchestrator722;
import com.configuration.management.ConfigurationParameterController;
import com.core.computation.AbstractComputationKernel;
import com.core.reflection.ReflectionUtilityResolver910;
import com.data.compression.DataCompressionNegotiator;
import com.data.mapping.IntegerMappingRegistry;
import com.event.handling.EventDispatchStrategy;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.math.transformation.NumericTransformationEngine;
import com.network.protocol.NetworkProtocolDispatcher;
import com.runtime.context.LightweightExecutionContext;
import com.security.auth.AuthenticationCredentialManager;
import com.security.cryptography.CryptographicContextManager153;
import com.security.data.SecureDataEncapsulator996;
import com.security.session.CryptographicSessionManager764;
import com.system.mapping.DynamicMappingRegistry;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.transformation.DataTransformationUtility;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.UserInterfaceThemeManager;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EventOrchestrationEngine
extends GraphicalRenderEngine1082 {
    private static int ou;
    private static final Map fb;
    @Nullable
    private final PluginLifecycleContract oZ;
    private final Yw oQ;
    private boolean oE;
    private static final String[] mb;
    private static final long ab;
    private static final Object[] lb;
    @NotNull
    private Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> o4;
    private final GraphicalRenderEngine1082 oN;
    private final boolean oR;
    private final GraphicalRenderEngine1082 oA;
    private final AdaptiveComputationEngine668 oP;
    private static final Integer[] eb;
    @Nullable
    private Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> oj;
    private static final long[] bb;
    private final List<String> oL;
    private final GraphicalRenderEngine1082 op;

    private AbstractComputationKernel lambda$setSearchView$5(LightweightExecutionContext lightweightExecutionContext, ConfigurationParameterController configurationParameterController) {
        AsynchronousTaskOrchestrator722 asynchronousTaskOrchestrator722 = new AsynchronousTaskOrchestrator722(lightweightExecutionContext, true);
        PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(1.0, 1.0, 2.0, 0.0, asynchronousTaskOrchestrator722);
        asynchronousTaskOrchestrator722.l(new EventDispatchStrategy(this, configurationParameterController));
        return precisionMathOrchestrator;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EventOrchestrationEngine.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void x(int n) {
        ou = n;
    }

    @Nullable
    public Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> U() {
        return this.o4;
    }

    public void T(boolean bl) {
        this.oE = bl;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$new$2(ConfigurationDescriptor configurationDescriptor) {
        this.Q(configurationDescriptor);
    }

    private List<DynamicMappingRegistry<LightweightExecutionContext, ConfigurationParameterController>> x() {
        long l = ab ^ 0x7387E44DA1FDL;
        LinkedHashMap<ConfigurationParameterController, LightweightExecutionContext> linkedHashMap = new LinkedHashMap<ConfigurationParameterController, LightweightExecutionContext>();
        String string = this.oP.a().toLowerCase();
        if (string.trim().isEmpty()) {
            for (LightweightExecutionContext object2 : NetworkProtocolDispatcher.jj) {
                ConfigurationParameterController configurationParameterController = TemporalMetadataResolver.h.x().V(object2);
                try {
                    if (configurationParameterController == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
                try {
                    if (this.oL.contains(configurationParameterController.Z())) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
                linkedHashMap.put(configurationParameterController, object2);
            }
        }
        for (LightweightExecutionContext lightweightExecutionContext : RuntimeResourceTracker.K()) {
            ConfigurationParameterController configurationParameterController;
            block29: {
                try {
                    try {
                        if (this.oZ != null && !this.oZ.i(lightweightExecutionContext)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventOrchestrationEngine.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
                configurationParameterController = TemporalMetadataResolver.h.x().V(lightweightExecutionContext);
                try {
                    if (configurationParameterController == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
                try {
                    try {
                        try {
                            if (configurationParameterController.o().contains(string) || configurationParameterController.o().replace((CharSequence)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)14905, (long)(0x7F4F2D22EE67C3E8L ^ l)), (long)8866274750105786245L, (long)l)), (CharSequence)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)26431, (long)(0x745446410AB41EEAL ^ l)), (long)8866274750105786245L, (long)l))).contains(string)) break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventOrchestrationEngine.a(customSystemException);
                        }
                        if (!lightweightExecutionContext.g().toLowerCase().contains(string)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventOrchestrationEngine.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
            }
            try {
                if (this.oL.contains(configurationParameterController.Z())) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
            linkedHashMap.put(configurationParameterController, lightweightExecutionContext);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(DynamicMappingRegistry.U(entry.getValue(), entry.getKey()));
        }
        arrayList.sort((arg_0, arg_1) -> EventOrchestrationEngine.lambda$getSearchedItems$8(string, arg_0, arg_1));
        return arrayList;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventOrchestrationEngine.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventOrchestrationEngine.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EventOrchestrationEngine.ab = MultiContainerRegistry.a(-818301756333617302L, 959453484697214742L, MethodHandles.lookup().lookupClass()).a(121838504842659L);
                EventOrchestrationEngine.lb = new Object[5];
                EventOrchestrationEngine.mb = new String[5];
                EventOrchestrationEngine.D();
                EventOrchestrationEngine.fb = new HashMap<K, V>(13);
                var0 = EventOrchestrationEngine.ab ^ 5102658521519L;
                EventOrchestrationEngine.x(66);
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
                var6_5 = "`\u00dd\u00e4#\u00b1\u00b5\u00f6\u00c8I\b\u009f\u0090\bt\u00b6\u0084Hf>Z7l@\u00fc\f\u00a6U@\u00ae\u0087\t\u00e8\u00c7\u00d7h\u00f0\u00f9\u00ad\u0091>\u0017\u0086O\u0002ME\u00de'\u001d\u00dc\u0086`E\u00eb\u00b6\u0096\u00bab\u00aa\u00ea\u00b9@}$@k\r@!\u00cck\u0099!\u00f68\u0007s\u00f1cN\u00fd\u001az\u00ffs)\u00dftl\u00c5\u00f4\u0006\nfD\u00b0\u008a\u00de\u0099\u000b\u0016?F\u00ac\b\u00ce\u0097rO\u00cc\u0005G\u00f7\u00f28T\u0094\u00b4k3\u008c4:\u0004'\u00d4\u00e79\u00c1\u0000m\u00bb$\u00ff[7\u001b\u00deza\u00d1f-;\r\u00e2\u001a\u001e|\u00ab\u008c\u009a\u00e92\u00af\u001b\u00f6-\u00fa\u0083\u0091\u00dfV\u00d5\u00c4af\n\u00b7\u00fc\u00f5\u0085wL\u0094\u00a9,\u00ab\u00fcz\u00aaM\u00e6\u00c9 \u00e9\u000e\u00ad\u0094\u0081\u0097J\u00f2\u00c5\u00c6\u0098\u00d6\u00aa\u009c\u00f48\u0018x/\u000b[\u00bf#\u00cb\u00a1\u00bf\u00d8\u009b\u0090S\u009d\u008f%\u00d5aZg\"\u000eV9\u008c\u0093\u00fe&\u00e7W";
                var7_6 = "`\u00dd\u00e4#\u00b1\u00b5\u00f6\u00c8I\b\u009f\u0090\bt\u00b6\u0084Hf>Z7l@\u00fc\f\u00a6U@\u00ae\u0087\t\u00e8\u00c7\u00d7h\u00f0\u00f9\u00ad\u0091>\u0017\u0086O\u0002ME\u00de'\u001d\u00dc\u0086`E\u00eb\u00b6\u0096\u00bab\u00aa\u00ea\u00b9@}$@k\r@!\u00cck\u0099!\u00f68\u0007s\u00f1cN\u00fd\u001az\u00ffs)\u00dftl\u00c5\u00f4\u0006\nfD\u00b0\u008a\u00de\u0099\u000b\u0016?F\u00ac\b\u00ce\u0097rO\u00cc\u0005G\u00f7\u00f28T\u0094\u00b4k3\u008c4:\u0004'\u00d4\u00e79\u00c1\u0000m\u00bb$\u00ff[7\u001b\u00deza\u00d1f-;\r\u00e2\u001a\u001e|\u00ab\u008c\u009a\u00e92\u00af\u001b\u00f6-\u00fa\u0083\u0091\u00dfV\u00d5\u00c4af\n\u00b7\u00fc\u00f5\u0085wL\u0094\u00a9,\u00ab\u00fcz\u00aaM\u00e6\u00c9 \u00e9\u000e\u00ad\u0094\u0081\u0097J\u00f2\u00c5\u00c6\u0098\u00d6\u00aa\u009c\u00f48\u0018x/\u000b[\u00bf#\u00cb\u00a1\u00bf\u00d8\u009b\u0090S\u009d\u008f%\u00d5aZg\"\u000eV9\u008c\u0093\u00fe&\u00e7W".length();
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
                    var6_5 = "\u00b6VO\u00f9D\u00b2UU\u0084\u0012\u00c0\u0093V\u0092\u00ad0";
                    var7_6 = "\u00b6VO\u00f9D\u00b2UU\u0084\u0012\u00c0\u0093V\u0092\u00ad0".length();
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
        EventOrchestrationEngine.bb = var8_3;
        EventOrchestrationEngine.eb = new Integer[31];
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void M(IntegerMappingRegistry<String, ConfigurationParameterController> integerMappingRegistry) {
        String string;
        List<String> list;
        try {
            list = this.oL;
            string = integerMappingRegistry.t() != null ? integerMappingRegistry.t() : integerMappingRegistry.a().Z();
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine.a(customSystemException);
        }
        if (list.contains(string)) {
            Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> consumer = this.oj;
            try {
                if (consumer == null) return;
                consumer.accept(integerMappingRegistry);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
        } else {
            this.o4.accept(integerMappingRegistry);
        }
    }

    private static Field k(long l, long l2) {
        int n = EventOrchestrationEngine.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = EventOrchestrationEngine.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventOrchestrationEngine.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventOrchestrationEngine.e(clazz3, string2, clazz2)) != null) {
                    EventOrchestrationEngine.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventOrchestrationEngine.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventOrchestrationEngine.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventOrchestrationEngine.j(251792079345177L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void G(@Nullable Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> consumer) {
        this.oj = consumer;
    }

    public static int a() {
        return ou;
    }

    public void a(String string) {
        this.oL.add(string);
    }

    private void lambda$setCategoryView$10(PluginLifecycleContract pluginLifecycleContract) {
        GraphicalRenderingController.st.execute(() -> this.lambda$null$9(pluginLifecycleContract));
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventOrchestrationEngine.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                EventOrchestrationEngine.lb[n] = clazz = Class.forName(mb[n]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == '\u00ec' || c == '\u00da' || c == '\u00c5') {
                field = EventOrchestrationEngine.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventOrchestrationEngine.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$null$0() {
        block5: {
            block4: {
                try {
                    try {
                        if (!this.oP.a().trim().isEmpty() || this.oR) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventOrchestrationEngine.a(customSystemException);
                    }
                    this.I();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
            }
            this.R();
        }
    }

    private void lambda$null$6(ConfigurationParameterController configurationParameterController) {
        try {
            this.M(IntegerMappingRegistry.T(configurationParameterController));
            if (this.oE) {
                this.oL.add(configurationParameterController.Z());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine.a(customSystemException);
        }
        this.R();
    }

    private static int lambda$getSearchedItems$8(String string, DynamicMappingRegistry dynamicMappingRegistry, DynamicMappingRegistry dynamicMappingRegistry2) {
        block9: {
            String string2;
            String string3;
            block8: {
                string3 = ((LightweightExecutionContext)dynamicMappingRegistry.z()).g().toLowerCase();
                string2 = ((LightweightExecutionContext)dynamicMappingRegistry2.z()).g().toLowerCase();
                try {
                    try {
                        if (!string3.equals(string) || string2.equals(string)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventOrchestrationEngine.a(customSystemException);
                    }
                    return -1;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
            }
            try {
                try {
                    if (!string3.startsWith(string) || string2.startsWith(string)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
                return -1;
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
        }
        return 0;
    }

    private GraphicalRenderEngine1082 R(double d2, String string, boolean bl, boolean bl2) {
        int n;
        double d3;
        Object object;
        Object object2;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        long l;
        block6: {
            block5: {
                l = ab ^ 0x2333927FFAF5L;
                graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2, 28.0);
                try {
                    graphicalRenderEngine1082.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)22861, (long)(0x1882175BAB507B8BL ^ l)), (long)2306693329374432397L, (long)l)));
                    graphicalRenderEngine1082.i(false);
                    if (!bl || !(this.oQ instanceof vM)) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
                object2 = (vM)this.oQ;
                GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(10.0, 10.0);
                graphicalRenderEngine10822.i(true);
                graphicalRenderEngine10822.Q(EventOrchestrationEngine.M.k);
                graphicalRenderEngine10822.B(5);
                graphicalRenderEngine1082.n(graphicalRenderEngine10822, new Object[0]);
                CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153(String.valueOf(((vM)object2).T() + 1), 0.8, EventOrchestrationEngine.M.c, true);
                cryptographicContextManager153.S(3.0f);
                graphicalRenderEngine10822.n(cryptographicContextManager153, new Object[0]);
                graphicalRenderEngine1082.n(graphicalRenderEngine10822, new Object[0]);
                break block6;
            }
            graphicalRenderEngine1082.n(new bE(0.0, 10.0), new Object[0]);
        }
        if (bl2) {
            object2 = new yC((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)16336, (long)(0x32E5ACFA0C939D08L ^ l)), (long)2306693329374432397L, (long)l)), 6.0, 6.0, 10.0, 10.0, EventOrchestrationEngine.M.Z, EventOrchestrationEngine.M.q, null);
            ((yC)object2).u(true);
            ((yC)object2).w(true);
            ((hQ)object2).N(this::I);
            graphicalRenderEngine1082.n(new bE(8.0, 0.0), EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)18543, (long)(0x79EC69E4983E6AA4L ^ l)), (long)2306693329374432397L, (long)l));
            graphicalRenderEngine1082.n((AbstractComputationKernel)object2, EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)24874, (long)(0x90577163F3343E9L ^ l)), (long)2306693329374432397L, (long)l));
        }
        object2 = new DataCompressionNegotiator(string, 1.0, EventOrchestrationEngine.M.c);
        try {
            object = object2;
            d3 = graphicalRenderEngine1082.w();
            n = bl2 ? 36 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine.a(customSystemException);
        }
        ((AbstractComputationKernel)object).T(d3 - (double)n);
        ((CryptographicContextManager153)object2).q(true);
        ((AbstractComputationKernel)object2).F(false);
        graphicalRenderEngine1082.n((AbstractComputationKernel)object2, new Object[0]);
        return graphicalRenderEngine1082;
    }

    private static Method l(long l, long l2) {
        int n = EventOrchestrationEngine.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventOrchestrationEngine.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventOrchestrationEngine.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventOrchestrationEngine.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventOrchestrationEngine.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventOrchestrationEngine.j(251792079345177L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventOrchestrationEngine.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventOrchestrationEngine.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventOrchestrationEngine.j(251792079345177L, 0L);
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

    public static int y() {
        int n = EventOrchestrationEngine.a();
        try {
            if (n == 0) {
                return 18;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine.a(customSystemException);
        }
        return 0;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static List j(EventOrchestrationEngine eventOrchestrationEngine) {
        return eventOrchestrationEngine.oL;
    }

    static void K(EventOrchestrationEngine eventOrchestrationEngine, IntegerMappingRegistry integerMappingRegistry) {
        eventOrchestrationEngine.M(integerMappingRegistry);
    }

    public EventOrchestrationEngine(Yw yw, boolean bl, @Nullable PluginLifecycleContract pluginLifecycleContract, List<String> list, Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> consumer) {
        block23: {
            block22: {
                Object object2;
                Object object3;
                Object object4;
                long l = ab ^ 0x4C6A8E46ED57L;
                super(108.0, 215.0);
                this.oP = new AdaptiveComputationEngine668((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)4622, (long)(0x59DDE23069982764L ^ l)), (long)4008601715377527599L, (long)l)), false, true);
                this.oL = new ArrayList<String>();
                this.oE = true;
                this.oQ = yw;
                this.oR = bl;
                this.oZ = pluginLifecycleContract;
                this.oL.addAll(list);
                this.o4 = consumer;
                this.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)5364, (long)(0x7EB6ACA56E08A19FL ^ l)), (long)4008601715377527599L, (long)l)));
                this.Q(EventOrchestrationEngine.M.J);
                double d2 = this.b();
                this.oA = new GraphicalRenderEngine1082(this.w(), d2);
                this.op = new GraphicalRenderEngine1082(this.w(), d2);
                this.oN = new GraphicalRenderEngine1082(this.w(), d2);
                this.oA.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)10080, (long)(0x60FB45F46885920EL ^ l)), (long)4008601715377527599L, (long)l)));
                this.op.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)17220, (long)(0x6653051D8DD27637L ^ l)), (long)4008601715377527599L, (long)l)));
                this.oN.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)29451, (long)(0x518417241E0C4668L ^ l)), (long)4008601715377527599L, (long)l)));
                this.oA.i(false);
                this.op.i(false);
                this.oN.i(false);
                this.oA.n(this.R(this.w(), (String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)4424, (long)(0x6A75FF2E42C1A43CL ^ l)), (long)4008601715377527599L, (long)l)), true, false), new Object[0]);
                this.oA.n(new bE(this.w(), 0.0), new Object[0]);
                this.oA.n(new bE(9.0, 0.0), EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)30825, (long)(0x3A08ACBBD1A8CD1CL ^ l)), (long)4008601715377527599L, (long)l));
                this.oP.i(false);
                this.oP.I(false);
                this.oP.Z(0.0);
                this.oP.R(0.0f);
                this.oP.H(0.0f);
                this.oP.O().N(false);
                this.oP.g(EventOrchestrationEngine.M.w);
                this.oP.w(14.0);
                this.oP.T(this.oA.w() - 16.0);
                this.oP.h(this::lambda$new$1);
                this.oA.n(this.oP, new Object[0]);
                this.oA.n(new bE(0.0, 5.0), new Object[0]);
                CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)388, (long)(0x1D10A1EAE66634FDL ^ l)), (long)4008601715377527599L, (long)l)), 0.7, EventOrchestrationEngine.M.w, true);
                cryptographicContextManager153.h(0);
                cryptographicContextManager153.T(this.oA.w() - 10.0);
                this.oA.n(new bE(5.0, 0.0), EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)9134, (long)(0x30E3CC99F1BE16D8L ^ l)), (long)4008601715377527599L, (long)l));
                this.oA.n(cryptographicContextManager153, new Object[0]);
                GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.oA.w() - 10.0, 30.0);
                graphicalRenderEngine1082.i(false);
                PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(5.0, graphicalRenderEngine1082);
                precisionMathOrchestrator.i(false);
                this.oA.n(precisionMathOrchestrator, new Object[0]);
                int n = 0;
                while (true) {
                    block20: {
                        CallSite callSite;
                        Object[] objectArray;
                        PrecisionMathOrchestrator precisionMathOrchestrator2;
                        GraphicalRenderEngine1082 graphicalRenderEngine10822;
                        block21: {
                            block19: {
                                LightweightExecutionContext lightweightExecutionContext;
                                block18: {
                                    block17: {
                                        try {
                                            try {
                                                if (n >= 12) break;
                                                if (n >= NetworkProtocolDispatcher.jj.size()) break block17;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventOrchestrationEngine.a(customSystemException);
                                            }
                                            lightweightExecutionContext = NetworkProtocolDispatcher.jj.get(n);
                                            break block18;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventOrchestrationEngine.a(customSystemException);
                                        }
                                    }
                                    lightweightExecutionContext = null;
                                }
                                object4 = lightweightExecutionContext;
                                try {
                                    if (object4 != null) break block19;
                                    break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventOrchestrationEngine.a(customSystemException);
                                }
                            }
                            object3 = TemporalMetadataResolver.h.x().V((LightweightExecutionContext)object4);
                            try {
                                if (object3 != null) break block21;
                                break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventOrchestrationEngine.a(customSystemException);
                            }
                        }
                        object2 = new AsynchronousTaskOrchestrator722((LightweightExecutionContext)object4, false);
                        try {
                            ((AbstractComputationKernel)object2).l(new DataTransformationHandler2167(this, (ConfigurationParameterController)object3));
                            graphicalRenderEngine10822 = graphicalRenderEngine1082;
                            precisionMathOrchestrator2 = new PrecisionMathOrchestrator(0.0, 2.0, 2.0, 0.0, (AbstractComputationKernel)object2);
                            Object[] objectArray2 = new Object[1];
                            Object[] objectArray3 = objectArray2;
                            objectArray = objectArray2;
                            int n2 = 0;
                            callSite = n == 5 ? EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)4971, (long)(0x7E93E56555A0A606L ^ l)), (long)4008601715377527599L, (long)l) : EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)27736, (long)(0x6FB87DBF0A7D93EL ^ l)), (long)4008601715377527599L, (long)l);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventOrchestrationEngine.a(customSystemException);
                        }
                        objectArray3[n2] = callSite;
                        graphicalRenderEngine10822.n(precisionMathOrchestrator2, objectArray);
                    }
                    ++n;
                }
                CryptographicContextManager153 cryptographicContextManager1532 = new CryptographicContextManager153((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)2997, (long)(0x23FE97DC47A6BEC9L ^ l)), (long)4008601715377527599L, (long)l)), 0.7, EventOrchestrationEngine.M.w, true);
                cryptographicContextManager1532.h(4);
                cryptographicContextManager1532.T(cryptographicContextManager1532.D() * 1.2);
                this.oA.n(new bE(5.0, 0.0), EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)23595, (long)(0x2D8D19417807E949L ^ l)), (long)4008601715377527599L, (long)l));
                this.oA.n(cryptographicContextManager1532, EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)5346, (long)(0x6CC0DF55AEACA19AL ^ l)), (long)4008601715377527599L, (long)l));
                object4 = new UserInterfaceThemeManager((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)27534, (long)(0xBD958F74248DEFEL ^ l)), (long)4008601715377527599L, (long)l)), 5.0f, 5.0f);
                ((UserInterfaceThemeManager)object4).b(true);
                ((AbstractComputationKernel)object4).g((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)23503, (long)(0x2DEE7C6F8C0EEBDL ^ l)), (long)4008601715377527599L, (long)l)));
                this.oA.n(new PrecisionMathOrchestrator(1.5, (AbstractComputationKernel)object4), new Object[0]);
                object3 = new GraphicalRenderEngine1082(this.oA.w(), 115.0);
                ((NumericTransformationEngine)object3).d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)27037, (long)(0x5713AE934C0EDCF5L ^ l)), (long)4008601715377527599L, (long)l)));
                ((AbstractComputationKernel)object3).i(false);
                ((NumericTransformationEngine)object3).i(((AbstractComputationKernel)object3).b());
                this.oA.n((AbstractComputationKernel)object3, new Object[0]);
                for (ConfigurationDescriptor object5 : ConfigurationDescriptor.VALUES) {
                    try {
                        if (object5.s() == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventOrchestrationEngine.a(customSystemException);
                    }
                    AuthenticationCredentialManager authenticationCredentialManager = new AuthenticationCredentialManager(object5.O(), object5.s(), () -> this.lambda$new$2(object5));
                    authenticationCredentialManager.g(object5.e());
                    authenticationCredentialManager.T(this.oA.w());
                    authenticationCredentialManager.w(18.0);
                    ((NumericTransformationEngine)object3).n(new PrecisionMathOrchestrator(1.0, 0.0, 0.0, 0.0, authenticationCredentialManager), new Object[0]);
                }
                object2 = ReflectionUtilityResolver910.v;
                AuthenticationCredentialManager authenticationCredentialManager = new AuthenticationCredentialManager(object2.O(), object2.Y(), () -> this.lambda$new$4((PluginLifecycleContract)object2));
                try {
                    authenticationCredentialManager.T(this.oA.w());
                    authenticationCredentialManager.w(18.0);
                    authenticationCredentialManager.g(object2.e());
                    ((NumericTransformationEngine)object3).n(new PrecisionMathOrchestrator(1.0, 0.0, 0.0, 0.0, authenticationCredentialManager), new Object[0]);
                    this.oA.T(108.0);
                    this.n(this.oA, new Object[0]);
                    this.n(this.op, new Object[0]);
                    this.n(this.oN, new Object[0]);
                    if (!this.oR) break block22;
                    this.R();
                    break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventOrchestrationEngine.a(customSystemException);
                }
            }
            this.I();
        }
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "\u001b4U";
        objectArray[1] = Integer.TYPE;
        EventOrchestrationEngine.mb[1] = "java/lang/Integer";
        objectArray[2] = ".=4\u0015\u0012\u0010%2%Zo\b65,\u0013";
        objectArray[3] = "}d4!\r|vk%nlr}`!4";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "W\u0014@\u0015\u0004S\u0007TElW\u0019h\u0010\u0011\f\fX\u0017\\\u0017\r<[\u000f]\u0019W^\u0001Q\n\u0002l";
    }

    private void lambda$new$4(PluginLifecycleContract pluginLifecycleContract) {
        GraphicalRenderingController.st.execute(() -> this.lambda$null$3(pluginLifecycleContract));
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 61;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 53;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 31;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 1;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 44;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 36;
                break;
            }
            case 15: {
                n3 = 29;
                break;
            }
            case 16: {
                n3 = 11;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 16;
                break;
            }
            case 21: {
                n3 = 18;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 47;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 63;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 24;
                break;
            }
            case 28: {
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 33;
                break;
            }
            case 36: {
                n3 = 15;
                break;
            }
            case 37: {
                n3 = 5;
                break;
            }
            case 38: {
                n3 = 13;
                break;
            }
            case 39: {
                n3 = 6;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 43;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 46: {
                n3 = 12;
                break;
            }
            case 47: {
                n3 = 50;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 42;
                break;
            }
            case 53: {
                n3 = 8;
                break;
            }
            case 54: {
                n3 = 62;
                break;
            }
            case 55: {
                n3 = 35;
                break;
            }
            case 56: {
                n3 = 2;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 49;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 10;
                break;
            }
            default: {
                n3 = 26;
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
        EventOrchestrationEngine.mb[n4] = new String(cArray);
        return n4;
    }

    public void R() {
        double d2;
        double d3;
        double d4;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        GraphicalRenderEngine1082 graphicalRenderEngine10822;
        boolean bl;
        boolean bl2;
        CallSite callSite;
        double d5;
        EventOrchestrationEngine eventOrchestrationEngine;
        GraphicalRenderEngine1082 graphicalRenderEngine10823;
        long l = ab ^ 0x5FD0F9BE12D8L;
        try {
            this.oA.N(false);
            this.op.N(true);
            this.oN.N(false);
            this.op.f();
            graphicalRenderEngine10823 = this.op;
            eventOrchestrationEngine = this;
            d5 = this.w();
            callSite = EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)31328, (long)(0x2784E773953AB08AL ^ l)), (long)-4022143551706913632L, (long)l);
            bl2 = false;
            bl = !this.oR;
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine.a(customSystemException);
        }
        graphicalRenderEngine10823.n(eventOrchestrationEngine.R(d5, (String)((Object)callSite), bl2, bl), new Object[0]);
        this.op.n(new bE(9.0, 0.0), EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)7828, (long)(0x447DBE0785FC547BL ^ l)), (long)-4022143551706913632L, (long)l));
        this.op.n(this.oP, new Object[0]);
        this.op.n(new bE(0.0, 5.0), new Object[0]);
        CryptographicSessionManager764 cryptographicSessionManager764 = new CryptographicSessionManager764(this.op.w() - 5.0, 0.0);
        cryptographicSessionManager764.i(36.0);
        cryptographicSessionManager764.i(false);
        ArrayList<String> arrayList = new ArrayList<String>(this.oL);
        CryptographicContextManager153 cryptographicContextManager153 = null;
        if (!arrayList.isEmpty()) {
            cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)22541, (long)(0x35AABCD3F62112FCL ^ l)), (long)-4022143551706913632L, (long)l)), 0.8, EventOrchestrationEngine.M.w, true);
            cryptographicContextManager153.T(this.oA.w() - 10.0);
            cryptographicContextManager153.w(8.0);
            cryptographicContextManager153.h(0);
            this.op.n(new PrecisionMathOrchestrator(0.0, 2.0, 5.0, 0.0, cryptographicContextManager153), new Object[0]);
        }
        BiFunction<LightweightExecutionContext, ConfigurationParameterController, AbstractComputationKernel> biFunction = this::lambda$setSearchView$5;
        for (String object2 : arrayList) {
            CallSite callSite2;
            Object[] objectArray;
            AbstractComputationKernel abstractComputationKernel;
            CryptographicSessionManager764 cryptographicSessionManager7642;
            ConfigurationParameterController n = TemporalMetadataResolver.h.x().G(object2);
            try {
                if (n == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
            LightweightExecutionContext n2 = n.H();
            try {
                if (n2 == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
            try {
                cryptographicSessionManager7642 = cryptographicSessionManager764;
                abstractComputationKernel = biFunction.apply(n2, n);
                Object[] objectArray2 = new Object[1];
                Object[] objectArray3 = objectArray2;
                objectArray = objectArray2;
                int n3 = 0;
                callSite2 = cryptographicSessionManager764.A().size() % 6 == 5 ? EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)22791, (long)(0x62FD6ADD99EF13E4L ^ l)), (long)-4022143551706913632L, (long)l) : EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)10895, (long)(0x5484B80B0B606071L ^ l)), (long)-4022143551706913632L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
            objectArray3[n3] = callSite2;
            cryptographicSessionManager7642.n(abstractComputationKernel, objectArray);
        }
        this.op.n(new PrecisionMathOrchestrator(5.0, 0.0, cryptographicSessionManager764), new Object[0]);
        cryptographicSessionManager764.h(true);
        CryptographicContextManager153 cryptographicContextManager1532 = new CryptographicContextManager153((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)25727, (long)(0xC246E2F39522E87L ^ l)), (long)-4022143551706913632L, (long)l)), 0.8, EventOrchestrationEngine.M.w, true);
        try {
            GraphicalRenderEngine1082 graphicalRenderEngine10824;
            cryptographicContextManager1532.T(this.oA.w() - 10.0);
            cryptographicContextManager1532.w(8.0);
            this.op.n(new PrecisionMathOrchestrator(5.0, 0.0, 5.0, 0.0, cryptographicContextManager1532), new Object[0]);
            graphicalRenderEngine10822 = graphicalRenderEngine10824;
            graphicalRenderEngine1082 = graphicalRenderEngine10824;
            d4 = this.op.w();
            d3 = 135.0 - cryptographicSessionManager764.z();
            d2 = cryptographicContextManager153 != null ? cryptographicContextManager153.b() + 2.0 : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine.a(customSystemException);
        }
        graphicalRenderEngine10822(d4, d3 - d2);
        GraphicalRenderEngine1082 graphicalRenderEngine10825 = graphicalRenderEngine1082;
        graphicalRenderEngine10825.i(graphicalRenderEngine10825.b());
        graphicalRenderEngine10825.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)29573, (long)(0x4A02F2A530273977L ^ l)), (long)-4022143551706913632L, (long)l)));
        graphicalRenderEngine10825.i(false);
        this.op.n(graphicalRenderEngine10825, new Object[0]);
        int n = 0;
        int n4 = 300;
        for (DynamicMappingRegistry<LightweightExecutionContext, ConfigurationParameterController> dynamicMappingRegistry : this.x()) {
            LightweightExecutionContext lightweightExecutionContext = dynamicMappingRegistry.z();
            ConfigurationParameterController configurationParameterController = dynamicMappingRegistry.Z();
            Cl cl = new Cl(lightweightExecutionContext);
            cl.T(graphicalRenderEngine10825.w());
            cl.w(16.0);
            PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(1.0, 0.0, 0.0, 0.0, cl);
            try {
                graphicalRenderEngine10825.n(precisionMathOrchestrator, new Object[0]);
                cl.A(() -> this.lambda$setSearchView$7(configurationParameterController));
                if (++n < n4) continue;
                break;
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine.a(customSystemException);
            }
        }
    }

    public void I() {
        this.oA.N(true);
        this.op.N(false);
        this.oN.N(false);
    }

    public boolean n() {
        return this.oE;
    }

    private void lambda$null$3(PluginLifecycleContract pluginLifecycleContract) {
        this.M(IntegerMappingRegistry.t(pluginLifecycleContract.w()));
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D8;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventOrchestrationEngine.eb[n2] = n3;
        }
        return eb[n2];
    }

    public void Q(ConfigurationDescriptor configurationDescriptor) {
        long l = ab ^ 0x2696300CF5A6L;
        this.oA.N(false);
        this.op.N(false);
        this.oN.N(true);
        this.oN.f();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.R(this.w(), configurationDescriptor.O(), false, true);
        this.oN.n(graphicalRenderEngine1082, new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(this.op.w(), this.op.b() - graphicalRenderEngine1082.b());
        graphicalRenderEngine10822.i(graphicalRenderEngine10822.b());
        graphicalRenderEngine10822.d().f((String)((Object)EventOrchestrationEngine.d("\u00d8", (int)EventOrchestrationEngine.c("e", (int)4032, (long)(0x3B897724B7EAA25EL ^ l)), (long)3409225988260971486L, (long)l)));
        graphicalRenderEngine10822.i(false);
        this.oN.n(graphicalRenderEngine10822, new Object[0]);
        for (PluginLifecycleContract pluginLifecycleContract : DataTransformationUtility.n(configurationDescriptor)) {
            SecureDataEncapsulator996 secureDataEncapsulator996 = new SecureDataEncapsulator996(pluginLifecycleContract, () -> this.lambda$setCategoryView$10(pluginLifecycleContract));
            secureDataEncapsulator996.T(graphicalRenderEngine10822.w());
            secureDataEncapsulator996.w(18.0);
            secureDataEncapsulator996.g(pluginLifecycleContract.e());
            graphicalRenderEngine10822.n(new PrecisionMathOrchestrator(1.0, 0.0, 0.0, 0.0, secureDataEncapsulator996), new Object[0]);
        }
    }

    private void lambda$new$1(char c, int n) {
        GraphicalRenderingController.st.execute(this::lambda$null$0);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$null$9(PluginLifecycleContract pluginLifecycleContract) {
        this.M(IntegerMappingRegistry.t(pluginLifecycleContract.w()));
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventOrchestrationEngine.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = EventOrchestrationEngine.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventOrchestrationEngine.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void y(String string) {
        this.oL.remove(string);
    }

    public void j(@Nullable Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> consumer) {
        this.o4 = consumer;
    }

    @Nullable
    public Consumer<IntegerMappingRegistry<String, ConfigurationParameterController>> r() {
        return this.oj;
    }

    private void lambda$setSearchView$7(ConfigurationParameterController configurationParameterController) {
        GraphicalRenderingController.st.execute(() -> this.lambda$null$6(configurationParameterController));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EventOrchestrationEngine.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(EventOrchestrationEngine.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

