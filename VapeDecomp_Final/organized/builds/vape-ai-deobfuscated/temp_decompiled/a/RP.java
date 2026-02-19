/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.N5;
import a.O_;
import a.SE;
import a.V4;
import a.Zi;
import a.cB;
import a.d8;
import a.h4;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class rp
implements Cloneable {
    @Nullable
    private String O;
    private static final long c;
    @Nullable
    private transient V4 b;
    private static final long a;
    private static final Object[] d;
    @Nullable
    private transient h4 u;
    private static final String[] e;

    private void k() {
        block15: {
            String string;
            block14: {
                String string2;
                try {
                    this.u = null;
                    this.b = null;
                    string2 = this.O != null ? this.O.trim().toLowerCase() : null;
                }
                catch (O_ o_2) {
                    throw rp.a(o_2);
                }
                string = string2;
                try {
                    try {
                        if (string != null && !string.isEmpty()) break block14;
                    }
                    catch (O_ o_3) {
                        throw rp.a(o_3);
                    }
                    return;
                }
                catch (O_ o_4) {
                    throw rp.a(o_4);
                }
            }
            try {
                this.u = Zi.d(string);
                if (this.u != null) {
                    this.b = null;
                    return;
                }
            }
            catch (O_ o_5) {
                throw rp.a(o_5);
            }
            cB cB2 = SE.h.x().G(string);
            try {
                try {
                    if (cB2 == null) break block15;
                    this.b = cB2.H();
                    if (this.b == null) break block15;
                }
                catch (O_ o_6) {
                    throw rp.a(o_6);
                }
                if (this.b.Y()) {
                    // empty if block
                }
            }
            catch (O_ o_7) {
                throw rp.a(o_7);
            }
        }
    }

    private void Y(@Nullable String string) {
        this.O = string;
        this.k();
    }

    public rp() {
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ec' || c10 == '\u00e2' || c10 == '\u00ea' || c10 == 'Z') {
                field = rp.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = rp.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (e[n5] != null) {
            return n5;
        }
        Object object = d[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 16;
                break;
            }
            case 1: {
                n4 = 32;
                break;
            }
            case 2: {
                n4 = 58;
                break;
            }
            case 3: {
                n4 = 42;
                break;
            }
            case 4: {
                n4 = 2;
                break;
            }
            case 5: {
                n4 = 14;
                break;
            }
            case 6: {
                n4 = 28;
                break;
            }
            case 7: {
                n4 = 38;
                break;
            }
            case 8: {
                n4 = 21;
                break;
            }
            case 9: {
                n4 = 55;
                break;
            }
            case 10: {
                n4 = 61;
                break;
            }
            case 11: {
                n4 = 19;
                break;
            }
            case 12: {
                n4 = 11;
                break;
            }
            case 13: {
                n4 = 36;
                break;
            }
            case 14: {
                n4 = 43;
                break;
            }
            case 15: {
                n4 = 12;
                break;
            }
            case 16: {
                n4 = 10;
                break;
            }
            case 17: {
                n4 = 27;
                break;
            }
            case 18: {
                n4 = 33;
                break;
            }
            case 19: {
                n4 = 53;
                break;
            }
            case 20: {
                n4 = 9;
                break;
            }
            case 21: {
                n4 = 4;
                break;
            }
            case 22: {
                n4 = 54;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 37;
                break;
            }
            case 25: {
                n4 = 56;
                break;
            }
            case 26: {
                n4 = 63;
                break;
            }
            case 27: {
                n4 = 39;
                break;
            }
            case 28: {
                n4 = 13;
                break;
            }
            case 29: {
                n4 = 15;
                break;
            }
            case 30: {
                n4 = 7;
                break;
            }
            case 31: {
                n4 = 62;
                break;
            }
            case 32: {
                n4 = 34;
                break;
            }
            case 33: {
                n4 = 35;
                break;
            }
            case 34: {
                n4 = 60;
                break;
            }
            case 35: {
                n4 = 31;
                break;
            }
            case 36: {
                n4 = 57;
                break;
            }
            case 37: {
                n4 = 46;
                break;
            }
            case 38: {
                n4 = 23;
                break;
            }
            case 39: {
                n4 = 29;
                break;
            }
            case 40: {
                n4 = 0;
                break;
            }
            case 41: {
                n4 = 5;
                break;
            }
            case 42: {
                n4 = 50;
                break;
            }
            case 43: {
                n4 = 51;
                break;
            }
            case 44: {
                n4 = 26;
                break;
            }
            case 45: {
                n4 = 44;
                break;
            }
            case 46: {
                n4 = 8;
                break;
            }
            case 47: {
                n4 = 25;
                break;
            }
            case 48: {
                n4 = 45;
                break;
            }
            case 49: {
                n4 = 24;
                break;
            }
            case 50: {
                n4 = 52;
                break;
            }
            case 51: {
                n4 = 47;
                break;
            }
            case 52: {
                n4 = 3;
                break;
            }
            case 53: {
                n4 = 17;
                break;
            }
            case 54: {
                n4 = 30;
                break;
            }
            case 55: {
                n4 = 41;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 22;
                break;
            }
            case 58: {
                n4 = 40;
                break;
            }
            case 59: {
                n4 = 20;
                break;
            }
            case 60: {
                n4 = 1;
                break;
            }
            case 61: {
                n4 = 6;
                break;
            }
            case 62: {
                n4 = 49;
                break;
            }
            default: {
                n4 = 18;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        rp.e[n5] = new String(cArray);
        return n5;
    }

    public rp o() {
        rp rp2 = new rp();
        rp2.Y(this.O);
        return rp2;
    }

    @Nullable
    public String k() {
        return this.O;
    }

    @Nullable
    public h4 i() {
        return this.u;
    }

    private static Method d(long l10, long l11) {
        int n2 = rp.a(l10, l11);
        Object object = d[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n2];
                int n4 = string2.indexOf(8);
                clazz3 = rp.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = rp.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = rp.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        rp.d[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = rp.b(255342153605738L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = rp.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        rp.d[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = rp.b(255342153605738L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = rp.a(l10, l11);
            object = d[n2];
            try {
                if (!(object instanceof String)) break block2;
                rp.d[n2] = clazz = Class.forName(e[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = rp.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = rp.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Nullable
    public V4 W() {
        return this.b;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = rp.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = rp.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public rp(JsonElement jsonElement) {
        long l10 = a ^ 0x4A32634ED224L;
        if (jsonElement instanceof JsonObject) {
            JsonArray jsonArray = ((JsonObject)jsonElement).getAsJsonArray((String)((Object)rp.a("\u00da", (int)((int)c), (long)8189310785038725004L, (long)l10)));
            int n2 = 0;
            try {
                if (n2 >= jsonArray.size()) return;
                this.Y(jsonArray.get(n2).getAsString());
                return;
            }
            catch (O_ o_2) {
                throw rp.a(o_2);
            }
        }
        try {
            if (!(jsonElement instanceof JsonPrimitive)) return;
            this.Y(jsonElement.getAsString());
            return;
        }
        catch (O_ o_3) {
            throw rp.a(o_3);
        }
    }

    public JsonElement y() {
        JsonPrimitive jsonPrimitive;
        try {
            jsonPrimitive = this.O != null ? new JsonPrimitive(this.O) : null;
        }
        catch (O_ o_2) {
            throw rp.a(o_2);
        }
        return jsonPrimitive;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = ")x*";
        objectArray[1] = Integer.TYPE;
        rp.e[1] = "java/lang/Integer";
        objectArray[2] = "\u0016M?\u00000\r\u001dB.OM\u0015\u000eE'\u0006";
        objectArray[3] = "5n\\+2.>aMdS 5jI>";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "e\u001a9'\u0005~oA ]Sl\u000e\u0012c!\b+bJf2_\u00177Q&2\u0006w`K9l8";
    }

    public boolean Z(V4 v42) {
        boolean bl2;
        block16: {
            block15: {
                String string;
                block14: {
                    string = this.O;
                    try {
                        if (string == null) {
                            return false;
                        }
                    }
                    catch (O_ o_2) {
                        throw rp.a(o_2);
                    }
                    h4 h42 = this.Q();
                    try {
                        try {
                            if (h42 == null || !h42.L(v42, v42.C())) break block14;
                        }
                        catch (O_ o_3) {
                            throw rp.a(o_3);
                        }
                        return true;
                    }
                    catch (O_ o_4) {
                        throw rp.a(o_4);
                    }
                }
                try {
                    if (v42.Y()) {
                        return false;
                    }
                }
                catch (O_ o_5) {
                    throw rp.a(o_5);
                }
                cB cB2 = SE.h.x().V(v42);
                try {
                    try {
                        if (cB2 == null || !string.equals(cB2.Z())) break block15;
                    }
                    catch (O_ o_6) {
                        throw rp.a(o_6);
                    }
                    bl2 = true;
                    break block16;
                }
                catch (O_ o_7) {
                    throw rp.a(o_7);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean e() {
        boolean bl2;
        block10: {
            block9: {
                try {
                    if (this.g() != null) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw rp.a(o_2);
                }
                V4 v42 = this.W();
                try {
                    try {
                        try {
                            if (v42 != null && !v42.Y()) break block9;
                        }
                        catch (O_ o_3) {
                            throw rp.a(o_3);
                        }
                        if (this.O == null) break block9;
                    }
                    catch (O_ o_4) {
                        throw rp.a(o_4);
                    }
                    bl2 = true;
                    break block10;
                }
                catch (O_ o_5) {
                    throw rp.a(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/rp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean T() {
        boolean bl2;
        try {
            bl2 = this.O == null;
        }
        catch (O_ o_2) {
            throw rp.a(o_2);
        }
        return bl2;
    }

    @Nullable
    private h4 Q() {
        return this.u;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = rp.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void r(@Nullable N5<String, cB> n5) {
        block13: {
            block14: {
                block12: {
                    try {
                        block11: {
                            try {
                                try {
                                    if (n5 == null) break block11;
                                    if (n5.t() != null) break block12;
                                }
                                catch (O_ o_2) {
                                    throw rp.a(o_2);
                                }
                                if (n5.a() != null) break block12;
                            }
                            catch (O_ o_3) {
                                throw rp.a(o_3);
                            }
                        }
                        this.Y(null);
                        break block13;
                    }
                    catch (O_ o_4) {
                        throw rp.a(o_4);
                    }
                }
                try {
                    if (n5.t() == null) break block14;
                    this.Y(n5.t());
                    break block13;
                }
                catch (O_ o_5) {
                    throw rp.a(o_5);
                }
            }
            try {
                if (n5.a() != null) {
                    this.Y(n5.a().Z());
                }
            }
            catch (O_ o_6) {
                throw rp.a(o_6);
            }
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = rp.a(l10, l11);
        Object object = d[n2];
        if (object instanceof String) {
            String string = e[n2];
            int n3 = string.indexOf(8);
            Class clazz = rp.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = rp.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = rp.a(clazz3, string2, clazz2)) != null) {
                    rp.d[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = rp.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        rp.d[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = rp.b(255342153605738L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Nullable
    public String g() {
        String string;
        try {
            string = this.u != null ? this.u.Y() : null;
        }
        catch (O_ o_2) {
            throw rp.a(o_2);
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(943431658090126315L, -2683700279177929831L, MethodHandles.lookup().lookupClass()).a(93762805170496L);
        d = new Object[5];
        e = new String[5];
        rp.a();
        long l10 = a ^ 0x34092BF09740L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -658701853497047786L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(rp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

