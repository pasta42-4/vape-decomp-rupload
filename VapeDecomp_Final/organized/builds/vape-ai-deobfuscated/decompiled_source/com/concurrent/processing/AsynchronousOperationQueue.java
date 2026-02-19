/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.processing;

import com.exception.system.CustomSystemException;
import com.media.core.MediaResourceController;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.concurrent.atomic.AtomicReference;

public class AsynchronousOperationQueue {
    private static String[] S;
    private final AtomicReference<MediaResourceController> N = new AtomicReference();

    public static void W(String[] stringArray) {
        S = stringArray;
    }

    public AsynchronousOperationQueue() {
        this.O();
    }

    static {
        if (AsynchronousOperationQueue.N() != null) {
            AsynchronousOperationQueue.W(new String[5]);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void P() {
        if (this.N.get() != null) {
            MediaResourceController mediaResourceController = this.N.get();
            try {
                this.N.set(null);
                if (!this.T()) {
                    mediaResourceController.z(this.L());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousOperationQueue.a(customSystemException);
            }
        }
    }

    private void lambda$startSoundThread$0() {
        while (!TemporalMetadataResolver.h.Q) {
            try {
                Thread.sleep(100L);
                this.P();
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
    }

    public float L() {
        return ((Double)TemporalMetadataResolver.h.F().M.J()).floatValue();
    }

    public boolean T() {
        return TemporalMetadataResolver.h.F().G.s();
    }

    public static String[] N() {
        return S;
    }

    public void m(MediaResourceController mediaResourceController) {
        this.N.set(mediaResourceController);
    }

    public void O() {
        new Thread(this::lambda$startSoundThread$0).start();
    }
}

