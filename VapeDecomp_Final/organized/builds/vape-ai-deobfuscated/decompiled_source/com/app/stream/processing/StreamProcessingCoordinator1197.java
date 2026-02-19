/*
 * Decompiled with CFR 0.152.
 */
package com.app.stream.processing;

import a.Bj;
import a.KB;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.input.GameInputController;
import com.network.config.NetworkConfigurationResolver2717;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.auth.AuthenticationTokenGenerator268;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.input.UserInputEventMapper;
import java.util.List;

public class StreamProcessingCoordinator1197
implements NetworkConfigurationResolver2717 {
    private Bj D;

    private boolean x(AuthenticationTokenGenerator268 authenticationTokenGenerator268) {
        Bj bj = authenticationTokenGenerator268.K();
        try {
            if (bj == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        try {
            if (this.D != null) {
                this.D.V();
                bj.I(this.D);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        this.D = bj;
        return true;
    }

    @DataExchangeProtocol2090
    public void O(UserInputEventMapper userInputEventMapper) {
        if (userInputEventMapper.getButtonState()) {
            List<AuthenticationTokenGenerator268> list = TemporalMetadataResolver.h.E().a(-100 + userInputEventMapper.getButton());
            try {
                if (list.isEmpty()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StreamProcessingCoordinator1197.a(customSystemException);
            }
            for (AuthenticationTokenGenerator268 authenticationTokenGenerator268 : list) {
                try {
                    try {
                        if (!authenticationTokenGenerator268.d(-100 + userInputEventMapper.getButton()) || !this.x(authenticationTokenGenerator268)) continue;
                        break;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingCoordinator1197.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingCoordinator1197.a(customSystemException);
                }
            }
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void U(GameInputController gameInputController) {
        try {
            if (gameInputController.isDown()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        try {
            if (gameInputController.getThePlayer().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Ew)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        List<AuthenticationTokenGenerator268> list = TemporalMetadataResolver.h.E().a(gameInputController.getKey());
        try {
            if (list.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        for (AuthenticationTokenGenerator268 authenticationTokenGenerator268 : list) {
            try {
                try {
                    if (!authenticationTokenGenerator268.d(gameInputController.getKey()) || !this.x(authenticationTokenGenerator268)) continue;
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingCoordinator1197.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StreamProcessingCoordinator1197.a(customSystemException);
            }
        }
    }

    @DataExchangeProtocol2090
    public void Z(KB kB) {
        try {
            if (this.D == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
        try {
            this.D.P();
            if (this.D.I()) {
                this.D = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingCoordinator1197.a(customSystemException);
        }
    }
}

