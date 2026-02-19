/*
 * Decompiled with CFR 0.152.
 */
package com.game.core;

import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.AsyncExecutionCoordinator;
import com.event.management.EventDispatchCoordinator511;
import com.exception.system.CustomSystemException;
import com.network.connection.NetworkConnectionDescriptor;
import com.network.protocol.CommunicationProtocolInterface;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.state.StateToggleManager;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.core.WorkflowOrchestrator;
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
public class GameStateController
extends StateToggleManager {
    private static final Integer[] eb;
    private boolean px;
    private static final Object[] mb;
    private static final Map fb;
    private EventDispatchCoordinator511 pl;
    private String pr;
    private NetworkConnectionDescriptor pJ;
    private static final long[] db;
    private boolean pT;
    private WorkflowOrchestrator Y;
    private static final String[] nb;
    private static final long ab;
    protected AsyncExecutionCoordinator D;

    private void z() {
        block12: {
            block13: {
                boolean bl;
                GameStateController gameStateController;
                block10: {
                    block11: {
                        try {
                            try {
                                if (!this.pT) break block10;
                                if (this.pl != null) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GameStateController.b(customSystemException);
                            }
                            this.pl = new EventDispatchCoordinator511(this);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GameStateController.b(customSystemException);
                        }
                    }
                    this.pl.Z();
                    this.D = GraphicalRenderingController.v(this, this.pl.E(), AsyncExecutionCoordinator.class);
                    this.D.d(true);
                    break block12;
                }
                try {
                    gameStateController = this;
                    bl = !this.h();
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
                try {
                    try {
                        gameStateController.g(bl);
                        if (!this.h()) break block12;
                        if (this.pl != null) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GameStateController.b(customSystemException);
                    }
                    this.pl = new EventDispatchCoordinator511(this);
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
            }
            this.Y = GraphicalRenderingController.K.S();
            this.Y.B(this.pl);
            this.pl.Z();
        }
    }

    @Override
    public void G() {
        block11: {
            float f;
            Color color;
            long l;
            block10: {
                Color color2;
                double d2;
                double d3;
                double d4;
                double d5;
                Color color3;
                Color color4;
                CryptographicParameterGenerator cryptographicParameterGenerator;
                CryptographicParameterGenerator cryptographicParameterGenerator2;
                block9: {
                    block8: {
                        l = ab ^ 0x58AE7AD3C906L;
                        this.S();
                        cryptographicParameterGenerator2 = this.L(0.9);
                        cryptographicParameterGenerator = this.L(0.75);
                        color4 = GameStateController.M.W;
                        try {
                            if (!this.V()) break block8;
                            color3 = GameStateController.M.c;
                            break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GameStateController.b(customSystemException);
                        }
                    }
                    try {
                        color3 = this.h() ? GameStateController.M.c : GameStateController.M.n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GameStateController.b(customSystemException);
                    }
                }
                color = color3;
                Color color5 = GameStateController.M.w;
                f = (float)(this.W() + this.b() / 2.0) - 3.0f;
                double d6 = cryptographicParameterGenerator2.B(this.pJ.O());
                double d7 = this.W() + this.b() / 2.0 - d6 / 2.0 - 2.5;
                double d8 = d7 + 7.5;
                try {
                    d5 = this.G() + 5.0;
                    d4 = this.W() + 2.5;
                    d3 = this.w() - 10.0;
                    d2 = this.b() - 5.0;
                    color2 = this.h() ? M.j() : this.z().k();
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
                try {
                    ConfigurationManager.S(d5, d4, d3, d2, color2);
                    ConfigurationManager.S(this.G() + 5.0 + 0.5, this.W() + 2.5 + 0.5, this.w() - 10.0 - 1.0, this.b() - 5.0 - 1.0, color4);
                    cryptographicParameterGenerator2.R(this.pr, this.G() + 15.0 + 8.0, d7, color);
                    cryptographicParameterGenerator2.R("" + this.v(), this.G() + this.w() - 10.0 - cryptographicParameterGenerator2.D((String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)32332, (long)(0x780CEA5CF69DA19EL ^ l)), (long)8938329208565003254L, (long)l))), d7, color);
                    cryptographicParameterGenerator.R(this.G(cryptographicParameterGenerator, this.w() - 35.0), this.G() + 15.0 + 8.0, d8, color5);
                    if (!this.px) break block10;
                    StateTrackingCoordinator.B(color, (float)this.G() + 10.0f + 0.5f, f, (String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)21839, (long)(0x50CDC42BB1C40A93L ^ l)), (long)8938329208565003254L, (long)l)), 6.0f, 6.0f, false);
                    StateTrackingCoordinator.B(GameStateController.M.O, (float)this.G() + 10.0f - 0.5f, f, (String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)26435, (long)(0x57170763E57F3898L ^ l)), (long)8938329208565003254L, (long)l)), 6.0f, 6.0f, false);
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
            }
            StateTrackingCoordinator.B(color, (float)this.G() + 10.0f + 0.5f, f, (String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)28899, (long)(0x175F06A428C32F3DL ^ l)), (long)8938329208565003254L, (long)l)), 6.0f, 6.0f, false);
            StateTrackingCoordinator.B(GameStateController.M.Y, (float)this.G() + 10.0f + 0.5f, f, (String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)10500, (long)(0x579C1485119A76C7L ^ l)), (long)8938329208565003254L, (long)l)), 6.0f, 6.0f, false);
        }
    }

    private static void i() {
        Object[] objectArray = mb;
        mb[0] = "\u001fl ";
        objectArray[1] = Integer.TYPE;
        GameStateController.nb[1] = "java/lang/Integer";
        objectArray[2] = "UB7\u0005<\u001a^M&JA\u0002MJ/\u0003";
        objectArray[3] = "Jd'C#vAk6\fBxJ`2V";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0000\u001c;\u0001 \u0002P\u0002zsw\u00029GzC$G\u0003C<\u0013gy\u0003F\"\u0017~DGC?O\u001c";
    }

    public String k() {
        return this.pr;
    }

    public void d(boolean bl) {
        this.pT = bl;
    }

    private String G(CryptographicParameterGenerator cryptographicParameterGenerator, double d2) {
        long l = ab ^ 0x64FABC5D642CL;
        StringBuilder stringBuilder = new StringBuilder();
        for (Object e : (List)this.pJ.J()) {
            try {
                try {
                    if (e instanceof CommunicationProtocolInterface && !((CommunicationProtocolInterface)e).t()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateController.b(customSystemException);
            }
            try {
                if (stringBuilder.toString().length() < 1) {
                    stringBuilder.append(e.toString());
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateController.b(customSystemException);
            }
            String string = (String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)14927, (long)(0x4A7F76C36B848B3L ^ l)), (long)-3377295812868612388L, (long)l)) + e.toString();
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                if (cryptographicParameterGenerator.D(stringBuilder2.append(stringBuilder.toString()).append(string).toString()) < d2) {
                    stringBuilder.append(string);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateController.b(customSystemException);
            }
            stringBuilder.append((String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)18225, (long)(0x18F1AB3A5C5C35CEL ^ l)), (long)-3377295812868612388L, (long)l)));
            break;
        }
        try {
            if (stringBuilder.length() < 1) {
                stringBuilder.append((String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)7737, (long)(0x3B274C4DAB556CD3L ^ l)), (long)-3377295812868612388L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateController.b(customSystemException);
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
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
                this.pl.T();
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateController.b(customSystemException);
            }
        }
        super.E();
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == 'r' || c == 'O' || c == '\u00f9') {
                field = GameStateController.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GameStateController.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public NetworkConnectionDescriptor J() {
        return this.pJ;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GameStateController.b(lookup, mutableCallSite, string, methodType, l, l2);
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GameStateController.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GameStateController.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private int v() {
        return ((List)this.pJ.J()).size();
    }

    private static Method h(long l, long l2) {
        int n = GameStateController.e(l, l2);
        Object object = mb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = nb[n];
                int n3 = string2.indexOf(8);
                clazz3 = GameStateController.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GameStateController.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GameStateController.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        GameStateController.mb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GameStateController.f(274126210796452L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GameStateController.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GameStateController.mb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GameStateController.f(274126210796452L, 0L);
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

    public GameStateController(NetworkConnectionDescriptor networkConnectionDescriptor) {
        block15: {
            String string;
            long l;
            block17: {
                block16: {
                    block14: {
                        boolean bl;
                        block13: {
                            block12: {
                                l = ab ^ 0x2297729F1DA9L;
                                this.pJ = networkConnectionDescriptor;
                                this.L(networkConnectionDescriptor);
                                this.N(this::lambda$new$0);
                                string = networkConnectionDescriptor.O().toLowerCase();
                                try {
                                    try {
                                        GameStateController gameStateController = this;
                                        if (!string.contains((CharSequence)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)32589, (long)(0x4E6143D4F19B7420L ^ l)), (long)-6294861059294550183L, (long)l))) && !string.contains((CharSequence)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)5595, (long)(0x20A60ABDF8781EACL ^ l)), (long)-6294861059294550183L, (long)l)))) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GameStateController.b(customSystemException);
                                    }
                                    bl = true;
                                    break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GameStateController.b(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        try {
                            gameStateController.px = bl;
                            if (!string.contains((CharSequence)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)17364, (long)(0x5F92B2AD70B3C8ABL ^ l)), (long)-6294861059294550183L, (long)l)))) break block14;
                            this.pr = GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)10869, (long)(0x1883B4810B9210DL ^ l)), (long)-6294861059294550183L, (long)l);
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GameStateController.b(customSystemException);
                        }
                    }
                    try {
                        if (!string.contains((CharSequence)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)26427, (long)(0x70263D0BE49FEC45L ^ l)), (long)-6294861059294550183L, (long)l)))) break block16;
                        this.pr = GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)23689, (long)(0x6A46B80D36D557FFL ^ l)), (long)-6294861059294550183L, (long)l);
                        break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GameStateController.b(customSystemException);
                    }
                }
                try {
                    if (!string.contains((CharSequence)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)31816, (long)(0x671FAE394719F734L ^ l)), (long)-6294861059294550183L, (long)l)))) break block17;
                    this.pr = GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)13000, (long)(0x7EE2285C6B3FB9B3L ^ l)), (long)-6294861059294550183L, (long)l);
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
            }
            try {
                this.pr = string.contains((CharSequence)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)8205, (long)(0x88ABDEC20BC2B63L ^ l)), (long)-6294861059294550183L, (long)l))) ? GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)11919, (long)(0x12CCF9FAD80825FFL ^ l)), (long)-6294861059294550183L, (long)l) : string.substring(0, 1).toUpperCase() + string.substring(1).replaceAll((String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)26950, (long)(0x6E681DBEDB53E233L ^ l)), (long)-6294861059294550183L, (long)l)), (String)((Object)GameStateController.d("\u00e1", (int)GameStateController.b("m", (int)24440, (long)(0x10681B654E20540AL ^ l)), (long)-6294861059294550183L, (long)l)));
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateController.b(customSystemException);
            }
        }
    }

    private static Field g(long l, long l2) {
        int n = GameStateController.e(l, l2);
        Object object = mb[n];
        if (object instanceof String) {
            String string = nb[n];
            int n2 = string.indexOf(8);
            Class clazz = GameStateController.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GameStateController.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GameStateController.c(clazz3, string2, clazz2)) != null) {
                    GameStateController.mb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GameStateController.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GameStateController.mb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GameStateController.f(274126210796452L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void g(boolean bl) {
        block4: {
            try {
                try {
                    super.g(bl);
                    if (bl || this.pl == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateController.b(customSystemException);
                }
                this.Y.d(this.pl);
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateController.b(customSystemException);
            }
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GameStateController.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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
        Field field = GameStateController.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GameStateController.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (nb[n4] != null) {
            return n4;
        }
        Object object = mb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 36;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 47;
                break;
            }
            case 7: {
                n3 = 62;
                break;
            }
            case 8: {
                n3 = 13;
                break;
            }
            case 9: {
                n3 = 26;
                break;
            }
            case 10: {
                n3 = 27;
                break;
            }
            case 11: {
                n3 = 29;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 12;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 59;
                break;
            }
            case 24: {
                n3 = 49;
                break;
            }
            case 25: {
                n3 = 48;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 34;
                break;
            }
            case 28: {
                n3 = 22;
                break;
            }
            case 29: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 38;
                break;
            }
            case 32: {
                n3 = 8;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 32;
                break;
            }
            case 35: {
                n3 = 16;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 39: {
                n3 = 58;
                break;
            }
            case 40: {
                n3 = 50;
                break;
            }
            case 41: {
                n3 = 63;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 5;
                break;
            }
            case 45: {
                n3 = 56;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 44;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 46;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 23;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 31;
                break;
            }
            case 59: {
                n3 = 18;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 10;
                break;
            }
            default: {
                n3 = 37;
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
        GameStateController.nb[n4] = new String(cArray);
        return n4;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GameStateController.e(l, l2);
            object = mb[n];
            try {
                if (!(object instanceof String)) break block2;
                GameStateController.mb[n] = clazz = Class.forName(nb[n]);
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
                GameStateController.ab = MultiContainerRegistry.a(2403949884832749610L, 1515820086880914445L, MethodHandles.lookup().lookupClass()).a(233949296394823L);
                GameStateController.mb = new Object[5];
                GameStateController.nb = new String[5];
                GameStateController.i();
                GameStateController.fb = new HashMap<K, V>(13);
                var0 = GameStateController.ab ^ 29807885199455L;
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
        GameStateController.db = var8_3;
        GameStateController.eb = new Integer[20];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x23D8;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = db[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GameStateController.eb[n2] = n3;
        }
        return eb[n2];
    }

    private void lambda$new$0() {
        this.z();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GameStateController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(GameStateController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

