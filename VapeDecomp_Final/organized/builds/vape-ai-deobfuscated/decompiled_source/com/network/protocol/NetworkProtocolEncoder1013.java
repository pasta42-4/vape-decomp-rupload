/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.network.protocol;

import com.exception.system.CustomSystemException;
import com.security.encoding.CryptoCharsetEnum;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkProtocolEncoder1013 {
    private static String t;
    private final ByteBuf H;

    public ByteBuf c(ByteBuffer byteBuffer) {
        return this.H.writeBytes(byteBuffer);
    }

    public short u() {
        return this.H.readShort();
    }

    static {
        if (NetworkProtocolEncoder1013.M() == null) {
            NetworkProtocolEncoder1013.M("ijRLSc");
        }
    }

    public String b(int n) {
        return CryptoCharsetEnum.T(this.H, n);
    }

    public void l(float f) {
        this.H.writeFloat(f);
    }

    public long S() {
        return this.H.readLong();
    }

    public NetworkProtocolEncoder1013(ByteBuf byteBuf) {
        this.H = byteBuf;
    }

    public int U() {
        return CryptoCharsetEnum.F(this.H);
    }

    public void i(UUID uUID) {
        CryptoCharsetEnum.J(this.H, uUID);
    }

    public boolean B() {
        return this.H.readBoolean();
    }

    public void z(short s2) {
        this.H.writeShort((int)s2);
    }

    public static void M(String string) {
        t = string;
    }

    public boolean k() {
        return this.H.release();
    }

    public void I(int n) {
        this.H.writeInt(n);
    }

    public ByteBuf H(ByteBuf byteBuf, int n) {
        return this.H.writeBytes(byteBuf, n);
    }

    public <E extends Enum<E>> E L(Class<E> clazz) {
        return CryptoCharsetEnum.W(this.H, clazz);
    }

    public int e() {
        return this.H.readInt();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int P(int n) {
        int n2 = 1;
        while (true) {
            block5: {
                try {
                    try {
                        if (n2 >= 5) break;
                        if ((n & -1 << n2 * 7) != 0) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolEncoder1013.a(customSystemException);
                    }
                    return n2;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolEncoder1013.a(customSystemException);
                }
            }
            ++n2;
        }
        return 5;
    }

    public void J(String string) {
        CryptoCharsetEnum.t(this.H, string);
    }

    public ByteBuf J(byte[] byArray, int n, int n2) {
        return this.H.writeBytes(byArray, n, n2);
    }

    public void L(double d2) {
        this.H.writeDouble(d2);
    }

    public double U() {
        return this.H.readDouble();
    }

    public ByteBuf k() {
        return this.H;
    }

    public UUID x() {
        return CryptoCharsetEnum.b(this.H);
    }

    public void Z(long l) {
        this.H.writeLong(l);
    }

    public void e(int n) {
        CryptoCharsetEnum.M(this.H, n);
    }

    public ByteBuf L(byte[] byArray) {
        return this.H.writeBytes(byArray);
    }

    public float o() {
        return this.H.readFloat();
    }

    public ByteBuf I(ByteBuf byteBuf) {
        return this.H.writeBytes(byteBuf);
    }

    public void N(Enum<?> enum_) {
        CryptoCharsetEnum.t(this.H, enum_);
    }

    public ByteBuf z(ByteBuf byteBuf, int n, int n2) {
        return this.H.writeBytes(byteBuf, n, n2);
    }

    public ByteBuf x(int n) {
        return this.H.ensureWritable(n);
    }

    public boolean h(int n) {
        return this.H.release(n);
    }

    public static String M() {
        return t;
    }

    public void W(boolean bl) {
        this.H.writeBoolean(bl);
    }
}

