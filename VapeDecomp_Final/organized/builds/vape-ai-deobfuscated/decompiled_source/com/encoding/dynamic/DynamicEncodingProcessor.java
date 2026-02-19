/*
 * Decompiled with CFR 0.152.
 */
package com.encoding.dynamic;

import com.collections.management.MultiContainerRegistry;
import com.runtime.control.ExecutionStateController;
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

public class DynamicEncodingProcessor
extends ExecutionStateController {
    private static int[] d;
    private static final Object[] k;
    private static final Map f;
    private static final String[] l;
    private static final long[] c;
    private static final long a;
    private static final Integer[] e;

    private static void a() {
        Object[] objectArray = k;
        k[0] = "qW\u0017";
        objectArray[1] = Integer.TYPE;
        DynamicEncodingProcessor.l[1] = "java/lang/Integer";
        objectArray[2] = "\u001ej,~v\u000b\u0015e=1\u000b\u0013\u0006b4x";
        objectArray[3] = "\u0006%w~[j\r*f1:d\u0006!bk";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\"{r\u001cF(&9r!P8G73\u0018[?w?r\u001d;z ?8@E1,|{!";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicEncodingProcessor.a = MultiContainerRegistry.a(2953866266212933439L, -6980188664890811615L, MethodHandles.lookup().lookupClass()).a(107108456775658L);
                DynamicEncodingProcessor.k = new Object[5];
                DynamicEncodingProcessor.l = new String[5];
                DynamicEncodingProcessor.a();
                DynamicEncodingProcessor.f = new HashMap<K, V>(13);
                DynamicEncodingProcessor.m(null);
                var0 = DynamicEncodingProcessor.a ^ 6864145305919L;
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
                var8_3 = new long[134];
                var5_4 = 0;
                var6_5 = "F\u00d8>\u001a\"\t\u008a\u00c3\u001b~\u00cc\u00d5N#;H`\u00c8\u00e7z\u00b9\u00c5\u00a1\\\u0012u|\u00ea/\u00de\u0014u\u00ac\u00aa,PBb\u00dc\u0004\u00da?OV\u00c7\u00e0\u00ba\u000b\u00cd\u00a0.e\u00e1\u00e6\u00c8X\u00d5\u00c8\u00e8\u009f\u00b9\u0001\u00fc2\u00ba7\n\u00bb.\u00d7\u00d0*1w\u00d0\u00e3\u0017\u0083\u00b4*9\u00bc\u0085ww\u008b\u00e1LHQ\u00b0$D\u0019\f\u00d1\u0081\u00f0\u0083\u00f5\u00be\u00a0\u00e7I\u00c3\u00fa@\u00c8\b\u00eb\u00bb\u00a2\u00d7\u0093NNW37]\u00a1v>35_j\u00c9\u0080\u0013h\u00d8\u00b1\u00a9`\u00ac\u00a4\u00f8\u00e1\u00d9~OO\u00c6\u00a0\"\u001b\u00d2\u00a5E1\u00c9>\u008e\u00c7{;\u00a4\u0010\u0080k=\u00ae\u00b0X\u00001\u00bf8\u001bretq,\u00b6\u00b4\u00f8\u0014\u00e6t\n\\h)\u00f2a\u00bb\u00b4\u0098\u00ff\u00d6\u00ce\u00fe\u00045\u00b3\u0097e\nZ\u0006\u0013\u008e\u0094\u00cd\u00e5\u00b1\u00a9\u00dc\u0097'j\u00b4\u0015\u00f6\u0090\u00dfR\u00c7\u00f8;z\u001a\u00d0\u00ce\u0010\u00e7\u00cc\u00e4\u0087\u0013\u00b1\u00ff:\u00ef\u0086\u00d3\u00e7\u0002S\u00cc\u00876\u00c8[\u00bf\u00ee\u00b4\u00dd\u00ed\u0087\u001b\u009b\u001b\u00c5*\u0081f#a\u00a7\u00e0G\u00ab\u00e9s\u0082\u00e3\u0093G\u00c8*\u0094]\u00fbK\u00b0)\u00ad'\u0084\u0099y\u00060eT\u00ce{IA\u008c\u00ac\u0084\u0011:\u00e1\u0088\u0004F\u00dd\u0016\u00ed\t\u00b2\u0004\u0005\u00e0\u0017K\u00d4\u00a0\u00cbc\u001d\u0080\u00b4\u0084\u00d9GL\u00ab\u00f8\u00884\u00c5\u00b3\u0096\u007f\u00fbc+\u00f9l\u0005\u008c\u008b\u00b7\u00b9cw\u00f8\u00f5\u00e9\u00ac\u0000\u00b7=\u00a3\u009bJ\u0015N\u00e5\u00b3\u00eaP\u00ea\u00c1l\u00d7\u0083u\u00d0\u0013=\u00b7\u009f\u00fe\u00aa\u00cc=\u00bd\u00a9\u00df\u00aeoi\u00e8\u00af\u0000*+\u0011\u00d5\u0088\u0080y\u00b2\u00e58#\u00c2K\u00c2\u0096\u00e86<\u0014\u0088\u00b8\u00c9\u0098\u00be\u008c\u007f\u00caT\u00e2\u0007\u00df:\u00af\u001a*\u00f1*\u0010/\u00ea\u00a7\u00a0._\u00cf\u0087gJ\u001d\u009a\u00c7\u00a6\u00b2\u00d2\u0011\u008ew\u001d\u009e~f\u00b5\u0096{\u00c4\u0002\u0005=\u008e\u00e9M\u00d8\u0099\u0005\u00fcH\u00ca\u000f\u00d7\u00f2\u00d6+]\rv\u00d0t\u00a3\u00d4_\u00f6+\u009fK3\u00ab\u00b9\u00a2\u00a3t\u00c8\u00d2ry&l\u0016\u00e6\u00b7o\u00ce\u00f0\u00d1q\u00a3\u0081\u0085\u0094\u0090\u0007#\u00de\u008c\u00f6\u00bb!\ra\u00d4\u0007\u00f7x\u0001I\u00a6\u00d0\u0095\u00ec|UL!\u00d4m\u007f\u00f3~\n\u009a\u009b/7\u00f8'\u00b5\u00e2a&\u00cb\u00ef\u00db\u00e7\u00b4\u00bd \u00cb\u00b95\u0015\u00f8\u0006\u0087\u00ea\u0085\u00e9\u008d\u00af\"KF\u00fb;\u00cb\u00c1\u00ad\u00e93\u00ef\u00d3\u0004\u0081p\u009d,\u0088<.\u00c4\u00cfZ\n\u00a5\u0083\u00db\u00d2X\u00dcj\u00baH\u00ccG8\u00a5f\u00da\u009a\u0019\u00d6\u00e18\u00c4E\u0002,U\u0019-\u001d\u00b1+|\u00eaz\u00d3@0\u00e6\u00aa\u008c\u00e6`\u00a0`\u00bb\u001fH\u009e\u0092e\u00b8@\u0092\u00b8\u00e2=\u00b7C\u0000D\u00e0\u00fa\u00f0\u00c5V\u00c0\u007f:n\u00f4\u00b0\u00aaq\u0001+9\u00f1poW\u0015\u0010Q\u001d\u00e21\u00d3\u00a5\u008azU\u00f1a\u00ff\u0084\u0018\u00a2}\\\u001b\u0011\u00cem\u000b{\u00b9\u00a2g\u0093=P\u0015\u0085g\u00c0\u00ca\u0005\fC\u00ec\u0083\u00c2W\u00cf\u00c2$\u00ce\u001e\u00a904\u0080\u00e4\u0016U/\ft\u00c4\u00a3\u00d8\u00ba\u008d\u00b8+\u00ec~Ns\u00d6\u00c2\u00af\u00c5\u00ea\fM\u001eTm\u00fb\u00fb\u00b7/\u00bf\u0088MKs*\u00c9\u0007\u0099\u00eb\u001fJ\u0080\u00ce\u00fcQLr`!\u009f\u008eBw\u00d3x\u00ec\u0013D1\u0010\u0086\u0018\u0003\u00ea\u00b7\u00ae\u0017O\u00c9\u00e9\u00b8\t'\u00f5\u00b5\u00c0\u00edeP1*p\u0098c\u00aa\u00d0[?d\u009aW\u00b5jF\u00aas\u00a1\u00b8\u00d7\u00dc\u0000\n\u00d8\u00ea\u00b8\u0098s\u0081B\u00a9d%\u00ab\u0096!;\u0018x _I\u00a3\u00a7J\u00ec_6\u0080Q\u00bf\u00c0mE\u00e4}4\u00d4/\u00aaF\u00a4\u0019\\*~\u001c\u0015k\u008bh\u0095\u00b9\u00c4\u009c\u001b@)\u008b\u009f}8\u00c9\u00f5`\u0015\u00f1\u00dc\u00fb\u00cb\u00f5\u00e3\tD\b\u0010(\u00f5\b\u00f0I\u00b8\u00a4\u000b\u0014U\u00ed\u00d8\u0007\u001f\u00fa\u00ca\u0091\u0097J_\u00b1\u0089C)\fl\u0089\u00ea\u00ee\u00a6&\u00c9\u00ff\u00fet\u0014\u00c3\"\u00f3Y\u00107\u0019\u00e5\u00a7aq\u00d2\u00fe\u00ff\u0004st\u00ee?\u00a9\u00e9BS\u0086\u001b\u00bd#\u008f\u0005\u0081\u0085\"\u00a8\u00eb\u00af%\u00f2\u00c4>(\u00e1\u001d\u00f5\u0095\u00bc'O\u008d>7\u0091\u00d0\u0087\u00bf\u0014h\u00bc\u00e4\u0014I\u00fa?\u00d7[H\u008ec\u00e3t=\u009c\u009d\u00e9\u00f9\u00c9\u009e\u00e7\u00e7\u00cdg\u009cZC\u0091\u00d3Y \u00ae\u00dc\f\u00d0\u0018\u00bc\u0095c\u00f3*\u00a45g-\u0001\u00b9\u00bc\u00c9\u009b\u00b5\u00f5}\u0081A[3\u00f3h\u00b0\u00c3\u00ed\u0015\u001ei>b^Z/\u00af\u00d0y";
                var7_6 = "F\u00d8>\u001a\"\t\u008a\u00c3\u001b~\u00cc\u00d5N#;H`\u00c8\u00e7z\u00b9\u00c5\u00a1\\\u0012u|\u00ea/\u00de\u0014u\u00ac\u00aa,PBb\u00dc\u0004\u00da?OV\u00c7\u00e0\u00ba\u000b\u00cd\u00a0.e\u00e1\u00e6\u00c8X\u00d5\u00c8\u00e8\u009f\u00b9\u0001\u00fc2\u00ba7\n\u00bb.\u00d7\u00d0*1w\u00d0\u00e3\u0017\u0083\u00b4*9\u00bc\u0085ww\u008b\u00e1LHQ\u00b0$D\u0019\f\u00d1\u0081\u00f0\u0083\u00f5\u00be\u00a0\u00e7I\u00c3\u00fa@\u00c8\b\u00eb\u00bb\u00a2\u00d7\u0093NNW37]\u00a1v>35_j\u00c9\u0080\u0013h\u00d8\u00b1\u00a9`\u00ac\u00a4\u00f8\u00e1\u00d9~OO\u00c6\u00a0\"\u001b\u00d2\u00a5E1\u00c9>\u008e\u00c7{;\u00a4\u0010\u0080k=\u00ae\u00b0X\u00001\u00bf8\u001bretq,\u00b6\u00b4\u00f8\u0014\u00e6t\n\\h)\u00f2a\u00bb\u00b4\u0098\u00ff\u00d6\u00ce\u00fe\u00045\u00b3\u0097e\nZ\u0006\u0013\u008e\u0094\u00cd\u00e5\u00b1\u00a9\u00dc\u0097'j\u00b4\u0015\u00f6\u0090\u00dfR\u00c7\u00f8;z\u001a\u00d0\u00ce\u0010\u00e7\u00cc\u00e4\u0087\u0013\u00b1\u00ff:\u00ef\u0086\u00d3\u00e7\u0002S\u00cc\u00876\u00c8[\u00bf\u00ee\u00b4\u00dd\u00ed\u0087\u001b\u009b\u001b\u00c5*\u0081f#a\u00a7\u00e0G\u00ab\u00e9s\u0082\u00e3\u0093G\u00c8*\u0094]\u00fbK\u00b0)\u00ad'\u0084\u0099y\u00060eT\u00ce{IA\u008c\u00ac\u0084\u0011:\u00e1\u0088\u0004F\u00dd\u0016\u00ed\t\u00b2\u0004\u0005\u00e0\u0017K\u00d4\u00a0\u00cbc\u001d\u0080\u00b4\u0084\u00d9GL\u00ab\u00f8\u00884\u00c5\u00b3\u0096\u007f\u00fbc+\u00f9l\u0005\u008c\u008b\u00b7\u00b9cw\u00f8\u00f5\u00e9\u00ac\u0000\u00b7=\u00a3\u009bJ\u0015N\u00e5\u00b3\u00eaP\u00ea\u00c1l\u00d7\u0083u\u00d0\u0013=\u00b7\u009f\u00fe\u00aa\u00cc=\u00bd\u00a9\u00df\u00aeoi\u00e8\u00af\u0000*+\u0011\u00d5\u0088\u0080y\u00b2\u00e58#\u00c2K\u00c2\u0096\u00e86<\u0014\u0088\u00b8\u00c9\u0098\u00be\u008c\u007f\u00caT\u00e2\u0007\u00df:\u00af\u001a*\u00f1*\u0010/\u00ea\u00a7\u00a0._\u00cf\u0087gJ\u001d\u009a\u00c7\u00a6\u00b2\u00d2\u0011\u008ew\u001d\u009e~f\u00b5\u0096{\u00c4\u0002\u0005=\u008e\u00e9M\u00d8\u0099\u0005\u00fcH\u00ca\u000f\u00d7\u00f2\u00d6+]\rv\u00d0t\u00a3\u00d4_\u00f6+\u009fK3\u00ab\u00b9\u00a2\u00a3t\u00c8\u00d2ry&l\u0016\u00e6\u00b7o\u00ce\u00f0\u00d1q\u00a3\u0081\u0085\u0094\u0090\u0007#\u00de\u008c\u00f6\u00bb!\ra\u00d4\u0007\u00f7x\u0001I\u00a6\u00d0\u0095\u00ec|UL!\u00d4m\u007f\u00f3~\n\u009a\u009b/7\u00f8'\u00b5\u00e2a&\u00cb\u00ef\u00db\u00e7\u00b4\u00bd \u00cb\u00b95\u0015\u00f8\u0006\u0087\u00ea\u0085\u00e9\u008d\u00af\"KF\u00fb;\u00cb\u00c1\u00ad\u00e93\u00ef\u00d3\u0004\u0081p\u009d,\u0088<.\u00c4\u00cfZ\n\u00a5\u0083\u00db\u00d2X\u00dcj\u00baH\u00ccG8\u00a5f\u00da\u009a\u0019\u00d6\u00e18\u00c4E\u0002,U\u0019-\u001d\u00b1+|\u00eaz\u00d3@0\u00e6\u00aa\u008c\u00e6`\u00a0`\u00bb\u001fH\u009e\u0092e\u00b8@\u0092\u00b8\u00e2=\u00b7C\u0000D\u00e0\u00fa\u00f0\u00c5V\u00c0\u007f:n\u00f4\u00b0\u00aaq\u0001+9\u00f1poW\u0015\u0010Q\u001d\u00e21\u00d3\u00a5\u008azU\u00f1a\u00ff\u0084\u0018\u00a2}\\\u001b\u0011\u00cem\u000b{\u00b9\u00a2g\u0093=P\u0015\u0085g\u00c0\u00ca\u0005\fC\u00ec\u0083\u00c2W\u00cf\u00c2$\u00ce\u001e\u00a904\u0080\u00e4\u0016U/\ft\u00c4\u00a3\u00d8\u00ba\u008d\u00b8+\u00ec~Ns\u00d6\u00c2\u00af\u00c5\u00ea\fM\u001eTm\u00fb\u00fb\u00b7/\u00bf\u0088MKs*\u00c9\u0007\u0099\u00eb\u001fJ\u0080\u00ce\u00fcQLr`!\u009f\u008eBw\u00d3x\u00ec\u0013D1\u0010\u0086\u0018\u0003\u00ea\u00b7\u00ae\u0017O\u00c9\u00e9\u00b8\t'\u00f5\u00b5\u00c0\u00edeP1*p\u0098c\u00aa\u00d0[?d\u009aW\u00b5jF\u00aas\u00a1\u00b8\u00d7\u00dc\u0000\n\u00d8\u00ea\u00b8\u0098s\u0081B\u00a9d%\u00ab\u0096!;\u0018x _I\u00a3\u00a7J\u00ec_6\u0080Q\u00bf\u00c0mE\u00e4}4\u00d4/\u00aaF\u00a4\u0019\\*~\u001c\u0015k\u008bh\u0095\u00b9\u00c4\u009c\u001b@)\u008b\u009f}8\u00c9\u00f5`\u0015\u00f1\u00dc\u00fb\u00cb\u00f5\u00e3\tD\b\u0010(\u00f5\b\u00f0I\u00b8\u00a4\u000b\u0014U\u00ed\u00d8\u0007\u001f\u00fa\u00ca\u0091\u0097J_\u00b1\u0089C)\fl\u0089\u00ea\u00ee\u00a6&\u00c9\u00ff\u00fet\u0014\u00c3\"\u00f3Y\u00107\u0019\u00e5\u00a7aq\u00d2\u00fe\u00ff\u0004st\u00ee?\u00a9\u00e9BS\u0086\u001b\u00bd#\u008f\u0005\u0081\u0085\"\u00a8\u00eb\u00af%\u00f2\u00c4>(\u00e1\u001d\u00f5\u0095\u00bc'O\u008d>7\u0091\u00d0\u0087\u00bf\u0014h\u00bc\u00e4\u0014I\u00fa?\u00d7[H\u008ec\u00e3t=\u009c\u009d\u00e9\u00f9\u00c9\u009e\u00e7\u00e7\u00cdg\u009cZC\u0091\u00d3Y \u00ae\u00dc\f\u00d0\u0018\u00bc\u0095c\u00f3*\u00a45g-\u0001\u00b9\u00bc\u00c9\u009b\u00b5\u00f5}\u0081A[3\u00f3h\u00b0\u00c3\u00ed\u0015\u001ei>b^Z/\u00af\u00d0y".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00f6\u00bbK\u00b7\u00e2\u000b\u0006x?\"\u0081\u0003%\u0082T\u00dd";
                    var7_6 = "\u00f6\u00bbK\u00b7\u00e2\u000b\u0006x?\"\u0081\u0003%\u0082T\u00dd".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        DynamicEncodingProcessor.c = var8_3;
        DynamicEncodingProcessor.e = new Integer[134];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicEncodingProcessor.a(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicEncodingProcessor.k[n] = clazz = Class.forName(DynamicEncodingProcessor.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicEncodingProcessor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = DynamicEncodingProcessor.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = DynamicEncodingProcessor.l[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicEncodingProcessor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicEncodingProcessor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicEncodingProcessor.a(clazz3, string2, clazz2)) != null) {
                    DynamicEncodingProcessor.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicEncodingProcessor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicEncodingProcessor.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicEncodingProcessor.b(214904601082760L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == 'V' || c == '\u00c1' || c == '\u00ca') {
                field = DynamicEncodingProcessor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicEncodingProcessor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicEncodingProcessor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicEncodingProcessor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicEncodingProcessor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (DynamicEncodingProcessor.l[n4] != null) {
            return n4;
        }
        Object object = k[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 6;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 54;
                break;
            }
            case 7: {
                n3 = 60;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 21;
                break;
            }
            case 11: {
                n3 = 46;
                break;
            }
            case 12: {
                n3 = 16;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 61;
                break;
            }
            case 16: {
                n3 = 56;
                break;
            }
            case 17: {
                n3 = 33;
                break;
            }
            case 18: {
                n3 = 24;
                break;
            }
            case 19: {
                n3 = 28;
                break;
            }
            case 20: {
                n3 = 62;
                break;
            }
            case 21: {
                n3 = 15;
                break;
            }
            case 22: {
                n3 = 55;
                break;
            }
            case 23: {
                n3 = 20;
                break;
            }
            case 24: {
                n3 = 50;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 23;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 22;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 40;
                break;
            }
            case 35: {
                n3 = 13;
                break;
            }
            case 36: {
                n3 = 49;
                break;
            }
            case 37: {
                n3 = 34;
                break;
            }
            case 38: {
                n3 = 5;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 12;
                break;
            }
            case 41: {
                n3 = 14;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 43;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 30;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 52;
                break;
            }
            case 53: {
                n3 = 59;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 36;
                break;
            }
            case 56: {
                n3 = 0;
                break;
            }
            case 57: {
                n3 = 32;
                break;
            }
            case 58: {
                n3 = 31;
                break;
            }
            case 59: {
                n3 = 37;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 42;
                break;
            }
            default: {
                n3 = 53;
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
        DynamicEncodingProcessor.l[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = DynamicEncodingProcessor.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = DynamicEncodingProcessor.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicEncodingProcessor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicEncodingProcessor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicEncodingProcessor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicEncodingProcessor.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicEncodingProcessor.b(214904601082760L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicEncodingProcessor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicEncodingProcessor.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicEncodingProcessor.b(214904601082760L, 0L);
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

    public static int[] n() {
        return d;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public DynamicEncodingProcessor() {
        long l = a ^ 0x31D95E62E72BL;
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)3770, (long)(0x5C1782C2EC5790F2L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)6111, (long)(0x6DEC2A4E8F8F099DL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)12441, (long)(0x320068EBF461AE70L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)2461, (long)(0x1B36987A569297D0L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)13421, (long)(0x6C09CA662195AA3FL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)7952, (long)(0x7CF05852BFDB813CL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)28321, (long)(0x1DC929ECBF78F0E7L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)3855, (long)(0x6238D0FF54E99153L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)20191, (long)(0x6E1CBB4FC87DD0D4L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)23480, (long)(0x46DEB9AC2721C585L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)11140, (long)(0x484760CAE9CE35DCL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)3520, (long)(0x6E4E67E09FCF93F6L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)13509, (long)(0x3C17602511FEAADBL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)32379, (long)(0x37F746CED853E042L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)6384, (long)(0x4C8521F2B93986EAL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)20968, (long)(0x3D950214B2924FFAL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)30386, (long)(0x7D62C4723CA5E8C5L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)12365, (long)(0x5ABA9FD18BFAE71L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4474, (long)(0x7530C03DC4CD0F7EL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)24190, (long)(0x40D70EC26527C05DL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)9751, (long)(0x3FD5B7A0CD913856L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)29595, (long)(0x380DB25D885CEDFEL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)6687, (long)(0x1309E22CF77D0458L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)17142, (long)(0xC315D313CEE5C8AL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22673, (long)(0x94DFF4EA63946FCL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14544, (long)(0x7227253DD4A02683L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)8435, (long)(0x7F203F2C02933EE4L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)11916, (long)(0x3D474EC67B030ACL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)10651, (long)(0x79BC43BC696B37AFL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)25993, (long)(0x5CD3DDED3643FBEBL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4520, (long)(0x4610136A8A960FE4L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)23253, (long)(0x29D3F1EB118544CDL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)24402, (long)(0x4E83EE6660C0C12AL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)12878, (long)(0x1E2D498990DD2C4CL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)10644, (long)(0x275943F5BC1CB7FDL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14430, (long)(0xAB3A93BCDDCA66EL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)5123, (long)(0x2949B4AE25C70A53L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4077, (long)(0x45DDF03A5B3511B7L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)15445, (long)(0x7E66DB688C82254L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)3993, (long)(0x2051D0C529E91194L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4986, (long)(0x68306E394D078D4FL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)305, (long)(0x7E4A0519580C9F10L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)17765, (long)(0x61E8EF60FEADB0DL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)19354, (long)(0x14C696DCED125585L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)26180, (long)(0x27F33767F60BF800L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4758, (long)(0x42EBB839E8588CB4L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)28378, (long)(0x5D3EA5AD5599F083L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)28202, (long)(0x47B8A69E089A7005L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)30549, (long)(0x5198E34A80736964L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)28815, (long)(0x1F782E9881656EE3L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)13246, (long)(0x1B70BC24A7182D84L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)29330, (long)(0x1C1E983C2EBD6CD8L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4173, (long)(0x63D75443BC028E10L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)23234, (long)(0xC091DE8FB6AC499L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)8399, (long)(0x4B165B5BE8AB3EA0L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)1718, (long)(0x24C697B6BB3998E3L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)8848, (long)(0x6DF75F28DBC93C99L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)1666, (long)(0x39C3FE2C526018F1L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)12454, (long)(0x1625B92034D2EACL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)30396, (long)(0x449EC508C76368C5L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14343, (long)(0x7925A3F603D6264EL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)17743, (long)(0x2706CE4B88795B4AL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4933, (long)(0x68C48FD0E21E0D6DL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)13725, (long)(0x263F15D35F132BD8L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)15008, (long)(0x7DA0734FA2A424D4L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)376, (long)(0x5207FF9CDA3D1F77L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14669, (long)(0x22E95FDCA7ECA76BL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)19817, (long)(0x5318F6D301EB5378L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4611, (long)(0x9CF4977ED658C5DL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)27803, (long)(0x39E79F8BC947288L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)8554, (long)(0x64E0C2CDEE103F85L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)11862, (long)(0x24B77C954485B035L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)20988, (long)(0x69ADF061F27F4F17L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)15506, (long)(0x1177FED681562291L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)23688, (long)(0x4DBFB7D88C4042DCL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)15597, (long)(0x3C5AABCE1722DFL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)1226, (long)(0x85B1ADC8A429AD3L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)18475, (long)(0x1146FE1292885656L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)30450, (long)(0x2F9666E97DBDE8D7L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)7419, (long)(0x56F2145E199202ACL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)15595, (long)(0x7BA9A12A86DC229AL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)31832, (long)(0x63A3D1B4FB52624CL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)12126, (long)(0x269BFD01D99C3124L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)13332, (long)(0x48F0C83652F42A3FL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)18366, (long)(0x6ECF30EA848959D4L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)28764, (long)(0x47A3E933856E75L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22709, (long)(0x18876584A26AC6CAL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)5692, (long)(0x1062116AA8D8807L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)5405, (long)(0x15DF037ABF438B00L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22271, (long)(0x239882C806CFC8C0L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)21505, (long)(0x36554FA90166CA6AL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)944, (long)(0x37400BE1071C1DFFL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14694, (long)(0x3D3B0FA87562275EL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)31278, (long)(0x25D662A068C1E44FL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)6158, (long)(0x53338D66F6380670L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)21970, (long)(0x7BBA8628440CBD4L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4501, (long)(0x172388FA94AC8FE7L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14970, (long)(0x20A2FAAB0E40A450L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)6172, (long)(0x1DA91EFE14AB0652L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)32260, (long)(0xFE7467122CF600AL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)26763, (long)(0x292D9F17CAFBF6B5L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22997, (long)(0x2D2DC32C094A47A3L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)18622, (long)(0x1F398742F62B5690L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14019, (long)(0x4976543FD83828B6L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)24774, (long)(0x7158E5A9F2C37ED3L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)19436, (long)(0x71E146D3B90955BAL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4525, (long)(0x62BACE07E7E08F45L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)6424, (long)(0x311F32FDF866077CL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)9992, (long)(0x34F9652A15CE39E2L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)23526, (long)(0x6195885EAC8A45C2L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)14186, (long)(0x735488C952C2293BL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)2538, (long)(0x2D9466D67F87978AL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)13785, (long)(0x707A15C0D0D32B99L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)15536, (long)(0x5E5B0A9E6747A2BCL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)2267, (long)(0x292BDAC625BD16ECL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)20354, (long)(0x7207278CF627D1AFL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)24992, (long)(0x3E5E3116DD6DFFD0L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)11217, (long)(0x595C6B2B310AB592L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22241, (long)(0x4BA7934AAA0FC8F7L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)17359, (long)(0xE4AB12EBCEB5DA9L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)20525, (long)(0x2100F40F69D64E72L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22068, (long)(0x35046CA0B9C5C834L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)29220, (long)(0x572210A6966C4AL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)2158, (long)(0x529A55457A111666L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)22440, (long)(0x798C46A9B3BC9AFL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)25441, (long)(0x58D0D8B4D2A87D2AL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)59, (long)(0x184FCF2A473F1E20L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)31344, (long)(0x6E7A40D34FFEE46CL ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)12890, (long)(0x263D621CE4772C21L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)16807, (long)(0x70A1AB8D9778DF49L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)26558, (long)(0x4A774E278A7FF9D9L ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)16917, (long)(0x2D8E3CBC78E5DC26L ^ l)), (long)4187791697597483750L, (long)l)));
        this.I((String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)4701, (long)(0x7712379629FD0C4DL ^ l)), (long)4187791697597483750L, (long)l)), (String)((Object)DynamicEncodingProcessor.c("C", (int)DynamicEncodingProcessor.a("f", (int)18974, (long)(0x2137541D7DD55439L ^ l)), (long)4187791697597483750L, (long)l)));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2474;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("a/ca", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicEncodingProcessor.e[n2] = n3;
        }
        return e[n2];
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
        Field field = DynamicEncodingProcessor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicEncodingProcessor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void m(int[] nArray) {
        d = nArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicEncodingProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DynamicEncodingProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

