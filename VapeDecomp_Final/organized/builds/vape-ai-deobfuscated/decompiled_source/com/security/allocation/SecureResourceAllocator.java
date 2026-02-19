/*
 * Decompiled with CFR 0.152.
 */
package com.security.allocation;

import a.fu;
import com.app.security.access.ResourceAccessController2190;
import com.app.security.validation.SecurityTokenValidator2196;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.messaging.routing.MessageRoutingService2228;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.resource.management.ResourceAccessMediator1771;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.encoding.SecureMessageEncoder;
import com.session.management.SessionMediator;
import com.system.orchestration.SystemOrchestrationManager;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
import com.vape.ui.VapeInterfaceValidator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecureResourceAllocator
extends SecureMessageEncoder {
    private GraphicalThemeRenderer v;
    private GraphicalThemeRenderer R;
    private static final String[] jb;
    private String D;
    private String n;
    private static final Object[] fb;
    private VisualRenderContext Qv;
    private int B;
    private VisualRenderContext V;
    private static final Integer[] db;
    private VisualRenderContext E;
    private static final long ab;
    private static final Map eb;
    private static final long[] bb;
    private GraphicalThemeRenderer F;
    private fu Y;

    public void P() {
        try {
            if (GraphicalRenderingController.e) {
                GraphicalRenderingController.e = false;
                GraphicalRenderingController.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceAllocator.a(customSystemException);
        }
        try {
            if (this.Y.z() != null) {
                this.Y.E(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceAllocator.a(customSystemException);
        }
        GraphicalRenderingController.a(this.Y.Q());
        for (AbstractComputationKernel abstractComputationKernel : this.h().A()) {
            boolean bl;
            AbstractComputationKernel abstractComputationKernel2;
            block18: {
                block17: {
                    try {
                        if (abstractComputationKernel instanceof SecureMessageEncoder) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureResourceAllocator.a(customSystemException);
                    }
                    try {
                        if (!(abstractComputationKernel instanceof SystemOrchestrationManager)) {
                            abstractComputationKernel.N(false);
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureResourceAllocator.a(customSystemException);
                    }
                    try {
                        try {
                            abstractComputationKernel2 = abstractComputationKernel;
                            if (this.Y.W() || !((SystemOrchestrationManager)abstractComputationKernel).D().H()) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator.a(customSystemException);
                        }
                        bl = true;
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureResourceAllocator.a(customSystemException);
                    }
                }
                bl = false;
            }
            abstractComputationKernel2.N(bl);
        }
        this.h().A();
    }

    static fu k(SecureResourceAllocator secureResourceAllocator) {
        return secureResourceAllocator.Y;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureResourceAllocator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public int f() {
        return this.B;
    }

    public void n(ContextualExecutionFramework contextualExecutionFramework) {
        long l = ab ^ 0xDB8B97FD4F6L;
        try {
            if (contextualExecutionFramework == null) {
                this.Qv.z("");
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceAllocator.a(customSystemException);
        }
        this.Qv.z(contextualExecutionFramework.O().toUpperCase().substring(0, 3) + (String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)28075, (long)(0x272D9BF6978A14AFL ^ l)), (long)-1200727179926819537L, (long)l)));
        this.Qv.C(new SecurityTokenValidator2196(this, contextualExecutionFramework));
    }

    public void Q(ContextualExecutionFramework contextualExecutionFramework) {
        long l = ab ^ 0x2778F5B22FCCL;
        try {
            if (contextualExecutionFramework == null) {
                this.V.z("");
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceAllocator.a(customSystemException);
        }
        this.V.z((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)11936, (long)(0x3A152681A541AC9AL ^ l)), (long)1471553641751238165L, (long)l)) + contextualExecutionFramework.O().toUpperCase().substring(0, 3));
        this.V.C(new ResourceAccessController2190(this, contextualExecutionFramework));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureResourceAllocator.ab = MultiContainerRegistry.a(7204575886650628564L, 6836188093897703681L, MethodHandles.lookup().lookupClass()).a(146208151064943L);
                SecureResourceAllocator.fb = new Object[5];
                SecureResourceAllocator.jb = new String[5];
                SecureResourceAllocator.a();
                SecureResourceAllocator.eb = new HashMap<K, V>(13);
                var0 = SecureResourceAllocator.ab ^ 48364487731262L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u000e\u0087P\u00a2\u00c6m\u00fcN\u00c5\u00b6\u00b0\u009f\u00821AO\u00f9\u000e\u001bn/cT\"\u0088\u00880\u00f3\u0099q0V\u00a2\u00f3Z\u0012\u00e8x8GDF\u00e6\u0019j\u001e\u0085=+\u00e1\u00c5P\u00ad<{r3m\u00d7\u00baEV\u0004\u009c)\u00b7\u00a3\u00b6\u0084\u00e0\u0001hw\u00d8\u001b\u00e0\u00dc>\u0003\u00a5";
                var7_6 = "\u000e\u0087P\u00a2\u00c6m\u00fcN\u00c5\u00b6\u00b0\u009f\u00821AO\u00f9\u000e\u001bn/cT\"\u0088\u00880\u00f3\u0099q0V\u00a2\u00f3Z\u0012\u00e8x8GDF\u00e6\u0019j\u001e\u0085=+\u00e1\u00c5P\u00ad<{r3m\u00d7\u00baEV\u0004\u009c)\u00b7\u00a3\u00b6\u0084\u00e0\u0001hw\u00d8\u001b\u00e0\u00dc>\u0003\u00a5".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "(\u0001\u00af3d3\u00feP\u00b4\u0014$l=\u00b8?X";
                    var7_6 = "(\u0001\u00af3d3\u00feP\u00b4\u0014$l=\u00b8?X".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        SecureResourceAllocator.bb = var8_3;
        SecureResourceAllocator.db = new Integer[12];
    }

    private static void a() {
        Object[] objectArray = fb;
        fb[0] = "&W\\";
        objectArray[1] = Integer.TYPE;
        SecureResourceAllocator.jb[1] = "java/lang/Integer";
        objectArray[2] = " \b\u0017\u0016\u0012R+\u0007\u0006YoJ8\u0000\u000f\u0010";
        objectArray[3] = "TFhXWX_Iy\u00176VTB}M";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "t\u001ch ==j]6R48\u0011\u0017p8c<u\u0012n-_zuQqj.z(\u001fcR";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/CW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void G() {
        block16: {
            CallSite callSite;
            GraphicalThemeRenderer graphicalThemeRenderer;
            long l;
            block18: {
                Color color;
                GraphicalThemeRenderer graphicalThemeRenderer2;
                double d2;
                CryptographicParameterGenerator cryptographicParameterGenerator;
                block17: {
                    double d3;
                    double d4;
                    float f;
                    float f2;
                    block15: {
                        l = ab ^ 0x459A8C3247ABL;
                        cryptographicParameterGenerator = this.L(0.9);
                        double d5 = cryptographicParameterGenerator.B(this.n);
                        d2 = this.W() + this.b() / 2.0 - d5 / 2.0 + 1.0;
                        f2 = (float)StateTrackingCoordinator.V(this.D) / 3.5f;
                        f = (float)StateTrackingCoordinator.D(this.D) / 3.5f;
                        d4 = (float)this.G() + 6.0f;
                        d3 = this.W() + this.b() / 2.0 - (double)(f / 2.0f) + 1.0;
                        try {
                            try {
                                cryptographicParameterGenerator.R(this.n, d4 + (double)f2 + 4.0, d2, SecureResourceAllocator.M.c);
                                if (this.Y.z() == null || GraphicalRenderingController.e) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureResourceAllocator.a(customSystemException);
                            }
                            this.R.N(false);
                            this.E.N(false);
                            this.F.h(SecureResourceAllocator.M.c);
                            this.F.N(true);
                            this.F.b(this.G() + 5.0);
                            this.F.M(this.W());
                            this.F.w(this.b());
                            this.v.N(false);
                            this.V.N(true);
                            this.Qv.N(true);
                            this.Qv.b(this.G() + this.w() - 5.0 - this.Qv.w());
                            this.Qv.M(this.W());
                            this.Qv.w(this.b());
                            this.V.b(this.G() + this.w() - 10.0 - this.Qv.w() - this.V.w());
                            this.V.M(this.W());
                            this.V.w(this.b());
                            break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureResourceAllocator.a(customSystemException);
                        }
                    }
                    try {
                        this.V.N(false);
                        this.Qv.N(false);
                        this.v.N(true);
                        StateTrackingCoordinator.B(SecureResourceAllocator.M.c, (float)d4, (float)d3, this.D, f2, f, false);
                        this.F.N(false);
                        if (!GraphicalRenderingController.e) break block17;
                        this.R.N(false);
                        this.E.d(0.75);
                        this.E.N(true);
                        this.E.z((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)7988, (long)(0x4722E6C7BA1EF56FL ^ l)), (long)8938344400317300338L, (long)l)));
                        this.E.b(this.G() + this.w() - 10.0 - 16.0 - cryptographicParameterGenerator.D(this.E.O()) / 2.0);
                        this.E.M(this.W());
                        this.E.w(this.b());
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureResourceAllocator.a(customSystemException);
                    }
                }
                boolean bl = this.h().C().T(GraphicsBufferAllocator.b());
                if (((SecureResourceAllocator)this.F().Q()).f() > 0) {
                    double d6 = cryptographicParameterGenerator.D("" + this.B);
                    try {
                        if (bl) {
                            cryptographicParameterGenerator.R("" + this.B, this.G() + this.w() - 5.0 - 16.0 - 3.0 - d6, d2, SecureResourceAllocator.M.n);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureResourceAllocator.a(customSystemException);
                    }
                    this.R.u((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)31141, (long)(0x5D3A98BC91D613F5L ^ l)), (long)8938344400317300338L, (long)l)));
                } else {
                    this.R.u((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)31836, (long)(0x7483B4F041A2960DL ^ l)), (long)8938344400317300338L, (long)l)));
                }
                try {
                    this.R.N(bl);
                    this.E.N(false);
                    graphicalThemeRenderer2 = this.R;
                    color = GraphicalRenderingController.e ? SecureResourceAllocator.M.q : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator.a(customSystemException);
                }
                graphicalThemeRenderer2.h(color);
                this.R.b(this.G() + this.w() - 10.0 - 16.0);
                this.R.M(this.W() + 1.0);
                this.R.w(this.b());
            }
            try {
                this.v.b(this.G() + this.w() - 7.5 - 8.0);
                this.v.M(this.W());
                this.v.w(this.b());
                graphicalThemeRenderer = this.v;
                callSite = this.Y.W() ? SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)21265, (long)(0x635B4846FB233942L ^ l)), (long)8938344400317300338L, (long)l) : SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)23095, (long)(0x495CDBDB92B1B068L ^ l)), (long)8938344400317300338L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw SecureResourceAllocator.a(customSystemException);
            }
            graphicalThemeRenderer.u((String)((Object)callSite));
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/CW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public SecureResourceAllocator(fu fu2, String string, String string2) {
        long l = ab ^ 0x31B1A664A0E9L;
        super(fu2);
        this.V = new VisualRenderContext("", 0.75);
        this.Qv = new VisualRenderContext("", 0.75);
        this.B = 0;
        this.E = new VisualRenderContext((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)15022, (long)(0x75C3D7560ED637BEL ^ l)), (long)-7257246282982008528L, (long)l)));
        this.R = new GraphicalThemeRenderer((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)2814, (long)(0x19134F0A09C987E6L ^ l)), (long)-7257246282982008528L, (long)l)), 0.7);
        this.F = new GraphicalThemeRenderer((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)9426, (long)(0x27E30D1BE6F029CCL ^ l)), (long)-7257246282982008528L, (long)l)));
        this.v = new GraphicalThemeRenderer((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)29369, (long)(0x7FF0E2A786F0FFA5L ^ l)), (long)-7257246282982008528L, (long)l)), 0.3);
        this.Y = fu2;
        this.D = string;
        this.n = string2;
        this.R.N(new SessionMediator(this));
        this.R.g((String)((Object)SecureResourceAllocator.c("m", (int)SecureResourceAllocator.b("h", (int)27683, (long)(0x3AC7D5AF0925E139L ^ l)), (long)-7257246282982008528L, (long)l)));
        this.F.N(new MessageRoutingService2228(this));
        this.E.N(new ResourceAccessMediator1771(this));
        this.v.N(new VapeInterfaceValidator(this, fu2));
        this.o(this.E, this.F, this.R, this.v, this.Qv, this.V);
    }

    private static Field g(long l, long l2) {
        int n = SecureResourceAllocator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureResourceAllocator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureResourceAllocator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureResourceAllocator.c(clazz3, string2, clazz2)) != null) {
                    SecureResourceAllocator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureResourceAllocator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureResourceAllocator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureResourceAllocator.f(274854350601525L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 60;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 47;
                break;
            }
            case 6: {
                n3 = 33;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 9: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 45;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 34;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 63;
                break;
            }
            case 20: {
                n3 = 37;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 2;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 9;
                break;
            }
            case 27: {
                n3 = 59;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 12;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 11;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 8;
                break;
            }
            case 37: {
                n3 = 54;
                break;
            }
            case 38: {
                n3 = 57;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 18;
                break;
            }
            case 42: {
                n3 = 27;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 44;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 23;
                break;
            }
            case 47: {
                n3 = 62;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 58;
                break;
            }
            case 50: {
                n3 = 3;
                break;
            }
            case 51: {
                n3 = 43;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 42;
                break;
            }
            case 56: {
                n3 = 52;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 20;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 1;
                break;
            }
            default: {
                n3 = 14;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        SecureResourceAllocator.jb[n4] = new String(cArray);
        return n4;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureResourceAllocator.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureResourceAllocator.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void U() {
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1650;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/CW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureResourceAllocator.db[n2] = n3;
        }
        return db[n2];
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (this.Y.z() == null || !GraphicalRenderingController.e) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceAllocator.a(customSystemException);
                }
                this.Y.E(null);
            }
            catch (CustomSystemException customSystemException) {
                throw SecureResourceAllocator.a(customSystemException);
            }
        }
    }

    private static Method h(long l, long l2) {
        int n = SecureResourceAllocator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureResourceAllocator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = SecureResourceAllocator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureResourceAllocator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureResourceAllocator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureResourceAllocator.f(274854350601525L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureResourceAllocator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureResourceAllocator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureResourceAllocator.f(274854350601525L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecureResourceAllocator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureResourceAllocator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureResourceAllocator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureResourceAllocator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureResourceAllocator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == 'F' || c == '\u00e6' || c == '\u00a3') {
                field = SecureResourceAllocator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureResourceAllocator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'm' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void g() {
    }

    public void o(int n) {
        this.B = n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(SecureResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

