/*
 * Decompiled with CFR 0.152.
 */
package com.integration.protocols;

import a.KB;
import com.adapter.management.GenericAdapterManager;
import com.app.context.transformation.ContextTransformationEngine;
import com.async.events.AsynchronousEventCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.clustering.ClusterEventBroadcaster;
import com.event.management.DomainEventAggregator;
import com.event.orchestration.ClusterEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.game.inventory.InventoryEventManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
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

public class MultiprotocolAdapterFramework
extends ContextTransformationEngine<AsynchronousEventCoordinator> {
    private static final Map n;
    private boolean d;
    private static final Integer[] l;
    private long R;
    private int h;
    private boolean B;
    private final AuthenticationGateway1860 m;
    private static final long e;
    private static final long[] j;
    private final GenericAdapterManager Y;
    private static final String[] r;
    private final AuthenticationGateway1860 G;
    private static final Object[] o;

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultiprotocolAdapterFramework.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                MultiprotocolAdapterFramework.o[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = MultiprotocolAdapterFramework.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = MultiprotocolAdapterFramework.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultiprotocolAdapterFramework.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultiprotocolAdapterFramework.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultiprotocolAdapterFramework.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultiprotocolAdapterFramework.b(833054414390733L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultiprotocolAdapterFramework.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultiprotocolAdapterFramework.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultiprotocolAdapterFramework.b(833054414390733L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6BB3;
        if (MultiprotocolAdapterFramework.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])MultiprotocolAdapterFramework.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    MultiprotocolAdapterFramework.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultiprotocolAdapterFramework.l[n2] = n3;
        }
        return MultiprotocolAdapterFramework.l[n2];
    }

    private static Field c(long l, long l2) {
        int n = MultiprotocolAdapterFramework.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = MultiprotocolAdapterFramework.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultiprotocolAdapterFramework.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultiprotocolAdapterFramework.a(clazz3, string2, clazz2)) != null) {
                    MultiprotocolAdapterFramework.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultiprotocolAdapterFramework.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultiprotocolAdapterFramework.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultiprotocolAdapterFramework.b(833054414390733L, 0L);
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
        if (r[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 13;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 54;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 7: {
                n3 = 3;
                break;
            }
            case 8: {
                n3 = 42;
                break;
            }
            case 9: {
                n3 = 40;
                break;
            }
            case 10: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 15;
                break;
            }
            case 13: {
                n3 = 2;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 50;
                break;
            }
            case 18: {
                n3 = 17;
                break;
            }
            case 19: {
                n3 = 38;
                break;
            }
            case 20: {
                n3 = 41;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 19;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 35;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 6;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 59;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 38: {
                n3 = 11;
                break;
            }
            case 39: {
                n3 = 8;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 49;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 16;
                break;
            }
            case 44: {
                n3 = 26;
                break;
            }
            case 45: {
                n3 = 53;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 27;
                break;
            }
            case 51: {
                n3 = 29;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 45;
                break;
            }
            case 58: {
                n3 = 51;
                break;
            }
            case 59: {
                n3 = 21;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 37;
                break;
            }
            default: {
                n3 = 7;
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
        MultiprotocolAdapterFramework.r[n4] = new String(cArray);
        return n4;
    }

    private static void d() {
        Object[] objectArray = o;
        o[0] = "8,\u0019";
        objectArray[1] = Integer.TYPE;
        MultiprotocolAdapterFramework.r[1] = "java/lang/Integer";
        objectArray[2] = "ig;\u0002=\"bh*M@:qo#\u0004";
        objectArray[3] = "\u007f&\u0010l";
        objectArray[4] = "T`\"Q";
        objectArray[5] = Boolean.TYPE;
        MultiprotocolAdapterFramework.r[5] = "java/lang/Boolean";
        objectArray[6] = "\u0002Mzd";
        objectArray[7] = "l\u0018@M";
        objectArray[8] = Void.TYPE;
        MultiprotocolAdapterFramework.r[8] = "java/lang/Void";
        objectArray[9] = "l{N";
        objectArray[10] = Long.TYPE;
        MultiprotocolAdapterFramework.r[10] = "java/lang/Long";
        objectArray[11] = "c<a~qMh3p1\u0010Cc8tk";
        objectArray[12] = "\u0017KM\u0016i~\u0015U\tVQO-\u0017\u001fA1m\u0014\u0017\u001e\u00163\u0013\u0016^\u0014F1tQ\u0014\u0011\u001aQ";
        objectArray[13] = "/2\u0007E'xs \u0010OWA\u0013oH_0h|(\u0007Fg\u0004.6\u001fN&mbkHMW";
        objectArray[14] = "\u0016\u0010\u001bE`FO\u0011\u0006H\\k(C\u000fV0\u0015P\u0001_Ha(";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "R\u001c!fT\u0019SCw\u000f__9Dv4\nYW\u001a~4Q$\u0000\u0012q6\u000fY\\C>34";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultiprotocolAdapterFramework.e = MultiContainerRegistry.a(5677874480750057495L, 7655225050405918144L, MethodHandles.lookup().lookupClass()).a(226671248314359L);
                MultiprotocolAdapterFramework.o = new Object[16];
                MultiprotocolAdapterFramework.r = new String[16];
                MultiprotocolAdapterFramework.d();
                MultiprotocolAdapterFramework.n = new HashMap<K, V>(13);
                var0 = MultiprotocolAdapterFramework.e ^ 10854478016692L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00a7w\u00ef\u00b5\u00c1\u00bd\u00e7\u0004\u00c9\u00fblu\u00cdV\u00ec\u0001\u00cb\u0090\u00fd\u00b08\u00aa\u00d6\u0082";
                var7_6 = "\u00a7w\u00ef\u00b5\u00c1\u00bd\u00e7\u0004\u00c9\u00fblu\u00cdV\u00ec\u0001\u00cb\u0090\u00fd\u00b08\u00aa\u00d6\u0082".length();
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
                    var6_5 = "\b\t\u00b1@\u0012N\u00f6\u00ed\u001f\u0096\u00b2\u00b1\u0019\u00e6\u009f\u00ee";
                    var7_6 = "\b\t\u00b1@\u0012N\u00f6\u00ed\u001f\u0096\u00b2\u00b1\u0019\u00e6\u009f\u00ee".length();
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
        MultiprotocolAdapterFramework.j = var8_3;
        MultiprotocolAdapterFramework.l = new Integer[5];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090
    public void Y(DomainEventAggregator var1_1) {
        block52: {
            block51: {
                block45: {
                    block50: {
                        block48: {
                            block49: {
                                block46: {
                                    block47: {
                                        block44: {
                                            block42: {
                                                block43: {
                                                    var2_2 = MultiprotocolAdapterFramework.e ^ 74526045611226L;
                                                    var4_3 = SystemConfigurationOrchestrator.A();
                                                    try {
                                                        v0 = ((AsynchronousEventCoordinator)this.n()).i();
                                                        if (var4_3 != null) break block42;
                                                        if (v0) break block43;
                                                    }
                                                    catch (CustomSystemException v1) {
                                                        throw MultiprotocolAdapterFramework.a(v1);
                                                    }
                                                    return;
                                                }
                                                v0 = false;
                                            }
                                            var5_4 = v0;
                                            try {
                                                try {
                                                    v2 = this.h--;
                                                    if (var4_3 != null) break block44;
                                                    if (v2 <= 0) break block45;
                                                }
                                                catch (CustomSystemException v3) {
                                                    throw MultiprotocolAdapterFramework.a(v3);
                                                }
                                                v2 = (int)var1_1.getThePlayer().j();
                                            }
                                            catch (CustomSystemException v4) {
                                                throw MultiprotocolAdapterFramework.a(v4);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var4_3 != null) break block46;
                                                if (v2 == 0) break block47;
                                            }
                                            catch (CustomSystemException v5) {
                                                throw MultiprotocolAdapterFramework.a(v5);
                                            }
                                            this.h = 0;
                                        }
                                        catch (CustomSystemException v6) {
                                            throw MultiprotocolAdapterFramework.a(v6);
                                        }
                                    }
                                    v2 = (int)this.a();
                                }
                                try {
                                    if (var4_3 != null) break block48;
                                    if (v2 == 0) break block49;
                                }
                                catch (CustomSystemException v7) {
                                    throw MultiprotocolAdapterFramework.a(v7);
                                }
                                return;
                            }
                            cfr_temp_0 = var1_1.getThePlayer().x() - 0.0;
                            v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        }
                        try {
                            if (var4_3 != null) break block50;
                            if (v2 > 0) {
                            }
                            ** GOTO lbl63
                        }
                        catch (CustomSystemException v8) {
                            throw MultiprotocolAdapterFramework.a(v8);
                        }
                        var5_4 = true;
                        try {
                            if (var4_3 == null) break block45;
lbl63:
                            // 2 sources

                            v2 = (int)var1_1.getThePlayer().j();
                        }
                        catch (CustomSystemException v9) {
                            throw MultiprotocolAdapterFramework.a(v9);
                        }
                    }
                    if (v2 == 0) {
                        return;
                    }
                }
                var6_5 = ConfigurationCalibrator.b.B();
                try {
                    try {
                        v10 = var6_5.r();
                        if (var4_3 != null) break block51;
                        if (!v10) break block52;
                    }
                    catch (CustomSystemException v11) {
                        throw MultiprotocolAdapterFramework.a(v11);
                    }
                    v10 = var6_5.l().B(ReflectionMetadataResolver.Ut);
                }
                catch (CustomSystemException v12) {
                    throw MultiprotocolAdapterFramework.a(v12);
                }
            }
            if (v10) {
                block58: {
                    block59: {
                        block53: {
                            block54: {
                                var7_6 = new TransactionOrchestrator1017(var6_5.l());
                                try {
                                    v13 /* !! */  = MultiprotocolAdapterFramework.c("\u00c1", (Object)this, (Object)var7_6, (long)-5080547798650781361L, (long)var2_2);
                                    if (var4_3 != null) break block53;
                                    if (v13 /* !! */  != false) break block54;
                                }
                                catch (CustomSystemException v14) {
                                    throw MultiprotocolAdapterFramework.a(v14);
                                }
                                return;
                            }
                            v13 /* !! */  = (CallSite)var5_4;
                        }
                        if (v13 /* !! */  == false) {
                            block55: {
                                block57: {
                                    block56: {
                                        var8_7 = ResourceAllocationTracker401.H;
                                        var9_8 = var8_7.C();
                                        var10_9 = var8_7.C() + 1;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v15 = var7_6.b();
                                                        v16 = var9_8;
                                                        if (var4_3 != null) break block55;
                                                        if (v15 > v16) break block56;
                                                    }
                                                    catch (CustomSystemException v17) {
                                                        throw MultiprotocolAdapterFramework.a(v17);
                                                    }
                                                    cfr_temp_1 = System.currentTimeMillis() - this.R - MultiprotocolAdapterFramework.c("f", (Object)var8_7, (long)-5080398970704439594L, (long)var2_2) * 2L;
                                                    v15 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                    if (var4_3 != null) break block57;
                                                }
                                                catch (CustomSystemException v18) {
                                                    throw MultiprotocolAdapterFramework.a(v18);
                                                }
                                                if (v15 < 0) break block56;
                                            }
                                            catch (CustomSystemException v19) {
                                                throw MultiprotocolAdapterFramework.a(v19);
                                            }
                                            this.d = true;
                                            return;
                                        }
                                        catch (CustomSystemException v20) {
                                            throw MultiprotocolAdapterFramework.a(v20);
                                        }
                                    }
                                    try {
                                        v21 = var7_6;
                                        if (var4_3 != null) break block58;
                                        v15 = v21.b();
                                    }
                                    catch (CustomSystemException v22) {
                                        throw MultiprotocolAdapterFramework.a(v22);
                                    }
                                }
                                v16 = var9_8;
                            }
                            try {
                                try {
                                    try {
                                        if (v15 <= v16) break block59;
                                        v21 = var7_6;
                                        if (var4_3 != null) break block58;
                                    }
                                    catch (CustomSystemException v23) {
                                        throw MultiprotocolAdapterFramework.a(v23);
                                    }
                                    if (v21.b() > var10_9) break block59;
                                }
                                catch (CustomSystemException v24) {
                                    throw MultiprotocolAdapterFramework.a(v24);
                                }
                                return;
                            }
                            catch (CustomSystemException v25) {
                                throw MultiprotocolAdapterFramework.a(v25);
                            }
                        }
                    }
                    var1_1.setCanceled(true);
                    this.B = true;
                    v21 = var7_6;
                }
                MultiprotocolAdapterFramework.c("\u00f5", (Object)v21, (long)-5080587748751373329L, (long)var2_2);
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == 'q' || c == 'z' || c == 'm') {
                field = MultiprotocolAdapterFramework.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultiprotocolAdapterFramework.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean T(CryptographicTransformer cryptographicTransformer) {
        boolean bl;
        block21: {
            block16: {
                double d2;
                double d3;
                block19: {
                    block20: {
                        String[] stringArray;
                        block17: {
                            block18: {
                                double d4;
                                double d5;
                                double d6;
                                block14: {
                                    block15: {
                                        block12: {
                                            block13: {
                                                long l = e ^ 0xFFCE62333DDL;
                                                double d7 = cryptographicTransformer.F() - ApplicationLifecycleManager.U().F();
                                                d6 = cryptographicTransformer.B() - ApplicationLifecycleManager.U().B();
                                                stringArray = SystemConfigurationOrchestrator.A();
                                                try {
                                                    double d8 = d7 - 0.0;
                                                    d5 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                                    if (stringArray != null) break block12;
                                                    if (d5 >= 0) break block13;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw MultiprotocolAdapterFramework.a(customSystemException);
                                                }
                                                d5 = 1.0;
                                                break block12;
                                            }
                                            d5 = 0.0;
                                        }
                                        try {
                                            double d9 = ApplicationLifecycleManager.U().G() - 0.0;
                                            d4 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                                            if (stringArray != null) break block14;
                                            if (d4 >= 0) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MultiprotocolAdapterFramework.a(customSystemException);
                                        }
                                        d4 = 1.0;
                                        break block14;
                                    }
                                    d4 = 0.0;
                                }
                                try {
                                    try {
                                        if (d5 != d4) break block16;
                                        double d10 = d6 - 0.0;
                                        d3 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                        if (stringArray != null) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiprotocolAdapterFramework.a(customSystemException);
                                    }
                                    if (d3 >= 0) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MultiprotocolAdapterFramework.a(customSystemException);
                                }
                                d3 = 1.0;
                                break block17;
                            }
                            d3 = 0.0;
                        }
                        try {
                            double d11 = ApplicationLifecycleManager.U().o() - 0.0;
                            d2 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                            if (stringArray != null) break block19;
                            if (d2 >= 0) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiprotocolAdapterFramework.a(customSystemException);
                        }
                        d2 = 1.0;
                        break block19;
                    }
                    d2 = 0.0;
                }
                try {
                    if (d3 != d2) break block16;
                    bl = true;
                    break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiprotocolAdapterFramework.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultiprotocolAdapterFramework.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultiprotocolAdapterFramework.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean a() {
        boolean bl;
        try {
            bl = this.Y.J() == this.G;
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void g(ClusterEventOrchestrator clusterEventOrchestrator) {
        try {
            if (this.B) {
                clusterEventOrchestrator.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void x(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        NetworkConnectionManager1286 networkConnectionManager1286;
        long l = e ^ 0x342C160652D5L;
        try {
            if (networkPacketOrchestrator1222.getPacketInstance() == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
        ConnectionLifecycleHandler connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
        boolean bl = false;
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.Ub)) {
            bl = true;
        } else if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh) && (networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler)).h() == ApplicationLifecycleManager.U().X()) {
            bl = true;
        }
        try {
            if (bl) {
                this.h = (int)MultiprotocolAdapterFramework.a("v", (int)32647, (long)(0xCD04B9CBF1C5B42L ^ l));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
    }

    @DataExchangeProtocol2090
    public void y(ClusterEventBroadcaster clusterEventBroadcaster) {
        try {
            if (this.B) {
                clusterEventBroadcaster.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultiprotocolAdapterFramework.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090
    public void J(InventoryEventManager inventoryEventManager) {
        try {
            if (this.B) {
                inventoryEventManager.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultiprotocolAdapterFramework.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MultiprotocolAdapterFramework.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultiprotocolAdapterFramework.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void B(KB kB) {
        try {
            if (this.d) {
                this.R = System.currentTimeMillis();
                this.d = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiprotocolAdapterFramework.a(customSystemException);
        }
        this.B = false;
    }

    public MultiprotocolAdapterFramework(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = e ^ 0x59D6788EE389L;
        super(contextualExecutionFramework, string);
        this.B = true;
        this.h = 0;
        this.G = new AuthenticationGateway1860((String)((Object)MultiprotocolAdapterFramework.c("\u00f5", (int)MultiprotocolAdapterFramework.a("v", (int)19325, (long)(0x50300561EFD05EE1L ^ l)), (long)-131302429402180119L, (long)l)));
        this.m = new AuthenticationGateway1860((String)((Object)MultiprotocolAdapterFramework.c("\u00f5", (int)MultiprotocolAdapterFramework.a("v", (int)7081, (long)(0x7243455D31ED0E37L ^ l)), (long)-131302429402180119L, (long)l)));
        this.Y = GenericAdapterManager.D(this, (String)((Object)MultiprotocolAdapterFramework.c("\u00f5", (int)MultiprotocolAdapterFramework.a("v", (int)14804, (long)(0x76549A62532AAC49L ^ l)), (long)-131302429402180119L, (long)l)), this.G, this.G, this.m);
        this.Y.R((String)((Object)MultiprotocolAdapterFramework.c("\u00f5", (int)MultiprotocolAdapterFramework.a("v", (int)742, (long)(0x72B329879FEE9779L ^ l)), (long)-131302429402180119L, (long)l)));
        this.N(this.Y);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultiprotocolAdapterFramework.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MultiprotocolAdapterFramework.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

