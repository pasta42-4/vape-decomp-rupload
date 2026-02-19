/*
 * Decompiled with CFR 0.152.
 */
package com.app.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class SecureFileOutputStream
extends OutputStream {
    private FileOutputStream j = null;
    private String i;

    @Override
    public void write(int n) throws IOException {
        this.M();
        this.j.write(n);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.M();
        this.j.write(byArray);
    }

    private void M() throws IOException {
        try {
            if (this.j == null) {
                this.j = new FileOutputStream(this.i);
            }
        }
        catch (IOException iOException) {
            throw SecureFileOutputStream.a(iOException);
        }
    }

    @Override
    public void close() throws IOException {
        this.M();
        this.j.close();
    }

    SecureFileOutputStream(String string) {
        this.i = string;
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        this.M();
        this.j.write(byArray, n, n2);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void flush() throws IOException {
        this.M();
        this.j.flush();
    }
}

