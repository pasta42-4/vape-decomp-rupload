/*
 * Decompiled with CFR 0.152.
 */
package com.network.allocation;

import a.bE;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.math.precision.PrecisionMathOrchestrator;
import com.security.authorization.ContextualAccessController;
import com.security.cryptography.CryptographicContextManager153;
import com.security.encoding.SecureMessageEncoder;
import com.security.session.CipherSessionManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NetworkResourceAllocator
extends SecureMessageEncoder {
    private static final long ab;
    private final String xB;
    private final String E;
    private boolean v;
    private final CryptographicContextManager153 D;
    private final PrecisionMathOrchestrator xw;
    private static final long[] bb;
    private final List<ContextualAccessController> n;
    private static boolean Y;
    private boolean F;
    private static final Object[] fb;
    private static final String[] jb;
    private final HardwareYield R;
    private final SymmetricCipherManager V;
    private static final Integer[] db;
    private final GraphicalThemeRenderer xL;
    private static final Map eb;
    private float xJ;
    private final SymmetricCipherManager xu;
    private final GraphicalRenderEngine1082 B;

    public void w(ContextualAccessController contextualAccessController) {
        this.n.add(contextualAccessController);
        Collections.reverse(this.n);
        ContextualAccessController[] contextualAccessControllerArray = new ContextualAccessController[this.n.size()];
        contextualAccessControllerArray = this.n.toArray(contextualAccessControllerArray);
        Collections.reverse(this.n);
        this.P(contextualAccessControllerArray);
    }

    public void z() {
        this.xw.h(true);
        this.xw.b(this.G());
        this.xw.M(this.W());
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkResourceAllocator.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkResourceAllocator.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public GraphicalThemeRenderer g() {
        return this.xL;
    }

    @Override
    public boolean M(int n, int n2) {
        block6: {
            try {
                block7: {
                    try {
                        try {
                            if (!this.F) break block6;
                            if (this.xL.C().O(n, n2)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkResourceAllocator.a(customSystemException);
                        }
                        if (!this.V.C().O(n, n2)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkResourceAllocator.a(customSystemException);
                    }
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkResourceAllocator.a(customSystemException);
            }
        }
        return this.C().O(n, n2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkResourceAllocator.ab = MultiContainerRegistry.a(-5275866954695521744L, -5802748845241463048L, MethodHandles.lookup().lookupClass()).a(210122131305820L);
                NetworkResourceAllocator.fb = new Object[5];
                NetworkResourceAllocator.jb = new String[5];
                NetworkResourceAllocator.a();
                NetworkResourceAllocator.eb = new HashMap<K, V>(13);
                NetworkResourceAllocator.T(false);
                var0 = NetworkResourceAllocator.ab ^ 36218284436202L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "4\u0000\u0004\u00f5\u00c8\u00bb\u00e4j\u00c9X\u00a3\u00a3\u00f5\u0098\u0010\u00e6";
                var7_6 = "4\u0000\u0004\u00f5\u00c8\u00bb\u00e4j\u00c9X\u00a3\u00a3\u00f5\u0098\u0010\u00e6".length();
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
                    var6_5 = "\u001d\u00ba\u00dc\u009d\u00e0\u000b)\u0010\u00a4'\rB\u00e4\u00c5\u001a\u00d1";
                    var7_6 = "\u001d\u00ba\u00dc\u009d\u00e0\u000b)\u0010\u00a4'\rB\u00e4\u00c5\u001a\u00d1".length();
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
        NetworkResourceAllocator.bb = var8_3;
        NetworkResourceAllocator.db = new Integer[4];
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
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 20;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 5: {
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 25;
                break;
            }
            case 7: {
                n3 = 18;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 51;
                break;
            }
            case 11: {
                n3 = 36;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 47;
                break;
            }
            case 14: {
                n3 = 2;
                break;
            }
            case 15: {
                n3 = 14;
                break;
            }
            case 16: {
                n3 = 63;
                break;
            }
            case 17: {
                n3 = 22;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 23: {
                n3 = 29;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 59;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 21;
                break;
            }
            case 30: {
                n3 = 58;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 23;
                break;
            }
            case 35: {
                n3 = 15;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 26;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 37;
                break;
            }
            case 42: {
                n3 = 42;
                break;
            }
            case 43: {
                n3 = 16;
                break;
            }
            case 44: {
                n3 = 5;
                break;
            }
            case 45: {
                n3 = 4;
                break;
            }
            case 46: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 12;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 7;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 1;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 13;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 30;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 53;
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
        NetworkResourceAllocator.jb[n4] = new String(cArray);
        return n4;
    }

    public static void T(boolean bl) {
        Y = bl;
    }

    private static Field g(long l, long l2) {
        int n = NetworkResourceAllocator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkResourceAllocator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkResourceAllocator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkResourceAllocator.c(clazz3, string2, clazz2)) != null) {
                    NetworkResourceAllocator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkResourceAllocator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkResourceAllocator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkResourceAllocator.f(266728729119087L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/CG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void U(boolean bl) {
        this.v = bl;
        this.R().N(true);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkResourceAllocator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkResourceAllocator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public NetworkResourceAllocator(CipherSessionManager cipherSessionManager, String string, String string2) {
        long l = ab ^ 0x7D69B88E3574L;
        super(cipherSessionManager);
        this.R = new HardwareYield((String)((Object)NetworkResourceAllocator.c("\u00e7", (int)NetworkResourceAllocator.b("b", (int)6621, (long)(0x18EB01ACD31D85F1L ^ l)), (long)7444021603673174201L, (long)l)), 1.5);
        this.F = false;
        this.xJ = 1.0f;
        this.n = new ArrayList<ContextualAccessController>();
        this.v = false;
        this.E = string;
        this.xB = string2;
        this.B = new GraphicalRenderEngine1082(this.e() - 8.0, this.z() - 8.0);
        this.xw = new PrecisionMathOrchestrator(4.0, 4.0, this.B);
        SymmetricCipherManager symmetricCipherManager = new SymmetricCipherManager(90.0);
        this.xL = new GraphicalThemeRenderer(string);
        symmetricCipherManager.n(this.xL, new Object[0]);
        this.D = new CryptographicContextManager153(string2, 0.9, NetworkResourceAllocator.M.c);
        this.D.S(0.0f);
        this.D.j(0.0f);
        symmetricCipherManager.n(new bE(1.0, 1.0), new Object[0]);
        symmetricCipherManager.n(this.D, new Object[0]);
        this.V = new SymmetricCipherManager(60.0);
        this.B.n(symmetricCipherManager, new Object[0]);
        this.B.n(this.V, NetworkResourceAllocator.c("\u00e7", (int)NetworkResourceAllocator.b("b", (int)20849, (long)(0x2EA01A6B6C9DCD5CL ^ l)), (long)7444021603673174201L, (long)l));
        this.xu = new SymmetricCipherManager(10.0);
        this.xu.o(new bE(10.0, 2.0), this.R);
        this.xu.N(false);
        this.o(this.xw);
        this.xL.h(NetworkResourceAllocator.M.q);
        symmetricCipherManager.i(false);
        this.V.i(false);
        this.B.i(false);
        this.xw.i(false);
        this.R.p(3.5);
        this.R.B(1.2);
        this.P(new ContextualAccessController[0]);
    }

    public void A(AbstractComputationKernel abstractComputationKernel) {
        ContextualAccessController contextualAccessController = new ContextualAccessController(abstractComputationKernel);
        this.w(contextualAccessController);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cb' || c == '\u00cc' || c == '\u00c9' || c == '\u00f4') {
                field = NetworkResourceAllocator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkResourceAllocator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'J' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkResourceAllocator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public String m() {
        return this.xB;
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkResourceAllocator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public SymmetricCipherManager R() {
        return this.xu;
    }

    public boolean Q() {
        return this.F;
    }

    public HardwareYield M() {
        return this.R;
    }

    public static boolean O() {
        boolean bl = NetworkResourceAllocator.K();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkResourceAllocator.a(customSystemException);
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static boolean K() {
        return Y;
    }

    public void P(ContextualAccessController ... contextualAccessControllerArray) {
        this.V.f();
        for (ContextualAccessController contextualAccessController : contextualAccessControllerArray) {
            this.V.n(contextualAccessController.O(), new Object[0]);
        }
        this.V.n(this.xu, new Object[0]);
    }

    public void X(boolean bl) {
        long l = ab ^ 0x2F11C3CB5AFCL;
        this.b(this.m() + (String)((Object)NetworkResourceAllocator.c("\u00e7", (int)NetworkResourceAllocator.b("b", (int)6439, (long)(0x3436DFA28519EA81L ^ l)), (long)632237109406637873L, (long)l)), bl);
    }

    public void b(String string, boolean bl) {
        long l = ab ^ 0x352B22423046L;
        try {
            this.xL.u((String)((Object)NetworkResourceAllocator.c("\u00e7", (int)NetworkResourceAllocator.b("b", (int)19358, (long)(0x1CE1280DCE9A5283L ^ l)), (long)7096602602758600075L, (long)l)));
            this.xL.B(0.85f);
            this.D.H(string);
            if (bl) {
                this.xu.N(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkResourceAllocator.a(customSystemException);
        }
        for (ContextualAccessController contextualAccessController : this.n) {
            try {
                try {
                    if (!contextualAccessController.P() && !bl) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkResourceAllocator.a(customSystemException);
                }
                contextualAccessController.O().N(false);
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkResourceAllocator.a(customSystemException);
            }
        }
        this.F = true;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/CG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = NetworkResourceAllocator.e(l, l2);
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
                clazz3 = NetworkResourceAllocator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkResourceAllocator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkResourceAllocator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkResourceAllocator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkResourceAllocator.f(266728729119087L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkResourceAllocator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkResourceAllocator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkResourceAllocator.f(266728729119087L, 0L);
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

    private static void a() {
        Object[] objectArray = fb;
        fb[0] = "K\u00111";
        objectArray[1] = Integer.TYPE;
        NetworkResourceAllocator.jb[1] = "java/lang/Integer";
        objectArray[2] = "(R?5Z\u0018#].z'\u00000Z'3";
        objectArray[3] = "^*-\u001dZ=U%<R;3^.8\b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "lq58z\u0017|sgD~\u0017\u0000'd<y\u0003y}b./l9d%/x\u0002bnf\u007f\u0015";
    }

    public void x() {
        this.xL.u(this.E);
        this.xL.B(this.xJ);
        this.D.H(this.xB);
        this.xu.N(this.v);
        for (ContextualAccessController contextualAccessController : this.n) {
            contextualAccessController.O().N(true);
        }
        this.F = false;
    }

    public void n(float f) {
        try {
            this.xJ = f;
            if (!this.F) {
                this.xL.B(f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkResourceAllocator.a(customSystemException);
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NetworkResourceAllocator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkResourceAllocator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void x(double d2) {
        this.T(d2);
        this.Y(d2);
        this.B.Y(d2 - 8.0);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B63;
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
                throw new RuntimeException("a/CG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkResourceAllocator.db[n2] = n3;
        }
        return db[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

