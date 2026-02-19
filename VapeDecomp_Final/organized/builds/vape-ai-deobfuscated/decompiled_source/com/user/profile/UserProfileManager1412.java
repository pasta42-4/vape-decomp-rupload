/*
 * Decompiled with CFR 0.152.
 */
package com.user.profile;

import com.reflection.registry.MetaclassDefinitionRegistry;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UserProfileManager1412
extends MetaclassDefinitionRegistry {
    private int D;
    private char E;
    private String n;
    private String v;
    private String o;
    private int O;
    private int p;

    UserProfileManager1412(String string, char c, String string2, String string3, String string4, int n, int n2, int n3) {
        super(string);
        this.E = c;
        this.v = string2;
        this.o = string3;
        this.n = string4;
        this.p = n;
        this.O = n2;
        this.D = n3;
    }

    public String S() {
        return this.o;
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public int a() {
        return 17;
    }

    public String C() {
        return this.v;
    }

    public String t() {
        return this.n;
    }

    public int m() {
        return this.D;
    }

    public char y() {
        return this.E;
    }

    public int G() {
        return this.p;
    }
}

