/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 */
package com.data.obfuscation;

import a.tl;
import a.vC;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.low.level.processing.ByteManipulationEngine;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.config.ComputationalParameterConfigurator;
import com.system.configuration.ConfigurationManager;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;

public class NumericScrambler {
    private final int Q;
    public int i;
    public final int y;
    public int v;
    private static int L;
    public int t;
    public int b;
    private static final Map e;
    private static final Integer[] d;
    private static final long[] c;
    public int o;
    public int M;
    private static final long a;
    public int W;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x368A;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/WB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericScrambler.d[n2] = n3;
        }
        return d[n2];
    }

    public void j() {
        GL11.glDeleteTextures((int)this.M);
    }

    public void x(int n, int n2) {
        GL11.glTexParameteri((int)3553, (int)n, (int)n2);
    }

    public static NumericScrambler F(int n, int n2, ByteBuffer byteBuffer, int n3, int n4, int n5) {
        int n6;
        int n7;
        NumericScrambler numericScrambler;
        boolean bl;
        NumericScrambler numericScrambler2;
        int n8;
        long l;
        block16: {
            block15: {
                l = a ^ 0x3679AE4A3A0BL;
                n8 = tl.E();
                numericScrambler2 = new NumericScrambler();
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    numericScrambler2.v = n2;
                                    numericScrambler2.t = n;
                                    GL11.glBindTexture((int)3553, (int)numericScrambler2.M);
                                    GL11.glPixelStorei((int)3312, (int)0);
                                    GL11.glPixelStorei((int)3313, (int)0);
                                    GL11.glPixelStorei((int)3314, (int)0);
                                    GL11.glPixelStorei((int)NumericScrambler.a("j", (int)22784, (long)(0x3EA9E80B06F2B018L ^ l)), (int)0);
                                    GL11.glPixelStorei((int)3315, (int)0);
                                    GL11.glPixelStorei((int)3316, (int)0);
                                    GL11.glPixelStorei((int)NumericScrambler.a("j", (int)152, (long)(0x32E88B7BAF1B6981L ^ l)), (int)0);
                                    GL11.glPixelStorei((int)3317, (int)4);
                                    if (n4 == 9987 || n4 == 9985) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericScrambler.a(customSystemException);
                                }
                                if (n4 == 9986) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericScrambler.a(customSystemException);
                            }
                            if (n4 != 9984) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericScrambler.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericScrambler.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            numericScrambler = numericScrambler2;
            n7 = 10240;
            n6 = bl2 ? 9729 : n4;
        }
        catch (CustomSystemException customSystemException) {
            throw NumericScrambler.a(customSystemException);
        }
        numericScrambler.x(n7, n6);
        numericScrambler2.x(10241, n4);
        numericScrambler2.x(10242, n5);
        numericScrambler2.x(10243, n5);
        if (bl2) {
            int n9 = (int)Math.floor(Math.log(Math.max(n, n2)) / Math.log(2.0));
            GL11.glTexParameteri((int)3553, (int)NumericScrambler.a("j", (int)23404, (long)(0x389E127B92E9327FL ^ l)), (int)0);
            GL11.glTexParameteri((int)3553, (int)NumericScrambler.a("j", (int)25044, (long)(0x184AA25C4AFD08C4L ^ l)), (int)n9);
            GL11.glTexParameterf((int)3553, (int)NumericScrambler.a("j", (int)16144, (long)(0x68001122F047D601L ^ l)), (float)-0.4f);
            GL11.glTexParameterf((int)3553, (int)NumericScrambler.a("j", (int)27666, (long)(0x50189F39D6E78519L ^ l)), (float)0.0f);
            GL11.glTexParameterf((int)3553, (int)NumericScrambler.a("j", (int)6164, (long)(0x1264059FCFBF711DL ^ l)), (float)n9);
        }
        try {
            numericScrambler2.X(n3, n, n2, n3, byteBuffer);
            if (bl2) {
                GL30.glGenerateMipmap((int)3553);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericScrambler.a(customSystemException);
        }
        tl.O(n8);
        return numericScrambler2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/WB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void X(int n, int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.glTexImage2D((int)3553, (int)0, (int)n, (int)n2, (int)n3, (int)0, (int)n4, (int)5121, (ByteBuffer)byteBuffer);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NumericScrambler(InputStream inputStream, int n, int n2, vC vC2) throws IOException {
        long l = a ^ 0x34333C5346F0L;
        this.y = (int)NumericScrambler.a("j", (int)25434, (long)(0x5E8B673300A76BFL ^ l));
        this.Q = (int)NumericScrambler.a("j", (int)19891, (long)(0x7DD4FBFABE1ED847L ^ l));
        this.b = (int)NumericScrambler.a("j", (int)19139, (long)(0x65CFED279DAC5F27L ^ l));
        this.o = (int)NumericScrambler.a("j", (int)16315, (long)(0xCEBE4AB3F72A48L ^ l));
        this.W = (int)NumericScrambler.a("j", (int)786, (long)(0xCD4717E12F916F4L ^ l));
        this.i = (int)NumericScrambler.a("j", (int)30932, (long)(0x26AF7AEDCA0F6D22L ^ l));
        try {
            int n3;
            Object object = n;
            try {
                n3 = n == 9987 ? 9729 : n;
            }
            catch (IOException iOException) {
                throw NumericScrambler.a(iOException);
            }
            Object object2 = n3;
            boolean bl = GL11.glIsEnabled((int)3553);
            int n4 = tl.E();
            try {
                if (!bl) {
                    tl.B();
                }
            }
            catch (IOException iOException) {
                throw NumericScrambler.a(iOException);
            }
            if (n == 9987) {
                int n5 = GL11.glGetInteger((int)NumericScrambler.a("j", (int)28884, (long)(0x388B7C5C6E59E53AL ^ l)));
                if (n5 < 3) {
                    CallSite callSite = NumericScrambler.a("j", (int)30932, (long)(0x26AF7AEDCA0F6D22L ^ l));
                    object2 = callSite;
                    object = callSite;
                }
                if (ReflectionMetadataResolver.PQ != null) {
                    ContextCapabilities contextCapabilities = GLContext.getCapabilities();
                    if (!contextCapabilities.GL_ARB_framebuffer_object) {
                        CallSite callSite = NumericScrambler.a("j", (int)30932, (long)(0x26AF7AEDCA0F6D22L ^ l));
                        object2 = callSite;
                        object = callSite;
                    }
                }
            }
            ByteManipulationEngine byteManipulationEngine = new ByteManipulationEngine(inputStream);
            this.t = byteManipulationEngine.O();
            this.v = byteManipulationEngine.d();
            int n6 = 4;
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(4 * this.t * this.v));
            try {
                byteManipulationEngine.P(byteBuffer, this.t * 4, vC2);
                byteBuffer.flip();
                this.M = tl.f();
                this.p();
                ComputationalParameterConfigurator.m();
                GL11.glPixelStorei((int)3317, (int)1);
                GL11.glTexParameteri((int)3553, (int)10241, (int)object);
                GL11.glTexParameteri((int)3553, (int)10240, (int)object2);
                GL11.glTexParameteri((int)3553, (int)10242, (int)n2);
                GL11.glTexParameteri((int)3553, (int)10243, (int)n2);
                if (object == 9987) {
                    GL11.glTexParameteri((int)3553, (int)NumericScrambler.a("j", (int)18171, (long)(0x2444E83B20C45316L ^ l)), (int)0);
                    GL11.glTexParameteri((int)3553, (int)NumericScrambler.a("j", (int)26972, (long)(0xD6A53C1816FCBCL ^ l)), (int)1);
                }
            }
            catch (IOException iOException) {
                throw NumericScrambler.a(iOException);
            }
            try {
                GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)this.t, (int)this.v, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
                if (object == 9987) {
                    GL30.glGenerateMipmap((int)3553);
                }
            }
            catch (IOException iOException) {
                throw NumericScrambler.a(iOException);
            }
            try {
                tl.O(n4);
                if (!bl) {
                    tl.R();
                }
            }
            catch (IOException iOException) {
                throw NumericScrambler.a(iOException);
            }
        }
        catch (Throwable throwable) {
            try {
                if (inputStream == null) throw throwable;
                try {
                    inputStream.close();
                    throw throwable;
                }
                catch (IOException iOException) {
                    // empty catch block
                    throw throwable;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericScrambler.a(customSystemException);
            }
        }
        try {
            if (inputStream == null) return;
            try {
                inputStream.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericScrambler.a(customSystemException);
        }
    }

    public NumericScrambler(int n) {
        long l = a ^ 0x5850B4AD4196L;
        this.y = (int)NumericScrambler.a("j", (int)5049, (long)(0x3046269F2FC08136L ^ l));
        this.Q = (int)NumericScrambler.a("j", (int)16812, (long)(0x18F76F9A31C8533DL ^ l));
        this.b = (int)NumericScrambler.a("j", (int)13163, (long)(0x3222DC63D0BDA1E2L ^ l));
        this.o = (int)NumericScrambler.a("j", (int)10203, (long)(0x4947B57E56354CL ^ l));
        this.W = (int)NumericScrambler.a("j", (int)13571, (long)(0x661DB91C69D42782L ^ l));
        this.i = (int)NumericScrambler.a("j", (int)30932, (long)(0x26AF168E42F16A44L ^ l));
        this.M = n;
    }

    public NumericScrambler(InputStream inputStream, int n, vC vC2) throws IOException {
        long l = a ^ 0x47D7A54AECAL;
        this(inputStream, n, (int)NumericScrambler.a("j", (int)4214, (long)(0x1924F34D264C6DADL ^ l)), vC2);
    }

    public void L(int n) {
        long l = a ^ 0xD67A41D743CL;
        try {
            if (!ConfigurationManager.U()) {
                this.p();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericScrambler.a(customSystemException);
        }
        GL13.glActiveTexture((int)(NumericScrambler.a("j", (int)32336, (long)(0xE23A61AAC3CD970L ^ l)) + n));
        tl.O(this.M);
    }

    public void p() {
        block3: {
            block2: {
                try {
                    if (!ConfigurationManager.U()) break block2;
                    this.L(0);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericScrambler.a(customSystemException);
                }
            }
            tl.O(this.M);
            L = this.M;
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericScrambler.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public NumericScrambler(InputStream inputStream) throws IOException {
        this(inputStream, 9729, vC.RGBA);
    }

    public NumericScrambler() {
        long l = a ^ 0x3A208DD3A809L;
        this.y = (int)NumericScrambler.a("j", (int)25434, (long)(0x5E8B860818A9846L ^ l));
        this.Q = (int)NumericScrambler.a("j", (int)19891, (long)(0x7DD4F5E90F9E36BEL ^ l));
        this.b = (int)NumericScrambler.a("j", (int)19139, (long)(0x65CFE3342C2CB1DEL ^ l));
        this.o = (int)NumericScrambler.a("j", (int)16315, (long)(0xCEB0590277C4B1L ^ l));
        this.W = (int)NumericScrambler.a("j", (int)786, (long)(0xCD47F6DA379F80DL ^ l));
        this.i = (int)NumericScrambler.a("j", (int)30932, (long)(0x26AF74FE7B8F83DBL ^ l));
        this.M = GL11.glGenTextures();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NumericScrambler.a = MultiContainerRegistry.a(1176664235888451576L, 5527722016404917952L, MethodHandles.lookup().lookupClass()).a(157826811182130L);
                NumericScrambler.e = new HashMap<K, V>(13);
                var0 = NumericScrambler.a ^ 60744049387887L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "\u0005\u009d\u00e4\u00a9h)\u00e8d\u009c\u00e5\u00ab\u00cfm\u009b\u0013\u00aa\u009a\u00d9\u00a5\u00c4\u0014\u00bc\u009c\u00d0\u00d6\u00b8\u00d6D/\u0081P\u0019nY\u00ad|en\u008e\b\u00d3\u00a5dS\u00e5\u0014\u00dc7\u00809R\u0011\u0081\u00e3\u0082\u0099\u00c0\u00e2\u0006\u0081)\u00ec<\u000en\u00b4_\u0015\u00c4\u0081\u00bc\u00bc\u00c3\u00fc{\u00be]\nR.:8\u00a5\u00ba\u00b6\u007fq,y\u0092\u0014D\u000f\u0091\u0010x\u0084\u00d9\u0084r\u00c33/\u00a7\u0082\u00dbhI;@\u00d7\u00a1\u00fd\u00f2\u0095\u00fb\u00cc\u00e27\u0088\u00da)z\u00b1\u00d0\u00bd\u00bd\u00dd\u00c0\u00ff\u0081\u0091\u00e9c\u00c8\u00a0\u00f9\u009a\u00ff\t+\u00ac\u00c1\u00ab\u008e1c\u00b8\u00f3\u001cP>\u0018\u000e[\u0090\u00db\u00bf\u0012\u0017\u00c0\u00bb\u0011f\u00cb\u00166\u00c5";
                var7_6 = "\u0005\u009d\u00e4\u00a9h)\u00e8d\u009c\u00e5\u00ab\u00cfm\u009b\u0013\u00aa\u009a\u00d9\u00a5\u00c4\u0014\u00bc\u009c\u00d0\u00d6\u00b8\u00d6D/\u0081P\u0019nY\u00ad|en\u008e\b\u00d3\u00a5dS\u00e5\u0014\u00dc7\u00809R\u0011\u0081\u00e3\u0082\u0099\u00c0\u00e2\u0006\u0081)\u00ec<\u000en\u00b4_\u0015\u00c4\u0081\u00bc\u00bc\u00c3\u00fc{\u00be]\nR.:8\u00a5\u00ba\u00b6\u007fq,y\u0092\u0014D\u000f\u0091\u0010x\u0084\u00d9\u0084r\u00c33/\u00a7\u0082\u00dbhI;@\u00d7\u00a1\u00fd\u00f2\u0095\u00fb\u00cc\u00e27\u0088\u00da)z\u00b1\u00d0\u00bd\u00bd\u00dd\u00c0\u00ff\u0081\u0091\u00e9c\u00c8\u00a0\u00f9\u009a\u00ff\t+\u00ac\u00c1\u00ab\u008e1c\u00b8\u00f3\u001cP>\u0018\u000e[\u0090\u00db\u00bf\u0012\u0017\u00c0\u00bb\u0011f\u00cb\u00166\u00c5".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "#\u00ecA\u00b8G\u00e8l\u0007\u0018l+\u0086\u00e2\u009e\u008eR";
                    var7_6 = "#\u00ecA\u00b8G\u00e8l\u0007\u0018l+\u0086\u00e2\u009e\u008eR".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        NumericScrambler.c = var8_3;
        NumericScrambler.d = new Integer[23];
        NumericScrambler.L = 0;
    }

    public void m() {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericScrambler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

