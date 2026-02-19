/*
 * Decompiled with CFR 0.152.
 */
package com.input.handling;

import com.media.processing.MultimediaStreamProcessor;
import com.network.protocol.NetworkProtocolResolver;

public abstract class InputProcessor {
    private static int[] C;
    private final MultimediaStreamProcessor E;
    private NetworkProtocolResolver J;

    public static int[] L() {
        return C;
    }

    public void I(NetworkProtocolResolver networkProtocolResolver) {
        this.J = networkProtocolResolver;
    }

    public MultimediaStreamProcessor c() {
        return this.E;
    }

    public boolean R() {
        return true;
    }

    static {
        if (InputProcessor.L() == null) {
            InputProcessor.b(new int[4]);
        }
    }

    public void S() {
    }

    public void f() {
    }

    public NetworkProtocolResolver n() {
        return this.J;
    }

    public static void b(int[] nArray) {
        C = nArray;
    }

    public void t() {
    }

    public InputProcessor(MultimediaStreamProcessor multimediaStreamProcessor) {
        this.E = multimediaStreamProcessor;
    }

    public abstract boolean Y();
}

