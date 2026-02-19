/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a._Y;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.transaction.management.TransactionOrchestrator1017;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicCipherProvider {
    int K;
    private static final long d;
    NetworkProtocolNegotiator a;
    int k;
    int U;
    double q;
    private static final long b;
    boolean E;
    int c;

    public boolean b() {
        return this.E;
    }

    public void a(TransactionOrchestrator1017 transactionOrchestrator1017) {
        NetworkProtocolNegotiator networkProtocolNegotiator;
        double d2;
        block48: {
            boolean bl;
            boolean bl2;
            block47: {
                block46: {
                    boolean bl3;
                    block45: {
                        block44: {
                            block39: {
                                block41: {
                                    block43: {
                                        block42: {
                                            block40: {
                                                block38: {
                                                    d2 = transactionOrchestrator1017.e();
                                                    networkProtocolNegotiator = transactionOrchestrator1017.N();
                                                    try {
                                                        block37: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (networkProtocolNegotiator.Y()) break block37;
                                                                        if (this.a == null) break block38;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw CryptographicCipherProvider.b(customSystemException);
                                                                    }
                                                                    if (!this.a.r()) break block38;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CryptographicCipherProvider.b(customSystemException);
                                                                }
                                                                if (networkProtocolNegotiator.equals(this.a)) break block38;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicCipherProvider.b(customSystemException);
                                                            }
                                                        }
                                                        this.W();
                                                        return;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicCipherProvider.b(customSystemException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (!this.E) break block39;
                                                        if (this.K <= 0) break block40;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicCipherProvider.b(customSystemException);
                                                    }
                                                    --this.K;
                                                    break block39;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicCipherProvider.b(customSystemException);
                                                }
                                            }
                                            bl2 = _Y.p(transactionOrchestrator1017);
                                            try {
                                                try {
                                                    if (!bl2) break block41;
                                                    ++this.c;
                                                    if (this.c < 5) break block42;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicCipherProvider.b(customSystemException);
                                                }
                                                this.W();
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicCipherProvider.b(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (_Y.c(transactionOrchestrator1017) || _Y.a(transactionOrchestrator1017)) break block43;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicCipherProvider.b(customSystemException);
                                            }
                                            this.W();
                                            return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicCipherProvider.b(customSystemException);
                                        }
                                    }
                                    this.s();
                                    break block39;
                                }
                                try {
                                    this.c = 0;
                                    if (_Y.k(transactionOrchestrator1017, this.U) == 0) {
                                        this.W();
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicCipherProvider.b(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (!(d2 < this.q) && transactionOrchestrator1017.y() != 20) break block44;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicCipherProvider.b(customSystemException);
                                }
                                bl3 = true;
                                break block45;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicCipherProvider.b(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ApplicationLifecycleManager.u();
                    try {
                        try {
                            try {
                                if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.l().r()) break block46;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicCipherProvider.b(customSystemException);
                            }
                            if (!transactionOrchestrator1017.K()) break block46;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicCipherProvider.b(customSystemException);
                        }
                        bl = true;
                        break block47;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicCipherProvider.b(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl4 = bl;
            try {
                try {
                    if (!bl2 && !bl4) break block48;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicCipherProvider.b(customSystemException);
                }
                this.s();
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicCipherProvider.b(customSystemException);
            }
        }
        this.a = networkProtocolNegotiator;
        this.q = d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(7241427189915079813L, 3386401690561909393L, MethodHandles.lookup().lookupClass()).a(240298526753209L);
        long l = b ^ 0x163CC6AED6B6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8751415085690702538L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void W() {
        this.E = false;
        this.q = -999.0;
        this.a = ApplicationLifecycleManager.c();
        this.c = 0;
        this.K = 0;
    }

    public void s() {
        this.E = true;
        this.K = this.k;
    }

    public CryptographicCipherProvider(int n) {
        long l = b ^ 0x6F6FB031B4D2L;
        this.U = (int)d;
        this.k = n;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

