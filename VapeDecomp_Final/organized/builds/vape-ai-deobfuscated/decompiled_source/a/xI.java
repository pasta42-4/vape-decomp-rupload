/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AN;
import com.app.compression.CompressionUtility2656;
import com.app.config.management.ConfigurationRegistry;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.security.tokens.SecurityTokenGenerator2037;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrency.synchronization.ThreadSynchronizationLock;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.math.transformation.NumericTransformationEngine1068;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.event.NetworkEventDispatcher;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.numeric.precision.NumericPrecisionTransformer;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthenticationTokenGenerator788;
import com.security.execution.CryptoOperationCoordinator;
import com.security.transform.CryptographicTransformer;
import com.system.core.SystemStateOrchestrator1145;
import com.system.core.SystemStateOrchestrator1930;
import com.system.monitoring.RuntimeResourceTracker;
import com.transaction.management.TransactionOrchestrator1017;
import com.user.session.SessionManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class xI
extends ContextTransformationEngine<AN> {
    private CryptographicTransformer t;
    private static final Object[] o;
    private static final long[] j;
    private final ThreadSynchronizationLock d;
    private static final Integer[] m;
    private CompressionUtility2656 T;
    private final ObjectLifecycleMediator l;
    private long r;
    private long v;
    public final NumericPrecisionTransformer z;
    private static final long h;
    private static final Map n;
    private static final String[] x;
    private long V;
    private final Map<SystemStateOrchestrator1930, Long> e;
    private NumericTransformationEngine1068 L;

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = xI.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                xI.o[n] = clazz = Class.forName(x[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = xI.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = x[n];
                int n3 = string2.indexOf(8);
                clazz3 = xI.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = xI.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xI.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        xI.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xI.b(591701596820696L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = xI.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        xI.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xI.b(591701596820696L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (x[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 39;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 61;
                break;
            }
            case 6: {
                n3 = 19;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 9: {
                n3 = 44;
                break;
            }
            case 10: {
                n3 = 28;
                break;
            }
            case 11: {
                n3 = 2;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 35;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 37;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 1;
                break;
            }
            case 18: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 53;
                break;
            }
            case 20: {
                n3 = 23;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 10;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 25;
                break;
            }
            case 25: {
                n3 = 30;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 11;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 16;
                break;
            }
            case 32: {
                n3 = 48;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 4;
                break;
            }
            case 39: {
                n3 = 6;
                break;
            }
            case 40: {
                n3 = 29;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 17;
                break;
            }
            case 46: {
                n3 = 3;
                break;
            }
            case 47: {
                n3 = 38;
                break;
            }
            case 48: {
                n3 = 9;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 57;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 33;
                break;
            }
            case 53: {
                n3 = 49;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 34;
                break;
            }
            case 58: {
                n3 = 40;
                break;
            }
            case 59: {
                n3 = 52;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 60;
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
        xI.x[n4] = new String(cArray);
        return n4;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = xI.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void W(NetworkEventDispatcher networkEventDispatcher) {
        ConnectionLifecycleHandler connectionLifecycleHandler = networkEventDispatcher.getPacket();
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.L)) {
            AuthenticationTokenGenerator788 authenticationTokenGenerator788 = new AuthenticationTokenGenerator788(connectionLifecycleHandler);
            try {
                if (authenticationTokenGenerator788.W()) {
                    this.L = new NumericTransformationEngine1068(authenticationTokenGenerator788.s(), authenticationTokenGenerator788.L(), authenticationTokenGenerator788.J());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw xI.a(customSystemException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.NORMAL)
    public void i(NetworkEventDispatcher networkEventDispatcher) {
        long l;
        block16: {
            l = h ^ 0x3FCCEA55F196L;
            try {
                if (this.T.A()) {
                    this.p();
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw xI.a(customSystemException);
            }
            ConnectionLifecycleHandler connectionLifecycleHandler = networkEventDispatcher.getPacket();
            try {
                if (networkEventDispatcher.isCanceled()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw xI.a(customSystemException);
            }
            try {
                if (networkEventDispatcher.wasModified()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw xI.a(customSystemException);
            }
            try {
                block15: {
                    try {
                        try {
                            if (ApplicationLifecycleManager.U().Y() || this.l.n(connectionLifecycleHandler)) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xI.a(customSystemException);
                        }
                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.VX)) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xI.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw xI.a(customSystemException);
            }
        }
        xI.c("\u00fe", (Object)this, (Object)networkEventDispatcher, (long)-8402853191618943326L, (long)l);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C2;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xI.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xI.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xI.m[n2] = n3;
        }
        return m[n2];
    }

    public xI(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = h ^ 0x5C31B76A1544L;
        super(contextualExecutionFramework, string);
        this.z = NumericPrecisionTransformer.N(this, (String)((Object)xI.c("B", (int)xI.a("h", (int)24511, (long)(0x37D1A07E45C837CAL ^ l)), (long)8049817037390908049L, (long)l)), (String)((Object)xI.c("B", (int)xI.a("h", (int)25434, (long)(0x2016E46068738B2CL ^ l)), (long)8049817037390908049L, (long)l)), "", 0.0, 5.0, 50.0, 1.0);
        this.e = new LinkedHashMap<SystemStateOrchestrator1930, Long>();
        this.l = ObjectLifecycleMediator.P;
        this.d = new ThreadSynchronizationLock();
        this.T = ConfigurationRegistry.h;
        this.N(this.z);
    }

    private void p() {
        long l = h ^ 0x60FADD3525A5L;
        xI.c("r", (Object)this.d, (long)6868053456878333668L, (long)l);
        xI.c("r", (Object)this.d, (long)6870239067993576859L, (long)l);
        Iterator<Map.Entry<SystemStateOrchestrator1930, Long>> iterator = this.e.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<SystemStateOrchestrator1930, Long> entry = iterator.next();
            this.l.G(SystemStateOrchestrator1930.H(entry.getKey()));
            iterator.remove();
        }
        xI.c("r", (Object)this.d, (long)6869797391238936121L, (long)l);
        xI.c("r", (Object)this.d, (long)6869848388115555701L, (long)l);
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "\u0012mQ";
        objectArray[1] = Integer.TYPE;
        xI.x[1] = "java/lang/Integer";
        objectArray[2] = "s*9\u0013\u000b/x%(\\v7k\"!\u0015";
        objectArray[3] = "hZF\u0005";
        objectArray[4] = Void.TYPE;
        xI.x[4] = "java/lang/Void";
        objectArray[5] = "\u001b9\u001e\u0010";
        objectArray[6] = "7@\b@";
        objectArray[7] = Boolean.TYPE;
        xI.x[7] = "java/lang/Boolean";
        objectArray[8] = "[0~\u00058)P?oJY'[4k\u0010";
        objectArray[9] = "C\u00040y]2\u0016\u0012.>1>yG<{P#\u0000\u0006x\u007fJ\\";
        objectArray[10] = "\u0005}\u0014T1dPk\n\u0013]S?>\u0018V<uF\u007f\\R&\n";
        objectArray[11] = "+#^DR1);\u001f\u000e,6\u0010n\u000eU\u0014'y-\u0018H\u0014Z*/ZUS#kk^O,";
        objectArray[12] = "C\r\u001bjPVA\u0015Z .vxF_'OB\u0001\u0007\u001b#U=";
        objectArray[13] = "^=ioaU\\%(%\u001f|ep9~'C\f3/c'>Xpm{p\u0004\f%/p\u001f";
        objectArray[14] = "\u001c\u001b\u0016^)\u001fFT\u0011gy\u0007\u007f\u001d\u001d\u0001~\u001fD\u001b\u000e\u0006,|FT\u0015\u001bl\u001f\u0010JI\u000b\u0012";
        objectArray[15] = ";f 49qnp>sUA\u0001%,64`xdh2.\u001f";
        objectArray[16] = "\u0016)&2$kC?8uHb,j*0)zU+n43\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "\f\u0014\u0003\u00145N\u000e\fB^Kg7YS\u0005sX^\u001aE\u0018s%\r\u0018\u0007\u00054\\L\\\u0003\u001fK";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'V' || c == '\u00da' || c == '\u00ea' || c == '\u00ef') {
                field = xI.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'V' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xI.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String t() {
        long l = h ^ 0x545F4B169633L;
        String string = (String)((Object)xI.c("B", (int)xI.a("h", (int)27766, (long)(0xF185430903E0776L ^ l)), (long)-1386623126813668890L, (long)l)) + ((AN)this.n()).z.p() + (String)((Object)xI.c("B", (int)xI.a("h", (int)32318, (long)(0x1C98FD3324B7153DL ^ l)), (long)-1386623126813668890L, (long)l));
        return string;
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

    private boolean J(NetworkEventDispatcher networkEventDispatcher) {
        block4: {
            long l = h ^ 0x1CDBD8A2875AL;
            String[] stringArray = SystemStateOrchestrator1930.P();
            xI.c("r", (Object)this.d, (long)-166837583602004965L, (long)l);
            String[] stringArray2 = stringArray;
            Iterator<Map.Entry<SystemStateOrchestrator1930, Long>> iterator = this.e.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<SystemStateOrchestrator1930, Long> entry = iterator.next();
                SystemStateOrchestrator1930 systemStateOrchestrator1930 = entry.getKey();
                this.l.G(systemStateOrchestrator1930.E());
                iterator.remove();
                ConnectionLifecycleHandler connectionLifecycleHandler = systemStateOrchestrator1930.E().getPacket();
                try {
                    if (stringArray2 != null) {
                        if (stringArray2 != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw xI.a(customSystemException);
                }
            }
            xI.c("r", (Object)this.d, (long)-168585414840150842L, (long)l);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xI.h = MultiContainerRegistry.a(6433266821218271375L, 7449257398631161496L, MethodHandles.lookup().lookupClass()).a(36509495857006L);
                xI.o = new Object[18];
                xI.x = new String[18];
                xI.a();
                xI.n = new HashMap<K, V>(13);
                var0 = xI.h ^ 114389808293818L;
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
                var6_5 = "\u007f\u000b\u00bf\u00a7\u0096N9\u008bE\u00e4\u009e\u008e\u008e.\u00da\u000b";
                var7_6 = "\u007f\u000b\u00bf\u00a7\u0096N9\u008bE\u00e4\u009e\u008e\u008e.\u00da\u000b".length();
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
                    var6_5 = "\u00c52\u00f3\u00a0\u00ff\u009bWZ0\u0080\u00a3\u00cf\u0088yK\u00f1";
                    var7_6 = "\u00c52\u00f3\u00a0\u00ff\u009bWZ0\u0080\u00a3\u00cf\u0088yK\u00f1".length();
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
        xI.j = var8_3;
        xI.m = new Integer[4];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xI.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = xI.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = xI.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = x[n];
            int n2 = string.indexOf(8);
            Class clazz = xI.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = xI.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xI.a(clazz3, string2, clazz2)) != null) {
                    xI.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = xI.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        xI.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xI.b(591701596820696L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = xI.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void C() {
        long l = h ^ 0x6D5AB1E259CEL;
        Iterator<Map.Entry<SystemStateOrchestrator1930, Long>> iterator = this.e.entrySet().iterator();
        String[] stringArray = SystemStateOrchestrator1930.P();
        while (iterator.hasNext()) {
            block4: {
                long l2;
                Map.Entry<SystemStateOrchestrator1930, Long> entry = iterator.next();
                try {
                    long l3 = System.currentTimeMillis() - entry.getValue();
                    l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (stringArray == null) break block4;
                    if (l2 < 0) {
                        break;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw xI.a(customSystemException);
                }
                l2 = (long)this.l.G(SystemStateOrchestrator1930.H(entry.getKey()));
            }
            iterator.remove();
            if (stringArray != null) continue;
        }
    }

    @DataExchangeProtocol2090
    public void K(EventTriggerEngine eventTriggerEngine) {
        long l;
        block7: {
            l = h ^ 0x2B6CFA397015L;
            this.t = null;
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = SystemStateOrchestrator1145.j(10.0, 0.0f, true);
            try {
                try {
                    if (networkPacketInterceptor1107 == null || !networkPacketInterceptor1107.r()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw xI.a(customSystemException);
                }
                this.t = networkPacketInterceptor1107.l();
            }
            catch (CustomSystemException customSystemException) {
                throw xI.a(customSystemException);
            }
        }
        try {
            xI.c("r", (Object)this.d, (long)783751323621014356L, (long)l);
            xI.c("r", (Object)this.d, (long)785796351933333547L, (long)l);
            if (!this.e.isEmpty()) {
                xI.c("\u00fe", (Object)this, (long)785692187486730391L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw xI.a(customSystemException);
        }
        xI.c("r", (Object)this.d, (long)785358901225710473L, (long)l);
        xI.c("r", (Object)this.d, (long)785545121019375813L, (long)l);
    }

    private void lambda$flushPackets$0(SystemStateOrchestrator1930 systemStateOrchestrator1930) {
        this.l.G(SystemStateOrchestrator1930.H(systemStateOrchestrator1930));
    }

    @Override
    public void r() {
        this.p();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = xI.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = xI.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void J(NetworkEventDispatcher var1_1) {
        block139: {
            block135: {
                block136: {
                    block134: {
                        block137: {
                            block138: {
                                block133: {
                                    block119: {
                                        block130: {
                                            block131: {
                                                block125: {
                                                    block127: {
                                                        block128: {
                                                            block129: {
                                                                block126: {
                                                                    block123: {
                                                                        block124: {
                                                                            block122: {
                                                                                block121: {
                                                                                    block120: {
                                                                                        block113: {
                                                                                            block117: {
                                                                                                block118: {
                                                                                                    block114: {
                                                                                                        block116: {
                                                                                                            block115: {
                                                                                                                var2_2 = xI.h ^ 102410697152089L;
                                                                                                                var5_3 = var1_1.getPacket();
                                                                                                                var4_4 = SystemStateOrchestrator1930.P();
                                                                                                                try {
                                                                                                                    v0 = var5_3.B(ReflectionMetadataResolver.rZ);
                                                                                                                    if (var4_4 == null) break block113;
                                                                                                                    if (v0 != 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl75
                                                                                                                }
                                                                                                                catch (CustomSystemException v1) {
                                                                                                                    throw xI.a(v1);
                                                                                                                }
                                                                                                                var6_5 = new CryptoOperationCoordinator(var5_3);
                                                                                                                if (!var6_5.R().equals(SecurityTokenGenerator2037.M())) break block117;
                                                                                                                var7_7 = ApplicationLifecycleManager.c().I(var6_5.D());
                                                                                                                var8_8 = ResourceAllocationTracker401.H;
                                                                                                                if (!var7_7.B(ReflectionMetadataResolver.Ut)) break block117;
                                                                                                                var9_10 = new TransactionOrchestrator1017(var7_7);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v2 /* !! */  = var9_10.b();
                                                                                                                                v3 = var8_8.C();
                                                                                                                                if (var4_4 == null) break block114;
                                                                                                                                if (v2 /* !! */  <= v3) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl53
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v4) {
                                                                                                                                throw xI.a(v4);
                                                                                                                            }
                                                                                                                            cfr_temp_0 = System.currentTimeMillis() - this.r - 250L;
                                                                                                                            v5 /* !! */  = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                                            if (var4_4 == null) break block115;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v6) {
                                                                                                                            throw xI.a(v6);
                                                                                                                        }
                                                                                                                        if (v5 /* !! */  <= 0) break block116;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v7) {
                                                                                                                        throw xI.a(v7);
                                                                                                                    }
                                                                                                                    v5 /* !! */  = (long)xI.c("\u00fe", (Object)this, (Object)var1_1, (long)-1392937957983133037L, (long)var2_2);
                                                                                                                }
                                                                                                                catch (CustomSystemException v8) {
                                                                                                                    throw xI.a(v8);
                                                                                                                }
                                                                                                            }
                                                                                                            if (v5 /* !! */  != false) {
                                                                                                                return;
                                                                                                            }
                                                                                                            break block117;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                this.r = System.currentTimeMillis();
                                                                                                                if (var4_4 != null) break block117;
lbl53:
                                                                                                                // 2 sources

                                                                                                                v2 /* !! */  = var9_10.b();
                                                                                                                if (var4_4 == null) break block118;
                                                                                                            }
                                                                                                            catch (CustomSystemException v9) {
                                                                                                                throw xI.a(v9);
                                                                                                            }
                                                                                                            v3 = var8_8.C() + 1;
                                                                                                        }
                                                                                                        catch (CustomSystemException v10) {
                                                                                                            throw xI.a(v10);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (v2 /* !! */  > v3) break block117;
                                                                                                        v2 /* !! */  = (int)xI.c("\u00fe", (Object)this, (Object)var1_1, (long)-1392937957983133037L, (long)var2_2);
                                                                                                    }
                                                                                                    catch (CustomSystemException v11) {
                                                                                                        throw xI.a(v11);
                                                                                                    }
                                                                                                }
                                                                                                if (v2 /* !! */  != 0) {
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var4_4 != null) break block119;
lbl75:
                                                                                                // 2 sources

                                                                                                v0 = var5_3.B(ReflectionMetadataResolver.VF);
                                                                                            }
                                                                                            catch (CustomSystemException v12) {
                                                                                                throw xI.a(v12);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_4 == null) break block120;
                                                                                                if (v0 == 0) {
                                                                                                }
                                                                                                ** GOTO lbl126
                                                                                            }
                                                                                            catch (CustomSystemException v13) {
                                                                                                throw xI.a(v13);
                                                                                            }
                                                                                            v0 = var5_3.B(ReflectionMetadataResolver.VM);
                                                                                        }
                                                                                        catch (CustomSystemException v14) {
                                                                                            throw xI.a(v14);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var4_4 == null) break block121;
                                                                                            if (v0 == 0) {
                                                                                            }
                                                                                            ** GOTO lbl126
                                                                                        }
                                                                                        catch (CustomSystemException v15) {
                                                                                            throw xI.a(v15);
                                                                                        }
                                                                                        v0 = var5_3.B(ReflectionMetadataResolver.Uc);
                                                                                    }
                                                                                    catch (CustomSystemException v16) {
                                                                                        throw xI.a(v16);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var4_4 == null) break block122;
                                                                                        if (v0 == 0) {
                                                                                        }
                                                                                        ** GOTO lbl126
                                                                                    }
                                                                                    catch (CustomSystemException v17) {
                                                                                        throw xI.a(v17);
                                                                                    }
                                                                                    v0 = var5_3.B(ReflectionMetadataResolver.Ez);
                                                                                }
                                                                                catch (CustomSystemException v18) {
                                                                                    throw xI.a(v18);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var4_4 == null) break block123;
                                                                                    if (v0 == 0) break block124;
                                                                                }
                                                                                catch (CustomSystemException v19) {
                                                                                    throw xI.a(v19);
                                                                                }
lbl126:
                                                                                // 4 sources

                                                                                xI.c("\u00fe", (Object)this, (Object)var1_1, (long)-1393068129715993176L, (long)var2_2);
                                                                                return;
                                                                            }
                                                                            catch (CustomSystemException v20) {
                                                                                throw xI.a(v20);
                                                                            }
                                                                        }
                                                                        v0 = var5_3.B(ReflectionMetadataResolver.U5);
                                                                    }
                                                                    try {
                                                                        if (var4_4 == null) break block125;
                                                                        if (v0 != 0) {
                                                                        }
                                                                        ** GOTO lbl183
                                                                    }
                                                                    catch (CustomSystemException v21) {
                                                                        throw xI.a(v21);
                                                                    }
                                                                    var6_5 = new SessionManager(var5_3);
                                                                    var7_7 = var6_5.x();
                                                                    try {
                                                                        try {
                                                                            v22 = var7_7.r();
                                                                            if (var4_4 == null) break block126;
                                                                            if (v22 == 0) break block127;
                                                                        }
                                                                        catch (CustomSystemException v23) {
                                                                            throw xI.a(v23);
                                                                        }
                                                                        v22 = RuntimeResourceTracker.a(var7_7.C());
                                                                    }
                                                                    catch (CustomSystemException v24) {
                                                                        throw xI.a(v24);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_4 == null) break block128;
                                                                        if (v22 != 0) break block129;
                                                                    }
                                                                    catch (CustomSystemException v25) {
                                                                        throw xI.a(v25);
                                                                    }
                                                                    xI.c("\u00fe", (Object)this, (Object)var1_1, (long)-1393068129715993176L, (long)var2_2);
                                                                    this.V = System.currentTimeMillis() + 500L;
                                                                    return;
                                                                }
                                                                catch (CustomSystemException v26) {
                                                                    throw xI.a(v26);
                                                                }
                                                            }
                                                            cfr_temp_1 = System.currentTimeMillis() - this.v - 500L;
                                                            v22 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                        }
                                                        try {
                                                            if (v22 >= 0) {
                                                                xI.c("\u00fe", (Object)this, (Object)var1_1, (long)-1393068129715993176L, (long)var2_2);
                                                                this.v = System.currentTimeMillis();
                                                                return;
                                                            }
                                                        }
                                                        catch (CustomSystemException v27) {
                                                            throw xI.a(v27);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_4 != null) break block119;
lbl183:
                                                            // 2 sources

                                                            v28 = this;
                                                            if (var4_4 == null) break block130;
                                                        }
                                                        catch (CustomSystemException v29) {
                                                            throw xI.a(v29);
                                                        }
                                                        cfr_temp_2 = v28.V - System.currentTimeMillis();
                                                        v0 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                    }
                                                    catch (CustomSystemException v30) {
                                                        throw xI.a(v30);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        block132: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (v0 <= 0) {
                                                                                v31 = ApplicationLifecycleManager.U().G();
                                                                                if (var4_4 == null) break block131;
                                                                            }
                                                                            ** GOTO lbl245
                                                                        }
                                                                        catch (CustomSystemException v32) {
                                                                            throw xI.a(v32);
                                                                        }
                                                                        if (!v31) break block132;
                                                                    }
                                                                    catch (CustomSystemException v33) {
                                                                        throw xI.a(v33);
                                                                    }
                                                                    v31 = ApplicationLifecycleManager.U().w();
                                                                    if (var4_4 == null) break block131;
                                                                }
                                                                catch (CustomSystemException v34) {
                                                                    throw xI.a(v34);
                                                                }
                                                                if (v31) {
                                                                }
                                                                ** GOTO lbl245
                                                            }
                                                            catch (CustomSystemException v35) {
                                                                throw xI.a(v35);
                                                            }
                                                        }
                                                        v36 = ApplicationLifecycleManager.U();
                                                        if (var4_4 == null) break block133;
                                                    }
                                                    catch (CustomSystemException v37) {
                                                        throw xI.a(v37);
                                                    }
                                                    v31 = v36.j();
                                                }
                                                catch (CustomSystemException v38) {
                                                    throw xI.a(v38);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (v31) break block119;
                                                        v36 = ApplicationLifecycleManager.U();
                                                        if (var4_4 == null) break block133;
                                                    }
                                                    catch (CustomSystemException v39) {
                                                        throw xI.a(v39);
                                                    }
                                                    if (!(v36.W() > 3.0f)) break block119;
                                                }
                                                catch (CustomSystemException v40) {
                                                    throw xI.a(v40);
                                                }
lbl245:
                                                // 3 sources

                                                v28 = this;
                                            }
                                            catch (CustomSystemException v41) {
                                                throw xI.a(v41);
                                            }
                                        }
                                        xI.c("\u00fe", (Object)v28, (Object)var1_1, (long)-1393068129715993176L, (long)var2_2);
                                        return;
                                    }
                                    try {
                                        v42 = this;
                                        if (var4_4 == null) break block134;
                                        v36 = v42.t;
                                    }
                                    catch (CustomSystemException v43) {
                                        throw xI.a(v43);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (v36 != null) {
                                                            v42 = this;
                                                            if (var4_4 == null) break block134;
                                                        }
                                                        ** GOTO lbl324
                                                    }
                                                    catch (CustomSystemException v44) {
                                                        throw xI.a(v44);
                                                    }
                                                    if (v42.t.r()) {
                                                    }
                                                    ** GOTO lbl324
                                                }
                                                catch (CustomSystemException v45) {
                                                    throw xI.a(v45);
                                                }
                                                v42 = this;
                                                if (var4_4 == null) break block134;
                                            }
                                            catch (CustomSystemException v46) {
                                                throw xI.a(v46);
                                            }
                                            if (v42.t.B(ReflectionMetadataResolver.Ut)) {
                                            }
                                            ** GOTO lbl324
                                        }
                                        catch (CustomSystemException v47) {
                                            throw xI.a(v47);
                                        }
                                        v48 /* !! */  = var5_3;
                                        if (var4_4 == null) break block135;
                                    }
                                    catch (CustomSystemException v49) {
                                        throw xI.a(v49);
                                    }
                                    if (!v48 /* !! */ .B(ReflectionMetadataResolver.L)) break block136;
                                }
                                catch (CustomSystemException v50) {
                                    throw xI.a(v50);
                                }
                                var6_5 = new AuthenticationTokenGenerator788(var5_3);
                                try {
                                    if (this.L == null || !var6_5.W()) break block137;
                                }
                                catch (CustomSystemException v51) {
                                    throw xI.a(v51);
                                }
                                var7_7 = new NumericTransformationEngine1068(this.t.F(), this.t.V(), this.t.B());
                                var8_8 = new NumericTransformationEngine1068(var6_5.s(), var6_5.L(), var6_5.J());
                                try {
                                    try {
                                        v52 = this;
                                        if (var4_4 == null) break block138;
                                        if (!(NumericTransformationEngine1068.d(v52.L, (NumericTransformationEngine1068)var7_7) < NumericTransformationEngine1068.d((NumericTransformationEngine1068)var8_8, (NumericTransformationEngine1068)var7_7) - 0.03)) break block137;
                                    }
                                    catch (CustomSystemException v53) {
                                        throw xI.a(v53);
                                    }
                                    v52 = this;
                                }
                                catch (CustomSystemException v54) {
                                    throw xI.a(v54);
                                }
                            }
                            xI.c("\u00fe", (Object)v52, (Object)var1_1, (long)-1393068129715993176L, (long)var2_2);
                            return;
                        }
                        try {
                            if (var4_4 != null) break block136;
lbl324:
                            // 4 sources

                            v42 = this;
                        }
                        catch (CustomSystemException v55) {
                            throw xI.a(v55);
                        }
                    }
                    xI.c("\u00fe", (Object)v42, (Object)var1_1, (long)-1393068129715993176L, (long)var2_2);
                    return;
                }
                v48 /* !! */  = ((AN)this.n()).z.J();
            }
            var6_6 = ((Double)v48 /* !! */ ).longValue();
            var8_9 = System.currentTimeMillis() + var6_6;
            var10_11 = System.currentTimeMillis();
            xI.c("r", (Object)this.d, (long)-1392804332532390297L, (long)var2_2);
            for (Map.Entry<SystemStateOrchestrator1930, Long> var13_13 : this.e.entrySet()) {
                block141: {
                    block142: {
                        block140: {
                            var14_14 = var13_13.getKey();
                            var15_15 = var14_14.E().getPacket();
                            try {
                                try {
                                    v56 = var15_15;
                                    if (var4_4 == null) break block139;
                                    if (v56.B(ReflectionMetadataResolver.L)) break block140;
                                }
                                catch (CustomSystemException v57) {
                                    throw xI.a(v57);
                                }
                                if (var4_4 != null) continue;
                            }
                            catch (CustomSystemException v58) {
                                throw xI.a(v58);
                            }
                        }
                        var16_16 = new AuthenticationTokenGenerator788(var15_15);
                        try {
                            try {
                                v59 = var16_16;
                                if (var4_4 == null) break block141;
                                if (v59.W()) break block142;
                            }
                            catch (CustomSystemException v60) {
                                throw xI.a(v60);
                            }
                            if (var4_4 != null) continue;
                        }
                        catch (CustomSystemException v61) {
                            throw xI.a(v61);
                        }
                    }
                    v59 = var13_13.getValue();
                }
                var10_11 = (Long)v59;
                if (var4_4 != null) continue;
            }
            var8_9 = Math.min(var10_11 + 90L, var8_9);
            xI.c("r", (Object)this.d, (long)-1393117067344456055L, (long)var2_2);
            xI.c("r", (Object)this.d, (long)-1392729502359167720L, (long)var2_2);
            v56 = this.e.put(new SystemStateOrchestrator1930(this, var1_1), var8_9);
        }
        xI.c("r", (Object)this.d, (long)-1393211477883681339L, (long)var2_2);
        var1_1.setCanceled(true);
    }

    /*
     * Unable to fully structure code
     */
    private void d(NetworkEventDispatcher var1_1) {
        block23: {
            block17: {
                block22: {
                    block21: {
                        block18: {
                            var2_2 = xI.h ^ 14209900985604L;
                            v0 = SystemStateOrchestrator1930.P();
                            xI.c("r", (Object)this.d, (long)-4039352637914810811L, (long)var2_2);
                            var4_3 = v0;
                            xI.c("r", (Object)this.d, (long)-4037879357859427014L, (long)var2_2);
                            var5_4 = ((Double)this.z.J()).longValue();
                            try {
                                if (var4_3 == null) break block17;
                                if (var5_4 > 0L) {
                                }
                                ** GOTO lbl60
                            }
                            catch (CustomSystemException v1) {
                                throw xI.a(v1);
                            }
                            var7_5 = 0L;
                            for (Map.Entry<SystemStateOrchestrator1930, Long> var10_7 : this.e.entrySet()) {
                                block19: {
                                    var11_8 = var10_7.getKey();
                                    var7_5 += var5_4;
                                    try {
                                        try {
                                            try {
                                                v2 = var11_8;
                                                if (var4_3 == null) break block18;
                                                if (var4_3 == null) break block19;
                                            }
                                            catch (CustomSystemException v3) {
                                                throw xI.a(v3);
                                            }
                                            if (v2.w()) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException v4) {
                                            throw xI.a(v4);
                                        }
                                    }
                                    catch (CustomSystemException v5) {
                                        throw xI.a(v5);
                                    }
                                    var10_7.setValue(System.currentTimeMillis() + var7_5);
                                    v6 = var11_8;
                                }
                                v6.I(true);
                                if (var4_3 != null) continue;
                            }
                            try {
                                try {
                                    v7 = var1_1;
                                    if (var4_3 == null) break block21;
                                    if (v7 == null) break block22;
                                }
                                catch (CustomSystemException v8) {
                                    throw xI.a(v8);
                                }
                                v2 = this.e.put(new SystemStateOrchestrator1930(this, var1_1), System.currentTimeMillis() + var7_5 + var5_4);
                            }
                            catch (CustomSystemException v9) {
                                throw xI.a(v9);
                            }
                        }
                        v7 = var1_1;
                    }
                    v7.setCanceled(true);
                }
                try {
                    if (var4_3 != null) break block23;
lbl60:
                    // 2 sources

                    this.e.keySet().forEach((Consumer<SystemStateOrchestrator1930>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$flushPackets$0(com.system.core.SystemStateOrchestrator1930 ), (Lcom/system/core/SystemStateOrchestrator1930;)V)((xI)this));
                }
                catch (CustomSystemException v10) {
                    throw xI.a(v10);
                }
            }
            this.e.clear();
        }
        xI.c("r", (Object)this.d, (long)-4037487372260704812L, (long)var2_2);
        xI.c("r", (Object)this.d, (long)-4037758257402532200L, (long)var2_2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

