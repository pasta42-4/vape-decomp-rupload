/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.crypto;

import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolNegotiationStrategy;
import com.session.management.MultiProtocolSessionManager;
import com.simulation.core.ModelSimulationEngine;
import com.system.config.AdaptiveConfigurationManager;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicPrimitiveGenerator {
    private int o;
    private static AdaptiveConfigurationManager[] P;
    private static AdaptiveConfigurationManager[] j;
    private static final long b;
    private final ProtocolNegotiationStrategy<MultiProtocolSessionManager> K;
    private long H;
    private static final long a;
    private final Map<N9, Vector<MultiProtocolSessionManager>> f;

    public long a() {
        return this.H;
    }

    /*
     * WARNING - void declaration
     */
    public Vector<MultiProtocolSessionManager> x(N9 n9, N9 n92, int n, Vector<MultiProtocolSessionManager> vector) {
        void var15_19;
        Object object;
        Object object2;
        int n2;
        int n3;
        int n4;
        block39: {
            int n5;
            block38: {
                int n6;
                block37: {
                    int n7;
                    block36: {
                        int n8;
                        block35: {
                            int n10;
                            block34: {
                                long l = a ^ 0x100037E81231L;
                                try {
                                    ++this.o;
                                    if (this.f.containsKey(n9)) {
                                        return this.f.get(n9);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicPrimitiveGenerator.a(customSystemException);
                                }
                                try {
                                    if (n > this.K.B()) {
                                        return null;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicPrimitiveGenerator.a(customSystemException);
                                }
                                n10 = n92.x() - n9.x();
                                n7 = n92.J() - n9.J();
                                n5 = n92.b() - n9.b();
                                try {
                                    if (n10 <= 0) break block34;
                                    n8 = 5;
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicPrimitiveGenerator.a(customSystemException);
                                }
                            }
                            try {
                                n8 = n10 < 0 ? 4 : -1;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicPrimitiveGenerator.a(customSystemException);
                            }
                        }
                        n4 = n8;
                        try {
                            if (n7 <= 0) break block36;
                            n6 = 1;
                            break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicPrimitiveGenerator.a(customSystemException);
                        }
                    }
                    try {
                        n6 = n7 < 0 ? 0 : -1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicPrimitiveGenerator.a(customSystemException);
                    }
                }
                n3 = n6;
                try {
                    if (n5 <= 0) break block38;
                    n2 = 3;
                    break block39;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicPrimitiveGenerator.a(customSystemException);
                }
            }
            try {
                n2 = n5 < 0 ? 2 : -1;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveGenerator.a(customSystemException);
            }
        }
        int n11 = n2;
        int[] nArray = new int[]{n4, n3, n11};
        ArrayList<MultiProtocolSessionManager> arrayList = new ArrayList<MultiProtocolSessionManager>();
        for (int n10 : nArray) {
            try {
                if (n10 == -1) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveGenerator.a(customSystemException);
            }
            object2 = n9;
            object = j[n10];
            N9 n93 = ((N9)object2).m((AdaptiveConfigurationManager)object);
            if (!this.K.X(n93)) continue;
            MultiProtocolSessionManager multiProtocolSessionManager = new MultiProtocolSessionManager((N9)object2, (AdaptiveConfigurationManager)object);
            multiProtocolSessionManager.d = n;
            arrayList.add(multiProtocolSessionManager);
        }
        arrayList.sort(Comparator.comparingInt(arg_0 -> this.lambda$recurFindPlacePathTargets$0(vector, n, arg_0)));
        Object var15_15 = null;
        int n12 = (int)b;
        for (MultiProtocolSessionManager multiProtocolSessionManager : arrayList) {
            block40: {
                object = multiProtocolSessionManager.o.m(multiProtocolSessionManager.N);
                object2 = new Vector<MultiProtocolSessionManager>(vector);
                ((Vector)object2).add(multiProtocolSessionManager);
                if (((N9)object).equals(n92)) {
                    Vector<MultiProtocolSessionManager> vector2 = object2;
                    break;
                }
                Vector<MultiProtocolSessionManager> vector3 = this.x((N9)object, n92, n + 1, (Vector<MultiProtocolSessionManager>)object2);
                try {
                    if (vector3 == null || vector3.isEmpty()) break block40;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicPrimitiveGenerator.a(customSystemException);
                }
                object2 = new Vector<MultiProtocolSessionManager>(vector3);
            }
            try {
                if (((Vector)object2).isEmpty()) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveGenerator.a(customSystemException);
            }
            try {
                if (n == 0) {
                    ModelSimulationEngine.G.add(new Vector<MultiProtocolSessionManager>((Collection<MultiProtocolSessionManager>)object2));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveGenerator.a(customSystemException);
            }
            int n13 = this.K.e((Vector<MultiProtocolSessionManager>)object2, n);
            try {
                void var15_16;
                if (var15_16 != null && n13 >= n12) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveGenerator.a(customSystemException);
            }
            Vector<MultiProtocolSessionManager> vector4 = object2;
            n12 = n13;
        }
        this.f.put(n9, (Vector<MultiProtocolSessionManager>)var15_19);
        return var15_19;
    }

    public CryptographicPrimitiveGenerator(ProtocolNegotiationStrategy<MultiProtocolSessionManager> protocolNegotiationStrategy) {
        this.K = protocolNegotiationStrategy;
        this.H = 0L;
        this.o = 0;
        this.f = new HashMap<N9, Vector<MultiProtocolSessionManager>>();
        if (j == null) {
            j = AdaptiveConfigurationManager.G();
            P = AdaptiveConfigurationManager.Y();
        }
    }

    public Vector<MultiProtocolSessionManager> A(N9 n9, N9 n92) {
        this.f.clear();
        long l = System.nanoTime();
        this.o = 0;
        Vector<MultiProtocolSessionManager> vector = this.x(n9, n92, 0, new Vector<MultiProtocolSessionManager>());
        long l2 = System.nanoTime();
        this.H = l2 - l;
        return vector;
    }

    private int lambda$recurFindPlacePathTargets$0(Vector vector, int n, MultiProtocolSessionManager multiProtocolSessionManager) {
        Vector<MultiProtocolSessionManager> vector2 = new Vector<MultiProtocolSessionManager>(vector);
        vector2.add(multiProtocolSessionManager);
        return this.K.e(vector2, n);
    }

    public int i() {
        return this.o;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-3185647550475494224L, -8721124334018016467L, MethodHandles.lookup().lookupClass()).a(253159759247560L);
        long l = a ^ 0x52851610C338L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -3739900320094217775L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

