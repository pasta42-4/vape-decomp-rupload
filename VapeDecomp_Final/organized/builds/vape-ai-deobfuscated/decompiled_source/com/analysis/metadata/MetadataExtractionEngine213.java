/*
 * Decompiled with CFR 0.152.
 */
package com.analysis.metadata;

import a.XF;
import a.Z3;
import com.app.system.health.HealthJudge;
import com.cache.management.CacheInvalidationManager2353;
import com.collections.management.MultiContainerRegistry;
import com.data.collection.CollectionOrchestrator1895;
import com.device.configuration.DeviceConfigurationProfile;
import com.exception.system.CustomSystemException;
import com.localization.content.MultilingualContentDescriptor;
import com.network.communication.CommunicationChannelManager;
import com.network.connection.ConnectionStateManager;
import com.network.pool.ConnectionPoolConfiguration;
import com.resource.management.MultiResourceOrchestrator;
import com.resource.management.ResourceLifecycleManager1859;
import com.security.auth.AuthenticationProtocol;
import com.security.authentication.AuthenticationTokenManager2358;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.system.resource.ResourceAllocationTracker144;
import com.temporal.metadata.TemporalMetadataResolver;
import com.vape.config.VapeConfigurationManager;
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
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MetadataExtractionEngine213 {
    private String y;
    private static final Integer[] c;
    private int C;
    private static final Object[] e;
    private int h;
    private static final long[] b;
    private ResourceAllocationTracker144 D;
    private XF s;
    private static final String[] f;
    private List<AuthenticationProtocol> o;
    private MultiResourceOrchestrator R;
    private Class H;
    private String n;
    private boolean K;
    private boolean Z;
    private ResourceLifecycleManager1859 T;
    private static final Map d;
    private static int A;
    private static final long a;
    private AuthenticationProtocol E;
    private Class M;
    private boolean L;

    private static Method d(long l, long l2) {
        int n = MetadataExtractionEngine213.a(l, l2);
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
                clazz3 = MetadataExtractionEngine213.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MetadataExtractionEngine213.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MetadataExtractionEngine213.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MetadataExtractionEngine213.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MetadataExtractionEngine213.b(248090894924955L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MetadataExtractionEngine213.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MetadataExtractionEngine213.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MetadataExtractionEngine213.b(248090894924955L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public MetadataExtractionEngine213 O() {
        try {
            if (this.h == 0) {
                this.D.V.j(this.s);
                return this;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataExtractionEngine213.a(customSystemException);
        }
        if (this.h == -1) {
            ListIterator<CollectionOrchestrator1895> listIterator = this.D.V.E();
            while (listIterator.hasNext()) {
                listIterator.next();
                if (listIterator.hasNext()) continue;
                while (listIterator.hasPrevious()) {
                    CollectionOrchestrator1895 collectionOrchestrator1895 = listIterator.previous();
                    try {
                        if (!(collectionOrchestrator1895 instanceof ConnectionPoolConfiguration)) continue;
                        this.D.V.r(collectionOrchestrator1895, this.s);
                        return this;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataExtractionEngine213.a(customSystemException);
                    }
                }
            }
        } else {
            ListIterator<CollectionOrchestrator1895> listIterator = this.D.V.E();
            while (listIterator.hasNext()) {
                CollectionOrchestrator1895 collectionOrchestrator1895 = listIterator.next();
                if (!(collectionOrchestrator1895 instanceof ConnectionPoolConfiguration)) continue;
                ConnectionPoolConfiguration connectionPoolConfiguration = (ConnectionPoolConfiguration)collectionOrchestrator1895;
                try {
                    if (connectionPoolConfiguration.Z != this.h) continue;
                    this.D.V.r(connectionPoolConfiguration, this.s);
                    return this;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine213.a(customSystemException);
                }
            }
        }
        return this;
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
                n3 = 44;
                break;
            }
            case 1: {
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 17;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 48;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 6;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 22;
                break;
            }
            case 14: {
                n3 = 46;
                break;
            }
            case 15: {
                n3 = 42;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 15;
                break;
            }
            case 19: {
                n3 = 36;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 45;
                break;
            }
            case 23: {
                n3 = 47;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 27;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 14;
                break;
            }
            case 29: {
                n3 = 23;
                break;
            }
            case 30: {
                n3 = 52;
                break;
            }
            case 31: {
                n3 = 39;
                break;
            }
            case 32: {
                n3 = 49;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 31;
                break;
            }
            case 35: {
                n3 = 54;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 35;
                break;
            }
            case 38: {
                n3 = 11;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 8;
                break;
            }
            case 45: {
                n3 = 43;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 28;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 62;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 20;
                break;
            }
            case 53: {
                n3 = 56;
                break;
            }
            case 54: {
                n3 = 16;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 40;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 9;
                break;
            }
            case 59: {
                n3 = 50;
                break;
            }
            case 60: {
                n3 = 21;
                break;
            }
            case 61: {
                n3 = 61;
                break;
            }
            case 62: {
                n3 = 10;
                break;
            }
            default: {
                n3 = 55;
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
        MetadataExtractionEngine213.f[n4] = new String(cArray);
        return n4;
    }

    public MetadataExtractionEngine213(int n, Class clazz, MultiResourceOrchestrator multiResourceOrchestrator, VapeConfigurationManager vapeConfigurationManager, boolean bl, AuthenticationProtocol ... authenticationProtocolArray) {
        long l = a ^ 0x6FD28EA14D74L;
        this.o = new ArrayList<AuthenticationProtocol>();
        this.T = new ResourceLifecycleManager1859(new CryptoKeyExchangeMapping());
        if (!TemporalMetadataResolver.h.r()) {
            CommunicationChannelManager.J().B().put(clazz.getName(), clazz);
        }
        for (ResourceAllocationTracker144 resourceAllocationTracker144 : multiResourceOrchestrator.H) {
            try {
                if (!vapeConfigurationManager.Y(resourceAllocationTracker144.R, resourceAllocationTracker144.P)) continue;
                this.D = resourceAllocationTracker144;
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataExtractionEngine213.a(customSystemException);
            }
        }
        try {
            if (this.D == null) {
                TemporalMetadataResolver.x((String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)17221, (long)(0x47B6FAED88AB7D34L ^ l)), (long)-8395256615567492600L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataExtractionEngine213.a(customSystemException);
        }
        this.h = n;
        this.M = clazz;
        this.R = multiResourceOrchestrator;
        for (AuthenticationProtocol authenticationProtocol : authenticationProtocolArray) {
            authenticationProtocol.r(multiResourceOrchestrator, this.D);
            this.o.add(authenticationProtocol);
        }
        this.K = bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MetadataExtractionEngine213.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MetadataExtractionEngine213.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/WG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MetadataExtractionEngine213.a = MultiContainerRegistry.a(81878841820765369L, -2616743410349335227L, MethodHandles.lookup().lookupClass()).a(113382563659056L);
                MetadataExtractionEngine213.e = new Object[5];
                MetadataExtractionEngine213.f = new String[5];
                MetadataExtractionEngine213.a();
                MetadataExtractionEngine213.d = new HashMap<K, V>(13);
                var0 = MetadataExtractionEngine213.a ^ 136158114593892L;
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
                var8_3 = new long[26];
                var5_4 = 0;
                var6_5 = "gt\u0010\u0092S<[\u00c7\u0017\u00d4\u0095\u0018\u00a2`\u0013\u0093\u0083\u00d2\u008f\u00c6^\u0082\t\u00a8\u00fbKRr\u00fdZ\u0002\u00fc\u0084\u00c3\u0091\u00b2\u00dc9\u00f2\u00f2/\u00ee\u0014\u00aal\u0082\u00e6\u0089\u00bf\u00ee\u0001\u00e8\u00fe\u00d8\u00ac\u00c1sV~\u00b2\u0094\u0004=c,\u00ed\u00bf\u001e\u008b\u009aI\u00ba\u00d7\u00f4H\u00b3\u00f5\u009bM=\u00a6\u00bf`\u00c5\u00a4\u009a\na\u0017\u0086\u00bfk\\\u00ec\u0083\u00c6\u00c9\u008c\u00d1\u0080\u0018\u00c4\u009a\u0015\u00c2\u00ed\u00bd\u0097\u00a0\u00c3\u00b2\u00d6\u00acPi\u00b6\"\u0097V\u00d6\u00b0\u0018%\u00a0\u001d\u00ecV*\u008bz{\u0095\u0014v\u00e5\u00d4>\u00a8\u00ed\u000b\u00b5\u008e1\u009a\u009e\u00d3b\u0003\u00f6\u00d3\u00a2W\t\u00e6T\u00e6'\u00c7-\r\u00ea\u0090\u00e1\u00fe\u009d[\u00c93\u00cb\u00db\u00f5?B\u00a6\u00fc\u00d3\u0006\u00e2*9\u00d2\u00d8\u00c0\u008d\tE`\u00fb\u00efQ\u0012_";
                var7_6 = "gt\u0010\u0092S<[\u00c7\u0017\u00d4\u0095\u0018\u00a2`\u0013\u0093\u0083\u00d2\u008f\u00c6^\u0082\t\u00a8\u00fbKRr\u00fdZ\u0002\u00fc\u0084\u00c3\u0091\u00b2\u00dc9\u00f2\u00f2/\u00ee\u0014\u00aal\u0082\u00e6\u0089\u00bf\u00ee\u0001\u00e8\u00fe\u00d8\u00ac\u00c1sV~\u00b2\u0094\u0004=c,\u00ed\u00bf\u001e\u008b\u009aI\u00ba\u00d7\u00f4H\u00b3\u00f5\u009bM=\u00a6\u00bf`\u00c5\u00a4\u009a\na\u0017\u0086\u00bfk\\\u00ec\u0083\u00c6\u00c9\u008c\u00d1\u0080\u0018\u00c4\u009a\u0015\u00c2\u00ed\u00bd\u0097\u00a0\u00c3\u00b2\u00d6\u00acPi\u00b6\"\u0097V\u00d6\u00b0\u0018%\u00a0\u001d\u00ecV*\u008bz{\u0095\u0014v\u00e5\u00d4>\u00a8\u00ed\u000b\u00b5\u008e1\u009a\u009e\u00d3b\u0003\u00f6\u00d3\u00a2W\t\u00e6T\u00e6'\u00c7-\r\u00ea\u0090\u00e1\u00fe\u009d[\u00c93\u00cb\u00db\u00f5?B\u00a6\u00fc\u00d3\u0006\u00e2*9\u00d2\u00d8\u00c0\u008d\tE`\u00fb\u00efQ\u0012_".length();
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
                    var6_5 = "f\u00e9t#\u001d\u00ad\u00f5n\u00ec]l\u009c\u00c6\u0006T\u00f3";
                    var7_6 = "f\u00e9t#\u001d\u00ad\u00f5n\u00ec]l\u009c\u00c6\u0006T\u00f3".length();
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
        MetadataExtractionEngine213.b = var8_3;
        MetadataExtractionEngine213.c = new Integer[26];
        MetadataExtractionEngine213.A = 1;
    }

    /*
     * Exception decompiling
     */
    public static int z(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\\\u0004\u0016";
        objectArray[1] = Integer.TYPE;
        MetadataExtractionEngine213.f[1] = "java/lang/Integer";
        objectArray[2] = "X[#Cz:ST2\f\u0007\"@S;E";
        objectArray[3] = "fkS\u001e\u007f\u001fmdBQ\u001e\u0011foF\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\r[\u001e%!\u0007GA@C3\u0016=\\\u001b#\"\u001d[OV{XT[S@14\nFD\u0017C";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/WG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = MetadataExtractionEngine213.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = MetadataExtractionEngine213.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MetadataExtractionEngine213.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MetadataExtractionEngine213.a(clazz3, string2, clazz2)) != null) {
                    MetadataExtractionEngine213.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MetadataExtractionEngine213.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MetadataExtractionEngine213.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MetadataExtractionEngine213.b(248090894924955L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static String q(String string) {
        long l = a ^ 0x7CFEC6B299ECL;
        int n = string.indexOf((String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)24357, (long)(0x1DAFF0D7224035C7L ^ l)), (long)6910243366282866320L, (long)l))) + 1;
        string = string.substring(n, n + 1);
        return string;
    }

    public void P() {
        long l = a ^ 0x45298712E137L;
        String string = this.M.getName().replace('.', '/');
        ResourceLifecycleManager1859 resourceLifecycleManager1859 = new ResourceLifecycleManager1859(new CryptoKeyExchangeMapping());
        int n = this.D.X++;
        MultilingualContentDescriptor multilingualContentDescriptor = new MultilingualContentDescriptor((String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)10773, (long)(0x4D8445452F133821L ^ l)), (long)2827456193900467787L, (long)l)), (String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)21399, (long)(0x4966B3797D7041B3L ^ l)), (long)2827456193900467787L, (long)l)) + string + (String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)1280, (long)(0x607666F09E551721L ^ l)), (long)2827456193900467787L, (long)l)), null, this.T, resourceLifecycleManager1859, n);
        this.D.B.add(multilingualContentDescriptor);
        XF xF = new XF();
        xF.R(this.T);
        if (!this.K) {
            for (MultilingualContentDescriptor object : this.D.B) {
                try {
                    if (object.W != 0) continue;
                    object.n = this.T;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine213.a(customSystemException);
                }
            }
        }
        xF.R(new AuthenticationTokenManager2358(187, string));
        xF.R(new ConnectionStateManager(89));
        StringBuilder stringBuilder = new StringBuilder((String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)11537, (long)(0x43706AD82FEEBF32L ^ l)), (long)2827456193900467787L, (long)l)));
        for (AuthenticationProtocol authenticationProtocol : this.o) {
            xF.W(authenticationProtocol.S());
            stringBuilder.append(authenticationProtocol.T());
        }
        stringBuilder.append((String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)2124, (long)(0x309F63E959881A7CL ^ l)), (long)2827456193900467787L, (long)l)));
        xF.R(new DeviceConfigurationProfile(183, string, (String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)24568, (long)(0x3FEE8B93355E4DDEL ^ l)), (long)2827456193900467787L, (long)l)), stringBuilder.toString(), false));
        xF.R(new HealthJudge(58, n));
        xF.R(new HealthJudge(25, n));
        xF.R(new DeviceConfigurationProfile(182, string, Z3.P(this.M).getName(), (String)((Object)MetadataExtractionEngine213.b("\u00dc", (int)MetadataExtractionEngine213.a("l", (int)14253, (long)(0x144835110D1A58DL ^ l)), (long)2827456193900467787L, (long)l)), false));
        xF.R(new CacheInvalidationManager2353(153, resourceLifecycleManager1859));
        xF.R(new ConnectionStateManager(MetadataExtractionEngine213.B(this.D.P)));
        xF.R(resourceLifecycleManager1859);
        this.s = xF;
    }

    public static List<String> I(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            char c = cArray[i];
            try {
                if (c == '(') {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataExtractionEngine213.a(customSystemException);
            }
            try {
                if (c == ')') {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataExtractionEngine213.a(customSystemException);
            }
            if (c == 'L') {
                String string2 = "";
                while ((c = cArray[i++]) != ';') {
                    string2 = string2 + c;
                }
                --i;
                arrayList.add(string2);
                continue;
            }
            arrayList.add(Character.toString(c));
        }
        return arrayList;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MetadataExtractionEngine213.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                MetadataExtractionEngine213.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MetadataExtractionEngine213.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MetadataExtractionEngine213.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static int B(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    /*
     * Exception decompiling
     */
    public static int R(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MetadataExtractionEngine213.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x351D;
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
                throw new RuntimeException("a/WG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataExtractionEngine213.c[n2] = n3;
        }
        return c[n2];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == '\u00c5' || c == '\u00e6' || c == 'q') {
                field = MetadataExtractionEngine213.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MetadataExtractionEngine213.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetadataExtractionEngine213.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetadataExtractionEngine213.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MetadataExtractionEngine213.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

