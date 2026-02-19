/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.a;
import a.bE;
import com.app.network.NetworkConnectionManager1686;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.serialization.DataSerializationManager;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.security.authentication.AuthenticationBroker;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.transaction.TransactionalCipherManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
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

public class DataEncodingTransformer
extends DataSerializationManager {
    private final GraphicalThemeRenderer uE;
    private static final Object[] wb;
    private static final Integer[] sb;
    private static int u9;
    private static final String[] xb;
    private final VisualRenderContext uL;
    private static final Map tb;
    private final TransactionalCipherManager ux;
    private CipherContextManager1101 uQ;
    private static final long[] rb;
    private static final long eb;
    private DistributedResourceCoordinator uN;
    private final SymmetricCipherManager uz;
    private boolean uq;
    private final GraphicalRenderEngine1082 uw;
    private final AdaptiveCipherEngine uZ;

    public DistributedResourceCoordinator o() {
        return this.uN;
    }

    public static int p() {
        int n = DataEncodingTransformer.r();
        try {
            if (n == 0) {
                return 104;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
        return 0;
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataEncodingTransformer.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void V(boolean bl) {
        this.uq = bl;
    }

    public void u(TransactionDescriptor transactionDescriptor) {
        DistributedResourceCoordinator distributedResourceCoordinator = null;
        for (AbstractComputationKernel abstractComputationKernel : this.uw.A()) {
            DistributedResourceCoordinator distributedResourceCoordinator2;
            if (!(abstractComputationKernel instanceof DistributedResourceCoordinator) || !(distributedResourceCoordinator2 = (DistributedResourceCoordinator)abstractComputationKernel).Q().equals(transactionDescriptor)) continue;
            distributedResourceCoordinator = distributedResourceCoordinator2;
        }
        try {
            if (distributedResourceCoordinator == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
        this.uw.J(distributedResourceCoordinator);
        this.uw.A();
        this.uz.A();
    }

    public AdaptiveCipherEngine g() {
        return this.uZ;
    }

    public static void l() {
        DataEncodingTransformer dataEncodingTransformer = GraphicalRenderingController.D(DataEncodingTransformer.class);
        dataEncodingTransformer.uw.k();
        for (TransactionDescriptor transactionDescriptor : TemporalMetadataResolver.h.o().T()) {
            dataEncodingTransformer.S(transactionDescriptor);
        }
        dataEncodingTransformer.uz.A();
    }

    public void Y(CipherContextManager1101 cipherContextManager1101) {
        this.uQ = cipherContextManager1101;
    }

    public void S(TransactionDescriptor transactionDescriptor) {
        this.uw.o(new DistributedResourceCoordinator(this, transactionDescriptor));
        this.uw.A();
        this.uz.A();
    }

    static VisualRenderContext a(DataEncodingTransformer dataEncodingTransformer) {
        return dataEncodingTransformer.uL;
    }

    private static void T() {
        Object[] objectArray = wb;
        wb[0] = "Q$B";
        objectArray[1] = Integer.TYPE;
        DataEncodingTransformer.xb[1] = "java/lang/Integer";
        objectArray[2] = "4\u001cV?bz?\u0013Gp\u001fb,\u0014N9";
        objectArray[3] = "\u001dJ:Zz~\u0016E+\u0015\u001bp\u001dN/O";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u007fK^%O\u0018~\u0015_IO\u0018\u0019\u0000T'\u0018Xi\u0003S $Y#\bIvK\r)\u0012[I";
    }

    public static void q(int n) {
        u9 = n;
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataEncodingTransformer.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataEncodingTransformer.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void P() {
        try {
            if (this.uQ != null) {
                this.N().x();
                GraphicalRenderingController.z(this.uQ);
                this.uQ = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
        try {
            if (this.ux.U() != null) {
                TemporalMetadataResolver.h.o().q(this.ux.U());
                this.ux.N(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
    }

    @Override
    public String A() {
        long l = eb ^ 0x734F098DCF37L;
        return DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)27036, (long)(0x7E69B63F808239FL ^ l)), (long)4868420070664629517L, (long)l);
    }

    private static Field s(long l, long l2) {
        int n = DataEncodingTransformer.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = xb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataEncodingTransformer.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataEncodingTransformer.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataEncodingTransformer.i(clazz3, string2, clazz2)) != null) {
                    DataEncodingTransformer.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataEncodingTransformer.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataEncodingTransformer.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataEncodingTransformer.r(264935837318585L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void u(DistributedResourceCoordinator distributedResourceCoordinator) {
        this.uN = distributedResourceCoordinator;
    }

    static GraphicalThemeRenderer h(DataEncodingTransformer dataEncodingTransformer) {
        return dataEncodingTransformer.uE;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public SymmetricCipherManager F() {
        return this.uz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataEncodingTransformer.eb = MultiContainerRegistry.a(3341236608561512817L, 4907500024136928954L, MethodHandles.lookup().lookupClass()).a(73257603017903L);
                DataEncodingTransformer.wb = new Object[5];
                DataEncodingTransformer.xb = new String[5];
                DataEncodingTransformer.T();
                DataEncodingTransformer.tb = new HashMap<K, V>(13);
                DataEncodingTransformer.q(0);
                var0 = DataEncodingTransformer.eb ^ 12774469450994L;
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
                var6_5 = "!Bc\u0092\u008b\u00dc\u00b8\u0088k\u00bev\u0001\u00eb\u00e0\u0093\u00c3=\u00a2\u00c1\u0090'j\u00ca\u001e\u00afvv:;|\u00a6\u00b2\u00dd\u00fd\u00a77\u008e\u00c9^\u0002\u00ac\u0004~(\u0019\u00d7X\u00c4\u001b1\u0015\u00c5>\u00c46\u0013\u00c4j--\u00fa\u00d5\u00e6@";
                var7_6 = "!Bc\u0092\u008b\u00dc\u00b8\u0088k\u00bev\u0001\u00eb\u00e0\u0093\u00c3=\u00a2\u00c1\u0090'j\u00ca\u001e\u00afvv:;|\u00a6\u00b2\u00dd\u00fd\u00a77\u008e\u00c9^\u0002\u00ac\u0004~(\u0019\u00d7X\u00c4\u001b1\u0015\u00c5>\u00c46\u0013\u00c4j--\u00fa\u00d5\u00e6@".length();
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
                    var6_5 = "\u00887L%!\u00e0\u00cb)\u00a1B\u0081\f\u001e,\u0098#";
                    var7_6 = "\u00887L%!\u00e0\u00cb)\u00a1B\u0081\f\u001e,\u0098#".length();
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
        DataEncodingTransformer.rb = var8_3;
        DataEncodingTransformer.sb = new Integer[10];
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (xb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 26;
                break;
            }
            case 1: {
                n3 = 28;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 45;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 11;
                break;
            }
            case 9: {
                n3 = 12;
                break;
            }
            case 10: {
                n3 = 42;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 27;
                break;
            }
            case 13: {
                n3 = 59;
                break;
            }
            case 14: {
                n3 = 51;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 62;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 54;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 52;
                break;
            }
            case 22: {
                n3 = 57;
                break;
            }
            case 23: {
                n3 = 1;
                break;
            }
            case 24: {
                n3 = 5;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 35;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 60;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 15;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 17;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 41;
                break;
            }
            case 41: {
                n3 = 61;
                break;
            }
            case 42: {
                n3 = 7;
                break;
            }
            case 43: {
                n3 = 4;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 55;
                break;
            }
            case 47: {
                n3 = 29;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 9;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 22;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 18;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 8;
                break;
            }
            case 57: {
                n3 = 0;
                break;
            }
            case 58: {
                n3 = 32;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 39;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 40;
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
        DataEncodingTransformer.xb[n4] = new String(cArray);
        return n4;
    }

    public CipherContextManager1101 R() {
        return this.uQ;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataEncodingTransformer.q(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                DataEncodingTransformer.wb[n] = clazz = Class.forName(xb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void N() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.uN == null) break block4;
                        if (!this.uN.s()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataEncodingTransformer.a(customSystemException);
                    }
                    this.uN.N();
                }
                catch (CustomSystemException customSystemException) {
                    throw DataEncodingTransformer.a(customSystemException);
                }
            }
            return;
        }
        super.N();
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = DataEncodingTransformer.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataEncodingTransformer.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void V() {
        try {
            super.V();
            if (this.uQ != null) {
                GraphicalRenderingController.z(this.uQ);
                this.uQ = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
    }

    private static Method t(long l, long l2) {
        int n = DataEncodingTransformer.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataEncodingTransformer.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataEncodingTransformer.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataEncodingTransformer.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataEncodingTransformer.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataEncodingTransformer.r(264935837318585L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataEncodingTransformer.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataEncodingTransformer.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataEncodingTransformer.r(264935837318585L, 0L);
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

    @Override
    public void E() {
        block20: {
            int n;
            block17: {
                block19: {
                    long l;
                    block18: {
                        l = eb ^ 0x265046C1E19EL;
                        n = 0;
                        for (TransactionDescriptor transactionDescriptor : TemporalMetadataResolver.h.o().T()) {
                            try {
                                if (transactionDescriptor.T()) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataEncodingTransformer.a(customSystemException);
                            }
                            ++n;
                        }
                        try {
                            try {
                                if (this.Q()) break block17;
                                if (n <= 0) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataEncodingTransformer.a(customSystemException);
                            }
                            this.uE.u((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)1278, (long)(0x643B136C42156051L ^ l)), (long)7870409088651543460L, (long)l)));
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataEncodingTransformer.a(customSystemException);
                        }
                    }
                    this.uE.u((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)12518, (long)(0x428AA64B999B5441L ^ l)), (long)7870409088651543460L, (long)l)));
                }
                this.uE.N(this.s());
            }
            try {
                for (int i = 0; i < 5; ++i) {
                    this.N().z();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataEncodingTransformer.a(customSystemException);
            }
            try {
                try {
                    try {
                        this.uw.T(110.0);
                        super.E();
                        if (this.Q() || this.N().Q()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataEncodingTransformer.a(customSystemException);
                    }
                    if (n <= 0) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataEncodingTransformer.a(customSystemException);
                }
                if (!this.s()) break block20;
            }
            catch (CustomSystemException customSystemException) {
                throw DataEncodingTransformer.a(customSystemException);
            }
            CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.9);
            double d2 = cryptographicParameterGenerator.B("" + n);
            double d3 = cryptographicParameterGenerator.D("" + n);
            cryptographicParameterGenerator.R("" + n, this.G() + this.w() - 5.0 - 32.0 - 3.0 - d3, this.W() + this.N().b() / 2.0 - d2 / 2.0, DataEncodingTransformer.M.n);
        }
    }

    public DataEncodingTransformer() {
        long l = eb ^ 0x51AD971EAB6FL;
        super(a.cs((int)DataEncodingTransformer.e("f", (int)20776, (long)(0x7E4AAC6D6E097F77L ^ l))), a.cs((int)DataEncodingTransformer.e("f", (int)13614, (long)(0x6DEF630999CA1B77L ^ l))));
        this.uE = new GraphicalThemeRenderer((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)23718, (long)(0x4234333919B072FEL ^ l)), (long)2866603423737547093L, (long)l)), 0.7);
        this.uL = new VisualRenderContext((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)7205, (long)(0x55C8BD9431A8327FL ^ l)), (long)2866603423737547093L, (long)l)), 0.8);
        this.N(false);
        this.T(103.0);
        this.Y(false);
        this.B(true);
        this.N().n(0.5f);
        AbstractComputationKernel[] abstractComputationKernelArray = new AbstractComputationKernel[1];
        this.uZ = new AdaptiveCipherEngine(TemporalMetadataResolver.h.F().j);
        abstractComputationKernelArray[0] = this.uZ;
        this.V(abstractComputationKernelArray);
        this.V(new AdaptiveCipherEngine(TemporalMetadataResolver.h.F().t));
        this.uz = new SymmetricCipherManager(this.w());
        this.uz.n(new bE(1.0, 5.0), new Object[0]);
        AbstractComputationKernel[] abstractComputationKernelArray2 = new AbstractComputationKernel[1];
        this.ux = new TransactionalCipherManager(this);
        abstractComputationKernelArray2[0] = this.ux;
        this.uz.o(abstractComputationKernelArray2);
        AbstractComputationKernel[] abstractComputationKernelArray3 = new AbstractComputationKernel[1];
        this.uw = new GraphicalRenderEngine1082(100.0, 125.0);
        abstractComputationKernelArray3[0] = this.uw;
        this.uz.o(abstractComputationKernelArray3);
        this.uz.d().f((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)14964, (long)(0x2ADAEBAD470A9423L ^ l)), (long)2866603423737547093L, (long)l)));
        this.uw.i(125.0);
        this.uw.T(110.0);
        this.uw.d().f((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)6739, (long)(0x551FD5127783B40FL ^ l)), (long)2866603423737547093L, (long)l)));
        this.o(this.uz);
        this.uL.N(false);
        this.uL.Y(20.0);
        this.uL.P(14.0);
        this.uE.g((String)((Object)DataEncodingTransformer.j("\u00a4", (int)DataEncodingTransformer.e("f", (int)30746, (long)(0x62142F76F994D647L ^ l)), (long)2866603423737547093L, (long)l)));
        this.uE.N(new AuthenticationBroker(this));
        this.uL.N(new NetworkConnectionManager1686(this));
        this.N().A(this.uE);
        this.N().A(this.uL);
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00f2' || c == '\u00cc' || c == 'F') {
                field = DataEncodingTransformer.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataEncodingTransformer.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x997;
        if (sb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = rb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataEncodingTransformer.sb[n2] = n3;
        }
        return sb[n2];
    }

    public GraphicalRenderEngine1082 w() {
        return this.uw;
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        try {
            if (this.uN != null) {
                this.uN.S(userInteractionEventDispatcher);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
        super.S(userInteractionEventDispatcher);
    }

    @Override
    public void d() {
        try {
            super.d();
            this.uw.T(110.0);
            if (this.uQ != null) {
                this.uQ.A();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataEncodingTransformer.a(customSystemException);
        }
    }

    public boolean Q() {
        return this.uq;
    }

    @Override
    public void y() {
        super.y();
        this.P();
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataEncodingTransformer.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int r() {
        return u9;
    }

    public TransactionalCipherManager u() {
        return this.ux;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataEncodingTransformer.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DataEncodingTransformer.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

