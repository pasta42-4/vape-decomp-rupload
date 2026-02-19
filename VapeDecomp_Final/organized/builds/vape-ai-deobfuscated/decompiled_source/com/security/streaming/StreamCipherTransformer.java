/*
 * Decompiled with CFR 0.152.
 */
package com.security.streaming;

import com.async.scheduling.AsynchronousTaskScheduler685;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.state.StateToggleManager;
import com.ui.rendering.GraphicalRenderingController;
import com.util.reflection.ReflectionUtility;
import java.awt.Color;
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

public class StreamCipherTransformer
extends StateToggleManager {
    private ReflectionUtility Y;
    private static final Integer[] db;
    private AsynchronousTaskScheduler685 lc;
    private static final Object[] fb;
    private static final long ab;
    private static final long[] bb;
    private static final String[] jb;
    private static final Map eb;
    private boolean D;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StreamCipherTransformer.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                StreamCipherTransformer.ab = MultiContainerRegistry.a(3729308773703959409L, 3215759266763898938L, MethodHandles.lookup().lookupClass()).a(209657122100561L);
                StreamCipherTransformer.fb = new Object[5];
                StreamCipherTransformer.jb = new String[5];
                StreamCipherTransformer.i();
                StreamCipherTransformer.eb = new HashMap<K, V>(13);
                var0 = StreamCipherTransformer.ab ^ 133486901147371L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "*\u00db\u00a0\u00c63\u0013\u00c6\u008b\u0092\u0002d\u0080\u00ac\u00ae\u00b7$ld\u001cFOE\u00c4\u00d7u\u00dd\u0010\u0085\u00d4m;\u00b5\u0002\u008e\u00ad-\u00a2\u0006\u00d6;\u001d<S\u00ad\u0013]\u009cn\u0084\u0094j\u000e\u00aa^\rF\u001b:\u0000\u00f4\u009eA\u00dc\u0007\u00fb\u007f\u00b2\u008a\u00ec\u0000\u00aci\u00c6\u00a6\u00fe\u00c6'\u00f7m\u000by\u00a5\u001f\u00c5 \u00f1\u00b6b";
                var7_6 = "*\u00db\u00a0\u00c63\u0013\u00c6\u008b\u0092\u0002d\u0080\u00ac\u00ae\u00b7$ld\u001cFOE\u00c4\u00d7u\u00dd\u0010\u0085\u00d4m;\u00b5\u0002\u008e\u00ad-\u00a2\u0006\u00d6;\u001d<S\u00ad\u0013]\u009cn\u0084\u0094j\u000e\u00aa^\rF\u001b:\u0000\u00f4\u009eA\u00dc\u0007\u00fb\u007f\u00b2\u008a\u00ec\u0000\u00aci\u00c6\u00a6\u00fe\u00c6'\u00f7m\u000by\u00a5\u001f\u00c5 \u00f1\u00b6b".length();
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
                    var6_5 = "\u00edx\u0013\u00aeY\u001c\u00f5\u0094\u00b2\u008c\u000e\u00b6\u00d7\u00b3:\u00aa";
                    var7_6 = "\u00edx\u0013\u00aeY\u001c\u00f5\u0094\u00b2\u008c\u000e\u00b6\u00d7\u00b3:\u00aa".length();
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
        StreamCipherTransformer.bb = var8_3;
        StreamCipherTransformer.db = new Integer[13];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == 'H' || c == '\u00ca' || c == '\u00fd') {
                field = StreamCipherTransformer.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StreamCipherTransformer.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        Color color2;
        Color color3;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        CryptographicParameterGenerator cryptographicParameterGenerator2;
        long l;
        block22: {
            block21: {
                l = ab ^ 0x620C258DB030L;
                this.S();
                this.lc.T();
                cryptographicParameterGenerator2 = this.L(0.9);
                cryptographicParameterGenerator = this.L(0.75);
                color3 = StreamCipherTransformer.M.W;
                try {
                    if (!this.V()) break block21;
                    color2 = StreamCipherTransformer.M.c;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamCipherTransformer.b(customSystemException);
                }
            }
            try {
                color2 = this.h() ? StreamCipherTransformer.M.c : StreamCipherTransformer.M.n;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamCipherTransformer.b(customSystemException);
            }
        }
        Color color4 = color2;
        double d6 = cryptographicParameterGenerator2.B((String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)3639, (long)(0x41B9C78738AA347L ^ l)), (long)8938347114598252068L, (long)l)));
        double d7 = this.W() + this.b() / 2.0 - d6 / 2.0 - 2.5 - 2.0;
        double d8 = d7 + 7.5 + 1.0;
        try {
            d5 = this.G() + 5.0;
            d4 = this.W() + 2.5;
            d3 = this.w() - 10.0;
            d2 = this.b() - 5.0;
            color = this.h() ? M.j() : this.z().k();
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherTransformer.b(customSystemException);
        }
        ConfigurationManager.S(d5, d4, d3, d2, color);
        ConfigurationManager.S(this.G() + 5.0 + 0.5, this.W() + 2.5 + 0.5, this.w() - 10.0 - 1.0, this.b() - 5.0 - 1.0, color3);
        double d9 = this.G() + 10.0 - 2.0;
        Object object = StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)19468, (long)(0x280B8C19DDCE6176L ^ l)), (long)8938347114598252068L, (long)l);
        if (this.Y.c().s().booleanValue()) {
            object = (String)object + (String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)10131, (long)(0x26B1FD097E1C0AEDL ^ l)), (long)8938347114598252068L, (long)l));
        }
        if (((AuthenticationStateTracker)this.Y.J()).s().booleanValue()) {
            object = (String)object + (String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)31149, (long)(0x5F498E558023D4D9L ^ l)), (long)8938347114598252068L, (long)l));
        }
        if (this.Y.G().s().booleanValue()) {
            object = (String)object + (String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)29204, (long)(0xB9485A45405DF6BL ^ l)), (long)8938347114598252068L, (long)l));
        }
        if (((String)object).endsWith((String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)21833, (long)(0x133C956F637F834L ^ l)), (long)8938347114598252068L, (long)l)))) {
            object = ((String)object).substring(0, ((String)object).length() - 2);
        }
        if (((String)object).equals(StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)2300, (long)(0x4AF36FCF783F2585L ^ l)), (long)8938347114598252068L, (long)l))) {
            object = (String)object + (String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)12779, (long)(0x5416974945199C9EL ^ l)), (long)8938347114598252068L, (long)l));
            cryptographicParameterGenerator2.R((String)object, d9, d7 + 1.0, StreamCipherTransformer.M.O);
        } else {
            cryptographicParameterGenerator2.R((String)object, d9, d7 + 1.0, color4);
        }
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (this.Y.z().s().booleanValue()) {
                stringBuilder.append((String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)12070, (long)(0x67F5922D3781025EL ^ l)), (long)8938347114598252068L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherTransformer.b(customSystemException);
        }
        try {
            if (this.Y.u().s().booleanValue()) {
                stringBuilder.append((String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)22546, (long)(0x6EA6BE4650397569L ^ l)), (long)8938347114598252068L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherTransformer.b(customSystemException);
        }
        try {
            if (this.Y.t().s().booleanValue()) {
                stringBuilder.append((String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)1122, (long)(0x230EAD749CA22915L ^ l)), (long)8938347114598252068L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherTransformer.b(customSystemException);
        }
        Object object2 = stringBuilder.length() < 1 ? StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)31845, (long)(0x57988C0B0B475113L ^ l)), (long)8938347114598252068L, (long)l) : stringBuilder.substring(0, stringBuilder.length() - 2);
        cryptographicParameterGenerator.R((String)((Object)StreamCipherTransformer.c("s", (int)StreamCipherTransformer.b("t", (int)17340, (long)(0x731E89FA93DD6EC0L ^ l)), (long)8938347114598252068L, (long)l)) + (String)object2, this.G() + 10.0 - 2.0, d8, StreamCipherTransformer.M.n);
    }

    public StreamCipherTransformer(ReflectionUtility reflectionUtility) {
        this.Y = reflectionUtility;
        this.N(this::lambda$new$0);
        this.lc = new AsynchronousTaskScheduler685(this);
        GraphicalRenderingController.K.S().B(this.lc);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 49;
                break;
            }
            case 4: {
                n3 = 24;
                break;
            }
            case 5: {
                n3 = 33;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 61;
                break;
            }
            case 8: {
                n3 = 8;
                break;
            }
            case 9: {
                n3 = 62;
                break;
            }
            case 10: {
                n3 = 30;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 13;
                break;
            }
            case 13: {
                n3 = 40;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 7;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 31;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 9;
                break;
            }
            case 21: {
                n3 = 19;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 42;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 27;
                break;
            }
            case 26: {
                n3 = 32;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 18;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 36;
                break;
            }
            case 32: {
                n3 = 46;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 25;
                break;
            }
            case 36: {
                n3 = 16;
                break;
            }
            case 37: {
                n3 = 34;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 29;
                break;
            }
            case 43: {
                n3 = 26;
                break;
            }
            case 44: {
                n3 = 0;
                break;
            }
            case 45: {
                n3 = 38;
                break;
            }
            case 46: {
                n3 = 58;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 43;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 17;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 47;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 55;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 5;
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
        StreamCipherTransformer.jb[n4] = new String(cArray);
        return n4;
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

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "~G\u0011";
        objectArray[1] = Integer.TYPE;
        StreamCipherTransformer.jb[1] = "java/lang/Integer";
        objectArray[2] = "kI;\u007fh\n`F*0\u0015\u0012sA#y";
        objectArray[3] = "YtQPq~R{@\u001f\u0010pYpDE";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "l[[\b6p\u007f\u001aOy?u\u0007[\tClrl\u0019W\u0014h\u000e>\u0013T\u0006+5d^Z\u0002T";
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ReflectionUtility H() {
        return this.Y;
    }

    private void lambda$new$0() {
        boolean bl;
        StreamCipherTransformer streamCipherTransformer;
        try {
            streamCipherTransformer = this;
            bl = !this.h();
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherTransformer.b(customSystemException);
        }
        streamCipherTransformer.g(bl);
    }

    private static Method h(long l, long l2) {
        int n = StreamCipherTransformer.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = StreamCipherTransformer.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StreamCipherTransformer.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StreamCipherTransformer.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        StreamCipherTransformer.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StreamCipherTransformer.f(249329991647799L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StreamCipherTransformer.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StreamCipherTransformer.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StreamCipherTransformer.f(249329991647799L, 0L);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5176;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hH", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StreamCipherTransformer.db[n2] = n3;
        }
        return db[n2];
    }

    private static Field g(long l, long l2) {
        int n = StreamCipherTransformer.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = StreamCipherTransformer.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StreamCipherTransformer.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StreamCipherTransformer.c(clazz3, string2, clazz2)) != null) {
                    StreamCipherTransformer.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StreamCipherTransformer.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StreamCipherTransformer.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StreamCipherTransformer.f(249329991647799L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StreamCipherTransformer.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                StreamCipherTransformer.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = StreamCipherTransformer.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StreamCipherTransformer.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StreamCipherTransformer.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = StreamCipherTransformer.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StreamCipherTransformer.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StreamCipherTransformer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(StreamCipherTransformer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

