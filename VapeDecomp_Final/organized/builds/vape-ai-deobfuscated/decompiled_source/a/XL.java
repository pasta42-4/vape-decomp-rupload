/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KB;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.xml.generation.XmlGenerator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.comparison.EntityComparationStrategy;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.ProtocolInteractionController;
import com.network.streaming.DataStreamProcessor1233;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.system.configuration.SystemConfigurationManager2161;
import com.system.monitoring.ExecutionStateTracker;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.AssetLoadBalancer;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xL
extends XmlGenerator {
    private static final Object[] t;
    private final AuthenticationGateway1860 Y;
    private final GenericAdapterManager x;
    private static final String[] v;
    private static final long[] e;
    private final AuthenticationGateway1860 Z;
    private final AuthenticationGateway1860 T;
    private final AuthenticationGateway1860 G;
    private final AuthenticationStateTracker l;
    private boolean d;
    private static final Integer[] j;
    private final NumericPrecisionTransformer m;
    private final AuthenticationGateway1860 n;
    private final NumericFormattingUtility X;
    private final AuthenticationStateTracker F;
    private final AuthenticationStateTracker V;
    private int B;
    private final GenericAdapterManager o;
    private static final long b;
    private final CopyOnWriteArrayList<SystemConfigurationManager2161> h;
    private static final Map r;

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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = xL.a(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                xL.t[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void n(int n) {
        try {
            if (!this.F.s().booleanValue()) {
                ApplicationLifecycleManager.U().l().A(n);
                return;
            }
        }
        catch (InterruptedException interruptedException) {
            throw xL.a(interruptedException);
        }
        int n2 = ApplicationLifecycleManager.U().l().v();
        while (true) {
            ApplicationLifecycleManager.U().l().A(n2);
            try {
                Thread.sleep(((Double)this.m.J()).longValue());
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            try {
                if (n > n2) {
                    ++n2;
                    continue;
                }
            }
            catch (InterruptedException interruptedException) {
                throw xL.a(interruptedException);
            }
            try {
                if (n >= n2) break;
                --n2;
            }
            catch (InterruptedException interruptedException) {
                throw xL.a(interruptedException);
            }
        }
    }

    private static Method d(long l, long l2) {
        int n = xL.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = xL.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = xL.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xL.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        xL.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xL.b(272021254258471L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = xL.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        xL.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xL.b(272021254258471L, 0L);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xL.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = xL.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == 'u' || c == '\u00e6' || c == '\u00df') {
                field = xL.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xL.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Loose catch block
     */
    @Override
    public void W() {
        try {
            if (!this.d) {
                return;
            }
        }
        catch (Exception exception) {
            throw xL.a(exception);
        }
        try {
            ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = executionStateTracker.D();
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = executionStateTracker.D();
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = executionStateTracker.K();
            this.h.sort(new EntityComparationStrategy(this.B));
            boolean bl = false;
            for (SystemConfigurationManager2161 systemConfigurationManager2161 : this.h) {
                block16: {
                    block15: {
                        try {
                            this.n(systemConfigurationManager2161.y());
                            if (!connectionPoolOrchestrator1192.X() || !RuntimeResourceTracker.c(systemConfigurationManager2161.s().C())) break block15;
                        }
                        catch (Exception exception) {
                            throw xL.a(exception);
                        }
                        OutputEncoder.r(connectionPoolOrchestrator11922, false, false);
                        Thread.sleep(51L);
                        bl = true;
                    }
                    OutputEncoder.f(connectionPoolOrchestrator11922, true);
                    Thread.sleep(51L);
                    OutputEncoder.r(connectionPoolOrchestrator11922, false, false);
                    if (!this.l.s().booleanValue()) break block16;
                    try {
                        block18: {
                            if (!RuntimeResourceTracker.c(systemConfigurationManager2161.s().C())) break block16;
                            break block18;
                            catch (Exception exception) {
                                throw xL.a(exception);
                            }
                        }
                        OutputEncoder.f(connectionPoolOrchestrator11923, true);
                        Thread.sleep(51L);
                        OutputEncoder.r(connectionPoolOrchestrator11923, false, false);
                    }
                    catch (Exception exception) {
                        throw xL.a(exception);
                    }
                }
                Thread.sleep((long)this.X.l());
            }
            try {
                this.n(this.B);
                if (bl) {
                    OutputEncoder.f(connectionPoolOrchestrator11922, true);
                }
            }
            catch (Exception exception) {
                throw xL.a(exception);
            }
        }
        catch (Exception exception) {
            this.d = false;
            exception.printStackTrace();
        }
        this.d = false;
    }

    @Override
    public void h() {
        block11: {
            block10: {
                block9: {
                    try {
                        if (this.d) {
                            this.T(false);
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xL.a(customSystemException);
                    }
                    try {
                        try {
                            if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.X().r()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xL.a(customSystemException);
                        }
                        this.T(false);
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xL.a(customSystemException);
                    }
                }
                try {
                    if (this.d || !this.K()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw xL.a(customSystemException);
                }
                AssetLoadBalancer assetLoadBalancer = ApplicationLifecycleManager.U().l();
                this.B = assetLoadBalancer.v();
                this.d = true;
                this.K(0L, false);
                break block11;
            }
            this.h.clear();
            this.T(false);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xL.b = MultiContainerRegistry.a(3039581339404421041L, 8036486235883964885L, MethodHandles.lookup().lookupClass()).a(68292651766200L);
                xL.t = new Object[5];
                xL.v = new String[5];
                xL.a();
                xL.r = new HashMap<K, V>(13);
                var0 = xL.b ^ 26170999928549L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "v,<\u00d6~\u008a\u009c\u00ac\u00d4hV\u00f4\u008b\u0011O\u00c9d\u00ff\u00fc\u0082/\u00df\u008c\u00de15w\u00d8\u0095\u001ce\r\u0004\u0097\u00f8\u0096N*0\u00b5\u00b66%\u0083\u00ddw\u0080^Z\u0018\u0087\u00d18tKHM\u00c5\u00c6\u0091\u00a0%\u00a2le\u00a4\u00cc\u00d9\u0083\u0084T\u001e\u00a6\u00d1\u00d9\u00a7\u0004\u00f5\u0006Z\u0007H\u00af\u00a7\u00c3\u00a7\u00a3b\u009e\u00da\u00cf#\u00e8$\u0080-\u009f\u00fc\u00bf\u0015\u00cb?\u0081\u0089m\u0004\u00c7\u0083\u00bdgrfv\u00edV\t8\u0002\u00f1\u00eee\u008d\u00a7TE'^\u00ca\u00ccV\u0098\u00cct}\u0017<\f6\u00c3\u00b2\u0010\u0011\u007f\u00b9\u00b9\u00a5S\u0007\u00eb\u00da\u00d8x\u0092\u00d8\u00e8\u00b9i,\u00f5vL\u00ca\u00c4\u00c4\u00e9\u00a5\u00d1\\";
                var7_6 = "v,<\u00d6~\u008a\u009c\u00ac\u00d4hV\u00f4\u008b\u0011O\u00c9d\u00ff\u00fc\u0082/\u00df\u008c\u00de15w\u00d8\u0095\u001ce\r\u0004\u0097\u00f8\u0096N*0\u00b5\u00b66%\u0083\u00ddw\u0080^Z\u0018\u0087\u00d18tKHM\u00c5\u00c6\u0091\u00a0%\u00a2le\u00a4\u00cc\u00d9\u0083\u0084T\u001e\u00a6\u00d1\u00d9\u00a7\u0004\u00f5\u0006Z\u0007H\u00af\u00a7\u00c3\u00a7\u00a3b\u009e\u00da\u00cf#\u00e8$\u0080-\u009f\u00fc\u00bf\u0015\u00cb?\u0081\u0089m\u0004\u00c7\u0083\u00bdgrfv\u00edV\t8\u0002\u00f1\u00eee\u008d\u00a7TE'^\u00ca\u00ccV\u0098\u00cct}\u0017<\f6\u00c3\u00b2\u0010\u0011\u007f\u00b9\u00b9\u00a5S\u0007\u00eb\u00da\u00d8x\u0092\u00d8\u00e8\u00b9i,\u00f5vL\u00ca\u00c4\u00c4\u00e9\u00a5\u00d1\\".length();
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
                    var6_5 = "*\nJ\u00df,\u001b\u00eb\u009a\u0084\u00dc\u00f7|\u0089\u00a0O\u00df";
                    var7_6 = "*\nJ\u00df,\u001b\u00eb\u009a\u0084\u00dc\u00f7|\u0089\u00a0O\u00df".length();
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
        xL.e = var8_3;
        xL.j = new Integer[23];
    }

    private static Field c(long l, long l2) {
        int n = xL.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = xL.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = xL.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xL.a(clazz3, string2, clazz2)) != null) {
                    xL.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = xL.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        xL.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xL.b(272021254258471L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @DataExchangeProtocol2090
    public void v(KB kB) {
        block4: {
            try {
                try {
                    if (this.d || !this.Z()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw xL.a(customSystemException);
                }
                this.T(false);
            }
            catch (CustomSystemException customSystemException) {
                throw xL.a(customSystemException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = xL.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = xL.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = xL.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = t;
        t[0] = "\t>4";
        objectArray[1] = Integer.TYPE;
        xL.v[1] = "java/lang/Integer";
        objectArray[2] = "u0GIhp~?V\u0006\u0015hm8_O";
        objectArray[3] = "+\"\u0010 }\u0010 -\u0001o\u001c\u001e+&\u00055";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0003\b!PJcWZ>4]\u007fh\u0017wR_=T\t%T6=\nZw\b\ti\f\b=4";
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x744A;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xL.j[n2] = n3;
        }
        return j[n2];
    }

    @Override
    public void v() {
        this.h.clear();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean K() {
        boolean bl;
        long l = b ^ 0x64FFD66D1EC7L;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            for (int i = 0; i < 9; ++i) {
                arrayList.add(i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw xL.a(customSystemException);
        }
        try {
            if (this.V.s().booleanValue()) {
                Collections.shuffle(arrayList);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw xL.a(customSystemException);
        }
        Object[] objectArray = ApplicationLifecycleManager.U().l().C();
        int n = 0;
        for (Integer n2 : arrayList) {
            ProtocolInteractionController protocolInteractionController;
            LightweightExecutionContext lightweightExecutionContext;
            block53: {
                boolean bl2;
                block50: {
                    block51: {
                        boolean bl3;
                        boolean bl4;
                        block49: {
                            block48: {
                                boolean bl5;
                                block47: {
                                    block46: {
                                        lightweightExecutionContext = new LightweightExecutionContext(objectArray[n2]);
                                        try {
                                            if (lightweightExecutionContext.Y()) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw xL.a(customSystemException);
                                        }
                                        protocolInteractionController = lightweightExecutionContext.C();
                                        try {
                                            if (protocolInteractionController.Y()) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw xL.a(customSystemException);
                                        }
                                        try {
                                            try {
                                                if (!((NetworkConnectionEstablisher)this.o.J()).equals(this.G) && !((NetworkConnectionEstablisher)this.o.J()).equals(this.T)) break block46;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw xL.a(customSystemException);
                                            }
                                            bl5 = true;
                                            break block47;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw xL.a(customSystemException);
                                        }
                                    }
                                    bl5 = false;
                                }
                                bl4 = bl5;
                                try {
                                    try {
                                        if (!((NetworkConnectionEstablisher)this.o.J()).equals(this.Z) && !((NetworkConnectionEstablisher)this.o.J()).equals(this.T)) break block48;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xL.a(customSystemException);
                                    }
                                    bl3 = true;
                                    break block49;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw xL.a(customSystemException);
                                }
                            }
                            bl3 = false;
                        }
                        bl2 = bl3;
                        try {
                            try {
                                try {
                                    if (!RuntimeResourceTracker.c(protocolInteractionController) || !bl4) break block50;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw xL.a(customSystemException);
                                }
                                if (!((NetworkConnectionEstablisher)this.x.J()).equals(this.Y)) break block51;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xL.a(customSystemException);
                            }
                            this.h.add(new SystemConfigurationManager2161(n2, lightweightExecutionContext));
                            break;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xL.a(customSystemException);
                        }
                    }
                    int n3 = 8;
                    try {
                        if ((double)(n + n3) + Math.floor(ApplicationLifecycleManager.U().e()) > (double)ApplicationLifecycleManager.U().K()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xL.a(customSystemException);
                    }
                    n += n3;
                    this.h.add(new SystemConfigurationManager2161(n2, lightweightExecutionContext));
                }
                try {
                    try {
                        try {
                            if (!ReflectionMetadataResolver.Fl.isInstance(protocolInteractionController.M()) || !bl2) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xL.a(customSystemException);
                        }
                        if (!DataStreamProcessor1233.d(lightweightExecutionContext)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xL.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw xL.a(customSystemException);
                }
                try {
                    try {
                        if (!((NetworkConnectionEstablisher)this.x.J()).equals(this.Y) || !RuntimeResourceTracker.d(lightweightExecutionContext)) break block53;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xL.a(customSystemException);
                    }
                    this.h.add(new SystemConfigurationManager2161(n2, lightweightExecutionContext));
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw xL.a(customSystemException);
                }
            }
            DataStreamProcessor1233 dataStreamProcessor1233 = new DataStreamProcessor1233(protocolInteractionController.M());
            if (!RuntimeResourceTracker.d(lightweightExecutionContext)) continue;
            int n4 = 0;
            n4 = dataStreamProcessor1233.Q(lightweightExecutionContext).get(0).toString().contains((CharSequence)((Object)xL.c("M", (int)xL.a("y", (int)16198, (long)(0x57E7FB52BD8A6CE9L ^ l)), (long)-6349474920313304760L, (long)l))) ? (n4 += 4 * Integer.parseInt(dataStreamProcessor1233.Q(lightweightExecutionContext).get(0).toString().split((String)((Object)xL.c("M", (int)xL.a("y", (int)24205, (long)(0x5BA5A96A38B90D2CL ^ l)), (long)-6349474920313304760L, (long)l)))[1].split((String)((Object)xL.c("M", (int)xL.a("y", (int)12885, (long)(0x5BED5516998FE1EDL ^ l)), (long)-6349474920313304760L, (long)l)))[0])) : (n4 += 4);
            try {
                if ((double)(n + n4) + Math.floor(ApplicationLifecycleManager.U().e()) > (double)ApplicationLifecycleManager.U().K()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw xL.a(customSystemException);
            }
            n += n4;
            this.h.add(new SystemConfigurationManager2161(n2, lightweightExecutionContext));
        }
        try {
            bl = !this.h.isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw xL.a(customSystemException);
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = xL.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public xL() {
        long l = b ^ 0xA43E149943FL;
        super(a.cs((int)xL.a("y", (int)4587, (long)(0x68F5FA1839FC48BAL ^ l))), RecursiveNodeGraph.W, a.cs((int)xL.a("y", (int)11176, (long)(0x2F1B723E1A9272F3L ^ l))));
        this.T = new AuthenticationGateway1860((String)((Object)xL.c("M", (int)xL.a("y", (int)4517, (long)(0x5C9067DA21ECC8E6L ^ l)), (long)3249994259362595760L, (long)l)));
        this.Z = new AuthenticationGateway1860((String)((Object)xL.c("M", (int)xL.a("y", (int)22010, (long)(0x516A88D8E7F78CAFL ^ l)), (long)3249994259362595760L, (long)l)));
        this.G = new AuthenticationGateway1860((String)((Object)xL.c("M", (int)xL.a("y", (int)22281, (long)(0x64F9916B8AEA0E4BL ^ l)), (long)3249994259362595760L, (long)l)));
        this.o = GenericAdapterManager.D(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)8660, (long)(0x1A7E11F4715AF893L ^ l)), (long)3249994259362595760L, (long)l)), this.T, this.T, this.Z, this.G);
        this.n = new AuthenticationGateway1860((String)((Object)xL.c("M", (int)xL.a("y", (int)32053, (long)(0x224D6C633F212470L ^ l)), (long)3249994259362595760L, (long)l)));
        this.Y = new AuthenticationGateway1860((String)((Object)xL.c("M", (int)xL.a("y", (int)28040, (long)(0x2814849743A4B4D8L ^ l)), (long)3249994259362595760L, (long)l)));
        this.x = GenericAdapterManager.I(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)13151, (long)(0x7C4057F0D5CE6A0BL ^ l)), (long)3249994259362595760L, (long)l)), (String)((Object)xL.c("M", (int)xL.a("y", (int)5655, (long)(0x59EFF49902534F44L ^ l)), (long)3249994259362595760L, (long)l)), this.n, this.n, this.Y);
        this.m = NumericPrecisionTransformer.t(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)8788, (long)(0x57CEE61B4423FB06L ^ l)), (long)3249994259362595760L, (long)l)), (String)((Object)xL.c("M", (int)xL.a("y", (int)11668, (long)(0x25DB4453823E74CAL ^ l)), (long)3249994259362595760L, (long)l)), (String)((Object)xL.c("M", (int)xL.a("y", (int)15378, (long)(0x52C3E3CB487EE54EL ^ l)), (long)3249994259362595760L, (long)l)), 0.0, 100.0, 200.0);
        this.X = NumericFormattingUtility.y(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)3451, (long)(0x5C2393E18C98542DL ^ l)), (long)3249994259362595760L, (long)l)), (String)((Object)xL.c("M", (int)xL.a("y", (int)4110, (long)(0x6FBEC0EE4575C954L ^ l)), (long)3249994259362595760L, (long)l)), (String)((Object)xL.c("M", (int)xL.a("y", (int)6932, (long)(0x65ED4BC3B7C0C249L ^ l)), (long)3249994259362595760L, (long)l)), 0.0, 80.0, 115.0, 200.0, 1.0);
        this.F = AuthenticationStateTracker.w(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)6048, (long)(0x69F9E5A9EB55CEE4L ^ l)), (long)3249994259362595760L, (long)l)), false);
        this.V = AuthenticationStateTracker.w(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)31381, (long)(0x3A8034893C4DA3CAL ^ l)), (long)3249994259362595760L, (long)l)), false);
        this.l = AuthenticationStateTracker.R(this, (String)((Object)xL.c("M", (int)xL.a("y", (int)20435, (long)(0x1AF87EADAA719692L ^ l)), (long)3249994259362595760L, (long)l)), true, (String)((Object)xL.c("M", (int)xL.a("y", (int)9351, (long)(0x314EEDFE48A7FDDFL ^ l)), (long)3249994259362595760L, (long)l)));
        this.h = new CopyOnWriteArrayList();
        this.F.l(this.m);
        this.N(this.o, this.x, this.X, this.F, this.m, this.V, this.l);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n4] != null) {
            return n4;
        }
        Object object = t[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 30;
                break;
            }
            case 3: {
                n3 = 51;
                break;
            }
            case 4: {
                n3 = 29;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 20;
                break;
            }
            case 7: {
                n3 = 23;
                break;
            }
            case 8: {
                n3 = 48;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 57;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 42;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 52;
                break;
            }
            case 21: {
                n3 = 17;
                break;
            }
            case 22: {
                n3 = 0;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 13;
                break;
            }
            case 26: {
                n3 = 37;
                break;
            }
            case 27: {
                n3 = 28;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 34;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 9;
                break;
            }
            case 34: {
                n3 = 55;
                break;
            }
            case 35: {
                n3 = 16;
                break;
            }
            case 36: {
                n3 = 6;
                break;
            }
            case 37: {
                n3 = 1;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 45;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 53;
                break;
            }
            case 44: {
                n3 = 11;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 10;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 25;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 5;
                break;
            }
            case 57: {
                n3 = 61;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 46;
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
        xL.v[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

