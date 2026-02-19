/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package a;

import a.Dl;
import a.E2;
import a.EL;
import a.EP;
import a.Hc;
import a.Iy;
import a.KP;
import a.Na;
import a.Ne;
import a.O_;
import a.T_;
import a.V3;
import a.W9;
import a.WB;
import a.d8;
import a.e;
import a.kO;
import a.oq;
import a.t7;
import a.tP;
import a.tl;
import a.to;
import a.tx;
import a.tz;
import java.awt.Color;
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

public class kj
implements T_ {
    private static final Map d;
    private kO K;
    private static final long a;
    private static final Integer[] c;
    private static final long[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(276956126761376461L, 1417251718124013282L, MethodHandles.lookup().lookupClass()).a(74743436840039L);
        d = new HashMap(13);
        long l10 = a ^ 0x5DF208722030L;
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
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u0090\u00a756\u0005\u00f9j\u00ed\u00cf\u00da\u001bv\u00e4\u00be\"\u009b\u00ba\u00e6\u00f4\u00054\u00c21%";
        int n3 = "\u0090\u00a756\u0005\u00f9j\u00ed\u00cf\u00da\u001bv\u00e4\u00be\"\u009b\u00ba\u00e6\u00f4\u00054\u00c21%".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x47C2;
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
                throw new RuntimeException("a/kj", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kj.c[n3] = n4;
        }
        return c[n3];
    }

    private static tz l(tP tP2) {
        Hc hc2;
        Dl dl2;
        if (Na.MC_1_20_6.H()) {
            dl2 = tP2.I();
        } else {
            hc2 = new t7(tP2.s());
            dl2 = ((t7)hc2).C();
        }
        hc2 = EP.s();
        return ((tx)hc2).h(dl2);
    }

    @Override
    public void M(float f10, float f11, int n2, int n3, float f12, boolean bl2) {
        block3: {
            e e10;
            block2: {
                e10 = new e(Iy.DEFAULT, bl2).D(new WB(this.K.F)).E(f10, f11, n2, n3, 18.0f, 18.0f, 0.0f, 1.0f, 1.0f, 0.0f, new Color(1.0f, 1.0f, 1.0f, f12));
                try {
                    if (!bl2) break block2;
                    KP.x().O(e10);
                    break block3;
                }
                catch (O_ o_2) {
                    throw kj.a(o_2);
                }
            }
            KP.x().p(e10);
        }
    }

    @Override
    public void z(float f10, float f11, int n2, int n3, float f12) {
        this.M(f10, f11, n2, n3, f12, false);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void t(V3 v32) {
        long l10 = a ^ 0x37946F1639F4L;
        KP.x().v(0.0f);
        int n2 = 18;
        int n3 = 18;
        int n4 = GL11.glGetInteger((int)kj.a("o", (int)1442, (long)(0x180D0D8A37198C5EL ^ l10)));
        int n5 = GL11.glGetInteger((int)kj.a("o", (int)29774, (long)(0xBE81115A0307DB1L ^ l10)));
        boolean bl2 = GL11.glIsEnabled((int)3089);
        try {
            if (bl2) {
                GL11.glDisable((int)3089);
            }
        }
        catch (O_ o_2) {
            throw kj.a(o_2);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        E2.H(2978, intBuffer);
        this.K = new kO(n2, n3, true);
        this.K.c(n2, n3);
        this.K.h(true);
        tl.k();
        tl.N();
        GL11.glEnable((int)2929);
        tl.N();
        GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glClear((int)16384);
        GL11.glClear((int)256);
        Ne.h.z();
        Ne.h.m(0.0, -2.0, 0.0);
        Ne.h.x((float)EP.e() / 36.0f, (float)EP.b() / 36.0f, 0.0);
        tP tP2 = this.G(v32);
        tz tz2 = kj.l(tP2);
        float[] fArray = tP2.c();
        e e10 = new e().D(new WB(tz2.Q())).E(0.0f, -1.0f, 18.0f, 18.0f, n2, n3, fArray[0], fArray[2], fArray[1], fArray[3], Color.WHITE);
        KP kP2 = KP.x();
        try {
            kP2.p(e10);
            kP2.p(this.K.r);
            kP2.v(0.0f);
            kP2.T();
            this.K.Q();
            this.K.d();
            GL11.glViewport((int)intBuffer.get(0), (int)intBuffer.get(1), (int)intBuffer.get(2), (int)intBuffer.get(3));
            GL30.glBindFramebuffer((int)kj.a("o", (int)11821, (long)(0x7C913EB127B027D3L ^ l10)), (int)n4);
            tl.O(n5);
            if (bl2) {
                GL11.glEnable((int)3089);
            }
        }
        catch (O_ o_3) {
            throw kj.a(o_3);
        }
        Ne.h.X();
    }

    private tP G(V3 v32) {
        tP tP2;
        oq oq2 = v32.U();
        if (Na.MC_1_21_10.H()) {
            t7 t72 = EP.J().P(W9.X());
            tP2 = t72.y(EL.T(oq2));
        } else if (Na.MC_1_21_6.H()) {
            tP2 = EP.K().Z(EL.T(oq2));
        } else {
            to to2 = to.u();
            tP2 = to2.g(oq2);
        }
        return tP2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = kj.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

