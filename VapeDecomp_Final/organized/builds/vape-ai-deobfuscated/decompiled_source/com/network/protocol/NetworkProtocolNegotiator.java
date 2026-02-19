/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package com.network.protocol;

import a.oQ;
import com.app.compression.util.CompressionUtility2340;
import com.app.data.processing.DataTransformationHandler2028;
import com.app.transaction.validation.TransactionValidator2324;
import com.app.ui.UserInteractionManager;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.validation.DataIntegrityValidator2381;
import com.database.connection.DatabaseConnectionPool;
import com.event.management.ContextualEventDispatcher;
import com.finance.validation.TransactionValidationService;
import com.financial.processing.TransactionCorrelationEngine;
import com.financial.transaction.TransactionProcessor;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.channel.CommunicationChannelManager2466;
import com.network.config.NetworkConfigurationManager1905;
import com.network.connection.ConnectionEstablishmentHandler;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolAdapter990;
import com.network.transmission.DataTransmissionController;
import com.network.transmission.TransmissionStateManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceMappingController;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.structures.tree.RecursiveNodeTree;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.optimization.SystemResourceOptimizer;
import com.transaction.management.TransactionCoordinator2230;
import com.vape.processing.VapeDataProcessor;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkProtocolNegotiator
extends ObjectLifecycleTracker {
    private static final Map d;
    private static final long a;
    private static AbstractComputationKernel[] q;
    private static final Object[] e;
    private static final String[] h;
    private static final long[] b;
    private static final Integer[] c;

    public float T() {
        return NetworkProtocolNegotiator.U.u().da.p(this.H);
    }

    public TransactionProcessor d(ReflectionUtilityBroker reflectionUtilityBroker) {
        return new TransactionProcessor(NetworkProtocolNegotiator.U.u().da.S(this.H, reflectionUtilityBroker.M()));
    }

    public void u(float f) {
        NetworkProtocolNegotiator.U.u().da.R(this.H, f);
    }

    public TransactionProcessor z(int n, int n2) {
        return new TransactionProcessor(ResourceMappingController.A(NetworkProtocolNegotiator.U.u().da, this.H, n, n2));
    }

    private List Z() {
        Iterable iterable = NetworkProtocolNegotiator.U.u().da.P(this.H);
        ArrayList arrayList = new ArrayList();
        for (Object t : iterable) {
            try {
                if (!ReflectionMetadataResolver.UQ.isInstance(t)) continue;
                arrayList.add(t);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolNegotiator.a(unsupportedOperationException);
            }
        }
        return arrayList;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolNegotiator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolNegotiator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean b(CryptographicTransformer cryptographicTransformer, oQ oQ2, BiPredicate biPredicate) {
        return NetworkProtocolNegotiator.U.u().da.o(this.H, cryptographicTransformer.M(), oQ2.M(), biPredicate);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolNegotiator.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolNegotiator.e[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolNegotiator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public int O() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ResourceMappingController.w(NetworkProtocolNegotiator.U.u().da, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return 0;
    }

    public NetworkProtocolNegotiator(Object object) {
        super(object);
    }

    public int Q(int n, int n2, int n3) {
        return ResourceMappingController.b(NetworkProtocolNegotiator.U.u().da, this.H, n, n2, n3);
    }

    public TransactionValidator2324 g(VapeDataProcessor vapeDataProcessor) {
        long l = a ^ 0x66A9692D93DL;
        try {
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                return new TransactionValidator2324(NetworkProtocolNegotiator.U.u().da.G(this.H, vapeDataProcessor.M()));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException((String)((Object)NetworkProtocolNegotiator.b("p", (int)NetworkProtocolNegotiator.a("k", (int)10079, (long)(0x400EAAD1DF5D0E0BL ^ l)), (long)-4372881413602495395L, (long)l)));
    }

    private static boolean lambda$getEntitiesWithinAABBExcludingEntity$1(Object object) {
        return true;
    }

    public boolean b(CryptographicTransformer cryptographicTransformer, oQ oQ2) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ResourceMappingController.H(NetworkProtocolNegotiator.U.u().da, this.H, cryptographicTransformer.M(), oQ2.M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return false;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = e[n4];
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
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 62;
                break;
            }
            case 3: {
                n3 = 44;
                break;
            }
            case 4: {
                n3 = 11;
                break;
            }
            case 5: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 60;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 13;
                break;
            }
            case 9: {
                n3 = 1;
                break;
            }
            case 10: {
                n3 = 20;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 59;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 6;
                break;
            }
            case 16: {
                n3 = 58;
                break;
            }
            case 17: {
                n3 = 30;
                break;
            }
            case 18: {
                n3 = 31;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 55;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 3;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 23;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 25;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 34;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 56;
                break;
            }
            case 35: {
                n3 = 2;
                break;
            }
            case 36: {
                n3 = 40;
                break;
            }
            case 37: {
                n3 = 52;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 18;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 32;
                break;
            }
            case 46: {
                n3 = 17;
                break;
            }
            case 47: {
                n3 = 63;
                break;
            }
            case 48: {
                n3 = 49;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 29;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 51;
                break;
            }
            case 53: {
                n3 = 9;
                break;
            }
            case 54: {
                n3 = 22;
                break;
            }
            case 55: {
                n3 = 35;
                break;
            }
            case 56: {
                n3 = 57;
                break;
            }
            case 57: {
                n3 = 19;
                break;
            }
            case 58: {
                n3 = 43;
                break;
            }
            case 59: {
                n3 = 15;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 41;
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
        NetworkProtocolNegotiator.h[n4] = new String(cArray);
        return n4;
    }

    public boolean k(int n, int n2, int n3, int n4, int n5, int n6) {
        try {
            if (GameVersionEnumerator.MC_1_7_10.J()) {
                return ResourceMappingController.a(NetworkProtocolNegotiator.U.u().da, this.H, n, n2, n3, n4, n5, n6);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return ResourceMappingController.R(NetworkProtocolNegotiator.U.u().da, this.H, ReflectionUtilityBroker.t(n, n2, n3), ReflectionUtilityBroker.t(n4, n5, n6));
    }

    public void P(int n, int n2, int n3, int n4, int n5, int n6) {
        ResourceMappingController.C(NetworkProtocolNegotiator.U.u().da, this.H, n, n2, n3, n4, n5, n6);
    }

    public List P(CryptographicTransformer cryptographicTransformer, oQ oQ2, Object object) {
        return NetworkProtocolNegotiator.U.u().da.C(this.H, cryptographicTransformer.M(), oQ2.M(), object);
    }

    public TransactionCorrelationEngine R(double d2, double d3, double d4) {
        try {
            if (GameVersionEnumerator.MC_1_7_10.J()) {
                return new TransactionCorrelationEngine(NetworkProtocolNegotiator.U.u().da.B(this.H, (int)d2, (int)d3, (int)d4));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.L(d2, d3, d4);
        NetworkConnectionOrchestrator networkConnectionOrchestrator = new NetworkConnectionOrchestrator(NetworkProtocolNegotiator.U.u().da.U(this.H, reflectionUtilityBroker.M()));
        return networkConnectionOrchestrator.I();
    }

    private static Field g(long l, long l2) {
        int n = NetworkProtocolNegotiator.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolNegotiator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolNegotiator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolNegotiator.c(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolNegotiator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolNegotiator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolNegotiator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolNegotiator.f(260543135791918L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(7620867056449796927L, -4970581235519416804L, MethodHandles.lookup().lookupClass()).a(185311956165913L);
        e = new Object[5];
        h = new String[5];
        NetworkProtocolNegotiator.b();
        d = new HashMap(13);
        NetworkProtocolNegotiator.V(null);
        long l = a ^ 0x721D74A58688L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u001e\u00f9\u0091(?\u00c3\u00b1\u00bai]+\u00b2\u00f9C\u0012O";
        int n2 = "\u001e\u00f9\u0091(?\u00c3\u00b1\u00bai]+\u00b2\u00f9C\u0012O".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    public boolean O(oQ oQ2, RecursiveNodeTree recursiveNodeTree) {
        return NetworkProtocolNegotiator.U.u().da.e(this.M(), oQ2.M(), recursiveNodeTree.M());
    }

    public TransactionProcessor n(int n, int n2) {
        try {
            if (GameVersionEnumerator.MC_1_7_10.C()) {
                return this.d(ReflectionUtilityBroker.t(n, 0, n2));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return new TransactionProcessor(NetworkProtocolNegotiator.U.u().da.q(this.H, n, n2));
    }

    public List L() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                return this.w();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return NetworkProtocolNegotiator.U.u().da.k(this.H);
    }

    public void d(CryptographicTransformer cryptographicTransformer) {
        try {
            if (GeometryCalculator.C() >= 37) {
                cryptographicTransformer.m();
                ResourceMappingController.l(NetworkProtocolNegotiator.U.u().da, this.H, cryptographicTransformer.X(), SystemResourceOptimizer.y().M());
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                cryptographicTransformer.m();
                ResourceMappingController.t(NetworkProtocolNegotiator.U.u().da, this.H, cryptographicTransformer.M());
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        ResourceMappingController.t(NetworkProtocolNegotiator.U.u().da, this.H, cryptographicTransformer.M());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolNegotiator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolNegotiator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static boolean lambda$getEntitiesWithinAABBExcludingEntity$0(Object object) {
        return true;
    }

    public Object r() {
        return NetworkProtocolNegotiator.U.u().da.q(this.H);
    }

    public void U(float f) {
        NetworkProtocolNegotiator.U.u().da.j(this.H, f);
    }

    @Override
    public List M() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                return this.Z();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return NetworkProtocolNegotiator.U.u().da.E(this.H);
    }

    public static void V(AbstractComputationKernel[] abstractComputationKernelArray) {
        q = abstractComputationKernelArray;
    }

    public boolean p(int n, int n2, int n3) {
        return ResourceMappingController.i(NetworkProtocolNegotiator.U.u().da, this.H, n, n2, n3);
    }

    public CompressionUtility2340 G() {
        return new CompressionUtility2340(NetworkProtocolNegotiator.U.u().da.p(this.H));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/D0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private List w() {
        Iterable iterable = NetworkProtocolNegotiator.U.u().da.P(this.H);
        ArrayList arrayList = new ArrayList();
        for (Object t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public TransmissionStateManager K(ReflectionUtilityBroker reflectionUtilityBroker) {
        return new TransmissionStateManager(NetworkProtocolNegotiator.U.u().da.K(this.H, reflectionUtilityBroker.M()));
    }

    public CryptographicTransformer I(int n) {
        return new CryptographicTransformer(ResourceMappingController.w(NetworkProtocolNegotiator.U.u().da, this.H, n));
    }

    public DataIntegrityValidator2381 G() {
        long l = a ^ 0x1A04E5103292L;
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return new DataIntegrityValidator2381(NetworkProtocolNegotiator.U.u().da.i(this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException((String)((Object)NetworkProtocolNegotiator.b("p", (int)NetworkProtocolNegotiator.a("k", (int)4225, (long)(0x3F65DD2C6AEAD27BL ^ l)), (long)2954216132691779570L, (long)l)));
    }

    private static Method h(long l, long l2) {
        int n = NetworkProtocolNegotiator.e(l, l2);
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
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkProtocolNegotiator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolNegotiator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolNegotiator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolNegotiator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolNegotiator.f(260543135791918L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolNegotiator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolNegotiator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolNegotiator.f(260543135791918L, 0L);
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

    public NetworkProtocolAdapter990 X(ReflectionUtilityBroker reflectionUtilityBroker) {
        return new NetworkProtocolAdapter990(NetworkProtocolNegotiator.U.u().da.q(this.H, reflectionUtilityBroker.M()));
    }

    public DatabaseConnectionPool B() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return new DatabaseConnectionPool(NetworkProtocolNegotiator.U.u().da.k(this.H));
    }

    public boolean s() {
        return ResourceMappingController.g(NetworkProtocolNegotiator.U.u().da, this.H);
    }

    public boolean P(ReflectionUtilityBroker reflectionUtilityBroker) {
        try {
            if (GeometryCalculator.C() >= 37) {
                return NetworkProtocolNegotiator.U.u().da.q(this.H, reflectionUtilityBroker.o() >> 4, reflectionUtilityBroker.j() >> 4);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return NetworkProtocolNegotiator.U.u().da.x(this.H, reflectionUtilityBroker.M());
    }

    public UserInteractionManager V(ReflectionUtilityBroker reflectionUtilityBroker) {
        return new UserInteractionManager(NetworkProtocolNegotiator.U.u().da.g(this.H, reflectionUtilityBroker.M()));
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'S' || c == '\u00db' || c == 'I' || c == '\u00aa') {
                field = NetworkProtocolNegotiator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolNegotiator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A04;
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
                throw new RuntimeException("a/D0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolNegotiator.c[n2] = n3;
        }
        return c[n2];
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "[h3";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolNegotiator.h[1] = "java/lang/Integer";
        objectArray[2] = "CC}I\u000eWHLl\u0006sO[KeO";
        objectArray[3] = "e6/JIsn9>\u0005(}e2:_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]U0+\u0000f\u001d^4\u0014\ntmV!tZv\u0007\u0010~~a6\u0000Ru*\u001b5UB~\u0014";
    }

    public float Z() {
        return NetworkProtocolNegotiator.U.u().da.X(this.H);
    }

    public static AbstractComputationKernel[] V() {
        return q;
    }

    public NetworkPacketInterceptor1107 g(ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, boolean bl, boolean bl2, boolean bl3, CryptographicTransformer cryptographicTransformer) {
        block8: {
            NetworkConfigurationManager1905 networkConfigurationManager1905;
            TransactionValidationService transactionValidationService;
            block10: {
                block9: {
                    try {
                        try {
                            if (!GameVersionEnumerator.MC_1_16_5.H()) break block8;
                            if (!bl2) break block9;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
                        }
                        transactionValidationService = TransactionValidationService.m();
                        break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw NetworkProtocolNegotiator.a(unsupportedOperationException);
                    }
                }
                try {
                    transactionValidationService = bl3 ? TransactionValidationService.i() : TransactionValidationService.k();
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolNegotiator.a(unsupportedOperationException);
                }
            }
            TransactionValidationService transactionValidationService2 = transactionValidationService;
            try {
                networkConfigurationManager1905 = bl ? NetworkConfigurationManager1905.W() : NetworkConfigurationManager1905.a();
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolNegotiator.a(unsupportedOperationException);
            }
            NetworkConfigurationManager1905 networkConfigurationManager19052 = networkConfigurationManager1905;
            TransactionCoordinator2230 transactionCoordinator2230 = TransactionCoordinator2230.T(contextualEventDispatcher, contextualEventDispatcher2, transactionValidationService2, networkConfigurationManager19052, cryptographicTransformer);
            return new NetworkPacketInterceptor1107(NetworkProtocolNegotiator.U.u().da.M(this.H, transactionCoordinator2230.M()));
        }
        return new NetworkPacketInterceptor1107(NetworkProtocolNegotiator.U.u().da.h(this.H, contextualEventDispatcher.M(), contextualEventDispatcher2.M(), bl, bl2, bl3));
    }

    public List R(CryptographicTransformer cryptographicTransformer, oQ oQ2) {
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            Predicate<Object> predicate = NetworkProtocolNegotiator::lambda$getEntitiesWithinAABBExcludingEntity$0;
            return NetworkProtocolNegotiator.U.u().da.Y(this.H, cryptographicTransformer.M(), oQ2.M(), predicate);
        }
        if (GameVersionEnumerator.MC_1_16_5.H()) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            ResourceMappingController resourceMappingController;
            com.google.common.base.Predicate predicate = NetworkProtocolNegotiator::lambda$getEntitiesWithinAABBExcludingEntity$1;
            try {
                resourceMappingController = NetworkProtocolNegotiator.U.u().da;
                object4 = this.H;
                object3 = cryptographicTransformer.M();
                object2 = oQ2.M();
                object = GeometryCalculator.C() >= 37 ? predicate : null;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolNegotiator.a(unsupportedOperationException);
            }
            return resourceMappingController.Y(object4, object3, object2, object);
        }
        if (GameVersionEnumerator.MC_1_12_2.H()) {
            Object object;
            Object object5;
            Object object6;
            Object object7;
            ResourceMappingController resourceMappingController;
            com.google.common.base.Predicate predicate = NetworkProtocolNegotiator::lambda$getEntitiesWithinAABBExcludingEntity$2;
            try {
                resourceMappingController = NetworkProtocolNegotiator.U.u().da;
                object7 = this.H;
                object6 = cryptographicTransformer.M();
                object5 = oQ2.M();
                object = GeometryCalculator.C() >= 37 ? predicate : null;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolNegotiator.a(unsupportedOperationException);
            }
            return resourceMappingController.Y(object7, object6, object5, object);
        }
        return NetworkProtocolNegotiator.U.u().da.l(this.H, cryptographicTransformer.M(), oQ2.M());
    }

    public void j(float f) {
        NetworkProtocolNegotiator.U.u().da.T(this.H, f);
    }

    public TransactionCorrelationEngine N(int n, int n2, int n3) {
        try {
            if (GameVersionEnumerator.MC_1_7_10.J()) {
                return new TransactionCorrelationEngine(NetworkProtocolNegotiator.U.u().da.B(this.H, n, n2, n3));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.t(n, n2, n3);
        NetworkConnectionOrchestrator networkConnectionOrchestrator = new NetworkConnectionOrchestrator(NetworkProtocolNegotiator.U.u().da.U(this.H, reflectionUtilityBroker.M()));
        return networkConnectionOrchestrator.I();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public List v() {
        if (GeometryCalculator.C() >= 37) {
            ArrayList arrayList = new ArrayList();
            ArrayList<TransactionProcessor> arrayList2 = new ArrayList<TransactionProcessor>();
            AtomicReferenceArray atomicReferenceArray = this.d().T().p();
            int n = 0;
            while (n < atomicReferenceArray.length()) {
                Iterator iterator = atomicReferenceArray.get(n++);
                try {
                    if (iterator == null) continue;
                    arrayList2.add(new TransactionProcessor(iterator));
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolNegotiator.a(unsupportedOperationException);
                }
            }
            for (TransactionProcessor transactionProcessor : arrayList2) {
                arrayList.addAll(transactionProcessor.R().values());
            }
            return arrayList;
        }
        return NetworkProtocolNegotiator.U.u().da.S(this.H);
    }

    public void h(long l) {
        try {
            if (GameVersionEnumerator.MC_1_16_5.Q()) {
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        NetworkProtocolNegotiator.U.u().da.Y(this.H, l);
    }

    public NetworkConnectionOrchestrator T(ReflectionUtilityBroker reflectionUtilityBroker) {
        return new NetworkConnectionOrchestrator(NetworkProtocolNegotiator.U.u().da.U(this.H, reflectionUtilityBroker.M()));
    }

    private static boolean lambda$getEntitiesWithinAABBExcludingEntity$2(Object object) {
        return true;
    }

    public DataTransmissionController g() {
        return new DataTransmissionController(ResourceMappingController.s(NetworkProtocolNegotiator.U.u().da, this.H));
    }

    public List v(CryptographicTransformer cryptographicTransformer, oQ oQ2) {
        ArrayList<oQ> arrayList = new ArrayList<oQ>();
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            Iterable iterable = (Iterable)NetworkProtocolNegotiator.U.u().da.n(this.H, cryptographicTransformer.M(), oQ2.M());
            for (Object t : iterable) {
                DataTransformationHandler2028 dataTransformationHandler2028 = new DataTransformationHandler2028(t);
                arrayList.add(new oQ(dataTransformationHandler2028.y().M()));
            }
            return arrayList;
        }
        if (GameVersionEnumerator.MC_1_16_5.H()) {
            Stream stream = (Stream)NetworkProtocolNegotiator.U.u().da.n(this.H, cryptographicTransformer.M(), oQ2.M());
            for (Object object : stream.toArray()) {
                DataTransformationHandler2028 dataTransformationHandler2028 = new DataTransformationHandler2028(object);
                arrayList.add(new oQ(dataTransformationHandler2028.y().M()));
            }
            return arrayList;
        }
        return (List)NetworkProtocolNegotiator.U.u().da.n(this.H, cryptographicTransformer.M(), oQ2.M());
    }

    public ConnectionEstablishmentHandler d() {
        Object object = NetworkProtocolNegotiator.U.u().da.G(this.H);
        try {
            if (ReflectionMetadataResolver.VY.equals(object.getClass())) {
                return new ConnectionEstablishmentHandler(object);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolNegotiator.a(unsupportedOperationException);
        }
        return null;
    }

    public float k() {
        return NetworkProtocolNegotiator.U.u().da.e(this.H);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolNegotiator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public float a() {
        return NetworkProtocolNegotiator.U.u().da.s(this.H);
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

    public CommunicationChannelManager2466 N() {
        return new CommunicationChannelManager2466(NetworkProtocolNegotiator.U.u().da.d(this.H));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/D0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void b(float f) {
        NetworkProtocolNegotiator.U.u().da.Z(this.H, f);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolNegotiator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

