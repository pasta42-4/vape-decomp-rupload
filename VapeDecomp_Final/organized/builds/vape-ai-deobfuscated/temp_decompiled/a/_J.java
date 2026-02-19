/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.AF;
import a.AY;
import a.Av;
import a.B3;
import a.B7;
import a.BZ;
import a.Bg;
import a.DA;
import a.Dg;
import a.E;
import a.EB;
import a.EN;
import a.EP;
import a.EX;
import a.F8;
import a.FG;
import a.Gn;
import a.Hc;
import a.I2;
import a.I_;
import a.JF;
import a.KB;
import a.NY;
import a.Ne;
import a.OY;
import a.O_;
import a.Ou;
import a.QF;
import a.Qg;
import a.Qh;
import a.Qt;
import a.S3;
import a.SE;
import a.W_;
import a.X_;
import a.YK;
import a._Y;
import a._o;
import a.d8;
import a.eM;
import a.k2;
import a.kX;
import a.p5;
import a.p6;
import a.p_;
import a.pn;
import a.sM;
import a.tO;
import a.tR;
import a.tl;
import a.xs;
import a.zM;
import a.z_;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class _j
implements sM {
    private final AF A;
    private static final long[] c;
    private static final Object[] g;
    private Bg Z = new Bg();
    private final Av e;
    private long j;
    private static final Map f;
    private String T;
    private static final long a;
    @Nullable
    private Qh b;
    private final xs o = SE.h.U().K(xs.class);
    private static final String[] h;
    private static final Integer[] d;
    private int w;
    public static _j C;

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2B12;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/_j", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _j.d[n3] = n4;
        }
        return d[n3];
    }

    private void Q(z_ z_2) {
        block10: {
            DA dA = EP.G();
            try {
                if (dA.Y()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw _j.a(o_2);
            }
            UUID uUID = z_2.J();
            try {
                block9: {
                    try {
                        try {
                            if (!z_2.X().equals(dA.N()) || uUID == null) break block9;
                        }
                        catch (O_ o_3) {
                            throw _j.a(o_3);
                        }
                        if (uUID.equals(dA.w())) break block10;
                    }
                    catch (O_ o_4) {
                        throw _j.a(o_4);
                    }
                }
                z_2.J(dA.w(), dA.N());
                I_.h().c().P(dA.w(), dA.N());
            }
            catch (O_ o_5) {
                throw _j.a(o_5);
            }
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = _j.a(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                _j.g[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Nullable
    public Qh f() {
        block26: {
            block25: {
                Object object;
                Hc hc2;
                block24: {
                    block23: {
                        try {
                            if (!this.o.Z() || this.o.N.isEmpty()) break block23;
                        }
                        catch (O_ o_2) {
                            throw _j.a(o_2);
                        }
                        hc2 = EP.X();
                        try {
                            if (this.o.v.s().booleanValue() && !((EB)hc2).Y()) break block23;
                        }
                        catch (O_ o_3) {
                            throw _j.a(o_3);
                        }
                        for (Qt qt2 : this.o.N) {
                            try {
                                if (!qt2.B(eM.UQ)) continue;
                                return new Qh(qt2.M());
                            }
                            catch (O_ o_4) {
                                throw _j.a(o_4);
                            }
                        }
                    }
                    if (this.A.Z()) {
                        hc2 = this.A.m();
                        object = EP.X();
                        try {
                            try {
                                try {
                                    if (!((EB)object).Y() || hc2 == null) break block24;
                                }
                                catch (O_ o_5) {
                                    throw _j.a(o_5);
                                }
                                if (!hc2.B(eM.UQ)) break block24;
                            }
                            catch (O_ o_6) {
                                throw _j.a(o_6);
                            }
                            return new Qh(hc2);
                        }
                        catch (O_ o_7) {
                            throw _j.a(o_7);
                        }
                    }
                }
                if (this.e.Z() && ((EB)(hc2 = EP.X())).Y()) {
                    object = this.e.A();
                    try {
                        try {
                            if (object == null || !((Hc)object).B(eM.UQ)) break block25;
                        }
                        catch (O_ o_8) {
                            throw _j.a(o_8);
                        }
                        return new Qh(((Hc)object).M());
                    }
                    catch (O_ o_9) {
                        throw _j.a(o_9);
                    }
                }
            }
            try {
                try {
                    if (this.b == null || System.currentTimeMillis() - this.j >= 5000L) break block26;
                }
                catch (O_ o_10) {
                    throw _j.a(o_10);
                }
                return this.b;
            }
            catch (O_ o_11) {
                throw _j.a(o_11);
            }
        }
        return null;
    }

    private static List lambda$onRenderWorldLast$1(I2 i22, Qh qh2, List list) {
        List list2;
        try {
            list2 = list != null ? list : new ArrayList();
        }
        catch (O_ o_2) {
            throw _j.a(o_2);
        }
        List list3 = list2;
        list3.add(i22);
        return list3;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "viP";
        objectArray[1] = Integer.TYPE;
        _j.h[1] = "java/lang/Integer";
        objectArray[2] = "qK[C_TzDJ\f\"LiCCE";
        objectArray[3] = "gu9\u001c-9lz(SL7gq,\t";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\f\u001f#GyR\t\u001f>\u007fwMi\\c\u0007`M\u000f\\?\u0002p6P\u001c#\u0006n\f\u0005\u0017<\u0004\u001c";
    }

    @OY
    public void a(p5 p52) {
        Ou ou2;
        Object object5;
        block44: {
            Object object2;
            Object object3;
            block47: {
                block46: {
                    LinkedHashMap<UUID, Qh> linkedHashMap;
                    block45: {
                        block43: {
                            Object object4;
                            try {
                                if (E.n()) {
                                    return;
                                }
                            }
                            catch (O_ o_2) {
                                throw _j.a(o_2);
                            }
                            JF jF2 = SE.h.O().p().Q();
                            try {
                                if (jF2 == null) {
                                    return;
                                }
                            }
                            catch (O_ o_3) {
                                throw _j.a(o_3);
                            }
                            Dg dg = p52.getWorld();
                            try {
                                if (dg.Y()) {
                                    return;
                                }
                            }
                            catch (O_ o_4) {
                                throw _j.a(o_4);
                            }
                            linkedHashMap = new LinkedHashMap<UUID, Qh>();
                            for (Object object5 : dg.M()) {
                                object4 = new Qh(object5);
                                linkedHashMap.put(((QF)object4).q(), (Qh)object4);
                            }
                            try {
                                if (linkedHashMap.isEmpty()) {
                                    return;
                                }
                            }
                            catch (O_ o_5) {
                                throw _j.a(o_5);
                            }
                            this.C(linkedHashMap.values());
                            ou2 = YK.C.q();
                            object5 = new LinkedHashMap();
                            object4 = SE.h.O().m().b();
                            object3 = object4.iterator();
                            while (object3.hasNext()) {
                                object2 = (I2)object3.next();
                                if (!jF2.u().contains(((I2)object2).z())) continue;
                                try {
                                    try {
                                        if (object2.equals(SE.h.O().n().i()) && !ou2.C().s().booleanValue()) {
                                            continue;
                                        }
                                    }
                                    catch (O_ o_6) {
                                        throw _j.a(o_6);
                                    }
                                }
                                catch (O_ o_7) {
                                    throw _j.a(o_7);
                                }
                                try {
                                    if (!((I2)object2).U()) {
                                        continue;
                                    }
                                }
                                catch (O_ o_8) {
                                    throw _j.a(o_8);
                                }
                                Qh qh2 = (Qh)linkedHashMap.get(((I2)object2).l());
                                try {
                                    if (qh2 == null) {
                                        continue;
                                    }
                                }
                                catch (O_ o_9) {
                                    throw _j.a(o_9);
                                }
                                try {
                                    if (qh2.equals(EP.U())) {
                                        continue;
                                    }
                                }
                                catch (O_ o_10) {
                                    throw _j.a(o_10);
                                }
                                object5.compute(qh2, (arg_0, arg_1) -> _j.lambda$onRenderWorldLast$0((I2)object2, arg_0, arg_1));
                            }
                            try {
                                if (ou2.C().s().booleanValue()) break block43;
                                break block44;
                            }
                            catch (O_ o_11) {
                                throw _j.a(o_11);
                            }
                        }
                        object3 = SE.h.O().n().i();
                        try {
                            if (((I2)object3).U()) break block45;
                            break block44;
                        }
                        catch (O_ o_12) {
                            throw _j.a(o_12);
                        }
                    }
                    object2 = (Qh)linkedHashMap.get(((I2)object3).l());
                    try {
                        if (object2 != null) break block46;
                        break block44;
                    }
                    catch (O_ o_13) {
                        throw _j.a(o_13);
                    }
                }
                try {
                    if (!((Hc)object2).equals(EP.U())) break block47;
                    break block44;
                }
                catch (O_ o_14) {
                    throw _j.a(o_14);
                }
            }
            object5.compute(object2, (arg_0, arg_1) -> _j.lambda$onRenderWorldLast$1((I2)object3, arg_0, arg_1));
        }
        try {
            if (object5.isEmpty()) {
                return;
            }
        }
        catch (O_ o_15) {
            throw _j.a(o_15);
        }
        FG.V();
        double d2 = tO.b();
        double d3 = tO.S();
        double d4 = tO.n();
        for (Map.Entry entry : object5.entrySet()) {
            Qh qh3 = (Qh)entry.getKey();
            List list = (List)entry.getValue();
            list.sort(_j::lambda$onRenderWorldLast$2);
            float f10 = p52.getTicks();
            double d5 = qh3.b() + (qh3.F() - qh3.b()) * (double)f10;
            double d6 = qh3.q() + (qh3.V() - qh3.q()) * (double)f10;
            double d7 = qh3.I() + (qh3.B() - qh3.I()) * (double)f10;
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d5 - d2 + (double)0.03f), (double)(d6 - d3 + 0.001), (double)(d7 - d4 + (double)0.03f));
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.1, (double)0.1, (double)0.1);
            float f11 = 10.0f;
            try {
                GL11.glPopMatrix();
                if (list.size() <= 0 || !ou2.P().s().booleanValue()) continue;
            }
            catch (O_ o_16) {
                throw _j.a(o_16);
            }
            I2 i22 = (I2)list.get(0);
            k2 k22 = new k2(B7.V(i22.z())).I(150);
            F8.a(qh3.r(), qh3.y(), qh3.D(), 50.0f, 0.7f, qh3.L(), k22);
        }
        FG.E();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static List<I2> O(String string) {
        ArrayList<I2> arrayList;
        block11: {
            arrayList = new ArrayList<I2>();
            for (I2 i22 : SE.h.O().m().b()) {
                try {
                    try {
                        if (!i22.U() || !i22.h().equals(string)) continue;
                    }
                    catch (O_ o_2) {
                        throw _j.a(o_2);
                    }
                    arrayList.add(i22);
                }
                catch (O_ o_3) {
                    throw _j.a(o_3);
                }
            }
            I2 i23 = SE.h.O().n().i();
            try {
                try {
                    try {
                        if (!YK.C.q().C().s().booleanValue() || !i23.U()) break block11;
                    }
                    catch (O_ o_4) {
                        throw _j.a(o_4);
                    }
                    if (!i23.h().equals(string)) break block11;
                }
                catch (O_ o_5) {
                    throw _j.a(o_5);
                }
                arrayList.add(i23);
            }
            catch (O_ o_6) {
                throw _j.a(o_6);
            }
        }
        return arrayList;
    }

    private void C(Collection<Qh> collection) {
        double d2 = tO.b();
        double d3 = tO.S();
        double d4 = tO.n();
        Qg qg2 = EP.U();
        double d5 = qg2.r() - d2;
        double d6 = qg2.y() - d3;
        double d7 = qg2.D() - d4;
        double d9 = 7.0;
        AY aY2 = SE.h.U().K(AY.class);
        if (aY2.Z()) {
            d9 += 7.0;
        }
        for (Qh qh2 : collection) {
            this.C(qh2, d9, d5, d6, d7, d2, d3, d4);
        }
    }

    @OY
    public void D(p6 p62) {
        SE.h.O().m().r();
        SE.h.O().N().U();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = _j.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = _j.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = _j.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = _j.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = _j.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _j.a(clazz3, string2, clazz2)) != null) {
                    _j.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = _j.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        _j.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _j.b(278152486308583L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static List lambda$onRenderWorldLast$0(I2 i22, Qh qh2, List list) {
        List list2;
        try {
            list2 = list != null ? list : new ArrayList();
        }
        catch (O_ o_2) {
            throw _j.a(o_2);
        }
        List list3 = list2;
        list3.add(i22);
        return list3;
    }

    @OY
    public void h(KB kB2) {
        try {
            if (YK.C.U() != Gn.ONLINE) {
                return;
            }
        }
        catch (O_ o_2) {
            throw _j.a(o_2);
        }
        try {
            if (!this.Z.m(1000L)) {
                return;
            }
        }
        catch (O_ o_3) {
            throw _j.a(o_3);
        }
        this.Z.m();
        zM zM2 = SE.h.O().n();
        this.Q(zM2);
        this.H(zM2);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = _j.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
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
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(-7933145726157731132L, 6635186747313391800L, MethodHandles.lookup().lookupClass()).a(869555249660L);
        g = new Object[5];
        h = new String[5];
        _j.a();
        f = new HashMap(13);
        long l10 = a ^ 0x1AB2C4DC1343L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u00b0=\u0094\u00b3\r\u00feF\u0099\u00cdKeS\u00ec\u00ca[\u00f4\u00bc)\u0085\u00af\u00d2\u008c%\u00eb";
        int n3 = "\u00b0=\u0094\u00b3\r\u00feF\u0099\u00cdKeS\u00ec\u00ca[\u00f4\u00bc)\u0085\u00af\u00d2\u008c%\u00eb".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        c = lArray;
        d = new Integer[3];
        C = new _j();
    }

    @OY
    public void e(pn pn2) {
        try {
            if (SE.h.O().p().Q() == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw _j.a(o_2);
        }
        try {
            if (pn2.getTarget().B(eM.UQ)) {
                this.B(new Qh(pn2.getTarget().M()));
            }
        }
        catch (O_ o_3) {
            throw _j.a(o_3);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = _j.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @OY
    public void Z(S3 s32) {
        block11: {
            BZ bZ2;
            block9: {
                block10: {
                    BZ bZ3 = s32.getPreviousProfile();
                    bZ2 = s32.getNewProfile();
                    try {
                        try {
                            try {
                                if (bZ3 == null || bZ3.p() == null) break block9;
                            }
                            catch (O_ o_2) {
                                throw _j.a(o_2);
                            }
                            if (bZ2.p() == null) break block10;
                        }
                        catch (O_ o_3) {
                            throw _j.a(o_3);
                        }
                        I_.h().c().G(bZ2.p().i());
                        break block11;
                    }
                    catch (O_ o_4) {
                        throw _j.a(o_4);
                    }
                }
                I_.h().c().K();
                break block11;
            }
            try {
                if (bZ2.p() != null) {
                    I_.h().c().G(bZ2.p().i());
                }
            }
            catch (O_ o_5) {
                throw _j.a(o_5);
            }
        }
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 14;
                break;
            }
            case 1: {
                n4 = 33;
                break;
            }
            case 2: {
                n4 = 8;
                break;
            }
            case 3: {
                n4 = 10;
                break;
            }
            case 4: {
                n4 = 59;
                break;
            }
            case 5: {
                n4 = 5;
                break;
            }
            case 6: {
                n4 = 58;
                break;
            }
            case 7: {
                n4 = 28;
                break;
            }
            case 8: {
                n4 = 55;
                break;
            }
            case 9: {
                n4 = 26;
                break;
            }
            case 10: {
                n4 = 62;
                break;
            }
            case 11: {
                n4 = 19;
                break;
            }
            case 12: {
                n4 = 37;
                break;
            }
            case 13: {
                n4 = 49;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 16;
                break;
            }
            case 16: {
                n4 = 24;
                break;
            }
            case 17: {
                n4 = 35;
                break;
            }
            case 18: {
                n4 = 52;
                break;
            }
            case 19: {
                n4 = 51;
                break;
            }
            case 20: {
                n4 = 2;
                break;
            }
            case 21: {
                n4 = 3;
                break;
            }
            case 22: {
                n4 = 11;
                break;
            }
            case 23: {
                n4 = 61;
                break;
            }
            case 24: {
                n4 = 17;
                break;
            }
            case 25: {
                n4 = 27;
                break;
            }
            case 26: {
                n4 = 23;
                break;
            }
            case 27: {
                n4 = 43;
                break;
            }
            case 28: {
                n4 = 45;
                break;
            }
            case 29: {
                n4 = 15;
                break;
            }
            case 30: {
                n4 = 38;
                break;
            }
            case 31: {
                n4 = 9;
                break;
            }
            case 32: {
                n4 = 34;
                break;
            }
            case 33: {
                n4 = 44;
                break;
            }
            case 34: {
                n4 = 63;
                break;
            }
            case 35: {
                n4 = 1;
                break;
            }
            case 36: {
                n4 = 50;
                break;
            }
            case 37: {
                n4 = 12;
                break;
            }
            case 38: {
                n4 = 56;
                break;
            }
            case 39: {
                n4 = 0;
                break;
            }
            case 40: {
                n4 = 20;
                break;
            }
            case 41: {
                n4 = 31;
                break;
            }
            case 42: {
                n4 = 46;
                break;
            }
            case 43: {
                n4 = 29;
                break;
            }
            case 44: {
                n4 = 22;
                break;
            }
            case 45: {
                n4 = 13;
                break;
            }
            case 46: {
                n4 = 21;
                break;
            }
            case 47: {
                n4 = 4;
                break;
            }
            case 48: {
                n4 = 57;
                break;
            }
            case 49: {
                n4 = 36;
                break;
            }
            case 50: {
                n4 = 42;
                break;
            }
            case 51: {
                n4 = 60;
                break;
            }
            case 52: {
                n4 = 40;
                break;
            }
            case 53: {
                n4 = 53;
                break;
            }
            case 54: {
                n4 = 48;
                break;
            }
            case 55: {
                n4 = 6;
                break;
            }
            case 56: {
                n4 = 32;
                break;
            }
            case 57: {
                n4 = 41;
                break;
            }
            case 58: {
                n4 = 47;
                break;
            }
            case 59: {
                n4 = 30;
                break;
            }
            case 60: {
                n4 = 25;
                break;
            }
            case 61: {
                n4 = 7;
                break;
            }
            case 62: {
                n4 = 39;
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
        _j.h[n5] = new String(cArray);
        return n5;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'M' || c10 == 'J' || c10 == '\u00f0' || c10 == 'W') {
                field = _j.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _j.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _j.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = _j.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void C(QF qF2, double d2, double d3, double d4, double d5, double d6, double d7, double d9) {
        float f10;
        double d10;
        block19: {
            block20: {
                double d11;
                double d12;
                double d13;
                block17: {
                    double d14;
                    double d15;
                    double d16;
                    block18: {
                        float f11;
                        try {
                            if (qF2.O()) {
                                return;
                            }
                        }
                        catch (O_ o_2) {
                            throw _j.a(o_2);
                        }
                        d13 = qF2.r() - d6;
                        d12 = qF2.y() - d7;
                        d11 = qF2.D() - d9;
                        d10 = _Y.V(d13, d12, d11, d3, d4, d5);
                        float f12 = (float)d10;
                        try {
                            f11 = (double)f12 / 5.0 <= 2.0 ? 2.0f : (float)((double)f12 / 5.0);
                        }
                        catch (O_ o_3) {
                            throw _j.a(o_3);
                        }
                        float f13 = f11;
                        f10 = 0.016666668f * f13;
                        try {
                            try {
                                NY.Y();
                                tR.l();
                                if (kX.C() < 35) break block17;
                                if (EP.N().V() != 0) break block18;
                            }
                            catch (O_ o_4) {
                                throw _j.a(o_4);
                            }
                            GL11.glTranslated((double)d13, (double)(d12 + (double)qF2.L() + 0.2), (double)d11);
                            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)(-EP.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)(-EP.r().r()), (float)-1.0f, (float)0.0f, (float)0.0f);
                            break block19;
                        }
                        catch (O_ o_5) {
                            throw _j.a(o_5);
                        }
                    }
                    EN eN2 = EP.U().v();
                    try {
                        d16 = F8.U() ? 0.0 : tO.b() - eN2.w().X();
                    }
                    catch (O_ o_6) {
                        throw _j.a(o_6);
                    }
                    double d17 = d16;
                    try {
                        d15 = F8.U() ? 0.0 : tO.S() - eN2.w().F();
                    }
                    catch (O_ o_7) {
                        throw _j.a(o_7);
                    }
                    double d18 = d15;
                    try {
                        d14 = F8.U() ? 0.0 : tO.n() - eN2.w().f();
                    }
                    catch (O_ o_8) {
                        throw _j.a(o_8);
                    }
                    double d19 = d14;
                    GL11.glTranslated((double)(d13 + d17), (double)(d12 + d18 + (double)qF2.L() + (double)0.4f), (double)(d11 + d19));
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-EP.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)EP.r().r(), (float)1.0f, (float)0.0f, (float)0.0f);
                    break block19;
                }
                try {
                    GL11.glTranslated((double)(d13 + 0.0), (double)(d12 + (double)qF2.L() + 0.5), (double)d11);
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    if (EP.N().V() != 2) break block20;
                    GL11.glRotatef((float)(-EP.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)EP.r().r(), (float)-1.0f, (float)0.0f, (float)0.0f);
                    break block19;
                }
                catch (O_ o_9) {
                    throw _j.a(o_9);
                }
            }
            GL11.glRotatef((float)(-EP.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)EP.r().r(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScalef((float)(-f10), (float)(-f10), (float)f10);
        tl.R(false);
        tl.w();
        float f14 = (float)(d10 / 5.0);
        float f15 = 0.01f * f14;
        GL11.glTranslated((double)0.0, (double)(-d2), (double)0.0);
        GL11.glScaled((double)(1.0f / f10), (double)(1.0f / f10), (double)(-(1.0f / f10)));
        GL11.glScaled((double)f15, (double)f15, (double)f15);
        _j.q(qF2);
        tl.k();
        tl.R(true);
        NY.J();
        EP.U().F(1.0);
    }

    private static int lambda$onRenderWorldLast$2(I2 i22, I2 i23) {
        return i22.z().j().compareTo(i23.z().j());
    }

    public _j() {
        this.A = SE.h.U().K(AF.class);
        this.e = SE.h.U().K(Av.class);
    }

    public static void q(QF qF2) {
        Object object;
        Ou ou2;
        int n2;
        Qh qh2;
        long l10;
        block13: {
            l10 = a ^ 0x4314D7910EE7L;
            JF jF2 = SE.h.O().p().Q();
            try {
                if (jF2 == null) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw _j.a(o_2);
            }
            try {
                if (!qF2.B(eM.UQ)) {
                    return;
                }
            }
            catch (O_ o_3) {
                throw _j.a(o_3);
            }
            qh2 = new Qh(qF2.M());
            double d2 = 10.0;
            double d3 = 20.0;
            n2 = 5;
            ou2 = YK.C.q();
            if (YK.C.q().M().s().booleanValue()) {
                object = SE.h.O().m().u(qh2.e());
                try {
                    if (object == null || !jF2.u().contains(((I2)object).z())) break block13;
                }
                catch (O_ o_4) {
                    throw _j.a(o_4);
                }
                Color color = B7.V(((I2)object).z());
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                F8.T(-6.0, (double)(-n2 - 1), 12.0, 1.0, new Color(0, 0, 0, 96));
                F8.T(-5.0, (double)(-n2), 10.0, 1.0, color);
                n2 = (int)((double)n2 + 15.0);
            }
        }
        if (YK.C.q().P().s().booleanValue()) {
            block14: {
                EP.U().H(0.0);
                Ne.h.z(2896);
                tl.s();
                GL11.glBlendFunc((int)770, (int)771);
                object = _j.O(qh2.e());
                try {
                    if (object.isEmpty() || !ou2.P().s().booleanValue()) break block14;
                }
                catch (O_ o_5) {
                    throw _j.a(o_5);
                }
                double d4 = -5.0 - (double)object.size() * 20.0 / 2.0 + 10.0 - 2.0;
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    I2 i22 = (I2)iterator.next();
                    Color color = B7.V(i22.z());
                    color = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                    X_.B(new Color(0, 0, 0, 150), (float)d4 - 1.0f, (float)(-n2) - 1.0f, (String)((Object)_j.b("s", (int)_j.a("h", (int)26238, (long)(0x6283AFFAEC9F2A53L ^ l10)), (long)-1783939314336107282L, (long)l10)), 16.0f, 16.0f, false);
                    X_.B(color, (float)d4, -n2, (String)((Object)_j.b("s", (int)_j.a("h", (int)5589, (long)(0x4BF997D4314D9F9L ^ l10)), (long)-1783939314336107282L, (long)l10)), 14.0f, 14.0f, false);
                    d4 += 20.0;
                }
            }
            Ne.h.y(2896);
            EP.U().F(0.0);
        }
    }

    @OY
    public void F(p_ p_2) {
        block12: {
            int n2;
            W_ w_2;
            B3 b32;
            block13: {
                Dg dg;
                Qh qh2;
                I2 i22;
                block11: {
                    try {
                        if (YK.C.U() != Gn.ONLINE) {
                            return;
                        }
                    }
                    catch (O_ o_2) {
                        throw _j.a(o_2);
                    }
                    b32 = SE.h.O().m();
                    i22 = SE.h.O().n().i();
                    qh2 = p_2.getPlayer();
                    dg = p_2.getWorld();
                    try {
                        try {
                            if (this.b == null || System.currentTimeMillis() - this.j < 10000L) break block11;
                        }
                        catch (O_ o_3) {
                            throw _j.a(o_3);
                        }
                        this.B(null);
                    }
                    catch (O_ o_4) {
                        throw _j.a(o_4);
                    }
                }
                b32.M(qh2, dg);
                w_2 = I2.z(qh2);
                i22.C(w_2);
                n2 = _o.W();
                try {
                    try {
                        i22.L(n2);
                        if (b32.p()) break block12;
                        if (this.w == n2) break block13;
                    }
                    catch (O_ o_5) {
                        throw _j.a(o_5);
                    }
                    I_.h().c().m(n2);
                }
                catch (O_ o_6) {
                    throw _j.a(o_6);
                }
            }
            this.w = n2;
            b32.M(w_2);
        }
    }

    private void B(@Nullable Qh qh2) {
        this.b = qh2;
        this.j = System.currentTimeMillis();
    }

    private void H(z_ z_2) {
        String string;
        block21: {
            block20: {
                block19: {
                    Object object;
                    block18: {
                        long l10 = a ^ 0x5EFE70ED990FL;
                        EX eX2 = EP.b();
                        object = EP.E() ? _j.b("s", (int)_j.a("h", (int)23600, (long)(0x1E3132283DFD07F7L ^ l10)), (long)8130740395108262662L, (long)l10) : (eX2.r() ? eX2.V() : null);
                        string = object;
                        if (!YK.C.q().v().s().booleanValue()) {
                            object = null;
                        }
                        try {
                            try {
                                if (z_2.V() != null || object == null) break block18;
                            }
                            catch (O_ o_2) {
                                throw _j.a(o_2);
                            }
                            z_2.B((String)object);
                            I_.h().c().C((String)object);
                            break block19;
                        }
                        catch (O_ o_3) {
                            throw _j.a(o_3);
                        }
                    }
                    try {
                        try {
                            if (z_2.V() == null || object != null) break block19;
                        }
                        catch (O_ o_4) {
                            throw _j.a(o_4);
                        }
                        z_2.B((String)object);
                        I_.h().c().C((String)object);
                    }
                    catch (O_ o_5) {
                        throw _j.a(o_5);
                    }
                }
                try {
                    try {
                        try {
                            if (this.T == null && string != null) break block20;
                        }
                        catch (O_ o_6) {
                            throw _j.a(o_6);
                        }
                        if (this.T == null) break block21;
                    }
                    catch (O_ o_7) {
                        throw _j.a(o_7);
                    }
                    if (string != null) break block21;
                }
                catch (O_ o_8) {
                    throw _j.a(o_8);
                }
            }
            B3 b32 = SE.h.O().m();
            try {
                if (!b32.p()) {
                    b32.r();
                }
            }
            catch (O_ o_9) {
                throw _j.a(o_9);
            }
        }
        this.T = string;
    }

    private static Method d(long l10, long l11) {
        int n2 = _j.a(l10, l11);
        Object object = g[n2];
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
                clazz3 = _j.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = _j.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _j.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        _j.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _j.b(278152486308583L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = _j.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        _j.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _j.b(278152486308583L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

