/*
 * Decompiled with CFR 0.152.
 */
package com.data.collection;

import a.HK;
import com.app.security.CredentialSecurityProcessor;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.ArrayList;

public class MultiListDataAggregator {
    private static int u;
    private static int K;
    private static ArrayList<ClassMetadataResolver> V;
    private static int w;
    private static ArrayList<ClassMetadataResolver> z;
    private static int n;
    private static ArrayList<CredentialSecurityProcessor> e;
    private static AbstractComputationKernel[] H;
    private static int L;

    public static void p() {
        ++w;
    }

    public static void l() {
    }

    static {
        K = 0;
        MultiListDataAggregator.X(null);
        L = 0;
        w = 0;
        u = 0;
        n = 0;
        e = new ArrayList();
        z = new ArrayList();
        V = new ArrayList();
    }

    public static void J(HK hK) {
        try {
            if (!TemporalMetadataResolver.h.J()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiListDataAggregator.a(customSystemException);
        }
        ClassMetadataResolver classMetadataResolver = new ClassMetadataResolver(hK.r(), hK.C(), hK.n(), hK.I(), hK.J(), hK.v(), hK.R(), hK.S(), hK.E());
        V.add(classMetadataResolver);
        ++u;
    }

    public static void A() {
        e.clear();
        K = 0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void k() {
        L = 0;
        w = 0;
        u = 0;
        n = 0;
    }

    public static void X(AbstractComputationKernel[] abstractComputationKernelArray) {
        H = abstractComputationKernelArray;
    }

    public static AbstractComputationKernel[] f() {
        return H;
    }

    public static void g() {
    }

    public static void M() {
        ++n;
    }

    public static void w(ReflectionUtilityService reflectionUtilityService) {
        try {
            if (!TemporalMetadataResolver.h.J()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiListDataAggregator.a(customSystemException);
        }
        ClassMetadataResolver classMetadataResolver = new ClassMetadataResolver(reflectionUtilityService.R(), reflectionUtilityService.J(), reflectionUtilityService.i(), reflectionUtilityService.p(), null, reflectionUtilityService.v(), reflectionUtilityService.h(), null, reflectionUtilityService.z());
        z.add(classMetadataResolver);
        ++L;
    }

    public static void H(String string, String string2) {
        e.add(new CredentialSecurityProcessor(string, string2));
    }

    public static void G() {
        ++K;
    }
}

