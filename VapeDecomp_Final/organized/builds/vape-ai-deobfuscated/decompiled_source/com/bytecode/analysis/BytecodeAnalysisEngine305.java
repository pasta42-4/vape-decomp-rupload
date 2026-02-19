/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import a.Sd;
import com.app.bytecode.analysis.BytecodeMetadataExtractor;
import com.app.core.ResourceStateManager;
import com.app.input.InputProcessor2508;
import com.app.monitoring.metrics.MetricTracker;
import com.app.validation.DataIntegrityValidator2319;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionUtility;
import com.bytecode.analysis.BytecodeMetadataExtractor1871;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.data.persistence.PersistenceCollectionManager;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.finance.processing.TransactionValidator2291;
import com.network.query.QueryParameterResolver;
import com.network.routing.RequestDispatcher;
import com.security.crypto.CipherEncryptionWrapper;
import com.system.configuration.ConfigurationManager2254;
import com.system.resource.ResourceAllocationException;
import com.transaction.management.TransactionStrategyResolver;
import java.util.ArrayList;
import java.util.List;

public class BytecodeAnalysisEngine305
implements TransactionStrategyResolver {
    protected int O;
    private static final int[] w = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 0, 0, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 5, 5, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5};
    protected byte[] K;
    protected BinaryCodeAnalyzer j;
    protected int b;
    protected int v;
    protected int z;

    public void q(int n) {
        this.z = n;
    }

    public int z(byte[] byArray) {
        int n = this.d();
        int n2 = byArray.length;
        try {
            if (n2 <= 0) {
                return n;
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
        }
        this.u(n2);
        byte[] byArray2 = this.K;
        try {
            for (int i = 0; i < n2; ++i) {
                byArray2[i + n] = byArray[i];
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
        }
        return n;
    }

    private byte[] n(byte[] byArray, int n, int n2, boolean bl, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer, MetricTracker metricTracker) throws BytecodeProcessingException {
        int n3;
        byte[] byArray2;
        block8: {
            try {
                if (n2 <= 0) {
                    return byArray;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
            }
            BytecodeMetadataExtractor1871 bytecodeMetadataExtractor1871 = new BytecodeMetadataExtractor1871(this.v, this.z, this.O, n, persistenceCollectionManager, binaryCodeAnalyzer);
            List<ConfigurationManager2254> list = BytecodeAnalysisEngine305.Q(byArray, byArray.length, bytecodeMetadataExtractor1871);
            byArray2 = BytecodeAnalysisEngine305.q(byArray, n, n2, bl, list, bytecodeMetadataExtractor1871);
            this.v = bytecodeMetadataExtractor1871.J;
            this.z = bytecodeMetadataExtractor1871.s;
            this.O = bytecodeMetadataExtractor1871.m;
            n3 = bytecodeMetadataExtractor1871.i;
            try {
                try {
                    if (n3 != this.v || bl) break block8;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
                this.v += n2;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
            }
        }
        if (bl) {
            n3 -= n2;
        }
        metricTracker.m = n3;
        metricTracker.X = n2;
        return byArray2;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private static byte[] q(byte[] var0, int var1_1, int var2_2, boolean var3_3, List<ConfigurationManager2254> var4_4, BytecodeMetadataExtractor1871 var5_5) throws BytecodeProcessingException {
        if (var2_2 > 0) {
            var5_5.u(var1_1, var2_2, var3_3);
            for (Object var7_8 : var4_4) {
                var7_8.w(var1_1, var2_2, var3_3);
            }
        }
        var6_7 = true;
        block1: while (true) {
            if (var6_7) {
                var6_7 = false;
                var7_8 = var4_4.iterator();
                block2: while (true) {
                    if (!var7_8.hasNext()) continue block1;
                    var8_9 = var7_8.next();
                    if (!var8_9.t()) continue;
                    var6_7 = true;
                    var9_10 = var8_9.p;
                    var10_11 = var8_9.W();
                    var5_5.u(var9_10, var10_11, false);
                    var11_12 = var4_4.iterator();
                    while (true) {
                        if (var11_12.hasNext()) ** break;
                        continue block2;
                        var12_13 = var11_12.next();
                        var12_13.w(var9_10, var10_11, false);
                    }
                    break;
                }
            }
            for (ConfigurationManager2254 var8_9 : var4_4) {
                var9_10 = var8_9.S();
                if (var9_10 <= 0) continue;
                var6_7 = true;
                var10_11 = var8_9.p;
                var5_5.u(var10_11, var9_10, false);
                for (ConfigurationManager2254 var12_13 : var4_4) {
                    var12_13.w(var10_11, var9_10, false);
                }
            }
            if (!var6_7) break;
        }
        return BytecodeAnalysisEngine305.i(var0, var4_4, var1_1, var2_2);
    }

    public void u(int n) {
        int n2;
        byte[] byArray = this.K;
        int n3 = byArray.length;
        byte[] byArray2 = new byte[n3 + n];
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                byArray2[n2] = byArray[n2];
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
        }
        try {
            for (n2 = n3; n2 < n3 + n; ++n2) {
                byArray2[n2] = 0;
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
        }
        this.j.f(byArray2);
        this.K = byArray2;
        this.b = this.d();
    }

    public void i() {
        this.O = 0;
        this.z = 0;
        this.v = 0;
        this.b = this.d();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static List<ConfigurationManager2254> Q(byte[] byArray, int n, BytecodeMetadataExtractor1871 bytecodeMetadataExtractor1871) throws BytecodeProcessingException {
        ArrayList<ConfigurationManager2254> arrayList = new ArrayList<ConfigurationManager2254>();
        int n2 = 0;
        while (n2 < n) {
            int n3;
            block25: {
                int n4;
                int n5;
                int n6;
                int n7;
                block23: {
                    block21: {
                        CipherEncryptionWrapper cipherEncryptionWrapper;
                        block24: {
                            block22: {
                                block20: {
                                    n3 = BytecodeAnalysisEngine305.t(byArray, n2);
                                    n7 = byArray[n2] & 0xFF;
                                    try {
                                        try {
                                            try {
                                                if (153 <= n7 && n7 <= 168) break block20;
                                            }
                                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                            }
                                            if (n7 == 198) break block20;
                                        }
                                        catch (BytecodeProcessingException bytecodeProcessingException) {
                                            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                        }
                                        if (n7 != 199) break block21;
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                    }
                                }
                                n6 = byArray[n2 + 1] << 8 | byArray[n2 + 2] & 0xFF;
                                try {
                                    if (n7 != 167 && n7 != 168) break block22;
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                }
                                cipherEncryptionWrapper = new RequestDispatcher(n2, n6);
                                break block24;
                            }
                            cipherEncryptionWrapper = new DataIntegrityValidator2319(n2, n6);
                        }
                        arrayList.add(cipherEncryptionWrapper);
                        break block25;
                    }
                    try {
                        if (n7 != 200 && n7 != 201) break block23;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                    }
                    n6 = ConfigurationManager2137.R(byArray, n2 + 1);
                    arrayList.add(new Sd(n2, n6));
                    break block25;
                }
                if (n7 == 170) {
                    n6 = (n2 & 0xFFFFFFFC) + 4;
                    int n8 = ConfigurationManager2137.R(byArray, n6);
                    n5 = ConfigurationManager2137.R(byArray, n6 + 4);
                    n4 = ConfigurationManager2137.R(byArray, n6 + 8);
                    int n9 = n6 + 12;
                    int n10 = n4 - n5 + 1;
                    int[] nArray = new int[n10];
                    try {
                        for (int i = 0; i < n10; ++i) {
                            nArray[i] = ConfigurationManager2137.R(byArray, n9);
                            n9 += 4;
                        }
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                    }
                    arrayList.add(new TransactionValidator2291(n2, n8, n5, n4, nArray, bytecodeMetadataExtractor1871));
                } else if (n7 == 171) {
                    n6 = (n2 & 0xFFFFFFFC) + 4;
                    int n11 = ConfigurationManager2137.R(byArray, n6);
                    n5 = ConfigurationManager2137.R(byArray, n6 + 4);
                    n4 = n6 + 8;
                    int[] nArray = new int[n5];
                    int[] nArray2 = new int[n5];
                    try {
                        for (int i = 0; i < n5; ++i) {
                            nArray[i] = ConfigurationManager2137.R(byArray, n4);
                            nArray2[i] = ConfigurationManager2137.R(byArray, n4 + 4);
                            n4 += 8;
                        }
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                    }
                    arrayList.add(new ResourceStateManager(n2, n11, nArray, nArray2, bytecodeMetadataExtractor1871));
                }
            }
            n2 = n3;
        }
        return arrayList;
    }

    private int L(int n) throws BytecodeProcessingException {
        this.i();
        BytecodeAnalyzer bytecodeAnalyzer = this.j.K();
        String string = this.j.S();
        int n2 = 0;
        while (this.L()) {
            boolean bl;
            boolean bl2;
            int n3;
            int n4;
            block15: {
                n4 = this.S();
                int n5 = this.z(n4);
                try {
                    if (n5 == 187) {
                        ++n2;
                        continue;
                    }
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
                if (n5 != 183) continue;
                n3 = ConfigurationManager2137.M(this.K, n4 + 1);
                try {
                    try {
                        try {
                            if (!bytecodeAnalyzer.j(n3).equals("<init>") || --n2 >= 0) continue;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                        }
                        if (n >= 0) break block15;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                    }
                    return n4;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
            }
            String string2 = bytecodeAnalyzer.M(n3);
            try {
                bl2 = string2.equals(string);
                bl = n > 0;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
            }
            try {
                if (bl2 == bl) {
                    return n4;
                }
                break;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
            }
        }
        this.i();
        return -1;
    }

    private static byte[] i(byte[] byArray, List<ConfigurationManager2254> list, int n, int n2) throws BytecodeProcessingException {
        int n3;
        ConfigurationManager2254 configurationManager2254;
        int n4 = list.size();
        int n5 = byArray.length + n2;
        for (ConfigurationManager2254 configurationManager22542 : list) {
            n5 += configurationManager22542.W();
        }
        Object object = new byte[n5];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = byArray.length;
        if (0 < n4) {
            configurationManager2254 = list.get(0);
            n3 = configurationManager2254.R;
        } else {
            configurationManager2254 = null;
            n3 = n9;
        }
        while (true) {
            int n10;
            block13: {
                try {
                    if (n6 >= n9) break;
                    if (n6 != n) break block13;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
                n10 = n7 + n2;
                try {
                    while (n7 < n10) {
                        object[n7++] = false;
                    }
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
            }
            try {
                if (n6 != n3) {
                    object[n7++] = byArray[n6++];
                    continue;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
            }
            n10 = configurationManager2254.g(n6, byArray, n7, (byte[])object);
            n6 += n10;
            n7 += n10 + configurationManager2254.W();
            if (++n8 < n4) {
                configurationManager2254 = list.get(n8);
                n3 = configurationManager2254.R;
                continue;
            }
            configurationManager2254 = null;
            n3 = n9;
        }
        return object;
    }

    static byte[] I(byte[] byArray, int n, int n2, boolean bl, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer) throws BytecodeProcessingException {
        try {
            if (n2 <= 0) {
                return byArray;
            }
        }
        catch (ResourceAllocationException resourceAllocationException) {
            throw BytecodeAnalysisEngine305.a(resourceAllocationException);
        }
        try {
            return BytecodeAnalysisEngine305.m(byArray, n, n2, bl, persistenceCollectionManager, binaryCodeAnalyzer);
        }
        catch (ResourceAllocationException resourceAllocationException) {
            try {
                return BytecodeAnalysisEngine305.m(byArray, n, n2 + 3 & 0xFFFFFFFC, bl, persistenceCollectionManager, binaryCodeAnalyzer);
            }
            catch (ResourceAllocationException resourceAllocationException2) {
                throw new RuntimeException("fatal error?");
            }
        }
    }

    private static byte[] m(byte[] byArray, int n, int n2, boolean bl, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer) throws BytecodeProcessingException, ResourceAllocationException {
        int n3 = byArray.length;
        byte[] byArray2 = new byte[n3 + n2];
        BytecodeAnalysisEngine305.p(byArray, n, n2, n3, byArray2, bl);
        persistenceCollectionManager.t(n, n2, bl);
        BytecodeInspectionUtility bytecodeInspectionUtility = (BytecodeInspectionUtility)binaryCodeAnalyzer.G("LineNumberTable");
        try {
            if (bytecodeInspectionUtility != null) {
                bytecodeInspectionUtility.y(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        BytecodeMetadataExtractor bytecodeMetadataExtractor = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTable");
        try {
            if (bytecodeMetadataExtractor != null) {
                bytecodeMetadataExtractor.g(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        BytecodeMetadataExtractor bytecodeMetadataExtractor2 = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTypeTable");
        try {
            if (bytecodeMetadataExtractor2 != null) {
                bytecodeMetadataExtractor2.g(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        BytecodeExceptionHandler bytecodeExceptionHandler = (BytecodeExceptionHandler)binaryCodeAnalyzer.G("StackMapTable");
        try {
            if (bytecodeExceptionHandler != null) {
                bytecodeExceptionHandler.X(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        StackMapDescriptor stackMapDescriptor = (StackMapDescriptor)binaryCodeAnalyzer.G("StackMap");
        try {
            if (stackMapDescriptor != null) {
                stackMapDescriptor.k(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        return byArray2;
    }

    public int W(int n) {
        return ConfigurationManager2137.R(this.K, n);
    }

    public MetricTracker J(int n, int n2, boolean bl) throws BytecodeProcessingException {
        int n3;
        byte[] byArray;
        MetricTracker metricTracker;
        block23: {
            metricTracker = new MetricTracker();
            try {
                if (n2 <= 0) {
                    metricTracker.m = n;
                    metricTracker.X = 0;
                    return metricTracker;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
            }
            if (this.K.length + n2 > Short.MAX_VALUE) {
                byArray = this.n(this.K, n, n2, bl, this.O().u(), this.j, metricTracker);
                n = metricTracker.m;
                n3 = n2;
            } else {
                block21: {
                    int n4 = this.v;
                    byArray = BytecodeAnalysisEngine305.I(this.K, n, n2, bl, this.O().u(), this.j);
                    n3 = byArray.length - this.K.length;
                    try {
                        metricTracker.m = n;
                        metricTracker.X = n3;
                        if (n4 >= n) {
                            this.v = n4 + n3;
                        }
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                    }
                    try {
                        block20: {
                            try {
                                try {
                                    if (this.z > n) break block20;
                                    if (this.z != n) break block21;
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                }
                                if (!bl) break block21;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                            }
                        }
                        this.z += n3;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                    }
                }
                try {
                    block22: {
                        try {
                            try {
                                if (this.O > n) break block22;
                                if (this.O != n) break block23;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                            }
                            if (!bl) break block23;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                        }
                    }
                    this.O += n3;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
            }
        }
        this.j.f(byArray);
        this.K = byArray;
        this.b = this.d();
        this.r(n, n3);
        return metricTracker;
    }

    private static void p(byte[] byArray, int n, int n2, int n3, byte[] byArray2, boolean bl) throws BytecodeProcessingException, ResourceAllocationException {
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6;
            block39: {
                block37: {
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    block38: {
                        int n12;
                        block35: {
                            block36: {
                                block34: {
                                    block33: {
                                        block32: {
                                            block31: {
                                                try {
                                                    if (n4 >= n3) break;
                                                    if (n4 != n) break block31;
                                                }
                                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                                }
                                                n12 = n5 + n2;
                                                try {
                                                    while (n5 < n12) {
                                                        byArray2[n5++] = 0;
                                                    }
                                                }
                                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                                }
                                            }
                                            n6 = BytecodeAnalysisEngine305.t(byArray, n4);
                                            n12 = byArray[n4] & 0xFF;
                                            try {
                                                try {
                                                    try {
                                                        if (153 <= n12 && n12 <= 168) break block32;
                                                    }
                                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                                    }
                                                    if (n12 == 198) break block32;
                                                }
                                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                                }
                                                if (n12 != 199) break block33;
                                            }
                                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                            }
                                        }
                                        n11 = byArray[n4 + 1] << 8 | byArray[n4 + 2] & 0xFF;
                                        n11 = BytecodeAnalysisEngine305.F(n4, n11, n, n2, bl);
                                        byArray2[n5] = byArray[n4];
                                        ConfigurationManager2137.e(n11, byArray2, n5 + 1);
                                        n5 += 3;
                                        break block39;
                                    }
                                    try {
                                        if (n12 != 200 && n12 != 201) break block34;
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                    }
                                    n11 = ConfigurationManager2137.R(byArray, n4 + 1);
                                    n11 = BytecodeAnalysisEngine305.F(n4, n11, n, n2, bl);
                                    byArray2[n5++] = byArray[n4];
                                    ConfigurationManager2137.C(n11, byArray2, n5);
                                    n5 += 4;
                                    break block39;
                                }
                                try {
                                    try {
                                        try {
                                            if (n12 != 170) break block35;
                                            if (n4 == n5) break block36;
                                        }
                                        catch (BytecodeProcessingException bytecodeProcessingException) {
                                            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                        }
                                        if ((n2 & 3) == 0) break block36;
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                    }
                                    throw new ResourceAllocationException();
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                }
                            }
                            n11 = (n4 & 0xFFFFFFFC) + 4;
                            n5 = BytecodeAnalysisEngine305.o(byArray2, n5, byArray, n4, n11);
                            n10 = BytecodeAnalysisEngine305.F(n4, ConfigurationManager2137.R(byArray, n11), n, n2, bl);
                            ConfigurationManager2137.C(n10, byArray2, n5);
                            n9 = ConfigurationManager2137.R(byArray, n11 + 4);
                            ConfigurationManager2137.C(n9, byArray2, n5 + 4);
                            n8 = ConfigurationManager2137.R(byArray, n11 + 8);
                            ConfigurationManager2137.C(n8, byArray2, n5 + 8);
                            n5 += 12;
                            n7 = n11 + 12;
                            n11 = n7 + (n8 - n9 + 1) * 4;
                            while (n7 < n11) {
                                int n13 = BytecodeAnalysisEngine305.F(n4, ConfigurationManager2137.R(byArray, n7), n, n2, bl);
                                ConfigurationManager2137.C(n13, byArray2, n5);
                                n5 += 4;
                                n7 += 4;
                            }
                            break block39;
                        }
                        try {
                            try {
                                try {
                                    if (n12 != 171) break block37;
                                    if (n4 == n5) break block38;
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                                }
                                if ((n2 & 3) == 0) break block38;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                            }
                            throw new ResourceAllocationException();
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                        }
                    }
                    n11 = (n4 & 0xFFFFFFFC) + 4;
                    n5 = BytecodeAnalysisEngine305.o(byArray2, n5, byArray, n4, n11);
                    n10 = BytecodeAnalysisEngine305.F(n4, ConfigurationManager2137.R(byArray, n11), n, n2, bl);
                    ConfigurationManager2137.C(n10, byArray2, n5);
                    n9 = ConfigurationManager2137.R(byArray, n11 + 4);
                    ConfigurationManager2137.C(n9, byArray2, n5 + 4);
                    n5 += 8;
                    n8 = n11 + 8;
                    n11 = n8 + n9 * 8;
                    while (n8 < n11) {
                        ConfigurationManager2137.i(byArray, n8, byArray2, n5);
                        n7 = BytecodeAnalysisEngine305.F(n4, ConfigurationManager2137.R(byArray, n8 + 4), n, n2, bl);
                        ConfigurationManager2137.C(n7, byArray2, n5 + 4);
                        n5 += 8;
                        n8 += 8;
                    }
                    break block39;
                }
                try {
                    while (n4 < n6) {
                        byArray2[n5++] = byArray[n4++];
                    }
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
                }
            }
            n4 = n6;
        }
    }

    public void g(int n, int n2) {
        this.K[n2] = (byte)n;
    }

    public void k(int n, int n2) {
        ConfigurationManager2137.C(n, this.K, n2);
    }

    public boolean L() {
        boolean bl;
        try {
            bl = this.v < this.b;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    private static int o(byte[] var0, int var1_1, byte[] var2_2, int var3_3, int var4_4) {
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

    public int S() throws BytecodeProcessingException {
        int n = this.v;
        this.v = BytecodeAnalysisEngine305.t(this.K, n);
        return n;
    }

    protected BytecodeAnalysisEngine305(BinaryCodeAnalyzer binaryCodeAnalyzer) {
        this.j = binaryCodeAnalyzer;
        this.K = binaryCodeAnalyzer.X();
        this.i();
    }

    public int z(int n) {
        return this.K[n] & 0xFF;
    }

    public void D(int n) {
        this.O = n;
    }

    public int X(byte[] byArray) throws BytecodeProcessingException {
        return this.b(this.v, byArray, true);
    }

    private static int F(int n, int n2, int n3, int n4, boolean bl) {
        block14: {
            block16: {
                int n5;
                block15: {
                    block12: {
                        block13: {
                            n5 = n + n2;
                            try {
                                try {
                                    try {
                                        if (n >= n3) break block12;
                                        if (n3 < n5) break block13;
                                    }
                                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                        throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                                    }
                                    if (!bl) break block14;
                                }
                                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                    throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                                }
                                if (n3 != n5) break block14;
                            }
                            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                            }
                        }
                        n2 += n4;
                        break block14;
                    }
                    try {
                        if (n != n3) break block15;
                        if (n5 >= n3) break block14;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                    }
                    n2 -= n4;
                    break block14;
                }
                try {
                    try {
                        if (n5 < n3) break block16;
                        if (bl) break block14;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                    }
                    if (n3 != n5) break block14;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                }
            }
            n2 -= n4;
        }
        return n2;
    }

    public int W() throws BytecodeProcessingException {
        return this.L(-1);
    }

    public void J(PersistenceCollectionManager persistenceCollectionManager, int n) {
        PersistenceCollectionManager persistenceCollectionManager2 = this.j.u();
        persistenceCollectionManager2.A(persistenceCollectionManager2.w(), persistenceCollectionManager, n);
    }

    private static void a(InputProcessor2508 inputProcessor2508, List<ConfigurationManager2254> list) {
        int n = inputProcessor2508.F;
        QueryParameterResolver queryParameterResolver = new QueryParameterResolver(n, inputProcessor2508.y);
        int n2 = list.size();
        int n3 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n3 >= n2) break;
                        if (n >= list.get((int)n3).R) break block5;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                    }
                    list.add(n3, queryParameterResolver);
                    return;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                }
            }
            ++n3;
        }
        list.add(queryParameterResolver);
    }

    public int z(int n, byte[] byArray) throws BytecodeProcessingException {
        return this.b(n, byArray, false);
    }

    static byte[] C(byte[] byArray, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer, InputProcessor2508 inputProcessor2508) throws BytecodeProcessingException {
        BytecodeMetadataExtractor1871 bytecodeMetadataExtractor1871 = new BytecodeMetadataExtractor1871(0, 0, 0, 0, persistenceCollectionManager, binaryCodeAnalyzer);
        List<ConfigurationManager2254> list = BytecodeAnalysisEngine305.Q(byArray, byArray.length, bytecodeMetadataExtractor1871);
        while (inputProcessor2508 != null) {
            BytecodeAnalysisEngine305.a(inputProcessor2508, list);
            inputProcessor2508 = inputProcessor2508.q;
        }
        byte[] byArray2 = BytecodeAnalysisEngine305.q(byArray, 0, 0, false, list, bytecodeMetadataExtractor1871);
        return byArray2;
    }

    public int m(int n) {
        return ConfigurationManager2137.W(this.K, n);
    }

    public int f() {
        return this.O;
    }

    public void P(PersistenceCollectionManager persistenceCollectionManager, int n) {
        this.j.u().A(0, persistenceCollectionManager, n);
    }

    public int M() {
        return this.z;
    }

    public BinaryCodeAnalyzer O() {
        return this.j;
    }

    public int x() throws BytecodeProcessingException {
        return this.L(0);
    }

    public void V(int n, int n2) {
        ConfigurationManager2137.e(n, this.K, n2);
    }

    static int t(byte[] byArray, int n) throws BytecodeProcessingException {
        int n2;
        try {
            n2 = byArray[n] & 0xFF;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new BytecodeProcessingException("invalid opcode address");
        }
        try {
            block9: {
                block10: {
                    int n3 = w[n2];
                    if (n3 > 0) {
                        return n + n3;
                    }
                    try {
                        if (n2 != 196) break block9;
                        if (byArray[n + 1] != -124) break block10;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
                    }
                    return n + 6;
                }
                return n + 4;
            }
            int n4 = (n & 0xFFFFFFFC) + 8;
            if (n2 == 171) {
                int n5 = ConfigurationManager2137.R(byArray, n4);
                return n4 + n5 * 8 + 4;
            }
            if (n2 == 170) {
                int n6 = ConfigurationManager2137.R(byArray, n4);
                int n7 = ConfigurationManager2137.R(byArray, n4 + 4);
                return n4 + (n7 - n6 + 1) * 4 + 8;
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            // empty catch block
        }
        throw new BytecodeProcessingException(n2);
    }

    public int R() throws BytecodeProcessingException {
        return this.L(1);
    }

    public void Z(byte[] byArray, int n) {
        int n2 = byArray.length;
        try {
            for (int i = 0; i < n2; ++i) {
                this.K[n++] = byArray[i];
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw BytecodeAnalysisEngine305.a(indexOutOfBoundsException);
        }
    }

    public int d() {
        return this.K.length;
    }

    private int b(int n, byte[] byArray, boolean bl) throws BytecodeProcessingException {
        int n2 = byArray.length;
        try {
            if (n2 <= 0) {
                return n;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        int n3 = n = this.J((int)n, (int)n2, (boolean)bl).m;
        try {
            for (int i = 0; i < n2; ++i) {
                this.K[n3++] = byArray[i];
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeAnalysisEngine305.a(bytecodeProcessingException);
        }
        return n;
    }

    protected void r(int n, int n2) {
    }

    public void g(int n) {
        this.v = n;
    }

    public int Z(int n) {
        return ConfigurationManager2137.M(this.K, n);
    }
}

