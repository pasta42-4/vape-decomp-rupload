/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.priority;

import com.app.logging.core.LogCompiler;
import com.exception.system.CustomSystemException;

final class MessagePriorityController {
    private int g;
    private LogCompiler[][] G;

    public LogCompiler P(int n) {
        block4: {
            try {
                try {
                    if (n >= 0 && this.g > n) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessagePriorityController.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw MessagePriorityController.a(customSystemException);
            }
        }
        return this.G[n >> 7][n & 0x7F];
    }

    public MessagePriorityController(int n) {
        int n2 = (n >> 7 & 0xFFFFFFF8) + 8;
        this.G = new LogCompiler[n2][];
        this.g = 0;
    }

    public void e(LogCompiler logCompiler) {
        int n = this.g >> 7;
        int n2 = this.g & 0x7F;
        int n3 = this.G.length;
        if (n >= n3) {
            LogCompiler[][] logCompilerArrayArray = new LogCompiler[n3 + 8][];
            System.arraycopy(this.G, 0, logCompilerArrayArray, 0, n3);
            this.G = logCompilerArrayArray;
        }
        try {
            if (this.G[n] == null) {
                this.G[n] = new LogCompiler[128];
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessagePriorityController.a(customSystemException);
        }
        this.G[n][n2] = logCompiler;
        ++this.g;
    }

    public MessagePriorityController() {
        this.G = new LogCompiler[8][];
        this.g = 0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

