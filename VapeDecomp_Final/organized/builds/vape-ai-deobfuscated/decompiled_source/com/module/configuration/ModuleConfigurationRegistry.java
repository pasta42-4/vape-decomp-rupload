/*
 * Decompiled with CFR 0.152.
 */
package com.module.configuration;

import com.communication.protocol.DataExchangeProtocol2090;
import com.data.processing.CollectionFilterProcessor;
import com.exception.system.CustomSystemException;
import com.game.input.GameInputController;
import com.network.config.NetworkConfigurationResolver2717;
import com.ui.input.UserInputEventMapper;
import java.util.ArrayList;

public class ModuleConfigurationRegistry
implements NetworkConfigurationResolver2717 {
    private static String l;
    private static final ArrayList<CollectionFilterProcessor> U;

    public static void c(CollectionFilterProcessor collectionFilterProcessor) {
        U.add(collectionFilterProcessor);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void x(UserInputEventMapper userInputEventMapper) {
        try {
            if (!userInputEventMapper.getButtonState()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationRegistry.a(customSystemException);
        }
        for (CollectionFilterProcessor collectionFilterProcessor : U) {
            collectionFilterProcessor.d(-100 + userInputEventMapper.getButton());
        }
    }

    public static String H() {
        return l;
    }

    @DataExchangeProtocol2090
    public void U(GameInputController gameInputController) {
        try {
            if (!gameInputController.isDown()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModuleConfigurationRegistry.a(customSystemException);
        }
        for (CollectionFilterProcessor collectionFilterProcessor : U) {
            collectionFilterProcessor.d(gameInputController.getKey());
        }
    }

    static {
        U = new ArrayList();
        ModuleConfigurationRegistry.h(null);
    }

    public static void h(String string) {
        l = string;
    }
}

