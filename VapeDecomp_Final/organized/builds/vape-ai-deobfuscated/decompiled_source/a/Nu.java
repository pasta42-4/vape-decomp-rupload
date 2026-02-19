/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package a;

import a.vC;
import com.app.simulation.PhysicsSimulationParameters;
import com.collections.management.MultiContainerRegistry;
import com.data.obfuscation.NumericScrambler;
import com.low.level.processing.ByteManipulationEngine;
import com.temporal.metadata.TemporalMetadataResolver;
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
    private NumericScrambler q;
    private static final Map d;
    private static final long[] b;
    private static final long a;
    private final int S;
    private static final String[] f;
    private final int L;
    private static final Integer[] c;
    private int B;
    private BufferedImage I;
    private final Map<String, PhysicsSimulationParameters> y;
    private final List<Rectangle> T;
    private static final Object[] e;
    private int k;

    private void N(String string, int n, int n2, int n3, int n4) {
        float f = (float)n / (float)this.B;
        float f2 = (float)n2 / (float)this.k;
        float f3 = (float)(n + n3) / (float)this.B;
        float f4 = (float)(n2 + n4) / (float)this.k;
        this.y.put(string, new PhysicsSimulationParameters(n, n2, n3, n4, f, f2, f3, f4));
    }

    private BufferedImage u(byte[] byArray, int n, int n2) {
        long l = a ^ 0x27A185CB506FL;
        try {
            if (byArray.length != n * n2 * 4) {
                throw new IllegalArgumentException((String)((Object)Nu.b("\u00e7", (int)Nu.a("l", (int)2215, (long)(0x676A1AF050A966FFL ^ l)), (long)7489890230364049752L, (long)l)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nu.a(illegalArgumentException);
        }
        BufferedImage bufferedImage = new BufferedImage(n, n2, 2);
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                int n4 = byArray[n3++] & 0xFF;
                int n5 = byArray[n3++] & 0xFF;
                int n6 = byArray[n3++] & 0xFF;
                int n7 = byArray[n3++] & 0xFF;
                bufferedImage.setRGB(j, i, n7 << 24 | n4 << 16 | n5 << 8 | n6);
            }
        }
        return bufferedImage;
    }

    private BufferedImage F(BufferedImage bufferedImage) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = bufferedImage.getWidth() + 20;
        int n6 = bufferedImage.getHeight() + 20;
        BufferedImage bufferedImage2 = new BufferedImage(n5, n6, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.drawImage((Image)bufferedImage, 10, 10, null);
        for (n4 = 0; n4 < bufferedImage.getWidth(); ++n4) {
            n3 = bufferedImage.getRGB(n4, 0);
            try {
                for (n2 = 0; n2 < 10; ++n2) {
                    bufferedImage2.setRGB(n4 + 10, n2, n3);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
            n2 = bufferedImage.getRGB(n4, bufferedImage.getHeight() - 1);
            try {
                for (n = 0; n < 10; ++n) {
                    bufferedImage2.setRGB(n4 + 10, n6 - 1 - n, n2);
                }
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
        }
        for (n4 = 0; n4 < bufferedImage.getHeight(); ++n4) {
            n3 = bufferedImage.getRGB(0, n4);
            try {
                for (n2 = 0; n2 < 10; ++n2) {
                    bufferedImage2.setRGB(n2, n4 + 10, n3);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nu.a(illegalArgumentException);
            }
            n2 = bufferedImage.getRGB(bufferedImage.getWidth() - 1, n4);
            try {
                for (n = 0; n < 10; ++n) {
                    bufferedImage2.setRGB(n5 - 1 - n, n4 + 10, n2);
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

    public void E(String string, byte[] byArray, boolean bl) {
        try {
            vC vC2;
            int n;
            ByteBuffer byteBuffer;
            ByteManipulationEngine byteManipulationEngine;
            if (this.y.containsKey(string)) {
                return;
            }
            ByteManipulationEngine byteManipulationEngine2 = new ByteManipulationEngine(new ByteArrayInputStream(byArray));
            int n2 = byteManipulationEngine2.d();
            int n3 = byteManipulationEngine2.O();
            int n4 = 4;
            ByteBuffer byteBuffer2 = BufferUtils.createByteBuffer((int)(4 * n2 * n3));
            try {
                byteManipulationEngine = byteManipulationEngine2;
                byteBuffer = byteBuffer2;
                n = n3 * 4;
                vC2 = bl ? vC.WHITE : vC.RGBA;
            }
            catch (Exception exception) {
                throw Nu.a(exception);
            }
            byteManipulationEngine.P(byteBuffer, n, vC2);
            byteBuffer2.flip();
            byte[] byArray2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(byArray2);
            BufferedImage bufferedImage = this.u(byArray2, n3, n2);
            bufferedImage = this.F(bufferedImage);
            int[] nArray = this.j(n3 += 20, n2 += 20);
            while (nArray == null) {
                this.Y();
                nArray = this.j(n3, n2);
            }
            Graphics2D graphics2D = this.I.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics2D.drawImage((Image)bufferedImage, nArray[0], nArray[1], null);
            graphics2D.dispose();
            this.N(string, nArray[0] + 10, nArray[1] + 10, n3 - 20, n2 - 20);
            this.i();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    public void h(String string) {
        long l = a ^ 0x5FE763C1C0BEL;
        try {
            File file = new File(string);
            ImageIO.write((RenderedImage)this.I, (String)((Object)Nu.b("\u00e7", (int)Nu.a("l", (int)32705, (long)(0x5EAB0FE126B7814DL ^ l)), (long)-639485592609095287L, (long)l)), file);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private int[] j(int n, int n2) {
        int n3 = n + 10;
        int n4 = n2 + 10;
        for (int i = 0; i <= this.k - n4; ++i) {
            for (int j = 0; j <= this.B - n3; ++j) {
                Rectangle rectangle = new Rectangle(j, i, n3, n4);
                boolean bl = true;
                for (Rectangle rectangle2 : this.T) {
                    if (!rectangle.intersects(rectangle2)) continue;
                    bl = false;
                    break;
                }
                try {
                    if (!bl) continue;
                    this.T.add(rectangle);
                    return new int[]{j, i};
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == '\u00a2' || c == '\u00c5' || c == '\u00c9') {
                field = Nu.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Nu.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
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
                n3 = 18;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 15;
                break;
            }
            case 5: {
                n3 = 50;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 12;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 24;
                break;
            }
            case 10: {
                n3 = 23;
                break;
            }
            case 11: {
                n3 = 25;
                break;
            }
            case 12: {
                n3 = 21;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 42;
                break;
            }
            case 15: {
                n3 = 57;
                break;
            }
            case 16: {
                n3 = 8;
                break;
            }
            case 17: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 61;
                break;
            }
            case 19: {
                n3 = 33;
                break;
            }
            case 20: {
                n3 = 55;
                break;
            }
            case 21: {
                n3 = 14;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 7;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 59;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 44;
                break;
            }
            case 28: {
                n3 = 49;
                break;
            }
            case 29: {
                n3 = 60;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 54;
                break;
            }
            case 34: {
                n3 = 38;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 20;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 5;
                break;
            }
            case 39: {
                n3 = 9;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 35;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 37;
                break;
            }
            case 46: {
                n3 = 46;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 22;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 27;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 34;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 32;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 26;
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
        Nu.f[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = Nu.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = Nu.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Nu.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Nu.a(clazz3, string2, clazz2)) != null) {
                    Nu.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Nu.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Nu.e[n] = field;
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
        long l = a ^ 0x26B3CE8A662CL;
        TemporalMetadataResolver.x((String)((Object)Nu.b("\u00e7", (int)Nu.a("l", (int)24537, (long)(0x2E75338EB6F207C0L ^ l)), (long)5886889062069282587L, (long)l)));
        int n = Nu.w(this.B + 128);
        int n2 = Nu.w(this.k + 128);
        BufferedImage bufferedImage = new BufferedImage(n, n2, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage((Image)this.I, 0, 0, null);
        graphics2D.dispose();
        this.I = bufferedImage;
        this.B = n;
        this.k = n2;
        for (PhysicsSimulationParameters physicsSimulationParameters : this.y.values()) {
            physicsSimulationParameters.L = (float)physicsSimulationParameters.p / (float)this.B;
            physicsSimulationParameters.R = (float)physicsSimulationParameters.l / (float)this.k;
            physicsSimulationParameters.T = (float)(physicsSimulationParameters.p + physicsSimulationParameters.v) / (float)this.B;
            physicsSimulationParameters.g = (float)(physicsSimulationParameters.l + physicsSimulationParameters.u) / (float)this.k;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Nu.a = MultiContainerRegistry.a(-3193151460527665881L, 1914394454301105994L, MethodHandles.lookup().lookupClass()).a(162997894824485L);
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
            for (int i = 0; i < classArray.length; ++i) {
                field = Nu.b(classArray[i], string, clazz2);
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

    public PhysicsSimulationParameters V(String string) {
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
        for (int i = 0; i < this.I.getHeight(); ++i) {
            for (int j = 0; j < this.I.getWidth(); ++j) {
                int n = nArray[i * this.I.getWidth() + j];
                byteBuffer.put((byte)(n >> 16 & 0xFF));
                byteBuffer.put((byte)(n >> 8 & 0xFF));
                byteBuffer.put((byte)(n & 0xFF));
                byteBuffer.put((byte)(n >> 24 & 0xFF));
            }
        }
        byteBuffer.flip();
        this.q = NumericScrambler.F(this.B, this.k, byteBuffer, 6408, 9987, 10496);
        byteBuffer.clear();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x9A9;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nu.c[n2] = n3;
        }
        return c[n2];
    }

    private static int w(int n) {
        int n2;
        for (n2 = 1; n2 < n; n2 *= 2) {
        }
        return n2;
    }

    public NumericScrambler q() {
        return this.q;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Nu.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Nu() {
        long l = a ^ 0x29D627C37C40L;
        this.L = (int)Nu.a("l", (int)23523, (long)(0x76AD0A62698A9990L ^ l));
        this.S = (int)Nu.a("l", (int)8476, (long)(0x4BAB406677BAE368L ^ l));
        this.B = (int)Nu.a("l", (int)1461, (long)(0x123C95E89C9347C3L ^ l));
        this.k = (int)Nu.a("l", (int)1461, (long)(0x123C95E89C9347C3L ^ l));
        this.I = new BufferedImage(this.B, this.k, 2);
        this.y = new HashMap<String, PhysicsSimulationParameters>();
        this.T = new ArrayList<Rectangle>();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Nu.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Nu.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Nu.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Nu.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                Nu.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = Nu.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = Nu.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Nu.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Nu.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        Nu.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Nu.b(279843547854558L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Nu.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Nu.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Nu.b(279843547854558L, 0L);
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

