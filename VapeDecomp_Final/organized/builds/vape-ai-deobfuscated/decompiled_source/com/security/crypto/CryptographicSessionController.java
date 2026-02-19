/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
package com.security.crypto;

import a.Df;
import a.I9;
import a.Ne;
import a.RL;
import a.ZJ;
import a.tl;
import a.z1;
import a.z6;
import com.app.security.validation.DecompilationValidator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.task.AsyncTaskOrchestrator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.utility.ContextualActionResolver;
import com.data.obfuscation.NumericScrambler;
import com.deobfuscation.transformation.BinaryTransformer;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.graphics.compute.GraphicsComputationKernel;
import com.math.transformation.NumericTransformer;
import com.protocol.config.ProtocolConfigurationEnum;
import com.reflection.dispatch.MethodInvocationResolver;
import com.system.configuration.ConfigurationManager;
import com.system.resources.ResourceAllocationTracker882;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class CryptographicSessionController {
    public ArrayList<AsyncTaskOrchestrator> B;
    private boolean c;
    private static final long[] d;
    private int C;
    public GraphicsComputationKernel E;
    private int w;
    private RuntimeInstrumentationEngine r;
    private static final String[] j;
    private static final Integer[] e;
    private static final Object[] i;
    private long Z;
    private boolean f;
    private static final Map h;
    private boolean b;
    private int z;
    private int u;
    private static final long a;
    private int F;
    private int W;
    private static CryptographicSessionController T;
    private static final long L = 1000L;
    private int t;
    public ArrayList<AsyncTaskOrchestrator> R;
    private boolean U;
    private int v;
    private RuntimeInstrumentationEngine g;
    public I9 P;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D68;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/KP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSessionController.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSessionController.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void v(float f) {
        try {
            if (this.R.isEmpty()) {
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        ZJ.n();
        for (AsyncTaskOrchestrator asyncTaskOrchestrator : this.R) {
            block23: {
                boolean bl;
                block21: {
                    block22: {
                        try {
                            if (!this.b) {
                                this.L();
                            }
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw CryptographicSessionController.a(illegalStateException);
                        }
                        bl = GL11.glIsEnabled((int)3089);
                        try {
                            try {
                                if (!asyncTaskOrchestrator.d()) break block21;
                                if (bl) break block22;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw CryptographicSessionController.a(illegalStateException);
                            }
                            Ne.h.y(3089);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw CryptographicSessionController.a(illegalStateException);
                        }
                    }
                    ResourceAllocationTracker882 resourceAllocationTracker882 = asyncTaskOrchestrator.J();
                    GL11.glScissor((int)resourceAllocationTracker882.e, (int)resourceAllocationTracker882.j, (int)resourceAllocationTracker882.u, (int)resourceAllocationTracker882.D);
                    break block23;
                }
                try {
                    if (bl) {
                        Ne.h.z(3089);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
            }
            if (!asyncTaskOrchestrator.N().isEmpty()) {
                this.r();
                for (Supplier supplier : asyncTaskOrchestrator.N()) {
                    supplier.get();
                }
                ContextualActionResolver.L();
                this.a();
                continue;
            }
            try {
                if (asyncTaskOrchestrator.B() != null) {
                    asyncTaskOrchestrator.B().get();
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
            try {
                this.E.A(asyncTaskOrchestrator);
                if (!this.b) continue;
                this.E.Q();
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
        }
        this.R.clear();
        this.g = null;
        Ne.h.z(3089);
        this.r();
        z6.D = new RL();
        ZJ.h(f);
    }

    public void T() {
        this.u = this.F;
    }

    public void r() {
        long l = a ^ 0x1C81334B333AL;
        GL30.glBindVertexArray((int)0);
        this.g();
        GL30.glBindVertexArray((int)this.z);
        GL20.glUseProgram((int)this.t);
        GL11.glBindTexture((int)3553, (int)this.W);
        GL30.glBindFramebuffer((int)CryptographicSessionController.a("t", (int)21271, (long)(0x51553EBE119B29E0L ^ l)), (int)this.w);
        GL15.glBindBuffer((int)CryptographicSessionController.a("t", (int)17198, (long)(0x321FCCC8864C39D8L ^ l)), (int)this.v);
        GL15.glBindBuffer((int)CryptographicSessionController.a("t", (int)27045, (long)(0x3C7BE75DB4411347L ^ l)), (int)this.C);
        this.b = false;
    }

    public static void G() {
        T = null;
    }

    private void D() {
        try {
            this.f = GL11.glIsEnabled((int)2884);
            this.U = GL11.glIsEnabled((int)3042);
            this.c = GL11.glIsEnabled((int)2929);
            if (this.f) {
                Ne.h.z(2884);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        try {
            if (!this.U) {
                Ne.h.y(3042);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        try {
            if (this.c) {
                Ne.h.z(2929);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        tl.P(770, 771);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicSessionController.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicSessionController.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public CryptographicSessionController() {
        long l = a ^ 0x6CD2090D2B3BL;
        this.B = new ArrayList();
        this.R = new ArrayList();
        this.u = (int)CryptographicSessionController.a("t", (int)20514, (long)(0x35CB73E07CB8B2C9L ^ l));
        this.Z = 0L;
        this.F = 0;
        TemporalMetadataResolver.x((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)3958, (long)(0x2FD4FFA0D3E56D94L ^ l)), (long)-3490812877706154145L, (long)l)));
        NumericTransformer.I();
        this.P = NumericTransformer.d;
        TemporalMetadataResolver.x((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)15229, (long)(0x1CD7BA1B8D585997L ^ l)), (long)-3490812877706154145L, (long)l)));
        ProtocolConfigurationEnum[] protocolConfigurationEnumArray = new ProtocolConfigurationEnum[]{ProtocolConfigurationEnum.Float, ProtocolConfigurationEnum.Vec3, ProtocolConfigurationEnum.Vec2, ProtocolConfigurationEnum.Vec4, ProtocolConfigurationEnum.Float, ProtocolConfigurationEnum.Float, ProtocolConfigurationEnum.Vec2, ProtocolConfigurationEnum.Float, ProtocolConfigurationEnum.Float, ProtocolConfigurationEnum.Vec2, ProtocolConfigurationEnum.Vec2, ProtocolConfigurationEnum.Vec4, ProtocolConfigurationEnum.Vec3, ProtocolConfigurationEnum.Float, ProtocolConfigurationEnum.Vec4};
        this.E = new GraphicsComputationKernel(this.P, 5000, protocolConfigurationEnumArray);
        TemporalMetadataResolver.x((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)29927, (long)(0x131B23648D12160BL ^ l)), (long)-3490812877706154145L, (long)l)));
        MethodInvocationResolver.g().d((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)23453, (long)(0x7229F1A69EA3973L ^ l)), (long)-3490812877706154145L, (long)l)));
    }

    private int P() {
        block7: {
            long l = System.currentTimeMillis();
            try {
                if (this.u != 999 && l - this.Z < 1000L) break block7;
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
            this.Z = l;
            int n = this.u;
            try {
                try {
                    this.y();
                    if (n == 999 || n == this.u) break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
                if (this.u != -1) {
                    // empty if block
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
        }
        return this.u;
    }

    private void a() {
        long l = a ^ 0x36356F252197L;
        this.z = GL11.glGetInteger((int)CryptographicSessionController.a("t", (int)10553, (long)(0x200F6DBF50F6C17CL ^ l)));
        this.t = GL11.glGetInteger((int)CryptographicSessionController.a("t", (int)31676, (long)(0x22A5727DE90913F8L ^ l)));
        this.W = GL11.glGetInteger((int)CryptographicSessionController.a("t", (int)26989, (long)(0x7F46357760610120L ^ l)));
        this.w = GL11.glGetInteger((int)CryptographicSessionController.a("t", (int)32412, (long)(0x2371C073C7ED16D6L ^ l)));
        this.v = GL11.glGetInteger((int)CryptographicSessionController.a("t", (int)13480, (long)(0x72C3DBE2A5205CEBL ^ l)));
        this.C = GL11.glGetInteger((int)CryptographicSessionController.a("t", (int)19745, (long)(0x63E9D3B189B2A569L ^ l)));
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 18;
                break;
            }
            case 1: {
                n3 = 61;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 63;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 48;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 3;
                break;
            }
            case 12: {
                n3 = 41;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 24;
                break;
            }
            case 15: {
                n3 = 25;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 53;
                break;
            }
            case 18: {
                n3 = 40;
                break;
            }
            case 19: {
                n3 = 33;
                break;
            }
            case 20: {
                n3 = 28;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 14;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 51;
                break;
            }
            case 28: {
                n3 = 19;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 21;
                break;
            }
            case 34: {
                n3 = 23;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 46;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 27;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 13;
                break;
            }
            case 49: {
                n3 = 32;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 1;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 43;
                break;
            }
            case 54: {
                n3 = 30;
                break;
            }
            case 55: {
                n3 = 38;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 54;
                break;
            }
            case 58: {
                n3 = 29;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 36;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 56;
                break;
            }
            default: {
                n3 = 20;
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
        CryptographicSessionController.j[n4] = new String(cArray);
        return n4;
    }

    public void O(RuntimeInstrumentationEngine runtimeInstrumentationEngine) {
        block3: {
            block2: {
                try {
                    if (!this.R(runtimeInstrumentationEngine, this.r, true)) break block2;
                    this.B.add(new AsyncTaskOrchestrator(runtimeInstrumentationEngine));
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
            }
            AsyncTaskOrchestrator asyncTaskOrchestrator = this.B.get(this.B.size() - 1);
            asyncTaskOrchestrator.U();
            asyncTaskOrchestrator.m(runtimeInstrumentationEngine);
        }
        this.r = runtimeInstrumentationEngine;
    }

    public static CryptographicSessionController x() {
        long l = a ^ 0x598F6B2988DBL;
        try {
            if (!ConfigurationManager.U()) {
                throw new IllegalStateException((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)32410, (long)(0xFE9C7D87B6C3F97L ^ l)), (long)7813201592052845759L, (long)l)));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        try {
            if (T == null) {
                TemporalMetadataResolver.x((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)22922, (long)(0x340992D3E857988FL ^ l)), (long)7813201592052845759L, (long)l)));
                T = new CryptographicSessionController();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        return T;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == '\u00cd' || c == '\u00f6' || c == 'j') {
                field = CryptographicSessionController.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicSessionController.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSessionController.a = MultiContainerRegistry.a(-8449448433678824274L, -6316693674297537556L, MethodHandles.lookup().lookupClass()).a(136319246059065L);
                CryptographicSessionController.i = new Object[5];
                CryptographicSessionController.j = new String[5];
                CryptographicSessionController.b();
                CryptographicSessionController.h = new HashMap<K, V>(13);
                var0 = CryptographicSessionController.a ^ 73818582057758L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "\u008b\u00db\u00efY\u00db\u0097\u00fe\u008a\u00d5AJ\u00e4\u00b1\u008f[\u00e8\u0011\u00a0xVY\u00c6\u00af\u00f7\u00bc\bBX\u00e3D?\u0090\u00ae\u00fak\u001c\u00fe\u00e8\u0016\u009c~\u001b\u00c1\u001by]\u0093\f\u001ePe\u00d0\u00abD\u0091\u0093i\u0013\u000eM\u000f\u007ff\u00b3\u009d\u0087\u00b3\u00ac\nG\u00aaZ\u00c9\u00fd\u00f1\u009c\u00c5\u0082\u00a2\u009d\u0093;c\u00b5\u0001\u00d4}\u000e\u00c4\u00d99U\u00d8\u000f\u00c8G\u00b2\u00ef\u0083\u00c1\u00afMUa\u0088\u00a6\u001a\u00136f;B\u008e\u00f3\u001c\u008f\u00f0\u009d\u0087=5\u00dc\u00d9\u00d3\u00b9\u00df\u00e0\u0093";
                var7_6 = "\u008b\u00db\u00efY\u00db\u0097\u00fe\u008a\u00d5AJ\u00e4\u00b1\u008f[\u00e8\u0011\u00a0xVY\u00c6\u00af\u00f7\u00bc\bBX\u00e3D?\u0090\u00ae\u00fak\u001c\u00fe\u00e8\u0016\u009c~\u001b\u00c1\u001by]\u0093\f\u001ePe\u00d0\u00abD\u0091\u0093i\u0013\u000eM\u000f\u007ff\u00b3\u009d\u0087\u00b3\u00ac\nG\u00aaZ\u00c9\u00fd\u00f1\u009c\u00c5\u0082\u00a2\u009d\u0093;c\u00b5\u0001\u00d4}\u000e\u00c4\u00d99U\u00d8\u000f\u00c8G\u00b2\u00ef\u0083\u00c1\u00afMUa\u0088\u00a6\u001a\u00136f;B\u008e\u00f3\u001c\u008f\u00f0\u009d\u0087=5\u00dc\u00d9\u00d3\u00b9\u00df\u00e0\u0093".length();
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
                    var6_5 = "\u00c4\u008b!\u0086P\u008aEe\u00a9\tzA\u00ff\u008f\u00edf";
                    var7_6 = "\u00c4\u008b!\u0086P\u008aEe\u00a9\tzA\u00ff\u008f\u00edf".length();
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
        CryptographicSessionController.d = var8_3;
        CryptographicSessionController.e = new Integer[18];
    }

    public GraphicsComputationKernel t() {
        return this.E;
    }

    public void F(float f) {
        try {
            if (this.B.isEmpty()) {
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        ZJ.h(f);
        for (AsyncTaskOrchestrator asyncTaskOrchestrator : this.B) {
            try {
                if (!this.b) {
                    this.L();
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
            asyncTaskOrchestrator.O().B();
            if (!asyncTaskOrchestrator.N().isEmpty()) {
                this.r();
                for (Supplier<Void> supplier : asyncTaskOrchestrator.N()) {
                    supplier.get();
                }
                this.a();
                continue;
            }
            try {
                this.E.A(asyncTaskOrchestrator);
                if (!this.b) continue;
                this.E.Q();
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
        }
        this.r = null;
        this.B.clear();
        this.r();
        z6.D = new RL();
        ZJ.n();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicSessionController.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicSessionController.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicSessionController.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicSessionController.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicSessionController.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicSessionController.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicSessionController.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicSessionController.b(251066690329081L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicSessionController.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicSessionController.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicSessionController.b(251066690329081L, 0L);
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

    private boolean R(RuntimeInstrumentationEngine runtimeInstrumentationEngine, RuntimeInstrumentationEngine runtimeInstrumentationEngine2, boolean bl) {
        block34: {
            block31: {
                NumericScrambler numericScrambler;
                NumericScrambler numericScrambler2;
                block33: {
                    try {
                        if (runtimeInstrumentationEngine2 == null) {
                            return true;
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CryptographicSessionController.a(illegalStateException);
                    }
                    try {
                        if (runtimeInstrumentationEngine.V() != runtimeInstrumentationEngine2.V()) {
                            return true;
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CryptographicSessionController.a(illegalStateException);
                    }
                    numericScrambler2 = runtimeInstrumentationEngine.I();
                    numericScrambler = runtimeInstrumentationEngine2.I();
                    try {
                        block32: {
                            try {
                                try {
                                    if (numericScrambler2 == numericScrambler) break block31;
                                    if (numericScrambler2 == null) break block32;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw CryptographicSessionController.a(illegalStateException);
                                }
                                if (numericScrambler != null) break block33;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw CryptographicSessionController.a(illegalStateException);
                            }
                        }
                        return true;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CryptographicSessionController.a(illegalStateException);
                    }
                }
                try {
                    if (numericScrambler2.M != numericScrambler.M) {
                        return true;
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
            }
            try {
                try {
                    if (runtimeInstrumentationEngine.V() == null && runtimeInstrumentationEngine2.V() == null) break block34;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
                return true;
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
        }
        z1 z12 = runtimeInstrumentationEngine.B();
        z1 z13 = runtimeInstrumentationEngine2.B();
        try {
            if (!Objects.equals((Object)z12, (Object)z13)) {
                return true;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        try {
            if (!runtimeInstrumentationEngine.N.z(runtimeInstrumentationEngine2.N)) {
                return true;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        DecompilationValidator decompilationValidator = runtimeInstrumentationEngine.n();
        DecompilationValidator decompilationValidator2 = runtimeInstrumentationEngine2.n();
        try {
            if (!Objects.equals(decompilationValidator, decompilationValidator2)) {
                return true;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        ResourceAllocationTracker882 resourceAllocationTracker882 = runtimeInstrumentationEngine.A();
        ResourceAllocationTracker882 resourceAllocationTracker8822 = runtimeInstrumentationEngine2.A();
        try {
            if (!Objects.equals(resourceAllocationTracker882, resourceAllocationTracker8822)) {
                return true;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        return this.v(runtimeInstrumentationEngine, bl);
    }

    private static Field c(long l, long l2) {
        int n = CryptographicSessionController.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicSessionController.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicSessionController.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicSessionController.a(clazz3, string2, clazz2)) != null) {
                    CryptographicSessionController.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicSessionController.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicSessionController.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicSessionController.b(251066690329081L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Loose catch block
     */
    public void y() {
        block11: {
            if (!GameVersionEnumerator.MC_1_21_10.H()) break block11;
            try {
                int n;
                BinaryTransformer binaryTransformer;
                block13: {
                    block12: {
                        Df df = ApplicationLifecycleManager.d();
                        try {
                            if (df == null || !df.r()) break block11;
                        }
                        catch (Exception exception) {
                            throw CryptographicSessionController.a(exception);
                        }
                        binaryTransformer = df.m();
                        try {
                            if (binaryTransformer == null || !binaryTransformer.r()) break block11;
                        }
                        catch (Exception exception) {
                            throw CryptographicSessionController.a(exception);
                        }
                        BinaryTransformer binaryTransformer2 = df.k();
                        if (binaryTransformer2 == null) break block12;
                        try {
                            block14: {
                                if (!binaryTransformer2.r()) break block12;
                                break block14;
                                catch (Exception exception) {
                                    throw CryptographicSessionController.a(exception);
                                }
                            }
                            n = binaryTransformer2.i();
                            break block13;
                        }
                        catch (Exception exception) {
                            throw CryptographicSessionController.a(exception);
                        }
                    }
                    n = 0;
                }
                int n2 = n;
                int n3 = binaryTransformer.b(n2);
                if (n3 > 0) {
                    this.u = n3;
                    return;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.u = -1;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicSessionController.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicSessionController.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void p(RuntimeInstrumentationEngine runtimeInstrumentationEngine) {
        block6: {
            block5: {
                long l = a ^ 0x3FCCE96ECB90L;
                try {
                    if (runtimeInstrumentationEngine.I() == null) {
                        runtimeInstrumentationEngine.D(MethodInvocationResolver.g().O((String)((Object)CryptographicSessionController.b("\u00fc", (int)CryptographicSessionController.a("t", (int)9372, (long)(0x6BC4F8E52E6FA6D0L ^ l)), (long)3397252542744547316L, (long)l))).q());
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
                try {
                    if (!this.R(runtimeInstrumentationEngine, this.g, false)) break block5;
                    this.R.add(new AsyncTaskOrchestrator(runtimeInstrumentationEngine));
                    break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
            }
            AsyncTaskOrchestrator asyncTaskOrchestrator = this.R.get(this.R.size() - 1);
            asyncTaskOrchestrator.U();
            asyncTaskOrchestrator.m(runtimeInstrumentationEngine);
        }
        this.g = runtimeInstrumentationEngine;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/KP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean v(RuntimeInstrumentationEngine runtimeInstrumentationEngine, boolean bl) {
        boolean bl2;
        AsyncTaskOrchestrator asyncTaskOrchestrator;
        block8: {
            try {
                try {
                    if (runtimeInstrumentationEngine.D() != null && runtimeInstrumentationEngine.q() != null) break block8;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CryptographicSessionController.a(illegalStateException);
                }
                return false;
            }
            catch (IllegalStateException illegalStateException) {
                throw CryptographicSessionController.a(illegalStateException);
            }
        }
        try {
            asyncTaskOrchestrator = bl ? this.B.get(this.B.size() - 1) : this.R.get(this.R.size() - 1);
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        AsyncTaskOrchestrator asyncTaskOrchestrator2 = asyncTaskOrchestrator;
        try {
            bl2 = asyncTaskOrchestrator2.w().size() >= 4500;
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        return bl2;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static void b() {
        Object[] objectArray = i;
        i[0] = "\u0018a1";
        objectArray[1] = Integer.TYPE;
        CryptographicSessionController.j[1] = "java/lang/Integer";
        objectArray[2] = "P\u0010QFB\u0001[\u001f@\t?\u0019H\u0018I@";
        objectArray[3] = "?+\u0007:S/4$\u0016u2!?/\u0012/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "N\nNi#\u0010\u0011\tZ\u0015tU,\u000f\u000brd\u0014P\\\bja.\u0015G\r{}NU\u000eMg\u001f";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicSessionController.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void L() {
        long l = a ^ 0x65DF143B19DCL;
        this.a();
        int n = this.P();
        try {
            if (n != -1) {
                GL30.glBindFramebuffer((int)CryptographicSessionController.a("t", (int)21949, (long)(0x6AFFFF47F6AA05BAL ^ l)), (int)n);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        this.D();
        this.E.C();
        this.b = true;
    }

    public void p(int n) {
        this.F = this.P();
        this.u = n;
    }

    public int E(boolean bl) {
        try {
            if (bl) {
                return this.B.get(this.B.size() - 1).k();
            }
            return this.R.get(this.R.size() - 1).k();
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private void g() {
        try {
            if (this.f) {
                Ne.h.y(2884);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
        try {
            if (this.c) {
                Ne.h.y(2929);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CryptographicSessionController.a(illegalStateException);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/KP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSessionController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptographicSessionController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

