/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.GC;
import a.Sc;
import a.Yw;
import a.bE;
import a.ff;
import a.hQ;
import a.hr;
import a.vM;
import a.yC;
import com.app.core.interfaces.OperationExecutionInterface;
import com.app.network.response.ResponseHandlingStrategy;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.compression.DataCompressionNegotiator;
import com.data.sync.DataSynchronizer;
import com.event.management.MultiTypeEventAggregator;
import com.exception.system.CustomSystemException;
import com.graphics.palette.ColorPaletteGenerator;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.styling.GraphicalStyleRenderer;
import com.math.precision.PrecisionMathOrchestrator;
import com.metadata.reflection.MetadataReflectionAgent;
import com.network.security.SecureTransmissionProtocol;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.ReplicableSecurityContext;
import com.security.crypto.CryptoPipelineManager;
import com.security.crypto.CryptographicInterface;
import com.security.cryptography.CryptographicContextManager153;
import com.security.operations.CryptographicOperationCoordinator;
import com.security.session.CryptographicSessionManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.utils.reflection.ReflectionUtilityResolver;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class ys
extends GraphicalRenderEngine1082 {
    private final Sc uR;
    private hr u5;
    private final Yw uX;
    private static final Integer[] eb;
    private static String[] uJ;
    private final GraphicalRenderEngine1082 u0;
    private static final long ab;
    private static final Object[] lb;
    private static final long[] bb;
    private static final Map fb;
    private final boolean uM;
    private static final String[] mb;
    @Nullable
    private yC up;

    private void lambda$render$4(CryptographicSessionManager cryptographicSessionManager) {
        SecureTransmissionProtocol.o(this.uX, cryptographicSessionManager, cryptographicSessionManager.r(), false);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ys" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$render$6(CryptographicSessionManager cryptographicSessionManager) {
        ResponseHandlingStrategy responseHandlingStrategy = cryptographicSessionManager.D(this.uX);
        this.uX.e(responseHandlingStrategy);
        this.V();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String[] t() {
        return uJ;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C79;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ys", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ys.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 59;
                break;
            }
            case 2: {
                n3 = 35;
                break;
            }
            case 3: {
                n3 = 36;
                break;
            }
            case 4: {
                n3 = 29;
                break;
            }
            case 5: {
                n3 = 42;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 7: {
                n3 = 55;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 25;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 7;
                break;
            }
            case 15: {
                n3 = 2;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 30;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 24;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 10;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 60;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 41;
                break;
            }
            case 26: {
                n3 = 6;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 48;
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
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 21;
                break;
            }
            case 37: {
                n3 = 28;
                break;
            }
            case 38: {
                n3 = 37;
                break;
            }
            case 39: {
                n3 = 13;
                break;
            }
            case 40: {
                n3 = 46;
                break;
            }
            case 41: {
                n3 = 49;
                break;
            }
            case 42: {
                n3 = 39;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 52;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 44;
                break;
            }
            case 47: {
                n3 = 51;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 11;
                break;
            }
            case 50: {
                n3 = 56;
                break;
            }
            case 51: {
                n3 = 20;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 4;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 15;
                break;
            }
            case 56: {
                n3 = 17;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 32;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 14;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 43;
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
        ys.mb[n4] = new String(cArray);
        return n4;
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

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "Tc'";
        objectArray[1] = Integer.TYPE;
        ys.mb[1] = "java/lang/Integer";
        objectArray[2] = ")4\"Q?k\";3\u001eBs1<:W";
        objectArray[3] = "v,H\f\u0018-}#YCy#v(]\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "LD\u0017G+]AE\u0014'&_#\u001bM\u0018&\u001cAZ\u001c]r$\u001aC\u001cC1NQ\u0012\u0019LM";
    }

    private static Field k(long l, long l2) {
        int n = ys.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = ys.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ys.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ys.e(clazz3, string2, clazz2)) != null) {
                    ys.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ys.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ys.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ys.j(265177337274314L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public hr Y() {
        return this.u5;
    }

    private void lambda$render$1() {
        this.uX.e(null);
        this.V();
    }

    public Yw v() {
        return this.uX;
    }

    private void lambda$render$2(CryptographicSessionManager cryptographicSessionManager) {
        SecureTransmissionProtocol.o(this.uX, cryptographicSessionManager, cryptographicSessionManager.r(), false);
    }

    private void lambda$render$3(CryptographicSessionManager cryptographicSessionManager, CryptographicSessionManager cryptographicSessionManager2) {
        block7: {
            try {
                try {
                    if (cryptographicSessionManager == null || !cryptographicSessionManager.equals(cryptographicSessionManager2)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ys.a(customSystemException);
                }
                SecureTransmissionProtocol.o(this.uX, cryptographicSessionManager2, cryptographicSessionManager2.r(), false);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ys.a(customSystemException);
            }
        }
        try {
            this.uX.e(cryptographicSessionManager2);
            if (this.uX.G() != null) {
                this.V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ys.a(customSystemException);
        }
    }

    private static Method l(long l, long l2) {
        int n = ys.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ys.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ys.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ys.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ys.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ys.j(265177337274314L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ys.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ys.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ys.j(265177337274314L, 0L);
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

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ys.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ys.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private GraphicalRenderEngine1082 R(double d2, String string) {
        Object object;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        long l;
        block13: {
            block9: {
                OperationExecutionInterface operationExecutionInterface;
                block12: {
                    block10: {
                        block11: {
                            l = ab ^ 0x48AD7C8A8FB6L;
                            graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2, 28.0);
                            try {
                                try {
                                    try {
                                        graphicalRenderEngine1082.d().f((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)6678, (long)(0x3D8B6592351BF258L ^ l)), (long)2610967041145522067L, (long)l)));
                                        graphicalRenderEngine1082.i(false);
                                        graphicalRenderEngine1082.n(new bE(0.0, 10.0), new Object[0]);
                                        if (!this.uM) break block9;
                                        if (this.up == null) break block10;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ys.a(customSystemException);
                                    }
                                    if (this.up.a().isEmpty()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ys.a(customSystemException);
                                }
                                operationExecutionInterface = this.up.a().get(0);
                                break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ys.a(customSystemException);
                            }
                        }
                        operationExecutionInterface = null;
                        break block12;
                    }
                    operationExecutionInterface = null;
                }
                object = operationExecutionInterface;
                try {
                    this.up = new yC((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)221, (long)(0x12F44C073E3AE882L ^ l)), (long)2610967041145522067L, (long)l)), 6.0, 6.0, 10.0, 10.0, ys.M.Z, ys.M.q, null);
                    if (object != null) {
                        this.up.N((OperationExecutionInterface)object);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ys.a(customSystemException);
                }
                this.up.u(true);
                this.up.w(true);
                graphicalRenderEngine1082.n(new bE(8.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)8358, (long)(0x2C8D564CAD5CC8F1L ^ l)), (long)2610967041145522067L, (long)l));
                graphicalRenderEngine1082.n(this.up, ys.d("\u00e2", (int)ys.c("y", (int)2066, (long)(0x3EF2B86809EAE042L ^ l)), (long)2610967041145522067L, (long)l));
                break block13;
            }
            graphicalRenderEngine1082.n(new bE(18.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)28629, (long)(0x2E660A0F1C13079FL ^ l)), (long)2610967041145522067L, (long)l));
        }
        object = new DataCompressionNegotiator(string, 0.9, ys.M.n);
        ((AbstractComputationKernel)object).T(graphicalRenderEngine1082.w() - 36.0);
        ((CryptographicContextManager153)object).q(true);
        ((AbstractComputationKernel)object).F(false);
        graphicalRenderEngine1082.n((AbstractComputationKernel)object, ys.d("\u00e2", (int)ys.c("y", (int)6293, (long)(0x9EC1D7E1DBEF0C0L ^ l)), (long)2610967041145522067L, (long)l));
        return graphicalRenderEngine1082;
    }

    private void lambda$render$8(ReflectionUtilityResolver reflectionUtilityResolver, GC gC) {
        reflectionUtilityResolver.W(gC);
        this.V();
    }

    public ys(Sc sc, Yw yw, boolean bl) {
        long l = ab ^ 0x7250CDAE7D99L;
        super(108.0, 182.0);
        this.uR = sc;
        this.uX = yw;
        this.uM = bl;
        this.d().f((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)4803, (long)(0x1F23FB6EBFC708BEL ^ l)), (long)-3021002424356719172L, (long)l)));
        this.Q(ys.M.J);
        double d2 = this.b();
        this.u0 = new GraphicalRenderEngine1082(this.w(), d2);
        this.u0.d().f((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)1948, (long)(0x407520AC73539DE5L ^ l)), (long)-3021002424356719172L, (long)l)));
        this.u0.i(false);
        this.V();
        this.n(this.u0, new Object[0]);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ys.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ys.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                ys.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ys.ab = MultiContainerRegistry.a(-3986706523737439563L, 3861108729302765568L, MethodHandles.lookup().lookupClass()).a(41180330429770L);
                ys.lb = new Object[5];
                ys.mb = new String[5];
                ys.x();
                ys.fb = new HashMap<K, V>(13);
                var0 = ys.ab ^ 56600555614583L;
                ys.f(new String[3]);
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
                var8_3 = new long[34];
                var5_4 = 0;
                var6_5 = "\u0000;EG\u00d3\u00d1=\u0007koZ\u00d9\u00af+.(\u00e1\u0084\u0095c#\u000f\u00af\u00bak\f\u00een\u00cd\u00ee[a<\u00c0\u00e4p\u007ft\u000bvi\u0002\u00ceE\u008c\u00b1\u0017W\u009a\u000e\u00c3!\u00bdz'\u00b8\u0018\u00b1E\u00d6kSJ|\u00e9\u009b\u00f6\u0090z\u00e6\u00fb\u0095+]\u00ca\u00d2\u00db\u00e32%9\u00a4\u00fe\u00bf\u0000\u000f\u0013X0az'\u00920\u0086\u001b\u0085\u0087i\u008el\u00d4\u0092\u00bc\u009cOj\u00e49\u00ece\u0015\u000eL_\u0089\u0093\u00b9\u008e\b\u0011A\u00fb\u0018U\u00d1>\u0081\u00aa\u0010#\u00f35\u000b\u00908u\u007f\u0003L\u00d7\u00e4\u00ae\u00c6\u00ef\u00e5<\u00b2\u00ee\u0090\u001c\u00a9\u00ef\u008c\u00f1L\u00a4\u00b2j\u0090\u009b\u0097\u0011\u00e5*,\u00c1\u00e8k\u00a9\u00af\u009e\u00e2\u00b8N\u0014\u00f0\u00ae\u0002}\u009b\u0000\u0014b\u0012%\u00b8\u00c7\u008f\\A\u00a4\u0086\f\u00a7g\u00c4fCd\u00c0\u00f2\u0002\rX\u00a1)\u009f7\u000fP\u00ec\u0091a~nK\u00bd\u00da?\u00f5\u000b\u00edk\u00ea\u001cB\u00a1\u0007\u00d9~\u00d0j\u0098o!q\r5\u00f8,\u00b73m\u00fc\u00ce\u00d9\u00ca\u0014\u00b8\u00c9\u00b0\r5!\u00df";
                var7_6 = "\u0000;EG\u00d3\u00d1=\u0007koZ\u00d9\u00af+.(\u00e1\u0084\u0095c#\u000f\u00af\u00bak\f\u00een\u00cd\u00ee[a<\u00c0\u00e4p\u007ft\u000bvi\u0002\u00ceE\u008c\u00b1\u0017W\u009a\u000e\u00c3!\u00bdz'\u00b8\u0018\u00b1E\u00d6kSJ|\u00e9\u009b\u00f6\u0090z\u00e6\u00fb\u0095+]\u00ca\u00d2\u00db\u00e32%9\u00a4\u00fe\u00bf\u0000\u000f\u0013X0az'\u00920\u0086\u001b\u0085\u0087i\u008el\u00d4\u0092\u00bc\u009cOj\u00e49\u00ece\u0015\u000eL_\u0089\u0093\u00b9\u008e\b\u0011A\u00fb\u0018U\u00d1>\u0081\u00aa\u0010#\u00f35\u000b\u00908u\u007f\u0003L\u00d7\u00e4\u00ae\u00c6\u00ef\u00e5<\u00b2\u00ee\u0090\u001c\u00a9\u00ef\u008c\u00f1L\u00a4\u00b2j\u0090\u009b\u0097\u0011\u00e5*,\u00c1\u00e8k\u00a9\u00af\u009e\u00e2\u00b8N\u0014\u00f0\u00ae\u0002}\u009b\u0000\u0014b\u0012%\u00b8\u00c7\u008f\\A\u00a4\u0086\f\u00a7g\u00c4fCd\u00c0\u00f2\u0002\rX\u00a1)\u009f7\u000fP\u00ec\u0091a~nK\u00bd\u00da?\u00f5\u000b\u00edk\u00ea\u001cB\u00a1\u0007\u00d9~\u00d0j\u0098o!q\r5\u00f8,\u00b73m\u00fc\u00ce\u00d9\u00ca\u0014\u00b8\u00c9\u00b0\r5!\u00df".length();
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
                    var6_5 = "]LNyf\u00a4\u00b1\u00b4\u0080\u00df\u008d\u00c8PL\u00e0d";
                    var7_6 = "]LNyf\u00a4\u00b1\u00b4\u0080\u00df\u008d\u00c8PL\u00e0d".length();
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
        ys.bb = var8_3;
        ys.eb = new Integer[34];
    }

    private void lambda$render$5() {
        this.uX.e(null);
        this.V();
    }

    public boolean q() {
        return this.uM;
    }

    private void lambda$render$7(CryptographicInterface cryptographicInterface) {
        this.uX.T(cryptographicInterface);
        this.V();
    }

    public Sc N() {
        return this.uR;
    }

    private void V() {
        double d2;
        hr hr2;
        Color color;
        double d3;
        Object object;
        hr hr3;
        hr hr4;
        OperationExecutionInterface operationExecutionInterface;
        Object object3;
        long l;
        block39: {
            block37: {
                block38: {
                    CallSite callSite;
                    Object object2;
                    ColorPaletteGenerator colorPaletteGenerator;
                    ColorPaletteGenerator colorPaletteGenerator2;
                    ArrayList<AbstractComputationKernel> arrayList;
                    hQ hQ2;
                    List<ResponseHandlingStrategy> list;
                    ArrayList<ResponseHandlingStrategy> arrayList2;
                    ArrayList<ResponseHandlingStrategy> arrayList3;
                    boolean bl;
                    CryptographicSessionManager cryptographicSessionManager;
                    block33: {
                        l = ab ^ 0x2B950DC77110L;
                        this.u0.f();
                        Object object5 = this.uX instanceof vM ? (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)28809, (long)(0x156227ECB982E668L ^ l)), (long)-2694727589742331595L, (long)l)) + (((vM)this.uX).T() + 1) : ys.d("\u00e2", (int)ys.c("y", (int)14842, (long)(0x2AA41211F3CD2F01L ^ l)), (long)-2694727589742331595L, (long)l);
                        this.u0.n(this.R(this.w(), (String)object5), new Object[0]);
                        this.u0.n(new bE(this.w(), 0.0), new Object[0]);
                        this.u0.n(new bE(9.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)5524, (long)(0x31729E87537A037AL ^ l)), (long)-2694727589742331595L, (long)l));
                        this.u0.n(new bE(0.0, 5.0), new Object[0]);
                        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(32.0, 32.0);
                        graphicalRenderEngine1082.J(ys.M.k);
                        graphicalRenderEngine1082.d(0.5f);
                        graphicalRenderEngine1082.k(4.0f);
                        AbstractComputationKernel abstractComputationKernel = new ff(this.uX);
                        abstractComputationKernel.T(32.0);
                        abstractComputationKernel.w(32.0);
                        graphicalRenderEngine1082.n(abstractComputationKernel, new Object[0]);
                        this.u0.n(new bE((this.w() - graphicalRenderEngine1082.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)3961, (long)(0x43819EC490EF99BAL ^ l)), (long)-2694727589742331595L, (long)l));
                        this.u0.n(graphicalRenderEngine1082, new Object[0]);
                        this.u0.n(new bE(0.0, 5.0), new Object[0]);
                        abstractComputationKernel = new DataCompressionNegotiator(this.A(this.uX), 1.0, Color.WHITE);
                        ((CryptographicContextManager153)abstractComputationKernel).q(true);
                        abstractComputationKernel.T(this.u0.w());
                        this.u0.n(abstractComputationKernel, new Object[0]);
                        DataCompressionNegotiator dataCompressionNegotiator = new DataCompressionNegotiator((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)19920, (long)(0x4F8570B3CBF0DB2DL ^ l)), (long)-2694727589742331595L, (long)l)) + this.uX.A().k(), 0.75, ys.M.w);
                        dataCompressionNegotiator.q(true);
                        dataCompressionNegotiator.T(this.u0.w());
                        dataCompressionNegotiator.h(0);
                        this.u0.n(dataCompressionNegotiator, new Object[0]);
                        this.u0.n(new bE(0.0, 5.0), new Object[0]);
                        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)1392, (long)(0x193ACD4377B2139DL ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.c);
                        cryptographicContextManager153.q(true);
                        cryptographicContextManager153.h(5);
                        this.u0.n(new PrecisionMathOrchestrator(6.0, 0.0, cryptographicContextManager153), new Object[0]);
                        cryptographicSessionManager = this.uX.G();
                        bl = false;
                        try {
                            if (cryptographicSessionManager != null && !(cryptographicSessionManager instanceof ResponseHandlingStrategy)) break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ys.a(customSystemException);
                        }
                        bl = true;
                    }
                    try {
                        ArrayList<ResponseHandlingStrategy> arrayList4;
                        arrayList3 = arrayList4;
                        arrayList2 = arrayList4;
                        list = this.uX instanceof vM ? TemporalMetadataResolver.h.w().m().x() : TemporalMetadataResolver.h.w().u().x();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ys.a(customSystemException);
                    }
                    arrayList3(list);
                    ArrayList<ResponseHandlingStrategy> arrayList5 = arrayList2;
                    try {
                        if (cryptographicSessionManager != null) {
                            arrayList5.remove(cryptographicSessionManager);
                            arrayList5.add(0, (ResponseHandlingStrategy)cryptographicSessionManager);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ys.a(customSystemException);
                    }
                    ArrayList<AbstractComputationKernel> arrayList6 = new ArrayList<AbstractComputationKernel>();
                    if (bl) {
                        block34: {
                            boolean bl2;
                            MultiTypeEventAggregator multiTypeEventAggregator;
                            CryptoPipelineManager cryptoPipelineManager;
                            CryptoPipelineManager cryptoPipelineManager2;
                            block36: {
                                block35: {
                                    hQ2 = new GraphicalStyleRenderer((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)18178, (long)(0x5C54B4FAD02CD1E7L ^ l)), (long)-2694727589742331595L, (long)l)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)22343, (long)(0x7E2E54390DC6C1A5L ^ l)), (long)-2694727589742331595L, (long)l)), 0.75, ys.M.Y, null);
                                    try {
                                        try {
                                            CryptoPipelineManager cryptoPipelineManager3;
                                            ((GraphicalStyleRenderer)hQ2).H(false);
                                            hQ2.Z(8.0);
                                            hQ2.C(this::lambda$render$0);
                                            arrayList6.add(hQ2);
                                            if (arrayList5.isEmpty()) break block34;
                                            arrayList6.add(new CryptographicContextManager153((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)20145, (long)(0x52ED7C70CD755844L ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.H, true));
                                            cryptoPipelineManager2 = cryptoPipelineManager3;
                                            cryptoPipelineManager = cryptoPipelineManager3;
                                            multiTypeEventAggregator = MetadataReflectionAgent.D;
                                            if (cryptographicSessionManager != null) break block35;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ys.a(customSystemException);
                                        }
                                        bl2 = true;
                                        break block36;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ys.a(customSystemException);
                                    }
                                }
                                bl2 = false;
                            }
                            cryptoPipelineManager2(multiTypeEventAggregator, bl2);
                            object3 = cryptoPipelineManager;
                            ((hQ)object3).C(this::lambda$render$1);
                            arrayList6.add((AbstractComputationKernel)object3);
                        }
                        for (CryptographicSessionManager object22 : arrayList5) {
                            arrayList = new CryptoPipelineManager(object22, object22.equals(cryptographicSessionManager));
                            ((CryptoPipelineManager)((Object)arrayList)).s().C(() -> this.lambda$render$2(object22));
                            ((hQ)((Object)arrayList)).C(() -> this.lambda$render$3(cryptographicSessionManager, object22));
                            arrayList6.add((AbstractComputationKernel)((Object)arrayList));
                        }
                    } else {
                        hQ2 = new GraphicalStyleRenderer((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)26194, (long)(0x1EBDA0978990F0AEL ^ l)), (long)-2694727589742331595L, (long)l)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)14881, (long)(0x2C0AA2D614F82CD6L ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.Y, null);
                        ((GraphicalStyleRenderer)hQ2).H(false);
                        hQ2.C(() -> this.lambda$render$4(cryptographicSessionManager));
                        object3 = new GraphicalStyleRenderer((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)3918, (long)(0x3EFD621AC73319A9L ^ l)), (long)-2694727589742331595L, (long)l)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)26888, (long)(0x29BB41D519D27FFAL ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.Y, null);
                        ((GraphicalStyleRenderer)object3).H(false);
                        ((hQ)object3).C(this::lambda$render$5);
                        GraphicalStyleRenderer graphicalStyleRenderer = new GraphicalStyleRenderer((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)14386, (long)(0x3719877F146D2EDDL ^ l)), (long)-2694727589742331595L, (long)l)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)32435, (long)(0x68050B6F4901685AL ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.Y, null);
                        graphicalStyleRenderer.H(false);
                        graphicalStyleRenderer.C(() -> this.lambda$render$6(cryptographicSessionManager));
                        arrayList6.add(hQ2);
                        arrayList6.add((AbstractComputationKernel)object3);
                        arrayList6.add(graphicalStyleRenderer);
                    }
                    try {
                        ColorPaletteGenerator colorPaletteGenerator3;
                        colorPaletteGenerator2 = colorPaletteGenerator3;
                        colorPaletteGenerator = colorPaletteGenerator3;
                        object2 = cryptographicSessionManager != null ? cryptographicSessionManager.O() : ys.d("\u00e2", (int)ys.c("y", (int)2604, (long)(0x62EAA2AD98461CC6L ^ l)), (long)-2694727589742331595L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ys.a(customSystemException);
                    }
                    colorPaletteGenerator2((String)object2, arrayList6, ys.M.z, ys.M.z, null, 0.0f, 0.0f);
                    hQ2 = colorPaletteGenerator;
                    hQ2.T(88.0);
                    hQ2.w(14.0);
                    ((ColorPaletteGenerator)hQ2).V(false);
                    ((ColorPaletteGenerator)hQ2).a(false);
                    ((ColorPaletteGenerator)hQ2).r(false);
                    ((ColorPaletteGenerator)hQ2).B(null);
                    this.u0.n(new bE((this.w() - hQ2.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)30035, (long)(0x6F933D2016F6E3B5L ^ l)), (long)-2694727589742331595L, (long)l));
                    this.u0.n(hQ2, ys.d("\u00e2", (int)ys.c("y", (int)25986, (long)(0x38618BA4F7B1F361L ^ l)), (long)-2694727589742331595L, (long)l));
                    this.u0.n(new bE(0.0, 18.0), new Object[0]);
                    if (this.uX instanceof vM) {
                        object3 = this.uX.r();
                        List<CryptographicInterface> list2 = CryptographicOperationCoordinator.z(this.uX.A());
                        arrayList = new ArrayList();
                        for (CryptographicInterface cryptographicInterface : list2) {
                            hr hr5 = new hr(cryptographicInterface.O(), 0.75, ys.M.E, ys.M.N, 0.0, 0.0);
                            hr5.g(cryptographicInterface.t());
                            hr5.q(false);
                            hr5.A(ys.M.c);
                            hr5.u(0.0f);
                            arrayList.add(hr5);
                            hr5.N(() -> this.lambda$render$7(cryptographicInterface));
                        }
                        ColorPaletteGenerator colorPaletteGenerator4 = new ColorPaletteGenerator(object3.O(), arrayList, ys.M.z, ys.M.z, null, 0.0f, 0.0f);
                        colorPaletteGenerator4.T(88.0);
                        colorPaletteGenerator4.w(14.0);
                        colorPaletteGenerator4.V(false);
                        colorPaletteGenerator4.a(false);
                        colorPaletteGenerator4.r(false);
                        colorPaletteGenerator4.B(null);
                        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)24873, (long)(0x5495ECAD141DF7C9L ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.c);
                        cryptographicContextManager153.q(true);
                        cryptographicContextManager153.h(5);
                        this.u0.n(new PrecisionMathOrchestrator(6.0, 0.0, cryptographicContextManager153), new Object[0]);
                        this.u0.n(new bE((this.w() - colorPaletteGenerator4.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)23181, (long)(0x15503F5654374C73L ^ l)), (long)-2694727589742331595L, (long)l));
                        this.u0.n(colorPaletteGenerator4, new Object[0]);
                    } else if (this.uX instanceof ReflectionUtilityResolver) {
                        object3 = (ReflectionUtilityResolver)this.uX;
                        GC gC = ((ReflectionUtilityResolver)object3).z();
                        arrayList = new ArrayList<AbstractComputationKernel>();
                        for (GC gC2 : GC.VALUES) {
                            hr hr6 = new hr(gC2.O(), 0.75, ys.M.E, ys.M.N, 0.0, 0.0);
                            hr6.g(gC2.e());
                            hr6.q(false);
                            hr6.A(ys.M.c);
                            hr6.u(0.0f);
                            arrayList.add(hr6);
                            hr6.N(() -> this.lambda$render$8((ReflectionUtilityResolver)object3, gC2));
                        }
                        ColorPaletteGenerator colorPaletteGenerator5 = new ColorPaletteGenerator(gC.O(), arrayList, ys.M.z, ys.M.z, null, 0.0f, 0.0f);
                        colorPaletteGenerator5.T(88.0);
                        colorPaletteGenerator5.w(14.0);
                        colorPaletteGenerator5.V(false);
                        colorPaletteGenerator5.a(false);
                        colorPaletteGenerator5.r(false);
                        colorPaletteGenerator5.B(null);
                        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)14217, (long)(0x3B4E19B6A2D5A176L ^ l)), (long)-2694727589742331595L, (long)l)), 0.7, ys.M.c);
                        cryptographicContextManager153.q(true);
                        cryptographicContextManager153.h(5);
                        this.u0.n(new PrecisionMathOrchestrator(6.0, 0.0, cryptographicContextManager153), new Object[0]);
                        this.u0.n(new bE((this.w() - colorPaletteGenerator5.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)27037, (long)(0x6B81002C49867F76L ^ l)), (long)-2694727589742331595L, (long)l));
                        this.u0.n(colorPaletteGenerator5, new Object[0]);
                    } else {
                        this.u0.n(new bE(0.0, 25.0), new Object[0]);
                    }
                    try {
                        this.u0.n(new bE(0.0, 8.0), new Object[0]);
                        callSite = this.uM ? ys.d("\u00e2", (int)ys.c("y", (int)22523, (long)(0x79B5E7815B954139L ^ l)), (long)-2694727589742331595L, (long)l) : ys.d("\u00e2", (int)ys.c("y", (int)19373, (long)(0x75E4F1507E5CDD49L ^ l)), (long)-2694727589742331595L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ys.a(customSystemException);
                    }
                    object3 = callSite;
                    try {
                        try {
                            if (this.u5 == null) break block37;
                            if (this.u5.a().isEmpty()) break block38;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ys.a(customSystemException);
                        }
                        operationExecutionInterface = this.u5.a().get(0);
                        break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ys.a(customSystemException);
                    }
                }
                operationExecutionInterface = null;
                break block39;
            }
            operationExecutionInterface = null;
        }
        OperationExecutionInterface operationExecutionInterface2 = operationExecutionInterface;
        try {
            hr hr7;
            ys ys2 = this;
            hr4 = hr7;
            hr3 = hr7;
            object = object3;
            d3 = 0.7;
            color = this.uM ? ys.M.Y : ys.M.O;
        }
        catch (CustomSystemException customSystemException) {
            throw ys.a(customSystemException);
        }
        hr4((String)object, d3, color, this.uM ? ys.M.u : ys.M.b);
        ys2.u5 = hr3;
        if (operationExecutionInterface2 != null) {
            this.u5.N(operationExecutionInterface2);
        }
        try {
            hr2 = this.u5;
            d2 = this.uM ? 56.0 : 68.0;
        }
        catch (CustomSystemException customSystemException) {
            throw ys.a(customSystemException);
        }
        hr2.T(d2);
        this.u5.w(16.0);
        this.u5.A(Color.WHITE);
        this.u5.q(false);
        this.u0.n(new bE((this.w() - this.u5.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)5433, (long)(0x1B4165CAFA1683C1L ^ l)), (long)-2694727589742331595L, (long)l));
        this.u0.n(this.u5, new Object[0]);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ys.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ys.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void f(String[] stringArray) {
        uJ = stringArray;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ys" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public yC D() {
        return this.up;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ys.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void lambda$render$0() {
        boolean bl;
        CryptographicSessionManager cryptographicSessionManager;
        CryptographicSessionManager cryptographicSessionManager2;
        try {
            CryptographicSessionManager cryptographicSessionManager3;
            cryptographicSessionManager2 = cryptographicSessionManager3;
            cryptographicSessionManager = cryptographicSessionManager3;
            bl = !(this.uX instanceof vM);
        }
        catch (CustomSystemException customSystemException) {
            throw ys.a(customSystemException);
        }
        cryptographicSessionManager2(bl);
        CryptographicSessionManager cryptographicSessionManager4 = cryptographicSessionManager;
        cryptographicSessionManager4.B(ReplicableSecurityContext.Y().C(new DataSynchronizer()).X());
        SecureTransmissionProtocol.o(this.uX, cryptographicSessionManager4, cryptographicSessionManager4, true);
    }

    private String A(Yw yw) {
        PluginLifecycleContract pluginLifecycleContract;
        long l;
        block7: {
            l = ab ^ 0x4A6B9A1B38B1L;
            LightweightExecutionContext lightweightExecutionContext = yw.A().W();
            pluginLifecycleContract = yw.A().i();
            try {
                try {
                    if (lightweightExecutionContext == null || lightweightExecutionContext.Y()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ys.a(customSystemException);
                }
                return lightweightExecutionContext.g();
            }
            catch (CustomSystemException customSystemException) {
                throw ys.a(customSystemException);
            }
        }
        try {
            if (pluginLifecycleContract != null) {
                return pluginLifecycleContract.O();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ys.a(customSystemException);
        }
        return ys.d("\u00e2", (int)ys.c("y", (int)21318, (long)(0x50192151A2F20C1DL ^ l)), (long)-7837663621136322412L, (long)l);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'S' || c == 'q' || c == 'm' || c == '\u00e7') {
                field = ys.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ys.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ys.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ys.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

