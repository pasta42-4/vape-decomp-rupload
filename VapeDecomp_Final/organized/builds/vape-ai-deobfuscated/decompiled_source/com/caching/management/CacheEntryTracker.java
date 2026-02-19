/*
 * Decompiled with CFR 0.152.
 */
package com.caching.management;

import com.app.transformation.TransformationPipelineFilter;
import com.config.setup.ConfigurationInitializer2518;
import com.exception.system.CustomSystemException;
import com.ui.rendering.GraphicalRenderingController;
import java.util.HashSet;
import java.util.Set;

public class CacheEntryTracker
implements TransformationPipelineFilter {
    private Set<Integer> z = new HashSet<Integer>();
    private static int[] I;

    public CacheEntryTracker() {
        this.z.add(8);
        this.z.add(3);
        this.z.add(22);
        this.z.add(27);
        this.z.add(13);
        this.z.add(9);
    }

    public static int[] w() {
        return I;
    }

    @Override
    public boolean c(long l, long l2) {
        char c;
        char c2;
        block13: {
            block14: {
                c2 = (char)l;
                c = '\u0000';
                try {
                    block12: {
                        try {
                            try {
                                if (c2 == '\u00a7' || c2 < ' ') break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CacheEntryTracker.a(customSystemException);
                            }
                            if (c2 != '\u007f') break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheEntryTracker.a(customSystemException);
                        }
                    }
                    if (!this.z.contains(c2)) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw CacheEntryTracker.a(customSystemException);
                }
                c = c2;
            }
            try {
                if (c == '\u0000') {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CacheEntryTracker.a(customSystemException);
            }
        }
        try {
            ConfigurationInitializer2518.a(c2, c);
            if (!GraphicalRenderingController.K.P) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheEntryTracker.a(customSystemException);
        }
        return false;
    }

    public static void J(int[] nArray) {
        I = nArray;
    }

    static {
        if (CacheEntryTracker.w() != null) {
            CacheEntryTracker.J(new int[3]);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

