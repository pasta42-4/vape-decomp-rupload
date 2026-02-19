/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.concurrent.task;

import a.C_;
import a.Ry;
import a.bE;
import a.bm;
import a.hQ;
import a.yC;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.task.AsynchronousTaskCoordinator238;
import com.core.computation.AbstractComputationKernel;
import com.crypto.operations.CipherOperationsManager;
import com.crypto.stream.DataStreamEncryptionHandler;
import com.data.conversion.TemporalDataTransformer;
import com.data.temporal.ChronoDataSynchronizer;
import com.encoding.registry.EncodingProtocolRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.math.precision.PrecisionMathOrchestrator;
import com.math.transformation.NumericTransformationEngine;
import com.network.connection.NetworkConnectionManager1525;
import com.network.connection.NetworkConnectionManager1865;
import com.network.protocol.CommunicationProtocolManager;
import com.security.cryptography.CryptographicContextManager153;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class AsynchronousTaskCoordinator
extends AbstractComputationKernel {
    private static final long[] ab;
    private AsynchronousTaskCoordinator238 Y;
    private final EncodingProtocolRegistry b;
    private static final long E;
    @Nullable
    private Runnable R;
    private static final Integer[] bb;
    private static final Object[] eb;
    @Nullable
    private Runnable n;
    private final Ry L;
    private static final Map db;
    @Nullable
    private final TemporalDataTransformer F;
    private GraphicalRenderEngine1082 D;
    private CryptographicContextManager153 V;
    private static final String[] fb;
    @Nullable
    private Runnable B;
    @Nullable
    private Runnable v;

    private void lambda$new$7() {
        long l = E ^ 0x12FB2DED1D4L;
        TemporalMetadataResolver.x((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)18621, (long)(0x31AAC8AF659C8A20L ^ l)), (long)4740320472150244284L, (long)l)) + this.V());
        GraphicalRenderingController.D(CommunicationProtocolManager.class).d(this.V(), new DataStreamEncryptionHandler(this.L, this.F));
    }

    @Override
    public double z() {
        double d2;
        double d3;
        try {
            if (this.F == null) {
                return 30.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
        try {
            if (this.F.q().isEmpty()) {
                return 15.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
        try {
            d3 = this.D.b();
            d2 = this.Y != null ? this.Y.b() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
        return d3 + d2 + 2.0;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = AsynchronousTaskCoordinator.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousTaskCoordinator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousTaskCoordinator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousTaskCoordinator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousTaskCoordinator.eb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousTaskCoordinator.f(242594476013036L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousTaskCoordinator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousTaskCoordinator.eb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousTaskCoordinator.f(242594476013036L, 0L);
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AsynchronousTaskCoordinator.E = MultiContainerRegistry.a(6918149209503105396L, -6552554808148635620L, MethodHandles.lookup().lookupClass()).a(29094123981581L);
                AsynchronousTaskCoordinator.eb = new Object[5];
                AsynchronousTaskCoordinator.fb = new String[5];
                AsynchronousTaskCoordinator.a();
                AsynchronousTaskCoordinator.db = new HashMap<K, V>(13);
                var0 = AsynchronousTaskCoordinator.E ^ 11679477870455L;
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
                var8_3 = new long[25];
                var5_4 = 0;
                var6_5 = "\r\u00d6I\u00ab3\u00b9\u00a3\u0090\u00171\u00c2@\u00b0\u00c1\u00f0\u00940\u00a0\u00012\u00f2\u00af.\u0000\u00d7G$\u000fe\u0011\u00ef\u00e0P1X\u00eb\u00cc\u00ae9z6S`4wT\u00bf\u00b1n\u00a1L\u00b9\u00f8\u00ac\u00ff\u0001\u00bd^\u00c2/\u00a5Rmas\u008e\u0004\u008e2\u0087*\u00dba{Uv:\r9\u001a8\u00ab\u00f6\u00d4lL\u00e7\u00b1]\u00e9\u0096\u0091\u00dd\u009e1\u00e2\u00cc\u008cH\u00f5\u0015\u00b2f\u000eL\u008dY\u00ca\u00f2\u0002\u00f0\u0081:<\u001e\\F?\rr\u00c6/t\u0017%\u00c9\u00f4F\u0080J\u0019\u00a8-\u00d7\u00b9\u0001\u00bd\u0084+7+/\u00b4\u00c2\u00a85\u00f5\u00d5 \u0019\u008bjqD\u00aa\u008ci\u0093KT\u00ab\u00bc\u008dL\r\u00da\n\u00f9\u0003,\t)mR\u0096\u00a5\u00ae\u00e3\u0087\u008e\u001d\u00cb0\u00c7";
                var7_6 = "\r\u00d6I\u00ab3\u00b9\u00a3\u0090\u00171\u00c2@\u00b0\u00c1\u00f0\u00940\u00a0\u00012\u00f2\u00af.\u0000\u00d7G$\u000fe\u0011\u00ef\u00e0P1X\u00eb\u00cc\u00ae9z6S`4wT\u00bf\u00b1n\u00a1L\u00b9\u00f8\u00ac\u00ff\u0001\u00bd^\u00c2/\u00a5Rmas\u008e\u0004\u008e2\u0087*\u00dba{Uv:\r9\u001a8\u00ab\u00f6\u00d4lL\u00e7\u00b1]\u00e9\u0096\u0091\u00dd\u009e1\u00e2\u00cc\u008cH\u00f5\u0015\u00b2f\u000eL\u008dY\u00ca\u00f2\u0002\u00f0\u0081:<\u001e\\F?\rr\u00c6/t\u0017%\u00c9\u00f4F\u0080J\u0019\u00a8-\u00d7\u00b9\u0001\u00bd\u0084+7+/\u00b4\u00c2\u00a85\u00f5\u00d5 \u0019\u008bjqD\u00aa\u008ci\u0093KT\u00ab\u00bc\u008dL\r\u00da\n\u00f9\u0003,\t)mR\u0096\u00a5\u00ae\u00e3\u0087\u008e\u001d\u00cb0\u00c7".length();
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
                    var6_5 = "\u00c0k\u00d7,P(\u00a5C\u0089r\u001f\u00ed\u00d8=^\u00d6";
                    var7_6 = "\u00c0k\u00d7,P(\u00a5C\u0089r\u001f\u00ed\u00d8=^\u00d6".length();
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
        AsynchronousTaskCoordinator.ab = var8_3;
        AsynchronousTaskCoordinator.bb = new Integer[25];
    }

    private static void lambda$null$4(Consumer consumer, GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        consumer.accept(graphicalRenderEngine1082);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousTaskCoordinator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousTaskCoordinator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousTaskCoordinator.e(l, l2);
            object = eb[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousTaskCoordinator.eb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousTaskCoordinator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field g(long l, long l2) {
        int n = AsynchronousTaskCoordinator.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousTaskCoordinator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousTaskCoordinator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousTaskCoordinator.c(clazz3, string2, clazz2)) != null) {
                    AsynchronousTaskCoordinator.eb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousTaskCoordinator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousTaskCoordinator.eb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousTaskCoordinator.f(242594476013036L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public AsynchronousTaskCoordinator n(@Nullable Runnable runnable) {
        this.B = runnable;
        return this;
    }

    public EncodingProtocolRegistry l() {
        return this.b;
    }

    private void lambda$null$0(TemporalDataTransformer temporalDataTransformer) {
        temporalDataTransformer.c(this.L, this.R);
    }

    private static void a() {
        Object[] objectArray = eb;
        eb[0] = "qg|";
        objectArray[1] = Integer.TYPE;
        AsynchronousTaskCoordinator.fb[1] = "java/lang/Integer";
        objectArray[2] = "g}[D_\u0003lrJ\u000b\"\u001b\u007fuCB";
        objectArray[3] = "\u0011|%J|?\u001as4\u0005\u001d1\u0011x0_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "3vI\u0007/)-wO{.>S3X\u00195%hp\u000e\u0019yEjo\f@!*<z\u000fCE";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double e() {
        return 0.0;
    }

    public TemporalDataTransformer S() {
        return this.F;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == '\u00c5' || c == 'A' || c == 'R') {
                field = AsynchronousTaskCoordinator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousTaskCoordinator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousTaskCoordinator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public AsynchronousTaskCoordinator(Ry ry, @Nullable TemporalDataTransformer temporalDataTransformer, double d2, EncodingProtocolRegistry encodingProtocolRegistry) {
        bm bm2;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        AbstractComputationKernel abstractComputationKernel;
        long l;
        block24: {
            block23: {
                double d3;
                GraphicalRenderEngine1082 graphicalRenderEngine10822;
                GraphicalRenderEngine1082 graphicalRenderEngine10823;
                double d4;
                yC yC2;
                CallSite callSite;
                yC yC3;
                yC yC4;
                ColorCompositionEngine colorCompositionEngine;
                Date date;
                l = E ^ 0x4EBDF71229D9L;
                this.L = ry;
                this.F = temporalDataTransformer;
                this.b = encodingProtocolRegistry;
                this.T(d2);
                if (this.F == null) {
                    this.D = new GraphicalRenderEngine1082(d2, this.z());
                    this.D.i(false);
                    this.D.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)10533, (long)(0x438D53A05C7313A0L ^ l)), (long)-5060832356856101967L, (long)l)));
                    this.D.n(new NetworkConnectionManager1525(d2 / 2.0, 10.0), new Object[0]);
                    this.D.n(new bE(0.0, 2.0), new Object[0]);
                    this.D.n(new NetworkConnectionManager1525(d2, 12.0), new Object[0]);
                    this.o(this.D);
                    return;
                }
                this.D = new GraphicalRenderEngine1082(d2, 10.0);
                this.D.i(false);
                this.D.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)27076, (long)(0x729162EB6B98D34EL ^ l)), (long)-5060832356856101967L, (long)l)));
                this.o(this.D);
                GraphicalRenderEngine1082 graphicalRenderEngine10824 = new GraphicalRenderEngine1082(this.D.w(), 10.0);
                graphicalRenderEngine10824.i(false);
                this.D.n(graphicalRenderEngine10824, new Object[0]);
                graphicalRenderEngine10824.n(new bE(2.0, 0.0), new Object[0]);
                GraphicalRenderEngine1082 graphicalRenderEngine10825 = new GraphicalRenderEngine1082(graphicalRenderEngine10824.w() / 2.0, graphicalRenderEngine10824.b());
                graphicalRenderEngine10825.i(false);
                graphicalRenderEngine10824.n(graphicalRenderEngine10825, new Object[0]);
                CipherOperationsManager cipherOperationsManager = new CipherOperationsManager(this.F.S(), 8.0, 8.0);
                PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(0.5, 0.0, 0.0, 0.0, cipherOperationsManager);
                graphicalRenderEngine10825.n(precisionMathOrchestrator, new Object[0]);
                CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153(this.F.S().X(), 0.7);
                try {
                    double d5 = cryptographicContextManager153.D();
                    this.getClass();
                    cryptographicContextManager153.T(d5 + 5.0);
                    cryptographicContextManager153.q(true);
                    cryptographicContextManager153.w(10.0);
                    cryptographicContextManager153.B(AsynchronousTaskCoordinator.M.c);
                    graphicalRenderEngine10825.n(cryptographicContextManager153, new Object[0]);
                    this.V = new CryptographicContextManager153((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)19935, (long)(0x75512C61A2567747L ^ l)), (long)-5060832356856101967L, (long)l)), 0.7);
                    this.V.q(true);
                    this.V.w(10.0);
                    this.V.B(AsynchronousTaskCoordinator.M.n);
                    graphicalRenderEngine10825.n(this.V, new Object[0]);
                    date = this.F.S() != null ? this.F.S() : this.F.N();
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                Date date2 = date;
                CryptographicContextManager153 cryptographicContextManager1532 = new CryptographicContextManager153(ChronoDataSynchronizer.A(date2), 0.7);
                try {
                    cryptographicContextManager1532.g(ChronoDataSynchronizer.H(date2));
                    double d6 = cryptographicContextManager1532.D();
                    this.getClass();
                    cryptographicContextManager1532.T(d6 + (double)(5.0f * 2.0f));
                    cryptographicContextManager1532.q(true);
                    cryptographicContextManager1532.w(10.0);
                    cryptographicContextManager1532.B(AsynchronousTaskCoordinator.M.w);
                    graphicalRenderEngine10825.n(cryptographicContextManager1532, new Object[0]);
                    colorCompositionEngine = this.F.s() ? new ColorCompositionEngine(AsynchronousTaskCoordinator.M.Y).L(0.8f).I(120) : new ColorCompositionEngine(AsynchronousTaskCoordinator.M.O).I(150);
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                ColorCompositionEngine colorCompositionEngine2 = colorCompositionEngine;
                try {
                    yC yC5;
                    yC4 = yC5;
                    yC3 = yC5;
                    callSite = this.F.s() ? AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)11130, (long)(0x3F47FEB4531711E6L ^ l)), (long)-5060832356856101967L, (long)l) : AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)4082, (long)(0x38C0725843FDB57EL ^ l)), (long)-5060832356856101967L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                yC4((String)((Object)callSite), 6.0, 5.0, 20.0, 20.0, colorCompositionEngine2, colorCompositionEngine2, null);
                yC yC6 = yC3;
                try {
                    yC2 = yC6;
                    d4 = this.F.s() ? 2.0 : 3.0;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                try {
                    GraphicalRenderEngine1082 graphicalRenderEngine10826;
                    yC2.c(d4);
                    graphicalRenderEngine10825.n(yC6, new Object[0]);
                    graphicalRenderEngine10823 = graphicalRenderEngine10826;
                    graphicalRenderEngine10822 = graphicalRenderEngine10826;
                    d3 = this.b == EncodingProtocolRegistry.SELF ? 20.0 : (this.b == EncodingProtocolRegistry.REPLY ? 20.0 : 5.0);
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                graphicalRenderEngine10823(d3, graphicalRenderEngine10824.b());
                GraphicalRenderEngine1082 graphicalRenderEngine10827 = graphicalRenderEngine10822;
                graphicalRenderEngine10827.i(false);
                graphicalRenderEngine10827.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)24639, (long)(0x50E75009F957DABEL ^ l)), (long)-5060832356856101967L, (long)l)));
                graphicalRenderEngine10824.n(graphicalRenderEngine10827, AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)9746, (long)(0x5E96D3E3B86A1C92L ^ l)), (long)-5060832356856101967L, (long)l));
                if (this.b == EncodingProtocolRegistry.SELF) {
                    abstractComputationKernel = new VisualRenderContext((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)5776, (long)(0x767B26FC75A3AC0DL ^ l)), (long)-5060832356856101967L, (long)l)), 0.75, false, 20.0, graphicalRenderEngine10827.b());
                    ((VisualRenderContext)abstractComputationKernel).f(true);
                    ((hQ)abstractComputationKernel).C(() -> this.lambda$new$1(temporalDataTransformer));
                    graphicalRenderEngine10827.n(abstractComputationKernel, new Object[0]);
                } else if (this.b == EncodingProtocolRegistry.REPLY) {
                    abstractComputationKernel = new VisualRenderContext((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)5479, (long)(0xC08ECCBBEB62FE9L ^ l)), (long)-5060832356856101967L, (long)l)), 0.75, false, 15.0, graphicalRenderEngine10827.b());
                    graphicalRenderEngine10827.N(false);
                    ((VisualRenderContext)abstractComputationKernel).c(null);
                    ((VisualRenderContext)abstractComputationKernel).f(true);
                    AtomicReference atomicReference = new AtomicReference();
                    ((hQ)abstractComputationKernel).f(() -> this.lambda$new$6(atomicReference));
                    graphicalRenderEngine10827.n(abstractComputationKernel, new Object[0]);
                }
                try {
                    if (this.b != EncodingProtocolRegistry.REPLY && this.b != EncodingProtocolRegistry.OTHER) break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                abstractComputationKernel = new GraphicalThemeRenderer((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)7303, (long)(0x4751E2EA4C372605L ^ l)), (long)-5060832356856101967L, (long)l)), 0.5, AsynchronousTaskCoordinator.M.n, AsynchronousTaskCoordinator.M.q, 5.0, 5.0);
                graphicalRenderEngine10827.N(false);
                ((hQ)abstractComputationKernel).N(this::lambda$new$7);
                graphicalRenderEngine10827.n(abstractComputationKernel, AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)18861, (long)(0x1E5F336E4512F322L ^ l)), (long)-5060832356856101967L, (long)l));
                this.G(graphicalRenderEngine10827::N);
            }
            abstractComputationKernel = new GraphicalRenderEngine1082(this.D.w(), 20.0);
            ((NumericTransformationEngine)abstractComputationKernel).d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)30743, (long)(0x2BC09AABA9C7C28EL ^ l)), (long)-5060832356856101967L, (long)l)));
            abstractComputationKernel.i(false);
            this.D.n(abstractComputationKernel, AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)21476, (long)(0xF269A7E1716E960L ^ l)), (long)-5060832356856101967L, (long)l));
            double d7 = 15.0;
            ((NumericTransformationEngine)abstractComputationKernel).n(new bE(15.0, 0.0), new Object[0]);
            graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.D.w() - 15.0, 10.0);
            graphicalRenderEngine1082.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)22454, (long)(0x233E86D085FED31L ^ l)), (long)-5060832356856101967L, (long)l)));
            graphicalRenderEngine1082.i(false);
            ((NumericTransformationEngine)abstractComputationKernel).n(graphicalRenderEngine1082, new Object[0]);
            bm2 = new bm(this.F.q(), 0.8, AsynchronousTaskCoordinator.M.w, true);
            try {
                try {
                    bm2.T(graphicalRenderEngine1082.w());
                    bm2.n(graphicalRenderEngine1082.w());
                    bm2.w(7 * bm2.n().size());
                    if (encodingProtocolRegistry != EncodingProtocolRegistry.REPLY || !temporalDataTransformer.P()) break block24;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator.a(customSystemException);
                }
                bm2.q(true);
                bm2.B(AsynchronousTaskCoordinator.M.c);
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskCoordinator.a(customSystemException);
            }
        }
        graphicalRenderEngine1082.n(new bE(5.0, 1.0), new Object[0]);
        graphicalRenderEngine1082.n(bm2, new Object[0]);
        graphicalRenderEngine1082.n(new bE(5.0, 2.0), new Object[0]);
        if (this.F.p() != null) {
            Date date;
            GraphicalRenderEngine1082 graphicalRenderEngine10828 = new GraphicalRenderEngine1082(this.D.w() - 15.0, 15.0);
            graphicalRenderEngine10828.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)21172, (long)(0x158F4B3E460CE82BL ^ l)), (long)-5060832356856101967L, (long)l)));
            graphicalRenderEngine10828.i(false);
            graphicalRenderEngine1082.n(graphicalRenderEngine10828, AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)29915, (long)(0x2FC9A6019F854E5DL ^ l)), (long)-5060832356856101967L, (long)l));
            graphicalRenderEngine10828.n(new NetworkConnectionManager1865(graphicalRenderEngine10828, 1.0, new GraphicalRenderController(1.0, graphicalRenderEngine10828.b(), AsynchronousTaskCoordinator.M.w)), new Object[0]);
            GraphicalRenderEngine1082 graphicalRenderEngine10829 = new GraphicalRenderEngine1082(graphicalRenderEngine10828.w() - 1.0, 50.0);
            graphicalRenderEngine10829.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)16789, (long)(0x3301A34A6D147B0BL ^ l)), (long)-5060832356856101967L, (long)l)));
            graphicalRenderEngine10829.i(false);
            graphicalRenderEngine10828.n(graphicalRenderEngine10829, new Object[0]);
            GraphicalRenderEngine1082 graphicalRenderEngine108210 = new GraphicalRenderEngine1082(graphicalRenderEngine10829.w(), 6.0);
            graphicalRenderEngine108210.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)17590, (long)(0x592356D23CF7FE35L ^ l)), (long)-5060832356856101967L, (long)l)));
            graphicalRenderEngine108210.i(false);
            graphicalRenderEngine10829.n(graphicalRenderEngine108210, new Object[0]);
            CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)3678, (long)(0x47694F0FFF02B4D7L ^ l)), (long)-5060832356856101967L, (long)l)), 0.8, AsynchronousTaskCoordinator.M.c, true);
            try {
                cryptographicContextManager153.T(cryptographicContextManager153.D());
                cryptographicContextManager153.w(8.0);
                graphicalRenderEngine108210.n(cryptographicContextManager153, new Object[0]);
                graphicalRenderEngine108210.n(new bE(4.0, 0.0), new Object[0]);
                date = this.F.p().w() != null ? this.F.p().w() : this.F.p().D();
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskCoordinator.a(customSystemException);
            }
            Date date3 = date;
            CryptographicContextManager153 cryptographicContextManager1533 = new CryptographicContextManager153(ChronoDataSynchronizer.A(date3), 0.8, AsynchronousTaskCoordinator.M.w, true);
            cryptographicContextManager1533.g(ChronoDataSynchronizer.H(date3));
            cryptographicContextManager1533.T(cryptographicContextManager1533.D());
            cryptographicContextManager1533.w(8.0);
            graphicalRenderEngine108210.n(cryptographicContextManager1533, new Object[0]);
            graphicalRenderEngine10829.n(new bE(0.0, 2.0), new Object[0]);
            GraphicalRenderEngine1082 graphicalRenderEngine108211 = new GraphicalRenderEngine1082(graphicalRenderEngine10829.w(), 8.0);
            graphicalRenderEngine108211.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)7597, (long)(0x40DC872BC66D2725L ^ l)), (long)-5060832356856101967L, (long)l)));
            graphicalRenderEngine108211.i(false);
            graphicalRenderEngine10829.n(graphicalRenderEngine108211, new Object[0]);
            graphicalRenderEngine108211.n(new bE(5.0, 0.0), new Object[0]);
            bm bm3 = new bm(this.F.p().b(), 0.8);
            bm3.T(graphicalRenderEngine10829.w() - 8.0);
            bm3.n(graphicalRenderEngine10829.w() - 8.0);
            bm3.w(7 * bm3.n().size());
            graphicalRenderEngine108211.n(bm3, new Object[0]);
            graphicalRenderEngine108211.P(-1.0);
            graphicalRenderEngine108211.w(bm3.b());
            graphicalRenderEngine10829.P(-1.0);
            graphicalRenderEngine10829.w(graphicalRenderEngine10829.A().stream().mapToDouble(AbstractComputationKernel::b).sum());
            graphicalRenderEngine10828.P(-1.0);
            graphicalRenderEngine10828.w(graphicalRenderEngine10829.b());
            graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        }
        graphicalRenderEngine1082.P(-1.0);
        graphicalRenderEngine1082.w(graphicalRenderEngine1082.A().stream().mapToDouble(AbstractComputationKernel::b).sum());
        abstractComputationKernel.P(-1.0);
        abstractComputationKernel.w(((NumericTransformationEngine)abstractComputationKernel).A().stream().mapToDouble(AbstractComputationKernel::b).sum());
        double d8 = this.D.A().stream().mapToDouble(AbstractComputationKernel::b).sum();
        this.D.P(-1.0);
        this.D.w(d8);
    }

    private CompletableFuture lambda$new$6(AtomicReference atomicReference) {
        AbstractComputationKernel abstractComputationKernel = (AbstractComputationKernel)atomicReference.get();
        Consumer<AbstractComputationKernel> consumer = arg_0 -> this.lambda$null$2(atomicReference, arg_0);
        try {
            if (abstractComputationKernel != null) {
                return CompletableFuture.runAsync(() -> AsynchronousTaskCoordinator.lambda$null$3(consumer, abstractComputationKernel), GraphicalRenderingController.st);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
        return CompletableFuture.runAsync(() -> this.lambda$null$5(consumer, atomicReference), GraphicalRenderingController.st);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$new$1(TemporalDataTransformer temporalDataTransformer) {
        long l = E ^ 0x35C29D5F9423L;
        C_.P(this.V(), (String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)2267, (long)(0x4709CE87D48D8FACL ^ l)), (long)305739787565252171L, (long)l)), (String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)27442, (long)(0x70FF1FB20D7AEC43L ^ l)), (long)305739787565252171L, (long)l)), (String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)2383, (long)(0x2B58DFF30CF48E2EL ^ l)), (long)305739787565252171L, (long)l)), () -> this.lambda$null$0(temporalDataTransformer));
    }

    public AsynchronousTaskCoordinator v(@Nullable Runnable runnable) {
        this.v = runnable;
        return this;
    }

    public AsynchronousTaskCoordinator A(@Nullable Runnable runnable) {
        this.n = runnable;
        return this;
    }

    private void lambda$null$5(Consumer consumer, AtomicReference atomicReference) {
        long l = E ^ 0x1366C3712C8FL;
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.w(), 20.0);
        graphicalRenderEngine1082.d().f((String)((Object)AsynchronousTaskCoordinator.c("E", (int)AsynchronousTaskCoordinator.b("l", (int)10601, (long)(0x18A95119DE2F16A5L ^ l)), (long)-4858801171513932057L, (long)l)));
        graphicalRenderEngine1082.i(false);
        this.getClass();
        graphicalRenderEngine1082.n(new bE(5.0f * 2.0f, 0.0), new Object[0]);
        this.Y = new AsynchronousTaskCoordinator238(this.L, this.F, () -> AsynchronousTaskCoordinator.lambda$null$4(consumer, graphicalRenderEngine1082), graphicalRenderEngine1082.w() - 10.0, graphicalRenderEngine1082.b());
        graphicalRenderEngine1082.n(this.Y, new Object[0]);
        atomicReference.set(graphicalRenderEngine1082);
        this.o(graphicalRenderEngine1082);
        Runnable runnable = this.v;
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x34D;
        if (bb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/R0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousTaskCoordinator.bb[n2] = n3;
        }
        return bb[n2];
    }

    private void lambda$null$2(AtomicReference atomicReference, AbstractComputationKernel abstractComputationKernel) {
        this.J(abstractComputationKernel);
        this.Y = null;
        Runnable runnable = this.v;
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
        atomicReference.set(null);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = eb[n4];
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
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 30;
                break;
            }
            case 6: {
                n3 = 57;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 50;
                break;
            }
            case 9: {
                n3 = 53;
                break;
            }
            case 10: {
                n3 = 7;
                break;
            }
            case 11: {
                n3 = 39;
                break;
            }
            case 12: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 37;
                break;
            }
            case 14: {
                n3 = 61;
                break;
            }
            case 15: {
                n3 = 48;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 59;
                break;
            }
            case 20: {
                n3 = 18;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 9;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 27;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 58;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 35;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 46;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 51;
                break;
            }
            case 35: {
                n3 = 11;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 13;
                break;
            }
            case 38: {
                n3 = 0;
                break;
            }
            case 39: {
                n3 = 52;
                break;
            }
            case 40: {
                n3 = 29;
                break;
            }
            case 41: {
                n3 = 63;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 28;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 55;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 54;
                break;
            }
            case 52: {
                n3 = 32;
                break;
            }
            case 53: {
                n3 = 43;
                break;
            }
            case 54: {
                n3 = 26;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 42;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 34;
                break;
            }
            case 60: {
                n3 = 10;
                break;
            }
            case 61: {
                n3 = 62;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 33;
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
        AsynchronousTaskCoordinator.fb[n4] = new String(cArray);
        return n4;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousTaskCoordinator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousTaskCoordinator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public Ry c() {
        return this.L;
    }

    @Override
    public void G() {
        this.D.b(this.G());
        this.D.M(this.W());
        this.D.T(this.w());
        if (this.F != null) {
            AsynchronousTaskCoordinator238 asynchronousTaskCoordinator238 = this.Y;
            try {
                if (asynchronousTaskCoordinator238 != null) {
                    asynchronousTaskCoordinator238.F().b(this.G());
                    asynchronousTaskCoordinator238.F().M(this.W() + this.D.b());
                    asynchronousTaskCoordinator238.F().H();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskCoordinator.a(customSystemException);
            }
            ConfigurationManager.T(this.V.G() + 4.0, this.V.W() + 4.0, 1.0, 1.0, AsynchronousTaskCoordinator.M.w);
        }
        this.D.A();
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static void lambda$null$3(Consumer consumer, AbstractComputationKernel abstractComputationKernel) {
        consumer.accept(abstractComputationKernel);
    }

    public AsynchronousTaskCoordinator N(@Nullable Runnable runnable) {
        this.R = runnable;
        return this;
    }

    @Override
    public void g() {
        Runnable runnable = this.n;
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator.a(customSystemException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousTaskCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousTaskCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

