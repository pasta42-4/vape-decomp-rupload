/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class ze
extends URLConnection {
    final _d c;

    @Override
    public void connect() throws IOException {
    }

    @Override
    public int getContentLength() {
        return this.c.i.length;
    }

    protected ze(_d _d2, URL uRL) {
        this.c = _d2;
        super(uRL);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(this.c.i);
    }
}

