/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.FO;
import a.GB;
import com.app.exceptions.CustomExecutionException;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.geospatial.resolver.GeoLocationResolver;
import com.graphics.model.GeometricColorDescriptor;
import com.graphics.rendering.FontRenderManager;
import com.media.imaging.ImageMetadataDescriptor;
import com.processing.iteration.BatchSequenceIterator;
import com.security.auth.AuthenticationProvider;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class GraphicsRenderEngine {
    private boolean Z;
    private final int D;
    private static ByteBuffer p;
    private final List W = new ArrayList(32);
    private final int Y;
    private static Graphics2D a;
    private static final long[] c;
    private final ImageMetadataDescriptor y;
    private int N;
    private static BufferedImage Q;
    private static final Integer[] d;
    private static final long b;
    public static FontRenderContext r;
    private static IntBuffer v;
    private int P;
    private static final Map e;
    private int R;
    private final FontRenderManager F;
    private static final GB k;

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicsRenderEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public GraphicsRenderEngine(FontRenderManager fontRenderManager, int n, int n2) throws CustomExecutionException {
        this.F = fontRenderManager;
        this.D = n;
        this.Y = n2;
        this.y = new ImageMetadataDescriptor(n, n2);
    }

    public static Graphics2D R() {
        return a;
    }

    public int M(List list, int n) throws CustomExecutionException {
        boolean bl;
        int n2;
        block28: {
            try {
                if (this.N == 0 || n != -1) break block28;
            }
            catch (CustomExecutionException customExecutionException) {
                throw GraphicsRenderEngine.a(customExecutionException);
            }
            n2 = this.R;
            int n3 = this.P;
            int n4 = this.N;
            Iterator iterator = this.W(list);
            while (iterator.hasNext()) {
                FO fO2 = (FO)iterator.next();
                int n5 = fO2.P();
                int n6 = fO2.q();
                if (n2 + n5 >= this.D) {
                    n2 = 0;
                    n3 += n4;
                    n4 = n6;
                } else if (n6 > n4) {
                    n4 = n6;
                }
                try {
                    if (n3 + n4 >= this.D) {
                        return 0;
                    }
                }
                catch (CustomExecutionException customExecutionException) {
                    throw GraphicsRenderEngine.a(customExecutionException);
                }
                n2 += n5;
            }
        }
        GeometricColorDescriptor.m.t();
        this.y.O();
        n2 = 0;
        Iterator iterator = this.W(list);
        while (iterator.hasNext()) {
            boolean bl2;
            block35: {
                block34: {
                    int n7;
                    int n8;
                    FO fO3;
                    block30: {
                        block31: {
                            block29: {
                                fO3 = (FO)iterator.next();
                                n8 = Math.min(256, fO3.P());
                                n7 = Math.min(256, fO3.q());
                                try {
                                    if (this.N != 0) break block29;
                                    this.N = n7;
                                    break block30;
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw GraphicsRenderEngine.a(customExecutionException);
                                }
                            }
                            try {
                                try {
                                    if (this.R + n8 < this.D) break block31;
                                    if (this.P + this.N + n7 >= this.Y) {
                                        break;
                                    }
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw GraphicsRenderEngine.a(customExecutionException);
                                }
                            }
                            catch (CustomExecutionException customExecutionException) {
                                throw GraphicsRenderEngine.a(customExecutionException);
                            }
                            this.R = 0;
                            this.P += this.N;
                            this.N = n7;
                            break block30;
                        }
                        try {
                            try {
                                if (n7 <= this.N) break block30;
                                if (this.P + n7 >= this.Y) {
                                    break;
                                }
                            }
                            catch (CustomExecutionException customExecutionException) {
                                throw GraphicsRenderEngine.a(customExecutionException);
                            }
                        }
                        catch (CustomExecutionException customExecutionException) {
                            throw GraphicsRenderEngine.a(customExecutionException);
                        }
                        this.N = n7;
                    }
                    try {
                        try {
                            this.I(fO3, n8, n7);
                            this.W.add(fO3);
                            this.R += n8;
                            iterator.remove();
                            if (++n2 != n) continue;
                            GraphicsRenderEngine graphicsRenderEngine = this;
                            if (this.Z) break block34;
                        }
                        catch (CustomExecutionException customExecutionException) {
                            throw GraphicsRenderEngine.a(customExecutionException);
                        }
                        bl2 = true;
                        break block35;
                    }
                    catch (CustomExecutionException customExecutionException) {
                        throw GraphicsRenderEngine.a(customExecutionException);
                    }
                }
                bl2 = false;
            }
            graphicsRenderEngine.Z = bl2;
            break;
        }
        try {
            GraphicsRenderEngine graphicsRenderEngine = this;
            bl = !this.Z;
        }
        catch (CustomExecutionException customExecutionException) {
            throw GraphicsRenderEngine.a(customExecutionException);
        }
        graphicsRenderEngine.Z = bl;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(1855878317011387838L, -3372479602493467563L, MethodHandles.lookup().lookupClass()).a(197794387993380L);
        long l = b ^ 0x4D5A2365EE31L;
        e = new HashMap(13);
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
        String string = "\u00d3\u00ff\u0019W\u00c9\u00d6,*:\u0089\u00e9K\u00cb\u001a(\u000e";
        int n2 = "\u00d3\u00ff\u0019W\u00c9\u00d6,*:\u0089\u00e9K\u00cb\u001a(\u000e".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
        k = GeoLocationResolver.Y();
        p = ByteBuffer.allocateDirect((int)GraphicsRenderEngine.a("r", (int)28162, (long)(0x23CD67B77C0B7BDCL ^ l)));
        p.order(ByteOrder.LITTLE_ENDIAN);
        v = p.asIntBuffer();
        Q = new BufferedImage(256, 256, 2);
        a = (Graphics2D)Q.getGraphics();
        a.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        a.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        a.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        r = a.getFontRenderContext();
    }

    private Iterator W(List list) {
        try {
            if (this.Z) {
                return list.iterator();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderEngine.a(customSystemException);
        }
        ListIterator listIterator = list.listIterator(list.size());
        return new BatchSequenceIterator(this, listIterator);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/FH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void I(FO fO2, int n, int n2) throws CustomExecutionException {
        long l = b ^ 0x334D0B44D6CEL;
        a.setComposite(AlphaComposite.Clear);
        a.fillRect(0, 0, 256, 256);
        a.setComposite(AlphaComposite.SrcOver);
        a.setColor(Color.white);
        Object object = this.F.I().iterator();
        try {
            while (object.hasNext()) {
                ((AuthenticationProvider)object.next()).T(Q, a, this.F, fO2);
            }
        }
        catch (CustomExecutionException customExecutionException) {
            throw GraphicsRenderEngine.a(customExecutionException);
        }
        fO2.f(null);
        object = Q.getRaster();
        int[] nArray = new int[n];
        try {
            for (int i = 0; i < n2; ++i) {
                ((Raster)object).getDataElements(0, i, n, 1, nArray);
                v.put(nArray);
            }
        }
        catch (CustomExecutionException customExecutionException) {
            throw GraphicsRenderEngine.a(customExecutionException);
        }
        k.N(3553, 0, this.R, this.P, n, n2, (int)GraphicsRenderEngine.a("r", (int)23781, (long)(0x3999B77C8EE571C5L ^ l)), 5121, p);
        v.clear();
        fO2.n(this.y.h(this.R, this.P, n, n2));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3500;
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
                throw new RuntimeException("a/FH", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicsRenderEngine.d[n2] = n3;
        }
        return d[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicsRenderEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

