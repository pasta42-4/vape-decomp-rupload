/*
 * Decompiled with CFR 0.152.
 */
package com.network.clustering;

import a.V3;
import a._Y;
import a.a;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.transaction.TransactionValidator2680;
import com.app.utils.RandomGenerationUtility;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.comparison.numeric.NumericOrderingComparator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatcherRegistry1993;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.graphics.rendering.RenderEngine;
import com.math.geometry.GeometryCalculator;
import com.navigation.routing.NavigationPathfinder;
import com.network.configuration.NetworkConfigManager;
import com.network.streaming.DataStreamProcessor1233;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.allocation.MultiResourceAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicContextManager895;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.ResourceAllocator1606;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ClusterNodeCoordinator
extends ContextualExecutionFramework
implements TransactionValidator2680 {
    private int w;
    private ArrayList<Integer> T;
    private final int[] l;
    private NetworkConfigManager o;
    private final int[] b;
    private final AuthenticationStateTracker P;
    private static final Map x;
    private final NetworkConfigManager A;
    boolean B;
    private final AuthenticationStateTracker Z;
    private NetworkConfigManager N;
    private final NetworkConfigManager n;
    private final int[] r;
    private boolean Y;
    private static final long e;
    private final NumericFormattingUtility h;
    boolean O;
    private final int[] t;
    private boolean z;
    private static final Integer[] v;
    private final ColorPaletteManager d;
    private static final Object[] F;
    private static final long[] m;
    private static final String[] G;
    private final AuthenticationStateTracker j;
    private final AuthenticationStateTracker V;
    private MultiResourceAllocator X;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ClusterNodeCoordinator.e = MultiContainerRegistry.a(3125455474308298043L, 7021223865263083444L, MethodHandles.lookup().lookupClass()).a(28761978465435L);
                ClusterNodeCoordinator.F = new Object[5];
                ClusterNodeCoordinator.G = new String[5];
                ClusterNodeCoordinator.a();
                ClusterNodeCoordinator.x = new HashMap<K, V>(13);
                var0 = ClusterNodeCoordinator.e ^ 108019828972386L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "?\u000fUU}\u0095\u0085\u00bd\u00fd\u00b0\u00c8qu\u00cf\u00f1\u0087H\u00a2\f7\u00df\u00fcH\u00cek\u00af\u0001R\u008arP\u0090\u0085\u00c77^\u0006\u00b8h5\u00ff\u00e7\u00e8\u007f}\u00d4^\u00c6\u0007\u0000\u00e0\u00da\u0098\u00c2N\u00f7\u008c@-f[\tLzT\u00c3\u00c0\u00fd\u0017\u00b6\u001cL\u00d5\u0083G\u00f2\u00b0\u00cc\u0011\u00a8ZF\u0086\u0082\u0002f\u008f~\f\u00e9]\u00a3\u00f6q#\u001a\u009c%\u00851\u00f5@\u00d5b\u00c1\u00d5SX\u00db?\u00f4\u00b0}\u00af'4\u00b1\u008a@\u001e\u00fc\u00db\u00ebE\u00bf\u00ab\u0094\u00d4w[j\u0012\u00a4\u008de^\u00c5\u00cf?\u009a\u00adZ\u00fd\u00ed";
                var7_6 = "?\u000fUU}\u0095\u0085\u00bd\u00fd\u00b0\u00c8qu\u00cf\u00f1\u0087H\u00a2\f7\u00df\u00fcH\u00cek\u00af\u0001R\u008arP\u0090\u0085\u00c77^\u0006\u00b8h5\u00ff\u00e7\u00e8\u007f}\u00d4^\u00c6\u0007\u0000\u00e0\u00da\u0098\u00c2N\u00f7\u008c@-f[\tLzT\u00c3\u00c0\u00fd\u0017\u00b6\u001cL\u00d5\u0083G\u00f2\u00b0\u00cc\u0011\u00a8ZF\u0086\u0082\u0002f\u008f~\f\u00e9]\u00a3\u00f6q#\u001a\u009c%\u00851\u00f5@\u00d5b\u00c1\u00d5SX\u00db?\u00f4\u00b0}\u00af'4\u00b1\u008a@\u001e\u00fc\u00db\u00ebE\u00bf\u00ab\u0094\u00d4w[j\u0012\u00a4\u008de^\u00c5\u00cf?\u009a\u00adZ\u00fd\u00ed".length();
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
                    var6_5 = "\u0011k\u0089^hyoo\u00854\u00ec\u00f3N\u00fag\u00a4";
                    var7_6 = "\u0011k\u0089^hyoo\u00854\u00ec\u00f3N\u00fag\u00a4".length();
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
        ClusterNodeCoordinator.m = var8_3;
        ClusterNodeCoordinator.v = new Integer[20];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ClusterNodeCoordinator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ClusterNodeCoordinator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ClusterNodeCoordinator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void G(RenderEngine renderEngine) {
        long l = e ^ 0x32249ADC6ECDL;
        NavigationPathfinder navigationPathfinder = renderEngine.o();
        for (int i = 0; i < navigationPathfinder.c(); ++i) {
            LightweightExecutionContext lightweightExecutionContext = navigationPathfinder.s(i);
            try {
                try {
                    try {
                        if (lightweightExecutionContext.Y() || lightweightExecutionContext.toString().contains((CharSequence)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)12962, (long)(0x7992F2FBB944E138L ^ l)), (long)-5546725145892232304L, (long)l)))) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClusterNodeCoordinator.a(customSystemException);
                    }
                    if (this.d.b(lightweightExecutionContext, true)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
            try {
                try {
                    if (lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl) && this.o(lightweightExecutionContext)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
            this.T.add(i);
        }
    }

    private boolean b() {
        long l = e ^ 0x410F2A094B71L;
        ResourceAllocator1606 resourceAllocator1606 = ApplicationLifecycleManager.U().t();
        for (int i = 9; i <= 44; ++i) {
            LightweightExecutionContext lightweightExecutionContext = resourceAllocator1606.T(i).y();
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.toString().contains((CharSequence)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)28377, (long)(0x89FC0CA8E8E18FCL ^ l)), (long)-7585642914562652628L, (long)l)))) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
        }
        return true;
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "??B";
        objectArray[1] = Integer.TYPE;
        ClusterNodeCoordinator.G[1] = "java/lang/Integer";
        objectArray[2] = "zuu\u0019&pqzdV[hb}m\u001f";
        objectArray[3] = "61o\u0013\u0016B=>~\\wL65z\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "vj-y\u001f^$k3I\u001a\u001c\u0019j1;\u001c\u0003vtu;q^{z!#\u0012\t)kwI";
    }

    private boolean o(LightweightExecutionContext lightweightExecutionContext) {
        block13: {
            try {
                if (!lightweightExecutionContext.C().r() || !lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
            DataStreamProcessor1233 dataStreamProcessor1233 = new DataStreamProcessor1233(lightweightExecutionContext.C().M());
            for (Object e : dataStreamProcessor1233.Q(lightweightExecutionContext)) {
                V3 v3 = new V3(e);
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    try {
                                        if (v3.n() == 19 || v3.n() == 7) break block14;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ClusterNodeCoordinator.a(customSystemException);
                                    }
                                    if (v3.n() == 2) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ClusterNodeCoordinator.a(customSystemException);
                                }
                                if (v3.n() == 18) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ClusterNodeCoordinator.a(customSystemException);
                            }
                            if (v3.n() != 15) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ClusterNodeCoordinator.a(customSystemException);
                        }
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
        }
        return false;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (G[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 25;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 47;
                break;
            }
            case 4: {
                n3 = 49;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 16;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 51;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 30;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 58;
                break;
            }
            case 17: {
                n3 = 33;
                break;
            }
            case 18: {
                n3 = 2;
                break;
            }
            case 19: {
                n3 = 59;
                break;
            }
            case 20: {
                n3 = 27;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 22;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 9;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 55;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 11;
                break;
            }
            case 30: {
                n3 = 38;
                break;
            }
            case 31: {
                n3 = 60;
                break;
            }
            case 32: {
                n3 = 61;
                break;
            }
            case 33: {
                n3 = 6;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 14;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 28;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 42;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 12;
                break;
            }
            case 45: {
                n3 = 37;
                break;
            }
            case 46: {
                n3 = 19;
                break;
            }
            case 47: {
                n3 = 39;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 34;
                break;
            }
            case 51: {
                n3 = 8;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 41;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 7;
                break;
            }
            case 56: {
                n3 = 10;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 21;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 46;
                break;
            }
            default: {
                n3 = 17;
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
        ClusterNodeCoordinator.G[n4] = new String(cArray);
        return n4;
    }

    public ClusterNodeCoordinator() {
        long l = e ^ 0x6B4AE97D02C3L;
        super(a.cs((int)ClusterNodeCoordinator.a("f", (int)26824, (long)(0x2CD7BB690528D75BL ^ l))), -208, RecursiveNodeGraph.k, a.cs((int)ClusterNodeCoordinator.a("f", (int)30321, (long)(0x57AA000EF9E349EFL ^ l))));
        this.V = AuthenticationStateTracker.R(this, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)1482, (long)(0x579A10129EE93A5FL ^ l)), (long)-2375565582272786530L, (long)l)), false, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)26869, (long)(0x15B019705D1D5763L ^ l)), (long)-2375565582272786530L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)9865, (long)(0x31511540E9D79919L ^ l)), (long)-2375565582272786530L, (long)l)), false, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)28126, (long)(0x5880AD1E81DED247L ^ l)), (long)-2375565582272786530L, (long)l)));
        this.P = AuthenticationStateTracker.R(this, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)22297, (long)(0x681073DEB99D6882L ^ l)), (long)-2375565582272786530L, (long)l)), false, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)13863, (long)(0x4D4957D165FC09B8L ^ l)), (long)-2375565582272786530L, (long)l)));
        this.j = AuthenticationStateTracker.R(this, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)6918, (long)(0xDE347CD9260A49EL ^ l)), (long)-2375565582272786530L, (long)l)), false, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)32716, (long)(0x47D75447FF724050L ^ l)), (long)-2375565582272786530L, (long)l)));
        this.h = NumericFormattingUtility.y(this, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)3016, (long)(0x350F1E28AA2BB459L ^ l)), (long)-2375565582272786530L, (long)l)), (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)16860, (long)(0x79BEE64E3736FE5AL ^ l)), (long)-2375565582272786530L, (long)l)), "", 50.0, 150.0, 200.0, 300.0, 5.0);
        this.d = ColorPaletteManager.o(this, (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)21650, (long)(0x116C36B9FC65EB00L ^ l)), (long)-2375565582272786530L, (long)l)), (String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)30767, (long)(0x7AB4EA5B2CECC7AAL ^ l)), (long)-2375565582272786530L, (long)l)), ColorPaletteManager.g, Collections.emptyList());
        this.A = new NetworkConfigManager();
        this.O = false;
        this.B = false;
        this.w = -1;
        this.T = new ArrayList();
        this.X = new MultiResourceAllocator(this);
        this.n = new NetworkConfigManager();
        this.Y = false;
        this.N = new NetworkConfigManager();
        this.o = new NetworkConfigManager();
        this.N(this.V, this.Z, this.P, this.j, this.h, this.d);
        if (GeometryCalculator.C() >= 35) {
            this.b = new int[]{633, 629, 625, 641, 645, 637};
            this.t = new int[]{623, 627, 631, 635, 639, 643};
            this.l = new int[]{622, 630, 626, 634, 638, 642};
            this.r = new int[]{624, 632, 628, 636, 640, 644};
        } else {
            this.b = new int[]{313, 309, 317, 305, 301};
            this.t = new int[]{311, 307, 315, 303, 299};
            this.l = new int[]{310, 306, 314, 302, 298};
            this.r = new int[]{312, 308, 316, 304, 300};
        }
    }

    private void g() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClusterNodeCoordinator.a(customSystemException);
        }
        for (int i = 0; i < 45; ++i) {
            LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(i).y();
            try {
                try {
                    if (lightweightExecutionContext.Y() || lightweightExecutionContext.C().Y()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
            this.X.G(lightweightExecutionContext, -1);
        }
    }

    static int f(ClusterNodeCoordinator clusterNodeCoordinator, LightweightExecutionContext lightweightExecutionContext) {
        return clusterNodeCoordinator.d(lightweightExecutionContext);
    }

    private boolean X(RenderEngine renderEngine) {
        boolean bl;
        block15: {
            block14: {
                long l = e ^ 0x2DEEC7E1ADAEL;
                NavigationPathfinder navigationPathfinder = renderEngine.o();
                String string = renderEngine.H();
                if (GeometryCalculator.C() >= 35) {
                    boolean bl2;
                    block12: {
                        block11: {
                            String string2 = CryptographicContextManager895.I((String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)24761, (long)(0x9A10E728D39F050L ^ l)), (long)8098893885543031027L, (long)l)), new Object[0]).i().toLowerCase();
                            String string3 = CryptographicContextManager895.I((String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)17693, (long)(0x68C97747EBE6D5F7L ^ l)), (long)8098893885543031027L, (long)l)), new Object[0]).i().toLowerCase();
                            try {
                                try {
                                    if (!string.equalsIgnoreCase(string2) && !string.equalsIgnoreCase(string3)) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ClusterNodeCoordinator.a(customSystemException);
                                }
                                bl2 = true;
                                break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ClusterNodeCoordinator.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                String string4 = CryptographicContextManager895.I((String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)4215, (long)(0x241F44598CE30080L ^ l)), (long)8098893885543031027L, (long)l)), new Object[0]).u().toLowerCase();
                String string5 = CryptographicContextManager895.I((String)((Object)ClusterNodeCoordinator.c("\u00fc", (int)ClusterNodeCoordinator.a("f", (int)17148, (long)(0x42C5E1320DAC520CL ^ l)), (long)8098893885543031027L, (long)l)), new Object[0]).u().toLowerCase();
                try {
                    block13: {
                        try {
                            try {
                                if (!navigationPathfinder.o() || string.equalsIgnoreCase(string4)) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ClusterNodeCoordinator.a(customSystemException);
                            }
                            if (!string.equalsIgnoreCase(string5)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ClusterNodeCoordinator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ClusterNodeCoordinator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = ClusterNodeCoordinator.a(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = G[n];
                int n3 = string2.indexOf(8);
                clazz3 = ClusterNodeCoordinator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ClusterNodeCoordinator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ClusterNodeCoordinator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ClusterNodeCoordinator.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ClusterNodeCoordinator.b(280848268059839L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ClusterNodeCoordinator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ClusterNodeCoordinator.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ClusterNodeCoordinator.b(280848268059839L, 0L);
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

    @DataExchangeProtocol2090
    public void J(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block55: {
            RenderEngine renderEngine;
            block54: {
                block53: {
                    block50: {
                        block51: {
                            block52: {
                                block49: {
                                    block48: {
                                        block47: {
                                            try {
                                                try {
                                                    if (!TemporalMetadataResolver.h.U().Z(ClusterNodeCoordinator.class) && !TemporalMetadataResolver.h.a().p()) break block47;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ClusterNodeCoordinator.a(customSystemException);
                                                }
                                                this.O = false;
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ClusterNodeCoordinator.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (!ApplicationLifecycleManager.X().Y() && ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.P)) break block48;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ClusterNodeCoordinator.a(customSystemException);
                                            }
                                            this.B();
                                            return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ClusterNodeCoordinator.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.c().Y()) break block49;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ClusterNodeCoordinator.a(customSystemException);
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ClusterNodeCoordinator.a(customSystemException);
                                    }
                                }
                                try {
                                    if (_Y.g().r()) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ClusterNodeCoordinator.a(customSystemException);
                                }
                                try {
                                    if (!this.N.m(150L)) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ClusterNodeCoordinator.a(customSystemException);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!this.B) break block50;
                                                if (!this.A.m(RandomGenerationUtility.H(this.h) + 200)) break block51;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ClusterNodeCoordinator.a(customSystemException);
                                            }
                                            if (!this.n.m(RandomGenerationUtility.H(this.h) + 200)) break block51;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ClusterNodeCoordinator.a(customSystemException);
                                        }
                                        if (!ApplicationLifecycleManager.X().r()) break block52;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ClusterNodeCoordinator.a(customSystemException);
                                    }
                                    ApplicationLifecycleManager.U().E();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ClusterNodeCoordinator.a(customSystemException);
                                }
                            }
                            this.B();
                        }
                        return;
                    }
                    renderEngine = new RenderEngine(ApplicationLifecycleManager.X());
                    try {
                        try {
                            if (!this.V.s().booleanValue() || this.X(renderEngine)) break block53;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ClusterNodeCoordinator.a(customSystemException);
                        }
                        this.B();
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClusterNodeCoordinator.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (this.P.s().booleanValue() || !this.b()) break block54;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClusterNodeCoordinator.a(customSystemException);
                    }
                    this.B = true;
                    this.A.m();
                    this.n.m();
                    this.O = false;
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            try {
                if (!this.Y) {
                    this.Z();
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
            if (!this.T.isEmpty()) {
                int n = this.T.get(0);
                int n2 = this.C(this.w, n);
                try {
                    if (!this.A.m(RandomGenerationUtility.H(this.h) + n2) || !this.n.m(RandomGenerationUtility.H(this.h) + 100)) break block55;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
                this.O = true;
                this.w = n;
                ResourceLifecycleManager1543 resourceLifecycleManager1543 = renderEngine.R().T(n);
                try {
                    if (resourceLifecycleManager1543.H()) {
                        this.z = true;
                        this.o.m();
                        ApplicationLifecycleManager.n().e(renderEngine.R().D(), n, 0, 1, ApplicationLifecycleManager.U());
                        this.z = false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
                this.A.m();
                this.T.remove(0);
            } else {
                try {
                    this.O = false;
                    if (!this.P.s().booleanValue()) {
                        this.B = true;
                        this.A.m();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
                this.w = -1;
            }
        }
    }

    private void B() {
        this.n.m();
        this.A.m();
        this.T.clear();
        this.B = false;
        this.w = -1;
        this.O = false;
        this.Y = false;
    }

    @DataExchangeProtocol2090
    public void Z(EventDispatcherRegistry1993 eventDispatcherRegistry1993) {
        block4: {
            block5: {
                try {
                    try {
                        if (this.z) break block4;
                        if (this.o.m(100L)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClusterNodeCoordinator.a(customSystemException);
                    }
                    eventDispatcherRegistry1993.setCanceled(true);
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            this.N.m();
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00ea' || c == '\u00fb' || c == '\u00c8') {
                field = ClusterNodeCoordinator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ClusterNodeCoordinator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ClusterNodeCoordinator.a(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                ClusterNodeCoordinator.F[n] = clazz = Class.forName(G[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int C(int n, int n2) {
        int n3 = n2 % 9;
        int n4 = (n2 - n3) / 9;
        int n5 = n % 9;
        int n6 = (n - n5) / 9;
        double d2 = _Y.y(n3, n4, n5, n6);
        if (d2 < 3.0) {
            d2 = 0.0;
        }
        return (int)(d2 * 30.0);
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

    @Override
    public boolean I() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.O) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClusterNodeCoordinator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClusterNodeCoordinator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ClusterNodeCoordinator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ClusterNodeCoordinator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x609D;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])x.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    x.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ClusterNodeCoordinator.v[n2] = n3;
        }
        return v[n2];
    }

    /*
     * Loose catch block
     */
    private void Z() {
        block24: {
            block28: {
                RenderEngine renderEngine;
                block25: {
                    this.n.m();
                    this.A.m();
                    this.T.clear();
                    this.X.u();
                    renderEngine = new RenderEngine(ApplicationLifecycleManager.X());
                    if (!this.Z.s().booleanValue()) break block25;
                    NavigationPathfinder navigationPathfinder = renderEngine.o();
                    for (int i = 0; i < navigationPathfinder.c(); ++i) {
                        block23: {
                            LightweightExecutionContext lightweightExecutionContext;
                            block27: {
                                block26: {
                                    block22: {
                                        lightweightExecutionContext = navigationPathfinder.s(i);
                                        if (lightweightExecutionContext.Y()) continue;
                                        try {
                                            if (this.d.b(lightweightExecutionContext, true)) {
                                                continue;
                                            }
                                            break block22;
                                            catch (Exception exception) {
                                                throw ClusterNodeCoordinator.a(exception);
                                            }
                                        }
                                        catch (Exception exception) {
                                            throw ClusterNodeCoordinator.a(exception);
                                        }
                                    }
                                    if (this.X.G(lightweightExecutionContext, i)) continue;
                                    if (!lightweightExecutionContext.C().r()) continue;
                                    break block26;
                                    catch (Exception exception) {
                                        throw ClusterNodeCoordinator.a(exception);
                                    }
                                }
                                if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl)) break block23;
                                break block27;
                                catch (Exception exception) {
                                    throw ClusterNodeCoordinator.a(exception);
                                }
                            }
                            try {
                                if (this.o(lightweightExecutionContext)) {
                                    continue;
                                }
                                break block23;
                                catch (Exception exception) {
                                    throw ClusterNodeCoordinator.a(exception);
                                }
                            }
                            catch (Exception exception) {
                                throw ClusterNodeCoordinator.a(exception);
                            }
                        }
                        this.T.add(i);
                    }
                    break block28;
                }
                this.G(renderEngine);
            }
            try {
                if (this.Z.s().booleanValue()) {
                    this.g();
                    this.T.addAll(this.X.C());
                }
            }
            catch (Exception exception) {
                throw ClusterNodeCoordinator.a(exception);
            }
            try {
                if (!this.j.s().booleanValue() || !this.j.s().booleanValue()) break block24;
            }
            catch (Exception exception) {
                throw ClusterNodeCoordinator.a(exception);
            }
            Collections.shuffle(this.T);
            try {
                this.T.sort(new NumericOrderingComparator(this.w));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.Y = true;
    }

    private static Field c(long l, long l2) {
        int n = ClusterNodeCoordinator.a(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = G[n];
            int n2 = string.indexOf(8);
            Class clazz = ClusterNodeCoordinator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ClusterNodeCoordinator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ClusterNodeCoordinator.a(clazz3, string2, clazz2)) != null) {
                    ClusterNodeCoordinator.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ClusterNodeCoordinator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ClusterNodeCoordinator.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ClusterNodeCoordinator.b(280848268059839L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int d(LightweightExecutionContext lightweightExecutionContext) {
        int n = lightweightExecutionContext.C().O();
        for (int n2 : this.b) {
            try {
                if (n != n2) continue;
                return 8;
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
        }
        for (int n2 : this.r) {
            try {
                if (n != n2) continue;
                return 7;
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
        }
        for (int n2 : this.t) {
            try {
                if (n != n2) continue;
                return 6;
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
        }
        for (int n2 : this.l) {
            try {
                if (n != n2) continue;
                return 5;
            }
            catch (CustomSystemException customSystemException) {
                throw ClusterNodeCoordinator.a(customSystemException);
            }
        }
        return -1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ClusterNodeCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ClusterNodeCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

