/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.util.reflection;

import a._Y;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.google.gson.JsonObject;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ReflectionUtility
extends ConfigurationProfileResolver<Boolean[], ReflectionUtility> {
    private final AuthenticationStateTracker S;
    private final List<AuthenticationStateTracker> F;
    private static final long[] d;
    private static final Map h;
    private static final Integer[] g;
    private final AuthenticationStateTracker o;
    private static final String[] m;
    private static final long a;
    private final AuthenticationStateTracker y;
    private final AuthenticationStateTracker D;
    private static final Object[] k;
    private final AuthenticationStateTracker Y;
    private final AuthenticationStateTracker e;
    boolean X;
    private final AuthenticationStateTracker H;

    public ReflectionUtility(Object object, String string) {
        long l = a ^ 0x2357F7F1E68AL;
        super(object, string, new Boolean[7]);
        this.e = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)32652, (long)(0x3A413E74B95E0238L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)14481, (long)(0x2D4D66D45D434527L ^ l)), (long)3803037823108135691L, (long)l)), true);
        this.S = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)21684, (long)(0x7A2D339E21972908L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)17240, (long)(0x65754CC8B3573EE9L ^ l)), (long)3803037823108135691L, (long)l)), false);
        this.Y = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)1961, (long)(0x7770E476926F7A10L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)19731, (long)(0x47F50281C4CD30ABL ^ l)), (long)3803037823108135691L, (long)l)), false);
        this.H = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)9962, (long)(0x1FF49A3050265B59L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)20725, (long)(0x530796716E62D5EL ^ l)), (long)3803037823108135691L, (long)l)), false);
        this.y = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)23874, (long)(0x6AD6C8E34EC5A0F5L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)6548, (long)(0x53AF98ED86F2E42FL ^ l)), (long)3803037823108135691L, (long)l)), false);
        this.D = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)13849, (long)(0x33A84ABA33B0CBA6L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)27291, (long)(0x41D7D54AF3219726L ^ l)), (long)3803037823108135691L, (long)l)), false);
        this.o = AuthenticationStateTracker.v(this, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)21409, (long)(0x6950643629A22E13L ^ l)), (long)3803037823108135691L, (long)l)) + this.x(), (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)23087, (long)(0x43E125178C37A795L ^ l)), (long)3803037823108135691L, (long)l)), false);
        this.F = Arrays.asList(this.e, this.S, this.Y, this.H, this.y, this.D, this.o);
        try {
            for (int i = 0; i < this.F.size(); ++i) {
                ((Boolean[])this.u())[i] = (Boolean)this.F.get(i).u();
                this.F.get(i).P(this::lambda$new$0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility.a(customSystemException);
        }
    }

    private static Field g(long l, long l2) {
        int n = ReflectionUtility.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionUtility.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionUtility.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionUtility.c(clazz3, string2, clazz2)) != null) {
                    ReflectionUtility.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionUtility.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionUtility.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionUtility.f(226935739979993L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public JsonObject k(boolean bl) {
        long l = a ^ 0xEAB7A82F8DDL;
        JsonObject jsonObject = this.y();
        jsonObject.addProperty((String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)1394, (long)(0x53EA9D15A3CFE690L ^ l)), (long)3067012080244565340L, (long)l)), this.toString());
        return jsonObject;
    }

    private void lambda$new$0(AuthenticationStateTracker authenticationStateTracker) {
        try {
            if (this.X) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility.a(customSystemException);
        }
        this.X = true;
        this.O(this.I());
        this.X = false;
    }

    public AuthenticationStateTracker q() {
        return this.H;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionUtility.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionUtility.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ReflectionUtility.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionUtility.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public ReflectionUtility L() {
        ReflectionUtility reflectionUtility = new ReflectionUtility(null, this.x());
        return reflectionUtility;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = k[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 55;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 23;
                break;
            }
            case 3: {
                n3 = 62;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 59;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 57;
                break;
            }
            case 16: {
                n3 = 35;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 61;
                break;
            }
            case 19: {
                n3 = 18;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 5;
                break;
            }
            case 22: {
                n3 = 30;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 22;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 43;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 12;
                break;
            }
            case 35: {
                n3 = 9;
                break;
            }
            case 36: {
                n3 = 60;
                break;
            }
            case 37: {
                n3 = 53;
                break;
            }
            case 38: {
                n3 = 10;
                break;
            }
            case 39: {
                n3 = 6;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 29;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 1;
                break;
            }
            case 47: {
                n3 = 32;
                break;
            }
            case 48: {
                n3 = 56;
                break;
            }
            case 49: {
                n3 = 52;
                break;
            }
            case 50: {
                n3 = 34;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 15;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 19;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 8;
                break;
            }
            default: {
                n3 = 40;
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
        ReflectionUtility.m[n4] = new String(cArray);
        return n4;
    }

    @Override
    public List<AuthenticationStateTracker> S() {
        return this.F;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x497D;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/j3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionUtility.g[n2] = n3;
        }
        return g[n2];
    }

    @Override
    public AuthenticationStateTracker J() {
        return this.S;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionUtility.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method h(long l, long l2) {
        int n = ReflectionUtility.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = ReflectionUtility.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionUtility.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionUtility.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionUtility.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionUtility.f(226935739979993L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionUtility.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionUtility.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionUtility.f(226935739979993L, 0L);
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectionUtility.a = MultiContainerRegistry.a(-6014781282878724164L, 8557499955548310672L, MethodHandles.lookup().lookupClass()).a(156737390051242L);
                ReflectionUtility.k = new Object[5];
                ReflectionUtility.m = new String[5];
                ReflectionUtility.a();
                ReflectionUtility.h = new HashMap<K, V>(13);
                var0 = ReflectionUtility.a ^ 76605218439434L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "\u00eaB\u00a7+@G<)\f\u00cbn\u00e6:)g\u00d9\u00fc\u00cb\u00c9\u00ba\u00fb\u00f31\u0018\u00b3)#\u0081\u0002(\u00af,\u00b2L\u00c2\u00af\u00e4)\u00f9\u009d\u00fcd\u0007\u00f7c?\u0091:T\u00a3\u0082\u00de.\u00e4\u00b6H32\u00f5\u0001\u00e5;blI\u0007\u0019\u00ad\u00b7h\u00f2W\u0081D\u00e8\u00fd\\\u0013\u00a0\\\u00b4\u009br\u00a1\u00b9JlV\u001f\u00fbN`H\u008d\u00ae0H\u00dcb\u00be\u0082\u00fd.!k\u000b\u00ce\u0095M\u00a7y\u009ep\u00e6\u00c9R\u001a4\u00a3\u00072\u00f0\u0094\u00c2\u00dc\u00a8\u00f6\u0002";
                var7_6 = "\u00eaB\u00a7+@G<)\f\u00cbn\u00e6:)g\u00d9\u00fc\u00cb\u00c9\u00ba\u00fb\u00f31\u0018\u00b3)#\u0081\u0002(\u00af,\u00b2L\u00c2\u00af\u00e4)\u00f9\u009d\u00fcd\u0007\u00f7c?\u0091:T\u00a3\u0082\u00de.\u00e4\u00b6H32\u00f5\u0001\u00e5;blI\u0007\u0019\u00ad\u00b7h\u00f2W\u0081D\u00e8\u00fd\\\u0013\u00a0\\\u00b4\u009br\u00a1\u00b9JlV\u001f\u00fbN`H\u008d\u00ae0H\u00dcb\u00be\u0082\u00fd.!k\u000b\u00ce\u0095M\u00a7y\u009ep\u00e6\u00c9R\u001a4\u00a3\u00072\u00f0\u0094\u00c2\u00dc\u00a8\u00f6\u0002".length();
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
                    var6_5 = "a\u00bc\u00ae\u0092\u0085\u0006\u008d\u001d`\u0002H\u00ea\u00b6&\u0093U";
                    var7_6 = "a\u00bc\u00ae\u0092\u0085\u0006\u008d\u001d`\u0002H\u00ea\u00b6&\u0093U".length();
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
        ReflectionUtility.d = var8_3;
        ReflectionUtility.g = new Integer[18];
    }

    private static void a() {
        Object[] objectArray = k;
        k[0] = "D\u00182";
        objectArray[1] = Integer.TYPE;
        ReflectionUtility.m[1] = "java/lang/Integer";
        objectArray[2] = "M5G6D\u0014F:Vy9\fU=_0";
        objectArray[3] = "OSld$^D\\}+EPOWyq";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001a\u000e\u0018F\u001c%\u0011J\u001cw\ro\u007f\u0000\u0018\u001e\u0000)\u000e\u001a\\If-\u0004\u001e\u0019\u0014^iB\u001e\rw";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/j3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean u(CryptographicTransformer cryptographicTransformer) {
        block95: {
            boolean bl;
            boolean bl2;
            block94: {
                block93: {
                    block90: {
                        boolean bl3;
                        TransactionOrchestrator1017 transactionOrchestrator1017;
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                        block92: {
                            block91: {
                                boolean bl4;
                                boolean bl5;
                                block89: {
                                    block88: {
                                        boolean bl6;
                                        block86: {
                                            block85: {
                                                Class clazz;
                                                block83: {
                                                    block82: {
                                                        block81: {
                                                            block80: {
                                                                try {
                                                                    if (cryptographicTransformer.Y()) {
                                                                        return false;
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ReflectionUtility.a(customSystemException);
                                                                }
                                                                try {
                                                                    if (DynamicContextBroker.U(cryptographicTransformer)) {
                                                                        return false;
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ReflectionUtility.a(customSystemException);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (this.Y.s().booleanValue() || !cryptographicTransformer.B(ReflectionMetadataResolver.YD)) break block80;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ReflectionUtility.a(customSystemException);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ReflectionUtility.a(customSystemException);
                                                                }
                                                            }
                                                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                            try {
                                                                if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                                                                    return false;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ReflectionUtility.a(customSystemException);
                                                            }
                                                            try {
                                                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                                                                    return false;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ReflectionUtility.a(customSystemException);
                                                            }
                                                            try {
                                                                try {
                                                                    if (GeometryCalculator.C() <= 13 || !cryptographicTransformer.B(ReflectionMetadataResolver.PR)) break block81;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ReflectionUtility.a(customSystemException);
                                                                }
                                                                return false;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ReflectionUtility.a(customSystemException);
                                                            }
                                                        }
                                                        transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer.M());
                                                        try {
                                                            if (transactionOrchestrator1017.e() <= 0.0f) {
                                                                return false;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ReflectionUtility.a(customSystemException);
                                                        }
                                                        try {
                                                            try {
                                                                if (!this.D.s().booleanValue() || !_Y.X(transactionOrchestrator1017)) break block82;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ReflectionUtility.a(customSystemException);
                                                            }
                                                            return false;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ReflectionUtility.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (!this.o.s().booleanValue() || systemConfigurationOrchestrator.X(cryptographicTransformer)) break block83;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ReflectionUtility.a(customSystemException);
                                                        }
                                                        return false;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ReflectionUtility.a(customSystemException);
                                                    }
                                                }
                                                try {
                                                    if (TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                                                        return false;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectionUtility.a(customSystemException);
                                                }
                                                bl5 = cryptographicTransformer.B(ReflectionMetadataResolver.Pr);
                                                try {
                                                    clazz = GameVersionEnumerator.MC_1_21_4.H() ? ReflectionMetadataResolver.Ef : ReflectionMetadataResolver.tL;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectionUtility.a(customSystemException);
                                                }
                                                Class clazz2 = clazz;
                                                try {
                                                    block84: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (cryptographicTransformer.B(clazz2) || cryptographicTransformer.B(ReflectionMetadataResolver.o)) break block84;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ReflectionUtility.a(customSystemException);
                                                                }
                                                                if (cryptographicTransformer.B(ReflectionMetadataResolver.M)) break block84;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ReflectionUtility.a(customSystemException);
                                                            }
                                                            if (!cryptographicTransformer.B(ReflectionMetadataResolver.Y)) break block85;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ReflectionUtility.a(customSystemException);
                                                        }
                                                    }
                                                    bl6 = true;
                                                    break block86;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectionUtility.a(customSystemException);
                                                }
                                            }
                                            bl6 = false;
                                        }
                                        bl2 = bl6;
                                        try {
                                            block87: {
                                                try {
                                                    try {
                                                        if (cryptographicTransformer.B(ReflectionMetadataResolver.P9) || cryptographicTransformer.B(ReflectionMetadataResolver.P1)) break block87;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ReflectionUtility.a(customSystemException);
                                                    }
                                                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Yn)) break block88;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectionUtility.a(customSystemException);
                                                }
                                            }
                                            bl4 = true;
                                            break block89;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectionUtility.a(customSystemException);
                                        }
                                    }
                                    bl4 = false;
                                }
                                bl = bl4;
                                try {
                                    try {
                                        if (!bl5) break block90;
                                        if (this.e.s().booleanValue()) break block91;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectionUtility.a(customSystemException);
                                    }
                                    return false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ReflectionUtility.a(customSystemException);
                                }
                            }
                            try {
                                if (TemporalMetadataResolver.h.g().Q(cryptographicTransformer.e())) {
                                    return true;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionUtility.a(customSystemException);
                            }
                            try {
                                try {
                                    if (!this.y.s().booleanValue() || !_Y.F(transactionOrchestrator1017)) break block92;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ReflectionUtility.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionUtility.a(customSystemException);
                            }
                        }
                        try {
                            if (TemporalMetadataResolver.h.a().H(systemConfigurationOrchestrator, transactionOrchestrator1017)) {
                                return false;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtility.a(customSystemException);
                        }
                        try {
                            bl3 = !TemporalMetadataResolver.h.a().P(transactionOrchestrator1017);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtility.a(customSystemException);
                        }
                        return bl3;
                    }
                    try {
                        try {
                            if (!bl2 || this.S.s().booleanValue()) break block93;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtility.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtility.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!bl || this.Y.s().booleanValue()) break block94;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtility.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtility.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (bl2 || bl) break block95;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtility.a(customSystemException);
                    }
                    if (this.Y.s().booleanValue()) break block95;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtility.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility.a(customSystemException);
            }
        }
        return true;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e9' || c == '\u00f3' || c == 'E' || c == '\u00cd') {
                field = ReflectionUtility.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionUtility.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public AuthenticationStateTracker z() {
        return this.D;
    }

    public Boolean[] I() {
        Boolean[] booleanArray = new Boolean[this.F.size()];
        try {
            for (int i = 0; i < this.F.size(); ++i) {
                booleanArray[i] = this.F.get(i).s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility.a(customSystemException);
        }
        return booleanArray;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ReflectionUtility L(ContextualExecutionFramework contextualExecutionFramework) {
        long l = a ^ 0x406720ED3520L;
        return new ReflectionUtility(contextualExecutionFramework, (String)((Object)ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)13817, (long)(0x47096A8984319BE3L ^ l)), (long)-1770625002918319967L, (long)l)) + contextualExecutionFramework.O());
    }

    public AuthenticationStateTracker t() {
        return this.o;
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        boolean bl = super.C(jsonObject);
        this.i(this.toString());
        return bl;
    }

    public void O(Boolean[] booleanArray) {
        try {
            for (int i = 0; i < this.F.size(); ++i) {
                this.F.get(i).H(booleanArray[i]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility.a(customSystemException);
        }
        super.H(booleanArray);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionUtility.e(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionUtility.k[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public boolean p() {
        return this.F.stream().allMatch(ConfigurationProfileResolver::p);
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

    @Override
    public AuthenticationStateTracker G() {
        return this.Y;
    }

    public AuthenticationStateTracker c() {
        return this.e;
    }

    @Override
    public void W() {
        super.W();
        if (this.s()) {
            for (AuthenticationStateTracker authenticationStateTracker : this.F) {
                authenticationStateTracker.W();
            }
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/j3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String toString() {
        long l = a ^ 0x654E9600E21BL;
        StringBuilder stringBuilder = new StringBuilder();
        for (AuthenticationStateTracker authenticationStateTracker : this.F) {
            CallSite callSite;
            StringBuilder stringBuilder2;
            try {
                stringBuilder2 = stringBuilder;
                callSite = authenticationStateTracker.s() != false ? ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)18659, (long)(0x7972B58EC637B1D8L ^ l)), (long)3483073450242555802L, (long)l) : ReflectionUtility.d("\u00fb", (int)ReflectionUtility.b("j", (int)22857, (long)(0x67A1FFB065232066L ^ l)), (long)3483073450242555802L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility.a(customSystemException);
            }
            stringBuilder2.append((String)((Object)callSite));
        }
        return stringBuilder.toString();
    }

    @Override
    public void i(String string) {
        int n = 0;
        while (true) {
            boolean bl;
            AuthenticationStateTracker authenticationStateTracker;
            try {
                try {
                    if (n >= string.toCharArray().length || this.F.size() <= n) {
                        break;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtility.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility.a(customSystemException);
            }
            try {
                authenticationStateTracker = this.F.get(n);
                bl = string.charAt(n) == '1';
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility.a(customSystemException);
            }
            authenticationStateTracker.H(bl);
            ++n;
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionUtility.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public AuthenticationStateTracker u() {
        return this.y;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionUtility.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ReflectionUtility.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

