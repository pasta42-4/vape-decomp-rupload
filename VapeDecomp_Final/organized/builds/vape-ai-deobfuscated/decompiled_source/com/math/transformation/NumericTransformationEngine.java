/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GLContext
 */
package com.math.transformation;

import com.analytics.computation.MetricsCalculationEngine;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.rendering.graphics.VisualizationRenderer;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.network.validation.DataPacketValidator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.constants.CipherConfigurationMode;
import com.security.encoding.SecureMessageEncoder;
import com.security.policy.CryptographicPolicyDescriptor;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GLContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class NumericTransformationEngine
extends AbstractComputationKernel {
    private static final long db = MultiContainerRegistry.a(-1170660746806234333L, 3003600017675190318L, MethodHandles.lookup().lookupClass()).a(246796685943057L);
    private static final long[] jb;
    private static int V;
    private boolean R;
    private boolean Gf;
    private boolean Gd;
    private static final String[] Bb;
    public double G5;
    private double n;
    private CryptographicPolicyDescriptor E;
    private boolean b;
    private int GZ;
    protected MetricsCalculationEngine GH;
    private boolean Gn;
    private boolean L;
    private ColorPaletteRenderer D;
    private boolean G4;
    private static final Object[] Ab;
    private static final Map nb;
    private VisualizationRenderer B;
    private boolean Gz;
    private MetricsCalculationEngine GC;
    private SecureMessageEncoder Gi;
    private boolean F;
    private ColorPaletteRenderer GQ;
    private boolean GF;
    private boolean Gx;
    private EventDistributionHub v;
    protected MetricsCalculationEngine G_;
    private CoordinateMapper GD;
    private boolean Y;
    private boolean Gg;
    private static final Integer[] kb;
    protected boolean Gt;

    public boolean p() {
        return this.R;
    }

    public static int P() {
        int n = NumericTransformationEngine.K();
        try {
            if (n == 0) {
                return 110;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        return 0;
    }

    private static CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(SecureMessageEncoder secureMessageEncoder) {
        long l = db ^ 0x5F65ACB9C4D7L;
        this.Gi = secureMessageEncoder;
        this.n(secureMessageEncoder, NumericTransformationEngine.h("Q", (int)NumericTransformationEngine.b("i", (int)20898, (long)(0x8BCD4AC432E829L ^ l)), (long)6585479528623069291L, (long)l));
    }

    private static void bb() {
        Object[] objectArray = Ab;
        Ab[0] = "|*\u001e";
        objectArray[1] = Integer.TYPE;
        NumericTransformationEngine.Bb[1] = "java/lang/Integer";
        objectArray[2] = "ei4E$8nf%\nY }a,C";
        objectArray[3] = "`)\u0014%Bpk&\u0005j#~`-\u00010";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "cgE\\lc$}Wm`x^'\f\u0016y2=y\u0000\u000bi\u0003g}G\u0015wz`qN\u0002\u000b";
    }

    public void M() {
        this.i(Double.MAX_VALUE);
    }

    public ArrayList<AbstractComputationKernel> H(ArrayList<AbstractComputationKernel> arrayList, int n) {
        int n2 = arrayList.size();
        try {
            for (int i = n; i < n2; ++i) {
                arrayList.addAll(arrayList.get(i).A());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        try {
            if (arrayList.size() > n2) {
                return this.H(arrayList, n2 - 1);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        return arrayList;
    }

    public void B() {
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            boolean bl;
            AbstractComputationKernel abstractComputationKernel2;
            block18: {
                block17: {
                    boolean bl2;
                    block16: {
                        block15: {
                            try {
                                if (abstractComputationKernel instanceof SecureMessageEncoder) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine.b(customSystemException);
                            }
                            try {
                                if (abstractComputationKernel.o()) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine.b(customSystemException);
                            }
                            double d2 = abstractComputationKernel.W();
                            try {
                                try {
                                    if (!(d2 + abstractComputationKernel.b() < this.W()) && !(d2 > this.W() + this.G5)) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationEngine.b(customSystemException);
                                }
                                bl2 = true;
                                break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine.b(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    boolean bl3 = bl2;
                    try {
                        try {
                            abstractComputationKernel2 = abstractComputationKernel;
                            if (!bl3 || !this.Gx) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine.b(customSystemException);
                        }
                        bl = true;
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine.b(customSystemException);
                    }
                }
                bl = false;
            }
            abstractComputationKernel2.R(bl);
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericTransformationEngine.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericTransformationEngine.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void H() {
        this.w(false);
    }

    public void u() {
    }

    public void f() {
        CopyOnWriteArrayList<AbstractComputationKernel> copyOnWriteArrayList = new CopyOnWriteArrayList<AbstractComputationKernel>(this.A());
        for (AbstractComputationKernel abstractComputationKernel : copyOnWriteArrayList) {
            this.J(abstractComputationKernel);
        }
    }

    @Override
    public MetricsCalculationEngine C() {
        try {
            if (this.Gt) {
                return new MetricsCalculationEngine(this.G(), this.W(), this.w(), this.Q());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        return new MetricsCalculationEngine(this.G(), this.W(), this.w(), this.b());
    }

    public void B(boolean bl) {
        this.Gt = bl;
    }

    public void q(boolean bl) {
        this.GF = bl;
    }

    public boolean B() {
        return this.b;
    }

    @Override
    public AbstractComputationKernel Q(Color color) {
        AbstractComputationKernel abstractComputationKernel = super.Q(color);
        this.n();
        return abstractComputationKernel;
    }

    public void Q(boolean bl) {
        this.Gg = bl;
    }

    public void o(boolean bl) {
        boolean bl2;
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        block9: {
            block8: {
                double d6;
                try {
                    d6 = this.G4 ? 2.0 : 0.0;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
                double d7 = d6;
                try {
                    d5 = this.G();
                    d4 = this.W();
                    d3 = this.w();
                    d2 = bl ? this.G5 + d7 : this.m() + d7;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
                try {
                    try {
                        color = this.l();
                        if (!this.Gf || this.Q() == null) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine.b(customSystemException);
                    }
                    bl2 = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
            }
            bl2 = false;
        }
        ConfigurationManager.g(d5, d4, d3, d2, color, bl2, 1.5f, 1.0f, 8.0f, new Color(0, 0, 0, 152), this.GZ);
    }

    private void p(AbstractComputationKernel abstractComputationKernel, boolean bl) {
        for (AbstractComputationKernel abstractComputationKernel2 : abstractComputationKernel.A()) {
            if (!(abstractComputationKernel2 instanceof NumericTransformationEngine)) continue;
            NumericTransformationEngine numericTransformationEngine = (NumericTransformationEngine)abstractComputationKernel2;
            try {
                try {
                    numericTransformationEngine.B();
                    if (numericTransformationEngine.c() && !bl) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
                numericTransformationEngine.h(bl);
                this.p(numericTransformationEngine, bl);
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine.b(customSystemException);
            }
        }
    }

    @Override
    public void d() {
        this.C();
    }

    @Override
    public void k() {
        CopyOnWriteArrayList<AbstractComputationKernel> copyOnWriteArrayList = new CopyOnWriteArrayList<AbstractComputationKernel>(this.A());
        for (AbstractComputationKernel abstractComputationKernel : copyOnWriteArrayList) {
            try {
                if (!abstractComputationKernel.b()) continue;
                this.J(abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine.b(customSystemException);
            }
        }
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block7: {
            block9: {
                block8: {
                    try {
                        if (this.GH.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) {
                            this.GD = GraphicsBufferAllocator.b();
                            this.Gz = true;
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine.b(customSystemException);
                    }
                    try {
                        try {
                            if (!this.G_.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block7;
                            if (!((double)userInteractionEventDispatcher.getY() > this.GH.q())) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine.b(customSystemException);
                        }
                        this.GD = new CoordinateMapper((int)this.GH.K(), (int)(this.GH.q() + this.GH.V()));
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine.b(customSystemException);
                    }
                }
                this.GD = new CoordinateMapper((int)this.GH.K(), (int)this.GH.q());
            }
            this.Gz = true;
            return;
        }
        super.S(userInteractionEventDispatcher);
    }

    public MetricsCalculationEngine I() {
        return this.GH;
    }

    @Override
    public List<AbstractComputationKernel> A() {
        return this.v.l();
    }

    public void W(MetricsCalculationEngine metricsCalculationEngine) {
        this.GC = metricsCalculationEngine;
    }

    public void i(double d2) {
        this.G5 = d2;
    }

    public boolean C() {
        return this.G4;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Bb[n4] != null) {
            return n4;
        }
        Object object = Ab[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 49;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 17;
                break;
            }
            case 8: {
                n3 = 21;
                break;
            }
            case 9: {
                n3 = 53;
                break;
            }
            case 10: {
                n3 = 52;
                break;
            }
            case 11: {
                n3 = 11;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 27;
                break;
            }
            case 16: {
                n3 = 38;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 4;
                break;
            }
            case 19: {
                n3 = 25;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 55;
                break;
            }
            case 23: {
                n3 = 14;
                break;
            }
            case 24: {
                n3 = 61;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 15;
                break;
            }
            case 27: {
                n3 = 29;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 7;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 59;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 42;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 40;
                break;
            }
            case 37: {
                n3 = 8;
                break;
            }
            case 38: {
                n3 = 46;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 26;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 41;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 30;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 18;
                break;
            }
            case 51: {
                n3 = 54;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 28;
                break;
            }
            case 54: {
                n3 = 0;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 36;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 37;
                break;
            }
            case 60: {
                n3 = 60;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 56;
                break;
            }
            default: {
                n3 = 23;
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
        NumericTransformationEngine.Bb[n4] = new String(cArray);
        return n4;
    }

    private static Method h(long l, long l2) {
        int n = NumericTransformationEngine.e(l, l2);
        Object object = Ab[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Bb[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericTransformationEngine.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericTransformationEngine.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericTransformationEngine.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericTransformationEngine.Ab[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericTransformationEngine.f(261128927725761L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericTransformationEngine.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericTransformationEngine.Ab[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericTransformationEngine.f(261128927725761L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean w() {
        return this.Y;
    }

    public void A(double d2) {
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                if (abstractComputationKernel instanceof SecureMessageEncoder) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine.b(customSystemException);
            }
            abstractComputationKernel.M(this.d().k().get(abstractComputationKernel).q() + d2);
        }
    }

    public SecureMessageEncoder Q() {
        return this.Gi;
    }

    public void q(EventDistributionHub eventDistributionHub) {
        this.v = eventDistributionHub;
    }

    public int j() {
        return this.GZ;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'F' || c == 'X' || c == '\u00a5' || c == '\u00dc') {
                field = NumericTransformationEngine.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericTransformationEngine.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Enabled aggressive block sorting
     */
    static {
        Ab = new Object[5];
        Bb = new String[5];
        NumericTransformationEngine.bb();
        nb = new HashMap(13);
        long l = db ^ 0x6A70AFB37110L;
        NumericTransformationEngine.p(26);
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u0004*\u00dc\u00fb\u00a5\r\u00dbG\u007f\u0018'\u00aa\u00d4$\u00b5\u0015";
        int n2 = "\u0004*\u00dc\u00fb\u00a5\r\u00dbG\u007f\u0018'\u00aa\u00d4$\u00b5\u0015".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        jb = lArray;
        kb = new Integer[2];
    }

    public static int K() {
        return V;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericTransformationEngine.e(l, l2);
            object = Ab[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericTransformationEngine.Ab[n] = clazz = Class.forName(Bb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void e(double d2) {
        block15: {
            block14: {
                block16: {
                    double d3;
                    block12: {
                        block13: {
                            d3 = this.d().R();
                            try {
                                if (!this.Gg) break block12;
                                if (!(d2 < 0.0)) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine.b(customSystemException);
                            }
                            d2 = 0.0;
                        }
                        if (d2 > d3 - this.G5) {
                            d2 = d3 - this.G5;
                        }
                        break block16;
                    }
                    if (d2 > 0.0) {
                        d2 = 0.0;
                    }
                    if (d2 < -(d3 - this.G5)) {
                        d2 = -(d3 - this.G5);
                    }
                }
                try {
                    if (!this.Gg) break block14;
                    if (!(d2 < 0.0)) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
                d2 = 0.0;
                break block15;
            }
            if (d2 > 0.0) {
                d2 = 0.0;
            }
        }
        this.n = d2;
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                if (abstractComputationKernel instanceof SecureMessageEncoder) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine.b(customSystemException);
            }
            double d4 = this.d().k().get(abstractComputationKernel).q();
            double d5 = d4 + d2;
            abstractComputationKernel.M(d5);
        }
        this.B();
    }

    @Override
    public void N() {
        int n = SystemDiagnosticAnalyzer.a();
        try {
            if (n != 0) {
                this.R(this.V() + (double)(n / 24));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
        try {
            if (this.GH.T(coordinateMapper)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        super.N();
    }

    public double V() {
        return this.n;
    }

    private static Field g(long l, long l2) {
        int n = NumericTransformationEngine.e(l, l2);
        Object object = Ab[n];
        if (object instanceof String) {
            String string = Bb[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericTransformationEngine.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericTransformationEngine.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericTransformationEngine.c(clazz3, string2, clazz2)) != null) {
                    NumericTransformationEngine.Ab[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericTransformationEngine.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericTransformationEngine.Ab[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericTransformationEngine.f(261128927725761L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void i() {
    }

    public MetricsCalculationEngine Y() {
        return this.G_;
    }

    public NumericTransformationEngine() {
        long l = db ^ 0x54686D6F4F0CL;
        this.G5 = 300.0;
        this.B = new VisualizationRenderer(NumericTransformationEngine.M.S);
        this.v = new EventDistributionHub(this);
        this.GH = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
        this.G_ = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
        this.Gx = true;
        this.E = CryptographicPolicyDescriptor.INSIDE;
        this.L = true;
        this.R = false;
        this.Gg = false;
        this.Gd = false;
        this.GF = false;
        this.b = false;
        this.Gf = true;
        this.G4 = true;
        this.GZ = (int)NumericTransformationEngine.b("i", (int)22476, (long)(0x2DD9B4AFB5CF659DL ^ l));
        this.n();
    }

    public void Y(boolean bl) {
        this.Gx = bl;
    }

    private void b() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        NumericTransformationEngine numericTransformationEngine = this;
                        if (!(this.d().R() >= this.G5) || !this.Gx) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
            }
            bl = false;
        }
        numericTransformationEngine.Gt = bl;
    }

    public void O(CryptographicPolicyDescriptor cryptographicPolicyDescriptor) {
        this.E = cryptographicPolicyDescriptor;
    }

    @Override
    public void g() {
    }

    @Override
    public void J(AbstractComputationKernel abstractComputationKernel) {
        this.v.c(abstractComputationKernel);
        this.A();
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericTransformationEngine.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NumericTransformationEngine.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericTransformationEngine.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void U(boolean bl) {
        this.Gf = bl;
    }

    public boolean L() {
        return this.GF;
    }

    public void A(boolean bl) {
        this.b = bl;
    }

    public abstract void C();

    private void o() {
        try {
            if (!this.Gz) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        try {
            if (!SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal())) {
                this.Gz = false;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        double d2 = this.d().R();
        CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
        double d3 = coordinateMapper.I - this.GD.I;
        this.GD = coordinateMapper;
        this.R(this.n - (d3 *= d2 / this.G5));
    }

    public void C(boolean bl) {
        this.R = bl;
        this.n();
    }

    public void w(boolean bl) {
        this.F = true;
        this.Gn = bl;
    }

    public void n(AbstractComputationKernel abstractComputationKernel, Object ... objectArray) {
        abstractComputationKernel.Q(this);
        this.v.j(abstractComputationKernel, objectArray);
        this.A();
    }

    @Override
    public void U() {
        try {
            if (this.F) {
                this.h(this.Gn);
                this.F = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        this.u();
    }

    private void n() {
        if (this.R) {
            Color color = this.l();
            Color color2 = color.darker();
            Color color3 = color.brighter();
            this.GQ = new ColorPaletteRenderer(0.15, new Color(color.getRed(), color.getGreen(), color.getBlue(), 0), color2);
            this.D = new ColorPaletteRenderer(0.15, new Color(Math.max(color.getRed() + 5, 255), Math.max(color.getGreen() + 5, 255), Math.max(color.getBlue() + 5, 255), 30), color3);
        } else {
            this.GQ = new ColorPaletteRenderer(0.15, new Color(NumericTransformationEngine.M.g.getRed(), NumericTransformationEngine.M.g.getGreen(), NumericTransformationEngine.M.g.getBlue(), 0), NumericTransformationEngine.M.g);
            this.D = new ColorPaletteRenderer(0.15, new Color(NumericTransformationEngine.M.S.getRed(), NumericTransformationEngine.M.S.getGreen(), NumericTransformationEngine.M.S.getBlue(), 30), NumericTransformationEngine.M.S);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void E() {
        block72: {
            block74: {
                block73: {
                    block68: {
                        block63: {
                            block65: {
                                block64: {
                                    block77: {
                                        block62: {
                                            block61: {
                                                block60: {
                                                    try {
                                                        this.e();
                                                        if (this.F) {
                                                            this.h(this.Gn);
                                                            this.F = false;
                                                        }
                                                    }
                                                    catch (Exception v0) {
                                                        throw NumericTransformationEngine.b(v0);
                                                    }
                                                    try {
                                                        if (this.GF) {
                                                            this.h(this.b);
                                                            this.F = false;
                                                        }
                                                    }
                                                    catch (Exception v1) {
                                                        throw NumericTransformationEngine.b(v1);
                                                    }
                                                    this.b();
                                                    this.G();
                                                    if (this.GC != null) break block60;
                                                    try {
                                                        block75: {
                                                            if (!this.H()) break block60;
                                                            break block75;
                                                            catch (Exception v2) {
                                                                throw NumericTransformationEngine.b(v2);
                                                            }
                                                        }
                                                        this.o(this.Gt);
                                                    }
                                                    catch (Exception v3) {
                                                        throw NumericTransformationEngine.b(v3);
                                                    }
                                                }
                                                if (!this.Gt) break block61;
                                                try {
                                                    block76: {
                                                        if (this.Gi == null) break block61;
                                                        break block76;
                                                        catch (Exception v4) {
                                                            throw NumericTransformationEngine.b(v4);
                                                        }
                                                    }
                                                    v5 = 3;
                                                    break block62;
                                                }
                                                catch (Exception v6) {
                                                    throw NumericTransformationEngine.b(v6);
                                                }
                                            }
                                            v5 = 0;
                                        }
                                        var1_1 = v5;
                                        try {
                                            if (!this.f()) {
                                                return;
                                            }
                                        }
                                        catch (Exception v7) {
                                            throw NumericTransformationEngine.b(v7);
                                        }
                                        var2_2 = false;
                                        if (this.Gt) ** GOTO lbl61
                                        if (this.GC == null) break block63;
                                        break block77;
                                        catch (Exception v8) {
                                            throw NumericTransformationEngine.b(v8);
                                        }
                                    }
                                    try {
                                        block78: {
                                            if (this.GC == null) break block64;
                                            break block78;
                                            catch (Exception v9) {
                                                throw NumericTransformationEngine.b(v9);
                                            }
                                        }
                                        GraphicsBufferAllocator.e(this.GC.K(), this.GC.q(), this.GC.t(), this.GC.V());
                                        break block65;
                                    }
                                    catch (Exception v10) {
                                        throw NumericTransformationEngine.b(v10);
                                    }
                                }
                                var3_3 = this.G() + this.w();
                                var5_8 = this.GH.K() + this.GH.t();
                                var7_9 = 0.0;
                                if (var5_8 > var3_3) {
                                    var7_9 = var5_8 - var3_3;
                                }
                                GraphicsBufferAllocator.e(this.G(), this.W() + (double)var1_1, this.w() + var7_9, this.G5 - (double)var1_1);
                            }
                            var2_2 = true;
                        }
                        try {
                            block85: {
                                block69: {
                                    block71: {
                                        block70: {
                                            block83: {
                                                block67: {
                                                    block81: {
                                                        block66: {
                                                            if (this.GC == null) break block66;
                                                            try {
                                                                block79: {
                                                                    if (!this.H()) break block66;
                                                                    break block79;
                                                                    catch (Exception v11) {
                                                                        throw NumericTransformationEngine.b(v11);
                                                                    }
                                                                }
                                                                this.o(this.Gt);
                                                            }
                                                            catch (Exception v12) {
                                                                throw NumericTransformationEngine.b(v12);
                                                            }
                                                        }
                                                        this.B();
                                                        for (AbstractComputationKernel var4_10 : this.A()) {
                                                            if (!var4_10.f()) continue;
                                                            try {
                                                                block80: {
                                                                    if (var4_10.c()) continue;
                                                                    break block80;
                                                                    catch (Exception v13) {
                                                                        throw NumericTransformationEngine.b(v13);
                                                                    }
                                                                }
                                                                var4_10.E();
                                                            }
                                                            catch (Exception v14) {
                                                                throw NumericTransformationEngine.b(v14);
                                                            }
                                                        }
                                                        if (this.V() == 0.0) break block67;
                                                        if (!this.Gt) break block67;
                                                        break block81;
                                                        catch (Exception v15) {
                                                            throw NumericTransformationEngine.b(v15);
                                                        }
                                                    }
                                                    try {
                                                        block82: {
                                                            if (this.Gi == null) break block67;
                                                            break block82;
                                                            catch (Exception v16) {
                                                                throw NumericTransformationEngine.b(v16);
                                                            }
                                                        }
                                                        ConfigurationManager.S(this.Gi.G(), this.Gi.W() + (double)var1_1, this.Gi.w(), this.Gi.b() - (double)var1_1, this.l());
                                                        ConfigurationManager.A(this.Gi.G(), this.Gi.W(), this.Gi.w(), this.Gi.b(), this.l());
                                                        this.Gi.E();
                                                        this.B.b(this.G());
                                                        this.B.M(this.Gi.W() + this.Gi.b());
                                                        this.B.E();
                                                    }
                                                    catch (Exception v17) {
                                                        throw NumericTransformationEngine.b(v17);
                                                    }
                                                }
                                                if (!this.Gt) break block68;
                                                this.o();
                                                if (!this.Gg) break block69;
                                                break block83;
                                                catch (Exception v18) {
                                                    throw NumericTransformationEngine.b(v18);
                                                }
                                            }
                                            try {
                                                block84: {
                                                    if (this.E != CryptographicPolicyDescriptor.INSIDE) break block70;
                                                    break block84;
                                                    catch (Exception v19) {
                                                        throw NumericTransformationEngine.b(v19);
                                                    }
                                                }
                                                v20 = 3.0;
                                                break block71;
                                            }
                                            catch (Exception v21) {
                                                throw NumericTransformationEngine.b(v21);
                                            }
                                        }
                                        v20 = 0.0;
                                    }
                                    var3_5 = v20;
                                    try {
                                        v22 = this.Gi != null ? this.Gi.b() : 0.0;
                                    }
                                    catch (Exception v23) {
                                        throw NumericTransformationEngine.b(v23);
                                    }
                                    var5_8 = v22;
                                    var7_9 = this.d().R();
                                    var9_11 = (this.G5 - var5_8) / var7_9 * this.G5;
                                    var11_13 = this.W() + this.G5 - var9_11 - this.n / var7_9 * (this.G5 - var5_8);
                                    this.GH = new MetricsCalculationEngine(this.G() + this.w() - var3_5, var11_13, 2.0, var9_11);
                                    this.G_ = new MetricsCalculationEngine(this.G() + this.w() - var3_5, this.W() + var5_8, 2.0, this.G5 - var5_8);
                                    break block85;
                                }
                                try {
                                    v24 = this.Gi != null ? this.Gi.b() : 0.0;
                                }
                                catch (Exception v25) {
                                    throw NumericTransformationEngine.b(v25);
                                }
                                var3_6 = v24;
                                var5_8 = this.d().R();
                                var7_9 = this.W() + var3_6 - this.n / var5_8 * (this.G5 - var3_6);
                                var9_12 = (this.G5 - var3_6) / var5_8 * this.G5;
                                try {
                                    v26 = this.E == CryptographicPolicyDescriptor.INSIDE ? 3.0 : 0.0;
                                }
                                catch (Exception v27) {
                                    throw NumericTransformationEngine.b(v27);
                                }
                                var11_14 = v26;
                                this.GH = new MetricsCalculationEngine(this.G() + this.w() - var11_14, var7_9, 2.0, var9_12);
                                this.G_ = new MetricsCalculationEngine(this.G() + this.w() - var11_14, this.W() + var3_6, 2.0, this.G5 - var3_6);
                            }
                            this.a();
                        }
                        catch (Exception var3_7) {
                            TemporalMetadataResolver.W(var3_7);
                        }
                    }
                    try {
                        if (var2_2) {
                            GraphicsBufferAllocator.F();
                        }
                    }
                    catch (Exception v28) {
                        throw NumericTransformationEngine.b(v28);
                    }
                    try {
                        try {
                            if (!this.Gd) break block72;
                            v29 = this.G() - 0.5;
                            v30 = this.W() - 0.5;
                            v31 = this.w() + 1.0;
                            if (!var2_2) break block73;
                        }
                        catch (Exception v32) {
                            throw NumericTransformationEngine.b(v32);
                        }
                        v33 = this.G5 + 1.0;
                        break block74;
                    }
                    catch (Exception v34) {
                        throw NumericTransformationEngine.b(v34);
                    }
                }
                v33 = this.b() + 1.0;
            }
            ConfigurationManager.U(v29, v30, v31, v33 + 2.0, this.l().brighter(), 2.0f, 1.0f, 1.0f);
        }
    }

    public void t(double d2, double d3) {
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                abstractComputationKernel.b(abstractComputationKernel.G() + d2);
                abstractComputationKernel.M(abstractComputationKernel.W() + d3);
                if (!(abstractComputationKernel instanceof NumericTransformationEngine)) continue;
                ((NumericTransformationEngine)abstractComputationKernel).t(d2, d3);
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine.b(customSystemException);
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62EE;
        if (kb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = jb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])nb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    nb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericTransformationEngine.kb[n2] = n3;
        }
        return kb[n2];
    }

    public boolean O() {
        return this.Gt;
    }

    public EventDistributionHub d() {
        return this.v;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericTransformationEngine.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void X(boolean bl) {
        this.Y = bl;
    }

    public void G(boolean bl) {
        this.L = bl;
    }

    public void h(boolean bl) {
        block17: {
            try {
                if (ConfigurationManager.p()) {
                    long l = DataPacketValidator.K();
                    try {
                        if (l == 0L) {
                            throw new Exception("");
                        }
                        break block17;
                    }
                    catch (Exception exception) {
                        throw NumericTransformationEngine.b(exception);
                    }
                }
                try {
                    if (ReflectionMetadataResolver.PQ != null) {
                        GLContext.getCapabilities();
                    }
                }
                catch (Exception exception) {
                    throw NumericTransformationEngine.b(exception);
                }
            }
            catch (Exception exception) {
                this.w(bl);
                return;
            }
        }
        try {
            this.d().t();
            this.d().j();
            this.b();
            if (this.Gt) {
                this.R(this.V());
            }
        }
        catch (Exception exception) {
            throw NumericTransformationEngine.b(exception);
        }
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            if (!(abstractComputationKernel instanceof NumericTransformationEngine)) continue;
            NumericTransformationEngine numericTransformationEngine = (NumericTransformationEngine)abstractComputationKernel;
            try {
                try {
                    numericTransformationEngine.B();
                    if (numericTransformationEngine.c() && !bl) continue;
                }
                catch (Exception exception) {
                    throw NumericTransformationEngine.b(exception);
                }
                numericTransformationEngine.h(bl);
            }
            catch (Exception exception) {
                throw NumericTransformationEngine.b(exception);
            }
        }
    }

    public boolean j(double d2, double d3) {
        return this.C().O(d2, d3);
    }

    public static void p(int n) {
        V = n;
    }

    public void A() {
        this.h(false);
    }

    public void O(boolean bl) {
        this.Gd = bl;
    }

    @Override
    public void o(AbstractComputationKernel ... abstractComputationKernelArray) {
        for (AbstractComputationKernel abstractComputationKernel : abstractComputationKernelArray) {
            this.n(abstractComputationKernel, new Object[0]);
        }
    }

    public void R(double d2) {
        block5: {
            double d3 = this.d().R();
            try {
                try {
                    if (GraphicalRenderingController.d != null || d3 < this.G5) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
                if (!this.Gx) {
                    // empty if block
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine.b(customSystemException);
            }
        }
        this.e(d2);
    }

    @Override
    public void G() {
        this.i();
    }

    public boolean z() {
        return this.Gd;
    }

    public void i(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2) {
        this.v.O(abstractComputationKernel, abstractComputationKernel2);
        this.A();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean t() {
        return this.L;
    }

    public void u(boolean bl) {
        this.G4 = bl;
    }

    public void B(int n) {
        this.GZ = n;
    }

    public void a() {
        boolean bl;
        block8: {
            block7: {
                try {
                    try {
                        if (!this.s() && !this.Gz) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine.b(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine.b(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            this.D.C(bl2);
            this.GQ.C(bl2);
            if (this.L) {
                ConfigurationManager.o(this.G_.K(), this.G_.q(), this.G_.t(), this.G_.V(), this.GQ.k(), false, 1.0f, 0.5f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine.b(customSystemException);
        }
        ConfigurationManager.o(this.GH.K(), this.GH.q(), this.GH.t(), this.GH.V(), this.D.k(), false, 1.0f, 0.5f);
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

    private static Exception b(Exception exception) {
        return exception;
    }

    public double Q() {
        return this.G5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericTransformationEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NumericTransformationEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

