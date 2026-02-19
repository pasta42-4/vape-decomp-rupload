/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package com.graphics.memory;

import a.GB;
import a.tl;
import com.collections.management.MultiContainerRegistry;
import com.geospatial.resolver.GeoLocationResolver;
import com.network.contract.CommunicationLifecycleContract;
import com.network.protocol.ProtocolNegotiationInterface;
import com.security.token.SecureTokenGenerator1229;
import com.system.config.ComputationalParameterConfigurator;
import com.system.configuration.MultiParameterConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;

public class TextureMemoryManager {
    private boolean w;
    private static final long b;
    private HashMap Q;
    private int Z;
    private static final long a;
    private HashMap F;
    protected static GB D;
    private static final TextureMemoryManager C;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static int e(int n) {
        int n2;
        for (n2 = 2; n2 < n; n2 *= 2) {
        }
        return n2;
    }

    private TextureMemoryManager() {
        long l = a ^ 0x46A1F06B465FL;
        this.Q = new HashMap();
        this.F = new HashMap();
        this.Z = (int)b;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-9051491416525597244L, -271502889858366007L, MethodHandles.lookup().lookupClass()).a(92768888946211L);
        long l = a ^ 0x5EE35F78A806L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -6238042683832025521L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                D = GeoLocationResolver.Y();
                C = new TextureMemoryManager();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public ProtocolNegotiationInterface w(CommunicationLifecycleContract communicationLifecycleContract, int n) throws IOException {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        MultiParameterConfigurationManager multiParameterConfigurationManager;
        ByteBuffer byteBuffer;
        int n8;
        block16: {
            int n9;
            int n10;
            boolean bl;
            n8 = 3553;
            byteBuffer = communicationLifecycleContract.S();
            try {
                if (byteBuffer == null) {
                    TemporalMetadataResolver.x("Texture Buffer null");
                    return null;
                }
            }
            catch (IOException iOException) {
                throw TextureMemoryManager.a(iOException);
            }
            int n11 = tl.f();
            multiParameterConfigurationManager = new MultiParameterConfigurationManager("generated:" + communicationLifecycleContract, n8, n11);
            n7 = n;
            n6 = n;
            boolean bl2 = false;
            tl.O(n11);
            n5 = communicationLifecycleContract.b();
            n4 = communicationLifecycleContract.O();
            try {
                bl = communicationLifecycleContract.P() == 32;
            }
            catch (IOException iOException) {
                throw TextureMemoryManager.a(iOException);
            }
            boolean bl3 = bl;
            multiParameterConfigurationManager.e(communicationLifecycleContract.Z());
            multiParameterConfigurationManager.F(communicationLifecycleContract.l());
            int n12 = multiParameterConfigurationManager.S();
            int n13 = multiParameterConfigurationManager.G();
            try {
                n10 = bl3 ? 6408 : 6407;
            }
            catch (IOException iOException) {
                throw TextureMemoryManager.a(iOException);
            }
            n3 = n10;
            try {
                n9 = bl3 ? 4 : 3;
            }
            catch (IOException iOException) {
                throw TextureMemoryManager.a(iOException);
            }
            n2 = n9;
            multiParameterConfigurationManager.g(n5);
            multiParameterConfigurationManager.y(n4);
            multiParameterConfigurationManager.l(bl3);
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
            D.x(3379, intBuffer);
            int n14 = intBuffer.get(0);
            try {
                try {
                    if (n12 <= n14 && n13 <= n14) break block16;
                }
                catch (IOException iOException) {
                    throw TextureMemoryManager.a(iOException);
                }
                throw new IOException("Attempt to allocate a texture to big for the current hardware");
            }
            catch (IOException iOException) {
                throw TextureMemoryManager.a(iOException);
            }
        }
        try {
            if (this.w) {
                multiParameterConfigurationManager.O(n3, n2, n7, n6, byteBuffer);
            }
        }
        catch (IOException iOException) {
            throw TextureMemoryManager.a(iOException);
        }
        ComputationalParameterConfigurator.m();
        D.w(n8, 10241, n7);
        D.w(n8, 10240, n6);
        D.a(n8, 0, this.Z, TextureMemoryManager.e(n5), TextureMemoryManager.e(n4), 0, n3, 5121, byteBuffer);
        return multiParameterConfigurationManager;
    }

    public ProtocolNegotiationInterface j(int n, int n2, int n3) throws IOException {
        SecureTokenGenerator1229 secureTokenGenerator1229 = new SecureTokenGenerator1229(n, n2);
        return this.w(secureTokenGenerator1229, n3);
    }

    public static TextureMemoryManager g() {
        return C;
    }
}

