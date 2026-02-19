/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.classloading.resolution.ClasspathResourceResolver;
import com.app.network.CustomUrlConnectionManager;
import com.app.network.context.NetworkContextManager;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

class CustomUrlStreamManager
extends URLStreamHandler {
    final ClasspathResourceResolver W;

    private CustomUrlStreamManager(ClasspathResourceResolver classpathResourceResolver) {
        this.W = classpathResourceResolver;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new CustomUrlConnectionManager(this.W, uRL);
    }

    CustomUrlStreamManager(ClasspathResourceResolver classpathResourceResolver, NetworkContextManager networkContextManager) {
        this(classpathResourceResolver);
    }
}

