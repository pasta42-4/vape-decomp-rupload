/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Jt;

class Nc {
    static final int[] u = new int[Jt.values().length];

    static {
        try {
            Nc.u[Jt.EQUALS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[Jt.NOT_EQUAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[Jt.GREATER_THAN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[Jt.GREATHER_THAN_OR_EQUAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[Jt.LESS_THAN.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Nc.u[Jt.LESS_THAN_OR_EQUAL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

