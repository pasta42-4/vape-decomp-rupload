/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.data.organization;

import com.data.transformation.DataTransformationProtocol1874;
import com.exception.system.CustomSystemException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public abstract class StringCollectionOrganizer
implements DataTransformationProtocol1874 {
    @Nullable
    private Comparator<String> h = StringCollectionOrganizer::lambda$new$0;
    private static int[] x;
    private boolean v = false;
    private List<String> d;

    @Override
    public @UnmodifiableView List<String> U() {
        return this.d;
    }

    public static void O(int[] nArray) {
        x = nArray;
    }

    private List<String> D(String string) {
        ArrayList<String> arrayList;
        block15: {
            arrayList = new ArrayList<String>();
            try {
                try {
                    if (this.e() || !string.isEmpty()) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw StringCollectionOrganizer.b(customSystemException);
                }
                return arrayList;
            }
            catch (CustomSystemException customSystemException) {
                throw StringCollectionOrganizer.b(customSystemException);
            }
        }
        List<String> list = this.m();
        String string2 = string.toLowerCase();
        if (list != null) {
            for (String string3 : list) {
                try {
                    block16: {
                        try {
                            try {
                                if (this.e() && string2.isEmpty()) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StringCollectionOrganizer.b(customSystemException);
                            }
                            if (!string3.toLowerCase().startsWith(string2)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StringCollectionOrganizer.b(customSystemException);
                        }
                    }
                    arrayList.add(string3);
                }
                catch (CustomSystemException customSystemException) {
                    throw StringCollectionOrganizer.b(customSystemException);
                }
            }
        }
        Comparator<String> comparator = this.h;
        try {
            if (comparator != null) {
                arrayList.sort(comparator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StringCollectionOrganizer.b(customSystemException);
        }
        return arrayList;
    }

    @Override
    public void R(String string) {
        this.d = this.D(string);
    }

    public StringCollectionOrganizer() {
        this.R("");
    }

    @Override
    public void b(@Nullable Comparator<String> comparator) {
        this.h = comparator;
    }

    @Override
    public boolean e() {
        return this.v;
    }

    @Override
    @Nullable
    public Comparator<String> C() {
        return this.h;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (StringCollectionOrganizer.D() != null) {
            StringCollectionOrganizer.O(new int[3]);
        }
    }

    public static int[] D() {
        return x;
    }

    @Override
    public void I(boolean bl) {
        this.v = bl;
    }

    private static int lambda$new$0(String string, String string2) {
        return string.compareToIgnoreCase(string2);
    }
}

