/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection;

import com.concurrency.management.ThreadSynchronizationCoordinator;
import com.deobfuscation.reflection.WildcardTypeResolver;
import com.exception.system.CustomSystemException;
import com.security.permissions.UserPermissionResolver;

public class ReflectionMetadataContainer
extends UserPermissionResolver {
    public static ReflectionMetadataContainer z = new ReflectionMetadataContainer("java.lang.Object", null);
    String V;
    WildcardTypeResolver[] r;

    @Override
    public String y() {
        StringBuilder stringBuilder = new StringBuilder();
        ReflectionMetadataContainer reflectionMetadataContainer = this.A();
        try {
            if (reflectionMetadataContainer != null) {
                stringBuilder.append(reflectionMetadataContainer.y()).append('$');
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionMetadataContainer.a(customSystemException);
        }
        return this.q(stringBuilder);
    }

    public ReflectionMetadataContainer A() {
        return null;
    }

    ReflectionMetadataContainer(String string, int n, int n2, WildcardTypeResolver[] wildcardTypeResolverArray) {
        this.V = string.substring(n, n2).replace('/', '.');
        this.r = wildcardTypeResolverArray;
    }

    static ReflectionMetadataContainer z(String string, int n, int n2, WildcardTypeResolver[] wildcardTypeResolverArray, ReflectionMetadataContainer reflectionMetadataContainer) {
        try {
            if (reflectionMetadataContainer == null) {
                return new ReflectionMetadataContainer(string, n, n2, wildcardTypeResolverArray);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionMetadataContainer.a(customSystemException);
        }
        return new ThreadSynchronizationCoordinator(string, n, n2, wildcardTypeResolverArray, reflectionMetadataContainer);
    }

    private String q(StringBuilder stringBuilder) {
        stringBuilder.append(this.V);
        if (this.r != null) {
            stringBuilder.append('<');
            int n = this.r.length;
            int n2 = 0;
            while (true) {
                block6: {
                    try {
                        try {
                            if (n2 >= n) break;
                            if (n2 <= 0) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionMetadataContainer.a(customSystemException);
                        }
                        stringBuilder.append(", ");
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionMetadataContainer.a(customSystemException);
                    }
                }
                stringBuilder.append(this.r[n2].toString());
                ++n2;
            }
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ReflectionMetadataContainer reflectionMetadataContainer = this.A();
        try {
            if (reflectionMetadataContainer != null) {
                stringBuilder.append(reflectionMetadataContainer.toString()).append('.');
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionMetadataContainer.a(customSystemException);
        }
        return this.q(stringBuilder);
    }

    public ReflectionMetadataContainer(String string, WildcardTypeResolver[] wildcardTypeResolverArray) {
        this.V = string;
        this.r = wildcardTypeResolverArray;
    }
}

