/*
 * Decompiled with CFR 0.152.
 */
package com.resource.lifecycle;

import a.wj;
import a.ws;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.math.NumericStreamProcessor;
import com.app.rendering.graphics.VisualizationRenderer;
import com.caching.management.CacheInvalidationHandler2293;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.finance.risk.FinancialRiskCalculator;
import com.network.communication.NetworkCommunicationBroker;
import com.reflection.metadata.ClassMetadataExtractor1328;
import com.security.async.AsynchronousCipherManager;
import com.security.network.SecureChannelNegotiator;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.MultiParameterConfigurator;
import com.transaction.logging.TransactionLogOrchestrator;
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
public class ResourceLifecycleOrchestrator
extends CipherSessionManager {
    private NumericStreamProcessor Em;
    private static final long[] eb;
    private static final long ab;
    private static final Object[] qb;
    private static final Integer[] fb;
    private ClassMetadataExtractor1328 EB;
    private static final String[] rb;
    private static final Map lb;
    private ClassMetadataExtractor1328 En;
    private ClassMetadataExtractor1328 EC;
    private NumericStreamProcessor Ef;
    private ClassMetadataExtractor1328 Ey;
    private ClassMetadataExtractor1328 EX;
    private int Ee;
    private ClassMetadataExtractor1328 Et;

    private static Field o(long l, long l2) {
        int n = ResourceLifecycleOrchestrator.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceLifecycleOrchestrator.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceLifecycleOrchestrator.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceLifecycleOrchestrator.g(clazz3, string2, clazz2)) != null) {
                    ResourceLifecycleOrchestrator.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceLifecycleOrchestrator.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceLifecycleOrchestrator.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceLifecycleOrchestrator.n(227480931643386L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void i() {
        TransactionLogOrchestrator transactionLogOrchestrator;
        block21: {
            block20: {
                long l = ab ^ 0x604AB1B1FADBL;
                transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
                try {
                    if (transactionLogOrchestrator == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleOrchestrator.a(customSystemException);
                }
                try {
                    if (this.Ee == 1) {
                        this.Ee = (int)ResourceLifecycleOrchestrator.d("x", (int)32535, (long)(0x772BDEF4E724E970L ^ l));
                        this.Em.c();
                        this.Ef.c();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleOrchestrator.a(customSystemException);
                }
                try {
                    if (this.Ee == 3) {
                        this.Ee = (int)ResourceLifecycleOrchestrator.d("x", (int)28690, (long)(0x28C3FAFB63B0E67DL ^ l));
                        this.Em.c();
                        this.Ef.c();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleOrchestrator.a(customSystemException);
                }
                try {
                    try {
                        if (this.Ee != 4 || this.Em.t().doubleValue() != this.Em.n()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceLifecycleOrchestrator.a(customSystemException);
                    }
                    this.Ee = 0;
                    this.N(false);
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleOrchestrator.a(customSystemException);
                }
            }
            try {
                if (this.Ef.t().doubleValue() != this.Ef.p()) {
                    this.B(true);
                    this.W(new MetricsCalculationEngine(transactionLogOrchestrator.G(), transactionLogOrchestrator.W(), transactionLogOrchestrator.w(), transactionLogOrchestrator.b()));
                    this.b(transactionLogOrchestrator.G());
                    this.M(transactionLogOrchestrator.W() + transactionLogOrchestrator.b() - 2.0 - this.b() * this.Ef.t());
                    this.A();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceLifecycleOrchestrator.a(customSystemException);
            }
            try {
                try {
                    if (this.G() == transactionLogOrchestrator.G() && this.W() == transactionLogOrchestrator.W()) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleOrchestrator.a(customSystemException);
                }
                this.m(transactionLogOrchestrator.G(), transactionLogOrchestrator.W() + transactionLogOrchestrator.b() - 2.0 - this.b() * this.Ef.t());
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceLifecycleOrchestrator.a(customSystemException);
            }
        }
        this.M(transactionLogOrchestrator.W() + transactionLogOrchestrator.b() - 2.0 - this.b() * this.Ef.t());
        ConfigurationManager.S(transactionLogOrchestrator.G(), transactionLogOrchestrator.W(), transactionLogOrchestrator.w(), transactionLogOrchestrator.b(), new Color(0, 0, 0, this.Em.t().intValue()));
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 53;
                break;
            }
            case 1: {
                n3 = 48;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 18;
                break;
            }
            case 4: {
                n3 = 28;
                break;
            }
            case 5: {
                n3 = 27;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 49;
                break;
            }
            case 8: {
                n3 = 50;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 60;
                break;
            }
            case 15: {
                n3 = 24;
                break;
            }
            case 16: {
                n3 = 17;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 19;
                break;
            }
            case 21: {
                n3 = 39;
                break;
            }
            case 22: {
                n3 = 37;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 26;
                break;
            }
            case 25: {
                n3 = 16;
                break;
            }
            case 26: {
                n3 = 6;
                break;
            }
            case 27: {
                n3 = 25;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 31;
                break;
            }
            case 30: {
                n3 = 21;
                break;
            }
            case 31: {
                n3 = 8;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 36;
                break;
            }
            case 34: {
                n3 = 9;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 5;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 42;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 12;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 13;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 4;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 41;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 62;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 40;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 63;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 0;
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
        ResourceLifecycleOrchestrator.rb[n4] = new String(cArray);
        return n4;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method p(long l, long l2) {
        int n = ResourceLifecycleOrchestrator.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceLifecycleOrchestrator.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceLifecycleOrchestrator.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceLifecycleOrchestrator.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceLifecycleOrchestrator.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceLifecycleOrchestrator.n(227480931643386L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceLifecycleOrchestrator.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceLifecycleOrchestrator.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceLifecycleOrchestrator.n(227480931643386L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public ClassMetadataExtractor1328 E() {
        return this.EB;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceLifecycleOrchestrator.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "bU\u0014";
        objectArray[1] = Integer.TYPE;
        ResourceLifecycleOrchestrator.rb[1] = "java/lang/Integer";
        objectArray[2] = "0\u001e1d&F;\u0011 +[^(\u0016)b";
        objectArray[3] = "2%J\u001bu\u001a9*[T\u0014\u00142!_\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "n)rI{4,%6'n5^->H?+fw0\u0018fNgkeK{<ajt_\u0005";
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceLifecycleOrchestrator.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceLifecycleOrchestrator.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public ClassMetadataExtractor1328 d() {
        return this.EC;
    }

    @Override
    public String A() {
        long l = ab ^ 0x5683223F98B7L;
        return ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)28230, (long)(0x2833005A8BF81A40L ^ l)), (long)4868456149972945993L, (long)l);
    }

    public ResourceLifecycleOrchestrator() {
        long l = ab ^ 0xACB4C9F6023L;
        this.Em = new NumericStreamProcessor(0.15, 0.0, 100.0);
        this.Ef = new NumericStreamProcessor(0.15, 0.0, 1.0);
        this.EB = new ClassMetadataExtractor1328((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)28783, (long)(0x2ACD523D7F94FCE4L ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)24435, (long)(0xAE6C16B5FC0D3E5L ^ l)), (long)-4970734450031397667L, (long)l)), 0.9, 6);
        this.Ey = new ClassMetadataExtractor1328((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)20076, (long)(0xC9500AC7243C2FCL ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)31345, (long)(0x4B76D8184F6276E2L ^ l)), (long)-4970734450031397667L, (long)l)), 0.9, 7);
        this.EC = new ClassMetadataExtractor1328((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)14692, (long)(0x5A6889330A14B5FEL ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)4694, (long)(0x6492C353877B9EDEL ^ l)), (long)-4970734450031397667L, (long)l)), 0.9, 7);
        this.En = new ClassMetadataExtractor1328((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)6708, (long)(0x2DB5D2664DBA96A0L ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)7832, (long)(0x4A112AAC05319204L ^ l)), (long)-4970734450031397667L, (long)l)), 0.9, 7);
        this.Et = new ClassMetadataExtractor1328((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)30110, (long)(0x1DA0953C7B1FF907L ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)499, (long)(0x6D6537995F468D6BL ^ l)), (long)-4970734450031397667L, (long)l)), 0.9, 7);
        this.EX = new ClassMetadataExtractor1328((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)4729, (long)(0x1774A57BD9EB1EE7L ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)10116, (long)(0x3B770B38F6372B0EL ^ l)), (long)-4970734450031397667L, (long)l)), 0.9, 7);
        this.Ol = false;
        this.B(false);
        this.Q(ResourceLifecycleOrchestrator.M.W);
        this.d().m(false);
        this.d().f((String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)22481, (long)(0x71756438787ADB4CL ^ l)), (long)-4970734450031397667L, (long)l)));
        MultiParameterConfigurator multiParameterConfigurator = new MultiParameterConfigurator(this, (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)7848, (long)(0x6A5DA93149F1239L ^ l)), (long)-4970734450031397667L, (long)l)), (String)((Object)ResourceLifecycleOrchestrator.e("\u00eb", (int)ResourceLifecycleOrchestrator.d("x", (int)14859, (long)(0x797FD867428DB69EL ^ l)), (long)-4970734450031397667L, (long)l)), 0.7);
        multiParameterConfigurator.t().y();
        multiParameterConfigurator.t().N(new CacheInvalidationHandler2293(this));
        this.EB.E(wj.class);
        this.Ey.E(ws.class);
        this.EC.E(FinancialRiskCalculator.class);
        this.En.E(SecureChannelNegotiator.class);
        this.Et.E(AsynchronousCipherManager.class);
        this.EX.E(NetworkCommunicationBroker.class);
        this.a(multiParameterConfigurator);
        this.n(new VisualizationRenderer(ResourceLifecycleOrchestrator.M.S), new Object[0]);
        this.o(this.EB, this.Ey, this.EC, this.En, this.Et, this.EX);
        this.N(false);
        this.B(false, false);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void w(int n) {
        this.Ee = n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceLifecycleOrchestrator.ab = MultiContainerRegistry.a(1524833145600909104L, 6078446324050547424L, MethodHandles.lookup().lookupClass()).a(14781759980808L);
                ResourceLifecycleOrchestrator.qb = new Object[5];
                ResourceLifecycleOrchestrator.rb = new String[5];
                ResourceLifecycleOrchestrator.T();
                ResourceLifecycleOrchestrator.lb = new HashMap<K, V>(13);
                var0 = ResourceLifecycleOrchestrator.ab ^ 113369387887716L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "T&\u00ef\u00f0\rNUMZ\u00fe\u00ee\u00a1\u00ec\u0003\u00b1\u008e\u00b7\u00bc\u0095\u00ad\u00d5o\u00dcX\u00ba\u00ca\u0089\u000bb\u0011\u00cbd\u00b6\u0092$\u0088\fN\b\u00c8+>\u00c1Vh\u00c25\u0012^\u0097\u00c8P\u00da\u008f\u00900$\u0002\u00d1\u009e\u00d7\u00cc\u0097\u00a2\u00a7\u000f\u00fe\u008dq\u00d5R\u0088S\u0083\u00b8\u00a1\u0094\u00e8f\u00eaj#\u00bd\u008d*\u0011N\u00d8O\u009f\u00f7i~\u0084\u0089\u001b\u008b,\u00ed\u00bdI\u00f3\u00e9\u0003\u0004!\u00bfa}6s${\u00ef\r\u00c4\u0095\u0006\u009c\u00f05\u0089\u0089\u00ee\u00c3J=q\u00a2Xcmn\u00b4\u009b\u00b6";
                var7_6 = "T&\u00ef\u00f0\rNUMZ\u00fe\u00ee\u00a1\u00ec\u0003\u00b1\u008e\u00b7\u00bc\u0095\u00ad\u00d5o\u00dcX\u00ba\u00ca\u0089\u000bb\u0011\u00cbd\u00b6\u0092$\u0088\fN\b\u00c8+>\u00c1Vh\u00c25\u0012^\u0097\u00c8P\u00da\u008f\u00900$\u0002\u00d1\u009e\u00d7\u00cc\u0097\u00a2\u00a7\u000f\u00fe\u008dq\u00d5R\u0088S\u0083\u00b8\u00a1\u0094\u00e8f\u00eaj#\u00bd\u008d*\u0011N\u00d8O\u009f\u00f7i~\u0084\u0089\u001b\u008b,\u00ed\u00bdI\u00f3\u00e9\u0003\u0004!\u00bfa}6s${\u00ef\r\u00c4\u0095\u0006\u009c\u00f05\u0089\u0089\u00ee\u00c3J=q\u00a2Xcmn\u00b4\u009b\u00b6".length();
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
                    var6_5 = "\u0016\u0012\b\u00c8\u00e4.kr\u00c0E\u0091\u001b}U!\u00ad";
                    var7_6 = "\u0016\u0012\b\u00c8\u00e4.kr\u00c0E\u0091\u001b}U!\u00ad".length();
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
        ResourceLifecycleOrchestrator.eb = var8_3;
        ResourceLifecycleOrchestrator.fb = new Integer[19];
    }

    @Override
    public void a() {
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ResourceLifecycleOrchestrator.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceLifecycleOrchestrator.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        long l = ab ^ 0x172ED674C2AEL;
        try {
            if (!this.s()) {
                this.Ee = (int)ResourceLifecycleOrchestrator.d("x", (int)24062, (long)(0x484766E6E09FF3E8L ^ l));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceLifecycleOrchestrator.a(customSystemException);
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00b5' || c == '\u00f3' || c == '\u00e9' || c == 'E') {
                field = ResourceLifecycleOrchestrator.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00b5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceLifecycleOrchestrator.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x379F;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/f7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceLifecycleOrchestrator.fb[n2] = n3;
        }
        return fb[n2];
    }

    public ClassMetadataExtractor1328 a() {
        return this.EX;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceLifecycleOrchestrator.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void u() {
    }

    @Override
    public ClassMetadataExtractor1328 F() {
        return this.Ey;
    }

    public int D() {
        return this.Ee;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceLifecycleOrchestrator.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceLifecycleOrchestrator.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static int J(ResourceLifecycleOrchestrator resourceLifecycleOrchestrator, int n) {
        resourceLifecycleOrchestrator.Ee = n;
        return resourceLifecycleOrchestrator.Ee;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceLifecycleOrchestrator.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceLifecycleOrchestrator.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

