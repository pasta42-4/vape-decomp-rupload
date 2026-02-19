/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.F8;
import a.G5;
import a.OD;
import a.O_;
import a.X_;
import a.cl;
import a.d8;
import a.fE;
import a.fv;
import a.hh;
import a.iw;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hm
extends hh {
    private static final Integer[] eb;
    private boolean px;
    private static final Object[] mb;
    private static final Map fb;
    private fv pl;
    private String pr;
    private cl pJ;
    private static final long[] db;
    private boolean pT;
    private iw Y;
    private static final String[] nb;
    private static final long ab;
    protected fE D;

    private void z() {
        block12: {
            block13: {
                boolean bl2;
                hm hm2;
                block10: {
                    block11: {
                        try {
                            try {
                                if (!this.pT) break block10;
                                if (this.pl != null) break block11;
                            }
                            catch (O_ o_2) {
                                throw hm.b(o_2);
                            }
                            this.pl = new fv(this);
                        }
                        catch (O_ o_3) {
                            throw hm.b(o_3);
                        }
                    }
                    this.pl.Z();
                    this.D = Ao.v(this, this.pl.E(), fE.class);
                    this.D.d(true);
                    break block12;
                }
                try {
                    hm2 = this;
                    bl2 = !this.h();
                }
                catch (O_ o_4) {
                    throw hm.b(o_4);
                }
                try {
                    try {
                        hm2.g(bl2);
                        if (!this.h()) break block12;
                        if (this.pl != null) break block13;
                    }
                    catch (O_ o_5) {
                        throw hm.b(o_5);
                    }
                    this.pl = new fv(this);
                }
                catch (O_ o_6) {
                    throw hm.b(o_6);
                }
            }
            this.Y = Ao.K.S();
            this.Y.B(this.pl);
            this.pl.Z();
        }
    }

    @Override
    public void G() {
        block11: {
            float f10;
            Color color;
            long l10;
            block10: {
                Color color2;
                double d2;
                double d3;
                double d4;
                double d5;
                Color color3;
                Color color4;
                G5 g5;
                G5 g52;
                block9: {
                    block8: {
                        l10 = ab ^ 0x58AE7AD3C906L;
                        this.S();
                        g52 = this.L(0.9);
                        g5 = this.L(0.75);
                        color4 = hm.M.W;
                        try {
                            if (!this.V()) break block8;
                            color3 = hm.M.c;
                            break block9;
                        }
                        catch (O_ o_2) {
                            throw hm.b(o_2);
                        }
                    }
                    try {
                        color3 = this.h() ? hm.M.c : hm.M.n;
                    }
                    catch (O_ o_3) {
                        throw hm.b(o_3);
                    }
                }
                color = color3;
                Color color5 = hm.M.w;
                f10 = (float)(this.W() + this.b() / 2.0) - 3.0f;
                double d6 = g52.B(this.pJ.O());
                double d7 = this.W() + this.b() / 2.0 - d6 / 2.0 - 2.5;
                double d9 = d7 + 7.5;
                try {
                    d5 = this.G() + 5.0;
                    d4 = this.W() + 2.5;
                    d3 = this.w() - 10.0;
                    d2 = this.b() - 5.0;
                    color2 = this.h() ? M.j() : this.z().k();
                }
                catch (O_ o_4) {
                    throw hm.b(o_4);
                }
                try {
                    F8.S(d5, d4, d3, d2, color2);
                    F8.S(this.G() + 5.0 + 0.5, this.W() + 2.5 + 0.5, this.w() - 10.0 - 1.0, this.b() - 5.0 - 1.0, color4);
                    g52.R(this.pr, this.G() + 15.0 + 8.0, d7, color);
                    g52.R("" + this.v(), this.G() + this.w() - 10.0 - g52.D((String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)32332, (long)(0x780CEA5CF69DA19EL ^ l10)), (long)8938329208565003254L, (long)l10))), d7, color);
                    g5.R(this.G(g5, this.w() - 35.0), this.G() + 15.0 + 8.0, d9, color5);
                    if (!this.px) break block10;
                    X_.B(color, (float)this.G() + 10.0f + 0.5f, f10, (String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)21839, (long)(0x50CDC42BB1C40A93L ^ l10)), (long)8938329208565003254L, (long)l10)), 6.0f, 6.0f, false);
                    X_.B(hm.M.O, (float)this.G() + 10.0f - 0.5f, f10, (String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)26435, (long)(0x57170763E57F3898L ^ l10)), (long)8938329208565003254L, (long)l10)), 6.0f, 6.0f, false);
                    break block11;
                }
                catch (O_ o_5) {
                    throw hm.b(o_5);
                }
            }
            X_.B(color, (float)this.G() + 10.0f + 0.5f, f10, (String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)28899, (long)(0x175F06A428C32F3DL ^ l10)), (long)8938329208565003254L, (long)l10)), 6.0f, 6.0f, false);
            X_.B(hm.M.Y, (float)this.G() + 10.0f + 0.5f, f10, (String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)10500, (long)(0x579C1485119A76C7L ^ l10)), (long)8938329208565003254L, (long)l10)), 6.0f, 6.0f, false);
        }
    }

    private static void i() {
        Object[] objectArray = mb;
        mb[0] = "\u001fl ";
        objectArray[1] = Integer.TYPE;
        hm.nb[1] = "java/lang/Integer";
        objectArray[2] = "UB7\u0005<\u001a^M&JA\u0002MJ/\u0003";
        objectArray[3] = "Jd'C#vAk6\fBxJ`2V";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0000\u001c;\u0001 \u0002P\u0002zsw\u00029GzC$G\u0003C<\u0013gy\u0003F\"\u0017~DGC?O\u001c";
    }

    public String k() {
        return this.pr;
    }

    public void d(boolean bl2) {
        this.pT = bl2;
    }

    private String G(G5 g5, double d2) {
        long l10 = ab ^ 0x64FABC5D642CL;
        StringBuilder stringBuilder = new StringBuilder();
        for (Object e10 : (List)this.pJ.J()) {
            try {
                try {
                    if (e10 instanceof OD && !((OD)e10).t()) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw hm.b(o_2);
                }
            }
            catch (O_ o_3) {
                throw hm.b(o_3);
            }
            try {
                if (stringBuilder.toString().length() < 1) {
                    stringBuilder.append(e10.toString());
                    continue;
                }
            }
            catch (O_ o_4) {
                throw hm.b(o_4);
            }
            String string = (String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)14927, (long)(0x4A7F76C36B848B3L ^ l10)), (long)-3377295812868612388L, (long)l10)) + e10.toString();
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                if (g5.D(stringBuilder2.append(stringBuilder.toString()).append(string).toString()) < d2) {
                    stringBuilder.append(string);
                    continue;
                }
            }
            catch (O_ o_5) {
                throw hm.b(o_5);
            }
            stringBuilder.append((String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)18225, (long)(0x18F1AB3A5C5C35CEL ^ l10)), (long)-3377295812868612388L, (long)l10)));
            break;
        }
        try {
            if (stringBuilder.length() < 1) {
                stringBuilder.append((String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)7737, (long)(0x3B274C4DAB556CD3L ^ l10)), (long)-3377295812868612388L, (long)l10)));
            }
        }
        catch (O_ o_6) {
            throw hm.b(o_6);
        }
        return stringBuilder.toString();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void E() {
        block4: {
            try {
                try {
                    if (this.pT || this.pl == null) break block4;
                }
                catch (O_ o_2) {
                    throw hm.b(o_2);
                }
                this.pl.T();
            }
            catch (O_ o_3) {
                throw hm.b(o_3);
            }
        }
        super.E();
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c1' || c10 == 'r' || c10 == 'O' || c10 == '\u00f9') {
                field = hm.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = hm.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public cl J() {
        return this.pJ;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = hm.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = hm.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = hm.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private int v() {
        return ((List)this.pJ.J()).size();
    }

    private static Method h(long l10, long l11) {
        int n2 = hm.e(l10, l11);
        Object object = mb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = nb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = hm.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = hm.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = hm.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        hm.mb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = hm.f(274126210796452L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = hm.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        hm.mb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = hm.f(274126210796452L, 0L);
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

    public hm(cl cl2) {
        block15: {
            String string;
            long l10;
            block17: {
                block16: {
                    block14: {
                        boolean bl2;
                        block13: {
                            block12: {
                                l10 = ab ^ 0x2297729F1DA9L;
                                this.pJ = cl2;
                                this.L(cl2);
                                this.N(this::lambda$new$0);
                                string = cl2.O().toLowerCase();
                                try {
                                    try {
                                        hm hm2 = this;
                                        if (!string.contains((CharSequence)((Object)hm.d("\u00e1", (int)hm.b("m", (int)32589, (long)(0x4E6143D4F19B7420L ^ l10)), (long)-6294861059294550183L, (long)l10))) && !string.contains((CharSequence)((Object)hm.d("\u00e1", (int)hm.b("m", (int)5595, (long)(0x20A60ABDF8781EACL ^ l10)), (long)-6294861059294550183L, (long)l10)))) break block12;
                                    }
                                    catch (O_ o_2) {
                                        throw hm.b(o_2);
                                    }
                                    bl2 = true;
                                    break block13;
                                }
                                catch (O_ o_3) {
                                    throw hm.b(o_3);
                                }
                            }
                            bl2 = false;
                        }
                        try {
                            hm2.px = bl2;
                            if (!string.contains((CharSequence)((Object)hm.d("\u00e1", (int)hm.b("m", (int)17364, (long)(0x5F92B2AD70B3C8ABL ^ l10)), (long)-6294861059294550183L, (long)l10)))) break block14;
                            this.pr = hm.d("\u00e1", (int)hm.b("m", (int)10869, (long)(0x1883B4810B9210DL ^ l10)), (long)-6294861059294550183L, (long)l10);
                            break block15;
                        }
                        catch (O_ o_4) {
                            throw hm.b(o_4);
                        }
                    }
                    try {
                        if (!string.contains((CharSequence)((Object)hm.d("\u00e1", (int)hm.b("m", (int)26427, (long)(0x70263D0BE49FEC45L ^ l10)), (long)-6294861059294550183L, (long)l10)))) break block16;
                        this.pr = hm.d("\u00e1", (int)hm.b("m", (int)23689, (long)(0x6A46B80D36D557FFL ^ l10)), (long)-6294861059294550183L, (long)l10);
                        break block15;
                    }
                    catch (O_ o_5) {
                        throw hm.b(o_5);
                    }
                }
                try {
                    if (!string.contains((CharSequence)((Object)hm.d("\u00e1", (int)hm.b("m", (int)31816, (long)(0x671FAE394719F734L ^ l10)), (long)-6294861059294550183L, (long)l10)))) break block17;
                    this.pr = hm.d("\u00e1", (int)hm.b("m", (int)13000, (long)(0x7EE2285C6B3FB9B3L ^ l10)), (long)-6294861059294550183L, (long)l10);
                    break block15;
                }
                catch (O_ o_6) {
                    throw hm.b(o_6);
                }
            }
            try {
                this.pr = string.contains((CharSequence)((Object)hm.d("\u00e1", (int)hm.b("m", (int)8205, (long)(0x88ABDEC20BC2B63L ^ l10)), (long)-6294861059294550183L, (long)l10))) ? hm.d("\u00e1", (int)hm.b("m", (int)11919, (long)(0x12CCF9FAD80825FFL ^ l10)), (long)-6294861059294550183L, (long)l10) : string.substring(0, 1).toUpperCase() + string.substring(1).replaceAll((String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)26950, (long)(0x6E681DBEDB53E233L ^ l10)), (long)-6294861059294550183L, (long)l10)), (String)((Object)hm.d("\u00e1", (int)hm.b("m", (int)24440, (long)(0x10681B654E20540AL ^ l10)), (long)-6294861059294550183L, (long)l10)));
            }
            catch (O_ o_7) {
                throw hm.b(o_7);
            }
        }
    }

    private static Field g(long l10, long l11) {
        int n2 = hm.e(l10, l11);
        Object object = mb[n2];
        if (object instanceof String) {
            String string = nb[n2];
            int n3 = string.indexOf(8);
            Class clazz = hm.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = hm.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = hm.c(clazz3, string2, clazz2)) != null) {
                    hm.mb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = hm.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        hm.mb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = hm.f(274126210796452L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void g(boolean bl2) {
        block4: {
            try {
                try {
                    super.g(bl2);
                    if (bl2 || this.pl == null) break block4;
                }
                catch (O_ o_2) {
                    throw hm.b(o_2);
                }
                this.Y.d(this.pl);
            }
            catch (O_ o_3) {
                throw hm.b(o_3);
            }
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = hm.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean J() {
        return this.px;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = hm.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = hm.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (nb[n5] != null) {
            return n5;
        }
        Object object = mb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 1;
                break;
            }
            case 1: {
                n4 = 11;
                break;
            }
            case 2: {
                n4 = 0;
                break;
            }
            case 3: {
                n4 = 36;
                break;
            }
            case 4: {
                n4 = 42;
                break;
            }
            case 5: {
                n4 = 57;
                break;
            }
            case 6: {
                n4 = 47;
                break;
            }
            case 7: {
                n4 = 62;
                break;
            }
            case 8: {
                n4 = 13;
                break;
            }
            case 9: {
                n4 = 26;
                break;
            }
            case 10: {
                n4 = 27;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 51;
                break;
            }
            case 13: {
                n4 = 21;
                break;
            }
            case 14: {
                n4 = 28;
                break;
            }
            case 15: {
                n4 = 19;
                break;
            }
            case 16: {
                n4 = 15;
                break;
            }
            case 17: {
                n4 = 45;
                break;
            }
            case 18: {
                n4 = 12;
                break;
            }
            case 19: {
                n4 = 55;
                break;
            }
            case 20: {
                n4 = 20;
                break;
            }
            case 21: {
                n4 = 3;
                break;
            }
            case 22: {
                n4 = 35;
                break;
            }
            case 23: {
                n4 = 59;
                break;
            }
            case 24: {
                n4 = 49;
                break;
            }
            case 25: {
                n4 = 48;
                break;
            }
            case 26: {
                n4 = 39;
                break;
            }
            case 27: {
                n4 = 34;
                break;
            }
            case 28: {
                n4 = 22;
                break;
            }
            case 29: {
                n4 = 25;
                break;
            }
            case 30: {
                n4 = 30;
                break;
            }
            case 31: {
                n4 = 38;
                break;
            }
            case 32: {
                n4 = 8;
                break;
            }
            case 33: {
                n4 = 61;
                break;
            }
            case 34: {
                n4 = 32;
                break;
            }
            case 35: {
                n4 = 16;
                break;
            }
            case 36: {
                n4 = 9;
                break;
            }
            case 37: {
                n4 = 33;
                break;
            }
            case 38: {
                n4 = 6;
                break;
            }
            case 39: {
                n4 = 58;
                break;
            }
            case 40: {
                n4 = 50;
                break;
            }
            case 41: {
                n4 = 63;
                break;
            }
            case 42: {
                n4 = 54;
                break;
            }
            case 43: {
                n4 = 7;
                break;
            }
            case 44: {
                n4 = 5;
                break;
            }
            case 45: {
                n4 = 56;
                break;
            }
            case 46: {
                n4 = 14;
                break;
            }
            case 47: {
                n4 = 17;
                break;
            }
            case 48: {
                n4 = 52;
                break;
            }
            case 49: {
                n4 = 40;
                break;
            }
            case 50: {
                n4 = 60;
                break;
            }
            case 51: {
                n4 = 44;
                break;
            }
            case 52: {
                n4 = 53;
                break;
            }
            case 53: {
                n4 = 46;
                break;
            }
            case 54: {
                n4 = 43;
                break;
            }
            case 55: {
                n4 = 23;
                break;
            }
            case 56: {
                n4 = 4;
                break;
            }
            case 57: {
                n4 = 2;
                break;
            }
            case 58: {
                n4 = 31;
                break;
            }
            case 59: {
                n4 = 18;
                break;
            }
            case 60: {
                n4 = 24;
                break;
            }
            case 61: {
                n4 = 41;
                break;
            }
            case 62: {
                n4 = 10;
                break;
            }
            default: {
                n4 = 37;
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
        hm.nb[n5] = new String(cArray);
        return n5;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = hm.e(l10, l11);
            object = mb[n2];
            try {
                if (!(object instanceof String)) break block2;
                hm.mb[n2] = clazz = Class.forName(nb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                hm.ab = d8.a(2403949884832749610L, 1515820086880914445L, MethodHandles.lookup().lookupClass()).a(233949296394823L);
                hm.mb = new Object[5];
                hm.nb = new String[5];
                hm.i();
                hm.fb = new HashMap<K, V>(13);
                var0 = hm.ab ^ 29807885199455L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "\u009e,m\u00d35k\u00b2\u00f8\u00a3\u00ec\u00b8\u00cf\u00a3\u00c4\u00fe\r\u008a/\u00e5\u0005\t\u00ac\u001dl\u0010\u008f\u00038=\u008e\u00a2$\u00acj\\\u0013z\u00fd2\u0018\u008e~\u00bb}#z\u0088+p\u00ea\u0017\u000b\u0098n:33\u00e6?X\u00b9\t\u00fb\u00a6\u00f3d\b:\u00fb\u00a4\u00ceB[\r\u00ab}\u0095\u0097[\u001c\u00d6M\u0099a\u00bdR\u0088\u001a\u00a0Zf\u00ac!sG\u00d5|\u00e4\u0098\u00b5\u00cb\u00e0\u00a0v\u0001\u0083\u0081e\u00f5\u00af\r\u00060\u00907}\u0015\u0088\u00e3\u00af\u008d\u009a\u0094k\u00bd\u00bb\u0092\u000e\tC\u0088\u0003S\u00f1\u00e1\u00ed\u00e2y\u00f5\u00fd\u00db\u00a3\t\u00e1";
                var7_6 = "\u009e,m\u00d35k\u00b2\u00f8\u00a3\u00ec\u00b8\u00cf\u00a3\u00c4\u00fe\r\u008a/\u00e5\u0005\t\u00ac\u001dl\u0010\u008f\u00038=\u008e\u00a2$\u00acj\\\u0013z\u00fd2\u0018\u008e~\u00bb}#z\u0088+p\u00ea\u0017\u000b\u0098n:33\u00e6?X\u00b9\t\u00fb\u00a6\u00f3d\b:\u00fb\u00a4\u00ceB[\r\u00ab}\u0095\u0097[\u001c\u00d6M\u0099a\u00bdR\u0088\u001a\u00a0Zf\u00ac!sG\u00d5|\u00e4\u0098\u00b5\u00cb\u00e0\u00a0v\u0001\u0083\u0081e\u00f5\u00af\r\u00060\u00907}\u0015\u0088\u00e3\u00af\u008d\u009a\u0094k\u00bd\u00bb\u0092\u000e\tC\u0088\u0003S\u00f1\u00e1\u00ed\u00e2y\u00f5\u00fd\u00db\u00a3\t\u00e1".length();
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
                    var6_5 = "'\u00a62\u00c8\rZ*B\u00d7#\u00b1\u00d6W\u00e8\u00f9\u001f";
                    var7_6 = "'\u00a62\u00c8\rZ*B\u00d7#\u00b1\u00d6W\u00e8\u00f9\u001f".length();
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
        hm.db = var8_3;
        hm.eb = new Integer[20];
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x23D8;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = db[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hm", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hm.eb[n3] = n4;
        }
        return eb[n3];
    }

    private void lambda$new$0() {
        this.z();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hm.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(hm.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

