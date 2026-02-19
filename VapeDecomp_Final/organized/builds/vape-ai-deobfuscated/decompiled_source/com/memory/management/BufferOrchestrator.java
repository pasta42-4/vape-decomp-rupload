/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package com.memory.management;

import a.z6;
import com.collections.management.MultiContainerRegistry;
import com.data.compression.CompressionAlgorithmManager1716;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
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
import org.lwjgl.opengl.GL30;

public class BufferOrchestrator {
    private int e;
    private static final long[] b;
    private int T;
    private int G;
    private final int A;
    private final int x;
    private static final Integer[] c;
    private static final long a;
    private final int N;
    private final IntBuffer p = BufferUtils.createIntBuffer((int)16);
    private static final Map d;
    private int y;
    private final int z;

    public int X() {
        return this.z;
    }

    public void k() {
        GL30.glDeleteFramebuffers((int)this.G);
        GL11.glDeleteTextures((int)this.T);
        GL30.glDeleteRenderbuffers((int)this.y);
    }

    public void l() {
        long l;
        block3: {
            block2: {
                l = a ^ 0x628BFA8C62CAL;
                try {
                    if (!ConfigurationManager.U()) break block2;
                    z6.O.Z();
                    z6.D.J();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw BufferOrchestrator.a(customSystemException);
                }
            }
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
        }
        GL30.glBindFramebuffer((int)BufferOrchestrator.a("q", (int)29601, (long)(0xF3C6B83D9FFE52DL ^ l)), (int)this.e);
        this.p.rewind();
        GL11.glViewport((int)this.p.get(0), (int)this.p.get(1), (int)this.p.get(2), (int)this.p.get(3));
    }

    public void H() {
        block3: {
            block2: {
                long l = a ^ 0x388D0EBEFA8DL;
                this.p.clear();
                CompressionAlgorithmManager1716.H(2978, this.p);
                IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
                try {
                    CompressionAlgorithmManager1716.H((int)BufferOrchestrator.a("q", (int)7959, (long)(0x2EAB8723B7C791DBL ^ l)), intBuffer);
                    this.e = intBuffer.get(0);
                    GL11.glViewport((int)0, (int)0, (int)(this.x * 4), (int)(this.z * 4));
                    GL30.glBindFramebuffer((int)BufferOrchestrator.a("q", (int)29601, (long)(0xF3C31852DCD7D6AL ^ l)), (int)this.G);
                    GL11.glClear((int)256);
                    GL11.glClear((int)16384);
                    if (!ConfigurationManager.U()) break block2;
                    z6.O.Z();
                    z6.O.f(0.0f, this.x, this.z, 0.0f, -2000.0f, 1000.0f);
                    z6.D.F();
                    z6.D.d();
                    z6.D.e(-this.A, -this.N, 0.0f);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw BufferOrchestrator.a(customSystemException);
                }
            }
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)this.x, (double)this.z, (double)0.0, (double)-2000.0, (double)1000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)(-this.A), (float)(-this.N), (float)0.0f);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ht" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F0;
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
                throw new RuntimeException("a/Ht", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BufferOrchestrator.c[n2] = n3;
        }
        return c[n2];
    }

    public int R() {
        return this.N;
    }

    public int o() {
        return this.A;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                BufferOrchestrator.a = MultiContainerRegistry.a(8954986285320866036L, -3099562824762260105L, MethodHandles.lookup().lookupClass()).a(128609943237260L);
                BufferOrchestrator.d = new HashMap<K, V>(13);
                var0 = BufferOrchestrator.a ^ 66419901014593L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u009e\u00c6\u00ca\u00ae\u00f9;\u0016<\u009c\u00dd\u00a3\u00a6\u00da\u00889,\u00d5\u00ad\u0015\u0012\u000b\u00c9\u00c2\u00dc\u00ebQA\u00a7\u00f4\u00f5\u0099\u008a\u00df@E\u00c9`D\u00a0}\u0004{\u00fc\u00f75uI\u00e1\u00a0\u00d2/\u00b3t\u00b3T\u00c2%`[\u00b8\u0010\u00b2\u00c4!\u0080\u00e0\u0001n\u0093\u00abl\u00ce";
                var7_6 = "\u009e\u00c6\u00ca\u00ae\u00f9;\u0016<\u009c\u00dd\u00a3\u00a6\u00da\u00889,\u00d5\u00ad\u0015\u0012\u000b\u00c9\u00c2\u00dc\u00ebQA\u00a7\u00f4\u00f5\u0099\u008a\u00df@E\u00c9`D\u00a0}\u0004{\u00fc\u00f75uI\u00e1\u00a0\u00d2/\u00b3t\u00b3T\u00c2%`[\u00b8\u0010\u00b2\u00c4!\u0080\u00e0\u0001n\u0093\u00abl\u00ce".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u001e7\u0000d*\u00d0:i\u001f3\u00a0\u00c2\u0089v}\u00d9";
                    var7_6 = "\u001e7\u0000d*\u00d0:i\u001f3\u00a0\u00c2\u0089v}\u00d9".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        BufferOrchestrator.b = var8_3;
        BufferOrchestrator.c = new Integer[11];
    }

    public int v() {
        return this.x;
    }

    public int e() {
        return this.T;
    }

    public BufferOrchestrator(int n, int n2, int n3, int n4) {
        this.A = n;
        this.N = n2;
        this.x = n3;
        this.z = n4;
        this.c();
    }

    private void c() {
        long l = a ^ 0x18ECD42274A6L;
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
        CompressionAlgorithmManager1716.H((int)BufferOrchestrator.a("q", (int)25332, (long)(0x73287CDDB726212L ^ l)), intBuffer);
        int n = intBuffer.get(0);
        IntBuffer intBuffer2 = BufferUtils.createIntBuffer((int)16);
        CompressionAlgorithmManager1716.H((int)BufferOrchestrator.a("q", (int)10848, (long)(0x321C588CD4402A84L ^ l)), intBuffer2);
        int n2 = intBuffer2.get(0);
        IntBuffer intBuffer3 = BufferUtils.createIntBuffer((int)16);
        CompressionAlgorithmManager1716.H((int)BufferOrchestrator.a("q", (int)17642, (long)(0x33D5E1D796DC401L ^ l)), intBuffer3);
        int n3 = intBuffer3.get(0);
        this.G = GL30.glGenFramebuffers();
        GL30.glBindFramebuffer((int)BufferOrchestrator.a("q", (int)3310, (long)(0x1C98BC5027950C0DL ^ l)), (int)this.G);
        this.T = GL11.glGenTextures();
        GL11.glBindTexture((int)3553, (int)this.T);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)(this.x * 4), (int)(this.z * 4), (int)0, (int)6408, (int)5121, (ByteBuffer)null);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL30.glFramebufferTexture2D((int)BufferOrchestrator.a("q", (int)29601, (long)(0xF3C11E4F751F341L ^ l)), (int)BufferOrchestrator.a("q", (int)23928, (long)(0x3124793E3F5B5D9AL ^ l)), (int)3553, (int)this.T, (int)0);
        this.y = GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer((int)BufferOrchestrator.a("q", (int)23701, (long)(0x60E88FFD3A49DC7CL ^ l)), (int)this.y);
        GL30.glRenderbufferStorage((int)BufferOrchestrator.a("q", (int)9583, (long)(0x21E40E2235BFA58AL ^ l)), (int)6402, (int)(this.x * 4), (int)(this.z * 4));
        GL30.glFramebufferRenderbuffer((int)BufferOrchestrator.a("q", (int)29601, (long)(0xF3C11E4F751F341L ^ l)), (int)BufferOrchestrator.a("q", (int)33, (long)(0x2C66FE4EDB7880C0L ^ l)), (int)BufferOrchestrator.a("q", (int)9583, (long)(0x21E40E2235BFA58AL ^ l)), (int)this.y);
        if (GL30.glCheckFramebufferStatus((int)BufferOrchestrator.a("q", (int)29601, (long)(0xF3C11E4F751F341L ^ l))) != BufferOrchestrator.a("q", (int)26270, (long)(0x7ADB8B7568036676L ^ l))) {
            // empty if block
        }
        GL30.glBindFramebuffer((int)BufferOrchestrator.a("q", (int)29601, (long)(0xF3C11E4F751F341L ^ l)), (int)n);
        GL11.glBindTexture((int)3553, (int)n2);
        GL30.glBindRenderbuffer((int)BufferOrchestrator.a("q", (int)9583, (long)(0x21E40E2235BFA58AL ^ l)), (int)n3);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = BufferOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(BufferOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

