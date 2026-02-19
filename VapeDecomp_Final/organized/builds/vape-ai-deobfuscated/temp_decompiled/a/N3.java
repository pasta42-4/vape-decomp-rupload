/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.E2;
import a.EP;
import a.F8;
import a.O_;
import a.Om;
import a.V4;
import a._f;
import a.d8;
import a.kO;
import a.tl;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
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

public class N3
implements Om {
    private static final long a = d8.a(-8399813874896019629L, 1625448316025751835L, MethodHandles.lookup().lookupClass()).a(60093814351703L);
    private _f j = new _f();
    kO X;
    private static final Map d = new HashMap(13);
    private static final Integer[] c;
    private static final long[] b;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/N3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void m(float f10, float f11, int n2, int n3, float f12) {
        GL11.glEnable((int)2903);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        boolean bl3 = GL11.glIsEnabled((int)2896);
        boolean bl4 = GL11.glIsEnabled((int)3008);
        boolean bl5 = GL11.glIsEnabled((int)3042);
        try {
            if (!bl2) {
                tl.B();
            }
        }
        catch (O_ o_2) {
            throw N3.a(o_2);
        }
        try {
            if (bl3) {
                tl.P();
            }
        }
        catch (O_ o_3) {
            throw N3.a(o_3);
        }
        try {
            if (bl3) {
                tl.P();
            }
        }
        catch (O_ o_4) {
            throw N3.a(o_4);
        }
        try {
            if (!bl4) {
                tl.s();
            }
        }
        catch (O_ o_5) {
            throw N3.a(o_5);
        }
        try {
            if (!bl5) {
                tl.N();
            }
        }
        catch (O_ o_6) {
            throw N3.a(o_6);
        }
        this.X.Q();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f12);
        GL11.glPushMatrix();
        float f13 = 0.0f;
        float f14 = 1.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        try {
            GL11.glBegin((int)7);
            GL11.glTexCoord2f((float)f15, (float)f14);
            GL11.glVertex2f((float)(f10 + (float)n2), (float)f11);
            GL11.glTexCoord2f((float)f13, (float)f14);
            GL11.glVertex2f((float)f10, (float)f11);
            GL11.glTexCoord2f((float)f13, (float)f16);
            GL11.glVertex2f((float)f10, (float)(f11 + (float)n3));
            GL11.glTexCoord2f((float)f15, (float)f16);
            GL11.glVertex2f((float)(f10 + (float)n2), (float)(f11 + (float)n3));
            GL11.glEnd();
            GL11.glPopMatrix();
            this.X.N();
            if (!bl2) {
                tl.R();
            }
        }
        catch (O_ o_7) {
            throw N3.a(o_7);
        }
        try {
            if (bl3) {
                tl.T();
            }
        }
        catch (O_ o_8) {
            throw N3.a(o_8);
        }
        try {
            if (bl4) {
                tl.s();
            }
        }
        catch (O_ o_9) {
            throw N3.a(o_9);
        }
        try {
            if (bl5) {
                tl.N();
            }
        }
        catch (O_ o_10) {
            throw N3.a(o_10);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = N3.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x28CB4F1FF83FL;
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
        String string = "\u00b5\u00b5\u007fn\u00f6U\u00ff\u009dc\u0098\u00b1\u00cb\u001d\u00c4\u00846";
        int n3 = "\u00b5\u00b5\u007fn\u00f6U\u00ff\u009dc\u0098\u00b1\u00cb\u001d\u00c4\u00846".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[2];
    }

    @Override
    public void V(V4 v42, float f10) {
        long l10 = a ^ 0x627CE6DC0FA2L;
        int n2 = 32;
        int n3 = 32;
        boolean bl2 = GL11.glIsEnabled((int)3089);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        boolean bl4 = GL11.glIsEnabled((int)2929);
        try {
            if (bl2) {
                GL11.glDisable((int)3089);
            }
        }
        catch (O_ o_2) {
            throw N3.a(o_2);
        }
        try {
            if (!bl3) {
                tl.B();
            }
        }
        catch (O_ o_3) {
            throw N3.a(o_3);
        }
        try {
            if (!bl4) {
                GL11.glEnable((int)2929);
            }
        }
        catch (O_ o_4) {
            throw N3.a(o_4);
        }
        tl.R(true);
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        E2.h(3106, floatBuffer);
        EP.U().H(1.0);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        try {
            E2.H(2978, intBuffer);
            GL11.glPushMatrix();
            this.X = new kO(n2, n3, true);
            this.X.h(true);
            this.X.Q();
            GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glClear((int)16384);
            GL11.glClear((int)256);
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)16.0, (double)16.0, (double)0.0, (double)-1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            GL11.glEnable((int)N3.a("m", (int)2403, (long)(0x283A6647DDC06F11L ^ l10)));
            GL11.glPushMatrix();
            F8.h(v42, f10, 0.0, 0.0, true);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glDisable((int)N3.a("m", (int)16449, (long)(0x458B16BC280F2632L ^ l10)));
            this.X.N();
            this.X.d();
            GL11.glPopMatrix();
            GL11.glClearColor((float)floatBuffer.get(0), (float)floatBuffer.get(1), (float)floatBuffer.get(2), (float)floatBuffer.get(3));
            GL11.glViewport((int)intBuffer.get(0), (int)intBuffer.get(1), (int)intBuffer.get(2), (int)intBuffer.get(3));
            if (!bl4) {
                GL11.glDisable((int)2929);
            }
        }
        catch (O_ o_5) {
            throw N3.a(o_5);
        }
        try {
            if (bl2) {
                GL11.glEnable((int)3089);
            }
        }
        catch (O_ o_6) {
            throw N3.a(o_6);
        }
        try {
            if (!bl3) {
                tl.R();
            }
        }
        catch (O_ o_7) {
            throw N3.a(o_7);
        }
        EP.U().F(1.0);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public N3() {
        this.j.v(8, 7, 2);
        this.j.z();
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1F67;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/N3", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            N3.c[n3] = n4;
        }
        return c[n3];
    }

    @Override
    public void P() {
        this.X.r();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(N3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

