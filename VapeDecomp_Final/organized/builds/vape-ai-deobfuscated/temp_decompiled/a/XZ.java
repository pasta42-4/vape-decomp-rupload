/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AN;
import a.EP;
import a.F7;
import a.J;
import a.KB;
import a.KL;
import a.O9;
import a.OY;
import a.O_;
import a.Qt;
import a.VF;
import a._2;
import a.aJ;
import a.d8;
import a.eY;
import a.ht;
import a.pN;
import a.x4;
import a.xi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xz
extends x4<AN> {
    private static final long[] h;
    private long R;
    private AtomicBoolean v;
    private final Queue<pN> Z;
    private aJ L;
    private static final String[] n;
    private static final Map l;
    private static final Object[] m;
    private final eY d = eY.P;
    private static final Integer[] j;
    private Qt x;
    private static final long e;

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xz.a(l10, l11);
            object = m[n2];
            try {
                if (!(object instanceof String)) break block2;
                xz.m[n2] = clazz = Class.forName(n[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = d8.a(-3090154102098289267L, 8102119866788533033L, MethodHandles.lookup().lookupClass()).a(63916586755202L);
        m = new Object[8];
        n = new String[8];
        xz.a();
        l = new HashMap(13);
        long l10 = e ^ 0x41200663FBA9L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "!\u00c5\u00bf9\u00c9\u0003a\u00c3\u0094o\u00bf\u000f\u00ce@9\u00d4";
        int n3 = "!\u00c5\u00bf9\u00c9\u0003a\u00c3\u0094o\u00bf\u000f\u00ce@9\u00d4".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        h = lArray;
        j = new Integer[2];
    }

    private static Method d(long l10, long l11) {
        int n2 = xz.a(l10, l11);
        Object object = m[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = n[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xz.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = xz.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xz.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xz.m[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xz.b(392404136810834L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xz.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xz.m[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xz.b(392404136810834L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Field c(long l10, long l11) {
        int n2 = xz.a(l10, l11);
        Object object = m[n2];
        if (object instanceof String) {
            String string = n[n2];
            int n3 = string.indexOf(8);
            Class clazz = xz.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xz.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xz.a(clazz3, string2, clazz2)) != null) {
                    xz.m[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xz.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xz.m[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xz.b(392404136810834L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x74F7;
        if (j[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = h[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xz.j[n3] = n4;
        }
        return j[n3];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ef' || c10 == 'L' || c10 == 'v' || c10 == '\u00d4') {
                field = xz.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xz.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Exception decompiling
     */
    @OY(b=F7.LOW)
    public void p(pN var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[DOLOOP]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "Y\n+&";
        objectArray[1] = Void.TYPE;
        xz.n[1] = "java/lang/Void";
        objectArray[2] = "\u001d~{";
        objectArray[3] = Integer.TYPE;
        xz.n[3] = "java/lang/Integer";
        objectArray[4] = "/URH,&$ZC\u0007Q>7]JN";
        objectArray[5] = "\u001bq\bq)K\u0010~\u0019>HE\u001bu\u001dd";
        objectArray[6] = "k\"`\u000bEt<;$m\\\r)iv\u0012Aa:9lm";
        Object[] objectArray2 = objectArray;
        objectArray[7] = ":-\u0011\"j?`&\u00142\u0005oxKH%|fds\u0003:~j\u0003p\u001f2<dz)\u00163x\u0004";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xz.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @OY
    public void L(KB kB2) {
        block23: {
            int n2;
            long l10;
            block26: {
                String[] stringArray;
                VF vF2;
                block25: {
                    block24: {
                        Qt qt2;
                        block22: {
                            l10 = e ^ 0x5C32E81CC73DL;
                            vF2 = EP.y();
                            stringArray = O9.P();
                            try {
                                try {
                                    qt2 = this.x;
                                    if (stringArray == null) break block22;
                                    if (qt2 == null) break block23;
                                }
                                catch (O_ o_2) {
                                    throw xz.a(o_2);
                                }
                                qt2 = this.x;
                            }
                            catch (O_ o_3) {
                                throw xz.a(o_3);
                            }
                        }
                        try {
                            try {
                                n2 = qt2.b();
                                if (stringArray == null) break block24;
                                if (n2 <= 0) break block23;
                            }
                            catch (O_ o_4) {
                                throw xz.a(o_4);
                            }
                            n2 = this.x.b();
                        }
                        catch (O_ o_5) {
                            throw xz.a(o_5);
                        }
                    }
                    try {
                        try {
                            if (stringArray == null) break block25;
                            if (n2 > J.H.C()) break block23;
                        }
                        catch (O_ o_6) {
                            throw xz.a(o_6);
                        }
                        n2 = this.Z.isEmpty() ? 1 : 0;
                    }
                    catch (O_ o_7) {
                        throw xz.a(o_7);
                    }
                }
                try {
                    try {
                        if (stringArray == null) break block26;
                        if (n2 != 0) break block23;
                    }
                    catch (O_ o_8) {
                        throw xz.a(o_8);
                    }
                    n2 = vF2.r() ? 1 : 0;
                }
                catch (O_ o_9) {
                    throw xz.a(o_9);
                }
            }
            try {
                if (n2 != 0) {
                    xz.c("x", (Object)this, (long)-2836254274796748241L, (long)l10);
                }
            }
            catch (O_ o_10) {
                throw xz.a(o_10);
            }
        }
        try {
            if (ht.J() != null) {
                O9.y(new String[4]);
            }
        }
        catch (O_ o_11) {
            throw xz.a(o_11);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xz.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xz.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xz.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xz.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public String t() {
        long l10 = e ^ 0x5A7E6C40F35DL;
        String string = (String)((Object)xz.c("\u00e2", (int)xz.a("p", (int)7039, (long)(0x6704C2F10607834AL ^ l10)), (long)-1386039112028623921L, (long)l10)) + ((AN)this.n()).z.p() + (String)((Object)xz.c("\u00e2", (int)xz.a("p", (int)15694, (long)(0x3145C37E5955A57AL ^ l10)), (long)-1386039112028623921L, (long)l10));
        if (!this.Z.isEmpty()) {
            string = "\u00a7c" + string;
        }
        return string;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xz.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    public xz(xi xi2, String string) {
        super(xi2, string);
        this.Z = new LinkedList<pN>();
        this.v = new AtomicBoolean(false);
        this.L = _2.h;
    }

    private void lambda$flushPackets$0(pN pN2) {
        this.d.G(pN2);
    }

    private void q() {
        boolean bl2;
        block3: {
            block4: {
                long l10 = e ^ 0x2CFFE0CDF1D5L;
                String[] stringArray = O9.P();
                try {
                    bl2 = this.Z.isEmpty();
                    if (stringArray == null) break block3;
                    if (!bl2) break block4;
                }
                catch (O_ o_2) {
                    throw xz.a(o_2);
                }
                return;
            }
            bl2 = Thread.currentThread().equals(KL.W.R());
        }
        if (!bl2) {
            return;
        }
        this.v.set(true);
        this.Z.forEach(this::lambda$flushPackets$0);
        this.Z.clear();
        this.v.set(false);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (n[n5] != null) {
            return n5;
        }
        Object object = m[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 14;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 60;
                break;
            }
            case 3: {
                n4 = 15;
                break;
            }
            case 4: {
                n4 = 6;
                break;
            }
            case 5: {
                n4 = 44;
                break;
            }
            case 6: {
                n4 = 46;
                break;
            }
            case 7: {
                n4 = 16;
                break;
            }
            case 8: {
                n4 = 51;
                break;
            }
            case 9: {
                n4 = 50;
                break;
            }
            case 10: {
                n4 = 39;
                break;
            }
            case 11: {
                n4 = 36;
                break;
            }
            case 12: {
                n4 = 4;
                break;
            }
            case 13: {
                n4 = 13;
                break;
            }
            case 14: {
                n4 = 0;
                break;
            }
            case 15: {
                n4 = 48;
                break;
            }
            case 16: {
                n4 = 63;
                break;
            }
            case 17: {
                n4 = 35;
                break;
            }
            case 18: {
                n4 = 52;
                break;
            }
            case 19: {
                n4 = 18;
                break;
            }
            case 20: {
                n4 = 7;
                break;
            }
            case 21: {
                n4 = 56;
                break;
            }
            case 22: {
                n4 = 10;
                break;
            }
            case 23: {
                n4 = 59;
                break;
            }
            case 24: {
                n4 = 54;
                break;
            }
            case 25: {
                n4 = 43;
                break;
            }
            case 26: {
                n4 = 62;
                break;
            }
            case 27: {
                n4 = 24;
                break;
            }
            case 28: {
                n4 = 53;
                break;
            }
            case 29: {
                n4 = 47;
                break;
            }
            case 30: {
                n4 = 23;
                break;
            }
            case 31: {
                n4 = 37;
                break;
            }
            case 32: {
                n4 = 19;
                break;
            }
            case 33: {
                n4 = 3;
                break;
            }
            case 34: {
                n4 = 17;
                break;
            }
            case 35: {
                n4 = 49;
                break;
            }
            case 36: {
                n4 = 22;
                break;
            }
            case 37: {
                n4 = 5;
                break;
            }
            case 38: {
                n4 = 31;
                break;
            }
            case 39: {
                n4 = 41;
                break;
            }
            case 40: {
                n4 = 29;
                break;
            }
            case 41: {
                n4 = 8;
                break;
            }
            case 42: {
                n4 = 20;
                break;
            }
            case 43: {
                n4 = 55;
                break;
            }
            case 44: {
                n4 = 21;
                break;
            }
            case 45: {
                n4 = 57;
                break;
            }
            case 46: {
                n4 = 42;
                break;
            }
            case 47: {
                n4 = 33;
                break;
            }
            case 48: {
                n4 = 12;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 38;
                break;
            }
            case 51: {
                n4 = 9;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 32;
                break;
            }
            case 54: {
                n4 = 2;
                break;
            }
            case 55: {
                n4 = 11;
                break;
            }
            case 56: {
                n4 = 25;
                break;
            }
            case 57: {
                n4 = 40;
                break;
            }
            case 58: {
                n4 = 26;
                break;
            }
            case 59: {
                n4 = 30;
                break;
            }
            case 60: {
                n4 = 34;
                break;
            }
            case 61: {
                n4 = 1;
                break;
            }
            case 62: {
                n4 = 61;
                break;
            }
            default: {
                n4 = 58;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        xz.n[n5] = new String(cArray);
        return n5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

