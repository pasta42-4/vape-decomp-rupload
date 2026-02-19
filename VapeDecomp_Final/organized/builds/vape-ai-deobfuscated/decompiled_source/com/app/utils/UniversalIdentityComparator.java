/*
 * Decompiled with CFR 0.152.
 */
package com.app.utils;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.resource.core.BaseResourceManager;
import com.security.tokens.SecurityTokenGenerator2675;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniversalIdentityComparator {
    int r;
    Map<String, SecurityTokenGenerator2675> k;
    BytecodeAnalyzer K;

    public boolean equals(Object object) {
        Map<String, SecurityTokenGenerator2675> map;
        block21: {
            boolean bl;
            block23: {
                block22: {
                    block20: {
                        try {
                            if (object == this) {
                                return true;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UniversalIdentityComparator.a(customSystemException);
                        }
                        try {
                            try {
                                if (object != null && object instanceof UniversalIdentityComparator) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw UniversalIdentityComparator.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UniversalIdentityComparator.a(customSystemException);
                        }
                    }
                    UniversalIdentityComparator universalIdentityComparator = (UniversalIdentityComparator)object;
                    try {
                        if (!this.G().equals(universalIdentityComparator.G())) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UniversalIdentityComparator.a(customSystemException);
                    }
                    map = universalIdentityComparator.k;
                    try {
                        if (this.k == map) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UniversalIdentityComparator.a(customSystemException);
                    }
                    try {
                        try {
                            if (this.k != null) break block21;
                            if (map != null) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UniversalIdentityComparator.a(customSystemException);
                        }
                        bl = true;
                        break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UniversalIdentityComparator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        try {
            if (map == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UniversalIdentityComparator.a(customSystemException);
        }
        return this.k.equals(map);
    }

    public UniversalIdentityComparator(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        this.K = bytecodeAnalyzer;
        this.r = n;
        this.k = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        stringBuilder.append(this.G());
        if (this.k != null) {
            stringBuilder.append('(');
            for (String string : this.k.keySet()) {
                stringBuilder.append(string).append('=').append(this.L(string)).append(", ");
            }
            stringBuilder.setLength(stringBuilder.length() - 2);
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }

    public String G() {
        return ReflectionMetadataResolver933.B(this.K.Z(this.r));
    }

    public int hashCode() {
        int n;
        int n2;
        try {
            n2 = this.G().hashCode();
            n = this.k == null ? 0 : this.k.hashCode();
        }
        catch (CustomSystemException customSystemException) {
            throw UniversalIdentityComparator.a(customSystemException);
        }
        return n2 + n;
    }

    public void A(int n, BaseResourceManager baseResourceManager) {
        SecurityTokenGenerator2675 securityTokenGenerator2675 = new SecurityTokenGenerator2675();
        securityTokenGenerator2675.C = n;
        securityTokenGenerator2675.X = baseResourceManager;
        this.p(securityTokenGenerator2675);
    }

    private void p(SecurityTokenGenerator2675 securityTokenGenerator2675) {
        String string = this.K.Z(securityTokenGenerator2675.C);
        try {
            if (this.k == null) {
                this.k = new LinkedHashMap<String, SecurityTokenGenerator2675>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UniversalIdentityComparator.a(customSystemException);
        }
        this.k.put(string, securityTokenGenerator2675);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public BaseResourceManager L(String string) {
        block4: {
            try {
                try {
                    if (this.k != null && this.k.get(string) != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw UniversalIdentityComparator.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw UniversalIdentityComparator.a(customSystemException);
            }
        }
        return this.k.get((Object)string).X;
    }
}

