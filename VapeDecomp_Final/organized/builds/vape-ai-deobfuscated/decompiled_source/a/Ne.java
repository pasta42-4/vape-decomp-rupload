/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.event.processing.EventStreamProcessor1098;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolHandler1142;
import com.network.protocol.RemoteProtocolHandler;
import com.system.configuration.ConfigurationManager;

public class Ne {
    public static RemoteProtocolHandler h;

    static {
        try {
            h = ConfigurationManager.U() ? new EventStreamProcessor1098() : new NetworkProtocolHandler1142();
        }
        catch (CustomSystemException customSystemException) {
            throw Ne.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

