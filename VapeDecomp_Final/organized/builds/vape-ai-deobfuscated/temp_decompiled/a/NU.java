/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package a;

import a.FQ;
import a.SE;
import a.WB;
import a.ZE;
import a.d8;
import a.vC;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;

public class Nu {
    private WB q;
    private static final Map d;
    private static final long[] b;
    private static final long a;
    private final int S;
    private static final String[] f;
    private final int L;
    private static final Integer[] c;
    private int B;
    private BufferedImage I;
    private final Map<String, ZE> y;
    private final List<Rectangle> T;
    private static final Object[] e;
    private int k;

    private void N(String string, int n2, int n3, int n4, int n5) {
        float f10 = (float)n2 / (float)this.B;
        float f11 = (float)n3 / (float)this.k;
        float f12 = (float)(n2 + n4) / (float)this.B;
        float f13 = (float)(n3 + n5) / (float)this.k;
        this.y.put(string, new ZE(n2, n3, n4, n5, f10, f11, f12, f13));
    }

    private BufferedImage u(byte[] byArray, int n2, int n3) {
        long l10 = a ^ 0x27A185CB506FL;
        try {
            if (byArray.length != n2 * n3 * 4) {
                throw new IllegalArgumentException((String)((Object)Nu.b("\u00e7", (int)Nu.a("l", (int)2215, (long)(0x676A1AF050A966FFL ^ l10)), (long)7489890230364049752L, (long)l10)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nu.a(illegalArgumentException);
        }
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 2);
        int n4 = 0;
        for (int i10 = 0; i10 < n3; ++i10) {
            for (int i11 = 0; i11 < n2; ++i11) {
                int n5 = byArray[n4++] & 0xFF;
                int n6 = byArray[n4++] & 0xFF;
                int n7 = byArray[n4++] & 0xFF;
                int n8 = byArray[n4++] & 0xFF;
                bufferedImage.setRGB(i11, i10, n8 << 24 | n5 << 16 | n6 << 8 | n7);
            }
        }
        return bufferedImage;
    }

    private BufferedImage F(BufferedImage bufferedImage) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = bufferedImage.getWidth() + 20;
        int n7 = bufferedImage.getHeight() + 20;
        BufferedImage bufferedImage2 = new BufferedImage(n6, n7, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.drawImage((Image)bufferedImage, 10, 10, null);
        for (n5 = 0; n5 < bufferedImage.getWidth(); ++n5) {
            n4 = bufferedImage.getRGB(n5, 0);
            try {
                for (n3 = 0; n3 < 10; ++n3) {
                    bufferedImage2.setRGB(n5 + 10, n3, n4);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
            n3 = bufferedImage.getRGB(n5, bufferedImage.getHeight() - 1);
            try {
                for (n2 = 0; n2 < 10; ++n2) {
                    bufferedImage2.setRGB(n5 + 10, n7 - 1 - n2, n3);
                }
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
        }
        for (n5 = 0; n5 < bufferedImage.getHeight(); ++n5) {
            n4 = bufferedImage.getRGB(0, n5);
            try {
                for (n3 = 0; n3 < 10; ++n3) {
                    bufferedImage2.setRGB(n3, n5 + 10, n4);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
            n3 = bufferedImage.getRGB(bufferedImage.getWidth() - 1, n5);
            try {
                for (n2 = 0; n2 < 10; ++n2) {
                    bufferedImage2.setRGB(n6 - 1 - n2, n5 + 10, n3);
                }
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
        }
        graphics2D.dispose();
        return bufferedImage2;
    }

    public void E(String string, byte[] byArray, boolean bl2) {
        try {
            vC vC2;
            int n2;
            ByteBuffer byteBuffer;
            FQ fQ2;
            if (this.y.containsKey(string)) {
                return;
            }
            FQ fQ3 = new FQ(new ByteArrayInputStream(byArray));
            int n3 = fQ3.d();
            int n4 = fQ3.O();
            int n5 = 4;
            ByteBuffer byteBuffer2 = BufferUtils.createByteBuffer((int)(4 * n3 * n4));
            try {
                fQ2 = fQ3;
                byteBuffer = byteBuffer2;
                n2 = n4 * 4;
                vC2 = bl2 ? vC.WHITE : vC.RGBA;
            }
            catch (Exception exception) {
                throw Nu.a(exception);
            }
            fQ2.P(byteBuffer, n2, vC2);
            byteBuffer2.flip();
            byte[] byArray2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(byArray2);
            BufferedImage bufferedImage = this.u(byArray2, n4, n3);
            bufferedImage = this.F(bufferedImage);
            int[] nArray = this.j(n4 += 20, n3 += 20);
            while (nArray == null) {
                this.Y();
                nArray = this.j(n4, n3);
            }
            Graphics2D graphics2D = this.I.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics2D.drawImage((Image)bufferedImage, nArray[0], nArray[1], null);
            graphics2D.dispose();
            this.N(string, nArray[0] + 10, nArray[1] + 10, n4 - 20, n3 - 20);
            this.i();
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    public void h(String string) {
        long l10 = a ^ 0x5FE763C1C0BEL;
        try {
            File file = new File(string);
            ImageIO.write((RenderedImage)this.I, (String)((Object)Nu.b("\u00e7", (int)Nu.a("l", (int)32705, (long)(0x5EAB0FE126B7814DL ^ l10)), (long)-639485592609095287L, (long)l10)), file);
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private int[] j(int n2, int n3) {
        int n4 = n2 + 10;
        int n5 = n3 + 10;
        for (int i10 = 0; i10 <= this.k - n5; ++i10) {
            for (int i11 = 0; i11 <= this.B - n4; ++i11) {
                Rectangle rectangle = new Rectangle(i11, i10, n4, n5);
                boolean bl2 = true;
                for (Rectangle rectangle2 : this.T) {
                    if (!rectangle.intersects(rectangle2)) continue;
                    bl2 = false;
                    break;
                }
                try {
                    if (!bl2) continue;
                    this.T.add(rectangle);
                    return new int[]{i11, i10};
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nu.a(illegalArgumentException);
                }
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Nu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'x' || c10 == '\u00a2' || c10 == '\u00c5' || c10 == '\u00c9') {
                field = Nu.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Nu.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 39;
                break;
            }
            case 1: {
                n4 = 18;
                break;
            }
            case 2: {
                n4 = 1;
                break;
            }
            case 3: {
                n4 = 11;
                break;
            }
            case 4: {
                n4 = 15;
                break;
            }
            case 5: {
                n4 = 50;
                break;
            }
            case 6: {
                n4 = 4;
                break;
            }
            case 7: {
                n4 = 12;
                break;
            }
            case 8: {
                n4 = 29;
                break;
            }
            case 9: {
                n4 = 24;
                break;
            }
            case 10: {
                n4 = 23;
                break;
            }
            case 11: {
                n4 = 25;
                break;
            }
            case 12: {
                n4 = 21;
                break;
            }
            case 13: {
                n4 = 19;
                break;
            }
            case 14: {
                n4 = 42;
                break;
            }
            case 15: {
                n4 = 57;
                break;
            }
            case 16: {
                n4 = 8;
                break;
            }
            case 17: {
                n4 = 47;
                break;
            }
            case 18: {
                n4 = 61;
                break;
            }
            case 19: {
                n4 = 33;
                break;
            }
            case 20: {
                n4 = 55;
                break;
            }
            case 21: {
                n4 = 14;
                break;
            }
            case 22: {
                n4 = 48;
                break;
            }
            case 23: {
                n4 = 7;
                break;
            }
            case 24: {
                n4 = 58;
                break;
            }
            case 25: {
                n4 = 59;
                break;
            }
            case 26: {
                n4 = 51;
                break;
            }
            case 27: {
                n4 = 44;
                break;
            }
            case 28: {
                n4 = 49;
                break;
            }
            case 29: {
                n4 = 60;
                break;
            }
            case 30: {
                n4 = 17;
                break;
            }
            case 31: {
                n4 = 45;
                break;
            }
            case 32: {
                n4 = 28;
                break;
            }
            case 33: {
                n4 = 54;
                break;
            }
            case 34: {
                n4 = 38;
                break;
            }
            case 35: {
                n4 = 43;
                break;
            }
            case 36: {
                n4 = 20;
                break;
            }
            case 37: {
                n4 = 0;
                break;
            }
            case 38: {
                n4 = 5;
                break;
            }
            case 39: {
                n4 = 9;
                break;
            }
            case 40: {
                n4 = 13;
                break;
            }
            case 41: {
                n4 = 3;
                break;
            }
            case 42: {
                n4 = 35;
                break;
            }
            case 43: {
                n4 = 62;
                break;
            }
            case 44: {
                n4 = 63;
                break;
            }
            case 45: {
                n4 = 37;
                break;
            }
            case 46: {
                n4 = 46;
                break;
            }
            case 47: {
                n4 = 56;
                break;
            }
            case 48: {
                n4 = 30;
                break;
            }
            case 49: {
                n4 = 22;
                break;
            }
            case 50: {
                n4 = 31;
                break;
            }
            case 51: {
                n4 = 40;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 16;
                break;
            }
            case 54: {
                n4 = 52;
                break;
            }
            case 55: {
                n4 = 34;
                break;
            }
            case 56: {
                n4 = 53;
                break;
            }
            case 57: {
                n4 = 41;
                break;
            }
            case 58: {
                n4 = 2;
                break;
            }
            case 59: {
                n4 = 32;
                break;
            }
            case 60: {
                n4 = 6;
                break;
            }
            case 61: {
                n4 = 10;
                break;
            }
            case 62: {
                n4 = 36;
                break;
            }
            default: {
                n4 = 26;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        Nu.f[n5] = new String(cArray);
        return n5;
    }

    private static Field c(long l10, long l11) {
        int n2 = Nu.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = Nu.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Nu.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Nu.a(clazz3, string2, clazz2)) != null) {
                    Nu.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Nu.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Nu.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Nu.b(279843547854558L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void Y() {
        long l10 = a ^ 0x26B3CE8A662CL;
        SE.x((String)((Object)Nu.b("\u00e7", (int)Nu.a("l", (int)24537, (long)(0x2E75338EB6F207C0L ^ l10)), (long)5886889062069282587L, (long)l10)));
        int n2 = Nu.w(this.B + 128);
        int n3 = Nu.w(this.k + 128);
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage((Image)this.I, 0, 0, null);
        graphics2D.dispose();
        this.I = bufferedImage;
        this.B = n2;
        this.k = n3;
        for (ZE zE2 : this.y.values()) {
            zE2.L = (float)zE2.p / (float)this.B;
            zE2.R = (float)zE2.l / (float)this.k;
            zE2.T = (float)(zE2.p + zE2.v) / (float)this.B;
            zE2.g = (float)(zE2.l + zE2.u) / (float)this.k;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Nu.a = d8.a(-3193151460527665881L, 1914394454301105994L, MethodHandles.lookup().lookupClass()).a(162997894824485L);
                Nu.e = new Object[5];
                Nu.f = new String[5];
                Nu.a();
                Nu.d = new HashMap<K, V>(13);
                var0 = Nu.a ^ 29620423039939L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "H\u00c7\u0004\u000e\u00b9\u00f6R\u008a\u00c1\f\u0010\u00e4\u00da\u0005\u00be|\u009c\u00ca\u0095\u0016\u0004\u00de~\u00d7O\u0010\u009bO\u008e\u00e0F\\";
                var7_6 = "H\u00c7\u0004\u000e\u00b9\u00f6R\u008a\u00c1\f\u0010\u00e4\u00da\u0005\u00be|\u009c\u00ca\u0095\u0016\u0004\u00de~\u00d7O\u0010\u009bO\u008e\u00e0F\\".length();
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
                    var6_5 = "A\u000e\u0084_8\u0099[f\u009b\u00e8\u0080t\u00d24\u00bc\b";
                    var7_6 = "A\u000e\u0084_8\u0099[f\u009b\u00e8\u0080t\u00d24\u00bc\b".length();
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
        Nu.b = var8_3;
        Nu.c = new Integer[6];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Nu.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Nu.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "qf\u0019";
        objectArray[1] = Integer.TYPE;
        Nu.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0003\u000bB\u0006|&\b\u0004SI\u0001>\u001b\u0003Z\u0000";
        objectArray[3] = "\\IV\u0013}(WFG\\\u001c&\\MC\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018LCU8\u007fZPLl5b(\u0011X\u0010<!V\u0015\u000e\u00000\u0019\u0011T\u0001\u0017d%\u0018LQ\u0014^";
    }

    public ZE V(String string) {
        return this.y.get(string);
    }

    private void i() {
        try {
            if (this.q != null) {
                this.q.j();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nu.a(illegalArgumentException);
        }
        int[] nArray = new int[this.I.getHeight() * this.I.getWidth()];
        this.I.getRGB(0, 0, this.I.getWidth(), this.I.getHeight(), nArray, 0, this.I.getWidth());
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(this.I.getWidth() * this.I.getHeight() * 4));
        for (int i10 = 0; i10 < this.I.getHeight(); ++i10) {
            for (int i11 = 0; i11 < this.I.getWidth(); ++i11) {
                int n2 = nArray[i10 * this.I.getWidth() + i11];
                byteBuffer.put((byte)(n2 >> 16 & 0xFF));
                byteBuffer.put((byte)(n2 >> 8 & 0xFF));
                byteBuffer.put((byte)(n2 & 0xFF));
                byteBuffer.put((byte)(n2 >> 24 & 0xFF));
            }
        }
        byteBuffer.flip();
        this.q = WB.F(this.B, this.k, byteBuffer, 6408, 9987, 10496);
        byteBuffer.clear();
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x9A9;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Nu", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nu.c[n3] = n4;
        }
        return c[n3];
    }

    private static int w(int n2) {
        int n3;
        for (n3 = 1; n3 < n2; n3 *= 2) {
        }
        return n3;
    }

    public WB q() {
        return this.q;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Nu.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Nu() {
        long l10 = a ^ 0x29D627C37C40L;
        this.L = (int)Nu.a("l", (int)23523, (long)(0x76AD0A62698A9990L ^ l10));
        this.S = (int)Nu.a("l", (int)8476, (long)(0x4BAB406677BAE368L ^ l10));
        this.B = (int)Nu.a("l", (int)1461, (long)(0x123C95E89C9347C3L ^ l10));
        this.k = (int)Nu.a("l", (int)1461, (long)(0x123C95E89C9347C3L ^ l10));
        this.I = new BufferedImage(this.B, this.k, 2);
        this.y = new HashMap<String, ZE>();
        this.T = new ArrayList<Rectangle>();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Nu.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Nu.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = Nu.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Nu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Nu.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                Nu.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l10, long l11) {
        int n2 = Nu.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = Nu.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = Nu.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Nu.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        Nu.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Nu.b(279843547854558L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Nu.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Nu.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Nu.b(279843547854558L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Nu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Nu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

