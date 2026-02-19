/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KB;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.config.management.ConfigurationRegistry;
import com.async.events.AsynchronousEventCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graphics.palette.ColorPaletteManager;
import com.indexing.metadata.MetadataIndexingService;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.security.authentication.AuthenticationGateway1860;
import com.security.authentication.AuthenticationTokenManager505;
import com.security.selection.CryptoAlgorithmSelector943;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.ResourceOrchestrationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.util.numeric.NumericFormattingUtility;
import com.validation.core.ObjectValidator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x9
extends AuthenticationTokenManager505 {
    private final AuthenticationStateTracker V;
    private final AuthenticationGateway1860 N;
    private static final long b;
    private final ColorPaletteManager L;
    private final AuthenticationStateTracker Y;
    private final NumericFormattingUtility m;
    private final NetworkConfigManager B;
    private boolean O;
    private final AuthenticationStateTracker z;
    private final AuthenticationGateway1860 P;
    private final AuthenticationGateway1860 l;
    private boolean w;
    private final ColorPaletteManager K;
    private final AuthenticationStateTracker r;
    private final AuthenticationStateTracker R;
    private static final String[] X;
    private static final Object[] F;
    private static final Integer[] n;
    private final GenericAdapterManager h;
    private static final long[] e;
    private final NumericFormattingUtility t;
    private static final Map v;
    private final AuthenticationStateTracker G;

    public x9() {
        long l = b ^ 0x5B4B40FFAA11L;
        super(a.cs((int)x9.a("o", (int)20818, (long)(0x1CF8149FBE222D72L ^ l))));
        this.z = AuthenticationStateTracker.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)2846, (long)(0x7C1EF61865817730L ^ l)), (long)8920610552205537094L, (long)l)), true);
        this.l = new AuthenticationGateway1860((String)((Object)x9.d("G", (int)x9.a("o", (int)18277, (long)(0x3CBB7D67885BB50L ^ l)), (long)8920610552205537094L, (long)l)));
        this.P = new AuthenticationGateway1860((String)((Object)x9.d("G", (int)x9.a("o", (int)18521, (long)(0x5F89E62940113469L ^ l)), (long)8920610552205537094L, (long)l)));
        this.N = new AuthenticationGateway1860((String)((Object)x9.d("G", (int)x9.a("o", (int)24584, (long)(0x6A48AD1106E81C24L ^ l)), (long)8920610552205537094L, (long)l)));
        this.h = GenericAdapterManager.D(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)31966, (long)(0x1C65AB767E5C80F1L ^ l)), (long)8920610552205537094L, (long)l)), this.P, this.l, this.P, this.N);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)31296, (long)(0x1B84BC2942798674L ^ l)), (long)8920610552205537094L, (long)l)), false);
        this.t = NumericFormattingUtility.P(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)28741, (long)(0x15CAA2FBAE1F8C6DL ^ l)), (long)8920610552205537094L, (long)l)), (String)((Object)x9.d("G", (int)x9.a("o", (int)29693, (long)(0x2A1A2DD00B260FCFL ^ l)), (long)8920610552205537094L, (long)l)), "", 1.0, 6.0, 13.0, 20.0);
        this.V = AuthenticationStateTracker.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)5599, (long)(0xE086F30A04369F2L ^ l)), (long)8920610552205537094L, (long)l)), false);
        this.L = ColorPaletteManager.r(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)1285, (long)(0x3313B483691B7933L ^ l)), (long)8920610552205537094L, (long)l)), (String)((Object)x9.d("G", (int)x9.a("o", (int)15257, (long)(0x2C79BA93DEFC7BCL ^ l)), (long)8920610552205537094L, (long)l)), ColorPaletteManager.U, new RecursiveNodeTreeBuilder((String)((Object)x9.d("G", (int)x9.a("o", (int)14820, (long)(0x143F922A476EC5C2L ^ l)), (long)8920610552205537094L, (long)l))));
        this.R = AuthenticationStateTracker.R(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)22685, (long)(0x1EA8E9D2B9F624BAL ^ l)), (long)8920610552205537094L, (long)l)), false, (String)((Object)x9.d("G", (int)x9.a("o", (int)22730, (long)(0x5246F3D2292A4F9L ^ l)), (long)8920610552205537094L, (long)l)));
        this.Y = AuthenticationStateTracker.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)9412, (long)(0xC5120E75285D8EDL ^ l)), (long)8920610552205537094L, (long)l)), false);
        this.m = NumericFormattingUtility.P(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)21047, (long)(0x6B6875172F312E1DL ^ l)), (long)8920610552205537094L, (long)l)), (String)((Object)x9.d("G", (int)x9.a("o", (int)25836, (long)(0x560299B1AEF398CEL ^ l)), (long)8920610552205537094L, (long)l)), "", 0.0, 0.0, 10.0, 2000.0);
        this.G = AuthenticationStateTracker.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)15744, (long)(0x5DBBD2E4472841ABL ^ l)), (long)8920610552205537094L, (long)l)), false);
        this.K = ColorPaletteManager.o(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)858, (long)(0x22716B0A45C17F7BL ^ l)), (long)8920610552205537094L, (long)l)), (String)((Object)x9.d("G", (int)x9.a("o", (int)6783, (long)(0x5C74E691217CE64EL ^ l)), (long)8920610552205537094L, (long)l)), ColorPaletteManager.U, Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)x9.d("G", (int)x9.a("o", (int)30880, (long)(0x4DD87A83D0EE8497L ^ l)), (long)8920610552205537094L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)x9.d("G", (int)x9.a("o", (int)31493, (long)(0x3FF961AA597E8721L ^ l)), (long)8920610552205537094L, (long)l)))));
        this.B = new NetworkConfigManager();
        this.w = false;
        this.O = false;
        this.V.l(this.L);
        this.V.E(this.L);
        this.Y.l(this.m, this.G);
        this.G.E(this.K);
        this.G.l(this.K);
        this.N(this.z, this.R, this.Y, this.m, this.G, this.K, this.t, this.h, this.r, this.V, this.L);
        ResourceOrchestrationManager resourceOrchestrationManager = new ResourceOrchestrationManager(CryptoAlgorithmSelector943.LEFT, this.t, this.V, this.L, this.z, this.h, this.r);
        this.u(resourceOrchestrationManager);
        this.t.Z(0);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field k(long l, long l2) {
        int n = x9.i(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = X[n];
            int n2 = string.indexOf(8);
            Class clazz = x9.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = x9.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x9.e(clazz3, string2, clazz2)) != null) {
                    x9.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = x9.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        x9.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x9.j(211221075485058L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void e() {
        Object[] objectArray = F;
        F[0] = "UCh";
        objectArray[1] = Integer.TYPE;
        x9.X[1] = "java/lang/Integer";
        objectArray[2] = "[J\u000eW8fPE\u001f\u0018E~CB\u0016Q";
        objectArray[3] = "$\u0017B\u001d !/\u0018SRA/$\u0013W\b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0015\n$jC0L\u000b2\u0000\u0018.|O;n\u0001n\u0015\ft?soF\u000b5{\u0001<\u0005Q%\u0000";
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7ED;
        if (x9.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x9.n[n2] = n3;
        }
        return x9.n[n2];
    }

    private static Method l(long l, long l2) {
        int n = x9.i(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = X[n];
                int n3 = string2.indexOf(8);
                clazz3 = x9.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = x9.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x9.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        x9.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x9.j(211221075485058L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = x9.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        x9.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x9.j(211221075485058L, 0L);
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

    @Override
    public boolean d() {
        boolean bl;
        block8: {
            block7: {
                AsynchronousEventCoordinator asynchronousEventCoordinator = TemporalMetadataResolver.h.U().K(AsynchronousEventCoordinator.class);
                try {
                    if (asynchronousEventCoordinator == null) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                try {
                    try {
                        if (!asynchronousEventCoordinator.Z() || !asynchronousEventCoordinator.e()) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw x9.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public String t() {
        long l = b ^ 0x2EF47CF43D1EL;
        return this.t.p() + (String)((Object)x9.d("G", (int)x9.a("o", (int)208, (long)(0x7C1C37E9BA41EBFCL ^ l)), (long)-1386240381963438007L, (long)l));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f4' || c == '\u00d8' || c == '\u00e0' || c == 'M') {
                field = x9.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x9.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (X[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 62;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 29;
                break;
            }
            case 3: {
                n3 = 52;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 17;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 18;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 56;
                break;
            }
            case 11: {
                n3 = 46;
                break;
            }
            case 12: {
                n3 = 2;
                break;
            }
            case 13: {
                n3 = 15;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 12;
                break;
            }
            case 18: {
                n3 = 6;
                break;
            }
            case 19: {
                n3 = 58;
                break;
            }
            case 20: {
                n3 = 4;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 54;
                break;
            }
            case 23: {
                n3 = 45;
                break;
            }
            case 24: {
                n3 = 25;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 39;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 1;
                break;
            }
            case 32: {
                n3 = 27;
                break;
            }
            case 33: {
                n3 = 9;
                break;
            }
            case 34: {
                n3 = 33;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 32;
                break;
            }
            case 38: {
                n3 = 22;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 30;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 41;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 51;
                break;
            }
            case 51: {
                n3 = 23;
                break;
            }
            case 52: {
                n3 = 37;
                break;
            }
            case 53: {
                n3 = 35;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 14;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 50;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 43;
                break;
            }
            case 60: {
                n3 = 11;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 31;
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
        x9.X[n4] = new String(cArray);
        return n4;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = x9.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = x9.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public boolean L() {
        return this.w;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = x9.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean V(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block17: {
            block20: {
                block19: {
                    block18: {
                        try {
                            if (!DynamicContextBroker.e()) {
                                this.B.m();
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw x9.a(customSystemException);
                        }
                        try {
                            try {
                                try {
                                    if (!this.Y.s().booleanValue() || !this.B.m((long)this.m.l())) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw x9.a(customSystemException);
                                }
                                if (!ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw x9.a(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw x9.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (!this.G.s().booleanValue() || this.K.H(systemConfigurationOrchestrator.K())) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw x9.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw x9.a(customSystemException);
                    }
                }
                NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ConfigurationCalibrator.b.m();
                try {
                    try {
                        if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.q().equals(ObjectValidator.Y())) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw x9.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
            }
            this.B.m();
        }
        return true;
    }

    @DataExchangeProtocol2090
    public void B(KB kB) {
        block15: {
            block14: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            this.w = this.c();
                                            if (!this.w || !ClusterNodeRegistry1151.W().S().D()) break block14;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw x9.a(customSystemException);
                                        }
                                        if (!GraphicalRenderingController.K.P) break block14;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw x9.a(customSystemException);
                                    }
                                    if (!ApplicationLifecycleManager.X().Y()) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw x9.a(customSystemException);
                                }
                                if (!this.A.M()) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw x9.a(customSystemException);
                            }
                            if (ApplicationLifecycleManager.N().G().X()) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw x9.a(customSystemException);
                        }
                        if (this.O) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw x9.a(customSystemException);
                    }
                    this.O = true;
                    this.A.W();
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
            }
            this.O = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                x9.b = MultiContainerRegistry.a(2747044624503849192L, 4174956877164582915L, MethodHandles.lookup().lookupClass()).a(108888153938982L);
                x9.F = new Object[5];
                x9.X = new String[5];
                x9.e();
                x9.v = new HashMap<K, V>(13);
                var0 = x9.b ^ 31916268256386L;
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
                var8_3 = new long[24];
                var5_4 = 0;
                var6_5 = "\u00d1\u00f8F-\u00cfD\u009f\u00b8\u00df\u00ce\u00f9\u00b1I\u0083\r\u00a1\u00ea\u00ac\f\u00b9Q\u00d4\u00883gi\u00c0jG\u0018\u00c336Z\u00d4-)]M\u00b1\u0014[\u007f\u00b4\u00e7\u0007\u001b\u00f5\u00da\u000bw\u00d4\u00eb\u0013l[\u00cc)a\u00b9\u00ee\u00cf2\u00b7\u00a1r=\u00d8\u0003\u00fe\u00ad\u0016\u00a1\u000e\u00a0\u00b7\u000e\u0015\u00ee`\\\u00ee\u0095\u0001?\u00d1\u00f2r#\u00d1\u00b0~\u008e\u00c4\u00da\u00ff\u0096\u00cdW\u00fb\f\u00f6;S\u00fb\u00b7C\u00d1\u00bb\u00f0\u00d9Pp\u0017W\u0085q\u009d\u00e8~\u00c7S:\u0083\u00d9\u0089k\u00b8\u00d4\u00fe\u00abc\u00a1\u008b\u00afp\u00adfa\u00b1\u00e33T.Bl\u00be\u00ae\u00c9\u00cd\u00c1\u0003u\u001c\u0088<\u00b4\u00d9BB\u0088F8t\u0012\u00a4\u00a0N\u00f52\u00e9h\u00ca\u00aaJ8";
                var7_6 = "\u00d1\u00f8F-\u00cfD\u009f\u00b8\u00df\u00ce\u00f9\u00b1I\u0083\r\u00a1\u00ea\u00ac\f\u00b9Q\u00d4\u00883gi\u00c0jG\u0018\u00c336Z\u00d4-)]M\u00b1\u0014[\u007f\u00b4\u00e7\u0007\u001b\u00f5\u00da\u000bw\u00d4\u00eb\u0013l[\u00cc)a\u00b9\u00ee\u00cf2\u00b7\u00a1r=\u00d8\u0003\u00fe\u00ad\u0016\u00a1\u000e\u00a0\u00b7\u000e\u0015\u00ee`\\\u00ee\u0095\u0001?\u00d1\u00f2r#\u00d1\u00b0~\u008e\u00c4\u00da\u00ff\u0096\u00cdW\u00fb\f\u00f6;S\u00fb\u00b7C\u00d1\u00bb\u00f0\u00d9Pp\u0017W\u0085q\u009d\u00e8~\u00c7S:\u0083\u00d9\u0089k\u00b8\u00d4\u00fe\u00abc\u00a1\u008b\u00afp\u00adfa\u00b1\u00e33T.Bl\u00be\u00ae\u00c9\u00cd\u00c1\u0003u\u001c\u0088<\u00b4\u00d9BB\u0088F8t\u0012\u00a4\u00a0N\u00f52\u00e9h\u00ca\u00aaJ8".length();
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
                    var6_5 = "\u001eO\u00c8|\u000e\u00b8\b\u00b1q}\u00a5\u001a\u00c11\u0001\u00c2";
                    var7_6 = "\u001eO\u00c8|\u000e\u00b8\b\u00b1q}\u00a5\u001a\u00c11\u0001\u00c2".length();
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
        x9.e = var8_3;
        x9.n = new Integer[24];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = x9.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = x9.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = x9.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean c() {
        block17: {
            block18: {
                try {
                    if (!GraphicalRenderingController.K.k()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                try {
                    if (!ClusterNodeRegistry1151.W().S().D()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                try {
                    if (ConfigurationRegistry.d.p()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                try {
                    try {
                        if (this.V(systemConfigurationOrchestrator)) break block17;
                        if (!DynamicContextBroker.e()) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw x9.a(customSystemException);
                    }
                    if (!ApplicationLifecycleManager.N().G().X()) {
                        // empty if block
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                this.T = true;
            }
            return true;
        }
        return false;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = x9.i(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                x9.F[n] = clazz = Class.forName(X[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public boolean n(ResourceOrchestrationManager resourceOrchestrationManager, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        int[] nArray;
        block9: {
            block8: {
                MetadataIndexingService metadataIndexingService;
                block7: {
                    long l = b ^ 0x5372C6F3D212L;
                    MetadataIndexingService metadataIndexingService2 = TemporalMetadataResolver.h.U().K(MetadataIndexingService.class);
                    nArray = GameVersionEnumerator.q();
                    try {
                        metadataIndexingService = metadataIndexingService2;
                        if (nArray != null) break block7;
                        if (metadataIndexingService == null) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw x9.a(customSystemException);
                    }
                    metadataIndexingService = metadataIndexingService2;
                }
                try {
                    bl = metadataIndexingService.L();
                    if (nArray != null) break block9;
                    if (!bl) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw x9.a(customSystemException);
                }
                bl = true;
                break block9;
            }
            bl = false;
        }
        try {
            if (nArray != null) {
                AbstractComputationKernel.I(new String[3]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw x9.a(customSystemException);
        }
        return bl;
    }

    @Override
    public boolean f() {
        return this.R.s();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

