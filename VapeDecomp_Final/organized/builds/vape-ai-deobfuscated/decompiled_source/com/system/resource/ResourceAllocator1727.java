/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.data.compression.CompressionAlgorithm;
import com.math.geometry.GeometryCalculator;
import com.notification.service.NotificationBroker2532;
import com.security.codec.CryptographicTransformer476;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.List;

public class ResourceAllocator1727
extends ObjectLifecycleTracker {
    public List<NotificationBroker2532>[][] I() {
        if (GeometryCalculator.C() > 13) {
            List[][] listArray = CryptographicTransformer476.P(ResourceAllocator1727.U.u().gq, this.H);
            ArrayList[][] arrayListArrayArray = new ArrayList[4][];
            int n = 0;
            for (List[] listArray2 : listArray) {
                ArrayList[] arrayListArray = new ArrayList[listArray2.length];
                for (int i = 0; i < listArray2.length; ++i) {
                    List list = listArray2[i];
                    ArrayList<NotificationBroker2532> arrayList = new ArrayList<NotificationBroker2532>();
                    for (Object e : list) {
                        arrayList.add(new NotificationBroker2532(e));
                    }
                    arrayListArray[i] = arrayList;
                }
                arrayListArrayArray[n] = arrayListArray;
                ++n;
            }
            return arrayListArrayArray;
        }
        ArrayList[][] arrayListArrayArray = new ArrayList[1][];
        List[] listArray = CryptographicTransformer476.h(ResourceAllocator1727.U.u().gq, this.H);
        int n = 0;
        ArrayList[] arrayListArray = new ArrayList[4];
        for (int i = 0; i < listArray.length; ++i) {
            List list = listArray[i];
            ArrayList<NotificationBroker2532> arrayList = new ArrayList<NotificationBroker2532>();
            for (Object e : list) {
                arrayList.add(new NotificationBroker2532(e));
            }
            arrayListArray[i] = arrayList;
        }
        arrayListArrayArray[n] = arrayListArray;
        return arrayListArrayArray;
    }

    public ResourceAllocator1727(Object object) {
        super(object);
    }

    public List<CompressionAlgorithm> K() {
        List list = ResourceAllocator1727.U.u().gq.r(this.H);
        ArrayList<CompressionAlgorithm> arrayList = new ArrayList<CompressionAlgorithm>();
        for (Object e : list) {
            arrayList.add(new CompressionAlgorithm(e));
        }
        return arrayList;
    }
}

