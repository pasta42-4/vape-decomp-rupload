/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 */
package com.data.processing;

import a.ZB;
import com.app.concurrent.ThreadSafeIntegerQueue;
import com.app.logging.LoggingInterceptor2692;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.runtime.context.DynamicContextBroker;
import com.security.protocol.EncryptionProtocolHandler397;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import java.util.ArrayList;
import java.util.List;

public abstract class CollectionFilterProcessor {
    private static AbstractComputationKernel[] b;
    private final List<Integer> O = new ThreadSafeIntegerQueue(this);
    private final List<LoggingInterceptor2692> v = new ArrayList<LoggingInterceptor2692>();

    public static void F(AbstractComputationKernel[] abstractComputationKernelArray) {
        b = abstractComputationKernelArray;
    }

    public abstract void G();

    public abstract String D();

    public boolean E() {
        boolean bl;
        try {
            bl = !this.Z().isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw CollectionFilterProcessor.b(customSystemException);
        }
        boolean bl2 = bl;
        for (Integer n : this.Z()) {
            if (n != 0) continue;
            bl2 = false;
            break;
        }
        return bl2;
    }

    public boolean d(int n) {
        block21: {
            block20: {
                try {
                    if (this.Z().isEmpty()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CollectionFilterProcessor.b(customSystemException);
                }
                try {
                    try {
                        if (this.Z().size() != 1) break block20;
                        if (!this.Z().contains(n)) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CollectionFilterProcessor.b(customSystemException);
                    }
                    this.e();
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw CollectionFilterProcessor.b(customSystemException);
                }
            }
            int n2 = 0;
            for (int n3 : this.Z()) {
                block22: {
                    try {
                        if (n3 == n) {
                            ++n2;
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CollectionFilterProcessor.b(customSystemException);
                    }
                    try {
                        try {
                            if (n3 >= 0) break block22;
                            if (!SystemDiagnosticAnalyzer.A(100 + n3)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CollectionFilterProcessor.b(customSystemException);
                        }
                        ++n2;
                        continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CollectionFilterProcessor.b(customSystemException);
                    }
                }
                try {
                    if (!DynamicInvocationResolver1041.F(n3)) continue;
                    ++n2;
                }
                catch (CustomSystemException customSystemException) {
                    throw CollectionFilterProcessor.b(customSystemException);
                }
            }
            try {
                if (n2 == this.Z().size()) {
                    this.e();
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CollectionFilterProcessor.b(customSystemException);
            }
        }
        return false;
    }

    static {
        if (CollectionFilterProcessor.i() == null) {
            CollectionFilterProcessor.F(new AbstractComputationKernel[2]);
        }
    }

    public List<Integer> Z() {
        return this.O;
    }

    public String t() {
        return ZB.C(this.Z());
    }

    public static AbstractComputationKernel[] i() {
        return b;
    }

    public JsonArray w() {
        JsonArray jsonArray = new JsonArray();
        for (Integer n : this.Z()) {
            jsonArray.add(new Gson().toJsonTree((Object)n));
        }
        return jsonArray;
    }

    public abstract boolean v();

    public void C(LoggingInterceptor2692 loggingInterceptor2692) {
        this.v.add(loggingInterceptor2692);
    }

    public boolean Y() {
        return true;
    }

    public void E(List<Integer> list) {
        this.Z().clear();
        for (Integer n : list) {
            try {
                if (n == 27) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CollectionFilterProcessor.b(customSystemException);
            }
            this.Z().add(n);
        }
    }

    private void e() {
        this.G();
        for (LoggingInterceptor2692 loggingInterceptor2692 : this.v) {
            loggingInterceptor2692.g();
        }
    }

    public boolean B() {
        boolean bl;
        try {
            if (this.Z().isEmpty()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CollectionFilterProcessor.b(customSystemException);
        }
        try {
            if (this.Z().size() == 1) {
                return DynamicContextBroker.L(this.Z().get(0));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CollectionFilterProcessor.b(customSystemException);
        }
        int n = 0;
        for (int n2 : this.Z()) {
            try {
                if (!DynamicContextBroker.L(n2)) continue;
                ++n;
            }
            catch (CustomSystemException customSystemException) {
                throw CollectionFilterProcessor.b(customSystemException);
            }
        }
        try {
            bl = n == this.Z().size();
        }
        catch (CustomSystemException customSystemException) {
            throw CollectionFilterProcessor.b(customSystemException);
        }
        return bl;
    }

    public void q(JsonArray jsonArray, boolean bl) {
        List<Integer> list = EncryptionProtocolHandler397.V(jsonArray, bl);
        if (!list.isEmpty()) {
            this.Z().clear();
            for (int n : list) {
                this.Z().add(n);
            }
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

