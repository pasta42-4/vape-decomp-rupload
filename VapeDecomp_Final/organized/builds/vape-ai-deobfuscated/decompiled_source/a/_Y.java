/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.N;
import a.Qh;
import a.kg;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.identity.IdentityComparator;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionUtility;
import com.event.management.ContextualEventDispatcher;
import com.event.management.EventDispatchCoordinator1090;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionEstablisher;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolEncoder458;
import com.network.protocol.ProtocolInteractionController;
import com.network.security.ProtocolValidator;
import com.network.transmission.DataTransmissionManager2384;
import com.protocol.encoding.EncodingProtocolHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthorizationManager;
import com.security.context.SecurityContextManager2112;
import com.security.crypto.CryptoParameterGenerator;
import com.security.transform.CryptographicTransformer;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.ExecutionStateTracker;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocator1647;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.processing.PatternMatchingOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
import com.transaction.processing.TransactionSequenceManager;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _Y {
    private static final long a;
    private static final long[] b;
    private static final boolean C;
    private static final String[] f;
    private static final Object[] e;
    private static final Map d;
    private static final Integer[] c;

    public static float w(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        float f = _Y.H(transactionOrchestrator1017);
        float f2 = _Y.H(transactionOrchestrator10172);
        return f - f2;
    }

    public static float i(TransactionOrchestrator1017 transactionOrchestrator1017, float f, ResourceAllocator1647 resourceAllocator1647) {
        if (transactionOrchestrator1017.e(ObjectPipelineManager.N)) {
            int n = (transactionOrchestrator1017.W(ObjectPipelineManager.N).y() + 1) * 5;
            int n2 = 25 - n;
            float f2 = f * (float)n2;
            f = f2 / 25.0f;
        }
        try {
            if (f <= 0.0f) {
                return 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
            Qh qh = new Qh(transactionOrchestrator1017);
            ArrayList<LightweightExecutionContext> arrayList = new ArrayList<LightweightExecutionContext>();
            for (Object object : qh.l().G()) {
                arrayList.add(new LightweightExecutionContext(object));
            }
            int n = _Y.L(arrayList.toArray(new LightweightExecutionContext[0]), resourceAllocator1647);
            if (n > 20) {
                n = 20;
            }
            if (n > 0) {
                int n3 = 25 - n;
                float f3 = f * (float)n3;
                f = f3 / 25.0f;
            }
        }
        return f;
    }

    public static void d() {
    }

    public static boolean H(CryptographicTransformer cryptographicTransformer) {
        block6: {
            boolean bl;
            block8: {
                block7: {
                    try {
                        try {
                            try {
                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) break block6;
                                if (_Y.k(cryptographicTransformer)) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                            if (cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public static double z(double d2, double d3, double d4, double d5) {
        double d6 = d2 - d4;
        double d7 = d3 - d5;
        return Math.sqrt(d6 * d6 + d7 * d7);
    }

    public static boolean D(double d2, double d3, double d4, double d5, double d6) {
        boolean bl;
        double d7;
        block13: {
            double d8;
            double d9;
            block12: {
                block11: {
                    block10: {
                        d7 = 0.0;
                        d9 = d5 - d2;
                        d8 = d6 - d3;
                        try {
                            if (!(d8 > 0.0) || !(d9 > 0.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        d7 = Math.toDegrees(-Math.atan(d9 / d8));
                        break block13;
                    }
                    try {
                        if (!(d8 > 0.0) || !(d9 < 0.0)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    d7 = Math.toDegrees(-Math.atan(d9 / d8));
                    break block13;
                }
                try {
                    if (!(d8 < 0.0) || !(d9 > 0.0)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                d7 = -90.0 + Math.toDegrees(Math.atan(d8 / d9));
                break block13;
            }
            try {
                if (!(d8 < 0.0) || !(d9 < 0.0)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            d7 = 90.0 + Math.toDegrees(Math.atan(d8 / d9));
        }
        int n = (int)AdaptiveComputationEngine.a((d7 - d4) % 360.0);
        try {
            bl = n < 0;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return bl;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00c8' || c == '\u00d1' || c == '\u00cf') {
                field = _Y.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _Y.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int R(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        double d2 = cryptographicTransformer2.F() - cryptographicTransformer.F();
        double d3 = cryptographicTransformer2.V() - cryptographicTransformer.V() + (double)(cryptographicTransformer2.L() / 2.0f) + 0.2;
        if (GeometryCalculator.C() > 13) {
            d3 = cryptographicTransformer2.V() - 0.3 - cryptographicTransformer.V();
        }
        double d4 = cryptographicTransformer2.B() - cryptographicTransformer.B();
        double d5 = AdaptiveComputationEngine.C(d2 * d2 + d4 * d4);
        float f = (float)(-(Math.atan2(d3, d5) * 180.0 / Math.PI));
        float f2 = (float)AdaptiveComputationEngine.a(cryptographicTransformer.S() - f);
        return (int)f2;
    }

    public static float U(Qh qh, ResourceAllocator1647 resourceAllocator1647, float f, boolean bl, boolean bl2) {
        float f2 = f;
        f2 = _Y.Q((TransactionOrchestrator1017)qh, f2);
        f2 = _Y.i(qh, f2, resourceAllocator1647);
        if (bl2) {
            f2 = Math.max(f2 - qh.H(), 0.0f);
        }
        return f2;
    }

    public static double V(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        return AdaptiveComputationEngine.C(d8 * d8 + d9 * d9 + d10 * d10);
    }

    public static float a(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        float f = Math.max(_Y.v(transactionOrchestrator1017, transactionOrchestrator10172), 1.0f);
        float f2 = Math.max(_Y.v(transactionOrchestrator10172, transactionOrchestrator1017), 1.0f);
        return f - f2;
    }

    public static boolean m(CryptographicTransformer cryptographicTransformer) {
        if (cryptographicTransformer instanceof TransactionOrchestrator1017) {
            boolean bl;
            block6: {
                block5: {
                    TransactionOrchestrator1017 transactionOrchestrator1017 = (TransactionOrchestrator1017)cryptographicTransformer;
                    try {
                        try {
                            if (!cryptographicTransformer.O() && !(transactionOrchestrator1017.e() <= 0.0f)) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return cryptographicTransformer.O();
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0002su";
        objectArray[1] = Integer.TYPE;
        _Y.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0016PGn2T\u001d_V!OL\u000eX_h";
        objectArray[3] = "AA0\u001eU/JN!Q4!AE%\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001e$m}f\u0006\u001d/k\u001fw\u0002saszqAJf.m\u001c@\u0012c~m-IMm(\u001f";
    }

    public static float a(DataTransmissionManager2384 dataTransmissionManager2384, SecurityContextManager2112 securityContextManager2112) {
        LightweightExecutionContext lightweightExecutionContext;
        if (securityContextManager2112 != null && (lightweightExecutionContext = dataTransmissionManager2384.G(securityContextManager2112)).r()) {
            float f = dataTransmissionManager2384.b(securityContextManager2112);
            int n = lightweightExecutionContext.C().o(lightweightExecutionContext, dataTransmissionManager2384);
            if (f > 0.0f) {
                float f2 = (float)n - f;
                return f2;
            }
        }
        return 0.0f;
    }

    public static DataTransmissionManager2384 p(CryptographicTransformer cryptographicTransformer, double d2, double d3, boolean bl) {
        for (Object e : ApplicationLifecycleManager.c().M()) {
            if (!ReflectionMetadataResolver.Pr.isInstance(e)) continue;
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
            try {
                if (dataTransmissionManager2384.equals(cryptographicTransformer)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                try {
                    if (bl && TemporalMetadataResolver.h.j().h(dataTransmissionManager2384)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if ((double)dataTransmissionManager2384.y(cryptographicTransformer) >= d2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (!((double)_Y.g(cryptographicTransformer, dataTransmissionManager2384) < d3)) continue;
                return dataTransmissionManager2384;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return null;
    }

    public static boolean N(CryptographicTransformer cryptographicTransformer, double d2, double d3) {
        return _Y.D(cryptographicTransformer.F(), cryptographicTransformer.B(), cryptographicTransformer.q(), d2, d3);
    }

    public static float C(double d2, double d3, double d4, double d5) {
        float f;
        block5: {
            double d6;
            double d7;
            block4: {
                d7 = d4 - d2;
                d6 = d5 - d3;
                f = (float)Math.toDegrees(-Math.atan(d7 / d6));
                try {
                    if (!(d6 < 0.0) || !(d7 < 0.0)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                f = (float)(90.0 + Math.toDegrees(Math.atan(d6 / d7)));
                break block5;
            }
            try {
                if (!(d6 < 0.0) || !(d7 > 0.0)) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            f = (float)(-90.0 + Math.toDegrees(Math.atan(d6 / d7)));
        }
        return f;
    }

    public static boolean h(DataTransmissionManager2384 dataTransmissionManager2384) {
        SecurityContextManager2112 securityContextManager2112 = _Y.O(dataTransmissionManager2384);
        if (securityContextManager2112 != null) {
            float f = _Y.a(dataTransmissionManager2384, securityContextManager2112);
            try {
                if (f > 0.0f) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return false;
    }

    public static TransactionOrchestrator1017 u(double d2, double d3) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        for (Object e : ApplicationLifecycleManager.c().L()) {
            if (!ReflectionMetadataResolver.Ut.isInstance(e)) continue;
            TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(e);
            try {
                if (!transactionOrchestrator1017.B(ReflectionMetadataResolver.Pr)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            if (transactionOrchestrator1017.O()) continue;
            try {
                if (transactionOrchestrator1017.e() <= 0.0f) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if ((double)transactionOrchestrator1017.y(systemConfigurationOrchestrator) >= d2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (!TemporalMetadataResolver.h.a().G(transactionOrchestrator1017, false)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (!((double)_Y.t(transactionOrchestrator1017) < d3)) continue;
                return transactionOrchestrator1017;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BC8;
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
                throw new RuntimeException("a/_Y", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _Y.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _Y.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _Y.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static boolean X(CryptographicTransformer cryptographicTransformer, double d2, double d3, boolean bl) {
        for (Object e : ApplicationLifecycleManager.c().M()) {
            if (!ReflectionMetadataResolver.Pr.isInstance(e)) continue;
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
            try {
                if (!_Y.a(cryptographicTransformer, dataTransmissionManager2384, d2, d3, bl)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return false;
    }

    public static boolean I(CryptographicTransformer cryptographicTransformer, double d2, double d3, boolean bl) {
        for (Object e : ApplicationLifecycleManager.c().M()) {
            if (!ReflectionMetadataResolver.Pr.isInstance(e)) continue;
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
            try {
                if (dataTransmissionManager2384.equals(cryptographicTransformer)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            if (dataTransmissionManager2384.O()) continue;
            try {
                if (dataTransmissionManager2384.e() <= 0.0f) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                try {
                    if (bl && TemporalMetadataResolver.h.j().h(dataTransmissionManager2384)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if ((double)dataTransmissionManager2384.y(cryptographicTransformer) >= d2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (!((double)_Y.g(cryptographicTransformer, dataTransmissionManager2384) < d3)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return false;
    }

    public static int t(CryptographicTransformer cryptographicTransformer) {
        int n;
        double d2;
        block13: {
            double d3;
            double d4;
            block12: {
                block11: {
                    block10: {
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        d2 = 0.0;
                        d4 = cryptographicTransformer.F() - systemConfigurationOrchestrator.F();
                        d3 = cryptographicTransformer.B() - systemConfigurationOrchestrator.B();
                        try {
                            if (!(d3 > 0.0) || !(d4 > 0.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        d2 = Math.toDegrees(-Math.atan(d4 / d3));
                        break block13;
                    }
                    try {
                        if (!(d3 > 0.0) || !(d4 < 0.0)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    d2 = Math.toDegrees(-Math.atan(d4 / d3));
                    break block13;
                }
                try {
                    if (!(d3 < 0.0) || !(d4 > 0.0)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                d2 = -90.0 + Math.toDegrees(Math.atan(d3 / d4));
                break block13;
            }
            try {
                if (!(d3 < 0.0) || !(d4 < 0.0)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            d2 = 90.0 + Math.toDegrees(Math.atan(d3 / d4));
        }
        float f = ConfigurationCalibrator.b.Y();
        int n2 = (int)(Math.abs(d2 - (double)f) % 360.0);
        try {
            n = n2 > 180 ? 360 - n2 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return n;
    }

    public static TransactionOrchestrator1017 w(double d2, float f) {
        block4: {
            try {
                try {
                    if (((ObjectLifecycleTracker)ApplicationLifecycleManager.g()).M() == null || ApplicationLifecycleManager.c().M() == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                return _Y.i(d2, f, (TransactionOrchestrator1017)ApplicationLifecycleManager.g(), (TransactionOrchestrator1017)ApplicationLifecycleManager.g());
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return null;
    }

    public static boolean X(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172, double d2) {
        return _Y.f(transactionOrchestrator1017, transactionOrchestrator10172, 6.0, d2, 360.0);
    }

    public static int g(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        int n;
        double d2;
        block13: {
            double d3;
            double d4;
            block12: {
                block11: {
                    block10: {
                        d2 = 0.0;
                        d4 = cryptographicTransformer2.F() - cryptographicTransformer.F();
                        d3 = cryptographicTransformer2.B() - cryptographicTransformer.B();
                        try {
                            if (!(d3 > 0.0) || !(d4 > 0.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        d2 = Math.toDegrees(-Math.atan(d4 / d3));
                        break block13;
                    }
                    try {
                        if (!(d3 > 0.0) || !(d4 < 0.0)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    d2 = Math.toDegrees(-Math.atan(d4 / d3));
                    break block13;
                }
                try {
                    if (!(d3 < 0.0) || !(d4 > 0.0)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                d2 = -90.0 + Math.toDegrees(Math.atan(d3 / d4));
                break block13;
            }
            try {
                if (!(d3 < 0.0) || !(d4 < 0.0)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            d2 = 90.0 + Math.toDegrees(Math.atan(d3 / d4));
        }
        int n2 = (int)(Math.abs(d2 - (double)cryptographicTransformer.q()) % 360.0);
        try {
            n = n2 > 180 ? 360 - n2 : n2;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return n;
    }

    public static kg t(TransactionOrchestrator1017 transactionOrchestrator1017, oQ oQ2, double d2, double d3, double d4) {
        double d5 = oQ2.F() + d2;
        double d6 = oQ2.c() + d3;
        double d7 = oQ2.v() + d4;
        double d8 = oQ2.f() + d2;
        double d9 = oQ2.P() + d3;
        double d10 = oQ2.R() + d4;
        double d11 = transactionOrchestrator1017.F();
        double d12 = transactionOrchestrator1017.I(0.0f).F();
        double d13 = transactionOrchestrator1017.B();
        double d14 = _Y.y(d11, d5, d8);
        double d15 = _Y.y(d12, d6, d9);
        double d16 = _Y.y(d13, d7, d10);
        if (d14 == d11) {
            d14 = d11 + 0.01;
        }
        if (d16 == d13) {
            d16 = d13 + 0.01;
        }
        return new kg(d14, d15, d16);
    }

    public static float Q(TransactionOrchestrator1017 transactionOrchestrator1017) {
        try {
            if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
                return N.J.l(new Qh(transactionOrchestrator1017));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return transactionOrchestrator1017.e();
    }

    public static int z(CryptographicTransformer cryptographicTransformer) {
        block15: {
            double d2;
            block13: {
                double d3;
                block14: {
                    d3 = cryptographicTransformer.G();
                    d2 = cryptographicTransformer.o();
                    try {
                        try {
                            if (!(d3 > d2)) break block13;
                            if (!(d3 > 0.0)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        return 2;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
                try {
                    if (d3 < 0.0) {
                        return 4;
                    }
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            try {
                if (d2 > 0.0) {
                    return 3;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (d2 < 0.0) {
                    return 1;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return 0;
    }

    public static IdentityComparator K(oQ oQ2) {
        int n = AdaptiveComputationEngine.Q(oQ2.F());
        int n2 = AdaptiveComputationEngine.Q(oQ2.f() + 1.0);
        int n3 = AdaptiveComputationEngine.Q(oQ2.c());
        int n4 = AdaptiveComputationEngine.Q(oQ2.P() + 1.0);
        int n5 = AdaptiveComputationEngine.Q(oQ2.v());
        int n6 = AdaptiveComputationEngine.Q(oQ2.R() + 1.0);
        for (int i = n4; i > n3; --i) {
            for (int j = n; j < n2; ++j) {
                for (int k = n5; k < n6; ++k) {
                    TransactionCorrelationEngine transactionCorrelationEngine = ApplicationLifecycleManager.c().N(j, i, k);
                    try {
                        if (!PatternMatchingOrchestrator.E(transactionCorrelationEngine)) continue;
                        return new IdentityComparator(j, i, k, 0);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
            }
        }
        return null;
    }

    public static boolean L(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        boolean bl;
        double d5 = d2 - cryptographicTransformer.F();
        double d6 = d3 - cryptographicTransformer.V();
        if (GeometryCalculator.C() > 13) {
            d6 = d3 - 0.3 - cryptographicTransformer.V();
        }
        double d7 = d4 - cryptographicTransformer.B();
        double d8 = AdaptiveComputationEngine.C(d5 * d5 + d7 * d7);
        float f = (float)(-(Math.atan2(d6, d8) * 180.0 / Math.PI));
        float f2 = (float)AdaptiveComputationEngine.a(cryptographicTransformer.S() - f);
        try {
            bl = (int)f2 < 0;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return bl;
    }

    public static float B(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        float f = _Y.G(transactionOrchestrator1017);
        float f2 = _Y.G(transactionOrchestrator10172);
        return f - f2;
    }

    public static boolean T(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        boolean bl;
        double d2 = cryptographicTransformer2.F() - cryptographicTransformer.F();
        double d3 = cryptographicTransformer2.V() - cryptographicTransformer.V() + (double)(cryptographicTransformer2.L() / 2.0f) + 0.2;
        if (GeometryCalculator.C() > 13) {
            d3 = cryptographicTransformer2.V() - 0.3 - cryptographicTransformer.V();
        }
        double d4 = cryptographicTransformer2.B() - cryptographicTransformer.B();
        double d5 = AdaptiveComputationEngine.C(d2 * d2 + d4 * d4);
        float f = (float)(-(Math.atan2(d3, d5) * 180.0 / Math.PI));
        float f2 = (float)AdaptiveComputationEngine.a(cryptographicTransformer.S() - f);
        try {
            bl = f2 < 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return bl;
    }

    public static boolean f(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172, double d2, double d3, double d4) {
        boolean bl;
        block19: {
            block18: {
                boolean bl2;
                block17: {
                    block16: {
                        try {
                            block15: {
                                try {
                                    try {
                                        try {
                                            if (transactionOrchestrator10172.O() || transactionOrchestrator10172.e().equals("")) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw _Y.a(customSystemException);
                                        }
                                        if ((double)transactionOrchestrator1017.y(transactionOrchestrator10172) > d2) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw _Y.a(customSystemException);
                                    }
                                    if (transactionOrchestrator1017.X(transactionOrchestrator10172)) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw _Y.a(customSystemException);
                                }
                            }
                            bl2 = true;
                            break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                boolean bl3 = bl2;
                try {
                    if (bl3) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                int n = _Y.g(transactionOrchestrator10172, transactionOrchestrator1017);
                int n2 = _Y.R(transactionOrchestrator10172, transactionOrchestrator1017);
                try {
                    try {
                        if (!((double)n < d3) || !((double)n2 < d4)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    bl = true;
                    break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static double G(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2 - d5;
        double d9 = d4 - d7;
        double d10 = d3 - d6;
        if (GeometryCalculator.C() > 13) {
            d10 = d3 + 1.6 - d6;
        }
        double d11 = AdaptiveComputationEngine.C(d8 * d8 + d9 * d9);
        double d12 = Math.atan2(d10, d11) * 180.0 / Math.PI;
        return d12;
    }

    public static LightweightExecutionContext g() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return new LightweightExecutionContext(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                return systemConfigurationOrchestrator.t().Q();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return systemConfigurationOrchestrator.l().D();
    }

    public static boolean p(CryptographicTransformer cryptographicTransformer) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (cryptographicTransformer.G() != 0.0 || cryptographicTransformer.o() != 0.0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _Y.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _Y.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static double F(double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8;
        block13: {
            float f;
            float f2;
            block12: {
                block11: {
                    block10: {
                        d8 = 0.0;
                        f2 = (float)(d5 - d2);
                        f = (float)(d6 - d3);
                        try {
                            if (!((double)f > 0.0) || !((double)f2 > 0.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        d8 = Math.toDegrees(-CryptoParameterGenerator.b(f2 / f));
                        break block13;
                    }
                    try {
                        if (!((double)f > 0.0) || !((double)f2 < 0.0)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    d8 = Math.toDegrees(-CryptoParameterGenerator.b(f2 / f));
                    break block13;
                }
                try {
                    if (!((double)f < 0.0) || !((double)f2 > 0.0)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                d8 = -90.0 + Math.toDegrees(CryptoParameterGenerator.b(f / f2));
                break block13;
            }
            try {
                if (!((double)f < 0.0) || !((double)f2 < 0.0)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            d8 = 90.0 + Math.toDegrees(CryptoParameterGenerator.b(f / f2));
        }
        double d9 = Math.abs(d8 - d4) % 360.0;
        try {
            d7 = d9 > 180.0 ? 360.0 - d9 : d9;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        double d10 = d7;
        return d10;
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

    public static double y(double d2, double d3, double d4) {
        block10: {
            try {
                try {
                    if (!(d2 < d4) || !(d2 > d3)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                return d2;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        try {
            if (d2 > d4) {
                return d4;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            if (d2 < d3) {
                return d3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return d2;
    }

    public static TransactionOrchestrator1017 f(double d2, float f, float f2, float f3) {
        block2: {
            try {
                if (((ObjectLifecycleTracker)ApplicationLifecycleManager.g()).M() == null || ApplicationLifecycleManager.c().M() == null) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            Object object = ApplicationLifecycleManager.g();
            DataTransmissionManager2384 dataTransmissionManager2384 = DataTransmissionManager2384.h(((CryptographicTransformer)object).N(), ApplicationLifecycleManager.U().B());
            dataTransmissionManager2384.z(f2);
            dataTransmissionManager2384.G(f3);
            dataTransmissionManager2384.a(f2);
            dataTransmissionManager2384.f(f3);
            return _Y.i(d2, f, (TransactionOrchestrator1017)object, dataTransmissionManager2384);
        }
        return null;
    }

    public static boolean X(TransactionOrchestrator1017 transactionOrchestrator1017) {
        boolean bl;
        block18: {
            block17: {
                try {
                    if (transactionOrchestrator1017 == null) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                if (ReflectionMetadataResolver.UQ.isInstance(transactionOrchestrator1017)) {
                    boolean bl2;
                    block16: {
                        block15: {
                            Qh qh = (Qh)transactionOrchestrator1017;
                            boolean bl3 = false;
                            for (Object object : qh.l().G()) {
                                LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(object);
                                if (lightweightExecutionContext.Y()) continue;
                                bl3 = true;
                            }
                            try {
                                try {
                                    try {
                                        if (!transactionOrchestrator1017.R() || !transactionOrchestrator1017.a().Y()) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw _Y.a(customSystemException);
                                    }
                                    if (bl3) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw _Y.a(customSystemException);
                                }
                                bl2 = true;
                                break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                try {
                    try {
                        if (!transactionOrchestrator1017.R() || !transactionOrchestrator1017.a().Y()) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    bl = true;
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static TransactionOrchestrator1017 s(CryptographicTransformer cryptographicTransformer, double d2, double d3, boolean bl) {
        for (Object e : ApplicationLifecycleManager.c().L()) {
            if (!ReflectionMetadataResolver.Ut.isInstance(e)) continue;
            TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(e);
            try {
                if (transactionOrchestrator1017.equals(cryptographicTransformer)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            if (transactionOrchestrator1017.O()) continue;
            try {
                if (transactionOrchestrator1017.e() <= 0.0f) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                try {
                    if (bl && TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if ((double)transactionOrchestrator1017.y(cryptographicTransformer) >= d2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (!((double)_Y.g(cryptographicTransformer, transactionOrchestrator1017) < d3)) continue;
                return transactionOrchestrator1017;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return null;
    }

    public static int V(Qh qh) {
        int n = 0;
        if (DynamicContextBroker.e) {
            AuthorizationManager authorizationManager = ApplicationLifecycleManager.U().U();
            List list = NetworkProtocolEncoder458.r().y(authorizationManager.l());
            for (Object e : list) {
                ConnectionEstablisher connectionEstablisher;
                block6: {
                    connectionEstablisher = new ConnectionEstablisher(e);
                    try {
                        try {
                            if (!connectionEstablisher.B().r()) continue;
                            if (qh.B().equals(connectionEstablisher.B())) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        if (!qh.e().equals(connectionEstablisher.B().U())) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
                n = Math.max(connectionEstablisher.v(), 0);
                break;
            }
        }
        return n;
    }

    public static float S(TransactionOrchestrator1017 transactionOrchestrator1017, float f) {
        return _Y.i(transactionOrchestrator1017, f, ResourceAllocator1647.G(ApplicationLifecycleManager.U()));
    }

    public static int x(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2, int n, int n2) {
        block11: {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            block10: {
                d7 = cryptographicTransformer.F();
                d6 = cryptographicTransformer.B();
                d5 = cryptographicTransformer.f();
                d4 = cryptographicTransformer.n();
                d3 = cryptographicTransformer2.F();
                d2 = cryptographicTransformer2.B();
                try {
                    try {
                        if (d5 - d7 != 0.0 || d4 - d6 != 0.0) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    return -11;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            double d8 = Math.abs((d5 - d7) * (d6 - d2) - (d7 - d3) * (d4 - d6)) / Math.sqrt(Math.pow(d5 - d7, 2.0) + Math.pow(d4 - d6, 2.0));
            double d9 = Math.sqrt(Math.pow(d7 - d3, 2.0) + Math.pow(d6 - d2, 2.0));
            double d10 = Math.sqrt(Math.pow(d5 - d3, 2.0) + Math.pow(d4 - d2, 2.0));
            try {
                try {
                    try {
                        if (!(d10 > d9) || !(d8 < (double)n)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    if (!(d9 < (double)n2)) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                return (int)d9;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return -99;
    }

    public static float Q(TransactionOrchestrator1017 transactionOrchestrator1017, float f) {
        int n = (int)(25.0f - _Y.G(transactionOrchestrator1017));
        float f2 = f * (float)n;
        f = f2 / 25.0f;
        return f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static float H(TransactionOrchestrator1017 transactionOrchestrator1017) {
        float f;
        block6: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            LightweightExecutionContext lightweightExecutionContext = transactionOrchestrator1017.a();
            TransactionSequenceManager transactionSequenceManager = null;
            transactionSequenceManager = GameVersionEnumerator.MC_1_21_4.H() ? systemConfigurationOrchestrator.x(EncodingProtocolHandler.G()) : systemConfigurationOrchestrator.I(EncodingProtocolHandler.f());
            try {
                if (transactionSequenceManager.Y()) {
                    return 0.0f;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            f = (float)transactionSequenceManager.n();
            float f2 = 0.0f;
            f2 += EventDispatchCoordinator1090.b(lightweightExecutionContext, ProtocolValidator.f());
            if (lightweightExecutionContext.r()) {
                f2 += RuntimeResourceTracker.N(lightweightExecutionContext);
            }
            try {
                if (!(f > 0.0f) && !(f2 > 0.0f)) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            f += f2;
        }
        return f;
    }

    @Nullable
    public static SecurityContextManager2112 O(DataTransmissionManager2384 dataTransmissionManager2384) {
        block9: {
            block8: {
                LightweightExecutionContext lightweightExecutionContext = dataTransmissionManager2384.G(SecurityContextManager2112.e());
                try {
                    try {
                        if (!lightweightExecutionContext.r() || !lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fa)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    return SecurityContextManager2112.e();
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            LightweightExecutionContext lightweightExecutionContext = dataTransmissionManager2384.G(SecurityContextManager2112.R());
            try {
                try {
                    if (!lightweightExecutionContext.r() || !lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fa)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                return SecurityContextManager2112.R();
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = _Y.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _Y.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _Y.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _Y.a(clazz3, string2, clazz2)) != null) {
                    _Y.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _Y.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _Y.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _Y.b(231327423532644L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static int z(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        double d5 = d2 - cryptographicTransformer.F();
        double d6 = d3 - cryptographicTransformer.V();
        if (GeometryCalculator.C() > 13) {
            d6 = d3 - cryptographicTransformer.V();
        }
        double d7 = d4 - cryptographicTransformer.B();
        double d8 = AdaptiveComputationEngine.C(d5 * d5 + d7 * d7);
        float f = (float)(-(Math.atan2(d6, d8) * 180.0 / Math.PI));
        float f2 = (float)AdaptiveComputationEngine.a(cryptographicTransformer.S() - f);
        return (int)f2;
    }

    public static double X(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        double d2 = cryptographicTransformer.y(cryptographicTransformer2);
        double d3 = Math.cos(Math.toRadians(cryptographicTransformer.q() + 90.0f)) * d2;
        double d4 = Math.sin(Math.toRadians(cryptographicTransformer.q() + 90.0f)) * d2;
        double d5 = cryptographicTransformer.F() + d3;
        double d6 = cryptographicTransformer.B() + d4;
        return _Y.V(d5, 0.0, d6, cryptographicTransformer2.F(), 0.0, cryptographicTransformer2.B());
    }

    public static boolean a(CryptographicTransformer cryptographicTransformer) {
        return _Y.I(cryptographicTransformer, 6.0, 60.0, true);
    }

    public static boolean k(CryptographicTransformer cryptographicTransformer) {
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                return cryptographicTransformer.B(ReflectionMetadataResolver.YK);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return false;
    }

    public static double l(double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8;
        block13: {
            double d9;
            double d10;
            block12: {
                block11: {
                    block10: {
                        d8 = 0.0;
                        d10 = d5 - d2;
                        d9 = d6 - d3;
                        try {
                            if (!(d9 > 0.0) || !(d10 > 0.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        d8 = Math.toDegrees(-Math.atan(d10 / d9));
                        break block13;
                    }
                    try {
                        if (!(d9 > 0.0) || !(d10 < 0.0)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    d8 = Math.toDegrees(-Math.atan(d10 / d9));
                    break block13;
                }
                try {
                    if (!(d9 < 0.0) || !(d10 > 0.0)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                d8 = -90.0 + Math.toDegrees(Math.atan(d9 / d10));
                break block13;
            }
            try {
                if (!(d9 < 0.0) || !(d10 < 0.0)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            d8 = 90.0 + Math.toDegrees(Math.atan(d9 / d10));
        }
        double d11 = Math.abs(d8 - d4) % 360.0;
        try {
            d7 = d11 > 180.0 ? 360.0 - d11 : d11;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        double d12 = d7;
        return d12;
    }

    public static boolean a(CryptographicTransformer cryptographicTransformer, TransactionOrchestrator1017 transactionOrchestrator1017, double d2, double d3, boolean bl) {
        block10: {
            try {
                try {
                    if (!bl || !TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        try {
            if ((double)cryptographicTransformer.y(transactionOrchestrator1017) >= d2) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            if ((double)_Y.g(transactionOrchestrator1017, cryptographicTransformer) < d3) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return false;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_Y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = _Y.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static float G(TransactionOrchestrator1017 transactionOrchestrator1017) {
        float f = 0.0f;
        if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
            Qh qh = new Qh(transactionOrchestrator1017);
            for (Object object : qh.l().G()) {
                LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(object);
                if (!lightweightExecutionContext.r()) continue;
                ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                try {
                    if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                double d2 = RuntimeResourceTracker.r(lightweightExecutionContext);
                f += (float)d2;
            }
        }
        return f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _Y.a = MultiContainerRegistry.a(4740251034560547301L, -1746410671779085247L, MethodHandles.lookup().lookupClass()).a(131723453985388L);
                _Y.e = new Object[5];
                _Y.f = new String[5];
                _Y.a();
                _Y.d = new HashMap<K, V>(13);
                var0 = _Y.a ^ 78284318663972L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "L6A\u0001bG\nPl\u00b32\u00df Z\u00b2\u009a";
                var7_6 = "L6A\u0001bG\nPl\u00b32\u00df Z\u00b2\u009a".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0019\u00ec0?\u0000~\u00a8\u00e1\u00bd\u008bsQ\u00b4LS\u00fb";
                    var7_6 = "\u0019\u00ec0?\u0000~\u00a8\u00e1\u00bd\u008bsQ\u00b4LS\u00fb".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        _Y.b = var8_3;
        _Y.c = new Integer[4];
        try {
            v8 = GeometryCalculator.C() > 13;
        }
        catch (CustomSystemException v9) {
            throw _Y.a(v9);
        }
        _Y.C = v8;
    }

    private static int L(LightweightExecutionContext[] lightweightExecutionContextArray, ResourceAllocator1647 resourceAllocator1647) {
        block9: {
            block8: {
                try {
                    if (GeometryCalculator.C() >= 35) {
                        return EventDispatchCoordinator1090.b(lightweightExecutionContextArray, resourceAllocator1647);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                try {
                    EventDispatchCoordinator1090.d().W(0);
                    EventDispatchCoordinator1090.d().a(resourceAllocator1647);
                    EventDispatchCoordinator1090.F(EventDispatchCoordinator1090.d(), lightweightExecutionContextArray);
                    if (EventDispatchCoordinator1090.d().m() <= 25) break block8;
                    EventDispatchCoordinator1090.d().W(25);
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            try {
                if (EventDispatchCoordinator1090.d().m() < 0) {
                    EventDispatchCoordinator1090.d().W(0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return (EventDispatchCoordinator1090.d().m() + 1 >> 1) + ((EventDispatchCoordinator1090.d().m() >> 1) + 1) / 2;
    }

    public static kg U(ContextualEventDispatcher contextualEventDispatcher, oQ oQ2, double d2, double d3, double d4) {
        double d5 = oQ2.F() + d2;
        double d6 = oQ2.c() + d3;
        double d7 = oQ2.v() + d4;
        double d8 = oQ2.f() + d2;
        double d9 = oQ2.P() + d3;
        double d10 = oQ2.R() + d4;
        double d11 = contextualEventDispatcher.X();
        double d12 = contextualEventDispatcher.F();
        double d13 = contextualEventDispatcher.f();
        double d14 = _Y.y(d11, d5, d8);
        double d15 = _Y.y(d12, d6, d9);
        double d16 = _Y.y(d13, d7, d10);
        if (d14 == d11) {
            d14 = d11 + 0.01;
        }
        if (d16 == d13) {
            d16 = d13 + 0.01;
        }
        return new kg(d14, d15, d16);
    }

    public static CompressionUtility O(oQ oQ2) {
        int n = AdaptiveComputationEngine.Q(oQ2.F());
        int n2 = AdaptiveComputationEngine.Q(oQ2.f() + 1.0);
        int n3 = AdaptiveComputationEngine.Q(oQ2.c());
        int n4 = AdaptiveComputationEngine.Q(oQ2.P() + 1.0);
        int n5 = AdaptiveComputationEngine.Q(oQ2.v());
        int n6 = AdaptiveComputationEngine.Q(oQ2.R() + 1.0);
        for (int i = n4; i > n3; --i) {
            for (int j = n; j < n2; ++j) {
                for (int k = n5; k < n6; ++k) {
                    TransactionCorrelationEngine transactionCorrelationEngine = ApplicationLifecycleManager.c().N(j, i, k);
                    try {
                        if (!PatternMatchingOrchestrator.E(transactionCorrelationEngine)) continue;
                        return new CompressionUtility(j, i, k);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
            }
        }
        return null;
    }

    public static double Y(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        double d2 = cryptographicTransformer.F() - cryptographicTransformer2.F();
        double d3 = cryptographicTransformer.B() - cryptographicTransformer2.B();
        return AdaptiveComputationEngine.C(d2 * d2 + d3 * d3);
    }

    public static boolean c(CryptographicTransformer cryptographicTransformer) {
        return _Y.X(cryptographicTransformer, 6.0, 60.0, true);
    }

    public static double w(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        double d5 = cryptographicTransformer.F() - d2;
        double d6 = cryptographicTransformer.B() - d4;
        double d7 = cryptographicTransformer.V() - d3;
        if (GeometryCalculator.C() > 13) {
            d7 = cryptographicTransformer.L().c() + 1.6 - d3;
        }
        double d8 = AdaptiveComputationEngine.C(d5 * d5 + d6 * d6);
        double d9 = Math.atan2(d7, d8) * 180.0 / Math.PI;
        return d9;
    }

    public static double A(CryptographicTransformer cryptographicTransformer, double d2, double d3) {
        return _Y.l(cryptographicTransformer.F(), cryptographicTransformer.B(), cryptographicTransformer.q(), d2, d3);
    }

    public static double a(CryptographicTransformer cryptographicTransformer) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d2 = systemConfigurationOrchestrator.y(cryptographicTransformer);
        double d3 = ConfigurationCalibrator.b.Y();
        double d4 = Math.cos(Math.toRadians(d3 + 90.0)) * d2;
        double d5 = Math.sin(Math.toRadians(d3 + 90.0)) * d2;
        double d6 = systemConfigurationOrchestrator.F() + d4;
        double d7 = systemConfigurationOrchestrator.B() + d5;
        return _Y.V(d6, 0.0, d7, cryptographicTransformer.F(), 0.0, cryptographicTransformer.B());
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
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 21;
                break;
            }
            case 2: {
                n3 = 36;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 51;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 22;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 40;
                break;
            }
            case 13: {
                n3 = 49;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 3;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 8;
                break;
            }
            case 20: {
                n3 = 45;
                break;
            }
            case 21: {
                n3 = 60;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 4;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 16;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 52;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 43;
                break;
            }
            case 31: {
                n3 = 50;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 24;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 48;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 30;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 12;
                break;
            }
            case 43: {
                n3 = 32;
                break;
            }
            case 44: {
                n3 = 2;
                break;
            }
            case 45: {
                n3 = 56;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 61;
                break;
            }
            case 48: {
                n3 = 11;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 28;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 33;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 17;
                break;
            }
            case 57: {
                n3 = 63;
                break;
            }
            case 58: {
                n3 = 27;
                break;
            }
            case 59: {
                n3 = 0;
                break;
            }
            case 60: {
                n3 = 10;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 25;
                break;
            }
            default: {
                n3 = 19;
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
        _Y.f[n4] = new String(cArray);
        return n4;
    }

    public static double y(int n, int n2, int n3, int n4) {
        double d2 = n - n3;
        double d3 = n2 - n4;
        return Math.sqrt(d2 * d2 + d3 * d3);
    }

    public static double F(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        double d5 = d2 - cryptographicTransformer.F();
        double d6 = d3 - cryptographicTransformer.V();
        if (GeometryCalculator.C() > 13) {
            d6 = d3 - 0.3 - cryptographicTransformer.V();
        }
        double d7 = d4 - cryptographicTransformer.B();
        double d8 = AdaptiveComputationEngine.C(d5 * d5 + d7 * d7);
        float f = (float)(-(Math.atan2(d6, d8) * 180.0 / Math.PI));
        float f2 = (float)AdaptiveComputationEngine.a(cryptographicTransformer.S() - f);
        return f2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _Y.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _Y.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = _Y.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static boolean V() {
        boolean bl;
        block10: {
            block9: {
                ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (executionStateTracker.y().X() || executionStateTracker.h().X()) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw _Y.a(customSystemException);
                                }
                                if (executionStateTracker.s().X()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                            if (!executionStateTracker.w().X()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static float Z(double d2, double d3, double d4, double d5) {
        float f;
        block5: {
            double d6;
            double d7;
            block4: {
                d7 = d4 - d2;
                d6 = d5 - d3;
                f = (float)Math.toDegrees(-CryptoParameterGenerator.b((float)(d7 / d6)));
                try {
                    if (!(d6 < 0.0) || !(d7 < 0.0)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                f = (float)(90.0 + Math.toDegrees(CryptoParameterGenerator.b((float)(d6 / d7))));
                break block5;
            }
            try {
                if (!(d6 < 0.0) || !(d7 > 0.0)) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            f = (float)(-90.0 + Math.toDegrees(CryptoParameterGenerator.b((float)(d6 / d7))));
        }
        return f;
    }

    public static int k(CryptographicTransformer cryptographicTransformer, int n) {
        return _Y.l(cryptographicTransformer, n, true);
    }

    public static boolean B(CryptographicTransformer cryptographicTransformer, double d2, double d3, float f) {
        boolean bl;
        double d4;
        block13: {
            double d5;
            double d6;
            block12: {
                block11: {
                    block10: {
                        d4 = 0.0;
                        d6 = d2 - (cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) * (double)f);
                        d5 = d3 - (cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) * (double)f);
                        try {
                            if (!(d5 > 0.0) || !(d6 > 0.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        d4 = Math.toDegrees(-Math.atan(d6 / d5));
                        break block13;
                    }
                    try {
                        if (!(d5 > 0.0) || !(d6 < 0.0)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    d4 = Math.toDegrees(-Math.atan(d6 / d5));
                    break block13;
                }
                try {
                    if (!(d5 < 0.0) || !(d6 > 0.0)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                d4 = -90.0 + Math.toDegrees(Math.atan(d5 / d6));
                break block13;
            }
            try {
                if (!(d5 < 0.0) || !(d6 < 0.0)) break block13;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            d4 = 90.0 + Math.toDegrees(Math.atan(d5 / d6));
        }
        double d7 = AdaptiveComputationEngine.a((d4 - (double)cryptographicTransformer.q()) % 360.0);
        try {
            bl = d7 < 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return bl;
    }

    public static float v(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        float f = _Y.H(transactionOrchestrator1017);
        f = _Y.Q(transactionOrchestrator10172, f);
        f = _Y.S(transactionOrchestrator10172, f);
        return f;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_Y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static float T() {
        float f;
        float f2 = ApplicationLifecycleManager.U().q() % 360.0f;
        try {
            f = f2 < 0.0f ? 360.0f + f2 : f2;
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        return f;
    }

    public static double m(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        double d5 = cryptographicTransformer.F() - d2;
        double d6 = cryptographicTransformer.V() - d3;
        double d7 = cryptographicTransformer.B() - d4;
        return AdaptiveComputationEngine.C(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public static float Q(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        float f = _Y.H(transactionOrchestrator1017);
        f = _Y.Q(transactionOrchestrator10172, f);
        f = _Y.S(transactionOrchestrator10172, f);
        return (int)Math.ceil(transactionOrchestrator10172.e() / f);
    }

    private static Method d(long l, long l2) {
        int n = _Y.a(l, l2);
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
                clazz3 = _Y.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _Y.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _Y.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _Y.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _Y.b(231327423532644L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _Y.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _Y.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _Y.b(231327423532644L, 0L);
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

    public static int l(CryptographicTransformer cryptographicTransformer, int n, boolean bl) {
        int n2 = 0;
        for (Object e : ApplicationLifecycleManager.c().M()) {
            if (!ReflectionMetadataResolver.Pr.isInstance(e)) continue;
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
            try {
                try {
                    if (bl && TemporalMetadataResolver.h.j().h(dataTransmissionManager2384)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            try {
                if (!(dataTransmissionManager2384.y(cryptographicTransformer) <= (float)n)) continue;
                ++n2;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return n2;
    }

    public static boolean F(TransactionOrchestrator1017 transactionOrchestrator1017) {
        try {
            if (transactionOrchestrator1017.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
            boolean bl;
            block13: {
                block12: {
                    Qh qh = new Qh(transactionOrchestrator1017);
                    boolean bl2 = false;
                    for (Object object : qh.l().G()) {
                        block11: {
                            try {
                                if (object == null) continue;
                                if (GeometryCalculator.C() < 23) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                            LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(object);
                            if (lightweightExecutionContext.C().O() == 0) continue;
                            bl2 = true;
                            continue;
                        }
                        bl2 = true;
                    }
                    try {
                        try {
                            if (!transactionOrchestrator1017.a().Y() || bl2) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        bl = true;
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public static boolean u(AdaptiveConfigurationManager adaptiveConfigurationManager, CompressionUtility compressionUtility) {
        block25: {
            boolean bl;
            block27: {
                block26: {
                    ReflectionUtilityBroker reflectionUtilityBroker;
                    long l;
                    block22: {
                        boolean bl2;
                        block24: {
                            block23: {
                                block19: {
                                    boolean bl3;
                                    block21: {
                                        block20: {
                                            block16: {
                                                boolean bl4;
                                                block18: {
                                                    block17: {
                                                        l = a ^ 0x53D97081ADECL;
                                                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                        reflectionUtilityBroker = ReflectionUtilityBroker.t(AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.G() * 1.0), AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.V() - systemConfigurationOrchestrator.x() * 1.0), AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.o() * 1.0));
                                                        try {
                                                            try {
                                                                if (!adaptiveConfigurationManager.e().equals(_Y.b("R", (int)_Y.a("r", (int)28843, (long)(0x1499A07687CA47BAL ^ l)), (long)2079110219165024716L, (long)l))) break block16;
                                                                if (reflectionUtilityBroker.j() <= compressionUtility.A()) break block17;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw _Y.a(customSystemException);
                                                            }
                                                            bl4 = true;
                                                            break block18;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw _Y.a(customSystemException);
                                                        }
                                                    }
                                                    bl4 = false;
                                                }
                                                return bl4;
                                            }
                                            try {
                                                try {
                                                    if (!adaptiveConfigurationManager.e().equals(_Y.b("R", (int)_Y.a("r", (int)24029, (long)(0x592D74FFF6D76ACFL ^ l)), (long)2079110219165024716L, (long)l))) break block19;
                                                    if (reflectionUtilityBroker.j() >= compressionUtility.A()) break block20;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw _Y.a(customSystemException);
                                                }
                                                bl3 = true;
                                                break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw _Y.a(customSystemException);
                                            }
                                        }
                                        bl3 = false;
                                    }
                                    return bl3;
                                }
                                try {
                                    try {
                                        if (!adaptiveConfigurationManager.e().equals(_Y.b("R", (int)_Y.a("r", (int)11859, (long)(0x56C93321FAD19940L ^ l)), (long)2079110219165024716L, (long)l))) break block22;
                                        if (reflectionUtilityBroker.o() <= compressionUtility.z()) break block23;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw _Y.a(customSystemException);
                                    }
                                    bl2 = true;
                                    break block24;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw _Y.a(customSystemException);
                                }
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    try {
                        try {
                            if (!adaptiveConfigurationManager.e().equals(_Y.b("R", (int)_Y.a("r", (int)5341, (long)(0x1B4B0438E82C23CDL ^ l)), (long)2079110219165024716L, (long)l))) break block25;
                            if (reflectionUtilityBroker.o() >= compressionUtility.z()) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        bl = true;
                        break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public static TransactionOrchestrator1017 i(double d2, float f, TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        block26: {
            ObjectLifecycleTracker objectLifecycleTracker = null;
            try {
                if (((ObjectLifecycleTracker)ApplicationLifecycleManager.g()).M() == null || ApplicationLifecycleManager.c().M() == null) break block26;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            double d3 = d2;
            double d4 = d2;
            ContextualEventDispatcher contextualEventDispatcher = transactionOrchestrator1017.I(0.0f);
            ContextualEventDispatcher contextualEventDispatcher2 = transactionOrchestrator10172.F(0.0f);
            ContextualEventDispatcher contextualEventDispatcher3 = contextualEventDispatcher.A(contextualEventDispatcher2.X() * d3, contextualEventDispatcher2.F() * d3, contextualEventDispatcher2.f() * d3);
            float f2 = 1.0f;
            List list = ApplicationLifecycleManager.c().R(transactionOrchestrator1017, ((oQ)transactionOrchestrator1017.L()).r(contextualEventDispatcher2.X() * d3, contextualEventDispatcher2.F() * d3, contextualEventDispatcher2.f() * d3).B(f2, f2, f2));
            double d5 = d4;
            for (int i = 0; i < list.size(); ++i) {
                double d6;
                CryptographicTransformer cryptographicTransformer;
                block29: {
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                    block27: {
                        block28: {
                            cryptographicTransformer = new CryptographicTransformer(list.get(i));
                            if (!cryptographicTransformer.m()) continue;
                            float f3 = cryptographicTransformer.g() + f;
                            oQ oQ2 = cryptographicTransformer.L().B(f3, f3, f3);
                            networkPacketInterceptor1107 = oQ2.x(contextualEventDispatcher, contextualEventDispatcher3);
                            try {
                                try {
                                    if (!oQ2.j(contextualEventDispatcher)) break block27;
                                    if (0.0 < d5) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw _Y.a(customSystemException);
                                }
                                if (d5 != 0.0) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                        }
                        objectLifecycleTracker = cryptographicTransformer;
                        d5 = 0.0;
                        continue;
                    }
                    if (networkPacketInterceptor1107.M() == null) continue;
                    d6 = contextualEventDispatcher.x(networkPacketInterceptor1107.i());
                    try {
                        try {
                            try {
                                try {
                                    if (!(d6 < d5) && d5 != 0.0) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw _Y.a(customSystemException);
                                }
                                if (cryptographicTransformer.M() != transactionOrchestrator1017.o().M()) break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                            if (cryptographicTransformer.p()) break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                        if (d5 != 0.0) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw _Y.a(customSystemException);
                    }
                    objectLifecycleTracker = cryptographicTransformer;
                    continue;
                }
                objectLifecycleTracker = cryptographicTransformer;
                d5 = d6;
            }
            try {
                try {
                    block30: {
                        try {
                            try {
                                if (objectLifecycleTracker == null) break block26;
                                if (d5 < d4) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw _Y.a(customSystemException);
                            }
                            if (ApplicationLifecycleManager.u().M() != null) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw _Y.a(customSystemException);
                        }
                    }
                    if (!ApplicationLifecycleManager.U().X((CryptographicTransformer)objectLifecycleTracker)) break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw _Y.a(customSystemException);
                }
                if (!ReflectionMetadataResolver.Ut.isInstance(objectLifecycleTracker.M())) break block26;
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
            TransactionOrchestrator1017 transactionOrchestrator10173 = new TransactionOrchestrator1017(objectLifecycleTracker.M());
            try {
                if (!transactionOrchestrator10173.O()) {
                    return transactionOrchestrator10173;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw _Y.a(customSystemException);
            }
        }
        return null;
    }

    public static Double[] p(CryptographicTransformer cryptographicTransformer, double d2, double d3) {
        double d4 = Math.toRadians(d2);
        double d5 = cryptographicTransformer.F();
        double d6 = cryptographicTransformer.B();
        double d7 = d5 - d3 * Math.sin(d4);
        double d8 = d6 + d3 * Math.cos(d4);
        return new Double[]{d7, d8};
    }

    public static double X(double[] dArray, double[] dArray2) {
        return _Y.V(dArray[0], dArray[1], dArray[2], dArray2[0], dArray2[1], dArray2[2]);
    }

    public static void M() {
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = executionStateTracker.y();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = executionStateTracker.h();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = executionStateTracker.s();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = executionStateTracker.w();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11925 = executionStateTracker.N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11926 = executionStateTracker.f();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11927 = executionStateTracker.r();
        boolean bl = DynamicContextBroker.s(executionStateTracker.y());
        boolean bl2 = DynamicContextBroker.s(executionStateTracker.h());
        boolean bl3 = DynamicContextBroker.s(executionStateTracker.s());
        boolean bl4 = DynamicContextBroker.s(executionStateTracker.w());
        boolean bl5 = DynamicContextBroker.s(executionStateTracker.N());
        boolean bl6 = DynamicContextBroker.s(executionStateTracker.f());
        boolean bl7 = DynamicContextBroker.s(executionStateTracker.r());
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator1192, bl);
            if (bl) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator1192);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11922, bl2);
            if (bl2) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator11922);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11923, bl3);
            if (bl3) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator11923);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11924, bl4);
            if (bl4) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator11924);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11925, bl5);
            if (bl5) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator11925);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11926, bl6);
            if (bl6) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator11926);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11927, bl7);
            if (bl7) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator11927);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _Y.a(customSystemException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_Y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_Y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

