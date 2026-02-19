/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.resource;

import a.ZB;
import com.app.exceptions.CustomApplicationException;
import com.app.logging.core.LoggingInterceptor2041;
import com.app.network.CommunicationProtocolManager1453;
import com.collections.management.MultiContainerRegistry;
import com.data.transformation.DataTransformationService1284;
import com.data.transformation.MultiformatDataTransformer;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.transaction.validation.TransactionValidator1298;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ResourceAllocationManager1058 {
    private final String u;
    private static final long a = MultiContainerRegistry.a(3642660627418909340L, -4589484438718079605L, MethodHandles.lookup().lookupClass()).a(182073014988186L);
    @Nullable
    private TransactionValidator1298 x;
    private static int e;
    private static final long b;
    private final Map<GameVersionEnumerator, Integer> P;
    private final short t;
    private final GameVersionEnumerator l;
    @Nullable
    private CommunicationProtocolManager1453 d;

    void Y() throws CustomApplicationException {
        block25: {
            block24: {
                int n;
                block23: {
                    long l = a ^ 0x778DA2CDC3AFL;
                    try {
                        if (!this.g()) {
                            return;
                        }
                    }
                    catch (CustomApplicationException customApplicationException) {
                        throw ResourceAllocationManager1058.a(customApplicationException);
                    }
                    int n2 = 0;
                    int n3 = (int)b;
                    n = -1;
                    while (true) {
                        String string;
                        ObjectLifecycleTracker objectLifecycleTracker;
                        if (GameVersionEnumerator.MC_1_16_5.H()) {
                            block21: {
                                objectLifecycleTracker = CommunicationProtocolManager1453.J(n2);
                                try {
                                    try {
                                        if (!objectLifecycleTracker.Y()) break block21;
                                        if (n2 != 0) break;
                                    }
                                    catch (CustomApplicationException customApplicationException) {
                                        throw ResourceAllocationManager1058.a(customApplicationException);
                                    }
                                    ++n2;
                                    continue;
                                }
                                catch (CustomApplicationException customApplicationException) {
                                    throw ResourceAllocationManager1058.a(customApplicationException);
                                }
                            }
                            string = ((CommunicationProtocolManager1453)objectLifecycleTracker).j();
                        } else {
                            block22: {
                                objectLifecycleTracker = TransactionValidator1298.l(n2);
                                try {
                                    try {
                                        if (!objectLifecycleTracker.Y()) break block22;
                                        if (n2 != 0) break;
                                    }
                                    catch (CustomApplicationException customApplicationException) {
                                        throw ResourceAllocationManager1058.a(customApplicationException);
                                    }
                                    ++n2;
                                    continue;
                                }
                                catch (CustomApplicationException customApplicationException) {
                                    throw ResourceAllocationManager1058.a(customApplicationException);
                                }
                            }
                            string = LoggingInterceptor2041.f(((TransactionValidator1298)objectLifecycleTracker).Y(), new Object[0]);
                        }
                        int n4 = ZB.F(this.u, string);
                        if (n4 < n3) {
                            n = n2;
                            n3 = n4;
                        }
                        ++n2;
                    }
                    try {
                        if (!GameVersionEnumerator.MC_1_16_5.H()) break block23;
                        this.d = CommunicationProtocolManager1453.J(n);
                        break block24;
                    }
                    catch (CustomApplicationException customApplicationException) {
                        throw ResourceAllocationManager1058.a(customApplicationException);
                    }
                }
                this.x = TransactionValidator1298.l(n);
            }
            try {
                try {
                    if (this.x != null || this.d != null) break block25;
                }
                catch (CustomApplicationException customApplicationException) {
                    throw ResourceAllocationManager1058.a(customApplicationException);
                }
                throw new CustomApplicationException(this);
            }
            catch (CustomApplicationException customApplicationException) {
                throw ResourceAllocationManager1058.a(customApplicationException);
            }
        }
    }

    public String L() {
        return this.u;
    }

    @Nullable
    public CommunicationProtocolManager1453 Y() {
        return this.d;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static int G() {
        int n = ResourceAllocationManager1058.i();
        try {
            if (n == 0) {
                return 80;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager1058.a(customSystemException);
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x68C97ADAD3DBL;
        ResourceAllocationManager1058.c(0);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8818839995188954514L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Nullable
    public TransactionValidator1298 m() {
        return this.x;
    }

    ResourceAllocationManager1058(MultiformatDataTransformer multiformatDataTransformer) {
        this.u = MultiformatDataTransformer.E(multiformatDataTransformer);
        this.t = MultiformatDataTransformer.B(multiformatDataTransformer);
        this.P = new LinkedHashMap<GameVersionEnumerator, Integer>(MultiformatDataTransformer.z(multiformatDataTransformer));
        this.l = MultiformatDataTransformer.o(multiformatDataTransformer);
    }

    public boolean g() {
        boolean bl;
        try {
            bl = GameVersionEnumerator.u() >= this.l.B();
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager1058.a(customSystemException);
        }
        return bl;
    }

    public static MultiformatDataTransformer I() {
        return new MultiformatDataTransformer();
    }

    public short G() {
        return this.t;
    }

    public int N() {
        block7: {
            block8: {
                try {
                    try {
                        if (GeometryCalculator.C() < 35) break block7;
                        if (this.d != null) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager1058.a(customSystemException);
                    }
                    return -1;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager1058.a(customSystemException);
                }
            }
            return CommunicationProtocolManager1453.s(this.d);
        }
        try {
            if (this.x == null) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager1058.a(customSystemException);
        }
        return this.x.u();
    }

    public static int i() {
        return e;
    }

    public Object f() {
        block7: {
            block8: {
                try {
                    try {
                        if (GeometryCalculator.C() < 35) break block7;
                        if (this.d != null) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager1058.a(customSystemException);
                    }
                    return null;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager1058.a(customSystemException);
                }
            }
            return this.d.M();
        }
        try {
            if (this.x == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager1058.a(customSystemException);
        }
        return this.x.M();
    }

    public static void c(int n) {
        e = n;
    }

    public boolean o(TransactionValidator1298 transactionValidator1298) {
        return this.x.equals(transactionValidator1298);
    }

    public void u(TransactionOrchestrator1017 transactionOrchestrator1017, Object object, int n) {
        block5: {
            try {
                if (GeometryCalculator.C() < 35 || !transactionOrchestrator1017.B(ReflectionMetadataResolver.bJ)) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager1058.a(customSystemException);
            }
            DataTransformationService1284 dataTransformationService1284 = new DataTransformationService1284(transactionOrchestrator1017.M());
            Map map = dataTransformationService1284.D();
            try {
                if (map.containsKey(this.d.M())) {
                    map.remove(this.d.M());
                    dataTransformationService1284.k(true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager1058.a(customSystemException);
            }
        }
        TemporalMetadataResolver.h.u().Gk.E(this.f(), transactionOrchestrator1017.M(), object, n);
    }

    public boolean l() {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block4;
                            if (this.d.a()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationManager1058.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager1058.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return this.x.D();
    }
}

