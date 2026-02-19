/*
 * Decompiled with CFR 0.152.
 */
package com.app.graphics.rendering;

import a.X8;
import a.XL;
import a.cw;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.messaging.transform.MessageTransformationBroker;
import com.network.protocol.ProtocolMessageTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.auth.AuthenticationTokenGenerator720;
import com.security.computation.SecureComputationOrchestrator;
import com.security.crypto.CryptoKeyRotationManager;
import com.security.crypto.EncryptionTransformer;
import com.text.encoding.EncodingCharsetConverter;
import com.transaction.middleware.TransactionContextInterceptor;

public class RenderConfigurationManager1184
extends cw {
    private boolean r;
    private static int W;

    static {
        if (RenderConfigurationManager1184.q() == 0) {
            RenderConfigurationManager1184.U(77);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int q() {
        return W;
    }

    public static int h() {
        int n = RenderConfigurationManager1184.q();
        try {
            if (n == 0) {
                return 78;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager1184.a(customSystemException);
        }
        return 0;
    }

    public void H() {
        block6: {
            block5: {
                try {
                    if (GeometryCalculator.C() != 13) break block5;
                    this.h.add(new TransactionContextInterceptor());
                    this.h.add(new EncodingCharsetConverter());
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderConfigurationManager1184.a(customSystemException);
                }
            }
            try {
                if (GeometryCalculator.C() < 35) {
                    this.h.add(new X8());
                    this.h.add(new XL());
                    this.h.add(new AuthenticationTokenGenerator720());
                    this.h.add(new ProtocolMessageTransformer());
                    this.h.add(new MessageTransformationBroker());
                    this.h.add(new CryptoKeyRotationManager());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RenderConfigurationManager1184.a(customSystemException);
            }
        }
        this.z();
        this.r = true;
    }

    public boolean a() {
        return this.r;
    }

    public static void U(int n) {
        W = n;
    }

    public RenderConfigurationManager1184() {
        EncryptionTransformer.H(ReflectionMetadataResolver.rl);
        EncryptionTransformer.H(ReflectionMetadataResolver.PE);
        EncryptionTransformer.H(ReflectionMetadataResolver.Uu);
        EncryptionTransformer.H(ReflectionMetadataResolver.bU);
        EncryptionTransformer.H(ReflectionMetadataResolver.Uo);
        EncryptionTransformer.H(ReflectionMetadataResolver.FK);
        EncryptionTransformer.H(ReflectionMetadataResolver.FM);
        EncryptionTransformer.H(ReflectionMetadataResolver.Et);
        EncryptionTransformer.H(ReflectionMetadataResolver.l);
        if (GeometryCalculator.C() > 13) {
            EncryptionTransformer.H(ReflectionMetadataResolver.PX);
            EncryptionTransformer.H(ReflectionMetadataResolver.U0);
            EncryptionTransformer.H(ReflectionMetadataResolver.P2);
            EncryptionTransformer.H(ReflectionMetadataResolver.Pb);
            EncryptionTransformer.H(ReflectionMetadataResolver.bE);
            EncryptionTransformer.H(ReflectionMetadataResolver.Ei);
            EncryptionTransformer.H(ReflectionMetadataResolver.ri);
            EncryptionTransformer.H(ReflectionMetadataResolver.VJ);
            EncryptionTransformer.H(ReflectionMetadataResolver.V7);
            EncryptionTransformer.H(ReflectionMetadataResolver.E9);
        } else {
            EncryptionTransformer.H(ReflectionMetadataResolver.VE);
            EncryptionTransformer.H(ReflectionMetadataResolver.bD);
        }
        this.h.add(new SecureComputationOrchestrator());
    }
}

