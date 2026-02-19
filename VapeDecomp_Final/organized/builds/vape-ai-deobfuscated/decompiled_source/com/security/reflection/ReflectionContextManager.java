/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.reflection;

import a.C_;
import a.JF;
import a.T1;
import a.bE;
import a.hr;
import com.app.cache.validation.CacheValidationStrategy;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.network.CommunicationProtocolAdapter2306;
import com.app.security.authorization.PermissionAuthorizationStrategy;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.config.RenderConfigurationManager1114;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.network.configuration.NetworkConfigurationManager1825;
import com.network.socket.SocketCommunicationHandler;
import com.network.transformation.ChannelDataTransformer;
import com.runtime.orchestration.ComplexSystemOrchestrator;
import com.security.configuration.SecurityEnumRegistry;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;
import java.awt.Point;
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
import org.jetbrains.annotations.Nullable;

public class ReflectionContextManager
extends RenderConfigurationManager1114 {
    private static final Integer[] eb;
    private static String[] mm;
    private CipherContextManager1101 ms;
    private static final long ab;
    private JF ml;
    private final GraphicalRenderEngine1082 ma;
    private static final long[] bb;
    private final hr mh;
    private CryptographicSecurityManager396 mp;
    private static final String[] ob;
    private final bE mq;
    private static final Map fb;
    private ComplexSystemOrchestrator mr;
    private String m_;
    private boolean mi;
    private static final Object[] lb;
    private final ColorPaletteRenderer mb;

    private void D(Point point, SecurityEnumRegistry securityEnumRegistry) {
        this.mr = new ComplexSystemOrchestrator(this.ml);
        this.ms = GraphicalRenderingController.v(this, this.mr, CipherContextManager1101.class);
        this.mr.I().N(new SocketCommunicationHandler(this));
    }

    private void lambda$leaveAction$2(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        SecureContextBroker572.h().c().O(ReflectionContextManager::lambda$null$0, this::lambda$null$1);
    }

    private static void lambda$leaveAction$4(T1 t1) {
    }

    private static Method l(long l, long l2) {
        int n = ReflectionContextManager.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ob[n];
                int n3 = string2.indexOf(8);
                clazz3 = ReflectionContextManager.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionContextManager.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionContextManager.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionContextManager.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionContextManager.j(235029927961667L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionContextManager.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionContextManager.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionContextManager.j(235029927961667L, 0L);
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

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ReflectionContextManager.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionContextManager.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field k(long l, long l2) {
        int n = ReflectionContextManager.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = ob[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionContextManager.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionContextManager.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionContextManager.e(clazz3, string2, clazz2)) != null) {
                    ReflectionContextManager.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionContextManager.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionContextManager.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionContextManager.j(235029927961667L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "C\n&";
        objectArray[1] = Integer.TYPE;
        ReflectionContextManager.ob[1] = "java/lang/Integer";
        objectArray[2] = "!%j\"\\>**{m!&9-r$";
        objectArray[3] = "peJ;\u0004I{j[teGpa_.";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ":]\u001f\u0011K!2\bIk]dPO\\ROa4ANP6&2B\u001f\u0017Go3KMk";
    }

    static ComplexSystemOrchestrator J(ReflectionContextManager reflectionContextManager, ComplexSystemOrchestrator complexSystemOrchestrator) {
        reflectionContextManager.mr = complexSystemOrchestrator;
        return reflectionContextManager.mr;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionContextManager.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void y() {
        block5: {
            block6: {
                long l = ab ^ 0x5A53982AED8FL;
                try {
                    if (this.mi) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionContextManager.a(customSystemException);
                }
                try {
                    this.mi = true;
                    if (this.ml == null) break block5;
                    if (!this.ml.R().equals(TemporalMetadataResolver.h.O().n())) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionContextManager.a(customSystemException);
                }
                C_ c_ = new C_((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)15428, (long)(0x2682BB31471581A1L ^ l)), (long)-8704863214216582116L, (long)l)), (String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)22692, (long)(0xF130A79A219E54BL ^ l)), (long)-8704863214216582116L, (long)l)), (String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)22511, (long)(0x5438E53192356A0CL ^ l)), (long)-8704863214216582116L, (long)l)));
                NetworkConfigurationManager1825 networkConfigurationManager1825 = GraphicalRenderingController.v(this.V(), c_, NetworkConfigurationManager1825.class);
                c_.Z().N(() -> this.lambda$leaveAction$2(networkConfigurationManager1825));
                c_.u().N(() -> this.lambda$leaveAction$3(networkConfigurationManager1825));
                networkConfigurationManager1825.r(this.V(), networkConfigurationManager1825);
                break block5;
            }
            SecureContextBroker572.h().c().d(ReflectionContextManager::lambda$leaveAction$4, this::lambda$leaveAction$5);
        }
    }

    static CipherContextManager1101 K(ReflectionContextManager reflectionContextManager, CipherContextManager1101 cipherContextManager1101) {
        reflectionContextManager.ms = cipherContextManager1101;
        return reflectionContextManager.ms;
    }

    @Override
    public void E() {
        long l = ab ^ 0x1D9F293D0784L;
        try {
            if (this.ml == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionContextManager.a(customSystemException);
        }
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b() - 2.0, ReflectionContextManager.M.g.brighter());
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b() - 2.0, this.mb.k());
        float f = (float)(this.G() + 6.0);
        float f2 = (float)(this.W() + 4.0);
        StateTrackingCoordinator.B(ReflectionContextManager.M.Y, f, f2, (String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)11021, (long)(0x6A1F7A8805107CEAL ^ l)), (long)7870421648968943127L, (long)l)), 7.0f, 6.3f, false);
        StateTrackingCoordinator.B(ReflectionContextManager.M.Y, (float)(this.G() + this.w() - 22.0), (float)this.W() - 0.5f, (String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)544, (long)(0x6B4D6AF0D9FBD5CCL ^ l)), (long)7870421648968943127L, (long)l)), 14.5f, 14.5f, false);
        super.E();
    }

    private void lambda$leaveAction$3(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        this.mi = false;
    }

    public static String[] g() {
        return mm;
    }

    @Override
    public void d() {
        block15: {
            long l;
            block12: {
                block14: {
                    block13: {
                        boolean bl;
                        ReflectionContextManager reflectionContextManager;
                        l = ab ^ 0x73B98C80CAA9L;
                        try {
                            if (TemporalMetadataResolver.h.O() == null) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionContextManager.a(customSystemException);
                        }
                        try {
                            this.mb.C(this.s());
                            this.ml = TemporalMetadataResolver.h.O().p().Q();
                            reflectionContextManager = this;
                            bl = this.ml != null;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionContextManager.a(customSystemException);
                        }
                        try {
                            try {
                                reflectionContextManager.N(bl);
                                if (this.ml == null) break block12;
                                if (!this.ml.R().equals(TemporalMetadataResolver.h.O().n())) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionContextManager.a(customSystemException);
                            }
                            this.mh.z((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)10996, (long)(0x2ACA0DBD6B6303CL ^ l)), (long)-6911841335613109446L, (long)l)));
                            this.mh.g((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)2203, (long)(0x4CD8A453417F125BL ^ l)), (long)-6911841335613109446L, (long)l)));
                            this.mh.Y(23.0);
                            this.mh.T(23.0);
                            this.g((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)27858, (long)(0x7D45B5F8C027F61FL ^ l)), (long)-6911841335613109446L, (long)l)));
                            this.m_ = ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)27331, (long)(0x6193D755CF62F00CL ^ l)), (long)-6911841335613109446L, (long)l);
                            break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionContextManager.a(customSystemException);
                        }
                    }
                    this.mh.z((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)19952, (long)(0x1316F40080C5D736L ^ l)), (long)-6911841335613109446L, (long)l)));
                    this.mh.g((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)11667, (long)(0x31F434A4924FB757L ^ l)), (long)-6911841335613109446L, (long)l)));
                    this.g((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)196, (long)(0x79861F2934C49A10L ^ l)), (long)-6911841335613109446L, (long)l)));
                    this.mh.Y(18.0);
                    this.mh.T(18.0);
                    this.m_ = this.ml.R().j() + (String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)15600, (long)(0x3FB60D2A544B2632L ^ l)), (long)-6911841335613109446L, (long)l));
                }
                this.mp.Y(this.w() - 18.0 - this.mh.w() - 4.0);
                this.mp.a(this.w() - 18.0 - this.mh.w() - 6.0);
                this.mp.d(this.m_);
                break block15;
            }
            try {
                this.g((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)22394, (long)(0x4665B82960A14DBDL ^ l)), (long)-6911841335613109446L, (long)l)));
                if (this.ms != null) {
                    GraphicalRenderingController.z(this.ms);
                    this.mr = null;
                    this.ms = null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionContextManager.a(customSystemException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectionContextManager.ab = MultiContainerRegistry.a(4305792919871509458L, 429175583613410379L, MethodHandles.lookup().lookupClass()).a(225819755503563L);
                ReflectionContextManager.lb = new Object[5];
                ReflectionContextManager.ob = new String[5];
                ReflectionContextManager.x();
                ReflectionContextManager.fb = new HashMap<K, V>(13);
                var0 = ReflectionContextManager.ab ^ 92363652889409L;
                ReflectionContextManager.i(new String[1]);
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "/htQDB\u000f\u0088o\u00b8i#\u00ef\u0005\u00f0\u0082G\u00bfG\u0005Y\u0011\u00d6\u00d2\u00e2\u00d7\u0095\u00bc\u00a1I\u00fc\u00db\u00d37X\u0089\u00ef\u00c4\u00cc\u0083\u00f4y\b\u00cd\u00cb;\u0016[\u00df\u00d9\u0002\u000b\u001c\u00a1\u00f9\u00a4h\u001fzH\u0099\u00c8f\u0010\u00bc(\u00f9\u00ec\u00d5~Y\u00d5\u00f6\u00a9\u00eb\u009c\u00f7%m\n\u0096\u00bc+:\u00edyNjKK%mu\u00a4\u00af\u00fc\u00b7EoD\u0083[o\u00bd\u009d\u0004\u00e9=X\u00ef_\u00d0U\u00b0\u00bd\u0007x\u0018\u000fl";
                var7_6 = "/htQDB\u000f\u0088o\u00b8i#\u00ef\u0005\u00f0\u0082G\u00bfG\u0005Y\u0011\u00d6\u00d2\u00e2\u00d7\u0095\u00bc\u00a1I\u00fc\u00db\u00d37X\u0089\u00ef\u00c4\u00cc\u0083\u00f4y\b\u00cd\u00cb;\u0016[\u00df\u00d9\u0002\u000b\u001c\u00a1\u00f9\u00a4h\u001fzH\u0099\u00c8f\u0010\u00bc(\u00f9\u00ec\u00d5~Y\u00d5\u00f6\u00a9\u00eb\u009c\u00f7%m\n\u0096\u00bc+:\u00edyNjKK%mu\u00a4\u00af\u00fc\u00b7EoD\u0083[o\u00bd\u009d\u0004\u00e9=X\u00ef_\u00d0U\u00b0\u00bd\u0007x\u0018\u000fl".length();
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
                    var6_5 = "\u00c6\u00c1CDoa|\u0017\u0087\u00dc\u00e2\u00e5]\u0004j\u0086";
                    var7_6 = "\u00c6\u00c1CDoa|\u0017\u0087\u00dc\u00e2\u00e5]\u0004j\u0086".length();
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
        ReflectionContextManager.bb = var8_3;
        ReflectionContextManager.eb = new Integer[17];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3AD1;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionContextManager.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionContextManager.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionContextManager.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void G() {
        if (this.ms != null) {
            CipherSessionManager cipherSessionManager = this.V();
            this.ms.b(this.G());
            this.ms.M(cipherSessionManager.W() + cipherSessionManager.Q().b());
            double d2 = cipherSessionManager.b() - cipherSessionManager.Q().b() - 45.0;
            this.mr.K().B().P(d2);
            this.mr.K().B().i(d2);
            this.mr.K().B().A();
            this.ms.A();
        }
        this.mp.M(this.W() + 5.0);
    }

    public ReflectionContextManager() {
        long l = ab ^ 0x7CD4ED5004EBL;
        super(100.0, 16.0);
        this.ma = new GraphicalRenderEngine1082(23.0, 14.0);
        this.mq = new bE(18.0, 16.0);
        this.mh = new hr((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)27643, (long)(0x2BD78F9CE2D3F75L ^ l)), (long)7950607620077487480L, (long)l)), 0.6, ReflectionContextManager.M.O, ReflectionContextManager.M.b, 18.0, 8.0);
        this.mb = new ColorPaletteRenderer(0.15, new Color(150, 150, 150, 0), new Color(150, 150, 150, 20));
        this.mi = false;
        this.i(false);
        this.ma.i(false);
        this.ma.d().J(true);
        this.mp = new CryptographicSecurityManager396("", (String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)16774, (long)(0x6800C5FE78F0150FL ^ l)), (long)7950607620077487480L, (long)l)), 48.0, 0.8, ReflectionContextManager.M.c, true);
        this.mh.N(new CommunicationProtocolAdapter2306(this));
        this.mp.l(new PermissionAuthorizationStrategy(this));
        this.l(new CacheValidationStrategy(this));
        this.g((String)((Object)ReflectionContextManager.d("h", (int)ReflectionContextManager.c("j", (int)30216, (long)(0xEE2BD83165CA284L ^ l)), (long)7950607620077487480L, (long)l)));
        this.mh.q(false);
        this.mh.A(Color.WHITE);
        this.ma.o(this.mh);
        this.o(this.mq, this.mp, this.ma);
    }

    static void O(ReflectionContextManager reflectionContextManager, Point point, SecurityEnumRegistry securityEnumRegistry) {
        reflectionContextManager.D(point, securityEnumRegistry);
    }

    private void lambda$leaveAction$5() {
        this.mi = false;
    }

    public static void i(String[] stringArray) {
        mm = stringArray;
    }

    static CipherContextManager1101 f(ReflectionContextManager reflectionContextManager) {
        return reflectionContextManager.ms;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static void C(ReflectionContextManager reflectionContextManager) {
        reflectionContextManager.y();
    }

    private static void lambda$null$0(ChannelDataTransformer channelDataTransformer) {
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'F' || c == '\u00d8' || c == 'a' || c == 'r') {
                field = ReflectionContextManager.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionContextManager.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Nullable
    public ComplexSystemOrchestrator K() {
        return this.mr;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ob[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 27;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 21;
                break;
            }
            case 7: {
                n3 = 5;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 48;
                break;
            }
            case 10: {
                n3 = 39;
                break;
            }
            case 11: {
                n3 = 29;
                break;
            }
            case 12: {
                n3 = 49;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 24;
                break;
            }
            case 15: {
                n3 = 62;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 3;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 25;
                break;
            }
            case 22: {
                n3 = 37;
                break;
            }
            case 23: {
                n3 = 17;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 31;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 35;
                break;
            }
            case 30: {
                n3 = 45;
                break;
            }
            case 31: {
                n3 = 16;
                break;
            }
            case 32: {
                n3 = 51;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 0;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 11;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 19;
                break;
            }
            case 41: {
                n3 = 33;
                break;
            }
            case 42: {
                n3 = 8;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 59;
                break;
            }
            case 47: {
                n3 = 46;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 52;
                break;
            }
            case 50: {
                n3 = 38;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 1;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 13;
                break;
            }
            case 57: {
                n3 = 28;
                break;
            }
            case 58: {
                n3 = 58;
                break;
            }
            case 59: {
                n3 = 4;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 34;
                break;
            }
            case 62: {
                n3 = 60;
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
        ReflectionContextManager.ob[n4] = new String(cArray);
        return n4;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionContextManager.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionContextManager.lb[n] = clazz = Class.forName(ob[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionContextManager.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$null$1() {
        this.mi = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionContextManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ReflectionContextManager.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

