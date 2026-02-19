/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AQ;
import a.EP;
import a.J;
import a.KB;
import a.KE;
import a.KL;
import a.Ky;
import a.OY;
import a.O_;
import a.Qt;
import a.Vt;
import a.XO;
import a.d8;
import a.eM;
import a.ht;
import a.on;
import a.rT;
import a.x_;
import a.xi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class xe
extends x_ {
    private static final long d = d8.a(-4351710469473150043L, 6530752204443501072L, MethodHandles.lookup().lookupClass()).a(214977463971686L);
    private static final Object[] e = new Object[5];
    private static final String[] h = new String[5];
    private long N;
    private boolean z = false;
    private boolean P;

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xe.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xe.b(classArray[i10], string, clazz2);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e8' || c10 == 'j' || c10 == 'B' || c10 == '\u00d6') {
                field = xe.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xe.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00f5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @OY
    public void B(KE kE2) {
        try {
            if (!((AQ)this.n()).n()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xe.a(o_2);
        }
        try {
            this.N = System.currentTimeMillis();
            if (kE2.getEntity().M().equals(EP.U().M())) {
                KL.W.execute(this::lambda$onDamaged$0);
            }
        }
        catch (O_ o_3) {
            throw xe.a(o_3);
        }
    }

    static {
        xe.a();
    }

    public void d(boolean bl2) {
        block5: {
            block4: {
                long l10 = d ^ 0x317D8FBC3955L;
                int[] nArray = Vt.W();
                try {
                    xe xe2;
                    try {
                        xe2 = this;
                        if (nArray == null) break block4;
                        if (xe2.z == bl2) break block5;
                    }
                    catch (O_ o_2) {
                        throw xe.a(o_2);
                    }
                    this.z = bl2;
                    this.N = 0L;
                    xe2 = this;
                }
                catch (O_ o_3) {
                    throw xe.a(o_3);
                }
            }
            xe2.P = false;
            EP.N().D().p(bl2);
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = xe.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = xe.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xe.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xe.a(clazz3, string2, clazz2)) != null) {
                    xe.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xe.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xe.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xe.b(267743042943938L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 29;
                break;
            }
            case 1: {
                n4 = 4;
                break;
            }
            case 2: {
                n4 = 49;
                break;
            }
            case 3: {
                n4 = 53;
                break;
            }
            case 4: {
                n4 = 30;
                break;
            }
            case 5: {
                n4 = 36;
                break;
            }
            case 6: {
                n4 = 61;
                break;
            }
            case 7: {
                n4 = 60;
                break;
            }
            case 8: {
                n4 = 15;
                break;
            }
            case 9: {
                n4 = 54;
                break;
            }
            case 10: {
                n4 = 33;
                break;
            }
            case 11: {
                n4 = 28;
                break;
            }
            case 12: {
                n4 = 40;
                break;
            }
            case 13: {
                n4 = 24;
                break;
            }
            case 14: {
                n4 = 6;
                break;
            }
            case 15: {
                n4 = 23;
                break;
            }
            case 16: {
                n4 = 56;
                break;
            }
            case 17: {
                n4 = 10;
                break;
            }
            case 18: {
                n4 = 26;
                break;
            }
            case 19: {
                n4 = 8;
                break;
            }
            case 20: {
                n4 = 25;
                break;
            }
            case 21: {
                n4 = 21;
                break;
            }
            case 22: {
                n4 = 31;
                break;
            }
            case 23: {
                n4 = 58;
                break;
            }
            case 24: {
                n4 = 51;
                break;
            }
            case 25: {
                n4 = 20;
                break;
            }
            case 26: {
                n4 = 48;
                break;
            }
            case 27: {
                n4 = 18;
                break;
            }
            case 28: {
                n4 = 17;
                break;
            }
            case 29: {
                n4 = 59;
                break;
            }
            case 30: {
                n4 = 52;
                break;
            }
            case 31: {
                n4 = 22;
                break;
            }
            case 32: {
                n4 = 63;
                break;
            }
            case 33: {
                n4 = 44;
                break;
            }
            case 34: {
                n4 = 5;
                break;
            }
            case 35: {
                n4 = 37;
                break;
            }
            case 36: {
                n4 = 35;
                break;
            }
            case 37: {
                n4 = 41;
                break;
            }
            case 38: {
                n4 = 39;
                break;
            }
            case 39: {
                n4 = 45;
                break;
            }
            case 40: {
                n4 = 57;
                break;
            }
            case 41: {
                n4 = 46;
                break;
            }
            case 42: {
                n4 = 62;
                break;
            }
            case 43: {
                n4 = 14;
                break;
            }
            case 44: {
                n4 = 43;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 27;
                break;
            }
            case 47: {
                n4 = 55;
                break;
            }
            case 48: {
                n4 = 2;
                break;
            }
            case 49: {
                n4 = 0;
                break;
            }
            case 50: {
                n4 = 3;
                break;
            }
            case 51: {
                n4 = 38;
                break;
            }
            case 52: {
                n4 = 34;
                break;
            }
            case 53: {
                n4 = 16;
                break;
            }
            case 54: {
                n4 = 42;
                break;
            }
            case 55: {
                n4 = 32;
                break;
            }
            case 56: {
                n4 = 19;
                break;
            }
            case 57: {
                n4 = 9;
                break;
            }
            case 58: {
                n4 = 47;
                break;
            }
            case 59: {
                n4 = 13;
                break;
            }
            case 60: {
                n4 = 1;
                break;
            }
            case 61: {
                n4 = 50;
                break;
            }
            case 62: {
                n4 = 11;
                break;
            }
            default: {
                n4 = 7;
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
        xe.h[n5] = new String(cArray);
        return n5;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xe.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @OY
    public void Z(KB var1_1) {
        block79: {
            block81: {
                block80: {
                    block77: {
                        block75: {
                            block76: {
                                block73: {
                                    block74: {
                                        block71: {
                                            block72: {
                                                block69: {
                                                    block70: {
                                                        block68: {
                                                            block67: {
                                                                block66: {
                                                                    block64: {
                                                                        block65: {
                                                                            block62: {
                                                                                block63: {
                                                                                    block61: {
                                                                                        block60: {
                                                                                            var2_2 = xe.d ^ 112028814342479L;
                                                                                            var4_3 = Vt.W();
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = EP.U().Y();
                                                                                                    if (var4_3 == null) break block60;
                                                                                                    if (v0) break block61;
                                                                                                }
                                                                                                catch (O_ v1) {
                                                                                                    throw xe.a(v1);
                                                                                                }
                                                                                                v0 = ((AQ)this.n()).n();
                                                                                            }
                                                                                            catch (O_ v2) {
                                                                                                throw xe.a(v2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (var4_3 == null) break block62;
                                                                                            if (v0) break block63;
                                                                                        }
                                                                                        catch (O_ v3) {
                                                                                            throw xe.a(v3);
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                v0 = EP.X().r();
                                                                            }
                                                                            if (v0) {
                                                                                return;
                                                                            }
                                                                            var5_4 = ((AQ)this.n()).T();
                                                                            try {
                                                                                try {
                                                                                    v4 = var1_1.getThePlayer().b();
                                                                                    if (var4_3 == null) break block64;
                                                                                    if (v4 <= J.H.C() + 1) break block65;
                                                                                }
                                                                                catch (O_ v5) {
                                                                                    throw xe.a(v5);
                                                                                }
                                                                                v4 = 1;
                                                                                break block64;
                                                                            }
                                                                            catch (O_ v6) {
                                                                                throw xe.a(v6);
                                                                            }
                                                                        }
                                                                        v4 = 0;
                                                                    }
                                                                    var6_5 = v4;
                                                                    try {
                                                                        try {
                                                                            cfr_temp_0 = this.N - 0L;
                                                                            v7 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                            if (var4_3 == null) break block66;
                                                                            if (v7 <= 0) break block67;
                                                                        }
                                                                        catch (O_ v8) {
                                                                            throw xe.a(v8);
                                                                        }
                                                                        cfr_temp_1 = System.currentTimeMillis() - this.N;
                                                                        v7 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                    }
                                                                    catch (O_ v9) {
                                                                        throw xe.a(v9);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var4_3 == null) break block68;
                                                                    if (v7 < 0) break block67;
                                                                }
                                                                catch (O_ v10) {
                                                                    throw xe.a(v10);
                                                                }
                                                                v7 = 1;
                                                                break block68;
                                                            }
                                                            v7 = 0;
                                                        }
                                                        var7_6 = v7;
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_3 == null) break block69;
                                                                    if (var5_4 != null) {
                                                                    }
                                                                    ** GOTO lbl101
                                                                }
                                                                catch (O_ v11) {
                                                                    throw xe.a(v11);
                                                                }
                                                                v12 = var6_5;
                                                                if (var4_3 == null) break block70;
                                                            }
                                                            catch (O_ v13) {
                                                                throw xe.a(v13);
                                                            }
                                                            if (v12 == 0) {
                                                            }
                                                            ** GOTO lbl101
                                                        }
                                                        catch (O_ v14) {
                                                            throw xe.a(v14);
                                                        }
                                                        v12 = (int)var7_6;
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_3 == null) break block71;
                                                            if (v12 == 0) break block72;
                                                        }
                                                        catch (O_ v15) {
                                                            throw xe.a(v15);
                                                        }
lbl101:
                                                        // 3 sources

                                                        xe.a("\u00f5", (Object)this, (boolean)false, (long)4865407897643895275L, (long)var2_2);
                                                    }
                                                    catch (O_ v16) {
                                                        throw xe.a(v16);
                                                    }
                                                }
                                                return;
                                            }
                                            v12 = (int)((AQ)this.n()).G();
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var4_3 == null) break block73;
                                                    if (v12 == 0) break block74;
                                                }
                                                catch (O_ v17) {
                                                    throw xe.a(v17);
                                                }
                                                v12 = (int)rT.H();
                                                if (var4_3 == null) break block73;
                                            }
                                            catch (O_ v18) {
                                                throw xe.a(v18);
                                            }
                                            if (v12 != 0) break block74;
                                        }
                                        catch (O_ v19) {
                                            throw xe.a(v19);
                                        }
                                        return;
                                    }
                                    v12 = var1_1.getThePlayer().b();
                                }
                                var8_7 = v12;
                                var9_8 = J.H.C() + 2;
                                try {
                                    try {
                                        v20 = var5_4.b();
                                        if (var4_3 == null) break block75;
                                        if (v20 > var9_8 + 2) break block76;
                                    }
                                    catch (O_ v21) {
                                        throw xe.a(v21);
                                    }
                                    v20 = 1;
                                    break block75;
                                }
                                catch (O_ v22) {
                                    throw xe.a(v22);
                                }
                            }
                            v20 = 0;
                        }
                        var10_9 = v20;
                        try {
                            block78: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v23 = this.z;
                                                    if (var4_3 == null) break block77;
                                                    if (v23 == 0) break block78;
                                                }
                                                catch (O_ v24) {
                                                    throw xe.a(v24);
                                                }
                                                v23 = this.P;
                                                if (var4_3 == null) break block77;
                                            }
                                            catch (O_ v25) {
                                                throw xe.a(v25);
                                            }
                                            if (v23 == 0) break block78;
                                        }
                                        catch (O_ v26) {
                                            throw xe.a(v26);
                                        }
                                        v23 = var10_9;
                                        if (var4_3 == null) break block77;
                                    }
                                    catch (O_ v27) {
                                        throw xe.a(v27);
                                    }
                                    if (v23 != 0) break block79;
                                }
                                catch (O_ v28) {
                                    throw xe.a(v28);
                                }
                            }
                            v23 = this.z;
                        }
                        catch (O_ v29) {
                            throw xe.a(v29);
                        }
                    }
                    try {
                        if (var4_3 == null) break block80;
                        if (v23 != 0) break block79;
                    }
                    catch (O_ v30) {
                        throw xe.a(v30);
                    }
                    v23 = var8_7;
                }
                try {
                    try {
                        if (var4_3 == null) break block81;
                        if (v23 > var9_8 + 1) break block79;
                    }
                    catch (O_ v31) {
                        throw xe.a(v31);
                    }
                    v23 = var8_7;
                }
                catch (O_ v32) {
                    throw xe.a(v32);
                }
            }
            try {
                if (v23 > 0) {
                    xe.a("\u00f5", (Object)this, (boolean)true, (long)4865407897643895275L, (long)var2_2);
                    this.P = true;
                    this.N = System.currentTimeMillis() + 50L * (long)var9_8;
                }
            }
            catch (O_ v33) {
                throw xe.a(v33);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xe.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                xe.e[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xe.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xe.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l10, long l11) {
        int n2 = xe.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xe.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xe.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xe.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xe.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xe.b(267743042943938L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xe.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xe.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xe.b(267743042943938L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "k\u007fyx";
        objectArray[1] = Boolean.TYPE;
        xe.h[1] = "java/lang/Boolean";
        objectArray[2] = Void.TYPE;
        xe.h[2] = "java/lang/Void";
        objectArray[3] = "\u0005J0:X-\u000eE!u9#\u0005N%/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">R\u001dH\u0013\u000bm\u0013C-\u00076%D\u001c_\u0015GlX\u0018-RYmP\u0010\u0016S\r.Oy";
    }

    public xe(xi xi2, String string) {
        super(xi2, string);
    }

    @OY
    public void h(Ky ky2) {
        int[] nArray;
        block57: {
            boolean bl2;
            on on2;
            long l10;
            block60: {
                block59: {
                    int n2;
                    block58: {
                        block56: {
                            int n3;
                            block53: {
                                block55: {
                                    int n4;
                                    block54: {
                                        block51: {
                                            block52: {
                                                block50: {
                                                    block49: {
                                                        l10 = d ^ 0x34B3924E1CBL;
                                                        n4 = -100 + ky2.getButton();
                                                        nArray = Vt.W();
                                                        try {
                                                            try {
                                                                n2 = ky2.getButtonState();
                                                                if (nArray == null) break block49;
                                                                if (n2 == 0) break block50;
                                                            }
                                                            catch (O_ o_2) {
                                                                throw xe.a(o_2);
                                                            }
                                                            n2 = ((AQ)this.n()).n() ? 1 : 0;
                                                        }
                                                        catch (O_ o_3) {
                                                            throw xe.a(o_3);
                                                        }
                                                    }
                                                    try {
                                                        if (nArray == null) break block51;
                                                        if (n2 != 0) break block52;
                                                    }
                                                    catch (O_ o_4) {
                                                        throw xe.a(o_4);
                                                    }
                                                }
                                                return;
                                            }
                                            n2 = n4;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                n3 = EP.N().D().t();
                                                                if (nArray == null) break block53;
                                                                if (n2 != n3) break block54;
                                                            }
                                                            catch (O_ o_5) {
                                                                throw xe.a(o_5);
                                                            }
                                                            n2 = ((AQ)this.n()).G() ? 1 : 0;
                                                            if (nArray == null) break block55;
                                                        }
                                                        catch (O_ o_6) {
                                                            throw xe.a(o_6);
                                                        }
                                                        if (n2 == 0) break block54;
                                                    }
                                                    catch (O_ o_7) {
                                                        throw xe.a(o_7);
                                                    }
                                                    n2 = rT.e() ? 1 : 0;
                                                    if (nArray == null) break block55;
                                                }
                                                catch (O_ o_8) {
                                                    throw xe.a(o_8);
                                                }
                                                if (n2 == 0) break block54;
                                            }
                                            catch (O_ o_9) {
                                                throw xe.a(o_9);
                                            }
                                            ky2.setCanceled(true);
                                            return;
                                        }
                                        catch (O_ o_10) {
                                            throw xe.a(o_10);
                                        }
                                    }
                                    n2 = n4;
                                }
                                try {
                                    if (nArray == null) break block56;
                                    n3 = EP.N().G().t();
                                }
                                catch (O_ o_11) {
                                    throw xe.a(o_11);
                                }
                            }
                            try {
                                if (n2 != n3) break block57;
                                n2 = ((AQ)this.n()).G() ? 1 : 0;
                            }
                            catch (O_ o_12) {
                                throw xe.a(o_12);
                            }
                        }
                        try {
                            if (nArray == null) break block58;
                            if (n2 == 0) break block59;
                        }
                        catch (O_ o_13) {
                            throw xe.a(o_13);
                        }
                        n2 = rT.H() ? 1 : 0;
                    }
                    if (n2 == 0) {
                        return;
                    }
                }
                on2 = XO.b.B();
                try {
                    try {
                        bl2 = on2.r();
                        if (nArray == null) break block60;
                        if (!bl2) break block57;
                    }
                    catch (O_ o_14) {
                        throw xe.a(o_14);
                    }
                    bl2 = on2.l().B(eM.Ut);
                }
                catch (O_ o_15) {
                    throw xe.a(o_15);
                }
            }
            if (bl2) {
                int n5;
                block64: {
                    int n4;
                    int n6;
                    block63: {
                        int n8;
                        block62: {
                            block61: {
                                Qt qt2 = new Qt(on2.l());
                                n8 = qt2.b();
                                n5 = J.H.C() + 1;
                                try {
                                    try {
                                        n6 = this.z;
                                        if (nArray == null) break block61;
                                        if (n6 != 0) break block57;
                                    }
                                    catch (O_ o_16) {
                                        throw xe.a(o_16);
                                    }
                                    n6 = ky2.getThePlayer().w();
                                }
                                catch (O_ o_17) {
                                    throw xe.a(o_17);
                                }
                            }
                            try {
                                if (nArray == null) break block62;
                                if (n6 != 0) break block57;
                            }
                            catch (O_ o_18) {
                                throw xe.a(o_18);
                            }
                            n6 = n8;
                        }
                        try {
                            try {
                                n4 = n5 + 1;
                                if (nArray == null) break block63;
                                if (n6 > n4) break block57;
                            }
                            catch (O_ o_19) {
                                throw xe.a(o_19);
                            }
                            int n4 = n8;
                            n4 = n5;
                        }
                        catch (O_ o_20) {
                            throw xe.a(o_20);
                        }
                    }
                    try {
                        xe xe2;
                        try {
                            try {
                                if (n6 > n4) break block57;
                                xe2 = this;
                                if (nArray == null) break block64;
                            }
                            catch (O_ o_21) {
                                throw xe.a(o_21);
                            }
                            if (((AQ)xe2.n()).T() == null) break block57;
                        }
                        catch (O_ o_22) {
                            throw xe.a(o_22);
                        }
                        xe.a("\u00f5", (Object)this, (boolean)true, (long)6557522656830935407L, (long)l10);
                        xe2 = this;
                    }
                    catch (O_ o_23) {
                        throw xe.a(o_23);
                    }
                }
                xe2.N = System.currentTimeMillis() + 50L * (long)(n5 + 1);
            }
        }
        try {
            if (nArray == null) {
                ht.I(new String[4]);
            }
        }
        catch (O_ o_24) {
            throw xe.a(o_24);
        }
    }

    @Override
    public boolean I() {
        return false;
    }

    @Override
    public boolean y() {
        return this.z;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void lambda$onDamaged$0() {
        long l10 = d ^ 0x5A6770A4E3A4L;
        xe.a("\u00f5", (Object)this, (boolean)false, (long)6444186182719623936L, (long)l10);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xe.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

