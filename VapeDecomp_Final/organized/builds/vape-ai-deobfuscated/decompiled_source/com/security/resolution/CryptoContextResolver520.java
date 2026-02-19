/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.security.resolution;

import a.TR;
import com.app.resources.ResourceLifecycleManager1543;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterController;
import com.core.containers.GenericContainerTemplate;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.adaptive.AdaptiveCryptoNegotiator;
import com.data.compression.CompressionUtility;
import com.data.transformation.AbstractDataTransformer;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptoKeyGenerator1867;
import com.security.event.SecureEventOrchestrator;
import com.system.configuration.GenericConfigurationResolver;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.resource.ResourceAllocator1606;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CryptoContextResolver520 {
    private static final String[] f;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long a;
    private final AdaptiveCryptoNegotiator H;
    private static final Object[] e;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17CE;
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
                throw new RuntimeException("a/km", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoContextResolver520.c[n2] = n3;
        }
        return c[n2];
    }

    @Nullable
    private ResourceLifecycleManager1543 s() {
        try {
            if (!this.H.R.s().booleanValue()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        if (this.H.z.s().booleanValue()) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = this.e(TR.d());
            try {
                if (resourceLifecycleManager1543 != null) {
                    return resourceLifecycleManager1543;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
        }
        try {
            if (this.H.P.s().booleanValue()) {
                return this.e(TR.N());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = CryptoContextResolver520.a(l, l2);
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
                clazz3 = CryptoContextResolver520.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoContextResolver520.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoContextResolver520.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoContextResolver520.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoContextResolver520.b(398451712443255L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoContextResolver520.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoContextResolver520.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoContextResolver520.b(398451712443255L, 0L);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoContextResolver520.a = MultiContainerRegistry.a(-5674800725343889092L, -7379104076728073936L, MethodHandles.lookup().lookupClass()).a(203091205598720L);
                CryptoContextResolver520.e = new Object[8];
                CryptoContextResolver520.f = new String[8];
                CryptoContextResolver520.a();
                CryptoContextResolver520.d = new HashMap<K, V>(13);
                var0 = CryptoContextResolver520.a ^ 44435832665676L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "\u00a8\u0088\u00a9\u00b4\u0001\u0018\u0093\u00f6\\\r\u0080\"\u00db\u0085\u00e9\u00b3\u001f\u00be\u00ccK\u00ed\u000f\u0095<\u00e2\u00fe\u00bc\u0087F\u0090Z\u00e5\u00e5\u0091\u0007\u00bf\u00afRv\u00a0\u00d1\u009a\u0014\u00ccumb\u008f\u00ada(\u00f3\u00abGF:\u0083\u00fbj\u00cap\u00c7{X\u008c\u00fa6P\u00d2\tl\u00a2\u0094\n\u001f\u009b'u\u00ac\u00a9Y\u000fdD\u00e6@5Y\u00c4o&,x\u00f2j\u00c6\u00bb\u00a9\u00b7|\u00a2i\u0083\u00a8\u0085\u00bdM\u00c6Ge\u00f4\u008f0,x\u00b2\u0012]\u008c\u00bc\u00f2\u00b5Q\u00ec;\u00c7\u00be\u0086";
                var7_6 = "\u00a8\u0088\u00a9\u00b4\u0001\u0018\u0093\u00f6\\\r\u0080\"\u00db\u0085\u00e9\u00b3\u001f\u00be\u00ccK\u00ed\u000f\u0095<\u00e2\u00fe\u00bc\u0087F\u0090Z\u00e5\u00e5\u0091\u0007\u00bf\u00afRv\u00a0\u00d1\u009a\u0014\u00ccumb\u008f\u00ada(\u00f3\u00abGF:\u0083\u00fbj\u00cap\u00c7{X\u008c\u00fa6P\u00d2\tl\u00a2\u0094\n\u001f\u009b'u\u00ac\u00a9Y\u000fdD\u00e6@5Y\u00c4o&,x\u00f2j\u00c6\u00bb\u00a9\u00b7|\u00a2i\u0083\u00a8\u0085\u00bdM\u00c6Ge\u00f4\u008f0,x\u00b2\u0012]\u008c\u00bc\u00f2\u00b5Q\u00ec;\u00c7\u00be\u0086".length();
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
                    var6_5 = "\u00b1\u008b\u00c0Y\u00fd~\u00e1\u00c9\u001b\u00195\u00e7\u0007\u00fa\u00b2\u00d8";
                    var7_6 = "\u00b1\u008b\u00c0Y\u00fd~\u00e1\u00c9\u001b\u00195\u00e7\u0007\u00fa\u00b2\u00d8".length();
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
        CryptoContextResolver520.b = var8_3;
        CryptoContextResolver520.c = new Integer[18];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoContextResolver520.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoContextResolver520.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @NotNull
    GenericConfigurationResolver m(@Nullable CompressionUtility compressionUtility, @NotNull NetworkConfigManager networkConfigManager) {
        Object object;
        block34: {
            ResourceLifecycleManager1543 resourceLifecycleManager1543;
            long l;
            block29: {
                block33: {
                    ResourceLifecycleManager1543 resourceLifecycleManager15432;
                    block32: {
                        block31: {
                            l = a ^ 0x730950C765DBL;
                            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                            try {
                                if (systemConfigurationOrchestrator.Y()) {
                                    return GenericConfigurationResolver.B((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)227, (long)(0x7C4FC6A6F4D9726AL ^ l)), (long)7297167553154914334L, (long)l)));
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextResolver520.a(customSystemException);
                            }
                            LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.a();
                            ConfigurationParameterController configurationParameterController = TR.h();
                            boolean bl = configurationParameterController.equals(TemporalMetadataResolver.h.x().V(lightweightExecutionContext));
                            resourceLifecycleManager1543 = TR.B(configurationParameterController);
                            try {
                                block30: {
                                    try {
                                        try {
                                            if (bl) break block29;
                                            if (resourceLifecycleManager1543 == null) break block30;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoContextResolver520.a(customSystemException);
                                        }
                                        if (!resourceLifecycleManager1543.Y()) break block31;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextResolver520.a(customSystemException);
                                    }
                                }
                                resourceLifecycleManager15432 = this.e(configurationParameterController);
                                break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextResolver520.a(customSystemException);
                            }
                        }
                        resourceLifecycleManager15432 = resourceLifecycleManager1543;
                    }
                    object = resourceLifecycleManager15432;
                    try {
                        try {
                            if (object != null && !((ObjectLifecycleTracker)object).Y()) break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextResolver520.a(customSystemException);
                        }
                        return GenericConfigurationResolver.r((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)20589, (long)(0x1C8B6C6082A2E8L ^ l)), (long)7297167553154914334L, (long)l)));
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextResolver520.a(customSystemException);
                    }
                }
                GenericContainerTemplate<ResourceLifecycleManager1543> genericContainerTemplate = this.b((ResourceLifecycleManager1543)object);
                try {
                    if (genericContainerTemplate.Y()) {
                        return GenericConfigurationResolver.r(String.format((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)2001, (long)(0x16103D39BC04F556L ^ l)), (long)7297167553154914334L, (long)l)), genericContainerTemplate.w())).i(genericContainerTemplate.H());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver520.a(customSystemException);
                }
                try {
                    if (genericContainerTemplate.M()) {
                        return GenericConfigurationResolver.B(String.format((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)14493, (long)(0x487DBC14E474A1BL ^ l)), (long)7297167553154914334L, (long)l)), genericContainerTemplate.w()));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver520.a(customSystemException);
                }
                resourceLifecycleManager1543 = genericContainerTemplate.L();
            }
            try {
                if (!this.H.o.m(Math.max((long)CryptoContextResolver520.b("\u00ed", (Object)ResourceAllocationTracker401.H, (long)7297227781617736002L, (long)l), 150L))) {
                    return GenericConfigurationResolver.B((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)9596, (long)(0x30EEB8E9D92F57F7L ^ l)), (long)7297167553154914334L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            try {
                try {
                    if (resourceLifecycleManager1543 != null && !resourceLifecycleManager1543.Y()) break block34;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver520.a(customSystemException);
                }
                return GenericConfigurationResolver.B((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)26189, (long)(0x72499B9E2AAE14CEL ^ l)), (long)7297167553154914334L, (long)l)));
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
        }
        object = this.H.V.x(TR.h(), compressionUtility, networkConfigManager);
        try {
            if (((GenericConfigurationResolver)object).x()) {
                this.H.o.m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        return object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoContextResolver520.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(long l, long l2) {
        int n = CryptoContextResolver520.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoContextResolver520.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoContextResolver520.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoContextResolver520.a(clazz3, string2, clazz2)) != null) {
                    CryptoContextResolver520.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoContextResolver520.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoContextResolver520.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoContextResolver520.b(398451712443255L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Nullable
    private ResourceLifecycleManager1543 V() {
        ResourceLifecycleManager1543 resourceLifecycleManager1543;
        block2: {
            resourceLifecycleManager1543 = AbstractDataTransformer.R(CryptoContextResolver520::lambda$getHotbarReplaceSlot$0, CryptoKeyGenerator1867.y);
            try {
                if (resourceLifecycleManager1543 != null && !resourceLifecycleManager1543.Y()) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            resourceLifecycleManager1543 = AbstractDataTransformer.R(this::lambda$getHotbarReplaceSlot$1, CryptoKeyGenerator1867.y);
        }
        return resourceLifecycleManager1543;
    }

    private boolean lambda$getHotbarReplaceSlot$1(ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!resourceLifecycleManager1543.y().r() || !this.H.h.q(resourceLifecycleManager1543.y())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextResolver520.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver520.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Nullable
    private ResourceLifecycleManager1543 e(ConfigurationParameterController configurationParameterController) {
        try {
            if (!this.H.R.s().booleanValue()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        return AbstractDataTransformer.R(TR.o(configurationParameterController), CryptoKeyGenerator1867.p);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0016\\\f";
        objectArray[1] = Integer.TYPE;
        CryptoContextResolver520.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0017[\u0017\u0000a>\u001cT\u0006O\u001c&\u000fS\u000f\u0006";
        objectArray[3] = "\n]A";
        objectArray[4] = Long.TYPE;
        CryptoContextResolver520.f[4] = "java/lang/Long";
        objectArray[5] = "pk\u0002\fz){d\u0013C\u001b'po\u0017\u0019";
        objectArray[6] = "boX\"(\u001e1'Y;U'X-[7+\n3/P+9d";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u0011\u0016\u0006\u0000mBE\u0000\n;7F.\u0017\u001dA6AU\fFT\\\u0004N\u0000\u0010K G_T\u0019;";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoContextResolver520.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/km" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
                n3 = 49;
                break;
            }
            case 1: {
                n3 = 15;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 43;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 19;
                break;
            }
            case 7: {
                n3 = 54;
                break;
            }
            case 8: {
                n3 = 11;
                break;
            }
            case 9: {
                n3 = 45;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 59;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 60;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 7;
                break;
            }
            case 20: {
                n3 = 62;
                break;
            }
            case 21: {
                n3 = 24;
                break;
            }
            case 22: {
                n3 = 52;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 3;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 51;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 46;
                break;
            }
            case 31: {
                n3 = 10;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 42;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 63;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 12;
                break;
            }
            case 39: {
                n3 = 57;
                break;
            }
            case 40: {
                n3 = 41;
                break;
            }
            case 41: {
                n3 = 29;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 34;
                break;
            }
            case 44: {
                n3 = 21;
                break;
            }
            case 45: {
                n3 = 27;
                break;
            }
            case 46: {
                n3 = 44;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 32;
                break;
            }
            case 49: {
                n3 = 25;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 31;
                break;
            }
            case 52: {
                n3 = 17;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 35;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 28;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 18;
                break;
            }
            case 60: {
                n3 = 40;
                break;
            }
            case 61: {
                n3 = 16;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 38;
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
        CryptoContextResolver520.f[n4] = new String(cArray);
        return n4;
    }

    private void P(@NotNull DimensionalMetricsTracker dimensionalMetricsTracker, int n) {
        this.H.x.m();
        int n2 = dimensionalMetricsTracker.j();
        try {
            if (n == n2) {
                dimensionalMetricsTracker.H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
    }

    CryptoContextResolver520(AdaptiveCryptoNegotiator adaptiveCryptoNegotiator) {
        this.H = adaptiveCryptoNegotiator;
    }

    @NotNull
    private GenericContainerTemplate<ResourceLifecycleManager1543> b(@NotNull ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        GenericContainerTemplate genericContainerTemplate;
        long l;
        block42: {
            DimensionalMetricsTracker dimensionalMetricsTracker;
            ResourceLifecycleManager1543 resourceLifecycleManager15432;
            block41: {
                boolean bl;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block40: {
                    boolean bl2;
                    block39: {
                        l = a ^ 0x25831B27D4DCL;
                        genericContainerTemplate = new GenericContainerTemplate();
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            if (systemConfigurationOrchestrator.Y()) {
                                return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)2160, (long)(0xE108C0D7CD84BF3L ^ l)), (long)-3151418371909703399L, (long)l)));
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextResolver520.a(customSystemException);
                        }
                        try {
                            try {
                                if (resourceLifecycleManager1543.G() < 36 || resourceLifecycleManager1543.G() > 44) break block39;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextResolver520.a(customSystemException);
                            }
                            bl2 = true;
                            break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextResolver520.a(customSystemException);
                        }
                    }
                    bl2 = bl = false;
                }
                if (bl) {
                    GenericConfigurationResolver genericConfigurationResolver = this.H.m();
                    try {
                        if (genericConfigurationResolver.Y()) {
                            return (GenericContainerTemplate)((GenericContainerTemplate)genericContainerTemplate.V(String.format((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)17454, (long)(0x138106BF722687A8L ^ l)), (long)-3151418371909703399L, (long)l)), genericConfigurationResolver.w()))).i(genericConfigurationResolver.H());
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextResolver520.a(customSystemException);
                    }
                    try {
                        if (genericConfigurationResolver.M()) {
                            return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)21093, (long)(0x36AC0FE7A86A11F9L ^ l)), (long)-3151418371909703399L, (long)l)));
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextResolver520.a(customSystemException);
                    }
                    int n = resourceLifecycleManager1543.G() - 36;
                    systemConfigurationOrchestrator.l().A(n);
                    return ((GenericContainerTemplate)genericContainerTemplate.E((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)17709, (long)(0x2E0E87060FBA06A4L ^ l)), (long)-3151418371909703399L, (long)l)))).w(resourceLifecycleManager1543);
                }
                try {
                    if (!this.H.R.s().booleanValue()) {
                        return (GenericContainerTemplate)genericContainerTemplate.V((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)15334, (long)(0xF791732032BF86EL ^ l)), (long)-3151418371909703399L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver520.a(customSystemException);
                }
                resourceLifecycleManager15432 = this.V();
                try {
                    try {
                        if (resourceLifecycleManager15432 != null && !resourceLifecycleManager15432.Y()) break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextResolver520.a(customSystemException);
                    }
                    return (GenericContainerTemplate)genericContainerTemplate.V((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)25178, (long)(0x3F85ED3D980A1DDL ^ l)), (long)-3151418371909703399L, (long)l)));
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextResolver520.a(customSystemException);
                }
            }
            GenericConfigurationResolver genericConfigurationResolver = this.H.Y();
            try {
                if (genericConfigurationResolver.Y()) {
                    return (GenericContainerTemplate)((GenericContainerTemplate)genericContainerTemplate.V(String.format((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)4190, (long)(0x34107546CF01D3D5L ^ l)), (long)-3151418371909703399L, (long)l)), genericConfigurationResolver.w()))).i(genericConfigurationResolver.H());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            try {
                if (genericConfigurationResolver.M()) {
                    return (GenericContainerTemplate)genericContainerTemplate.D(String.format((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)15215, (long)(0x7D16B19B7AAE78F2L ^ l)), (long)-3151418371909703399L, (long)l)), genericConfigurationResolver.w()));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
            try {
                if (secureEventOrchestrator.Y()) {
                    return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)26421, (long)(0x27CAD50B6D7DA4B8L ^ l)), (long)-3151418371909703399L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            ResourceAllocator1606 resourceAllocator1606 = new TransformationEngine(secureEventOrchestrator.M()).R();
            try {
                if (resourceAllocator1606.Y()) {
                    return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)29733, (long)(0x4A6B0984747B37A0L ^ l)), (long)-3151418371909703399L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            int n = resourceAllocator1606.D();
            if (this.H.m.isEmpty()) {
                dimensionalMetricsTracker = DimensionalMetricsTracker.X().Y(n).C(resourceLifecycleManager1543.G()).B(resourceLifecycleManager15432.G() - 36).S();
                this.H.m.add(dimensionalMetricsTracker);
            }
            try {
                if (this.H.m.isEmpty() || !this.H.y()) break block42;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
            dimensionalMetricsTracker = this.H.m.poll();
            try {
                if (dimensionalMetricsTracker != null) {
                    this.P(dimensionalMetricsTracker, n);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
        }
        return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)1056, (long)(0x58CAF68D898047AFL ^ l)), (long)-3151418371909703399L, (long)l)));
    }

    @Nullable
    private ResourceLifecycleManager1543 p() {
        ResourceLifecycleManager1543 resourceLifecycleManager1543 = this.I();
        try {
            if (resourceLifecycleManager1543 != null) {
                return resourceLifecycleManager1543;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        return this.s();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'p' || c == '\u00e5' || c == '\u00d5' || c == '\u00da') {
                field = CryptoContextResolver520.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoContextResolver520.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static boolean lambda$getHotbarReplaceSlot$0(ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        return resourceLifecycleManager1543.y().Y();
    }

    @NotNull
    GenericContainerTemplate<ResourceLifecycleManager1543> T() {
        long l = a ^ 0xAEED46BB78CL;
        GenericContainerTemplate genericContainerTemplate = new GenericContainerTemplate();
        ResourceLifecycleManager1543 resourceLifecycleManager1543 = this.p();
        try {
            if (resourceLifecycleManager1543 == null) {
                return (GenericContainerTemplate)genericContainerTemplate.V((String)((Object)CryptoContextResolver520.b("\u00c2", (int)CryptoContextResolver520.a("j", (int)18104, (long)(0x3FFF02609960E662L ^ l)), (long)-5254637684417967543L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        return this.b(resourceLifecycleManager1543);
    }

    @Nullable
    private ResourceLifecycleManager1543 I() {
        if (this.H.z.s().booleanValue()) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = TR.B(TR.d());
            try {
                if (resourceLifecycleManager1543 != null) {
                    return resourceLifecycleManager1543;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextResolver520.a(customSystemException);
            }
        }
        try {
            if (this.H.P.s().booleanValue()) {
                return TR.B(TR.N());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextResolver520.a(customSystemException);
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/km" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoContextResolver520.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoContextResolver520.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoContextResolver520.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoContextResolver520.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoContextResolver520.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoContextResolver520.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

