/*
 * Decompiled with CFR 0.152.
 */
package com.visualization.rendering;

import a.FO;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.FontRenderManager;
import com.network.protocol.CommunicationProtocolInterface2601;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ColorRenderer
implements CommunicationProtocolInterface2601 {
    private static boolean S;
    private Color R = Color.white;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void T(BufferedImage bufferedImage, Graphics2D graphics2D, FontRenderManager fontRenderManager, FO fO2) {
        graphics2D.setColor(this.R);
        graphics2D.fill(fO2.K());
    }

    public String toString() {
        return "Color";
    }

    public static boolean N() {
        return S;
    }

    public static void T(boolean bl) {
        S = bl;
    }

    static {
        if (ColorRenderer.N()) {
            ColorRenderer.T(true);
        }
    }

    public static boolean R() {
        boolean bl = ColorRenderer.N();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorRenderer.a(customSystemException);
        }
        return false;
    }

    public ColorRenderer() {
    }

    public ColorRenderer(Color color) {
        this.R = color;
    }
}

