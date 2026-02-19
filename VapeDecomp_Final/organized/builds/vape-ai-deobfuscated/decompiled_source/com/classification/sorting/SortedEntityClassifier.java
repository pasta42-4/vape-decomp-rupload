/*
 * Decompiled with CFR 0.152.
 */
package com.classification.sorting;

import a.Ne;
import a.tl;
import a.wj;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.configuration.ConfigurationManager1436;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicParameterGenerator;
import com.spatial.mapping.CoordinateMapper;
import com.system.comparison.PriorityComparationStrategy;
import com.system.configuration.ConfigurationManager;
import com.system.parameters.SystemParameterConfiguration;
import com.system.resources.ResourceAllocationManager264;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SortedEntityClassifier
extends AbstractComputationKernel {
    private List<ContextualExecutionFramework> D;
    private static final long n;
    private HashSet<ContextualExecutionFramework> L;
    private static final Map db;
    private ResourceAllocationManager264 v = TemporalMetadataResolver.h.U().K(ResourceAllocationManager264.class);
    private final Comparator<ContextualExecutionFramework> R;
    private NetworkConfigManager Y;
    private wj b;
    private static final String[] fb;
    private HashMap<ContextualExecutionFramework, Double> E = new HashMap();
    public CryptographicParameterGenerator F;
    public CryptographicParameterGenerator V;
    private static final long[] ab;
    private HashMap<ContextualExecutionFramework, ConfigurationManager1436> B;
    private static final Object[] eb;
    private static final Integer[] bb;

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SortedEntityClassifier.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void G() {
        this.E(false);
    }

    private Color U(ContextualExecutionFramework contextualExecutionFramework) {
        NetworkConnectionEstablisher networkConnectionEstablisher = (NetworkConnectionEstablisher)this.v.O.J();
        try {
            if (networkConnectionEstablisher.equals(this.v.e)) {
                return M.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        try {
            if (networkConnectionEstablisher.equals(this.v.X)) {
                return this.v.N.L();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        return new Color(contextualExecutionFramework.N());
    }

    @Override
    public void U() {
        this.E(true);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public SortedEntityClassifier(wj wj2) {
        this.L = new HashSet();
        this.B = new HashMap();
        this.D = new ArrayList<ContextualExecutionFramework>();
        this.Y = new NetworkConfigManager();
        this.R = new PriorityComparationStrategy(this);
        this.b = wj2;
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean X() {
        boolean bl;
        try {
            bl = this.v.o.s() == false;
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        return bl;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = eb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 61;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 38;
                break;
            }
            case 4: {
                n3 = 19;
                break;
            }
            case 5: {
                n3 = 30;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 3;
                break;
            }
            case 9: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 39;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 24;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 37;
                break;
            }
            case 19: {
                n3 = 63;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 29;
                break;
            }
            case 22: {
                n3 = 33;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 25;
                break;
            }
            case 25: {
                n3 = 9;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 36;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 0;
                break;
            }
            case 30: {
                n3 = 28;
                break;
            }
            case 31: {
                n3 = 34;
                break;
            }
            case 32: {
                n3 = 58;
                break;
            }
            case 33: {
                n3 = 17;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 11;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 53;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 15;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 59;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 5;
                break;
            }
            case 46: {
                n3 = 47;
                break;
            }
            case 47: {
                n3 = 54;
                break;
            }
            case 48: {
                n3 = 49;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 6;
                break;
            }
            case 54: {
                n3 = 16;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 8;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 7;
                break;
            }
            case 59: {
                n3 = 57;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 44;
                break;
            }
            default: {
                n3 = 27;
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
        SortedEntityClassifier.fb[n4] = new String(cArray);
        return n4;
    }

    static ResourceAllocationManager264 u(SortedEntityClassifier sortedEntityClassifier) {
        return sortedEntityClassifier.v;
    }

    @Override
    public void d() {
        block9: {
            try {
                try {
                    if (!GraphicalRenderingController.K.P && this.v.P.s().booleanValue()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
                this.L.clear();
            }
            catch (CustomSystemException customSystemException) {
                throw SortedEntityClassifier.a(customSystemException);
            }
        }
        for (ContextualExecutionFramework contextualExecutionFramework : this.B.keySet()) {
            ConfigurationManager1436 configurationManager1436 = this.B.get(contextualExecutionFramework);
            try {
                try {
                    if (ConfigurationManager1436.n(configurationManager1436) == null || contextualExecutionFramework.Z()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
                ConfigurationManager1436.i(configurationManager1436, null);
            }
            catch (CustomSystemException customSystemException) {
                throw SortedEntityClassifier.a(customSystemException);
            }
        }
    }

    private static Method h(long l, long l2) {
        int n = SortedEntityClassifier.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = SortedEntityClassifier.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SortedEntityClassifier.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SortedEntityClassifier.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SortedEntityClassifier.eb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SortedEntityClassifier.f(211650626342753L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SortedEntityClassifier.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SortedEntityClassifier.eb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SortedEntityClassifier.f(211650626342753L, 0L);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SortedEntityClassifier.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SortedEntityClassifier.e(l, l2);
            object = eb[n];
            try {
                if (!(object instanceof String)) break block2;
                SortedEntityClassifier.eb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = eb;
        eb[0] = "~'X";
        objectArray[1] = Integer.TYPE;
        SortedEntityClassifier.fb[1] = "java/lang/Integer";
        objectArray[2] = "*\u0011U\n,\u0014!\u001eDEQ\f2\u0019M\f";
        objectArray[3] = "4Z$\tC\\?U5F\"R4^1\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001fJ2\u0006xDN\u0003h=x@vK0TbU\n\u001cp\u0003k;LHq[hU\n\u00027\u0003\u0013";
    }

    @Override
    public double e() {
        return 110.0;
    }

    private void E(boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        float f;
        float f2;
        boolean bl2;
        Color color;
        Color color2;
        ArrayList arrayList;
        boolean bl3;
        boolean bl4;
        float f3;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        CryptographicParameterGenerator cryptographicParameterGenerator2;
        float f4;
        CoordinateMapper coordinateMapper;
        long l;
        block161: {
            CryptographicParameterGenerator cryptographicParameterGenerator3;
            String string;
            block189: {
                Color color3;
                double d2;
                double d3;
                String string2;
                CryptographicParameterGenerator cryptographicParameterGenerator4;
                block166: {
                    block165: {
                        block162: {
                            Color color4;
                            double d4;
                            double d5;
                            String string3;
                            CryptographicParameterGenerator cryptographicParameterGenerator5;
                            block164: {
                                block163: {
                                    float f5;
                                    block158: {
                                        double d6;
                                        block160: {
                                            double d7;
                                            block159: {
                                                double d8;
                                                boolean bl5;
                                                double d9;
                                                double d10;
                                                int n5;
                                                l = SortedEntityClassifier.n ^ 0x4BDB7075B369L;
                                                coordinateMapper = GraphicsBufferAllocator.b();
                                                f4 = ((Double)this.v.w.J()).floatValue();
                                                cryptographicParameterGenerator2 = this.y((int)(16.0f * f4));
                                                try {
                                                    n5 = this.v.o.s() != false ? 14 : 16;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                                int n6 = n5;
                                                cryptographicParameterGenerator = this.y((int)((float)n6 * f4));
                                                try {
                                                    d10 = (float)this.W();
                                                    d9 = bl ? this.b.Q().b() : -4.0;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                                f3 = (float)(d10 - d9);
                                                try {
                                                    bl5 = this.G() + this.w() / 2.0 >= (double)(ApplicationLifecycleManager.e() / 4) / TemporalMetadataResolver.h.a().b();
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                                bl4 = bl5;
                                                bl3 = TemporalMetadataResolver.h.a().q.j();
                                                double d11 = 10.0;
                                                CopyOnWriteArrayList<ContextualExecutionFramework> copyOnWriteArrayList = new CopyOnWriteArrayList<ContextualExecutionFramework>();
                                                for (ContextualExecutionFramework object22 : TemporalMetadataResolver.h.U().q()) {
                                                    block155: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (!object22.Z() || object22.N() == 0) continue;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw SortedEntityClassifier.a(customSystemException);
                                                                        }
                                                                        if (!object22.u()) continue;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                    }
                                                                    if (!this.v.t.s().booleanValue()) break block155;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                }
                                                                if (this.v.L.q(object22.O(), false)) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw SortedEntityClassifier.a(customSystemException);
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SortedEntityClassifier.a(customSystemException);
                                                        }
                                                    }
                                                    copyOnWriteArrayList.add(object22);
                                                }
                                                this.z(copyOnWriteArrayList);
                                                this.D.clear();
                                                this.D.addAll(copyOnWriteArrayList);
                                                for (ContextualExecutionFramework contextualExecutionFramework : this.B.keySet()) {
                                                    ConfigurationManager1436 configurationManager1436;
                                                    block156: {
                                                        block157: {
                                                            configurationManager1436 = this.B.get(contextualExecutionFramework);
                                                            try {
                                                                try {
                                                                    if (!this.L.contains(contextualExecutionFramework)) break block156;
                                                                    if (!contextualExecutionFramework.Z()) break block157;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                }
                                                                configurationManager1436.d(true);
                                                                configurationManager1436.H(1.0f);
                                                                configurationManager1436.L(true);
                                                                this.L.remove(contextualExecutionFramework);
                                                                break block156;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw SortedEntityClassifier.a(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            configurationManager1436.d(true);
                                                            configurationManager1436.H(1.0f);
                                                            configurationManager1436.L(false);
                                                            if (!copyOnWriteArrayList.contains(contextualExecutionFramework)) {
                                                                copyOnWriteArrayList.add(contextualExecutionFramework);
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SortedEntityClassifier.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        if (ConfigurationManager1436.V(configurationManager1436)) {
                                                            continue;
                                                        }
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SortedEntityClassifier.a(customSystemException);
                                                    }
                                                    try {
                                                        try {
                                                            if (ConfigurationManager1436.l(configurationManager1436) || !(ConfigurationManager1436.f(configurationManager1436) > 0.0f)) continue;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SortedEntityClassifier.a(customSystemException);
                                                        }
                                                        copyOnWriteArrayList.add(contextualExecutionFramework);
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SortedEntityClassifier.a(customSystemException);
                                                    }
                                                }
                                                this.h(copyOnWriteArrayList);
                                                arrayList = new ArrayList();
                                                for (ContextualExecutionFramework contextualExecutionFramework : copyOnWriteArrayList) {
                                                    String string4;
                                                    CryptographicParameterGenerator cryptographicParameterGenerator6;
                                                    double d12;
                                                    arrayList.add(contextualExecutionFramework);
                                                    String string5 = contextualExecutionFramework.O();
                                                    String string6 = contextualExecutionFramework.G(this.v.p());
                                                    try {
                                                        d12 = cryptographicParameterGenerator2.l(string5, this.X());
                                                        cryptographicParameterGenerator6 = cryptographicParameterGenerator;
                                                        string4 = string6.isEmpty() ? "" : string6 + (String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)26396, (long)(0x48793812838ED346L ^ l)), (long)7501646511212703955L, (long)l));
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SortedEntityClassifier.a(customSystemException);
                                                    }
                                                    double d13 = d12 + cryptographicParameterGenerator6.l(string4, this.X());
                                                    d11 = Math.max(d11, d13);
                                                }
                                                if (this.v.h.s().booleanValue()) {
                                                    d11 = Math.max(d11, 60.0);
                                                }
                                                color2 = M.j();
                                                color = new Color(20, 20, 20, 160);
                                                bl2 = this.v.T.s();
                                                try {
                                                    d8 = bl4 ? this.G() + this.w() - d11 : this.G();
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                                d7 = d8;
                                                try {
                                                    try {
                                                        GraphicalRenderingController.K.n();
                                                        if (!this.v.h.s().booleanValue()) break block158;
                                                        if (!bl4) break block159;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SortedEntityClassifier.a(customSystemException);
                                                    }
                                                    d6 = d7 + d11 - (double)(58.0f * f4);
                                                    break block160;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                            }
                                            d6 = d7;
                                        }
                                        float f6 = (float)d6;
                                        f2 = f6 + 40.0f * f4;
                                        float f7 = 12.0f * f4;
                                        StateTrackingCoordinator.B(M.j(), f6, f3, (String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)5773, (long)(0x50AD4757273CA2D5L ^ l)), (long)7501646511212703955L, (long)l)), f7, f7, this.v.n.s());
                                        StateTrackingCoordinator.B(Color.WHITE, f2, f3, (String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)25018, (long)(0x12330D506B6355E8L ^ l)), (long)7501646511212703955L, (long)l)), f7, f7, this.v.n.s());
                                        f3 += 15.0f * f4;
                                    }
                                    try {
                                        if (!this.v.Y.s().booleanValue() || ((String)this.v.A.J()).length() <= 0) break block161;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SortedEntityClassifier.a(customSystemException);
                                    }
                                    string = ((String)this.v.A.J()).replace((CharSequence)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)27157, (long)(0x3FFB86F86569DE4AL ^ l)), (long)7501646511212703955L, (long)l)), "\u00a7");
                                    cryptographicParameterGenerator3 = TemporalMetadataResolver.h.W().L(SystemParameterConfiguration.PROXIMA, (int)(22.0f * f4), true);
                                    double d14 = cryptographicParameterGenerator3.l(string, this.X());
                                    try {
                                        f5 = bl4 ? (float)(this.G() + this.w() - 4.0 - d14) : (float)(this.G() + 2.0);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SortedEntityClassifier.a(customSystemException);
                                    }
                                    f = f5;
                                    try {
                                        try {
                                            try {
                                                if (!this.v.n.s().booleanValue()) break block162;
                                                cryptographicParameterGenerator5 = cryptographicParameterGenerator3;
                                                string3 = string;
                                                d5 = f;
                                                d4 = f3;
                                                if (!this.v.x.s().booleanValue()) break block163;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SortedEntityClassifier.a(customSystemException);
                                            }
                                            if (TemporalMetadataResolver.h.a().q.j()) break block163;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SortedEntityClassifier.a(customSystemException);
                                        }
                                        color4 = this.v.z.L();
                                        break block164;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SortedEntityClassifier.a(customSystemException);
                                    }
                                }
                                color4 = M.j();
                            }
                            cryptographicParameterGenerator5.t(string3, d5, d4, color4, this.X());
                            break block189;
                        }
                        try {
                            try {
                                cryptographicParameterGenerator4 = cryptographicParameterGenerator3;
                                string2 = string;
                                d3 = f;
                                d2 = f3;
                                if (!this.v.x.s().booleanValue() || TemporalMetadataResolver.h.a().q.j()) break block165;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SortedEntityClassifier.a(customSystemException);
                            }
                            color3 = this.v.z.L();
                            break block166;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SortedEntityClassifier.a(customSystemException);
                        }
                    }
                    color3 = M.j();
                }
                cryptographicParameterGenerator4.u(string2, d3, d2, color3, this.X());
            }
            f3 = (float)((double)f3 + (cryptographicParameterGenerator3.g(string, this.X()) + (double)(4.0f * f4)));
        }
        float[] fArray = new float[3];
        fArray = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), fArray);
        f2 = fArray[0];
        int n6 = -1;
        try {
            n4 = bl4 ? 1 : 2;
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        int n7 = n4;
        try {
            n3 = bl4 ? 8 : 4;
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        int n8 = n3;
        try {
            n2 = bl4 ? 2 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        int n9 = n2;
        try {
            n = bl4 ? 4 : 8;
        }
        catch (CustomSystemException customSystemException) {
            throw SortedEntityClassifier.a(customSystemException);
        }
        int n10 = n;
        tl.N();
        tl.s();
        tl.P();
        for (int i = 0; i < arrayList.size(); ++i) {
            int n11;
            block188: {
                double d15;
                double d16;
                String string;
                String string7;
                block187: {
                    double d17;
                    block192: {
                        ColorCompositionEngine colorCompositionEngine;
                        block184: {
                            int n12;
                            int n13;
                            ColorCompositionEngine colorCompositionEngine2;
                            ColorCompositionEngine colorCompositionEngine3;
                            block186: {
                                block185: {
                                    block181: {
                                        ColorCompositionEngine colorCompositionEngine4;
                                        block183: {
                                            block182: {
                                                float f8;
                                                double d18;
                                                double d19;
                                                boolean bl6;
                                                int n14;
                                                boolean bl7;
                                                block180: {
                                                    ConfigurationManager1436 configurationManager1436;
                                                    double d20;
                                                    block190: {
                                                        double d21;
                                                        ContextualExecutionFramework contextualExecutionFramework;
                                                        block191: {
                                                            int n15;
                                                            Color color5;
                                                            float f9;
                                                            float f10;
                                                            float f11;
                                                            boolean bl8;
                                                            Color color6;
                                                            double d22;
                                                            double d23;
                                                            double d24;
                                                            double d25;
                                                            block179: {
                                                                boolean bl9;
                                                                block178: {
                                                                    double d26;
                                                                    double d27;
                                                                    double d28;
                                                                    double d29;
                                                                    double d30;
                                                                    float f12;
                                                                    Color color7;
                                                                    boolean bl10;
                                                                    float f13;
                                                                    double d31;
                                                                    block173: {
                                                                        int n16;
                                                                        Color color8;
                                                                        float f14;
                                                                        float f15;
                                                                        float f16;
                                                                        boolean bl11;
                                                                        Color color9;
                                                                        double d32;
                                                                        double d33;
                                                                        double d34;
                                                                        double d35;
                                                                        block177: {
                                                                            block176: {
                                                                                double d36;
                                                                                double d37;
                                                                                block175: {
                                                                                    block174: {
                                                                                        boolean bl12;
                                                                                        double d38;
                                                                                        double d39;
                                                                                        block172: {
                                                                                            Color color10;
                                                                                            int n17;
                                                                                            block171: {
                                                                                                block170: {
                                                                                                    Color color11;
                                                                                                    boolean bl13;
                                                                                                    double d40;
                                                                                                    double d41;
                                                                                                    ContextualExecutionFramework contextualExecutionFramework2;
                                                                                                    block169: {
                                                                                                        block167: {
                                                                                                            double d42;
                                                                                                            double d43;
                                                                                                            float f17;
                                                                                                            String string8;
                                                                                                            CryptographicParameterGenerator cryptographicParameterGenerator7;
                                                                                                            contextualExecutionFramework = (ContextualExecutionFramework)arrayList.get(i);
                                                                                                            bl7 = this.L.contains(contextualExecutionFramework);
                                                                                                            string7 = contextualExecutionFramework.O();
                                                                                                            string = contextualExecutionFramework.G(this.v.p());
                                                                                                            if (bl7) {
                                                                                                                string = "\u00a77| Disabled";
                                                                                                            }
                                                                                                            colorCompositionEngine = new ColorCompositionEngine(this.U(contextualExecutionFramework));
                                                                                                            if (bl3) {
                                                                                                                int n18;
                                                                                                                float f18;
                                                                                                                float f19;
                                                                                                                float f20;
                                                                                                                ColorCompositionEngine colorCompositionEngine5;
                                                                                                                ColorCompositionEngine colorCompositionEngine6;
                                                                                                                if ((f2 -= 0.025f) <= 0.0f) {
                                                                                                                    f2 = 1.0f;
                                                                                                                }
                                                                                                                try {
                                                                                                                    ColorCompositionEngine colorCompositionEngine7;
                                                                                                                    fArray[0] = f2;
                                                                                                                    colorCompositionEngine6 = colorCompositionEngine7;
                                                                                                                    colorCompositionEngine5 = colorCompositionEngine7;
                                                                                                                    f20 = f2;
                                                                                                                    f19 = fArray[1];
                                                                                                                    f18 = fArray[2];
                                                                                                                    n18 = bl2 ? 8 : 4;
                                                                                                                }
                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                                                                }
                                                                                                                colorCompositionEngine6(EventDispatchCoordinator1159.f(f20, f19, f18, n18));
                                                                                                                colorCompositionEngine = colorCompositionEngine5;
                                                                                                            }
                                                                                                            d20 = cryptographicParameterGenerator2.l(string7, this.X());
                                                                                                            try {
                                                                                                                cryptographicParameterGenerator7 = cryptographicParameterGenerator;
                                                                                                                string8 = string.isEmpty() ? "" : string;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                                                            }
                                                                                                            double d44 = cryptographicParameterGenerator7.l(string8, this.X());
                                                                                                            double d45 = cryptographicParameterGenerator2.l((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)5333, (long)(0x519E33AD7BB7A086L ^ l)), (long)7501646511212703955L, (long)l)), this.X());
                                                                                                            d20 += d44;
                                                                                                            if (!string.isEmpty()) {
                                                                                                                d20 += d45;
                                                                                                                if (this.X()) {
                                                                                                                    d20 -= (double)(1.0f * f4);
                                                                                                                }
                                                                                                                if (bl4) {
                                                                                                                    d20 += 1.0;
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                f17 = bl4 ? (float)(this.G() + this.w() - 4.0 - d20) : (float)(this.G() + 2.0);
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                                                            }
                                                                                                            f = f17;
                                                                                                            double d46 = cryptographicParameterGenerator2.g((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)22795, (long)(0x41ECA1348DFA6D57L ^ l)), (long)7501646511212703955L, (long)l)), this.X());
                                                                                                            try {
                                                                                                                d43 = f;
                                                                                                                d42 = bl4 ? d20 + 3.5 : -1.5;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                                                            }
                                                                                                            d31 = d43 + d42;
                                                                                                            if (i == 0) {
                                                                                                                f3 += 1.0f * f4;
                                                                                                            }
                                                                                                            n14 = (int)(f3 - 1.0f * f4);
                                                                                                            n11 = (int)(d46 + 2.0);
                                                                                                            d21 = d20 + (double)(7.0f * f4);
                                                                                                            if (bl4) {
                                                                                                                d31 -= d20 + 5.0;
                                                                                                            }
                                                                                                            if (n6 != -1) {
                                                                                                                n14 = n6;
                                                                                                            }
                                                                                                            bl6 = false;
                                                                                                            try {
                                                                                                                if (!this.v.P.s().booleanValue() || !this.B.containsKey(contextualExecutionFramework)) break block167;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                                                            }
                                                                                                            ConfigurationManager1436 configurationManager14362 = this.B.get(contextualExecutionFramework);
                                                                                                            configurationManager14362.i(d31, n14, d21, n11);
                                                                                                            if (ConfigurationManager1436.n(configurationManager14362).T(coordinateMapper)) {
                                                                                                                bl6 = true;
                                                                                                            }
                                                                                                        }
                                                                                                        if (bl6) {
                                                                                                            block168: {
                                                                                                                int n19 = EventDispatchCoordinator1159.H(colorCompositionEngine);
                                                                                                                try {
                                                                                                                    if (n19 <= 200) break block168;
                                                                                                                    colorCompositionEngine.l(new Color(100, 100, 100, 100), 0.1f);
                                                                                                                    break block169;
                                                                                                                }
                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                                                                }
                                                                                                            }
                                                                                                            colorCompositionEngine.l(new Color(255, 255, 255, 255), 0.2f);
                                                                                                        }
                                                                                                    }
                                                                                                    n11 = (int)((float)n11 + 1.0f * f4);
                                                                                                    f13 = 2.0f * f4;
                                                                                                    if (!this.v.o.s().booleanValue()) {
                                                                                                        f13 = 0.0f;
                                                                                                    }
                                                                                                    n17 = 0;
                                                                                                    if (i > 0) {
                                                                                                        contextualExecutionFramework2 = (ContextualExecutionFramework)arrayList.get(i - 1);
                                                                                                        if (this.E.containsKey(contextualExecutionFramework2) && (d41 = this.E.get(contextualExecutionFramework2).doubleValue()) < d21) {
                                                                                                            n17 |= n7;
                                                                                                        }
                                                                                                    } else {
                                                                                                        n17 |= n7;
                                                                                                    }
                                                                                                    if (i < arrayList.size() - 1) {
                                                                                                        contextualExecutionFramework2 = (ContextualExecutionFramework)arrayList.get(i + 1);
                                                                                                        if (this.E.containsKey(contextualExecutionFramework2)) {
                                                                                                            d41 = this.E.get(contextualExecutionFramework2);
                                                                                                            d40 = d21 - d41;
                                                                                                            if (Math.abs(d40) < (double)f13) {
                                                                                                                d21 = d41;
                                                                                                                if (bl4) {
                                                                                                                    d31 += d40;
                                                                                                                }
                                                                                                            }
                                                                                                            if (d41 < d21) {
                                                                                                                n17 |= n8;
                                                                                                                if (d40 < (double)f13) {
                                                                                                                    d21 += (double)f13 - d40;
                                                                                                                    if (bl4) {
                                                                                                                        d31 -= (double)f13 - d40;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        n17 |= n8;
                                                                                                    }
                                                                                                    if (i > 0 && this.E.containsKey(contextualExecutionFramework2 = (ContextualExecutionFramework)arrayList.get(i - 1)) && (d40 = d21 - (d41 = this.E.get(contextualExecutionFramework2).doubleValue())) == 0.0) {
                                                                                                        n17 &= ~n7;
                                                                                                    }
                                                                                                    try {
                                                                                                        bl13 = i == 0;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                                                    }
                                                                                                    bl10 = bl13;
                                                                                                    try {
                                                                                                        boolean bl14 = bl9 = i == arrayList.size() - 1;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                                                    }
                                                                                                    if (bl10) {
                                                                                                        n17 |= n9;
                                                                                                    }
                                                                                                    if (bl9) {
                                                                                                        n17 |= n10;
                                                                                                    }
                                                                                                    color10 = color;
                                                                                                    try {
                                                                                                        color11 = bl7 ? new Color(20, 20, 20, 100) : colorCompositionEngine;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                                                    }
                                                                                                    color7 = color11;
                                                                                                    f12 = 1.5f * f4;
                                                                                                    d39 = d31;
                                                                                                    d38 = d21 - (double)f12;
                                                                                                    try {
                                                                                                        if (!bl4) break block170;
                                                                                                        if ((n17 & n8) == 0) break block171;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                                                    }
                                                                                                    d38 -= (double)f13;
                                                                                                    d39 += (double)f13;
                                                                                                    break block171;
                                                                                                }
                                                                                                d39 += (double)f12;
                                                                                                if ((n17 & n8) != 0) {
                                                                                                    d38 -= (double)f13;
                                                                                                }
                                                                                            }
                                                                                            double d47 = d31;
                                                                                            double d48 = n14 - 1;
                                                                                            double d49 = d21;
                                                                                            d30 = n11 + 2;
                                                                                            configurationManager1436 = null;
                                                                                            if (this.B.containsKey(contextualExecutionFramework)) {
                                                                                                configurationManager1436 = this.B.get(contextualExecutionFramework);
                                                                                                if (bl4) {
                                                                                                    d31 += d21 - d21 * (double)ConfigurationManager1436.f(configurationManager1436);
                                                                                                } else {
                                                                                                    d21 *= (double)ConfigurationManager1436.f(configurationManager1436);
                                                                                                }
                                                                                            }
                                                                                            GraphicsBufferAllocator.e(d47, d48, d49, d30);
                                                                                            if (!bl2) break block190;
                                                                                            ConfigurationManager.g(d31, n14, d21, n11, color10, false, f13, 1.0f, 0.0f, null, n17);
                                                                                            bl12 = true;
                                                                                            try {
                                                                                                if (configurationManager1436 == null || ConfigurationManager1436.V(configurationManager1436)) break block172;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                                            }
                                                                                            bl12 = false;
                                                                                        }
                                                                                        if (bl12) {
                                                                                            float f21 = 1.0f * f4;
                                                                                            ConfigurationManager.r(d39, (float)(n14 + n11) - f21 / 2.0f, d38, f21, new Color(30, 30, 30, 40));
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (!ConfigurationManager.U() || !this.X()) break block173;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                                                }
                                                                                                d37 = d31;
                                                                                                if (!bl4) break block174;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                                            }
                                                                                            d36 = d21 - 1.5 * (double)f4;
                                                                                            break block175;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw SortedEntityClassifier.a(customSystemException);
                                                                                        }
                                                                                    }
                                                                                    d36 = 0.0;
                                                                                }
                                                                                try {
                                                                                    d35 = d37 + d36;
                                                                                    d34 = n14;
                                                                                    d33 = f12;
                                                                                    d32 = n11;
                                                                                    color9 = color7;
                                                                                    bl11 = false;
                                                                                    f16 = f13;
                                                                                    f15 = 1.0f;
                                                                                    f14 = 0.0f;
                                                                                    color8 = null;
                                                                                    if (!bl10) break block176;
                                                                                    n16 = n9;
                                                                                    break block177;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                n16 = bl9 ? n10 : 0;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw SortedEntityClassifier.a(customSystemException);
                                                                            }
                                                                        }
                                                                        ConfigurationManager.g(d35, d34, d33, d32, color9, bl11, f16, f15, f14, color8, n16);
                                                                        break block191;
                                                                    }
                                                                    try {
                                                                        d29 = d31;
                                                                        d28 = bl4 ? d21 - 1.5 * (double)f4 : 0.0;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                    }
                                                                    try {
                                                                        GraphicsBufferAllocator.e(d29 + d28, n14, f12, d30);
                                                                        d27 = d31;
                                                                        d26 = bl4 ? d21 - 5.0 : 0.0;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                    }
                                                                    try {
                                                                        d25 = d27 + d26;
                                                                        d24 = n14;
                                                                        d23 = 5.0;
                                                                        d22 = n11;
                                                                        color6 = color7;
                                                                        bl8 = false;
                                                                        f11 = f13;
                                                                        f10 = 1.0f;
                                                                        f9 = 0.0f;
                                                                        color5 = null;
                                                                        if (!bl10) break block178;
                                                                        n15 = n9;
                                                                        break block179;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw SortedEntityClassifier.a(customSystemException);
                                                                    }
                                                                }
                                                                try {
                                                                    n15 = bl9 ? n10 : 0;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw SortedEntityClassifier.a(customSystemException);
                                                                }
                                                            }
                                                            ConfigurationManager.g(d25, d24, d23, d22, color6, bl8, f11, f10, f9, color5, n15);
                                                            GraphicsBufferAllocator.F();
                                                        }
                                                        n6 = n14 + n11;
                                                        f += 2.0f * f4;
                                                        this.E.put(contextualExecutionFramework, d21);
                                                    }
                                                    try {
                                                        if (configurationManager1436 == null || configurationManager1436.K()) break block180;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SortedEntityClassifier.a(customSystemException);
                                                    }
                                                    double d50 = -(d20 - d20 * (double)ConfigurationManager1436.f(configurationManager1436));
                                                    if (bl4) {
                                                        d50 = -d50;
                                                    }
                                                    f = (float)((double)f + d50);
                                                    colorCompositionEngine.I((int)(255.0f * ConfigurationManager1436.f(configurationManager1436)));
                                                    colorCompositionEngine = new ColorCompositionEngine(colorCompositionEngine.getRed(), colorCompositionEngine.getGreen(), colorCompositionEngine.getBlue(), colorCompositionEngine.getAlpha());
                                                }
                                                try {
                                                    d19 = n14 + n11 / 2;
                                                    d18 = cryptographicParameterGenerator2.g((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)12640, (long)(0x5CB30A70DA4B853BL ^ l)), (long)7501646511212703955L, (long)l)), this.X());
                                                    f8 = this.X() ? 0.0f : 2.0f * f4;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                                d16 = d19 - (d18 + (double)f8) / 2.0;
                                                try {
                                                    try {
                                                        if (!bl7) break block181;
                                                        if (!bl6) break block182;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SortedEntityClassifier.a(customSystemException);
                                                    }
                                                    colorCompositionEngine4 = new ColorCompositionEngine(200, 200, 200, 255);
                                                    break block183;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SortedEntityClassifier.a(customSystemException);
                                                }
                                            }
                                            colorCompositionEngine4 = new ColorCompositionEngine(175, 175, 175, 255);
                                        }
                                        colorCompositionEngine = colorCompositionEngine4;
                                    }
                                    try {
                                        try {
                                            ColorCompositionEngine colorCompositionEngine8;
                                            tl.a(1.0f, 1.0f, 1.0f, 1.0f);
                                            if (!this.v.n.s().booleanValue()) break block184;
                                            colorCompositionEngine3 = colorCompositionEngine8;
                                            colorCompositionEngine2 = colorCompositionEngine8;
                                            n13 = 0;
                                            if (!bl2) break block185;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SortedEntityClassifier.a(customSystemException);
                                        }
                                        n12 = 80;
                                        break block186;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SortedEntityClassifier.a(customSystemException);
                                    }
                                }
                                n12 = 170;
                            }
                            colorCompositionEngine3(n13, n12);
                            ColorCompositionEngine colorCompositionEngine9 = colorCompositionEngine2;
                            if (colorCompositionEngine.equals(Color.BLACK)) {
                                colorCompositionEngine = new ColorCompositionEngine(1, 1, 1, 255);
                            }
                            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                            cryptographicParameterGenerator2.D(string7, f, d16, colorCompositionEngine, colorCompositionEngine9, this.X());
                            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                            break block192;
                        }
                        cryptographicParameterGenerator2.u(string7, f, d16, colorCompositionEngine, this.X());
                    }
                    double d51 = cryptographicParameterGenerator2.g((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)31463, (long)(0x5AF9B5F15B8DCEB1L ^ l)), (long)7501646511212703955L, (long)l)), this.X());
                    double d52 = cryptographicParameterGenerator.g((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)13308, (long)(0x5058062559FA87A5L ^ l)), (long)7501646511212703955L, (long)l)), this.X());
                    d15 = d17 = d51 - d52;
                    try {
                        try {
                            if (!bl2 && this.v.n.s().booleanValue()) break block187;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SortedEntityClassifier.a(customSystemException);
                        }
                        cryptographicParameterGenerator.u(string, (double)f + cryptographicParameterGenerator2.l(string7, this.X()) + cryptographicParameterGenerator2.D((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)27182, (long)(0x57ABDC34B1FD5E7EL ^ l)), (long)7501646511212703955L, (long)l))), d16 + d15, new Color(150, 150, 150, 255), this.X());
                        break block188;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SortedEntityClassifier.a(customSystemException);
                    }
                }
                cryptographicParameterGenerator.t(string, (double)f + cryptographicParameterGenerator2.l(string7, this.X()) + cryptographicParameterGenerator2.D((String)((Object)SortedEntityClassifier.c("\u00c8", (int)SortedEntityClassifier.b("e", (int)21916, (long)(0x23CAA91B0C09E1CDL ^ l)), (long)7501646511212703955L, (long)l))), d16 + d15, new Color(150, 150, 150, 255), this.X());
            }
            GraphicsBufferAllocator.F();
            f3 += (float)n11;
        }
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private CryptographicParameterGenerator y(int n) {
        block4: {
            SystemParameterConfiguration systemParameterConfiguration = TemporalMetadataResolver.h.e().l().W();
            try {
                try {
                    if (systemParameterConfiguration == null || systemParameterConfiguration == SystemParameterConfiguration.PROXIMA) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
                return TemporalMetadataResolver.h.W().L(systemParameterConfiguration, n, false);
            }
            catch (CustomSystemException customSystemException) {
                throw SortedEntityClassifier.a(customSystemException);
            }
        }
        return TemporalMetadataResolver.h.W().z(n);
    }

    @Override
    public double z() {
        return 0.0;
    }

    private void z(List<ContextualExecutionFramework> list) {
        ConfigurationManager1436 configurationManager1436;
        block25: {
            ArrayList<ContextualExecutionFramework> arrayList = new ArrayList<ContextualExecutionFramework>();
            ArrayList<ContextualExecutionFramework> arrayList2 = new ArrayList<ContextualExecutionFramework>();
            for (ContextualExecutionFramework contextualExecutionFramework : list) {
                try {
                    if (this.D.contains(contextualExecutionFramework)) continue;
                    arrayList.add(contextualExecutionFramework);
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
            }
            for (ContextualExecutionFramework contextualExecutionFramework : this.D) {
                try {
                    if (list.contains(contextualExecutionFramework)) continue;
                    arrayList2.add(contextualExecutionFramework);
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
            }
            for (ContextualExecutionFramework contextualExecutionFramework : arrayList) {
                configurationManager1436 = new ConfigurationManager1436(contextualExecutionFramework);
                configurationManager1436.L(true);
                configurationManager1436.H(0.0f);
                this.B.put(contextualExecutionFramework, configurationManager1436);
            }
            for (ContextualExecutionFramework contextualExecutionFramework : arrayList2) {
                configurationManager1436 = new ConfigurationManager1436(contextualExecutionFramework);
                configurationManager1436.L(false);
                configurationManager1436.H(1.0f);
                this.B.put(contextualExecutionFramework, configurationManager1436);
            }
            try {
                try {
                    if (this.Y.m(10L) || !this.v.K.s().booleanValue()) break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SortedEntityClassifier.a(customSystemException);
            }
        }
        this.Y.m();
        for (ContextualExecutionFramework contextualExecutionFramework : this.B.keySet()) {
            ConfigurationManager1436 configurationManager14362;
            block26: {
                block27: {
                    configurationManager1436 = this.B.get(contextualExecutionFramework);
                    try {
                        if (ConfigurationManager1436.V(configurationManager1436)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SortedEntityClassifier.a(customSystemException);
                    }
                    try {
                        try {
                            if (this.v.K.s().booleanValue()) break block26;
                            if (!ConfigurationManager1436.l(configurationManager1436)) break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SortedEntityClassifier.a(customSystemException);
                        }
                        ConfigurationManager1436.a(configurationManager1436, 1.0f);
                        configurationManager1436.d(true);
                        continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SortedEntityClassifier.a(customSystemException);
                    }
                }
                ConfigurationManager1436.a(configurationManager1436, 0.0f);
                configurationManager1436.d(true);
                continue;
            }
            if (ConfigurationManager1436.l(configurationManager1436)) {
                configurationManager14362 = configurationManager1436;
                try {
                    ConfigurationManager1436.a(configurationManager14362, (float)((double)ConfigurationManager1436.f(configurationManager14362) + 0.08));
                    if (!(ConfigurationManager1436.f(configurationManager1436) >= 1.0f)) continue;
                    ConfigurationManager1436.a(configurationManager1436, 1.0f);
                    configurationManager1436.d(true);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
            }
            configurationManager14362 = configurationManager1436;
            try {
                ConfigurationManager1436.a(configurationManager14362, (float)((double)ConfigurationManager1436.f(configurationManager14362) - 0.08));
                if (!(ConfigurationManager1436.f(configurationManager1436) <= 0.0f)) continue;
                ConfigurationManager1436.a(configurationManager1436, 0.0f);
                configurationManager1436.d(true);
            }
            catch (CustomSystemException customSystemException) {
                throw SortedEntityClassifier.a(customSystemException);
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C40;
        if (bb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SortedEntityClassifier.bb[n2] = n3;
        }
        return bb[n2];
    }

    static boolean y(SortedEntityClassifier sortedEntityClassifier) {
        return sortedEntityClassifier.X();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SortedEntityClassifier.n = MultiContainerRegistry.a(-3697550299691762072L, -7365302367519023284L, MethodHandles.lookup().lookupClass()).a(169679614019695L);
                SortedEntityClassifier.eb = new Object[5];
                SortedEntityClassifier.fb = new String[5];
                SortedEntityClassifier.a();
                SortedEntityClassifier.db = new HashMap<K, V>(13);
                var0 = SortedEntityClassifier.n ^ 27239443453183L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00ff\u00ca\u00d2\u0002\t*\u008e\u0016#\u00c4\u00ac\u00d7!\u0080u\u00bb\u00f4E\u00e2\u0014T\u0088G\u00d6\u00c00h\u0086\u00d8e\u0092\u00f9E\u00c6\u00f5\u00ae>\u00d0Lg\"\u0093\u00b3\u00ab1\u00e4\u00a2M\u00ae+G\u00fb\u000b\u0085K4\u00d5N\u00fc\u009c\u008e\u0084\u00b1\u008e\u00d0\"\u0015SOj\u0080\u00e2\u00ea_\u00c3\u008b\u00ac;\u001cIF\u001a\u00afE\u00d8\u00a5\"\u000b";
                var7_6 = "\u00ff\u00ca\u00d2\u0002\t*\u008e\u0016#\u00c4\u00ac\u00d7!\u0080u\u00bb\u00f4E\u00e2\u0014T\u0088G\u00d6\u00c00h\u0086\u00d8e\u0092\u00f9E\u00c6\u00f5\u00ae>\u00d0Lg\"\u0093\u00b3\u00ab1\u00e4\u00a2M\u00ae+G\u00fb\u000b\u0085K4\u00d5N\u00fc\u009c\u008e\u0084\u00b1\u008e\u00d0\"\u0015SOj\u0080\u00e2\u00ea_\u00c3\u008b\u00ac;\u001cIF\u001a\u00afE\u00d8\u00a5\"\u000b".length();
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
                    var6_5 = "\u00bfe\u00e2\u008f\u00fe\u000e\u0012[\u009el)\\\u001d\u001a\u008a\u00a2";
                    var7_6 = "\u00bfe\u00e2\u008f\u00fe\u000e\u0012[\u009el)\\\u001d\u001a\u008a\u00a2".length();
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
        SortedEntityClassifier.ab = var8_3;
        SortedEntityClassifier.bb = new Integer[13];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SortedEntityClassifier.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SortedEntityClassifier.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00d5' || c == '\u00e0' || c == '\u00ef') {
                field = SortedEntityClassifier.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SortedEntityClassifier.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SortedEntityClassifier.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SortedEntityClassifier.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void O(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block12: {
            try {
                try {
                    super.O(userInteractionEventDispatcher);
                    if (this.v.P.s().booleanValue() && !GraphicalRenderingController.K.P) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SortedEntityClassifier.a(customSystemException);
            }
        }
        for (ContextualExecutionFramework contextualExecutionFramework : this.B.keySet()) {
            block13: {
                ConfigurationManager1436 configurationManager1436 = this.B.get(contextualExecutionFramework);
                try {
                    if (ConfigurationManager1436.n(configurationManager1436) == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
                MetricsCalculationEngine metricsCalculationEngine = ConfigurationManager1436.n(configurationManager1436);
                try {
                    try {
                        if (!metricsCalculationEngine.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) continue;
                        if (!contextualExecutionFramework.Z()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SortedEntityClassifier.a(customSystemException);
                    }
                    contextualExecutionFramework.T(false);
                    this.L.add(contextualExecutionFramework);
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw SortedEntityClassifier.a(customSystemException);
                }
            }
            contextualExecutionFramework.T(true);
            this.L.remove(contextualExecutionFramework);
            this.D.add(contextualExecutionFramework);
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void h(List<ContextualExecutionFramework> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Field g(long l, long l2) {
        int n = SortedEntityClassifier.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = SortedEntityClassifier.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SortedEntityClassifier.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SortedEntityClassifier.c(clazz3, string2, clazz2)) != null) {
                    SortedEntityClassifier.eb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SortedEntityClassifier.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SortedEntityClassifier.eb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SortedEntityClassifier.f(211650626342753L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SortedEntityClassifier.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SortedEntityClassifier.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

