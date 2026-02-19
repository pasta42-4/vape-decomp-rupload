/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.vM;
import com.adapter.management.GenericAdapterManager;
import com.collections.management.MultiContainerRegistry;
import com.event.dispatch.EventDispatchCoordinator;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.network.connection.NetworkConnectionEstablisher;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.temporal.metadata.TemporalMetadataResolver;
import com.utils.reflection.ReflectionUtilityResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Sc {
    private static final Map d;
    public GenericAdapterManager G;
    private static final String[] f;
    private String o;
    private static boolean n;
    private final Set<ReflectionUtilityResolver> v;
    private final Map<Integer, vM> P;
    private static final Integer[] c;
    private static final long a;
    public final AuthenticationGateway1860 X;
    public final AuthenticationGateway1860 D;
    private static final long[] b;
    private static final Object[] e;

    public @UnmodifiableView Collection<ReflectionUtilityResolver> D() {
        return this.v;
    }

    public void G() {
        this.v.clear();
    }

    public String B() {
        return this.o;
    }

    public static boolean n() {
        boolean bl = Sc.B();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Sc.a(customSystemException);
        }
        return false;
    }

    public @UnmodifiableView Collection<vM> w() {
        return this.P.values();
    }

    public JsonObject C(boolean bl) {
        long l = a ^ 0x1489EF965ACAL;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)5621, (long)(0x1974271593754ED3L ^ l)), (long)7157913480851663834L, (long)l)), this.o);
        JsonArray jsonArray = new JsonArray();
        for (vM object : this.P.values()) {
            JsonObject jsonObject2 = object.F(bl);
            try {
                if (jsonObject2.entrySet().size() <= 1) continue;
                jsonArray.add((JsonElement)jsonObject2);
            }
            catch (CustomSystemException customSystemException) {
                throw Sc.a(customSystemException);
            }
        }
        try {
            if (jsonArray.size() > 0) {
                jsonObject.add((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)1928, (long)(0x688BB43C7D20DCACL ^ l)), (long)7157913480851663834L, (long)l)), (JsonElement)jsonArray);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Sc.a(customSystemException);
        }
        JsonArray jsonArray2 = new JsonArray();
        for (ReflectionUtilityResolver reflectionUtilityResolver : this.v) {
            jsonArray2.add((JsonElement)reflectionUtilityResolver.F(bl));
        }
        try {
            if (jsonArray2.size() > 0) {
                jsonObject.add((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)9699, (long)(0x647C739A53AF7ED1L ^ l)), (long)7157913480851663834L, (long)l)), (JsonElement)jsonArray2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Sc.a(customSystemException);
        }
        jsonObject.addProperty((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)8635, (long)(0x6429040CD1A17A93L ^ l)), (long)7157913480851663834L, (long)l)), ((NetworkConnectionEstablisher)this.G.J()).O());
        return jsonObject;
    }

    public Sc(JsonObject jsonObject) {
        vM vM2;
        long l = a ^ 0x5715ADE60854L;
        this.P = new LinkedHashMap<Integer, vM>();
        this.v = new LinkedHashSet<ReflectionUtilityResolver>();
        this.o = "";
        this.X = new AuthenticationGateway1860((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)15911, (long)(0x39084AB8AEDFB79BL ^ l)), (long)3587196262490110276L, (long)l)));
        this.D = new AuthenticationGateway1860((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)31364, (long)(0x6DAFC508B78F33AL ^ l)), (long)3587196262490110276L, (long)l)));
        this.G = GenericAdapterManager.E(this, (String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)16051, (long)(0x65CE6C6458F2B703L ^ l)), (long)3587196262490110276L, (long)l)), "", (String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)31725, (long)(0x180AA71FC562F25EL ^ l)), (long)3587196262490110276L, (long)l)), this.X, this.X, this.D);
        this.o = jsonObject.get((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)24775, (long)(0xF32740068A4E97EL ^ l)), (long)3587196262490110276L, (long)l))).getAsString();
        if (this.o.trim().isEmpty()) {
            this.R();
        }
        JsonArray jsonArray = jsonObject.getAsJsonArray((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)7718, (long)(0x77765AFA2CE39794L ^ l)), (long)3587196262490110276L, (long)l)));
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject2 = jsonArray.get(i).getAsJsonObject();
            vM2 = new vM(jsonObject2);
            this.P.put(vM2.T(), vM2);
        }
        JsonArray jsonArray2 = jsonObject.getAsJsonArray((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)7969, (long)(0x21C54E57620C968CL ^ l)), (long)3587196262490110276L, (long)l)));
        if (jsonArray2 != null) {
            for (int i = 0; i < jsonArray2.size(); ++i) {
                vM2 = jsonArray2.get(i).getAsJsonObject();
                ReflectionUtilityResolver reflectionUtilityResolver = new ReflectionUtilityResolver((JsonObject)vM2);
                this.v.add(reflectionUtilityResolver);
            }
        }
        JsonElement jsonElement = jsonObject.get((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)23360, (long)(0x36B8307188A2D2FDL ^ l)), (long)3587196262490110276L, (long)l)));
        try {
            if (jsonElement != null) {
                this.G.i(jsonElement.getAsString());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Sc.a(customSystemException);
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

    private static Method d(long l, long l2) {
        int n = Sc.a(l, l2);
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
                clazz3 = Sc.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Sc.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Sc.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        Sc.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Sc.b(262197694016388L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Sc.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Sc.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Sc.b(262197694016388L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void J(boolean bl) {
        n = bl;
    }

    @Nullable
    public ReflectionUtilityResolver m(LightweightExecutionContext lightweightExecutionContext) {
        for (ReflectionUtilityResolver reflectionUtilityResolver : this.v) {
            try {
                try {
                    if (!reflectionUtilityResolver.A().Z(lightweightExecutionContext) || !reflectionUtilityResolver.d(lightweightExecutionContext)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw Sc.a(customSystemException);
                }
                return reflectionUtilityResolver;
            }
            catch (CustomSystemException customSystemException) {
                throw Sc.a(customSystemException);
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = Sc.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = Sc.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Sc.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Sc.a(clazz3, string2, clazz2)) != null) {
                    Sc.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Sc.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Sc.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Sc.b(262197694016388L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public vM e(int n) {
        return this.P.computeIfAbsent(n, vM::new);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Sc.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static boolean B() {
        return n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Sc.a = MultiContainerRegistry.a(5908072837667427970L, -3246689004603833736L, MethodHandles.lookup().lookupClass()).a(32299334367370L);
                Sc.e = new Object[5];
                Sc.f = new String[5];
                Sc.a();
                Sc.d = new HashMap<K, V>(13);
                Sc.J(true);
                var0 = Sc.a ^ 9319222323662L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "\u0090\u008b\u0099\u00fd\u001b2\u001c\u0098\u00a9\u009f\u00f9\u00e7\u00f0[\u00e3\u00c77\u00a76yj\u008b\u001d\u00a1\u00b7!&R\u0083Xvv\n\u00af*Y\u00fab\u00fa\u001f\u0001\u00f5\u0095I\u00f9\u00a9\u0005RV8\u00f06\u000b\u0012\u00f1\u0086z\u0003\u00d0\u00d54t\u009c\u008fj\u008e\u00c7\u00d4[j\u008f\u00dc\u0089\u00b5o\u00d5\u00af7/\u0016\u008d\u00d1\u00a8p\u00c5\t\u00ba\u00d8M\u00ca\u007f\u00b9\u0086\u00bc\u000e\u00fd\u00daN\u00e7\u0096\u00f1\u00d6\u00f3g\u0010\u00e8g\u00f8\u00b4\u00df\u000e\u009c]\\-\u00bci+\u0007\b\u000ep\u00fd\u0097\u0003\u0018\u00f0r";
                var7_6 = "\u0090\u008b\u0099\u00fd\u001b2\u001c\u0098\u00a9\u009f\u00f9\u00e7\u00f0[\u00e3\u00c77\u00a76yj\u008b\u001d\u00a1\u00b7!&R\u0083Xvv\n\u00af*Y\u00fab\u00fa\u001f\u0001\u00f5\u0095I\u00f9\u00a9\u0005RV8\u00f06\u000b\u0012\u00f1\u0086z\u0003\u00d0\u00d54t\u009c\u008fj\u008e\u00c7\u00d4[j\u008f\u00dc\u0089\u00b5o\u00d5\u00af7/\u0016\u008d\u00d1\u00a8p\u00c5\t\u00ba\u00d8M\u00ca\u007f\u00b9\u0086\u00bc\u000e\u00fd\u00daN\u00e7\u0096\u00f1\u00d6\u00f3g\u0010\u00e8g\u00f8\u00b4\u00df\u000e\u009c]\\-\u00bci+\u0007\b\u000ep\u00fd\u0097\u0003\u0018\u00f0r".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00a2\u0082D\u00f7\u00a3N\u001a\u001f\u00b2\u00e7U\u00bd4\u00f3\u00edJ";
                    var7_6 = "\u00a2\u0082D\u00f7\u00a3N\u001a\u001f\u00b2\u00e7U\u00bd4\u00f3\u00edJ".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        Sc.b = var8_3;
        Sc.c = new Integer[18];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3875;
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
                throw new RuntimeException("a/Sc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Sc.c[n2] = n3;
        }
        return c[n2];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "@\u0019@";
        objectArray[1] = Integer.TYPE;
        Sc.f[1] = "java/lang/Integer";
        objectArray[2] = "y\f\u001c\n[1r\u0003\rE&)a\u0004\u0004\f";
        objectArray[3] = "L3m\u001f\u00010G<|P`>L7x\n";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ":\t?\u001aim`I|%<(PK/B1:/M|X2Si\u000e5Xm27\u0017:KW";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Sc.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Sc.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Sc.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Sc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Sc.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Sc.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public Sc() {
        long l = a ^ 0x7CD1C9C8E42CL;
        this.P = new LinkedHashMap<Integer, vM>();
        this.v = new LinkedHashSet<ReflectionUtilityResolver>();
        this.o = "";
        this.X = new AuthenticationGateway1860((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)6230, (long)(0xC5C5828D3F57D91L ^ l)), (long)-2472357195548060356L, (long)l)));
        this.D = new AuthenticationGateway1860((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)23628, (long)(0x416480A1F56FB983L ^ l)), (long)-2472357195548060356L, (long)l)));
        this.G = GenericAdapterManager.E(this, (String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)8551, (long)(0x2C2D7F7A767944AAL ^ l)), (long)-2472357195548060356L, (long)l)), "", (String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)8696, (long)(0x52953FF127C94434L ^ l)), (long)-2472357195548060356L, (long)l)), this.X, this.X, this.D);
        this.R();
        try {
            for (int i = 0; i < 9; ++i) {
                this.P.put(i, new vM(i));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Sc.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void R() {
        long l = a ^ 0x489E67D6380L;
        int n = 1;
        for (Sc sc : TemporalMetadataResolver.h.U().K(EventDispatchCoordinator.class).H().A()) {
            try {
                if (!sc.B().equalsIgnoreCase((String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)7968, (long)(0x2C417886FA5D7D4FL ^ l)), (long)6493087178175779472L, (long)l)) + n)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Sc.a(customSystemException);
            }
            ++n;
        }
        this.o = (String)((Object)Sc.b("\u00da", (int)Sc.a("i", (int)14540, (long)(0x140C5BBB113DDAA9L ^ l)), (long)6493087178175779472L, (long)l)) + n;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Sc.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                Sc.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f1' || c == 'Q' || c == '\u00e8' || c == 'X') {
                field = Sc.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Sc.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'R' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void E(ReflectionUtilityResolver reflectionUtilityResolver) {
        this.v.add(reflectionUtilityResolver);
    }

    public void M(ReflectionUtilityResolver reflectionUtilityResolver) {
        this.v.remove(reflectionUtilityResolver);
    }

    public void F(String string) {
        this.o = string;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Sc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 45;
                break;
            }
            case 5: {
                n3 = 44;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 39;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 21;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 35;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 37;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 26;
                break;
            }
            case 21: {
                n3 = 60;
                break;
            }
            case 22: {
                n3 = 51;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 36;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 54;
                break;
            }
            case 27: {
                n3 = 1;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 10;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 57;
                break;
            }
            case 32: {
                n3 = 58;
                break;
            }
            case 33: {
                n3 = 0;
                break;
            }
            case 34: {
                n3 = 19;
                break;
            }
            case 35: {
                n3 = 2;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 5;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 30;
                break;
            }
            case 50: {
                n3 = 53;
                break;
            }
            case 51: {
                n3 = 38;
                break;
            }
            case 52: {
                n3 = 17;
                break;
            }
            case 53: {
                n3 = 32;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 31;
                break;
            }
            case 57: {
                n3 = 34;
                break;
            }
            case 58: {
                n3 = 7;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 9;
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
        Sc.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Sc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Sc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

