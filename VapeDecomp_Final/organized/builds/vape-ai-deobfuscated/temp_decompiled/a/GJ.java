/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GX;
import java.io.PrintStream;
import java.util.Date;

public class Gj
implements GX {
    public static PrintStream u = System.out;

    @Override
    public void s(Throwable throwable) {
        u.println(new Date() + " ERROR:" + throwable.getMessage());
        throwable.printStackTrace(u);
    }
}

