/*
 * Decompiled with CFR 0.152.
 */
package com.security.ssl;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

final class CustomTrustManager
extends X509ExtendedTrustManager {
    CustomTrustManager() {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string, SSLEngine sSLEngine) throws CertificateException {
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string, Socket socket) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string, SSLEngine sSLEngine) throws CertificateException {
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string, Socket socket) throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}

