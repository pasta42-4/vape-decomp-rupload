/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.jE;

public class ja
extends jE<String, ja> {
    private String y;

    public ja X() {
        return ja.F(null, this.E(), (String)this.J());
    }

    public ja(Object object, String string, String string2) {
        super(object, string, string2);
    }

    @Override
    public void i(String string) {
        this.H(string);
    }

    public String toString() {
        return (String)this.J();
    }

    public static ja F(Object object, String string, String string2) {
        ja ja2 = new ja(object, string, string2);
        ja2.Y(string);
        return ja2;
    }

    private void Y(String string) {
        this.y = string;
    }

    public String E() {
        return this.y;
    }
}

