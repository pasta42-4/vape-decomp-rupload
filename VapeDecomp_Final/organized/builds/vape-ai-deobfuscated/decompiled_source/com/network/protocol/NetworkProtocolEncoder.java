/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
import com.system.lifecycle.ObjectLifecycleTracker;
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
public class NetworkProtocolEncoder
extends CryptoProtocolEngine {
    private ReflectionUtilityService F;
    private ReflectionUtilityService s;
    public HK b;
    private static final String[] m;
    private ReflectionUtilityService E;
    private static final Map e;
    private static final Object[] h;
    private static final long a;
    private static final long[] c;
    private ReflectionUtilityService i;
    private ReflectionUtilityService j;
    private ReflectionUtilityService V;
    private ReflectionUtilityService Z;
    private ReflectionUtilityService S;
    private ReflectionUtilityService W;
    private static AbstractComputationKernel[] Y;
    private ReflectionUtilityService o;
    private ReflectionUtilityService k;
    private ReflectionUtilityService J;
    private final ReflectionUtilityService t;
    public HK f;
    private ReflectionUtilityService g;
    private static final Integer[] d;
    private ReflectionUtilityService D;
    public HK p;
    private ReflectionUtilityService U;
    public final HK M;
    private ReflectionUtilityService P;
    private ReflectionUtilityService w;

    private Object p(Object object) {
        return this.Z.Z(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolEncoder.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolEncoder.h[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private float j(Object object) {
        return this.P.x(object);
    }

    static float y(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.j(object);
    }

    private double f(Object object) {
        return this.w.C(object);
    }

    private void v(Object object, float f) {
        this.E.H(object, f);
    }

    static void h(NetworkProtocolEncoder networkProtocolEncoder, Object object, double d2) {
        networkProtocolEncoder.d(object, d2);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x488E;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/vZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolEncoder.d[n2] = n3;
        }
        return d[n2];
    }

    static void r(NetworkProtocolEncoder networkProtocolEncoder, Object object, double d2) {
        networkProtocolEncoder.X(object, d2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private float d(Object object) {
        return this.S.x(object);
    }

    static double K(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.Z(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolEncoder.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public Object e(Object object) {
        return this.t.Z(object);
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "^P\u001a\u000e";
        objectArray[1] = "=p}QH\u00026\u007fl\u001e5\u001a%xeW";
        objectArray[2] = Boolean.TYPE;
        NetworkProtocolEncoder.m[2] = "java/lang/Boolean";
        objectArray[3] = "\u0001j,V\u001d\\\ne=\u0019p\\\nx)";
        objectArray[4] = "I?7Ft\u000e<\u001f<IeAQ\u001f<TqT";
        objectArray[5] = "V\u001fs\u0003";
        objectArray[6] = "4M\u001f2`AAm\u0014=q\u000e,m\u0014 e\u001b";
        objectArray[7] = "!\u0017-";
        objectArray[8] = Integer.TYPE;
        NetworkProtocolEncoder.m[8] = "java/lang/Integer";
        objectArray[9] = "6\bou";
        objectArray[10] = "GlW+";
        objectArray[11] = "i{G%Y\u0014\u001c[L*H[q[L7\\N";
        objectArray[12] = "l0lD";
        objectArray[13] = "m+QO8'f$@\u0000Y)m/DZ";
        objectArray[14] = "\nj~&D)\t+b\u0017jE]lej]\u007f\u001c9$'-|\u0018beeA.\u0003+{\u0017\u0017$\n+#&\u0013+\u000b6\u001d'\u0014>\r/g-\u0010)\nS!/K4^j,nJ,d";
        objectArray[15] = "/0\u0015\u0012\u0013t,q\t#7\u0018{h\u0018[D)\u007fg\u0019Fz!~q\u000bS@`+0F#Cdpq\u0004O\u0011\u007f9ov\u0019\u001bv97G\u001d\u0014w$\tF\u001a\u0001q=sL\u001e\u0016vA5NE\u000b\"x8\u000fD\u0013\u0018";
        objectArray[16] = "Z\u0004Kad\u001bYEWPVw\r\u0002P-}MLW\u0011`\rNH\fP\"a\u001cSENP7\u0016ZE\u0016a3\u0019[X(nu\f\u0004\u0003W`\u007f\u0014Z=";
        objectArray[17] = "k# $R\u0005hb<\u0015ci<%;hKS}pz%;Sdt;+\nWku&\u0015\u0004\re ;hT\u0018xsC";
        objectArray[18] = "fiG}\u001231o\u0018{b  \u000b\u0018,\u001es<rB`\u001e3[2\u0019h\u001f;asL)RK";
        objectArray[19] = "p_3g//s\u001e/V$C'Y(+6yf\fifFy\u007f\b(hw}p\t5Vvze\u000f,,|~r\bPf#.t\u000b4?''`f";
        Object[] objectArray2 = objectArray;
        objectArray[20] = "\ff ?\u0018M\u000f'<\u000e !X>-vO\u0010\\1,kq\u0018]'>~KY\bfs\u000eH]S'1b\u001aF\u001a9C4\u0010O\u001aar0\u001fN\u0007_}v\n\u0011\\ s|\u0012Ob";
    }

    static void b(NetworkProtocolEncoder networkProtocolEncoder, Object object, float f) {
        networkProtocolEncoder.X(object, f);
    }

    private float C(Object object) {
        return this.F.x(object);
    }

    static double u(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.r(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 28;
                break;
            }
            case 2: {
                n3 = 27;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 59;
                break;
            }
            case 7: {
                n3 = 0;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 20;
                break;
            }
            case 10: {
                n3 = 35;
                break;
            }
            case 11: {
                n3 = 2;
                break;
            }
            case 12: {
                n3 = 12;
                break;
            }
            case 13: {
                n3 = 30;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 56;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 31;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 58;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 41;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 52;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 9;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 53;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 25;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 55;
                break;
            }
            case 40: {
                n3 = 48;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 13;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 45;
                break;
            }
            case 51: {
                n3 = 29;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 7;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 60;
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
        NetworkProtocolEncoder.m[n4] = new String(cArray);
        return n4;
    }

    static float E(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.C(object);
    }

    private static Method h(long l, long l2) {
        int n = NetworkProtocolEncoder.e(l, l2);
        Object object = h[n];
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
                clazz3 = NetworkProtocolEncoder.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolEncoder.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolEncoder.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolEncoder.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolEncoder.f(924646728881890L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolEncoder.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolEncoder.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolEncoder.f(924646728881890L, 0L);
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
                NetworkProtocolEncoder.a = MultiContainerRegistry.a(7355854090872994496L, -6232023065858407936L, MethodHandles.lookup().lookupClass()).a(11469525603068L);
                NetworkProtocolEncoder.h = new Object[21];
                NetworkProtocolEncoder.m = new String[21];
                NetworkProtocolEncoder.a();
                NetworkProtocolEncoder.e = new HashMap<K, V>(13);
                NetworkProtocolEncoder.M(null);
                var0 = NetworkProtocolEncoder.a ^ 64844773441482L;
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
                var8_3 = new long[32];
                var5_4 = 0;
                var6_5 = "LxW8\u00ea]\u0005\u0016r\u0013#%\u00f40\u00a23nm\u008e\u00da\u00b5\u00cd\u00e5\u0016Pu\u0099\nicrB\u00d9|\u0082\bG\u00cfu\u0099iQ\u008f\\\u0093Zt\u0087\u00e9Q)\u00c4\u00a7\u00f9\u00a0F\u00c6\u008bK\u00ba\rD\u0091\u0088\u00d0B:\u00a5\u00fe\u00ba\u00cc\u00a7\u00d8T\u009b\n\u00cf\u00a0\u001a6\u00e7\u00bb\u00dd\u00e2=X\u009b+\u00f1\u00df\u00c5\u00e1\u001b2zq\u00e9\u00ff\u00e97+\u000b\u00df1`\u00baQXTHx\b\u00af\u0099\u00f2{_\u00e9\u00c0\u00f6\u000eg\u00033\u0014P\u00cd\u00f5\u00e5\u00bc\u00a1\u00db\u00e2\u0094\u00f0;j3)p;\u00d5\r#\u00ed\u0005\u00e57B\u00c8\u0016\u00caS\u00b82v@YW\u00f8KFO\u00fc\u008b\u00b9\u00ea\u0011V\u00c9j\u0007\u000f=\u00b9\u00e0\u00d9YH;\u00a1z\u0085\u0085^\u00901\u001c\u00b3\u00f5\u00ef\u00e5\u00fc\u00815a\u00f8U\u001a\u00c2\u0014\u00b1\u00a4?]\u009f\u0090;\u000b=I\u0007\u00bb \u00e7\u00f5\u008d\u00fc\u00b3\u00b9\u008f\u001b\u00eb\u009d\u00eb\u00eeQ\u0082\u0001,\u0003\u00b5\u00d4o\u0084@\u008fs\u00eb\u000e";
                var7_6 = "LxW8\u00ea]\u0005\u0016r\u0013#%\u00f40\u00a23nm\u008e\u00da\u00b5\u00cd\u00e5\u0016Pu\u0099\nicrB\u00d9|\u0082\bG\u00cfu\u0099iQ\u008f\\\u0093Zt\u0087\u00e9Q)\u00c4\u00a7\u00f9\u00a0F\u00c6\u008bK\u00ba\rD\u0091\u0088\u00d0B:\u00a5\u00fe\u00ba\u00cc\u00a7\u00d8T\u009b\n\u00cf\u00a0\u001a6\u00e7\u00bb\u00dd\u00e2=X\u009b+\u00f1\u00df\u00c5\u00e1\u001b2zq\u00e9\u00ff\u00e97+\u000b\u00df1`\u00baQXTHx\b\u00af\u0099\u00f2{_\u00e9\u00c0\u00f6\u000eg\u00033\u0014P\u00cd\u00f5\u00e5\u00bc\u00a1\u00db\u00e2\u0094\u00f0;j3)p;\u00d5\r#\u00ed\u0005\u00e57B\u00c8\u0016\u00caS\u00b82v@YW\u00f8KFO\u00fc\u008b\u00b9\u00ea\u0011V\u00c9j\u0007\u000f=\u00b9\u00e0\u00d9YH;\u00a1z\u0085\u0085^\u00901\u001c\u00b3\u00f5\u00ef\u00e5\u00fc\u00815a\u00f8U\u001a\u00c2\u0014\u00b1\u00a4?]\u009f\u0090;\u000b=I\u0007\u00bb \u00e7\u00f5\u008d\u00fc\u00b3\u00b9\u008f\u001b\u00eb\u009d\u00eb\u00eeQ\u0082\u0001,\u0003\u00b5\u00d4o\u0084@\u008fs\u00eb\u000e".length();
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
                    var6_5 = "8te\u00f1']Z{\u00ef\u0016\u0010R\u00bb\u0005\u0089\u008f";
                    var7_6 = "8te\u00f1']Z{\u00ef\u0016\u0010R\u00bb\u0005\u0089\u008f".length();
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
        NetworkProtocolEncoder.c = var8_3;
        NetworkProtocolEncoder.d = new Integer[32];
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

    private void d(Object object, double d2) {
        this.w.A(object, d2);
    }

    static float V(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.H(object);
    }

    static void Q(NetworkProtocolEncoder networkProtocolEncoder, Object object, float f) {
        networkProtocolEncoder.v(object, f);
    }

    static double l(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.f(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == 'e' || c == '\u00c8' || c == '\u00e3') {
                field = NetworkProtocolEncoder.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolEncoder.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object A(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.p(object);
    }

    private void t(Object object, double d2) {
        this.j.A(object, d2);
    }

    static void o(NetworkProtocolEncoder networkProtocolEncoder, Object object, int n) {
        networkProtocolEncoder.H(object, n);
    }

    public int m(Object object) {
        return this.W.R(object);
    }

    private float y(Object object) {
        return this.i.x(object);
    }

    public static void M(AbstractComputationKernel[] abstractComputationKernelArray) {
        Y = abstractComputationKernelArray;
    }

    static float X(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.d(object);
    }

    static float h(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.U(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolEncoder.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolEncoder.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private float N(Object object) {
        return this.k.x(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void v(NetworkProtocolEncoder networkProtocolEncoder, Object object, double d2) {
        networkProtocolEncoder.t(object, d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public NetworkProtocolEncoder() {
        block50: {
            block48: {
                block49: {
                    block47: {
                        block46: {
                            block44: {
                                block37: {
                                    block38: {
                                        block43: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        var1_1 = NetworkProtocolEncoder.a ^ 88736765775888L;
                                                        v0 = NetworkProtocolEncoder.J();
                                                        super(ReflectionMetadataResolver.rl);
                                                        var3_2 = v0;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        this.t = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)8386, (long)(9163597308450659947L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ps, (long)3905469514364642067L, (long)var1_1);
                                                                        v1 = GeometryCalculator.C();
                                                                        v2 = 13;
                                                                        if (var3_2 != null) break block37;
                                                                        if (v1 <= v2) break block38;
                                                                    }
                                                                    catch (CustomSystemException v3) {
                                                                        throw NetworkProtocolEncoder.a(v3);
                                                                    }
                                                                    if (GeometryCalculator.C() < 23) break block39;
                                                                }
                                                                catch (CustomSystemException v4) {
                                                                    throw NetworkProtocolEncoder.a(v4);
                                                                }
                                                                this.V = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)ReflectionMetadataResolver.bJ, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)17444, (long)(3530257927355120282L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)3905224194369484923L, (long)var1_1);
                                                                this.Z = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)28595, (long)(4805156867888845084L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.US, (long)3905469514364642067L, (long)var1_1);
                                                                if (var3_2 == null) break block40;
                                                            }
                                                            catch (CustomSystemException v5) {
                                                                throw NetworkProtocolEncoder.a(v5);
                                                            }
                                                            AbstractComputationKernel.I(new String[5]);
                                                        }
                                                        catch (CustomSystemException v6) {
                                                            throw NetworkProtocolEncoder.a(v6);
                                                        }
                                                    }
                                                    this.Z = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)11316, (long)(8035079980709565057L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.US, (long)3905469514364642067L, (long)var1_1);
                                                }
                                                try {
                                                    block42: {
                                                        try {
                                                            try {
                                                                this.w = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)14906, (long)(7568122384517710990L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Double.TYPE, (long)3905469514364642067L, (long)var1_1);
                                                                this.j = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)31301, (long)(5424790718590715129L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Double.TYPE, (long)3905469514364642067L, (long)var1_1);
                                                                this.D = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)30244, (long)(9006259528335100046L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Double.TYPE, (long)3905469514364642067L, (long)var1_1);
                                                                this.E = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)1749, (long)(3317022217090463870L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Float.TYPE, (long)3905469514364642067L, (long)var1_1);
                                                                this.S = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)31919, (long)(329985764907057688L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Float.TYPE, (long)3905469514364642067L, (long)var1_1);
                                                                this.g = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)11567, (long)(3104233771456091036L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)3905469514364642067L, (long)var1_1);
                                                                v7 = this;
                                                                v8 = this;
                                                                v9 = NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)30357, (long)(7303076966530746414L ^ var1_1)), (long)3905608451835137146L, (long)var1_1);
                                                                v10 = true;
                                                                v11 /* !! */  = Integer.TYPE;
                                                                if (var3_2 != null) break block41;
                                                                v7.s = NetworkProtocolEncoder.c("\u00cc", (Object)v8, (Object)v9, (boolean)v10, v11 /* !! */ , (long)3905469514364642067L, (long)var1_1);
                                                                if (GeometryCalculator.C() < 50) break block42;
                                                            }
                                                            catch (CustomSystemException v12) {
                                                                throw NetworkProtocolEncoder.a(v12);
                                                            }
                                                            this.p = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)ReflectionMetadataResolver.US, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)20808, (long)(193168051206402021L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{String.class}, (long)3905974973946019718L, (long)var1_1);
                                                            if (var3_2 == null) break block43;
                                                        }
                                                        catch (CustomSystemException v13) {
                                                            throw NetworkProtocolEncoder.a(v13);
                                                        }
                                                    }
                                                    v7 = this;
                                                    v8 = this;
                                                    v9 = NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)32753, (long)(6683078723211460944L ^ var1_1)), (long)3905608451835137146L, (long)var1_1);
                                                    v10 = true;
                                                    v11 /* !! */  = Void.TYPE;
                                                }
                                                catch (CustomSystemException v14) {
                                                    throw NetworkProtocolEncoder.a(v14);
                                                }
                                            }
                                            v7.p = NetworkProtocolEncoder.c("\u00cc", (Object)v8, (Object)v9, (boolean)v10, v11 /* !! */ , (Object)new Class[]{String.class}, (long)3905917542438560740L, (long)var1_1);
                                        }
                                        this.b = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)27513, (long)(7019788329162053064L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)3905917542438560740L, (long)var1_1);
                                    }
                                    try {
                                        v1 = GeometryCalculator.C();
                                        if (var3_2 != null) break block44;
                                        v2 = 35;
                                    }
                                    catch (CustomSystemException v15) {
                                        throw NetworkProtocolEncoder.a(v15);
                                    }
                                }
                                try {
                                    block45: {
                                        try {
                                            try {
                                                try {
                                                    if (v1 < v2) break block45;
                                                    v1 = GeometryCalculator.C();
                                                    if (var3_2 != null) break block44;
                                                }
                                                catch (CustomSystemException v16) {
                                                    throw NetworkProtocolEncoder.a(v16);
                                                }
                                                if (v1 >= 50) break block45;
                                            }
                                            catch (CustomSystemException v17) {
                                                throw NetworkProtocolEncoder.a(v17);
                                            }
                                            this.W = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)23540, (long)(6633276911194842445L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Integer.TYPE, (long)3905469514364642067L, (long)var1_1);
                                            if (var3_2 == null) break block46;
                                        }
                                        catch (CustomSystemException v18) {
                                            throw NetworkProtocolEncoder.a(v18);
                                        }
                                    }
                                    v1 = (int)GameVersionEnumerator.MC_1_21_10.Q();
                                }
                                catch (CustomSystemException v19) {
                                    throw NetworkProtocolEncoder.a(v19);
                                }
                            }
                            try {
                                try {
                                    if (var3_2 != null) break block47;
                                    if (v1 == 0) break block46;
                                }
                                catch (CustomSystemException v20) {
                                    throw NetworkProtocolEncoder.a(v20);
                                }
                                this.W = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)28612, (long)(7138094258350330214L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Integer.TYPE, (long)3905469514364642067L, (long)var1_1);
                            }
                            catch (CustomSystemException v21) {
                                throw NetworkProtocolEncoder.a(v21);
                            }
                        }
                        try {
                            this.U = ((ThreadPoolCoordinator)NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)29021, (long)(3449031007330963431L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), Integer.TYPE, (long)3905549085113210822L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)27359, (long)(8757516256501208185L ^ var1_1)), (long)3905608451835137146L, (long)var1_1))).p();
                            v22 = this;
                            v23 = ((StatefulEventToggle)((StatefulEventToggle)NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)4464, (long)(3541809398440751070L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), Void.TYPE, (Object)new Class[0], (long)3905717885291463766L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)24986, (long)(1134153806044503848L ^ var1_1)), (long)3905608451835137146L, (long)var1_1))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.bJ)).M();
                            if (var3_2 != null) break block48;
                            v22.M = v23;
                            v1 = GeometryCalculator.C();
                        }
                        catch (CustomSystemException v24) {
                            throw NetworkProtocolEncoder.a(v24);
                        }
                    }
                    try {
                        try {
                            if (v1 >= 23) {
                                if (GeometryCalculator.C() < 35) break block49;
                                break block50;
                            }
                            ** GOTO lbl143
                        }
                        catch (CustomSystemException v25) {
                            throw NetworkProtocolEncoder.a(v25);
                        }
                    }
                    catch (CustomSystemException v26) {
                        throw NetworkProtocolEncoder.a(v26);
                    }
                }
                try {
                    this.f = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)25905, (long)(8501538371583318932L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.F2, Float.TYPE, Float.TYPE}, (long)3905917542438560740L, (long)var1_1);
                    if (var3_2 == null) break block50;
lbl143:
                    // 2 sources

                    v22 = this;
                    v23 = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)10453, (long)(4696903951199524473L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{String.class, Float.TYPE, Float.TYPE}, (long)3905917542438560740L, (long)var1_1);
                }
                catch (CustomSystemException v27) {
                    throw NetworkProtocolEncoder.a(v27);
                }
            }
            v22.f = v23;
        }
        this.P = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)5159, (long)(133116262424570527L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Float.TYPE, (long)3905469514364642067L, (long)var1_1);
        this.i = NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)28624, (long)(9184474715822297464L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), (boolean)true, Float.TYPE, (long)3905469514364642067L, (long)var1_1);
        this.J = ((ThreadPoolCoordinator)NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)25876, (long)(4684697172358994857L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), Float.TYPE, (long)3905549085113210822L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)32467, (long)(3050452461086179443L ^ var1_1)), (long)3905608451835137146L, (long)var1_1))).p();
        this.F = ((ThreadPoolCoordinator)NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)30623, (long)(5604927631804172603L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), Float.TYPE, (long)3905549085113210822L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)13180, (long)(521879735125364172L ^ var1_1)), (long)3905608451835137146L, (long)var1_1))).p();
        this.k = ((ThreadPoolCoordinator)NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)7481, (long)(2030323513465660294L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), Float.TYPE, (long)3905549085113210822L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)3942, (long)(8080946030307701189L ^ var1_1)), (long)3905608451835137146L, (long)var1_1))).p();
        this.o = ((ThreadPoolCoordinator)NetworkProtocolEncoder.c("\u00cc", (Object)this, (Object)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)11503, (long)(8044897086908158536L ^ var1_1)), (long)3905608451835137146L, (long)var1_1), Float.TYPE, (long)3905549085113210822L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)NetworkProtocolEncoder.c("Q", (int)NetworkProtocolEncoder.b("y", (int)27908, (long)(6988756803105756082L ^ var1_1)), (long)3905608451835137146L, (long)var1_1))).p();
    }

    private void H(Object object, int n) {
        this.s.t(object, n);
    }

    private static Field g(long l, long l2) {
        int n = NetworkProtocolEncoder.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolEncoder.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolEncoder.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolEncoder.c(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolEncoder.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolEncoder.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolEncoder.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolEncoder.f(924646728881890L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolEncoder.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static float s(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.y(object);
    }

    private void X(Object object, float f) {
        this.J.H(object, f);
    }

    private float U(Object object) {
        return this.E.x(object);
    }

    private void E(Object object, String string) {
        this.p.l(object, string);
    }

    private double Z(Object object) {
        return this.j.C(object);
    }

    public float D(Object object) {
        return this.V.x(object);
    }

    static int k(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.e(object);
    }

    static float b(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.N(object);
    }

    private void X(Object object, double d2) {
        this.D.A(object, d2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolEncoder.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolEncoder.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private int e(Object object) {
        return this.s.R(object);
    }

    private float I(Object object) {
        return this.o.x(object);
    }

    public void K(Object object, float f) {
        this.V.H(object, f);
    }

    private float H(Object object) {
        return this.J.x(object);
    }

    public static AbstractComputationKernel[] J() {
        return Y;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void w(Object object, float f) {
        this.S.H(object, f);
    }

    public int p(Object object) {
        return this.U.R(object);
    }

    static void A(NetworkProtocolEncoder networkProtocolEncoder, Object object, String string) {
        networkProtocolEncoder.E(object, string);
    }

    private double r(Object object) {
        return this.D.C(object);
    }

    static void e(NetworkProtocolEncoder networkProtocolEncoder, Object object, float f) {
        networkProtocolEncoder.w(object, f);
    }

    static float n(NetworkProtocolEncoder networkProtocolEncoder, Object object) {
        return networkProtocolEncoder.I(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

