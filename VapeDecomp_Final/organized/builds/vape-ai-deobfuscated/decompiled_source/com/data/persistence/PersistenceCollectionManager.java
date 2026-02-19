/*
 * Decompiled with CFR 0.152.
 */
package com.data.persistence;

import com.app.monitoring.PerformanceMetricsCollector2689;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersistenceCollectionManager
implements Cloneable {
    private List<PerformanceMetricsCollector2689> x;
    private BytecodeAnalyzer u;

    public int C(int n) {
        return this.x.get((int)n).I;
    }

    public PersistenceCollectionManager(BytecodeAnalyzer bytecodeAnalyzer) {
        this.u = bytecodeAnalyzer;
        this.x = new ArrayList<PerformanceMetricsCollector2689>();
    }

    public int w() {
        return this.x.size();
    }

    public PersistenceCollectionManager z(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        PersistenceCollectionManager persistenceCollectionManager = new PersistenceCollectionManager(bytecodeAnalyzer);
        BytecodeAnalyzer bytecodeAnalyzer2 = this.u;
        for (PerformanceMetricsCollector2689 performanceMetricsCollector2689 : this.x) {
            int n = bytecodeAnalyzer2.X(performanceMetricsCollector2689.I, bytecodeAnalyzer, map);
            persistenceCollectionManager.E(performanceMetricsCollector2689.a, performanceMetricsCollector2689.W, performanceMetricsCollector2689.j, n);
        }
        return persistenceCollectionManager;
    }

    public int N(int n) {
        return this.x.get((int)n).j;
    }

    public void H(int n, int n2, int n3, int n4, int n5) {
        try {
            if (n2 < n3) {
                this.x.add(n, new PerformanceMetricsCollector2689(n2, n3, n4, n5));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PersistenceCollectionManager.a(customSystemException);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        PersistenceCollectionManager persistenceCollectionManager = (PersistenceCollectionManager)super.clone();
        persistenceCollectionManager.x = new ArrayList<PerformanceMetricsCollector2689>(this.x);
        return persistenceCollectionManager;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void E(int n, int n2, int n3, int n4) {
        try {
            if (n < n2) {
                this.x.add(new PerformanceMetricsCollector2689(n, n2, n3, n4));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PersistenceCollectionManager.a(customSystemException);
        }
    }

    PersistenceCollectionManager(BytecodeAnalyzer bytecodeAnalyzer, DataInputStream dataInputStream) throws IOException {
        this.u = bytecodeAnalyzer;
        int n = dataInputStream.readUnsignedShort();
        ArrayList<PerformanceMetricsCollector2689> arrayList = new ArrayList<PerformanceMetricsCollector2689>(n);
        for (int i = 0; i < n; ++i) {
            int n2 = dataInputStream.readUnsignedShort();
            int n3 = dataInputStream.readUnsignedShort();
            int n4 = dataInputStream.readUnsignedShort();
            int n5 = dataInputStream.readUnsignedShort();
            arrayList.add(new PerformanceMetricsCollector2689(n2, n3, n4, n5));
        }
        this.x = arrayList;
    }

    public void A(int n, PersistenceCollectionManager persistenceCollectionManager, int n2) {
        int n3 = persistenceCollectionManager.w();
        while (--n3 >= 0) {
            PerformanceMetricsCollector2689 performanceMetricsCollector2689 = persistenceCollectionManager.x.get(n3);
            this.H(n, performanceMetricsCollector2689.a + n2, performanceMetricsCollector2689.W + n2, performanceMetricsCollector2689.j + n2, performanceMetricsCollector2689.I);
        }
    }

    private static int A(int n, int n2, int n3, boolean bl) {
        block5: {
            block4: {
                try {
                    try {
                        if (n > n2) break block4;
                        if (!bl) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PersistenceCollectionManager.a(customSystemException);
                    }
                    if (n != n2) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw PersistenceCollectionManager.a(customSystemException);
                }
            }
            n += n3;
        }
        return n;
    }

    void t(int n, int n2, boolean bl) {
        for (PerformanceMetricsCollector2689 performanceMetricsCollector2689 : this.x) {
            performanceMetricsCollector2689.a = PersistenceCollectionManager.A(performanceMetricsCollector2689.a, n, n2, bl);
            performanceMetricsCollector2689.W = PersistenceCollectionManager.A(performanceMetricsCollector2689.W, n, n2, bl);
            performanceMetricsCollector2689.j = PersistenceCollectionManager.A(performanceMetricsCollector2689.j, n, n2, bl);
        }
    }

    void j(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.w());
        for (PerformanceMetricsCollector2689 performanceMetricsCollector2689 : this.x) {
            dataOutputStream.writeShort(performanceMetricsCollector2689.a);
            dataOutputStream.writeShort(performanceMetricsCollector2689.W);
            dataOutputStream.writeShort(performanceMetricsCollector2689.j);
            dataOutputStream.writeShort(performanceMetricsCollector2689.I);
        }
    }

    public int b(int n) {
        return this.x.get((int)n).a;
    }

    public int S(int n) {
        return this.x.get((int)n).W;
    }
}

