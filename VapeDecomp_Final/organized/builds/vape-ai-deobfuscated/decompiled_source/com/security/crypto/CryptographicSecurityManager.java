/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.security.crypto;

import com.app.core.generics.GenericTypeResolver;
import com.batch.processing.BatchWorker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.crypto.streaming.CipherStreamProcessor;
import com.data.serialization.JsonPayloadOrchestrator;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.notification.dispatch.NotificationDispatchInterface2673;
import com.runtime.context.ContextualExecutionFramework;
import com.security.protocol.EncryptionProtocolHandler397;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
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
public class CryptographicSecurityManager
implements NotificationDispatchInterface2673 {
    private static final long[] b;
    private boolean i;
    private boolean L;
    private final ContextualExecutionFramework m;
    private static final long a;
    private static final String[] f;
    private final GenericTypeResolver<CipherStreamProcessor, BatchWorker> U;
    private final JsonObject r;
    private static final Object[] e;
    private static final Map d;
    private final JsonPayloadOrchestrator y;
    private static final Integer[] c;
    private final List<GenericTypeResolver<?, ?>> W;

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicSecurityManager.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicSecurityManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public String A() {
        return this.U.T().t();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicSecurityManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicSecurityManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean Q() {
        try {
            if (this.m.t() == RecursiveNodeGraph.p) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
        for (GenericTypeResolver<?, ?> genericTypeResolver : this.o()) {
            try {
                if (genericTypeResolver.p()) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
        }
        try {
            if (this.M()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
        try {
            if (this.S()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
        return false;
    }

    public GenericTypeResolver<CipherStreamProcessor, BatchWorker> u() {
        return this.U;
    }

    public CryptographicSecurityManager(JsonPayloadOrchestrator jsonPayloadOrchestrator, ContextualExecutionFramework contextualExecutionFramework, JsonObject jsonObject) {
        JsonArray jsonArray;
        Object object;
        JsonElement jsonElement;
        LinkedHashMap<String, JsonObject> linkedHashMap;
        block21: {
            long l = a ^ 0x6A3974ACA9C6L;
            this.y = jsonPayloadOrchestrator;
            this.m = contextualExecutionFramework;
            this.W = new ArrayList();
            this.r = jsonObject;
            linkedHashMap = new LinkedHashMap<String, JsonObject>();
            if (jsonObject != null) {
                block20: {
                    JsonArray jsonArray2 = jsonObject.getAsJsonArray((String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)15782, (long)(0x39FC222E402426E6L ^ l)), (long)-274399539861019797L, (long)l)));
                    if (jsonArray2 != null) {
                        Iterator object2 = jsonArray2.iterator();
                        while (object2.hasNext()) {
                            jsonElement = (JsonElement)object2.next();
                            if (jsonElement.isJsonNull()) continue;
                            try {
                                if (!jsonElement.isJsonObject()) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSecurityManager.a(customSystemException);
                            }
                            object = jsonElement.getAsJsonObject();
                            String string = EncryptionProtocolHandler397.g((JsonObject)object, (String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)4785, (long)(0xE6C3194B7DD89F6L ^ l)), (long)-274399539861019797L, (long)l)));
                            try {
                                if (string == null) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSecurityManager.a(customSystemException);
                            }
                            linkedHashMap.put(string, (JsonObject)object);
                        }
                    }
                    if ((jsonArray = EncryptionProtocolHandler397.q(jsonObject, (String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)32213, (long)(0xDE3D2FE49936694L ^ l)), (long)-274399539861019797L, (long)l)))) == null) {
                        jsonArray = new JsonArray();
                    }
                    Boolean bl = EncryptionProtocolHandler397.O(jsonObject, (String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)30875, (long)(0x1C79BD46971FE3D8L ^ l)), (long)-274399539861019797L, (long)l)));
                    try {
                        if (bl == null) break block20;
                        this.L = bl;
                        break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSecurityManager.a(customSystemException);
                    }
                }
                this.L = contextualExecutionFramework.p();
            } else {
                jsonArray = new JsonArray();
                this.L = contextualExecutionFramework.p();
            }
        }
        this.U = new GenericTypeResolver(jsonPayloadOrchestrator, new CipherStreamProcessor((Object)null, "", new BatchWorker(EncryptionProtocolHandler397.V(jsonArray, false), false)));
        for (ConfigurationProfileResolver configurationProfileResolver : contextualExecutionFramework.F()) {
            jsonElement = (JsonObject)linkedHashMap.get(configurationProfileResolver.x());
            try {
                if (jsonElement == null) {
                    this.W.add(new GenericTypeResolver(jsonPayloadOrchestrator, configurationProfileResolver));
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
            object = new GenericTypeResolver(jsonPayloadOrchestrator, configurationProfileResolver);
            ((GenericTypeResolver)object).u((JsonObject)jsonElement);
            this.W.add((GenericTypeResolver<?, ?>)object);
        }
        try {
            if (this.y.P() != null) {
                this.i = this.y.P().q().contains(this.m);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
    }

    public JsonObject H() {
        JsonObject jsonObject;
        long l;
        block22: {
            l = a ^ 0x4E3F851BD9FAL;
            jsonObject = new JsonObject();
            try {
                try {
                    jsonObject.addProperty((String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)3362, (long)(0x378FF0E3B324665AL ^ l)), (long)-8355013949246483625L, (long)l)), this.m.O());
                    if (!this.m.C().Y() || !this.M()) break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityManager.a(customSystemException);
                }
                jsonObject.add((String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)4249, (long)(0x22B646FFF1FE7BE7L ^ l)), (long)-8355013949246483625L, (long)l)), (JsonElement)this.U.T().w());
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
        }
        JsonArray jsonArray = new JsonArray();
        for (GenericTypeResolver<?, ?> genericTypeResolver : this.W) {
            try {
                try {
                    if (!((ConfigurationProfileResolver)genericTypeResolver.n()).v() || genericTypeResolver.p()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityManager.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
            JsonObject jsonObject2 = genericTypeResolver.L();
            try {
                if (jsonObject2.entrySet().size() <= 1) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
            jsonArray.add((JsonElement)genericTypeResolver.L());
        }
        try {
            if (jsonArray.size() != 0) {
                jsonObject.add((String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)24928, (long)(0x625E57F0E0870A1AL ^ l)), (long)-8355013949246483625L, (long)l)), (JsonElement)jsonArray);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
        try {
            if (this.L != this.m.p()) {
                jsonObject.addProperty((String)((Object)CryptographicSecurityManager.b("\u00e4", (int)CryptographicSecurityManager.a("h", (int)22381, (long)(0x68229F6E059FBC14L ^ l)), (long)-8355013949246483625L, (long)l)), Boolean.valueOf(this.L));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
        try {
            if (jsonObject.entrySet().size() == 1) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityManager.a(customSystemException);
        }
        return jsonObject;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSecurityManager.a = MultiContainerRegistry.a(-3661261098885295087L, 313831279515453513L, MethodHandles.lookup().lookupClass()).a(93389310219802L);
                CryptographicSecurityManager.e = new Object[5];
                CryptographicSecurityManager.f = new String[5];
                CryptographicSecurityManager.a();
                CryptographicSecurityManager.d = new HashMap<K, V>(13);
                var0 = CryptographicSecurityManager.a ^ 85045680820858L;
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
                var6_5 = "\u00b3ihg\u00a5\u00b7\"5\u000f\u00a3\u00ce\u00b2\u00c1\u00be\u000ef\u00c3\u00bb\\h\u00bd\n\u00eb\u00a6\u00a3\u00a2:35\u0016\u00aa.FvK)K\u00e3{\u000e\u008f\u0089\u00d5\u00fa\u008b\u0083\"\u00ca";
                var7_6 = "\u00b3ihg\u00a5\u00b7\"5\u000f\u00a3\u00ce\u00b2\u00c1\u00be\u000ef\u00c3\u00bb\\h\u00bd\n\u00eb\u00a6\u00a3\u00a2:35\u0016\u00aa.FvK)K\u00e3{\u000e\u008f\u0089\u00d5\u00fa\u008b\u0083\"\u00ca".length();
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
                    var6_5 = "a\u00a9oK\u00c4ZN*\u00fc\u00d1\u00d4\u0096\u00a7L\u00e7\u00ab";
                    var7_6 = "a\u00a9oK\u00c4ZN*\u00fc\u00d1\u00d4\u0096\u00a7L\u00e7\u00ab".length();
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
        CryptographicSecurityManager.b = var8_3;
        CryptographicSecurityManager.c = new Integer[8];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicSecurityManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6774;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/a2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSecurityManager.c[n2] = n3;
        }
        return c[n2];
    }

    public void o(boolean bl) {
        this.i = bl;
    }

    @Override
    public String O() {
        return this.m.O();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean M() {
        return this.U.T().E();
    }

    public List<GenericTypeResolver<?, ?>> o() {
        return this.W;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int b() {
        int n;
        block10: {
            n = 0;
            try {
                if (this.M()) {
                    n += 2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
            try {
                if (this.S()) {
                    ++n;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
            try {
                try {
                    if (!this.M() || !this.S()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityManager.a(customSystemException);
                }
                ++n;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
        }
        return n;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSecurityManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public boolean S() {
        return this.i;
    }

    public void n() {
        this.U.T().E(new ArrayList<Integer>());
    }

    public ContextualExecutionFramework O() {
        return this.m;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicSecurityManager.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicSecurityManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicSecurityManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicSecurityManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicSecurityManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicSecurityManager.b(272727809766155L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicSecurityManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicSecurityManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicSecurityManager.b(272727809766155L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f4' || c == '\u00da' || c == 'w' || c == 'C') {
                field = CryptographicSecurityManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicSecurityManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "*>e";
        objectArray[1] = Integer.TYPE;
        CryptographicSecurityManager.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0013.\u0012(\b\u0015\u0018!\u0003gu\r\u000b&\n.";
        objectArray[3] = "\r}q)b\u001d\u0006r`f\u0003\u0013\ryd<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "J5hc5U\u00124c\u000e`St<<>wF\u0016>pe1(M{;n4U\u0018ams\u000b";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicSecurityManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicSecurityManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = CryptographicSecurityManager.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicSecurityManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicSecurityManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicSecurityManager.a(clazz3, string2, clazz2)) != null) {
                    CryptographicSecurityManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicSecurityManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicSecurityManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicSecurityManager.b(272727809766155L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
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
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 52;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 6;
                break;
            }
            case 8: {
                n3 = 17;
                break;
            }
            case 9: {
                n3 = 32;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 16;
                break;
            }
            case 12: {
                n3 = 40;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 33;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 37;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 30;
                break;
            }
            case 21: {
                n3 = 20;
                break;
            }
            case 22: {
                n3 = 46;
                break;
            }
            case 23: {
                n3 = 41;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 28;
                break;
            }
            case 27: {
                n3 = 49;
                break;
            }
            case 28: {
                n3 = 0;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 8;
                break;
            }
            case 31: {
                n3 = 50;
                break;
            }
            case 32: {
                n3 = 62;
                break;
            }
            case 33: {
                n3 = 39;
                break;
            }
            case 34: {
                n3 = 24;
                break;
            }
            case 35: {
                n3 = 5;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 35;
                break;
            }
            case 38: {
                n3 = 3;
                break;
            }
            case 39: {
                n3 = 18;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 31;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 9;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 56;
                break;
            }
            case 46: {
                n3 = 21;
                break;
            }
            case 47: {
                n3 = 45;
                break;
            }
            case 48: {
                n3 = 47;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 57;
                break;
            }
            case 51: {
                n3 = 34;
                break;
            }
            case 52: {
                n3 = 27;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 36;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 55;
                break;
            }
            case 59: {
                n3 = 38;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 1;
                break;
            }
            case 62: {
                n3 = 26;
                break;
            }
            default: {
                n3 = 43;
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
        CryptographicSecurityManager.f[n4] = new String(cArray);
        return n4;
    }

    public List<GenericTypeResolver<?, ?>> j(boolean bl) {
        ArrayList arrayList = new ArrayList();
        for (GenericTypeResolver<?, ?> genericTypeResolver : this.o()) {
            try {
                try {
                    if (genericTypeResolver.H() && !bl) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityManager.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityManager.a(customSystemException);
            }
            arrayList.add(genericTypeResolver);
        }
        return arrayList;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSecurityManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicSecurityManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

