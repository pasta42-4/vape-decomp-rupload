/*
 * Decompiled with CFR 0.152.
 */
package com.app.task.management;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.logging.event.LoggingEventDispatcher;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionProcessor;
import com.graphics.rendering.PixelCoordinateCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.ConnectionNegotiationHandler;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;

public class TaskDispatchQueue {
    public static final Queue<PixelCoordinateCalculator> b = new LinkedList<PixelCoordinateCalculator>();

    private static long z(int n, int n2, int n3) {
        return ((long)n & 0x1FFFFFL) << 43 | ((long)n3 & 0x1FFFFFL) << 22 | (long)n2 & 0xFFFL;
    }

    public static PixelCoordinateCalculator S(int n, int n2, int n3, int n4, int n5) {
        PixelCoordinateCalculator pixelCoordinateCalculator = b.poll();
        if (pixelCoordinateCalculator == null) {
            pixelCoordinateCalculator = new PixelCoordinateCalculator(n, n2, n3, n4, n5);
        } else {
            pixelCoordinateCalculator.O(n, n2, n3, n4, n5);
        }
        return pixelCoordinateCalculator;
    }

    private static boolean n(int n, int n2, int n3, Set<Long> set) {
        int[][] nArrayArray;
        for (int[] nArray : nArrayArray = new int[][]{{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}}) {
            int n4 = n + nArray[0];
            int n5 = n2 + nArray[1];
            int n6 = n3 + nArray[2];
            long l = TaskDispatchQueue.z(n4, n5, n6);
            try {
                if (!set.contains(l)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw TaskDispatchQueue.a(customSystemException);
            }
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int[] w(long l) {
        int n = (int)(l >> 43 & 0x1FFFFFL);
        int n2 = (int)(l >> 22 & 0x1FFFFFL);
        int n3 = (int)(l & 0xFFFL);
        return new int[]{n, n3, n2};
    }

    private static void O(char[] cArray, int n, int n2, int n3, Set<Long> set) {
        for (int i = 0; i < cArray.length; ++i) {
            block7: {
                char c = cArray[i];
                int n4 = c >> 4;
                try {
                    try {
                        try {
                            if (n4 == 0 || n4 == 8) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TaskDispatchQueue.a(customSystemException);
                        }
                        if (n4 == 9) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TaskDispatchQueue.a(customSystemException);
                    }
                    if (n4 != 30) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw TaskDispatchQueue.a(customSystemException);
                }
            }
            int n5 = i % 16;
            int n6 = i / 256 + n2;
            int n7 = i / 16 % 16;
            int n8 = (n << 4) + n5;
            int n9 = n6;
            int n10 = (n3 << 4) + n7;
            long l = TaskDispatchQueue.z(n8, n9, n10);
            set.add(l);
        }
    }

    private static void I(char[] cArray, int n, int n2, int n3, ConcurrentFilteringCoordinator[] concurrentFilteringCoordinatorArray, ArrayList<PixelCoordinateCalculator> arrayList, Set<Long> set, boolean bl) {
        for (int i = 0; i < cArray.length; ++i) {
            int n4;
            char c = cArray[i];
            int n5 = c >> 4;
            try {
                if (n5 == 0) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TaskDispatchQueue.a(customSystemException);
            }
            int n6 = c & 0xF;
            boolean bl2 = false;
            for (n4 = 0; n4 < concurrentFilteringCoordinatorArray.length; ++n4) {
                ConcurrentFilteringCoordinator concurrentFilteringCoordinator;
                block19: {
                    block20: {
                        concurrentFilteringCoordinator = concurrentFilteringCoordinatorArray[n4];
                        try {
                            try {
                                if (concurrentFilteringCoordinator.Q() != n5) break block19;
                                if (concurrentFilteringCoordinator.z() == -1) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TaskDispatchQueue.a(customSystemException);
                            }
                            if (concurrentFilteringCoordinator.z() != n6) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TaskDispatchQueue.a(customSystemException);
                        }
                    }
                    bl2 = true;
                    break;
                }
                Predicate<Character> predicate = concurrentFilteringCoordinator.o();
                try {
                    if (predicate == null || !predicate.test(Character.valueOf(c))) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw TaskDispatchQueue.a(customSystemException);
                }
                bl2 = true;
                break;
            }
            try {
                if (!bl2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TaskDispatchQueue.a(customSystemException);
            }
            n4 = i % 16;
            int n7 = i / 256 + n2;
            int n8 = i / 16 % 16;
            int n9 = (n << 4) + n4;
            int n10 = n7;
            int n11 = (n3 << 4) + n8;
            try {
                try {
                    if (bl && !TaskDispatchQueue.n(n9, n10, n11, set)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TaskDispatchQueue.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TaskDispatchQueue.a(customSystemException);
            }
            PixelCoordinateCalculator pixelCoordinateCalculator = TaskDispatchQueue.S(n5, n6, n9, n10, n11);
            arrayList.add(pixelCoordinateCalculator);
        }
    }

    public static void L(PixelCoordinateCalculator pixelCoordinateCalculator) {
        b.offer(pixelCoordinateCalculator);
    }

    public static ArrayList<PixelCoordinateCalculator> j(List<ConcurrentFilteringCoordinator> list, int n, boolean bl) {
        int n2;
        int n3;
        ArrayList<PixelCoordinateCalculator> arrayList = new ArrayList<PixelCoordinateCalculator>();
        HashSet<Long> hashSet = new HashSet<Long>();
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        LoggingEventDispatcher loggingEventDispatcher = connectionConfigurationResolver.G();
        List<TransactionProcessor> list2 = loggingEventDispatcher.l();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d2 = systemConfigurationOrchestrator.F();
        double d3 = systemConfigurationOrchestrator.V();
        double d4 = systemConfigurationOrchestrator.B();
        if (bl) {
            for (TransactionProcessor object3 : list2) {
                List<ConnectionNegotiationHandler> list3 = object3.O();
                for (Object object : list3) {
                    if (object == null || ((ObjectLifecycleTracker)object).Y()) continue;
                    try {
                        if (((ConnectionNegotiationHandler)object).v() == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TaskDispatchQueue.a(customSystemException);
                    }
                    int n4 = ((ConnectionNegotiationHandler)object).o();
                    char[] cArray = ((ConnectionNegotiationHandler)object).v();
                    int n5 = object3.c();
                    n3 = object3.Q();
                    n2 = (int)AdaptiveComputationEngine.T(d2, 0.0, d4, n5 << 4, 0.0, n3 << 4);
                    try {
                        if (n2 > n) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TaskDispatchQueue.a(customSystemException);
                    }
                    TaskDispatchQueue.O(cArray, n5, n4, n3, hashSet);
                }
            }
        }
        ConcurrentFilteringCoordinator[] concurrentFilteringCoordinatorArray = list.toArray(new ConcurrentFilteringCoordinator[0]);
        for (TransactionProcessor transactionProcessor : list2) {
            Object object;
            List<ConnectionNegotiationHandler> list4 = transactionProcessor.O();
            object = list4.iterator();
            while (object.hasNext()) {
                ConnectionNegotiationHandler connectionNegotiationHandler = (ConnectionNegotiationHandler)object.next();
                if (connectionNegotiationHandler == null || connectionNegotiationHandler.Y()) continue;
                try {
                    if (connectionNegotiationHandler.v() == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TaskDispatchQueue.a(customSystemException);
                }
                int n6 = connectionNegotiationHandler.o();
                char[] cArray = connectionNegotiationHandler.v();
                n3 = transactionProcessor.c();
                n2 = transactionProcessor.Q();
                int n7 = (int)AdaptiveComputationEngine.T(d2, 0.0, d4, (n3 << 4) + 8, 0.0, (n2 << 4) + 8);
                try {
                    if (n7 > n) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TaskDispatchQueue.a(customSystemException);
                }
                TaskDispatchQueue.I(cArray, n3, n6, n2, concurrentFilteringCoordinatorArray, arrayList, hashSet, bl);
            }
        }
        return arrayList;
    }
}

