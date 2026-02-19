/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import a.z1;

class EventDispatcher2645 {
    static final int[] k = new int[z1.values().length];

    static {
        try {
            EventDispatcher2645.k[z1.LINES.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            EventDispatcher2645.k[z1.QUADS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            EventDispatcher2645.k[z1.TRIANGLES.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            EventDispatcher2645.k[z1.LINES_LOOP.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

