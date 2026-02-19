/*
 * Decompiled with CFR 0.152.
 */
package com.spatial.mapping;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SpatialCoordinateMapper {
    public static final int dX;
    public static final int ds;
    public static final int dN;
    public static final int y;
    public static final int g;
    public static final int F;
    public static final int r;
    public static final int dr;
    public static final int di;
    public static final int dH;
    public static final int d4;
    public static final int df;
    public static final int Ci;
    public static final int c;
    public static final int d7;
    public static final int de;
    public static final int du;
    public static final int K;
    public static final int j;
    public static final int k;
    public static final int dQ;
    public static final int d5;
    public static final int dI;
    public static final int p;
    public static final int Cz;
    public static final int dp;
    public static final int d9;
    public static final int dn;
    public static final int Q;
    public static final int b;
    public static final int dZ;
    public static final int dd;
    public static final int dU;
    public static final int d0 = -1;
    public static final int dF;
    public static final int i;
    public static final int U;
    public static final int dc;
    public static final int Cv;
    public static final int dB;
    public static final int d3;
    public static final int dg;
    public static final int dK;
    public static final int C;
    public static final int dD;
    public static final int X;
    public static final int m;
    public static final int N;
    public static final int dR;
    public static final int CB;
    public static final int dL;
    public static final int G;
    public static final int d1;
    public static final int dt;
    public static final int Z;
    public static final int v;
    public static final int CU;
    public static final int dG;
    public static final int J;
    public static final int u;
    static int[] Cb;
    public static final int dz;
    public static final int Cl;
    public static final int L;
    public static final int dv;
    public static final int E;
    public static final int dV;
    public static final int dj;
    public static final int dT;
    public static final int I;
    public static final int dA;
    public static final int dh;
    public static final int dJ;
    public static final int dk;
    public static final int h;
    public static final int dM;
    public static final int S;
    public static final int dy;
    public static final int dP;
    public static final int M;
    public static final int V;
    public static final int a;
    public static final int H;
    public static final int dx;
    public static final int d8;
    public static final int dl;
    public static final int dS;
    public static final int dY;
    public static final int q;
    public static final int R;
    public static final int A;
    public static final int D;
    public static final int T;
    public static final int f;
    public static final int dq;
    public static final int dW;
    public static final int w;
    public static final int dO;
    public static final int d;
    public static final int da;
    public static final int dC;
    public static final int dE;
    public static final int z;
    public static final int d2;
    public static final int o;
    public static final int s;
    public static final int W;
    public static final int d6;
    public static final int B;
    public static final int CE;
    public static final int O;
    public static final int dm;
    public static final int Y;
    public static final int l;
    public static final int t;
    public static final int dw;
    public static final int Cq;
    public static final int d_;
    public static final int x;
    public static final int P;
    public static final int e;
    public static final int n;
    public static final int db;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int X(int n) {
        try {
            if (n > Cb.length - 1) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SpatialCoordinateMapper.a(customSystemException);
        }
        return Cb[n];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var1 = MultiContainerRegistry.a(-2419539758559018704L, -2598690238306903081L, MethodHandles.lookup().lookupClass()).a(239521338839748L) ^ 33471023880734L;
                var3_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var1 >>> 56);
                for (var4_2 = 1; var4_2 < 8; ++var4_2) {
                    v2 = v2;
                    v2[var4_2] = (byte)(var1 << var4_2 * 8 >>> 56);
                }
                var3_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[120];
                var6_4 = 0;
                var7_5 = "B\u00e9\u0087`\u00e8\u0005\u0004\u00d6\u00ff\\\f\u00f3M.\u00aa\u00baG9\u0095L\u00f1\u00a4\u0091\u00adw\u00aa\u00a5\u0000sS\u00bbG8\u0096<\u00e5\u001f}%\u00eaCH\u00bc\u00fcKF\u0081\u00ba#)\u00e4y\u00e8p\u0081|LX\u00de\u00f8\u0087bQ9\u0080\u00a1_'@\u00e9\u00e8\u00a1\u0006%\u00a2\u0002\u00aa\u00d3\u00b9E\u009e\u00c4\u00ba\u009a4\u00b5\u00ffw\u00b4\u00e7\u00a5g`\u00ca\u00f0\u00af\u00ffpC\u009f6\u00cb\u00caDE\u001e'Kt/~B\u008c\u00c4\u00e3\u00b8\u0098+7\u00ee\u00ee\u001d\u00d3RE\u009e\u009cVzU\u0098\u000e\u000eOZ\u0094\u0094\u0092\u0017\u00e0\u00da\u009c\u008d\u0000]\u00c6\u00f7_\u00cf\u001b\u00dd6\u0090xp\u0005\u00e5X\u00f3\u0007\u00e8/\u00efg\u00f86\u00a2\u001f\u00d7\u009e\u00c2\u00b0\u0081\u00f8\u009f\u00a9?\n$g\u00eb'\u00d5\u0005\u00a5\u00e8\u00a0\u001fvR\u00b9\u0087\u008c\u0089o\u00b7\u0007L\u00d9\u0018\u007f\u00ed/\u00fd&\u00a2\u00c6\u00a9\u00b9\u00a9\f\u00aa\u00e8\u00c4\"\u00e6\u008a\u00c5\u0092\b\u0086N\u00bf\u00fc`\u009a\u00ceD\u00e2\u00b2\u008d\u00d1`\u00a3\u00de\u008b\t\u008a\u00a2\u0097\u000e\u00f6\u00b6WBe(\u00ca\u008e;\u00a1M\u000f\u00eb\b4<\u00d5\u00e9!9.\u0097\u00e1\r\u00c4\u0094\u00deV\u00a5p\u0004\u00e2\u00d5\u0092\u00bf\u0096B\u0089\u00c5\u008a\u00a7\u00ea:\u00f3=Ii\u00b9\u001c\u00b5\u00dcO\u00a2\"\u009a\u00f5\u008e\u00c0\u00a3i\u008c-{\u0090\u0018\u000e\u0017\u0005\u0085.\u00b2\t\u00a3Z\u00ba\u008eU+K\u00a9q\u00ce\u009c\u0086j\u00c4y\b\u00d5\u00d7\u0015~\u008f\u008b\u00b2\u00e9.f\u00ab\u0093\u0015\u00b0\u0092P\u00aeV\u009c|`E2\u00a7+#\u00c0\u0099L\u009e\u0096Q\u00b7\u008cdG\u0097\u0018\u00b5\u00d8-Z\u00d0E\u00f7>Jk\u00d5\u00cd\u00d4\u009bi_\u0006\u00bf\u0084\u001e4\u00e3\u00a30\u0018\u00dc\u00bbx\u00a0\u00dcD\u00c8\u00da\u00c4\u0083\u001a\u00b6\u00e7p\u00cf\u00eb\u0013\r\u00e8\u00eaZ\u00be\u0014z\u00ac\r1\u00f4\u001dv\u00b0\u00a9\u00c6\u00b6\u0002\u0098\u008a\u00a52*wC QI\u001b\r \u00e5\u00cc7R^\u0099\u00c2\u00d4\u00ddD;\u0091?\u0094\u008dG\u00ba\u00bf\u00dd0z\u00ca\u000e\u00bb\f\u0091\u00b5\u001c{\u00fcY\n\u0083\u001c\u0010(\u00b7\u00e0/rAG\u00ec}']\u001d\u00a0aI\u00a0\u0011\u0019z\u00fcl\u00e8\u008f\u0094\u00b2X8\u00e7oZ\u0011_P\u00fa\u007f\"\u00c9G\u00d6\u00fc\u00d1-\u00e3\u00bf\u00d6\u00ce\u00f0\u00c8\u00c4v\u008d\u00d70\u00cb\u00d5\u0084f\u00fb\u00d82\u0081\u00fb\t&4oK\u00bb\u00bb\u0096\\\u0007\u00fe\u0081ik\u0010f\u00e3\u0013,+F=\u00fa\u00cd\u0093\u00b1\u0094t\u00e3\u00d7\u00d3UDU,\u00dcp\u00a56\u00f29\u00b5\u0001\u00a8\u0091\u009a\u008d\u00c1|\u0003\u00efz\u008fL\u001d\u00a1\u008d\u008e|V\u00df%R;k\fK\u00c4\u0086H#\u0088\u00fc\u00f1\u00ad\t\r\u00fdt\u0084E\u00b4Q\u001e\u00a3\u00e8F\u00b1M\u00e5\u0083^1\u0012\u00ee\u0011k{\u00b4\u00ef\u00f6\u0084We\u0015\u0093\u00f9oT\u0019\u0083\u0085\u0003?\u00e3m\u0005\u00f1w\u0088\u00e0\\\u0092\u00e8\u0098lO3i\u00d8\u001eU\u008f\u00cc\u00f4j\u00e6\u00af\u00ee$\u001e\u00a4R\u0094Llr\u00ad\u00afKs\u00bd\u00e4U\u007f\u00e2DK\u00fbm\u00cc\u00aeT\u00b3\u00b9E4\u00b9<\u00fb\u0010\u00ebB\u0007+U\u00f3\u00e8\u00f5\u008cs_\u00a3\u00df\u00b5J\u00a8Mk\u00b7~\u00ce\u008d\u009f\u0086\u00bb\u00d3\u008a \u00bf\u0093\u00d7\u00e4\\\u00c6\u00d06\u00a4\u0000\u00c1P%\u00c0\u009a\u00d2\u00bd8\u00b9\u00f3\u00fe\u001f\u00aa\u00eeF@N#\u00f7d\u00b4\u00b1\u00f6g\u00b4\u0082\u0081\u00a5l<\u000b\r\u0014\u00cb\\T\u00aa\u00d0\u008e\u0001\u009dt s\u00d3\u00e6\u00b1\u0017SY\u00b2(0\b\u00aa\u00be\u0085\u0081\u00dfs\u00a0y\u0083q\u00d4\u00ab\u00d0\u001e\u00faR\u00ca\u00b7\u0006)\u00f0#e\u00bf\u008b\u0019\u00a6R\u001b1\u0019\t\u0092\u00f5\u00cb?j\u00a6\u0093\u009a\u00e6Hr\u00f75\u00ce\u0092=\u00dc\u0088{\u00ff\u008b\u00fah\u0007\u0085fn\u009dLGc\u00ac\u00e9\u00d9h`\u00a0\u0011Y-\u000e\u00ce*/t\u00f5\u000b\u00f4\u0012_, \u000buB\u00ce\u00car\u00a0Kn\u007fX\u00f3IWp\u008a\u001c\u0004\u0007\u00e2i\u00cfL{\u0013b_=\u000eQ[\u00dc\u00b9N\u00cf+\u00cfl\u00d3\u00da\u00ed{r\u00e5)z\u00ca:$\u0002\u0017\u00c6~\u0080\u0017\u000f\u00f8\u0088\u00a3\u00b2";
                var8_6 = "B\u00e9\u0087`\u00e8\u0005\u0004\u00d6\u00ff\\\f\u00f3M.\u00aa\u00baG9\u0095L\u00f1\u00a4\u0091\u00adw\u00aa\u00a5\u0000sS\u00bbG8\u0096<\u00e5\u001f}%\u00eaCH\u00bc\u00fcKF\u0081\u00ba#)\u00e4y\u00e8p\u0081|LX\u00de\u00f8\u0087bQ9\u0080\u00a1_'@\u00e9\u00e8\u00a1\u0006%\u00a2\u0002\u00aa\u00d3\u00b9E\u009e\u00c4\u00ba\u009a4\u00b5\u00ffw\u00b4\u00e7\u00a5g`\u00ca\u00f0\u00af\u00ffpC\u009f6\u00cb\u00caDE\u001e'Kt/~B\u008c\u00c4\u00e3\u00b8\u0098+7\u00ee\u00ee\u001d\u00d3RE\u009e\u009cVzU\u0098\u000e\u000eOZ\u0094\u0094\u0092\u0017\u00e0\u00da\u009c\u008d\u0000]\u00c6\u00f7_\u00cf\u001b\u00dd6\u0090xp\u0005\u00e5X\u00f3\u0007\u00e8/\u00efg\u00f86\u00a2\u001f\u00d7\u009e\u00c2\u00b0\u0081\u00f8\u009f\u00a9?\n$g\u00eb'\u00d5\u0005\u00a5\u00e8\u00a0\u001fvR\u00b9\u0087\u008c\u0089o\u00b7\u0007L\u00d9\u0018\u007f\u00ed/\u00fd&\u00a2\u00c6\u00a9\u00b9\u00a9\f\u00aa\u00e8\u00c4\"\u00e6\u008a\u00c5\u0092\b\u0086N\u00bf\u00fc`\u009a\u00ceD\u00e2\u00b2\u008d\u00d1`\u00a3\u00de\u008b\t\u008a\u00a2\u0097\u000e\u00f6\u00b6WBe(\u00ca\u008e;\u00a1M\u000f\u00eb\b4<\u00d5\u00e9!9.\u0097\u00e1\r\u00c4\u0094\u00deV\u00a5p\u0004\u00e2\u00d5\u0092\u00bf\u0096B\u0089\u00c5\u008a\u00a7\u00ea:\u00f3=Ii\u00b9\u001c\u00b5\u00dcO\u00a2\"\u009a\u00f5\u008e\u00c0\u00a3i\u008c-{\u0090\u0018\u000e\u0017\u0005\u0085.\u00b2\t\u00a3Z\u00ba\u008eU+K\u00a9q\u00ce\u009c\u0086j\u00c4y\b\u00d5\u00d7\u0015~\u008f\u008b\u00b2\u00e9.f\u00ab\u0093\u0015\u00b0\u0092P\u00aeV\u009c|`E2\u00a7+#\u00c0\u0099L\u009e\u0096Q\u00b7\u008cdG\u0097\u0018\u00b5\u00d8-Z\u00d0E\u00f7>Jk\u00d5\u00cd\u00d4\u009bi_\u0006\u00bf\u0084\u001e4\u00e3\u00a30\u0018\u00dc\u00bbx\u00a0\u00dcD\u00c8\u00da\u00c4\u0083\u001a\u00b6\u00e7p\u00cf\u00eb\u0013\r\u00e8\u00eaZ\u00be\u0014z\u00ac\r1\u00f4\u001dv\u00b0\u00a9\u00c6\u00b6\u0002\u0098\u008a\u00a52*wC QI\u001b\r \u00e5\u00cc7R^\u0099\u00c2\u00d4\u00ddD;\u0091?\u0094\u008dG\u00ba\u00bf\u00dd0z\u00ca\u000e\u00bb\f\u0091\u00b5\u001c{\u00fcY\n\u0083\u001c\u0010(\u00b7\u00e0/rAG\u00ec}']\u001d\u00a0aI\u00a0\u0011\u0019z\u00fcl\u00e8\u008f\u0094\u00b2X8\u00e7oZ\u0011_P\u00fa\u007f\"\u00c9G\u00d6\u00fc\u00d1-\u00e3\u00bf\u00d6\u00ce\u00f0\u00c8\u00c4v\u008d\u00d70\u00cb\u00d5\u0084f\u00fb\u00d82\u0081\u00fb\t&4oK\u00bb\u00bb\u0096\\\u0007\u00fe\u0081ik\u0010f\u00e3\u0013,+F=\u00fa\u00cd\u0093\u00b1\u0094t\u00e3\u00d7\u00d3UDU,\u00dcp\u00a56\u00f29\u00b5\u0001\u00a8\u0091\u009a\u008d\u00c1|\u0003\u00efz\u008fL\u001d\u00a1\u008d\u008e|V\u00df%R;k\fK\u00c4\u0086H#\u0088\u00fc\u00f1\u00ad\t\r\u00fdt\u0084E\u00b4Q\u001e\u00a3\u00e8F\u00b1M\u00e5\u0083^1\u0012\u00ee\u0011k{\u00b4\u00ef\u00f6\u0084We\u0015\u0093\u00f9oT\u0019\u0083\u0085\u0003?\u00e3m\u0005\u00f1w\u0088\u00e0\\\u0092\u00e8\u0098lO3i\u00d8\u001eU\u008f\u00cc\u00f4j\u00e6\u00af\u00ee$\u001e\u00a4R\u0094Llr\u00ad\u00afKs\u00bd\u00e4U\u007f\u00e2DK\u00fbm\u00cc\u00aeT\u00b3\u00b9E4\u00b9<\u00fb\u0010\u00ebB\u0007+U\u00f3\u00e8\u00f5\u008cs_\u00a3\u00df\u00b5J\u00a8Mk\u00b7~\u00ce\u008d\u009f\u0086\u00bb\u00d3\u008a \u00bf\u0093\u00d7\u00e4\\\u00c6\u00d06\u00a4\u0000\u00c1P%\u00c0\u009a\u00d2\u00bd8\u00b9\u00f3\u00fe\u001f\u00aa\u00eeF@N#\u00f7d\u00b4\u00b1\u00f6g\u00b4\u0082\u0081\u00a5l<\u000b\r\u0014\u00cb\\T\u00aa\u00d0\u008e\u0001\u009dt s\u00d3\u00e6\u00b1\u0017SY\u00b2(0\b\u00aa\u00be\u0085\u0081\u00dfs\u00a0y\u0083q\u00d4\u00ab\u00d0\u001e\u00faR\u00ca\u00b7\u0006)\u00f0#e\u00bf\u008b\u0019\u00a6R\u001b1\u0019\t\u0092\u00f5\u00cb?j\u00a6\u0093\u009a\u00e6Hr\u00f75\u00ce\u0092=\u00dc\u0088{\u00ff\u008b\u00fah\u0007\u0085fn\u009dLGc\u00ac\u00e9\u00d9h`\u00a0\u0011Y-\u000e\u00ce*/t\u00f5\u000b\u00f4\u0012_, \u000buB\u00ce\u00car\u00a0Kn\u007fX\u00f3IWp\u008a\u001c\u0004\u0007\u00e2i\u00cfL{\u0013b_=\u000eQ[\u00dc\u00b9N\u00cf+\u00cfl\u00d3\u00da\u00ed{r\u00e5)z\u00ca:$\u0002\u0017\u00c6~\u0080\u0017\u000f\u00f8\u0088\u00a3\u00b2".length();
                var5_7 = 0;
                while (true) {
                    var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var6_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    var7_5 = "\u00023TQ\u00d8\u00de\u00b7\u00dd\u00df\u00b7\u00f7\u00b5\u00d0\u00e0\u00d5\u0011";
                    var8_6 = "\u00023TQ\u00d8\u00de\u00b7\u00dd\u00df\u00b7\u00f7\u00b5\u00d0\u00e0\u00d5\u0011".length();
                    var5_7 = 0;
                    while (true) {
                        var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var6_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var3_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        SpatialCoordinateMapper.Y = (int)var0_3[29];
        SpatialCoordinateMapper.dq = (int)var0_3[18];
        SpatialCoordinateMapper.dr = (int)var0_3[78];
        SpatialCoordinateMapper.dV = (int)var0_3[0];
        SpatialCoordinateMapper.dH = (int)var0_3[53];
        SpatialCoordinateMapper.P = (int)var0_3[41];
        SpatialCoordinateMapper.dG = (int)var0_3[59];
        SpatialCoordinateMapper.R = (int)var0_3[114];
        SpatialCoordinateMapper.dF = (int)var0_3[97];
        SpatialCoordinateMapper.dw = (int)var0_3[19];
        SpatialCoordinateMapper.y = (int)var0_3[81];
        SpatialCoordinateMapper.x = (int)var0_3[61];
        SpatialCoordinateMapper.k = (int)var0_3[69];
        SpatialCoordinateMapper.dJ = (int)var0_3[43];
        SpatialCoordinateMapper.dW = (int)var0_3[106];
        SpatialCoordinateMapper.Ci = (int)var0_3[80];
        SpatialCoordinateMapper.d5 = (int)var0_3[100];
        SpatialCoordinateMapper.O = (int)var0_3[17];
        SpatialCoordinateMapper.dk = (int)var0_3[117];
        SpatialCoordinateMapper.dp = (int)var0_3[2];
        SpatialCoordinateMapper.dx = (int)var0_3[42];
        SpatialCoordinateMapper.df = (int)var0_3[48];
        SpatialCoordinateMapper.N = (int)var0_3[28];
        SpatialCoordinateMapper.de = (int)var0_3[73];
        SpatialCoordinateMapper.d1 = (int)var0_3[60];
        SpatialCoordinateMapper.dY = (int)var0_3[23];
        SpatialCoordinateMapper.S = (int)var0_3[21];
        SpatialCoordinateMapper.K = (int)var0_3[89];
        SpatialCoordinateMapper.l = (int)var0_3[16];
        SpatialCoordinateMapper.Cl = (int)var0_3[98];
        SpatialCoordinateMapper.Cv = (int)var0_3[44];
        SpatialCoordinateMapper.Cq = (int)var0_3[3];
        SpatialCoordinateMapper.dd = (int)var0_3[86];
        SpatialCoordinateMapper.a = (int)var0_3[52];
        SpatialCoordinateMapper.i = (int)var0_3[35];
        SpatialCoordinateMapper.n = (int)var0_3[25];
        SpatialCoordinateMapper.f = (int)var0_3[6];
        SpatialCoordinateMapper.dX = (int)var0_3[76];
        SpatialCoordinateMapper.Q = (int)var0_3[63];
        SpatialCoordinateMapper.J = (int)var0_3[40];
        SpatialCoordinateMapper.D = (int)var0_3[7];
        SpatialCoordinateMapper.Z = (int)var0_3[93];
        SpatialCoordinateMapper.g = (int)var0_3[99];
        SpatialCoordinateMapper.I = (int)var0_3[11];
        SpatialCoordinateMapper.G = (int)var0_3[56];
        SpatialCoordinateMapper.dc = (int)var0_3[112];
        SpatialCoordinateMapper.z = (int)var0_3[14];
        SpatialCoordinateMapper.dL = (int)var0_3[96];
        SpatialCoordinateMapper.dn = (int)var0_3[107];
        SpatialCoordinateMapper.p = (int)var0_3[49];
        SpatialCoordinateMapper.dB = (int)var0_3[88];
        SpatialCoordinateMapper.CU = (int)var0_3[31];
        SpatialCoordinateMapper.d3 = (int)var0_3[57];
        SpatialCoordinateMapper.dT = (int)var0_3[22];
        SpatialCoordinateMapper.dI = (int)var0_3[24];
        SpatialCoordinateMapper.dj = (int)var0_3[105];
        SpatialCoordinateMapper.dl = (int)var0_3[84];
        SpatialCoordinateMapper.db = (int)var0_3[95];
        SpatialCoordinateMapper.d4 = (int)var0_3[45];
        SpatialCoordinateMapper.F = (int)var0_3[38];
        SpatialCoordinateMapper.dv = (int)var0_3[37];
        SpatialCoordinateMapper.T = (int)var0_3[104];
        SpatialCoordinateMapper.dm = (int)var0_3[55];
        SpatialCoordinateMapper.L = (int)var0_3[51];
        SpatialCoordinateMapper.Cz = (int)var0_3[72];
        SpatialCoordinateMapper.t = (int)var0_3[27];
        SpatialCoordinateMapper.dC = (int)var0_3[103];
        SpatialCoordinateMapper.B = (int)var0_3[1];
        SpatialCoordinateMapper.j = (int)var0_3[113];
        SpatialCoordinateMapper.o = (int)var0_3[83];
        SpatialCoordinateMapper.C = (int)var0_3[39];
        SpatialCoordinateMapper.d9 = (int)var0_3[87];
        SpatialCoordinateMapper.dQ = (int)var0_3[75];
        SpatialCoordinateMapper.d6 = (int)var0_3[58];
        SpatialCoordinateMapper.d2 = (int)var0_3[67];
        SpatialCoordinateMapper.V = (int)var0_3[79];
        SpatialCoordinateMapper.M = (int)var0_3[9];
        SpatialCoordinateMapper.r = (int)var0_3[12];
        SpatialCoordinateMapper.u = (int)var0_3[82];
        SpatialCoordinateMapper.e = (int)var0_3[64];
        SpatialCoordinateMapper.dh = (int)var0_3[108];
        SpatialCoordinateMapper.W = (int)var0_3[102];
        SpatialCoordinateMapper.dN = (int)var0_3[85];
        SpatialCoordinateMapper.dz = (int)var0_3[111];
        SpatialCoordinateMapper.w = (int)var0_3[8];
        SpatialCoordinateMapper.d_ = (int)var0_3[33];
        SpatialCoordinateMapper.d = (int)var0_3[91];
        SpatialCoordinateMapper.X = (int)var0_3[74];
        SpatialCoordinateMapper.s = (int)var0_3[68];
        SpatialCoordinateMapper.dE = (int)var0_3[115];
        SpatialCoordinateMapper.dK = (int)var0_3[20];
        SpatialCoordinateMapper.dy = (int)var0_3[62];
        SpatialCoordinateMapper.b = (int)var0_3[77];
        SpatialCoordinateMapper.du = (int)var0_3[32];
        SpatialCoordinateMapper.CE = (int)var0_3[65];
        SpatialCoordinateMapper.c = (int)var0_3[109];
        SpatialCoordinateMapper.m = (int)var0_3[54];
        SpatialCoordinateMapper.h = (int)var0_3[118];
        SpatialCoordinateMapper.dD = (int)var0_3[110];
        SpatialCoordinateMapper.d8 = (int)var0_3[13];
        SpatialCoordinateMapper.di = (int)var0_3[34];
        SpatialCoordinateMapper.A = (int)var0_3[70];
        SpatialCoordinateMapper.dS = (int)var0_3[92];
        SpatialCoordinateMapper.d7 = (int)var0_3[4];
        SpatialCoordinateMapper.dP = (int)var0_3[116];
        SpatialCoordinateMapper.dt = (int)var0_3[46];
        SpatialCoordinateMapper.da = (int)var0_3[10];
        SpatialCoordinateMapper.dM = (int)var0_3[15];
        SpatialCoordinateMapper.q = (int)var0_3[101];
        SpatialCoordinateMapper.E = (int)var0_3[119];
        SpatialCoordinateMapper.ds = (int)var0_3[30];
        SpatialCoordinateMapper.dZ = (int)var0_3[47];
        SpatialCoordinateMapper.CB = (int)var0_3[66];
        SpatialCoordinateMapper.v = (int)var0_3[36];
        SpatialCoordinateMapper.dA = (int)var0_3[6];
        SpatialCoordinateMapper.dU = (int)var0_3[90];
        SpatialCoordinateMapper.dg = (int)var0_3[50];
        SpatialCoordinateMapper.H = (int)var0_3[5];
        SpatialCoordinateMapper.dO = (int)var0_3[94];
        SpatialCoordinateMapper.dR = (int)var0_3[71];
        SpatialCoordinateMapper.U = (int)var0_3[26];
        SpatialCoordinateMapper.Cb = new int[10000];
        SpatialCoordinateMapper.Cb[32] = 32;
        SpatialCoordinateMapper.Cb[39] = 222;
        SpatialCoordinateMapper.Cb[44] = 188;
        SpatialCoordinateMapper.Cb[45] = 189;
        SpatialCoordinateMapper.Cb[46] = 190;
        SpatialCoordinateMapper.Cb[47] = 191;
        SpatialCoordinateMapper.Cb[59] = 186;
        SpatialCoordinateMapper.Cb[61] = 187;
        SpatialCoordinateMapper.Cb[91] = 219;
        SpatialCoordinateMapper.Cb[92] = 220;
        SpatialCoordinateMapper.Cb[93] = 221;
        SpatialCoordinateMapper.Cb[96] = 192;
        SpatialCoordinateMapper.Cb[256] = 27;
        SpatialCoordinateMapper.Cb[257] = 13;
        SpatialCoordinateMapper.Cb[258] = 9;
        SpatialCoordinateMapper.Cb[259] = 8;
        SpatialCoordinateMapper.Cb[260] = 45;
        SpatialCoordinateMapper.Cb[261] = 46;
        SpatialCoordinateMapper.Cb[262] = 39;
        SpatialCoordinateMapper.Cb[263] = 37;
        SpatialCoordinateMapper.Cb[264] = 40;
        SpatialCoordinateMapper.Cb[265] = 38;
        SpatialCoordinateMapper.Cb[266] = 33;
        SpatialCoordinateMapper.Cb[267] = 34;
        SpatialCoordinateMapper.Cb[268] = 36;
        SpatialCoordinateMapper.Cb[269] = 35;
        SpatialCoordinateMapper.Cb[280] = 20;
        SpatialCoordinateMapper.Cb[281] = 145;
        SpatialCoordinateMapper.Cb[282] = 144;
        SpatialCoordinateMapper.Cb[283] = 44;
        SpatialCoordinateMapper.Cb[284] = 19;
        SpatialCoordinateMapper.Cb[290] = 112;
        SpatialCoordinateMapper.Cb[291] = 113;
        SpatialCoordinateMapper.Cb[292] = 114;
        SpatialCoordinateMapper.Cb[293] = 115;
        SpatialCoordinateMapper.Cb[294] = 116;
        SpatialCoordinateMapper.Cb[295] = 117;
        SpatialCoordinateMapper.Cb[296] = 118;
        SpatialCoordinateMapper.Cb[297] = 119;
        SpatialCoordinateMapper.Cb[298] = 120;
        SpatialCoordinateMapper.Cb[299] = 121;
        SpatialCoordinateMapper.Cb[300] = 122;
        SpatialCoordinateMapper.Cb[301] = 123;
        SpatialCoordinateMapper.Cb[302] = 124;
        SpatialCoordinateMapper.Cb[303] = 125;
        SpatialCoordinateMapper.Cb[304] = 126;
        SpatialCoordinateMapper.Cb[305] = 127;
        SpatialCoordinateMapper.Cb[306] = 128;
        SpatialCoordinateMapper.Cb[307] = 129;
        SpatialCoordinateMapper.Cb[308] = 130;
        SpatialCoordinateMapper.Cb[309] = 131;
        SpatialCoordinateMapper.Cb[310] = 132;
        SpatialCoordinateMapper.Cb[311] = 133;
        SpatialCoordinateMapper.Cb[312] = 134;
        SpatialCoordinateMapper.Cb[313] = 135;
        SpatialCoordinateMapper.Cb[320] = 96;
        SpatialCoordinateMapper.Cb[321] = 97;
        SpatialCoordinateMapper.Cb[322] = 98;
        SpatialCoordinateMapper.Cb[323] = 99;
        SpatialCoordinateMapper.Cb[324] = 100;
        SpatialCoordinateMapper.Cb[325] = 101;
        SpatialCoordinateMapper.Cb[326] = 102;
        SpatialCoordinateMapper.Cb[327] = 103;
        SpatialCoordinateMapper.Cb[328] = 104;
        SpatialCoordinateMapper.Cb[329] = 105;
        SpatialCoordinateMapper.Cb[330] = 110;
        SpatialCoordinateMapper.Cb[331] = 111;
        SpatialCoordinateMapper.Cb[332] = 106;
        SpatialCoordinateMapper.Cb[333] = 109;
        SpatialCoordinateMapper.Cb[334] = 107;
        SpatialCoordinateMapper.Cb[335] = 13;
        SpatialCoordinateMapper.Cb[340] = 160;
        SpatialCoordinateMapper.Cb[341] = 162;
        SpatialCoordinateMapper.Cb[342] = 164;
        SpatialCoordinateMapper.Cb[344] = 161;
        SpatialCoordinateMapper.Cb[345] = 163;
        SpatialCoordinateMapper.Cb[346] = 165;
    }
}

