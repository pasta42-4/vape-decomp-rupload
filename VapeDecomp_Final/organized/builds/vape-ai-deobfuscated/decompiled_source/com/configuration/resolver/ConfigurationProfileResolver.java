/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package com.configuration.resolver;

import a.ec;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.system.configuration.RuntimeConfigurationBuilder;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.flags.AsyncFlagCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ObjectLifecycleManager;
import com.data.stream.DataStreamInterceptor1614;
import com.data.transformation.XmlTransformer;
import com.event.processing.EventOrchestrationEngine1341;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.network.connection.NetworkConnectionDescriptor;
import com.notification.dispatch.NotificationDispatchInterface2673;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.security.protocol.EncryptionProtocolHandler397;
import com.security.tokenization.SecureTokenGenerator1301;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.reflection.ReflectionUtility;
import com.vape.events.VapeAsyncEventListener;
import com.vape.events.VapeGenericEventBroker;
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
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ConfigurationProfileResolver<K, T extends ConfigurationProfileResolver<K, T>>
extends AsyncFlagCoordinator
implements NotificationDispatchInterface2673 {
    private final List<String> f;
    private boolean z;
    private static final long[] bb;
    private final HashMap<SecureTokenGenerator1301, EventOrchestrationEngine1341> i;
    private boolean j;
    private static final Map db;
    private static final long ab;
    private static boolean c;
    private final Object P;
    private final List<VapeGenericEventBroker<T, K>> b;
    private static final String[] fb;
    @Nullable
    private String M;
    private boolean p;
    private final String E;
    private AbstractComputationKernel l;
    private final List<VapeAsyncEventListener<T>> B;
    private static final Integer[] cb;
    private final DataStreamInterceptor1614<K, T> r;
    private boolean G;
    private ConfigurationProfileResolver C;
    private static final Object[] eb;
    private XmlTransformer<K, T> w;
    protected K N;
    private boolean I;
    private K O;
    @Nullable
    private Color v;

    @Nullable
    public Color U() {
        return this.v;
    }

    public ConfigurationProfileResolver G() {
        return this.C;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationProfileResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void P(VapeAsyncEventListener<T> vapeAsyncEventListener) {
        this.B.add(vapeAsyncEventListener);
    }

    @Nullable
    public String d() {
        return this.M;
    }

    protected JsonObject y() {
        long l = ab ^ 0x6987823C4810L;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty((String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)15246, (long)(0x43C8B429B8834B9L ^ l)), (long)6535410872685508051L, (long)l)), this.x());
        return jsonObject;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean f() {
        return this.j;
    }

    public void W() {
        try {
            if (this.I) {
                this.H(this.u());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileResolver.d(customSystemException);
        }
    }

    public boolean A() {
        HashMap<EventOrchestrationEngine1341, Boolean> hashMap = new HashMap<EventOrchestrationEngine1341, Boolean>();
        for (Map.Entry<SecureTokenGenerator1301, EventOrchestrationEngine1341> entry : this.i.entrySet()) {
            block9: {
                EventOrchestrationEngine1341 eventOrchestrationEngine1341;
                block10: {
                    eventOrchestrationEngine1341 = entry.getValue();
                    try {
                        try {
                            if (eventOrchestrationEngine1341 == null) break block9;
                            if (hashMap.containsKey(eventOrchestrationEngine1341)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationProfileResolver.d(customSystemException);
                        }
                        hashMap.put(eventOrchestrationEngine1341, eventOrchestrationEngine1341.x());
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileResolver.d(customSystemException);
                    }
                }
                try {
                    if (((Boolean)hashMap.get(eventOrchestrationEngine1341)).booleanValue()) continue;
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
            }
            try {
                if (entry.getKey().j(this)) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
        }
        return true;
    }

    public abstract T s();

    public void v() {
        this.w = this.r;
    }

    public String p() {
        return this.J().toString();
    }

    public K u() {
        return this.N;
    }

    public K i() {
        return this.O;
    }

    public static boolean U() {
        boolean bl = ConfigurationProfileResolver.V();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileResolver.d(customSystemException);
        }
        return false;
    }

    public ConfigurationProfileResolver(Object object, String string, K k) {
        block12: {
            this.v = null;
            this.G = true;
            this.p = false;
            this.z = false;
            this.I = true;
            this.i = new HashMap();
            this.B = new ArrayList<VapeAsyncEventListener<T>>();
            this.b = new ArrayList<VapeGenericEventBroker<T, K>>();
            this.f = new ArrayList<String>();
            this.r = new DataStreamInterceptor1614(this);
            this.w = this.r;
            this.P = object;
            this.E = string;
            this.t(k);
            this.O = k;
            if (object != null) {
                block11: {
                    block10: {
                        try {
                            try {
                                if (!(object instanceof AdaptiveRenderingEngine) && !(object instanceof ReflectionUtility)) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationProfileResolver.d(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationProfileResolver.d(customSystemException);
                        }
                    }
                    try {
                        if (!(object instanceof ObjectLifecycleManager)) break block11;
                        TemporalMetadataResolver.h.V().z(this);
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileResolver.d(customSystemException);
                    }
                }
                try {
                    if (!(object instanceof ContextualExecutionFramework)) {
                        TemporalMetadataResolver.h.Z().k(this);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
            }
        }
    }

    public void x(@Nullable Color color) {
        this.v = color;
    }

    public static void J(boolean bl) {
        c = bl;
    }

    public void V(XmlTransformer<K, T> xmlTransformer) {
        this.w = xmlTransformer;
    }

    private static Field c(long l, long l2) {
        int n = ConfigurationProfileResolver.a(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationProfileResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationProfileResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationProfileResolver.a(clazz3, string2, clazz2)) != null) {
                    ConfigurationProfileResolver.eb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationProfileResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationProfileResolver.eb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationProfileResolver.b(232213663213828L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void Z(boolean bl) {
        this.G = bl;
    }

    public T R(@Nullable String string) {
        this.M = string;
        return (T)this;
    }

    public AbstractComputationKernel z() {
        return this.l;
    }

    public void O(AbstractComputationKernel abstractComputationKernel) {
        this.l = abstractComputationKernel;
    }

    public void M() {
        try {
            if (!this.j) {
                TemporalMetadataResolver.h.n();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileResolver.d(customSystemException);
        }
        for (VapeAsyncEventListener<T> vapeAsyncEventListener : this.B) {
            vapeAsyncEventListener.K(this);
        }
    }

    public void d(K k) {
        this.O = k;
        this.M();
    }

    public void t(K k) {
        this.N = k;
    }

    public void k(boolean bl) {
        this.p = bl;
    }

    public abstract void i(String var1);

    private static void r() {
        Object[] objectArray = eb;
        eb[0] = "e@/";
        objectArray[1] = Integer.TYPE;
        ConfigurationProfileResolver.fb[1] = "java/lang/Integer";
        objectArray[2] = "u\tjj2k~\u0006{%Osm\u0001rl";
        objectArray[3] = "*`w\u001a\u00022!ofUc<*db\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~oV\u000e6<a)\b|2 \u001bk_\u0011::f#YLg[\"7QF:`j3\n\u0019Y";
    }

    public void H(K k) {
        this.w.b(k);
    }

    public boolean v() {
        return this.G;
    }

    public static boolean V() {
        return c;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean C(JsonObject jsonObject) {
        long l = ab ^ 0x71C74749FE3L;
        if (this.g(jsonObject)) {
            String string;
            block4: {
                string = "";
                String string2 = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)7883, (long)(0x224539D7D623C60CL ^ l)), (long)-8268293304711519712L, (long)l)));
                if (string2 != null) {
                    string = string2;
                }
                try {
                    if (!this.z || !string.startsWith((String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)9303, (long)(0x71238E3BFAD57C92L ^ l)), (long)-8268293304711519712L, (long)l)))) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
                string = string.split((String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)13917, (long)(0x449AD6EBD0D5EE9BL ^ l)), (long)-8268293304711519712L, (long)l)))[1];
                string = ec.c(string);
            }
            this.i(string);
            this.O();
            return true;
        }
        return false;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationProfileResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationProfileResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public <T> T y(boolean bl) {
        this.I = bl;
        return (T)this;
    }

    public T Z(boolean bl) {
        this.z = bl;
        return (T)this;
    }

    public void e(SecureTokenGenerator1301 secureTokenGenerator1301) {
        this.i.put(secureTokenGenerator1301, null);
    }

    @Override
    public String O() {
        return this.E;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationProfileResolver.a(l, l2);
            object = eb[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationProfileResolver.eb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CustomSystemException d(CustomSystemException customSystemException) {
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean x(K k) {
        K k2 = this.J();
        for (VapeGenericEventBroker<K, K> vapeGenericEventBroker : this.b) {
            try {
                if (vapeGenericEventBroker.a(this, k2, k)) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigurationProfileResolver.ab = MultiContainerRegistry.a(-3365976829290425248L, -4973024528587432550L, MethodHandles.lookup().lookupClass()).a(244859027654033L);
                ConfigurationProfileResolver.eb = new Object[5];
                ConfigurationProfileResolver.fb = new String[5];
                ConfigurationProfileResolver.r();
                ConfigurationProfileResolver.db = new HashMap<K, V>(13);
                var0 = ConfigurationProfileResolver.ab ^ 46119093129752L;
                ConfigurationProfileResolver.J(false);
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00e3\u00a6#\u00c3\u00e6\u00d0!\u009a\u00bc\u0097\u00e1\u00a6\u0080\u00df\u00e0x\u00faV\u0085\u00d4\b\u00bb\u00eb\u0014M0\u0004\u00d8\u000b \u00a8\u0010>3\u0093z\u00e5$\f\u00f5\u0094\u009d]U\u00cbd\u00efA\u00f0\u0083\u00c5\u00cb\u00a4\u00de0\u00bcY\f\f&\u0018-{\u00ea";
                var7_6 = "\u00e3\u00a6#\u00c3\u00e6\u00d0!\u009a\u00bc\u0097\u00e1\u00a6\u0080\u00df\u00e0x\u00faV\u0085\u00d4\b\u00bb\u00eb\u0014M0\u0004\u00d8\u000b \u00a8\u0010>3\u0093z\u00e5$\f\u00f5\u0094\u009d]U\u00cbd\u00efA\u00f0\u0083\u00c5\u00cb\u00a4\u00de0\u00bcY\f\f&\u0018-{\u00ea".length();
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
                    var6_5 = "D\u000b\u00ab\u00f6q\u009d\u00b4\u00d0\u00d7\u001e\u00fb02\u009f\u009c\u00ea";
                    var7_6 = "D\u000b\u00ab\u00f6q\u009d\u00b4\u00d0\u00d7\u001e\u00fb02\u009f\u009c\u00ea".length();
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
        ConfigurationProfileResolver.bb = var8_3;
        ConfigurationProfileResolver.cb = new Integer[10];
    }

    public void F(EventOrchestrationEngine1341 eventOrchestrationEngine1341) {
        for (SecureTokenGenerator1301 secureTokenGenerator1301 : eventOrchestrationEngine1341.V().keySet()) {
            this.i.put(secureTokenGenerator1301, eventOrchestrationEngine1341);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5582;
        if (cb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationProfileResolver.cb[n2] = n3;
        }
        return cb[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationProfileResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public K A() {
        return this.O;
    }

    public boolean w() {
        return this.p;
    }

    public boolean p() {
        K k;
        K k2;
        block31: {
            block30: {
                k2 = this.J();
                k = this.u();
                try {
                    try {
                        if (k != null || k2 != null) break block30;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileResolver.d(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
            }
            try {
                try {
                    if (k == null || k2 != null) break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
        }
        try {
            if (k == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileResolver.d(customSystemException);
        }
        if (this instanceof NetworkConnectionDescriptor) {
            List list = (List)k;
            List list2 = (List)k2;
            try {
                if (list.size() != list2.size()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
            for (int i = 0; i < list.size(); ++i) {
                Object object = RuntimeConfigurationBuilder.B(list.get(i));
                Object object2 = RuntimeConfigurationBuilder.B(list2.get(i));
                try {
                    try {
                        if (object == null && object2 == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileResolver.d(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
                try {
                    try {
                        if (object != null && object.equals(object2)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationProfileResolver.d(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationProfileResolver.d(customSystemException);
                }
            }
            return true;
        }
        if (k instanceof double[]) {
            double[] dArray = (double[])k2;
            double[] dArray2 = (double[])k;
            try {
                if (dArray.length != dArray2.length) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
            boolean bl = true;
            for (int i = 0; i < dArray.length; ++i) {
                double d2 = dArray[i];
                double d3 = dArray2[i];
                if (d2 == d3) continue;
                bl = false;
                break;
            }
            return bl;
        }
        return k.equals(k2);
    }

    public K S() {
        return this.w.U();
    }

    public void O() {
        for (VapeAsyncEventListener<T> vapeAsyncEventListener : this.B) {
            vapeAsyncEventListener.K(this);
        }
    }

    public K J() {
        return this.w.b();
    }

    public void k(ConfigurationProfileResolver configurationProfileResolver) {
        this.C = configurationProfileResolver;
    }

    public boolean g(JsonObject jsonObject) {
        long l = ab ^ 0x6892A03C73B7L;
        String string = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)2303, (long)(0x5F53BD3B8553C69L ^ l)), (long)6995621313354468980L, (long)l)));
        for (String string2 : this.f) {
            try {
                if (!string2.equalsIgnoreCase(string)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
        }
        return this.x().equalsIgnoreCase(string);
    }

    public void F(boolean bl) {
        this.j = bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationProfileResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationProfileResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public T c(String string) {
        this.f.add(string);
        return (T)this;
    }

    public boolean s() {
        return this.I;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = eb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 55;
                break;
            }
            case 1: {
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 39;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 11;
                break;
            }
            case 7: {
                n3 = 22;
                break;
            }
            case 8: {
                n3 = 50;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 57;
                break;
            }
            case 11: {
                n3 = 53;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 28;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 21;
                break;
            }
            case 19: {
                n3 = 52;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 4;
                break;
            }
            case 24: {
                n3 = 37;
                break;
            }
            case 25: {
                n3 = 15;
                break;
            }
            case 26: {
                n3 = 17;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 63;
                break;
            }
            case 29: {
                n3 = 36;
                break;
            }
            case 30: {
                n3 = 26;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 6;
                break;
            }
            case 34: {
                n3 = 8;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 27;
                break;
            }
            case 39: {
                n3 = 41;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 7;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 30;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 32;
                break;
            }
            case 49: {
                n3 = 0;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 51;
                break;
            }
            case 56: {
                n3 = 47;
                break;
            }
            case 57: {
                n3 = 54;
                break;
            }
            case 58: {
                n3 = 34;
                break;
            }
            case 59: {
                n3 = 24;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 40;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 49;
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
        ConfigurationProfileResolver.fb[n4] = new String(cArray);
        return n4;
    }

    public String x() {
        String string;
        long l;
        block3: {
            l = ab ^ 0x580ED90021FBL;
            string = this.E;
            try {
                if (this.P == null || !(this.P instanceof ContextTransformationEngine)) break block3;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationProfileResolver.d(customSystemException);
            }
            ContextTransformationEngine contextTransformationEngine = (ContextTransformationEngine)this.P;
            string = contextTransformationEngine.O() + (String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)1014, (long)(0x15DE5FAB70DA652FL ^ l)), (long)3700059046533487672L, (long)l)) + string;
        }
        if (this.C != null) {
            string = this.C.x() + (String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)5862, (long)(0x1904419E276B703EL ^ l)), (long)3700059046533487672L, (long)l)) + string;
        }
        return string;
    }

    private static Method d(long l, long l2) {
        int n = ConfigurationProfileResolver.a(l, l2);
        Object object = eb[n];
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
                clazz3 = ConfigurationProfileResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationProfileResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationProfileResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationProfileResolver.eb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationProfileResolver.b(232213663213828L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationProfileResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationProfileResolver.eb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationProfileResolver.b(232213663213828L, 0L);
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

    public Object U() {
        return this.P;
    }

    public JsonObject k(boolean bl) {
        long l = ab ^ 0x76FD39A3832L;
        JsonObject jsonObject = this.y();
        jsonObject.addProperty((String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)557, (long)(0x521DE856D5A2FD36L ^ l)), (long)3066985947938899441L, (long)l)), this.x());
        if (this.J() != null) {
            CallSite callSite = ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)12680, (long)(0x100F8A313075CE9AL ^ l)), (long)3066985947938899441L, (long)l);
            String string = this.J().toString();
            if (this.z) {
                string = (String)((Object)ConfigurationProfileResolver.c("T", (int)ConfigurationProfileResolver.a("k", (int)20303, (long)(0x4B41BE80E7B0B055L ^ l)), (long)3066985947938899441L, (long)l)) + ec.A(string);
            }
            jsonObject.addProperty((String)((Object)callSite), string);
        }
        return jsonObject;
    }

    public void i(VapeGenericEventBroker<T, K> vapeGenericEventBroker) {
        this.b.add(vapeGenericEventBroker);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f3' || c == '\u00d0' || c == '\u00c4' || c == 'u') {
                field = ConfigurationProfileResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationProfileResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationProfileResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationProfileResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

