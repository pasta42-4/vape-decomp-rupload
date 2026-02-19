/*
 * Decompiled with CFR 0.152.
 */
package com.security.reflection;

import com.app.core.configuration.ConfigurationResolver2700;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicTransformer406;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class ReflectionUtility744 {
    private static final long a = MultiContainerRegistry.a(-589572942449667148L, 4231755639918138454L, MethodHandles.lookup().lookupClass()).a(209534145372541L);
    private static final Map<Class<?>, byte[]> B;
    private static final String[] c;
    private static final Object[] b;

    public static byte[] Q(Class<?> clazz, boolean bl) {
        CallSite callSite;
        long l;
        block33: {
            Object object;
            block28: {
                l = a ^ 0xBFBCD127E7L;
                byte[] byArray = (byte[])ReflectionUtility744.a("\u00de", B, clazz, (long)6247707800947223060L, (long)l);
                try {
                    if (byArray != null) {
                        return byArray;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtility744.a(customSystemException);
                }
                callSite = ReflectionUtility744.a("\u00e6", clazz, (long)6249762725466552184L, (long)l);
                try {
                    if (callSite == null || ReflectionUtility744.a("\u00e6", (long)6248122097317437565L, (long)l)[19] == null) break block28;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtility744.a(customSystemException);
                }
                object = 0;
                object += 4;
                object += 2;
                ConfigurationResolver2700 configurationResolver2700 = new ConfigurationResolver2700();
                configurationResolver2700.t = object += 2;
                CallSite callSite2 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                for (int i = 0; i < callSite2 - true; ++i) {
                    CallSite callSite3;
                    CallSite callSite4;
                    CallSite callSite5;
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    callSite5 = ReflectionUtility744.a("\u00de", (Object)ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6249411358989709934L, (long)l), (long)6247934478788649994L, (long)l);
                                    if (callSite5 == 7) {
                                        callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                                        continue;
                                    }
                                    try {
                                        try {
                                            if (callSite5 == 9 || callSite5 == 10) break block29;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectionUtility744.a(customSystemException);
                                        }
                                        if (callSite5 != 11) break block30;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectionUtility744.a(customSystemException);
                                    }
                                }
                                callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                                callSite3 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                                continue;
                            }
                            if (callSite5 == 8) {
                                callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                                continue;
                            }
                            try {
                                if (callSite5 != 3 && callSite5 != 4) break block31;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectionUtility744.a(customSystemException);
                            }
                            callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6249462542701405888L, (long)l);
                            continue;
                        }
                        try {
                            if (callSite5 != 5 && callSite5 != 6) break block32;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtility744.a(customSystemException);
                        }
                        callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6249462542701405888L, (long)l);
                        callSite3 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6249462542701405888L, (long)l);
                        ++i;
                        if (callSite5 != 5) continue;
                        long l2 = ((long)callSite4 << 32) + (long)callSite3;
                        l2 += 14L;
                        l2 /= 3L;
                        l2 -= (long)callSite2;
                        l2 /= 7L;
                        l2 -= 7383L;
                        try {
                            if (ReflectionUtility744.a("\u00e6", (long)((long)((CallSite)callSite).length - l2), (long)6249328653722377508L, (long)l) >= 100L) continue;
                            ReflectionUtility744.a("\u00e6", (long)6248122097317437565L, (long)l)[18] = ReflectionUtility744.a("\u00e6", (long)6248122097317437565L, (long)l)[29];
                            ReflectionUtility744.a("\u00e6", (long)6248122097317437565L, (long)l)[19] = null;
                            continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtility744.a(customSystemException);
                        }
                    }
                    if (callSite5 == 12) {
                        callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                        callSite3 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                        continue;
                    }
                    if (callSite5 == true) {
                        callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                        for (callSite3 = (CallSite)false; callSite3 < callSite4; ++callSite3) {
                            CallSite callSite6 = ReflectionUtility744.a("\u00de", (Object)ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6249411358989709934L, (long)l), (long)6247807119094839114L, (long)l);
                        }
                        continue;
                    }
                    if (callSite5 == 15) {
                        callSite4 = ReflectionUtility744.a("\u00de", (Object)ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6249411358989709934L, (long)l), (long)6247807119094839114L, (long)l);
                        callSite3 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                        continue;
                    }
                    if (callSite5 == 16) {
                        callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                        continue;
                    }
                    if (callSite5 != 18) continue;
                    callSite4 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                    callSite3 = ReflectionUtility744.a("\u00e6", (Object)callSite, (Object)configurationResolver2700, (long)6248076523582272008L, (long)l);
                }
            }
            try {
                if (!bl || callSite == null) break block33;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility744.a(customSystemException);
            }
            object = ReflectionUtility744.a("\u00e6", (Object)callSite, (long)6249661028602582071L, (long)l);
            try {
                if (object > 64) {
                    ReflectionUtility744.a("\u00e6", (Object)callSite, (int)64, (long)6249588519755809833L, (long)l);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility744.a(customSystemException);
            }
        }
        ReflectionUtility744.a("\u00de", B, clazz, (Object)callSite, (long)6249638677724316777L, (long)l);
        return callSite;
    }

    private static Field c(long l, long l2) {
        int n = ReflectionUtility744.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionUtility744.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionUtility744.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionUtility744.a(clazz3, string2, clazz2)) != null) {
                    ReflectionUtility744.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionUtility744.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionUtility744.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionUtility744.b(133090315819846L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void H(byte[] byArray, int n) {
        long l = a ^ 0x69B69B32960EL;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        boolean bl = CryptographicTransformer406.F();
        byteBuffer.putInt(n);
        int n2 = 0;
        ConfigurationResolver2700 configurationResolver2700 = new ConfigurationResolver2700();
        configurationResolver2700.t = n2 += 4;
        byte[] byArray2 = byteBuffer.array();
        for (int i = 2; i < 4; ++i) {
            ReflectionUtility744.a("\u00e6", (Object)byArray2[i], (Object)byArray, (Object)configurationResolver2700, (long)-1775157520869302230L, (long)l);
            if (!bl) continue;
            AbstractComputationKernel.I(new String[5]);
            break;
        }
    }

    static Byte F(byte[] byArray, ConfigurationResolver2700 configurationResolver2700) {
        return byArray[configurationResolver2700.t++];
    }

    private static Method d(long l, long l2) {
        int n = ReflectionUtility744.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = ReflectionUtility744.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionUtility744.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionUtility744.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionUtility744.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionUtility744.b(133090315819846L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionUtility744.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionUtility744.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionUtility744.b(133090315819846L, 0L);
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
        Object[] objectArray = b;
        b[0] = "\n'x\u0001(l\u0014/bNKx\u0010";
        objectArray[1] = "\u0015w\u0013::H\u001ex\u0002u[F\u0015s\u0006/";
        objectArray[2] = "C\u001f|J";
        objectArray[3] = "\u0005\\";
        objectArray[4] = Integer.TYPE;
        ReflectionUtility744.c[4] = "java/lang/Integer";
        objectArray[5] = "Ms~";
        objectArray[6] = "\u0007e\u0014\r\u0003\u0015\fj\u0005Bn\u0015\fw\u0011";
        objectArray[7] = "\u0017d";
        objectArray[8] = "r4C-\u0006\u0006y;Rbe\u000bl=";
        objectArray[9] = Long.TYPE;
        ReflectionUtility744.c[9] = "java/lang/Long";
        objectArray[10] = "Cu";
        objectArray[11] = "ywy*";
        objectArray[12] = ".`a\t\u0018X%opFtM0d";
        objectArray[13] = "J\u001f";
        objectArray[14] = "ps";
        objectArray[15] = Void.TYPE;
        ReflectionUtility744.c[15] = "java/lang/Void";
        objectArray[16] = ")O";
        objectArray[17] = "k_D\u001d";
        objectArray[18] = "\u001c\nnLk\ri*eCzB\b$nH~\u0018|";
        objectArray[19] = Byte.TYPE;
        ReflectionUtility744.c[19] = "java/lang/Byte";
        objectArray[20] = "}-";
        objectArray[21] = Boolean.TYPE;
        ReflectionUtility744.c[21] = "java/lang/Boolean";
        objectArray[22] = "ZW";
        objectArray[23] = "0\u0013";
        objectArray[24] = "_=t\u007f\rN\u001b)|\u0002\rY\u0018V/hKO\u00196os\rUdo|<\u001eY\u0004/gz\u0004$]<(i\bD\u001d'nsu";
        objectArray[25] = "EU\u000f\u000e\u001bA\u001c\u0014\u0002Kc#|J\fY\n\u001eA\u0018\bRXxG\u001f^V\u000e\u0004CZ\t\u0005c";
        objectArray[26] = "u(\u0018Qim.p\u0019\u0005\u000eo\"~f\\1;,,\u0018P7rw\u0014\t\tbi/)[\ri;I";
        objectArray[27] = "\f\u001dG\u0001\u0006wU\\JD~\u00175Q\u0012\u0001\u001bvK]\u0014H@NX\bRC\u0017\u007f\u000fPKT~!\\\u0001D\\CsX\n\u0016:";
        objectArray[28] = "\u0000fSo\u001bK\u000f\"\u0012zp\u001bT&c=\u001aJ\u00077\u00049\u000fJP]]iHKT:Y|H\u001c>";
        objectArray[29] = "r:\u0013`P\u001b+{\u001e%(lK%\u00107ADvw\u0014<\u0013\"t;B+OA6,Dc(\u00125(\u0001aPM30\u0016[";
        objectArray[30] = "$lKu'E}-F0_\u001f\u001dsH\"6\u001a !L)d|\"m\u001a>8\u001f`z\u001cv_G''B##Cbp\u0011N";
        objectArray[31] = "+M{B\u0007Wr\fv\u0007\u007f3\u0012Rx\u0015\u0016\b/\u0000|\u001eDn)\u0007*\u001a\u0012\u0012-B}I\u007f\u0007jDw\u0018\u0013\u0017jRoy";
        objectArray[32] = "q82\u0016k[.>*\u0001QB':\u000e\u00075^,FkTj@,:o\u0011=\u0013A";
        objectArray[33] = "\u000b\u0001t\u0003VSPYuW1E\\W\n\u000e\u000e\u0005R\u0005t\u0002\bL\t=e[]WQ\u00007_V\u00057\u00060\tRSK\u0002u^\u0001>";
        objectArray[34] = ",B0\bC.u\u0003=M;e\u0015]3_Rq(\u000f7T\u0000\u0017*CaC\\thTg\u000b;,/\t9^G(j^j3";
        objectArray[35] = "<\u001c\u0013-$z&\u0011\u001a,BXW\u001d\u001e6s-:O\u0002> \u0015";
        objectArray[36] = "}\u0001_|\u0001P$@R9y-DAK%\u0001S<\u001eM=\u0016i+\u0018Y.\u001fTy\u001cR|yV5JE \u001a\u0014\"L\rG\u0010\u0011=\u0017T+\u0000\u0011+\u000f5";
        objectArray[37] = "_$%\u001d=\u001f\u001b0-`*\u0018\u0018O~\n{\u001e\u0019/>\u0011=\u0004dv-^.\b\u000466\u00184u";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "\u0007T4R\u001d\u0013XR,E'\u0001FV;tN\u000fJGVFISYK2\u0011J\u001bQ*";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'N' || c == 't' || c == 'y' || c == 'I') {
                field = ReflectionUtility744.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'N' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionUtility744.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n4] != null) {
            return n4;
        }
        Object object = b[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 28;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 45;
                break;
            }
            case 6: {
                n3 = 49;
                break;
            }
            case 7: {
                n3 = 31;
                break;
            }
            case 8: {
                n3 = 40;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 23;
                break;
            }
            case 12: {
                n3 = 56;
                break;
            }
            case 13: {
                n3 = 4;
                break;
            }
            case 14: {
                n3 = 29;
                break;
            }
            case 15: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 1;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 41;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 60;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 25;
                break;
            }
            case 28: {
                n3 = 42;
                break;
            }
            case 29: {
                n3 = 27;
                break;
            }
            case 30: {
                n3 = 34;
                break;
            }
            case 31: {
                n3 = 18;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 30;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 15;
                break;
            }
            case 38: {
                n3 = 8;
                break;
            }
            case 39: {
                n3 = 57;
                break;
            }
            case 40: {
                n3 = 14;
                break;
            }
            case 41: {
                n3 = 20;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 24;
                break;
            }
            case 45: {
                n3 = 13;
                break;
            }
            case 46: {
                n3 = 21;
                break;
            }
            case 47: {
                n3 = 47;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 35;
                break;
            }
            case 50: {
                n3 = 51;
                break;
            }
            case 51: {
                n3 = 3;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 5;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 43;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 10;
                break;
            }
            case 59: {
                n3 = 0;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 62;
                break;
            }
            default: {
                n3 = 55;
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
        ReflectionUtility744.c[n4] = new String(cArray);
        return n4;
    }

    public static int W(Class<?> clazz, byte[] byArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l = a ^ 0x18FFFBDA8EB4L;
                callSite2 = ReflectionUtility744.a("\u00e6", clazz, (Object)byArray, (long)-7245065508547911L, (long)l);
                boolean bl = CryptographicTransformer406.W();
                try {
                    try {
                        callSite = callSite2;
                        if (!bl) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtility744.a(customSystemException);
                    }
                    B.put(clazz, byArray);
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtility744.a(customSystemException);
                }
            }
            callSite = callSite2;
        }
        return (int)callSite;
    }

    static {
        b = new Object[39];
        c = new String[39];
        ReflectionUtility744.a();
        B = new HashMap();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionUtility744.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionUtility744.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionUtility744.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionUtility744.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ReflectionUtility744.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionUtility744.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int S(byte[] byArray) {
        int n = 0;
        n += 4;
        ConfigurationResolver2700 configurationResolver2700 = new ConfigurationResolver2700();
        configurationResolver2700.t = n += 2;
        int n2 = ReflectionUtility744.z(byArray, configurationResolver2700);
        return n2;
    }

    static int z(byte[] byArray, ConfigurationResolver2700 configurationResolver2700) {
        long l = a ^ 0x2D1840FBB2B9L;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        try {
            for (int i = 2; i < 4; ++i) {
                byteBuffer.put(i, byArray[configurationResolver2700.t++]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility744.a(customSystemException);
        }
        return byteBuffer.getInt();
    }

    public static int h(byte[] byArray) {
        int n;
        block4: {
            boolean bl;
            block6: {
                block5: {
                    long l = a ^ 0x48CCD36D1113L;
                    int n2 = 0;
                    ConfigurationResolver2700 configurationResolver2700 = new ConfigurationResolver2700();
                    configurationResolver2700.t = n2 += 4;
                    boolean bl2 = CryptographicTransformer406.F();
                    int n3 = ReflectionUtility744.z(byArray, configurationResolver2700);
                    try {
                        try {
                            n = n3;
                            if (AbstractComputationKernel.J() == null) break block4;
                            if (!bl2) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectionUtility744.a(customSystemException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionUtility744.a(customSystemException);
                    }
                }
                bl = true;
            }
            CryptographicTransformer406.C(bl);
        }
        return n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static byte[] r(Class<?> clazz) {
        long l = a ^ 0x6C0DAE320B7L;
        return ReflectionUtility744.a("\u00e6", clazz, (boolean)false, (long)5903045786356482332L, (long)l);
    }

    public static void U(byte[] byArray, int n) {
        long l = a ^ 0x4A91189E7508L;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(n);
        int n2 = 0;
        n2 += 4;
        ConfigurationResolver2700 configurationResolver2700 = new ConfigurationResolver2700();
        configurationResolver2700.t = n2 += 2;
        byte[] byArray2 = byteBuffer.array();
        try {
            for (int i = 2; i < 4; ++i) {
                ReflectionUtility744.a("\u00e6", (Object)byArray2[i], (Object)byArray, (Object)configurationResolver2700, (long)313981506879226668L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility744.a(customSystemException);
        }
    }

    static void L(Byte by, byte[] byArray, ConfigurationResolver2700 configurationResolver2700) {
        long l = a ^ 0x3EF4D01BFF61L;
        byte[] byArray2 = new byte[]{by};
        for (int i = 0; i < 1; ++i) {
            int n = configurationResolver2700.t;
            try {
                if (byArray != null) {
                    byArray[n] = byArray2[i];
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtility744.a(customSystemException);
            }
            configurationResolver2700.t = n + 1;
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionUtility744.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static int k(byte[] byArray, ConfigurationResolver2700 configurationResolver2700) {
        long l = a ^ 0x6EA566A6A257L;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        try {
            for (int i = 0; i < 4; ++i) {
                byteBuffer.put(i, byArray[configurationResolver2700.t++]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionUtility744.a(customSystemException);
        }
        return byteBuffer.getInt();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionUtility744.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

