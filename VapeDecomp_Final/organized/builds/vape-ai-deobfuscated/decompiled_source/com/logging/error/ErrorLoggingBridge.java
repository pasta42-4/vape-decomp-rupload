/*
 * Decompiled with CFR 0.152.
 */
package com.logging.error;

import com.app.events.EventDispatchProtocol2682;
import java.io.PrintStream;
import java.util.Date;

public class ErrorLoggingBridge
implements EventDispatchProtocol2682 {
    public static PrintStream u = System.out;

    @Override
    public void s(Throwable throwable) {
        u.println(new Date() + " ERROR:" + throwable.getMessage());
        throwable.printStackTrace(u);
    }
}

