/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.app.command.CommandExecutor;
import com.app.security.authentication.AuthenticationValidator2032;
import com.app.security.tokens.SecurityTokenGenerator2037;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.execution.CryptoOperationCoordinator;
import com.security.token.SecurityTokenGenerator2074;
import com.security.transform.CryptographicTransformer;
import com.transaction.management.TransactionOrchestrator1017;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ResourceAllocationTracker401
implements NetworkConfigurationResolver2717 {
    private final List<Long> l = new ArrayList<Long>();
    private static boolean J;
    private long B;
    private static final long a;
    private static final Object[] b;
    private long g;
    public static final ResourceAllocationTracker401 H;
    private int j;
    private static final String[] c;

    public long x() {
        return this.g;
    }

    private static Method d(long l, long l2) {
        int n = ResourceAllocationTracker401.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceAllocationTracker401.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationTracker401.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationTracker401.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationTracker401.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationTracker401.b(308117171625788L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationTracker401.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationTracker401.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationTracker401.b(308117171625788L, 0L);
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

    public int x() {
        return this.j;
    }

    public static CryptographicTransformer l(ConnectionLifecycleHandler connectionLifecycleHandler) {
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
            NetworkConnectionManager1286 networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler);
            return ApplicationLifecycleManager.c().I(networkConnectionManager1286.h());
        }
        return null;
    }

    private void u(CryptoOperationCoordinator cryptoOperationCoordinator) {
        CryptographicTransformer cryptographicTransformer;
        long l = a ^ 0x35AAC6AD7D77L;
        boolean bl = ResourceAllocationTracker401.l();
        if (cryptoOperationCoordinator.R().equals(SecurityTokenGenerator2037.M()) && (cryptographicTransformer = ApplicationLifecycleManager.c().I(cryptoOperationCoordinator.D())).B(ReflectionMetadataResolver.Ut)) {
            block13: {
                int n;
                block14: {
                    block12: {
                        TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer);
                        try {
                            try {
                                n = transactionOrchestrator1017.b();
                                if (bl) break block12;
                                if (n != 0) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationTracker401.a(customSystemException);
                            }
                            long l2 = System.currentTimeMillis() - this.B - 400L;
                            n = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker401.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (bl) break block14;
                            if (n <= 0) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker401.a(customSystemException);
                        }
                        long l3 = System.currentTimeMillis() - this.g - ResourceAllocationTracker401.a("g", (Object)this, (long)5418759094071353021L, (long)l) * 2L;
                        n = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker401.a(customSystemException);
                    }
                }
                try {
                    if (n > 0) {
                        this.B = System.currentTimeMillis();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker401.a(customSystemException);
                }
            }
            this.g = System.currentTimeMillis();
        }
    }

    public static CryptographicTransformer H(AuthenticationValidator2032 authenticationValidator2032) {
        try {
            if (authenticationValidator2032.C() == 1) {
                return ApplicationLifecycleManager.c().I(authenticationValidator2032.D());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker401.a(customSystemException);
        }
        return null;
    }

    public long S() {
        return this.B;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationTracker401.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationTracker401.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public long K() {
        long l;
        block8: {
            List<Long> list;
            boolean bl;
            block7: {
                long l2 = a ^ 0x261D49625E53L;
                l = 0L;
                bl = ResourceAllocationTracker401.D();
                try {
                    try {
                        list = this.l;
                        if (!bl) break block7;
                        if (list.isEmpty()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker401.a(customSystemException);
                    }
                    list = this.l;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker401.a(customSystemException);
                }
            }
            for (long l3 : list) {
                l += l3;
                try {
                    if (!bl) break block8;
                    if (bl) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker401.a(customSystemException);
                }
                AbstractComputationKernel.I(new String[4]);
                break;
            }
            l /= (long)this.l.size();
        }
        return l;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationTracker401.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationTracker401.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static {
        a = MultiContainerRegistry.a(-837018157830388339L, 166517276831797986L, MethodHandles.lookup().lookupClass()).a(259183336000358L);
        b = new Object[8];
        c = new String[8];
        ResourceAllocationTracker401.a();
        H = new ResourceAllocationTracker401();
        ResourceAllocationTracker401.L(false);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static boolean D() {
        boolean bl = ResourceAllocationTracker401.l();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker401.a(customSystemException);
        }
        return false;
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

    public List<Long> u() {
        return this.l;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationTracker401.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationTracker401.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = ResourceAllocationTracker401.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationTracker401.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationTracker401.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationTracker401.a(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationTracker401.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationTracker401.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationTracker401.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationTracker401.b(308117171625788L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void L(boolean bl) {
        J = bl;
    }

    @DataExchangeProtocol2090
    public void o(CommandExecutor commandExecutor) {
        this.j = commandExecutor.getTarget().X();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d0' || c == '\u00aa' || c == 's' || c == '$') {
                field = ResourceAllocationTracker401.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationTracker401.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n4] != null) {
            return n4;
        }
        Object object = b[n4];
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
                n3 = 24;
                break;
            }
            case 2: {
                n3 = 38;
                break;
            }
            case 3: {
                n3 = 34;
                break;
            }
            case 4: {
                n3 = 20;
                break;
            }
            case 5: {
                n3 = 21;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 59;
                break;
            }
            case 9: {
                n3 = 51;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 53;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 58;
                break;
            }
            case 14: {
                n3 = 45;
                break;
            }
            case 15: {
                n3 = 17;
                break;
            }
            case 16: {
                n3 = 32;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 54;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 1;
                break;
            }
            case 22: {
                n3 = 63;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 8;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 43;
                break;
            }
            case 28: {
                n3 = 3;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 33;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 16;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 9;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 52;
                break;
            }
            case 42: {
                n3 = 19;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 5;
                break;
            }
            case 46: {
                n3 = 11;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 14;
                break;
            }
            case 50: {
                n3 = 50;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 15;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 46;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 0;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 44;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 39;
                break;
            }
            default: {
                n3 = 12;
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
        ResourceAllocationTracker401.c[n4] = new String(cArray);
        return n4;
    }

    @DataExchangeProtocol2090
    public void n(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block6: {
            long l = a ^ 0x55FECE233A4BL;
            CryptographicTransformer cryptographicTransformer = ResourceAllocationTracker401.z(networkPacketOrchestrator1222.getPacket());
            try {
                try {
                    try {
                        if (cryptographicTransformer == null || !cryptographicTransformer.r()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker401.a(customSystemException);
                    }
                    if (cryptographicTransformer.X() != this.j) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker401.a(customSystemException);
                }
                ResourceAllocationTracker401.a("\u00f8", (Object)this, (long)869135224966374408L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker401.a(customSystemException);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationTracker401.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u001a9a";
        objectArray[1] = Long.TYPE;
        ResourceAllocationTracker401.c[1] = "java/lang/Long";
        objectArray[2] = Void.TYPE;
        ResourceAllocationTracker401.c[2] = "java/lang/Void";
        objectArray[3] = "j\fCB";
        objectArray[4] = "\u0000u!E\u000fs\u000bz0\nn}\u0000q4P";
        objectArray[5] = "Q=|\u001c7[\f7c,LcEiuV~XF+/,";
        objectArray[6] = ")OD*\u0011gtE[\u001aP_~\u0013I`\u0012n+PX~)";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "bp03!I?z/\u0003dq5qmyiHtn=\u007f\u0019K7{(8(\u001etj6\u0003";
    }

    private void q() {
        block10: {
            Object object;
            long l;
            block9: {
                long l2 = a ^ 0x9F2C4A4491EL;
                long l3 = System.currentTimeMillis() - this.B;
                boolean bl = ResourceAllocationTracker401.D();
                try {
                    try {
                        try {
                            long l4 = l3 - 500L;
                            l = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (!bl) break block9;
                            if (l >= 0) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationTracker401.a(customSystemException);
                        }
                        this.l.add(l3);
                        object = this.l;
                        if (!bl) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationTracker401.a(customSystemException);
                    }
                    l = object.size();
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationTracker401.a(customSystemException);
                }
            }
            try {
                if (l == 20) {
                    object = this.l.remove(0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationTracker401.a(customSystemException);
            }
        }
    }

    public int C() {
        long l = a ^ 0x36D058CCACD7L;
        return (int)Math.floor((double)ResourceAllocationTracker401.a("g", (Object)this, (long)-7308409993174479075L, (long)l) / 50.0);
    }

    public static CryptographicTransformer z(ConnectionLifecycleHandler connectionLifecycleHandler) {
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.ET)) {
            SecurityTokenGenerator2074 securityTokenGenerator2074 = new SecurityTokenGenerator2074(connectionLifecycleHandler);
            return ResourceAllocationTracker401.i(securityTokenGenerator2074);
        }
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rI)) {
            AuthenticationValidator2032 authenticationValidator2032 = new AuthenticationValidator2032(connectionLifecycleHandler);
            return ResourceAllocationTracker401.H(authenticationValidator2032);
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/J" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static CryptographicTransformer i(SecurityTokenGenerator2074 securityTokenGenerator2074) {
        try {
            if (securityTokenGenerator2074.d() == 2) {
                return ApplicationLifecycleManager.c().I(securityTokenGenerator2074.s());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker401.a(customSystemException);
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void U(NetworkEventDispatcher networkEventDispatcher) {
        long l = a ^ 0x2F93E23E6C45L;
        ConnectionLifecycleHandler connectionLifecycleHandler = networkEventDispatcher.getPacket();
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.rZ)) {
            CryptoOperationCoordinator cryptoOperationCoordinator = new CryptoOperationCoordinator(connectionLifecycleHandler);
            ResourceAllocationTracker401.a("\u00f8", (Object)this, (Object)cryptoOperationCoordinator, (long)6485725467930088710L, (long)l);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static boolean l() {
        return J;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationTracker401.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

