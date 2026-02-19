/*
 * Decompiled with CFR 0.152.
 */
package com.security.transform;

import a.eF;
import com.collections.management.MultiContainerRegistry;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.operations.bitwise.BitwiseOperationInterface;
import com.system.compilation.CompilationDiagnosticException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecureDataTransformer1124
extends eF
implements BitwiseOperationInterface {
    protected int E;
    private static final long serialVersionUID = 1L;
    protected int R;
    private static final long a = MultiContainerRegistry.a(-2289444971885968623L, 7298714979946338293L, MethodHandles.lookup().lookupClass()).a(257915689783724L);
    private static final long b;

    public SecureDataTransformer1124(int n, int n2, PersistenceRecord persistenceRecord) {
        super(null, new eF(persistenceRecord));
        this.E = n;
        this.R = n2;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.s(this);
    }

    public PersistenceRecord m() {
        return this.u().Z();
    }

    public int A() {
        return this.E;
    }

    @Override
    public String v() {
        return "cast:" + this.E + ":" + this.R;
    }

    public SecureDataTransformer1124(eF eF2, int n, PersistenceRecord persistenceRecord) {
        long l = a ^ 0x1AEE52CA5D8DL;
        super(eF2, new eF(persistenceRecord));
        this.E = (int)b;
        this.R = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4A5447D5FAEDL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7283826077729922845L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public eF l() {
        return (eF)this.Z();
    }

    public int P() {
        return this.R;
    }
}

