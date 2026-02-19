/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.model;

import a.GB;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.geospatial.resolver.GeoLocationResolver;
import java.io.Serializable;
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

public class GeometricColorDescriptor
implements Serializable {
    public static final GeometricColorDescriptor L;
    private static final long serialVersionUID = 1393939L;
    public static final GeometricColorDescriptor W;
    public float F;
    public float P;
    private static final Integer[] d;
    public static final GeometricColorDescriptor o;
    public static final GeometricColorDescriptor K;
    private static final Map g;
    public static final GeometricColorDescriptor m;
    public float I;
    public static final GeometricColorDescriptor N;
    private static final long a;
    public static final GeometricColorDescriptor x;
    protected transient GB r;
    public static final GeometricColorDescriptor M;
    private static final long[] b;
    public static final GeometricColorDescriptor v;
    public static final GeometricColorDescriptor l;
    public static final GeometricColorDescriptor c;
    public static final GeometricColorDescriptor e;
    public float f;
    public static final GeometricColorDescriptor w;
    public static final GeometricColorDescriptor R;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x256C;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ZT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GeometricColorDescriptor.d[n2] = n3;
        }
        return d[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-7106451845539343897L, -7526466757408550904L, MethodHandles.lookup().lookupClass()).a(82790635031341L);
        g = new HashMap(13);
        long l = a ^ 0x4FA72DC1450EL;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00b0\u00f7\u001d\u00a5\u00ba\u009a\u0091\u00abX\u0086\u00bf\u00b8\u009c\u008eW\f\u00ed\u0084\u000f\u0084\u00c7\u00a6\u00bf:";
        int n2 = "\u00b0\u00f7\u001d\u00a5\u00ba\u009a\u0091\u00abX\u0086\u00bf\u00b8\u009c\u008eW\f\u00ed\u0084\u000f\u0084\u00c7\u00a6\u00bf:".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        d = new Integer[3];
        M = new GeometricColorDescriptor(0.0f, 0.0f, 0.0f, 0.0f);
        m = new GeometricColorDescriptor(1.0f, 1.0f, 1.0f, 1.0f);
        K = new GeometricColorDescriptor(1.0f, 1.0f, 0.0f, 1.0f);
        N = new GeometricColorDescriptor(1.0f, 0.0f, 0.0f, 1.0f);
        w = new GeometricColorDescriptor(0.0f, 0.0f, 1.0f, 1.0f);
        c = new GeometricColorDescriptor(0.0f, 1.0f, 0.0f, 1.0f);
        W = new GeometricColorDescriptor(0.0f, 0.0f, 0.0f, 1.0f);
        x = new GeometricColorDescriptor(0.5f, 0.5f, 0.5f, 1.0f);
        v = new GeometricColorDescriptor(0.0f, 1.0f, 1.0f, 1.0f);
        o = new GeometricColorDescriptor(0.3f, 0.3f, 0.3f, 1.0f);
        L = new GeometricColorDescriptor(0.7f, 0.7f, 0.7f, 1.0f);
        e = new GeometricColorDescriptor(255, 175, 175, 255);
        GeometricColorDescriptor.l = new GeometricColorDescriptor(255, 200, 0, 255);
        R = new GeometricColorDescriptor(255, 0, 255, 255);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ZT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GeometricColorDescriptor(int n) {
        long l = a ^ 0x7A28C88D9681L;
        this.r = GeoLocationResolver.Y();
        this.f = 1.0f;
        int n2 = (n & GeometricColorDescriptor.a("j", (int)25535, (long)(0x65E4D91D5AF1C8A1L ^ l))) >> 16;
        int n3 = (n & GeometricColorDescriptor.a("j", (int)28167, (long)(0x7B375610BE7E451BL ^ l))) >> 8;
        int n4 = n & 0xFF;
        int n5 = (n & GeometricColorDescriptor.a("j", (int)32709, (long)(0x459BC0D8280754DAL ^ l))) >> 24;
        try {
            if (n5 < 0) {
                n5 += 256;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricColorDescriptor.a(customSystemException);
        }
        if (n5 == 0) {
            n5 = 255;
        }
        this.P = (float)n2 / 255.0f;
        this.I = (float)n3 / 255.0f;
        this.F = (float)n4 / 255.0f;
        this.f = (float)n5 / 255.0f;
    }

    public GeometricColorDescriptor(int n, int n2, int n3, int n4) {
        this.r = GeoLocationResolver.Y();
        this.f = 1.0f;
        this.P = (float)n / 255.0f;
        this.I = (float)n2 / 255.0f;
        this.F = (float)n3 / 255.0f;
        this.f = (float)n4 / 255.0f;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GeometricColorDescriptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public String toString() {
        return "Color (" + this.P + "," + this.I + "," + this.F + "," + this.f + ")";
    }

    public int hashCode() {
        return (int)(this.P + this.I + this.F + this.f) * 255;
    }

    public boolean equals(Object object) {
        if (object instanceof GeometricColorDescriptor) {
            boolean bl;
            block10: {
                block9: {
                    GeometricColorDescriptor geometricColorDescriptor = (GeometricColorDescriptor)object;
                    try {
                        try {
                            try {
                                try {
                                    if (geometricColorDescriptor.P != this.P || geometricColorDescriptor.I != this.I) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricColorDescriptor.a(customSystemException);
                                }
                                if (geometricColorDescriptor.F != this.F) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricColorDescriptor.a(customSystemException);
                            }
                            if (geometricColorDescriptor.f != this.f) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricColorDescriptor.a(customSystemException);
                        }
                        bl = true;
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricColorDescriptor.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public GeometricColorDescriptor(float f, float f2, float f3, float f4) {
        this.r = GeoLocationResolver.Y();
        this.f = 1.0f;
        this.P = Math.min(f, 1.0f);
        this.I = Math.min(f2, 1.0f);
        this.F = Math.min(f3, 1.0f);
        this.f = Math.min(f4, 1.0f);
    }

    public void t() {
        this.r.a(this.P, this.I, this.F, this.f);
    }

    public GeometricColorDescriptor(float f, float f2, float f3) {
        this.r = GeoLocationResolver.Y();
        this.f = 1.0f;
        this.P = f;
        this.I = f2;
        this.F = f3;
        this.f = 1.0f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GeometricColorDescriptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

