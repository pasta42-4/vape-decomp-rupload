/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.context;

import a.Qh;
import a.Qv;
import com.caching.strategy.CacheInvalidationStrategy;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionUtility1855;
import com.event.management.AsyncEventDispatcher;
import com.event.management.EventDispatchCoordinator1090;
import com.event.management.EventDispatchCoordinator1933;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.analysis.NetworkTrafficAnalyzer;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.ConnectionPoolHandler;
import com.network.connection.ConnectionStateTracker;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolInteractionController;
import com.network.session.CommunicationSessionController;
import com.network.session.ConnectionSessionManager;
import com.network.sync.RealtimeSynchronizationManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.authentication.AuthenticationStateManager675;
import com.security.context.SecurityContextManager2112;
import com.security.crypto.CryptographicKeyManager2528;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.type.registry.DynamicTypeRegistry;
import com.version.management.VersionController;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LightweightExecutionContext
extends ObjectLifecycleTracker {
    private static final long[] b;
    private static final long a;
    private static final String[] g;
    private static final Map d;
    private static final Object[] e;
    private static int[] h;
    private static final Integer[] c;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ArrayList<Qv> H() {
        ConnectionPoolHandler connectionPoolHandler = EventDispatchCoordinator1090.h(this);
        Iterator iterator = connectionPoolHandler.e().iterator();
        ArrayList<Qv> arrayList = new ArrayList<Qv>();
        while (iterator.hasNext()) {
            CacheInvalidationStrategy cacheInvalidationStrategy = new CacheInvalidationStrategy(new ConnectionStateTracker(iterator.next()).q());
            arrayList.add(new Qv(cacheInvalidationStrategy.b()));
        }
        return arrayList;
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/V4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/V4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object h(Qh qh, Object object) {
        try {
            if (GameVersionEnumerator.MC_1_8_9.C()) {
                return DynamicTypeRegistry.E(LightweightExecutionContext.U.u().Le, this.H, qh.M(), object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LightweightExecutionContext.a(customSystemException);
        }
        return DynamicTypeRegistry.C(LightweightExecutionContext.U.u().Le, this.H, qh.M(), (Boolean)object);
    }

    public boolean C() {
        boolean bl;
        block11: {
            block10: {
                long l = a ^ 0x3FF2F2F3E357L;
                try {
                    if (GameVersionEnumerator.MC_1_20_6.H()) {
                        return EventDispatchCoordinator1090.J(this);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
                VersionController versionController = new VersionController(this.c());
                try {
                    if (versionController.Y()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
                try {
                    try {
                        if (!versionController.V((String)((Object)LightweightExecutionContext.b("O", (int)LightweightExecutionContext.a("u", (int)16930, (long)(0x5CED80D06D6E5F3FL ^ l)), (long)-3787762421606905631L, (long)l)), 9) && !versionController.V((String)((Object)LightweightExecutionContext.b("O", (int)LightweightExecutionContext.a("u", (int)16128, (long)(0x458C2C2BF76DA21CL ^ l)), (long)-3787762421606905631L, (long)l)), 9)) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    bl = true;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        return bl2;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = LightweightExecutionContext.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                LightweightExecutionContext.e[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public CompressionUtility1855 g() {
        return new CompressionUtility1855(DynamicTypeRegistry.A(LightweightExecutionContext.U.u().Le, this.H));
    }

    public void r(Object object) {
        LightweightExecutionContext.U.u().Le.F(this.H, object);
    }

    private static Field g(long l, long l2) {
        int n = LightweightExecutionContext.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = LightweightExecutionContext.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = LightweightExecutionContext.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = LightweightExecutionContext.c(clazz3, string2, clazz2)) != null) {
                    LightweightExecutionContext.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = LightweightExecutionContext.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        LightweightExecutionContext.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = LightweightExecutionContext.f(212524176782992L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public LightweightExecutionContext l() {
        return new LightweightExecutionContext(DynamicTypeRegistry.F(LightweightExecutionContext.U.u().Le, this.H));
    }

    public void S(int n) {
        DynamicTypeRegistry.v(LightweightExecutionContext.U.u().Le, this.H, n);
    }

    public String g() {
        if (GameVersionEnumerator.MC_1_16_5.H()) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(DynamicTypeRegistry.u(LightweightExecutionContext.U.u().Le, this.H));
            return authenticationStateManager675.i();
        }
        try {
            return DynamicTypeRegistry.N(LightweightExecutionContext.U.u().Le, this.H);
        }
        catch (Exception exception) {
            return "";
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = LightweightExecutionContext.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = LightweightExecutionContext.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = LightweightExecutionContext.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void S(CommunicationSessionController communicationSessionController, BiConsumer biConsumer) {
        DynamicTypeRegistry.I(LightweightExecutionContext.U.u().Le, this.H, communicationSessionController.M(), biConsumer);
    }

    public static void T(int[] nArray) {
        h = nArray;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 31;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 37;
                break;
            }
            case 7: {
                n3 = 43;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 12;
                break;
            }
            case 10: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 7;
                break;
            }
            case 14: {
                n3 = 19;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 0;
                break;
            }
            case 17: {
                n3 = 63;
                break;
            }
            case 18: {
                n3 = 22;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 34;
                break;
            }
            case 25: {
                n3 = 9;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 25;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 47;
                break;
            }
            case 31: {
                n3 = 1;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 17;
                break;
            }
            case 35: {
                n3 = 39;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 30;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 15;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 45;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 33;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 59;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 8;
                break;
            }
            case 50: {
                n3 = 11;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 56;
                break;
            }
            case 53: {
                n3 = 58;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 32;
                break;
            }
            case 59: {
                n3 = 44;
                break;
            }
            case 60: {
                n3 = 29;
                break;
            }
            case 61: {
                n3 = 53;
                break;
            }
            case 62: {
                n3 = 57;
                break;
            }
            default: {
                n3 = 13;
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
        LightweightExecutionContext.g[n4] = new String(cArray);
        return n4;
    }

    public int b() {
        return DynamicTypeRegistry.y(LightweightExecutionContext.U.u().Le, this.H);
    }

    public static int[] a() {
        return h;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == 'n' || c == '\u00ef' || c == 'w') {
                field = LightweightExecutionContext.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = LightweightExecutionContext.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'O' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void M(Qv qv2, int n) {
        DynamicTypeRegistry.T(LightweightExecutionContext.U.u().Le, this.H, qv2.M(), n);
    }

    public NetworkTrafficAnalyzer v(NetworkProtocolNegotiator networkProtocolNegotiator, Qh qh, SecurityContextManager2112 securityContextManager2112) {
        return new NetworkTrafficAnalyzer(LightweightExecutionContext.U.u().Le.h(this.M(), networkProtocolNegotiator.M(), qh.M(), securityContextManager2112.M()));
    }

    public void T(int n) {
        LightweightExecutionContext.U.u().Le.n(this.H, n);
    }

    public boolean y(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.n(lightweightExecutionContext) || !this.g().equals(lightweightExecutionContext.g())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Method h(long l, long l2) {
        int n = LightweightExecutionContext.e(l, l2);
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
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = LightweightExecutionContext.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = LightweightExecutionContext.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = LightweightExecutionContext.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        LightweightExecutionContext.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = LightweightExecutionContext.f(212524176782992L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = LightweightExecutionContext.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        LightweightExecutionContext.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = LightweightExecutionContext.f(212524176782992L, 0L);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = LightweightExecutionContext.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void d() {
        Object[] objectArray = e;
        e[0] = "$=G";
        objectArray[1] = Integer.TYPE;
        LightweightExecutionContext.g[1] = "java/lang/Integer";
        objectArray[2] = "\\ezx$EWjk7Y]Dmb~";
        objectArray[3] = "xj\u007fHx\u0015sen\u0007\u0019\u001bxnj]";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "P\u00127_43\u000fA`>ayaTd\u0006{h\u000f\u0013`\u0004\n;\u0013Ol\u0004c?\u001aWa>";
    }

    public ProtocolInteractionController C() {
        return new ProtocolInteractionController(LightweightExecutionContext.U.u().Le.B(this.H));
    }

    public static LightweightExecutionContext d(ProtocolInteractionController protocolInteractionController) {
        return new LightweightExecutionContext(LightweightExecutionContext.U.u().Le.s(protocolInteractionController.M()));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                LightweightExecutionContext.a = MultiContainerRegistry.a(7414362838104530712L, -8508287562324963262L, MethodHandles.lookup().lookupClass()).a(121424538413383L);
                LightweightExecutionContext.e = new Object[5];
                LightweightExecutionContext.g = new String[5];
                LightweightExecutionContext.d();
                LightweightExecutionContext.d = new HashMap<K, V>(13);
                LightweightExecutionContext.T(new int[4]);
                var0 = LightweightExecutionContext.a ^ 95619676059624L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00cd\u0084\"\u00a2\u00c9\u00e1\u00a7\u000e\u0085\u009f\u00ad\u008e\u00e9Y\u0081\u0004\\.\u00f2\u00f2\u00c2\u00a1zO\u0018\u00c9\u0081oS\u0018\u0010\u00a5";
                var7_6 = "\u00cd\u0084\"\u00a2\u00c9\u00e1\u00a7\u000e\u0085\u009f\u00ad\u008e\u00e9Y\u0081\u0004\\.\u00f2\u00f2\u00c2\u00a1zO\u0018\u00c9\u0081oS\u0018\u0010\u00a5".length();
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
                    var6_5 = "{5\u00a3\u00dd\u001f\u0018\u00ad\t+\u00e9JE\u00bd\u0088\u00deF";
                    var7_6 = "{5\u00a3\u00dd\u001f\u0018\u00ad\t+\u00e9JE\u00bd\u0088\u00deF".length();
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
        LightweightExecutionContext.b = var8_3;
        LightweightExecutionContext.c = new Integer[6];
    }

    public int J() {
        return LightweightExecutionContext.U.u().Le.F(this.H);
    }

    public Object k(CryptographicKeyManager2528 cryptographicKeyManager2528) {
        return DynamicTypeRegistry.E(LightweightExecutionContext.U.u().Le, this.H, cryptographicKeyManager2528.M());
    }

    public int D() {
        return DynamicTypeRegistry.o(LightweightExecutionContext.U.u().Le, this.H);
    }

    public boolean p() {
        boolean bl;
        block19: {
            block18: {
                block16: {
                    boolean bl2;
                    block17: {
                        try {
                            try {
                                if (!GameVersionEnumerator.MC_1_12_2.Q()) break block16;
                                if (!this.Y()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw LightweightExecutionContext.a(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw LightweightExecutionContext.a(customSystemException);
                        }
                    }
                    try {
                        if (this.J() <= 0) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    ProtocolInteractionController protocolInteractionController = this.C();
                    try {
                        if (protocolInteractionController.Y()) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    try {
                        bl2 = protocolInteractionController.O() == 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    return bl2;
                }
                try {
                    try {
                        if (!this.Y() && !LightweightExecutionContext.U.u().Le.e(this.M())) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    bl = true;
                    break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean Y() {
        boolean bl;
        block11: {
            block10: {
                long l = a ^ 0x2EE86E594916L;
                try {
                    if (super.Y()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
                try {
                    if (this.toString().contains((CharSequence)((Object)LightweightExecutionContext.b("O", (int)LightweightExecutionContext.a("u", (int)12694, (long)(0x56915FB71DA386C9L ^ l)), (long)7002599615633990304L, (long)l)))) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
                String string = this.g();
                try {
                    try {
                        if (!string.isEmpty() && !string.equals(LightweightExecutionContext.b("O", (int)LightweightExecutionContext.a("u", (int)2782, (long)(0x6D25EF182DC83D87L ^ l)), (long)7002599615633990304L, (long)l))) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LightweightExecutionContext.a(customSystemException);
                    }
                    bl = true;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public EventDispatchCoordinator1933 P() {
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            AsyncEventDispatcher asyncEventDispatcher = AsyncEventDispatcher.Z();
            this.S(CommunicationSessionController.g(), asyncEventDispatcher::t);
            return asyncEventDispatcher;
        }
        try {
            if (GameVersionEnumerator.MC_1_12_2.H()) {
                return new EventDispatchCoordinator1933(DynamicTypeRegistry.V(LightweightExecutionContext.U.u().Le, this.H, CommunicationSessionController.g().M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LightweightExecutionContext.a(customSystemException);
        }
        return new EventDispatchCoordinator1933(DynamicTypeRegistry.r(LightweightExecutionContext.U.u().Le, this.H));
    }

    public int j() {
        return DynamicTypeRegistry.p(LightweightExecutionContext.U.u().Le, this.H);
    }

    public boolean n(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (GeometryCalculator.C() >= 37) {
                return LightweightExecutionContext.U.u().Le.j(this.H, lightweightExecutionContext.C().M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LightweightExecutionContext.a(customSystemException);
        }
        return LightweightExecutionContext.U.u().Le.j(this.H, lightweightExecutionContext.M());
    }

    @Override
    public String M() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.C().n();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LightweightExecutionContext.a(customSystemException);
        }
        return LightweightExecutionContext.U.u().Le.H(this.M());
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5673;
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
                throw new RuntimeException("a/V4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            LightweightExecutionContext.c[n2] = n3;
        }
        return c[n2];
    }

    public float B(int n, int n2, int n3) {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        if (GameVersionEnumerator.MC_1_12_2.H()) {
            NetworkConnectionOrchestrator networkConnectionOrchestrator = connectionConfigurationResolver.T(ReflectionUtilityBroker.t(n, n2, n3));
            return DynamicTypeRegistry.S(LightweightExecutionContext.U.u().Le, this.H, networkConnectionOrchestrator.M());
        }
        return DynamicTypeRegistry.S(LightweightExecutionContext.U.u().Le, this.H, connectionConfigurationResolver.N(n, n2, n3).M());
    }

    public LightweightExecutionContext(Object object) {
        super(object);
    }

    public List<String> n() {
        ConnectionSessionManager connectionSessionManager;
        ArrayList<String> arrayList;
        long l;
        block8: {
            l = a ^ 0x6C100C742F52L;
            arrayList = new ArrayList<String>();
            VersionController versionController = new VersionController(this.c());
            try {
                if (versionController.Y()) {
                    return arrayList;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw LightweightExecutionContext.a(customSystemException);
            }
            connectionSessionManager = versionController.w((String)((Object)LightweightExecutionContext.b("O", (int)LightweightExecutionContext.a("u", (int)31786, (long)(0xDAC7FE2C2BEAD30L ^ l)), (long)534373404087403748L, (long)l)));
            try {
                try {
                    if (!connectionSessionManager.Y() && connectionSessionManager.B(ReflectionMetadataResolver.Ec)) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw LightweightExecutionContext.a(customSystemException);
                }
                return arrayList;
            }
            catch (CustomSystemException customSystemException) {
                throw LightweightExecutionContext.a(customSystemException);
            }
        }
        VersionController versionController = (VersionController)connectionSessionManager;
        CompressionUtility1855 compressionUtility1855 = versionController.H((String)((Object)LightweightExecutionContext.b("O", (int)LightweightExecutionContext.a("u", (int)21679, (long)(0x49AA453AAA2E05B3L ^ l)), (long)534373404087403748L, (long)l)), 8);
        for (int i = 0; i < compressionUtility1855.Y(); ++i) {
            String string = compressionUtility1855.c(i);
            arrayList.add(string);
        }
        return arrayList;
    }

    public Object c() {
        return LightweightExecutionContext.U.u().Le.Z(this.H);
    }

    public boolean L(RealtimeSynchronizationManager realtimeSynchronizationManager) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return LightweightExecutionContext.U.u().Le.p(this.M(), realtimeSynchronizationManager.M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LightweightExecutionContext.a(customSystemException);
        }
        return true;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = LightweightExecutionContext.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = LightweightExecutionContext.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(LightweightExecutionContext.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(LightweightExecutionContext.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

