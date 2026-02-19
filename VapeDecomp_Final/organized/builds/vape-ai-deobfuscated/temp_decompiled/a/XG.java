/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Aq;
import a.Dg;
import a.E;
import a.EP;
import a.FG;
import a.Ne;
import a.OY;
import a.O_;
import a.QF;
import a.Qg;
import a.SE;
import a.d8;
import a.eC;
import a.eM;
import a.k2;
import a.kX;
import a.p5;
import a.pD;
import a.pT;
import a.p_;
import a.ph;
import a.pq;
import a.tO;
import a.tg;
import a.tl;
import a.x4;
import a.xi;
import com.google.common.collect.Lists;
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
import org.lwjgl.opengl.GL11;

public class xg
extends x4<Aq> {
    private boolean o = false;
    private boolean m;
    private static final long[] e;
    private static final String[] n;
    private static final Integer[] h;
    private boolean z;
    private static final long d;
    private static final Object[] l;
    private static final Map j;
    private int A = 0;
    private boolean P;

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x110C;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xg.h[n3] = n4;
        }
        return h[n3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @OY
    public void p(pT pT2) {
        block23: {
            block24: {
                block22: {
                    try {
                        if (E.n()) {
                            return;
                        }
                    }
                    catch (O_ o_2) {
                        throw xg.a(o_2);
                    }
                    try {
                        try {
                            if (!SE.h.a().P(pT2.getClientPlayer()) || !((Aq)this.n()).r.s().booleanValue()) break block22;
                            return;
                        }
                        catch (O_ o_3) {
                            throw xg.a(o_3);
                        }
                    }
                    catch (O_ o_4) {
                        throw xg.a(o_4);
                    }
                }
                try {
                    try {
                        try {
                            if (!((Aq)this.n()).h.s().booleanValue()) break block23;
                            if (!((Aq)this.n()).L.s().booleanValue()) break block24;
                        }
                        catch (O_ o_5) {
                            throw xg.a(o_5);
                        }
                        if (SE.h.g().Q(pT2.getClientPlayer().e())) break block23;
                        return;
                    }
                    catch (O_ o_6) {
                        throw xg.a(o_6);
                    }
                }
                catch (O_ o_7) {
                    throw xg.a(o_7);
                }
            }
            try {
                if (SE.h.a().G(pT2.getClientPlayer(), false)) break block23;
                return;
            }
            catch (O_ o_8) {
                throw xg.a(o_8);
            }
        }
        try {
            if (pT2.getWorld().Y()) {
                return;
            }
        }
        catch (O_ o_9) {
            throw xg.a(o_9);
        }
        try {
            if (!this.m) return;
            pT2.setCanceled(true);
            return;
        }
        catch (O_ o_10) {
            throw xg.a(o_10);
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = xg.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            String string = n[n2];
            int n3 = string.indexOf(8);
            Class clazz = xg.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xg.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xg.a(clazz3, string2, clazz2)) != null) {
                    xg.l[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xg.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xg.l[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xg.b(212814540507321L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean V() {
        return this.m;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @OY
    public void T(pD pD2) {
        block23: {
            block24: {
                block22: {
                    try {
                        if (E.n()) {
                            return;
                        }
                    }
                    catch (O_ o_2) {
                        throw xg.a(o_2);
                    }
                    try {
                        try {
                            if (!SE.h.a().P(pD2.getEntity()) || !((Aq)this.n()).r.s().booleanValue()) break block22;
                            return;
                        }
                        catch (O_ o_3) {
                            throw xg.a(o_3);
                        }
                    }
                    catch (O_ o_4) {
                        throw xg.a(o_4);
                    }
                }
                try {
                    try {
                        try {
                            if (!((Aq)this.n()).h.s().booleanValue()) break block23;
                            if (!((Aq)this.n()).L.s().booleanValue()) break block24;
                        }
                        catch (O_ o_5) {
                            throw xg.a(o_5);
                        }
                        if (SE.h.g().Q(pD2.getEntity().e())) break block23;
                        return;
                    }
                    catch (O_ o_6) {
                        throw xg.a(o_6);
                    }
                }
                catch (O_ o_7) {
                    throw xg.a(o_7);
                }
            }
            try {
                if (SE.h.a().G(pD2.getEntity(), false)) break block23;
                return;
            }
            catch (O_ o_8) {
                throw xg.a(o_8);
            }
        }
        try {
            if (pD2.getWorld().Y()) {
                return;
            }
        }
        catch (O_ o_9) {
            throw xg.a(o_9);
        }
        try {
            if (!this.m) return;
            pD2.setResult(0);
            pD2.setCanceled(true);
            return;
        }
        catch (O_ o_10) {
            throw xg.a(o_10);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xg.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xg.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xg.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xg.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e8' || c10 == '\u00c5' || c10 == 'n' || c10 == '\u00e4') {
                field = xg.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xg.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l10, long l11) {
        int n2 = xg.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = n[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xg.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xg.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xg.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xg.l[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xg.b(212814540507321L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xg.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xg.l[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xg.b(212814540507321L, 0L);
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

    public xg(xi xi2, String string) {
        super(xi2, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @OY
    public void f(pq pq2) {
        block26: {
            block27: {
                block25: {
                    try {
                        if (E.n()) {
                            return;
                        }
                    }
                    catch (O_ o_2) {
                        throw xg.a(o_2);
                    }
                    try {
                        try {
                            if (!SE.h.a().P(pq2.getEntity()) || !((Aq)this.n()).r.s().booleanValue()) break block25;
                            return;
                        }
                        catch (O_ o_3) {
                            throw xg.a(o_3);
                        }
                    }
                    catch (O_ o_4) {
                        throw xg.a(o_4);
                    }
                }
                try {
                    try {
                        try {
                            if (!((Aq)this.n()).h.s().booleanValue()) break block26;
                            if (!((Aq)this.n()).L.s().booleanValue()) break block27;
                        }
                        catch (O_ o_5) {
                            throw xg.a(o_5);
                        }
                        if (SE.h.g().Q(pq2.getEntity().e())) break block26;
                        return;
                    }
                    catch (O_ o_6) {
                        throw xg.a(o_6);
                    }
                }
                catch (O_ o_7) {
                    throw xg.a(o_7);
                }
            }
            try {
                if (SE.h.a().G(pq2.getEntity(), false)) break block26;
                return;
            }
            catch (O_ o_8) {
                throw xg.a(o_8);
            }
        }
        try {
            if (pq2.getWorld().Y()) {
                return;
            }
        }
        catch (O_ o_9) {
            throw xg.a(o_9);
        }
        Qg qg2 = pq2.getThePlayer();
        QF qF2 = pq2.getEntity();
        try {
            if (qF2.equals(qg2)) {
                return;
            }
        }
        catch (O_ o_10) {
            throw xg.a(o_10);
        }
        try {
            if (!this.m) return;
            pq2.setCanceled(true);
            return;
        }
        catch (O_ o_11) {
            throw xg.a(o_11);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void R(p5 p52) {
        boolean bl2;
        block38: {
            block37: {
                block33: {
                    try {
                        if (E.n()) {
                            return;
                        }
                    }
                    catch (O_ o_2) {
                        throw xg.a(o_2);
                    }
                    try {
                        block34: {
                            try {
                                try {
                                    if (kX.C() > 13) break block33;
                                    if (!this.o) break block34;
                                }
                                catch (O_ o_3) {
                                    throw xg.a(o_3);
                                }
                                if (this.A >= 10) break block33;
                            }
                            catch (O_ o_4) {
                                throw xg.a(o_4);
                            }
                        }
                        return;
                    }
                    catch (O_ o_5) {
                        throw xg.a(o_5);
                    }
                }
                Qg qg2 = p52.getThePlayer();
                Dg dg = p52.getWorld();
                eC.R();
                int n2 = GL11.glGenLists((int)1);
                eC.F().s();
                GL11.glPushMatrix();
                FG.V();
                boolean bl3 = GL11.glIsEnabled((int)2929);
                boolean bl4 = GL11.glIsEnabled((int)3042);
                boolean bl5 = GL11.glIsEnabled((int)3553);
                boolean bl6 = GL11.glIsEnabled((int)2896);
                boolean bl7 = GL11.glIsEnabled((int)2848);
                bl2 = GL11.glIsEnabled((int)3008);
                tl.w();
                eC.F().S(true);
                GL11.glNewList((int)n2, (int)4864);
                boolean bl8 = false;
                for (Object e10 : dg.L()) {
                    k2 k22;
                    QF qF2;
                    block35: {
                        block36: {
                            qF2 = new QF(e10);
                            k22 = ((Aq)this.n()).K(p52.getThePlayer(), qF2);
                            try {
                                if (k22 == null) {
                                    continue;
                                }
                            }
                            catch (O_ o_6) {
                                throw xg.a(o_6);
                            }
                            try {
                                try {
                                    try {
                                        if (!((Aq)this.n()).h.s().booleanValue()) break block35;
                                        if (!((Aq)this.n()).L.s().booleanValue()) break block36;
                                    }
                                    catch (O_ o_7) {
                                        throw xg.a(o_7);
                                    }
                                    if (!SE.h.g().Q(qF2.e())) {
                                        continue;
                                    }
                                    break block35;
                                }
                                catch (O_ o_8) {
                                    throw xg.a(o_8);
                                }
                            }
                            catch (O_ o_9) {
                                throw xg.a(o_9);
                            }
                        }
                        try {
                            if (!SE.h.a().G(qF2, false)) {
                                continue;
                            }
                        }
                        catch (O_ o_10) {
                            throw xg.a(o_10);
                        }
                    }
                    if (qF2.equals(qg2)) continue;
                    try {
                        if (!qF2.B(eM.UQ)) {
                            continue;
                        }
                    }
                    catch (O_ o_11) {
                        throw xg.a(o_11);
                    }
                    double d2 = qF2.b();
                    double d3 = qF2.q();
                    double d4 = qF2.I();
                    double d5 = d2 + (qF2.F() - d2) * (double)p52.getTicks() - tO.b();
                    double d6 = d3 + (qF2.V() - d3) * (double)p52.getTicks() - tO.S();
                    double d7 = d4 + (qF2.B() - d4) * (double)p52.getTicks() - tO.n();
                    boolean bl9 = qF2.R();
                    qF2.I(false);
                    GL11.glPushMatrix();
                    GL11.glLineWidth((float)3.0f);
                    Ne.h.y(2848);
                    tl.s();
                    tl.R();
                    tl.P();
                    p52.getEntityRenderer().H(0.0);
                    tg tg2 = new tg(EP.r().D(qF2).M());
                    if (tg2.r()) {
                        Object object;
                        this.m = true;
                        ArrayList arrayList = null;
                        if (kX.C() > 13) {
                            object = tg2.W();
                            arrayList = Lists.newArrayList(object);
                            object.clear();
                        }
                        object = FG.S(k22.Y());
                        try {
                            Ne.h.q((float)object[0], (float)object[1], (float)object[2], (float)object[3]);
                            tg2.u(qF2, d5, d6, d7, p52.getTicks(), p52.getTicks());
                            if (kX.C() > 13) {
                                tg2.m(arrayList);
                            }
                        }
                        catch (O_ o_12) {
                            throw xg.a(o_12);
                        }
                        this.m = false;
                    }
                    qF2.I(bl9);
                    tl.T();
                    tl.j();
                    tl.B();
                    p52.getEntityRenderer().F(1.0);
                    GL11.glPopMatrix();
                }
                try {
                    tl.s();
                    tl.R();
                    tl.P();
                    p52.getEntityRenderer().H(0.0);
                    GL11.glEndList();
                    GL11.glPolygonMode((int)1032, (int)6913);
                    GL11.glCallList((int)n2);
                    GL11.glPolygonMode((int)1032, (int)6912);
                    GL11.glCallList((int)n2);
                    eC.F().S(false);
                    GL11.glPolygonMode((int)1032, (int)6914);
                    GL11.glCallList((int)n2);
                    eC.F().C();
                    GL11.glPolygonMode((int)1032, (int)6913);
                    GL11.glCallList((int)n2);
                    GL11.glPolygonMode((int)1032, (int)6912);
                    GL11.glCallList((int)n2);
                    GL11.glPolygonMode((int)1032, (int)6914);
                    eC.F().B();
                    tl.m(2929, bl3);
                    GL11.glDeleteLists((int)n2, (int)1);
                    tl.m(2896, bl6);
                    tl.m(3042, bl4);
                    tl.m(3553, bl5);
                    if (!bl7) break block37;
                    Ne.h.y(2848);
                    break block38;
                }
                catch (O_ o_13) {
                    throw xg.a(o_13);
                }
            }
            Ne.h.z(2848);
        }
        tl.m(3008, bl2);
        p52.getEntityRenderer().F(1.0);
        GL11.glPopMatrix();
        FG.E();
    }

    @OY
    public void i(p_ p_2) {
        long l10 = d ^ 0x69825D092DDEL;
        try {
            if (EP.N().C()) {
                ((Aq)this.n()).X.V(((Aq)this.n()).Z);
                SE.h.c().L((String)((Object)xg.c("v", (int)xg.a("l", (int)22621, (long)(0x27F314C9243B236AL ^ l10)), (long)-1568926191085831131L, (long)l10)), (String)((Object)xg.c("v", (int)xg.a("l", (int)7328, (long)(0x3BD4D519627F6796L ^ l10)), (long)-1568926191085831131L, (long)l10)), 5000L);
            }
        }
        catch (O_ o_2) {
            throw xg.a(o_2);
        }
    }

    @OY
    public void a(ph ph2) {
        block15: {
            block14: {
                try {
                    if (E.n()) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw xg.a(o_2);
                }
                try {
                    if (((Aq)this.n()).K(ph2.getThePlayer(), ph2.getEntity()) == null) {
                        return;
                    }
                }
                catch (O_ o_3) {
                    throw xg.a(o_3);
                }
                try {
                    try {
                        if (!this.m || kX.C() != 13) break block14;
                    }
                    catch (O_ o_4) {
                        throw xg.a(o_4);
                    }
                    FG.V();
                    FG.Y(((Aq)this.n()).x.L());
                    FG.E();
                    return;
                }
                catch (O_ o_5) {
                    throw xg.a(o_5);
                }
            }
            try {
                try {
                    if (ph2.getEntity().B(eM.rl) || !ph2.getEntity().B(eM.UQ)) break block15;
                }
                catch (O_ o_6) {
                    throw xg.a(o_6);
                }
                this.o = true;
                ++this.A;
            }
            catch (O_ o_7) {
                throw xg.a(o_7);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xg.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (n[n5] != null) {
            return n5;
        }
        Object object = l[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 40;
                break;
            }
            case 1: {
                n4 = 30;
                break;
            }
            case 2: {
                n4 = 15;
                break;
            }
            case 3: {
                n4 = 52;
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
                n4 = 35;
                break;
            }
            case 7: {
                n4 = 27;
                break;
            }
            case 8: {
                n4 = 29;
                break;
            }
            case 9: {
                n4 = 44;
                break;
            }
            case 10: {
                n4 = 22;
                break;
            }
            case 11: {
                n4 = 18;
                break;
            }
            case 12: {
                n4 = 10;
                break;
            }
            case 13: {
                n4 = 47;
                break;
            }
            case 14: {
                n4 = 49;
                break;
            }
            case 15: {
                n4 = 54;
                break;
            }
            case 16: {
                n4 = 4;
                break;
            }
            case 17: {
                n4 = 25;
                break;
            }
            case 18: {
                n4 = 11;
                break;
            }
            case 19: {
                n4 = 3;
                break;
            }
            case 20: {
                n4 = 34;
                break;
            }
            case 21: {
                n4 = 45;
                break;
            }
            case 22: {
                n4 = 61;
                break;
            }
            case 23: {
                n4 = 46;
                break;
            }
            case 24: {
                n4 = 63;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 57;
                break;
            }
            case 27: {
                n4 = 12;
                break;
            }
            case 28: {
                n4 = 56;
                break;
            }
            case 29: {
                n4 = 55;
                break;
            }
            case 30: {
                n4 = 16;
                break;
            }
            case 31: {
                n4 = 58;
                break;
            }
            case 32: {
                n4 = 39;
                break;
            }
            case 33: {
                n4 = 28;
                break;
            }
            case 34: {
                n4 = 60;
                break;
            }
            case 35: {
                n4 = 19;
                break;
            }
            case 36: {
                n4 = 37;
                break;
            }
            case 37: {
                n4 = 62;
                break;
            }
            case 38: {
                n4 = 51;
                break;
            }
            case 39: {
                n4 = 13;
                break;
            }
            case 40: {
                n4 = 17;
                break;
            }
            case 41: {
                n4 = 31;
                break;
            }
            case 42: {
                n4 = 36;
                break;
            }
            case 43: {
                n4 = 33;
                break;
            }
            case 44: {
                n4 = 21;
                break;
            }
            case 45: {
                n4 = 24;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 41;
                break;
            }
            case 48: {
                n4 = 5;
                break;
            }
            case 49: {
                n4 = 14;
                break;
            }
            case 50: {
                n4 = 50;
                break;
            }
            case 51: {
                n4 = 32;
                break;
            }
            case 52: {
                n4 = 20;
                break;
            }
            case 53: {
                n4 = 42;
                break;
            }
            case 54: {
                n4 = 23;
                break;
            }
            case 55: {
                n4 = 59;
                break;
            }
            case 56: {
                n4 = 6;
                break;
            }
            case 57: {
                n4 = 26;
                break;
            }
            case 58: {
                n4 = 38;
                break;
            }
            case 59: {
                n4 = 1;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 8;
                break;
            }
            case 62: {
                n4 = 2;
                break;
            }
            default: {
                n4 = 9;
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
        xg.n[n5] = new String(cArray);
        return n5;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xg.a(l10, l11);
            object = l[n2];
            try {
                if (!(object instanceof String)) break block2;
                xg.l[n2] = clazz = Class.forName(n[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "!gK";
        objectArray[1] = Integer.TYPE;
        xg.n[1] = "java/lang/Integer";
        objectArray[2] = "3+GyDf8$V69~+#_\u007f";
        objectArray[3] = "F7\u00056\"XM8\u0014yCVF3\u0010#";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "5w\u0007*\u0012[v7ZP\u0018\u001e\t>Tn\u001c\u0007xsI?s\\puE*\fZ16SP";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = d8.a(2493450041684560191L, 3977147601051648699L, MethodHandles.lookup().lookupClass()).a(230551557763817L);
        l = new Object[5];
        n = new String[5];
        xg.a();
        j = new HashMap(13);
        long l10 = d ^ 0x6A4EFB8AE232L;
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
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "3r\u009aOq\u00ffc?\u008f\u00c9\u00c4\u00a6\u00e8\u00a1\u00a7\u00bf";
        int n3 = "3r\u009aOq\u00ffc?\u008f\u00c9\u00c4\u00a6\u00e8\u00a1\u00a7\u00bf".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        e = lArray;
        h = new Integer[2];
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xg.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

