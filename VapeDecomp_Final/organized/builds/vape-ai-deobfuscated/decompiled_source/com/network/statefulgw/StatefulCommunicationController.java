/*
 * Decompiled with CFR 0.152.
 */
package com.network.statefulgw;

import a.KB;
import com.app.events.GenericEventDispatcher2175;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.entity.event.EntityEventMediator;
import com.event.management.EventBroadcastCoordinator;
import com.exception.system.CustomSystemException;
import com.indexing.metadata.MetadataIndexingService;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.system.configuration.ConfigurationCalibrator;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.input.UserInputEventMapper;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StatefulCommunicationController
extends GenericEventDispatcher2175 {
    private static final long d = MultiContainerRegistry.a(-4351710469473150043L, 6530752204443501072L, MethodHandles.lookup().lookupClass()).a(214977463971686L);
    private static final Object[] e = new Object[5];
    private static final String[] h = new String[5];
    private long N;
    private boolean z = false;
    private boolean P;

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = StatefulCommunicationController.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StatefulCommunicationController.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == 'j' || c == 'B' || c == '\u00d6') {
                field = StatefulCommunicationController.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StatefulCommunicationController.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @DataExchangeProtocol2090
    public void B(EntityEventMediator entityEventMediator) {
        try {
            if (!((MetadataIndexingService)this.n()).n()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StatefulCommunicationController.a(customSystemException);
        }
        try {
            this.N = System.currentTimeMillis();
            if (entityEventMediator.getEntity().M().equals(ApplicationLifecycleManager.U().M())) {
                EventBroadcastCoordinator.W.execute(this::lambda$onDamaged$0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StatefulCommunicationController.a(customSystemException);
        }
    }

    static {
        StatefulCommunicationController.a();
    }

    public void d(boolean bl) {
        block5: {
            block4: {
                long l = d ^ 0x317D8FBC3955L;
                int[] nArray = ConnectionLifecycleHandler.W();
                try {
                    StatefulCommunicationController statefulCommunicationController;
                    try {
                        statefulCommunicationController = this;
                        if (nArray == null) break block4;
                        if (statefulCommunicationController.z == bl) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StatefulCommunicationController.a(customSystemException);
                    }
                    this.z = bl;
                    this.N = 0L;
                    statefulCommunicationController = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw StatefulCommunicationController.a(customSystemException);
                }
            }
            statefulCommunicationController.P = false;
            ApplicationLifecycleManager.N().D().p(bl);
        }
    }

    private static Field c(long l, long l2) {
        int n = StatefulCommunicationController.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = StatefulCommunicationController.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StatefulCommunicationController.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StatefulCommunicationController.a(clazz3, string2, clazz2)) != null) {
                    StatefulCommunicationController.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StatefulCommunicationController.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StatefulCommunicationController.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StatefulCommunicationController.b(267743042943938L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 29;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 49;
                break;
            }
            case 3: {
                n3 = 53;
                break;
            }
            case 4: {
                n3 = 30;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 60;
                break;
            }
            case 8: {
                n3 = 15;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 40;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 6;
                break;
            }
            case 15: {
                n3 = 23;
                break;
            }
            case 16: {
                n3 = 56;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 8;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 31;
                break;
            }
            case 23: {
                n3 = 58;
                break;
            }
            case 24: {
                n3 = 51;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 48;
                break;
            }
            case 27: {
                n3 = 18;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 52;
                break;
            }
            case 31: {
                n3 = 22;
                break;
            }
            case 32: {
                n3 = 63;
                break;
            }
            case 33: {
                n3 = 44;
                break;
            }
            case 34: {
                n3 = 5;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 35;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 57;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 62;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 55;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 0;
                break;
            }
            case 50: {
                n3 = 3;
                break;
            }
            case 51: {
                n3 = 38;
                break;
            }
            case 52: {
                n3 = 34;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 32;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 1;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 11;
                break;
            }
            default: {
                n3 = 7;
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
        StatefulCommunicationController.h[n4] = new String(cArray);
        return n4;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StatefulCommunicationController.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090
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
                                                                                            var2_2 = StatefulCommunicationController.d ^ 112028814342479L;
                                                                                            var4_3 = ConnectionLifecycleHandler.W();
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = ApplicationLifecycleManager.U().Y();
                                                                                                    if (var4_3 == null) break block60;
                                                                                                    if (v0) break block61;
                                                                                                }
                                                                                                catch (CustomSystemException v1) {
                                                                                                    throw StatefulCommunicationController.a(v1);
                                                                                                }
                                                                                                v0 = ((MetadataIndexingService)this.n()).n();
                                                                                            }
                                                                                            catch (CustomSystemException v2) {
                                                                                                throw StatefulCommunicationController.a(v2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (var4_3 == null) break block62;
                                                                                            if (v0) break block63;
                                                                                        }
                                                                                        catch (CustomSystemException v3) {
                                                                                            throw StatefulCommunicationController.a(v3);
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                v0 = ApplicationLifecycleManager.X().r();
                                                                            }
                                                                            if (v0) {
                                                                                return;
                                                                            }
                                                                            var5_4 = ((MetadataIndexingService)this.n()).T();
                                                                            try {
                                                                                try {
                                                                                    v4 = var1_1.getThePlayer().b();
                                                                                    if (var4_3 == null) break block64;
                                                                                    if (v4 <= ResourceAllocationTracker401.H.C() + 1) break block65;
                                                                                }
                                                                                catch (CustomSystemException v5) {
                                                                                    throw StatefulCommunicationController.a(v5);
                                                                                }
                                                                                v4 = 1;
                                                                                break block64;
                                                                            }
                                                                            catch (CustomSystemException v6) {
                                                                                throw StatefulCommunicationController.a(v6);
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
                                                                        catch (CustomSystemException v8) {
                                                                            throw StatefulCommunicationController.a(v8);
                                                                        }
                                                                        cfr_temp_1 = System.currentTimeMillis() - this.N;
                                                                        v7 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                    }
                                                                    catch (CustomSystemException v9) {
                                                                        throw StatefulCommunicationController.a(v9);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var4_3 == null) break block68;
                                                                    if (v7 < 0) break block67;
                                                                }
                                                                catch (CustomSystemException v10) {
                                                                    throw StatefulCommunicationController.a(v10);
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
                                                                catch (CustomSystemException v11) {
                                                                    throw StatefulCommunicationController.a(v11);
                                                                }
                                                                v12 = var6_5;
                                                                if (var4_3 == null) break block70;
                                                            }
                                                            catch (CustomSystemException v13) {
                                                                throw StatefulCommunicationController.a(v13);
                                                            }
                                                            if (v12 == 0) {
                                                            }
                                                            ** GOTO lbl101
                                                        }
                                                        catch (CustomSystemException v14) {
                                                            throw StatefulCommunicationController.a(v14);
                                                        }
                                                        v12 = (int)var7_6;
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_3 == null) break block71;
                                                            if (v12 == 0) break block72;
                                                        }
                                                        catch (CustomSystemException v15) {
                                                            throw StatefulCommunicationController.a(v15);
                                                        }
lbl101:
                                                        // 3 sources

                                                        StatefulCommunicationController.a("\u00f5", (Object)this, (boolean)false, (long)4865407897643895275L, (long)var2_2);
                                                    }
                                                    catch (CustomSystemException v16) {
                                                        throw StatefulCommunicationController.a(v16);
                                                    }
                                                }
                                                return;
                                            }
                                            v12 = (int)((MetadataIndexingService)this.n()).G();
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var4_3 == null) break block73;
                                                    if (v12 == 0) break block74;
                                                }
                                                catch (CustomSystemException v17) {
                                                    throw StatefulCommunicationController.a(v17);
                                                }
                                                v12 = (int)DynamicContextBroker.H();
                                                if (var4_3 == null) break block73;
                                            }
                                            catch (CustomSystemException v18) {
                                                throw StatefulCommunicationController.a(v18);
                                            }
                                            if (v12 != 0) break block74;
                                        }
                                        catch (CustomSystemException v19) {
                                            throw StatefulCommunicationController.a(v19);
                                        }
                                        return;
                                    }
                                    v12 = var1_1.getThePlayer().b();
                                }
                                var8_7 = v12;
                                var9_8 = ResourceAllocationTracker401.H.C() + 2;
                                try {
                                    try {
                                        v20 = var5_4.b();
                                        if (var4_3 == null) break block75;
                                        if (v20 > var9_8 + 2) break block76;
                                    }
                                    catch (CustomSystemException v21) {
                                        throw StatefulCommunicationController.a(v21);
                                    }
                                    v20 = 1;
                                    break block75;
                                }
                                catch (CustomSystemException v22) {
                                    throw StatefulCommunicationController.a(v22);
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
                                                catch (CustomSystemException v24) {
                                                    throw StatefulCommunicationController.a(v24);
                                                }
                                                v23 = this.P;
                                                if (var4_3 == null) break block77;
                                            }
                                            catch (CustomSystemException v25) {
                                                throw StatefulCommunicationController.a(v25);
                                            }
                                            if (v23 == 0) break block78;
                                        }
                                        catch (CustomSystemException v26) {
                                            throw StatefulCommunicationController.a(v26);
                                        }
                                        v23 = var10_9;
                                        if (var4_3 == null) break block77;
                                    }
                                    catch (CustomSystemException v27) {
                                        throw StatefulCommunicationController.a(v27);
                                    }
                                    if (v23 != 0) break block79;
                                }
                                catch (CustomSystemException v28) {
                                    throw StatefulCommunicationController.a(v28);
                                }
                            }
                            v23 = this.z;
                        }
                        catch (CustomSystemException v29) {
                            throw StatefulCommunicationController.a(v29);
                        }
                    }
                    try {
                        if (var4_3 == null) break block80;
                        if (v23 != 0) break block79;
                    }
                    catch (CustomSystemException v30) {
                        throw StatefulCommunicationController.a(v30);
                    }
                    v23 = var8_7;
                }
                try {
                    try {
                        if (var4_3 == null) break block81;
                        if (v23 > var9_8 + 1) break block79;
                    }
                    catch (CustomSystemException v31) {
                        throw StatefulCommunicationController.a(v31);
                    }
                    v23 = var8_7;
                }
                catch (CustomSystemException v32) {
                    throw StatefulCommunicationController.a(v32);
                }
            }
            try {
                if (v23 > 0) {
                    StatefulCommunicationController.a("\u00f5", (Object)this, (boolean)true, (long)4865407897643895275L, (long)var2_2);
                    this.P = true;
                    this.N = System.currentTimeMillis() + 50L * (long)var9_8;
                }
            }
            catch (CustomSystemException v33) {
                throw StatefulCommunicationController.a(v33);
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StatefulCommunicationController.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                StatefulCommunicationController.e[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StatefulCommunicationController.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StatefulCommunicationController.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = StatefulCommunicationController.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = StatefulCommunicationController.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StatefulCommunicationController.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StatefulCommunicationController.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        StatefulCommunicationController.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StatefulCommunicationController.b(267743042943938L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StatefulCommunicationController.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StatefulCommunicationController.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StatefulCommunicationController.b(267743042943938L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "k\u007fyx";
        objectArray[1] = Boolean.TYPE;
        StatefulCommunicationController.h[1] = "java/lang/Boolean";
        objectArray[2] = Void.TYPE;
        StatefulCommunicationController.h[2] = "java/lang/Void";
        objectArray[3] = "\u0005J0:X-\u000eE!u9#\u0005N%/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">R\u001dH\u0013\u000bm\u0013C-\u00076%D\u001c_\u0015GlX\u0018-RYmP\u0010\u0016S\r.Oy";
    }

    public StatefulCommunicationController(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    @DataExchangeProtocol2090
    public void h(UserInputEventMapper userInputEventMapper) {
        int[] nArray;
        block57: {
            boolean bl;
            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
            long l;
            block60: {
                block59: {
                    int n;
                    block58: {
                        block56: {
                            int n2;
                            block53: {
                                block55: {
                                    int n3;
                                    block54: {
                                        block51: {
                                            block52: {
                                                block50: {
                                                    block49: {
                                                        l = d ^ 0x34B3924E1CBL;
                                                        n3 = -100 + userInputEventMapper.getButton();
                                                        nArray = ConnectionLifecycleHandler.W();
                                                        try {
                                                            try {
                                                                n = userInputEventMapper.getButtonState();
                                                                if (nArray == null) break block49;
                                                                if (n == 0) break block50;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw StatefulCommunicationController.a(customSystemException);
                                                            }
                                                            n = ((MetadataIndexingService)this.n()).n() ? 1 : 0;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw StatefulCommunicationController.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        if (nArray == null) break block51;
                                                        if (n != 0) break block52;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw StatefulCommunicationController.a(customSystemException);
                                                    }
                                                }
                                                return;
                                            }
                                            n = n3;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                n2 = ApplicationLifecycleManager.N().D().t();
                                                                if (nArray == null) break block53;
                                                                if (n != n2) break block54;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw StatefulCommunicationController.a(customSystemException);
                                                            }
                                                            n = ((MetadataIndexingService)this.n()).G() ? 1 : 0;
                                                            if (nArray == null) break block55;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw StatefulCommunicationController.a(customSystemException);
                                                        }
                                                        if (n == 0) break block54;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw StatefulCommunicationController.a(customSystemException);
                                                    }
                                                    n = DynamicContextBroker.e() ? 1 : 0;
                                                    if (nArray == null) break block55;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw StatefulCommunicationController.a(customSystemException);
                                                }
                                                if (n == 0) break block54;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StatefulCommunicationController.a(customSystemException);
                                            }
                                            userInputEventMapper.setCanceled(true);
                                            return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StatefulCommunicationController.a(customSystemException);
                                        }
                                    }
                                    n = n3;
                                }
                                try {
                                    if (nArray == null) break block56;
                                    n2 = ApplicationLifecycleManager.N().G().t();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StatefulCommunicationController.a(customSystemException);
                                }
                            }
                            try {
                                if (n != n2) break block57;
                                n = ((MetadataIndexingService)this.n()).G() ? 1 : 0;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StatefulCommunicationController.a(customSystemException);
                            }
                        }
                        try {
                            if (nArray == null) break block58;
                            if (n == 0) break block59;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StatefulCommunicationController.a(customSystemException);
                        }
                        n = DynamicContextBroker.H() ? 1 : 0;
                    }
                    if (n == 0) {
                        return;
                    }
                }
                networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
                try {
                    try {
                        bl = networkPacketInterceptor1107.r();
                        if (nArray == null) break block60;
                        if (!bl) break block57;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StatefulCommunicationController.a(customSystemException);
                    }
                    bl = networkPacketInterceptor1107.l().B(ReflectionMetadataResolver.Ut);
                }
                catch (CustomSystemException customSystemException) {
                    throw StatefulCommunicationController.a(customSystemException);
                }
            }
            if (bl) {
                int n;
                block64: {
                    int n3;
                    int n4;
                    block63: {
                        int n6;
                        block62: {
                            block61: {
                                TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(networkPacketInterceptor1107.l());
                                n6 = transactionOrchestrator1017.b();
                                n = ResourceAllocationTracker401.H.C() + 1;
                                try {
                                    try {
                                        n4 = this.z;
                                        if (nArray == null) break block61;
                                        if (n4 != 0) break block57;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw StatefulCommunicationController.a(customSystemException);
                                    }
                                    n4 = userInputEventMapper.getThePlayer().w();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StatefulCommunicationController.a(customSystemException);
                                }
                            }
                            try {
                                if (nArray == null) break block62;
                                if (n4 != 0) break block57;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StatefulCommunicationController.a(customSystemException);
                            }
                            n4 = n6;
                        }
                        try {
                            try {
                                n3 = n + 1;
                                if (nArray == null) break block63;
                                if (n4 > n3) break block57;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StatefulCommunicationController.a(customSystemException);
                            }
                            int n3 = n6;
                            n3 = n;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StatefulCommunicationController.a(customSystemException);
                        }
                    }
                    try {
                        StatefulCommunicationController statefulCommunicationController;
                        try {
                            try {
                                if (n4 > n3) break block57;
                                statefulCommunicationController = this;
                                if (nArray == null) break block64;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StatefulCommunicationController.a(customSystemException);
                            }
                            if (((MetadataIndexingService)statefulCommunicationController.n()).T() == null) break block57;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StatefulCommunicationController.a(customSystemException);
                        }
                        StatefulCommunicationController.a("\u00f5", (Object)this, (boolean)true, (long)6557522656830935407L, (long)l);
                        statefulCommunicationController = this;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StatefulCommunicationController.a(customSystemException);
                    }
                }
                statefulCommunicationController.N = System.currentTimeMillis() + 50L * (long)(n + 1);
            }
        }
        try {
            if (nArray == null) {
                AbstractComputationKernel.I(new String[4]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StatefulCommunicationController.a(customSystemException);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$onDamaged$0() {
        long l = d ^ 0x5A6770A4E3A4L;
        StatefulCommunicationController.a("\u00f5", (Object)this, (boolean)false, (long)6444186182719623936L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StatefulCommunicationController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

