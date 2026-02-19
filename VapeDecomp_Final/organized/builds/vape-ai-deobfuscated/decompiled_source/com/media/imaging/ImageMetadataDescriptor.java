/*
 * Decompiled with CFR 0.152.
 */
package com.media.imaging;

import a.GB;
import com.app.core.transformation.TransformationStrategy;
import com.app.exceptions.CustomExecutionException;
import com.collections.management.MultiContainerRegistry;
import com.config.feature.FeatureFlagManager;
import com.exception.system.CustomSystemException;
import com.geospatial.resolver.GeoLocationResolver;
import com.graphics.memory.TextureMemoryManager;
import com.graphics.model.GeometricColorDescriptor;
import com.network.protocol.ProtocolNegotiationInterface;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ImageMetadataDescriptor
implements TransformationStrategy {
    protected String R;
    private int E;
    protected int b;
    protected float L;
    protected float c;
    protected float Y;
    protected ProtocolNegotiationInterface V;
    private static final long a = MultiContainerRegistry.a(-5830073898303792813L, -5027810087149597915L, MethodHandles.lookup().lookupClass()).a(222464179872734L);
    protected int N;
    protected float w;
    protected float t;
    private static final Integer[] e;
    protected float H;
    protected boolean S;
    protected GeometricColorDescriptor[] g;
    private static final Map f;
    private static final long[] d;
    protected float K;
    protected static GB X;

    public String toString() {
        this.g();
        return "[Image " + this.R + " " + this.b + "x" + this.N + "  " + this.L + "," + this.w + "," + this.Y + "," + this.c + "]";
    }

    public int w() {
        this.g();
        return this.N;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/e8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ImageMetadataDescriptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x982CC9FBD6BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u001d\u00a3\u00a3\u00ff\u00f5\u00dfF\u00f4\u009eY\u00a52\u0093\u00b0w8";
        int n2 = "\u001d\u00a3\u00a3\u00ff\u00f5\u00dfF\u00f4\u009eY\u00a52\u0093\u00b0w8".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[2];
        X = GeoLocationResolver.Y();
    }

    public void s(float f, float f2, float f3, float f4) {
        block3: {
            block2: {
                try {
                    this.g();
                    if (this.g != null) break block2;
                    X.C(this.L, this.w);
                    X.h(f, f2, 0.0f);
                    X.C(this.L, this.w + this.c);
                    X.h(f, f2 + f4, 0.0f);
                    X.C(this.L + this.Y, this.w + this.c);
                    X.h(f + f3, f2 + f4, 0.0f);
                    X.C(this.L + this.Y, this.w);
                    X.h(f + f3, f2, 0.0f);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ImageMetadataDescriptor.a(customSystemException);
                }
            }
            this.g[0].t();
            X.C(this.L, this.w);
            X.h(f, f2, 0.0f);
            this.g[3].t();
            X.C(this.L, this.w + this.c);
            X.h(f, f2 + f4, 0.0f);
            this.g[2].t();
            X.C(this.L + this.Y, this.w + this.c);
            X.h(f + f3, f2 + f4, 0.0f);
            this.g[1].t();
            X.C(this.L + this.Y, this.w);
            X.h(f + f3, f2, 0.0f);
        }
    }

    protected void n() {
    }

    public ProtocolNegotiationInterface l() {
        return this.V;
    }

    public ImageMetadataDescriptor h(int n, int n2, int n3, int n4) {
        this.g();
        float f = (float)n / (float)this.b * this.Y + this.L;
        float f2 = (float)n2 / (float)this.N * this.c + this.w;
        float f3 = (float)n3 / (float)this.b * this.Y;
        float f4 = (float)n4 / (float)this.N * this.c;
        ImageMetadataDescriptor imageMetadataDescriptor = new ImageMetadataDescriptor();
        imageMetadataDescriptor.S = true;
        imageMetadataDescriptor.V = this.V;
        imageMetadataDescriptor.L = f;
        imageMetadataDescriptor.w = f2;
        imageMetadataDescriptor.Y = f3;
        imageMetadataDescriptor.c = f4;
        imageMetadataDescriptor.b = n3;
        imageMetadataDescriptor.N = n4;
        imageMetadataDescriptor.R = this.R;
        imageMetadataDescriptor.t = n3 / 2;
        imageMetadataDescriptor.K = n4 / 2;
        return imageMetadataDescriptor;
    }

    public void O() {
        this.V.P();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4586;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/e8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ImageMetadataDescriptor.e[n2] = n3;
        }
        return e[n2];
    }

    public ImageMetadataDescriptor(int n, int n2) throws CustomExecutionException {
        this(n, n2, 2);
    }

    public ImageMetadataDescriptor(int n, int n2, int n3) throws CustomExecutionException {
        long l = a ^ 0x37A51C62F367L;
        this.H = 1.0f;
        this.S = false;
        this.E = (int)ImageMetadataDescriptor.a("l", (int)12405, (long)(0x27785B33B4B7E516L ^ l));
        this.R = super.toString();
        this.E = n3 == 1 ? 9729 : 9728;
        try {
            this.V = TextureMemoryManager.g().j(n, n2, this.E);
        }
        catch (IOException iOException) {
            FeatureFlagManager.j(iOException);
            throw new CustomExecutionException("Failed to create empty image " + n + "x" + n2);
        }
        this.g();
    }

    public int Y() {
        this.g();
        return this.b;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    protected final void g() {
        try {
            if (this.S) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ImageMetadataDescriptor.a(customSystemException);
        }
        try {
            this.S = true;
            if (this.V != null) {
                this.b = this.V.k();
                this.N = this.V.I();
                this.L = 0.0f;
                this.w = 0.0f;
                this.Y = this.V.n();
                this.c = this.V.A();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ImageMetadataDescriptor.a(customSystemException);
        }
        this.n();
        this.t = this.b / 2;
        this.K = this.N / 2;
    }

    protected ImageMetadataDescriptor() {
        long l = a ^ 0x73910C809810L;
        this.H = 1.0f;
        this.S = false;
        this.E = (int)ImageMetadataDescriptor.a("l", (int)26538, (long)(0x20E15121F32259BFL ^ l));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ImageMetadataDescriptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

