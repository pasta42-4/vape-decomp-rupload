/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.scheduling;

import a._Y;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.TransformationEngine1757;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.numeric.precision.NumericPrecisionTransformer;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.Arrays;
import java.util.List;

public class AsynchronousTaskScheduler1070
implements Runnable {
    private final NumericPrecisionTransformer s;
    private final int[][] a = new int[][]{{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}};
    private final List<ConcurrentFilteringCoordinator> y;
    private final List<TransformationEngine1757> e;
    private boolean r;
    private final List<Integer> E = Arrays.asList(0, 8, 9, 30);
    private boolean U;

    public AsynchronousTaskScheduler1070(List<TransformationEngine1757> list, List<ConcurrentFilteringCoordinator> list2, NumericPrecisionTransformer numericPrecisionTransformer) {
        this.e = list;
        this.y = list2;
        this.s = numericPrecisionTransformer;
    }

    public void M() {
        this.U = true;
        new Thread(this).start();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean K(int n, int n2, int n3) {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        for (int[] nArray : this.a) {
            TransactionCorrelationEngine transactionCorrelationEngine = connectionConfigurationResolver.N(n + nArray[0], n2 + nArray[1], n3 + nArray[2]);
            int n4 = TransactionCorrelationEngine.h(transactionCorrelationEngine);
            try {
                if (!this.E.contains(n4)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler1070.a(customSystemException);
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block41: {
            try {
                block36: while (true) {
                    block42: {
                        try {
                            if (!this.U) break block41;
                            Thread.sleep(50L);
                            break block42;
                        }
                        catch (CustomSystemException v0) {
                            throw AsynchronousTaskScheduler1070.a(v0);
                        }
                        {
                            catch (InterruptedException var1_2) {
                                // empty catch block
                            }
                        }
                    }
                    if (ApplicationLifecycleManager.c().Y()) continue;
                    try {
                        if (ApplicationLifecycleManager.U().Y()) {
                            continue;
                        }
                    }
                    catch (InterruptedException v1) {
                        throw AsynchronousTaskScheduler1070.a(v1);
                    }
                    var1_1 = ApplicationLifecycleManager.U();
                    var2_4 = ApplicationLifecycleManager.c();
                    var3_5 = ((Double)this.s.J()).intValue();
                    this.K(0, 0, 0);
                    var4_6 = -var3_5;
                    while (true) {
                        if (var4_6 >= var3_5) continue block36;
                        block38: for (var5_7 = -var3_5; var5_7 < var3_5; ++var5_7) {
                            var6_8 = -var3_5;
                            while (true) {
                                block46: {
                                    block50: {
                                        block51: {
                                            block45: {
                                                block44: {
                                                    block48: {
                                                        block47: {
                                                            block43: {
                                                                if (var6_8 >= var3_5) continue block38;
                                                                try {
                                                                    if (this.U) break block43;
                                                                    break block41;
                                                                    catch (InterruptedException v2) {
                                                                        throw AsynchronousTaskScheduler1070.a(v2);
                                                                    }
                                                                }
                                                                catch (InterruptedException v3) {
                                                                    throw AsynchronousTaskScheduler1070.a(v3);
                                                                }
                                                            }
                                                            if (ApplicationLifecycleManager.c().Y()) ** GOTO lbl60
                                                            if (!ApplicationLifecycleManager.c().equals(var2_4)) ** GOTO lbl60
                                                            break block47;
                                                            catch (InterruptedException v4) {
                                                                throw AsynchronousTaskScheduler1070.a(v4);
                                                            }
                                                        }
                                                        if (ApplicationLifecycleManager.U().Y()) ** GOTO lbl60
                                                        break block48;
                                                        catch (InterruptedException v5) {
                                                            throw AsynchronousTaskScheduler1070.a(v5);
                                                        }
                                                    }
                                                    try {
                                                        block49: {
                                                            if (ApplicationLifecycleManager.U().equals(var1_1)) break block44;
                                                            break block49;
                                                            catch (InterruptedException v6) {
                                                                throw AsynchronousTaskScheduler1070.a(v6);
                                                            }
                                                        }
                                                        this.e.clear();
                                                        continue block36;
                                                    }
                                                    catch (InterruptedException v7) {
                                                        throw AsynchronousTaskScheduler1070.a(v7);
                                                    }
                                                }
                                                var7_9 = (int)var1_1.F() + var4_6;
                                                var8_10 = (int)var1_1.V() + var6_8;
                                                var9_11 = (int)var1_1.B() + var5_7;
                                                var10_12 = var2_4.N(var7_9, var8_10, var9_11);
                                                try {
                                                    if (var10_12.s() != null) break block45;
                                                    break block46;
                                                }
                                                catch (InterruptedException v8) {
                                                    throw AsynchronousTaskScheduler1070.a(v8);
                                                }
                                            }
                                            var11_13 = TransactionCorrelationEngine.h(var10_12);
                                            try {
                                                v9 = GeometryCalculator.C() >= 35 ? -1 : var10_12.J(var7_9, var8_10, var9_11);
                                            }
                                            catch (InterruptedException v10) {
                                                throw AsynchronousTaskScheduler1070.a(v10);
                                            }
                                            var12_14 = v9;
                                            var13_15 = this.p(var7_9, var8_10, var9_11);
                                            try {
                                                v11 = var14_16 = var13_15 != null;
                                            }
                                            catch (InterruptedException v12) {
                                                throw AsynchronousTaskScheduler1070.a(v12);
                                            }
                                            if (var14_16) break block50;
                                            var15_17 = this.H(var11_13, var12_14);
                                            if (var15_17 == null) break block46;
                                            if (!this.r) ** GOTO lbl102
                                            break block51;
                                            catch (InterruptedException v13) {
                                                throw AsynchronousTaskScheduler1070.a(v13);
                                            }
                                        }
                                        try {
                                            block52: {
                                                if (!this.K(var7_9, var8_10, var9_11)) break block46;
                                                break block52;
                                                catch (InterruptedException v14) {
                                                    throw AsynchronousTaskScheduler1070.a(v14);
                                                }
                                            }
                                            this.e.add(new TransformationEngine1757(var7_9, var8_10, var9_11, var11_13, var15_17, var15_17.K(), 0));
                                            break block46;
                                        }
                                        catch (InterruptedException v15) {
                                            throw AsynchronousTaskScheduler1070.a(v15);
                                        }
                                    }
                                    if (var11_13 != var13_15.x) ** GOTO lbl116
                                    try {
                                        block53: {
                                            if (!(_Y.m(var1_1, var7_9, var8_10, var9_11) > 200.0)) break block46;
                                            break block53;
                                            catch (InterruptedException v16) {
                                                throw AsynchronousTaskScheduler1070.a(v16);
                                            }
                                        }
                                        this.e.remove(var13_15);
                                    }
                                    catch (InterruptedException v17) {
                                        throw AsynchronousTaskScheduler1070.a(v17);
                                    }
                                }
                                ++var6_8;
                            }
                        }
                        ++var4_6;
                    }
                    break;
                }
            }
            catch (Exception var1_3) {
                TemporalMetadataResolver.W(var1_3);
            }
        }
    }

    public void w() {
        this.U = false;
    }

    public TransformationEngine1757 p(int n, int n2, int n3) {
        for (TransformationEngine1757 transformationEngine1757 : this.e) {
            try {
                try {
                    try {
                        if (transformationEngine1757.N != n || transformationEngine1757.n != n2) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskScheduler1070.a(customSystemException);
                    }
                    if (transformationEngine1757.D != n3) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler1070.a(customSystemException);
                }
                return transformationEngine1757;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler1070.a(customSystemException);
            }
        }
        return null;
    }

    public NumericPrecisionTransformer Y() {
        return this.s;
    }

    public void n(boolean bl) {
        this.r = bl;
    }

    public boolean p() {
        return this.U;
    }

    public boolean W() {
        return this.r;
    }

    public List<TransformationEngine1757> Z() {
        return this.e;
    }

    public ConcurrentFilteringCoordinator H(int n, int n2) {
        for (ConcurrentFilteringCoordinator concurrentFilteringCoordinator : this.y) {
            try {
                if (!concurrentFilteringCoordinator.r(n, n2)) continue;
                return concurrentFilteringCoordinator;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler1070.a(customSystemException);
            }
        }
        return null;
    }
}

