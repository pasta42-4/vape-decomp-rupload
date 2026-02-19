/*
 * Decompiled with CFR 0.152.
 */
package com.config.management;

import a.V3;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.pipeline.ObjectPipelineManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ConfigurationStateManager
extends ContextualExecutionFramework {
    private final GenericAdapterManager b;
    private final NetworkConfigManager r;
    private static final Integer[] j;
    private static final Object[] m;
    private float x;
    private static final Map l;
    private final AuthenticationStateTracker Z;
    private static final String[] n;
    private boolean L;
    private boolean w;
    private final AuthenticationGateway1860 e;
    private final AuthenticationGateway1860 Y;
    private static final long d;
    private float v;
    private float R;
    private static final long[] h;

    public void H() {
        block17: {
            block18: {
                block15: {
                    block16: {
                        try {
                            if (!this.r.m(10L)) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationStateManager.a(customSystemException);
                        }
                        try {
                            try {
                                try {
                                    this.r.m();
                                    this.v = 0.4f;
                                    if (!this.L || !(this.R < 10.0f)) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationStateManager.a(customSystemException);
                                }
                                this.R += this.v;
                                if (!(this.R >= 10.0f)) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationStateManager.a(customSystemException);
                            }
                            ApplicationLifecycleManager.N().L(10.0f);
                            this.L = false;
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationStateManager.a(customSystemException);
                        }
                    }
                    ApplicationLifecycleManager.N().L(this.R);
                }
                try {
                    try {
                        try {
                            if (!this.w || !(this.R >= this.x)) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationStateManager.a(customSystemException);
                        }
                        this.R -= this.v;
                        if (!(this.R <= this.x)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationStateManager.a(customSystemException);
                    }
                    ApplicationLifecycleManager.N().L(this.x);
                    this.w = false;
                    super.y(false, true);
                    break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationStateManager.a(customSystemException);
                }
            }
            ApplicationLifecycleManager.N().L(this.R);
        }
    }

    private void lambda$new$0(GenericAdapterManager genericAdapterManager) {
        block9: {
            block8: {
                try {
                    if (!this.Z()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationStateManager.a(customSystemException);
                }
                try {
                    if (!((NetworkConnectionEstablisher)this.b.J()).equals(this.e)) break block8;
                    ApplicationLifecycleManager.U().E(16);
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationStateManager.a(customSystemException);
                }
            }
            try {
                if (this.x != -1.0f) {
                    ApplicationLifecycleManager.N().L(this.x);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationStateManager.a(customSystemException);
            }
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        block6: {
            try {
                try {
                    try {
                        if (!((NetworkConnectionEstablisher)this.b.J()).equals(this.e) || !this.Z.s().booleanValue()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationStateManager.a(customSystemException);
                    }
                    if (!this.Z()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationStateManager.a(customSystemException);
                }
                this.w = true;
                this.L = false;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationStateManager.a(customSystemException);
            }
        }
        super.y(bl, bl2);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationStateManager.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationStateManager.m[n] = clazz = Class.forName(ConfigurationStateManager.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @DataExchangeProtocol2090
    public void K(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        try {
            if (((NetworkConnectionEstablisher)this.b.J()).equals(this.Y)) {
                ApplicationLifecycleManager.U().g(V3.H(ObjectPipelineManager.s.N(), 5220, 0));
                this.L = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationStateManager.a(customSystemException);
        }
    }

    @Override
    public void v() {
        block11: {
            block10: {
                try {
                    try {
                        if (!((NetworkConnectionEstablisher)this.b.J()).equals(this.Y)) break block10;
                        if (!ApplicationLifecycleManager.U().r()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationStateManager.a(customSystemException);
                    }
                    ApplicationLifecycleManager.U().E(ObjectPipelineManager.s.N());
                    this.w = false;
                    ApplicationLifecycleManager.N().L(this.x);
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationStateManager.a(customSystemException);
                }
            }
            try {
                if (ApplicationLifecycleManager.U().r()) {
                    ApplicationLifecycleManager.U().E(ObjectPipelineManager.s.N());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationStateManager.a(customSystemException);
            }
            try {
                if (!this.Z.s().booleanValue()) {
                    ApplicationLifecycleManager.N().L(this.x);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationStateManager.a(customSystemException);
            }
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ConfigurationStateManager.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 44;
                break;
            }
            case 2: {
                n3 = 22;
                break;
            }
            case 3: {
                n3 = 43;
                break;
            }
            case 4: {
                n3 = 16;
                break;
            }
            case 5: {
                n3 = 30;
                break;
            }
            case 6: {
                n3 = 41;
                break;
            }
            case 7: {
                n3 = 32;
                break;
            }
            case 8: {
                n3 = 18;
                break;
            }
            case 9: {
                n3 = 35;
                break;
            }
            case 10: {
                n3 = 54;
                break;
            }
            case 11: {
                n3 = 39;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 60;
                break;
            }
            case 16: {
                n3 = 55;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 45;
                break;
            }
            case 19: {
                n3 = 52;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 11;
                break;
            }
            case 24: {
                n3 = 5;
                break;
            }
            case 25: {
                n3 = 37;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 38;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 13;
                break;
            }
            case 32: {
                n3 = 47;
                break;
            }
            case 33: {
                n3 = 15;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 14;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 57;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 31;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 59;
                break;
            }
            case 49: {
                n3 = 28;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 36;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 26;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 42;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 9;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 8;
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
        ConfigurationStateManager.n[n4] = new String(cArray);
        return n4;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7BBD;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ConfigurationStateManager.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ConfigurationStateManager.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationStateManager.j[n2] = n3;
        }
        return j[n2];
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationStateManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(long l, long l2) {
        int n = ConfigurationStateManager.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = ConfigurationStateManager.n[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationStateManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationStateManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationStateManager.a(clazz3, string2, clazz2)) != null) {
                    ConfigurationStateManager.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationStateManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationStateManager.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationStateManager.b(221768111261433L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ConfigurationStateManager.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ConfigurationStateManager.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConfigurationStateManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationStateManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationStateManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationStateManager.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationStateManager.b(221768111261433L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationStateManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationStateManager.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationStateManager.b(221768111261433L, 0L);
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationStateManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationStateManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
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

    @Override
    public void h() {
        block6: {
            block5: {
                try {
                    this.x = ApplicationLifecycleManager.N().D();
                    if (this.Z.s().booleanValue()) break block5;
                    ApplicationLifecycleManager.N().L(10.0f);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationStateManager.a(customSystemException);
                }
            }
            try {
                if (!this.w) {
                    this.R = this.x;
                    this.L = true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationStateManager.a(customSystemException);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationStateManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationStateManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationStateManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ConfigurationStateManager() {
        long l = d ^ 0x7C4119F8E098L;
        super(a.cs((int)ConfigurationStateManager.a("o", (int)605, (long)(0xA97AD61D0BB7DCEL ^ l))), -256, RecursiveNodeGraph.z);
        this.Y = new AuthenticationGateway1860((String)((Object)ConfigurationStateManager.c("\u00c3", (int)ConfigurationStateManager.a("o", (int)26849, (long)(0x5EB440D93BEA9777L ^ l)), (long)-8922976489896135291L, (long)l)));
        this.e = new AuthenticationGateway1860((String)((Object)ConfigurationStateManager.c("\u00c3", (int)ConfigurationStateManager.a("o", (int)13388, (long)(0x63317F3C461A4BDBL ^ l)), (long)-8922976489896135291L, (long)l)));
        this.b = GenericAdapterManager.D(this, (String)((Object)ConfigurationStateManager.c("\u00c3", (int)ConfigurationStateManager.a("o", (int)32187, (long)(0x4FC2477871C70229L ^ l)), (long)-8922976489896135291L, (long)l)), this.Y, this.Y, this.e);
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)ConfigurationStateManager.c("\u00c3", (int)ConfigurationStateManager.a("o", (int)26161, (long)(0x81BDD65A2B019A4L ^ l)), (long)-8922976489896135291L, (long)l)), false, (String)((Object)ConfigurationStateManager.c("\u00c3", (int)ConfigurationStateManager.a("o", (int)24371, (long)(0x4FD7E783F875A0A7L ^ l)), (long)-8922976489896135291L, (long)l)));
        this.r = new NetworkConfigManager();
        this.v = 1.0f;
        this.x = -1.0f;
        this.b.l((ConfigurationProfileResolver)this.Z, this.e);
        this.N(this.b, this.Z);
        this.b.P(this::lambda$new$0);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == 'j' || c == '\u00f0' || c == '\u00f1') {
                field = ConfigurationStateManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationStateManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigurationStateManager.d = MultiContainerRegistry.a(1444504032899112939L, 8713894050430140774L, MethodHandles.lookup().lookupClass()).a(20539566186038L);
                ConfigurationStateManager.m = new Object[5];
                ConfigurationStateManager.n = new String[5];
                ConfigurationStateManager.a();
                ConfigurationStateManager.l = new HashMap<K, V>(13);
                var0 = ConfigurationStateManager.d ^ 77602555602948L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00a6\u0018 \u00f4\u00e7P\u000e\u0006\u0006\u000e\u00f9k94R\u0081z\u00cf\u0001\u00f7\u00a2\u00b8\u0000\u00bbE\u00805\u00881RA\u00bb";
                var7_6 = "\u00a6\u0018 \u00f4\u00e7P\u000e\u0006\u0006\u000e\u00f9k94R\u0081z\u00cf\u0001\u00f7\u00a2\u00b8\u0000\u00bbE\u00805\u00881RA\u00bb".length();
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
                    var6_5 = "\u000e\u00b2\u000b\u0098\u008a\"\u00b88O\u00f0\u00fd\u0083%+\u00c6\u00e3";
                    var7_6 = "\u000e\u00b2\u000b\u0098\u008a\"\u00b88O\u00f0\u00fd\u0083%+\u00c6\u00e3".length();
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
        ConfigurationStateManager.h = var8_3;
        ConfigurationStateManager.j = new Integer[6];
    }

    @DataExchangeProtocol2090
    public void K(EventTriggerEngine eventTriggerEngine) {
        try {
            if (((NetworkConnectionEstablisher)this.b.J()).equals(this.e)) {
                this.H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationStateManager.a(customSystemException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "HG2";
        objectArray[1] = Integer.TYPE;
        ConfigurationStateManager.n[1] = "java/lang/Integer";
        objectArray[2] = "ZRd*\u001b\u001eQ]uef\u0006BZ|,";
        objectArray[3] = "E~2\u0012(\u001eNq#]I\u0010Ez'\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u007f\tS_3k>\u0014\u0018$&bBHSU'zy\u0016\b\u001c2\u0019{\u0003\u0003@6x2A\u000b\u0015M";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationStateManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationStateManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

