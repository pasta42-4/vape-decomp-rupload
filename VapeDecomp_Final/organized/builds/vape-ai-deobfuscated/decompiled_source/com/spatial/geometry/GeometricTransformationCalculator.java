/*
 * Decompiled with CFR 0.152.
 */
package com.spatial.geometry;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class GeometricTransformationCalculator {
    public static final int Z;
    public static final int P;
    public static final int C;
    public static final int M;
    public static final int T;
    public static final int tX;
    public static final int Rz;
    public static final int Rv;
    public static final int ta;
    public static final int R1;
    public static final int A;
    public static final int RZ;
    public static final int Ry;
    public static final int RV;
    public static final int RY;
    public static final int RC;
    public static final int ti;
    public static final int tQ;
    public static final int Rf;
    public static final int L;
    public static final int RX;
    public static final int y;
    public static final int R9;
    public static final int V;
    public static final int Rj;
    public static final int Rs;
    public static final int B;
    public static final int x;
    public static final int a;
    public static final int tn;
    public static final int RA;
    public static final int K;
    public static final int RT;
    public static final int Rk;
    public static final int R4;
    public static final int m;
    public static final int w;
    public static final int c;
    public static final int tN;
    public static final int Q = 1;
    public static final int R2;
    public static final int Ra;
    public static final int RB;
    public static final int RL;
    public static final int tD;
    public static final int RE;
    public static final int RD;
    public static final int tL;
    public static final int o;
    public static final int Rw = 1;
    public static final int p;
    public static final int Rx;
    public static final int l;
    public static final int S;
    public static final int O;
    public static final int Rr;
    public static final int tZ;
    public static final int tB;
    public static final int tq;
    public static final int RP;
    public static final int u;
    public static final int N;
    public static final int E;
    public static final int RJ;
    public static final int j;
    public static final int n;
    public static final int tw;
    public static final int RF;
    public static final int k;
    private static AbstractComputationKernel[] b;
    public static final int Rl;
    public static final int Rm;
    public static final int RU;
    public static final int R0;
    public static final int tW;
    public static final int RO;
    public static final int X;
    public static final int s;
    public static final int Y;
    public static final int F;
    public static final int R5;
    public static final int Ru;
    public static final int Rc;
    public static final int z;
    public static final int RW;
    public static final int J;
    public static final int RM = 1;
    public static final int R3;
    public static final int d;
    public static final int t0;
    public static final int D;
    public static final int RS = 0;
    public static final int RI;
    public static final int t;
    public static final int f;
    public static final int ts;
    public static final int td;
    public static final int R_;
    public static final int Rq;
    public static final int Rn;
    public static final int r;
    public static final int Rp;
    public static final int tM;
    public static final int R8;
    public static final int Rg;
    public static final int RG;
    public static final int Rd;
    public static final int Rt;
    public static final int I;
    public static final int RH;
    public static final int RK;
    public static final int W;
    public static final int q;
    public static final int Ri;
    public static final int t5;
    public static final int G;
    public static final int R;
    public static final int t1;
    public static final int tj;
    public static final int e;
    public static final int Rh;
    public static final int R7;
    public static final int Rb;
    public static final int i;
    public static final int RR;
    public static final int Re;
    public static final int v;
    public static final int R6;
    public static final int RN;
    public static final int h;
    public static final int tC;
    public static final int tP;
    public static final int U;
    public static final int t7;
    public static final int g;
    public static final int RQ;
    public static final int Ro;
    public static final int H;

    public static void U(AbstractComputationKernel[] abstractComputationKernelArray) {
        b = abstractComputationKernelArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                v0 = MultiContainerRegistry.a(4461811982795822105L, 2330272025323872054L, MethodHandles.lookup().lookupClass()).a(255621293248691L);
                if (GeometricTransformationCalculator.m() != null) {
                    GeometricTransformationCalculator.U(new AbstractComputationKernel[2]);
                }
                var1 = v0 ^ 123869453861437L;
                var3_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v1 = SecretKeyFactory.getInstance("DES");
                v2 = new byte[8];
                v3 = v2;
                v2[0] = (byte)(var1 >>> 56);
                for (var4_2 = 1; var4_2 < 8; ++var4_2) {
                    v3 = v3;
                    v3[var4_2] = (byte)(var1 << var4_2 * 8 >>> 56);
                }
                var3_1.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[121];
                var6_4 = 0;
                var7_5 = "AX@\u00bd\u008a\u0006\u001b\r\"\u00d2\u00c5\u00d3\u00bbX%\u001b\u00a2Snh\u00edUu\u00aa\u00cc>j\u00e6\u00ae\u00e1\u009a}\u00a9$4m\u000e\u00ca\u00bdb\u00b3\u0005Z\u00b5\u00aetg\u00d1c\u00c8\u00d1U\u00b0\u0091\u0017\u0015\u00c8\u00e6edyF\u001d\u00a1\u0012\u00a8:.\u0012\u0086x\u001c\"\u001c\u00b3\u0086\u0014\u001f\u00ee\u00d7M\u0098t\u00da\u008ed<\u0017\u008c\u00bf'2\u00b0\u00ba\nyX\b\u009d\u00bd\u00cf\u0082\u000f1\u00fe\u00d6L\u00dfd\u001d\u00e0\u00f9'X\u0006NH\u0084\u00e3\u0000\u008c\u00a7\u008e[,?\u00da/\u00e3\u00a1o\u001a\u001a{\u00b4\u008dz\u00f0\"!\u00a3\u0018\u00d0\u0015\u00a3\u00f8\u0088\u0087\u00ccQ\rs9\u00aa$\u008b\u00cc\u00a2\u0088$\u0084\u00b1\u00d8\u0017\u00eb\u0087\u0013\u00af\u0012\u009f\u00bd\u00db|\u00c8\\\u0092V\u00f5\u00e0B\u000ePw\u009cP\u009c\u000bG3\u0096U\u00e0\u00d9\u009e\u00b4\u00f5\u00be\u0080Hn\u00c50\u00f1\u00c6!N\u00fe;\u0016\u00a8\u00e0\tarw\u0092qA\u0086=s\u0017EyT\u00b1\u007f\u00ebt\u0004\u00e1\u00d1\u00e9\u00cd\u00a4&4)\u00baq\u00a2iW<\u0010\u00afbYI\u00dd\u00acc\u0014\u00b3\u00a4a\u00ba\u00b2C4\u009f3+;\u00f2\u00c7`\u00f5;8\u00d3\u00dc\u00cc\u0001\u0081\u00a3gj;\u0085\u0004\u00daU\u0002\u00a4\u008b)\u00df\u0002\u00e9\u00bfF\u00e3\u000e\u00b8\u00bb\u0003\u00a6\u00a3\u00a6N\u00a3\f\u00dd\u000e\u00ea\u00a2n*\u00d98&Sh\u0002\u000e\u00c8S3\u00f5P\u00c9\u0001\u00bc\u00d4\u008d1\u0096\u00faO\u0018\u008f\u00d6*P;\u00ff\u00c5\u00f3\u00ac{w\u000f\u0085\u00b7\u00a6\u00fe\u000b*\u0088\u0002j\u00aa\u0090\u00dcv\u00faC\u0087\u009a\u000b>9.&/HJM\u0000t\u00c7\u00ea\u001f\u00d3/\u00a6o\u009al\u00acc\u001d\u0096-i6|I\u0086\u00d2<\u00c5\u00c6\u009d\u000b1\u00cb\u00f2\u0005AJ\u00ce\u00a4\u00ff>\u00b8\u009bcq\u00eax\u001f\u00d5W\u00c2b\u00cc\u00c9\u00c2\u0082\u00a6R\u00b0\u00b5\u00ed *\u00a4\u00eb\u0088\u00b7\u00cb\b\u00e6E\u00ef\u00d5\u00aa\u00ce\u009eiY\u00de#5\u00a2T\u008c\u0004'\u009b\u00c0bp\u00d3{\u00ab?1\u00d3\u008eEb\u0013\u008b\u00b0\u00c22\u00f9\u0084s\u00e6p-\u0002\u00c8\"(H-\u00e8\u00aer\u0014\u00a19~q,L\u00c1Dt\u001a\u00d0\u00ea\u00cd\u0018\u00ac\u008fe?'u\u00ea/\u00a5\u00a7\u00faY\u00c3\u00f1nE\u00fcw\u00f2r\u00d3d\u008e\u00df\u00e7\u0088\u00ef\u00b9a\u00d3\"\u00b1\u00f7\u00aa\u0084\u00ca2\u00b3h[X\u00b3\t\u00da\u00df\u0081\u008f?\u0093h\u00e7o\u009b\u00d3\u0014\u00ee\u00d3\u00fc/\u00bb\u0088m?\u00a7\u00c2 \u0014\u0017u\u009dwR;\u0091\u00a4M\u0005\u00e9\u0003?\u0083'y\u0098\u0091\u0012fS\u0080;s\u00d3D\u00ce\n\u00cd\u00d6\u0084\u000fM\u00ebl}\u008f\u00dd\u00bbj\u00f2\u00112M\\\u0086\u0016\u001f{\u001d\u00b2x\u0096k8\u00ca\u00a7\u00cb\u00db0\u00ff\u000f`\u0000\u00f0A\u00f77\u00f9\u00f6&\u0095\u00f0u\u0004i\u0002\u00adc^\u00ccp\u00a3% \u009a\u00a5M\u001f\"lH'E\u00fb\u001c0\u0007QN\u00b7\u000bj\u00fb4\u001b\u008c\u0083\u00b2m\u000e\u008c \u009e\u00e1\u0015?\u0090@O\u0012<\u00af\u00b0f\t\u00d99\u0098,\u00f3#\u00dd\u00a3`p10\u00ef\u00fc\u008f\u00e4\u0081\u009e\u00af\u00e0\u0082NG\u00d8\u00dce<\u0001\u00c2\t\u0085\u009d{D0\u0095\u00a7\u00c2\u0082\u00cb\u0006\u00c8\u00d7\u00d5F\u00f5K\u0017[\u001ayI\u009b\n\n8\u00c8X\u0091\u00e3d\u00ac\u0014];\u00d3c\u009b\u00b2\u00b4\u00df\u0097\u00ce \u0011\u00af\u00d2\u00f7\f\u0090\u0015\u00d4\u00c8\u001e\u00fag\u0002A\u00b9w{D\u00c1\u00a5\r_\u00133\u00ba2m\u00a3\"\u008c\u0094\u0096\u00b0\u0002SW%\u00d4p\u00bcd\u00ad\u00b4\u00e4\u00a6\u00car\u0007A(\u0099\u009c_\u00df\u00b5pZ\u0083\u00c7q-7\u0002\u00e1T'o\u00e3\b\u00de.\u00d9\u00ef\u00c2LXv\u00f8Y\u00b3\u0007\u00da\u008e\u000e9\u0097\u00e8\u00c2\u00ef\u0001\u00d1\u00d3\u00ba\u00d8m\u00ad\u0081\u00f4\u0095i\u0006\u00c0\u00df\u0013H\u00d1\u00d3\b\u00b8\u008c\u00b8e\u00f7uW~gb\u009fR\r\u001e\u0089v\u008d\b\u008a\u008b+^\u0013pozMoZ\u000b\u0088\u0001H\u00ea\u00b4\u00c4\u00818\u00c5\u008eo\u00f5L\u0089m\n1\u00dcoFB\u009a\u0084\u00f3\u00c9F\u00e0\u00e8\u000b\u00f0p~2\u00d5yjP\u0000\u000b5\u0099\u00a7*\u00dd\u00da\u0002\u0094\u0005";
                var8_6 = "AX@\u00bd\u008a\u0006\u001b\r\"\u00d2\u00c5\u00d3\u00bbX%\u001b\u00a2Snh\u00edUu\u00aa\u00cc>j\u00e6\u00ae\u00e1\u009a}\u00a9$4m\u000e\u00ca\u00bdb\u00b3\u0005Z\u00b5\u00aetg\u00d1c\u00c8\u00d1U\u00b0\u0091\u0017\u0015\u00c8\u00e6edyF\u001d\u00a1\u0012\u00a8:.\u0012\u0086x\u001c\"\u001c\u00b3\u0086\u0014\u001f\u00ee\u00d7M\u0098t\u00da\u008ed<\u0017\u008c\u00bf'2\u00b0\u00ba\nyX\b\u009d\u00bd\u00cf\u0082\u000f1\u00fe\u00d6L\u00dfd\u001d\u00e0\u00f9'X\u0006NH\u0084\u00e3\u0000\u008c\u00a7\u008e[,?\u00da/\u00e3\u00a1o\u001a\u001a{\u00b4\u008dz\u00f0\"!\u00a3\u0018\u00d0\u0015\u00a3\u00f8\u0088\u0087\u00ccQ\rs9\u00aa$\u008b\u00cc\u00a2\u0088$\u0084\u00b1\u00d8\u0017\u00eb\u0087\u0013\u00af\u0012\u009f\u00bd\u00db|\u00c8\\\u0092V\u00f5\u00e0B\u000ePw\u009cP\u009c\u000bG3\u0096U\u00e0\u00d9\u009e\u00b4\u00f5\u00be\u0080Hn\u00c50\u00f1\u00c6!N\u00fe;\u0016\u00a8\u00e0\tarw\u0092qA\u0086=s\u0017EyT\u00b1\u007f\u00ebt\u0004\u00e1\u00d1\u00e9\u00cd\u00a4&4)\u00baq\u00a2iW<\u0010\u00afbYI\u00dd\u00acc\u0014\u00b3\u00a4a\u00ba\u00b2C4\u009f3+;\u00f2\u00c7`\u00f5;8\u00d3\u00dc\u00cc\u0001\u0081\u00a3gj;\u0085\u0004\u00daU\u0002\u00a4\u008b)\u00df\u0002\u00e9\u00bfF\u00e3\u000e\u00b8\u00bb\u0003\u00a6\u00a3\u00a6N\u00a3\f\u00dd\u000e\u00ea\u00a2n*\u00d98&Sh\u0002\u000e\u00c8S3\u00f5P\u00c9\u0001\u00bc\u00d4\u008d1\u0096\u00faO\u0018\u008f\u00d6*P;\u00ff\u00c5\u00f3\u00ac{w\u000f\u0085\u00b7\u00a6\u00fe\u000b*\u0088\u0002j\u00aa\u0090\u00dcv\u00faC\u0087\u009a\u000b>9.&/HJM\u0000t\u00c7\u00ea\u001f\u00d3/\u00a6o\u009al\u00acc\u001d\u0096-i6|I\u0086\u00d2<\u00c5\u00c6\u009d\u000b1\u00cb\u00f2\u0005AJ\u00ce\u00a4\u00ff>\u00b8\u009bcq\u00eax\u001f\u00d5W\u00c2b\u00cc\u00c9\u00c2\u0082\u00a6R\u00b0\u00b5\u00ed *\u00a4\u00eb\u0088\u00b7\u00cb\b\u00e6E\u00ef\u00d5\u00aa\u00ce\u009eiY\u00de#5\u00a2T\u008c\u0004'\u009b\u00c0bp\u00d3{\u00ab?1\u00d3\u008eEb\u0013\u008b\u00b0\u00c22\u00f9\u0084s\u00e6p-\u0002\u00c8\"(H-\u00e8\u00aer\u0014\u00a19~q,L\u00c1Dt\u001a\u00d0\u00ea\u00cd\u0018\u00ac\u008fe?'u\u00ea/\u00a5\u00a7\u00faY\u00c3\u00f1nE\u00fcw\u00f2r\u00d3d\u008e\u00df\u00e7\u0088\u00ef\u00b9a\u00d3\"\u00b1\u00f7\u00aa\u0084\u00ca2\u00b3h[X\u00b3\t\u00da\u00df\u0081\u008f?\u0093h\u00e7o\u009b\u00d3\u0014\u00ee\u00d3\u00fc/\u00bb\u0088m?\u00a7\u00c2 \u0014\u0017u\u009dwR;\u0091\u00a4M\u0005\u00e9\u0003?\u0083'y\u0098\u0091\u0012fS\u0080;s\u00d3D\u00ce\n\u00cd\u00d6\u0084\u000fM\u00ebl}\u008f\u00dd\u00bbj\u00f2\u00112M\\\u0086\u0016\u001f{\u001d\u00b2x\u0096k8\u00ca\u00a7\u00cb\u00db0\u00ff\u000f`\u0000\u00f0A\u00f77\u00f9\u00f6&\u0095\u00f0u\u0004i\u0002\u00adc^\u00ccp\u00a3% \u009a\u00a5M\u001f\"lH'E\u00fb\u001c0\u0007QN\u00b7\u000bj\u00fb4\u001b\u008c\u0083\u00b2m\u000e\u008c \u009e\u00e1\u0015?\u0090@O\u0012<\u00af\u00b0f\t\u00d99\u0098,\u00f3#\u00dd\u00a3`p10\u00ef\u00fc\u008f\u00e4\u0081\u009e\u00af\u00e0\u0082NG\u00d8\u00dce<\u0001\u00c2\t\u0085\u009d{D0\u0095\u00a7\u00c2\u0082\u00cb\u0006\u00c8\u00d7\u00d5F\u00f5K\u0017[\u001ayI\u009b\n\n8\u00c8X\u0091\u00e3d\u00ac\u0014];\u00d3c\u009b\u00b2\u00b4\u00df\u0097\u00ce \u0011\u00af\u00d2\u00f7\f\u0090\u0015\u00d4\u00c8\u001e\u00fag\u0002A\u00b9w{D\u00c1\u00a5\r_\u00133\u00ba2m\u00a3\"\u008c\u0094\u0096\u00b0\u0002SW%\u00d4p\u00bcd\u00ad\u00b4\u00e4\u00a6\u00car\u0007A(\u0099\u009c_\u00df\u00b5pZ\u0083\u00c7q-7\u0002\u00e1T'o\u00e3\b\u00de.\u00d9\u00ef\u00c2LXv\u00f8Y\u00b3\u0007\u00da\u008e\u000e9\u0097\u00e8\u00c2\u00ef\u0001\u00d1\u00d3\u00ba\u00d8m\u00ad\u0081\u00f4\u0095i\u0006\u00c0\u00df\u0013H\u00d1\u00d3\b\u00b8\u008c\u00b8e\u00f7uW~gb\u009fR\r\u001e\u0089v\u008d\b\u008a\u008b+^\u0013pozMoZ\u000b\u0088\u0001H\u00ea\u00b4\u00c4\u00818\u00c5\u008eo\u00f5L\u0089m\n1\u00dcoFB\u009a\u0084\u00f3\u00c9F\u00e0\u00e8\u000b\u00f0p~2\u00d5yjP\u0000\u000b5\u0099\u00a7*\u00dd\u00da\u0002\u0094\u0005".length();
                var5_7 = 0;
                while (true) {
                    var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                    v4 = var0_3;
                    v5 = var6_4++;
                    v6 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v7 = -1;
                    break block9;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var5_7 < var8_6) ** continue;
                    var7_5 = "0\u00c2\u00a9!\u0082\u00a6\u00af;Z\u00eaS\u00fd\u00b9\u00d5\u00b0\u00b6";
                    var8_6 = "0\u00c2\u00a9!\u0082\u00a6\u00af;Z\u00eaS\u00fd\u00b9\u00d5\u00b0\u00b6".length();
                    var5_7 = 0;
                    while (true) {
                        var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                        v4 = var0_3;
                        v5 = var6_4++;
                        v6 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v7 = 0;
                        break block9;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var5_7 < var8_6) ** continue;
                    break block10;
                    break;
                }
            }
            var10_9 = v6;
            var12_10 = var3_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v8 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v7) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        GeometricTransformationCalculator.Rv = (int)var0_3[112];
        GeometricTransformationCalculator.V = (int)var0_3[49];
        GeometricTransformationCalculator.tQ = (int)var0_3[4];
        GeometricTransformationCalculator.RE = (int)var0_3[84];
        GeometricTransformationCalculator.f = (int)var0_3[94];
        GeometricTransformationCalculator.t7 = (int)var0_3[39];
        GeometricTransformationCalculator.e = (int)var0_3[93];
        GeometricTransformationCalculator.R_ = (int)var0_3[108];
        GeometricTransformationCalculator.l = (int)var0_3[106];
        GeometricTransformationCalculator.RK = (int)var0_3[48];
        GeometricTransformationCalculator.R7 = (int)var0_3[16];
        GeometricTransformationCalculator.U = (int)var0_3[114];
        GeometricTransformationCalculator.X = (int)var0_3[4];
        GeometricTransformationCalculator.z = (int)var0_3[36];
        GeometricTransformationCalculator.tM = (int)var0_3[58];
        GeometricTransformationCalculator.tW = (int)var0_3[59];
        GeometricTransformationCalculator.R3 = (int)var0_3[68];
        GeometricTransformationCalculator.p = (int)var0_3[54];
        GeometricTransformationCalculator.Ra = (int)var0_3[67];
        GeometricTransformationCalculator.RJ = (int)var0_3[3];
        GeometricTransformationCalculator.Rc = (int)var0_3[92];
        GeometricTransformationCalculator.Rb = (int)var0_3[30];
        GeometricTransformationCalculator.RD = (int)var0_3[72];
        GeometricTransformationCalculator.RN = (int)var0_3[11];
        GeometricTransformationCalculator.P = (int)var0_3[9];
        GeometricTransformationCalculator.tq = (int)var0_3[31];
        GeometricTransformationCalculator.Y = (int)var0_3[20];
        GeometricTransformationCalculator.v = (int)var0_3[101];
        GeometricTransformationCalculator.td = (int)var0_3[10];
        GeometricTransformationCalculator.ts = (int)var0_3[53];
        GeometricTransformationCalculator.RY = (int)var0_3[26];
        GeometricTransformationCalculator.O = (int)var0_3[50];
        GeometricTransformationCalculator.RA = (int)var0_3[71];
        GeometricTransformationCalculator.tD = (int)var0_3[25];
        GeometricTransformationCalculator.W = (int)var0_3[83];
        GeometricTransformationCalculator.D = (int)var0_3[56];
        GeometricTransformationCalculator.Rd = (int)var0_3[85];
        GeometricTransformationCalculator.RF = (int)var0_3[57];
        GeometricTransformationCalculator.M = (int)var0_3[14];
        GeometricTransformationCalculator.a = (int)var0_3[61];
        GeometricTransformationCalculator.Rq = (int)var0_3[111];
        GeometricTransformationCalculator.tX = (int)var0_3[105];
        GeometricTransformationCalculator.Rj = (int)var0_3[40];
        GeometricTransformationCalculator.I = (int)var0_3[35];
        GeometricTransformationCalculator.q = (int)var0_3[51];
        GeometricTransformationCalculator.S = (int)var0_3[117];
        GeometricTransformationCalculator.tn = (int)var0_3[65];
        GeometricTransformationCalculator.J = (int)var0_3[60];
        GeometricTransformationCalculator.Rn = (int)var0_3[19];
        GeometricTransformationCalculator.k = (int)var0_3[104];
        GeometricTransformationCalculator.ta = (int)var0_3[95];
        GeometricTransformationCalculator.RO = (int)var0_3[64];
        GeometricTransformationCalculator.n = (int)var0_3[6];
        GeometricTransformationCalculator.d = (int)var0_3[115];
        GeometricTransformationCalculator.t1 = (int)var0_3[73];
        GeometricTransformationCalculator.Rm = (int)var0_3[34];
        GeometricTransformationCalculator.tP = (int)var0_3[119];
        GeometricTransformationCalculator.Ro = (int)var0_3[21];
        GeometricTransformationCalculator.E = (int)var0_3[76];
        GeometricTransformationCalculator.Rg = (int)var0_3[8];
        GeometricTransformationCalculator.c = (int)var0_3[87];
        GeometricTransformationCalculator.L = (int)var0_3[12];
        GeometricTransformationCalculator.u = (int)var0_3[55];
        GeometricTransformationCalculator.Rt = (int)var0_3[97];
        GeometricTransformationCalculator.h = (int)var0_3[79];
        GeometricTransformationCalculator.g = (int)var0_3[77];
        GeometricTransformationCalculator.i = (int)var0_3[113];
        GeometricTransformationCalculator.y = (int)var0_3[1];
        GeometricTransformationCalculator.t5 = (int)var0_3[115];
        GeometricTransformationCalculator.RC = (int)var0_3[13];
        GeometricTransformationCalculator.C = (int)var0_3[69];
        GeometricTransformationCalculator.RR = (int)var0_3[104];
        GeometricTransformationCalculator.R5 = (int)var0_3[99];
        GeometricTransformationCalculator.RT = (int)var0_3[116];
        GeometricTransformationCalculator.r = (int)var0_3[49];
        GeometricTransformationCalculator.m = (int)var0_3[115];
        GeometricTransformationCalculator.T = (int)var0_3[102];
        GeometricTransformationCalculator.Ru = (int)var0_3[39];
        GeometricTransformationCalculator.N = (int)var0_3[90];
        GeometricTransformationCalculator.RX = (int)var0_3[100];
        GeometricTransformationCalculator.o = (int)var0_3[107];
        GeometricTransformationCalculator.R = (int)var0_3[110];
        GeometricTransformationCalculator.Ri = (int)var0_3[118];
        GeometricTransformationCalculator.F = (int)var0_3[80];
        GeometricTransformationCalculator.t = (int)var0_3[103];
        GeometricTransformationCalculator.R8 = (int)var0_3[2];
        GeometricTransformationCalculator.Rh = (int)var0_3[81];
        GeometricTransformationCalculator.tj = (int)var0_3[7];
        GeometricTransformationCalculator.R1 = (int)var0_3[91];
        GeometricTransformationCalculator.RI = (int)var0_3[70];
        GeometricTransformationCalculator.Ry = (int)var0_3[15];
        GeometricTransformationCalculator.RZ = (int)var0_3[22];
        GeometricTransformationCalculator.tL = (int)var0_3[23];
        GeometricTransformationCalculator.tZ = (int)var0_3[75];
        GeometricTransformationCalculator.G = (int)var0_3[63];
        GeometricTransformationCalculator.tw = (int)var0_3[18];
        GeometricTransformationCalculator.t0 = (int)var0_3[45];
        GeometricTransformationCalculator.tC = (int)var0_3[29];
        GeometricTransformationCalculator.ti = (int)var0_3[46];
        GeometricTransformationCalculator.Rk = (int)var0_3[27];
        GeometricTransformationCalculator.Rp = (int)var0_3[74];
        GeometricTransformationCalculator.A = (int)var0_3[44];
        GeometricTransformationCalculator.RU = (int)var0_3[109];
        GeometricTransformationCalculator.w = (int)var0_3[31];
        GeometricTransformationCalculator.x = (int)var0_3[62];
        GeometricTransformationCalculator.Rr = (int)var0_3[57];
        GeometricTransformationCalculator.K = (int)var0_3[32];
        GeometricTransformationCalculator.RP = (int)var0_3[24];
        GeometricTransformationCalculator.RV = (int)var0_3[47];
        GeometricTransformationCalculator.B = (int)var0_3[0];
        GeometricTransformationCalculator.tN = (int)var0_3[17];
        GeometricTransformationCalculator.Rs = (int)var0_3[28];
        GeometricTransformationCalculator.tB = (int)var0_3[66];
        GeometricTransformationCalculator.Z = (int)var0_3[120];
        GeometricTransformationCalculator.R9 = (int)var0_3[4];
        GeometricTransformationCalculator.R4 = (int)var0_3[33];
        GeometricTransformationCalculator.Rz = (int)var0_3[86];
        GeometricTransformationCalculator.RQ = (int)var0_3[89];
        GeometricTransformationCalculator.RL = (int)var0_3[43];
        GeometricTransformationCalculator.Rl = (int)var0_3[96];
        GeometricTransformationCalculator.Re = (int)var0_3[104];
        GeometricTransformationCalculator.R2 = (int)var0_3[78];
        GeometricTransformationCalculator.RW = (int)var0_3[38];
        GeometricTransformationCalculator.RB = (int)var0_3[63];
        GeometricTransformationCalculator.RG = (int)var0_3[98];
        GeometricTransformationCalculator.s = (int)var0_3[82];
        GeometricTransformationCalculator.H = (int)var0_3[61];
        GeometricTransformationCalculator.R0 = (int)var0_3[37];
        GeometricTransformationCalculator.Rx = (int)var0_3[5];
        GeometricTransformationCalculator.R6 = (int)var0_3[41];
        GeometricTransformationCalculator.Rf = (int)var0_3[42];
        GeometricTransformationCalculator.j = (int)var0_3[52];
        GeometricTransformationCalculator.RH = (int)var0_3[88];
    }

    public static short r(long l) {
        return (short)(l & 0xFFFFL);
    }

    public static short g(long l) {
        return (short)(l >> 16 & 0xFFFFL);
    }

    public static AbstractComputationKernel[] m() {
        return b;
    }
}

