/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.session;

import a.Ry;
import a.ZB;
import a._b;
import a.hr;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataEncodingTransformer;
import com.exception.system.CustomSystemException;
import com.network.protocol.CommunicationProtocolManager;
import com.rendering.style.RenderStyleController;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.session.CryptographicSessionManager884;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class CryptographicSessionManager259
extends AbstractComputationKernel {
    private static final long b;
    private final TransactionDescriptor B;
    @Nullable
    private Ry V;
    private static final String[] bb;
    private static final Object[] ab;
    private static final long[] E;
    private final RenderStyleController R;
    private final DataEncodingTransformer F;
    private static final Integer[] L;
    private final boolean n;
    private final hr v;
    private static final Map Y;
    private boolean D;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00e7' || c == '\u00ff' || c == '\u00da') {
                field = CryptographicSessionManager259.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicSessionManager259.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void i() {
        Object[] objectArray = ab;
        ab[0] = "YT\u0018";
        objectArray[1] = Integer.TYPE;
        CryptographicSessionManager259.bb[1] = "java/lang/Integer";
        objectArray[2] = ":KF\rN\u00101DWB3\b\"C^\u000b";
        objectArray[3] = "'p;\u0000\f\u001e,\u007f*Om\u0010't.\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Dn9f_P\u0003|-^\u000fQ}y%o\u000bF\u0006c.cd\u0013\u0011}qe\u0001S\u0014=/^";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicSessionManager259.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public CryptographicSessionManager259(DataEncodingTransformer dataEncodingTransformer, TransactionDescriptor transactionDescriptor) {
        double d2;
        long l;
        block6: {
            block4: {
                block5: {
                    l = b ^ 0x62515012BF54L;
                    this.R = new RenderStyleController((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)15007, (long)(0x72B8BDC5A6AF4294L ^ l)), (long)-4884588972042569353L, (long)l)), CryptographicSessionManager259.M.O);
                    this.v = new hr((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)3250, (long)(0x2D345585EEF874AFL ^ l)), (long)-4884588972042569353L, (long)l)), 0.8, CryptographicSessionManager259.M.Y, CryptographicSessionManager259.M.u, CryptographicSessionManager259.M.S, 2.0f, 1.0f);
                    this.F = dataEncodingTransformer;
                    this.B = transactionDescriptor;
                    double d3 = this.w();
                    this.getClass();
                    d2 = (d3 - (double)(5.0f * 4.0f) - 1.0) / 4.0;
                    try {
                        try {
                            this.n = TemporalMetadataResolver.h.o().W().equals(transactionDescriptor);
                            this.Y();
                            if (this.D) break block4;
                            if (!this.n) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager259.a(customSystemException);
                        }
                        this.R.g((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)23439, (long)(0x568FC2335597238EL ^ l)), (long)-4884588972042569353L, (long)l)));
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager259.a(customSystemException);
                    }
                }
                this.R.g((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)6461, (long)(0x134DD47C9770E12DL ^ l)), (long)-4884588972042569353L, (long)l)));
                break block6;
            }
            this.R.u((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)25537, (long)(0x1C4EBB48504A9BD2L ^ l)), (long)-4884588972042569353L, (long)l)));
            this.R.g((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)19739, (long)(0x473C73A91313518L ^ l)), (long)-4884588972042569353L, (long)l)));
        }
        this.v.q(false);
        this.R.N(this::P);
        this.R.b(2.0f);
        this.R.l(1.0f);
        this.v.Q(CryptographicSessionManager259.M.S, CryptographicSessionManager259.M.W);
        this.v.w(16.0);
        this.v.N(transactionDescriptor::C);
        this.v.G(1.0f);
        this.v.I(CryptographicSessionManager259.M.S);
        this.v.Q(CryptographicSessionManager259.M.W);
        this.R.T(d2 * 1.0);
        this.R.w(16.0);
        this.R.B(0.85);
        this.v.T(d2 * 3.0);
        this.v.N((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)20472, (long)(0x3DF06D93D2C437FAL ^ l)), (long)-4884588972042569353L, (long)l)));
        this.v.W(7.0f);
        this.v.f(true);
        this.v.d(0.8);
        this.v.P(Color.WHITE);
        this.v.G(true);
        this.o(this.v, this.R);
    }

    private void Y() {
        block10: {
            long l;
            block13: {
                block15: {
                    block14: {
                        boolean bl;
                        block12: {
                            block11: {
                                boolean bl2;
                                l = b ^ 0x1F023F38D563L;
                                try {
                                    this.V = this.B.N();
                                    bl2 = this.V != null;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSessionManager259.a(customSystemException);
                                }
                                boolean bl3 = bl2;
                                try {
                                    try {
                                        if (bl3 == this.D) break block10;
                                        CryptographicSessionManager259 cryptographicSessionManager259 = this;
                                        if (this.V == null) break block11;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSessionManager259.a(customSystemException);
                                    }
                                    bl = true;
                                    break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSessionManager259.a(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        try {
                            try {
                                cryptographicSessionManager259.D = bl;
                                if (this.D) break block13;
                                if (!this.n) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager259.a(customSystemException);
                            }
                            this.R.g((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)4042, (long)(0x39EAE2F8828A9DE5L ^ l)), (long)-3026127137557523648L, (long)l)));
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager259.a(customSystemException);
                        }
                    }
                    this.R.g((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)22996, (long)(0x500F50ABB3BF4BE6L ^ l)), (long)-3026127137557523648L, (long)l)));
                }
                this.R.u((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)2539, (long)(0x689A175347249BCBL ^ l)), (long)-3026127137557523648L, (long)l)));
                break block10;
            }
            this.R.u((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)8985, (long)(0x104062F87F6FB13BL ^ l)), (long)-3026127137557523648L, (long)l)));
            this.R.g((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)25648, (long)(0x3FAA42DA66C9760FL ^ l)), (long)-3026127137557523648L, (long)l)));
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void G() {
        double d2 = this.G() + 10.0;
        double d3 = this.W() + 5.0;
        this.v.b(d2);
        this.v.M(d3);
        this.R.b(d2 += 2.0 + this.v.w());
        this.R.M(d3);
        this.v.g(this.a());
    }

    private static Method h(long l, long l2) {
        int n = CryptographicSessionManager259.e(l, l2);
        Object object = ab[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = bb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicSessionManager259.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicSessionManager259.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicSessionManager259.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicSessionManager259.ab[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicSessionManager259.f(240664392243329L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicSessionManager259.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicSessionManager259.ab[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicSessionManager259.f(240664392243329L, 0L);
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4433;
        if (L[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = E[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Y.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    Y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/R2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSessionManager259.L[n2] = n3;
        }
        return L[n2];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicSessionManager259.e(l, l2);
            object = ab[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicSessionManager259.ab[n] = clazz = Class.forName(bb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public double z() {
        return 25.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSessionManager259.b = MultiContainerRegistry.a(-752927297290389003L, -255535228558096975L, MethodHandles.lookup().lookupClass()).a(189541625050173L);
                CryptographicSessionManager259.ab = new Object[5];
                CryptographicSessionManager259.bb = new String[5];
                CryptographicSessionManager259.i();
                CryptographicSessionManager259.Y = new HashMap<K, V>(13);
                var0 = CryptographicSessionManager259.b ^ 108758455481352L;
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
                var8_3 = new long[31];
                var5_4 = 0;
                var6_5 = "\u00a5\u00fc\u00e1\u009e\u00aa!xg\u008c]yX\u009d4[2\u00cf\u0013_\u00c4\u00bd\u00ddp\u008en\u00a6\u00ec\u00bf\u00a2,5\u00a0\u000e\u0013\u00aa6\u00d3\u00ce\u00af\u0006\u00ado\u00b9kY\u0004\u00ba\u00a2\u00e0\u0012\"-\u00c9\u00ea\u000ex\u00d1\u00d2n\u009b\u0098\u000b\u0089\u00f5A\u00dd27\u0016\u0094\u008bh\u00d0\u001d8\u00e1\u00b0sX9\u00c3Vl\u00b9:@\u00cb\u0017Y\u009c\u0010\u009b\tm\u00d8\u00ad*+=+gewU)\u00da\u00c2\u00f19'\u00a9\u0097l\u00bbCAem\u00ab\u001c\u008b(\u0088\u00af\u00ff-\u00d6#\u009bjw\u0087\u00ca\u0015(+\u00d3\u00c0\u009d\u00da\u00aa\u008a\u00dd\u00ea\u00c6@4P\u00e2\u00c4\u00f34\u00c07\u0093'\u00e6\u00f1v\u00b6\u00bc\u00e6\u00b2\u00ec\u0084\u0080\u00d0\u00bf\u0007IH\u00d8\u00e3\u0094\tx\u00a5]\u00aexY\u00f9\u00d9\u00abR[\u0019\u00a5\u00e8`\u00d2\u00aa\u00cb9\u0090\u00f6\u00e4p]\u009a\u00fb\u00ea\n(\u0091\"\u00c1\u00f6\u00a1\u00ac?\u00f61F/h\u0007\u00c6\u0090,j\u0082d ;L$\u00a2?\"\u00cad";
                var7_6 = "\u00a5\u00fc\u00e1\u009e\u00aa!xg\u008c]yX\u009d4[2\u00cf\u0013_\u00c4\u00bd\u00ddp\u008en\u00a6\u00ec\u00bf\u00a2,5\u00a0\u000e\u0013\u00aa6\u00d3\u00ce\u00af\u0006\u00ado\u00b9kY\u0004\u00ba\u00a2\u00e0\u0012\"-\u00c9\u00ea\u000ex\u00d1\u00d2n\u009b\u0098\u000b\u0089\u00f5A\u00dd27\u0016\u0094\u008bh\u00d0\u001d8\u00e1\u00b0sX9\u00c3Vl\u00b9:@\u00cb\u0017Y\u009c\u0010\u009b\tm\u00d8\u00ad*+=+gewU)\u00da\u00c2\u00f19'\u00a9\u0097l\u00bbCAem\u00ab\u001c\u008b(\u0088\u00af\u00ff-\u00d6#\u009bjw\u0087\u00ca\u0015(+\u00d3\u00c0\u009d\u00da\u00aa\u008a\u00dd\u00ea\u00c6@4P\u00e2\u00c4\u00f34\u00c07\u0093'\u00e6\u00f1v\u00b6\u00bc\u00e6\u00b2\u00ec\u0084\u0080\u00d0\u00bf\u0007IH\u00d8\u00e3\u0094\tx\u00a5]\u00aexY\u00f9\u00d9\u00abR[\u0019\u00a5\u00e8`\u00d2\u00aa\u00cb9\u0090\u00f6\u00e4p]\u009a\u00fb\u00ea\n(\u0091\"\u00c1\u00f6\u00a1\u00ac?\u00f61F/h\u0007\u00c6\u0090,j\u0082d ;L$\u00a2?\"\u00cad".length();
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
                    var6_5 = "`]:r#s\u00b5\u00ben\u00db\u00e5\u00c3\u008c*\u00d1w";
                    var7_6 = "`]:r#s\u00b5\u00ben\u00db\u00e5\u00c3\u008c*\u00d1w".length();
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
        CryptographicSessionManager259.E = var8_3;
        CryptographicSessionManager259.L = new Integer[31];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicSessionManager259.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicSessionManager259.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void d() {
        this.Y();
    }

    private String a() {
        StringBuilder stringBuilder;
        block7: {
            long l;
            block6: {
                l = b ^ 0x1D0F89D19AC5L;
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)16062, (long)(0x73615D076EEEE33BL ^ l)), (long)-7374913308486296346L, (long)l)));
                stringBuilder.append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)12287, (long)(0x729BCA1FFA347271L ^ l)), (long)-7374913308486296346L, (long)l)));
                StringBuilder stringBuilder2 = new StringBuilder();
                String string = "";
                for (ContextualExecutionFramework contextualExecutionFramework : this.B.q()) {
                    string = string + contextualExecutionFramework.O() + (String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)28158, (long)(0x20E5B960783FB07EL ^ l)), (long)-7374913308486296346L, (long)l));
                    if (!(this.J().D(string) > 150.0)) continue;
                    stringBuilder2.append(DynamicContextBroker.u).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)23781, (long)(0x11581FD27A8C8178L ^ l)), (long)-7374913308486296346L, (long)l))).append(string).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)22663, (long)(0x56323FF4A29051CL ^ l)), (long)-7374913308486296346L, (long)l)));
                    string = "";
                }
                try {
                    if (!string.isEmpty()) {
                        stringBuilder2.append(DynamicContextBroker.u).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)17218, (long)(0x7015F973FABC1EC5L ^ l)), (long)-7374913308486296346L, (long)l))).append(string);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager259.a(customSystemException);
                }
                try {
                    if (stringBuilder2.length() <= 0) break block6;
                    stringBuilder.append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)13413, (long)(0x41D8F0276E9CE9EAL ^ l)), (long)-7374913308486296346L, (long)l)));
                    stringBuilder.append(ZB.r(stringBuilder2.toString(), (String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)25906, (long)(0x254D36FB27C38A5L ^ l)), (long)-7374913308486296346L, (long)l)), ""));
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager259.a(customSystemException);
                }
            }
            stringBuilder.append(DynamicContextBroker.u).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)2898, (long)(0x4D14416DC4BAD6CEL ^ l)), (long)-7374913308486296346L, (long)l))).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)26106, (long)(0x4431F7B722D23862L ^ l)), (long)-7374913308486296346L, (long)l)));
        }
        return stringBuilder.toString();
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicSessionManager259.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicSessionManager259.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public double e() {
        return 110.0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void P() {
        block8: {
            block9: {
                try {
                    try {
                        if (this.D) break block8;
                        if (!this.n) break block9;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSessionManager259.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager259.a(customSystemException);
                }
            }
            try {
                try {
                    TemporalMetadataResolver.h.o().U(this.B);
                    this.F.P();
                    if (this.B.p() == null || this.B.k() == null) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager259.a(customSystemException);
                }
                _b.S().c().M(CryptographicSessionManager884.d(null, Collections.singletonList(this.B.k())));
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager259.a(customSystemException);
            }
        }
        CommunicationProtocolManager.R(true, this.V.H());
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (bb[n4] != null) {
            return n4;
        }
        Object object = ab[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 49;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 44;
                break;
            }
            case 6: {
                n3 = 58;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 32;
                break;
            }
            case 10: {
                n3 = 39;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 16;
                break;
            }
            case 13: {
                n3 = 7;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 34;
                break;
            }
            case 16: {
                n3 = 6;
                break;
            }
            case 17: {
                n3 = 22;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 4;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 13;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 52;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 43;
                break;
            }
            case 32: {
                n3 = 48;
                break;
            }
            case 33: {
                n3 = 31;
                break;
            }
            case 34: {
                n3 = 40;
                break;
            }
            case 35: {
                n3 = 1;
                break;
            }
            case 36: {
                n3 = 35;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 41;
                break;
            }
            case 40: {
                n3 = 45;
                break;
            }
            case 41: {
                n3 = 61;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 33;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 14;
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
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 17;
                break;
            }
            case 50: {
                n3 = 53;
                break;
            }
            case 51: {
                n3 = 63;
                break;
            }
            case 52: {
                n3 = 23;
                break;
            }
            case 53: {
                n3 = 28;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 3;
                break;
            }
            case 59: {
                n3 = 27;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 59;
                break;
            }
            default: {
                n3 = 62;
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
        CryptographicSessionManager259.bb[n4] = new String(cArray);
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSessionManager259.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field g(long l, long l2) {
        int n = CryptographicSessionManager259.e(l, l2);
        Object object = ab[n];
        if (object instanceof String) {
            String string = bb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicSessionManager259.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicSessionManager259.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicSessionManager259.c(clazz3, string2, clazz2)) != null) {
                    CryptographicSessionManager259.ab[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicSessionManager259.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicSessionManager259.ab[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicSessionManager259.f(240664392243329L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private String h() {
        StringBuilder stringBuilder;
        block10: {
            long l;
            block9: {
                l = b ^ 0x516E5D8E3669L;
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)14841, (long)(0x11972FD6479F48CBL ^ l)), (long)3822226819881381962L, (long)l)));
                StringBuilder stringBuilder2 = new StringBuilder();
                String string = "";
                for (ContextualExecutionFramework contextualExecutionFramework : TemporalMetadataResolver.h.U().x()) {
                    block8: {
                        try {
                            if (!contextualExecutionFramework.Z() || contextualExecutionFramework.N() == 0) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager259.a(customSystemException);
                        }
                        string = string + contextualExecutionFramework.O() + (String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)19667, (long)(0xA980869C457BDE9L ^ l)), (long)3822226819881381962L, (long)l));
                    }
                    if (!(this.J().D(string) > 150.0)) continue;
                    stringBuilder2.append(DynamicContextBroker.u).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)16342, (long)(0x231FF623A0CD4EF9L ^ l)), (long)3822226819881381962L, (long)l))).append(string).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)28291, (long)(0x488E37E929139FBAL ^ l)), (long)3822226819881381962L, (long)l)));
                    string = "";
                }
                try {
                    if (!string.isEmpty()) {
                        stringBuilder2.append(DynamicContextBroker.u).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)12731, (long)(0x4AFF7E7BE9CF409FL ^ l)), (long)3822226819881381962L, (long)l))).append(string);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager259.a(customSystemException);
                }
                try {
                    if (stringBuilder2.length() <= 0) break block9;
                    stringBuilder.append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)13475, (long)(0xE5F176D096DC590L ^ l)), (long)3822226819881381962L, (long)l)));
                    stringBuilder.append(ZB.r(stringBuilder2.toString(), (String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)13444, (long)(0x6954DAB60F54C5B9L ^ l)), (long)3822226819881381962L, (long)l)), ""));
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager259.a(customSystemException);
                }
            }
            stringBuilder.append(DynamicContextBroker.u).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)17968, (long)(0x15DE7E9F01743711L ^ l)), (long)3822226819881381962L, (long)l))).append((String)((Object)CryptographicSessionManager259.c("\u00ea", (int)CryptographicSessionManager259.b("h", (int)304, (long)(0x65F9D231107FF017L ^ l)), (long)3822226819881381962L, (long)l)));
        }
        return stringBuilder.toString();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSessionManager259.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicSessionManager259.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

