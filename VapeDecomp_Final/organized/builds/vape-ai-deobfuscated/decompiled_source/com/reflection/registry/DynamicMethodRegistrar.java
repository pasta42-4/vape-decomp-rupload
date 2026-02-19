/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package com.reflection.registry;

import a.Ne;
import a.tl;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.encoding.NetworkPacketEncoder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.FloatBuffer;
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

class DynamicMethodRegistrar {
    private static final Map e;
    NetworkPacketEncoder c;
    private static final long a;
    private static final Integer[] d;
    private static final long[] b;

    DynamicMethodRegistrar() {
    }

    void B(float f, float f2, int n, int n2) {
        long l = a ^ 0x36B50761947DL;
        Ne.h.y(2903);
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
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (!bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (!bl4) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        int n3 = GL11.glGetInteger((int)DynamicMethodRegistrar.a("k", (int)18479, (long)(0x45ABC20C38D7F68AL ^ l)));
        int n4 = GL11.glGetInteger((int)DynamicMethodRegistrar.a("k", (int)19793, (long)(0x239C5FC0407A73F5L ^ l)));
        this.c.Q();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 0.0f;
        try {
            GL11.glBegin((int)7);
            GL11.glTexCoord2f((float)f5, (float)f4);
            GL11.glVertex2f((float)(f + (float)n), (float)f2);
            GL11.glTexCoord2f((float)f3, (float)f4);
            GL11.glVertex2f((float)f, (float)f2);
            GL11.glTexCoord2f((float)f3, (float)f6);
            GL11.glVertex2f((float)f, (float)(f2 + (float)n2));
            GL11.glTexCoord2f((float)f5, (float)f6);
            GL11.glVertex2f((float)(f + (float)n), (float)(f2 + (float)n2));
            GL11.glEnd();
            GL11.glPopMatrix();
            this.c.N();
            tl.O(n4);
            if (!bl) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
        }
        try {
            if (bl4) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMethodRegistrar.a(customSystemException);
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
            throw new RuntimeException("a/Xm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    void U(String string, int n) {
        long l = a ^ 0x1F9E65FF209FL;
        int n2 = ApplicationLifecycleManager.X().L(string);
        int n3 = ApplicationLifecycleManager.X().B(string);
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glPushMatrix();
        GL11.glOrtho((double)0.0, (double)n2, (double)n3, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        int n4 = GL11.glGetInteger((int)DynamicMethodRegistrar.a("k", (int)20974, (long)(0x199759CA4F0E5BAAL ^ l)));
        this.c = new NetworkPacketEncoder(n2, n3, true);
        this.c.c(n2, n3);
        this.c.h(true);
        ApplicationLifecycleManager.X().u(string, 0.0, 0.0, n);
        this.c.Q();
        this.c.d();
        tl.O(n4);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glPopMatrix();
        GL11.glLoadMatrix((FloatBuffer)floatBuffer);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPopMatrix();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicMethodRegistrar.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x517E;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Xm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicMethodRegistrar.d[n2] = n3;
        }
        return d[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(2281765485733763985L, 6462316593317842913L, MethodHandles.lookup().lookupClass()).a(213332960948652L);
        e = new HashMap(13);
        long l = a ^ 0xE77F101C3CDL;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "$y\u00c6\u00e8!\u001ah\u008cb\u00ad>\u00a4\u0088\u000e\u00a7\u009c\b\u00fe\u00a4&\u0094\u0095d_";
        int n2 = "$y\u00c6\u00e8!\u001ah\u008cb\u00ad>\u00a4\u0088\u000e\u00a7\u009c\b\u00fe\u00a4&\u0094\u0095d_".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        d = new Integer[3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicMethodRegistrar.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

