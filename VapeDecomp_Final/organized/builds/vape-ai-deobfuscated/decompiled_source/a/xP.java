/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.oQ;
import a.oZ;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.event.EventTrigger;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.output.processing.OutputEncoder;
import com.resource.allocation.ResourceAllocationManager2527;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.tokens.CryptographicTokenGenerator;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
import com.ui.configuration.DisplayConfigurationManager;
import com.util.numeric.NumericFormattingUtility;
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

public class xP
extends ContextTransformationEngine<CryptographicTokenGenerator> {
    private boolean T;
    private static final long[] j;
    private static final long h;
    private final NumericFormattingUtility v;
    private boolean e;
    private static final Map m;
    private CryptographicTokenGenerator z;
    private final NetworkConfigManager n;
    private final NetworkConfigManager d;
    private long Y;
    protected final AuthenticationStateTracker Z;
    private static final Integer[] l;
    private static final String[] r;
    private static final Object[] o;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xP.h = MultiContainerRegistry.a(5156181678112674933L, -6203376619205227646L, MethodHandles.lookup().lookupClass()).a(113939539637093L);
                xP.o = new Object[5];
                xP.r = new String[5];
                xP.a();
                xP.m = new HashMap<K, V>(13);
                var0 = xP.h ^ 17647894395795L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = ".\u00aa\u001a\u00bf\u0001\u00ed\u00ecA\u00bbFu:\u008d\u00db\u0084\u00a2\u001e\u00f4\u0098\u00ea\u00fcM:,\u00dbIE\u00cd\u008b]B\u00c3\"W\u009cz\u0001\u0095K\u00d9";
                var7_6 = ".\u00aa\u001a\u00bf\u0001\u00ed\u00ecA\u00bbFu:\u008d\u00db\u0084\u00a2\u001e\u00f4\u0098\u00ea\u00fcM:,\u00dbIE\u00cd\u008b]B\u00c3\"W\u009cz\u0001\u0095K\u00d9".length();
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
                    var6_5 = "Z=4o\t>\u00edU-(\u0080l|\u00f9&O";
                    var7_6 = "Z=4o\t>\u00edU-(\u0080l|\u00f9&O".length();
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
        xP.j = var8_3;
        xP.l = new Integer[7];
    }

    @DataExchangeProtocol2090
    public void Q(DisplayConfigurationManager displayConfigurationManager) {
        this.z.Z();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = xP.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = xP.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public xP(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = h ^ 0xEE35C5C9E20L;
        super(contextualExecutionFramework, string);
        this.v = NumericFormattingUtility.K(this, (String)((Object)xP.c("G", (int)xP.a("a", (int)8091, (long)(0x674FF6028532D6E8L ^ l)), (long)732245329447467743L, (long)l)), (String)((Object)xP.c("G", (int)xP.a("a", (int)22236, (long)(0x26727854263D1FAEL ^ l)), (long)732245329447467743L, (long)l)), "", 0.0, 100.0, 200.0, 500.0, 1.0, (String)((Object)xP.c("G", (int)xP.a("a", (int)5271, (long)(0x1DB2A6329D8D5DE0L ^ l)), (long)732245329447467743L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)xP.c("G", (int)xP.a("a", (int)26424, (long)(0x71491E7641E9AE4DL ^ l)), (long)732245329447467743L, (long)l)), false, (String)((Object)xP.c("G", (int)xP.a("a", (int)10531, (long)(0x3716DC4BC95E6057L ^ l)), (long)732245329447467743L, (long)l)));
        this.z = (CryptographicTokenGenerator)this.n();
        this.d = new NetworkConfigManager();
        this.n = new NetworkConfigManager();
        this.e = false;
        this.N(this.v, this.Z);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xP.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = xP.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void h() {
        this.Y = (long)this.v.l();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = xP.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = xP.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = xP.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xP.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        xP.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xP.b(270484430651848L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = xP.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        xP.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xP.b(270484430651848L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'W' || c == 'Z' || c == '\u00d3') {
                field = xP.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xP.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x435F;
        if (xP.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xP.l[n2] = n3;
        }
        return xP.l[n2];
    }

    private static Field c(long l, long l2) {
        int n = xP.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = xP.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = xP.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xP.a(clazz3, string2, clazz2)) != null) {
                    xP.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = xP.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        xP.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xP.b(270484430651848L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 4;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 36;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 25;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 7;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 12;
                break;
            }
            case 25: {
                n3 = 58;
                break;
            }
            case 26: {
                n3 = 44;
                break;
            }
            case 27: {
                n3 = 50;
                break;
            }
            case 28: {
                n3 = 14;
                break;
            }
            case 29: {
                n3 = 60;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 5;
                break;
            }
            case 32: {
                n3 = 0;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 45;
                break;
            }
            case 35: {
                n3 = 53;
                break;
            }
            case 36: {
                n3 = 22;
                break;
            }
            case 37: {
                n3 = 62;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 3;
                break;
            }
            case 40: {
                n3 = 28;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 43;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 46: {
                n3 = 24;
                break;
            }
            case 47: {
                n3 = 59;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 18;
                break;
            }
            case 50: {
                n3 = 34;
                break;
            }
            case 51: {
                n3 = 17;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 52;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 54;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 39;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 63;
                break;
            }
            case 62: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 38;
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
        xP.r[n4] = new String(cArray);
        return n4;
    }

    public boolean T(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block18: {
            block17: {
                try {
                    if (ApplicationLifecycleManager.X().r()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw xP.a(customSystemException);
                }
                try {
                    try {
                        if (!this.Z.s().booleanValue() || DynamicContextBroker.s(ApplicationLifecycleManager.N().f())) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xP.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw xP.a(customSystemException);
                }
            }
            try {
                if (systemConfigurationOrchestrator.T()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw xP.a(customSystemException);
            }
            try {
                try {
                    if (!this.z.f() || !((double)systemConfigurationOrchestrator.S() < this.z.Z())) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw xP.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw xP.a(customSystemException);
            }
        }
        try {
            if (!((CryptographicTokenGenerator)this.n()).b()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw xP.a(customSystemException);
        }
        return true;
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "mVg";
        objectArray[1] = Integer.TYPE;
        xP.r[1] = "java/lang/Integer";
        objectArray[2] = "\u0011qJ${g\u001a~[k\u0006\u007f\tyR\"";
        objectArray[3] = "k32\u0000je`<#O\u000bkk7'\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\n\\\u000b\u001cA&^KLa[=;E\u000b\\M+]Z\u0018\u001f0\u007f@\u0004\u000e\u000eA'X\u0000\u000ea";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = xP.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = xP.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                xP.o[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = xP.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void M(ResourceAllocationManager2527 resourceAllocationManager2527) {
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
        block46: {
            float f;
            block44: {
                boolean bl;
                block45: {
                    boolean bl2;
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                    block43: {
                        block41: {
                            Object object;
                            block47: {
                                block42: {
                                    boolean bl3;
                                    long l = h ^ 0x69F02250BAEEL;
                                    try {
                                        if (!resourceAllocationManager2527.getEntity().equals(ApplicationLifecycleManager.U())) {
                                            return;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xP.a(customSystemException);
                                    }
                                    CallSite callSite = xP.c("G", (int)xP.a("a", (int)5374, (long)(0x1394CD8F79947941L ^ l)), (long)3379690026092437009L, (long)l);
                                    if (GeometryCalculator.C() >= 35) {
                                        callSite = xP.c("G", (int)xP.a("a", (int)26116, (long)(0x725823A999170BBCL ^ l)), (long)3379690026092437009L, (long)l);
                                    }
                                    try {
                                        if (!Thread.currentThread().getName().equals(callSite)) {
                                            return;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xP.a(customSystemException);
                                    }
                                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                    try {
                                        if (!this.T(systemConfigurationOrchestrator)) {
                                            return;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xP.a(customSystemException);
                                    }
                                    oZ oZ2 = systemConfigurationOrchestrator.W();
                                    ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
                                    connectionPoolOrchestrator1192 = executionStateTracker.f();
                                    this.T = DynamicContextBroker.s(connectionPoolOrchestrator1192);
                                    bl2 = false;
                                    f = oZ2.t();
                                    if (ConfigurationCalibrator.b.P()) {
                                        f = 0.0f;
                                        if (DynamicContextBroker.s(executionStateTracker.s())) {
                                            f += 1.0f;
                                        }
                                        if (DynamicContextBroker.s(executionStateTracker.w())) {
                                            f -= 1.0f;
                                        }
                                    }
                                    try {
                                        boolean bl4 = bl3 = f <= 0.0f;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xP.a(customSystemException);
                                    }
                                    if (f > 0.0f) {
                                        bl3 = false;
                                    }
                                    try {
                                        try {
                                            if (!bl3 || !systemConfigurationOrchestrator.j()) break block41;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw xP.a(customSystemException);
                                        }
                                        if (GeometryCalculator.C() < 15) break block42;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xP.a(customSystemException);
                                    }
                                    object = systemConfigurationOrchestrator.L();
                                    break block47;
                                }
                                Object object2 = systemConfigurationOrchestrator.L();
                                object = ((oQ)object2).h();
                            }
                            double d2 = systemConfigurationOrchestrator.G();
                            double d3 = -1.0;
                            double d4 = systemConfigurationOrchestrator.o();
                            oQ oQ2 = ((oQ)object).B(-0.2, 0.0, -0.2).s(d2, d3, d4);
                            int n = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2).size();
                            if (n == 0) {
                                bl2 = true;
                            }
                        }
                        bl = false;
                        try {
                            try {
                                if (bl2 || this.d.m(this.Y)) break block43;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xP.a(customSystemException);
                            }
                            if (this.Y <= 30L) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xP.a(customSystemException);
                        }
                        bl2 = true;
                        bl = true;
                    }
                    try {
                        try {
                            try {
                                if (!systemConfigurationOrchestrator.j()) return;
                                if (!bl2) break block44;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xP.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.H()) break block45;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xP.a(customSystemException);
                        }
                        this.Y = (long)this.v.l();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xP.a(customSystemException);
                    }
                }
                try {
                    OutputEncoder.f(connectionPoolOrchestrator1192, true);
                    this.n.m();
                    if (bl) return;
                    this.d.m();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw xP.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (!this.Z.s().booleanValue()) break block46;
                        if (this.n.m(1000L)) return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xP.a(customSystemException);
                    }
                    if (!(f < 0.0f)) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw xP.a(customSystemException);
                }
                OutputEncoder.f(connectionPoolOrchestrator1192, false);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw xP.a(customSystemException);
            }
        }
        try {
            if (this.T) return;
            OutputEncoder.f(connectionPoolOrchestrator1192, false);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw xP.a(customSystemException);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void B(EventTrigger eventTrigger) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (!this.T(systemConfigurationOrchestrator)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw xP.a(customSystemException);
        }
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = executionStateTracker.f();
        OutputEncoder.f(connectionPoolOrchestrator1192, this.T);
        this.e = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

