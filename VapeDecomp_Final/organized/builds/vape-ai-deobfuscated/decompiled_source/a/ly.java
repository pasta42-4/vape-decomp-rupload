/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.core.exception.CustomRuntimeException;
import com.vape.network.VapeDataExchangeProtocol;
import java.io.InputStream;
import java.net.URL;

public class ly
implements VapeDataExchangeProtocol {
    private Class<?> Q;

    public ly(Class<?> clazz) {
        this.Q = clazz;
    }

    @Override
    public URL Y(String string) {
        String string2 = '/' + string.replace('.', '/') + ".class";
        return this.Q.getResource(string2);
    }

    ly() {
        this(Object.class);
    }

    public String toString() {
        return this.Q.getName() + ".class";
    }

    @Override
    public InputStream o(String string) throws CustomRuntimeException {
        String string2 = '/' + string.replace('.', '/') + ".class";
        return this.Q.getResourceAsStream(string2);
    }
}

