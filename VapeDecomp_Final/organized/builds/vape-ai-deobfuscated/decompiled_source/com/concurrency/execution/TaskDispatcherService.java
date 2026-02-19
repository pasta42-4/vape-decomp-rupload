/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package com.concurrency.execution;

import com.exception.system.CustomSystemException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

public class TaskDispatcherService
implements Executor {
    private Thread x;
    private static int[] v;
    private final Queue<Runnable> T = new ArrayDeque<Runnable>();
    private Runnable e;

    @Override
    public synchronized void execute(@NotNull Runnable runnable) {
        block4: {
            try {
                try {
                    if (this.x == null || !Thread.currentThread().equals(this.x)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw TaskDispatcherService.a(customSystemException);
                }
                runnable.run();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw TaskDispatcherService.a(customSystemException);
            }
        }
        this.T.offer(runnable);
    }

    public static void O(int[] nArray) {
        v = nArray;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public synchronized void z() {
        try {
            if (this.x == null) {
                this.x = Thread.currentThread();
            }
        }
        catch (Throwable throwable) {
            throw TaskDispatcherService.a(throwable);
        }
        while ((this.e = this.T.poll()) != null) {
            try {
                this.e.run();
            }
            catch (Throwable throwable) {}
        }
    }

    static {
        if (TaskDispatcherService.P() == null) {
            TaskDispatcherService.O(new int[1]);
        }
    }

    public static int[] P() {
        return v;
    }

    public Thread R() {
        return this.x;
    }
}

