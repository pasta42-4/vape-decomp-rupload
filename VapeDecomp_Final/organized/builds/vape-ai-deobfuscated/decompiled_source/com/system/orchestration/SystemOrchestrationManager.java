/*
 * Decompiled with CFR 0.152.
 */
package com.system.orchestration;

import a.IS;
import a.fO;
import a.fu;
import a.hQ;
import a.hg;
import com.advanced.resolution.MultiLayeredCompositeResolver;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.math.NumericStreamProcessor;
import com.app.system.configuration.RuntimeConfigurationBuilder;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.data.sorting.EntitySortingComparator2300;
import com.deobfuscation.bytecode.BytecodeRegistrar;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderingController249;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.connection.NetworkConnectionHandler1806;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthenticationHandler1607;
import com.security.authorization.AuthorizationResolver;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSecurityManager396;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SystemOrchestrationManager
extends hQ {
    private String V;
    private ContextualExecutionFramework RG;
    private double D;
    private MetricsCalculationEngine Rk;
    private static final Object[] fb;
    private HardwareYield RX;
    private long RM;
    private List<AbstractComputationKernel> RD;
    private static final Integer[] db;
    private double RR;
    private fu Rx;
    private boolean R5;
    private GraphicalThemeRenderer Rd;
    private GraphicalRenderingController249 R2;
    private static final String[] jb;
    private HardwareYield R3;
    private static final long ab;
    private int Rl;
    private GraphicalThemeRenderer b;
    private double RV;
    private static final Map eb;
    private final long Y = 2000L;
    private boolean RE;
    private boolean Rj;
    private static final long[] bb;
    private int Rw;
    private boolean L;
    private NumericStreamProcessor Rr;

    @Override
    public void g() {
        try {
            if (!GraphicalRenderingController.e) {
                this.R5 = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
    }

    static GraphicalThemeRenderer V(SystemOrchestrationManager systemOrchestrationManager) {
        return systemOrchestrationManager.Rd;
    }

    public void o() {
        this.Rj = true;
        for (AbstractComputationKernel abstractComputationKernel : this.RD) {
            Color color;
            block8: {
                ConfigurationProfileResolver configurationProfileResolver;
                block7: {
                    this.Rx.A().get(this.Rx.A().indexOf(abstractComputationKernel)).N(true);
                    abstractComputationKernel.Q(SystemOrchestrationManager.M.a);
                    configurationProfileResolver = abstractComputationKernel.k();
                    try {
                        try {
                            try {
                                if (configurationProfileResolver == null || configurationProfileResolver.G() == null) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemOrchestrationManager.a(customSystemException);
                            }
                            if (configurationProfileResolver.U() != null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemOrchestrationManager.a(customSystemException);
                        }
                        color = SystemOrchestrationManager.M.a.darker();
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                }
                color = configurationProfileResolver.U();
            }
            Color color2 = color;
            abstractComputationKernel.Q(color2);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d4' || c == 'b' || c == '\u00d2' || c == '\u00f8') {
                field = SystemOrchestrationManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SystemOrchestrationManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static double p(SystemOrchestrationManager systemOrchestrationManager, double d2) {
        systemOrchestrationManager.RR = d2;
        return systemOrchestrationManager.RR;
    }

    public void M(String string) {
        try {
            if (string == null) {
                this.C(1);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        this.V = string.toUpperCase();
    }

    private void I() {
        block17: {
            block18: {
                try {
                    try {
                        if (SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal())) break block17;
                        this.L = false;
                        GraphicalRenderingController.d = null;
                        if (this.Rw == -1) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                    TemporalMetadataResolver.h.S().I().remove(this.RG);
                    TemporalMetadataResolver.h.S().I().add(this.Rw, this.RG);
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemOrchestrationManager.a(customSystemException);
                }
            }
            fO.p();
            this.Rw = -1;
            return;
        }
        int n = -1;
        int n2 = -1;
        double d2 = this.b() * this.w();
        ArrayList<SystemOrchestrationManager> arrayList = new ArrayList<SystemOrchestrationManager>();
        for (AbstractComputationKernel abstractComputationKernel : this.Rx.A()) {
            try {
                if (!(abstractComputationKernel instanceof SystemOrchestrationManager)) continue;
                arrayList.add((SystemOrchestrationManager)abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
        }
        arrayList.sort(new EntitySortingComparator2300(this));
        for (SystemOrchestrationManager systemOrchestrationManager : arrayList) {
            try {
                ++n2;
                if (systemOrchestrationManager.equals(this)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
            double d3 = systemOrchestrationManager.C().c(this.C());
            if (!(d3 >= d2 / 2.0)) continue;
            n = n2;
            break;
        }
        try {
            if (n == -1) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        try {
            if (this.Rw != n) {
                this.w(n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        this.Rw = n;
    }

    public void o(boolean bl) {
        this.Rj = bl;
    }

    @Override
    public void U() {
    }

    private static Method h(long l, long l2) {
        int n = SystemOrchestrationManager.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = SystemOrchestrationManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SystemOrchestrationManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SystemOrchestrationManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SystemOrchestrationManager.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SystemOrchestrationManager.f(277306217360050L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SystemOrchestrationManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SystemOrchestrationManager.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SystemOrchestrationManager.f(277306217360050L, 0L);
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

    public GraphicalRenderingController249 Y() {
        return this.R2;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 27;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 44;
                break;
            }
            case 4: {
                n3 = 11;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 33;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 32;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 18;
                break;
            }
            case 15: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 5;
                break;
            }
            case 17: {
                n3 = 31;
                break;
            }
            case 18: {
                n3 = 20;
                break;
            }
            case 19: {
                n3 = 21;
                break;
            }
            case 20: {
                n3 = 28;
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
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 1;
                break;
            }
            case 25: {
                n3 = 57;
                break;
            }
            case 26: {
                n3 = 4;
                break;
            }
            case 27: {
                n3 = 35;
                break;
            }
            case 28: {
                n3 = 41;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 60;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 56;
                break;
            }
            case 34: {
                n3 = 7;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 52;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 15;
                break;
            }
            case 42: {
                n3 = 34;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 13;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 30;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 29;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 3;
                break;
            }
            case 51: {
                n3 = 38;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 43;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 39;
                break;
            }
            case 58: {
                n3 = 54;
                break;
            }
            case 59: {
                n3 = 48;
                break;
            }
            case 60: {
                n3 = 14;
                break;
            }
            case 61: {
                n3 = 51;
                break;
            }
            case 62: {
                n3 = 49;
                break;
            }
            default: {
                n3 = 61;
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
        SystemOrchestrationManager.jb[n4] = new String(cArray);
        return n4;
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "\u001a5\u0003";
        objectArray[1] = Integer.TYPE;
        SystemOrchestrationManager.jb[1] = "java/lang/Integer";
        objectArray[2] = "$(o\u001f1]/'~PLE< w\u0019";
        objectArray[3] = "#x!u6\u0019(w0:W\u0017#|4`";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "C\u001ezeK`\u001b]z\u0017Ijr\u0019?xXa\t\\:u\"+H\b?,SoK\u0001$\u0017";
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SystemOrchestrationManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SystemOrchestrationManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SystemOrchestrationManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SystemOrchestrationManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SystemOrchestrationManager.ab = MultiContainerRegistry.a(-3328735911787541868L, 5674568816636643298L, MethodHandles.lookup().lookupClass()).a(229883401606684L);
                SystemOrchestrationManager.fb = new Object[5];
                SystemOrchestrationManager.jb = new String[5];
                SystemOrchestrationManager.i();
                SystemOrchestrationManager.eb = new HashMap<K, V>(13);
                var0 = SystemOrchestrationManager.ab ^ 13642611033733L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "i\u00bdYh\u00f1\u00b2\u009c\u0084\u00d1\u00a7\u001bz\u00f5\u0082c\u00f0\u00c8\u00c1\u00ddL\u0003\u0015\u000e\u00cd\u00c0\u00bd\u00bb\u00dd\u00cb\u00f0\u00b0\u00fb\u00f0\u0007\u0017h\u00ae\u000bL#\u00e0\u00a3X\u00c7\u0019\u00cfA\u00d1w\u00cax\u0013\u0095\u0000\u0012\u008f\u00db\u00d7\u0014G\u00f3#=\u00e5\u0081)\u0010\u00c7(\u0095\f\u00caT\u00f1\u00f7\"\u008a\u00f7\u00b2\u00e4*\"\u00a5\u00f1\u00be\u0013\u00a0\u001d\u00cf\u00ac#\u0002r\u008e\u0015\t\u00dd\u00fe\u00f0\u00f1\u0001\u00191\u00e1\u00b4$\u00a1\u00f2\u00c1I\u0091\u00fb\u0015BR\u00c4\u00ff@S\u00f6\u0007\u00bbz\u00d9\u00fcz%K\u0084\u0019\u0098\u00f7\u00f5\u0087\u008cb";
                var7_6 = "i\u00bdYh\u00f1\u00b2\u009c\u0084\u00d1\u00a7\u001bz\u00f5\u0082c\u00f0\u00c8\u00c1\u00ddL\u0003\u0015\u000e\u00cd\u00c0\u00bd\u00bb\u00dd\u00cb\u00f0\u00b0\u00fb\u00f0\u0007\u0017h\u00ae\u000bL#\u00e0\u00a3X\u00c7\u0019\u00cfA\u00d1w\u00cax\u0013\u0095\u0000\u0012\u008f\u00db\u00d7\u0014G\u00f3#=\u00e5\u0081)\u0010\u00c7(\u0095\f\u00caT\u00f1\u00f7\"\u008a\u00f7\u00b2\u00e4*\"\u00a5\u00f1\u00be\u0013\u00a0\u001d\u00cf\u00ac#\u0002r\u008e\u0015\t\u00dd\u00fe\u00f0\u00f1\u0001\u00191\u00e1\u00b4$\u00a1\u00f2\u00c1I\u0091\u00fb\u0015BR\u00c4\u00ff@S\u00f6\u0007\u00bbz\u00d9\u00fcz%K\u0084\u0019\u0098\u00f7\u00f5\u0087\u008cb".length();
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
                    var6_5 = "\u00c1\u00cdi7L\u008bCW\u0097\u0095\u0099\u00b6!\u0019,T";
                    var7_6 = "\u00c1\u00cdi7L\u008bCW\u0097\u0095\u0099\u00b6!\u0019,T".length();
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
        SystemOrchestrationManager.bb = var8_3;
        SystemOrchestrationManager.db = new Integer[19];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SystemOrchestrationManager.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                SystemOrchestrationManager.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void C() {
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : this.RG.Y()) {
            AbstractComputationKernel abstractComputationKernel;
            block7: {
                block6: {
                    abstractComputationKernel = RuntimeConfigurationBuilder.m(configurationProfileResolver);
                    try {
                        try {
                            if (abstractComputationKernel == null) continue;
                            if (configurationProfileResolver.G() == null) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemOrchestrationManager.a(customSystemException);
                        }
                        abstractComputationKernel.Q(SystemOrchestrationManager.M.a);
                        break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                }
                abstractComputationKernel.Q(SystemOrchestrationManager.M.W);
            }
            abstractComputationKernel.N(false);
            this.Rx.n(abstractComputationKernel, new Object[0]);
            this.RD.add(abstractComputationKernel);
        }
        if (this.RG instanceof MultiLayeredCompositeResolver) {
            hg hg2 = new hg();
            hg2.Q(SystemOrchestrationManager.M.W);
            hg2.N(false);
            this.Rx.n(hg2, new Object[0]);
            this.RD.add(hg2);
        }
    }

    private void w(int n) {
        double d2 = this.Rx.Q().W() + this.Rx.Q().b();
        ArrayList<SystemOrchestrationManager> arrayList = new ArrayList<SystemOrchestrationManager>();
        for (AbstractComputationKernel abstractComputationKernel : this.Rx.A()) {
            try {
                if (!(abstractComputationKernel instanceof SystemOrchestrationManager)) continue;
                arrayList.add((SystemOrchestrationManager)abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
        }
        arrayList.remove(this);
        arrayList.add(n, this);
        double d3 = 0.0;
        for (SystemOrchestrationManager systemOrchestrationManager : arrayList) {
            try {
                if (systemOrchestrationManager.W() < d2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
            if (systemOrchestrationManager.D().equals(this.D())) {
                d3 += systemOrchestrationManager.b();
                continue;
            }
            systemOrchestrationManager.M(d2 + d3);
            d3 += systemOrchestrationManager.b();
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static double O(SystemOrchestrationManager systemOrchestrationManager, double d2) {
        systemOrchestrationManager.D = d2;
        return systemOrchestrationManager.D;
    }

    public GraphicalThemeRenderer e() {
        return this.Rd;
    }

    public SystemOrchestrationManager(fu fu2, ContextualExecutionFramework contextualExecutionFramework) {
        this(fu2, contextualExecutionFramework, 0.9);
    }

    static MetricsCalculationEngine D(SystemOrchestrationManager systemOrchestrationManager) {
        return systemOrchestrationManager.Rk;
    }

    static GraphicalRenderingController249 p(SystemOrchestrationManager systemOrchestrationManager) {
        return systemOrchestrationManager.R2;
    }

    static boolean T(SystemOrchestrationManager systemOrchestrationManager, boolean bl) {
        systemOrchestrationManager.L = bl;
        return systemOrchestrationManager.L;
    }

    public void M() {
        this.Rj = false;
        for (AbstractComputationKernel abstractComputationKernel : this.RD) {
            this.Rx.A().get(this.Rx.A().indexOf(abstractComputationKernel)).N(false);
            abstractComputationKernel.Q(SystemOrchestrationManager.M.a);
        }
    }

    public SystemOrchestrationManager(fu fu2, ContextualExecutionFramework contextualExecutionFramework, double d2) {
        long l = ab ^ 0x335DB4C3F831L;
        this.Rw = -1;
        this.V = null;
        this.Rl = 0;
        this.Y = 2000L;
        this.RM = 0L;
        this.RD = new ArrayList<AbstractComputationKernel>();
        this.R3 = new HardwareYield((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)24178, (long)(0x3887120AAF527873L ^ l)), (long)8108177394339817116L, (long)l)), 1.5);
        this.RX = new HardwareYield((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)10067, (long)(0x3169A8FEEAA90158L ^ l)), (long)8108177394339817116L, (long)l)), 1.5);
        this.Rr = new NumericStreamProcessor(0.15, 0.0, 1.0);
        this.Rd = new GraphicalThemeRenderer((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)2903, (long)(0x2B51A167EC80AD41L ^ l)), (long)8108177394339817116L, (long)l)));
        this.b = new GraphicalThemeRenderer((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)20428, (long)(0x53216B650B6A69C0L ^ l)), (long)8108177394339817116L, (long)l)));
        this.Rx = fu2;
        this.RG = contextualExecutionFramework;
        this.RV = d2;
        this.R2 = new GraphicalRenderingController249(contextualExecutionFramework.C());
        this.Q(SystemOrchestrationManager.M.W);
        if (contextualExecutionFramework.r() != null) {
            this.g(contextualExecutionFramework.r());
        }
        SystemOrchestrationManager systemOrchestrationManager = this;
        try {
            if (fu2 instanceof fO) {
                this.RE = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        this.R3.N(new BytecodeRegistrar(this, contextualExecutionFramework, fu2));
        this.R3.g((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)222, (long)(0x32673C93C9A5A6D7L ^ l)), (long)8108177394339817116L, (long)l)));
        this.RX.N(new AuthorizationResolver(this, systemOrchestrationManager));
        this.Rd.N(new AuthenticationHandler1607(this, fu2));
        this.b.N(new NetworkConnectionHandler1806(this, contextualExecutionFramework));
        this.b.g((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)10581, (long)(0x70D97B3849AF8F41L ^ l)), (long)8108177394339817116L, (long)l)));
        this.N(new IS(this, contextualExecutionFramework));
        this.o(this.R2, this.R3, this.RX, this.Rd, this.b);
    }

    static boolean k(SystemOrchestrationManager systemOrchestrationManager) {
        return systemOrchestrationManager.RE;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5681;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SystemOrchestrationManager.db[n2] = n3;
        }
        return db[n2];
    }

    public List<AbstractComputationKernel> X() {
        return this.RD;
    }

    public void C(int n) {
        this.Rl = n;
        this.RM = System.currentTimeMillis();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = SystemOrchestrationManager.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = SystemOrchestrationManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SystemOrchestrationManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SystemOrchestrationManager.c(clazz3, string2, clazz2)) != null) {
                    SystemOrchestrationManager.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SystemOrchestrationManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SystemOrchestrationManager.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SystemOrchestrationManager.f(277306217360050L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void d() {
        block80: {
            int n;
            block84: {
                String string;
                int[] nArray;
                long l;
                block83: {
                    SystemOrchestrationManager systemOrchestrationManager;
                    block82: {
                        long l2;
                        block81: {
                            block79: {
                                block77: {
                                    block78: {
                                        block74: {
                                            long l3;
                                            block72: {
                                                SystemOrchestrationManager systemOrchestrationManager2;
                                                block75: {
                                                    String string2;
                                                    block73: {
                                                        SystemOrchestrationManager systemOrchestrationManager3;
                                                        block70: {
                                                            block71: {
                                                                int n2;
                                                                block66: {
                                                                    block67: {
                                                                        SystemOrchestrationManager systemOrchestrationManager4;
                                                                        block68: {
                                                                            block69: {
                                                                                l = ab ^ 0x33B2DE2428A3L;
                                                                                nArray = VisualRenderContext.D();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    n2 = this.R2.I();
                                                                                                    if (nArray == null) break block66;
                                                                                                    if (n2 == 0) break block67;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                                }
                                                                                                systemOrchestrationManager4 = this;
                                                                                                if (nArray == null) break block68;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                                            }
                                                                                            if (systemOrchestrationManager4.V == null) break block69;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                                        }
                                                                                        n2 = this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)3827, (long)(0x4931F62FA46FF86BL ^ l)), (long)-6911890117839948274L, (long)l))) ? 1 : 0;
                                                                                        if (nArray == null) break block66;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                                    }
                                                                                    if (n2 != 0) break block67;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                }
                                                                            }
                                                                            systemOrchestrationManager4 = this;
                                                                        }
                                                                        systemOrchestrationManager4.M((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)8207, (long)(0x4F07DF46082E5695L ^ l)), (long)-6911890117839948274L, (long)l)));
                                                                    }
                                                                    try {
                                                                        systemOrchestrationManager3 = this;
                                                                        if (nArray == null) break block70;
                                                                        n2 = systemOrchestrationManager3.Rl;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n2 == 0 || System.currentTimeMillis() <= this.RM + 2000L) break block71;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                        }
                                                                        this.V = null;
                                                                        this.R2.x(false);
                                                                        this.Rl = 0;
                                                                        if (nArray != null) break block72;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                    }
                                                                    AbstractComputationKernel.I(new String[1]);
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                }
                                                            }
                                                            systemOrchestrationManager3 = this;
                                                        }
                                                        try {
                                                            try {
                                                                string2 = systemOrchestrationManager3.V;
                                                                if (nArray == null) break block73;
                                                                if (string2 == null) break block72;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                            }
                                                            string2 = this.V.toLowerCase(Locale.ROOT);
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        block76: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    l2 = (long)string2.startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)12666, (long)(0x2058B58139C6C7EEL ^ l)), (long)-6911890117839948274L, (long)l)));
                                                                                    if (nArray == null) break block74;
                                                                                    if (l2 == false) break block72;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                }
                                                                                l2 = (long)this.R2.I();
                                                                                if (nArray == null) break block74;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                            }
                                                                            if (l2 != false) break block72;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                        }
                                                                        this.C(1);
                                                                        systemOrchestrationManager2 = this;
                                                                        if (nArray == null) break block75;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                    }
                                                                    if (systemOrchestrationManager2.RG.C().t().length() <= 0) break block76;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                }
                                                                this.M((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)12772, (long)(0x72860F02F8A6C778L ^ l)), (long)-6911890117839948274L, (long)l)));
                                                                if (nArray != null) break block72;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                            }
                                                        }
                                                        systemOrchestrationManager2 = this;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                    }
                                                }
                                                systemOrchestrationManager2.M((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)4280, (long)(0x92DD34BEA36E62AL ^ l)), (long)-6911890117839948274L, (long)l)));
                                            }
                                            l2 = (l3 = System.currentTimeMillis() - 1784953218903L) == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (nArray == null) break block77;
                                                        if (l2 <= 0) break block78;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                    }
                                                    l2 = ThreadLocalRandom.current().nextInt(0, 10000) % 500;
                                                    if (nArray == null) break block77;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                }
                                                if (l2 != false) break block78;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemOrchestrationManager.a(customSystemException);
                                            }
                                            ClusterNodeRegistry1151.W().Y.put(ThreadLocalRandom.current().nextInt(0, 600), null);
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SystemOrchestrationManager.a(customSystemException);
                                        }
                                    }
                                    l2 = (long)this.R5;
                                }
                                try {
                                    try {
                                        if (nArray == null) break block79;
                                        if (l2 == false) break block80;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemOrchestrationManager.a(customSystemException);
                                    }
                                    l2 = (long)this.s();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemOrchestrationManager.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (nArray == null) break block81;
                                        if (l2 != false) break block80;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemOrchestrationManager.a(customSystemException);
                                    }
                                    this.R5 = false;
                                    systemOrchestrationManager = this;
                                    if (nArray == null) break block82;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemOrchestrationManager.a(customSystemException);
                                }
                                l2 = systemOrchestrationManager.Rl;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemOrchestrationManager.a(customSystemException);
                            }
                        }
                        if (l2 != false) break block80;
                        systemOrchestrationManager = this;
                    }
                    try {
                        try {
                            string = systemOrchestrationManager.V;
                            if (nArray == null) break block83;
                            if (string == null) break block80;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemOrchestrationManager.a(customSystemException);
                        }
                        string = this.V.toLowerCase(Locale.ROOT);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                }
                try {
                    try {
                        n = string.startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)28167, (long)(0x460039999E7F9892L ^ l)), (long)-6911890117839948274L, (long)l)));
                        if (nArray == null) break block84;
                        if (n != 0) break block80;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                    long l4 = System.currentTimeMillis() - (this.RM + 2000L);
                    n = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemOrchestrationManager.a(customSystemException);
                }
            }
            try {
                if (n > 0) {
                    this.M(null);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SystemOrchestrationManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static boolean W(SystemOrchestrationManager systemOrchestrationManager, boolean bl) {
        systemOrchestrationManager.Rj = bl;
        return systemOrchestrationManager.Rj;
    }

    @Override
    public void G() {
        float f;
        double d2;
        float f2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        CryptographicSecurityManager396 cryptographicSecurityManager396;
        double d10;
        double d11;
        boolean bl;
        boolean bl2;
        boolean bl3;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        block110: {
            CallSite callSite;
            CryptographicParameterGenerator cryptographicParameterGenerator2;
            double d12;
            long l;
            block109: {
                boolean bl4;
                block108: {
                    block107: {
                        boolean bl5;
                        block106: {
                            block104: {
                                block100: {
                                    int n;
                                    block114: {
                                        block101: {
                                            int n2;
                                            int n3;
                                            block103: {
                                                block102: {
                                                    block99: {
                                                        Color color;
                                                        double d13;
                                                        double d14;
                                                        String string;
                                                        CryptographicParameterGenerator cryptographicParameterGenerator3;
                                                        Color color2;
                                                        double d15;
                                                        block98: {
                                                            block96: {
                                                                Color color3;
                                                                GraphicalThemeRenderer graphicalThemeRenderer;
                                                                block93: {
                                                                    double d16;
                                                                    double d17;
                                                                    double d18;
                                                                    block97: {
                                                                        block95: {
                                                                            double d19;
                                                                            block94: {
                                                                                Color color4;
                                                                                block113: {
                                                                                    block90: {
                                                                                        Color color5;
                                                                                        GraphicalThemeRenderer graphicalThemeRenderer2;
                                                                                        double d20;
                                                                                        block92: {
                                                                                            block91: {
                                                                                                block112: {
                                                                                                    block89: {
                                                                                                        block87: {
                                                                                                            l = ab ^ 0x6A35E0B3F4BCL;
                                                                                                            try {
                                                                                                                if (this.L) {
                                                                                                                    this.q();
                                                                                                                    this.I();
                                                                                                                }
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                                                            }
                                                                                                            cryptographicParameterGenerator = this.L(this.RV);
                                                                                                            double d21 = cryptographicParameterGenerator.B(this.RG.O());
                                                                                                            d15 = this.W() + this.b() / 2.0 - d21 / 2.0;
                                                                                                            double d22 = this.W() + this.b() / 2.0 - 4.0;
                                                                                                            d12 = this.G() + 6.0;
                                                                                                            color4 = this.l();
                                                                                                            color2 = SystemOrchestrationManager.M.n;
                                                                                                            if (this.RG.Z()) {
                                                                                                                color4 = M.j();
                                                                                                                color2 = M.X();
                                                                                                            } else {
                                                                                                                block86: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (this.R5 || this.Rj) break block86;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                        }
                                                                                                                        if (this.V == null) break block87;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                    }
                                                                                                                }
                                                                                                                color4 = SystemOrchestrationManager.M.g;
                                                                                                                color2 = SystemOrchestrationManager.M.c;
                                                                                                            }
                                                                                                        }
                                                                                                        d20 = this.G() + this.w() - 10.0 - 8.0;
                                                                                                        try {
                                                                                                            block88: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (this.V != null && this.V.startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)3795, (long)(0x34DF7B77C4BDA45DL ^ l)), (long)8938326987782105617L, (long)l)))) break block88;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                                }
                                                                                                                                if (this.RG.C().E()) break block88;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                            }
                                                                                                                            if (this.R5) break block88;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                        }
                                                                                                                        if (this.R2.Q().F()) break block88;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                    }
                                                                                                                    if (!this.Rj) break block89;
                                                                                                                }
                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                                                }
                                                                                                            }
                                                                                                            if (GraphicalRenderingController.e) break block89;
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                                                        }
                                                                                                        this.R2.b(d20 -= this.R2.w());
                                                                                                        this.R2.M(this.W() + 5.0);
                                                                                                        this.R2.N(true);
                                                                                                        d20 -= 2.5;
                                                                                                        break block112;
                                                                                                    }
                                                                                                    this.R2.N(false);
                                                                                                }
                                                                                                try {
                                                                                                    if (!this.Rj || this.RE) break block90;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                                }
                                                                                                d20 -= this.b.w();
                                                                                                try {
                                                                                                    this.b.N(true);
                                                                                                    graphicalThemeRenderer2 = this.b;
                                                                                                    if (!this.RG.g()) break block91;
                                                                                                    color5 = SystemOrchestrationManager.M.o;
                                                                                                    break block92;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                color5 = this.RG.Z() ? color2 : null;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                                            }
                                                                                        }
                                                                                        graphicalThemeRenderer2.h(color5);
                                                                                        this.b.b(d20);
                                                                                        this.b.M(this.W());
                                                                                        this.b.w(this.b());
                                                                                        d20 -= 5.0;
                                                                                        break block113;
                                                                                    }
                                                                                    this.b.N(false);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        ConfigurationManager.A(this.G(), this.W(), this.w(), this.b(), color4);
                                                                                        if (!GraphicalRenderingController.e) break block93;
                                                                                        if (!this.Rj) break block94;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                                                    }
                                                                                    this.Rj = false;
                                                                                    this.Rx.E(null);
                                                                                    this.M();
                                                                                    return;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                d19 = this.RE ? 38.0 : 20.0;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                            }
                                                                            d18 = d19;
                                                                            d12 += d18;
                                                                            try {
                                                                                ConfigurationManager.A(this.G(), this.W(), d18, this.b(), SystemOrchestrationManager.M.a);
                                                                                this.b.N(false);
                                                                                this.Rd.N(false);
                                                                                if (!this.RE) break block95;
                                                                                this.R3.N(true);
                                                                                this.R3.b(this.G() + 5.0);
                                                                                this.R3.M(this.W());
                                                                                this.R3.w(this.b());
                                                                                this.RX.N(true);
                                                                                this.RX.b(this.G() + 10.0 + 8.0 * this.R3.u());
                                                                                this.RX.M(this.W());
                                                                                this.RX.w(this.b());
                                                                                break block96;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                                            }
                                                                        }
                                                                        this.Rk = new MetricsCalculationEngine(this.G(), this.W(), d18, this.b());
                                                                        d17 = 7.0;
                                                                        d16 = 0.5;
                                                                        double d23 = d16 + 0.5;
                                                                        try {
                                                                            if (!this.RG.H()) break block97;
                                                                            ConfigurationManager.A(this.G() + d17, this.W() + d17, d18 - d17 * 2.0, this.b() - d17 * 2.0, M.j());
                                                                            ConfigurationManager.A(this.G() + d17 + d16, this.W() + d17 + d16, d18 - (d17 + d16) * 2.0, this.b() - (d17 + d16) * 2.0, SystemOrchestrationManager.M.a);
                                                                            ConfigurationManager.A(this.G() + d17 + d23, this.W() + d17 + d23, d18 - (d17 + d23) * 2.0, this.b() - (d17 + d23) * 2.0, M.j());
                                                                            break block96;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                                        }
                                                                    }
                                                                    ConfigurationManager.A(this.G() + d17, this.W() + d17, d18 - d17 * 2.0, this.b() - d17 * 2.0, SystemOrchestrationManager.M.S);
                                                                    ConfigurationManager.A(this.G() + d17 + d16, this.W() + d17 + d16, d18 - (d17 + d16) * 2.0, this.b() - (d17 + d16) * 2.0, SystemOrchestrationManager.M.a);
                                                                    break block96;
                                                                }
                                                                try {
                                                                    this.R3.N(false);
                                                                    this.RX.N(false);
                                                                    this.Rd.N(true);
                                                                    graphicalThemeRenderer = this.Rd;
                                                                    color3 = this.RG.Z() ? color2 : null;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                                }
                                                                graphicalThemeRenderer.h(color3);
                                                                this.Rd.b(this.G() + this.w() - 5.0 - 8.0);
                                                                this.Rd.M(this.W());
                                                                this.Rd.w(this.b());
                                                            }
                                                            bl3 = false;
                                                            try {
                                                                if (this.V == null) break block98;
                                                                this.Rd.N(false);
                                                                this.R(d12, d15, color2);
                                                                break block99;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            cryptographicParameterGenerator3 = cryptographicParameterGenerator;
                                                            string = this.RG.O();
                                                            d14 = d12;
                                                            d13 = d15;
                                                            color = this.RG.H() ? color2 : SystemOrchestrationManager.M.w;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                        }
                                                        cryptographicParameterGenerator3.R(string, d14, d13, color);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (!this.RG.Z()) break block100;
                                                                if (!GraphicalRenderingController.e) break block101;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw SystemOrchestrationManager.a(customSystemException);
                                                            }
                                                            n3 = 20;
                                                            if (!this.RE) break block102;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SystemOrchestrationManager.a(customSystemException);
                                                        }
                                                        n2 = 18;
                                                        break block103;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SystemOrchestrationManager.a(customSystemException);
                                                    }
                                                }
                                                n2 = 0;
                                            }
                                            n = n3 + n2;
                                            break block114;
                                        }
                                        n = 0;
                                    }
                                    double d24 = n;
                                    ConfigurationManager.A(this.G() + d24, this.W() + this.b() - 0.5, this.w() - d24, 0.5, SystemOrchestrationManager.M.S);
                                }
                                try {
                                    block105: {
                                        try {
                                            try {
                                                try {
                                                    if (this.V == null) break block104;
                                                    if (this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)23879, (long)(0xAFE55C8DC4377C8L ^ l)), (long)8938326987782105617L, (long)l)))) break block105;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SystemOrchestrationManager.a(customSystemException);
                                                }
                                                if (this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)25534, (long)(0x340D08F0E78B4924L ^ l)), (long)8938326987782105617L, (long)l)))) break block105;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemOrchestrationManager.a(customSystemException);
                                            }
                                            if (!this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)31309, (long)(0x202574CAE410D0C5L ^ l)), (long)8938326987782105617L, (long)l)))) break block104;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SystemOrchestrationManager.a(customSystemException);
                                        }
                                    }
                                    bl5 = true;
                                    break block106;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemOrchestrationManager.a(customSystemException);
                                }
                            }
                            bl5 = false;
                        }
                        bl2 = bl5;
                        try {
                            try {
                                if (!this.RG.m() || this.RG.Z()) break block107;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemOrchestrationManager.a(customSystemException);
                            }
                            bl4 = true;
                            break block108;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemOrchestrationManager.a(customSystemException);
                        }
                    }
                    bl4 = false;
                }
                bl = bl4;
                try {
                    if (!bl || bl2) break block109;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemOrchestrationManager.a(customSystemException);
                }
                d11 = d12 + cryptographicParameterGenerator.D(this.RG.O()) + 5.0;
                d10 = this.W() + 7.0;
                ConfigurationManager.S(d11, d10, 20.0, 7.0, M.j());
                cryptographicParameterGenerator2 = TemporalMetadataResolver.h.W().u(0.8, false);
                cryptographicParameterGenerator2.R((String)((Object)SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)23948, (long)(0x6A886E67ABE5770CL ^ l)), (long)8938326987782105617L, (long)l)), d11 + 3.0, d10 + 1.0, EventDispatchCoordinator1159.Q(M.j(), 35, 255));
                break block110;
            }
            try {
                block111: {
                    try {
                        try {
                            if (this.Rj) break block110;
                            if (this.RG.w()) break block111;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemOrchestrationManager.a(customSystemException);
                        }
                        if (!this.RG.J()) break block110;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                }
                if (this.RG.Z()) break block110;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
            d11 = d12 + cryptographicParameterGenerator.D(this.RG.O()) + 3.0;
            d10 = this.W() + 7.0;
            cryptographicParameterGenerator2 = this.t(0.65f);
            try {
                callSite = this.RG.J() ? SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)30783, (long)(0x35A8A35691ADD2B6L ^ l)), (long)8938326987782105617L, (long)l) : SystemOrchestrationManager.c("x", (int)SystemOrchestrationManager.b("t", (int)14292, (long)(0x6CC141237D7D1D56L ^ l)), (long)8938326987782105617L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw SystemOrchestrationManager.a(customSystemException);
            }
            CallSite callSite2 = callSite;
            double d25 = cryptographicParameterGenerator2.D((String)((Object)callSite2)) + 4.0;
            double d26 = cryptographicParameterGenerator2.B((String)((Object)callSite2)) + 2.0;
            ConfigurationManager.S(d11, d10, d25, d26, M.j());
            cryptographicParameterGenerator2.R((String)((Object)callSite2), d11 + 2.0, d10 + 1.0, EventDispatchCoordinator1159.Q(M.j(), 35, 255));
        }
        try {
            if (bl2) {
                this.b.N(false);
                this.R3.N(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        try {
            cryptographicSecurityManager396 = this.R2.V;
            d9 = this.w() - 20.0;
            d8 = this.Rj ? this.b.w() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        try {
            d7 = d9 - d8;
            d6 = this.Rd.f() ? this.Rd.w() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        try {
            d5 = d7 - d6;
            d4 = this.V != null ? cryptographicParameterGenerator.D(this.V) + 3.0 : cryptographicParameterGenerator.D(this.RG.O());
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        try {
            d3 = d5 - d4;
            f2 = bl3 ? 13.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        try {
            d2 = d3 - (double)f2;
            f = bl ? 25.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemOrchestrationManager.a(customSystemException);
        }
        cryptographicSecurityManager396.a(d2 - (double)f);
        if (this.V != null) {
            d11 = this.G() + this.w() - 10.0 - 8.0 - this.R2.w();
            d10 = this.G() + 15.0 + cryptographicParameterGenerator.D(this.V);
            double d27 = this.G() + this.w() - 5.0 - this.R2.w();
            this.R2.b(Math.min(d27, Math.max(d11, d10)));
        } else {
            this.R2.b(this.G() + this.w() - 10.0 - 8.0 - this.R2.w());
        }
    }

    private void R(double d2, double d3, Color color) {
        GraphicsBufferAllocator.e(this.G(), this.W(), this.w(), this.b());
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        ConfigurationManager.A(this.G(), this.W(), cryptographicParameterGenerator.D(this.V) + 10.0, this.b(), new Color(20, 20, 20, 255));
        int n = 7;
        double d4 = this.G() + cryptographicParameterGenerator.D(this.V) + 10.0 - 1.0;
        double d5 = this.W() + this.b();
        double d6 = d4;
        double d7 = this.W() - 4.0;
        double d8 = d4 + (double)n;
        double d9 = d5;
        ConfigurationManager.m(d4 + 1.0, d5, d6 + 1.0, d7 - 20.0, d8 + 1.0, d9, new Color(16, 16, 16, 255));
        ConfigurationManager.m(d4, d5, d6, d7, d8, d9, new Color(20, 20, 20, 255));
        cryptographicParameterGenerator.R(this.V, d2, d3, color);
        GraphicsBufferAllocator.F();
    }

    private void q() {
        block13: {
            CoordinateMapper coordinateMapper;
            block14: {
                block12: {
                    block10: {
                        block11: {
                            coordinateMapper = GraphicsBufferAllocator.b();
                            double d2 = (double)coordinateMapper.I - this.D;
                            try {
                                try {
                                    this.M(this.W() + d2);
                                    if (!(this.W() < this.Rx.W() + this.Rx.Q().b())) break block10;
                                    if (!this.Rx.O()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemOrchestrationManager.a(customSystemException);
                                }
                                this.Rx.e(this.Rx.V() + 1.0);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemOrchestrationManager.a(customSystemException);
                            }
                        }
                        this.M(this.Rx.W() + this.Rx.Q().b());
                        break block13;
                    }
                    try {
                        try {
                            if (!this.Rx.O() || !(this.W() > this.Rx.W() + this.Rx.Q() - this.b())) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemOrchestrationManager.a(customSystemException);
                        }
                        this.Rx.e(this.Rx.V() - 1.0);
                        this.M(this.Rx.W() + this.Rx.Q() - this.b());
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemOrchestrationManager.a(customSystemException);
                    }
                }
                try {
                    if (!(this.W() > this.Rx.W() + this.Rx.b() - this.b())) break block14;
                    this.M(this.Rx.W() + this.Rx.b() - this.b());
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemOrchestrationManager.a(customSystemException);
                }
            }
            this.D = coordinateMapper.I;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    @Override
    public double z() {
        return 20.0;
    }

    @Override
    public double e() {
        return 110.0;
    }

    static boolean w(SystemOrchestrationManager systemOrchestrationManager) {
        return systemOrchestrationManager.Rj;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SystemOrchestrationManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public ContextualExecutionFramework D() {
        return this.RG;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SystemOrchestrationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SystemOrchestrationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

