/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.graphics.palette.ColorPaletteGenerator;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class CommunicationProtocolHandler1761
implements DataProcessingProtocol {
    final ColorPaletteGenerator H;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        block4: {
            try {
                try {
                    if (this.H.G() || ColorPaletteGenerator.q(this.H).G()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolHandler1761.a(customSystemException);
                }
                ColorPaletteGenerator.R(this.H);
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolHandler1761.a(customSystemException);
            }
        }
    }

    CommunicationProtocolHandler1761(ColorPaletteGenerator colorPaletteGenerator) {
        this.H = colorPaletteGenerator;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

