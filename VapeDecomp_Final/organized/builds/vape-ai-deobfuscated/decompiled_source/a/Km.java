/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Ne;
import a.tl;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchOrchestrator1391;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.rendering.buffer.GraphicsBufferAllocator;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Km {
    private int M;
    private int t;
    private int V;
    private static boolean U;
    private final NetworkConfigManager J;
    private boolean L;
    public double a;
    public double e;
    private boolean s;
    public double Y;
    public float D;
    private int j;
    private EventDispatchOrchestrator1391 R;
    private static final long b;
    private static final long c;
    public float d;

    public void e(int n) {
        this.j = n;
        this.L = false;
    }

    public Km(int n, int n2) {
        long l = b ^ 0x6BA36AF8CCB7L;
        this.J = new NetworkConfigManager();
        this.t = (int)c;
        this.s = this.s;
        this.j = n;
        this.V = n2;
        this.g();
    }

    public void s() {
        try {
            if (!ApplicationLifecycleManager.N().s()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Km.a(customSystemException);
        }
        this.W(false);
        this.s().p();
        ApplicationLifecycleManager.y().e(true);
    }

    public boolean i() {
        return this.L;
    }

    public int h() {
        return this.V;
    }

    public void F(int n) {
        this.V = n;
        this.L = false;
    }

    public int K() {
        return this.j;
    }

    public void M() {
        try {
            if (!ApplicationLifecycleManager.N().s()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Km.a(customSystemException);
        }
        this.s().B();
        this.W(true);
    }

    protected void W(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    this.R.e(true);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw Km.a(customSystemException);
                }
            }
            this.R.p();
        }
        U = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(4501463452213418176L, 8197265271422550182L, MethodHandles.lookup().lookupClass()).a(279836957434126L);
        long l = b ^ 0x7918DAF980D2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -4248722347677064139L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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

    public void g(boolean bl, double d2, double d3, double d4, double d5) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        block25: {
            block27: {
                block26: {
                    try {
                        if (!ApplicationLifecycleManager.N().s()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Km.a(customSystemException);
                    }
                    Ne.h.y(2903);
                    bl5 = GL11.glIsEnabled((int)3553);
                    bl4 = GL11.glIsEnabled((int)2896);
                    bl3 = GL11.glIsEnabled((int)3008);
                    bl2 = GL11.glIsEnabled((int)3042);
                    try {
                        if (!bl5) {
                            tl.B();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Km.a(customSystemException);
                    }
                    try {
                        if (bl4) {
                            tl.P();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Km.a(customSystemException);
                    }
                    try {
                        try {
                            tl.Z();
                            tl.j();
                            if (!bl) break block25;
                            this.R.B();
                            if (!this.s) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Km.a(customSystemException);
                        }
                        GraphicsBufferAllocator.N(d2, d3, d4, d5);
                        break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Km.a(customSystemException);
                    }
                }
                GraphicsBufferAllocator.O(d2, d3, d4, d5);
            }
            this.R.q();
        }
        try {
            if (!bl5) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Km.a(customSystemException);
        }
        try {
            if (bl4) {
                tl.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Km.a(customSystemException);
        }
        try {
            if (bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Km.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Km.a(customSystemException);
        }
    }

    public EventDispatchOrchestrator1391 s() {
        return this.R;
    }

    public void g() {
        this.R = EventDispatchOrchestrator1391.t(this.j, this.V, true);
        this.k();
    }

    public void k() {
        this.R.p(this.j, this.V);
    }
}

