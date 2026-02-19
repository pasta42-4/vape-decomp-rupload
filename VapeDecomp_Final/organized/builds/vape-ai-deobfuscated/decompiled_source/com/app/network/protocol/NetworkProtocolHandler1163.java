/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.app.network.protocol;

import a.Oa;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.exception.system.CustomSystemException;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicInterface;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public abstract class NetworkProtocolHandler1163
implements CryptographicInterface {
    private final String Q;
    private static boolean H;
    private final String l;
    private final String D;
    @Nullable
    private final Comparator<LightweightExecutionContext> v;
    private final List<PluginLifecycleContract> a;

    @Override
    public @UnmodifiableView List<PluginLifecycleContract> V() {
        return this.a;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String O() {
        return this.l;
    }

    public static void x(boolean bl) {
        H = bl;
    }

    @Override
    public String s() {
        return this.D;
    }

    static {
        if (!NetworkProtocolHandler1163.i()) {
            NetworkProtocolHandler1163.x(true);
        }
    }

    public static boolean i() {
        return H;
    }

    protected NetworkProtocolHandler1163(Oa<?> oa) {
        this.D = oa.F();
        this.l = oa.P();
        this.Q = oa.g();
        this.v = oa.K();
        this.a = oa.G();
    }

    public static boolean j() {
        boolean bl = NetworkProtocolHandler1163.i();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1163.a(customSystemException);
        }
        return false;
    }

    @Override
    public String t() {
        return this.Q;
    }

    @Override
    public Comparator<LightweightExecutionContext> V() {
        return this.v;
    }
}

