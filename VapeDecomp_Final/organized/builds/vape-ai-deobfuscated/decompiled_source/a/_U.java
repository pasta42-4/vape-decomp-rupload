/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.XF;
import com.analysis.metadata.MetadataExtractionEngine213;
import com.app.system.health.HealthJudge;
import com.collections.management.MultiContainerRegistry;
import com.data.collection.CollectionOrchestrator1895;
import com.exception.system.CustomSystemException;
import com.localization.content.MultilingualContentDescriptor;
import com.reflection.util.ContextualReflectionUtility;
import com.resource.management.MultiResourceOrchestrator;
import com.resource.management.ResourceLifecycleManager1859;
import com.security.auth.AuthenticationProtocol;
import com.system.resource.ResourceAllocationTracker144;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _U
implements AuthenticationProtocol {
    protected HealthJudge R;
    protected XF w = new XF();
    private static final String[] f;
    private static final long a;
    private static final long[] b;
    protected String q;
    private static final Integer[] c;
    private String H;
    private String v;
    protected MultilingualContentDescriptor D;
    private static int[] Z;
    private String u = null;
    private boolean N;
    protected HealthJudge i;
    protected XF Q = new XF();
    private static final Object[] e;
    private static final Map d;

    void s(ResourceLifecycleManager1859 resourceLifecycleManager1859) {
        try {
            if (this.D != null) {
                this.D.n = resourceLifecycleManager1859;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _U.b(customSystemException);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = _U.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = _U.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public AuthenticationProtocol N(Class clazz) {
        long l = a ^ 0x2351EE575B8EL;
        this.N = true;
        this.v = clazz.getName().replace((CharSequence)((Object)_U.b("\u00ba", (int)_U.a("d", (int)31846, (long)(0x72A8FCF5F1E0C7EL ^ l)), (long)-2666051162835091560L, (long)l)), (CharSequence)((Object)_U.b("\u00ba", (int)_U.a("d", (int)16569, (long)(0x2009835A2742B0A2L ^ l)), (long)-2666051162835091560L, (long)l)));
        return this;
    }

    public _U s(Class clazz) {
        this.u = ContextualReflectionUtility.w(clazz);
        return this;
    }

    @Override
    public void r(MultiResourceOrchestrator multiResourceOrchestrator, ResourceAllocationTracker144 resourceAllocationTracker144) {
        block8: {
            Object object;
            long l = a ^ 0x6CC14DBF1402L;
            try {
                if (!this.H.equals(_U.b("\u00ba", (int)_U.a("d", (int)3090, (long)(0x21FCEEF51A513381L ^ l)), (long)-7742805932209721324L, (long)l)) || resourceAllocationTracker144.B.size() != 0) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw _U.b(customSystemException);
            }
            String string = (String)((Object)_U.b("\u00ba", (int)_U.a("d", (int)12498, (long)(0x63519B7685DE0F47L ^ l)), (long)-7742805932209721324L, (long)l)) + multiResourceOrchestrator.e + (String)((Object)_U.b("\u00ba", (int)_U.a("d", (int)25777, (long)(0x396240B86904DB23L ^ l)), (long)-7742805932209721324L, (long)l));
            ResourceLifecycleManager1859 resourceLifecycleManager1859 = null;
            ResourceLifecycleManager1859 resourceLifecycleManager18592 = null;
            ListIterator<CollectionOrchestrator1895> listIterator = resourceAllocationTracker144.V.E();
            block4: while (listIterator.hasNext()) {
                object = listIterator.next();
                if (!(object instanceof ResourceLifecycleManager1859)) continue;
                resourceLifecycleManager1859 = (ResourceLifecycleManager1859)object;
                while (listIterator.hasNext()) {
                    listIterator.next();
                    if (listIterator.hasNext()) continue;
                    while (listIterator.hasPrevious()) {
                        object = listIterator.previous();
                        if (!(object instanceof ResourceLifecycleManager1859)) continue;
                        resourceLifecycleManager18592 = (ResourceLifecycleManager1859)object;
                        break block4;
                    }
                }
            }
            object = new MultilingualContentDescriptor((String)((Object)_U.b("\u00ba", (int)_U.a("d", (int)20052, (long)(0x44CEBB2D6D58F1C2L ^ l)), (long)-7742805932209721324L, (long)l)), string, null, resourceLifecycleManager1859, resourceLifecycleManager18592, 0);
            resourceAllocationTracker144.B.add((MultilingualContentDescriptor)object);
            this.D = object;
            this.R = new HealthJudge(25, 0);
            this.w.R(this.R);
            this.i = new HealthJudge(58, 0);
            this.Q.R(this.i);
            this.q = string;
            return;
        }
        for (MultilingualContentDescriptor multilingualContentDescriptor : resourceAllocationTracker144.B) {
            try {
                if (!multilingualContentDescriptor.C.equals(this.H)) continue;
                this.D = multilingualContentDescriptor;
                this.R = new HealthJudge(MetadataExtractionEngine213.z(multilingualContentDescriptor.d), multilingualContentDescriptor.W);
                this.w.R(this.R);
                this.i = new HealthJudge(MetadataExtractionEngine213.R(multilingualContentDescriptor.d), multilingualContentDescriptor.W);
                this.Q.R(this.i);
                this.q = this.D.d;
            }
            catch (CustomSystemException customSystemException) {
                throw _U.b(customSystemException);
            }
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2B1A;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/_U", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _U.c[n2] = n3;
        }
        return c[n2];
    }

    @Override
    public XF S() {
        return this.w;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 22;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 34;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 56;
                break;
            }
            case 7: {
                n3 = 15;
                break;
            }
            case 8: {
                n3 = 9;
                break;
            }
            case 9: {
                n3 = 60;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 13;
                break;
            }
            case 15: {
                n3 = 12;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 30;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 54;
                break;
            }
            case 20: {
                n3 = 41;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 59;
                break;
            }
            case 23: {
                n3 = 7;
                break;
            }
            case 24: {
                n3 = 2;
                break;
            }
            case 25: {
                n3 = 43;
                break;
            }
            case 26: {
                n3 = 11;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 52;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 42;
                break;
            }
            case 31: {
                n3 = 29;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 50;
                break;
            }
            case 34: {
                n3 = 39;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 19;
                break;
            }
            case 38: {
                n3 = 33;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 45;
                break;
            }
            case 43: {
                n3 = 3;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 16;
                break;
            }
            case 47: {
                n3 = 53;
                break;
            }
            case 48: {
                n3 = 17;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 10;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 21;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 63;
                break;
            }
            case 58: {
                n3 = 20;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 5;
                break;
            }
            case 62: {
                n3 = 48;
                break;
            }
            default: {
                n3 = 14;
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
        _U.f[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = _U.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _U.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _U.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _U.a(clazz3, string2, clazz2)) != null) {
                    _U.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _U.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _U.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _U.b(274011130323070L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public String V() {
        return this.v;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _U.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _U.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public _U(String string) {
        this.H = string;
    }

    @Override
    public String T() {
        try {
            if (this.u != null) {
                return this.u;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _U.b(customSystemException);
        }
        return this.q;
    }

    public static int[] v() {
        return Z;
    }

    @Override
    public boolean o() {
        return this.N;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _U.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _U.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = _U.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _U.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _U.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _U.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _U.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _U.b(274011130323070L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _U.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _U.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _U.b(274011130323070L, 0L);
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

    @Override
    public XF h() {
        return this.Q;
    }

    public static void Z(int[] nArray) {
        Z = nArray;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _U.a = MultiContainerRegistry.a(3943916451026716457L, -8351747933066751706L, MethodHandles.lookup().lookupClass()).a(79873022406208L);
                _U.e = new Object[5];
                _U.f = new String[5];
                _U.a();
                _U.d = new HashMap<K, V>(13);
                _U.Z(new int[1]);
                var0 = _U.a ^ 140676044249227L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "/U\u00a8E\u00da\u0083F\u00dc\u008b%\u00d2\r7\u00a0\rV]\"W\u0084\u0014\u0082bg$\u0091\u0017\u00deP\u00b2\u00df\u00c3";
                var7_6 = "/U\u00a8E\u00da\u0083F\u00dc\u008b%\u00d2\r7\u00a0\rV]\"W\u0084\u0014\u0082bg$\u0091\u0017\u00deP\u00b2\u00df\u00c3".length();
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
                    var6_5 = "\u00f4\u00ed\u00ed\u0094^\u0081\u0011(\u008d\u0084\u0096.&\u0083yc";
                    var7_6 = "\u00f4\u00ed\u00ed\u0094^\u0081\u0011(\u008d\u0084\u0096.&\u0083yc".length();
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
        _U.b = var8_3;
        _U.c = new Integer[6];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "80*";
        objectArray[1] = Integer.TYPE;
        _U.f[1] = "java/lang/Integer";
        objectArray[2] = "1\u001br\u000eB):\u0014cA?1)\u0013j\b";
        objectArray[3] = "\u001cR&H>\"\u0017]7\u0007_,\u001cV3]";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "9bM\u000f\u0014I$<\u0014nN\u000e_a\u0015RKJ%e\u0019QNuf6M\u001e\u001d\t8)\u0013\u0000%";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == '\u00fc' || c == 'X' || c == 'B') {
                field = _U.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _U.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _U.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _U.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

