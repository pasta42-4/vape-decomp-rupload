/*
 * Decompiled with CFR 0.152.
 */
package com.event.orchestration;

import a.eF;
import com.collections.management.MultiContainerRegistry;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.network.messaging.TransmissionPayload;
import com.operations.bitwise.BitwiseOperationInterface;
import com.system.compilation.CompilationDiagnosticException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DeclarativeEventOrchestrator
extends eF
implements BitwiseOperationInterface {
    protected int w;
    private static final long serialVersionUID = 1L;
    protected int y;
    protected int l;
    private static final long a = MultiContainerRegistry.a(7067008697491019228L, -2451128387691132700L, MethodHandles.lookup().lookupClass()).a(44495608716977L);
    private static final long b;
    protected String J;

    public String u() {
        return this.J;
    }

    public void L(TransmissionPayload transmissionPayload) {
        this.M(transmissionPayload);
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.Q(this);
    }

    @Override
    public String v() {
        return "decl";
    }

    public int y() {
        return this.y;
    }

    public DeclarativeEventOrchestrator H(TransmissionPayload transmissionPayload, int n, PersistenceRecord persistenceRecord) {
        DeclarativeEventOrchestrator declarativeEventOrchestrator = new DeclarativeEventOrchestrator(this.l, this.w + n);
        declarativeEventOrchestrator.J = this.J;
        declarativeEventOrchestrator.M(transmissionPayload);
        DeclarativeEventOrchestrator.c(declarativeEventOrchestrator, persistenceRecord);
        return declarativeEventOrchestrator;
    }

    public void L(int n) {
        this.w += n;
    }

    public int S() {
        return this.l;
    }

    public void R(String string) {
        this.J = string;
    }

    private static void w(StringBuilder stringBuilder, eF eF2, char c) {
        while (true) {
            block10: {
                PersistenceRecord persistenceRecord;
                block9: {
                    persistenceRecord = eF2.l();
                    try {
                        if (!(persistenceRecord instanceof TransmissionPayload)) break block9;
                        stringBuilder.append(((TransmissionPayload)persistenceRecord).e());
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DeclarativeEventOrchestrator.a(customSystemException);
                    }
                }
                try {
                    if (persistenceRecord instanceof eF) {
                        DeclarativeEventOrchestrator.w(stringBuilder, (eF)persistenceRecord, c);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DeclarativeEventOrchestrator.a(customSystemException);
                }
            }
            eF2 = eF2.n();
            try {
                if (eF2 == null) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DeclarativeEventOrchestrator.a(customSystemException);
            }
            stringBuilder.append(c);
        }
    }

    public DeclarativeEventOrchestrator(int n, String string, int n2, int n3, TransmissionPayload transmissionPayload) {
        super(null);
        this.l = n;
        this.w = n2;
        this.y = n3;
        this.J = string;
        this.M(transmissionPayload);
        DeclarativeEventOrchestrator.c(this, null);
    }

    public void T(int n) {
        this.y = n;
    }

    public static String s(eF eF2, char c) {
        try {
            if (eF2 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DeclarativeEventOrchestrator.a(customSystemException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        DeclarativeEventOrchestrator.w(stringBuilder, eF2, c);
        return stringBuilder.toString();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public PersistenceRecord S() {
        eF eF2 = this.n();
        try {
            if (eF2 != null) {
                return eF2.l();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DeclarativeEventOrchestrator.a(customSystemException);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7C5CF4919954L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1000802250339444038L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public DeclarativeEventOrchestrator(int n, int n2) {
        super(null);
        this.l = n;
        this.w = n2;
        this.y = -1;
        this.J = null;
    }

    public int N() {
        return this.w;
    }

    public DeclarativeEventOrchestrator(eF eF2, int n) {
        long l = a ^ 0x328FB82D3AE2L;
        super(null);
        this.l = (int)b;
        this.w = n;
        this.y = -1;
        this.J = DeclarativeEventOrchestrator.s(eF2, '/');
    }
}

