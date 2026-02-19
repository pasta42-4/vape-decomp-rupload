/*
 * Decompiled with CFR 0.152.
 */
package com.serialization.security;

import a.eF;
import com.collections.management.MultiContainerRegistry;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.operations.bitwise.BitwiseOperationInterface;
import com.system.compilation.CompilationDiagnosticException;
import com.util.serialization.SerializationUtility;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SerializationSecurityManager
extends eF
implements BitwiseOperationInterface {
    protected boolean J;
    private static final long serialVersionUID = 1L;
    private static final long a = MultiContainerRegistry.a(5750303154577918765L, 8748934515013093335L, MethodHandles.lookup().lookupClass()).a(76605354445595L);
    private static final long b;
    protected int O;

    public SerializationSecurityManager(int n, eF eF2, SerializationUtility serializationUtility) {
        super(null, new eF(eF2));
        this.J = true;
        this.O = n;
        if (serializationUtility != null) {
            SerializationSecurityManager.c(this, serializationUtility);
        }
    }

    public boolean b() {
        return this.J;
    }

    public SerializationSecurityManager(eF eF2, eF eF3) {
        long l = a ^ 0x7D40D747BFBAL;
        super(eF2, new eF(eF3));
        this.J = false;
        this.O = (int)b;
    }

    public eF b() {
        return (eF)this.Z();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public SerializationUtility Z() {
        PersistenceRecord persistenceRecord = this.u().u();
        try {
            if (persistenceRecord == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SerializationSecurityManager.a(customSystemException);
        }
        return (SerializationUtility)persistenceRecord.Z();
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.K(this);
    }

    @Override
    protected String v() {
        String string;
        try {
            string = this.J ? "new[]" : "new";
        }
        catch (CustomSystemException customSystemException) {
            throw SerializationSecurityManager.a(customSystemException);
        }
        return string;
    }

    public int q() {
        return this.O;
    }

    public eF N() {
        return (eF)this.u().Z();
    }

    public eF F() {
        return this.N();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x58A28272541BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2256447537601442740L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static SerializationSecurityManager l(eF eF2, eF eF3, SerializationUtility serializationUtility) {
        SerializationSecurityManager serializationSecurityManager = new SerializationSecurityManager(eF2, eF3);
        try {
            serializationSecurityManager.J = true;
            if (serializationUtility != null) {
                SerializationSecurityManager.c(serializationSecurityManager, serializationUtility);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SerializationSecurityManager.a(customSystemException);
        }
        return serializationSecurityManager;
    }
}

