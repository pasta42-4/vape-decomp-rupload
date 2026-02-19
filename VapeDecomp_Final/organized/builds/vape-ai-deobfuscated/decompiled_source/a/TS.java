/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package a;

import com.app.correlation.management.UuidCorrelationManager;
import com.crypto.constants.CipherModeEnum;
import com.exception.system.CustomSystemException;
import com.messaging.template.MessageTemplateCompiler;
import com.network.connection.NetworkEndpointIdentifier;
import com.network.protocol.NetworkProtocolEncoder1013;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TS
extends UuidCorrelationManager<MessageTemplateCompiler> {
    @Nullable
    private NetworkEndpointIdentifier o;
    private CipherModeEnum J;

    public TS() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TS(@Nullable MessageTemplateCompiler messageTemplateCompiler, @NotNull NetworkEndpointIdentifier networkEndpointIdentifier) {
        this(messageTemplateCompiler, CipherModeEnum.SENT);
        this.o = networkEndpointIdentifier;
    }

    public TS(@Nullable MessageTemplateCompiler messageTemplateCompiler, CipherModeEnum cipherModeEnum) {
        super(messageTemplateCompiler);
        this.J = cipherModeEnum;
    }

    public CipherModeEnum E() {
        return this.J;
    }

    @Nullable
    public NetworkEndpointIdentifier C() {
        return this.o;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            networkProtocolEncoder1013.N(this.J);
            if (this.o != null) {
                this.o.p(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TS.a(customSystemException);
        }
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            this.J = networkProtocolEncoder1013.L(CipherModeEnum.class);
            if (this.J == CipherModeEnum.SENT) {
                this.o = new NetworkEndpointIdentifier(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TS.a(customSystemException);
        }
    }
}

