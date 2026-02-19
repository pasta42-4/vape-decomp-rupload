/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.oB;
import com.app.security.registry.SecureResourceRegistry;
import com.collections.management.MultiContainerRegistry;
import com.communication.messaging.ChatMessageOrchestrator;
import com.communication.protocol.DataExchangeProtocol2090;
import com.data.streaming.DataStreamProcessor1600;
import com.game.configuration.GameVersionEnumerator;
import com.game.player.PlayerMetadataResolver;
import com.game.player.events.PlayerEventManager;
import com.messaging.core.MessageRoutingEngine1898;
import com.network.traffic.NetworkTrafficAnalyzer2529;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.authentication.AuthenticationStateManager675;
import com.security.crypto.CryptographicContextManager895;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.lifecycle.ResourceLifecycleManager1984;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NetworkProtocolAdapter286
extends SecureResourceRegistry {
    private static final Object[] e;
    private static final String[] f;
    private static final Integer[] c;
    private static String[] m;
    private static final long a;
    private static final long[] b;
    private static final Map d;

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
                n3 = 14;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 38;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 53;
                break;
            }
            case 8: {
                n3 = 10;
                break;
            }
            case 9: {
                n3 = 55;
                break;
            }
            case 10: {
                n3 = 54;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 56;
                break;
            }
            case 13: {
                n3 = 32;
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
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 31;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 30;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 21;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 48;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 24;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 26;
                break;
            }
            case 33: {
                n3 = 40;
                break;
            }
            case 34: {
                n3 = 45;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 42;
                break;
            }
            case 37: {
                n3 = 39;
                break;
            }
            case 38: {
                n3 = 1;
                break;
            }
            case 39: {
                n3 = 43;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 47;
                break;
            }
            case 42: {
                n3 = 34;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 5;
                break;
            }
            case 46: {
                n3 = 37;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 3;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 36;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 28;
                break;
            }
            case 54: {
                n3 = 17;
                break;
            }
            case 55: {
                n3 = 13;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 16;
                break;
            }
            case 58: {
                n3 = 27;
                break;
            }
            case 59: {
                n3 = 4;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 23;
                break;
            }
            default: {
                n3 = 51;
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
        NetworkProtocolAdapter286.f[n4] = new String(cArray);
        return n4;
    }

    private CryptographicContextManager895 C(CryptographicContextManager895 cryptographicContextManager895) {
        CryptographicContextManager895 cryptographicContextManager8952;
        block18: {
            ArrayList<Object> arrayList;
            block17: {
                Object[] objectArray;
                long l = a ^ 0x2A21A387BC13L;
                try {
                    if (GameVersionEnumerator.MC_1_20_6.Q()) {
                        throw new UnsupportedOperationException((String)((Object)NetworkProtocolAdapter286.b("\u00c9", (int)NetworkProtocolAdapter286.a("w", (int)24420, (long)(0x1265CB34EC621F5FL ^ l)), (long)-4118794962729512427L, (long)l)));
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                boolean bl = false;
                arrayList = new ArrayList<Object>();
                for (Object object : objectArray = cryptographicContextManager895.w()) {
                    Object object2;
                    Object object3;
                    try {
                        if (object == null) {
                            arrayList.add(null);
                            continue;
                        }
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                    }
                    if (ReflectionMetadataResolver.V_.isInstance(object)) {
                        object3 = new AuthenticationStateManager675(object);
                        object2 = this.g((AuthenticationStateManager675)object3);
                        try {
                            arrayList.add(((ObjectLifecycleTracker)object2).M());
                            if (bl || ((ObjectLifecycleTracker)object3).equals(object2)) continue;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                        }
                        bl = true;
                        continue;
                    }
                    if (object instanceof String) {
                        object3 = (String)object;
                        object2 = this.t((String)object3, this.p());
                        try {
                            arrayList.add(object2);
                            if (bl || ((String)object3).equalsIgnoreCase((String)object2)) continue;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                        }
                        bl = true;
                        continue;
                    }
                    arrayList.add(object);
                }
                try {
                    if (bl) break block17;
                    cryptographicContextManager8952 = cryptographicContextManager895;
                    break block18;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
            }
            try {
                cryptographicContextManager8952 = GameVersionEnumerator.MC_1_20_6.H() ? CryptographicContextManager895.I(cryptographicContextManager895.S(), cryptographicContextManager895.r(), arrayList.toArray()) : CryptographicContextManager895.I(cryptographicContextManager895.S(), arrayList.toArray());
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        return cryptographicContextManager8952;
    }

    public static void u(String[] stringArray) {
        m = stringArray;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    @DataExchangeProtocol2090
    public void q(MessageRoutingEngine1898 messageRoutingEngine1898) {
        block10: {
            try {
                block9: {
                    try {
                        try {
                            if (GameVersionEnumerator.MC_1_16_5_ACTUAL.C() || !this.H()) break block9;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                        }
                        if (this.B()) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                    }
                }
                return;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        AuthenticationStateManager675 authenticationStateManager675 = messageRoutingEngine1898.getMessage();
        AuthenticationStateManager675 authenticationStateManager6752 = this.g(authenticationStateManager675);
        try {
            if (NetworkProtocolAdapter286.b(authenticationStateManager675, authenticationStateManager6752)) {
                messageRoutingEngine1898.setMessage(authenticationStateManager6752);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
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

    private static boolean b(AuthenticationStateManager675 authenticationStateManager675, AuthenticationStateManager675 authenticationStateManager6752) {
        boolean bl;
        block10: {
            block8: {
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    if (!authenticationStateManager675.r() || !authenticationStateManager6752.r()) break block8;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                                }
                                if (GameVersionEnumerator.MC_1_20_6.Q()) break block9;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                            }
                            if (authenticationStateManager675.equals(authenticationStateManager6752)) break block8;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/eX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == '\u00c8' || c == 'Y' || c == '\u00ba') {
                field = NetworkProtocolAdapter286.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolAdapter286.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(long l, long l2) {
        int n = NetworkProtocolAdapter286.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolAdapter286.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolAdapter286.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolAdapter286.a(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolAdapter286.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolAdapter286.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolAdapter286.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolAdapter286.b(260673982963647L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private AuthenticationStateManager675 g(AuthenticationStateManager675 authenticationStateManager675) {
        try {
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                return this.y(authenticationStateManager675);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                this.Y(authenticationStateManager675);
                return authenticationStateManager675;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
        TemporalMetadataResolver.k();
        return authenticationStateManager675;
    }

    private Set<ResourceLifecycleManager1984> m(AuthenticationStateManager675 authenticationStateManager675, Set<ResourceLifecycleManager1984> set) {
        long l = a ^ 0x16D2716C99F3L;
        try {
            if (GameVersionEnumerator.MC_1_16_5_ACTUAL.C()) {
                throw new UnsupportedOperationException((String)((Object)NetworkProtocolAdapter286.b("\u00c9", (int)NetworkProtocolAdapter286.a("w", (int)24229, (long)(0x13AAAC22EB793B7FL ^ l)), (long)-2074148153329846283L, (long)l)));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
        if (authenticationStateManager675.B(ReflectionMetadataResolver.EY)) {
            CryptographicContextManager895 cryptographicContextManager895 = new CryptographicContextManager895(authenticationStateManager675.M());
            for (Object object : cryptographicContextManager895.P()) {
                AuthenticationStateManager675 authenticationStateManager6752 = new AuthenticationStateManager675(object);
                if (authenticationStateManager6752.Y()) continue;
                try {
                    if (!authenticationStateManager6752.B(ReflectionMetadataResolver.V_)) {
                        continue;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                this.m(authenticationStateManager6752, set);
            }
        }
        for (AuthenticationStateManager675 authenticationStateManager6753 : authenticationStateManager675.F()) {
            Object object;
            if (authenticationStateManager6753.Y()) continue;
            try {
                if (!authenticationStateManager6753.B(ReflectionMetadataResolver.Fk)) {
                    continue;
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
            object = new ResourceLifecycleManager1984(authenticationStateManager6753.M());
            this.m((AuthenticationStateManager675)object, set);
        }
        try {
            if (authenticationStateManager675.B(ReflectionMetadataResolver.Fk)) {
                set.add(new ResourceLifecycleManager1984(authenticationStateManager675.M()));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
        return set;
    }

    public static String[] N() {
        return m;
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "F&0";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolAdapter286.f[1] = "java/lang/Integer";
        objectArray[2] = "t\f,pX6\u007f\u0003=?%.l\u00044v";
        objectArray[3] = "t+k}\u0015W\u007f$z2tYt/~h";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Z\u0011Z=gA\u0002S[\u0007kQf\u0012^>{@\u0016Q\u001c>|*_K\u0014:}\u001b\u001fU[}\u0000";
    }

    @DataExchangeProtocol2090
    public void X(PlayerEventManager playerEventManager) {
        block10: {
            try {
                block9: {
                    try {
                        try {
                            if (!this.a() || !this.H()) break block9;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                        }
                        if (this.B()) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                    }
                }
                return;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        AuthenticationStateManager675 authenticationStateManager675 = playerEventManager.getDisplayName();
        AuthenticationStateManager675 authenticationStateManager6752 = this.g(authenticationStateManager675);
        try {
            if (NetworkProtocolAdapter286.b(authenticationStateManager675, authenticationStateManager6752)) {
                playerEventManager.setDisplayName(authenticationStateManager6752);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
    }

    private void Y(AuthenticationStateManager675 authenticationStateManager675) {
        Set<ResourceLifecycleManager1984> set = this.m(authenticationStateManager675, new HashSet<ResourceLifecycleManager1984>());
        for (ResourceLifecycleManager1984 resourceLifecycleManager1984 : set) {
            String string = resourceLifecycleManager1984.h();
            String string2 = this.t(string, this.p());
            try {
                try {
                    if (string2 == null || string.equalsIgnoreCase(string2)) continue;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                resourceLifecycleManager1984.j(string2);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(5193173197256426631L, -6144070029641297077L, MethodHandles.lookup().lookupClass()).a(120223571583109L);
        e = new Object[5];
        f = new String[5];
        NetworkProtocolAdapter286.b();
        d = new HashMap(13);
        NetworkProtocolAdapter286.u(new String[2]);
        long l = a ^ 0x195541D76BCAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0018\u008ee(a\u0005\u00ffI\u00c7\u001f\u009b\u00dc%\n\u0098\u00992\u00c2\u00ba\u001a\u0015\u0083\u00dav";
        int n2 = "\u0018\u008ee(a\u0005\u00ffI\u00c7\u001f\u009b\u00dc%\n\u0098\u00992\u00c2\u00ba\u001a\u0015\u0083\u00dav".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolAdapter286.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolAdapter286.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/eX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private AuthenticationStateManager675 y(AuthenticationStateManager675 authenticationStateManager675) {
        AuthenticationStateManager675 authenticationStateManager6752;
        boolean bl;
        NetworkTrafficAnalyzer2529 networkTrafficAnalyzer2529 = authenticationStateManager675.P();
        NetworkTrafficAnalyzer2529 networkTrafficAnalyzer25292 = this.G(networkTrafficAnalyzer2529);
        try {
            bl = !networkTrafficAnalyzer2529.equals(networkTrafficAnalyzer25292);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
        boolean bl2 = bl;
        List<AuthenticationStateManager675> list = authenticationStateManager675.F();
        ArrayList<AuthenticationStateManager675> arrayList = new ArrayList<AuthenticationStateManager675>();
        for (AuthenticationStateManager675 authenticationStateManager6753 : list) {
            AuthenticationStateManager675 authenticationStateManager6754 = this.g(authenticationStateManager6753);
            try {
                arrayList.add(authenticationStateManager6754);
                if (bl2 || authenticationStateManager6754.equals(authenticationStateManager6753)) continue;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
            bl2 = true;
        }
        try {
            authenticationStateManager6752 = bl2 ? oB.m(networkTrafficAnalyzer25292, arrayList, authenticationStateManager675.i()) : authenticationStateManager675;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
        return authenticationStateManager6752;
    }

    private DataStreamProcessor1600 b(DataStreamProcessor1600 dataStreamProcessor1600) {
        DataStreamProcessor1600 dataStreamProcessor16002;
        block17: {
            String string;
            block16: {
                long l = a ^ 0x582BDFD97AF7L;
                try {
                    if (GameVersionEnumerator.MC_1_16_5_ACTUAL.b()) {
                        throw new UnsupportedOperationException((String)((Object)NetworkProtocolAdapter286.b("\u00c9", (int)NetworkProtocolAdapter286.a("w", (int)24052, (long)(0x29CEA1451B805B29L ^ l)), (long)14473729535382769L, (long)l)));
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                try {
                    if (dataStreamProcessor1600.Y()) {
                        return dataStreamProcessor1600;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                String string2 = dataStreamProcessor1600.M();
                try {
                    if (string2 == null) {
                        return dataStreamProcessor1600;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                string = this.t(string2, this.p());
                try {
                    if (string == null) {
                        return dataStreamProcessor1600;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
                try {
                    if (!string2.equalsIgnoreCase(string)) break block16;
                    dataStreamProcessor16002 = dataStreamProcessor1600;
                    break block17;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                }
            }
            try {
                dataStreamProcessor16002 = GameVersionEnumerator.MC_1_20_6.H() ? DataStreamProcessor1600.n(string) : DataStreamProcessor1600.Y(string);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        return dataStreamProcessor16002;
    }

    @DataExchangeProtocol2090
    public void i(PlayerMetadataResolver playerMetadataResolver) {
        block10: {
            try {
                block9: {
                    try {
                        try {
                            if (!this.a() || !this.H()) break block9;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                        }
                        if (this.B()) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw NetworkProtocolAdapter286.a(unsupportedOperationException);
                    }
                }
                return;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        AuthenticationStateManager675 authenticationStateManager675 = playerMetadataResolver.getDisplayName();
        AuthenticationStateManager675 authenticationStateManager6752 = this.g(authenticationStateManager675);
        try {
            if (NetworkProtocolAdapter286.b(authenticationStateManager675, authenticationStateManager6752)) {
                playerMetadataResolver.setDisplayName(authenticationStateManager6752);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolAdapter286.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolAdapter286.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolAdapter286.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private NetworkTrafficAnalyzer2529 G(NetworkTrafficAnalyzer2529 networkTrafficAnalyzer2529) {
        AuthenticationStateManager675 authenticationStateManager675;
        AuthenticationStateManager675 authenticationStateManager6752;
        if (networkTrafficAnalyzer2529.B(ReflectionMetadataResolver.VC)) {
            authenticationStateManager6752 = new DataStreamProcessor1600(networkTrafficAnalyzer2529.M());
            authenticationStateManager675 = this.b((DataStreamProcessor1600)authenticationStateManager6752);
            try {
                if (!authenticationStateManager6752.equals(authenticationStateManager675)) {
                    return new NetworkTrafficAnalyzer2529(authenticationStateManager675.M());
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        if (networkTrafficAnalyzer2529.B(ReflectionMetadataResolver.EY)) {
            authenticationStateManager6752 = new CryptographicContextManager895(networkTrafficAnalyzer2529.M());
            authenticationStateManager675 = this.C((CryptographicContextManager895)authenticationStateManager6752);
            try {
                if (!authenticationStateManager6752.equals(authenticationStateManager675)) {
                    return new NetworkTrafficAnalyzer2529(authenticationStateManager675.M());
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw NetworkProtocolAdapter286.a(unsupportedOperationException);
            }
        }
        return networkTrafficAnalyzer2529;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolAdapter286.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolAdapter286.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void e(ChatMessageOrchestrator chatMessageOrchestrator) {
        AuthenticationStateManager675 authenticationStateManager675 = chatMessageOrchestrator.getContentComponent();
        AuthenticationStateManager675 authenticationStateManager6752 = this.g(authenticationStateManager675);
        try {
            if (NetworkProtocolAdapter286.b(authenticationStateManager675, authenticationStateManager6752)) {
                chatMessageOrchestrator.setOutputContentComponent(authenticationStateManager6752);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw NetworkProtocolAdapter286.a(unsupportedOperationException);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6ED;
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
                throw new RuntimeException("a/eX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolAdapter286.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolAdapter286.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = NetworkProtocolAdapter286.a(l, l2);
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
                clazz3 = NetworkProtocolAdapter286.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolAdapter286.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolAdapter286.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolAdapter286.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolAdapter286.b(260673982963647L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolAdapter286.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolAdapter286.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolAdapter286.b(260673982963647L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolAdapter286.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolAdapter286.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

