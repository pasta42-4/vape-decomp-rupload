/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package com.runtime.context;

import a.Z3;
import com.app.algorithms.AlgorithmOrchestrator;
import com.app.concurrency.task.BackgroundTaskExecutor;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.events.EventNotificationBroker2314;
import com.app.xml.generation.XmlGenerator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.flags.AsyncFlagCoordinator;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.data.processing.CollectionFilterProcessor;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.exception.system.CustomSystemException;
import com.game.input.GameInputController;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.logging.transactions.TransactionAuditLogger;
import com.network.config.NetworkConfigurationResolver2717;
import com.notification.dispatch.NotificationDispatchInterface2673;
import com.security.authentication.AuthenticationLifecycleManager;
import com.security.protocol.EncryptionProtocolHandler397;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
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
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ContextualExecutionFramework
extends AsyncFlagCoordinator
implements NotificationDispatchInterface2673,
NetworkConfigurationResolver2717 {
    private final TransactionAuditLogger c;
    private static final Object[] ib;
    private final String f;
    private static int[] E;
    private final List<ContextTransformationEngine> I;
    private static final String[] jb;
    private boolean i = true;
    private final List<ConfigurationProfileResolver<?, ?>> C = new ArrayList();
    private static final long ab;
    protected RecursiveNodeGraph k;
    private boolean U = true;
    private static final long[] cb;
    private static final Map eb;
    private static final Integer[] db;
    private final int H;
    private boolean p;
    private BackgroundTaskExecutor s;
    private String S;
    private final List<ConfigurationProfileResolver<?, ?>> g = new ArrayList();
    private final int M;
    private final CollectionFilterProcessor y;
    private boolean D;
    private boolean a;

    public void X(GameInputController gameInputController) {
        block12: {
            try {
                if (gameInputController.getKey() <= 0) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
            try {
                if (this.y.Z().isEmpty()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
            try {
                try {
                    try {
                        if (!gameInputController.isDown() || ApplicationLifecycleManager.X().M() != null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualExecutionFramework.b(customSystemException);
                    }
                    if (!this.y.d(gameInputController.getKey())) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
                gameInputController.setCanceled(true);
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A30;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = cb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualExecutionFramework.db[n2] = n3;
        }
        return db[n2];
    }

    protected Predicate<EventNotificationBroker2314> V() {
        return this::lambda$getEventPredicate$0;
    }

    public int N() {
        return this.M;
    }

    public String H() {
        return "";
    }

    public CollectionFilterProcessor C() {
        return this.y;
    }

    public double e(double d2, boolean bl) {
        return 0.0;
    }

    public String r() {
        return this.S;
    }

    public int T() {
        return this.H;
    }

    public boolean j() {
        return false;
    }

    @Nullable
    public JsonObject r(boolean bl) {
        JsonArray jsonArray;
        JsonObject jsonObject;
        long l;
        block28: {
            l = ab ^ 0x7CBDF30E520BL;
            jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)22052, (long)(0x459ECCC141FA29C3L ^ l)), (long)5031665970500247948L, (long)l)), this.O());
            if (this.y.Y()) {
                jsonArray = this.y.w();
                try {
                    block27: {
                        try {
                            try {
                                try {
                                    if (this.H == 0 && jsonArray.size() != 0) break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ContextualExecutionFramework.b(customSystemException);
                                }
                                if (jsonArray.size() != 1) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ContextualExecutionFramework.b(customSystemException);
                            }
                            if (jsonArray.get(0).getAsInt() == this.H) break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualExecutionFramework.b(customSystemException);
                        }
                    }
                    jsonObject.add((String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)10381, (long)(0x13C83B3106CF576DL ^ l)), (long)5031665970500247948L, (long)l)), (JsonElement)jsonArray);
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
            }
        }
        jsonArray = new JsonArray();
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : this.C) {
            try {
                try {
                    if (!configurationProfileResolver.v() || configurationProfileResolver.p()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
            JsonObject jsonObject2 = configurationProfileResolver.k(bl);
            try {
                if (jsonObject2.entrySet().size() <= 1) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
            jsonArray.add((JsonElement)jsonObject2);
        }
        try {
            if (jsonArray.size() != 0) {
                jsonObject.add((String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)7528, (long)(0x3C77E6448C73E299L ^ l)), (long)5031665970500247948L, (long)l)), (JsonElement)jsonArray);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        try {
            if (this.i != this.U) {
                jsonObject.addProperty((String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)9550, (long)(0x4B79DA0F89A65AA2L ^ l)), (long)5031665970500247948L, (long)l)), Boolean.valueOf(this.i));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        try {
            if (jsonObject.entrySet().size() == 1) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        return jsonObject;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ba' || c == 's' || c == 'O' || c == '\u00c9') {
                field = ContextualExecutionFramework.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ba' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualExecutionFramework.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void T(boolean bl) {
        this.y(bl, false);
    }

    public void y(boolean bl, boolean bl2) {
        block28: {
            block27: {
                block25: {
                    block26: {
                        long l;
                        block24: {
                            l = ab ^ 0x38FC0F44FA76L;
                            try {
                                try {
                                    if (!this.j() || ContextualExecutionFramework.e("f", (long)-1321024730869619392L, (long)l) != false) break block24;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ContextualExecutionFramework.b(customSystemException);
                                }
                                ContextualExecutionFramework.e("f", (long)-1321072160019505338L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ContextualExecutionFramework.b(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (bl2 || this.H()) break block25;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ContextualExecutionFramework.b(customSystemException);
                                        }
                                        if (this.k == RecursiveNodeGraph.p) break block25;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ContextualExecutionFramework.b(customSystemException);
                                    }
                                    if (!bl) break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ContextualExecutionFramework.b(customSystemException);
                                }
                                if (TemporalMetadataResolver.h.c() == null) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ContextualExecutionFramework.b(customSystemException);
                            }
                            TemporalMetadataResolver.h.c().t((String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)8249, (long)(0x6D5508CE5AC2F7BAL ^ l)), (long)-1321430683471836687L, (long)l)), (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)28027, (long)(0x2D054A4A01AC3AE3L ^ l)), (long)-1321430683471836687L, (long)l)) + this.O() + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)18961, (long)(0xDD66A744EBC9D98L ^ l)), (long)-1321430683471836687L, (long)l)), CryptoConfigurationRegistry383.WARNING, 2500L);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualExecutionFramework.b(customSystemException);
                        }
                    }
                    return;
                }
                try {
                    if (!bl) {
                        this.r();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
                try {
                    try {
                        this.a = bl;
                        if (!this.a) break block27;
                        this.h();
                        if (!this.a) break block28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualExecutionFramework.b(customSystemException);
                    }
                    Z3.s().A(this, this.V());
                    break block28;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
            }
            try {
                this.v();
                if (!this.a) {
                    Z3.s().l(this);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
        TemporalMetadataResolver.h.U().e(this);
        this.c(bl, bl2);
    }

    public List<ContextTransformationEngine> y() {
        return this.I;
    }

    /*
     * Loose catch block
     */
    public void x(JsonObject jsonObject) {
        block26: {
            JsonArray jsonArray;
            long l;
            block27: {
                l = ab ^ 0x76ED2EE0DC74L;
                try {
                    if (this.y.Y()) {
                        this.y.Z().clear();
                    }
                }
                catch (Exception exception) {
                    throw ContextualExecutionFramework.b(exception);
                }
                String string = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)17897, (long)(0x1ECD1B2017E1B466L ^ l)), (long)-3770889638567727117L, (long)l)));
                if (string == null) break block26;
                try {
                    block28: {
                        if (!string.equalsIgnoreCase(this.O())) break block26;
                        break block28;
                        catch (Exception exception) {
                            throw ContextualExecutionFramework.b(exception);
                        }
                    }
                    if (!this.y.Y()) break block27;
                }
                catch (Exception exception) {
                    throw ContextualExecutionFramework.b(exception);
                }
                jsonArray = EncryptionProtocolHandler397.q(jsonObject, (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)13222, (long)(0x6941472CB796C22FL ^ l)), (long)-3770889638567727117L, (long)l)));
                if (jsonArray != null) {
                    try {
                        this.y.q(jsonArray, false);
                    }
                    catch (Exception exception) {}
                } else {
                    jsonArray = EncryptionProtocolHandler397.q(jsonObject, (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)30877, (long)(0x629D20E20CF98901L ^ l)), (long)-3770889638567727117L, (long)l)));
                    if (jsonArray != null) {
                        try {
                            this.y.q(jsonArray, true);
                        }
                        catch (Exception exception) {}
                    } else {
                        try {
                            this.y.Z().clear();
                            if (this.H != 0) {
                                this.y.Z().add(this.H);
                            }
                        }
                        catch (Exception exception) {
                            throw ContextualExecutionFramework.b(exception);
                        }
                    }
                }
            }
            if ((jsonArray = jsonObject.getAsJsonArray((String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)17782, (long)(0x4BC823292B5134E3L ^ l)), (long)-3770889638567727117L, (long)l)))) != null) {
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                    for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : this.C) {
                        try {
                            if (!configurationProfileResolver.g(jsonObject2)) continue;
                            configurationProfileResolver.C(jsonObject2);
                        }
                        catch (Exception exception) {
                            throw ContextualExecutionFramework.b(exception);
                        }
                    }
                }
            }
            Boolean bl = EncryptionProtocolHandler397.O(jsonObject, (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)4438, (long)(0x14F0CFD6CAFBE0CDL ^ l)), (long)-3770889638567727117L, (long)l)));
            try {
                if (bl != null) {
                    this.i = bl;
                }
            }
            catch (Exception exception) {
                throw ContextualExecutionFramework.b(exception);
            }
        }
    }

    public List<ConfigurationProfileResolver<?, ?>> Y() {
        return this.g;
    }

    private static Method h(long l, long l2) {
        int n = ContextualExecutionFramework.e(l, l2);
        Object object = ib[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ContextualExecutionFramework.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualExecutionFramework.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualExecutionFramework.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualExecutionFramework.ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualExecutionFramework.f(358550927889621L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualExecutionFramework.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualExecutionFramework.ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualExecutionFramework.f(358550927889621L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ContextualExecutionFramework.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualExecutionFramework.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean h() {
        return this.a;
    }

    public void b() {
    }

    public void m() {
        boolean bl;
        ContextualExecutionFramework contextualExecutionFramework;
        block8: {
            try {
                try {
                    try {
                        if (!this.Y() || !this.y.Y()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualExecutionFramework.b(customSystemException);
                    }
                    if (!this.y.Z().isEmpty()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
        try {
            contextualExecutionFramework = this;
            bl = !this.a;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        contextualExecutionFramework.T(bl);
    }

    public void p(boolean bl) {
        this.D = bl;
    }

    public boolean Z() {
        return this.a;
    }

    public void I() {
        String string;
        TransactionAuditLogger transactionAuditLogger;
        try {
            this.c.L(1500L);
            transactionAuditLogger = this.c.K("\u00a7f" + this.O());
            string = this.Z() ? "\u00a72Enabled" : "\u00a7cDisabled";
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        transactionAuditLogger.D(string).Q();
        TemporalMetadataResolver.h.c().h(this.c);
    }

    @Override
    public String O() {
        return this.f;
    }

    public ContextTransformationEngine K(String string) {
        for (ContextTransformationEngine contextTransformationEngine : this.y()) {
            try {
                if (!contextTransformationEngine.O().equalsIgnoreCase(string)) continue;
                return contextTransformationEngine;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
        return null;
    }

    public boolean H() {
        return this.i;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualExecutionFramework.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ConfigurationProfileResolver O(String string) {
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : this.F()) {
            try {
                try {
                    if (!configurationProfileResolver.x().equalsIgnoreCase(string) && !configurationProfileResolver.O().equalsIgnoreCase(string)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
                return configurationProfileResolver;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
        return null;
    }

    public boolean J() {
        return this.E(AsyncFlagCoordinator.W);
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public boolean w() {
        return this.E(AsyncFlagCoordinator.Q);
    }

    public ContextualExecutionFramework(String string, int n, RecursiveNodeGraph recursiveNodeGraph, String string2) {
        this(string, 0, n, recursiveNodeGraph, string2);
    }

    public boolean m() {
        return this.E(AsyncFlagCoordinator.q);
    }

    public void V(ContextualExecutionFramework contextualExecutionFramework) {
    }

    public ContextualExecutionFramework(String string, int n, int n2, RecursiveNodeGraph recursiveNodeGraph, String string2) {
        this.I = new ArrayList<ContextTransformationEngine>();
        this.c = new TransactionAuditLogger(CryptoConfigurationRegistry383.INFO, "", "", 1000L);
        this.f = string;
        this.H = n;
        this.M = n2;
        this.k = recursiveNodeGraph;
        this.S = string2;
        this.y = this.c();
        if (this.y.Y()) {
            try {
                if (n != 0) {
                    this.y.Z().add(n);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
    }

    public void U(boolean bl) {
        this.i = bl;
    }

    public void C(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    TemporalMetadataResolver.h.S().T(this);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
            }
            TemporalMetadataResolver.h.S().M(this);
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualExecutionFramework.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualExecutionFramework.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public RecursiveNodeGraph t() {
        return this.k;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualExecutionFramework.ab = MultiContainerRegistry.a(4482138444357686142L, 6808586769020980144L, MethodHandles.lookup().lookupClass()).a(273903104918492L);
                ContextualExecutionFramework.ib = new Object[9];
                ContextualExecutionFramework.jb = new String[9];
                ContextualExecutionFramework.ab();
                ContextualExecutionFramework.eb = new HashMap<K, V>(13);
                ContextualExecutionFramework.b(null);
                var0 = ContextualExecutionFramework.ab ^ 15960962377762L;
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
                var8_3 = new long[25];
                var5_4 = 0;
                var6_5 = "[A\u001a\u00bb\u00e1\u00f4\u001c.}\u00de\t$\u001f\u0014\u00d39\u00170_\u0002\u0010Y Mu\u00d8\u0089Fu\u00bf\u00bc\u00c6uV\u00c6v\u009a\u0081\u00efl\t\u00bc\u001b\u001c\u00a2Z\u00fa\u00b0\u0019t(\u00c4\u00bf\t\u00a6\u0082\u009e.T[ %\u001a\u00b7\r\u0003\u00deP\u00fe\u00f4+\u0084w\u0000\u00ee\u00b0\u00e4\nv\u00ceG\u00cd\u00ba\u00c3\u0018\u00c8\u00ffco\u008c5\u0015\u008b\u0094d\u0005\u00f1\u00abQ*\u00bb\u00fa\u001dN\u00feAY`\u00d9q+L\u00ben}&\u001f\u0093<\b\u00e9k\u00d2\u000b\u00ab]d\"\u0000U\u00f5&\u0084\u008e\u00ac\u00cb/\u00a4\u00fdM\u00fd\u00e2\u00a9]\u009c'\u00cd\u00fd\u0089\u00c5)\u00c6e\u0081\u001c<\u0018\u0010\u00c8F\u00fc\u00b9\u00f2\u00c2\u0097\u0003\u00b9o\u00b0{\u00bbe7\u0099\u0010s\u00e7\u00b9\u00dd\u00f0m\u00b9\u0017A";
                var7_6 = "[A\u001a\u00bb\u00e1\u00f4\u001c.}\u00de\t$\u001f\u0014\u00d39\u00170_\u0002\u0010Y Mu\u00d8\u0089Fu\u00bf\u00bc\u00c6uV\u00c6v\u009a\u0081\u00efl\t\u00bc\u001b\u001c\u00a2Z\u00fa\u00b0\u0019t(\u00c4\u00bf\t\u00a6\u0082\u009e.T[ %\u001a\u00b7\r\u0003\u00deP\u00fe\u00f4+\u0084w\u0000\u00ee\u00b0\u00e4\nv\u00ceG\u00cd\u00ba\u00c3\u0018\u00c8\u00ffco\u008c5\u0015\u008b\u0094d\u0005\u00f1\u00abQ*\u00bb\u00fa\u001dN\u00feAY`\u00d9q+L\u00ben}&\u001f\u0093<\b\u00e9k\u00d2\u000b\u00ab]d\"\u0000U\u00f5&\u0084\u008e\u00ac\u00cb/\u00a4\u00fdM\u00fd\u00e2\u00a9]\u009c'\u00cd\u00fd\u0089\u00c5)\u00c6e\u0081\u001c<\u0018\u0010\u00c8F\u00fc\u00b9\u00f2\u00c2\u0097\u0003\u00b9o\u00b0{\u00bbe7\u0099\u0010s\u00e7\u00b9\u00dd\u00f0m\u00b9\u0017A".length();
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
                    var6_5 = "_R'\\8\u00ae\u00c7\u00cb\u00a1\u00b3\u00a7\u009c\r\u00b2\u0099\u00d2";
                    var7_6 = "_R'\\8\u00ae\u00c7\u00cb\u00a1\u00b3\u00a7\u009c\r\u00b2\u0099\u00d2".length();
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
        ContextualExecutionFramework.cb = var8_3;
        ContextualExecutionFramework.db = new Integer[25];
    }

    public List<ConfigurationProfileResolver<?, ?>> F() {
        return this.C;
    }

    public ContextualExecutionFramework(String string) {
        this(string, 0, RecursiveNodeGraph.p);
    }

    public void S(ContextTransformationEngine ... contextTransformationEngineArray) {
        this.y().addAll(Arrays.asList(contextTransformationEngineArray));
    }

    public void S() {
    }

    public static void b(int[] nArray) {
        E = nArray;
    }

    public ContextualExecutionFramework(String string, int n) {
        this(string, n, 0, RecursiveNodeGraph.p, null);
    }

    private boolean lambda$getEventPredicate$0(EventNotificationBroker2314 eventNotificationBroker2314) {
        return this.Z();
    }

    public void K(long l, boolean bl) {
        try {
            if (this.s != null) {
                this.s.T(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        this.s = new BackgroundTaskExecutor(this, l, bl);
        new Thread(this.s).start();
    }

    public boolean g() {
        return this.D;
    }

    public void v() {
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualExecutionFramework.e(l, l2);
            object = ib[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualExecutionFramework.ib[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public String toString() {
        long l = ab ^ 0x772D10601B6EL;
        return (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)25335, (long)(0x2FB0A606F9125479L ^ l)), (long)914540900241697001L, (long)l)) + this.f + '\'' + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)3504, (long)(0x3ED7CBDE915DBB20L ^ l)), (long)914540900241697001L, (long)l)) + this.H + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)9488, (long)(0x6DFACAD767AB939AL ^ l)), (long)914540900241697001L, (long)l)) + this.M + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)1052, (long)(0x5AB932395FE3328BL ^ l)), (long)914540900241697001L, (long)l)) + this.g + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)11700, (long)(0x12261C82AA521B3CL ^ l)), (long)914540900241697001L, (long)l)) + this.I + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)7179, (long)(0x3E86E925586D2A8CL ^ l)), (long)914540900241697001L, (long)l)) + this.k + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)18834, (long)(0x7CEA1CBD2A24FF11L ^ l)), (long)914540900241697001L, (long)l)) + this.a + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)8412, (long)(0x316FE3F05DF31651L ^ l)), (long)914540900241697001L, (long)l)) + this.p + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)15415, (long)(0x44D390CBC3648AA1L ^ l)), (long)914540900241697001L, (long)l)) + this.S + '\'' + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)9977, (long)(0x1DC41E6822F9907DL ^ l)), (long)914540900241697001L, (long)l)) + this.s + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)5968, (long)(0x1427060B7ED821DCL ^ l)), (long)914540900241697001L, (long)l)) + this.U + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)2595, (long)(0x459AE726959BCB1L ^ l)), (long)914540900241697001L, (long)l)) + this.i + (String)((Object)ContextualExecutionFramework.e("f", (int)ContextualExecutionFramework.b("t", (int)5521, (long)(0x1E6161F48591231AL ^ l)), (long)914540900241697001L, (long)l)) + this.D + '}';
    }

    public void e(ConfigurationProfileResolver<?, ?> configurationProfileResolver, AlgorithmOrchestrator ... algorithmOrchestratorArray) {
        this.C.add(configurationProfileResolver);
        List<AlgorithmOrchestrator> list = AlgorithmOrchestrator.j(algorithmOrchestratorArray);
        try {
            if (!list.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        this.g.add(configurationProfileResolver);
    }

    public boolean p() {
        return this.U;
    }

    public void W() {
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualExecutionFramework.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void A(GenericComponentMapper genericComponentMapper, GenericComponentMapper genericComponentMapper2) {
        try {
            if (this instanceof ContextTransformationEngine) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        try {
            if (!this.a) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        Object t = genericComponentMapper.c();
        Object t2 = genericComponentMapper2.c();
        try {
            if (((ContextTransformationEngine)t).O()) {
                ((ContextualExecutionFramework)t).T(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
        try {
            if (!((ContextTransformationEngine)t2).O()) {
                ((ContextualExecutionFramework)t2).T(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExecutionFramework.b(customSystemException);
        }
    }

    public String G(int n) {
        String string;
        block4: {
            string = "";
            if (n == 0) {
                string = this.H();
            }
            if (n == 1) {
                string = this.t();
                try {
                    if (string != null && !string.isEmpty()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
                string = this.H();
            }
        }
        return string;
    }

    public static int[] o() {
        return E;
    }

    protected CollectionFilterProcessor c() {
        return new AuthenticationLifecycleManager(this);
    }

    private static void ab() {
        Object[] objectArray = ib;
        ib[0] = "}\u0016o";
        objectArray[1] = Integer.TYPE;
        ContextualExecutionFramework.jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0019\u0018\u001e\u0003v%\u0012\u0017\u000fL\u000b=\u0001\u0010\u0006\u0005";
        objectArray[3] = Boolean.TYPE;
        ContextualExecutionFramework.jb[3] = "java/lang/Boolean";
        objectArray[4] = Void.TYPE;
        ContextualExecutionFramework.jb[4] = "java/lang/Void";
        objectArray[5] = "_maT5+Tbp\u001bT%_itA";
        objectArray[6] = "w2j\u001f>T`%kv?R\u001dm>G9@`n/\u001c;8";
        objectArray[7] = "X4\rG<8O#\f.'>2j\u000b\u0011`i[;WW0T";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "5i\u000bp~L\"~\n\u0019u[_5\tu%^0uJp~ foQrw\u001aneJw\u001e";
    }

    private static Field g(long l, long l2) {
        int n = ContextualExecutionFramework.e(l, l2);
        Object object = ib[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualExecutionFramework.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualExecutionFramework.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualExecutionFramework.c(clazz3, string2, clazz2)) != null) {
                    ContextualExecutionFramework.ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualExecutionFramework.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualExecutionFramework.ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualExecutionFramework.f(358550927889621L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public ContextualExecutionFramework(String string, int n, RecursiveNodeGraph recursiveNodeGraph) {
        this(string, 0, n, recursiveNodeGraph, null);
    }

    public void q(boolean bl) {
        this.U = bl;
        this.i = bl;
    }

    public String t() {
        return "";
    }

    public boolean Y() {
        return this.p;
    }

    public void r() {
    }

    public void N(ConfigurationProfileResolver<?, ?> ... configurationProfileResolverArray) {
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : configurationProfileResolverArray) {
            this.e(configurationProfileResolver, new AlgorithmOrchestrator[0]);
        }
    }

    public void s(String string) {
        this.S = string;
    }

    public void c(boolean bl, boolean bl2) {
        for (ContextTransformationEngine contextTransformationEngine : this.y()) {
            block7: {
                try {
                    try {
                        if (!contextTransformationEngine.W()) break block7;
                        if (contextTransformationEngine.Z() == bl) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualExecutionFramework.b(customSystemException);
                    }
                    contextTransformationEngine.y(bl, bl2);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
            }
            try {
                if (!contextTransformationEngine.O()) continue;
                contextTransformationEngine.y(false, bl2);
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualExecutionFramework.b(customSystemException);
            }
        }
    }

    public void t() {
        this.m();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = ib[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 23;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 63;
                break;
            }
            case 3: {
                n3 = 60;
                break;
            }
            case 4: {
                n3 = 36;
                break;
            }
            case 5: {
                n3 = 34;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 29;
                break;
            }
            case 8: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 50;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 44;
                break;
            }
            case 16: {
                n3 = 5;
                break;
            }
            case 17: {
                n3 = 14;
                break;
            }
            case 18: {
                n3 = 16;
                break;
            }
            case 19: {
                n3 = 52;
                break;
            }
            case 20: {
                n3 = 45;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 22: {
                n3 = 47;
                break;
            }
            case 23: {
                n3 = 55;
                break;
            }
            case 24: {
                n3 = 39;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 25;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 32;
                break;
            }
            case 33: {
                n3 = 42;
                break;
            }
            case 34: {
                n3 = 6;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 2;
                break;
            }
            case 38: {
                n3 = 31;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 24;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 9;
                break;
            }
            case 46: {
                n3 = 11;
                break;
            }
            case 47: {
                n3 = 28;
                break;
            }
            case 48: {
                n3 = 56;
                break;
            }
            case 49: {
                n3 = 30;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 27;
                break;
            }
            case 53: {
                n3 = 46;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 13;
                break;
            }
            case 59: {
                n3 = 61;
                break;
            }
            case 60: {
                n3 = 49;
                break;
            }
            case 61: {
                n3 = 1;
                break;
            }
            case 62: {
                n3 = 15;
                break;
            }
            default: {
                n3 = 17;
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
        ContextualExecutionFramework.jb[n4] = new String(cArray);
        return n4;
    }

    public void h() {
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean u() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.t() == RecursiveNodeGraph.p || this instanceof XmlGenerator) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualExecutionFramework.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualExecutionFramework.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualExecutionFramework.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ContextualExecutionFramework.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

