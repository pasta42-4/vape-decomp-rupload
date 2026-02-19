/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package a;

import a.Et;
import a.O_;
import a.d8;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ko {
    int z;
    private static final long[] d;
    private static final long a;
    int s;
    int w;
    int U;
    private static final Integer[] e;
    private static final Map m;
    private static int Y;
    boolean W;
    int l;
    private static String F;

    public ko(String string, String string2) {
        this(string, string2, null);
    }

    public void d(String string, String string2) {
        this.u(string, string2, null);
    }

    public static void v(int n2) {
        Y = n2;
    }

    public static void R(String string) {
        F = string;
    }

    public static void J(int n2) {
        GL20.glUseProgram((int)n2);
        ko.v(n2);
    }

    public ko(String string, String string2, String string3) {
        boolean bl2;
        long l10 = a ^ 0x47A2B29B6EFEL;
        this.s = 0;
        this.z = 0;
        this.U = 0;
        this.l = 0;
        this.s = GL20.glCreateProgram();
        this.z = GL20.glCreateShader((int)ko.a("j", (int)18621, (long)(0x3634F54CD1FBC254L ^ l10)));
        this.U = GL20.glCreateShader((int)ko.a("j", (int)18119, (long)(0x24B30680260C4C29L ^ l10)));
        if (string3 != null) {
            this.l = GL20.glCreateShader((int)ko.a("j", (int)17546, (long)(0x3BCF1D2BBDDA4E6AL ^ l10)));
        }
        try {
            GL20.glShaderSource((int)this.z, (CharSequence)string);
            GL20.glShaderSource((int)this.U, (CharSequence)string2);
            if (this.l != 0) {
                GL20.glShaderSource((int)this.l, (CharSequence)string3);
            }
        }
        catch (O_ o_2) {
            throw ko.b(o_2);
        }
        try {
            GL20.glCompileShader((int)this.z);
            GL20.glCompileShader((int)this.U);
            if (this.l != 0) {
                GL20.glCompileShader((int)this.l);
            }
        }
        catch (O_ o_3) {
            throw ko.b(o_3);
        }
        try {
            GL20.glAttachShader((int)this.s, (int)this.z);
            GL20.glAttachShader((int)this.s, (int)this.U);
            if (this.l != 0) {
                GL20.glAttachShader((int)this.s, (int)this.l);
            }
        }
        catch (O_ o_4) {
            throw ko.b(o_4);
        }
        GL20.glLinkProgram((int)this.s);
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        try {
            Et.I(this.s, (int)ko.a("j", (int)19283, (long)(0x7BB6FDBFACF6C1B8L ^ l10)), intBuffer);
            ko ko2 = this;
            bl2 = intBuffer.get(0) == 1;
        }
        catch (O_ o_5) {
            throw ko.b(o_5);
        }
        ko2.W = bl2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ko.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public static String Q() {
        return F;
    }

    public void u(String string, String string2, String string3) {
        boolean bl2;
        long l10 = a ^ 0x17DB5A026BD5L;
        try {
            this.s = GL20.glCreateProgram();
            this.z = GL20.glCreateShader((int)ko.a("j", (int)32302, (long)(0x60156A7A43AC71E9L ^ l10)));
            this.U = GL20.glCreateShader((int)ko.a("j", (int)7388, (long)(0x4FF8FB62B842931AL ^ l10)));
            if (string3 != null) {
                this.l = GL20.glCreateShader((int)ko.a("j", (int)27660, (long)(0x702FDDB58830E3C8L ^ l10)));
            }
        }
        catch (O_ o_2) {
            throw ko.b(o_2);
        }
        try {
            GL20.glShaderSource((int)this.z, (CharSequence)string);
            GL20.glShaderSource((int)this.U, (CharSequence)string2);
            if (string3 != null) {
                GL20.glShaderSource((int)this.l, (CharSequence)string3);
            }
        }
        catch (O_ o_3) {
            throw ko.b(o_3);
        }
        try {
            GL20.glCompileShader((int)this.z);
            GL20.glCompileShader((int)this.U);
            if (string3 != null) {
                GL20.glCompileShader((int)this.l);
            }
        }
        catch (O_ o_4) {
            throw ko.b(o_4);
        }
        try {
            GL20.glAttachShader((int)this.s, (int)this.z);
            GL20.glAttachShader((int)this.s, (int)this.U);
            if (string3 != null) {
                GL20.glAttachShader((int)this.s, (int)this.l);
            }
        }
        catch (O_ o_5) {
            throw ko.b(o_5);
        }
        GL20.glLinkProgram((int)this.s);
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        try {
            Et.I(this.s, (int)ko.a("j", (int)14857, (long)(0x26FE06F02EE1B5CAL ^ l10)), intBuffer);
            ko ko2 = this;
            bl2 = intBuffer.get(0) == 1;
        }
        catch (O_ o_6) {
            throw ko.b(o_6);
        }
        ko2.W = bl2;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ko" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int j() {
        return this.s;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6545;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ko", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ko.e[n3] = n4;
        }
        return e[n3];
    }

    public static int m() {
        long l10 = a ^ 0x3677BD3417E7L;
        try {
            if (Y == -1) {
                Y = GL11.glGetInteger((int)ko.a("j", (int)14462, (long)(0x3069A988A0F74B8DL ^ l10)));
            }
        }
        catch (O_ o_2) {
            throw ko.b(o_2);
        }
        return Y;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ko.a = d8.a(-7526997414210516879L, 2085377054870917334L, MethodHandles.lookup().lookupClass()).a(85700478449838L);
                ko.m = new HashMap<K, V>(13);
                ko.R(null);
                var0 = ko.a ^ 11323948461142L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u0010\u00aaRa\u0019xJj\u00f6_+}\u009bB\u001f\u00e6'\u001d\u00ac\u00bc9R\u00ac\u00af\u00ec\u0002\u0084]\u00ae\u00a4\u00af\u00cb\u0099^\u00ff\u00d9\u00b2\u00cd\u0088\u00f4\u00a8!\u00c4X\u008dR\u00dfd3\u0087\u009f\u00f1\u0093\u0093\u00baK";
                var7_6 = "\u0010\u00aaRa\u0019xJj\u00f6_+}\u009bB\u001f\u00e6'\u001d\u00ac\u00bc9R\u00ac\u00af\u00ec\u0002\u0084]\u00ae\u00a4\u00af\u00cb\u0099^\u00ff\u00d9\u00b2\u00cd\u0088\u00f4\u00a8!\u00c4X\u008dR\u00dfd3\u0087\u009f\u00f1\u0093\u0093\u00baK".length();
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
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u001d\u0090\u009b\u00c8PF\u00dcG\u00db\u00e1\u00fd`\u00b3\u00ac\u00e2\b";
                    var7_6 = "\u001d\u0090\u009b\u00c8PF\u00dcG\u00db\u00e1\u00fd`\u00b3\u00ac\u00e2\b".length();
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
lbl40:
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        ko.d = var8_3;
        ko.e = new Integer[9];
        ko.Y = -1;
    }

    public boolean s() {
        try {
            if (!this.W) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw ko.b(o_2);
        }
        this.w = ko.m();
        ko.J(this.j());
        return true;
    }

    public boolean z() {
        return this.W;
    }

    public void m() {
        ko.J(this.w);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ko.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

