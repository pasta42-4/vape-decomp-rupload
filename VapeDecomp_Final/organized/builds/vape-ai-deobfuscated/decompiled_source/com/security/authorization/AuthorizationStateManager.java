/*
 * Decompiled with CFR 0.152.
 */
package com.security.authorization;

import a.Bj;
import com.app.utils.RandomGenerationUtility;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.state.GameStateTracker;
import com.indexing.metadata.MetadataIndexingService;
import com.network.configuration.NetworkConfigManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.security.auth.AuthenticationTokenGenerator268;
import com.security.cipher.CryptographicTransformer1102;
import com.security.crypto.SymmetricEncryptionProvider;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AuthorizationStateManager
implements Bj {
    private boolean N = false;
    private static final Map d;
    private final GameStateTracker X;
    private boolean H = false;
    private final NetworkConfigManager o = new NetworkConfigManager();
    private int m = -1;
    private static final long a;
    private static final Integer[] c;
    private static final long[] b;
    private int r = 0;

    @Override
    public boolean I() {
        return this.H;
    }

    @Override
    public AuthenticationTokenGenerator268 h() {
        return this.X;
    }

    public int U() {
        return this.m;
    }

    @Override
    public void I(Bj bj) {
        try {
            if (bj instanceof AuthorizationStateManager) {
                this.m = ((AuthorizationStateManager)bj).U();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthorizationStateManager.a(customSystemException);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void P() {
        block41: {
            var1_1 = AuthorizationStateManager.a ^ 104040752350264L;
            if (this.m == -1) {
                block42: {
                    var3_2 = GameStateTracker.S(this.X);
                    try {
                        if (var3_2 == -1) {
                            this.H = true;
                            return;
                        }
                    }
                    catch (CustomSystemException v0) {
                        throw AuthorizationStateManager.a(v0);
                    }
                    this.m = ApplicationLifecycleManager.U().l().v();
                    ApplicationLifecycleManager.U().l().A(var3_2);
                    this.o.m();
                    var4_3 = TemporalMetadataResolver.h.U().K(MetadataIndexingService.class);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (!DynamicContextBroker.H()) break block41;
                                            if (!var4_3.Z()) break block42;
                                        }
                                        catch (CustomSystemException v1) {
                                            throw AuthorizationStateManager.a(v1);
                                        }
                                        if (!var4_3.G()) break block42;
                                    }
                                    catch (CustomSystemException v2) {
                                        throw AuthorizationStateManager.a(v2);
                                    }
                                    if (!CryptographicTransformer1102.A()) break block42;
                                }
                                catch (CustomSystemException v3) {
                                    throw AuthorizationStateManager.a(v3);
                                }
                                if (!var4_3.q().y()) break block41;
                            }
                            catch (CustomSystemException v4) {
                                throw AuthorizationStateManager.a(v4);
                            }
                            if (var4_3.q().I()) break block41;
                        }
                        catch (CustomSystemException v5) {
                            throw AuthorizationStateManager.a(v5);
                        }
                        this.r = (int)AuthorizationStateManager.a("h", (int)26040, (long)(6929943260188373093L ^ var1_1));
                        break block41;
                    }
                    catch (CustomSystemException v6) {
                        throw AuthorizationStateManager.a(v6);
                    }
                }
                this.r = (int)AuthorizationStateManager.a("h", (int)29264, (long)(6987990670091282316L ^ var1_1));
            }
        }
        try {
            switch (this.r) {
                case 0: {
                    CryptographicTransformer1102.g();
                    ++this.r;
                    return;
                }
                case 1: {
                    CryptographicTransformer1102.C();
                    this.o.m();
                    ++this.r;
                    return;
                }
                case 2: {
                    try {
                        if (this.X.C().s().booleanValue() && !this.N) {
                        }
                        ** GOTO lbl98
                    }
                    catch (CustomSystemException v7) {
                        throw AuthorizationStateManager.a(v7);
                    }
                    var3_2 = (int)this.o.m(RandomGenerationUtility.H(this.X.m()));
                    if (!(this.X instanceof SymmetricEncryptionProvider)) ** GOTO lbl91
                    var4_3 = ApplicationLifecycleManager.U();
                    var5_4 = var4_3.f();
                    try {
                        if (var4_3.r() && var5_4.r()) {
                        }
                        ** GOTO lbl91
                    }
                    catch (CustomSystemException v8) {
                        throw AuthorizationStateManager.a(v8);
                    }
                    var6_5 = var4_3.f().M();
                    try {
                        try {
                            if (!var6_5.r() || !var6_5.B(ReflectionMetadataResolver.Pr)) {
                            }
                            ** GOTO lbl90
                        }
                        catch (CustomSystemException v9) {
                            throw AuthorizationStateManager.a(v9);
                        }
                        if (var5_4.B()) {
                        }
                        ** GOTO lbl91
                    }
                    catch (CustomSystemException v10) {
                        throw AuthorizationStateManager.a(v10);
                    }
lbl90:
                    // 2 sources

                    var3_2 = 1;
lbl91:
                    // 4 sources

                    try {
                        if (var3_2 == 0) return;
                        this.N = true;
                        this.r = 0;
                        return;
                    }
                    catch (CustomSystemException v11) {
                        throw AuthorizationStateManager.a(v11);
                    }
lbl98:
                    // 1 sources

                    ++this.r;
                    return;
                }
                case 3: {
                    try {
                        if (this.o.m(RandomGenerationUtility.H(this.X.F()) - 2) == false) return;
                        ++this.r;
                        return;
                    }
                    catch (CustomSystemException v12) {
                        throw AuthorizationStateManager.a(v12);
                    }
                }
                case 4: {
                    ApplicationLifecycleManager.U().l().A(this.m);
                    this.H = true;
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException v13) {
            throw AuthorizationStateManager.a(v13);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AuthorizationStateManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public AuthorizationStateManager(GameStateTracker gameStateTracker) {
        this.X = gameStateTracker;
    }

    @Override
    public void V() {
        this.H = true;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Bs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void b(int n) {
        this.m = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-5181956192776433115L, -3829272262815228501L, MethodHandles.lookup().lookupClass()).a(220943603575936L);
        d = new HashMap(13);
        long l = a ^ 0x131325217D73L;
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
        String string = " \u001f\u00e1n\u00c5\u00e1L \u00a6\u001a/\u009bB9\u00d6\"";
        int n2 = " \u001f\u00e1n\u00c5\u00e1L \u00a6\u001a/\u009bB9\u00d6\"".length();
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C7E;
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
                throw new RuntimeException("a/Bs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AuthorizationStateManager.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AuthorizationStateManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

