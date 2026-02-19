/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.app.persistence.PersistenceManager;
import com.app.reflection.analysis.ClassStructureAnalyzer;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeAnnotationExtractor;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.reflection.metadata.ReflectionMetadataResolver933;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ClassMetadataExtractor {
    private static final Integer[] d;
    BytecodeAnalyzer O;
    String R;
    int b;
    private static final long a;
    private static final Map e;
    List<ClassMetadataExtractor654> T;
    String u;
    int[] B;
    int w;
    private static final long[] c;
    public static final int f;
    List<BytecodeInspectionEngine> N;
    int A;
    int z;
    String[] n;
    int U;
    List<BytecodeAnnotationExtractor> m;

    public int c() {
        return this.z;
    }

    public ClassMetadataExtractor(DataInputStream dataInputStream) throws IOException {
        this.O(dataInputStream);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public List<BytecodeInspectionEngine> L() {
        return this.N;
    }

    public final void R(BytecodeInspectionEngine bytecodeInspectionEngine) {
        this.N.add(bytecodeInspectionEngine);
    }

    public void D() {
        BytecodeAnalyzer bytecodeAnalyzer = this.Z();
        for (BytecodeInspectionEngine object : this.N) {
            object.E(bytecodeAnalyzer);
        }
        for (BytecodeAnnotationExtractor bytecodeAnnotationExtractor : this.m) {
            bytecodeAnnotationExtractor.y(bytecodeAnalyzer);
        }
        this.T = ClassMetadataExtractor654.X(this.T, bytecodeAnalyzer);
        this.O = bytecodeAnalyzer;
    }

    public void b(BytecodeInspectionEngine bytecodeInspectionEngine) throws PersistenceManager {
        this.i(bytecodeInspectionEngine);
        this.N.add(bytecodeInspectionEngine);
    }

    public final void j(BytecodeAnnotationExtractor bytecodeAnnotationExtractor) {
        this.m.add(bytecodeAnnotationExtractor);
    }

    public int o() {
        ClassStructureAnalyzer classStructureAnalyzer = (ClassStructureAnalyzer)this.V("InnerClasses");
        try {
            if (classStructureAnalyzer == null) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor.a(customSystemException);
        }
        String string = this.Z();
        int n = classStructureAnalyzer.H();
        int n2 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n2 >= n) break;
                        if (!string.equals(classStructureAnalyzer.r(n2))) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClassMetadataExtractor.a(customSystemException);
                    }
                    return classStructureAnalyzer.q(n2);
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataExtractor.a(customSystemException);
                }
            }
            ++n2;
        }
        return -1;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ClassMetadataExtractor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public String Z() {
        return this.R;
    }

    public ClassMetadataExtractor654 V(String string) {
        for (ClassMetadataExtractor654 classMetadataExtractor654 : this.T) {
            try {
                if (!classMetadataExtractor654.n().equals(string)) continue;
                return classMetadataExtractor654;
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor.a(customSystemException);
            }
        }
        return null;
    }

    private static boolean K(BytecodeInspectionEngine bytecodeInspectionEngine) {
        boolean bl;
        try {
            bl = (bytecodeInspectionEngine.Z() & 0x40) == 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor.a(customSystemException);
        }
        return bl;
    }

    public int k() {
        return this.w;
    }

    public BytecodeInspectionEngine g(String string) {
        for (BytecodeInspectionEngine bytecodeInspectionEngine : this.N) {
            try {
                if (!bytecodeInspectionEngine.C().equals(string)) continue;
                return bytecodeInspectionEngine;
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor.a(customSystemException);
            }
        }
        return null;
    }

    public void t() {
        ClassMetadataExtractor654 classMetadataExtractor654;
        ClassMetadataExtractor654 classMetadataExtractor6542;
        BytecodeAnalyzer bytecodeAnalyzer = this.Z();
        ArrayList<ClassMetadataExtractor654> arrayList = new ArrayList<ClassMetadataExtractor654>();
        ClassMetadataExtractor654 classMetadataExtractor6543 = this.V("RuntimeInvisibleAnnotations");
        if (classMetadataExtractor6543 != null) {
            classMetadataExtractor6543 = classMetadataExtractor6543.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6543);
        }
        if ((classMetadataExtractor6542 = this.V("RuntimeVisibleAnnotations")) != null) {
            classMetadataExtractor6542 = classMetadataExtractor6542.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6542);
        }
        if ((classMetadataExtractor654 = this.V("Signature")) != null) {
            classMetadataExtractor654 = classMetadataExtractor654.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor654);
        }
        for (BytecodeInspectionEngine object : this.N) {
            object.Q(bytecodeAnalyzer);
        }
        for (BytecodeAnnotationExtractor bytecodeAnnotationExtractor : this.m) {
            bytecodeAnnotationExtractor.T(bytecodeAnalyzer);
        }
        this.T = arrayList;
        this.O = bytecodeAnalyzer;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public List<BytecodeAnnotationExtractor> j() {
        return this.m;
    }

    private BytecodeAnalyzer Z() {
        BytecodeAnalyzer bytecodeAnalyzer = new BytecodeAnalyzer(this.R);
        this.b = bytecodeAnalyzer.I();
        String string = this.r();
        try {
            if (string != null) {
                this.A = bytecodeAnalyzer.l(this.r());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor.a(customSystemException);
        }
        if (this.B != null) {
            try {
                for (int i = 0; i < this.B.length; ++i) {
                    this.B[i] = bytecodeAnalyzer.l(this.O.u(this.B[i]));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor.a(customSystemException);
            }
        }
        return bytecodeAnalyzer;
    }

    public String r() {
        try {
            if (this.u == null) {
                this.u = this.O.u(this.A);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor.a(customSystemException);
        }
        return this.u;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        a = MultiContainerRegistry.a(128749653886211946L, 7139475619056635365L, MethodHandles.lookup().lookupClass()).a(107284575139718L);
        e = new HashMap(13);
        long l = a ^ 0xEF608EC60F4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00de\u0001\r\u00d9\u007fn\u00bf\u00f0B\u00b1\u00a8\u00e7N8\u0081\u0098";
        int n2 = "\u00de\u0001\r\u00d9\u007fn\u00bf\u00f0B\u00b1\u00a8\u00e7N8\u0081\u0098".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
        int n5 = 47;
        try {
            Class.forName("java.lang.StringBuilder");
            n5 = 49;
            Class.forName("java.util.zip.DeflaterInputStream");
            n5 = 50;
            Class.forName("java.lang.invoke.CallSite", false, ClassLoader.getSystemClassLoader());
            n5 = 51;
            Class.forName("java.util.function.Function");
            n5 = 52;
            Class.forName("java.lang.Module");
            n5 = 53;
            List.class.getMethod("copyOf", Collection.class);
            n5 = 54;
            Class.forName("java.util.Optional").getMethod("isEmpty", new Class[0]);
            n5 = 55;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        f = n5;
    }

    public void e(DataOutputStream dataOutputStream) throws IOException {
        int n;
        long l = a ^ 0x7C25F8910A0AL;
        dataOutputStream.writeInt((int)ClassMetadataExtractor.a("s", (int)24131, (long)(0x5100AB29DADAC7AEL ^ l)));
        dataOutputStream.writeShort(this.U);
        dataOutputStream.writeShort(this.w);
        this.O.j(dataOutputStream);
        dataOutputStream.writeShort(this.z);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.A);
        int n2 = this.B == null ? 0 : this.B.length;
        dataOutputStream.writeShort(n2);
        try {
            for (n = 0; n < n2; ++n) {
                dataOutputStream.writeShort(this.B[n]);
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor.a(iOException);
        }
        n2 = this.m.size();
        dataOutputStream.writeShort(n2);
        for (n = 0; n < n2; ++n) {
            BytecodeAnnotationExtractor bytecodeAnnotationExtractor = this.m.get(n);
            bytecodeAnnotationExtractor.W(dataOutputStream);
        }
        dataOutputStream.writeShort(this.N.size());
        for (BytecodeInspectionEngine bytecodeInspectionEngine : this.N) {
            bytecodeInspectionEngine.t(dataOutputStream);
        }
        dataOutputStream.writeShort(this.T.size());
        ClassMetadataExtractor654.E(this.T, dataOutputStream);
    }

    private void i(BytecodeInspectionEngine bytecodeInspectionEngine) throws PersistenceManager {
        String string = bytecodeInspectionEngine.C();
        String string2 = bytecodeInspectionEngine.b();
        ListIterator<BytecodeInspectionEngine> listIterator = this.N.listIterator(0);
        while (listIterator.hasNext()) {
            if (!ClassMetadataExtractor.B(bytecodeInspectionEngine, string, string2, listIterator.next(), listIterator)) continue;
            throw new PersistenceManager("duplicate method: " + string + " in " + this.Z());
        }
    }

    private void O(DataInputStream dataInputStream) throws IOException {
        int n;
        int n2;
        block18: {
            block17: {
                long l = a ^ 0x19045AE9C2D7L;
                int n3 = dataInputStream.readInt();
                try {
                    if (n3 != ClassMetadataExtractor.a("s", (int)26024, (long)(0x59FFD29564B7B499L ^ l))) {
                        throw new IOException("bad magic number: " + Integer.toHexString(n3));
                    }
                }
                catch (IOException iOException) {
                    throw ClassMetadataExtractor.a(iOException);
                }
                this.U = dataInputStream.readUnsignedShort();
                this.w = dataInputStream.readUnsignedShort();
                this.O = new BytecodeAnalyzer(dataInputStream);
                this.z = dataInputStream.readUnsignedShort();
                this.b = dataInputStream.readUnsignedShort();
                this.O.G(this.b);
                this.A = dataInputStream.readUnsignedShort();
                n2 = dataInputStream.readUnsignedShort();
                try {
                    if (n2 != 0) break block17;
                    this.B = null;
                    break block18;
                }
                catch (IOException iOException) {
                    throw ClassMetadataExtractor.a(iOException);
                }
            }
            this.B = new int[n2];
            try {
                for (n = 0; n < n2; ++n) {
                    this.B[n] = dataInputStream.readUnsignedShort();
                }
            }
            catch (IOException iOException) {
                throw ClassMetadataExtractor.a(iOException);
            }
        }
        BytecodeAnalyzer bytecodeAnalyzer = this.O;
        n2 = dataInputStream.readUnsignedShort();
        this.m = new ArrayList<BytecodeAnnotationExtractor>();
        try {
            for (n = 0; n < n2; ++n) {
                this.j(new BytecodeAnnotationExtractor(bytecodeAnalyzer, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor.a(iOException);
        }
        n2 = dataInputStream.readUnsignedShort();
        this.N = new ArrayList<BytecodeInspectionEngine>();
        try {
            for (n = 0; n < n2; ++n) {
                this.R(new BytecodeInspectionEngine(bytecodeAnalyzer, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor.a(iOException);
        }
        this.T = new ArrayList<ClassMetadataExtractor654>();
        n2 = dataInputStream.readUnsignedShort();
        try {
            for (n = 0; n < n2; ++n) {
                this.H(ClassMetadataExtractor654.R(bytecodeAnalyzer, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw ClassMetadataExtractor.a(iOException);
        }
        this.R = this.O.u(this.b);
    }

    public BytecodeAnalyzer X() {
        return this.O;
    }

    public String[] v() {
        try {
            if (this.n != null) {
                return this.n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataExtractor.a(customSystemException);
        }
        String[] stringArray = null;
        if (this.B == null) {
            stringArray = new String[]{};
        } else {
            String[] stringArray2 = new String[this.B.length];
            try {
                for (int i = 0; i < this.B.length; ++i) {
                    stringArray2[i] = this.O.u(this.B[i]);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor.a(customSystemException);
            }
            stringArray = stringArray2;
        }
        this.n = stringArray;
        return stringArray;
    }

    public void H(ClassMetadataExtractor654 classMetadataExtractor654) {
        ClassMetadataExtractor654.e(this.T, classMetadataExtractor654.n());
        this.T.add(classMetadataExtractor654);
    }

    private static boolean B(BytecodeInspectionEngine bytecodeInspectionEngine, String string, String string2, BytecodeInspectionEngine bytecodeInspectionEngine2, ListIterator<BytecodeInspectionEngine> listIterator) {
        block10: {
            block11: {
                try {
                    if (!bytecodeInspectionEngine2.C().equals(string)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataExtractor.a(customSystemException);
                }
                String string3 = bytecodeInspectionEngine2.b();
                try {
                    if (!ReflectionMetadataResolver933.t(string3, string2)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataExtractor.a(customSystemException);
                }
                try {
                    try {
                        if (!string3.equals(string2)) break block10;
                        if (!ClassMetadataExtractor.K(bytecodeInspectionEngine2)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClassMetadataExtractor.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataExtractor.a(customSystemException);
                }
            }
            listIterator.remove();
            return false;
        }
        return false;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x329;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/z", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ClassMetadataExtractor.d[n2] = n3;
        }
        return d[n2];
    }

    public BytecodeInspectionEngine c() {
        return this.g("<clinit>");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ClassMetadataExtractor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

