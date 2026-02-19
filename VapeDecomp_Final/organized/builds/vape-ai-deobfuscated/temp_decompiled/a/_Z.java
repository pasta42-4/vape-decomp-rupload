/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.el;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class _z
implements X509TrustManager {
    final el w;

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    _z(el el2) {
        this.w = el2;
    }
}

