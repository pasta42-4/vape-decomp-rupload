/*
 * Decompiled with CFR 0.152.
 */
package com.integration.multimodal;

import com.app.rendering.graphics.VisualizationRenderer;
import com.app.security.AuthenticationTokenGenerator2316;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.sync.SynchronizationCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.negotiation.SecureProtocolNegotiator894;
import com.network.protocol.CommunicationProtocolAdapter2234;
import com.network.protocol.NetworkProtocolDefinition;
import com.network.state.NetworkStateManager;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.communication.SecureChannelNegotiator481;
import com.security.encoding.SecureMessageEncoder;
import com.security.session.CipherSessionManager;
import com.temporal.metadata.TemporalMetadataResolver;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MultimodalIntegrationFramework
extends CipherSessionManager
implements NetworkProtocolDefinition {
    private AdaptiveCipherEngine AC;
    private AdaptiveCipherEngine A1;
    private static final Map lb;
    private static final Integer[] fb;
    private boolean AI;
    private AdaptiveCipherEngine Ar;
    private static final Object[] qb;
    private static final String[] rb;
    private AdaptiveCipherEngine Aq;
    private VisualizationRenderer A5;
    private NetworkStateManager A4;
    private static final long ab;
    private static final long[] eb;

    @Override
    public String A() {
        long l = ab ^ 0x5354F96A182AL;
        return MultimodalIntegrationFramework.e("H", (int)MultimodalIntegrationFramework.d("e", (int)9583, (long)(0x5001C4664F99D07AL ^ l)), (long)4868459447328379888L, (long)l);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static AdaptiveCipherEngine H(MultimodalIntegrationFramework multimodalIntegrationFramework) {
        return multimodalIntegrationFramework.A1;
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "RP\r";
        objectArray[1] = Integer.TYPE;
        MultimodalIntegrationFramework.rb[1] = "java/lang/Integer";
        objectArray[2] = "{\r\u001a~\u0005(p\u0002\u000b1x0c\u0005\u0002x";
        objectArray[3] = "I$&\rLHB+7B-FI 3\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "oXDcW\u0013;V\u0017Y\u0007V\u0004\u0017\u00005\u001dN|\u0000F:l\u0014}\u0019K\"Q\u001deV\u0005Y";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultimodalIntegrationFramework.ab = MultiContainerRegistry.a(-2959300447640254204L, 3676431149674155028L, MethodHandles.lookup().lookupClass()).a(236688223923962L);
                MultimodalIntegrationFramework.qb = new Object[5];
                MultimodalIntegrationFramework.rb = new String[5];
                MultimodalIntegrationFramework.T();
                MultimodalIntegrationFramework.lb = new HashMap<K, V>(13);
                var0 = MultimodalIntegrationFramework.ab ^ 114484446256321L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00e4\u00d0.\u00b0S\u0094;\u00b7\u00e8\u00a3\u00b7\u00a3;\u00d8&\u0000\b\u00fal\u0081>\u00e0.\u0094";
                var7_6 = "\u00e4\u00d0.\u00b0S\u0094;\u00b7\u00e8\u00a3\u00b7\u00a3;\u00d8&\u0000\b\u00fal\u0081>\u00e0.\u0094".length();
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
                    var6_5 = "\u00a9\u0085\u0000[\u00cc\u00c8\u0002\u00f2pH6P\u0098\u009f\u00edR";
                    var7_6 = "\u00a9\u0085\u0000[\u00cc\u00c8\u0002\u00f2pH6P\u0098\u009f\u00edR".length();
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
        MultimodalIntegrationFramework.eb = var8_3;
        MultimodalIntegrationFramework.fb = new Integer[5];
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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
    public void i() {
    }

    private static Field o(long l, long l2) {
        int n = MultimodalIntegrationFramework.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = MultimodalIntegrationFramework.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultimodalIntegrationFramework.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultimodalIntegrationFramework.g(clazz3, string2, clazz2)) != null) {
                    MultimodalIntegrationFramework.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultimodalIntegrationFramework.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultimodalIntegrationFramework.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultimodalIntegrationFramework.n(261710302838721L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static AdaptiveCipherEngine M(MultimodalIntegrationFramework multimodalIntegrationFramework) {
        return multimodalIntegrationFramework.AC;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static NetworkStateManager l(MultimodalIntegrationFramework multimodalIntegrationFramework) {
        return multimodalIntegrationFramework.A4;
    }

    static AdaptiveCipherEngine l(MultimodalIntegrationFramework multimodalIntegrationFramework) {
        return multimodalIntegrationFramework.Aq;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = MultimodalIntegrationFramework.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultimodalIntegrationFramework.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3685;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultimodalIntegrationFramework.fb[n2] = n3;
        }
        return fb[n2];
    }

    public MultimodalIntegrationFramework() {
        long l = ab ^ 0x139D7539AF6BL;
        this.AI = true;
        this.A5 = new VisualizationRenderer(MultimodalIntegrationFramework.M.S);
        this.Q(MultimodalIntegrationFramework.M.W);
        this.b(300.0);
        this.M(100.0);
        this.N(false);
        this.d().m(false);
        this.d().f((String)((Object)MultimodalIntegrationFramework.e("H", (int)MultimodalIntegrationFramework.d("e", (int)3544, (long)(0x78D8C12388FFCF89L ^ l)), (long)-805723378367028047L, (long)l)));
        this.a(new AuthenticationTokenGenerator2316(this, this, (String)((Object)MultimodalIntegrationFramework.e("H", (int)MultimodalIntegrationFramework.d("e", (int)26734, (long)(0x38A843D4D7FC2A38L ^ l)), (long)-805723378367028047L, (long)l)), (String)((Object)MultimodalIntegrationFramework.e("H", (int)MultimodalIntegrationFramework.d("e", (int)17323, (long)(0xE1F9566125C01FEL ^ l)), (long)-805723378367028047L, (long)l))));
        this.A4 = new NetworkStateManager(TemporalMetadataResolver.h.g().F);
        this.AC = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().b);
        this.Ar = new AdaptiveCipherEngine(TemporalMetadataResolver.h.g().e);
        this.A1 = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().Z);
        this.Aq = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().r);
        this.A4.Q(MultimodalIntegrationFramework.M.a);
        this.AC.Q(MultimodalIntegrationFramework.M.a);
        this.Ar.Q(MultimodalIntegrationFramework.M.a);
        this.A1.Q(MultimodalIntegrationFramework.M.a);
        this.Aq.Q(MultimodalIntegrationFramework.M.a);
        this.A4.N(false);
        this.AC.N(false);
        this.Ar.N(false);
        this.A1.N(false);
        this.Aq.N(false);
        this.A5.N(false);
    }

    @Override
    public boolean W() {
        return this.AI;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultimodalIntegrationFramework.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultimodalIntegrationFramework.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultimodalIntegrationFramework.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void Y() {
        long l = ab ^ 0x523EA7D26524L;
        this.k();
        this.o(this.A4, this.AC, this.Ar, this.A1, this.Aq, this.A5);
        this.n(new SynchronizationCoordinator((String)((Object)MultimodalIntegrationFramework.e("H", (int)MultimodalIntegrationFramework.d("e", (int)6223, (long)(0x16E4C4CC209E1057L ^ l)), (long)4512113665190620926L, (long)l))), new Object[0]);
        for (SecureChannelNegotiator481 secureChannelNegotiator481 : TemporalMetadataResolver.h.g().t()) {
            this.n(new SecureProtocolNegotiator894(secureChannelNegotiator481).R(new CommunicationProtocolAdapter2234(this, secureChannelNegotiator481)), new Object[0]);
        }
        this.A();
    }

    static AdaptiveCipherEngine w(MultimodalIntegrationFramework multimodalIntegrationFramework) {
        return multimodalIntegrationFramework.Ar;
    }

    static VisualizationRenderer s(MultimodalIntegrationFramework multimodalIntegrationFramework) {
        return multimodalIntegrationFramework.A5;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultimodalIntegrationFramework.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void V() {
        boolean bl;
        try {
            MultimodalIntegrationFramework multimodalIntegrationFramework = this;
            bl = !this.AI;
        }
        catch (CustomSystemException customSystemException) {
            throw MultimodalIntegrationFramework.a(customSystemException);
        }
        multimodalIntegrationFramework.AI = bl;
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                if (abstractComputationKernel instanceof SecureMessageEncoder) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultimodalIntegrationFramework.a(customSystemException);
            }
            abstractComputationKernel.N(this.AI);
        }
        this.A();
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultimodalIntegrationFramework.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                MultimodalIntegrationFramework.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == '\u00c4' || c == '\u00ba' || c == 'e') {
                field = MultimodalIntegrationFramework.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultimodalIntegrationFramework.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 60;
                break;
            }
            case 3: {
                n3 = 38;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 52;
                break;
            }
            case 8: {
                n3 = 13;
                break;
            }
            case 9: {
                n3 = 19;
                break;
            }
            case 10: {
                n3 = 23;
                break;
            }
            case 11: {
                n3 = 54;
                break;
            }
            case 12: {
                n3 = 43;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 47;
                break;
            }
            case 16: {
                n3 = 46;
                break;
            }
            case 17: {
                n3 = 14;
                break;
            }
            case 18: {
                n3 = 61;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 45;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 17;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 28;
                break;
            }
            case 28: {
                n3 = 24;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 3;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 2;
                break;
            }
            case 34: {
                n3 = 20;
                break;
            }
            case 35: {
                n3 = 11;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 1;
                break;
            }
            case 38: {
                n3 = 5;
                break;
            }
            case 39: {
                n3 = 34;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 26;
                break;
            }
            case 42: {
                n3 = 44;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 22;
                break;
            }
            case 45: {
                n3 = 9;
                break;
            }
            case 46: {
                n3 = 21;
                break;
            }
            case 47: {
                n3 = 48;
                break;
            }
            case 48: {
                n3 = 7;
                break;
            }
            case 49: {
                n3 = 59;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 37;
                break;
            }
            case 53: {
                n3 = 35;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 30;
                break;
            }
            case 56: {
                n3 = 40;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 10;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 51;
                break;
            }
            case 61: {
                n3 = 55;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 50;
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
        MultimodalIntegrationFramework.rb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void u() {
    }

    private static Method p(long l, long l2) {
        int n = MultimodalIntegrationFramework.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = MultimodalIntegrationFramework.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultimodalIntegrationFramework.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultimodalIntegrationFramework.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultimodalIntegrationFramework.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultimodalIntegrationFramework.n(261710302838721L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultimodalIntegrationFramework.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultimodalIntegrationFramework.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultimodalIntegrationFramework.n(261710302838721L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultimodalIntegrationFramework.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MultimodalIntegrationFramework.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

