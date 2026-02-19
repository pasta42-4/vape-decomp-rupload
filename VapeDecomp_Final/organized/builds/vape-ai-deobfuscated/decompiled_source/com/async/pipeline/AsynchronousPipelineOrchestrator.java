/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.async.pipeline;

import a.yC;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.streaming.DataStreamOrchestrator629;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AsynchronousPipelineOrchestrator
extends GraphicalRenderEngine1082 {
    private boolean M3;
    private int MD;
    private static final Map fb;
    private CompletableFuture<List<AbstractComputationKernel>> M9;
    @Nullable
    private DataStreamOrchestrator629<?> MR;
    private long Mo;
    @Nullable
    private Supplier<CompletableFuture<List<AbstractComputationKernel>>> MH;
    private static final Integer[] eb;
    @Nullable
    private GraphicalRenderEngine1082 M8;
    private int MA;
    private long MB;
    private static final long ab;
    private static final Object[] lb;
    private yC Ma;
    private static final long[] bb;
    private boolean M_;
    private int MT;
    private List<AbstractComputationKernel> MF;
    private int M5;
    @Nullable
    private Supplier<AbstractComputationKernel> M1;
    private static final String[] mb;

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public DataStreamOrchestrator629<?> x() {
        return this.MR;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method l(long l, long l2) {
        int n = AsynchronousPipelineOrchestrator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousPipelineOrchestrator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousPipelineOrchestrator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousPipelineOrchestrator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousPipelineOrchestrator.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousPipelineOrchestrator.j(246881809654294L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousPipelineOrchestrator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousPipelineOrchestrator.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousPipelineOrchestrator.j(246881809654294L, 0L);
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

    public AsynchronousPipelineOrchestrator(double d2, double d3) {
        this(d2, d3, 1);
    }

    public void Q(@Nullable GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        this.M8 = graphicalRenderEngine1082;
    }

    public void Y(List<AbstractComputationKernel> list) {
        this.MF = list;
    }

    public void M(long l) {
        this.MB = l;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(-3268025833938630130L, -1560913727741128907L, MethodHandles.lookup().lookupClass()).a(150631630366912L);
        lb = new Object[5];
        mb = new String[5];
        AsynchronousPipelineOrchestrator.D();
        fb = new HashMap(13);
        long l = ab ^ 0x644EA28A3667L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00d4\u001bG>J\u0097\u00ebmy\u00car\u00bc\u009d\u001e\u00ea\u00e8\u00ffm\"[\u00b3hvK";
        int n2 = "\u00d4\u001bG>J\u0097\u00ebmy\u00car\u00bc\u009d\u001e\u00ea\u00e8\u00ffm\"[\u00b3hvK".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        bb = lArray;
        eb = new Integer[3];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousPipelineOrchestrator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousPipelineOrchestrator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousPipelineOrchestrator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void x(int n) {
        this.MD = n;
    }

    public long T() {
        return this.MB;
    }

    @Override
    public void f() {
        super.f();
        this.s(true);
    }

    @Override
    public double z() {
        try {
            if (this.M8 != null) {
                return this.d().R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        return super.z();
    }

    public void D(@Nullable Supplier<AbstractComputationKernel> supplier) {
        this.M1 = supplier;
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block4: {
            try {
                try {
                    if (!this.Ma.f() || !this.Ma.G()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                this.Ma.S(userInteractionEventDispatcher);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
        }
        super.S(userInteractionEventDispatcher);
    }

    @Override
    public void J(AbstractComputationKernel abstractComputationKernel) {
        super.J(abstractComputationKernel);
        --this.MA;
    }

    public int i() {
        return this.MT;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousPipelineOrchestrator.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void G(int n) {
        this.MT = n;
    }

    private void x() {
        this.X();
        Supplier<CompletableFuture<List<AbstractComputationKernel>>> supplier = this.MH;
        try {
            if (supplier == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        Supplier<AbstractComputationKernel> supplier2 = this.M1;
        if (supplier2 != null) {
            int n;
            block9: {
                n = this.MD;
                DataStreamOrchestrator629<?> dataStreamOrchestrator629 = this.MR;
                try {
                    if (dataStreamOrchestrator629 == null || this.Mo <= dataStreamOrchestrator629.j()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                n = (int)dataStreamOrchestrator629.L() % this.MD;
            }
            ArrayList<AbstractComputationKernel> arrayList = new ArrayList<AbstractComputationKernel>();
            try {
                for (int i = 0; i < n; ++i) {
                    arrayList.add(supplier2.get());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
            this.o(arrayList.toArray(new AbstractComputationKernel[0]));
            this.Y(arrayList);
        }
        AtomicReference<CompletableFuture<List<AbstractComputationKernel>>> atomicReference = new AtomicReference<CompletableFuture<List<AbstractComputationKernel>>>();
        this.M9 = ((CompletableFuture)supplier.get().whenCompleteAsync((arg_0, arg_1) -> this.lambda$loadNewContent$1(atomicReference, arg_0, arg_1), (Executor)GraphicalRenderingController.st)).exceptionally(this::lambda$loadNewContent$2);
        atomicReference.set(this.M9);
    }

    private void lambda$new$0() {
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.Z();
        graphicalRenderEngine1082.e(0.0);
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 18;
                break;
            }
            case 1: {
                n3 = 22;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 51;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 52;
                break;
            }
            case 6: {
                n3 = 42;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 36;
                break;
            }
            case 10: {
                n3 = 2;
                break;
            }
            case 11: {
                n3 = 23;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 38;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 35;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 1;
                break;
            }
            case 19: {
                n3 = 63;
                break;
            }
            case 20: {
                n3 = 14;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 49;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 21;
                break;
            }
            case 26: {
                n3 = 17;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 19;
                break;
            }
            case 30: {
                n3 = 6;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 61;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 37;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 45;
                break;
            }
            case 41: {
                n3 = 9;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 32;
                break;
            }
            case 44: {
                n3 = 33;
                break;
            }
            case 45: {
                n3 = 56;
                break;
            }
            case 46: {
                n3 = 11;
                break;
            }
            case 47: {
                n3 = 8;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 5;
                break;
            }
            case 50: {
                n3 = 43;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 59;
                break;
            }
            case 54: {
                n3 = 60;
                break;
            }
            case 55: {
                n3 = 26;
                break;
            }
            case 56: {
                n3 = 3;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 62;
                break;
            }
            case 60: {
                n3 = 0;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 15;
                break;
            }
            default: {
                n3 = 20;
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
        AsynchronousPipelineOrchestrator.mb[n4] = new String(cArray);
        return n4;
    }

    private static Field k(long l, long l2) {
        int n = AsynchronousPipelineOrchestrator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousPipelineOrchestrator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousPipelineOrchestrator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousPipelineOrchestrator.e(clazz3, string2, clazz2)) != null) {
                    AsynchronousPipelineOrchestrator.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousPipelineOrchestrator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousPipelineOrchestrator.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousPipelineOrchestrator.j(246881809654294L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void E(int n) {
        this.M5 = n;
    }

    @Override
    public double e() {
        try {
            if (this.M8 != null) {
                return this.d().C();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        return super.e();
    }

    public AsynchronousPipelineOrchestrator(double d2, double d3, int n) {
        long l = ab ^ 0x706BDABBEA83L;
        super(d2, d3);
        this.M_ = false;
        this.MF = new ArrayList<AbstractComputationKernel>();
        this.MT = 1;
        this.MD = (int)AsynchronousPipelineOrchestrator.c("f", (int)29801, (long)(0x3296B5B8230D7EF3L ^ l));
        this.M5 = 1;
        this.Ma = new yC((String)((Object)AsynchronousPipelineOrchestrator.d("\u00c3", (int)AsynchronousPipelineOrchestrator.c("f", (int)26225, (long)(0x6CEE4BF778CFECE8L ^ l)), (long)-2648855350555567143L, (long)l)), 8.0, 8.0, 15.0, 15.0, Color.WHITE, AsynchronousPipelineOrchestrator.M.q, new Color(255, 255, 255, 64));
        this.MB = n;
        this.Mo = n;
        this.Ma.x(6.0);
        this.Ma.X(6.0);
        this.Ma.H(AsynchronousPipelineOrchestrator.M.Z);
        this.Ma.a(AsynchronousPipelineOrchestrator.M.g, AsynchronousPipelineOrchestrator.M.g.brighter());
        this.Ma.M(AsynchronousPipelineOrchestrator.M.S);
        this.Ma.k(0.75f);
        this.Ma.i(true);
        this.Ma.T(14.0);
        this.Ma.w(10.0);
        this.Ma.Y(5.0f);
        this.Ma.w(true);
        this.Ma.u(true);
        this.Ma.N(this::lambda$new$0);
    }

    public int Z() {
        return this.M5;
    }

    @Nullable
    public Supplier<CompletableFuture<List<AbstractComputationKernel>>> v() {
        return this.MH;
    }

    private GraphicalRenderEngine1082 Z() {
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        try {
            graphicalRenderEngine1082 = this.M8 != null ? this.M8 : this;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        return graphicalRenderEngine1082;
    }

    @Override
    public void g() {
        block4: {
            try {
                try {
                    if (!this.Ma.f() || !this.Ma.G()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                this.Ma.g();
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
        }
    }

    private void X() {
        CompletableFuture<List<AbstractComputationKernel>> completableFuture = this.M9;
        try {
            if (completableFuture != null) {
                completableFuture.cancel(true);
                this.M9 = null;
                this.r(this.MF, new ArrayList<AbstractComputationKernel>());
                this.MF.clear();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "\u0013S\u000e";
        objectArray[1] = Integer.TYPE;
        AsynchronousPipelineOrchestrator.mb[1] = "java/lang/Integer";
        objectArray[2] = "[\u0018$`*]P\u00175/WEC\u0010<f";
        objectArray[3] = "dvG!o\u007foyVn\u000eqdrR4";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "4/O<\u0012{3pR\u0000\t=T.\u0016i]?7+U>\\Fmy\u001dk\u001dy6rW:b";
    }

    private List lambda$loadNewContent$2(Throwable throwable) {
        this.M9 = null;
        return null;
    }

    @Override
    public void d() {
        try {
            super.d();
            if (this.Ma.f()) {
                this.Ma.d();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
    }

    @Nullable
    public Supplier<AbstractComputationKernel> Y() {
        return this.M1;
    }

    public void a(@Nullable Supplier<CompletableFuture<List<AbstractComputationKernel>>> supplier) {
        this.MH = supplier;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public long f() {
        return this.Mo;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousPipelineOrchestrator.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousPipelineOrchestrator.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void Z(@Nullable DataStreamOrchestrator629<?> dataStreamOrchestrator629) {
        block4: {
            try {
                try {
                    this.MR = dataStreamOrchestrator629;
                    if (dataStreamOrchestrator629 == null || !dataStreamOrchestrator629.a()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                this.M_ = true;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
        }
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousPipelineOrchestrator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousPipelineOrchestrator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void y() {
        List<AbstractComputationKernel> list = this.A();
        double d2 = this.V();
        super.k();
        this.MA = 0;
        for (AbstractComputationKernel abstractComputationKernel : list) {
            this.n(abstractComputationKernel, new Object[0]);
        }
        this.R(d2);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x51A7;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
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
                throw new RuntimeException("a/yw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousPipelineOrchestrator.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public GraphicalRenderEngine1082 k() {
        return this.M8;
    }

    public int b() {
        return this.MD;
    }

    @Override
    public void n(AbstractComputationKernel abstractComputationKernel, Object ... objectArray) {
        Object object;
        Object[] objectArray2;
        AbstractComputationKernel abstractComputationKernel2;
        AsynchronousPipelineOrchestrator asynchronousPipelineOrchestrator;
        boolean bl;
        long l;
        block13: {
            block12: {
                l = ab ^ 0x457516A797D0L;
                try {
                    block11: {
                        try {
                            try {
                                if (this.MT == 1) break block11;
                                if (this.MA <= 0) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousPipelineOrchestrator.a(customSystemException);
                            }
                            if ((this.MA + 1) % this.MT != 0) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousPipelineOrchestrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            asynchronousPipelineOrchestrator = this;
            abstractComputationKernel2 = abstractComputationKernel;
            Object[] objectArray3 = new Object[1];
            Object[] objectArray4 = objectArray3;
            objectArray2 = objectArray3;
            int n = 0;
            object = bl2 ? AsynchronousPipelineOrchestrator.d("\u00c3", (int)AsynchronousPipelineOrchestrator.c("f", (int)21378, (long)(0x789B212FF23DA44AL ^ l)), (long)-6454127718754523510L, (long)l) : "";
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        try {
            objectArray4[n] = object;
            super.n(abstractComputationKernel2, objectArray2);
            ++this.MA;
            if (this.M8 != null) {
                this.P(this.d().R());
                this.i(this.F());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
    }

    private void lambda$loadNewContent$1(AtomicReference atomicReference, List list, Throwable throwable) {
        block12: {
            block11: {
                try {
                    if (throwable != null) {
                        this.M9 = null;
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                try {
                    if (list == null) {
                        this.M9 = null;
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                try {
                    if (atomicReference.get() != this.M9) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                try {
                    this.r(this.MF, list);
                    this.MF.clear();
                    if (!list.isEmpty()) break block11;
                    this.M_ = true;
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
            }
            ++this.Mo;
        }
        this.M3 = true;
        this.M9 = null;
    }

    private void s(boolean bl) {
        block8: {
            block7: {
                try {
                    try {
                        this.Mo = this.MB;
                        if (this.MR == null || !this.MR.a()) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousPipelineOrchestrator.a(customSystemException);
                    }
                    this.M_ = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
            }
            this.M_ = false;
        }
        try {
            this.M3 = false;
            this.MA = 0;
            if (!bl) {
                this.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        this.X();
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void i() {
        block16: {
            try {
                if (this.M9 != null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
            GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.Z();
            try {
                if (this.M3) {
                    this.M3 = false;
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
            try {
                if (graphicalRenderEngine1082.V() == 0.0) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
            int n = this.A().size();
            int n2 = 0;
            double d2 = graphicalRenderEngine1082.W() + graphicalRenderEngine1082.b();
            for (AbstractComputationKernel abstractComputationKernel : this.A()) {
                try {
                    if (!(abstractComputationKernel.W() + abstractComputationKernel.b() / 2.0 <= d2)) break;
                    ++n2;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
            }
            int n3 = n - n2;
            try {
                try {
                    if (n3 > this.M5 || this.M_) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousPipelineOrchestrator.a(customSystemException);
                }
                this.x();
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousPipelineOrchestrator.a(customSystemException);
            }
        }
    }

    @Override
    public void k() {
        super.k();
        this.s(true);
    }

    public void I() {
        this.s(false);
        this.x();
    }

    public void r(List<AbstractComputationKernel> list, List<AbstractComputationKernel> list2) {
        double d2 = this.V();
        for (AbstractComputationKernel abstractComputationKernel : list) {
            this.J(abstractComputationKernel);
        }
        for (AbstractComputationKernel abstractComputationKernel : list2) {
            this.n(abstractComputationKernel, new Object[0]);
        }
        this.y();
        this.R(d2);
    }

    @Override
    public void E() {
        boolean bl;
        yC yC2;
        super.E();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.Z();
        try {
            this.Ma.b(this.G() + (this.w() - 18.0));
            this.Ma.M(graphicalRenderEngine1082.W() + 4.0);
            yC2 = this.Ma;
            bl = graphicalRenderEngine1082.V() < -graphicalRenderEngine1082.b();
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
        try {
            yC2.N(bl);
            if (this.Ma.f()) {
                this.Ma.E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousPipelineOrchestrator.a(customSystemException);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'W' || c == 'v' || c == '\u00d5' || c == '\u00d9') {
                field = AsynchronousPipelineOrchestrator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousPipelineOrchestrator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousPipelineOrchestrator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousPipelineOrchestrator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

