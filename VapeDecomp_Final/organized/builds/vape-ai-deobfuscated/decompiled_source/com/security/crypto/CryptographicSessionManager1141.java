/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.Ec;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.connection.NetworkConnectionManager1945;
import com.security.authentication.AuthenticationHandler1826;
import com.system.monitoring.ExecutionStateTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicSessionManager1141 {
    private boolean J;
    private static final int N;
    public boolean b;
    private static final CryptographicSessionManager1141 X;
    private AuthenticationHandler1826 Z;
    public AuthenticationHandler1826 g;

    public void s() {
        ExecutionStateTracker executionStateTracker;
        block11: {
            try {
                if (!this.J) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager1141.a(customSystemException);
            }
            executionStateTracker = ApplicationLifecycleManager.N();
            try {
                try {
                    if (executionStateTracker.A() <= 0 && executionStateTracker.s()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager1141.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager1141.a(customSystemException);
            }
        }
        Ec ec2 = ApplicationLifecycleManager.U();
        try {
            if (ec2.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1141.a(customSystemException);
        }
        if (this.b) {
            int n = ApplicationLifecycleManager.e();
            int n2 = ApplicationLifecycleManager.b();
            ApplicationLifecycleManager.y().C(n, n2);
            ec2.X(n, n2);
            ApplicationLifecycleManager.O().J();
            executionStateTracker.v(true);
        }
        ec2.M(false);
        ec2.I(new AuthenticationHandler1826(null));
        this.g = null;
        this.Z = null;
        this.J = false;
    }

    public void X() {
        boolean bl;
        ExecutionStateTracker executionStateTracker;
        block29: {
            block28: {
                block27: {
                    try {
                        if (this.J) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager1141.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (GeometryCalculator.C() < 35 || GeometryCalculator.C() > 36) break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSessionManager1141.a(customSystemException);
                                }
                                if (!TemporalMetadataResolver.h.r()) break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager1141.a(customSystemException);
                            }
                            if (TemporalMetadataResolver.h.d()) break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager1141.a(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager1141.a(customSystemException);
                    }
                }
                executionStateTracker = ApplicationLifecycleManager.N();
                try {
                    try {
                        if (executionStateTracker.A() <= 0 && executionStateTracker.s()) break block28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager1141.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager1141.a(customSystemException);
                }
            }
            bl = executionStateTracker.C();
            try {
                try {
                    try {
                        if (!bl || !a.iv()) break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager1141.a(customSystemException);
                    }
                    if (TemporalMetadataResolver.h.d()) break block29;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager1141.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager1141.a(customSystemException);
            }
        }
        Ec ec2 = ApplicationLifecycleManager.U();
        try {
            if (ec2.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1141.a(customSystemException);
        }
        this.Z = ec2.X();
        this.b = bl;
        int n = ApplicationLifecycleManager.e();
        int n2 = ApplicationLifecycleManager.b();
        try {
            if (this.b) {
                executionStateTracker.v(false);
                ApplicationLifecycleManager.y().C(n, n2);
                ec2.X(n, n2);
                ApplicationLifecycleManager.O().J();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1141.a(customSystemException);
        }
        this.q(n, n2);
        this.J = true;
    }

    public void T() {
        this.s();
    }

    private void q(int n, int n2) {
        this.g = AuthenticationHandler1826.w(ApplicationLifecycleManager.s(), ApplicationLifecycleManager.U().L(), ApplicationLifecycleManager.y(), new NetworkConnectionManager1945(Ec.h()[18]));
        ApplicationLifecycleManager.U().I(this.g);
        this.g.x(n, n2);
        ApplicationLifecycleManager.U().M(true);
    }

    public static CryptographicSessionManager1141 p() {
        return X;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = MultiContainerRegistry.a(-7152435919432168202L, -4455068775916790747L, MethodHandles.lookup().lookupClass()).a(24457339740297L) ^ 0x4D0ECB45B965L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -4617874952219389945L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                N = (int)l3;
                X = new CryptographicSessionManager1141();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public boolean Y() {
        return this.J;
    }
}

