/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.jD;
import com.app.network.NetworkProtocolHandler1444;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderingController
extends GameRenderContextBridge {
    private final NetworkProtocolHandler1444 b;
    private static final ConcurrentRequestTracker W;
    private int Z;
    private static final long c;
    private final float i;
    private static final long a;
    private final float e;
    private final int I;
    private final float j;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(8872116472420093606L, 8103370493771926485L, MethodHandles.lookup().lookupClass()).a(256689749230861L);
        long l = a ^ 0x58882EC6498DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4948684611244880141L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                W = new ConcurrentRequestTracker();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return W;
    }

    public void setOpacity(int n) {
        this.Z = n;
    }

    public RenderingController(Object object, float f, float f2, float f3, int n) {
        long l = a ^ 0x1D8C5D8CF711L;
        this.b = new NetworkProtocolHandler1444(object);
        this.i = f;
        this.j = f2;
        this.e = f3;
        this.I = n;
        this.Z = (int)c;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return W;
    }

    @Override
    public boolean fire() {
        block4: {
            int n;
            int n2;
            int n3;
            jD jD2 = TemporalMetadataResolver.h.U().l();
            try {
                if (jD2 == null || !jD2.Z()) break block4;
            }
            catch (CustomSystemException customSystemException) {
                throw RenderingController.a(customSystemException);
            }
            jD2.X(this);
            int n4 = this.b.A(this.I);
            int n5 = this.b.M().get(n4);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                n3 = (int)((float)(n5 & 0xFF) * this.i);
                n2 = (int)((float)(n5 >> 8 & 0xFF) * this.j);
                n = (int)((float)(n5 >> 16 & 0xFF) * this.e);
            } else {
                n3 = (int)((float)(n4 >> 24 & 0xFF) * this.i);
                n2 = (int)((float)(n4 >> 16 & 0xFF) * this.j);
                n = (int)((float)(n4 >> 8 & 0xFF) * this.e);
            }
            int n6 = 0;
            n6 |= this.Z << 24;
            n6 |= n3 << 16;
            n6 |= n2 << 8;
            this.b.M().put(n4, n6 |= n);
        }
        return this.isCanceled();
    }
}

