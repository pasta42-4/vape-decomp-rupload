/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.zY;
import com.app.bytecode.analysis.BytecodeInstructionInterpreter;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.reflection.metadata.ClassMetadataMapper;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicContextManager577
extends BytecodeInstructionInterpreter {
    private static final zY m;
    private static final ClassMetadataMapper f;
    private final zY R;
    private static final zY x;
    private static final zY Q;
    private final int a;
    private static final zY b;
    private static final zY S;
    private static final ClassMetadataMapper w;
    private static final ClassMetadataMapper k;
    private static final ClassMetadataMapper P;
    private static final zY I;
    private final String g;
    private final List<zY> v;
    private static final long n;
    private static final zY e;
    private static final zY j;
    private final zY[] i;
    private static final long l;
    private static final ClassMetadataMapper Y;
    private static final zY h;
    private static final zY M;
    private static final ClassMetadataMapper O;

    public void g() {
        try {
            if ((this.a & 0x400) == 0) {
                this.t.c(0, 0);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicContextManager577.a(illegalStateException);
        }
        this.t.D();
    }

    public CryptographicContextManager577(BytecodeInstrumentationEngine bytecodeInstrumentationEngine, int n, String string, String string2) {
        long l = CryptographicContextManager577.l ^ 0x2A117101422BL;
        this((int)CryptographicContextManager577.n, bytecodeInstrumentationEngine, n, string, string2);
        if (this.getClass() != CryptographicContextManager577.class) {
            throw new IllegalStateException();
        }
    }

    public void F() {
        try {
            if ((this.a & 8) != 0) {
                throw new IllegalStateException("no 'this' pointer within static method");
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicContextManager577.a(illegalStateException);
        }
        this.t.n(25, 0);
    }

    public void j() {
        this.t.T(this.R.W(172));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        l = MultiContainerRegistry.a(-8578783554651911792L, -2499753074203308940L, null).a(200078190575369L);
        long l = CryptographicContextManager577.l ^ 0x1D654D100B5DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4881246691861417745L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                CryptographicContextManager577.n = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                b = zY.p("java/lang/Byte");
                M = zY.p("java/lang/Boolean");
                x = zY.p("java/lang/Short");
                j = zY.p("java/lang/Character");
                h = zY.p("java/lang/Integer");
                S = zY.p("java/lang/Float");
                m = zY.p("java/lang/Long");
                I = zY.p("java/lang/Double");
                Q = zY.p("java/lang/Number");
                e = zY.p("java/lang/Object");
                O = ClassMetadataMapper.Y("boolean booleanValue()");
                P = ClassMetadataMapper.Y("char charValue()");
                f = ClassMetadataMapper.Y("int intValue()");
                Y = ClassMetadataMapper.Y("float floatValue()");
                k = ClassMetadataMapper.Y("long longValue()");
                w = ClassMetadataMapper.Y("double doubleValue()");
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    protected void r(int n, zY zY2) {
        int n2 = n - this.o;
        try {
            while (this.v.size() < n2 + 1) {
                this.v.add(null);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicContextManager577.a(illegalStateException);
        }
        this.v.set(n2, zY2);
    }

    protected CryptographicContextManager577(int n, BytecodeInstrumentationEngine bytecodeInstrumentationEngine, int n2, String string, String string2) {
        super(n, n2, string2, bytecodeInstrumentationEngine);
        this.v = new ArrayList<zY>();
        this.a = n2;
        this.g = string;
        this.R = zY.C(string2);
        this.i = zY.a(string2);
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}

