/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package com.security.resource;

import a.E8;
import a.a;
import a.aO;
import a.kg;
import a.oD;
import a.tl;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.config.schema.ConfigurationSchemaResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.game.event.GameEventOrchestrator;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.graphics.rendering.RenderingPipelineController;
import com.math.geometry.GeometryCalculator;
import com.media.transcoding.MediaTranscodingEngine;
import com.messaging.routing.MessageRoutingService1592;
import com.network.configuration.NetworkConfigManager;
import com.network.connections.NetworkConnectionManager1584;
import com.network.interface.NetworkInterfaceManager;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.security.cryptography.CryptographicResourceManager;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class SecureResourceAllocator346
extends ReflectionMetadataExtractor1376 {
    public final AuthenticationStateTracker e;
    private static final Integer[] h;
    private static final String[] r;
    MessageRoutingService1592 V;
    public final ConfigurationSchemaResolver n;
    private static final Map j;
    private static final Object[] l;
    NetworkConfigManager m;
    private static final long b;
    private static final long[] d;

    private static Method d(long l, long l2) {
        int n = SecureResourceAllocator346.a(l, l2);
        Object object = SecureResourceAllocator346.l[n];
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
                clazz3 = SecureResourceAllocator346.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureResourceAllocator346.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureResourceAllocator346.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureResourceAllocator346.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureResourceAllocator346.b(253963890372690L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureResourceAllocator346.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureResourceAllocator346.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureResourceAllocator346.b(253963890372690L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5F8;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureResourceAllocator346.h[n2] = n3;
        }
        return h[n2];
    }

    @Override
    public void h() {
        GameEventOrchestrator.setLocked(true);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureResourceAllocator346.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = SecureResourceAllocator346.a(l, l2);
        Object object = SecureResourceAllocator346.l[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureResourceAllocator346.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureResourceAllocator346.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureResourceAllocator346.a(clazz3, string2, clazz2)) != null) {
                    SecureResourceAllocator346.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureResourceAllocator346.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureResourceAllocator346.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureResourceAllocator346.b(253963890372690L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void v() {
        GameEventOrchestrator.setLocked(false);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00a4' || c == 'v' || c == '\u00c3') {
                field = SecureResourceAllocator346.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureResourceAllocator346.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureResourceAllocator346.a(l, l2);
            object = SecureResourceAllocator346.l[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureResourceAllocator346.l[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public SecureResourceAllocator346() {
        long l = b ^ 0x41EC8EBEB887L;
        super(a.cs((int)SecureResourceAllocator346.a("b", (int)23089, (long)(0x4E36CA3D2FB4EB86L ^ l))), CryptographicResourceManager.d, a.cs((int)SecureResourceAllocator346.a("b", (int)27303, (long)(0x61E579938E5F5B13L ^ l))), MediaTranscodingEngine.class);
        this.V = null;
        this.m = new NetworkConfigManager();
        this.e = AuthenticationStateTracker.w(this, (String)((Object)SecureResourceAllocator346.c("\u00f2", (int)SecureResourceAllocator346.a("b", (int)8873, (long)(0x1B69D528EA02931BL ^ l)), (long)3767829122143885582L, (long)l)), false);
        this.n = (ConfigurationSchemaResolver)ConfigurationSchemaResolver.c(this, (String)((Object)SecureResourceAllocator346.c("\u00f2", (int)SecureResourceAllocator346.a("b", (int)29230, (long)(0x4F39CB07F221439BL ^ l)), (long)3767829122143885582L, (long)l)), (String)((Object)SecureResourceAllocator346.c("\u00f2", (int)SecureResourceAllocator346.a("b", (int)31073, (long)(0x743DABEA91A248D7L ^ l)), (long)3767829122143885582L, (long)l)), (String)((Object)SecureResourceAllocator346.c("\u00f2", (int)SecureResourceAllocator346.a("b", (int)30489, (long)(0x11AE43ABDBE1C6A3L ^ l)), (long)3767829122143885582L, (long)l))).Z(true);
        this.N(this.e, this.n);
        this.s((String)((Object)SecureResourceAllocator346.c("\u00f2", (int)SecureResourceAllocator346.a("b", (int)31913, (long)(0xDED5496F49C4D19L ^ l)), (long)3767829122143885582L, (long)l)));
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureResourceAllocator346.b = MultiContainerRegistry.a(-7684834879301923734L, -44069504474538083L, MethodHandles.lookup().lookupClass()).a(170572610409068L);
                SecureResourceAllocator346.l = new Object[5];
                SecureResourceAllocator346.r = new String[5];
                SecureResourceAllocator346.a();
                SecureResourceAllocator346.j = new HashMap<K, V>(13);
                var0 = SecureResourceAllocator346.b ^ 76536601146878L;
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "\u0080\u0081\u007f[}\u00c7\u00eb\u0082\u00daA_H?$\u00f6F\u0003~\u00ca\u00b4)E\u0006\u0006S\u00cb\u00ca\u00be\u00f84\fC\u00a7fKM\u00e2\u00ce8f\u00e6\u00c8:b\u00aa\u0081o\u00fd\u00ca\u0091 o\u00bb9\u00d4\u0011\u00f3v3!\u00e8\u001c\u0093\u00f5\u00e6\u008a'\u008e\u001fU\u000e\u00a0%\u00f3\u0083\u00bb\u009dn\u00dev\u0084B\u00ec\u00edT\u001at\u001e\u00c9\u00a4\u008bJy\u0017L\u000e";
                var7_6 = "\u0080\u0081\u007f[}\u00c7\u00eb\u0082\u00daA_H?$\u00f6F\u0003~\u00ca\u00b4)E\u0006\u0006S\u00cb\u00ca\u00be\u00f84\fC\u00a7fKM\u00e2\u00ce8f\u00e6\u00c8:b\u00aa\u0081o\u00fd\u00ca\u0091 o\u00bb9\u00d4\u0011\u00f3v3!\u00e8\u001c\u0093\u00f5\u00e6\u008a'\u008e\u001fU\u000e\u00a0%\u00f3\u0083\u00bb\u009dn\u00dev\u0084B\u00ec\u00edT\u001at\u001e\u00c9\u00a4\u008bJy\u0017L\u000e".length();
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
                    var6_5 = "\u008b>pP\u00e9\u00ed)P\u00a9HI\u0087\u00da\u00db\u0097~";
                    var7_6 = "\u008b>pP\u00e9\u00ed)P\u00a9HI\u0087\u00da\u00db\u0097~".length();
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
        SecureResourceAllocator346.d = var8_3;
        SecureResourceAllocator346.h = new Integer[14];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n4] != null) {
            return n4;
        }
        Object object = SecureResourceAllocator346.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 6;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 5;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 17;
                break;
            }
            case 5: {
                n3 = 27;
                break;
            }
            case 6: {
                n3 = 23;
                break;
            }
            case 7: {
                n3 = 25;
                break;
            }
            case 8: {
                n3 = 45;
                break;
            }
            case 9: {
                n3 = 53;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 55;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 42;
                break;
            }
            case 15: {
                n3 = 61;
                break;
            }
            case 16: {
                n3 = 29;
                break;
            }
            case 17: {
                n3 = 57;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 0;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 22: {
                n3 = 39;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 34;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 20;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 43;
                break;
            }
            case 29: {
                n3 = 31;
                break;
            }
            case 30: {
                n3 = 12;
                break;
            }
            case 31: {
                n3 = 56;
                break;
            }
            case 32: {
                n3 = 22;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 46;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 48;
                break;
            }
            case 37: {
                n3 = 19;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 7;
                break;
            }
            case 40: {
                n3 = 4;
                break;
            }
            case 41: {
                n3 = 51;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 58;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 13;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 62;
                break;
            }
            case 57: {
                n3 = 8;
                break;
            }
            case 58: {
                n3 = 59;
                break;
            }
            case 59: {
                n3 = 14;
                break;
            }
            case 60: {
                n3 = 28;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 50;
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
        SecureResourceAllocator346.r[n4] = new String(cArray);
        return n4;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureResourceAllocator346.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecureResourceAllocator346.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureResourceAllocator346.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureResourceAllocator346.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureResourceAllocator346.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "~\u0004V";
        objectArray[1] = Integer.TYPE;
        SecureResourceAllocator346.r[1] = "java/lang/Integer";
        objectArray[2] = "Sn\u0007\u00160oXa\u0016YMwKf\u001f\u0010";
        objectArray[3] = "=@e;v&6Ott\u0017(=Dp.";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "N\u0006Q_/\rJ\u001d\u0016#*G+\u000eV^*R\u0017\u0001\u0013FA\u0005V\u0016V\u001f+[P\u000eU#";
    }

    private String g(String string, String string2, String string3) {
        String string4;
        block33: {
            int n;
            string4 = string2;
            char[] cArray = string2.toCharArray();
            String string5 = "";
            for (int i = 0; i < cArray.length; ++i) {
                char c = cArray[i];
                try {
                    if (c == '\u00a7') {
                        ++i;
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator346.a(customSystemException);
                }
                try {
                    if (Integer.valueOf(c) > 1000) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator346.a(customSystemException);
                }
                string5 = string5 + String.valueOf(c);
            }
            string5 = string5.toLowerCase();
            string2 = string2.toLowerCase();
            if (!string5.contains(string = string.toLowerCase())) break block33;
            char[] cArray2 = string.toCharArray();
            char[] cArray3 = string2.toCharArray();
            int n2 = 0;
            int n3 = -1;
            int n4 = -1;
            int n5 = cArray2.length;
            int n6 = 0;
            while (true) {
                block30: {
                    block31: {
                        block32: {
                            block29: {
                                try {
                                    try {
                                        if (n6 >= cArray3.length) break;
                                        if (n2 <= cArray2.length - 1) break block29;
                                        break block30;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecureResourceAllocator346.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SecureResourceAllocator346.a(customSystemException);
                                }
                            }
                            n = cArray3[n6];
                            try {
                                if (n != cArray2[n2]) break block31;
                                if (n3 != -1) break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureResourceAllocator346.a(customSystemException);
                            }
                            n3 = n6;
                        }
                        if (++n2 == n5) {
                            n4 = n6;
                        }
                        break block30;
                    }
                    try {
                        try {
                            if (n3 == -1 || n != 167) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator346.a(customSystemException);
                        }
                        ++n6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureResourceAllocator346.a(customSystemException);
                    }
                }
                ++n6;
            }
            try {
                try {
                    if (n3 == -1 || n4 == -1) break block33;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator346.a(customSystemException);
                }
                if (n4 <= n3) break block33;
            }
            catch (CustomSystemException customSystemException) {
                throw SecureResourceAllocator346.a(customSystemException);
            }
            String string6 = "";
            n = 0;
            while (true) {
                block35: {
                    block34: {
                        try {
                            try {
                                if (n >= cArray3.length) break;
                                if (n < n3) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureResourceAllocator346.a(customSystemException);
                            }
                            if (n <= n4) break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator346.a(customSystemException);
                        }
                    }
                    string6 = string6 + cArray3[n];
                }
                if (n == n3) {
                    string6 = string6 + string3;
                }
                ++n;
            }
            string4 = string6;
        }
        return string4;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public kg q(double d2, double d3, boolean bl) {
        long l;
        block31: {
            l = b ^ 0x6A2A75AD269DL;
            boolean bl2 = false;
            if (ApplicationLifecycleManager.g() != null) {
                bl2 = ApplicationLifecycleManager.E();
            }
            try {
                if (this.V == null) {
                    return new kg(0.0, 0.0, 0.0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecureResourceAllocator346.a(customSystemException);
            }
            try {
                try {
                    if (!bl2 && !this.m.m(10000L)) break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator346.a(customSystemException);
                }
                this.V = null;
                return new kg(0.0, 0.0, 0.0);
            }
            catch (CustomSystemException customSystemException) {
                throw SecureResourceAllocator346.a(customSystemException);
            }
        }
        boolean bl3 = GL11.glIsEnabled((int)3042);
        try {
            if (bl3) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceAllocator346.a(customSystemException);
        }
        boolean bl4 = this.e.s();
        E8 e8 = ApplicationLifecycleManager.X();
        NetworkConnectionManager1584 networkConnectionManager1584 = this.V.f();
        GameEventOrchestrator.setLocked(false);
        ArrayList arrayList = networkConnectionManager1584.F(this.V);
        GameEventOrchestrator.setLocked(true);
        ArrayList arrayList2 = Lists.newArrayList((Iterable)Iterables.filter(arrayList, (Predicate)new aO(this)));
        arrayList = arrayList2.size() > 15 ? Lists.newArrayList((Iterable)Iterables.skip((Iterable)arrayList2, (int)(arrayList.size() - 15))) : arrayList2;
        int n = e8.L(this.V.G());
        for (NetworkInterfaceManager networkInterfaceManager : arrayList) {
            oD oD2 = networkConnectionManager1584.W(networkInterfaceManager.F());
            String string = oD.C(oD2, networkInterfaceManager.F()) + (String)((Object)SecureResourceAllocator346.c("\u00f2", (int)SecureResourceAllocator346.a("b", (int)2710, (long)(0x4BFFD98ED0B6253FL ^ l)), (long)-6174383028403337452L, (long)l));
            if (bl4) {
                string = string + " \u00a7c" + networkInterfaceManager.b();
            }
            n = Math.max(n, e8.L(string));
        }
        int n2 = arrayList.size() * e8.I();
        int n3 = (int)(d3 + (double)n2) + 8;
        int n4 = 3;
        int n5 = (int)d2 + 1;
        int n6 = 0;
        double d4 = n;
        double d5 = 0.0;
        Map map = (Map)this.n.J();
        for (NetworkInterfaceManager networkInterfaceManager : arrayList) {
            block35: {
                int n7;
                String string;
                block33: {
                    String string2;
                    block32: {
                        ++n6;
                        oD oD3 = networkConnectionManager1584.W(networkInterfaceManager.F());
                        string2 = oD.C(oD3, networkInterfaceManager.F());
                        for (String string3 : map.keySet()) {
                            String string4 = (String)map.get(string3);
                            string2 = this.g(string3, string2, string4);
                        }
                        string = "\u00a7c" + networkInterfaceManager.b();
                        n7 = n3 - n6 * e8.I();
                        if (bl) {
                            float f = n5 - 2;
                            float f2 = n7;
                            float f3 = (float)((double)n5 + d4);
                            float f4 = n7 + e8.I();
                            float f5 = f3 - f;
                            float f6 = f4 - f2;
                            ConfigurationManager.H(f, f2, f5, f6, new Color((int)SecureResourceAllocator346.a("b", (int)13732, (long)(0x261F233128419A0FL ^ l)), true));
                        }
                        d5 += (double)e8.I();
                        try {
                            if (GeometryCalculator.C() < 35) break block32;
                            e8.U(DataTransformationEngine1209.i(), new RenderingPipelineController(oD3, networkInterfaceManager.F()), n5, n7, -1);
                            break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator346.a(customSystemException);
                        }
                    }
                    e8.u(string2, n5, n7, (int)SecureResourceAllocator346.a("b", (int)13657, (long)(0x64A997A6D9011AFBL ^ l)));
                }
                try {
                    if (bl4) {
                        e8.u(string, (double)n5 + d4 - (double)e8.L(string), n7, (int)SecureResourceAllocator346.a("b", (int)1543, (long)(0x2730EC49855DA9A4L ^ l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator346.a(customSystemException);
                }
                tl.a(1.0f, 1.0f, 1.0f, 1.0f);
                if (n6 == arrayList.size()) {
                    String string5;
                    block34: {
                        string5 = this.V.G();
                        for (String string6 : map.keySet()) {
                            String string7 = (String)map.get(string6);
                            string5 = this.g(string6, string5, string7);
                        }
                        try {
                            if (bl) {
                                ConfigurationManager.A(n5 - 2, n7 - e8.I() - 1, d4 - 2.0, e8.I(), new Color((int)SecureResourceAllocator346.a("b", (int)775, (long)(0x7D29CD5B1D272CA2L ^ l)), true));
                                ConfigurationManager.A(n5 - 2, n7 - 1, d4 - 2.0, 1.0, new Color((int)SecureResourceAllocator346.a("b", (int)7497, (long)(0x5F047F747EE8B2E8L ^ l)), true));
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator346.a(customSystemException);
                        }
                        try {
                            if (GeometryCalculator.C() < 35) break block34;
                            e8.U(DataTransformationEngine1209.i(), this.V.H(), n5 + n / 2 - e8.L(string5) / 2, n7 - e8.I(), -1);
                            break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator346.a(customSystemException);
                        }
                    }
                    e8.u(string5, n5 + n / 2 - e8.L(string5) / 2, n7 - e8.I(), (int)SecureResourceAllocator346.a("b", (int)15300, (long)(0x2AB00BF2283C1460L ^ l)));
                }
            }
            tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        try {
            if (bl3) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceAllocator346.a(customSystemException);
        }
        return new kg(d4, d5 + 5.0, 0.0);
    }

    public void Q(MessageRoutingService1592 messageRoutingService1592) {
        this.V = messageRoutingService1592;
        this.m.m();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureResourceAllocator346.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecureResourceAllocator346.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

