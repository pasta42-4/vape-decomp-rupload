/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ry;
import a.S3;
import a.Z3;
import com.advanced.resolution.MultiLayeredCompositeResolver;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.transformation.DataEncodingTransformer;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.math.precision.PrecisionComputationService;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.EncryptionKeyGenerator;
import com.security.session.CipherSessionManager;
import com.security.session.CryptographicSessionManager884;
import com.system.state.StateToggleManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.ui.rendering.GraphicalRenderingController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class XD {
    private static final Map d;
    private static final long[] b;
    private TransactionDescriptor k;
    private static final String[] f;
    private static final Integer[] c;
    static final boolean y;
    private static final long a;
    private final Set<UUID> v;
    private final List<TransactionDescriptor> j = new ArrayList<TransactionDescriptor>();
    private static final Object[] e;

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = XD.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = XD.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public List<TransactionDescriptor> O() {
        ArrayList<TransactionDescriptor> arrayList = new ArrayList<TransactionDescriptor>();
        for (TransactionDescriptor transactionDescriptor : this.j) {
            try {
                if (transactionDescriptor.p() == null) continue;
                arrayList.add(transactionDescriptor);
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        return arrayList;
    }

    public List<TransactionDescriptor> T() {
        return this.j;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = XD.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = XD.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = XD.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = XD.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = XD.a(clazz3, string2, clazz2)) != null) {
                    XD.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = XD.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        XD.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = XD.b(276354902011116L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public TransactionDescriptor A() {
        return this.k;
    }

    public void Q(TransactionDescriptor transactionDescriptor) {
        this.R(transactionDescriptor, false);
    }

    public void U(TransactionDescriptor transactionDescriptor) {
        try {
            this.j.remove(transactionDescriptor);
            GraphicalRenderingController.D(DataEncodingTransformer.class).u(transactionDescriptor);
            TemporalMetadataResolver.h.n();
            if (transactionDescriptor.k() != null) {
                this.v.add(transactionDescriptor.k());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw XD.a(customSystemException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public JsonObject Q(boolean bl) {
        if (bl) {
            ArrayList<TransactionDescriptor> arrayList = new ArrayList<TransactionDescriptor>();
            for (TransactionDescriptor transactionDescriptor : this.T()) {
                try {
                    if (!transactionDescriptor.r()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                arrayList.add(transactionDescriptor);
            }
            ArrayList<UUID> arrayList2 = new ArrayList<UUID>(this.v);
            this.v.clear();
            return CryptographicSessionManager884.d(arrayList, (List<UUID>)arrayList2);
        }
        JsonObject jsonObject = new JsonObject();
        for (TransactionDescriptor transactionDescriptor : this.T()) {
            jsonObject.add(transactionDescriptor.J().toString(), (JsonElement)transactionDescriptor.I(bl));
        }
        return jsonObject;
    }

    public TransactionDescriptor g(UUID uUID) {
        for (TransactionDescriptor transactionDescriptor : this.j) {
            try {
                if (transactionDescriptor.k() == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
            try {
                if (!transactionDescriptor.k().toString().equalsIgnoreCase(uUID.toString())) continue;
                return transactionDescriptor;
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == '\u00dc' || c == 'X' || c == '\u00c4') {
                field = XD.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = XD.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'J' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                XD.a = MultiContainerRegistry.a(4334031499070718230L, 3152758481579986036L, MethodHandles.lookup().lookupClass()).a(159878600843931L);
                XD.e = new Object[5];
                XD.f = new String[5];
                XD.a();
                XD.d = new HashMap<K, V>(13);
                var0 = XD.a ^ 28486810926902L;
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
                var6_5 = "\u000f\u00bd\u00b0i.\u00d4\u0000\u0082#\u00a5d\u00af\u00f7\u001et\u0017O\u0086\u00de\u00dd\u00ca\u00e7\u00b7\u00f0\u008b_\u000fO\u00d4\u0094\u00c1\u00e9";
                var7_6 = "\u000f\u00bd\u00b0i.\u00d4\u0000\u0082#\u00a5d\u00af\u00f7\u001et\u0017O\u0086\u00de\u00dd\u00ca\u00e7\u00b7\u00f0\u008b_\u000fO\u00d4\u0094\u00c1\u00e9".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00ac\u0015\u00aecZ\u0098\u00c3\u00ab\u00f0\u0099cBu\u00ed\u00bb\u00ff";
                    var7_6 = "\u00ac\u0015\u00aecZ\u0098\u00c3\u00ab\u00f0\u0099cBu\u00ed\u00bb\u00ff".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        XD.b = var8_3;
        XD.c = new Integer[6];
        try {
            v8 = XD.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw XD.a(v9);
        }
        XD.y = v8;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 36;
                break;
            }
            case 1: {
                n3 = 21;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 53;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 28;
                break;
            }
            case 7: {
                n3 = 52;
                break;
            }
            case 8: {
                n3 = 37;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 54;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 50;
                break;
            }
            case 14: {
                n3 = 38;
                break;
            }
            case 15: {
                n3 = 31;
                break;
            }
            case 16: {
                n3 = 45;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 55;
                break;
            }
            case 19: {
                n3 = 34;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 44;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 6;
                break;
            }
            case 28: {
                n3 = 24;
                break;
            }
            case 29: {
                n3 = 4;
                break;
            }
            case 30: {
                n3 = 26;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 63;
                break;
            }
            case 35: {
                n3 = 16;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 61;
                break;
            }
            case 41: {
                n3 = 20;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 3;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 43;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 56;
                break;
            }
            case 49: {
                n3 = 58;
                break;
            }
            case 50: {
                n3 = 22;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 8;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 40;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 0;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 33;
                break;
            }
            case 62: {
                n3 = 39;
                break;
            }
            default: {
                n3 = 60;
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
        XD.f[n4] = new String(cArray);
        return n4;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public TransactionDescriptor c(UUID uUID) {
        for (TransactionDescriptor transactionDescriptor : this.j) {
            try {
                if (!transactionDescriptor.J().toString().equalsIgnoreCase(uUID.toString())) continue;
                return transactionDescriptor;
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        return null;
    }

    public void y() {
        this.j.clear();
    }

    public void R(TransactionDescriptor transactionDescriptor, boolean bl) {
        block5: {
            block4: {
                try {
                    if (!bl) break block4;
                    this.j.add(0, transactionDescriptor);
                    this.C();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
            }
            this.j.add(transactionDescriptor);
        }
        GraphicalRenderingController.D(DataEncodingTransformer.class).S(transactionDescriptor);
        DataEncodingTransformer.l();
        TemporalMetadataResolver.h.n();
        if (bl) {
            for (TransactionDescriptor transactionDescriptor2 : this.j) {
                transactionDescriptor2.y(transactionDescriptor2.Q());
            }
        }
    }

    public TransactionDescriptor W() {
        block13: {
            long l;
            block14: {
                boolean bl;
                block12: {
                    block11: {
                        l = a ^ 0x355B3C8BA705L;
                        try {
                            block10: {
                                try {
                                    try {
                                        if (this.k == null) break block10;
                                        if (this.T().contains(this.k)) break block11;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw XD.a(customSystemException);
                                    }
                                    if (this.k.t()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw XD.a(customSystemException);
                                }
                            }
                            bl = true;
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw XD.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    try {
                        if (!bl2) break block13;
                        if (this.T().isEmpty()) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw XD.a(customSystemException);
                    }
                    this.q(this.T().get(0));
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
            }
            TransactionDescriptor transactionDescriptor = new TransactionDescriptor((String)((Object)XD.b("\u00de", (int)XD.a("h", (int)17569, (long)(0x40A573B7B6F27FFEL ^ l)), (long)4880896494764135670L, (long)l)), (String)((Object)XD.b("\u00de", (int)XD.a("h", (int)918, (long)(0x1A9200FDD50FB8CAL ^ l)), (long)4880896494764135670L, (long)l)));
            transactionDescriptor.y();
            this.Q(transactionDescriptor);
            this.q(transactionDescriptor);
        }
        return this.k;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void C(TransactionDescriptor transactionDescriptor) {
        block3: {
            TransactionDescriptor transactionDescriptor2;
            block2: {
                transactionDescriptor2 = this.W();
                try {
                    if (!transactionDescriptor.equals(transactionDescriptor2)) break block2;
                    transactionDescriptor.y();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
            }
            this.q(transactionDescriptor);
            transactionDescriptor.y();
            this.q(transactionDescriptor2);
        }
    }

    public JsonObject r(TransactionDescriptor transactionDescriptor) {
        long l = a ^ 0xB8D5B718F21L;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((JsonElement)transactionDescriptor.I(true));
        jsonObject.add((String)((Object)XD.b("\u00de", (int)XD.a("h", (int)6225, (long)(0x33AD64C31530B2FL ^ l)), (long)7753038387822968018L, (long)l)), (JsonElement)jsonArray);
        jsonObject.add((String)((Object)XD.b("\u00de", (int)XD.a("h", (int)12518, (long)(0x5E83DAD5D964A39CL ^ l)), (long)7753038387822968018L, (long)l)), (JsonElement)new JsonArray());
        return jsonObject;
    }

    public void q() {
        for (ContextualExecutionFramework object : TemporalMetadataResolver.h.U().u()) {
            block22: {
                block21: {
                    try {
                        try {
                            if (object.t() == RecursiveNodeGraph.p && !(object instanceof MultiLayeredCompositeResolver)) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw XD.a(customSystemException);
                        }
                        if (object.Z()) {
                            // empty if block
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw XD.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!object.C().Y()) break block22;
                        object.C().Z().clear();
                        if (object.T() == 0) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw XD.a(customSystemException);
                    }
                    object.C().Z().add(object.T());
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
            }
            object.U(object.p());
            for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : object.F()) {
                configurationProfileResolver.W();
            }
        }
        GraphicalRenderingController.j();
        for (ConfigurationProfileResolver configurationProfileResolver : TemporalMetadataResolver.h.Z().j()) {
            try {
                if (configurationProfileResolver.u() == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
            configurationProfileResolver.W();
        }
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            try {
                if (cipherSessionManager instanceof EncryptionKeyGenerator) {
                    ((EncryptionKeyGenerator)cipherSessionManager).O();
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
            try {
                if (!(cipherSessionManager instanceof PrecisionComputationService)) continue;
                ((StateToggleManager)((PrecisionComputationService)cipherSessionManager).l()).g(false);
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
    }

    public TransactionDescriptor Y(String string) {
        for (TransactionDescriptor transactionDescriptor : this.j) {
            try {
                if (!transactionDescriptor.T().equalsIgnoreCase(string)) continue;
                return transactionDescriptor;
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        return null;
    }

    public void E() {
        Collection<Ry> collection = TemporalMetadataResolver.h.u().j().values();
        for (TransactionDescriptor transactionDescriptor : this.j) {
            transactionDescriptor.G(null);
            for (Ry ry : collection) {
                try {
                    if (ry.G() == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                UUID uUID = ry.G().v();
                try {
                    if (uUID == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                try {
                    if (transactionDescriptor.k() == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                try {
                    if (!transactionDescriptor.k().toString().equalsIgnoreCase(uUID.toString())) continue;
                    transactionDescriptor.G(ry);
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
            }
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x78E3;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/XD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            XD.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = XD.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void C() {
        this.j.sort(TransactionDescriptor::h);
    }

    public XD() {
        this.v = new LinkedHashSet<UUID>();
    }

    public void q(TransactionDescriptor transactionDescriptor) {
        block4: {
            try {
                try {
                    if (this.k == null || !this.k.equals(transactionDescriptor)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        TransactionDescriptor transactionDescriptor2 = this.k;
        this.q();
        this.k = transactionDescriptor;
        this.k.s();
        TemporalMetadataResolver.h.n();
        Z3.s().k(new S3(transactionDescriptor2, transactionDescriptor));
    }

    public void A(TransactionDescriptor transactionDescriptor) {
        try {
            if (this.W() != null) {
                this.W().y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw XD.a(customSystemException);
        }
        this.q(transactionDescriptor);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = XD.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                XD.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void R(JsonObject jsonObject) {
        long l = a ^ 0x2C093B7796E3L;
        try {
            if (jsonObject == null) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw XD.a(throwable);
        }
        if (jsonObject.entrySet().isEmpty()) {
            TransactionDescriptor transactionDescriptor = new TransactionDescriptor((String)((Object)XD.b("\u00de", (int)XD.a("h", (int)15128, (long)(0xA144E05079631A5L ^ l)), (long)8240026915602277648L, (long)l)), (String)((Object)XD.b("\u00de", (int)XD.a("h", (int)11029, (long)(0x48F8BD448141A1AEL ^ l)), (long)8240026915602277648L, (long)l)));
            transactionDescriptor.y();
            this.Q(transactionDescriptor);
            return;
        }
        for (Map.Entry entry : jsonObject.entrySet()) {
            JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
            TransactionDescriptor transactionDescriptor = new TransactionDescriptor("", "", true).P(jsonObject2);
            this.Q(transactionDescriptor);
        }
        try {
            this.j.sort(XD::lambda$fromJson$0);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        DataEncodingTransformer.l();
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "$\nU";
        objectArray[1] = Integer.TYPE;
        XD.f[1] = "java/lang/Integer";
        objectArray[2] = "&W~:+2-XouV*>_f<";
        objectArray[3] = ")6\u0001\b\u001c)\"9\u0010G}')2\u0014\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Mv'AjY\u0018n-&zE$f)]u\u0006G\u007f(A\u0011\u0007Vq~VcF\u0018/;&";
    }

    private static Method d(long l, long l2) {
        int n = XD.a(l, l2);
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
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = XD.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = XD.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = XD.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        XD.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = XD.b(276354902011116L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = XD.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        XD.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = XD.b(276354902011116L, 0L);
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

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = XD.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = XD.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Nullable
    public TransactionDescriptor Y(long l) {
        for (TransactionDescriptor transactionDescriptor : this.j) {
            block10: {
                try {
                    if (transactionDescriptor.p() == null) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                try {
                    try {
                        if (y || transactionDescriptor.p() != null) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw XD.a(customSystemException);
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
            }
            try {
                if (transactionDescriptor.p().i() != l) continue;
                return transactionDescriptor;
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        return null;
    }

    private static int lambda$fromJson$0(TransactionDescriptor transactionDescriptor, TransactionDescriptor transactionDescriptor2) {
        block7: {
            try {
                try {
                    if (transactionDescriptor.g() == null || transactionDescriptor2.g() == null) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw XD.a(customSystemException);
                }
                return transactionDescriptor.g().compareTo(transactionDescriptor2.g());
            }
            catch (CustomSystemException customSystemException) {
                throw XD.a(customSystemException);
            }
        }
        try {
            if (transactionDescriptor.g() != null) {
                return 1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw XD.a(customSystemException);
        }
        return -1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(XD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(XD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

