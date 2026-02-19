/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.BP;
import a.O_;
import a.eD;
import java.util.Queue;

public class N0 {
    private static String[] x;
    private final int s;
    private final int Q;
    private final BP F;

    static {
        if (N0.j() != null) {
            N0.G(new String[2]);
        }
    }

    public N0(BP bP2, int n2, int n3) {
        this.F = bP2;
        this.s = n2;
        this.Q = n3;
    }

    public static void k(int n2, int n3, int n4, Queue<eD> queue) {
        new N0(BP.CLICK, n2, n3).T(n4, queue);
    }

    public static void W(int n2, int n3, int n4, Queue<eD> queue) {
        new N0(BP.SWAP, n2, n3).T(n4, queue);
    }

    public static void U(int n2, int n3, int n4, Queue<eD> queue) {
        new N0(BP.MOVE, n2, n3).T(n4, queue);
    }

    public static String[] j() {
        return x;
    }

    public static void e(int n2, Queue<eD> queue) {
        new N0(BP.DROP_MOUSE_STACK, 0, 0).T(n2, queue);
    }

    public void T(int n2, Queue<eD> queue) {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                try {
                                    if (this.F != BP.MOVE) break block13;
                                    queue.add(new eD(n2, this.s, 0, 0));
                                    queue.add(new eD(n2, this.Q, 0, 0));
                                    break block14;
                                }
                                catch (O_ o_2) {
                                    throw N0.a(o_2);
                                }
                            }
                            try {
                                if (this.F != BP.SHIFTCLICK) break block15;
                                queue.add(new eD(n2, this.s, 0, 1));
                                break block14;
                            }
                            catch (O_ o_3) {
                                throw N0.a(o_3);
                            }
                        }
                        try {
                            if (this.F != BP.SWAP) break block16;
                            queue.add(new eD(n2, this.s, 0, 0));
                            queue.add(new eD(n2, this.Q, 0, 0));
                            queue.add(new eD(n2, this.s, 0, 0));
                            break block14;
                        }
                        catch (O_ o_4) {
                            throw N0.a(o_4);
                        }
                    }
                    try {
                        if (this.F != BP.CLICK) break block17;
                        queue.add(new eD(n2, this.s, 0, 0));
                        break block14;
                    }
                    catch (O_ o_5) {
                        throw N0.a(o_5);
                    }
                }
                try {
                    if (this.F != BP.DROP_SLOT) break block18;
                    queue.add(new eD(n2, this.s, 1, 4));
                    break block14;
                }
                catch (O_ o_6) {
                    throw N0.a(o_6);
                }
            }
            try {
                if (this.F == BP.DROP_MOUSE_STACK) {
                    queue.add(new eD(n2, -999, 0, 0));
                }
            }
            catch (O_ o_7) {
                throw N0.a(o_7);
            }
        }
    }

    public static void G(String[] stringArray) {
        x = stringArray;
    }

    public static void M(int n2, int n3, Queue<eD> queue) {
        new N0(BP.SHIFTCLICK, n2, 0).T(n3, queue);
    }

    public static void X(int n2, int n3, Queue<eD> queue) {
        new N0(BP.DROP_SLOT, n2, 0).T(n3, queue);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

