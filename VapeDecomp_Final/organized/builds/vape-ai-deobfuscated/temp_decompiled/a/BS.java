/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.OT;
import a.O_;
import a.Rs;
import a.Sz;
import a.WU;
import a.X_;
import a.a2;
import a.bM;
import a.bt;
import a.cC;
import a.cl;
import a.d8;
import a.ht;
import a.j3;
import a.jE;
import a.jG;
import a.jU;
import a.jV;
import a.jX;
import a.jd;
import a.jk;
import a.js;
import a.k2;
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
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bs
extends ht {
    private final WU<?, ?> D;
    private final bM R;
    private static final long[] v;
    private final OT L;
    private static final long n;
    private final bt b;
    private static final Map E;
    private static final Integer[] B;
    private final a2 V;
    private static final Object[] F;
    private static final String[] Y;

    @Override
    public void U() {
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "LFn";
        objectArray[1] = Integer.TYPE;
        bs.Y[1] = "java/lang/Integer";
        objectArray[2] = "\u0001\u000f\u0013\u001bI/\n\u0000\u0002T47\u0019\u0007\u000b\u001d";
        objectArray[3] = "\u0001|L8-O\ns]wLA\u0001xY-";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0011*h<k\u001eP%(\f\u007f\u0018+w`js\u0000\u00174`m*c\u00123+so\n\u0011 <4\u0014";
    }

    private static Method h(long l10, long l11) {
        int n2 = bs.e(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Y[n2];
                int n4 = string2.indexOf(8);
                clazz3 = bs.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bs.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bs.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        bs.F[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bs.f(211396864086080L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bs.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bs.F[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bs.f(211396864086080L, 0L);
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

    @Override
    public void d() {
    }

    @Override
    public double z() {
        return 15.0;
    }

    @Override
    public void G() {
        int n2;
        Object[] objectArray;
        long l10;
        block61: {
            block59: {
                block60: {
                    String string;
                    block58: {
                        l10 = n ^ 0x24DAAF2B0C97L;
                        string = ((jE)this.D.n()).O();
                        try {
                            if (!(this.D.n() instanceof cl) || ((jE)this.D.n()).G() == null) break block58;
                        }
                        catch (O_ o_2) {
                            throw bs.a(o_2);
                        }
                        string = string + (String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)10126, (long)(0x41C70C281E325A79L ^ l10)), (long)8938335468306293511L, (long)l10)) + ((jE)this.D.n()).G().O() + (String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)8395, (long)(0x178E7071E88DDD3EL ^ l10)), (long)8938335468306293511L, (long)l10));
                    }
                    try {
                        try {
                            this.R.d(string);
                            if (!(this.D.n() instanceof jU)) break block59;
                            if (!((Boolean)this.D.T()).booleanValue()) break block60;
                        }
                        catch (O_ o_3) {
                            throw bs.a(o_3);
                        }
                        this.b.H((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)12232, (long)(0x14E914AFBB07D22EL ^ l10)), (long)8938335468306293511L, (long)l10)));
                        break block61;
                    }
                    catch (O_ o_4) {
                        throw bs.a(o_4);
                    }
                }
                this.b.H((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)23184, (long)(0x56EDB4E4B7ACA76AL ^ l10)), (long)8938335468306293511L, (long)l10)));
                break block61;
            }
            if (this.D.n() instanceof jX) {
                objectArray = (jX)this.D.n();
                double[] dArray = (double[])this.D.T();
                this.b.H(objectArray.K().format(dArray[0]) + (String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)32661, (long)(0x2F896F83D2530263L ^ l10)), (long)8938335468306293511L, (long)l10)) + objectArray.K().format(dArray[1]));
            } else if (this.D.n() instanceof js) {
                objectArray = (js)this.D.n();
                Double d2 = (Double)this.D.T();
                this.b.H(objectArray.J().format(d2) + objectArray.I());
            } else if (this.D.n() instanceof cl) {
                Object object;
                StringBuilder stringBuilder;
                bt bt2;
                objectArray = (List)this.D.T();
                int n3 = objectArray.size();
                try {
                    bt2 = this.b;
                    stringBuilder = new StringBuilder().append(n3).append((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)949, (long)(0x2FC2587B2C3C7E55L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    object = n3 == 1 ? "" : bs.c("\u00c0", (int)bs.b("k", (int)28456, (long)(0x31007BCAB05B92CFL ^ l10)), (long)8938335468306293511L, (long)l10);
                }
                catch (O_ o_5) {
                    throw bs.a(o_5);
                }
                bt2.H(stringBuilder.append((String)object).toString());
                this.b.g(objectArray.toString());
            } else if (this.D.n() instanceof jd) {
                objectArray = (jG)this.D.T();
                this.b.H(objectArray.O());
            } else if (this.D.n() instanceof cC) {
                Object object;
                StringBuilder stringBuilder;
                bt bt3;
                objectArray = (List)this.D.T();
                int n4 = objectArray.size();
                try {
                    bt3 = this.b;
                    stringBuilder = new StringBuilder().append(n4).append((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)10088, (long)(0x30222B6B98A9DA80L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    object = n4 == 1 ? "" : bs.c("\u00c0", (int)bs.b("k", (int)9768, (long)(0x6EE8AAE5E2A45BD4L ^ l10)), (long)8938335468306293511L, (long)l10);
                }
                catch (O_ o_6) {
                    throw bs.a(o_6);
                }
                bt3.H(stringBuilder.append((String)object).toString());
            } else if (this.D.n() instanceof jV) {
                Object object;
                StringBuilder stringBuilder;
                bt bt4;
                objectArray = (Map)this.D.T();
                int n5 = objectArray.size();
                try {
                    bt4 = this.b;
                    stringBuilder = new StringBuilder().append(n5).append((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)13211, (long)(0x38F45AE00C5CE77L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    object = n5 == 1 ? "" : bs.c("\u00c0", (int)bs.b("k", (int)26553, (long)(0x1606923CBDB1A53L ^ l10)), (long)8938335468306293511L, (long)l10);
                }
                catch (O_ o_7) {
                    throw bs.a(o_7);
                }
                bt4.H(stringBuilder.append((String)object).toString());
            } else if (this.D.n() instanceof j3) {
                Object object;
                StringBuilder stringBuilder;
                bt bt5;
                this.R.d((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)24785, (long)(0x6F24E3408AC99D33L ^ l10)), (long)8938335468306293511L, (long)l10)));
                objectArray = (Boolean[])this.D.T();
                j3 j32 = (j3)this.D.n();
                boolean bl2 = objectArray[j32.S().indexOf(j32.c())];
                boolean bl3 = objectArray[j32.S().indexOf(j32.J())];
                n2 = objectArray[j32.S().indexOf(j32.G())].booleanValue();
                boolean bl4 = objectArray[j32.S().indexOf(j32.q())];
                boolean bl5 = objectArray[j32.S().indexOf(j32.z())];
                boolean bl6 = objectArray[j32.S().indexOf(j32.u())];
                boolean bl7 = (Boolean)objectArray[j32.S().indexOf(j32.t())];
                int n6 = 0;
                for (Object object2 : objectArray) {
                    try {
                        if (!((Boolean)object2).booleanValue()) continue;
                        ++n6;
                    }
                    catch (O_ o_8) {
                        throw bs.a(o_8);
                    }
                }
                try {
                    bt5 = this.b;
                    stringBuilder = new StringBuilder().append(n6).append((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)1634, (long)(0x20792DCA95167B96L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    object = n6 == 1 ? "" : bs.c("\u00c0", (int)bs.b("k", (int)9550, (long)(0xAAB67D09A3D8B5L ^ l10)), (long)8938335468306293511L, (long)l10);
                }
                catch (O_ o_9) {
                    throw bs.a(o_9);
                }
                bt5.H(stringBuilder.append((String)object).toString());
                StringJoiner stringJoiner = new StringJoiner((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)20739, (long)(0x62C8EA9467612CF1L ^ l10)), (long)8938335468306293511L, (long)l10)));
                try {
                    stringJoiner.setEmptyValue((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)32145, (long)(0x444A7A7CFD88006FL ^ l10)), (long)8938335468306293511L, (long)l10)));
                    if (bl2) {
                        stringJoiner.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)26504, (long)(0x2B976BE134FD1A63L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_10) {
                    throw bs.a(o_10);
                }
                try {
                    if (bl3) {
                        stringJoiner.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)19399, (long)(0x49DA88AE81323622L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_11) {
                    throw bs.a(o_11);
                }
                try {
                    if (n2 != 0) {
                        stringJoiner.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)1375, (long)(0x4AC4AA504AF1F8AEL ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_12) {
                    throw bs.a(o_12);
                }
                try {
                    if (bl4) {
                        stringJoiner.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)30423, (long)(0x73E6F8FAC56A0B2AL ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_13) {
                    throw bs.a(o_13);
                }
                StringJoiner stringJoiner2 = new StringJoiner((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)22382, (long)(0x74B866A1915DAA96L ^ l10)), (long)8938335468306293511L, (long)l10)));
                try {
                    stringJoiner2.setEmptyValue((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)6091, (long)(0xE1E7AA211226A24L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    if (bl5) {
                        stringJoiner2.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)8402, (long)(0x5A8DA98B3159DD22L ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_14) {
                    throw bs.a(o_14);
                }
                try {
                    if (bl6) {
                        stringJoiner2.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)32188, (long)(0x5D6312DA1FAE004FL ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_15) {
                    throw bs.a(o_15);
                }
                try {
                    if (bl7) {
                        stringJoiner2.add((CharSequence)((Object)bs.c("\u00c0", (int)bs.b("k", (int)28441, (long)(0x15F83B6894CB92FAL ^ l10)), (long)8938335468306293511L, (long)l10)));
                    }
                }
                catch (O_ o_16) {
                    throw bs.a(o_16);
                }
                this.b.g((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)24238, (long)(0x4362A9451310A340L ^ l10)), (long)8938335468306293511L, (long)l10)) + stringJoiner + (String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)9594, (long)(0x5DFD1B8CE58FD897L ^ l10)), (long)8938335468306293511L, (long)l10)) + stringJoiner2);
            } else {
                Object object;
                bt bt6;
                block62: {
                    try {
                        if (!(this.D.n() instanceof jk)) break block62;
                        this.b.H((String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)6097, (long)(0x3DED2B3B9FE16A30L ^ l10)), (long)8938335468306293511L, (long)l10)));
                        this.b.T(10.0);
                        this.b.w(10.0);
                        break block61;
                    }
                    catch (O_ o_17) {
                        throw bs.a(o_17);
                    }
                }
                try {
                    bt6 = this.b;
                    object = this.D.n() != null ? this.D.n().toString() : bs.c("\u00c0", (int)bs.b("k", (int)4408, (long)(0x3A3197D28BF36CC1L ^ l10)), (long)8938335468306293511L, (long)l10);
                }
                catch (O_ o_18) {
                    throw bs.a(o_18);
                }
                bt6.H((String)object);
            }
        }
        double d3 = this.G();
        this.getClass();
        this.R.b(d3 + 5.0);
        this.R.M(this.W() + 2.0);
        this.R.Q(this.l());
        double d4 = this.w();
        this.getClass();
        this.R.a(d4 - (double)(5.0f * 2.0f) - 4.0 - this.b.w());
        this.R.e(0.75);
        double d5 = this.G() + this.w() - this.b.D();
        this.getClass();
        this.b.b(d5 - (double)(5.0f * 2.0f));
        this.b.M(this.W());
        this.b.T(this.b.D());
        this.b.q(true);
        if (this.D.n() instanceof jk) {
            objectArray = (Object[])this.D.T();
            float f10 = ((Double)objectArray[0]).floatValue() / 255.0f;
            float f11 = ((Double)objectArray[2]).floatValue() / 255.0f;
            float f12 = ((Double)objectArray[1]).floatValue() / 255.0f;
            n2 = Color.HSBtoRGB(f10, f11, f12);
            k2 k22 = new k2(n2, 255);
            k2 k23 = new k2(Rs.I(k22, 0, 240, true));
            k23.I(150);
            this.b.B(k23);
            X_.B(k22, (float)(this.G() + this.w() - 5.0 - 6.0), (float)this.W() + 1.0f, (String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)19223, (long)(0x2774C1764DD936E8L ^ l10)), (long)8938335468306293511L, (long)l10)), 7.0f, 7.0f, false);
        } else {
            double d6 = this.b.G() + 3.0;
            double d7 = this.W();
            double d9 = this.b.w();
            this.getClass();
            F8.C(d6, d7, d9 + 5.0 - 0.5, this.b.b() - 1.0, new Color(255, 255, 255, 10), 1.0f);
        }
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bs.e(l10, l11);
            object = F[n2];
            try {
                if (!(object instanceof String)) break block2;
                bs.F[n2] = clazz = Class.forName(Y[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void g() {
    }

    @Override
    public void Z(Sz sz2) {
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Y[n5] != null) {
            return n5;
        }
        Object object = F[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 33;
                break;
            }
            case 1: {
                n4 = 39;
                break;
            }
            case 2: {
                n4 = 13;
                break;
            }
            case 3: {
                n4 = 34;
                break;
            }
            case 4: {
                n4 = 48;
                break;
            }
            case 5: {
                n4 = 7;
                break;
            }
            case 6: {
                n4 = 21;
                break;
            }
            case 7: {
                n4 = 56;
                break;
            }
            case 8: {
                n4 = 25;
                break;
            }
            case 9: {
                n4 = 23;
                break;
            }
            case 10: {
                n4 = 45;
                break;
            }
            case 11: {
                n4 = 32;
                break;
            }
            case 12: {
                n4 = 11;
                break;
            }
            case 13: {
                n4 = 2;
                break;
            }
            case 14: {
                n4 = 37;
                break;
            }
            case 15: {
                n4 = 15;
                break;
            }
            case 16: {
                n4 = 9;
                break;
            }
            case 17: {
                n4 = 20;
                break;
            }
            case 18: {
                n4 = 44;
                break;
            }
            case 19: {
                n4 = 57;
                break;
            }
            case 20: {
                n4 = 22;
                break;
            }
            case 21: {
                n4 = 46;
                break;
            }
            case 22: {
                n4 = 38;
                break;
            }
            case 23: {
                n4 = 16;
                break;
            }
            case 24: {
                n4 = 62;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 40;
                break;
            }
            case 27: {
                n4 = 41;
                break;
            }
            case 28: {
                n4 = 17;
                break;
            }
            case 29: {
                n4 = 55;
                break;
            }
            case 30: {
                n4 = 14;
                break;
            }
            case 31: {
                n4 = 10;
                break;
            }
            case 32: {
                n4 = 5;
                break;
            }
            case 33: {
                n4 = 12;
                break;
            }
            case 34: {
                n4 = 50;
                break;
            }
            case 35: {
                n4 = 58;
                break;
            }
            case 36: {
                n4 = 18;
                break;
            }
            case 37: {
                n4 = 4;
                break;
            }
            case 38: {
                n4 = 27;
                break;
            }
            case 39: {
                n4 = 31;
                break;
            }
            case 40: {
                n4 = 63;
                break;
            }
            case 41: {
                n4 = 42;
                break;
            }
            case 42: {
                n4 = 1;
                break;
            }
            case 43: {
                n4 = 53;
                break;
            }
            case 44: {
                n4 = 35;
                break;
            }
            case 45: {
                n4 = 6;
                break;
            }
            case 46: {
                n4 = 3;
                break;
            }
            case 47: {
                n4 = 43;
                break;
            }
            case 48: {
                n4 = 29;
                break;
            }
            case 49: {
                n4 = 26;
                break;
            }
            case 50: {
                n4 = 24;
                break;
            }
            case 51: {
                n4 = 51;
                break;
            }
            case 52: {
                n4 = 28;
                break;
            }
            case 53: {
                n4 = 60;
                break;
            }
            case 54: {
                n4 = 61;
                break;
            }
            case 55: {
                n4 = 8;
                break;
            }
            case 56: {
                n4 = 52;
                break;
            }
            case 57: {
                n4 = 47;
                break;
            }
            case 58: {
                n4 = 30;
                break;
            }
            case 59: {
                n4 = 19;
                break;
            }
            case 60: {
                n4 = 49;
                break;
            }
            case 61: {
                n4 = 54;
                break;
            }
            case 62: {
                n4 = 36;
                break;
            }
            default: {
                n4 = 59;
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
        bs.Y[n5] = new String(cArray);
        return n5;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    @Override
    public double e() {
        return 80.0;
    }

    private static Field g(long l10, long l11) {
        int n2 = bs.e(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            String string = Y[n2];
            int n3 = string.indexOf(8);
            Class clazz = bs.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bs.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bs.c(clazz3, string2, clazz2)) != null) {
                    bs.F[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bs.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bs.F[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bs.f(211396864086080L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bs.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bs.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bs.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1F1;
        if (B[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = v[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bs", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bs.B[n3] = n4;
        }
        return B[n3];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'f' || c10 == 'w' || c10 == '\u00e4' || c10 == '\u00ed') {
                field = bs.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'w' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bs.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public bs(OT oT2, a2 a22, WU<?, ?> wU2) {
        long l10 = n ^ 0x1DE7B1700A73L;
        this.L = oT2;
        this.V = a22;
        this.D = wU2;
        this.R = new bM(((jE)wU2.n()).O(), (String)((Object)bs.c("\u00c0", (int)bs.b("k", (int)8977, (long)(0x2F73A63080E9D81CL ^ l10)), (long)8858406732824634851L, (long)l10)), 50.0, 0.75, bs.M.n, false, false);
        this.b = new bt("", 0.7);
        this.o(this.R, this.b);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bs.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bs.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bs.n = d8.a(-3872489175100215674L, -2571284405201256345L, MethodHandles.lookup().lookupClass()).a(44515059398608L);
                bs.F = new Object[5];
                bs.Y = new String[5];
                bs.a();
                bs.E = new HashMap<K, V>(13);
                var0 = bs.n ^ 75445076533452L;
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
                var8_3 = new long[31];
                var5_4 = 0;
                var6_5 = "\u00f3\n\u00b6D\u00feuP\u00d0\u00f3\u00b6Ge\u00c3\u00a4\bW9>\u00dd\u0092\u00e1\u00bb.;\\+\u00f8\u0012>\u00e6r@\u008a\u0011(\u009c\u00cd\u00c1\\\t\u00d7\u00fa\u00bd`\u00e2\u009b\u001a\u00e6[\u00e4\u0007\u00ee\u00f7\u00c1\u000f\u0005\u00c8\u0086\u009ex\u00cat\u00ba\u00c4\u00e7\n\u0087O\u008f\u00ea\u00c6\u00cd\u00d8Z\u00fb(Ie\u0011f\u00e7\u00fc\n\u00f7\u00aa\u00eakZpf\u0083d>\u00f1\u00a3I,G6\u001a\u00a3{\u00da]\u00bc0*yS\u001e\u00ad\u00a2\u00f1\u00fb[:\u00c5!5\u0099\u00e1\u00a3\u00c9\u00ce\u0095\u00d9\u009dYD\u00b2@\u00c8\u0019Z\u0006\u0085\u0090\u00d3\u00c4\u00fezV\u00e5s\u0097\u0089\u0006\u008fM\u00dc[\u00aa\u007f\u00d1P.\u009b\u00ba\u00a5`\u0080X\u0095\u001e\u0096PdRz\u00ed\u00fdj=k\u009e\u00ae\u00c3\u0013\u0006R\u008c\fb3j\u00031\u00af\u00c1\u00cf3+\u00bb\u00f7w\u000b\u00d1w\u008d\u0096\u00c0\u00c6E\u00db\u0090\u0093\u001f\u0016Y8\u0081\u009b\u0000\u0081v\u008a\u00d2\u008d\u0081!\u00f3!\u00d6\u0090\u001fq\u00a6\"\u0013\u0082\u001bP";
                var7_6 = "\u00f3\n\u00b6D\u00feuP\u00d0\u00f3\u00b6Ge\u00c3\u00a4\bW9>\u00dd\u0092\u00e1\u00bb.;\\+\u00f8\u0012>\u00e6r@\u008a\u0011(\u009c\u00cd\u00c1\\\t\u00d7\u00fa\u00bd`\u00e2\u009b\u001a\u00e6[\u00e4\u0007\u00ee\u00f7\u00c1\u000f\u0005\u00c8\u0086\u009ex\u00cat\u00ba\u00c4\u00e7\n\u0087O\u008f\u00ea\u00c6\u00cd\u00d8Z\u00fb(Ie\u0011f\u00e7\u00fc\n\u00f7\u00aa\u00eakZpf\u0083d>\u00f1\u00a3I,G6\u001a\u00a3{\u00da]\u00bc0*yS\u001e\u00ad\u00a2\u00f1\u00fb[:\u00c5!5\u0099\u00e1\u00a3\u00c9\u00ce\u0095\u00d9\u009dYD\u00b2@\u00c8\u0019Z\u0006\u0085\u0090\u00d3\u00c4\u00fezV\u00e5s\u0097\u0089\u0006\u008fM\u00dc[\u00aa\u007f\u00d1P.\u009b\u00ba\u00a5`\u0080X\u0095\u001e\u0096PdRz\u00ed\u00fdj=k\u009e\u00ae\u00c3\u0013\u0006R\u008c\fb3j\u00031\u00af\u00c1\u00cf3+\u00bb\u00f7w\u000b\u00d1w\u008d\u0096\u00c0\u00c6E\u00db\u0090\u0093\u001f\u0016Y8\u0081\u009b\u0000\u0081v\u008a\u00d2\u008d\u0081!\u00f3!\u00d6\u0090\u001fq\u00a6\"\u0013\u0082\u001bP".length();
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
                    var6_5 = "\u00a3\u00ecg\u008cl\u00ea\u0087\u00a3\u009bm\u00d7<\u001b\u00c3T\u001a";
                    var7_6 = "\u00a3\u00ecg\u008cl\u00ea\u0087\u00a3\u009bm\u00d7<\u001b\u00c3T\u001a".length();
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
        bs.v = var8_3;
        bs.B = new Integer[31];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bs.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

