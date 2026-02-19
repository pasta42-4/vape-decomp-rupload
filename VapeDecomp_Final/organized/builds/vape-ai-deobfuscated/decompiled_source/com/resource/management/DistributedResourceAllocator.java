/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  org.jetbrains.annotations.Nullable
 */
package com.resource.management;

import a.Qh;
import a._8;
import com.app.configuration.ConfigurationProfileManager1692;
import com.app.crypto.processing.CipherTextProcessor;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.transmission.DataTransmissionManager2384;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.security.access.SecurityAccessController1588;
import com.security.transform.CryptographicTransformer;
import com.system.core.SystemStateOrchestrator1145;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class DistributedResourceAllocator {
    public AuthenticationStateTracker Z;
    private static final String[] g;
    private static int E;
    private static final long[] c;
    public AuthenticationStateTracker A;
    private static final long a;
    public AdaptiveRenderingEngine u;
    private final Set<SecurityAccessController1588> L;
    public AuthenticationStateTracker b;
    private static final Map e;
    public AuthenticationStateTracker r;
    private static final Object[] f;
    private static final Integer[] d;

    public static int V() {
        return E;
    }

    public JsonArray P() {
        JsonArray jsonArray = new JsonArray();
        for (SecurityAccessController1588 securityAccessController1588 : this.v()) {
            try {
                if (!securityAccessController1588.R()) continue;
                jsonArray.add((JsonElement)securityAccessController1588.l());
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
        }
        return jsonArray;
    }

    public Set<SecurityAccessController1588> v() {
        return this.L;
    }

    public boolean h(TransactionOrchestrator1017 transactionOrchestrator1017) {
        boolean bl;
        block5: {
            block4: {
                boolean bl2 = this.Q(transactionOrchestrator1017.e());
                boolean bl3 = this.Q(transactionOrchestrator1017.q().toString());
                try {
                    try {
                        if (!bl2 && !bl3) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceAllocator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceAllocator.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl4 = bl;
        return bl4;
    }

    private void lambda$new$0(AuthenticationStateTracker authenticationStateTracker) {
        this.r();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DistributedResourceAllocator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedResourceAllocator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void w() {
        block13: {
            long l = a ^ 0x53DAB0140C56L;
            try {
                if (ApplicationLifecycleManager.X().r()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = SystemStateOrchestrator1145.J();
            try {
                if (networkPacketInterceptor1107.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
            CryptographicTransformer cryptographicTransformer = networkPacketInterceptor1107.l();
            try {
                if (cryptographicTransformer.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
            if (cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) {
                ArrayList<SecurityAccessController1588> arrayList;
                String string;
                block12: {
                    DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(cryptographicTransformer);
                    string = dataTransmissionManager2384.e();
                    arrayList = this.p(string);
                    try {
                        if (!arrayList.isEmpty()) break block12;
                        this.p(new _8(string, string));
                        TemporalMetadataResolver.h.c().L("\u00a7aAdded\u00a7r " + string + (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)21436, (long)(0xBE4A0493E9B5E60L ^ l)), (long)-9043417284776022602L, (long)l)), "", 2000L);
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceAllocator.a(customSystemException);
                    }
                }
                this.y(arrayList.get(0));
                TemporalMetadataResolver.h.c().L("\u00a7cRemoved\u00a7r " + string + (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)3155, (long)(0x4A8B4BABC4968183L ^ l)), (long)-9043417284776022602L, (long)l)), "", 2000L);
            }
        }
    }

    @Nullable
    public SecurityAccessController1588 e(String string, boolean bl) {
        block5: {
            try {
                if (!this.A.s().booleanValue() && bl) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
            ArrayList<SecurityAccessController1588> arrayList = this.p(string);
            try {
                if (arrayList.isEmpty()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
            return arrayList.stream().filter(SecurityAccessController1588::F).findFirst().orElse(null);
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedResourceAllocator.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedResourceAllocator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedResourceAllocator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedResourceAllocator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void r() {
        try {
            if (ApplicationLifecycleManager.c().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceAllocator.a(customSystemException);
        }
        for (Object e : ApplicationLifecycleManager.c().M()) {
            try {
                if (e == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
            new Qh(e).b();
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/HR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public DistributedResourceAllocator() {
        long l = a ^ 0x3C7BF4599FD3L;
        this.L = new HashSet<SecurityAccessController1588>();
        this.A = AuthenticationStateTracker.R(this, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)22748, (long)(0x6667315E4179468FL ^ l)), (long)1295414112104332851L, (long)l)), true, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)14723, (long)(0x5D941564D53BA7D7L ^ l)), (long)1295414112104332851L, (long)l)));
        this.Z = AuthenticationStateTracker.w(this, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)955, (long)(0x7F49562F16911DE3L ^ l)), (long)1295414112104332851L, (long)l)), true);
        this.r = AuthenticationStateTracker.R(this, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)7477, (long)(0x5F0A09A2CB7D0365L ^ l)), (long)1295414112104332851L, (long)l)), false, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)22800, (long)(0x668CC7670740C747L ^ l)), (long)1295414112104332851L, (long)l)));
        this.b = AuthenticationStateTracker.R(this, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)15877, (long)(0x42372020DC73A054L ^ l)), (long)1295414112104332851L, (long)l)), true, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)1656, (long)(0x19A64D1800C1182AL ^ l)), (long)1295414112104332851L, (long)l)));
        this.u = AdaptiveRenderingEngine.C(this, (String)((Object)DistributedResourceAllocator.b("f", (int)DistributedResourceAllocator.a("t", (int)9382, (long)(0x88EB6A10725BAF0L ^ l)), (long)1295414112104332851L, (long)l)), new Color(66, 244, 137));
        this.r.P(this::lambda$new$0);
        this.b.l(this.u);
        this.Z.l(this.r);
    }

    public static int s() {
        int n = DistributedResourceAllocator.V();
        try {
            if (n == 0) {
                return 77;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceAllocator.a(customSystemException);
        }
        return 0;
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
                DistributedResourceAllocator.a = MultiContainerRegistry.a(-4256421433770700234L, 2315106409479675833L, MethodHandles.lookup().lookupClass()).a(184463407332686L);
                DistributedResourceAllocator.f = new Object[5];
                DistributedResourceAllocator.g = new String[5];
                DistributedResourceAllocator.a();
                DistributedResourceAllocator.e = new HashMap<K, V>(13);
                var0 = DistributedResourceAllocator.a ^ 37756365058952L;
                DistributedResourceAllocator.R(0);
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
                var6_5 = ";\u008b\u00cc\u0083~T\u00fd\n\u00cfv\u0006\u0010\u0013\u009ba9\u00f8\u00a5p\u00eb\u009d\u00eb,X\u00b2|m\u000b\u001b\u00ea\u00a9pUS\u0001\u0019\u00b2\u00dd\u00c9T\u001aRH[z\u00b7\u00d6\u00a0\u00ce\u00a4;\u00fc}\u00ac\u00b5\u00d8!\u00ab2\u00e2\u0085\u00be\u001ca";
                var7_6 = ";\u008b\u00cc\u0083~T\u00fd\n\u00cfv\u0006\u0010\u0013\u009ba9\u00f8\u00a5p\u00eb\u009d\u00eb,X\u00b2|m\u000b\u001b\u00ea\u00a9pUS\u0001\u0019\u00b2\u00dd\u00c9T\u001aRH[z\u00b7\u00d6\u00a0\u00ce\u00a4;\u00fc}\u00ac\u00b5\u00d8!\u00ab2\u00e2\u0085\u00be\u001ca".length();
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
                    var6_5 = "\u00de\u00a6{\u001b\u00cfc\u0085\u00a2\u00cc)0\u00ear\u009c\u00b6\u00e5";
                    var7_6 = "\u00de\u00a6{\u001b\u00cfc\u0085\u00a2\u00cc)0\u00ear\u009c\u00b6\u00e5".length();
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
        DistributedResourceAllocator.c = var8_3;
        DistributedResourceAllocator.d = new Integer[10];
    }

    public ArrayList<SecurityAccessController1588> p(String string) {
        ArrayList<SecurityAccessController1588> arrayList = new ArrayList<SecurityAccessController1588>();
        for (SecurityAccessController1588 securityAccessController1588 : this.L) {
            try {
                if (!securityAccessController1588.n().equalsIgnoreCase(string)) continue;
                arrayList.add(securityAccessController1588);
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceAllocator.a(customSystemException);
            }
        }
        return arrayList;
    }

    public void y(SecurityAccessController1588 securityAccessController1588) {
        this.L.remove(securityAccessController1588);
        this.r();
        CipherTextProcessor.I();
    }

    public void b() {
        this.v().clear();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/HR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 36;
                break;
            }
            case 1: {
                n3 = 18;
                break;
            }
            case 2: {
                n3 = 24;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 45;
                break;
            }
            case 6: {
                n3 = 9;
                break;
            }
            case 7: {
                n3 = 17;
                break;
            }
            case 8: {
                n3 = 7;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 30;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 53;
                break;
            }
            case 16: {
                n3 = 10;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 43;
                break;
            }
            case 20: {
                n3 = 40;
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
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 37;
                break;
            }
            case 27: {
                n3 = 0;
                break;
            }
            case 28: {
                n3 = 63;
                break;
            }
            case 29: {
                n3 = 46;
                break;
            }
            case 30: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 54;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 34;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 55;
                break;
            }
            case 37: {
                n3 = 2;
                break;
            }
            case 38: {
                n3 = 59;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 51;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 38;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 23;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 52;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 21;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 41;
                break;
            }
            case 61: {
                n3 = 62;
                break;
            }
            case 62: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 16;
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
        DistributedResourceAllocator.g[n4] = new String(cArray);
        return n4;
    }

    public boolean Q(String string) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (!this.A.s().booleanValue()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceAllocator.a(customSystemException);
                }
                ArrayList<SecurityAccessController1588> arrayList = this.p(string);
                try {
                    try {
                        if (arrayList.isEmpty() || !arrayList.stream().anyMatch(SecurityAccessController1588::F)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceAllocator.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceAllocator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Nullable
    public SecurityAccessController1588 A(String string) {
        return this.e(string, true);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == '\u00c5' || c == '\u00e0' || c == 'q') {
                field = DistributedResourceAllocator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedResourceAllocator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void R(int n) {
        E = n;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedResourceAllocator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void p(SecurityAccessController1588 securityAccessController1588) {
        try {
            if (securityAccessController1588 == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceAllocator.a(customSystemException);
        }
        ArrayList<SecurityAccessController1588> arrayList = this.p(securityAccessController1588.n());
        if (!arrayList.isEmpty()) {
            for (SecurityAccessController1588 securityAccessController15882 : arrayList) {
                try {
                    if (securityAccessController1588 instanceof ConfigurationProfileManager1692 && !(securityAccessController15882 instanceof ConfigurationProfileManager1692)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceAllocator.a(customSystemException);
                }
                try {
                    try {
                        if (!(securityAccessController1588 instanceof ConfigurationProfileManager1692) && securityAccessController15882 instanceof ConfigurationProfileManager1692) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceAllocator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceAllocator.a(customSystemException);
                }
                this.y(securityAccessController15882);
            }
        }
        this.L.add(securityAccessController1588);
        this.r();
        CipherTextProcessor.I();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xFAA;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/HR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedResourceAllocator.d[n2] = n3;
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedResourceAllocator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void I(JsonArray jsonArray) {
        try {
            if (jsonArray.size() == 0) {
                return;
            }
        }
        catch (Exception exception) {
            throw DistributedResourceAllocator.a(exception);
        }
        this.b();
        for (int i = 0; i < jsonArray.size(); ++i) {
            try {
                if (i > 100) break;
                JsonElement jsonElement = jsonArray.get(i);
                try {
                    if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw DistributedResourceAllocator.a(exception);
                }
                _8 _82 = new _8("", "").p(jsonElement.getAsJsonObject());
                this.p(_82);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "A&\u0006";
        objectArray[1] = Integer.TYPE;
        DistributedResourceAllocator.g[1] = "java/lang/Integer";
        objectArray[2] = "_\u000fXfI(T\u0000I)40G\u0007@`";
        objectArray[3] = ")b|^\u00038\"mm\u0011b6)fiK";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0016\fJN`/D\u0012\u000fw;2}\r\fI 5G\u001b\u0016\u0014Pp\u001cG\u001aL< \fLMw";
    }

    private static Method d(long l, long l2) {
        int n = DistributedResourceAllocator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = DistributedResourceAllocator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedResourceAllocator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedResourceAllocator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedResourceAllocator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedResourceAllocator.b(240455416848487L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedResourceAllocator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedResourceAllocator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedResourceAllocator.b(240455416848487L, 0L);
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

    private static Field c(long l, long l2) {
        int n = DistributedResourceAllocator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedResourceAllocator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedResourceAllocator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedResourceAllocator.a(clazz3, string2, clazz2)) != null) {
                    DistributedResourceAllocator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedResourceAllocator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedResourceAllocator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedResourceAllocator.b(240455416848487L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedResourceAllocator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DistributedResourceAllocator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

