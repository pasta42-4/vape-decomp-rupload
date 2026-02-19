/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.data.contract.DataTransformationContract2366;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.cipher.CipherOperationEnum;

public class EventDispatchController1219
implements DataTransformationContract2366 {
    private CipherOperationEnum G;
    private long[] y;
    private static boolean q;

    public CipherOperationEnum k() {
        return this.G;
    }

    static {
        if (EventDispatchController1219.I()) {
            EventDispatchController1219.Z(true);
        }
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.G = networkProtocolEncoder1013.L(CipherOperationEnum.class);
        if (this.G == CipherOperationEnum.ADD) {
            int n = networkProtocolEncoder1013.U();
            this.y = new long[n];
            try {
                for (int i = 0; i < n; ++i) {
                    this.y[i] = networkProtocolEncoder1013.S();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchController1219.a(customSystemException);
            }
        }
    }

    public static EventDispatchController1219 V() {
        return new EventDispatchController1219(CipherOperationEnum.CHANGED_WORLD);
    }

    public static EventDispatchController1219 w(long[] lArray) {
        return new EventDispatchController1219(CipherOperationEnum.ADD, lArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private EventDispatchController1219(CipherOperationEnum cipherOperationEnum) {
        this.G = cipherOperationEnum;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.G);
        if (this.G == CipherOperationEnum.ADD) {
            networkProtocolEncoder1013.e(this.y.length);
            for (long l : this.y) {
                networkProtocolEncoder1013.Z(l);
            }
        }
    }

    public static boolean I() {
        boolean bl = EventDispatchController1219.h();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchController1219.a(customSystemException);
        }
        return false;
    }

    private EventDispatchController1219(CipherOperationEnum cipherOperationEnum, long[] lArray) {
        this(cipherOperationEnum);
        this.y = lArray;
    }

    public static void Z(boolean bl) {
        q = bl;
    }

    public long[] d() {
        return this.y;
    }

    public static boolean h() {
        return q;
    }

    public EventDispatchController1219() {
    }
}

