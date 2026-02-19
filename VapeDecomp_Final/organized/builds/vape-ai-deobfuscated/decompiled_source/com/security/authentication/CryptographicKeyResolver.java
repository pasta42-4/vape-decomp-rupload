/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.authentication;

import a.C_;
import a.bE;
import com.collaboration.management.CollaborativeResourceCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.serialization.JsonPayloadOrchestrator;
import com.data.transformation.DataTransformationCoordinator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.math.precision.PrecisionMathOrchestrator;
import com.security.crypto.CryptographicSecurityManager;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.core.WorkflowOrchestrator;
import java.awt.Color;
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
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicKeyResolver
extends CipherSessionManager {
    private final GraphicalRenderEngine1082 ES;
    private static AbstractComputationKernel[] Eu;
    private static final Map lb;
    private JsonPayloadOrchestrator EF;
    private final GraphicalRenderEngine1082 EO;
    private static final String[] rb;
    private final CollaborativeResourceCoordinator EM;
    private static final long ab;
    private final DataTransformationCoordinator EU;
    private final GraphicalThemeRenderer Ey;
    private static final Integer[] fb;
    private static final Object[] qb;
    private static final long[] eb;
    @Nullable
    private WorkflowOrchestrator E9;

    private void lambda$null$0() {
        this.X();
        this.y();
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicKeyResolver.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicKeyResolver.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field o(long l, long l2) {
        int n = CryptographicKeyResolver.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicKeyResolver.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicKeyResolver.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicKeyResolver.g(clazz3, string2, clazz2)) != null) {
                    CryptographicKeyResolver.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicKeyResolver.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicKeyResolver.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicKeyResolver.n(243986509277113L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void e(JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        this.EF = jsonPayloadOrchestrator;
        this.EU.l(jsonPayloadOrchestrator);
        this.EM.k(jsonPayloadOrchestrator);
        this.EM.T();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicKeyResolver.ab = MultiContainerRegistry.a(-4578053687320397687L, 1747941435386778780L, MethodHandles.lookup().lookupClass()).a(255808197958570L);
                CryptographicKeyResolver.qb = new Object[5];
                CryptographicKeyResolver.rb = new String[5];
                CryptographicKeyResolver.T();
                CryptographicKeyResolver.lb = new HashMap<K, V>(13);
                CryptographicKeyResolver.t(null);
                var0 = CryptographicKeyResolver.ab ^ 67077620080714L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "C\u00fe\u001c\u0093T\u001b$\u00bb\u008f\r\u00f6\u0099\u00ae\u0089-\u00b9\u00fa\u00f4\u00ff\f\u0087\u009e5 \u00b0Y\u00d2D\u00c1c0\u00b8\u00b3{b\u00d0\u00978\u00c2o";
                var7_6 = "C\u00fe\u001c\u0093T\u001b$\u00bb\u008f\r\u00f6\u0099\u00ae\u0089-\u00b9\u00fa\u00f4\u00ff\f\u0087\u009e5 \u00b0Y\u00d2D\u00c1c0\u00b8\u00b3{b\u00d0\u00978\u00c2o".length();
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
                    var6_5 = "N\u00ae\u00aenC\u008ehEAD\u000e\u0001\u0090\u00fb\u00f8\u0097";
                    var7_6 = "N\u00ae\u00aenC\u008ehEAD\u000e\u0001\u0090\u00fb\u00f8\u0097".length();
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
        CryptographicKeyResolver.eb = var8_3;
        CryptographicKeyResolver.fb = new Integer[7];
    }

    public void Y(CryptographicSecurityManager cryptographicSecurityManager) {
        this.EU.R(cryptographicSecurityManager);
        this.EM.z(cryptographicSecurityManager);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$null$1() {
        this.y();
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x399B;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicKeyResolver.fb[n2] = n3;
        }
        return fb[n2];
    }

    private void y() {
        block3: {
            block2: {
                WorkflowOrchestrator workflowOrchestrator = this.E9;
                try {
                    if (workflowOrchestrator == null) break block2;
                    GraphicalRenderingController.K.T(workflowOrchestrator);
                    this.E9 = null;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyResolver.a(customSystemException);
                }
            }
            GraphicalRenderingController.K.T(GraphicalRenderingController.F);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$new$2() {
        long l = ab ^ 0x599C47496138L;
        C_.T(this.V(), (String)((Object)CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)9716, (long)(0x191AE8F69834030AL ^ l)), (long)2262023891072414603L, (long)l)), (String)((Object)CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)5185, (long)(0x4950C344F6FEB2BAL ^ l)), (long)2262023891072414603L, (long)l)), null, this::lambda$null$0, 80.0, (String)((Object)CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)2113, (long)(0x4514C4D6E4F6AEBEL ^ l)), (long)2262023891072414603L, (long)l)), this::lambda$null$1);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 60;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 31;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 40;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 54;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 46;
                break;
            }
            case 16: {
                n3 = 42;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 37;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 2;
                break;
            }
            case 21: {
                n3 = 62;
                break;
            }
            case 22: {
                n3 = 3;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 4;
                break;
            }
            case 25: {
                n3 = 17;
                break;
            }
            case 26: {
                n3 = 21;
                break;
            }
            case 27: {
                n3 = 0;
                break;
            }
            case 28: {
                n3 = 9;
                break;
            }
            case 29: {
                n3 = 18;
                break;
            }
            case 30: {
                n3 = 45;
                break;
            }
            case 31: {
                n3 = 12;
                break;
            }
            case 32: {
                n3 = 47;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 5;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 13;
                break;
            }
            case 43: {
                n3 = 51;
                break;
            }
            case 44: {
                n3 = 41;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 10;
                break;
            }
            case 47: {
                n3 = 49;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 56;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 33;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 35;
                break;
            }
            case 58: {
                n3 = 55;
                break;
            }
            case 59: {
                n3 = 61;
                break;
            }
            case 60: {
                n3 = 11;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 27;
                break;
            }
            default: {
                n3 = 36;
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
        CryptographicKeyResolver.rb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void u() {
    }

    private void X() {
        block4: {
            this.EF.A();
            TransactionDescriptor transactionDescriptor = TemporalMetadataResolver.h.o().A();
            try {
                try {
                    if (this.EF.P() == null || !this.EF.P().equals(transactionDescriptor)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyResolver.a(customSystemException);
                }
                TemporalMetadataResolver.h.o().q(this.EF.P());
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicKeyResolver.a(customSystemException);
            }
        }
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "=8{";
        objectArray[1] = Integer.TYPE;
        CryptographicKeyResolver.rb[1] = "java/lang/Integer";
        objectArray[2] = "3w\u0004=[\u00168x\u0015r&\u000e+\u007f\u001c;";
        objectArray[3] = "\u007f0TT\u0006~t?E\u001bgp\u007f4AA";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "@an$U[\u0017l0\u001fDOyp2n\u0013FHs-&/\r\u0000c4\u007f\u0010SH`\"\u001f";
    }

    @Override
    public void E() {
        this.h(true);
        ConfigurationManager.U(this.G() - 0.5, this.W() - 0.5, this.w() + 1.0, this.b() + 1.0 + 2.0, CryptographicKeyResolver.M.k, 2.0f, 0.8f, 1.0f);
        super.E();
    }

    private static Method p(long l, long l2) {
        int n = CryptographicKeyResolver.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicKeyResolver.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicKeyResolver.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicKeyResolver.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicKeyResolver.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicKeyResolver.n(243986509277113L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicKeyResolver.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicKeyResolver.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicKeyResolver.n(243986509277113L, 0L);
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

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicKeyResolver.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicKeyResolver.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public JsonPayloadOrchestrator y() {
        return this.EF;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicKeyResolver.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = CryptographicKeyResolver.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicKeyResolver.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == 'c' || c == '\u00ca' || c == 'X') {
                field = CryptographicKeyResolver.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicKeyResolver.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public String A() {
        long l = ab ^ 0x3669AE2E3DCCL;
        return CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)20955, (long)(0x28CEF7633D372BD7L ^ l)), (long)4868458591360003967L, (long)l);
    }

    public void f(@Nullable WorkflowOrchestrator workflowOrchestrator) {
        this.E9 = workflowOrchestrator;
    }

    public void V() {
        try {
            if (this.EF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyResolver.a(customSystemException);
        }
        this.EF.q().w();
        this.EM.V();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static AbstractComputationKernel[] y() {
        return Eu;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicKeyResolver.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public CryptographicKeyResolver() {
        long l = ab ^ 0x58D4EDB05B7EL;
        this.ES = new GraphicalRenderEngine1082(332.0, 182.0);
        this.EO = new GraphicalRenderEngine1082(206.0, 182.0);
        this.Ey = new HardwareYield((String)((Object)CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)14769, (long)(0x5AB427D5E41AA50BL ^ l)), (long)2675793445412948429L, (long)l)), 1.0, new Color(255, 255, 255, 0), new Color(255, 255, 255, 25), 10.0, 10.0);
        this.EM = new CollaborativeResourceCoordinator();
        this.EU = new DataTransformationCoordinator();
        this.L(true);
        PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(4.0, 4.0, 4.0, 0.0, this.ES);
        this.n(precisionMathOrchestrator, new Object[0]);
        PrecisionMathOrchestrator precisionMathOrchestrator2 = new PrecisionMathOrchestrator(8.0, this.EM);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(14.0, 10.0);
        graphicalRenderEngine1082.n(this.Ey, new Object[0]);
        this.ES.n(precisionMathOrchestrator2, new Object[0]);
        this.ES.n(new bE(2.0, 0.0), new Object[0]);
        this.ES.n(this.EO, new Object[0]);
        this.EO.d().f((String)((Object)CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)3762, (long)(0x2E93FE0A58601209L ^ l)), (long)2675793445412948429L, (long)l)));
        this.EO.n(graphicalRenderEngine1082, CryptographicKeyResolver.e("\u00f8", (int)CryptographicKeyResolver.d("a", (int)20733, (long)(0x44A7AEF98E29CC41L ^ l)), (long)2675793445412948429L, (long)l));
        this.EO.n(this.EU, new Object[0]);
        this.Ey.N(this::lambda$new$2);
    }

    public static void t(AbstractComputationKernel[] abstractComputationKernelArray) {
        Eu = abstractComputationKernelArray;
    }

    @Nullable
    public WorkflowOrchestrator l() {
        return this.E9;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicKeyResolver.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicKeyResolver.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

