/*
 * Decompiled with CFR 0.152.
 */
package com.sensor.integration;

import a.KB;
import com.communication.protocol.DataExchangeProtocol2090;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.network.config.ConnectionConfigurationResolver;
import com.network.config.NetworkConfigurationResolver2717;
import com.simulation.world.WorldStateTransitioner;

public class SensorAdapter
implements NetworkConfigurationResolver2717 {
    private ConnectionConfigurationResolver c;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void t(KB kB) {
        block15: {
            boolean bl;
            block16: {
                ConnectionConfigurationResolver connectionConfigurationResolver;
                block14: {
                    connectionConfigurationResolver = kB.getWorld();
                    bl = connectionConfigurationResolver.Y();
                    try {
                        try {
                            if (this.c != null || bl) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SensorAdapter.a(customSystemException);
                        }
                        new WorldStateTransitioner(this.c, connectionConfigurationResolver).fire();
                        this.c = connectionConfigurationResolver;
                        break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SensorAdapter.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (this.c == null || bl) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SensorAdapter.a(customSystemException);
                        }
                        if (this.c.M() == connectionConfigurationResolver.M()) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SensorAdapter.a(customSystemException);
                    }
                    new WorldStateTransitioner(this.c, connectionConfigurationResolver).fire();
                    this.c = connectionConfigurationResolver;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw SensorAdapter.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.c == null || !bl) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw SensorAdapter.a(customSystemException);
                }
                new WorldStateTransitioner(this.c, null).fire();
                this.c = null;
            }
            catch (CustomSystemException customSystemException) {
                throw SensorAdapter.a(customSystemException);
            }
        }
    }
}

