/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package com.data.conversion;

import a.Ry;
import a._b;
import a.ew;
import com.collections.management.MultiContainerRegistry;
import com.data.archival.TemporalDataArchiver;
import com.data.serialization.SerializationOrchestrator;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.math.computation.IntegerComputationManager;
import com.security.protocol.EncryptionProtocolHandler397;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.GraphicalRenderingController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TemporalDataTransformer {
    private final Date e;
    private static final Map g;
    static final boolean Z;
    private final boolean d;
    private final long l;
    @Nullable
    private Boolean y;
    private static final long a;
    private final Date K;
    private final long i;
    @Nullable
    private TemporalDataArchiver G;
    private static final String[] j;
    private final String u;
    private final boolean I;
    private static final Object[] h;
    private final long b;
    private static final long[] c;
    private final ew V;
    private static final Integer[] f;

    public boolean s() {
        return this.d;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "B&.";
        objectArray[1] = Integer.TYPE;
        TemporalDataTransformer.j[1] = "java/lang/Integer";
        objectArray[2] = "/\u0015]\u0003E!$\u001aLL897\u001dE\u0005";
        objectArray[3] = "CVu\u0019\u001awHYdV{yCR`\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "B\u0016C\u0017Z3\u0019\u0007_i\n5xB\u001f\u0004\n3\b\tA\u0014\bNA\u0006N\r\r)AB\u0019\ra";
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    @Contract(value="!null -> !null; null -> null")
    public static TemporalDataTransformer f(@Nullable JsonElement jsonElement) {
        long l;
        block6: {
            l = a ^ 0xD4E97B02CA8L;
            if (jsonElement == null) return null;
            try {
                if (!jsonElement.isJsonNull()) break block6;
                return null;
                catch (ParseException parseException) {
                    throw TemporalDataTransformer.a(parseException);
                }
            }
            catch (ParseException parseException) {
                throw TemporalDataTransformer.a(parseException);
            }
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        try {
            return new TemporalDataTransformer(jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)9077, (long)(0x747082DB3EAC719CL ^ l)), (long)3424793127630312145L, (long)l))).getAsLong(), jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)3064, (long)(0x3CCE8E457932D91BL ^ l)), (long)3424793127630312145L, (long)l))).getAsLong(), SerializationOrchestrator.k(jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)22233, (long)(0x7B6274805C978425L ^ l)), (long)3424793127630312145L, (long)l))).getAsString()), SerializationOrchestrator.k(jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)32092, (long)(0x6A1D98EADBA62FA4L ^ l)), (long)3424793127630312145L, (long)l))).getAsString()), ew.m(jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)28161, (long)(0x5FB910F588C3BCE0L ^ l)), (long)3424793127630312145L, (long)l)))), jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)32395, (long)(0x7F8669DCD59E2C67L ^ l)), (long)3424793127630312145L, (long)l))).getAsString(), jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)32004, (long)(0x3555B726952E2FE4L ^ l)), (long)3424793127630312145L, (long)l))).getAsBoolean(), jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)19583, (long)(0x59C28B30DD29E99L ^ l)), (long)3424793127630312145L, (long)l))).getAsLong(), jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)3298, (long)(0x51FC3AC47E98DE0AL ^ l)), (long)3424793127630312145L, (long)l))).getAsBoolean(), EncryptionProtocolHandler397.O(jsonObject, (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)678, (long)(0x1231FB614B76D042L ^ l)), (long)3424793127630312145L, (long)l))), TemporalDataArchiver.T(jsonObject.get((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)24418, (long)(0xF8A91A887E0D88L ^ l)), (long)3424793127630312145L, (long)l)))));
        }
        catch (ParseException parseException) {
            throw new RuntimeException(parseException);
        }
    }

    private static Field c(long l, long l2) {
        int n = TemporalDataTransformer.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = TemporalDataTransformer.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TemporalDataTransformer.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TemporalDataTransformer.a(clazz3, string2, clazz2)) != null) {
                    TemporalDataTransformer.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TemporalDataTransformer.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TemporalDataTransformer.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TemporalDataTransformer.b(243870162100779L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public long O() {
        return this.l;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 39;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 0;
                break;
            }
            case 6: {
                n3 = 36;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 60;
                break;
            }
            case 16: {
                n3 = 30;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 6;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 33;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 20;
                break;
            }
            case 27: {
                n3 = 35;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 7;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 44;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 59;
                break;
            }
            case 35: {
                n3 = 53;
                break;
            }
            case 36: {
                n3 = 2;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 52;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 43;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 19;
                break;
            }
            case 46: {
                n3 = 24;
                break;
            }
            case 47: {
                n3 = 27;
                break;
            }
            case 48: {
                n3 = 42;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 11;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 23;
                break;
            }
            case 54: {
                n3 = 41;
                break;
            }
            case 55: {
                n3 = 16;
                break;
            }
            case 56: {
                n3 = 21;
                break;
            }
            case 57: {
                n3 = 49;
                break;
            }
            case 58: {
                n3 = 26;
                break;
            }
            case 59: {
                n3 = 14;
                break;
            }
            case 60: {
                n3 = 38;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 40;
                break;
            }
            default: {
                n3 = 18;
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
        TemporalDataTransformer.j[n4] = new String(cArray);
        return n4;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TemporalDataTransformer.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void c(Ry ry, Runnable runnable) {
        _b.S().M().w(this).whenCompleteAsync((arg_0, arg_1) -> this.lambda$deleteReview$0(ry, runnable, arg_0, arg_1), (Executor)GraphicalRenderingController.st);
    }

    private void lambda$deleteReview$0(Ry ry, Runnable runnable, TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        block17: {
            block16: {
                block15: {
                    long l = a ^ 0x6EBD4ABBF6E4L;
                    try {
                        if (throwable != null) {
                            TemporalMetadataResolver.W(throwable);
                            return;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw TemporalDataTransformer.a(runtimeException);
                    }
                    try {
                        if (!transactionStatusTracker.b()) {
                            TemporalMetadataResolver.x((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)26231, (long)(0x605DA0FB9C9DEED5L ^ l)), (long)-735444878442280803L, (long)l)) + transactionStatusTracker.A());
                            IntegerComputationManager.q((String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)27877, (long)(0x7D35A1B2EA1CE44CL ^ l)), (long)-735444878442280803L, (long)l)) + transactionStatusTracker.A());
                            return;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw TemporalDataTransformer.a(runtimeException);
                    }
                    try {
                        try {
                            if (Z || transactionStatusTracker.h() != null) break block15;
                        }
                        catch (RuntimeException runtimeException) {
                            throw TemporalDataTransformer.a(runtimeException);
                        }
                        throw new AssertionError();
                    }
                    catch (RuntimeException runtimeException) {
                        throw TemporalDataTransformer.a(runtimeException);
                    }
                }
                try {
                    ry.N(null);
                    if (!this.d) break block16;
                    ry.E(ry.B() - 1L);
                    break block17;
                }
                catch (RuntimeException runtimeException) {
                    throw TemporalDataTransformer.a(runtimeException);
                }
            }
            ry.U(ry.l() - 1L);
        }
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (RuntimeException runtimeException) {
            throw TemporalDataTransformer.a(runtimeException);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = TemporalDataTransformer.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TemporalDataTransformer.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void W(boolean bl) {
        this.y = bl;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean G() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.y == null || !this.y.booleanValue()) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw TemporalDataTransformer.a(runtimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw TemporalDataTransformer.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public Date S() {
        return this.e;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public Boolean N() {
        return this.y;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TemporalDataTransformer.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TemporalDataTransformer.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void o(@Nullable TemporalDataArchiver temporalDataArchiver) {
        this.G = temporalDataArchiver;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TemporalDataTransformer.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                TemporalDataTransformer.h[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean P() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.y == null || this.y.booleanValue()) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw TemporalDataTransformer.a(runtimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw TemporalDataTransformer.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == '\u00e2' || c == '\u00c1' || c == '\u00cb') {
                field = TemporalDataTransformer.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TemporalDataTransformer.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Date N() {
        return this.K;
    }

    public long W() {
        return this.b;
    }

    TemporalDataTransformer(long l, long l2, Date date, Date date2, ew ew2, String string, boolean bl, long l3, boolean bl2, @Nullable Boolean bl3, @Nullable TemporalDataArchiver temporalDataArchiver) {
        this.i = l;
        this.l = l2;
        this.K = date;
        this.e = date2;
        this.V = ew2;
        this.u = string;
        this.d = bl;
        this.b = l3;
        this.I = bl2;
        this.y = bl3;
        this.G = temporalDataArchiver;
    }

    private static Method d(long l, long l2) {
        int n = TemporalDataTransformer.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = TemporalDataTransformer.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TemporalDataTransformer.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TemporalDataTransformer.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        TemporalDataTransformer.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TemporalDataTransformer.b(243870162100779L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TemporalDataTransformer.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TemporalDataTransformer.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TemporalDataTransformer.b(243870162100779L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D6B;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TemporalDataTransformer.f[n2] = n3;
        }
        return f[n2];
    }

    public String q() {
        return this.u;
    }

    public String toString() {
        long l = a ^ 0x2BC2CAB47262L;
        return (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)27147, (long)(0x2A2AE5685789E626L ^ l)), (long)8164297938833427483L, (long)l)) + this.i + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)28596, (long)(0xE95348B0F2E6395L ^ l)), (long)8164297938833427483L, (long)l)) + this.l + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)29294, (long)(0x673739FE0ABD7E46L ^ l)), (long)8164297938833427483L, (long)l)) + this.K + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)5157, (long)(0x7441FBE26C421800L ^ l)), (long)8164297938833427483L, (long)l)) + this.V + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)19083, (long)(0x3E4416F6E7C1C6BEL ^ l)), (long)8164297938833427483L, (long)l)) + this.u + '\'' + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)1117, (long)(0x61453312B2DD8869L ^ l)), (long)8164297938833427483L, (long)l)) + this.d + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)28123, (long)(0x47FF393C4B78E1E8L ^ l)), (long)8164297938833427483L, (long)l)) + this.b + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)1899, (long)(0x7F2D89B27F80B5CL ^ l)), (long)8164297938833427483L, (long)l)) + this.I + (String)((Object)TemporalDataTransformer.b("k", (int)TemporalDataTransformer.a("b", (int)22256, (long)(0x548FD8A8C21E5AD7L ^ l)), (long)8164297938833427483L, (long)l)) + this.G + '}';
    }

    public long V() {
        return this.i;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                TemporalDataTransformer.a = MultiContainerRegistry.a(2901525161935691116L, -9003565577874630512L, MethodHandles.lookup().lookupClass()).a(28850101230604L);
                TemporalDataTransformer.h = new Object[5];
                TemporalDataTransformer.j = new String[5];
                TemporalDataTransformer.a();
                TemporalDataTransformer.g = new HashMap<K, V>(13);
                var0 = TemporalDataTransformer.a ^ 102202098606392L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "\u00062\u00e2\u00ed\u00a7p8\u008a\u0080mw\u008fx\u00ab\u00bb\u008b9V3\u0098\u0019n\u0005\":\u00ad\u008c\u00aa@t}\u00fb\u00ef+\u00d3\u00b8c8\u00c7\u0016G]\u00c5\u0090\u00c8\u00e7n~\u00acc?\u00e9\u00dc\u0088\u0019S\u00c6f;;\u0098\f\u00c1\u00efH\u00ac\u001f\u008f\u00b4\u00fag1\u00c2\u00f8\u00cd\u001c\u00a7(\u00af\u00ec\u00b5\u00cdL\u0092u)\u00d9\u00bc+w\u008a\u009cH.a\u00b99\u0090\u00b9w\u00b6\u00f4\u00fc\u00b2\u0019\u00ceH1\u00cdh\u0016\u00158\u001a.\u009e\u0093\u00f7\u00d3o\u0096\u00bfbg\u0082\u00f9\u00e8q]\u001ct\u00ff\u00fc\u00bc\u0081\\\u00995\u00a7\u0083\u0095\u0010\u00c4 \u009a\u00cc\u00ac\u000e\u00d5\u0011qO\t\u00c8\u0014Z\"2\u00e3/";
                var7_6 = "\u00062\u00e2\u00ed\u00a7p8\u008a\u0080mw\u008fx\u00ab\u00bb\u008b9V3\u0098\u0019n\u0005\":\u00ad\u008c\u00aa@t}\u00fb\u00ef+\u00d3\u00b8c8\u00c7\u0016G]\u00c5\u0090\u00c8\u00e7n~\u00acc?\u00e9\u00dc\u0088\u0019S\u00c6f;;\u0098\f\u00c1\u00efH\u00ac\u001f\u008f\u00b4\u00fag1\u00c2\u00f8\u00cd\u001c\u00a7(\u00af\u00ec\u00b5\u00cdL\u0092u)\u00d9\u00bc+w\u008a\u009cH.a\u00b99\u0090\u00b9w\u00b6\u00f4\u00fc\u00b2\u0019\u00ceH1\u00cdh\u0016\u00158\u001a.\u009e\u0093\u00f7\u00d3o\u0096\u00bfbg\u0082\u00f9\u00e8q]\u001ct\u00ff\u00fc\u00bc\u0081\\\u00995\u00a7\u0083\u0095\u0010\u00c4 \u009a\u00cc\u00ac\u000e\u00d5\u0011qO\t\u00c8\u0014Z\"2\u00e3/".length();
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
                    var6_5 = "Kv\u000e^>\u008d\u0082\u00b7\u0000\u00d0\u00a24FY\u00c2\u00fd";
                    var7_6 = "Kv\u000e^>\u008d\u0082\u00b7\u0000\u00d0\u00a24FY\u00c2\u00fd".length();
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
        TemporalDataTransformer.c = var8_3;
        TemporalDataTransformer.f = new Integer[22];
        try {
            v8 = TemporalDataTransformer.class.desiredAssertionStatus() == false;
        }
        catch (RuntimeException v9) {
            throw TemporalDataTransformer.a(v9);
        }
        TemporalDataTransformer.Z = v8;
    }

    @Nullable
    public TemporalDataArchiver p() {
        return this.G;
    }

    public boolean K() {
        return this.I;
    }

    public ew S() {
        return this.V;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TemporalDataTransformer.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TemporalDataTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(TemporalDataTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

