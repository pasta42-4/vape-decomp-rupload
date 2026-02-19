/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package com.security.token;

import com.graphics.memory.TextureMemoryManager;
import com.network.contract.CommunicationLifecycleContract;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class SecureTokenGenerator1229
implements CommunicationLifecycleContract {
    private int L;
    private static String B;
    private int j;

    static {
        if (SecureTokenGenerator1229.g() == null) {
            SecureTokenGenerator1229.J("oILCFb");
        }
    }

    @Override
    public int Z() {
        return TextureMemoryManager.e(this.L);
    }

    public SecureTokenGenerator1229(int n, int n2) {
        this.L = n;
        this.j = n2;
    }

    @Override
    public int P() {
        return 32;
    }

    @Override
    public int b() {
        return this.L;
    }

    @Override
    public int l() {
        return TextureMemoryManager.e(this.j);
    }

    @Override
    public int O() {
        return this.j;
    }

    public static String g() {
        return B;
    }

    public static void J(String string) {
        B = string;
    }

    @Override
    public ByteBuffer S() {
        return BufferUtils.createByteBuffer((int)(this.Z() * this.l() * 4));
    }
}

