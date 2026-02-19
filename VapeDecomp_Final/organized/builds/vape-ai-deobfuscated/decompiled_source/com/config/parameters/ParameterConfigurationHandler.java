/*
 * Decompiled with CFR 0.152.
 */
package com.config.parameters;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class ParameterConfigurationHandler {
    private static int O = 0;

    public static void q(String string) {
        try {
            try {
                if (O == 0) {
                    ParameterConfigurationHandler.P();
                }
            }
            catch (Exception exception) {
                throw ParameterConfigurationHandler.a(exception);
            }
            switch (O) {
                case 1: {
                    StringSelection stringSelection = new StringSelection(string);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(stringSelection, stringSelection);
                }
                case 2: {
                    ApplicationLifecycleManager.c().p(string);
                }
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String l() {
        try {
            try {
                if (O == 0) {
                    ParameterConfigurationHandler.P();
                }
            }
            catch (Exception exception) {
                throw ParameterConfigurationHandler.a(exception);
            }
            switch (O) {
                case 1: {
                    Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
                    try {
                        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                            return (String)transferable.getTransferData(DataFlavor.stringFlavor);
                        }
                    }
                    catch (Exception exception) {
                        throw ParameterConfigurationHandler.a(exception);
                    }
                }
                case 2: {
                    ApplicationLifecycleManager.c().a();
                }
            }
            return "";
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
        return "";
    }

    private static void P() {
        int n;
        boolean bl = GraphicsEnvironment.isHeadless();
        try {
            n = bl ? 2 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw ParameterConfigurationHandler.a(customSystemException);
        }
        O = n;
    }
}

