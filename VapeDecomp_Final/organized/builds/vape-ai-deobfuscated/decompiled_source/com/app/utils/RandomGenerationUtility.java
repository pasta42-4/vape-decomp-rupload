/*
 * Decompiled with CFR 0.152.
 */
package com.app.utils;

import com.exception.system.CustomSystemException;
import com.util.numeric.NumericFormattingUtility;
import java.util.Random;

public class RandomGenerationUtility {
    private static final Random c = new Random();

    public static int S(int n, int n2) {
        int n3;
        int n4 = n2 - n;
        try {
            n3 = n4 <= 0 ? n : c.nextInt(n4) + n + 1;
        }
        catch (CustomSystemException customSystemException) {
            throw RandomGenerationUtility.a(customSystemException);
        }
        return n3;
    }

    public static int H(NumericFormattingUtility numericFormattingUtility) {
        return RandomGenerationUtility.S(numericFormattingUtility.s(), numericFormattingUtility.c());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

