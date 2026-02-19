/*
 * Decompiled with CFR 0.152.
 */
package com.app.event.core;

import com.app.configuration.management.ConfigurationStateTracker;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine1263;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.data.persistence.PersistenceCollectionManager;
import com.exception.system.CustomSystemException;
import com.network.serialization.SerializableDataContainer;
import com.utils.sorting.SortableIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EventDispatchController1186 {
    private BytecodeAnalysisEngine1263[] z(BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263, BytecodeAnalysisEngine1263 bytecodeAnalysisEngine12632) {
        BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array = this.j(2);
        bytecodeAnalysisEngine1263Array[0] = bytecodeAnalysisEngine1263;
        bytecodeAnalysisEngine1263Array[1] = bytecodeAnalysisEngine12632;
        return bytecodeAnalysisEngine1263Array;
    }

    private BytecodeAnalysisEngine1263[] q(Map<Integer, SortableIdentifier> map) {
        BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263;
        int n;
        ArrayList<BytecodeAnalysisEngine1263> arrayList;
        Object[] objectArray;
        block15: {
            block10: {
                objectArray = map.values().toArray(new SortableIdentifier[map.size()]);
                Arrays.sort(objectArray);
                arrayList = new ArrayList<BytecodeAnalysisEngine1263>();
                n = 0;
                try {
                    try {
                        if (objectArray.length <= 0 || ((SortableIdentifier)objectArray[0]).F != 0) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchController1186.a(customSystemException);
                    }
                    if (((SortableIdentifier)objectArray[0]).s == null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchController1186.a(customSystemException);
                }
                bytecodeAnalysisEngine1263 = EventDispatchController1186.a((SortableIdentifier)objectArray[n++]);
                break block15;
            }
            bytecodeAnalysisEngine1263 = this.X(0);
        }
        arrayList.add(bytecodeAnalysisEngine1263);
        while (n < objectArray.length) {
            BytecodeAnalysisEngine1263 bytecodeAnalysisEngine12632;
            block14: {
                Object object;
                block13: {
                    block11: {
                        block12: {
                            object = objectArray[n++];
                            bytecodeAnalysisEngine12632 = EventDispatchController1186.a((SortableIdentifier)object);
                            try {
                                if (bytecodeAnalysisEngine12632 != null) break block11;
                                if (bytecodeAnalysisEngine1263.F <= 0) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchController1186.a(customSystemException);
                            }
                            bytecodeAnalysisEngine1263 = this.X(bytecodeAnalysisEngine1263.q + bytecodeAnalysisEngine1263.F);
                            arrayList.add(bytecodeAnalysisEngine1263);
                        }
                        bytecodeAnalysisEngine1263.F = ((SortableIdentifier)object).F + ((SortableIdentifier)object).C - bytecodeAnalysisEngine1263.q;
                        bytecodeAnalysisEngine1263.s = ((SortableIdentifier)object).Z;
                        bytecodeAnalysisEngine1263.m = ((SortableIdentifier)object).V;
                        continue;
                    }
                    try {
                        if (bytecodeAnalysisEngine1263.F != 0) break block13;
                        bytecodeAnalysisEngine1263.F = ((SortableIdentifier)object).F - bytecodeAnalysisEngine1263.q;
                        ++bytecodeAnalysisEngine12632.C;
                        bytecodeAnalysisEngine1263.s = this.z(bytecodeAnalysisEngine12632);
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchController1186.a(customSystemException);
                    }
                }
                if (bytecodeAnalysisEngine1263.q + bytecodeAnalysisEngine1263.F < ((SortableIdentifier)object).F) {
                    bytecodeAnalysisEngine1263 = this.X(bytecodeAnalysisEngine1263.q + bytecodeAnalysisEngine1263.F);
                    arrayList.add(bytecodeAnalysisEngine1263);
                    bytecodeAnalysisEngine1263.F = ((SortableIdentifier)object).F - bytecodeAnalysisEngine1263.q;
                    bytecodeAnalysisEngine1263.m = true;
                    bytecodeAnalysisEngine1263.s = this.z(bytecodeAnalysisEngine12632);
                }
            }
            arrayList.add(bytecodeAnalysisEngine12632);
            bytecodeAnalysisEngine1263 = bytecodeAnalysisEngine12632;
        }
        return arrayList.toArray(this.j(arrayList.size()));
    }

    private BytecodeAnalysisEngine1263[] z(BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263) {
        BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array = this.j(1);
        bytecodeAnalysisEngine1263Array[0] = bytecodeAnalysisEngine1263;
        return bytecodeAnalysisEngine1263Array;
    }

    private SortableIdentifier h(Map<Integer, SortableIdentifier> map, int n, boolean bl, boolean bl2) {
        SortableIdentifier sortableIdentifier;
        block8: {
            block9: {
                Integer n2 = n;
                sortableIdentifier = map.get(n2);
                if (sortableIdentifier == null) {
                    sortableIdentifier = new SortableIdentifier(n);
                    map.put(n2, sortableIdentifier);
                }
                try {
                    try {
                        if (!bl) break block8;
                        if (sortableIdentifier.s != null) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchController1186.a(customSystemException);
                    }
                    sortableIdentifier.s = this.X(n);
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchController1186.a(customSystemException);
                }
            }
            try {
                if (bl2) {
                    ++sortableIdentifier.s.C;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchController1186.a(customSystemException);
            }
        }
        return sortableIdentifier;
    }

    protected BytecodeAnalysisEngine1263[] j(int n) {
        return new BytecodeAnalysisEngine1263[n];
    }

    public BytecodeAnalysisEngine1263[] Z(BytecodeInspectionEngine bytecodeInspectionEngine) throws BytecodeProcessingException {
        BinaryCodeAnalyzer binaryCodeAnalyzer = bytecodeInspectionEngine.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                return null;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw EventDispatchController1186.a(bytecodeProcessingException);
        }
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        return this.B(bytecodeAnalysisEngine305, 0, bytecodeAnalysisEngine305.d(), binaryCodeAnalyzer.u());
    }

    private SortableIdentifier S(Map<Integer, SortableIdentifier> map, int n, BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array, int n2, boolean bl) {
        SortableIdentifier sortableIdentifier = this.h(map, n, false, false);
        sortableIdentifier.G(bytecodeAnalysisEngine1263Array, n2, bl);
        return sortableIdentifier;
    }

    private SortableIdentifier b(Map<Integer, SortableIdentifier> map, int n) {
        return this.h(map, n, true, true);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void g(Map<Integer, SortableIdentifier> map, int n, int n2, int n3) {
        SortableIdentifier sortableIdentifier = this.b(map, n2);
        BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array = this.z(sortableIdentifier.s);
        this.S(map, n, bytecodeAnalysisEngine1263Array, n3, true);
    }

    protected BytecodeAnalysisEngine1263 X(int n) {
        return new BytecodeAnalysisEngine1263(n);
    }

    private static BytecodeAnalysisEngine1263 a(SortableIdentifier sortableIdentifier) {
        BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263;
        block4: {
            bytecodeAnalysisEngine1263 = sortableIdentifier.s;
            try {
                try {
                    if (bytecodeAnalysisEngine1263 == null || sortableIdentifier.C <= 0) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchController1186.a(customSystemException);
                }
                bytecodeAnalysisEngine1263.s = sortableIdentifier.Z;
                bytecodeAnalysisEngine1263.F = sortableIdentifier.C;
                bytecodeAnalysisEngine1263.m = sortableIdentifier.V;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchController1186.a(customSystemException);
            }
        }
        return bytecodeAnalysisEngine1263;
    }

    public BytecodeAnalysisEngine1263[] B(BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, int n, int n2, PersistenceCollectionManager persistenceCollectionManager) throws BytecodeProcessingException {
        Map<Integer, SortableIdentifier> map = this.n(bytecodeAnalysisEngine305, n, n2, persistenceCollectionManager);
        BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array = this.q(map);
        this.g(bytecodeAnalysisEngine1263Array, persistenceCollectionManager);
        return bytecodeAnalysisEngine1263Array;
    }

    protected void H(Map<Integer, SortableIdentifier> map, int n, int n2, int n3) throws BytecodeProcessingException {
        throw new SerializableDataContainer();
    }

    private void g(BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array, PersistenceCollectionManager persistenceCollectionManager) throws BytecodeProcessingException {
        try {
            if (persistenceCollectionManager == null) {
                return;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw EventDispatchController1186.a(bytecodeProcessingException);
        }
        int n = persistenceCollectionManager.w();
        while (--n >= 0) {
            BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263 = BytecodeAnalysisEngine1263.u(bytecodeAnalysisEngine1263Array, persistenceCollectionManager.N(n));
            int n2 = persistenceCollectionManager.b(n);
            int n3 = persistenceCollectionManager.S(n);
            int n4 = persistenceCollectionManager.C(n);
            --bytecodeAnalysisEngine1263.C;
            for (int i = 0; i < bytecodeAnalysisEngine1263Array.length; ++i) {
                BytecodeAnalysisEngine1263 bytecodeAnalysisEngine12632 = bytecodeAnalysisEngine1263Array[i];
                int n5 = bytecodeAnalysisEngine12632.q;
                try {
                    try {
                        if (n2 > n5 || n5 >= n3) continue;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw EventDispatchController1186.a(bytecodeProcessingException);
                    }
                    bytecodeAnalysisEngine12632.B = new ConfigurationStateTracker(bytecodeAnalysisEngine1263, n4, bytecodeAnalysisEngine12632.B);
                    ++bytecodeAnalysisEngine1263.C;
                    continue;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw EventDispatchController1186.a(bytecodeProcessingException);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map<Integer, SortableIdentifier> n(BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, int n, int n2, PersistenceCollectionManager persistenceCollectionManager) throws BytecodeProcessingException {
        int n3;
        bytecodeAnalysisEngine305.i();
        bytecodeAnalysisEngine305.g(n);
        HashMap<Integer, SortableIdentifier> hashMap = new HashMap<Integer, SortableIdentifier>();
        block41: while (bytecodeAnalysisEngine305.L()) {
            int n4;
            block53: {
                block51: {
                    block50: {
                        block49: {
                            n3 = bytecodeAnalysisEngine305.S();
                            try {
                                if (n3 >= n2) {
                                    break;
                                }
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw EventDispatchController1186.a(bytecodeProcessingException);
                            }
                            n4 = bytecodeAnalysisEngine305.z(n3);
                            try {
                                try {
                                    try {
                                        if (153 <= n4 && n4 <= 166) break block49;
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw EventDispatchController1186.a(bytecodeProcessingException);
                                    }
                                    if (n4 == 198) break block49;
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw EventDispatchController1186.a(bytecodeProcessingException);
                                }
                                if (n4 != 199) break block50;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw EventDispatchController1186.a(bytecodeProcessingException);
                            }
                        }
                        SortableIdentifier sortableIdentifier = this.b(hashMap, n3 + bytecodeAnalysisEngine305.m(n3 + 1));
                        SortableIdentifier sortableIdentifier2 = this.b(hashMap, n3 + 3);
                        this.S(hashMap, n3, this.z(sortableIdentifier.s, sortableIdentifier2.s), 3, false);
                        continue;
                    }
                    try {
                        try {
                            try {
                                if (167 > n4 || n4 > 171) break block51;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw EventDispatchController1186.a(bytecodeProcessingException);
                            }
                            switch (n4) {
                                case 167: {
                                    this.g(hashMap, n3, n3 + bytecodeAnalysisEngine305.m(n3 + 1), 3);
                                    continue block41;
                                }
                                case 168: {
                                    this.H(hashMap, n3, n3 + bytecodeAnalysisEngine305.m(n3 + 1), 3);
                                    continue block41;
                                }
                                case 169: {
                                    this.S(hashMap, n3, null, 2, true);
                                    continue block41;
                                }
                                case 170: {
                                    int n5;
                                    int n6 = (n3 & 0xFFFFFFFC) + 4;
                                    int n7 = bytecodeAnalysisEngine305.W(n6 + 4);
                                    int n8 = bytecodeAnalysisEngine305.W(n6 + 8);
                                    int n9 = n8 - n7 + 1;
                                    BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array = this.j(n9 + 1);
                                    bytecodeAnalysisEngine1263Array[0] = this.b(hashMap, (int)(n3 + bytecodeAnalysisEngine305.W((int)n6))).s;
                                    int n10 = n5 + n9 * 4;
                                    int n11 = 1;
                                    try {
                                        for (n5 = n6 + 12; n5 < n10; n5 += 4) {
                                            bytecodeAnalysisEngine1263Array[n11++] = this.b(hashMap, (int)(n3 + bytecodeAnalysisEngine305.W((int)n5))).s;
                                        }
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw EventDispatchController1186.a(bytecodeProcessingException);
                                    }
                                    this.S(hashMap, n3, bytecodeAnalysisEngine1263Array, n10 - n3, true);
                                    continue block41;
                                }
                                case 171: {
                                    int n9;
                                    int n12 = (n3 & 0xFFFFFFFC) + 4;
                                    int n13 = bytecodeAnalysisEngine305.W(n12 + 4);
                                    BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array = this.j(n13 + 1);
                                    bytecodeAnalysisEngine1263Array[0] = this.b(hashMap, (int)(n3 + bytecodeAnalysisEngine305.W((int)n12))).s;
                                    int n14 = n9 + n13 * 8 - 4;
                                    int n5 = 1;
                                    try {
                                        for (n9 = n12 + 8 + 4; n9 < n14; n9 += 8) {
                                            bytecodeAnalysisEngine1263Array[n5++] = this.b(hashMap, (int)(n3 + bytecodeAnalysisEngine305.W((int)n9))).s;
                                        }
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw EventDispatchController1186.a(bytecodeProcessingException);
                                    }
                                    this.S(hashMap, n3, bytecodeAnalysisEngine1263Array, n14 - n3, true);
                                    continue block41;
                                }
                            }
                            continue;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw EventDispatchController1186.a(bytecodeProcessingException);
                        }
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw EventDispatchController1186.a(bytecodeProcessingException);
                    }
                }
                try {
                    block52: {
                        try {
                            try {
                                if (172 <= n4 && n4 <= 177) break block52;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw EventDispatchController1186.a(bytecodeProcessingException);
                            }
                            if (n4 != 191) break block53;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw EventDispatchController1186.a(bytecodeProcessingException);
                        }
                    }
                    this.S(hashMap, n3, null, 1, true);
                    continue;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw EventDispatchController1186.a(bytecodeProcessingException);
                }
            }
            try {
                if (n4 == 200) {
                    this.g(hashMap, n3, n3 + bytecodeAnalysisEngine305.W(n3 + 1), 5);
                    continue;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw EventDispatchController1186.a(bytecodeProcessingException);
            }
            try {
                if (n4 == 201) {
                    this.H(hashMap, n3, n3 + bytecodeAnalysisEngine305.W(n3 + 1), 5);
                    continue;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw EventDispatchController1186.a(bytecodeProcessingException);
            }
            try {
                try {
                    if (n4 != 196 || bytecodeAnalysisEngine305.z(n3 + 1) != 169) continue;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw EventDispatchController1186.a(bytecodeProcessingException);
                }
                this.S(hashMap, n3, null, 4, true);
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw EventDispatchController1186.a(bytecodeProcessingException);
            }
        }
        if (persistenceCollectionManager == null) return hashMap;
        n3 = persistenceCollectionManager.w();
        try {
            while (--n3 >= 0) {
                this.h(hashMap, persistenceCollectionManager.b(n3), true, false);
                this.b(hashMap, persistenceCollectionManager.N(n3));
            }
            return hashMap;
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw EventDispatchController1186.a(bytecodeProcessingException);
        }
    }
}

