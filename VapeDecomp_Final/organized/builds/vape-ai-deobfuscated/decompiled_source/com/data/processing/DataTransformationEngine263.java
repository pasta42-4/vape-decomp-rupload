/*
 * Decompiled with CFR 0.152.
 */
package com.data.processing;

import com.adapter.management.GenericAdapterManager;
import com.app.core.generics.GenericTypeResolver;
import com.app.workflow.StateTrackingCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.config.schema.ConfigurationSchemaResolver;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.data.serialization.JsonPayloadOrchestrator;
import com.data.transformation.DataTransformationDispatcher;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.network.connection.NetworkConnectionDescriptor;
import com.network.connection.NetworkConnectionEstablisher;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.security.crypto.CryptographicSecurityManager;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.cryptography.CryptographicContextManager153;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import com.util.numeric.NumericFormattingUtility;
import com.util.reflection.ReflectionUtility;
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
import java.util.StringJoiner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DataTransformationEngine263
extends AbstractComputationKernel {
    private final GenericTypeResolver<?, ?> D;
    private final CryptographicSecurityManager396 R;
    private static final long[] v;
    private final JsonPayloadOrchestrator L;
    private static final long n;
    private final CryptographicContextManager153 b;
    private static final Map E;
    private static final Integer[] B;
    private final CryptographicSecurityManager V;
    private static final Object[] F;
    private static final String[] Y;

    @Override
    public void U() {
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "LFn";
        objectArray[1] = Integer.TYPE;
        DataTransformationEngine263.Y[1] = "java/lang/Integer";
        objectArray[2] = "\u0001\u000f\u0013\u001bI/\n\u0000\u0002T47\u0019\u0007\u000b\u001d";
        objectArray[3] = "\u0001|L8-O\ns]wLA\u0001xY-";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0011*h<k\u001eP%(\f\u007f\u0018+w`js\u0000\u00174`m*c\u00123+so\n\u0011 <4\u0014";
    }

    private static Method h(long l, long l2) {
        int n = DataTransformationEngine263.e(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Y[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataTransformationEngine263.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataTransformationEngine263.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataTransformationEngine263.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataTransformationEngine263.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataTransformationEngine263.f(211396864086080L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataTransformationEngine263.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataTransformationEngine263.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataTransformationEngine263.f(211396864086080L, 0L);
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

    @Override
    public void d() {
    }

    @Override
    public double z() {
        return 15.0;
    }

    @Override
    public void G() {
        int n;
        Object[] objectArray;
        long l;
        block61: {
            block59: {
                block60: {
                    String string;
                    block58: {
                        l = DataTransformationEngine263.n ^ 0x24DAAF2B0C97L;
                        string = ((ConfigurationProfileResolver)this.D.n()).O();
                        try {
                            if (!(this.D.n() instanceof NetworkConnectionDescriptor) || ((ConfigurationProfileResolver)this.D.n()).G() == null) break block58;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationEngine263.a(customSystemException);
                        }
                        string = string + (String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)10126, (long)(0x41C70C281E325A79L ^ l)), (long)8938335468306293511L, (long)l)) + ((ConfigurationProfileResolver)this.D.n()).G().O() + (String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)8395, (long)(0x178E7071E88DDD3EL ^ l)), (long)8938335468306293511L, (long)l));
                    }
                    try {
                        try {
                            this.R.d(string);
                            if (!(this.D.n() instanceof AuthenticationStateTracker)) break block59;
                            if (!((Boolean)this.D.T()).booleanValue()) break block60;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationEngine263.a(customSystemException);
                        }
                        this.b.H((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)12232, (long)(0x14E914AFBB07D22EL ^ l)), (long)8938335468306293511L, (long)l)));
                        break block61;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationEngine263.a(customSystemException);
                    }
                }
                this.b.H((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)23184, (long)(0x56EDB4E4B7ACA76AL ^ l)), (long)8938335468306293511L, (long)l)));
                break block61;
            }
            if (this.D.n() instanceof NumericFormattingUtility) {
                objectArray = (NumericFormattingUtility)this.D.n();
                double[] dArray = (double[])this.D.T();
                this.b.H(objectArray.K().format(dArray[0]) + (String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)32661, (long)(0x2F896F83D2530263L ^ l)), (long)8938335468306293511L, (long)l)) + objectArray.K().format(dArray[1]));
            } else if (this.D.n() instanceof NumericPrecisionTransformer) {
                objectArray = (NumericPrecisionTransformer)this.D.n();
                Double d2 = (Double)this.D.T();
                this.b.H(objectArray.J().format(d2) + objectArray.I());
            } else if (this.D.n() instanceof NetworkConnectionDescriptor) {
                Object object;
                StringBuilder stringBuilder;
                CryptographicContextManager153 cryptographicContextManager153;
                objectArray = (List)this.D.T();
                int n2 = objectArray.size();
                try {
                    cryptographicContextManager153 = this.b;
                    stringBuilder = new StringBuilder().append(n2).append((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)949, (long)(0x2FC2587B2C3C7E55L ^ l)), (long)8938335468306293511L, (long)l)));
                    object = n2 == 1 ? "" : DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)28456, (long)(0x31007BCAB05B92CFL ^ l)), (long)8938335468306293511L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                cryptographicContextManager153.H(stringBuilder.append((String)object).toString());
                this.b.g(objectArray.toString());
            } else if (this.D.n() instanceof GenericAdapterManager) {
                objectArray = (NetworkConnectionEstablisher)this.D.T();
                this.b.H(objectArray.O());
            } else if (this.D.n() instanceof DataTransformationDispatcher) {
                Object object;
                StringBuilder stringBuilder;
                CryptographicContextManager153 cryptographicContextManager153;
                objectArray = (List)this.D.T();
                int n3 = objectArray.size();
                try {
                    cryptographicContextManager153 = this.b;
                    stringBuilder = new StringBuilder().append(n3).append((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)10088, (long)(0x30222B6B98A9DA80L ^ l)), (long)8938335468306293511L, (long)l)));
                    object = n3 == 1 ? "" : DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)9768, (long)(0x6EE8AAE5E2A45BD4L ^ l)), (long)8938335468306293511L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                cryptographicContextManager153.H(stringBuilder.append((String)object).toString());
            } else if (this.D.n() instanceof ConfigurationSchemaResolver) {
                Object object;
                StringBuilder stringBuilder;
                CryptographicContextManager153 cryptographicContextManager153;
                objectArray = (Map)this.D.T();
                int n4 = objectArray.size();
                try {
                    cryptographicContextManager153 = this.b;
                    stringBuilder = new StringBuilder().append(n4).append((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)13211, (long)(0x38F45AE00C5CE77L ^ l)), (long)8938335468306293511L, (long)l)));
                    object = n4 == 1 ? "" : DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)26553, (long)(0x1606923CBDB1A53L ^ l)), (long)8938335468306293511L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                cryptographicContextManager153.H(stringBuilder.append((String)object).toString());
            } else if (this.D.n() instanceof ReflectionUtility) {
                Object object;
                StringBuilder stringBuilder;
                CryptographicContextManager153 cryptographicContextManager153;
                this.R.d((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)24785, (long)(0x6F24E3408AC99D33L ^ l)), (long)8938335468306293511L, (long)l)));
                objectArray = (Boolean[])this.D.T();
                ReflectionUtility reflectionUtility = (ReflectionUtility)this.D.n();
                boolean bl = objectArray[reflectionUtility.S().indexOf(reflectionUtility.c())];
                boolean bl2 = objectArray[reflectionUtility.S().indexOf(reflectionUtility.J())];
                n = objectArray[reflectionUtility.S().indexOf(reflectionUtility.G())].booleanValue();
                boolean bl3 = objectArray[reflectionUtility.S().indexOf(reflectionUtility.q())];
                boolean bl4 = objectArray[reflectionUtility.S().indexOf(reflectionUtility.z())];
                boolean bl5 = objectArray[reflectionUtility.S().indexOf(reflectionUtility.u())];
                boolean bl6 = (Boolean)objectArray[reflectionUtility.S().indexOf(reflectionUtility.t())];
                int n5 = 0;
                for (Object object2 : objectArray) {
                    try {
                        if (!((Boolean)object2).booleanValue()) continue;
                        ++n5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationEngine263.a(customSystemException);
                    }
                }
                try {
                    cryptographicContextManager153 = this.b;
                    stringBuilder = new StringBuilder().append(n5).append((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)1634, (long)(0x20792DCA95167B96L ^ l)), (long)8938335468306293511L, (long)l)));
                    object = n5 == 1 ? "" : DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)9550, (long)(0xAAB67D09A3D8B5L ^ l)), (long)8938335468306293511L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                cryptographicContextManager153.H(stringBuilder.append((String)object).toString());
                StringJoiner stringJoiner = new StringJoiner((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)20739, (long)(0x62C8EA9467612CF1L ^ l)), (long)8938335468306293511L, (long)l)));
                try {
                    stringJoiner.setEmptyValue((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)32145, (long)(0x444A7A7CFD88006FL ^ l)), (long)8938335468306293511L, (long)l)));
                    if (bl) {
                        stringJoiner.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)26504, (long)(0x2B976BE134FD1A63L ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                try {
                    if (bl2) {
                        stringJoiner.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)19399, (long)(0x49DA88AE81323622L ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                try {
                    if (n != 0) {
                        stringJoiner.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)1375, (long)(0x4AC4AA504AF1F8AEL ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                try {
                    if (bl3) {
                        stringJoiner.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)30423, (long)(0x73E6F8FAC56A0B2AL ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                StringJoiner stringJoiner2 = new StringJoiner((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)22382, (long)(0x74B866A1915DAA96L ^ l)), (long)8938335468306293511L, (long)l)));
                try {
                    stringJoiner2.setEmptyValue((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)6091, (long)(0xE1E7AA211226A24L ^ l)), (long)8938335468306293511L, (long)l)));
                    if (bl4) {
                        stringJoiner2.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)8402, (long)(0x5A8DA98B3159DD22L ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                try {
                    if (bl5) {
                        stringJoiner2.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)32188, (long)(0x5D6312DA1FAE004FL ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                try {
                    if (bl6) {
                        stringJoiner2.add((CharSequence)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)28441, (long)(0x15F83B6894CB92FAL ^ l)), (long)8938335468306293511L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                this.b.g((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)24238, (long)(0x4362A9451310A340L ^ l)), (long)8938335468306293511L, (long)l)) + stringJoiner + (String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)9594, (long)(0x5DFD1B8CE58FD897L ^ l)), (long)8938335468306293511L, (long)l)) + stringJoiner2);
            } else {
                Object object;
                CryptographicContextManager153 cryptographicContextManager153;
                block62: {
                    try {
                        if (!(this.D.n() instanceof AdaptiveRenderingEngine)) break block62;
                        this.b.H((String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)6097, (long)(0x3DED2B3B9FE16A30L ^ l)), (long)8938335468306293511L, (long)l)));
                        this.b.T(10.0);
                        this.b.w(10.0);
                        break block61;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationEngine263.a(customSystemException);
                    }
                }
                try {
                    cryptographicContextManager153 = this.b;
                    object = this.D.n() != null ? this.D.n().toString() : DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)4408, (long)(0x3A3197D28BF36CC1L ^ l)), (long)8938335468306293511L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationEngine263.a(customSystemException);
                }
                cryptographicContextManager153.H((String)object);
            }
        }
        double d3 = this.G();
        this.getClass();
        this.R.b(d3 + 5.0);
        this.R.M(this.W() + 2.0);
        this.R.Q(this.l());
        double d4 = this.w();
        this.getClass();
        this.R.a(d4 - (double)(5.0f * 2.0f) - 4.0 - this.b.w());
        this.R.e(0.75);
        double d5 = this.G() + this.w() - this.b.D();
        this.getClass();
        this.b.b(d5 - (double)(5.0f * 2.0f));
        this.b.M(this.W());
        this.b.T(this.b.D());
        this.b.q(true);
        if (this.D.n() instanceof AdaptiveRenderingEngine) {
            objectArray = (Object[])this.D.T();
            float f = ((Double)objectArray[0]).floatValue() / 255.0f;
            float f2 = ((Double)objectArray[2]).floatValue() / 255.0f;
            float f3 = ((Double)objectArray[1]).floatValue() / 255.0f;
            n = Color.HSBtoRGB(f, f2, f3);
            ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(n, 255);
            ColorCompositionEngine colorCompositionEngine2 = new ColorCompositionEngine(EventDispatchCoordinator1159.I(colorCompositionEngine, 0, 240, true));
            colorCompositionEngine2.I(150);
            this.b.B(colorCompositionEngine2);
            StateTrackingCoordinator.B(colorCompositionEngine, (float)(this.G() + this.w() - 5.0 - 6.0), (float)this.W() + 1.0f, (String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)19223, (long)(0x2774C1764DD936E8L ^ l)), (long)8938335468306293511L, (long)l)), 7.0f, 7.0f, false);
        } else {
            double d6 = this.b.G() + 3.0;
            double d7 = this.W();
            double d8 = this.b.w();
            this.getClass();
            ConfigurationManager.C(d6, d7, d8 + 5.0 - 0.5, this.b.b() - 1.0, new Color(255, 255, 255, 10), 1.0f);
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataTransformationEngine263.e(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                DataTransformationEngine263.F[n] = clazz = Class.forName(Y[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void g() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Y[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 39;
                break;
            }
            case 2: {
                n3 = 13;
                break;
            }
            case 3: {
                n3 = 34;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 6: {
                n3 = 21;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 23;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 32;
                break;
            }
            case 12: {
                n3 = 11;
                break;
            }
            case 13: {
                n3 = 2;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 9;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 44;
                break;
            }
            case 19: {
                n3 = 57;
                break;
            }
            case 20: {
                n3 = 22;
                break;
            }
            case 21: {
                n3 = 46;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 40;
                break;
            }
            case 27: {
                n3 = 41;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 14;
                break;
            }
            case 31: {
                n3 = 10;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 12;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 58;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 4;
                break;
            }
            case 38: {
                n3 = 27;
                break;
            }
            case 39: {
                n3 = 31;
                break;
            }
            case 40: {
                n3 = 63;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 53;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 3;
                break;
            }
            case 47: {
                n3 = 43;
                break;
            }
            case 48: {
                n3 = 29;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 28;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 8;
                break;
            }
            case 56: {
                n3 = 52;
                break;
            }
            case 57: {
                n3 = 47;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 19;
                break;
            }
            case 60: {
                n3 = 49;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 59;
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
        DataTransformationEngine263.Y[n4] = new String(cArray);
        return n4;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    @Override
    public double e() {
        return 80.0;
    }

    private static Field g(long l, long l2) {
        int n = DataTransformationEngine263.e(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = Y[n];
            int n2 = string.indexOf(8);
            Class clazz = DataTransformationEngine263.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataTransformationEngine263.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataTransformationEngine263.c(clazz3, string2, clazz2)) != null) {
                    DataTransformationEngine263.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataTransformationEngine263.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataTransformationEngine263.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataTransformationEngine263.f(211396864086080L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataTransformationEngine263.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataTransformationEngine263.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataTransformationEngine263.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1F1;
        if (B[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataTransformationEngine263.B[n2] = n3;
        }
        return B[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == 'w' || c == '\u00e4' || c == '\u00ed') {
                field = DataTransformationEngine263.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataTransformationEngine263.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public DataTransformationEngine263(JsonPayloadOrchestrator jsonPayloadOrchestrator, CryptographicSecurityManager cryptographicSecurityManager, GenericTypeResolver<?, ?> genericTypeResolver) {
        long l = n ^ 0x1DE7B1700A73L;
        this.L = jsonPayloadOrchestrator;
        this.V = cryptographicSecurityManager;
        this.D = genericTypeResolver;
        this.R = new CryptographicSecurityManager396(((ConfigurationProfileResolver)genericTypeResolver.n()).O(), (String)((Object)DataTransformationEngine263.c("\u00c0", (int)DataTransformationEngine263.b("k", (int)8977, (long)(0x2F73A63080E9D81CL ^ l)), (long)8858406732824634851L, (long)l)), 50.0, 0.75, DataTransformationEngine263.M.n, false, false);
        this.b = new CryptographicContextManager153("", 0.7);
        this.o(this.R, this.b);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DataTransformationEngine263.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataTransformationEngine263.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataTransformationEngine263.n = MultiContainerRegistry.a(-3872489175100215674L, -2571284405201256345L, MethodHandles.lookup().lookupClass()).a(44515059398608L);
                DataTransformationEngine263.F = new Object[5];
                DataTransformationEngine263.Y = new String[5];
                DataTransformationEngine263.a();
                DataTransformationEngine263.E = new HashMap<K, V>(13);
                var0 = DataTransformationEngine263.n ^ 75445076533452L;
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
                var8_3 = new long[31];
                var5_4 = 0;
                var6_5 = "\u00f3\n\u00b6D\u00feuP\u00d0\u00f3\u00b6Ge\u00c3\u00a4\bW9>\u00dd\u0092\u00e1\u00bb.;\\+\u00f8\u0012>\u00e6r@\u008a\u0011(\u009c\u00cd\u00c1\\\t\u00d7\u00fa\u00bd`\u00e2\u009b\u001a\u00e6[\u00e4\u0007\u00ee\u00f7\u00c1\u000f\u0005\u00c8\u0086\u009ex\u00cat\u00ba\u00c4\u00e7\n\u0087O\u008f\u00ea\u00c6\u00cd\u00d8Z\u00fb(Ie\u0011f\u00e7\u00fc\n\u00f7\u00aa\u00eakZpf\u0083d>\u00f1\u00a3I,G6\u001a\u00a3{\u00da]\u00bc0*yS\u001e\u00ad\u00a2\u00f1\u00fb[:\u00c5!5\u0099\u00e1\u00a3\u00c9\u00ce\u0095\u00d9\u009dYD\u00b2@\u00c8\u0019Z\u0006\u0085\u0090\u00d3\u00c4\u00fezV\u00e5s\u0097\u0089\u0006\u008fM\u00dc[\u00aa\u007f\u00d1P.\u009b\u00ba\u00a5`\u0080X\u0095\u001e\u0096PdRz\u00ed\u00fdj=k\u009e\u00ae\u00c3\u0013\u0006R\u008c\fb3j\u00031\u00af\u00c1\u00cf3+\u00bb\u00f7w\u000b\u00d1w\u008d\u0096\u00c0\u00c6E\u00db\u0090\u0093\u001f\u0016Y8\u0081\u009b\u0000\u0081v\u008a\u00d2\u008d\u0081!\u00f3!\u00d6\u0090\u001fq\u00a6\"\u0013\u0082\u001bP";
                var7_6 = "\u00f3\n\u00b6D\u00feuP\u00d0\u00f3\u00b6Ge\u00c3\u00a4\bW9>\u00dd\u0092\u00e1\u00bb.;\\+\u00f8\u0012>\u00e6r@\u008a\u0011(\u009c\u00cd\u00c1\\\t\u00d7\u00fa\u00bd`\u00e2\u009b\u001a\u00e6[\u00e4\u0007\u00ee\u00f7\u00c1\u000f\u0005\u00c8\u0086\u009ex\u00cat\u00ba\u00c4\u00e7\n\u0087O\u008f\u00ea\u00c6\u00cd\u00d8Z\u00fb(Ie\u0011f\u00e7\u00fc\n\u00f7\u00aa\u00eakZpf\u0083d>\u00f1\u00a3I,G6\u001a\u00a3{\u00da]\u00bc0*yS\u001e\u00ad\u00a2\u00f1\u00fb[:\u00c5!5\u0099\u00e1\u00a3\u00c9\u00ce\u0095\u00d9\u009dYD\u00b2@\u00c8\u0019Z\u0006\u0085\u0090\u00d3\u00c4\u00fezV\u00e5s\u0097\u0089\u0006\u008fM\u00dc[\u00aa\u007f\u00d1P.\u009b\u00ba\u00a5`\u0080X\u0095\u001e\u0096PdRz\u00ed\u00fdj=k\u009e\u00ae\u00c3\u0013\u0006R\u008c\fb3j\u00031\u00af\u00c1\u00cf3+\u00bb\u00f7w\u000b\u00d1w\u008d\u0096\u00c0\u00c6E\u00db\u0090\u0093\u001f\u0016Y8\u0081\u009b\u0000\u0081v\u008a\u00d2\u008d\u0081!\u00f3!\u00d6\u0090\u001fq\u00a6\"\u0013\u0082\u001bP".length();
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
                    var6_5 = "\u00a3\u00ecg\u008cl\u00ea\u0087\u00a3\u009bm\u00d7<\u001b\u00c3T\u001a";
                    var7_6 = "\u00a3\u00ecg\u008cl\u00ea\u0087\u00a3\u009bm\u00d7<\u001b\u00c3T\u001a".length();
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
        DataTransformationEngine263.v = var8_3;
        DataTransformationEngine263.B = new Integer[31];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataTransformationEngine263.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataTransformationEngine263.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataTransformationEngine263.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

