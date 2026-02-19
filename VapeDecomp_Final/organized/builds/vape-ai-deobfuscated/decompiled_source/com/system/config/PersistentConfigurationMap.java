/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import com.event.orchestration.DeclarativeEventOrchestrator;
import com.exception.system.CustomSystemException;
import java.util.HashMap;

public final class PersistentConfigurationMap
extends HashMap<String, DeclarativeEventOrchestrator> {
    private static final long serialVersionUID = 1L;
    private PersistentConfigurationMap t;

    public PersistentConfigurationMap() {
        this((PersistentConfigurationMap)null);
    }

    public void s(String string, DeclarativeEventOrchestrator declarativeEventOrchestrator) {
        this.put(string, declarativeEventOrchestrator);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DeclarativeEventOrchestrator u(String string) {
        DeclarativeEventOrchestrator declarativeEventOrchestrator;
        block4: {
            declarativeEventOrchestrator = (DeclarativeEventOrchestrator)this.get(string);
            try {
                try {
                    if (declarativeEventOrchestrator != null || this.t == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw PersistentConfigurationMap.a(customSystemException);
                }
                return this.t.u(string);
            }
            catch (CustomSystemException customSystemException) {
                throw PersistentConfigurationMap.a(customSystemException);
            }
        }
        return declarativeEventOrchestrator;
    }

    public PersistentConfigurationMap(PersistentConfigurationMap persistentConfigurationMap) {
        this.t = persistentConfigurationMap;
    }
}

