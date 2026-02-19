/*
 * Decompiled with CFR 0.152.
 */
package com.network.streaming;

import a.V3;
import com.data.serialization.MessageSerializationController;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.management.RuntimeContextManager;
import com.security.authentication.AuthenticationStateManager675;
import com.system.resource.SystemResourceAllocator1279;
import java.util.ArrayList;
import java.util.List;

public class DataStreamProcessor1233
extends ProtocolInteractionController {
    public List<V3> g(LightweightExecutionContext lightweightExecutionContext) {
        ArrayList<V3> arrayList = new ArrayList<V3>();
        List list = GeometryCalculator.C() >= 50 ? this.Q(lightweightExecutionContext) : RuntimeContextManager.E(DataStreamProcessor1233.U.u().l, this.H, lightweightExecutionContext.M());
        for (Object e : list) {
            arrayList.add(new V3(e));
        }
        return arrayList;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String m(LightweightExecutionContext lightweightExecutionContext) {
        if (GeometryCalculator.C() >= 35) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(RuntimeContextManager.J(DataStreamProcessor1233.U.u().l, this.H, lightweightExecutionContext.M()));
            return authenticationStateManager675.i();
        }
        return RuntimeContextManager.N(DataStreamProcessor1233.U.u().l, this.H, lightweightExecutionContext.M());
    }

    public List<V3> O(int n) {
        ArrayList<V3> arrayList = new ArrayList<V3>();
        List list = RuntimeContextManager.E(DataStreamProcessor1233.U.u().l, this.H, n);
        for (Object e : list) {
            arrayList.add(new V3(e));
        }
        return arrayList;
    }

    public DataStreamProcessor1233(Object object) {
        super(object);
    }

    public List t(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeContextManager.E(DataStreamProcessor1233.U.u().l, this.H, lightweightExecutionContext.M());
    }

    public List Q(LightweightExecutionContext lightweightExecutionContext) {
        if (GeometryCalculator.C() >= 50) {
            MessageSerializationController messageSerializationController = new MessageSerializationController(lightweightExecutionContext.k(SystemResourceAllocator1279.r()));
            ArrayList arrayList = new ArrayList();
            for (Object t : messageSerializationController.a()) {
                arrayList.add(t);
            }
            return arrayList;
        }
        return RuntimeContextManager.E(DataStreamProcessor1233.U.u().l, this.H, lightweightExecutionContext.M());
    }

    public static boolean d(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block8: {
            boolean bl2;
            block10: {
                block9: {
                    try {
                        try {
                            try {
                                if (GeometryCalculator.C() < 23) break block8;
                                if (!lightweightExecutionContext.C().r()) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataStreamProcessor1233.a(customSystemException);
                            }
                            if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.F1)) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataStreamProcessor1233.a(customSystemException);
                        }
                        bl2 = true;
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamProcessor1233.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        try {
            bl = (lightweightExecutionContext.b() & 0x4000) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamProcessor1233.a(customSystemException);
        }
        return bl;
    }
}

