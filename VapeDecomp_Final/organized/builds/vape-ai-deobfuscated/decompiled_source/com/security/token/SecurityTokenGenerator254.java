/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.xml.generation.XmlGenerator;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.financial.validation.TransactionValidator2345;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cipher.CipherConfigurationEnum;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.ResourceAllocator1606;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecurityTokenGenerator254
extends XmlGenerator {
    private final GenericAdapterManager A;
    private static final long[] d;
    private final HashMap<AuthenticationGateway1860, CipherConfigurationEnum> m;
    private boolean X;
    private final Map<Integer, Integer> T;
    private static final Integer[] e;
    private CipherConfigurationEnum z;
    private int l;
    private boolean N;
    private final GenericAdapterManager O;
    private static final String[] r;
    private final NumericPrecisionTransformer j;
    private static final long b;
    private static final Map h;
    private int x;
    private final NetworkConfigManager v;
    private static final Object[] n;
    private boolean o;

    private static Field c(long l, long l2) {
        int n = SecurityTokenGenerator254.a(l, l2);
        Object object = SecurityTokenGenerator254.n[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = SecurityTokenGenerator254.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecurityTokenGenerator254.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecurityTokenGenerator254.a(clazz3, string2, clazz2)) != null) {
                    SecurityTokenGenerator254.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecurityTokenGenerator254.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecurityTokenGenerator254.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecurityTokenGenerator254.b(268801986403489L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void I(int n, int n2) {
        int n3 = n2;
        int n4 = 0;
        if (this.x == 1) {
            n3 = n;
        }
        try {
            ApplicationLifecycleManager.n().e(ApplicationLifecycleManager.U().t().D(), n3, 0, n4, ApplicationLifecycleManager.U());
            ++this.x;
            if (this.x >= 3) {
                this.x = 0;
                ++this.l;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator254.a(customSystemException);
        }
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecurityTokenGenerator254.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x114;
        if (e[n2] == null) {
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
                throw new RuntimeException("a/xS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecurityTokenGenerator254.e[n2] = n3;
        }
        return e[n2];
    }

    public SecurityTokenGenerator254() {
        long l = b ^ 0x6A3BB55B980L;
        super(a.cs((int)SecurityTokenGenerator254.a("p", (int)16107, (long)(0x2F6EEF02C14C236FL ^ l))), RecursiveNodeGraph.W, a.cs((int)SecurityTokenGenerator254.a("p", (int)15642, (long)(0x7D3F7672700F209FL ^ l))));
        this.m = new HashMap();
        this.j = NumericPrecisionTransformer.t(this, (String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)21872, (long)(0x25B8DC85D4C48F9L ^ l)), (long)-7162336893032402822L, (long)l)), (String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)31620, (long)(0x620EFFBE98FE6603L ^ l)), (long)-7162336893032402822L, (long)l)), "", 0.0, 100.0, 200.0);
        this.v = new NetworkConfigManager();
        this.T = new HashMap<Integer, Integer>();
        AuthenticationGateway1860 authenticationGateway1860 = new AuthenticationGateway1860((String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)13342, (long)(0x59DE20248703A998L ^ l)), (long)-7162336893032402822L, (long)l)));
        AuthenticationGateway1860 authenticationGateway18602 = new AuthenticationGateway1860((String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)6981, (long)(0x7845BD941AB786CAL ^ l)), (long)-7162336893032402822L, (long)l)));
        AuthenticationGateway1860 authenticationGateway18603 = new AuthenticationGateway1860((String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)4549, (long)(0x110C59D0D3290C48L ^ l)), (long)-7162336893032402822L, (long)l)));
        AuthenticationGateway1860 authenticationGateway18604 = new AuthenticationGateway1860((String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)7157, (long)(0x4147F0A27B19067BL ^ l)), (long)-7162336893032402822L, (long)l)));
        AuthenticationGateway1860 authenticationGateway18605 = new AuthenticationGateway1860((String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)18652, (long)(0x3CD21758575FD550L ^ l)), (long)-7162336893032402822L, (long)l)));
        this.m.put(authenticationGateway1860, CipherConfigurationEnum.DIAMOND);
        this.m.put(authenticationGateway18602, CipherConfigurationEnum.GOLD);
        this.m.put(authenticationGateway18603, CipherConfigurationEnum.IRON);
        this.m.put(authenticationGateway18604, CipherConfigurationEnum.LEATHER);
        this.m.put(authenticationGateway18605, CipherConfigurationEnum.CHAINMAIL);
        this.A = GenericAdapterManager.D(this, (String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)7514, (long)(0x279AC7158ACF80D2L ^ l)), (long)-7162336893032402822L, (long)l)), authenticationGateway1860, this.m.keySet().toArray(new AuthenticationGateway1860[this.m.size()]));
        this.O = GenericAdapterManager.D(this, (String)((Object)SecurityTokenGenerator254.c("Z", (int)SecurityTokenGenerator254.a("p", (int)18223, (long)(0xCE577C5FC165AA5L ^ l)), (long)-7162336893032402822L, (long)l)), authenticationGateway18602, this.m.keySet().toArray(new AuthenticationGateway1860[this.m.size()]));
        this.N(this.A, this.O, this.j);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecurityTokenGenerator254.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecurityTokenGenerator254.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void v() {
        try {
            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) {
                ApplicationLifecycleManager.U().E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator254.a(customSystemException);
        }
    }

    private static Method d(long l, long l2) {
        int n = SecurityTokenGenerator254.a(l, l2);
        Object object = SecurityTokenGenerator254.n[n];
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
                clazz3 = SecurityTokenGenerator254.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecurityTokenGenerator254.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecurityTokenGenerator254.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecurityTokenGenerator254.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecurityTokenGenerator254.b(268801986403489L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecurityTokenGenerator254.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecurityTokenGenerator254.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecurityTokenGenerator254.b(268801986403489L, 0L);
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecurityTokenGenerator254.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecurityTokenGenerator254.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d8' || c == 'k' || c == 'S' || c == 'a') {
                field = SecurityTokenGenerator254.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecurityTokenGenerator254.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "[8|";
        objectArray[1] = Integer.TYPE;
        SecurityTokenGenerator254.r[1] = "java/lang/Integer";
        objectArray[2] = "S%\u0010\u00008jX*\u0001OErK-\b\u0006";
        objectArray[3] = ">;\n\fP\n54\u001bC1\u0004>?\u001f\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "vPhU=?$V~$3+G\u0016(F:/v\t{\u001fXi \u000fx^)j:\rl$";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n4] != null) {
            return n4;
        }
        Object object = SecurityTokenGenerator254.n[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 13;
                break;
            }
            case 1: {
                n3 = 60;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 17;
                break;
            }
            case 4: {
                n3 = 55;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 9;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 35;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 21;
                break;
            }
            case 13: {
                n3 = 45;
                break;
            }
            case 14: {
                n3 = 43;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 1;
                break;
            }
            case 18: {
                n3 = 16;
                break;
            }
            case 19: {
                n3 = 61;
                break;
            }
            case 20: {
                n3 = 58;
                break;
            }
            case 21: {
                n3 = 34;
                break;
            }
            case 22: {
                n3 = 50;
                break;
            }
            case 23: {
                n3 = 3;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 38;
                break;
            }
            case 26: {
                n3 = 0;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 62;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 42;
                break;
            }
            case 31: {
                n3 = 6;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 29;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 53;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 23;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 20;
                break;
            }
            case 44: {
                n3 = 33;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 10;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 36;
                break;
            }
            case 50: {
                n3 = 27;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 15;
                break;
            }
            case 54: {
                n3 = 31;
                break;
            }
            case 55: {
                n3 = 22;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 26;
                break;
            }
            case 59: {
                n3 = 39;
                break;
            }
            case 60: {
                n3 = 28;
                break;
            }
            case 61: {
                n3 = 59;
                break;
            }
            case 62: {
                n3 = 57;
                break;
            }
            default: {
                n3 = 52;
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
        SecurityTokenGenerator254.r[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean S() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        ResourceAllocator1606 resourceAllocator1606 = systemConfigurationOrchestrator.t();
        List<ResourceLifecycleManager1543> list = resourceAllocator1606.D();
        for (int i = 5; i < 9; ++i) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = list.get(i);
            try {
                try {
                    if (!resourceLifecycleManager1543.H() || !RuntimeResourceTracker.l(resourceLifecycleManager1543.y().C())) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator254.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecurityTokenGenerator254.a(customSystemException);
            }
            TransactionValidator2345 transactionValidator2345 = (TransactionValidator2345)TemporalMetadataResolver.h.x().V(resourceLifecycleManager1543.y());
            this.z = transactionValidator2345.P();
            return true;
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void h() {
        long l;
        block4: {
            l = b ^ 0x77D7CB50E3FDL;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                try {
                    if (!systemConfigurationOrchestrator.r() || !systemConfigurationOrchestrator.M().G()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator254.a(customSystemException);
                }
                this.T(false);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SecurityTokenGenerator254.a(customSystemException);
            }
        }
        this.l = (int)SecurityTokenGenerator254.a("p", (int)25823, (long)(0x4D94B8C61925A329L ^ l));
        this.x = 0;
        this.N = false;
        this.o = false;
        this.X = false;
    }

    private boolean v(CipherConfigurationEnum cipherConfigurationEnum) {
        boolean bl;
        block22: {
            block21: {
                int n;
                int n2;
                int n3;
                int n4;
                block20: {
                    block19: {
                        n4 = 0;
                        n3 = 0;
                        n2 = 0;
                        n = 0;
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        ResourceAllocator1606 resourceAllocator1606 = systemConfigurationOrchestrator.t();
                        List<ResourceLifecycleManager1543> list = resourceAllocator1606.D();
                        block18: for (int i = 9; i < 45; ++i) {
                            TransactionValidator2345 transactionValidator2345;
                            ProtocolInteractionController protocolInteractionController;
                            ResourceLifecycleManager1543 resourceLifecycleManager1543 = list.get(i);
                            if (!resourceLifecycleManager1543.H() || !RuntimeResourceTracker.l(protocolInteractionController = resourceLifecycleManager1543.y().C()) || !(transactionValidator2345 = (TransactionValidator2345)TemporalMetadataResolver.h.x().V(resourceLifecycleManager1543.y())).P().equals((Object)cipherConfigurationEnum)) continue;
                            int n5 = RuntimeResourceTracker.m(protocolInteractionController);
                            switch (n5) {
                                case 0: {
                                    n4 = i;
                                    continue block18;
                                }
                                case 1: {
                                    n3 = i;
                                    continue block18;
                                }
                                case 2: {
                                    n2 = i;
                                    continue block18;
                                }
                                case 3: {
                                    n = i;
                                }
                            }
                        }
                        try {
                            try {
                                if (GeometryCalculator.C() >= 35 || GeometryCalculator.C() < 23) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecurityTokenGenerator254.a(customSystemException);
                            }
                            this.T.put(8, n4);
                            this.T.put(7, n3);
                            this.T.put(6, n2);
                            this.T.put(5, n);
                            break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecurityTokenGenerator254.a(customSystemException);
                        }
                    }
                    this.T.put(5, n4);
                    this.T.put(6, n3);
                    this.T.put(7, n2);
                    this.T.put(8, n);
                }
                try {
                    try {
                        try {
                            try {
                                if (n4 == 0 || n3 == 0) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecurityTokenGenerator254.a(customSystemException);
                            }
                            if (n2 == 0) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecurityTokenGenerator254.a(customSystemException);
                        }
                        if (n == 0) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator254.a(customSystemException);
                    }
                    bl = true;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator254.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

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
                SecurityTokenGenerator254.b = MultiContainerRegistry.a(-2844525009676201715L, 1914961898728441244L, MethodHandles.lookup().lookupClass()).a(93355815003731L);
                SecurityTokenGenerator254.n = new Object[5];
                SecurityTokenGenerator254.r = new String[5];
                SecurityTokenGenerator254.a();
                SecurityTokenGenerator254.h = new HashMap<K, V>(13);
                var0 = SecurityTokenGenerator254.b ^ 103299790449044L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u00d6lS\u00b9o\u00ee\u00f3\u00a0h\u00ab~G\u009d6\u00be\u008d\u0099\u00cd\u0004\u00ea\u00858\u00a4\u00d68\u0012\u00e5\u009f\u0002\u0006Ng\u00f2\u00e0\u0005\u00d6\u00e3\u00abJ\u00e7\u00de\u00f8\u00c9\u00ff~\u0093w(\u008cu5N{C\u00b0\u0081\u009f)\u00f0,\u00fa\u00d0\u00de\u00d9#L\u000f\u001ci8\u00fbs\u00c8\u0004)\u00d5a\u0091\u00ed\u00cc";
                var7_6 = "\u00d6lS\u00b9o\u00ee\u00f3\u00a0h\u00ab~G\u009d6\u00be\u008d\u0099\u00cd\u0004\u00ea\u00858\u00a4\u00d68\u0012\u00e5\u009f\u0002\u0006Ng\u00f2\u00e0\u0005\u00d6\u00e3\u00abJ\u00e7\u00de\u00f8\u00c9\u00ff~\u0093w(\u008cu5N{C\u00b0\u0081\u009f)\u00f0,\u00fa\u00d0\u00de\u00d9#L\u000f\u001ci8\u00fbs\u00c8\u0004)\u00d5a\u0091\u00ed\u00cc".length();
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
                    var6_5 = "u\u0019<\u0099\u008a\u001b\u00a9\u0018\u00f2 \u009f\u00a8\u00b2\u007f\u00bb\u00b3";
                    var7_6 = "u\u0019<\u0099\u008a\u001b\u00a9\u0018\u00f2 \u009f\u00a8\u00b2\u007f\u00bb\u00b3".length();
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
        SecurityTokenGenerator254.d = var8_3;
        SecurityTokenGenerator254.e = new Integer[12];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecurityTokenGenerator254.a(l, l2);
            object = SecurityTokenGenerator254.n[n];
            try {
                if (!(object instanceof String)) break block2;
                SecurityTokenGenerator254.n[n] = clazz = Class.forName(r[n]);
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
        int n2 = SecurityTokenGenerator254.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090
    public void Q(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        int n;
        block36: {
            block37: {
                CipherConfigurationEnum cipherConfigurationEnum;
                SecurityTokenGenerator254 securityTokenGenerator254;
                block35: {
                    block31: {
                        block34: {
                            block32: {
                                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                                block33: {
                                    block30: {
                                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                        try {
                                            try {
                                                if (!systemConfigurationOrchestrator.r() || !systemConfigurationOrchestrator.M().G()) break block30;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SecurityTokenGenerator254.a(customSystemException);
                                            }
                                            this.T(false);
                                            return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SecurityTokenGenerator254.a(customSystemException);
                                        }
                                    }
                                    try {
                                        if (this.o) {
                                            this.T(false);
                                            return;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecurityTokenGenerator254.a(customSystemException);
                                    }
                                    try {
                                        if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block31;
                                        if (this.X) break block32;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecurityTokenGenerator254.a(customSystemException);
                                    }
                                    connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().R();
                                    try {
                                        if (GeometryCalculator.C() < 35) break block33;
                                        OutputEncoder.p(connectionPoolOrchestrator1192);
                                        break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecurityTokenGenerator254.a(customSystemException);
                                    }
                                }
                                OutputEncoder.f(connectionPoolOrchestrator1192, true);
                                OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                                break block34;
                            }
                            this.T(false);
                        }
                        return;
                    }
                    n = this.X;
                    try {
                        if (n == 0) {
                            this.X = true;
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator254.a(customSystemException);
                    }
                    try {
                        if (!this.N || !this.v.m(((Double)this.j.J()).longValue())) break block35;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator254.a(customSystemException);
                    }
                    this.v.m();
                    n = this.T.get(this.l);
                    try {
                        this.I(this.l, n);
                        if (this.l > 8) {
                            this.o = true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator254.a(customSystemException);
                    }
                    return;
                }
                n = this.S();
                try {
                    try {
                        if (!this.X || n == 0) break block36;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator254.a(customSystemException);
                    }
                    if (this.N) break block36;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator254.a(customSystemException);
                }
                boolean bl = this.z.equals((Object)this.m.get(this.A.J()));
                try {
                    securityTokenGenerator254 = this;
                    cipherConfigurationEnum = bl ? this.m.get(this.O.J()) : this.m.get(this.A.J());
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator254.a(customSystemException);
                }
                try {
                    if (!securityTokenGenerator254.v(cipherConfigurationEnum)) break block37;
                    this.N = true;
                    break block36;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator254.a(customSystemException);
                }
            }
            this.T(false);
        }
        try {
            if (n == 0) {
                this.T(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator254.a(customSystemException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecurityTokenGenerator254.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecurityTokenGenerator254.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

