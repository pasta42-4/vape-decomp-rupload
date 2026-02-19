/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.iteration.CustomListTraversal;
import com.data.collection.CollectionOrchestrator1895;
import com.exception.system.CustomSystemException;
import com.resource.management.ResourceLifecycleManager1859;
import java.util.ListIterator;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class XF
implements Iterable<CollectionOrchestrator1895> {
    private CollectionOrchestrator1895 e;
    private int Y;
    private CollectionOrchestrator1895 d;
    CollectionOrchestrator1895[] U;

    void r(boolean bl) {
        if (bl) {
            CollectionOrchestrator1895 collectionOrchestrator1895 = this.d;
            while (collectionOrchestrator1895 != null) {
                CollectionOrchestrator1895 collectionOrchestrator18952 = collectionOrchestrator1895.x;
                collectionOrchestrator1895.p = -1;
                collectionOrchestrator1895.c = null;
                collectionOrchestrator1895.x = null;
                collectionOrchestrator1895 = collectionOrchestrator18952;
            }
        }
        this.Y = 0;
        this.d = null;
        this.e = null;
        this.U = null;
    }

    public void W(XF xF) {
        block6: {
            CollectionOrchestrator1895 collectionOrchestrator1895;
            block5: {
                try {
                    if (xF.Y == 0) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
                try {
                    this.Y += xF.Y;
                    if (this.e != null) break block5;
                    this.d = xF.d;
                    this.e = xF.e;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            this.e.x = collectionOrchestrator1895 = xF.d;
            collectionOrchestrator1895.c = this.e;
            this.e = xF.e;
        }
        this.U = null;
        xF.r(false);
    }

    public void W(CollectionOrchestrator1895 collectionOrchestrator1895, CollectionOrchestrator1895 collectionOrchestrator18952) {
        CollectionOrchestrator1895 collectionOrchestrator18953;
        block3: {
            block2: {
                ++this.Y;
                collectionOrchestrator18953 = collectionOrchestrator1895.x;
                try {
                    if (collectionOrchestrator18953 != null) break block2;
                    this.e = collectionOrchestrator18952;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            collectionOrchestrator18953.c = collectionOrchestrator18952;
        }
        collectionOrchestrator1895.x = collectionOrchestrator18952;
        collectionOrchestrator18952.x = collectionOrchestrator18953;
        collectionOrchestrator18952.c = collectionOrchestrator1895;
        this.U = null;
        collectionOrchestrator18952.p = 0;
    }

    public void V() {
        CollectionOrchestrator1895 collectionOrchestrator1895 = this.d;
        while (true) {
            block5: {
                try {
                    try {
                        if (collectionOrchestrator1895 == null) break;
                        if (!(collectionOrchestrator1895 instanceof ResourceLifecycleManager1859)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw XF.a(customSystemException);
                    }
                    ((ResourceLifecycleManager1859)collectionOrchestrator1895).H();
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            collectionOrchestrator1895 = collectionOrchestrator1895.x;
        }
    }

    public void R(CollectionOrchestrator1895 collectionOrchestrator1895) {
        block3: {
            block2: {
                try {
                    ++this.Y;
                    if (this.e != null) break block2;
                    this.d = collectionOrchestrator1895;
                    this.e = collectionOrchestrator1895;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            this.e.x = collectionOrchestrator1895;
            collectionOrchestrator1895.c = this.e;
        }
        this.e = collectionOrchestrator1895;
        this.U = null;
        collectionOrchestrator1895.p = 0;
    }

    public void E(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        CollectionOrchestrator1895 collectionOrchestrator1895 = this.d;
        while (collectionOrchestrator1895 != null) {
            collectionOrchestrator1895.T(bytecodeInstrumentationEngine);
            collectionOrchestrator1895 = collectionOrchestrator1895.x;
        }
    }

    public void r(CollectionOrchestrator1895 collectionOrchestrator1895, XF xF) {
        CollectionOrchestrator1895 collectionOrchestrator18952;
        CollectionOrchestrator1895 collectionOrchestrator18953;
        block6: {
            CollectionOrchestrator1895 collectionOrchestrator18954;
            block5: {
                try {
                    if (xF.Y == 0) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
                this.Y += xF.Y;
                collectionOrchestrator18954 = xF.d;
                collectionOrchestrator18953 = xF.e;
                collectionOrchestrator18952 = collectionOrchestrator1895.c;
                try {
                    if (collectionOrchestrator18952 != null) break block5;
                    this.d = collectionOrchestrator18954;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            collectionOrchestrator18952.x = collectionOrchestrator18954;
        }
        collectionOrchestrator1895.c = collectionOrchestrator18953;
        collectionOrchestrator18953.x = collectionOrchestrator1895;
        collectionOrchestrator18954.c = collectionOrchestrator18952;
        this.U = null;
        xF.r(false);
    }

    public void V(CollectionOrchestrator1895 collectionOrchestrator1895, CollectionOrchestrator1895 collectionOrchestrator18952) {
        CollectionOrchestrator1895 collectionOrchestrator18953;
        block3: {
            block2: {
                ++this.Y;
                collectionOrchestrator18953 = collectionOrchestrator1895.c;
                try {
                    if (collectionOrchestrator18953 != null) break block2;
                    this.d = collectionOrchestrator18952;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            collectionOrchestrator18953.x = collectionOrchestrator18952;
        }
        collectionOrchestrator1895.c = collectionOrchestrator18952;
        collectionOrchestrator18952.x = collectionOrchestrator1895;
        collectionOrchestrator18952.c = collectionOrchestrator18953;
        this.U = null;
        collectionOrchestrator18952.p = 0;
    }

    public void j(XF xF) {
        block6: {
            CollectionOrchestrator1895 collectionOrchestrator1895;
            block5: {
                try {
                    if (xF.Y == 0) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
                try {
                    this.Y += xF.Y;
                    if (this.d != null) break block5;
                    this.d = xF.d;
                    this.e = xF.e;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            this.d.c = collectionOrchestrator1895 = xF.e;
            collectionOrchestrator1895.x = this.d;
            this.d = xF.d;
        }
        this.U = null;
        xF.r(false);
    }

    public CollectionOrchestrator1895 x() {
        return this.d;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void o(CollectionOrchestrator1895 collectionOrchestrator1895) {
        block8: {
            CollectionOrchestrator1895 collectionOrchestrator18952;
            CollectionOrchestrator1895 collectionOrchestrator18953;
            block9: {
                block6: {
                    block7: {
                        --this.Y;
                        collectionOrchestrator18953 = collectionOrchestrator1895.x;
                        collectionOrchestrator18952 = collectionOrchestrator1895.c;
                        try {
                            try {
                                if (collectionOrchestrator18953 != null) break block6;
                                if (collectionOrchestrator18952 != null) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw XF.a(customSystemException);
                            }
                            this.d = null;
                            this.e = null;
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw XF.a(customSystemException);
                        }
                    }
                    collectionOrchestrator18952.x = null;
                    this.e = collectionOrchestrator18952;
                    break block8;
                }
                try {
                    if (collectionOrchestrator18952 != null) break block9;
                    this.d = collectionOrchestrator18953;
                    collectionOrchestrator18953.c = null;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            collectionOrchestrator18952.x = collectionOrchestrator18953;
            collectionOrchestrator18953.c = collectionOrchestrator18952;
        }
        this.U = null;
        collectionOrchestrator1895.p = -1;
        collectionOrchestrator1895.c = null;
        collectionOrchestrator1895.x = null;
    }

    public ListIterator<CollectionOrchestrator1895> H(int n) {
        return new CustomListTraversal(this, n);
    }

    public int H() {
        return this.Y;
    }

    public ListIterator<CollectionOrchestrator1895> E() {
        return this.H(0);
    }

    public CollectionOrchestrator1895 E() {
        return this.e;
    }

    public void P(CollectionOrchestrator1895 collectionOrchestrator1895, CollectionOrchestrator1895 collectionOrchestrator18952) {
        block9: {
            block8: {
                block7: {
                    block6: {
                        CollectionOrchestrator1895 collectionOrchestrator18953 = collectionOrchestrator1895.x;
                        try {
                            collectionOrchestrator18952.x = collectionOrchestrator18953;
                            if (collectionOrchestrator18953 == null) break block6;
                            collectionOrchestrator18953.c = collectionOrchestrator18952;
                            break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw XF.a(customSystemException);
                        }
                    }
                    this.e = collectionOrchestrator18952;
                }
                CollectionOrchestrator1895 collectionOrchestrator18954 = collectionOrchestrator1895.c;
                try {
                    collectionOrchestrator18952.c = collectionOrchestrator18954;
                    if (collectionOrchestrator18954 == null) break block8;
                    collectionOrchestrator18954.x = collectionOrchestrator18952;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw XF.a(customSystemException);
                }
            }
            this.d = collectionOrchestrator18952;
        }
        if (this.U != null) {
            int n = collectionOrchestrator1895.p;
            this.U[n] = collectionOrchestrator18952;
            collectionOrchestrator18952.p = n;
        } else {
            collectionOrchestrator18952.p = 0;
        }
        collectionOrchestrator1895.p = -1;
        collectionOrchestrator1895.c = null;
        collectionOrchestrator1895.x = null;
    }

    public CollectionOrchestrator1895[] a() {
        int n = 0;
        CollectionOrchestrator1895 collectionOrchestrator1895 = this.d;
        CollectionOrchestrator1895[] collectionOrchestrator1895Array = new CollectionOrchestrator1895[this.Y];
        while (collectionOrchestrator1895 != null) {
            collectionOrchestrator1895Array[n] = collectionOrchestrator1895;
            collectionOrchestrator1895.p = n++;
            collectionOrchestrator1895 = collectionOrchestrator1895.x;
        }
        return collectionOrchestrator1895Array;
    }
}

