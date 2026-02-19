/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.security.cryptography;

import com.data.contract.DataTransformationContract2366;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import com.type.conversion.PrimitiveTypeMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CryptographicKeyManager1216
implements DataTransformationContract2366 {
    @NotNull
    private PrimitiveTypeMapper h;
    @NotNull
    private ReflectionUtilityManager680 r;
    static final boolean K;
    @Nullable
    private ReflectionUtilityManager680 i;

    private CryptographicKeyManager1216(@Nullable ReflectionUtilityManager680 reflectionUtilityManager680, @NotNull ReflectionUtilityManager680 reflectionUtilityManager6802, @NotNull PrimitiveTypeMapper primitiveTypeMapper) {
        this.i = reflectionUtilityManager680;
        this.r = reflectionUtilityManager6802;
        this.h = primitiveTypeMapper;
    }

    @NotNull
    public ReflectionUtilityManager680 Z() {
        return this.r;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        block6: {
            block7: {
                try {
                    try {
                        try {
                            networkProtocolEncoder1013.N(this.h);
                            if (this.h != PrimitiveTypeMapper.SENT) break block6;
                            if (K) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyManager1216.a(customSystemException);
                        }
                        if (this.i != null) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyManager1216.a(customSystemException);
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyManager1216.a(customSystemException);
                }
            }
            this.i.o(networkProtocolEncoder1013);
        }
        this.r.o(networkProtocolEncoder1013);
    }

    public static CryptographicKeyManager1216 f(ReflectionUtilityManager680 reflectionUtilityManager680) {
        return new CryptographicKeyManager1216(null, reflectionUtilityManager680, PrimitiveTypeMapper.DECLINED);
    }

    public CryptographicKeyManager1216() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static CryptographicKeyManager1216 j(ReflectionUtilityManager680 reflectionUtilityManager680) {
        return new CryptographicKeyManager1216(null, reflectionUtilityManager680, PrimitiveTypeMapper.ACCEPTED);
    }

    static {
        boolean bl;
        try {
            bl = !CryptographicKeyManager1216.class.desiredAssertionStatus();
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager1216.a(customSystemException);
        }
        K = bl;
    }

    @Nullable
    public ReflectionUtilityManager680 O() {
        return this.i;
    }

    @NotNull
    public PrimitiveTypeMapper j() {
        return this.h;
    }

    public static CryptographicKeyManager1216 f(ReflectionUtilityManager680 reflectionUtilityManager680, ReflectionUtilityManager680 reflectionUtilityManager6802) {
        return new CryptographicKeyManager1216(reflectionUtilityManager680, reflectionUtilityManager6802, PrimitiveTypeMapper.SENT);
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            this.h = networkProtocolEncoder1013.L(PrimitiveTypeMapper.class);
            if (this.h == PrimitiveTypeMapper.SENT) {
                this.i = new ReflectionUtilityManager680(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager1216.a(customSystemException);
        }
        this.r = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }
}

