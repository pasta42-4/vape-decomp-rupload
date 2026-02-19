/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.Ao;
import a.C2;
import a.CG;
import a.EP;
import a.FG;
import a.ID;
import a.OL;
import a.O_;
import a.Or;
import a.SE;
import a.Sz;
import a.d8;
import a.eE;
import a.f9;
import a.fB;
import a.fK;
import a.f_;
import a.fr;
import a.fv;
import a.hr;
import a.ht;
import a.r5;
import a.sX;
import a.yQ;
import com.google.gson.JsonObject;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class w6
extends yQ
implements eE {
    private static final Object[] Cb;
    private boolean Oz;
    private static final long[] mb;
    protected boolean Ol;
    protected boolean Od;
    private static final long bb;
    private boolean OQ;
    private static final String[] Db;
    private hr Of;
    private ArrayList<fB> OK;
    private static ht[] OC;
    private static final Map pb;
    private boolean O9;
    private static final Integer[] ob;
    private boolean O_;
    protected sX Ob;
    private boolean OX;

    public double u() {
        double d2 = this.d();
        double d3 = this.H();
        try {
            if (this.G() < d3) {
                return d3;
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        try {
            if (this.G() > d2) {
                return d2;
            }
        }
        catch (O_ o_3) {
            throw w6.b(o_3);
        }
        return this.G();
    }

    public double D() {
        double d2 = this.L();
        double d3 = this.Z();
        try {
            if (this.W() < d2) {
                return d2;
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        try {
            if (this.W() > d3) {
                return d3;
            }
        }
        catch (O_ o_3) {
            throw w6.b(o_3);
        }
        return this.W();
    }

    public void L() {
    }

    public void R() {
        Ao.l(this);
    }

    public boolean i() {
        boolean bl2;
        block5: {
            block4: {
                double d2 = this.d();
                double d3 = this.H();
                try {
                    try {
                        if (!(this.G() < d3) && !(this.G() > d2)) break block4;
                    }
                    catch (O_ o_2) {
                        throw w6.b(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw w6.b(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void N() {
        if (!this.V().isEmpty()) {
            for (fB fB2 : this.V()) {
                try {
                    block8: {
                        try {
                            try {
                                if (fB2.s() || fB2 instanceof f9) break block8;
                            }
                            catch (O_ o_2) {
                                throw w6.b(o_2);
                            }
                            if (!(fB2 instanceof fr)) continue;
                        }
                        catch (O_ o_3) {
                            throw w6.b(o_3);
                        }
                    }
                    return;
                }
                catch (O_ o_4) {
                    throw w6.b(o_4);
                }
            }
        }
        super.N();
    }

    public void r(boolean bl2, boolean bl3) {
        block12: {
            block11: {
                try {
                    try {
                        if (this.f() == bl2 || !bl3) break block11;
                    }
                    catch (O_ o_2) {
                        throw w6.b(o_2);
                    }
                    SE.h.n();
                }
                catch (O_ o_3) {
                    throw w6.b(o_3);
                }
            }
            try {
                try {
                    if (!bl2 || !bl3) break block12;
                }
                catch (O_ o_4) {
                    throw w6.b(o_4);
                }
                Ao.A(this);
            }
            catch (O_ o_5) {
                throw w6.b(o_5);
            }
        }
        try {
            super.N(bl2);
            this.Od = false;
            if (this.N()) {
                this.q();
            }
        }
        catch (O_ o_6) {
            throw w6.b(o_6);
        }
    }

    protected void u(double d2, double d3) {
        this.b(this.G() + d2);
        this.M(this.W() + d3);
        for (ht ht2 : this.A()) {
            try {
                ht2.b(ht2.G() + d2);
                ht2.M(ht2.W() + d3);
                if (ht2 instanceof w6) {
                    ((w6)ht2).u(d2, d3);
                }
            }
            catch (O_ o_2) {
                throw w6.b(o_2);
            }
            try {
                if (ht2 instanceof yQ) {
                    ((yQ)ht2).t(d2, d3);
                }
            }
            catch (O_ o_3) {
                throw w6.b(o_3);
            }
            try {
                if (!(ht2 instanceof CG)) continue;
                ((C2)ht2).b(d2, d3);
            }
            catch (O_ o_4) {
                throw w6.b(o_4);
            }
        }
    }

    public void s(boolean bl2) {
        try {
            if (this.O_ != bl2) {
                SE.h.n();
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        this.O_ = bl2;
    }

    private static Field k(long l10, long l11) {
        int n2 = w6.i(l10, l11);
        Object object = Cb[n2];
        if (object instanceof String) {
            String string = Db[n2];
            int n3 = string.indexOf(8);
            Class clazz = w6.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = w6.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = w6.e(clazz3, string2, clazz2)) != null) {
                    w6.Cb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = w6.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        w6.Cb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = w6.j(254508967566656L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double H() {
        return -(this.w() * 0.75);
    }

    public abstract String A();

    public boolean r() {
        boolean bl2;
        block16: {
            block15: {
                block14: {
                    try {
                        block13: {
                            try {
                                try {
                                    if (this instanceof fv || this instanceof f_) break block13;
                                }
                                catch (O_ o_2) {
                                    throw w6.b(o_2);
                                }
                                if (!(this instanceof fK)) break block14;
                            }
                            catch (O_ o_3) {
                                throw w6.b(o_3);
                            }
                        }
                        return false;
                    }
                    catch (O_ o_4) {
                        throw w6.b(o_4);
                    }
                }
                try {
                    if (this.Q() == null) {
                        return false;
                    }
                }
                catch (O_ o_5) {
                    throw w6.b(o_5);
                }
                try {
                    try {
                        if (!this.i() && !this.V()) break block15;
                    }
                    catch (O_ o_6) {
                        throw w6.b(o_6);
                    }
                    bl2 = true;
                    break block16;
                }
                catch (O_ o_7) {
                    throw w6.b(o_7);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean m() {
        return this.Ol;
    }

    private void m() {
        block7: {
            try {
                try {
                    if (this.Od && this.Ol) break block7;
                }
                catch (O_ o_2) {
                    throw w6.b(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw w6.b(o_3);
            }
        }
        boolean bl2 = ID.A(Or.LEFT_CLICK.ordinal());
        try {
            if (!bl2) {
                this.Od = false;
                this.Y(true);
                this.A();
                SE.h.n();
                return;
            }
        }
        catch (O_ o_4) {
            throw w6.b(o_4);
        }
        sX sX2 = FG.b();
        double d2 = sX2.X - this.Ob.X;
        double d3 = sX2.I - this.Ob.I;
        this.Ob = sX2;
        this.u(d2, d3);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void Z(Sz sz2) {
        block11: {
            block10: {
                try {
                    try {
                        if (this.Q() != null && this.f()) break block10;
                    }
                    catch (O_ o_2) {
                        throw w6.b(o_2);
                    }
                    return;
                }
                catch (O_ o_3) {
                    throw w6.b(o_3);
                }
            }
            try {
                try {
                    try {
                        if (!this.Ol || !sz2.getAction().equals((Object)Or.LEFT_CLICK)) break block11;
                    }
                    catch (O_ o_4) {
                        throw w6.b(o_4);
                    }
                    if (!this.Q().M(sz2.getX(), sz2.getY())) break block11;
                }
                catch (O_ o_5) {
                    throw w6.b(o_5);
                }
                this.Ob = FG.b();
                this.Od = true;
                this.B(true);
            }
            catch (O_ o_6) {
                throw w6.b(o_6);
            }
        }
    }

    public static void z(ht[] htArray) {
        OC = htArray;
    }

    public boolean F() {
        return this.O_;
    }

    public void g(boolean bl2) {
        this.Ol = bl2;
    }

    public void D() {
        try {
            if (this.Q() == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        try {
            if (this.V()) {
                this.M(this.D());
            }
        }
        catch (O_ o_3) {
            throw w6.b(o_3);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void G() {
        block10: {
            try {
                if (!this.f()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw w6.b(o_2);
            }
            try {
                if (this.N()) {
                    this.q();
                }
            }
            catch (O_ o_3) {
                throw w6.b(o_3);
            }
            try {
                try {
                    this.m();
                    super.G();
                    if (this.Q() == null || !this.Of.f()) break block10;
                }
                catch (O_ o_4) {
                    throw w6.b(o_4);
                }
                this.Of.z(this.A());
                this.Of.T(this.Of.w() + 10.0 + 6.0);
                this.Of.w(12.0);
                this.Of.b(this.u() - this.Of.w() / 4.0);
                this.Of.M(this.D());
            }
            catch (O_ o_5) {
                throw w6.b(o_5);
            }
        }
    }

    @Override
    public double e() {
        return this.d().C();
    }

    public hr j() {
        return this.Of;
    }

    @Override
    public void M(double d2) {
        super.M(Math.floor(d2));
    }

    public void F() {
        ArrayList<fB> arrayList = new ArrayList<fB>(this.OK);
        for (fB fB2 : arrayList) {
            Ao.z(fB2);
        }
    }

    public boolean Z() {
        return Ao.K.S().Y().contains(this);
    }

    private static void cb() {
        Object[] objectArray = Cb;
        Cb[0] = "Jk\n";
        objectArray[1] = Integer.TYPE;
        w6.Db[1] = "java/lang/Integer";
        objectArray[2] = "S<_q\b\u0006X3N>u\u001eK4Gw";
        objectArray[3] = "\ni#:\u0005]\u0001f2udS\nm6/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "t:\u0007e!\u001c n\f\u0014*\u0018\u001d;\\f;[cz\u001cx0c$m\u0001*1\u001b}x\n~A";
    }

    public void x() {
        try {
            if (this.Q() == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        try {
            if (this.i()) {
                this.b(this.u());
            }
        }
        catch (O_ o_3) {
            throw w6.b(o_3);
        }
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    @Override
    public void N(boolean bl2) {
        this.r(bl2, true);
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7774;
        if (ob[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = mb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])pb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w6", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            w6.ob[n3] = n4;
        }
        return ob[n3];
    }

    @Override
    public JsonObject E() {
        long l10 = bb ^ 0x6E3FEE55DD61L;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)10714, (long)(0x1EF50718C9D2D893L ^ l10)), (long)-8773773814027798849L, (long)l10)), this.A());
        jsonObject.addProperty((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)4284, (long)(0x3D3913E0BC2BE1FCL ^ l10)), (long)-8773773814027798849L, (long)l10)), (Number)this.G());
        jsonObject.addProperty((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)31697, (long)(0x5D7D3F30BC548A9BL ^ l10)), (long)-8773773814027798849L, (long)l10)), (Number)this.W());
        jsonObject.addProperty((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)5894, (long)(0x1DD8DF1FAAEEE64DL ^ l10)), (long)-8773773814027798849L, (long)l10)), Boolean.valueOf(this.f()));
        jsonObject.addProperty((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)9724, (long)(0x40AA03A4E4EFD4B1L ^ l10)), (long)-8773773814027798849L, (long)l10)), Boolean.valueOf(this.F()));
        return jsonObject;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = w6.i(l10, l11);
            object = Cb[n2];
            try {
                if (!(object instanceof String)) break block2;
                w6.Cb[n2] = clazz = Class.forName(Db[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Db[n5] != null) {
            return n5;
        }
        Object object = Cb[n5];
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
                n4 = 63;
                break;
            }
            case 2: {
                n4 = 33;
                break;
            }
            case 3: {
                n4 = 22;
                break;
            }
            case 4: {
                n4 = 31;
                break;
            }
            case 5: {
                n4 = 20;
                break;
            }
            case 6: {
                n4 = 11;
                break;
            }
            case 7: {
                n4 = 9;
                break;
            }
            case 8: {
                n4 = 59;
                break;
            }
            case 9: {
                n4 = 41;
                break;
            }
            case 10: {
                n4 = 5;
                break;
            }
            case 11: {
                n4 = 28;
                break;
            }
            case 12: {
                n4 = 42;
                break;
            }
            case 13: {
                n4 = 34;
                break;
            }
            case 14: {
                n4 = 24;
                break;
            }
            case 15: {
                n4 = 32;
                break;
            }
            case 16: {
                n4 = 19;
                break;
            }
            case 17: {
                n4 = 27;
                break;
            }
            case 18: {
                n4 = 51;
                break;
            }
            case 19: {
                n4 = 37;
                break;
            }
            case 20: {
                n4 = 50;
                break;
            }
            case 21: {
                n4 = 58;
                break;
            }
            case 22: {
                n4 = 26;
                break;
            }
            case 23: {
                n4 = 14;
                break;
            }
            case 24: {
                n4 = 47;
                break;
            }
            case 25: {
                n4 = 45;
                break;
            }
            case 26: {
                n4 = 36;
                break;
            }
            case 27: {
                n4 = 3;
                break;
            }
            case 28: {
                n4 = 21;
                break;
            }
            case 29: {
                n4 = 62;
                break;
            }
            case 30: {
                n4 = 48;
                break;
            }
            case 31: {
                n4 = 52;
                break;
            }
            case 32: {
                n4 = 54;
                break;
            }
            case 33: {
                n4 = 29;
                break;
            }
            case 34: {
                n4 = 2;
                break;
            }
            case 35: {
                n4 = 23;
                break;
            }
            case 36: {
                n4 = 40;
                break;
            }
            case 37: {
                n4 = 60;
                break;
            }
            case 38: {
                n4 = 43;
                break;
            }
            case 39: {
                n4 = 30;
                break;
            }
            case 40: {
                n4 = 17;
                break;
            }
            case 41: {
                n4 = 18;
                break;
            }
            case 42: {
                n4 = 49;
                break;
            }
            case 43: {
                n4 = 25;
                break;
            }
            case 44: {
                n4 = 35;
                break;
            }
            case 45: {
                n4 = 8;
                break;
            }
            case 46: {
                n4 = 55;
                break;
            }
            case 47: {
                n4 = 56;
                break;
            }
            case 48: {
                n4 = 6;
                break;
            }
            case 49: {
                n4 = 53;
                break;
            }
            case 50: {
                n4 = 7;
                break;
            }
            case 51: {
                n4 = 44;
                break;
            }
            case 52: {
                n4 = 0;
                break;
            }
            case 53: {
                n4 = 1;
                break;
            }
            case 54: {
                n4 = 12;
                break;
            }
            case 55: {
                n4 = 61;
                break;
            }
            case 56: {
                n4 = 13;
                break;
            }
            case 57: {
                n4 = 15;
                break;
            }
            case 58: {
                n4 = 38;
                break;
            }
            case 59: {
                n4 = 4;
                break;
            }
            case 60: {
                n4 = 57;
                break;
            }
            case 61: {
                n4 = 39;
                break;
            }
            case 62: {
                n4 = 46;
                break;
            }
            default: {
                n4 = 10;
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
        w6.Db[n5] = new String(cArray);
        return n5;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = w6.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void E(boolean bl2) {
        this.Od = bl2;
    }

    public boolean g() {
        return true;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = w6.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void b(double d2) {
        super.b(Math.floor(d2));
    }

    @Override
    public void U() {
        try {
            if (!this.F()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        super.U();
    }

    public void m(double d2, double d3) {
        this.b(d2);
        this.M(d3);
        this.A();
    }

    public w6() {
        long l10 = bb ^ 0xB12E91634F3L;
        this.Ol = true;
        this.OX = true;
        this.Of = new hr((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)22098, (long)(0x7D0CE589C3E7CE8CL ^ l10)), (long)8047701768143658797L, (long)l10)), w6.M.W, w6.M.W.brighter()).Q(w6.M.S, w6.M.W);
        this.OK = new ArrayList();
        this.Of.N(new r5(this));
        this.Of.w(10.0);
    }

    public void L(boolean bl2) {
        this.O9 = bl2;
    }

    @Override
    public void C() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void y(JsonObject jsonObject) {
        long l10 = bb ^ 0x717A63502315L;
        Double d2 = OL.R(jsonObject, (String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)16485, (long)(0x74AB95626AA44F5FL ^ l10)), (long)8667551824007022795L, (long)l10)));
        try {
            if (d2 != null) {
                this.b(d2);
                this.H();
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
        Double d3 = OL.R(jsonObject, (String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)11179, (long)(0x1F2A347BDC77A49DL ^ l10)), (long)8667551824007022795L, (long)l10)));
        try {
            if (d3 != null) {
                this.M(d3);
                this.H();
            }
        }
        catch (O_ o_3) {
            throw w6.b(o_3);
        }
        Boolean bl2 = OL.O(jsonObject, (String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)12588, (long)(0x64654ED2CD0DBE10L ^ l10)), (long)8667551824007022795L, (long)l10)));
        try {
            if (bl2 != null) {
                this.s(bl2);
            }
        }
        catch (O_ o_4) {
            throw w6.b(o_4);
        }
        if (this.OX) {
            Boolean bl3 = OL.O(jsonObject, (String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)6227, (long)(0x3B1C852C12549766L ^ l10)), (long)8667551824007022795L, (long)l10)));
            try {
                if (bl3 == null) return;
                this.r(jsonObject.get((String)((Object)w6.i("\u00e5", (int)w6.c("s", (int)13264, (long)(0x604C3D864AB0BCEBL ^ l10)), (long)8667551824007022795L, (long)l10))).getAsBoolean(), false);
                Ao.e(this);
                return;
            }
            catch (O_ o_5) {
                throw w6.b(o_5);
            }
        } else {
            this.r(this.Oz, false);
        }
    }

    private static Method l(long l10, long l11) {
        int n2 = w6.i(l10, l11);
        Object object = Cb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Db[n2];
                int n4 = string2.indexOf(8);
                clazz3 = w6.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = w6.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = w6.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        w6.Cb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = w6.j(254508967566656L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = w6.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        w6.Cb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = w6.j(254508967566656L, 0L);
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

    public w6 L(double d2, double d3) {
        this.b(d2);
        this.M(d3);
        return this;
    }

    public static ht[] Q() {
        return OC;
    }

    @Override
    public double z() {
        return this.d().R();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                w6.bb = d8.a(6472247717051233286L, -314827140404830833L, MethodHandles.lookup().lookupClass()).a(139518167679595L);
                w6.Cb = new Object[5];
                w6.Db = new String[5];
                w6.cb();
                w6.pb = new HashMap<K, V>(13);
                var0 = w6.bb ^ 67476526525751L;
                w6.z(new ht[4]);
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u001f\u00adhk\u00a0\u00f9\u0017i\u00ff\u00c1-k\u00a7\u000e\u009a\u00abE\\\u00e4\u00dd\u0000C\u00e4n,\u00ddN\u0017O\u0005\u00b7\"\u009d\u00abu\u00e6>\u00c2v\u00c8O\u00ee\u00ba\u00a4]\u0013\u00e6C\u00db%\u00af\u00ae\\c\u00f1\u0097\u00c0\u008c\u00cbv\u00b8`]\u0083\u00d0\u0011!\u00c4ZWN\u00a7";
                var7_6 = "\u001f\u00adhk\u00a0\u00f9\u0017i\u00ff\u00c1-k\u00a7\u000e\u009a\u00abE\\\u00e4\u00dd\u0000C\u00e4n,\u00ddN\u0017O\u0005\u00b7\"\u009d\u00abu\u00e6>\u00c2v\u00c8O\u00ee\u00ba\u00a4]\u0013\u00e6C\u00db%\u00af\u00ae\\c\u00f1\u0097\u00c0\u008c\u00cbv\u00b8`]\u0083\u00d0\u0011!\u00c4ZWN\u00a7".length();
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
                    var6_5 = "'!\u00db\u00baq%`\u008fG]\u00c5\u00f6\u00fe\u00b4}a";
                    var7_6 = "'!\u00db\u00baq%`\u008fG]\u00c5\u00f6\u00fe\u00b4}a".length();
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
        w6.mb = var8_3;
        w6.ob = new Integer[11];
    }

    public boolean d() {
        return this.OX;
    }

    public boolean N() {
        return this.O9;
    }

    public void q() {
        block4: {
            int n2 = (int)((double)EP.e() / 4.0 / SE.h.a().b() - this.w() / 2.0);
            int n3 = (int)((double)EP.b() / 4.0 / SE.h.a().b() - this.b() / 2.0);
            try {
                try {
                    if (this.G() == (double)n2 && this.W() == (double)n3) break block4;
                }
                catch (O_ o_2) {
                    throw w6.b(o_2);
                }
                this.m(n2, n3);
                this.h(true);
            }
            catch (O_ o_3) {
                throw w6.b(o_3);
            }
        }
    }

    public ArrayList<fB> V() {
        return this.OK;
    }

    public boolean V() {
        boolean bl2;
        block5: {
            block4: {
                double d2 = this.L();
                double d3 = this.Z();
                try {
                    try {
                        if (!(this.W() < d2) && !(this.W() > d3)) break block4;
                    }
                    catch (O_ o_2) {
                        throw w6.b(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw w6.b(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = w6.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = w6.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void B(boolean bl2, boolean bl3) {
        this.OX = bl2;
        this.Oz = bl3;
    }

    public void y(fB fB2) {
        try {
            if (this.OK.contains(fB2)) {
                this.OK.remove(fB2);
                this.OK.add(fB2);
            }
        }
        catch (O_ o_2) {
            throw w6.b(o_2);
        }
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = w6.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = w6.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'u' || c10 == 'v' || c10 == 'M' || c10 == 'V') {
                field = w6.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = w6.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public double Z() {
        double d2 = (double)EP.b() / SE.h.a().b();
        return d2 / 2.0 - this.Q().b() * 0.5;
    }

    public double L() {
        return -(this.Q().b() * 0.75);
    }

    public double d() {
        double d2 = (double)EP.e() / SE.h.a().b();
        return d2 / 2.0 - this.w() * 0.25;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(w6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

