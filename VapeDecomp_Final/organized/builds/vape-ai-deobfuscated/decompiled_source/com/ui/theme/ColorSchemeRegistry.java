/*
 * Decompiled with CFR 0.152.
 */
package com.ui.theme;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ColorSchemeRegistry
extends Enum<ColorSchemeRegistry> {
    public static final /* enum */ ColorSchemeRegistry PEACH;
    private final double[] g;
    public static final /* enum */ ColorSchemeRegistry FUCHSIA;
    public static final /* enum */ ColorSchemeRegistry ORANGE;
    private final String O;
    public static final /* enum */ ColorSchemeRegistry BLUE;
    public static final /* enum */ ColorSchemeRegistry TURQUOISE;
    private static int[] Y;
    public static final /* enum */ ColorSchemeRegistry AMETHYST;
    public static final /* enum */ ColorSchemeRegistry BRONZE;
    public static final /* enum */ ColorSchemeRegistry AUBERGINE;
    public static final /* enum */ ColorSchemeRegistry TEAL;
    public static final /* enum */ ColorSchemeRegistry CARROT;
    public static final /* enum */ ColorSchemeRegistry YELLOW;
    public static final /* enum */ ColorSchemeRegistry MAGENTA;
    public static final /* enum */ ColorSchemeRegistry SKY_BLUE;
    public static final /* enum */ ColorSchemeRegistry RED;
    public static final /* enum */ ColorSchemeRegistry MAROON;
    public static final /* enum */ ColorSchemeRegistry CHARCOAL;
    public static final /* enum */ ColorSchemeRegistry GOLD;
    public static final /* enum */ ColorSchemeRegistry CYAN;
    public static final /* enum */ ColorSchemeRegistry GRAY;
    private static final /* synthetic */ ColorSchemeRegistry[] p;
    public static final /* enum */ ColorSchemeRegistry WHITE;
    public static final /* enum */ ColorSchemeRegistry TANGERINE;
    public static final /* enum */ ColorSchemeRegistry OLIVE;
    public static final /* enum */ ColorSchemeRegistry LAVENDER;
    private final Color R;
    public static final /* enum */ ColorSchemeRegistry SILVER;
    public static final /* enum */ ColorSchemeRegistry INDIGO;
    public static final /* enum */ ColorSchemeRegistry PINK;
    public static final /* enum */ ColorSchemeRegistry EMERALD;
    public static final /* enum */ ColorSchemeRegistry PLUM;
    public static final /* enum */ ColorSchemeRegistry IVORY;
    private static final String[] b;
    public static final List<ColorSchemeRegistry> VALUES;
    public static final /* enum */ ColorSchemeRegistry FOREST_GREEN;
    public static final /* enum */ ColorSchemeRegistry MINT;
    public static final /* enum */ ColorSchemeRegistry BURGUNDY;
    public static final /* enum */ ColorSchemeRegistry SALMON;
    public static final /* enum */ ColorSchemeRegistry LEMON;
    public static final /* enum */ ColorSchemeRegistry BEIGE;
    public static final /* enum */ ColorSchemeRegistry GREEN;
    public static final /* enum */ ColorSchemeRegistry NAVY;
    private static final Object[] a;
    public static final /* enum */ ColorSchemeRegistry RASPBERRY;
    public static final /* enum */ ColorSchemeRegistry BLACK;

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (b[n4] != null) {
            return n4;
        }
        Object object = a[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 22;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 7;
                break;
            }
            case 3: {
                n3 = 43;
                break;
            }
            case 4: {
                n3 = 14;
                break;
            }
            case 5: {
                n3 = 29;
                break;
            }
            case 6: {
                n3 = 23;
                break;
            }
            case 7: {
                n3 = 19;
                break;
            }
            case 8: {
                n3 = 35;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 20;
                break;
            }
            case 12: {
                n3 = 61;
                break;
            }
            case 13: {
                n3 = 4;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 37;
                break;
            }
            case 16: {
                n3 = 21;
                break;
            }
            case 17: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 15;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 40;
                break;
            }
            case 23: {
                n3 = 58;
                break;
            }
            case 24: {
                n3 = 34;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 49;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 39;
                break;
            }
            case 35: {
                n3 = 63;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 46;
                break;
            }
            case 39: {
                n3 = 57;
                break;
            }
            case 40: {
                n3 = 5;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 60;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 27;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 50;
                break;
            }
            case 48: {
                n3 = 32;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 41;
                break;
            }
            case 51: {
                n3 = 26;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 31;
                break;
            }
            case 62: {
                n3 = 11;
                break;
            }
            default: {
                n3 = 16;
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
        ColorSchemeRegistry.b[n4] = new String(cArray);
        return n4;
    }

    private static double P(double[] dArray, double[] dArray2) {
        return Math.sqrt(Math.pow(dArray[0] - dArray2[0], 2.0) + Math.pow(dArray[1] - dArray2[1], 2.0) + Math.pow(dArray[2] - dArray2[2], 2.0));
    }

    public Color U() {
        return this.R;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "cC\u0005";
        objectArray[1] = Integer.TYPE;
        ColorSchemeRegistry.b[1] = "java/lang/Integer";
        objectArray[2] = "Pe+\u000b:\u0013[j:DG\u000bHm3\r";
        objectArray[3] = "L\u000f\u0007V[\u001bG\u0000\u0016\u0019:\u0015L\u000b\u0012C";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "S5zP o\u0006|-0.m8|u@ukHyuK=\u0016\u0001!w@*n\u000352OE";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == 'o' || c == '\u00fa' || c == '\u00fd') {
                field = ColorSchemeRegistry.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ColorSchemeRegistry.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int[] e() {
        return Y;
    }

    public static ColorSchemeRegistry valueOf(String string) {
        return Enum.valueOf(ColorSchemeRegistry.class, string);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ColorSchemeRegistry.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                var11 = MultiContainerRegistry.a(-1446506096871764469L, -4117998758659350633L, MethodHandles.lookup().lookupClass()).a(118523786091392L) ^ 121653591751938L;
                ColorSchemeRegistry.a = new Object[5];
                ColorSchemeRegistry.b = new String[5];
                ColorSchemeRegistry.a();
                if (ColorSchemeRegistry.e() == null) {
                    ColorSchemeRegistry.M(new int[3]);
                }
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[78];
                var4_4 = 0;
                var5_5 = "%\u009eE{\u0083>\u00e7/\u00f93\u00d4c\u009fX\u0002\u00d8\u0098\u0090\u0082\u0090\u00f7J7\"\b+\u0080X\r\u00dcA\u00b4*\u00ae\u000b}'\u00ee\u008d\u00d4\u00b9(m\u009dH\u00f7\u00d0\u00d0(\u00b0\u00b6\u007f\u00cd\u00b3=(|I\u000f\u00ec\u00e7\u00d8\u00ed=\u00b3\u00e7\u0005\u00fd?R\u00ef2\u00f8\u009c\u00a2\u00c5\u00cf\u00ab\u0099\u0085{\u00a2\u00d0.\u00e9\u00ba\u00d4\u000f[^R(\u00a6L\u0098\u0091\u008d\u00f0\u00b0RYS-\u001cA\u00fe\u00856Pcs\u00d6En\u0004j\u00fagJ\u00bb\u001d\r\u00f8\u00c8\u00e7t\u00b1C\u00018\u001d\u00e7\u00a2\u00c0\u0093\u0011P\u00fa\u0081\u00bc\u00aa\u0018\u00dc%\u008b\u00cf\u00ff$\u00ca\u0084\u00d5\u00f0/Z\u009d\u0018\u00d7\u00f9p\u001a\u0085\u00ab\u00a9\u00bc7\u00bfQ\u0002\u001fa\u00f5_\u008cu;\u00c2hq\u00d3\u0013\u00eej%\u00a9\u00ff\u00d7\u00e81\u008f;\u00ce\u00023\u009a\u00f0\u008d\u00ee:\u0096S\u008a\u0098\u00fb\u00a5_) \u00d4\u00a2\u00fb\u0098\u00d2\u00b5\u00f4 ?.\u00aa\u0081\u00b2\u00ae\u0015\u00f0ctw>o\u0081\u0017L{\u00b3\u0093\u0099\u00f1\u0097\u0092?DIJ\u00d7\n\u00e8\u00f1\u00f6c\u00bf\u0099\u00c6\u00e0\u00daih$\u0097\u00a4\u00c2\u0001\u00de\u0081\u00a0e2\u0015\u0093v\u00c4A\u00c9\u00f2\u0011gVbk\u00a9\u0005\u0094R\u00be\u0003\u00ca\u00e0?\u00e3|!\u0080Lj|\u009b5m\u00b0\u00d5\u00e0E\u00baKr\u00b1\u00a5\u00e9\u00c2\u008eb2\u000e\u0093.\u00d8\u00f6\u001e\u00e9\u000bx+\u000b\u0091\u00b4\u00e6\u00fc\u00eb\u0012a\u0006^\u00c2\u0095%\u00a2\u001c\u00b6?\u001d\u009f\u000f1cS\u00ef\u00d3\u00a8\u00d5\u00f6\u009b\u00afp\u0014K\u008c\u009e\u00cf!\u008f\u00a7\u0083\u0099\u00d4m\u00e3\u00d1e\u00fa\u000ejI\u00d4k1\u00a9\u00aa\u00bdi\u0015\u0092R1;b\u0097\u00a6m~\u00c0\u00d86\u009a\u001f\u0086\u00ea\u00a4\u00c7w\u00e7CRG\u00ab6\u0091e\u00e2YK\u0017\u00db\u0092a\u00c6b\u00ab\u00a8\r\u00abH\u001f\u0086\u00c4\u0097\u00c5\u00c9\u00fc\u00d3?bc\u001d\u00bfv@R\u0014(\u00cf\u00fah\u00c1\u00e0*\u0093\u0096\u00c2\u001c\u0015\u00b9D\u00d0H\u00ca\u00c4\u00fa\u00a2\u00c0\u00bd>cR\u009fl\u0002H\u00ec\u00fb\u00f2\u00e2\u0010\u00e9<\u00c7\u00cf\u00eb\u0016\u00a4\fG\u00f3\u00b2\u00dc\u00c2\u0005\u008f\u0080\u00d8\u00c8\u00fd\u00e0\u0006\u0097\u0001\u0005\u00f09/\u00b3\u00a5\u0015\u00ed\u00a3\t\u00a8\u00ef1\u00cc\u00ae-\u00be\u00d2\u00ea\b\u00bf\u0002\u0098o\u00ad\u001f\u00fez 1s\u001f5\u00d8\u001c\u00e7\u00157kJ(#I\u001168\u001bx\u0013\u00971:\u00b1\u00a7yy\u00c6\u00fe\u00fa\u00b3\u0006\u000f\u00ecM\u00c6\u0085\"9V\u00c0TL\u00d4\u00a0\u00d6\u00bcd<\u00d3\u00fd\rI\u00ab\u00d9G\u00ba\u0019\u00b8*\u00d3=_.3UmM\u00f7\u00ad\u00cd\u00fd\u00c9B\u00a9u\u0010\u0083\u00c3\u008c#k)\u00b9\u0091\u0083";
                var6_6 = "%\u009eE{\u0083>\u00e7/\u00f93\u00d4c\u009fX\u0002\u00d8\u0098\u0090\u0082\u0090\u00f7J7\"\b+\u0080X\r\u00dcA\u00b4*\u00ae\u000b}'\u00ee\u008d\u00d4\u00b9(m\u009dH\u00f7\u00d0\u00d0(\u00b0\u00b6\u007f\u00cd\u00b3=(|I\u000f\u00ec\u00e7\u00d8\u00ed=\u00b3\u00e7\u0005\u00fd?R\u00ef2\u00f8\u009c\u00a2\u00c5\u00cf\u00ab\u0099\u0085{\u00a2\u00d0.\u00e9\u00ba\u00d4\u000f[^R(\u00a6L\u0098\u0091\u008d\u00f0\u00b0RYS-\u001cA\u00fe\u00856Pcs\u00d6En\u0004j\u00fagJ\u00bb\u001d\r\u00f8\u00c8\u00e7t\u00b1C\u00018\u001d\u00e7\u00a2\u00c0\u0093\u0011P\u00fa\u0081\u00bc\u00aa\u0018\u00dc%\u008b\u00cf\u00ff$\u00ca\u0084\u00d5\u00f0/Z\u009d\u0018\u00d7\u00f9p\u001a\u0085\u00ab\u00a9\u00bc7\u00bfQ\u0002\u001fa\u00f5_\u008cu;\u00c2hq\u00d3\u0013\u00eej%\u00a9\u00ff\u00d7\u00e81\u008f;\u00ce\u00023\u009a\u00f0\u008d\u00ee:\u0096S\u008a\u0098\u00fb\u00a5_) \u00d4\u00a2\u00fb\u0098\u00d2\u00b5\u00f4 ?.\u00aa\u0081\u00b2\u00ae\u0015\u00f0ctw>o\u0081\u0017L{\u00b3\u0093\u0099\u00f1\u0097\u0092?DIJ\u00d7\n\u00e8\u00f1\u00f6c\u00bf\u0099\u00c6\u00e0\u00daih$\u0097\u00a4\u00c2\u0001\u00de\u0081\u00a0e2\u0015\u0093v\u00c4A\u00c9\u00f2\u0011gVbk\u00a9\u0005\u0094R\u00be\u0003\u00ca\u00e0?\u00e3|!\u0080Lj|\u009b5m\u00b0\u00d5\u00e0E\u00baKr\u00b1\u00a5\u00e9\u00c2\u008eb2\u000e\u0093.\u00d8\u00f6\u001e\u00e9\u000bx+\u000b\u0091\u00b4\u00e6\u00fc\u00eb\u0012a\u0006^\u00c2\u0095%\u00a2\u001c\u00b6?\u001d\u009f\u000f1cS\u00ef\u00d3\u00a8\u00d5\u00f6\u009b\u00afp\u0014K\u008c\u009e\u00cf!\u008f\u00a7\u0083\u0099\u00d4m\u00e3\u00d1e\u00fa\u000ejI\u00d4k1\u00a9\u00aa\u00bdi\u0015\u0092R1;b\u0097\u00a6m~\u00c0\u00d86\u009a\u001f\u0086\u00ea\u00a4\u00c7w\u00e7CRG\u00ab6\u0091e\u00e2YK\u0017\u00db\u0092a\u00c6b\u00ab\u00a8\r\u00abH\u001f\u0086\u00c4\u0097\u00c5\u00c9\u00fc\u00d3?bc\u001d\u00bfv@R\u0014(\u00cf\u00fah\u00c1\u00e0*\u0093\u0096\u00c2\u001c\u0015\u00b9D\u00d0H\u00ca\u00c4\u00fa\u00a2\u00c0\u00bd>cR\u009fl\u0002H\u00ec\u00fb\u00f2\u00e2\u0010\u00e9<\u00c7\u00cf\u00eb\u0016\u00a4\fG\u00f3\u00b2\u00dc\u00c2\u0005\u008f\u0080\u00d8\u00c8\u00fd\u00e0\u0006\u0097\u0001\u0005\u00f09/\u00b3\u00a5\u0015\u00ed\u00a3\t\u00a8\u00ef1\u00cc\u00ae-\u00be\u00d2\u00ea\b\u00bf\u0002\u0098o\u00ad\u001f\u00fez 1s\u001f5\u00d8\u001c\u00e7\u00157kJ(#I\u001168\u001bx\u0013\u00971:\u00b1\u00a7yy\u00c6\u00fe\u00fa\u00b3\u0006\u000f\u00ecM\u00c6\u0085\"9V\u00c0TL\u00d4\u00a0\u00d6\u00bcd<\u00d3\u00fd\rI\u00ab\u00d9G\u00ba\u0019\u00b8*\u00d3=_.3UmM\u00f7\u00ad\u00cd\u00fd\u00c9B\u00a9u\u0010\u0083\u00c3\u008c#k)\u00b9\u0091\u0083".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block9;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u001f\u00a8\u00eb\u00bf\u00c4\u0003\u0018\u00a8`\u0098\u00a57)\u00c0EP";
                    var6_6 = "\u001f\u00a8\u00eb\u00bf\u00c4\u0003\u0018\u00a8`\u0098\u00a57)\u00c0EP".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block9;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block10;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        ColorSchemeRegistry.RED = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[32]), (long)2875594338834830812L, (long)var11), new Color(255, 0, 0));
        ColorSchemeRegistry.ORANGE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[29]), (long)2875594338834830812L, (long)var11), new Color(255, 165, 0));
        ColorSchemeRegistry.YELLOW = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[13]), (long)2875594338834830812L, (long)var11), new Color(255, 255, 0));
        ColorSchemeRegistry.GREEN = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[33]), (long)2875594338834830812L, (long)var11), new Color(0, 128, 0));
        ColorSchemeRegistry.BLUE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[47]), (long)2875594338834830812L, (long)var11), new Color(0, 0, 255));
        ColorSchemeRegistry.INDIGO = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[61]), (long)2875594338834830812L, (long)var11), new Color(75, 0, 130));
        ColorSchemeRegistry.PINK = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[51]), (long)2875594338834830812L, (long)var11), new Color(238, 130, 238));
        ColorSchemeRegistry.BURGUNDY = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[36]), (long)2875594338834830812L, (long)var11), new Color(128, 0, 32));
        ColorSchemeRegistry.CARROT = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[30]), (long)2875594338834830812L, (long)var11), new Color(237, 145, 33));
        ColorSchemeRegistry.GOLD = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[22]), (long)2875594338834830812L, (long)var11), new Color(255, 215, 0));
        ColorSchemeRegistry.FOREST_GREEN = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[69]), (long)2875594338834830812L, (long)var11), new Color(34, 139, 34));
        ColorSchemeRegistry.NAVY = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[0]), (long)2875594338834830812L, (long)var11), new Color(0, 0, 128));
        ColorSchemeRegistry.AUBERGINE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[15]), (long)2875594338834830812L, (long)var11), new Color(61, 48, 84));
        ColorSchemeRegistry.PLUM = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[62]), (long)2875594338834830812L, (long)var11), new Color(221, 160, 221));
        ColorSchemeRegistry.SALMON = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[18]), (long)2875594338834830812L, (long)var11), new Color(250, 128, 114));
        ColorSchemeRegistry.PEACH = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[64]), (long)2875594338834830812L, (long)var11), new Color(255, 218, 185));
        ColorSchemeRegistry.LEMON = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[75]), (long)2875594338834830812L, (long)var11), new Color(255, 247, 0));
        ColorSchemeRegistry.MINT = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[37]), (long)2875594338834830812L, (long)var11), new Color(152, 255, 152));
        ColorSchemeRegistry.SKY_BLUE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[16]), (long)2875594338834830812L, (long)var11), new Color(135, 206, 235));
        ColorSchemeRegistry.LAVENDER = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[7]), (long)2875594338834830812L, (long)var11), new Color(230, 230, 250));
        ColorSchemeRegistry.CYAN = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[39]), (long)2875594338834830812L, (long)var11), new Color(0, 255, 255));
        ColorSchemeRegistry.MAGENTA = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[10]), (long)2875594338834830812L, (long)var11), new Color(255, 0, 255));
        ColorSchemeRegistry.SILVER = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[34]), (long)2875594338834830812L, (long)var11), new Color(192, 192, 192));
        ColorSchemeRegistry.BRONZE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[55]), (long)2875594338834830812L, (long)var11), new Color(205, 127, 50));
        ColorSchemeRegistry.WHITE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[5]), (long)2875594338834830812L, (long)var11), new Color(255, 255, 255));
        ColorSchemeRegistry.BLACK = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[58]), (long)2875594338834830812L, (long)var11), new Color(0, 0, 0));
        ColorSchemeRegistry.GRAY = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[77]), (long)2875594338834830812L, (long)var11), new Color(128, 128, 128));
        ColorSchemeRegistry.IVORY = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[24]), (long)2875594338834830812L, (long)var11), new Color(255, 255, 240));
        ColorSchemeRegistry.BEIGE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[76]), (long)2875594338834830812L, (long)var11), new Color(245, 245, 220));
        ColorSchemeRegistry.OLIVE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[65]), (long)2875594338834830812L, (long)var11), new Color(128, 128, 0));
        ColorSchemeRegistry.TEAL = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[35]), (long)2875594338834830812L, (long)var11), new Color(0, 128, 128));
        ColorSchemeRegistry.MAROON = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[48]), (long)2875594338834830812L, (long)var11), new Color(128, 0, 0));
        ColorSchemeRegistry.CHARCOAL = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[17]), (long)2875594338834830812L, (long)var11), new Color(54, 69, 79));
        ColorSchemeRegistry.FUCHSIA = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[53]), (long)2875594338834830812L, (long)var11), new Color(255, 0, 255));
        ColorSchemeRegistry.TURQUOISE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[72]), (long)2875594338834830812L, (long)var11), new Color(64, 224, 208));
        ColorSchemeRegistry.RASPBERRY = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[56]), (long)2875594338834830812L, (long)var11), new Color(227, 11, 92));
        ColorSchemeRegistry.TANGERINE = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[46]), (long)2875594338834830812L, (long)var11), new Color(242, 133, 0));
        ColorSchemeRegistry.AMETHYST = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[19]), (long)2875594338834830812L, (long)var11), new Color(153, 102, 204));
        ColorSchemeRegistry.EMERALD = new ColorSchemeRegistry((String)ColorSchemeRegistry.a("g", (int)((int)var0_3[59]), (long)2875594338834830812L, (long)var11), new Color(80, 200, 120));
        ColorSchemeRegistry.p = new ColorSchemeRegistry[]{ColorSchemeRegistry.RED, ColorSchemeRegistry.ORANGE, ColorSchemeRegistry.YELLOW, ColorSchemeRegistry.GREEN, ColorSchemeRegistry.BLUE, ColorSchemeRegistry.INDIGO, ColorSchemeRegistry.PINK, ColorSchemeRegistry.BURGUNDY, ColorSchemeRegistry.CARROT, ColorSchemeRegistry.GOLD, ColorSchemeRegistry.FOREST_GREEN, ColorSchemeRegistry.NAVY, ColorSchemeRegistry.AUBERGINE, ColorSchemeRegistry.PLUM, ColorSchemeRegistry.SALMON, ColorSchemeRegistry.PEACH, ColorSchemeRegistry.LEMON, ColorSchemeRegistry.MINT, ColorSchemeRegistry.SKY_BLUE, ColorSchemeRegistry.LAVENDER, ColorSchemeRegistry.CYAN, ColorSchemeRegistry.MAGENTA, ColorSchemeRegistry.SILVER, ColorSchemeRegistry.BRONZE, ColorSchemeRegistry.WHITE, ColorSchemeRegistry.BLACK, ColorSchemeRegistry.GRAY, ColorSchemeRegistry.IVORY, ColorSchemeRegistry.BEIGE, ColorSchemeRegistry.OLIVE, ColorSchemeRegistry.TEAL, ColorSchemeRegistry.MAROON, ColorSchemeRegistry.CHARCOAL, ColorSchemeRegistry.FUCHSIA, ColorSchemeRegistry.TURQUOISE, ColorSchemeRegistry.RASPBERRY, ColorSchemeRegistry.TANGERINE, ColorSchemeRegistry.AMETHYST, ColorSchemeRegistry.EMERALD};
        ColorSchemeRegistry.VALUES = Arrays.asList(ColorSchemeRegistry.values());
    }

    public String A() {
        return this.O;
    }

    public static ColorSchemeRegistry[] values() {
        return (ColorSchemeRegistry[])p.clone();
    }

    public static void M(int[] nArray) {
        Y = nArray;
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ColorSchemeRegistry.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ColorSchemeRegistry.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_W" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static ColorSchemeRegistry v(Color color) {
        double[] dArray = ColorSchemeRegistry.P(color);
        ColorSchemeRegistry colorSchemeRegistry = null;
        double d2 = Double.MAX_VALUE;
        for (ColorSchemeRegistry colorSchemeRegistry2 : VALUES) {
            double d3 = ColorSchemeRegistry.P(dArray, colorSchemeRegistry2.g);
            if (!(d3 < d2)) continue;
            d2 = d3;
            colorSchemeRegistry = colorSchemeRegistry2;
        }
        return colorSchemeRegistry;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static double[] P(Color color) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8 = (double)color.getRed() / 255.0;
        double d9 = (double)color.getGreen() / 255.0;
        double d10 = (double)color.getBlue() / 255.0;
        try {
            d7 = d8 > 0.04045 ? Math.pow((d8 + 0.055) / 1.055, 2.4) : d8 / 12.92;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorSchemeRegistry.a(customSystemException);
        }
        d8 = d7;
        try {
            d6 = d9 > 0.04045 ? Math.pow((d9 + 0.055) / 1.055, 2.4) : d9 / 12.92;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorSchemeRegistry.a(customSystemException);
        }
        d9 = d6;
        try {
            d5 = d10 > 0.04045 ? Math.pow((d10 + 0.055) / 1.055, 2.4) : d10 / 12.92;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorSchemeRegistry.a(customSystemException);
        }
        d10 = d5;
        double d11 = d8 * 0.4124 + d9 * 0.3576 + d10 * 0.1805;
        double d12 = d8 * 0.2126 + d9 * 0.7152 + d10 * 0.0722;
        double d13 = d8 * 0.0193 + d9 * 0.1192 + d10 * 0.9505;
        d11 /= 0.95047;
        d12 /= 1.0;
        d13 /= 1.08883;
        try {
            d4 = d11 > 0.008856 ? Math.pow(d11, 0.3333333333333333) : 7.787 * d11 + 0.13793103448275862;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorSchemeRegistry.a(customSystemException);
        }
        d11 = d4;
        try {
            d3 = d12 > 0.008856 ? Math.pow(d12, 0.3333333333333333) : 7.787 * d12 + 0.13793103448275862;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorSchemeRegistry.a(customSystemException);
        }
        d12 = d3;
        try {
            d2 = d13 > 0.008856 ? Math.pow(d13, 0.3333333333333333) : 7.787 * d13 + 0.13793103448275862;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorSchemeRegistry.a(customSystemException);
        }
        d13 = d2;
        double d14 = 116.0 * d12 - 16.0;
        double d15 = 500.0 * (d11 - d12);
        double d16 = 200.0 * (d12 - d13);
        return new double[]{d14, d15, d16};
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ColorSchemeRegistry.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ColorSchemeRegistry.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = ColorSchemeRegistry.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = ColorSchemeRegistry.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ColorSchemeRegistry.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ColorSchemeRegistry.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ColorSchemeRegistry.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ColorSchemeRegistry.b(231315177164189L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ColorSchemeRegistry.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ColorSchemeRegistry.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ColorSchemeRegistry.b(231315177164189L, 0L);
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

    private ColorSchemeRegistry(String string2, Color color) {
        this.O = string2;
        this.R = color;
        this.g = ColorSchemeRegistry.P(color);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ColorSchemeRegistry.a(l, l2);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                ColorSchemeRegistry.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = ColorSchemeRegistry.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = ColorSchemeRegistry.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ColorSchemeRegistry.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ColorSchemeRegistry.a(clazz3, string2, clazz2)) != null) {
                    ColorSchemeRegistry.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ColorSchemeRegistry.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ColorSchemeRegistry.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ColorSchemeRegistry.b(231315177164189L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ColorSchemeRegistry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

