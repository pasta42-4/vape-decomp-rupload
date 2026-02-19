/*
 * Decompiled with CFR 0.152.
 */
package com.app.bytecode.analysis;

import a.zY;
import com.app.config.NumericConfigurationDescriptor;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.core.computation.AbstractComputationKernel;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.system.extensions.ExtendedApiResolver;

public class BytecodeInstructionInterpreter
extends BytecodeInstrumentationEngine {
    private static AbstractComputationKernel[] c;
    protected int z;
    private Object[] r;
    private int[] d = new int[40];
    private static final zY p;
    protected final int o;

    public void I(String string, String string2, String string3, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, int n) {
        int n2 = this.h(n, zY.n(string2));
        super.I(string, string2, string3, cryptoKeyExchangeMapping, cryptoKeyExchangeMapping2, n2);
    }

    public static void z(AbstractComputationKernel[] abstractComputationKernelArray) {
        c = abstractComputationKernelArray;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    protected BytecodeInstructionInterpreter(int n, int n2, String string, BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        super(n, bytecodeInstrumentationEngine);
        this.r = new Object[20];
        this.z = (8 & n2) == 0 ? 1 : 0;
        for (zY zY2 : zY.a(string)) {
            this.z += zY2.q();
        }
        this.o = this.z;
    }

    protected void r(int n, zY zY2) {
    }

    public ExtendedApiResolver h(int n, ErrorDiagnosticTracker errorDiagnosticTracker, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray2, int[] nArray, String string, boolean bl) {
        zY zY2 = zY.n(string);
        int[] nArray2 = new int[nArray.length];
        try {
            for (int i = 0; i < nArray2.length; ++i) {
                nArray2[i] = this.h(nArray[i], zY2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstructionInterpreter.a(illegalArgumentException);
        }
        return super.h(n, errorDiagnosticTracker, cryptoKeyExchangeMappingArray, cryptoKeyExchangeMappingArray2, nArray2, string, bl);
    }

    public static AbstractComputationKernel[] K() {
        return c;
    }

    public void c(int n, int n2) {
        super.c(n, this.z);
    }

    public void e(int n, int n2) {
        super.e(this.h(n, zY.O), n2);
    }

    public void K(int n, int n2, Object[] objectArray, int n3, Object[] objectArray2) {
        Object object;
        int n4;
        try {
            if (n != -1) {
                throw new IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstructionInterpreter.a(illegalArgumentException);
        }
        Object[] objectArray3 = new Object[this.r.length];
        System.arraycopy(this.r, 0, objectArray3, 0, objectArray3.length);
        this.l(this.r);
        int n5 = 0;
        for (n4 = 0; n4 < n2; ++n4) {
            int n6;
            int n7;
            block26: {
                block25: {
                    Object object2 = objectArray[n4];
                    if (object2 != NumericConfigurationDescriptor.y) {
                        object = p;
                        if (object2 == NumericConfigurationDescriptor.Y) {
                            object = zY.O;
                        } else if (object2 == NumericConfigurationDescriptor.j) {
                            object = zY.w;
                        } else if (object2 == NumericConfigurationDescriptor.A) {
                            object = zY.e;
                        } else if (object2 == NumericConfigurationDescriptor.o) {
                            object = zY.L;
                        } else if (object2 instanceof String) {
                            object = zY.p((String)object2);
                        }
                        this.r(this.h(n5, (zY)object), object2);
                    }
                    try {
                        try {
                            n7 = n5;
                            if (object2 != NumericConfigurationDescriptor.A && object2 != NumericConfigurationDescriptor.o) break block25;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeInstructionInterpreter.a(illegalArgumentException);
                        }
                        n6 = 2;
                        break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeInstructionInterpreter.a(illegalArgumentException);
                    }
                }
                n6 = 1;
            }
            n5 = n7 + n6;
        }
        n5 = 0;
        n4 = 0;
        int n8 = 0;
        while (n5 < this.r.length) {
            block29: {
                int n9;
                int n10;
                block28: {
                    block27: {
                        object = this.r[n5];
                        try {
                            try {
                                n10 = n5;
                                if (object != NumericConfigurationDescriptor.A && object != NumericConfigurationDescriptor.o) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeInstructionInterpreter.a(illegalArgumentException);
                            }
                            n9 = 2;
                            break block28;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeInstructionInterpreter.a(illegalArgumentException);
                        }
                    }
                    n9 = 1;
                }
                n5 = n10 + n9;
                try {
                    if (object == null || object == NumericConfigurationDescriptor.y) break block29;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeInstructionInterpreter.a(illegalArgumentException);
                }
                this.r[n4++] = object;
                n8 = n4;
                continue;
            }
            this.r[n4++] = NumericConfigurationDescriptor.y;
        }
        super.K(n, n8, this.r, n3, objectArray2);
        this.r = objectArray3;
    }

    private void r(int n, Object object) {
        int n2 = this.r.length;
        if (n >= n2) {
            Object[] objectArray = new Object[Math.max(2 * n2, n + 1)];
            System.arraycopy(this.r, 0, objectArray, 0, n2);
            this.r = objectArray;
        }
        this.r[n] = object;
    }

    static {
        p = zY.p("java/lang/Object");
        BytecodeInstructionInterpreter.z(new AbstractComputationKernel[2]);
    }

    private int h(int n, zY zY2) {
        int n2;
        try {
            if (n + zY2.q() <= this.o) {
                return n;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstructionInterpreter.a(illegalArgumentException);
        }
        int n3 = 2 * n + zY2.q() - 1;
        int n4 = this.d.length;
        if (n3 >= n4) {
            int[] nArray = new int[Math.max(2 * n4, n3 + 1)];
            System.arraycopy(this.d, 0, nArray, 0, n4);
            this.d = nArray;
        }
        if ((n2 = this.d[n3]) == 0) {
            n2 = this.V(zY2);
            this.r(n2, zY2);
            this.d[n3] = n2 + 1;
        } else {
            --n2;
        }
        return n2;
    }

    protected int V(zY zY2) {
        int n = this.z;
        this.z += zY2.q();
        return n;
    }

    public void n(int n, int n2) {
        zY zY2;
        switch (n) {
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
                throw new IllegalArgumentException("Invalid opcode " + n);
            }
        }
        super.n(n, this.h(n2, zY2));
    }

    protected void l(Object[] objectArray) {
    }
}

