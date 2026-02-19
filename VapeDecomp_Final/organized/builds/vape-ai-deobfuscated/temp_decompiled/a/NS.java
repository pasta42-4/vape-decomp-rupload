/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ba;
import a.NV;
import a.aa;
import a.ht;
import a.lc;
import a.rh;
import a.zY;

public class Ns
extends NV {
    private static ht[] c;
    protected int z;
    private Object[] r;
    private int[] d = new int[40];
    private static final zY p;
    protected final int o;

    public void I(String string, String string2, String string3, lc lc2, lc lc3, int n2) {
        int n3 = this.h(n2, zY.n(string2));
        super.I(string, string2, string3, lc2, lc3, n3);
    }

    public static void z(ht[] htArray) {
        c = htArray;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    protected Ns(int n2, int n3, String string, NV nV) {
        super(n2, nV);
        this.r = new Object[20];
        this.z = (8 & n3) == 0 ? 1 : 0;
        for (zY zY2 : zY.a(string)) {
            this.z += zY2.q();
        }
        this.o = this.z;
    }

    protected void r(int n2, zY zY2) {
    }

    public aa h(int n2, rh rh2, lc[] lcArray, lc[] lcArray2, int[] nArray, String string, boolean bl2) {
        zY zY2 = zY.n(string);
        int[] nArray2 = new int[nArray.length];
        try {
            for (int i10 = 0; i10 < nArray2.length; ++i10) {
                nArray2[i10] = this.h(nArray[i10], zY2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Ns.a(illegalArgumentException);
        }
        return super.h(n2, rh2, lcArray, lcArray2, nArray2, string, bl2);
    }

    public static ht[] K() {
        return c;
    }

    public void c(int n2, int n3) {
        super.c(n2, this.z);
    }

    public void e(int n2, int n3) {
        super.e(this.h(n2, zY.O), n3);
    }

    public void K(int n2, int n3, Object[] objectArray, int n4, Object[] objectArray2) {
        Object object;
        int n5;
        try {
            if (n2 != -1) {
                throw new IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Ns.a(illegalArgumentException);
        }
        Object[] objectArray3 = new Object[this.r.length];
        System.arraycopy(this.r, 0, objectArray3, 0, objectArray3.length);
        this.l(this.r);
        int n6 = 0;
        for (n5 = 0; n5 < n3; ++n5) {
            int n7;
            int n8;
            block26: {
                block25: {
                    Object object2 = objectArray[n5];
                    if (object2 != Ba.y) {
                        object = p;
                        if (object2 == Ba.Y) {
                            object = zY.O;
                        } else if (object2 == Ba.j) {
                            object = zY.w;
                        } else if (object2 == Ba.A) {
                            object = zY.e;
                        } else if (object2 == Ba.o) {
                            object = zY.L;
                        } else if (object2 instanceof String) {
                            object = zY.p((String)object2);
                        }
                        this.r(this.h(n6, (zY)object), object2);
                    }
                    try {
                        try {
                            n8 = n6;
                            if (object2 != Ba.A && object2 != Ba.o) break block25;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Ns.a(illegalArgumentException);
                        }
                        n7 = 2;
                        break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Ns.a(illegalArgumentException);
                    }
                }
                n7 = 1;
            }
            n6 = n8 + n7;
        }
        n6 = 0;
        n5 = 0;
        int n9 = 0;
        while (n6 < this.r.length) {
            block29: {
                int n10;
                int n11;
                block28: {
                    block27: {
                        object = this.r[n6];
                        try {
                            try {
                                n11 = n6;
                                if (object != Ba.A && object != Ba.o) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Ns.a(illegalArgumentException);
                            }
                            n10 = 2;
                            break block28;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Ns.a(illegalArgumentException);
                        }
                    }
                    n10 = 1;
                }
                n6 = n11 + n10;
                try {
                    if (object == null || object == Ba.y) break block29;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Ns.a(illegalArgumentException);
                }
                this.r[n5++] = object;
                n9 = n5;
                continue;
            }
            this.r[n5++] = Ba.y;
        }
        super.K(n2, n9, this.r, n4, objectArray2);
        this.r = objectArray3;
    }

    private void r(int n2, Object object) {
        int n3 = this.r.length;
        if (n2 >= n3) {
            Object[] objectArray = new Object[Math.max(2 * n3, n2 + 1)];
            System.arraycopy(this.r, 0, objectArray, 0, n3);
            this.r = objectArray;
        }
        this.r[n2] = object;
    }

    static {
        p = zY.p("java/lang/Object");
        Ns.z(new ht[2]);
    }

    private int h(int n2, zY zY2) {
        int n3;
        try {
            if (n2 + zY2.q() <= this.o) {
                return n2;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Ns.a(illegalArgumentException);
        }
        int n4 = 2 * n2 + zY2.q() - 1;
        int n5 = this.d.length;
        if (n4 >= n5) {
            int[] nArray = new int[Math.max(2 * n5, n4 + 1)];
            System.arraycopy(this.d, 0, nArray, 0, n5);
            this.d = nArray;
        }
        if ((n3 = this.d[n4]) == 0) {
            n3 = this.V(zY2);
            this.r(n3, zY2);
            this.d[n4] = n3 + 1;
        } else {
            --n3;
        }
        return n3;
    }

    protected int V(zY zY2) {
        int n2 = this.z;
        this.z += zY2.q();
        return n2;
    }

    public void n(int n2, int n3) {
        zY zY2;
        switch (n2) {
            case 22: 
            case 55: {
                zY2 = zY.e;
                break;
            }
            case 24: 
            case 57: {
                zY2 = zY.L;
                break;
            }
            case 23: 
            case 56: {
                zY2 = zY.w;
                break;
            }
            case 21: 
            case 54: {
                zY2 = zY.O;
                break;
            }
            case 25: 
            case 58: 
            case 169: {
                zY2 = p;
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid opcode " + n2);
            }
        }
        super.n(n2, this.h(n3, zY2));
    }

    protected void l(Object[] objectArray) {
    }
}

