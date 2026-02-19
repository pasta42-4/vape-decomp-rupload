/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.structure.tree;

import a.ec;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.network.protocol.CommunicationProtocolInterface;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RecursiveNodeTreeBuilder
implements CommunicationProtocolInterface {
    private boolean K = true;
    private int u = -1;
    private String H = "";
    private static final long a;
    private static final String[] g;
    private static boolean Q;
    private static final long[] b;
    private static final Map d;
    private static final Integer[] c;
    public static final List<RecursiveNodeTreeBuilder> M;
    private int e;
    public static final List<RecursiveNodeTreeBuilder> U;
    public static RecursiveNodeTreeBuilder y;
    private static final Object[] f;

    public RecursiveNodeTreeBuilder(String string, int n) {
        this.H = string;
        this.e = n;
        this.a();
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
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
                n3 = 26;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 19;
                break;
            }
            case 8: {
                n3 = 9;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 32;
                break;
            }
            case 11: {
                n3 = 16;
                break;
            }
            case 12: {
                n3 = 29;
                break;
            }
            case 13: {
                n3 = 27;
                break;
            }
            case 14: {
                n3 = 39;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 63;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 58;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 30;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 25;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 46;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 43;
                break;
            }
            case 39: {
                n3 = 13;
                break;
            }
            case 40: {
                n3 = 4;
                break;
            }
            case 41: {
                n3 = 44;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 0;
                break;
            }
            case 46: {
                n3 = 56;
                break;
            }
            case 47: {
                n3 = 14;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 41;
                break;
            }
            case 51: {
                n3 = 60;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 7;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 21;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 22;
                break;
            }
            case 58: {
                n3 = 40;
                break;
            }
            case 59: {
                n3 = 6;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 8;
                break;
            }
            default: {
                n3 = 50;
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
        RecursiveNodeTreeBuilder.g[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = RecursiveNodeTreeBuilder.a(l, l2);
        Object object = f[n];
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
                clazz3 = RecursiveNodeTreeBuilder.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RecursiveNodeTreeBuilder.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RecursiveNodeTreeBuilder.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        RecursiveNodeTreeBuilder.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RecursiveNodeTreeBuilder.b(272895760914884L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RecursiveNodeTreeBuilder.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RecursiveNodeTreeBuilder.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RecursiveNodeTreeBuilder.b(272895760914884L, 0L);
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

    public RecursiveNodeTreeBuilder(String string) {
        this(string, 1);
    }

    private static Exception a(Exception exception) {
        return exception;
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

    public boolean r(LightweightExecutionContext lightweightExecutionContext) {
        long l = a ^ 0x7BB7BF569452L;
        try {
            boolean bl;
            block16: {
                block15: {
                    block14: {
                        if (!this.Q()) {
                            return false;
                        }
                        if (this.q().toLowerCase().startsWith((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)9756, (long)(0x3CD7E4861DDBA0B1L ^ l)), (long)4612931711378490981L, (long)l)))) {
                            int exception;
                            boolean bl2 = false;
                            try {
                                exception = Integer.parseInt(this.q().substring(4));
                            }
                            catch (Exception exception2) {
                                // empty catch block
                            }
                            try {
                                if (exception < true || ApplicationLifecycleManager.U().l().v() + 1 != exception) break block14;
                            }
                            catch (Exception exception3) {
                                throw RecursiveNodeTreeBuilder.a(exception3);
                            }
                            return true;
                        }
                    }
                    if (this.v(lightweightExecutionContext)) {
                        return true;
                    }
                    try {
                        if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block15;
                    }
                    catch (Exception exception) {
                        throw RecursiveNodeTreeBuilder.a(exception);
                    }
                    return false;
                }
                boolean bl3 = this.f(lightweightExecutionContext);
                try {
                    if (!bl3 || this.u == -1) break block16;
                }
                catch (Exception exception) {
                    throw RecursiveNodeTreeBuilder.a(exception);
                }
                int n = lightweightExecutionContext.b();
                if (this.u != n) {
                    bl = false;
                }
            }
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public void E(String string) {
        this.H = string;
    }

    public void S(boolean bl) {
        this.K = bl;
    }

    public int j() {
        return this.e;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RecursiveNodeTreeBuilder.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = RecursiveNodeTreeBuilder.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RecursiveNodeTreeBuilder.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/FI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Q' || c == '\u00fb' || c == '\u00ba' || c == 'i') {
                field = RecursiveNodeTreeBuilder.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Q' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RecursiveNodeTreeBuilder.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/FI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void t(JsonObject jsonObject) {
        long l;
        block10: {
            block11: {
                l = a ^ 0x761D1C9DD490L;
                try {
                    try {
                        if (jsonObject.get((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)15123, (long)(0x134338189FCF7D72L ^ l)), (long)55839083994465959L, (long)l))) == null) break block10;
                        this.H = jsonObject.get((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)6845, (long)(0x70AAFAE3E26FDCA6L ^ l)), (long)55839083994465959L, (long)l))).getAsString();
                        if (!this.H.startsWith((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)29933, (long)(0x7A3CB828E562B2ADL ^ l)), (long)55839083994465959L, (long)l)))) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RecursiveNodeTreeBuilder.a(customSystemException);
                    }
                    this.H = ec.c(this.H.split((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)12016, (long)(0x3969CAE16580E8E0L ^ l)), (long)55839083994465959L, (long)l)))[1]);
                }
                catch (CustomSystemException customSystemException) {
                    throw RecursiveNodeTreeBuilder.a(customSystemException);
                }
            }
            this.a();
        }
        try {
            if (jsonObject.get((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)383, (long)(0x4B1C818AE6A1C71CL ^ l)), (long)55839083994465959L, (long)l))) != null) {
                this.e = jsonObject.get((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)14011, (long)(0x169CFF77CAA470A3L ^ l)), (long)55839083994465959L, (long)l))).getAsInt();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTreeBuilder.a(customSystemException);
        }
        try {
            if (jsonObject.get((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)1254, (long)(0x16A000CB4CFEC2E8L ^ l)), (long)55839083994465959L, (long)l))) != null) {
                this.K = jsonObject.get((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)3924, (long)(0x7D7A16F6385B4915L ^ l)), (long)55839083994465959L, (long)l))).getAsBoolean();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTreeBuilder.a(customSystemException);
        }
    }

    public JsonObject T() {
        String string;
        StringBuilder stringBuilder;
        long l = a ^ 0x5492811BDA95L;
        JsonObject jsonObject = new JsonObject();
        try {
            stringBuilder = new StringBuilder().append(this.H);
            string = this.u == -1 ? "" : (String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)31339, (long)(0x4997ADFA2A6C3236L ^ l)), (long)1063768524525455522L, (long)l)) + this.u;
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTreeBuilder.a(customSystemException);
        }
        String string2 = stringBuilder.append(string).toString();
        string2 = (String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)19958, (long)(0x63E2BAE4340285FCL ^ l)), (long)1063768524525455522L, (long)l)) + ec.A(string2);
        jsonObject.addProperty((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)24725, (long)(0x293640862C50A8F6L ^ l)), (long)1063768524525455522L, (long)l)), string2);
        jsonObject.addProperty((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)15886, (long)(0x728FF3E76A38F61FL ^ l)), (long)1063768524525455522L, (long)l)), (Number)this.e);
        jsonObject.addProperty((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)16711, (long)(0x43A2C3ABFA73091BL ^ l)), (long)1063768524525455522L, (long)l)), Boolean.valueOf(this.K));
        return jsonObject;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RecursiveNodeTreeBuilder.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RecursiveNodeTreeBuilder.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = RecursiveNodeTreeBuilder.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                RecursiveNodeTreeBuilder.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RecursiveNodeTreeBuilder.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public int r() {
        return this.u;
    }

    @Override
    public boolean t() {
        return this.K;
    }

    public static boolean R() {
        return Q;
    }

    private boolean f(LightweightExecutionContext lightweightExecutionContext) {
        String string = this.q().toLowerCase();
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (string.equals(String.valueOf(protocolInteractionController.O()))) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTreeBuilder.a(customSystemException);
        }
        return string.equals(protocolInteractionController.m(lightweightExecutionContext).toLowerCase());
    }

    public String q() {
        return this.H;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean v(LightweightExecutionContext lightweightExecutionContext) {
        return TemporalMetadataResolver.h.J().R(this.q().toLowerCase(), lightweightExecutionContext);
    }

    public static void v(boolean bl) {
        Q = bl;
    }

    @Override
    public void w(boolean bl) {
        this.K = bl;
    }

    public RecursiveNodeTreeBuilder Z(int n) {
        this.u = n;
        return this;
    }

    private void a() {
        long l = a ^ 0x6189E65477FFL;
        if (this.H.contains((CharSequence)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)9478, (long)(0x7D5E72494E1B4001L ^ l)), (long)-6653656351004465720L, (long)l)))) {
            String[] stringArray = this.H.split((String)((Object)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)14165, (long)(0x3E4C0919C4835273L ^ l)), (long)-6653656351004465720L, (long)l)));
            this.H = stringArray[0];
            String string = stringArray[1];
            try {
                if (string.isEmpty()) {
                    return;
                }
            }
            catch (Exception exception) {
                throw RecursiveNodeTreeBuilder.a(exception);
            }
            try {
                this.u = Integer.parseInt(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Field c(long l, long l2) {
        int n = RecursiveNodeTreeBuilder.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = RecursiveNodeTreeBuilder.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RecursiveNodeTreeBuilder.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RecursiveNodeTreeBuilder.a(clazz3, string2, clazz2)) != null) {
                    RecursiveNodeTreeBuilder.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RecursiveNodeTreeBuilder.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RecursiveNodeTreeBuilder.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RecursiveNodeTreeBuilder.b(272895760914884L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String toString() {
        return this.q();
    }

    public boolean Q() {
        return this.K;
    }

    public static boolean y() {
        boolean bl = RecursiveNodeTreeBuilder.R();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTreeBuilder.a(customSystemException);
        }
        return false;
    }

    public RecursiveNodeTreeBuilder(int n) {
        this(String.valueOf(n));
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "\u0003`=";
        objectArray[1] = Integer.TYPE;
        RecursiveNodeTreeBuilder.g[1] = "java/lang/Integer";
        objectArray[2] = "\u00114\u001dY|:\u001a;\f\u0016\u0001\"\t<\u0005_";
        objectArray[3] = "\u0014~\u0019f\u0005P\u001fq\b)d^\u0014z\fs";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Pz?pXr\b/<\u0017\u000f3kyzn\u0006xW:,t\u0006HR$?)[s\u000b|<}d";
    }

    public ProtocolInteractionController e() {
        return ProtocolInteractionController.d(this.q());
    }

    public void e(int n) {
        this.e = n;
    }

    @Override
    public void f() {
        boolean bl;
        try {
            RecursiveNodeTreeBuilder recursiveNodeTreeBuilder = this;
            bl = !this.K;
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTreeBuilder.a(customSystemException);
        }
        recursiveNodeTreeBuilder.K = bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x469F;
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
                throw new RuntimeException("a/FI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RecursiveNodeTreeBuilder.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                RecursiveNodeTreeBuilder.a = MultiContainerRegistry.a(-8990597494619678147L, -3854278801177195694L, MethodHandles.lookup().lookupClass()).a(124859386041075L);
                var11 = RecursiveNodeTreeBuilder.a ^ 44203409204682L;
                RecursiveNodeTreeBuilder.f = new Object[5];
                RecursiveNodeTreeBuilder.g = new String[5];
                RecursiveNodeTreeBuilder.b();
                RecursiveNodeTreeBuilder.d = new HashMap<K, V>(13);
                RecursiveNodeTreeBuilder.v(true);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[96];
                var3_4 = 0;
                var4_5 = "\u00fe\u00f2\u009eZ\u0098!\u0094\u00e3\u0017\u008a\u00b6\u0096\u00e1\n\u008d-2q\u0004\u00abB\u00b0\u00fb\u00c2N\u00d8*\u00da\u00ed\u00db\u00cf;\u0015\u0082\u00f0\u0015\u00822)W\u00da\u00a8\u00f3Q\u009d\u00d4\u00cf|N\u00e4\u00e82\u00c5\u001a\u00c52X\r\u00b6\u0017c\u00ea\u00e8\u00fc\u0082)[\u00c7\u00b6\u00fe\u0083\u001b\u00fb2h\u00b3\u00dew\u00a5\u00e2\u00d4\u0007\u0088\u00e9!\u0014\u0083R\rS\u00f9\u00d7-\u00fanq\u0013S8\u00d9\u0013\u00ba\u00d51\u00e4\u008b'\u00bd<u\u00c0\u0003\u00b4!\u008a\u00ed\u00d9\u001f\u00d2\u00b1\u00ef\u00d7\u00ad8\u00bc\u00b7E}\u00de{\u00cd\u00a5\u00cd\u00e1\u00ed\u0017\u00d6\u0096\u0004\u00e1\u00b3\u00fbK\u00939\u00cb\u00f3\u00bb\u0086\u008a{\u00e9\u009f\u00ba\u00b8\u00ae\u009d12N\u00d5.\u00ad5\u00af\u00d6\u00ce%g \u0089L\u00c3E\u00ca\u00e3\u00ae)I\u00cd\u00df\u0000@\u00f2A\u00c6\u0095\u0004\u00ee\u0096(\u00d7\u00b7\u0011;\u00a0\u00e1&\u00fb\u0002R\u00c8?dU\u00db\u00be\u00a2\u00be\u0015\u00a7\u00e9\u0002\u001f6n\u00e3\u0003\u00be\u00d7\u001c7cJ\u00b0\u00f2X\u00b4\u008e\u00f1o\u008eV\u0092EE~\u0089\u00e3\u00d7Sp\u00e1\u00ee\u0012u\u00ee|\u0001\\\u00cb'\u00e6\u00e8Z\u00ca.!\u0095\u008f\u00e1\u0007g\u000b%@\u0088\u0006\u00b3\u0002\u0081{F\u00b5\u0080\u00ad\u0099P\u00c9'\u00e4\u001f\u0012\u001a\u00f8\u00bc]qw>\u00db\u00b7\u00b8\u00fdTxt\u0006\u00e7[r8\u00f0\u00cc}\u001dqHA\u00fa\u00ab\u00adQ\u0082\u00ce\u00d4\u00f3\u0097J\u00b0wKI\u000e\t d.\u00b9\u00f8\u00ebM\u00c3~\u008d\u00aa\u00d3\u00ca\t\u00c7\u00e9\u00ec\u00c0\u0002\u00f4\u00e3c=\u00a7\u009b9f\u00e6\u008f\u00e7\u00fd\n{\u00d3\u001d\u008b!\u00fd\u00c80\u00c7\u00ed\u00b0\u00ceR\u00f0\u009b\b\t\u00d9\u0083\u0086\u0018\u0005\u00874\u0087\u0085ytB(\u00b6\u00a5\u00df\u001e\u00bdI\u00c4o\u001e\n\u00e1\u009f8M(v\u00fa\u00d5^)\u00fd\u00e3.\u00e5\u0081\u00be\u00a0$&\u00d0\u00cc\u00a3\u0017v\u0014\u0019\u00a8\u0092!m\u009b+\u00bc\u00e0\u00f3\u00f2\u001c2\u008c?\u00b8GY@Q\u00b5?\u00dbe(>\u0091\u00a1eVV\u0014\u00d5\u00d0%\u009eQ\u00ed@\u00f6\u009c\u0081\u008f+\u0002\u009d.\n\u00d7b\u00f6\u008c\u00b8\u00b1\u001b\u00f6T\u008eyl/\u00d5q\u00bf\u008cV\u00dc\u00e3o\tO\u0089\u00d4\u008f\u0086\u00ff?\u00d9\u00c8\u0098\u00d9\u001c\u0099\u00ff\u00d3L\u00cbh\u009a5\u00f4\u00f2\u0086`\u00d3\u0000%H\u0095\u00d0\u00eb\u00ffl\u00fat\u00da\n*2\u00eej\u00dez\u008dl@\u009eZ!\u00ec\u0000\u00d0H\u00e1\u00f4\u00e9\u00b3S\u00f4\u00f7nZ\u00d8\u00b3\u00b9!\u00f8\u0007\u00d0\u00b0+gh`\u00f9\u0014>{(\u000bx\u0097\u00c7KSv=\u009ceE,\u000b81\u0084\u00b9\u00a4\u00a6@:\u00f7A\u0083%i5Akz\u00caK\u008bl\u00a9?\u0099\u0014\u00c5\u0007\u009ay\u00d4\u00c4\u0081\u00f1\u00cdH\u000f\u00b5\u00c5~bJ\u00ea,]9)\u00c09\u00ef\u0014c\u00e2\u00a8\u0011\u00ban6g\u008a\u0089Pr\u0086\u0003\u00c0W\u00d4\u0006\u0092\b<\u0014/\u00e6\u00a9\u0080('_\u0085\u00f6\u0015-\u001f*\u008f\u00deA\u00e9\u00c2#\u00edP\u0090\u00d8(\u00f5\u009eV\u00fb\u009dg0\u00be\u00db\"#\u000e\u00b1\u0001\u0017\u00b5\u00c7\u008b\u00d4BM[\u00ea#\u00f5e\u0084\u00b5\u00e3u\u00e4\u0089\u0016\u00ad:\u0005\u00d4\u00b4k\u00d0\u0004\u0092\u00db\u0085\u0004\u00f5 uZJ \u00df\u009f\u00c4\u0003\u0016\u0011\u00ea\u00d7K\u00da\u008e\u0092<l\u00c1\u00a3\u00a5\u008f\u00fb'S";
                var5_6 = "\u00fe\u00f2\u009eZ\u0098!\u0094\u00e3\u0017\u008a\u00b6\u0096\u00e1\n\u008d-2q\u0004\u00abB\u00b0\u00fb\u00c2N\u00d8*\u00da\u00ed\u00db\u00cf;\u0015\u0082\u00f0\u0015\u00822)W\u00da\u00a8\u00f3Q\u009d\u00d4\u00cf|N\u00e4\u00e82\u00c5\u001a\u00c52X\r\u00b6\u0017c\u00ea\u00e8\u00fc\u0082)[\u00c7\u00b6\u00fe\u0083\u001b\u00fb2h\u00b3\u00dew\u00a5\u00e2\u00d4\u0007\u0088\u00e9!\u0014\u0083R\rS\u00f9\u00d7-\u00fanq\u0013S8\u00d9\u0013\u00ba\u00d51\u00e4\u008b'\u00bd<u\u00c0\u0003\u00b4!\u008a\u00ed\u00d9\u001f\u00d2\u00b1\u00ef\u00d7\u00ad8\u00bc\u00b7E}\u00de{\u00cd\u00a5\u00cd\u00e1\u00ed\u0017\u00d6\u0096\u0004\u00e1\u00b3\u00fbK\u00939\u00cb\u00f3\u00bb\u0086\u008a{\u00e9\u009f\u00ba\u00b8\u00ae\u009d12N\u00d5.\u00ad5\u00af\u00d6\u00ce%g \u0089L\u00c3E\u00ca\u00e3\u00ae)I\u00cd\u00df\u0000@\u00f2A\u00c6\u0095\u0004\u00ee\u0096(\u00d7\u00b7\u0011;\u00a0\u00e1&\u00fb\u0002R\u00c8?dU\u00db\u00be\u00a2\u00be\u0015\u00a7\u00e9\u0002\u001f6n\u00e3\u0003\u00be\u00d7\u001c7cJ\u00b0\u00f2X\u00b4\u008e\u00f1o\u008eV\u0092EE~\u0089\u00e3\u00d7Sp\u00e1\u00ee\u0012u\u00ee|\u0001\\\u00cb'\u00e6\u00e8Z\u00ca.!\u0095\u008f\u00e1\u0007g\u000b%@\u0088\u0006\u00b3\u0002\u0081{F\u00b5\u0080\u00ad\u0099P\u00c9'\u00e4\u001f\u0012\u001a\u00f8\u00bc]qw>\u00db\u00b7\u00b8\u00fdTxt\u0006\u00e7[r8\u00f0\u00cc}\u001dqHA\u00fa\u00ab\u00adQ\u0082\u00ce\u00d4\u00f3\u0097J\u00b0wKI\u000e\t d.\u00b9\u00f8\u00ebM\u00c3~\u008d\u00aa\u00d3\u00ca\t\u00c7\u00e9\u00ec\u00c0\u0002\u00f4\u00e3c=\u00a7\u009b9f\u00e6\u008f\u00e7\u00fd\n{\u00d3\u001d\u008b!\u00fd\u00c80\u00c7\u00ed\u00b0\u00ceR\u00f0\u009b\b\t\u00d9\u0083\u0086\u0018\u0005\u00874\u0087\u0085ytB(\u00b6\u00a5\u00df\u001e\u00bdI\u00c4o\u001e\n\u00e1\u009f8M(v\u00fa\u00d5^)\u00fd\u00e3.\u00e5\u0081\u00be\u00a0$&\u00d0\u00cc\u00a3\u0017v\u0014\u0019\u00a8\u0092!m\u009b+\u00bc\u00e0\u00f3\u00f2\u001c2\u008c?\u00b8GY@Q\u00b5?\u00dbe(>\u0091\u00a1eVV\u0014\u00d5\u00d0%\u009eQ\u00ed@\u00f6\u009c\u0081\u008f+\u0002\u009d.\n\u00d7b\u00f6\u008c\u00b8\u00b1\u001b\u00f6T\u008eyl/\u00d5q\u00bf\u008cV\u00dc\u00e3o\tO\u0089\u00d4\u008f\u0086\u00ff?\u00d9\u00c8\u0098\u00d9\u001c\u0099\u00ff\u00d3L\u00cbh\u009a5\u00f4\u00f2\u0086`\u00d3\u0000%H\u0095\u00d0\u00eb\u00ffl\u00fat\u00da\n*2\u00eej\u00dez\u008dl@\u009eZ!\u00ec\u0000\u00d0H\u00e1\u00f4\u00e9\u00b3S\u00f4\u00f7nZ\u00d8\u00b3\u00b9!\u00f8\u0007\u00d0\u00b0+gh`\u00f9\u0014>{(\u000bx\u0097\u00c7KSv=\u009ceE,\u000b81\u0084\u00b9\u00a4\u00a6@:\u00f7A\u0083%i5Akz\u00caK\u008bl\u00a9?\u0099\u0014\u00c5\u0007\u009ay\u00d4\u00c4\u0081\u00f1\u00cdH\u000f\u00b5\u00c5~bJ\u00ea,]9)\u00c09\u00ef\u0014c\u00e2\u00a8\u0011\u00ban6g\u008a\u0089Pr\u0086\u0003\u00c0W\u00d4\u0006\u0092\b<\u0014/\u00e6\u00a9\u0080('_\u0085\u00f6\u0015-\u001f*\u008f\u00deA\u00e9\u00c2#\u00edP\u0090\u00d8(\u00f5\u009eV\u00fb\u009dg0\u00be\u00db\"#\u000e\u00b1\u0001\u0017\u00b5\u00c7\u008b\u00d4BM[\u00ea#\u00f5e\u0084\u00b5\u00e3u\u00e4\u0089\u0016\u00ad:\u0005\u00d4\u00b4k\u00d0\u0004\u0092\u00db\u0085\u0004\u00f5 uZJ \u00df\u009f\u00c4\u0003\u0016\u0011\u00ea\u00d7K\u00da\u008e\u0092<l\u00c1\u00a3\u00a5\u008f\u00fb'S".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u0099\u0007#\u001f\u0002\u00b7\u00c0R\u001a\u008b\u0014C\u008f\u0088\u00db\u00b4";
                    var5_6 = "\u0099\u0007#\u001f\u0002\u00b7\u00c0R\u001a\u008b\u0014C\u008f\u0088\u00db\u00b4".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        RecursiveNodeTreeBuilder.b = var6_3;
        RecursiveNodeTreeBuilder.c = new Integer[96];
        RecursiveNodeTreeBuilder.y = new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)8751, (long)(352186134924285196L ^ var11)), (long)3574801985264678909L, (long)var11), 0);
        RecursiveNodeTreeBuilder.U = Arrays.asList(new RecursiveNodeTreeBuilder[]{new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)10904, (long)(717299662673206748L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)4396, (long)(6145812860614108722L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)13345, (long)(5236988837804131090L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)242, (long)(886739043386718181L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)28807, (long)(4809713042381899689L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)22277, (long)(8561047005474594888L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)17639, (long)(7392340315093447674L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)23453, (long)(6803455495207267517L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)6779, (long)(143337304529694014L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)8602, (long)(8875599080557893298L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)19513, (long)(8619320442988804888L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)31407, (long)(1273136206735609246L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)5290, (long)(292220813578134406L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)1714, (long)(7897157728389788083L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)6919, (long)(6543475841782017036L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)11765, (long)(4063666591035775651L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)23305, (long)(3360270636682161190L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)5649, (long)(5583212834185437464L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)23951, (long)(3563875200174271183L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)18317, (long)(2445157687550423192L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)12456, (long)(5814294313448130535L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)18497, (long)(1748173408954466050L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)16041, (long)(8627490611911870911L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)29476, (long)(689183389496870008L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)27284, (long)(6710409950618262925L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)8348, (long)(2623283606463436706L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)23897, (long)(2128392522392054345L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)29157, (long)(7320087320416847586L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)9497, (long)(5340891399805325860L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)10050, (long)(1440751998165995614L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)11332, (long)(4145637102380571488L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)29744, (long)(833348637876323098L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)30857, (long)(4521307936008540121L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)26294, (long)(6387804969010172304L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)22543, (long)(3589595828327952144L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)16533, (long)(7967098086300202896L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)14133, (long)(8974020864585711742L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)26095, (long)(6167297197052957374L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)8641, (long)(6425643365122627280L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)24664, (long)(1798239977865582458L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)637, (long)(263227292256073019L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)11429, (long)(8192815067944410045L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)16602, (long)(3657382262476093331L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)27073, (long)(9161901517443505861L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)23657, (long)(5619383672473299745L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)4884, (long)(5843726613785306137L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)16349, (long)(1090391877579786370L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)9196, (long)(1138124416978867393L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)10671, (long)(4491384096165158642L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)4309, (long)(1970554966081890275L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)32573, (long)(5576987432758118459L ^ var11)), (long)3574801985264678909L, (long)var11))});
        RecursiveNodeTreeBuilder.M = Arrays.asList(new RecursiveNodeTreeBuilder[]{new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)29200, (long)(8108262525075326224L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)24553, (long)(8657278981084162259L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)6980, (long)(3175685680720014365L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)12702, (long)(6662267152206612149L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)24348, (long)(5667723666531461186L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)6233, (long)(4666835804296474455L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)27822, (long)(4039852087327857654L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)24251, (long)(3035633284285540754L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)4778, (long)(5615579803652711845L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)18472, (long)(60915809343160077L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)20872, (long)(6427024138768426703L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)146, (long)(2943415496295511978L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)16569, (long)(2663139756960823182L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)6743, (long)(7168623012872875269L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)15254, (long)(7583006017697598618L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)4097, (long)(5261343116191426390L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)3939, (long)(4792949275355904057L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)12055, (long)(6529824897879791656L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)22755, (long)(1646476334845472747L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)12729, (long)(1530192889658328734L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)31017, (long)(7597678382319111709L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)10523, (long)(6979582589309378057L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)21298, (long)(574855250951480446L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)3162, (long)(6242593590457629449L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)28454, (long)(8164970225922152492L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)31520, (long)(3604754765094587444L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)19578, (long)(6024870977077853002L ^ var11)), (long)3574801985264678909L, (long)var11)), new RecursiveNodeTreeBuilder((String)RecursiveNodeTreeBuilder.b("r", (int)RecursiveNodeTreeBuilder.a("f", (int)26772, (long)(3989673657409511375L ^ var11)), (long)3574801985264678909L, (long)var11))});
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RecursiveNodeTreeBuilder.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(RecursiveNodeTreeBuilder.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

