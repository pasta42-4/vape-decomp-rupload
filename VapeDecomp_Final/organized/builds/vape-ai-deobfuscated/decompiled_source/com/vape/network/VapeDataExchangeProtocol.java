/*
 * Decompiled with CFR 0.152.
 */
package com.vape.network;

import com.core.exception.CustomRuntimeException;
import java.io.InputStream;
import java.net.URL;

public interface VapeDataExchangeProtocol {
    public InputStream o(String var1) throws CustomRuntimeException;

    public URL Y(String var1);
}

