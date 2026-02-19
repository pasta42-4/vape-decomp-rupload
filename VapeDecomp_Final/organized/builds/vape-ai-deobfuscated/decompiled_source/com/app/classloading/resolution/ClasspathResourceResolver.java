/*
 * Decompiled with CFR 0.152.
 */
package com.app.classloading.resolution;

import com.exception.system.CustomSystemException;
import com.network.protocol.CustomUrlStreamManager;
import com.vape.network.VapeDataExchangeProtocol;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ClasspathResourceResolver
implements VapeDataExchangeProtocol {
    protected byte[] i;
    protected String I;

    @Override
    public InputStream o(String string) {
        try {
            if (this.I.equals(string)) {
                return new ByteArrayInputStream(this.i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClasspathResourceResolver.a(customSystemException);
        }
        return null;
    }

    public String toString() {
        return "byte[]:" + this.I;
    }

    public ClasspathResourceResolver(String string, byte[] byArray) {
        this.I = string;
        this.i = byArray;
    }

    @Override
    public URL Y(String string) {
        if (this.I.equals(string)) {
            String string2 = string.replace('.', '/') + ".class";
            try {
                return new URL(null, "file:/ByteArrayClassPath/" + string2, new CustomUrlStreamManager(this, null));
            }
            catch (MalformedURLException malformedURLException) {
                // empty catch block
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

