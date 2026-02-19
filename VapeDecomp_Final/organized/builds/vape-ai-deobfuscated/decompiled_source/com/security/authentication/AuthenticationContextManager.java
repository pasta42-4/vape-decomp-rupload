/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.security.authentication;

import com.app.networking.CommunicationProtocolManager1699;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.persistence.DataPersistenceOrchestrator;
import com.data.transformation.DataTransformationDispatcher;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.protocol.state.ProtocolStateManager;
import com.system.configuration.AdaptiveConfigEngine;
import com.ui.events.UserInteractionEventDispatcher;
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
public class AuthenticationContextManager
extends AbstractComputationKernel {
    private boolean L;
    private DataTransformationDispatcher F;
    private static String Y;
    private static final Object[] R;
    private DataPersistenceOrchestrator B;
    private static final Map E;
    private static final Integer[] D;
    private static final String[] ab;
    private ProtocolStateManager V = new ProtocolStateManager();
    private static final long b;
    private static final long[] n;
    private List<DataPersistenceOrchestrator> v = new ArrayList<DataPersistenceOrchestrator>();

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AuthenticationContextManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void d() {
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
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

    public DataPersistenceOrchestrator g() {
        return this.B;
    }

    public void J(JsonObject jsonObject) {
        long l = b ^ 0x60C949963768L;
        try {
            this.v.clear();
            if (!jsonObject.has((String)((Object)AuthenticationContextManager.c("\u00c6", (int)AuthenticationContextManager.b("f", (int)1198, (long)(0x4AF772AC38D414E4L ^ l)), (long)-1973110162586099958L, (long)l)))) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationContextManager.a(customSystemException);
        }
        JsonArray jsonArray = jsonObject.get((String)((Object)AuthenticationContextManager.c("\u00c6", (int)AuthenticationContextManager.b("f", (int)3430, (long)(0x72FFC04BD19E9D2DL ^ l)), (long)-1973110162586099958L, (long)l))).getAsJsonArray();
        int n = jsonObject.get((String)((Object)AuthenticationContextManager.c("\u00c6", (int)AuthenticationContextManager.b("f", (int)21212, (long)(0x5F5F0EF3DEE1C294L ^ l)), (long)-1973110162586099958L, (long)l))).getAsInt();
        int n2 = jsonArray.size();
        for (int i = 0; i < n2; ++i) {
            DataPersistenceOrchestrator dataPersistenceOrchestrator = new DataPersistenceOrchestrator(this, this.O());
            dataPersistenceOrchestrator.f(jsonArray.get(i).getAsJsonObject());
            this.v.add(dataPersistenceOrchestrator);
        }
        try {
            if (this.v.size() > 0) {
                this.B = this.a().get(n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationContextManager.a(customSystemException);
        }
        this.D();
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void U() {
    }

    public AuthenticationContextManager(DataTransformationDispatcher dataTransformationDispatcher) {
        this.F = dataTransformationDispatcher;
        dataTransformationDispatcher.g(this);
        AuthenticationContextManager authenticationContextManager = this;
        this.V.N(() -> this.lambda$new$0(authenticationContextManager));
        this.o(this.V);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AuthenticationContextManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void C(DataPersistenceOrchestrator dataPersistenceOrchestrator) {
        this.B = dataPersistenceOrchestrator;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AuthenticationContextManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AuthenticationContextManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void G(DataPersistenceOrchestrator dataPersistenceOrchestrator) {
        this.a().remove(dataPersistenceOrchestrator);
    }

    private static Method h(long l, long l2) {
        int n = AuthenticationContextManager.e(l, l2);
        Object object = R[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ab[n];
                int n3 = string2.indexOf(8);
                clazz3 = AuthenticationContextManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AuthenticationContextManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AuthenticationContextManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AuthenticationContextManager.R[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AuthenticationContextManager.f(254834847044979L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AuthenticationContextManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AuthenticationContextManager.R[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AuthenticationContextManager.f(254834847044979L, 0L);
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

    private void lambda$new$0(AuthenticationContextManager authenticationContextManager) {
        DataPersistenceOrchestrator dataPersistenceOrchestrator = new DataPersistenceOrchestrator(authenticationContextManager, this.O());
        try {
            this.v.add(dataPersistenceOrchestrator);
            if (this.B == null) {
                this.B = dataPersistenceOrchestrator;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationContextManager.a(customSystemException);
        }
        this.D();
    }

    @Override
    public double z() {
        double d2 = this.V.b();
        for (DataPersistenceOrchestrator dataPersistenceOrchestrator : this.a()) {
            d2 += dataPersistenceOrchestrator.b();
        }
        return d2;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ab[n4] != null) {
            return n4;
        }
        Object object = R[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 5;
                break;
            }
            case 1: {
                n3 = 59;
                break;
            }
            case 2: {
                n3 = 36;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 60;
                break;
            }
            case 6: {
                n3 = 34;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 26;
                break;
            }
            case 10: {
                n3 = 56;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 23;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 42;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 8;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 45;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 6;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 46;
                break;
            }
            case 30: {
                n3 = 44;
                break;
            }
            case 31: {
                n3 = 43;
                break;
            }
            case 32: {
                n3 = 58;
                break;
            }
            case 33: {
                n3 = 37;
                break;
            }
            case 34: {
                n3 = 0;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 21;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 22;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 39;
                break;
            }
            case 45: {
                n3 = 20;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 17;
                break;
            }
            case 50: {
                n3 = 30;
                break;
            }
            case 51: {
                n3 = 53;
                break;
            }
            case 52: {
                n3 = 3;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 12;
                break;
            }
            case 55: {
                n3 = 16;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 33;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 4;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 35;
                break;
            }
            default: {
                n3 = 54;
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
        AuthenticationContextManager.ab[n4] = new String(cArray);
        return n4;
    }

    public JsonObject H() {
        JsonArray jsonArray;
        JsonObject jsonObject;
        long l;
        block4: {
            block3: {
                l = b ^ 0x2C85A205ADF9L;
                jsonObject = new JsonObject();
                jsonArray = new JsonArray();
                for (DataPersistenceOrchestrator dataPersistenceOrchestrator : this.v) {
                    jsonArray.add((JsonElement)dataPersistenceOrchestrator.o());
                }
                try {
                    if (this.B != null) break block3;
                    jsonObject.addProperty((String)((Object)AuthenticationContextManager.c("\u00c6", (int)AuthenticationContextManager.b("f", (int)17493, (long)(0x76C61B7B1CDA4E8AL ^ l)), (long)9083574142183409051L, (long)l)), (Number)0);
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationContextManager.a(customSystemException);
                }
            }
            jsonObject.addProperty((String)((Object)AuthenticationContextManager.c("\u00c6", (int)AuthenticationContextManager.b("f", (int)2976, (long)(0x3B4F97416EB00178L ^ l)), (long)9083574142183409051L, (long)l)), (Number)this.v.indexOf(this.B));
        }
        jsonObject.add((String)((Object)AuthenticationContextManager.c("\u00c6", (int)AuthenticationContextManager.b("f", (int)12233, (long)(0x330406BDA402A517L ^ l)), (long)9083574142183409051L, (long)l)), (JsonElement)jsonArray);
        return jsonObject;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x74D5;
        if (D[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = AuthenticationContextManager.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/RC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AuthenticationContextManager.D[n2] = n3;
        }
        return D[n2];
    }

    public void D() {
        this.A().clear();
        this.o(this.V);
        for (DataPersistenceOrchestrator dataPersistenceOrchestrator : this.a()) {
            DataPersistenceOrchestrator dataPersistenceOrchestrator2 = dataPersistenceOrchestrator.k(new CommunicationProtocolManager1699(this, dataPersistenceOrchestrator));
            this.o(dataPersistenceOrchestrator2);
        }
        this.F().A();
    }

    public DataTransformationDispatcher O() {
        return this.F;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AuthenticationContextManager.b = MultiContainerRegistry.a(5144080511808440646L, 4106785535327373097L, MethodHandles.lookup().lookupClass()).a(94406721629279L);
                AuthenticationContextManager.R = new Object[5];
                AuthenticationContextManager.ab = new String[5];
                AuthenticationContextManager.i();
                AuthenticationContextManager.E = new HashMap<K, V>(13);
                AuthenticationContextManager.b(null);
                var0 = AuthenticationContextManager.b ^ 23382251465865L;
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
                var6_5 = "\u00cc-\u00dd\u00ed\u00a4\u00e3\u0018\u00e5\u0087\u009ct9\u0003&\u00cfOD\u00f9of\u00cc\u008b\u00ea\u0089U\u00a6{\u000e)\u00e6(\u0006";
                var7_6 = "\u00cc-\u00dd\u00ed\u00a4\u00e3\u0018\u00e5\u0087\u009ct9\u0003&\u00cfOD\u00f9of\u00cc\u008b\u00ea\u0089U\u00a6{\u000e)\u00e6(\u0006".length();
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
                    var6_5 = "\u0091\u00d6tI\u00be\u00f7\u0081{\u00d1\u001c\u009b\t\u0014\u0096\u0082\u0087";
                    var7_6 = "\u0091\u00d6tI\u00be\u00f7\u0081{\u00d1\u001c\u009b\t\u0014\u0096\u0082\u0087".length();
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
        AuthenticationContextManager.n = var8_3;
        AuthenticationContextManager.D = new Integer[6];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'w' || c == 'l' || c == 'A' || c == 'Y') {
                field = AuthenticationContextManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'w' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AuthenticationContextManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void G() {
        this.S();
        this.V.b(this.G());
        this.V.M(this.W());
        double d2 = this.V.W() + this.V.b();
        for (DataPersistenceOrchestrator dataPersistenceOrchestrator : this.a()) {
            dataPersistenceOrchestrator.b(this.G());
            dataPersistenceOrchestrator.M(d2);
            d2 += dataPersistenceOrchestrator.b();
        }
    }

    static DataPersistenceOrchestrator l(AuthenticationContextManager authenticationContextManager) {
        return authenticationContextManager.B;
    }

    @Override
    public double e() {
        return 110.0;
    }

    static List i(AuthenticationContextManager authenticationContextManager) {
        return authenticationContextManager.v;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AuthenticationContextManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AuthenticationContextManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public List<DataPersistenceOrchestrator> a() {
        return this.v;
    }

    public static String z() {
        return Y;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AuthenticationContextManager.e(l, l2);
            object = R[n];
            try {
                if (!(object instanceof String)) break block2;
                AuthenticationContextManager.R[n] = clazz = Class.forName(ab[n]);
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
            throw new RuntimeException("a/RC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private List<AdaptiveConfigEngine> O() {
        ArrayList<AdaptiveConfigEngine> arrayList = new ArrayList<AdaptiveConfigEngine>();
        for (int i = 0; i < 9; ++i) {
            AdaptiveConfigEngine adaptiveConfigEngine = new AdaptiveConfigEngine(0);
            arrayList.add(adaptiveConfigEngine);
        }
        return arrayList;
    }

    @Override
    public void g() {
    }

    private static Field g(long l, long l2) {
        int n = AuthenticationContextManager.e(l, l2);
        Object object = R[n];
        if (object instanceof String) {
            String string = ab[n];
            int n2 = string.indexOf(8);
            Class clazz = AuthenticationContextManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AuthenticationContextManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AuthenticationContextManager.c(clazz3, string2, clazz2)) != null) {
                    AuthenticationContextManager.R[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AuthenticationContextManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AuthenticationContextManager.R[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AuthenticationContextManager.f(254834847044979L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void i() {
        Object[] objectArray = R;
        R[0] = "zdd";
        objectArray[1] = Integer.TYPE;
        AuthenticationContextManager.ab[1] = "java/lang/Integer";
        objectArray[2] = "3NsU\u0018\u001b8Ab\u001ae\u0003+FkS";
        objectArray[3] = "=U5c'>6Z$,F0=Q v";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u00124\u0012$\u00172\u0015&o=\u0017\nFm\n2\u0015s\u0015\"^6l3\r=\f:\u0003cA!\tV";
    }

    public static void b(String string) {
        Y = string;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AuthenticationContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AuthenticationContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

