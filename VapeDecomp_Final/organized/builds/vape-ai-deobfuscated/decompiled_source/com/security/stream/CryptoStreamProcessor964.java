/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package com.security.stream;

import a.V3;
import a.tR;
import a.tl;
import com.app.data.transformation.DataTransformationEngine1165;
import com.app.network.CommunicationProtocolManager1453;
import com.app.streaming.StreamProtocolHandler;
import com.app.transaction.management.TransactionLifecycleContract;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionAlgorithmManager1716;
import com.data.transformation.DataTransformationEngine1209;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.encoding.NetworkPacketEncoder;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.transaction.validation.TransactionValidator1298;
import com.workflow.core.WorkflowCoordinator;
import com.workflow.management.WorkflowOrchestrator1763;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class CryptoStreamProcessor964
implements TransactionLifecycleContract {
    private static final Integer[] c;
    private static final long a;
    private static final long[] b;
    private static final Map d;
    NetworkPacketEncoder J;

    @Override
    public void z(float f, float f2, int n, int n2, float f3) {
        long l = a ^ 0x2E1A7F43682AL;
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
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (!bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (!bl4) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        int n3 = GL11.glGetInteger((int)CryptoStreamProcessor964.a("a", (int)837, (long)(0xF8B79589E947293L ^ l)));
        this.J.Q();
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
            this.J.N();
            tl.O(n3);
            if (!bl) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (!bl3) {
                tl.Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (!bl4) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ox" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void P(V3 v3, int n, int n2) {
        if (GeometryCalculator.C() >= 35) {
            StreamProtocolHandler streamProtocolHandler = StreamProtocolHandler.u();
            CommunicationProtocolManager1453 communicationProtocolManager1453 = v3.G();
            WorkflowCoordinator workflowCoordinator = streamProtocolHandler.S(communicationProtocolManager1453);
            WorkflowOrchestrator1763 workflowOrchestrator1763 = new WorkflowOrchestrator1763(workflowCoordinator.s());
            ApplicationLifecycleManager.s().q(workflowOrchestrator1763.C());
            GL11.glPushMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tl.w();
            DataTransformationEngine1165.k(DataTransformationEngine1209.i(), 0, 0, 0, n, n2, workflowCoordinator);
            GL11.glPopMatrix();
            return;
        }
        ApplicationLifecycleManager.s().q(TransformationEngine.U());
        TransactionValidator1298 transactionValidator1298 = TransactionValidator1298.l(v3.n());
        if (transactionValidator1298.F()) {
            int n3 = transactionValidator1298.p();
            GL11.glPushMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tl.w();
            GraphicsBufferAllocator.K(0, 0, n3 % 8 * 18, 198 + n3 / 8 * 18, n, n2);
            GL11.glPopMatrix();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoStreamProcessor964.a = MultiContainerRegistry.a(6368879321587616261L, -5845714993833343270L, MethodHandles.lookup().lookupClass()).a(220014643324373L);
                CryptoStreamProcessor964.d = new HashMap<K, V>(13);
                var0 = CryptoStreamProcessor964.a ^ 2319344388896L;
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
                var6_5 = "\u0097\u00b3\u00ed\u00d2w\u00bf\u0013\u009f\u00e7\u00f9k\u0019\u00d7O\u008693y\u009d=\u009c\u00c7\u00a6\u0086\u0099\tm\u0089\u00c6\u0086.~";
                var7_6 = "\u0097\u00b3\u00ed\u00d2w\u00bf\u0013\u009f\u00e7\u00f9k\u0019\u00d7O\u008693y\u009d=\u009c\u00c7\u00a6\u0086\u0099\tm\u0089\u00c6\u0086.~".length();
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
                    var6_5 = "\u00a8\u0013\u001ae\u009a\u00ea\u00b9\u00b3{\u000eQ\u008e\u00a2\u0080\u00e5\u00a1";
                    var7_6 = "\u00a8\u0013\u001ae\u009a\u00ea\u00b9\u00b3{\u000eQ\u008e\u00a2\u0080\u00e5\u00a1".length();
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
        CryptoStreamProcessor964.b = var8_3;
        CryptoStreamProcessor964.c = new Integer[6];
    }

    @Override
    public void t(V3 v3) {
        long l = a ^ 0x6A8163C6CDL;
        int n = 18;
        int n2 = 18;
        int n3 = GL11.glGetInteger((int)CryptoStreamProcessor964.a("a", (int)20793, (long)(0x373A451436A60E0FL ^ l)));
        int n4 = GL11.glGetInteger((int)CryptoStreamProcessor964.a("a", (int)17345, (long)(0x52B28637D24F1CF1L ^ l)));
        boolean bl = GL11.glIsEnabled((int)3089);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        try {
            if (bl) {
                GL11.glDisable((int)3089);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (!bl2) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        try {
            CompressionAlgorithmManager1716.H(2978, intBuffer);
            GL11.glPushMatrix();
            this.J = new NetworkPacketEncoder(n, n2, true);
            this.J.c(n, n2);
            this.J.h(true);
            tl.k();
            tl.N();
            GL11.glEnable((int)2929);
            tl.N();
            GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glClear((int)16384);
            GL11.glClear((int)256);
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)18.0, (double)18.0, (double)0.0, (double)-1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            tR.l();
            tl.P();
            GL11.glEnable((int)CryptoStreamProcessor964.a("a", (int)29564, (long)(0x25301F1D33AF2C49L ^ l)));
            GL11.glPushMatrix();
            tl.j();
            this.P(v3, n, n2);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            this.J.Q();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            tR.g();
            GL11.glDisable((int)CryptoStreamProcessor964.a("a", (int)16552, (long)(0x72399B1B543A9F9FL ^ l)));
            this.J.Q();
            this.J.d();
            GL11.glPopMatrix();
            GL11.glViewport((int)intBuffer.get(0), (int)intBuffer.get(1), (int)intBuffer.get(2), (int)intBuffer.get(3));
            GL30.glBindFramebuffer((int)CryptoStreamProcessor964.a("a", (int)10719, (long)(0x58BC53DA0003F6EBL ^ l)), (int)n3);
            tl.O(n4);
            if (bl) {
                GL11.glEnable((int)3089);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
        try {
            if (!bl2) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoStreamProcessor964.a(customSystemException);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1108;
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
                throw new RuntimeException("a/Ox", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoStreamProcessor964.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoStreamProcessor964.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoStreamProcessor964.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

