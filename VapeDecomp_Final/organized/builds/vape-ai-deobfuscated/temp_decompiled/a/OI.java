/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package a;

import a.Hc;
import a.PD;
import a.oA;
import a.oD;
import a.op;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;

public class oi
extends Hc {
    public Collection<oA> F(op op2) {
        Collection collection = PD.c(oi.U.u().Lc, this.H, op2.M());
        ArrayList arrayList = Lists.newArrayList();
        for (Object e10 : collection) {
            arrayList.add(new oA(e10));
        }
        return arrayList;
    }

    public oi(Object object) {
        super(object);
    }

    public oD W(String string) {
        return new oD(PD.S(oi.U.u().Lc, this.H, string));
    }
}

