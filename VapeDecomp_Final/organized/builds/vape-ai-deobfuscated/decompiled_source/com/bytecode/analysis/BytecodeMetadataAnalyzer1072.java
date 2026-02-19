/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.collections.management.MultiContainerRegistry;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class BytecodeMetadataAnalyzer1072 {
    private static final long b;
    private static final long a;

    static void h(Object object) {
        Class<?> clazz = object.getClass();
        String string = clazz.getName().replace('.', '/');
        try {
            if (!BytecodeMetadataAnalyzer1072.V(string)) {
                BytecodeMetadataAnalyzer1072.s(clazz.getClassLoader().getResourceAsStream(string + ".class"));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw BytecodeMetadataAnalyzer1072.a(illegalStateException);
        }
    }

    static void s(InputStream inputStream) {
        int n;
        long l = a ^ 0x1B434568A550L;
        try {
            if (inputStream == null) {
                throw new IllegalStateException("Bytecode not available, can't check class version");
            }
        }
        catch (Throwable throwable) {
            throw BytecodeMetadataAnalyzer1072.a(throwable);
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                n = dataInputStream.readUnsignedShort();
            }
            catch (Throwable throwable) {
                try {
                    dataInputStream.close();
                }
                catch (Throwable throwable2) {
                }
                throw throwable;
            }
            dataInputStream.close();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("I/O error, can't check class version", iOException);
        }
        try {
            if (n != (int)b) {
                throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
            }
        }
        catch (Throwable throwable) {
            throw BytecodeMetadataAnalyzer1072.a(throwable);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean V(String string) {
        try {
            if (!string.startsWith("org/objectweb/asm/")) {
                return false;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw BytecodeMetadataAnalyzer1072.a(illegalStateException);
        }
        String string2 = "(Annotation|Class|Field|Method|Module|RecordComponent|Signature)";
        try {
            if (string.contains("Test$")) return true;
            if (Pattern.matches("a/util/Trace" + string2 + "Visitor(\\$.*)?", string)) return true;
        }
        catch (IllegalStateException illegalStateException) {
            throw BytecodeMetadataAnalyzer1072.a(illegalStateException);
        }
        if (!Pattern.matches("a/util/Check" + string2 + "Adapter(\\$.*)?", string)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(2524924995761998332L, -8462143779640238936L, null).a(113676488550568L);
        long l = a ^ 0x1C27EBC0B980L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7427211903841259525L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

