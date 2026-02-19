/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.app.configuration.ConfigurationProfileManager1692;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.messaging.core.MessageRouter;
import com.security.access.SecurityAccessController1588;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.NetworkEncryptionManager;
import com.ui.events.UserInteractionEventDispatcher;
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

public class DataTransformationCoordinator527
extends NetworkEncryptionManager {
    private static final long[] jb;
    private static final Object[] ob;
    private static final Integer[] kb;
    private static final Map lb;
    private SecurityAccessController1588 tC;
    private static final String[] pb;
    private static final long ab;

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

    @Override
    public String w() {
        return super.w();
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void G() {
        String string;
        block4: {
            long l;
            block3: {
                l = ab ^ 0x5AB2A56810D6L;
                super.G();
                string = this.tC.n();
                try {
                    if (this.Y()) break block3;
                    if (this.tC.x().equals(this.tC.n())) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationCoordinator527.a(customSystemException);
                }
                string = (String)((Object)DataTransformationCoordinator527.e("J", (int)DataTransformationCoordinator527.c("i", (int)23644, (long)(0x27DB3C9E243F5D1FL ^ l)), (long)8938334782106471292L, (long)l)) + this.tC.H();
                break block4;
            }
            if (this.tC instanceof ConfigurationProfileManager1692) {
                ConfigurationProfileManager1692 configurationProfileManager1692 = (ConfigurationProfileManager1692)this.tC;
                string = (String)((Object)DataTransformationCoordinator527.e("J", (int)DataTransformationCoordinator527.c("i", (int)12491, (long)(0x5BB2838C8814318CL ^ l)), (long)8938334782106471292L, (long)l)) + configurationProfileManager1692.p().j();
            }
        }
        this.f(string);
    }

    private static void i() {
        Object[] objectArray = ob;
        ob[0] = "j7i";
        objectArray[1] = Integer.TYPE;
        DataTransformationCoordinator527.pb[1] = "java/lang/Integer";
        objectArray[2] = "\u000e\u0003W%9=\u0005\fFjD%\u0016\u000bO#";
        objectArray[3] = "6b$S>~=m5\u001c_p6f1F";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004yEy.1C&DD( >p\u001c+}5Nt\u0015&)[\u00075^{89\u00030\u001c~C";
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataTransformationCoordinator527.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataTransformationCoordinator527.ab = MultiContainerRegistry.a(-4393165027152034049L, 3416754785251286867L, MethodHandles.lookup().lookupClass()).a(125344354625812L);
                DataTransformationCoordinator527.ob = new Object[5];
                DataTransformationCoordinator527.pb = new String[5];
                DataTransformationCoordinator527.i();
                DataTransformationCoordinator527.lb = new HashMap<K, V>(13);
                var0 = DataTransformationCoordinator527.ab ^ 23335270242228L;
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
                var6_5 = "\u00ecm\u00ffC\u00ebAb?\u00fa\u00fe\u00da-\u001d\u00ad\u00eb\u00de\u0005\u0007O\u009e\bwi\u00e9";
                var7_6 = "\u00ecm\u00ffC\u00ebAb?\u00fa\u00fe\u00da-\u001d\u00ad\u00eb\u00de\u0005\u0007O\u009e\bwi\u00e9".length();
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
                    var6_5 = "p\u00b8\t\u00f4\u00d0K\u000b\u00be\u0084\u0090{[\u0011\u0016M\u0014";
                    var7_6 = "p\u00b8\t\u00f4\u00d0K\u000b\u00be\u0084\u0090{[\u0011\u0016M\u0014".length();
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
        DataTransformationCoordinator527.jb = var8_3;
        DataTransformationCoordinator527.kb = new Integer[5];
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataTransformationCoordinator527.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataTransformationCoordinator527.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field k(long l, long l2) {
        int n = DataTransformationCoordinator527.i(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataTransformationCoordinator527.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataTransformationCoordinator527.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataTransformationCoordinator527.e(clazz3, string2, clazz2)) != null) {
                    DataTransformationCoordinator527.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataTransformationCoordinator527.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataTransformationCoordinator527.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataTransformationCoordinator527.j(280793088823330L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public DataTransformationCoordinator527(SecurityAccessController1588 securityAccessController1588) {
        long l = ab ^ 0x543C0A2FD583L;
        super(DataTransformationCoordinator527.M.Y, securityAccessController1588.n());
        this.tC = securityAccessController1588;
        if (securityAccessController1588 instanceof ConfigurationProfileManager1692) {
            this.m((String)((Object)DataTransformationCoordinator527.e("J", (int)DataTransformationCoordinator527.c("i", (int)9506, (long)(0x37B13741901F6133L ^ l)), (long)-5089535222790336983L, (long)l)));
            this.A(DataTransformationCoordinator527.M.f);
        }
        this.Z(0.0f);
        this.T(99.0);
        this.J(true);
        this.R(new MessageRouter(this, securityAccessController1588));
        this.g((String)((Object)DataTransformationCoordinator527.e("J", (int)DataTransformationCoordinator527.c("i", (int)445, (long)(0x3D251C4DF9D245ADL ^ l)), (long)-5089535222790336983L, (long)l)));
        this.r().g((String)((Object)DataTransformationCoordinator527.e("J", (int)DataTransformationCoordinator527.c("i", (int)28727, (long)(0x4E40B54D529EB424L ^ l)), (long)-5089535222790336983L, (long)l)));
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataTransformationCoordinator527.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block4: {
            boolean bl;
            SecurityAccessController1588 securityAccessController1588;
            block6: {
                block5: {
                    try {
                        try {
                            super.Z(userInteractionEventDispatcher);
                            if (!userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) break block4;
                            securityAccessController1588 = this.tC;
                            if (this.tC.F()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationCoordinator527.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationCoordinator527.a(customSystemException);
                    }
                }
                bl = false;
            }
            securityAccessController1588.U(bl);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'd' || c == 'Y' || c == '\u00f9' || c == '\u00e1') {
                field = DataTransformationCoordinator527.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataTransformationCoordinator527.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D4D;
        if (kb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = jb[n2];
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
                throw new RuntimeException("a/bz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataTransformationCoordinator527.kb[n2] = n3;
        }
        return kb[n2];
    }

    private static Method l(long l, long l2) {
        int n = DataTransformationCoordinator527.i(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataTransformationCoordinator527.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataTransformationCoordinator527.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataTransformationCoordinator527.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataTransformationCoordinator527.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataTransformationCoordinator527.j(280793088823330L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataTransformationCoordinator527.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataTransformationCoordinator527.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataTransformationCoordinator527.j(280793088823330L, 0L);
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 63;
                break;
            }
            case 1: {
                n3 = 44;
                break;
            }
            case 2: {
                n3 = 15;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 29;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 9;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 26;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 46;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 30;
                break;
            }
            case 22: {
                n3 = 0;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 60;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 48;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 32;
                break;
            }
            case 33: {
                n3 = 19;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 39;
                break;
            }
            case 37: {
                n3 = 34;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 13;
                break;
            }
            case 40: {
                n3 = 31;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 18;
                break;
            }
            case 45: {
                n3 = 62;
                break;
            }
            case 46: {
                n3 = 38;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 59;
                break;
            }
            case 55: {
                n3 = 40;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 36;
                break;
            }
            case 58: {
                n3 = 25;
                break;
            }
            case 59: {
                n3 = 11;
                break;
            }
            case 60: {
                n3 = 43;
                break;
            }
            case 61: {
                n3 = 61;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 16;
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
        DataTransformationCoordinator527.pb[n4] = new String(cArray);
        return n4;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataTransformationCoordinator527.i(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                DataTransformationCoordinator527.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public boolean O() {
        return this.tC.F();
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = DataTransformationCoordinator527.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataTransformationCoordinator527.f(classArray[i], string, clazz2);
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
            return MethodHandles.lookup().findStatic(DataTransformationCoordinator527.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DataTransformationCoordinator527.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

