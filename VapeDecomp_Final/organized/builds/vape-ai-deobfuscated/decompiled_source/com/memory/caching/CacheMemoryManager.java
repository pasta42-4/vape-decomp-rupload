/*
 * Decompiled with CFR 0.152.
 */
package com.memory.caching;

import a._Y;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.data.compression.CompressionUtility;
import com.exception.system.CustomSystemException;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.spatial.calculation.GeometricPositionCalculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CacheMemoryManager {
    int t = -1;
    int C = -1;
    private final HashMap<Long, GeometricPositionCalculator> w = new HashMap();
    private final GeometricPositionCalculator x;
    private final GeometricPositionCalculator a;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int m() {
        this.j();
        return this.t;
    }

    private List<GeometricPositionCalculator> t(GeometricPositionCalculator geometricPositionCalculator) {
        ArrayList<GeometricPositionCalculator> arrayList = new ArrayList<GeometricPositionCalculator>();
        double d2 = geometricPositionCalculator.Z;
        double d3 = geometricPositionCalculator.F;
        double d4 = geometricPositionCalculator.p;
        if (geometricPositionCalculator.equals(this.x)) {
            d2 = (double)AdaptiveComputationEngine.Q(d2) + 0.5;
            d3 = AdaptiveComputationEngine.Q(d3);
            d4 = (double)AdaptiveComputationEngine.Q(d4) + 0.5;
        }
        int n = -1;
        while (true) {
            block7: {
                block6: {
                    try {
                        try {
                            if (n > 1) break;
                            if (n != 0) break block6;
                            break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheMemoryManager.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CacheMemoryManager.a(customSystemException);
                    }
                }
                arrayList.add(this.w(d2 + (double)n, d3, d4));
                arrayList.add(this.w(d2, d3 + (double)n, d4));
                arrayList.add(this.w(d2, d3, d4 + (double)n));
            }
            ++n;
        }
        return arrayList;
    }

    public GeometricPositionCalculator g() {
        return this.a;
    }

    public GeometricPositionCalculator b() {
        return this.x;
    }

    public CacheMemoryManager(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.x = this.w(d5, d6, d7);
        this.a = this.w(d2, d3, d4);
    }

    public CacheMemoryManager(ReflectionUtilityBroker reflectionUtilityBroker, ReflectionUtilityBroker reflectionUtilityBroker2) {
        this(reflectionUtilityBroker.o(), reflectionUtilityBroker.q(), reflectionUtilityBroker.j(), reflectionUtilityBroker2.o(), reflectionUtilityBroker2.q(), reflectionUtilityBroker2.j());
    }

    private double R(GeometricPositionCalculator geometricPositionCalculator, GeometricPositionCalculator geometricPositionCalculator2) {
        double d2 = geometricPositionCalculator.Z - geometricPositionCalculator2.Z;
        double d3 = geometricPositionCalculator.F - geometricPositionCalculator2.F;
        double d4 = geometricPositionCalculator.p - geometricPositionCalculator2.p;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public int e() {
        this.j();
        return this.C;
    }

    private GeometricPositionCalculator w(double d2, double d3, double d4) {
        GeometricPositionCalculator geometricPositionCalculator = this.w.get(ReflectionUtilityBroker.p(d2, d3, d4));
        if (geometricPositionCalculator == null) {
            geometricPositionCalculator = new GeometricPositionCalculator(d2, d3, d4);
            this.w.put(ReflectionUtilityBroker.p(d2, d3, d4), geometricPositionCalculator);
        }
        return geometricPositionCalculator;
    }

    public CacheMemoryManager(CompressionUtility compressionUtility, CompressionUtility compressionUtility2) {
        this(compressionUtility.z(), compressionUtility.h(), compressionUtility.A(), compressionUtility2.z(), compressionUtility2.h(), compressionUtility2.A());
    }

    public void b() {
        ArrayList<GeometricPositionCalculator> arrayList = new ArrayList<GeometricPositionCalculator>();
        HashSet<GeometricPositionCalculator> hashSet = new HashSet<GeometricPositionCalculator>();
        arrayList.add(this.x);
        float f = _Y.C(this.x.Z, this.x.p, this.a.Z + 0.5, this.a.p + 0.5);
        while (arrayList.size() > 0) {
            GeometricPositionCalculator geometricPositionCalculator = (GeometricPositionCalculator)arrayList.get(0);
            int n = 1;
            while (true) {
                block24: {
                    block23: {
                        try {
                            try {
                                try {
                                    if (n >= arrayList.size()) break;
                                    if (((GeometricPositionCalculator)arrayList.get(n)).v() < geometricPositionCalculator.v()) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CacheMemoryManager.a(customSystemException);
                                }
                                if (((GeometricPositionCalculator)arrayList.get(n)).v() != geometricPositionCalculator.v()) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CacheMemoryManager.a(customSystemException);
                            }
                            if (!(((GeometricPositionCalculator)arrayList.get((int)n)).T < geometricPositionCalculator.T)) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheMemoryManager.a(customSystemException);
                        }
                    }
                    geometricPositionCalculator = (GeometricPositionCalculator)arrayList.get(n);
                }
                ++n;
            }
            try {
                arrayList.remove(geometricPositionCalculator);
                hashSet.add(geometricPositionCalculator);
                if (geometricPositionCalculator == this.a) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CacheMemoryManager.a(customSystemException);
            }
            double d2 = 0.0;
            double d3 = 0.0;
            for (GeometricPositionCalculator geometricPositionCalculator2 : this.t(geometricPositionCalculator)) {
                int n2;
                double d4;
                try {
                    if (hashSet.contains(geometricPositionCalculator2)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CacheMemoryManager.a(customSystemException);
                }
                double d5 = 0.0;
                try {
                    d4 = d5;
                    n2 = geometricPositionCalculator2.F - geometricPositionCalculator.F == 0.0 ? 0 : 20;
                }
                catch (CustomSystemException customSystemException) {
                    throw CacheMemoryManager.a(customSystemException);
                }
                d5 = d4 + (double)n2;
                d5 += _Y.l(this.x.Z, this.x.p, f, geometricPositionCalculator2.Z, geometricPositionCalculator2.p);
                double d6 = geometricPositionCalculator.m + this.R(geometricPositionCalculator, geometricPositionCalculator2) + (d5 += _Y.z(this.x.Z, this.x.p, geometricPositionCalculator2.Z, geometricPositionCalculator2.p) * 3.0);
                try {
                    try {
                        try {
                            if (!(d6 < geometricPositionCalculator2.m) && arrayList.contains(geometricPositionCalculator2)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheMemoryManager.a(customSystemException);
                        }
                        geometricPositionCalculator2.m = d6;
                        geometricPositionCalculator2.T = this.R(geometricPositionCalculator2, this.x);
                        geometricPositionCalculator2.L = geometricPositionCalculator;
                        if (arrayList.contains(geometricPositionCalculator2)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CacheMemoryManager.a(customSystemException);
                    }
                    arrayList.add(geometricPositionCalculator2);
                }
                catch (CustomSystemException customSystemException) {
                    throw CacheMemoryManager.a(customSystemException);
                }
            }
        }
    }

    private void j() {
        List<GeometricPositionCalculator> list;
        if (this.C == -1 && (list = this.H()).size() > 0) {
            int n = (int)list.get((int)0).F;
            for (GeometricPositionCalculator geometricPositionCalculator : list) {
                block5: {
                    block4: {
                        try {
                            if (geometricPositionCalculator.F != (double)n) break block4;
                            ++this.C;
                            break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheMemoryManager.a(customSystemException);
                        }
                    }
                    ++this.t;
                }
                n = (int)geometricPositionCalculator.F;
            }
        }
    }

    public List<GeometricPositionCalculator> H() {
        ArrayList<GeometricPositionCalculator> arrayList = new ArrayList<GeometricPositionCalculator>();
        GeometricPositionCalculator geometricPositionCalculator = this.a;
        try {
            if (this.a.L == null) {
                this.b();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheMemoryManager.a(customSystemException);
        }
        arrayList.add(this.a);
        while (!geometricPositionCalculator.equals(this.x)) {
            geometricPositionCalculator = geometricPositionCalculator.L;
            arrayList.add(geometricPositionCalculator);
        }
        return arrayList;
    }
}

