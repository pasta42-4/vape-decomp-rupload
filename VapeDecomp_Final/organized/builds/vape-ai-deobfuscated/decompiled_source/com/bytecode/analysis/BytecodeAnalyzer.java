/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import a.LM;
import a.LR;
import a.L_;
import com.app.logging.core.LogCompiler;
import com.app.module.registration.ModuleDescriptorRegistry;
import com.app.reflection.classification.MethodTypeClassifier;
import com.app.reflection.metadata.PackageMetadataDescriptor;
import com.collections.management.MultiContainerRegistry;
import com.data.comparison.DoubleValueComparator;
import com.data.comparison.IntegerComparator;
import com.data.comparison.LongValueComparator;
import com.data.conversion.FloatPrecisionMapper;
import com.exception.system.CustomSystemException;
import com.io.formatting.OutputStreamFormatter;
import com.io.formatting.PrintStreamFormatter;
import com.messaging.priority.MessagePriorityController;
import com.metadata.resolution.DynamicMetadataResolver;
import com.reflection.metadata.ClassMetadataResolver1252;
import com.reflection.metadata.ClassMetadataResolver1355;
import com.reflection.metadata.InvocationDescriptor;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.resolution.MethodHandleResolver;
import com.resource.management.ResourceIdentityManager;
import com.ui.layout.StyleLayoutCalculator;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BytecodeAnalyzer {
    MessagePriorityController P;
    int q;
    int K;
    public static final MetaclassDefinitionRegistry w;
    Map<LogCompiler, LogCompiler> u;
    private static final long a;
    private static final long b;
    private static String[] G;

    public int m(int n) {
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(n);
        return classMetadataResolver1252.q;
    }

    public int K(int n, String string, String string2) {
        int n2 = this.U(string, string2);
        return this.v(n, n2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public int h(long l) {
        int n = this.W(new LongValueComparator(l, this.K));
        try {
            if (n == this.K - 1) {
                this.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return n;
    }

    public int J(int n) {
        return this.W(new ModuleDescriptorRegistry(n, this.K));
    }

    void G(int n) {
        this.q = n;
    }

    public int l(String string) {
        int n = this.D(ReflectionMetadataResolver933.q(string));
        return this.W(new ClassMetadataResolver1355(n, this.K));
    }

    public int U(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        return printStreamFormatter.d;
    }

    private int Y(DataInputStream dataInputStream) throws IOException {
        LogCompiler logCompiler;
        int n = dataInputStream.readUnsignedByte();
        switch (n) {
            case 1: {
                logCompiler = new OutputStreamFormatter(dataInputStream, this.K);
                break;
            }
            case 3: {
                logCompiler = new IntegerComparator(dataInputStream, this.K);
                break;
            }
            case 4: {
                logCompiler = new FloatPrecisionMapper(dataInputStream, this.K);
                break;
            }
            case 5: {
                logCompiler = new LongValueComparator(dataInputStream, this.K);
                break;
            }
            case 6: {
                logCompiler = new DoubleValueComparator(dataInputStream, this.K);
                break;
            }
            case 7: {
                logCompiler = new ClassMetadataResolver1355(dataInputStream, this.K);
                break;
            }
            case 8: {
                logCompiler = new ResourceIdentityManager(dataInputStream, this.K);
                break;
            }
            case 9: {
                logCompiler = new L_(dataInputStream, this.K);
                break;
            }
            case 10: {
                logCompiler = new LR(dataInputStream, this.K);
                break;
            }
            case 11: {
                logCompiler = new LM(dataInputStream, this.K);
                break;
            }
            case 12: {
                logCompiler = new ClassMetadataResolver1252(dataInputStream, this.K);
                break;
            }
            case 15: {
                logCompiler = new MethodHandleResolver(dataInputStream, this.K);
                break;
            }
            case 16: {
                logCompiler = new MethodTypeClassifier(dataInputStream, this.K);
                break;
            }
            case 17: {
                logCompiler = new DynamicMetadataResolver(dataInputStream, this.K);
                break;
            }
            case 18: {
                logCompiler = new InvocationDescriptor(dataInputStream, this.K);
                break;
            }
            case 19: {
                logCompiler = new ModuleDescriptorRegistry(dataInputStream, this.K);
                break;
            }
            case 20: {
                logCompiler = new PackageMetadataDescriptor(dataInputStream, this.K);
                break;
            }
            default: {
                throw new IOException("invalid constant type: " + n + " at " + this.K);
            }
        }
        this.X(logCompiler);
        return n;
    }

    public long v(int n) {
        LongValueComparator longValueComparator = (LongValueComparator)this.b(n);
        return longValueComparator.l;
    }

    public int D(String string) {
        return this.W(new OutputStreamFormatter(string, this.K));
    }

    public int Y(int n) {
        return this.W(new IntegerComparator(n, this.K));
    }

    public int A(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        try {
            if (metaclassDefinitionRegistry == w) {
                return this.q;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        try {
            if (!metaclassDefinitionRegistry.p()) {
                return this.l(metaclassDefinitionRegistry.H());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.l(ReflectionMetadataResolver933.m(metaclassDefinitionRegistry));
    }

    public String j(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        try {
            if (printStreamFormatter == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(printStreamFormatter.d);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.D);
    }

    public float F(int n) {
        FloatPrecisionMapper floatPrecisionMapper = (FloatPrecisionMapper)this.b(n);
        return floatPrecisionMapper.a;
    }

    private void k(DataInputStream dataInputStream) throws IOException {
        int n = dataInputStream.readUnsignedShort();
        this.P = new MessagePriorityController(n);
        this.K = 0;
        this.X(null);
        while (--n > 0) {
            int n2 = this.Y(dataInputStream);
            try {
                try {
                    if (n2 != 5 && n2 != 6) continue;
                }
                catch (IOException iOException) {
                    throw BytecodeAnalyzer.a(iOException);
                }
                this.k();
                --n;
            }
            catch (IOException iOException) {
                throw BytecodeAnalyzer.a(iOException);
            }
        }
    }

    public void j(DataOutputStream dataOutputStream) throws IOException {
        block7: {
            long l = a ^ 0xB5929D2F7D5L;
            try {
                try {
                    if (this.K >= 0 && (int)b >= this.K) break block7;
                }
                catch (IOException iOException) {
                    throw BytecodeAnalyzer.a(iOException);
                }
                throw new IOException("too many constant pool items " + this.K);
            }
            catch (IOException iOException) {
                throw BytecodeAnalyzer.a(iOException);
            }
        }
        dataOutputStream.writeShort(this.K);
        MessagePriorityController messagePriorityController = this.P;
        int n = this.K;
        try {
            for (int i = 1; i < n; ++i) {
                messagePriorityController.P(i).k(dataOutputStream);
            }
        }
        catch (IOException iOException) {
            throw BytecodeAnalyzer.a(iOException);
        }
    }

    public int O(int n) {
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(n);
        return classMetadataResolver1252.D;
    }

    LogCompiler b(int n) {
        return this.P.P(n);
    }

    public int I() {
        return this.q;
    }

    public int N(String string) {
        int n = this.D(string);
        return this.W(new ResourceIdentityManager(n, this.K));
    }

    private static Map<LogCompiler, LogCompiler> M(MessagePriorityController messagePriorityController) {
        HashMap<LogCompiler, LogCompiler> hashMap = new HashMap<LogCompiler, LogCompiler>();
        int n = 1;
        while (true) {
            LogCompiler logCompiler = messagePriorityController.P(n++);
            try {
                if (logCompiler == null) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeAnalyzer.a(customSystemException);
            }
            hashMap.put(logCompiler, logCompiler);
        }
        return hashMap;
    }

    public int v(int n, int n2) {
        return this.W(new L_(n, n2, this.K));
    }

    public int z(String string, String string2, int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        if (this.u(printStreamFormatter.D).equals(string)) {
            ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(printStreamFormatter.d);
            try {
                if (this.Z(classMetadataResolver1252.D).equals(string2)) {
                    return classMetadataResolver1252.q;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeAnalyzer.a(customSystemException);
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-7248465767143078875L, 2525160496730398511L, MethodHandles.lookup().lookupClass()).a(92408761507931L);
        long l = a ^ 0x246E8C30DD7CL;
        BytecodeAnalyzer.s(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8804204282947987545L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                w = null;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static String[] j() {
        return G;
    }

    int k() {
        return this.X(new StyleLayoutCalculator(this.K));
    }

    public BytecodeAnalyzer(DataInputStream dataInputStream) throws IOException {
        this.u = null;
        this.q = 0;
        this.k(dataInputStream);
    }

    public int X(int n, BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        try {
            if (n == 0) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        LogCompiler logCompiler = this.b(n);
        return logCompiler.H(this, bytecodeAnalyzer, map);
    }

    public String Z(int n) {
        OutputStreamFormatter outputStreamFormatter = (OutputStreamFormatter)this.b(n);
        return outputStreamFormatter.R;
    }

    public String G(int n) {
        InvocationDescriptor invocationDescriptor = (InvocationDescriptor)this.b(n);
        try {
            if (invocationDescriptor == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(invocationDescriptor.l);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.q);
    }

    public int c(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        return printStreamFormatter.d;
    }

    public static void s(String[] stringArray) {
        G = stringArray;
    }

    public int N(int n) {
        IntegerComparator integerComparator = (IntegerComparator)this.b(n);
        return integerComparator.r;
    }

    public int M(int n, String string, String string2) {
        int n2 = this.U(string, string2);
        return this.l(n, n2);
    }

    public String v(int n) {
        L_ l_ = (L_)this.b(n);
        try {
            if (l_ == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(l_.d);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.q);
    }

    public double T(int n) {
        DoubleValueComparator doubleValueComparator = (DoubleValueComparator)this.b(n);
        return doubleValueComparator.r;
    }

    public int X(int n, int n2) {
        return this.W(new MethodHandleResolver(n, n2, this.K));
    }

    public int a(int n, int n2) {
        return this.W(new LR(n, n2, this.K));
    }

    public String I(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        try {
            if (printStreamFormatter == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(printStreamFormatter.d);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.D);
    }

    public String g(int n) {
        L_ l_ = (L_)this.b(n);
        try {
            if (l_ == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.u(l_.D);
    }

    public String f(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        return this.u(printStreamFormatter.D);
    }

    public int b(int n) {
        return this.b(n).Q();
    }

    public int l(int n, int n2) {
        return this.W(new LM(n, n2, this.K));
    }

    public BytecodeAnalyzer(String string) {
        this.P = new MessagePriorityController();
        this.u = null;
        this.K = 0;
        this.X(null);
        this.q = this.l(string);
    }

    private int W(LogCompiler logCompiler) {
        try {
            if (this.u == null) {
                this.u = BytecodeAnalyzer.M(this.P);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        LogCompiler logCompiler2 = this.u.get(logCompiler);
        try {
            if (logCompiler2 != null) {
                return logCompiler2.f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        this.P.e(logCompiler);
        this.u.put(logCompiler, logCompiler);
        return this.K++;
    }

    public String b(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        try {
            if (printStreamFormatter == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(printStreamFormatter.d);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.q);
    }

    public int N(int n, int n2) {
        return this.W(new ClassMetadataResolver1252(n, n2, this.K));
    }

    public int P(int n, int n2) {
        return this.W(new InvocationDescriptor(n, n2, this.K));
    }

    public String W(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        try {
            if (printStreamFormatter == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(printStreamFormatter.d);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.q);
    }

    public String Q(int n) {
        L_ l_ = (L_)this.b(n);
        try {
            if (l_ == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(l_.d);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.D);
    }

    public String u(int n) {
        ClassMetadataResolver1355 classMetadataResolver1355 = (ClassMetadataResolver1355)this.b(n);
        try {
            if (classMetadataResolver1355 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return ReflectionMetadataResolver933.A(this.Z(classMetadataResolver1355.Z));
    }

    public int r(String string, int n) {
        return this.z(string, "<init>", n);
    }

    public int B(int n, int n2) {
        return this.W(new DynamicMetadataResolver(n, n2, this.K));
    }

    public String M(int n) {
        PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)this.b(n);
        try {
            if (printStreamFormatter == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.u(printStreamFormatter.D);
    }

    public String j() {
        return this.u(this.q);
    }

    public int U(String string, String string2) {
        return this.N(this.D(string), this.D(string2));
    }

    public int j(int n, String string, String string2) {
        int n2 = this.U(string, string2);
        return this.a(n, n2);
    }

    public int v(double d2) {
        int n = this.W(new DoubleValueComparator(d2, this.K));
        try {
            if (n == this.K - 1) {
                this.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return n;
    }

    public String H(int n) {
        ResourceIdentityManager resourceIdentityManager = (ResourceIdentityManager)this.b(n);
        return this.Z(resourceIdentityManager.K);
    }

    public int s(int n) {
        return this.W(new MethodTypeClassifier(n, this.K));
    }

    private int X(LogCompiler logCompiler) {
        this.P.e(logCompiler);
        return this.K++;
    }

    public int G(float f) {
        return this.W(new FloatPrecisionMapper(f, this.K));
    }

    public String D(int n) {
        DynamicMetadataResolver dynamicMetadataResolver = (DynamicMetadataResolver)this.b(n);
        try {
            if (dynamicMetadataResolver == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)this.b(dynamicMetadataResolver.Q);
        try {
            if (classMetadataResolver1252 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalyzer.a(customSystemException);
        }
        return this.Z(classMetadataResolver1252.q);
    }
}

