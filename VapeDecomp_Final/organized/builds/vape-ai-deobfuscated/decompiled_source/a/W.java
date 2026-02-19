/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.element.management.ElementConflictManager;

public interface W {
    public static final ElementConflictManager w;
    public static final ElementConflictManager Z;
    public static final ElementConflictManager C;
    public static final ElementConflictManager q;
    public static final ElementConflictManager n;

    static {
        C = new ElementConflictManager("*top*", 0, ' ');
        n = new ElementConflictManager("int", 1, 'I');
        q = new ElementConflictManager("float", 2, 'F');
        w = new ElementConflictManager("double", 3, 'D');
        Z = new ElementConflictManager("long", 4, 'J');
    }
}

