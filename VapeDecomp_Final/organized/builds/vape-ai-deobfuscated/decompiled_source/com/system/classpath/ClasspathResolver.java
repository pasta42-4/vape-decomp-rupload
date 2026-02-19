/*
 * Decompiled with CFR 0.152.
 */
package com.system.classpath;

import a.ly;
import com.app.messaging.MessageQueueManager2685;
import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;
import com.exception.system.CustomSystemException;
import com.reflection.loading.DynamicClassLoader;
import com.reflection.metadata.ClassMetadataExtractor;
import com.vape.network.VapeDataExchangeProtocol;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

final class ClasspathResolver {
    protected MessageQueueManager2685 S = null;

    public synchronized VapeDataExchangeProtocol W(VapeDataExchangeProtocol vapeDataExchangeProtocol) {
        block4: {
            MessageQueueManager2685 messageQueueManager2685;
            MessageQueueManager2685 messageQueueManager26852;
            block3: {
                messageQueueManager26852 = new MessageQueueManager2685(vapeDataExchangeProtocol, null);
                messageQueueManager2685 = this.S;
                try {
                    if (messageQueueManager2685 != null) break block3;
                    this.S = messageQueueManager26852;
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClasspathResolver.a(customSystemException);
                }
            }
            while (messageQueueManager2685.N != null) {
                messageQueueManager2685 = messageQueueManager2685.N;
            }
            messageQueueManager2685.N = messageQueueManager26852;
        }
        return vapeDataExchangeProtocol;
    }

    public VapeDataExchangeProtocol l() {
        try {
            if (ClassMetadataExtractor.f < 53) {
                return this.W(new ly());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClasspathResolver.a(customSystemException);
        }
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return this.W(new DynamicClassLoader(classLoader));
    }

    public URL x(String string) {
        MessageQueueManager2685 messageQueueManager2685 = this.S;
        URL uRL = null;
        while (messageQueueManager2685 != null) {
            uRL = messageQueueManager2685.O.Y(string);
            if (uRL == null) {
                messageQueueManager2685 = messageQueueManager2685.N;
                continue;
            }
            return uRL;
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public synchronized VapeDataExchangeProtocol r(VapeDataExchangeProtocol vapeDataExchangeProtocol) {
        this.S = new MessageQueueManager2685(vapeDataExchangeProtocol, this.S);
        return vapeDataExchangeProtocol;
    }

    InputStream u(String string) throws CustomRuntimeException {
        MessageQueueManager2685 messageQueueManager2685 = this.S;
        InputStream inputStream = null;
        CustomRuntimeException customRuntimeException = null;
        while (messageQueueManager2685 != null) {
            block7: {
                try {
                    inputStream = messageQueueManager2685.O.o(string);
                }
                catch (CustomRuntimeException customRuntimeException2) {
                    if (customRuntimeException != null) break block7;
                    customRuntimeException = customRuntimeException2;
                }
            }
            if (inputStream == null) {
                messageQueueManager2685 = messageQueueManager2685.N;
                continue;
            }
            return inputStream;
        }
        try {
            if (customRuntimeException != null) {
                throw customRuntimeException;
            }
        }
        catch (CustomRuntimeException customRuntimeException3) {
            throw ClasspathResolver.a(customRuntimeException3);
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[class path: ");
        MessageQueueManager2685 messageQueueManager2685 = this.S;
        while (messageQueueManager2685 != null) {
            stringBuilder.append(messageQueueManager2685.O.toString());
            stringBuilder.append(File.pathSeparatorChar);
            messageQueueManager2685 = messageQueueManager2685.N;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static void l(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n = 4096;
        byte[] byArray = null;
        int n2 = 0;
        while (true) {
            block4: {
                try {
                    if (n2 >= 64) break;
                    if (n2 >= 8) break block4;
                }
                catch (IOException iOException) {
                    throw ClasspathResolver.a(iOException);
                }
                byArray = new byte[n *= 2];
            }
            int n3 = 0;
            int n4 = 0;
            do {
                if ((n4 = inputStream.read(byArray, n3, n - n3)) >= 0) continue;
                outputStream.write(byArray, 0, n3);
                return;
            } while ((n3 += n4) < n);
            outputStream.write(byArray);
            ++n2;
        }
        throw new IOException("too much data");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void N(String string, OutputStream outputStream) throws CustomRuntimeException, IOException, ContextualExceptionHandler {
        InputStream inputStream = this.u(string);
        try {
            if (inputStream == null) {
                throw new CustomRuntimeException(string);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ClasspathResolver.a(customRuntimeException);
        }
        try {
            ClasspathResolver.l(inputStream, outputStream);
        }
        finally {
            inputStream.close();
        }
    }
}

