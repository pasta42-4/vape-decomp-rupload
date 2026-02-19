/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.finance.risk;

import a.Qh;
import a.Z3;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.entity.event.EntityEventMediator;
import com.event.dispatch.EventDispatchController;
import com.event.management.EventDispatchCoordinator1011;
import com.exception.system.CustomSystemException;
import com.financial.payment.PaymentProcessingHandler;
import com.game.inventory.InventoryEventManager;
import com.google.gson.JsonObject;
import com.messaging.routing.MessageRoutingService;
import com.monitoring.diagnostics.DiagnosticEventTracker;
import com.network.config.ConnectionConfigurationResolver;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.NetworkProtocolNegotiator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.lifecycle.ResourceLifecycleOrchestrator;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class FinancialRiskCalculator
extends EventDispatchController
implements NetworkConfigurationResolver2717 {
    private int Tj;
    private static final Object[] wb;
    private int TU;
    private Qh T5;
    private static final Map vb;
    private DiagnosticEventTracker TH;
    private int Tu;
    private double Tr;
    private DiagnosticEventTracker Td;
    private static final long[] lb;
    private static final Integer[] ub;
    private double TT;
    private String Te;
    private NetworkProtocolNegotiator T9;
    private MessageRoutingService Tt;
    private double Ti;
    private static final long fb;
    private static final String[] Hb;
    private int TK;
    private int TN;

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = FinancialRiskCalculator.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = FinancialRiskCalculator.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = FinancialRiskCalculator.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void i(EntityEventMediator entityEventMediator) {
        block13: {
            try {
                try {
                    if (this.T5 != null && this.Te != null) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw FinancialRiskCalculator.c(customSystemException);
            }
        }
        try {
            if (ApplicationLifecycleManager.U().y(this.T5) > 6.0f) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FinancialRiskCalculator.c(customSystemException);
        }
        try {
            if (entityEventMediator.getEntity().M().equals(ApplicationLifecycleManager.U().M())) {
                ++this.Tj;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FinancialRiskCalculator.c(customSystemException);
        }
        try {
            if (entityEventMediator.getEntity().M().equals(this.T5.M())) {
                ++this.TN;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FinancialRiskCalculator.c(customSystemException);
        }
        this.z();
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = FinancialRiskCalculator.u(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                FinancialRiskCalculator.wb[n] = clazz = Class.forName(Hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void y(JsonObject jsonObject) {
        super.y(jsonObject);
        GraphicalRenderingController.D(ResourceLifecycleOrchestrator.class).d().c(this.f());
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean q() {
        boolean bl;
        ConnectionConfigurationResolver connectionConfigurationResolver;
        block8: {
            block7: {
                connectionConfigurationResolver = ApplicationLifecycleManager.c();
                try {
                    if (this.T9 == null) {
                        this.T9 = connectionConfigurationResolver;
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
                try {
                    try {
                        if (!connectionConfigurationResolver.r() || connectionConfigurationResolver.M().equals(this.T9.M())) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        this.T9 = connectionConfigurationResolver;
        return bl2;
    }

    private static Method x(long l, long l2) {
        int n = FinancialRiskCalculator.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Hb[n];
                int n3 = string2.indexOf(8);
                clazz3 = FinancialRiskCalculator.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = FinancialRiskCalculator.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = FinancialRiskCalculator.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        FinancialRiskCalculator.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = FinancialRiskCalculator.v(236974860992331L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = FinancialRiskCalculator.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        FinancialRiskCalculator.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = FinancialRiskCalculator.v(236974860992331L, 0L);
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

    public FinancialRiskCalculator() {
        long l = fb ^ 0x7A0E7E68B8B5L;
        super(a.cs((int)FinancialRiskCalculator.e("m", (int)31337, (long)(0x7756A8E572168DBAL ^ l))), a.cs((int)FinancialRiskCalculator.e("m", (int)19678, (long)(0x299112B3BD223B0AL ^ l))));
        this.Tt = new MessageRoutingService(this);
        this.TH = new DiagnosticEventTracker((String)((Object)FinancialRiskCalculator.k("\u00d2", (int)FinancialRiskCalculator.e("m", (int)16984, (long)(0x3F65B39625A33589L ^ l)), (long)499161627101846735L, (long)l)));
        this.Td = new DiagnosticEventTracker((String)((Object)FinancialRiskCalculator.k("\u00d2", (int)FinancialRiskCalculator.e("m", (int)29142, (long)(0x69C684B2E0CD0601L ^ l)), (long)499161627101846735L, (long)l)));
        if (this.W()) {
            this.V();
        }
        this.J(this.Tt, this.TH, this.Td);
        this.v();
        Z3.s().A(this, new Predicate[0]);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'Y' || c == '\u00cf' || c == '\u00ea') {
                field = FinancialRiskCalculator.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = FinancialRiskCalculator.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void v() {
        long l = fb ^ 0x383F6403A227L;
        this.Te = FinancialRiskCalculator.k("\u00d2", (int)FinancialRiskCalculator.e("m", (int)21302, (long)(0x2F8E41CFF686BE72L ^ l)), (long)2053398351952627293L, (long)l);
        this.T5 = null;
        this.TK = 0;
        this.Tu = 0;
        this.TU = 0;
        this.TN = 0;
        this.Tj = 0;
        this.z();
    }

    private void Y() {
        block25: {
            ArrayList<Qh> arrayList;
            block24: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                ConnectionConfigurationResolver connectionConfigurationResolver;
                long l;
                block23: {
                    l = fb ^ 0x21FBA0E612B2L;
                    connectionConfigurationResolver = ApplicationLifecycleManager.c();
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        try {
                            if (!connectionConfigurationResolver.Y() && !systemConfigurationOrchestrator.Y()) break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw FinancialRiskCalculator.c(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                }
                this.Te = FinancialRiskCalculator.k("\u00d2", (int)FinancialRiskCalculator.e("m", (int)9536, (long)(0x2445482F6671F895L ^ l)), (long)-5986907680740477240L, (long)l);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(connectionConfigurationResolver.M());
                arrayList = new ArrayList<Qh>();
                for (Object e : copyOnWriteArrayList) {
                    try {
                        if (!ReflectionMetadataResolver.UQ.isInstance(e)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    Qh qh = new Qh(e);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (qh.R() || qh.M().equals(systemConfigurationOrchestrator.M())) continue;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw FinancialRiskCalculator.c(customSystemException);
                                    }
                                    if (qh.O()) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw FinancialRiskCalculator.c(customSystemException);
                                }
                                if (qh.X() == -420) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw FinancialRiskCalculator.c(customSystemException);
                            }
                            if (!(systemConfigurationOrchestrator.y(qh) < 32.0f)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw FinancialRiskCalculator.c(customSystemException);
                        }
                        arrayList.add(qh);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                }
                try {
                    if (arrayList.size() <= 1) break block24;
                    this.Te = FinancialRiskCalculator.k("\u00d2", (int)FinancialRiskCalculator.e("m", (int)23854, (long)(0x2DCD4806221400F9L ^ l)), (long)-5986907680740477240L, (long)l);
                    break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
            }
            try {
                if (arrayList.size() == 1) {
                    this.T5 = (Qh)arrayList.get(0);
                    this.Te = this.T5.e();
                    this.z();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw FinancialRiskCalculator.c(customSystemException);
            }
        }
    }

    @Override
    public void i() {
    }

    @Override
    public void u() {
        double d2 = this.Q().b();
        Color color = new Color(FinancialRiskCalculator.M.g.getRed(), FinancialRiskCalculator.M.g.getGreen(), FinancialRiskCalculator.M.g.getBlue(), 240);
        ConfigurationManager.S(this.G(), this.W() + d2, this.w(), this.b() - d2, color);
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "J\bV";
        objectArray[1] = Integer.TYPE;
        FinancialRiskCalculator.Hb[1] = "java/lang/Integer";
        objectArray[2] = "\u0014pQ\u0005c\u0018\u001f\u007f@J\u001e\u0000\fxI\u0003";
        objectArray[3] = "XS#\u0004naS\\2K\u000foXW6\u0011";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "R1K~\u0001\u0017\u0005qHN\u0016\u00178q\u000bsF][0\u0005?\u001bl\u00016M,\u0003\u0016FxW0}";
    }

    public Qh u() {
        return this.T5;
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void C() {
        block40: {
            block41: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block39: {
                    block38: {
                        boolean bl;
                        block37: {
                            block36: {
                                block34: {
                                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                    try {
                                        try {
                                            if (this.F() && !ApplicationLifecycleManager.U().Y()) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw FinancialRiskCalculator.c(customSystemException);
                                        }
                                        this.v();
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw FinancialRiskCalculator.c(customSystemException);
                                    }
                                }
                                try {
                                    block35: {
                                        try {
                                            try {
                                                if (Math.abs(systemConfigurationOrchestrator.F() - this.Tr) > 120.0 || Math.abs(systemConfigurationOrchestrator.V() - this.Ti) > 120.0) break block35;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw FinancialRiskCalculator.c(customSystemException);
                                            }
                                            if (!(Math.abs(systemConfigurationOrchestrator.B() - this.TT) > 120.0)) break block36;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw FinancialRiskCalculator.c(customSystemException);
                                        }
                                    }
                                    bl = true;
                                    break block37;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw FinancialRiskCalculator.c(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        boolean bl2 = bl;
                        try {
                            try {
                                this.Tr = systemConfigurationOrchestrator.F();
                                this.Ti = systemConfigurationOrchestrator.V();
                                this.TT = systemConfigurationOrchestrator.B();
                                if (!this.q() && !bl2) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw FinancialRiskCalculator.c(customSystemException);
                            }
                            this.v();
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw FinancialRiskCalculator.c(customSystemException);
                        }
                    }
                    try {
                        if (ApplicationLifecycleManager.c().Y()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    try {
                        try {
                            if (this.T5 != null && !this.T5.Y()) break block39;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw FinancialRiskCalculator.c(customSystemException);
                        }
                        this.Y();
                        break block40;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                }
                try {
                    try {
                        if (!systemConfigurationOrchestrator.O() && !this.T5.O()) break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    this.v();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
            }
            boolean bl = false;
            for (Object e : ApplicationLifecycleManager.c().M()) {
                if (this.T5.M().equals(e)) {
                    bl = true;
                    break;
                }
                Qh qh = new Qh(e);
                try {
                    try {
                        if (this.T5.M().equals(qh.M()) || !this.T5.e().equalsIgnoreCase(qh.e())) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    this.T5 = qh;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
            }
            try {
                if (!bl) {
                    this.T5 = null;
                    this.Y();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw FinancialRiskCalculator.c(customSystemException);
            }
        }
    }

    @Override
    public String A() {
        long l = fb ^ 0x29FB7164FDC8L;
        return FinancialRiskCalculator.k("\u00d2", (int)FinancialRiskCalculator.e("m", (int)27806, (long)(0x50669AF1FE245E36L ^ l)), (long)4868447477967428018L, (long)l);
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x713E;
        if (ub[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = lb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])vb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    vb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FinancialRiskCalculator.ub[n2] = n3;
        }
        return ub[n2];
    }

    @DataExchangeProtocol2090
    public void m(EventDispatchCoordinator1011 eventDispatchCoordinator1011) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        try {
                            block15: {
                                try {
                                    try {
                                        if (this.T5 == null || this.T5.Y()) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw FinancialRiskCalculator.c(customSystemException);
                                    }
                                    if (!ApplicationLifecycleManager.U().Y()) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw FinancialRiskCalculator.c(customSystemException);
                                }
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw FinancialRiskCalculator.c(customSystemException);
                        }
                    }
                    try {
                        if (!eventDispatchCoordinator1011.getEntity().B(ReflectionMetadataResolver.F6)) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    PaymentProcessingHandler paymentProcessingHandler = new PaymentProcessingHandler(eventDispatchCoordinator1011.getEntity());
                    try {
                        try {
                            if (!paymentProcessingHandler.a().Y() && RuntimeResourceTracker.d(paymentProcessingHandler.a())) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw FinancialRiskCalculator.c(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                }
                try {
                    if (this.TU <= 0) break block18;
                    ++this.TK;
                    --this.TU;
                    break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
            }
            ++this.Tu;
        }
        this.z();
    }

    @DataExchangeProtocol2090
    public void Z(InventoryEventManager inventoryEventManager) {
        block11: {
            block10: {
                try {
                    try {
                        if (this.T5 != null && !this.T5.Y()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
            }
            LightweightExecutionContext lightweightExecutionContext = inventoryEventManager.getItemStack();
            try {
                try {
                    try {
                        if (!lightweightExecutionContext.r() || !ReflectionMetadataResolver.Fl.isInstance(lightweightExecutionContext.C().M())) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FinancialRiskCalculator.c(customSystemException);
                    }
                    if (!RuntimeResourceTracker.d(lightweightExecutionContext)) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw FinancialRiskCalculator.c(customSystemException);
                }
                ++this.TU;
            }
            catch (CustomSystemException customSystemException) {
                throw FinancialRiskCalculator.c(customSystemException);
            }
        }
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = FinancialRiskCalculator.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = FinancialRiskCalculator.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public String C() {
        return this.Te;
    }

    private static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                FinancialRiskCalculator.fb = MultiContainerRegistry.a(2749192707796732937L, -779697748951558538L, MethodHandles.lookup().lookupClass()).a(13430966874012L);
                FinancialRiskCalculator.wb = new Object[5];
                FinancialRiskCalculator.Hb = new String[5];
                FinancialRiskCalculator.X();
                FinancialRiskCalculator.vb = new HashMap<K, V>(13);
                var0 = FinancialRiskCalculator.fb ^ 103340701052640L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "/1>|\u00f5\u00be \u0000\u00d8\u00fc\u0001\u0098\u009c\u00b4$\u00ea(\u00ecE\u00c3\u0004`\u00c7J\u00ca\u008f\u00e9\u000f\u0096\u0000\u00a2@\u0013G\u0086g\u00ee!\u00bc \u0098\u00d4\u0088\u00ac\u0097\u00fb*\u00d0";
                var7_6 = "/1>|\u00f5\u00be \u0000\u00d8\u00fc\u0001\u0098\u009c\u00b4$\u00ea(\u00ecE\u00c3\u0004`\u00c7J\u00ca\u008f\u00e9\u000f\u0096\u0000\u00a2@\u0013G\u0086g\u00ee!\u00bc \u0098\u00d4\u0088\u00ac\u0097\u00fb*\u00d0".length();
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
                    var6_5 = "\u0013\u00d9\u00d0[\u0093=\u008a}\u00c3bS\u0081`\f\u0001\u00fc";
                    var7_6 = "\u0013\u00d9\u00d0[\u0093=\u008a}\u00c3bS\u0081`\f\u0001\u00fc".length();
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
        FinancialRiskCalculator.lb = var8_3;
        FinancialRiskCalculator.ub = new Integer[8];
    }

    private void z() {
        this.Td.F(this.TN);
        this.Td.A(this.Tj);
        this.TH.F(this.Tu);
        this.TH.A(this.TK);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field w(long l, long l2) {
        int n = FinancialRiskCalculator.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = Hb[n];
            int n2 = string.indexOf(8);
            Class clazz = FinancialRiskCalculator.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = FinancialRiskCalculator.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = FinancialRiskCalculator.k(clazz3, string2, clazz2)) != null) {
                    FinancialRiskCalculator.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = FinancialRiskCalculator.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        FinancialRiskCalculator.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = FinancialRiskCalculator.v(236974860992331L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Hb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 13;
                break;
            }
            case 1: {
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 7;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 53;
                break;
            }
            case 7: {
                n3 = 25;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 39;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 34;
                break;
            }
            case 17: {
                n3 = 50;
                break;
            }
            case 18: {
                n3 = 17;
                break;
            }
            case 19: {
                n3 = 27;
                break;
            }
            case 20: {
                n3 = 28;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 55;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 22;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 47;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 45;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 54;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 11;
                break;
            }
            case 41: {
                n3 = 61;
                break;
            }
            case 42: {
                n3 = 14;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 15;
                break;
            }
            case 46: {
                n3 = 23;
                break;
            }
            case 47: {
                n3 = 36;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 18;
                break;
            }
            case 53: {
                n3 = 62;
                break;
            }
            case 54: {
                n3 = 6;
                break;
            }
            case 55: {
                n3 = 10;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 46;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 16;
                break;
            }
            case 62: {
                n3 = 40;
                break;
            }
            default: {
                n3 = 41;
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
        FinancialRiskCalculator.Hb[n4] = new String(cArray);
        return n4;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = FinancialRiskCalculator.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(FinancialRiskCalculator.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(FinancialRiskCalculator.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

