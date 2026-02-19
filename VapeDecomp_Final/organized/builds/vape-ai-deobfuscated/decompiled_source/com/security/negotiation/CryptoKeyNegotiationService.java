/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package com.security.negotiation;

import a.Om;
import a.tl;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionAlgorithmManager1716;
import com.exception.system.CustomSystemException;
import com.graphics.buffer.GraphicsBufferManager;
import com.network.encoding.NetworkPacketEncoder;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.ConfigurationManager;
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

public class CryptoKeyNegotiationService
implements Om {
    private static final long a = MultiContainerRegistry.a(-8399813874896019629L, 1625448316025751835L, MethodHandles.lookup().lookupClass()).a(60093814351703L);
    private GraphicsBufferManager j = new GraphicsBufferManager();
    NetworkPacketEncoder X;
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
    public void m(float f, float f2, int n, int n2, float f3) {
        GL11.glEnable((int)2903);
        boolean bl = GL11.glIsEnabled((int)3553);
        boolean bl2 = GL11.glIsEnabled((int)2896);
        boolean bl3 = GL11.glIsEnabled((int)3008);
        boolean bl4 = GL11.glIsEnabled((int)3042);
        try {
            if (!bl) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (!bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (!bl4) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        this.X.Q();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
        GL11.glPushMatrix();
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        try {
            GL11.glBegin((int)7);
            GL11.glTexCoord2f((float)f6, (float)f5);
            GL11.glVertex2f((float)(f + (float)n), (float)f2);
            GL11.glTexCoord2f((float)f4, (float)f5);
            GL11.glVertex2f((float)f, (float)f2);
            GL11.glTexCoord2f((float)f4, (float)f7);
            GL11.glVertex2f((float)f, (float)(f2 + (float)n2));
            GL11.glTexCoord2f((float)f6, (float)f7);
            GL11.glVertex2f((float)(f + (float)n), (float)(f2 + (float)n2));
            GL11.glEnd();
            GL11.glPopMatrix();
            this.X.N();
            if (!bl) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (bl4) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoKeyNegotiationService.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x28CB4F1FF83FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00b5\u00b5\u007fn\u00f6U\u00ff\u009dc\u0098\u00b1\u00cb\u001d\u00c4\u00846";
        int n2 = "\u00b5\u00b5\u007fn\u00f6U\u00ff\u009dc\u0098\u00b1\u00cb\u001d\u00c4\u00846".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    @Override
    public void V(LightweightExecutionContext lightweightExecutionContext, float f) {
        long l = a ^ 0x627CE6DC0FA2L;
        int n = 32;
        int n2 = 32;
        boolean bl = GL11.glIsEnabled((int)3089);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        boolean bl3 = GL11.glIsEnabled((int)2929);
        try {
            if (bl) {
                GL11.glDisable((int)3089);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (!bl2) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (!bl3) {
                GL11.glEnable((int)2929);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        tl.R(true);
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        CompressionAlgorithmManager1716.h(3106, floatBuffer);
        ApplicationLifecycleManager.U().H(1.0);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        try {
            CompressionAlgorithmManager1716.H(2978, intBuffer);
            GL11.glPushMatrix();
            this.X = new NetworkPacketEncoder(n, n2, true);
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
            GL11.glEnable((int)CryptoKeyNegotiationService.a("m", (int)2403, (long)(0x283A6647DDC06F11L ^ l)));
            GL11.glPushMatrix();
            ConfigurationManager.h(lightweightExecutionContext, f, 0.0, 0.0, true);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glDisable((int)CryptoKeyNegotiationService.a("m", (int)16449, (long)(0x458B16BC280F2632L ^ l)));
            this.X.N();
            this.X.d();
            GL11.glPopMatrix();
            GL11.glClearColor((float)floatBuffer.get(0), (float)floatBuffer.get(1), (float)floatBuffer.get(2), (float)floatBuffer.get(3));
            GL11.glViewport((int)intBuffer.get(0), (int)intBuffer.get(1), (int)intBuffer.get(2), (int)intBuffer.get(3));
            if (!bl3) {
                GL11.glDisable((int)2929);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (bl) {
                GL11.glEnable((int)3089);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        try {
            if (!bl2) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyNegotiationService.a(customSystemException);
        }
        ApplicationLifecycleManager.U().F(1.0);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CryptoKeyNegotiationService() {
        this.j.v(8, 7, 2);
        this.j.z();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1F67;
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
                throw new RuntimeException("a/N3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoKeyNegotiationService.c[n2] = n3;
        }
        return c[n2];
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
            return MethodHandles.lookup().findStatic(CryptoKeyNegotiationService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

