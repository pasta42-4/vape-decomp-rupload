/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.system.error.ErrorResilienceProtocol;

class Nc {
    static final int[] u = new int[ErrorResilienceProtocol.values().length];

    static {
        try {
            Nc.u[ErrorResilienceProtocol.EQUALS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[ErrorResilienceProtocol.NOT_EQUAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[ErrorResilienceProtocol.GREATER_THAN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[ErrorResilienceProtocol.GREATHER_THAN_OR_EQUAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[ErrorResilienceProtocol.LESS_THAN.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[ErrorResilienceProtocol.LESS_THAN_OR_EQUAL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

