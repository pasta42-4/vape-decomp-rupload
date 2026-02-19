/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import a.vC;

class SystemConfigurationManager2500 {
    static final int[] B = new int[vC.values().length];

    static {
        try {
            SystemConfigurationManager2500.B[vC.ABGR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.RGBA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.BGRA.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.RGB.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.LUMINANCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.ALPHA.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.WHITE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SystemConfigurationManager2500.B[vC.LUMINANCE_ALPHA.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

