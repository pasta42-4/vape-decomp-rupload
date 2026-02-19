/*
 * Decompiled with CFR 0.152.
 */
package com.data.tagging;

import com.app.serialization.utils.SerializationHelper;
import com.app.utils.UniversalIdentityComparator;
import com.app.validation.input.InputValidator;
import com.asset.management.AssetIdentificationModel;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.core.entity.IdentifiableEntityDescriptor;
import com.data.serialization.PersistentObjectSerializer;
import com.model.metadata.EntityDescriptor1891;
import com.network.connection.ConnectionPoolMonitor;
import com.network.connection.NetworkConnectionManager1965;
import com.reflection.metadata.ReflectionMetadataExtractor1914;
import com.resource.core.BaseResourceManager;
import com.resource.management.ResourceAllocationTracker2053;
import com.resource.management.ResourceDescriptor2491;
import com.security.crypto.CryptographicEncoder;
import com.security.encoding.SecureEncodingTransformer;
import com.util.conversion.BooleanStateConverter;

class TagIdentificationService
extends InputValidator {
    BaseResourceManager j;
    UniversalIdentityComparator[] d;
    BytecodeAnalyzer w;
    UniversalIdentityComparator b;
    UniversalIdentityComparator[][] n;

    UniversalIdentityComparator[] A() throws Exception {
        this.K();
        return this.d;
    }

    int m(int n, int n2) throws Exception {
        PersistentObjectSerializer persistentObjectSerializer = new PersistentObjectSerializer(this.w);
        BaseResourceManager[] baseResourceManagerArray = new BaseResourceManager[n2];
        for (int i = 0; i < n2; ++i) {
            n = this.L(n);
            baseResourceManagerArray[i] = this.j;
        }
        persistentObjectSerializer.R(baseResourceManagerArray);
        this.j = persistentObjectSerializer;
        return n;
    }

    int j(int n, int n2) throws Exception {
        UniversalIdentityComparator[] universalIdentityComparatorArray = new UniversalIdentityComparator[n2];
        for (int i = 0; i < n2; ++i) {
            n = this.m(n);
            universalIdentityComparatorArray[i] = this.b;
        }
        this.d = universalIdentityComparatorArray;
        return n;
    }

    int N(int n, int n2, int n3) throws Exception {
        this.b = new UniversalIdentityComparator(n2, this.w);
        return super.N(n, n2, n3);
    }

    int W(int n) throws Exception {
        UniversalIdentityComparator universalIdentityComparator = this.b;
        n = super.W(n);
        this.j = new ResourceDescriptor2491(this.b, this.w);
        this.b = universalIdentityComparator;
        return n;
    }

    void M(int n, int n2) throws Exception {
        BaseResourceManager baseResourceManager;
        BytecodeAnalyzer bytecodeAnalyzer = this.w;
        switch (n) {
            case 66: {
                baseResourceManager = new CryptographicEncoder(n2, bytecodeAnalyzer);
                break;
            }
            case 67: {
                baseResourceManager = new AssetIdentificationModel(n2, bytecodeAnalyzer);
                break;
            }
            case 68: {
                baseResourceManager = new ConnectionPoolMonitor(n2, bytecodeAnalyzer);
                break;
            }
            case 70: {
                baseResourceManager = new SecureEncodingTransformer(n2, bytecodeAnalyzer);
                break;
            }
            case 73: {
                baseResourceManager = new NetworkConnectionManager1965(n2, bytecodeAnalyzer);
                break;
            }
            case 74: {
                baseResourceManager = new ResourceAllocationTracker2053(n2, bytecodeAnalyzer);
                break;
            }
            case 83: {
                baseResourceManager = new SerializationHelper(n2, bytecodeAnalyzer);
                break;
            }
            case 90: {
                baseResourceManager = new BooleanStateConverter(n2, bytecodeAnalyzer);
                break;
            }
            case 115: {
                baseResourceManager = new IdentifiableEntityDescriptor(n2, bytecodeAnalyzer);
                break;
            }
            default: {
                throw new RuntimeException("unknown tag:" + n);
            }
        }
        this.j = baseResourceManager;
        super.M(n, n2);
    }

    void d(int n, int n2) throws Exception {
        this.j = new ReflectionMetadataExtractor1914(n2, this.w);
        super.d(n, n2);
    }

    UniversalIdentityComparator[][] C() throws Exception {
        this.X();
        return this.n;
    }

    TagIdentificationService(byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer) {
        super(byArray);
        this.w = bytecodeAnalyzer;
    }

    void R(int n, int n2, int n3) throws Exception {
        this.j = new EntityDescriptor1891(n2, n3, this.w);
        super.R(n, n2, n3);
    }

    int t(int n, int n2) throws Exception {
        n = super.t(n, n2);
        this.b.A(n2, this.j);
        return n;
    }

    void L(int n, int n2) throws Exception {
        UniversalIdentityComparator[][] universalIdentityComparatorArrayArray = new UniversalIdentityComparator[n][];
        for (int i = 0; i < n; ++i) {
            n2 = this.Q(n2);
            universalIdentityComparatorArrayArray[i] = this.d;
        }
        this.n = universalIdentityComparatorArrayArray;
    }

    BaseResourceManager y() throws Exception {
        this.L(0);
        return this.j;
    }
}

