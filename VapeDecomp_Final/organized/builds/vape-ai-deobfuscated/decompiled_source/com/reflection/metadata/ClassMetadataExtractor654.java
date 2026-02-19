/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.app.bytecode.BytecodeEnhancementHandler;
import com.app.bytecode.analysis.BytecodeMetadataExtractor;
import com.app.diagnostics.ExceptionLogger;
import com.app.reflection.analysis.ClassStructureAnalyzer;
import com.app.resources.ResourceAllocationTracker2173;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionUtility;
import com.bytecode.analysis.BytecodeMetadataExtractor2397;
import com.bytecode.analysis.ClassInitializationTracker;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.reflection.NestHostResolver;
import com.deobfuscation.reflection.NestMemberDescriptor;
import com.development.tools.DecompilationErrorHandler1089;
import com.exception.system.CustomSystemException;
import com.file.metadata.SourceMetadataExtractor;
import com.financial.transaction.TransactionRecorder;
import com.logging.utility.LogFormatConverter;
import com.metadata.parsing.MetadataExtractor1468;
import com.reflection.metadata.AttributeConstantResolver;
import com.reflection.metadata.MetadataExtractor1426;
import com.resource.loader.SyntheticResourceLoader;
import com.resource.management.DeprecatedResourceHandler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ClassMetadataExtractor654 {
    private static String[] G;
    int z;
    byte[] b;
    protected BytecodeAnalyzer D;

    static List<ClassMetadataExtractor654> X(List<ClassMetadataExtractor654> list, BytecodeAnalyzer bytecodeAnalyzer) {
        try {
            if (list == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor654.b(customSystemException);
        }
        ArrayList<ClassMetadataExtractor654> arrayList = new ArrayList<ClassMetadataExtractor654>();
        for (ClassMetadataExtractor654 classMetadataExtractor654 : list) {
            arrayList.add(classMetadataExtractor654.O(bytecodeAnalyzer, null));
        }
        return arrayList;
    }

    public static String[] q() {
        return G;
    }

    static int N(List<ClassMetadataExtractor654> list) {
        int n = 0;
        for (ClassMetadataExtractor654 classMetadataExtractor654 : list) {
            n += classMetadataExtractor654.Y();
        }
        return n;
    }

    static void E(List<ClassMetadataExtractor654> list, DataOutputStream dataOutputStream) throws IOException {
        try {
            if (list == null) {
                return;
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor654.b(iOException);
        }
        for (ClassMetadataExtractor654 classMetadataExtractor654 : list) {
            classMetadataExtractor654.f(dataOutputStream);
        }
    }

    public ClassMetadataExtractor654(BytecodeAnalyzer bytecodeAnalyzer, String string, byte[] byArray) {
        this(bytecodeAnalyzer, bytecodeAnalyzer.D(string), byArray);
    }

    static ClassMetadataExtractor654 J(List<ClassMetadataExtractor654> list, String string) {
        try {
            if (list == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor654.b(customSystemException);
        }
        for (ClassMetadataExtractor654 classMetadataExtractor654 : list) {
            try {
                if (!classMetadataExtractor654.n().equals(string)) continue;
                return classMetadataExtractor654;
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor654.b(customSystemException);
            }
        }
        return null;
    }

    public void p(byte[] byArray) {
        this.b = byArray;
    }

    static {
        if (ClassMetadataExtractor654.q() != null) {
            ClassMetadataExtractor654.p(new String[1]);
        }
    }

    void f(DataOutputStream dataOutputStream) throws IOException {
        try {
            dataOutputStream.writeShort(this.z);
            dataOutputStream.writeInt(this.b.length);
            if (this.b.length > 0) {
                dataOutputStream.write(this.b);
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor654.b(iOException);
        }
    }

    static ClassMetadataExtractor654 R(BytecodeAnalyzer bytecodeAnalyzer, DataInputStream dataInputStream) throws IOException {
        int n;
        block81: {
            String string;
            block82: {
                char c;
                block77: {
                    block80: {
                        block79: {
                            block78: {
                                block75: {
                                    block76: {
                                        block73: {
                                            block74: {
                                                n = dataInputStream.readUnsignedShort();
                                                string = bytecodeAnalyzer.Z(n);
                                                c = string.charAt(0);
                                                try {
                                                    try {
                                                        if (c >= 'E') break block73;
                                                        if (!string.equals("AnnotationDefault")) break block74;
                                                    }
                                                    catch (IOException iOException) {
                                                        throw ClassMetadataExtractor654.b(iOException);
                                                    }
                                                    return new MetadataExtractor1468(bytecodeAnalyzer, n, dataInputStream);
                                                }
                                                catch (IOException iOException) {
                                                    throw ClassMetadataExtractor654.b(iOException);
                                                }
                                            }
                                            try {
                                                if (string.equals("BootstrapMethods")) {
                                                    return new BytecodeEnhancementHandler(bytecodeAnalyzer, n, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw ClassMetadataExtractor654.b(iOException);
                                            }
                                            try {
                                                if (string.equals("Code")) {
                                                    return new BinaryCodeAnalyzer(bytecodeAnalyzer, n, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw ClassMetadataExtractor654.b(iOException);
                                            }
                                            try {
                                                if (string.equals("ConstantValue")) {
                                                    return new AttributeConstantResolver(bytecodeAnalyzer, n, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw ClassMetadataExtractor654.b(iOException);
                                            }
                                            try {
                                                if (string.equals("Deprecated")) {
                                                    return new DeprecatedResourceHandler(bytecodeAnalyzer, n, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw ClassMetadataExtractor654.b(iOException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (c >= 'M') break block75;
                                                if (!string.equals("EnclosingMethod")) break block76;
                                            }
                                            catch (IOException iOException) {
                                                throw ClassMetadataExtractor654.b(iOException);
                                            }
                                            return new ClassInitializationTracker(bytecodeAnalyzer, n, dataInputStream);
                                        }
                                        catch (IOException iOException) {
                                            throw ClassMetadataExtractor654.b(iOException);
                                        }
                                    }
                                    try {
                                        if (string.equals("Exceptions")) {
                                            return new ExceptionLogger(bytecodeAnalyzer, n, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw ClassMetadataExtractor654.b(iOException);
                                    }
                                    try {
                                        if (string.equals("InnerClasses")) {
                                            return new ClassStructureAnalyzer(bytecodeAnalyzer, n, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw ClassMetadataExtractor654.b(iOException);
                                    }
                                    try {
                                        if (string.equals("LineNumberTable")) {
                                            return new BytecodeInspectionUtility(bytecodeAnalyzer, n, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw ClassMetadataExtractor654.b(iOException);
                                    }
                                    try {
                                        if (string.equals("LocalVariableTable")) {
                                            return new BytecodeMetadataExtractor(bytecodeAnalyzer, n, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw ClassMetadataExtractor654.b(iOException);
                                    }
                                    try {
                                        if (string.equals("LocalVariableTypeTable")) {
                                            return new BytecodeMetadataExtractor2397(bytecodeAnalyzer, n, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw ClassMetadataExtractor654.b(iOException);
                                    }
                                }
                                try {
                                    try {
                                        if (c >= 'S') break block77;
                                        if (!string.equals("MethodParameters")) break block78;
                                    }
                                    catch (IOException iOException) {
                                        throw ClassMetadataExtractor654.b(iOException);
                                    }
                                    return new MetadataExtractor1426(bytecodeAnalyzer, n, dataInputStream);
                                }
                                catch (IOException iOException) {
                                    throw ClassMetadataExtractor654.b(iOException);
                                }
                            }
                            try {
                                if (string.equals("NestHost")) {
                                    return new NestHostResolver(bytecodeAnalyzer, n, dataInputStream);
                                }
                            }
                            catch (IOException iOException) {
                                throw ClassMetadataExtractor654.b(iOException);
                            }
                            try {
                                if (string.equals("NestMembers")) {
                                    return new NestMemberDescriptor(bytecodeAnalyzer, n, dataInputStream);
                                }
                            }
                            catch (IOException iOException) {
                                throw ClassMetadataExtractor654.b(iOException);
                            }
                            try {
                                try {
                                    if (!string.equals("RuntimeVisibleAnnotations") && !string.equals("RuntimeInvisibleAnnotations")) break block79;
                                }
                                catch (IOException iOException) {
                                    throw ClassMetadataExtractor654.b(iOException);
                                }
                                return new TransactionRecorder(bytecodeAnalyzer, n, dataInputStream);
                            }
                            catch (IOException iOException) {
                                throw ClassMetadataExtractor654.b(iOException);
                            }
                        }
                        try {
                            try {
                                if (!string.equals("RuntimeVisibleParameterAnnotations") && !string.equals("RuntimeInvisibleParameterAnnotations")) break block80;
                            }
                            catch (IOException iOException) {
                                throw ClassMetadataExtractor654.b(iOException);
                            }
                            return new LogFormatConverter(bytecodeAnalyzer, n, dataInputStream);
                        }
                        catch (IOException iOException) {
                            throw ClassMetadataExtractor654.b(iOException);
                        }
                    }
                    try {
                        try {
                            if (!string.equals("RuntimeVisibleTypeAnnotations") && !string.equals("RuntimeInvisibleTypeAnnotations")) break block77;
                        }
                        catch (IOException iOException) {
                            throw ClassMetadataExtractor654.b(iOException);
                        }
                        return new ResourceAllocationTracker2173(bytecodeAnalyzer, n, dataInputStream);
                    }
                    catch (IOException iOException) {
                        throw ClassMetadataExtractor654.b(iOException);
                    }
                }
                try {
                    try {
                        if (c < 'S') break block81;
                        if (!string.equals("Signature")) break block82;
                    }
                    catch (IOException iOException) {
                        throw ClassMetadataExtractor654.b(iOException);
                    }
                    return new DecompilationErrorHandler1089(bytecodeAnalyzer, n, dataInputStream);
                }
                catch (IOException iOException) {
                    throw ClassMetadataExtractor654.b(iOException);
                }
            }
            try {
                if (string.equals("SourceFile")) {
                    return new SourceMetadataExtractor(bytecodeAnalyzer, n, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw ClassMetadataExtractor654.b(iOException);
            }
            try {
                if (string.equals("Synthetic")) {
                    return new SyntheticResourceLoader(bytecodeAnalyzer, n, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw ClassMetadataExtractor654.b(iOException);
            }
            try {
                if (string.equals("StackMap")) {
                    return new StackMapDescriptor(bytecodeAnalyzer, n, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw ClassMetadataExtractor654.b(iOException);
            }
            try {
                if (string.equals("StackMapTable")) {
                    return new BytecodeExceptionHandler(bytecodeAnalyzer, n, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw ClassMetadataExtractor654.b(iOException);
            }
        }
        return new ClassMetadataExtractor654(bytecodeAnalyzer, n, dataInputStream);
    }

    public int Y() {
        return this.b.length + 6;
    }

    protected ClassMetadataExtractor654(BytecodeAnalyzer bytecodeAnalyzer, String string) {
        this(bytecodeAnalyzer, string, (byte[])null);
    }

    public static void p(String[] stringArray) {
        G = stringArray;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    protected ClassMetadataExtractor654(BytecodeAnalyzer bytecodeAnalyzer, int n, byte[] byArray) {
        this.D = bytecodeAnalyzer;
        this.z = n;
        this.b = byArray;
    }

    public byte[] p() {
        return this.b;
    }

    static synchronized ClassMetadataExtractor654 e(List<ClassMetadataExtractor654> list, String string) {
        try {
            if (list == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor654.b(customSystemException);
        }
        for (ClassMetadataExtractor654 classMetadataExtractor654 : list) {
            try {
                try {
                    if (!classMetadataExtractor654.n().equals(string) || !list.remove(classMetadataExtractor654)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataExtractor654.b(customSystemException);
                }
                return classMetadataExtractor654;
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor654.b(customSystemException);
            }
        }
        return null;
    }

    protected ClassMetadataExtractor654(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        this.D = bytecodeAnalyzer;
        this.z = n;
        int n2 = dataInputStream.readInt();
        try {
            this.b = new byte[n2];
            if (n2 > 0) {
                dataInputStream.readFully(this.b);
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor654.b(iOException);
        }
    }

    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        return new ClassMetadataExtractor654(bytecodeAnalyzer, this.n(), Arrays.copyOf(this.b, this.b.length));
    }

    public BytecodeAnalyzer K() {
        return this.D;
    }

    public String n() {
        return this.D.Z(this.z);
    }
}

