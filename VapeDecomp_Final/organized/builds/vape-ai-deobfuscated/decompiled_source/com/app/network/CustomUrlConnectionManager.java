/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.classloading.resolution.ClasspathResourceResolver;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class CustomUrlConnectionManager
extends URLConnection {
    final ClasspathResourceResolver c;

    @Override
    public void connect() throws IOException {
    }

    @Override
    public int getContentLength() {
        return this.c.i.length;
    }

    protected CustomUrlConnectionManager(ClasspathResourceResolver classpathResourceResolver, URL uRL) {
        this.c = classpathResourceResolver;
        super(uRL);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(this.c.i);
    }
}

