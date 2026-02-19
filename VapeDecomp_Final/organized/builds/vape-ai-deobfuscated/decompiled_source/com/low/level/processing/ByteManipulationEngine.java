/*
 * Decompiled with CFR 0.152.
 */
package com.low.level.processing;

import a.vC;
import com.collections.management.MultiContainerRegistry;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ByteManipulationEngine {
    private final int O;
    private int Y;
    private final byte[] v;
    private final int k;
    private final int W;
    private int U;
    private final byte y = 0;
    private int Q;
    private final byte V;
    private static final Map g;
    private static final String[] j;
    private final byte w;
    private final byte f;
    private final int i;
    private final InputStream R;
    private int A;
    private static final Integer[] e;
    private int D;
    private int r;
    private byte[] b;
    private int u;
    private static final Object[] h;
    private final byte Z;
    private int t;
    private byte[] L;
    private final int I;
    private static final long a;
    private byte[] c;
    private static final long[] d;
    private final byte[] J;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ByteManipulationEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void q(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.c != null) {
            int n = byArray.length;
            for (int i = 1; i < n; ++i) {
                int n2 = byArray[i] & 0xFF;
                byte by = this.L[n2 * 3 + 0];
                byte by2 = this.L[n2 * 3 + 1];
                byte by3 = this.L[n2 * 3 + 2];
                byte by4 = this.c[n2];
                byteBuffer.put(by3).put(by2).put(by).put(by4);
            }
        } else {
            int n = byArray.length;
            for (int i = 1; i < n; ++i) {
                int n3 = byArray[i] & 0xFF;
                byte by = this.L[n3 * 3 + 0];
                byte by5 = this.L[n3 * 3 + 1];
                byte by6 = this.L[n3 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by6).put(by5).put(by).put(by7);
            }
        }
    }

    private void k(ByteBuffer byteBuffer, byte[] byArray) {
        int n = byArray.length;
        try {
            for (int i = 1; i < n; i += 4) {
                byteBuffer.put((byte)-1).put((byte)-1).put((byte)-1).put(byArray[i + 3]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ByteManipulationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void U() throws IOException {
        this.F(this.v, 0, 8);
        this.A = this.c(this.v, 0);
        this.t = this.c(this.v, 4);
        this.D = this.A;
    }

    private void y(ByteBuffer byteBuffer, byte[] byArray) {
        byteBuffer.put(byArray, 1, byArray.length - 1);
    }

    private void C(ByteBuffer byteBuffer, byte[] byArray) {
        int n = byArray.length;
        try {
            for (int i = 1; i < n; i += 4) {
                byteBuffer.put(byArray[i + 3]).put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    public void f(byte by, byte by2, byte by3) {
        block15: {
            byte[] byArray;
            block14: {
                long l = a ^ 0x740FD5844E38L;
                try {
                    if (this.K()) {
                        throw new UnsupportedOperationException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)16319, (long)(0x2E609C41DC62E3C5L ^ l)), (long)7861148627725030788L, (long)l)));
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ByteManipulationEngine.a(unsupportedOperationException);
                }
                byArray = this.L;
                try {
                    if (byArray != null) break block14;
                    this.b = new byte[]{0, by, 0, by2, 0, by3};
                    break block15;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ByteManipulationEngine.a(unsupportedOperationException);
                }
            }
            this.c = new byte[byArray.length / 3];
            int n = 0;
            int n2 = 0;
            while (true) {
                block17: {
                    try {
                        block16: {
                            try {
                                try {
                                    try {
                                        if (n >= byArray.length) break;
                                        if (byArray[n] != by) break block16;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw ByteManipulationEngine.a(unsupportedOperationException);
                                    }
                                    if (byArray[n + 1] != by2) break block16;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw ByteManipulationEngine.a(unsupportedOperationException);
                                }
                                if (byArray[n + 2] == by3) break block17;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ByteManipulationEngine.a(unsupportedOperationException);
                            }
                        }
                        this.c[n2] = -1;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                }
                n += 3;
                ++n2;
            }
        }
    }

    private void U(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.b != null) {
            byte by = this.b[1];
            byte by2 = this.b[3];
            byte by3 = this.b[5];
            int n = byArray.length;
            for (int i = 1; i < n; i += 3) {
                byte by4;
                byte by5;
                byte by6;
                byte by7;
                block10: {
                    by7 = byArray[i];
                    by6 = byArray[i + 1];
                    by5 = byArray[i + 2];
                    by4 = -1;
                    try {
                        try {
                            if (by7 != by || by6 != by2) break block10;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ByteManipulationEngine.a(unsupportedOperationException);
                        }
                        if (by5 != by3) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                    by4 = 0;
                }
                byteBuffer.put(by5).put(by6).put(by7).put(by4);
            }
        } else {
            int n = byArray.length;
            try {
                for (int i = 1; i < n; i += 3) {
                    byteBuffer.put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]).put((byte)-1);
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw ByteManipulationEngine.a(unsupportedOperationException);
            }
        }
    }

    private void V(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.b != null) {
            byte by = this.b[1];
            byte by2 = this.b[3];
            byte by3 = this.b[5];
            int n = byArray.length;
            for (int i = 1; i < n; i += 3) {
                byte by4;
                byte by5;
                byte by6;
                byte by7;
                block10: {
                    by7 = byArray[i];
                    by6 = byArray[i + 1];
                    by5 = byArray[i + 2];
                    by4 = -1;
                    try {
                        try {
                            if (by7 != by || by6 != by2) break block10;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ByteManipulationEngine.a(unsupportedOperationException);
                        }
                        if (by5 != by3) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                    by4 = 0;
                }
                byteBuffer.put(by4).put(by5).put(by6).put(by7);
            }
        } else {
            int n = byArray.length;
            try {
                for (int i = 1; i < n; i += 3) {
                    byteBuffer.put((byte)-1).put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]);
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw ByteManipulationEngine.a(unsupportedOperationException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/FQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void g(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.c != null) {
            int n = byArray.length;
            for (int i = 1; i < n; ++i) {
                int n2 = byArray[i] & 0xFF;
                byte by = this.L[n2 * 3 + 0];
                byte by2 = this.L[n2 * 3 + 1];
                byte by3 = this.L[n2 * 3 + 2];
                byte by4 = this.c[n2];
                byteBuffer.put(by).put(by2).put(by3).put(by4);
            }
        } else {
            int n = byArray.length;
            for (int i = 1; i < n; ++i) {
                int n3 = byArray[i] & 0xFF;
                byte by = this.L[n3 * 3 + 0];
                byte by5 = this.L[n3 * 3 + 1];
                byte by6 = this.L[n3 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by).put(by5).put(by6).put(by7);
            }
        }
    }

    public boolean w() {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (this.K() || this.c != null) break block6;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ByteManipulationEngine.a(unsupportedOperationException);
                            }
                            if (this.b == null) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ByteManipulationEngine.a(unsupportedOperationException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ByteManipulationEngine.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/FQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void v(long l) throws IOException {
        while (l > 0L) {
            long l2 = this.R.skip(l);
            try {
                if (l2 < 0L) {
                    throw new EOFException();
                }
            }
            catch (IOException iOException) {
                throw ByteManipulationEngine.a(iOException);
            }
            l -= l2;
        }
    }

    private void S(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.c != null) {
            int n = byArray.length;
            for (int i = 1; i < n; ++i) {
                int n2 = byArray[i] & 0xFF;
                byte by = this.L[n2 * 3 + 0];
                byte by2 = this.L[n2 * 3 + 1];
                byte by3 = this.L[n2 * 3 + 2];
                byte by4 = this.c[n2];
                byteBuffer.put(by4).put(by3).put(by2).put(by);
            }
        } else {
            int n = byArray.length;
            for (int i = 1; i < n; ++i) {
                int n3 = byArray[i] & 0xFF;
                byte by = this.L[n3 * 3 + 0];
                byte by5 = this.L[n3 * 3 + 1];
                byte by6 = this.L[n3 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by7).put(by6).put(by5).put(by);
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void P(byte[] var1_1, byte[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void c(ByteBuffer byteBuffer, byte[] byArray) {
        int n = byArray.length;
        try {
            for (int i = 1; i < n; i += 4) {
                byteBuffer.put(byArray[i]).put(byArray[i + 1]).put(byArray[i + 2]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    private void O() throws IOException {
        int n;
        block7: {
            long l = a ^ 0x4BFC894154D7L;
            n = this.A / 3;
            try {
                block6: {
                    try {
                        try {
                            if (n < 1 || n > 256) break block6;
                        }
                        catch (IOException iOException) {
                            throw ByteManipulationEngine.a(iOException);
                        }
                        if (this.A % 3 == 0) break block7;
                    }
                    catch (IOException iOException) {
                        throw ByteManipulationEngine.a(iOException);
                    }
                }
                throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)31675, (long)(0x607F96BEC611BD3FL ^ l)), (long)8644473622290534251L, (long)l)));
            }
            catch (IOException iOException) {
                throw ByteManipulationEngine.a(iOException);
            }
        }
        this.L = new byte[n * 3];
        this.Q(this.L, 0, this.L.length);
    }

    /*
     * Exception decompiling
     */
    private void l() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ByteManipulationEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ByteManipulationEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ByteManipulationEngine.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                ByteManipulationEngine.h[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void t(ByteBuffer byteBuffer, byte[] byArray) {
        int n = byArray.length;
        try {
            for (int i = 1; i < n; i += 4) {
                byteBuffer.put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]).put(byArray[i + 3]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    /*
     * Exception decompiling
     */
    private void k(byte[] var1_1, byte[] var2_2) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public vC B(vC var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void f(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.b != null) {
            byte by = this.b[1];
            byte by2 = this.b[3];
            byte by3 = this.b[5];
            int n = byArray.length;
            for (int i = 1; i < n; i += 3) {
                byte by4;
                byte by5;
                byte by6;
                byte by7;
                block10: {
                    by7 = byArray[i];
                    by6 = byArray[i + 1];
                    by5 = byArray[i + 2];
                    by4 = -1;
                    try {
                        try {
                            if (by7 != by || by6 != by2) break block10;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ByteManipulationEngine.a(unsupportedOperationException);
                        }
                        if (by5 != by3) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                    by4 = 0;
                }
                byteBuffer.put(by7).put(by6).put(by5).put(by4);
            }
        } else {
            int n = byArray.length;
            try {
                for (int i = 1; i < n; i += 3) {
                    byteBuffer.put(byArray[i]).put(byArray[i + 1]).put(byArray[i + 2]).put((byte)-1);
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw ByteManipulationEngine.a(unsupportedOperationException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void P(ByteBuffer var1_1, int var2_2, vC var3_3) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ByteManipulationEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ByteManipulationEngine.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int O() {
        return this.Y;
    }

    public int d() {
        return this.r;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean K() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.U != 6 && this.U != 4) break block4;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                    bl = true;
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ByteManipulationEngine.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field c(long l, long l2) {
        int n = ByteManipulationEngine.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = ByteManipulationEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ByteManipulationEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ByteManipulationEngine.a(clazz3, string2, clazz2)) != null) {
                    ByteManipulationEngine.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ByteManipulationEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ByteManipulationEngine.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ByteManipulationEngine.b(251218330409048L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void c(byte[] byArray) {
        int n = this.Q;
        int n2 = byArray.length;
        try {
            for (int i = n + 1; i < n2; ++i) {
                int n3 = i;
                byArray[n3] = (byte)(byArray[n3] + byArray[i - n]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    private int c(byte[] byArray, int n) {
        return byArray[n] << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    private void J(byte[] byArray, byte[] byArray2) {
        int n;
        int n2 = this.Q;
        try {
            for (n = 1; n <= n2; ++n) {
                int n3 = n;
                byArray[n3] = (byte)(byArray[n3] + (byte)((byArray2[n] & 0xFF) >>> 1));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
        int n4 = byArray.length;
        try {
            while (n < n4) {
                int n5 = n;
                byArray[n5] = (byte)(byArray[n5] + (byte)((byArray2[n] & 0xFF) + (byArray[n - n2] & 0xFF) >>> 1));
                ++n;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    private int Q(byte[] byArray, int n, int n2) throws IOException {
        if (n2 > this.D) {
            n2 = this.D;
        }
        this.F(byArray, n, n2);
        this.D -= n2;
        return n2;
    }

    private void i(byte[] byArray, byte[] byArray2) {
        int n = this.Q;
        int n2 = byArray.length;
        try {
            for (int i = 1; i < n2; ++i) {
                int n3 = i;
                byArray[n3] = (byte)(byArray[n3] + byArray2[i]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
    }

    private boolean y(byte[] byArray) {
        int n = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n >= this.J.length) break;
                        if (byArray[n] == this.J[n]) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                    return false;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ByteManipulationEngine.a(unsupportedOperationException);
                }
            }
            ++n;
        }
        return true;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == 'N' || c == '\u00f3' || c == 'H') {
                field = ByteManipulationEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ByteManipulationEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void z(int n) throws IOException {
        long l = a ^ 0x1459D351AE6CL;
        try {
            if (this.A != n) {
                throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)14617, (long)(0x4E12DAE34CC052BL ^ l)), (long)-8265220973225282096L, (long)l)));
            }
        }
        catch (IOException iOException) {
            throw ByteManipulationEngine.a(iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ByteManipulationEngine.a = MultiContainerRegistry.a(7844423685397416723L, -6524707070638894680L, MethodHandles.lookup().lookupClass()).a(146521484771547L);
                ByteManipulationEngine.h = new Object[5];
                ByteManipulationEngine.j = new String[5];
                ByteManipulationEngine.a();
                ByteManipulationEngine.g = new HashMap<K, V>(13);
                var0 = ByteManipulationEngine.a ^ 138309219509602L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[43];
                var5_4 = 0;
                var6_5 = "\\\u00a1\u00d8Y \u00d5\u0085+\u00b9\u009d\u00dc\u0015\u00ceh\u00d2\u0086<\u00a5\u00b2W\u009d\u00ff\u0088mG1\u00f4xl\u001dA\u0013\u008a;'0}\tTq\u00f2\u00a1o 1\u00cc\u00d80sK\u00a5u\u00b8\u00fe\u0093\u00c032n\u00f0\u0099e\u00f0>\u00aay\u00a0\u00a9ld\u00b7\u00e1Q\u0084\u00e9\u0014\u0080\u00d0Q\u00ae\u00d7\u00d5\u0091\u0002I\u00e6\u0019\u00c3\u0005\u00dc\u00c3\u00b3\u00e7\u0080\u00eb{\u0007\u00ca\u0090V\u0090\u00ae\b4\u00f3\u001dg\u00aeW\u00c2\u00fcj\u008b\u0096=O\u00cf>}\u00b4\u009c\u00c4B\u0014R\u00fd\u0094\u000f\u00ca\u00e5\u00c1\u00d1\u000f\u00b36\u0091/\u00cd\u00d9\u00f7\u00f6\u00ca%\u0017\u0019\u00a1\u00c7\u0099\u00ff5\u00a7\u008f{\u00fdu{N0\u0017ry\u00ac\u00012\u0017\u00833\u00c9n\u00ae\u00ebO\u00ba]\r\u00a9R\u00a64\u00c8\u0002\u0083/t\u00e6\u0016V\u00b4 \u00d2mR\u009e\u00bafX/\u00c4\u00d9'\u00f3\u00b7\u0010 Pv\u0010}l\u00e4\u0005\u0095\u0018\u00ee\u0093\u00c3\u000f\u00f0W\u0099\u008f\u008fk\u00ac\u00ec\u00f9\u0012\u00e4\u00a5\u00d1\u000bu%\u00bb.k}\u0099r\u0092`\u0017o\u0007-\u00b9U\u00ddqa\u0095\u00a5J\u0011Q-\u009d@\u0006\r4\u00c3?\u0012\u00ef\u00899\u0081\t\u0014\u00f8\"{\u00f4\u00f0\u001f\u0017\u00c5\u00bfb\u0095#\u00acb0p\u001c#\u0097\u00c8\u00b0Q\u00ce\u00fd}\u0089x\u008a\u0086v0gw\u0000\u00fdW\u00ea5\u0014\u0083\\\u0006\u008e\f\u0091\u00fb[r\u00dfR\u0084Ex\u0092rE~\u00b4";
                var7_6 = "\\\u00a1\u00d8Y \u00d5\u0085+\u00b9\u009d\u00dc\u0015\u00ceh\u00d2\u0086<\u00a5\u00b2W\u009d\u00ff\u0088mG1\u00f4xl\u001dA\u0013\u008a;'0}\tTq\u00f2\u00a1o 1\u00cc\u00d80sK\u00a5u\u00b8\u00fe\u0093\u00c032n\u00f0\u0099e\u00f0>\u00aay\u00a0\u00a9ld\u00b7\u00e1Q\u0084\u00e9\u0014\u0080\u00d0Q\u00ae\u00d7\u00d5\u0091\u0002I\u00e6\u0019\u00c3\u0005\u00dc\u00c3\u00b3\u00e7\u0080\u00eb{\u0007\u00ca\u0090V\u0090\u00ae\b4\u00f3\u001dg\u00aeW\u00c2\u00fcj\u008b\u0096=O\u00cf>}\u00b4\u009c\u00c4B\u0014R\u00fd\u0094\u000f\u00ca\u00e5\u00c1\u00d1\u000f\u00b36\u0091/\u00cd\u00d9\u00f7\u00f6\u00ca%\u0017\u0019\u00a1\u00c7\u0099\u00ff5\u00a7\u008f{\u00fdu{N0\u0017ry\u00ac\u00012\u0017\u00833\u00c9n\u00ae\u00ebO\u00ba]\r\u00a9R\u00a64\u00c8\u0002\u0083/t\u00e6\u0016V\u00b4 \u00d2mR\u009e\u00bafX/\u00c4\u00d9'\u00f3\u00b7\u0010 Pv\u0010}l\u00e4\u0005\u0095\u0018\u00ee\u0093\u00c3\u000f\u00f0W\u0099\u008f\u008fk\u00ac\u00ec\u00f9\u0012\u00e4\u00a5\u00d1\u000bu%\u00bb.k}\u0099r\u0092`\u0017o\u0007-\u00b9U\u00ddqa\u0095\u00a5J\u0011Q-\u009d@\u0006\r4\u00c3?\u0012\u00ef\u00899\u0081\t\u0014\u00f8\"{\u00f4\u00f0\u001f\u0017\u00c5\u00bfb\u0095#\u00acb0p\u001c#\u0097\u00c8\u00b0Q\u00ce\u00fd}\u0089x\u008a\u0086v0gw\u0000\u00fdW\u00ea5\u0014\u0083\\\u0006\u008e\f\u0091\u00fb[r\u00dfR\u0084Ex\u0092rE~\u00b4".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0002\u00f0\u00fb\u0090\u00f5\u0013\u009ca\u000b0\r\u0098P\u00c5\u00f4\u00af";
                    var7_6 = "\u0002\u00f0\u00fb\u0090\u00f5\u0013\u009ca\u000b0\r\u0098P\u00c5\u00f4\u00af".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        ByteManipulationEngine.d = var8_3;
        ByteManipulationEngine.e = new Integer[43];
    }

    /*
     * Exception decompiling
     */
    private void p(byte[] var1_1, byte[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void I() throws IOException {
        block3: {
            block2: {
                try {
                    if (this.D <= 0) break block2;
                    this.v(this.D + 4);
                    break block3;
                }
                catch (IOException iOException) {
                    throw ByteManipulationEngine.a(iOException);
                }
            }
            this.F(this.v, 0, 4);
        }
        this.D = 0;
        this.A = 0;
        this.t = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L() throws IOException {
        long l = a ^ 0x2C7FD8F3FBF9L;
        try {
            switch (this.U) {
                case 0: {
                    this.z(2);
                    this.b = new byte[2];
                    this.Q(this.b, 0, 2);
                    return;
                }
                case 2: {
                    this.z(6);
                    this.b = new byte[6];
                    this.Q(this.b, 0, 6);
                    return;
                }
                case 3: {
                    try {
                        if (this.L == null) {
                            throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)19775, (long)(0x6129CBA5661C2480L ^ l)), (long)-2821169305080684475L, (long)l)));
                        }
                    }
                    catch (IOException iOException) {
                        throw ByteManipulationEngine.a(iOException);
                    }
                    this.c = new byte[this.L.length / 3];
                    Arrays.fill(this.c, (byte)-1);
                    this.Q(this.c, 0, this.c.length);
                    return;
                }
            }
            return;
        }
        catch (IOException iOException) {
            throw ByteManipulationEngine.a(iOException);
        }
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0002\u0006/";
        objectArray[1] = Integer.TYPE;
        ByteManipulationEngine.j[1] = "java/lang/Integer";
        objectArray[2] = "%4^w\u0011R.;O8lJ=<Fq";
        objectArray[3] = "\rl\u0004X&\\\u0006c\u0015\u0017GR\rh\u0011M";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "L8;\u001e\rbI2#x\u0001}+6;\u0006\bgM0~Gj?Y+-\u0003\u0004fH/{x";
    }

    private static Method d(long l, long l2) {
        int n = ByteManipulationEngine.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = ByteManipulationEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = ByteManipulationEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ByteManipulationEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ByteManipulationEngine.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ByteManipulationEngine.b(251218330409048L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ByteManipulationEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ByteManipulationEngine.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ByteManipulationEngine.b(251218330409048L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ByteManipulationEngine(InputStream inputStream) throws IOException {
        long l = a ^ 0x765A9188573L;
        this.J = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        this.W = (int)ByteManipulationEngine.a("y", (int)28421, (long)(0x4EFF8FF2005782BL ^ l));
        this.i = (int)ByteManipulationEngine.a("y", (int)17262, (long)(0x674D5E21FA0DD456L ^ l));
        this.O = (int)ByteManipulationEngine.a("y", (int)5777, (long)(0x42707111135D01BDL ^ l));
        this.k = (int)ByteManipulationEngine.a("y", (int)14730, (long)(0x6A2E91C3440EAE82L ^ l));
        this.I = (int)ByteManipulationEngine.a("y", (int)5782, (long)(0x24DD712AA28A81A5L ^ l));
        this.y = 0;
        this.V = (byte)ByteManipulationEngine.a("y", (int)8008, (long)(0x4F909253B1840848L ^ l));
        this.Z = (byte)ByteManipulationEngine.a("y", (int)13866, (long)(0x42FC280C7D072126L ^ l));
        this.w = (byte)ByteManipulationEngine.a("y", (int)25635, (long)(0x1790FAED8792F308L ^ l));
        this.f = (byte)ByteManipulationEngine.a("y", (int)30465, (long)(0x741AC3015D9B6036L ^ l));
        this.R = inputStream;
        this.v = new byte[4096];
        this.F(this.v, 0, this.J.length);
        if (!this.y(this.v)) {
            throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)21426, (long)(0x758052D61C1F449BL ^ l)), (long)-6461791986393981233L, (long)l)));
        }
        this.t((int)ByteManipulationEngine.a("y", (int)19958, (long)(0x48281A04DECDDAC9L ^ l)));
        this.l();
        this.I();
        block9: while (true) {
            this.U();
            switch (this.t) {
                case 1229209940: {
                    break block9;
                }
                case 1347179589: {
                    this.O();
                    break;
                }
                case 1951551059: {
                    this.L();
                }
            }
            this.I();
        }
        try {
            try {
                if (this.U != 3) return;
                if (this.L != null) return;
                throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)15412, (long)(0x343839F71140AB3FL ^ l)), (long)-6461791986393981233L, (long)l)));
            }
            catch (IOException iOException) {
                throw ByteManipulationEngine.a(iOException);
            }
        }
        catch (IOException iOException) {
            throw ByteManipulationEngine.a(iOException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void t(int n) throws IOException {
        long l = a ^ 0x470E8C0BF5B2L;
        try {
            this.U();
            if (this.t != n) {
                throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)21904, (long)(0x549EAA700BDFB277L ^ l)), (long)-2985224614674289138L, (long)l)) + Integer.toHexString(n));
            }
        }
        catch (IOException iOException) {
            throw ByteManipulationEngine.a(iOException);
        }
    }

    public boolean R() {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (this.U == 6 || this.U == 2) break block6;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ByteManipulationEngine.a(unsupportedOperationException);
                            }
                            if (this.U != 3) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ByteManipulationEngine.a(unsupportedOperationException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ByteManipulationEngine.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void s(Inflater inflater, byte[] byArray, int n, int n2) throws IOException {
        long l = a ^ 0x3CA09B2E1A29L;
        try {
            do {
                int n3;
                if ((n3 = inflater.inflate(byArray, n, n2)) <= 0) {
                    try {
                        if (inflater.finished()) {
                            throw new EOFException();
                        }
                    }
                    catch (Exception exception) {
                        throw ByteManipulationEngine.a(exception);
                    }
                    try {
                        if (inflater.needsInput()) {
                            this.B(inflater);
                            continue;
                        }
                    }
                    catch (Exception exception) {
                        throw ByteManipulationEngine.a(exception);
                    }
                    throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)8497, (long)(0x48E607E72EFB2950L ^ l)), (long)4109853147180286357L, (long)l)) + n2 + (String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)19236, (long)(0x5D776B957B34C35CL ^ l)), (long)4109853147180286357L, (long)l)));
                }
                n += n3;
                n2 -= n3;
            } while (n2 > 0);
        }
        catch (Exception exception) {
            throw new IOException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)22806, (long)(0x102F5DB086F6D171L ^ l)), (long)4109853147180286357L, (long)l)), exception);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x317B;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/FQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ByteManipulationEngine.e[n2] = n3;
        }
        return e[n2];
    }

    /*
     * Exception decompiling
     */
    private void j(byte[] var1_1, byte[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 61;
                break;
            }
            case 1: {
                n3 = 32;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 26;
                break;
            }
            case 7: {
                n3 = 43;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 23;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 15;
                break;
            }
            case 12: {
                n3 = 24;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 28;
                break;
            }
            case 16: {
                n3 = 60;
                break;
            }
            case 17: {
                n3 = 34;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 3;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 12;
                break;
            }
            case 23: {
                n3 = 47;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 13;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 11;
                break;
            }
            case 29: {
                n3 = 49;
                break;
            }
            case 30: {
                n3 = 37;
                break;
            }
            case 31: {
                n3 = 30;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 21;
                break;
            }
            case 34: {
                n3 = 19;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 27;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 50;
                break;
            }
            case 49: {
                n3 = 39;
                break;
            }
            case 50: {
                n3 = 55;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 59;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 18;
                break;
            }
            case 56: {
                n3 = 57;
                break;
            }
            case 57: {
                n3 = 40;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 5;
                break;
            }
            case 60: {
                n3 = 22;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 44;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        ByteManipulationEngine.j[n4] = new String(cArray);
        return n4;
    }

    private void B(Inflater inflater) throws IOException {
        long l = a ^ 0x77D94B40F26FL;
        try {
            while (this.D == 0) {
                this.I();
                this.t((int)ByteManipulationEngine.a("y", (int)29889, (long)(0x4B3ACD7FB0C094D0L ^ l)));
            }
        }
        catch (IOException iOException) {
            throw ByteManipulationEngine.a(iOException);
        }
        int n = this.Q(this.v, 0, this.v.length);
        inflater.setInput(this.v, 0, n);
    }

    private void F(byte[] byArray, int n, int n2) throws IOException {
        int n3;
        do {
            if ((n3 = this.R.read(byArray, n, n2)) < 0) {
                throw new EOFException();
            }
            n += n3;
        } while ((n2 -= n3) > 0);
    }

    private void b(byte[] byArray, byte[] byArray2) {
        int n;
        int n2 = this.Q;
        try {
            for (n = 1; n <= n2; ++n) {
                int n3 = n;
                byArray[n3] = (byte)(byArray[n3] + byArray2[n]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw ByteManipulationEngine.a(unsupportedOperationException);
        }
        int n4 = byArray.length;
        while (n < n4) {
            int n5;
            block11: {
                int n6;
                int n7;
                int n8;
                block10: {
                    int n9 = byArray[n - n2] & 0xFF;
                    n8 = byArray2[n] & 0xFF;
                    n5 = byArray2[n - n2] & 0xFF;
                    int n10 = n9 + n8 - n5;
                    int n11 = n10 - n9;
                    if (n11 < 0) {
                        n11 = -n11;
                    }
                    if ((n7 = n10 - n8) < 0) {
                        n7 = -n7;
                    }
                    if ((n6 = n10 - n5) < 0) {
                        n6 = -n6;
                    }
                    try {
                        if (n11 > n7 || n11 > n6) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ByteManipulationEngine.a(unsupportedOperationException);
                    }
                    n5 = n9;
                    break block11;
                }
                if (n7 <= n6) {
                    n5 = n8;
                }
            }
            int n12 = n++;
            byArray[n12] = (byte)(byArray[n12] + (byte)n5);
        }
    }

    public void C(ByteBuffer byteBuffer, int n, vC vC2) throws IOException {
        long l = a ^ 0x20E6481DDC84L;
        try {
            if (n <= 0) {
                throw new IllegalArgumentException((String)((Object)ByteManipulationEngine.b("\u00cf", (int)ByteManipulationEngine.a("y", (int)20503, (long)(0x746CE16C0D2C1ED2L ^ l)), (long)-25827599951329480L, (long)l)));
            }
        }
        catch (IOException iOException) {
            throw ByteManipulationEngine.a(iOException);
        }
        int n2 = byteBuffer.position();
        int n3 = (this.r - 1) * n;
        byteBuffer.position(n2 + n3);
        this.P(byteBuffer, -n, vC2);
        byteBuffer.position(byteBuffer.position() + n3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ByteManipulationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(ByteManipulationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

