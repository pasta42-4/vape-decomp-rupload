/*
 * Decompiled with CFR 0.152.
 */
package com.security.tokens;

import a.Ya;
import a._Y;
import a.a;
import a.xP;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.configuration.ResourceConfigManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.ProtocolInteractionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.dynamic.DynamicResourceAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.auth.AuthenticationGateway;
import com.security.context.SecurityContextManager2112;
import com.security.crypto.CryptographicContextManager567;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.streaming.CryptoStreamProcessor;
import com.state.management.AdaptiveStateManager;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.ConfigurationLoader;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicTokenGenerator
extends ContextualExecutionFramework {
    Ya R;
    private static final String[] r;
    private final AuthenticationStateTracker G;
    protected final AuthenticationStateTracker x;
    private final NumericPrecisionTransformer e;
    protected final GenericAdapterManager Z;
    private static final long[] j;
    private final ConnectionLifecycleManager b;
    private DynamicResourceAllocator O;
    private final ColorPaletteManager T;
    private final List<RecursiveNodeTreeBuilder> w;
    private final ColorPaletteManager P;
    private static final long d;
    private static final Object[] o;
    private xP N;
    private AdaptiveStateManager n;
    private static final Integer[] l;
    private static final Map m;
    private final AuthenticationStateTracker h;
    private final AuthenticationStateTracker B;

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

    protected ArrayList<Integer> u(ArrayList<Integer> arrayList) {
        arrayList.add(0, Math.abs(ApplicationLifecycleManager.k().v()));
        arrayList.add(0, Math.abs(ApplicationLifecycleManager.k().N()));
        if (arrayList.size() > 6) {
            try {
                for (int i = 6; i < arrayList.size(); ++i) {
                    arrayList.remove(i);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
        }
        return arrayList;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTokenGenerator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTokenGenerator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    protected AuthenticationGateway O(double[] dArray, float f) {
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Unable to fully structure code
     */
    public CryptographicTokenGenerator() {
        block3: {
            block2: {
                var1_1 = CryptographicTokenGenerator.d ^ 25124783656321L;
                super(a.cs((int)CryptographicTokenGenerator.a("l", (int)314, (long)(5854345978201887641L ^ var1_1))), (int)CryptographicTokenGenerator.a("l", (int)4920, (long)(7487252333326680448L ^ var1_1)), RecursiveNodeGraph.K, a.cs((int)CryptographicTokenGenerator.a("l", (int)9070, (long)(2450304838952579571L ^ var1_1))));
                this.N = new xP(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)26265, (long)(8927286804883715085L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.n = new AdaptiveStateManager(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)12917, (long)(7690798303012151532L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.O = new DynamicResourceAllocator(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)22708, (long)(2689916740946004531L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.x = AuthenticationStateTracker.R(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)5407, (long)(639801782294824860L ^ var1_1)), (long)64822679562522297L, (long)var1_1), false, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)3140, (long)(6444587129600073465L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.B = AuthenticationStateTracker.R(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)17861, (long)(5826232332057810793L ^ var1_1)), (long)64822679562522297L, (long)var1_1), false, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)26385, (long)(4734629029385614812L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.e = NumericPrecisionTransformer.t(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)8145, (long)(7122277195306749285L ^ var1_1)), (long)64822679562522297L, (long)var1_1), (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)22875, (long)(6665326024246791104L ^ var1_1)), (long)64822679562522297L, (long)var1_1), (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)27831, (long)(4947814574114455101L ^ var1_1)), (long)64822679562522297L, (long)var1_1), 0.0, 45.0, 90.0);
                this.G = AuthenticationStateTracker.R(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)57, (long)(6578796634037015187L ^ var1_1)), (long)64822679562522297L, (long)var1_1), true, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)22856, (long)(7005440662745746414L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.w = Arrays.asList(new RecursiveNodeTreeBuilder[]{new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)28457, (long)(6422199516630597095L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)26580, (long)(2455657046560814422L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)28146, (long)(629057532698181449L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)23210, (long)(7147009136427436095L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)21571, (long)(7948217359003813625L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)6953, (long)(746145238136834541L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)2224, (long)(5344099151409404468L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)18843, (long)(4280743055681330003L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)1596, (long)(3484854764718544048L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)5584, (long)(2543496474249709429L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)17219, (long)(164344204688822747L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)6651, (long)(8546392857380342650L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)10027, (long)(1824257781611787706L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)12175, (long)(142374597820546383L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)11973, (long)(6643894913454013507L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)5536, (long)(7295504819827132266L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)23063, (long)(5044377144528373931L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)20691, (long)(6634207317654176379L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)76, (long)(5128394979490747074L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)23739, (long)(4135127900588215820L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)16254, (long)(8141347166319046079L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)32284, (long)(753391144268770447L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)9405, (long)(1940427678916015736L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)28027, (long)(8343642696746581995L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)27013, (long)(3555351125950380826L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)17830, (long)(5924902689249203974L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)29808, (long)(4576175392661186254L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)5760, (long)(4614722670155252790L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)23554, (long)(3325331040129257109L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)25493, (long)(2155759571539931444L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)23844, (long)(2825869538014269368L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)3251, (long)(8313902126933073431L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)10052, (long)(7412742503881635323L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)31353, (long)(8342085061398440126L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)30021, (long)(5892248947466938323L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)32300, (long)(2641258529749511358L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)20245, (long)(4506904582725180829L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)30929, (long)(3954817852605770324L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)28121, (long)(2723913962792894294L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)32637, (long)(8292630574946528722L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)24121, (long)(837259166262824116L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)18625, (long)(1976883624303467112L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)8367, (long)(6462250743911019021L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)31076, (long)(7907262582484216788L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)29062, (long)(136496356034847551L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)16792, (long)(2653334301841331034L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)17456, (long)(4865850945716623094L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)12122, (long)(4737382424930745796L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)26338, (long)(1629075277902492715L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)6030, (long)(1433147945720956197L ^ var1_1)), (long)64822679562522297L, (long)var1_1)), new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)13674, (long)(6381120888168441816L ^ var1_1)), (long)64822679562522297L, (long)var1_1))});
                this.T = ColorPaletteManager.o(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)11818, (long)(3130931624060779679L ^ var1_1)), (long)64822679562522297L, (long)var1_1), (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)26853, (long)(4831249832932686408L ^ var1_1)), (long)64822679562522297L, (long)var1_1), ColorPaletteManager.g, this.w);
                this.h = AuthenticationStateTracker.R(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)24144, (long)(1532167094007368912L ^ var1_1)), (long)64822679562522297L, (long)var1_1), false, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)853, (long)(4002211203194016154L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.P = (ColorPaletteManager)ColorPaletteManager.r(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)11629, (long)(1443137443460841446L ^ var1_1)), (long)64822679562522297L, (long)var1_1), (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)17265, (long)(8898786529208046010L ^ var1_1)), (long)64822679562522297L, (long)var1_1), ColorPaletteManager.U, new RecursiveNodeTreeBuilder[]{new RecursiveNodeTreeBuilder((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)19861, (long)(7422093442765332310L ^ var1_1)), (long)64822679562522297L, (long)var1_1))}).R((String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)5360, (long)(8164489532266956382L ^ var1_1)), (long)64822679562522297L, (long)var1_1));
                this.R = null;
                this.b = ConfigurationRegistry.O;
                if (GeometryCalculator.C() >= 35) ** GOTO lbl19
                try {
                    if (GeometryCalculator.C() != 13) break block2;
lbl19:
                    // 2 sources

                    this.Z = GenericAdapterManager.I(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)19242, (long)(4538886027099412891L ^ var1_1)), (long)64822679562522297L, (long)var1_1), (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)30312, (long)(576663665865761999L ^ var1_1)), (long)64822679562522297L, (long)var1_1), this.N.w(), new NetworkConnectionEstablisher[]{this.N.w(), this.n.w()});
                    break block3;
                }
                catch (CustomSystemException v0) {
                    throw CryptographicTokenGenerator.a(v0);
                }
            }
            this.Z = GenericAdapterManager.I(this, (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)12968, (long)(7517651338810384411L ^ var1_1)), (long)64822679562522297L, (long)var1_1), (String)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)8944, (long)(3812034286224306297L ^ var1_1)), (long)64822679562522297L, (long)var1_1), this.N.w(), new NetworkConnectionEstablisher[]{this.N.w(), this.n.w(), this.O.w()});
        }
        this.B.l(new ConfigurationProfileResolver[]{this.e});
        this.G.l(new ConfigurationProfileResolver[]{this.T});
        this.h.l(new ConfigurationProfileResolver[]{this.P});
        this.N(new ConfigurationProfileResolver[]{this.Z, this.x, this.B, this.e, this.G, this.T, this.h, this.P});
        this.b.y(this, 6);
    }

    static AdaptiveConfigurationManager z(CryptographicTokenGenerator cryptographicTokenGenerator, int n) {
        return cryptographicTokenGenerator.q(n);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5264;
        if (CryptographicTokenGenerator.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ay", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTokenGenerator.l[n2] = n3;
        }
        return CryptographicTokenGenerator.l[n2];
    }

    protected int c(int n) {
        return this.V(n, false);
    }

    public boolean E() {
        return false;
    }

    protected double[] B(double[] dArray, double d2, double d3, int n) {
        double d4 = dArray[0];
        double d5 = new BigDecimal(String.valueOf(dArray[1] + 0.5 + d3)).doubleValue();
        double d6 = dArray[2];
        if (n == 6) {
            d4 = new BigDecimal(String.valueOf(d4 + 1.0)).doubleValue();
            d6 = new BigDecimal(String.valueOf(d6 + 0.5 - d2)).doubleValue();
        } else if (n == 8) {
            d4 = new BigDecimal(String.valueOf(d4)).doubleValue();
            d6 = new BigDecimal(String.valueOf(d6 + 0.5 + d2)).doubleValue();
        } else if (n == 7) {
            d4 = new BigDecimal(String.valueOf(d4 + 0.5 + d2)).doubleValue();
            d6 = new BigDecimal(String.valueOf(d6 + 1.0)).doubleValue();
        } else if (n == 5) {
            d4 = new BigDecimal(String.valueOf(d4 + 0.5 - d2)).doubleValue();
            d6 = new BigDecimal(String.valueOf(d6)).doubleValue();
        }
        return new double[]{d4, d5, d6};
    }

    /*
     * Exception decompiling
     */
    private AdaptiveConfigurationManager q(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    protected float J(int n) {
        double d2 = _Y.T();
        if (n == 6) {
            d2 = 90.0;
        } else if (n == 8) {
            d2 = 270.0;
        } else if (n == 7) {
            d2 = 0.0;
        } else if (n == 5) {
            d2 = 180.0;
        }
        return (float)Math.min(2.0 + this.U(_Y.T(), d2) / 8.0, 12.0);
    }

    private static Field c(long l, long l2) {
        int n = CryptographicTokenGenerator.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTokenGenerator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTokenGenerator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTokenGenerator.a(clazz3, string2, clazz2)) != null) {
                    CryptographicTokenGenerator.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTokenGenerator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTokenGenerator.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTokenGenerator.b(226452782198999L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicTokenGenerator.d = MultiContainerRegistry.a(-7736053969280542902L, -8024852020852947538L, MethodHandles.lookup().lookupClass()).a(177311738538072L);
                CryptographicTokenGenerator.o = new Object[5];
                CryptographicTokenGenerator.r = new String[5];
                CryptographicTokenGenerator.a();
                CryptographicTokenGenerator.m = new HashMap<K, V>(13);
                var0 = CryptographicTokenGenerator.d ^ 39138118326952L;
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
                var8_3 = new long[79];
                var5_4 = 0;
                var6_5 = "N%\u00b7N\u00d5\u0091\u00b0\u00a4it\r\u00e2\u009cF\u0017m\\:i\u008e\u00e6\u0082\u00b4\u000ep\u00e5\u008b\u009fQ\u00af\u00b7\u00fa(\u00dc\u00b3\u00dcr\u0013\u00a6\u000e\u009e\u0015\u000f\u00a4\u00d0\u0016\u00cb\u008a\u0094\u00d0T\u008b\u00f9\u00e7\u00e1\u001b;@Q\\\u00a2\u0084\u00e7\u00faw\u00f1#\u00f5\u008f\u00f5\u0016T\u009a8\u001b\u0094?\u00b4Q\u00cfH\u00b8\u00c5\u00e9_\u009e\u00e4<s?\u0088#B\u0003W-n\u00e8wi\u00bb^_\u009a\u00ed\u00a6\u00b5\u00e2\u00c5i\u00ac\u000b\u00feq\u00c8\u0014\nO\u00dbQ\u001aj\u00fcq\u00e8\u0095\u00fb\u00b2<\u0089\u00cf\u00d5\u0001\u00a8}\n\u00fc8w\u00d5\u00db]\u00ac\u00bbH\u0083\u00f5\u00ee\u00d2O\u00ae\u001f-\u00ff\u009de]8Q\u00b2M\u00f2p\u00cep:\u00f9\u00b9^b\u00a6\u00b1\u00b5\u0091j,\u00d7v\u00fb\u001e(,\f\n\u00aa\u00a6oA+\u00f0\\q\u00c1\u00b8\u00f3\u0013\u00c1\u001f\u008dpLk\u00df~\u0099\u00af\u00d1\u0001VK\u0019\u008bJ\u009a\u008f\u00fa&\u00ce\u00e9nB\u00a4\u00db\u00e1\u00e3\u0084$N\u00c6\u00eav?>\u00aab\u0082\u00eb\u00aeiY\u00ce\u00cc\u00b5\u00d7R\u008f\u009b\u0095\u00c9k\u001c\u0084\u0098\u008f\u009aTV\t|\u0002\u00e2\u00bbR\u00de\u0019\u00c4\u00ff\u0019O\u00cc\u00a92\u00f4?\u00ac\u00d8\u00f3R*\u00a2Cx\u00f3Q\u00e3Co\u0098u\u00cb;\u00f7\u00c9\u00ed\b\u009e\u00feo\u0089^\u00ea\u0007d,\u0004*D}\u00b37\u00b8y\u009fG\u00d8\u00bflJ\u0086H\u00e2h\u00e1\u00c1`\u001c\u008e\u008b\u00b0\u001d\u00f4\u0000\u0018~\u00dd6\f:\u00c7\u00fd\u00cer)/[f\u00c9\u00e7\u00dc\u00eca\u00b2\u009c\u00b9\u00f0{\u00eaqm\u00df\\yLC@\u0004\u00c9\r\u000b\u001bu\u00e8\u00f0\u00ca\u00ac\u008e\u00e4\u001d\u00b3\u00ea\u000f\u0014lXS\u00e9;I\u00ca\u0090\u0019\u00ee\u0088\u00c3\u0093\u008d[\u0006\u00da\u00ed\u00c45\u0002\u001egY\u00e6\u00d4/\u00ae\b\u00a8\u00a6\u0006\u0085{\u00cb\u0019\u00b2(I\u0088l\u00de\u0099\u00d4}X\u00aa\u00fa4\u00bcU\u00ae\u00e0\u00fajv\u0093bX\u00b5&X\u00de\u007f\u0017\u009d\u0096\u00c0\u00ae\u00da\u00c3\u00ec+$\u00b1f\u00dar\u0095\u009e\u00c0\u00b9,\u00cc\u00dd\u00c1&\u0006\u00cfz_\u00c6\u00af\u000f\u0018\u00ff\\\u00b4\u00dcc\u00c2\u00e7\u00e3\u00cb\u0096V\u009e\u008f\u009f\u00f0nt\u00f83\u00bc\u00f5\u00fe\u0099\u0004\u00b0\u00ce\u00c2\u00cay\u0010v`(N}\u00b1\u00d7V\u00db\u00be\u0087\u00ca\u00ed\\\u00c4\u009ae\u00d9\u00afF\u00b9^\u00bfg\u00bc\u0001\u00a6\u00e1\u007fBN\u00bco~Q,\u001a\u00a9hg\u00db5\u00cb\u0005\u0081\u00c4\u00b9W9\b\u00cam:\u0092\u00b5\u00e5\"\u00f0\u001d\u001a\u0005<\u00c5i\u0017\u00d6\u00b5\u00b7\r\u0004\u00d8\u0082e|\u008e\u0099\u00b5\u0001V\u0006!{z\u0007N\u00dc\u00ce\u0084\u0017?\u00cb2],|&97L\u00d2\u00a2\u0018\u0004C.\u00f0\u00c1\u00be?";
                var7_6 = "N%\u00b7N\u00d5\u0091\u00b0\u00a4it\r\u00e2\u009cF\u0017m\\:i\u008e\u00e6\u0082\u00b4\u000ep\u00e5\u008b\u009fQ\u00af\u00b7\u00fa(\u00dc\u00b3\u00dcr\u0013\u00a6\u000e\u009e\u0015\u000f\u00a4\u00d0\u0016\u00cb\u008a\u0094\u00d0T\u008b\u00f9\u00e7\u00e1\u001b;@Q\\\u00a2\u0084\u00e7\u00faw\u00f1#\u00f5\u008f\u00f5\u0016T\u009a8\u001b\u0094?\u00b4Q\u00cfH\u00b8\u00c5\u00e9_\u009e\u00e4<s?\u0088#B\u0003W-n\u00e8wi\u00bb^_\u009a\u00ed\u00a6\u00b5\u00e2\u00c5i\u00ac\u000b\u00feq\u00c8\u0014\nO\u00dbQ\u001aj\u00fcq\u00e8\u0095\u00fb\u00b2<\u0089\u00cf\u00d5\u0001\u00a8}\n\u00fc8w\u00d5\u00db]\u00ac\u00bbH\u0083\u00f5\u00ee\u00d2O\u00ae\u001f-\u00ff\u009de]8Q\u00b2M\u00f2p\u00cep:\u00f9\u00b9^b\u00a6\u00b1\u00b5\u0091j,\u00d7v\u00fb\u001e(,\f\n\u00aa\u00a6oA+\u00f0\\q\u00c1\u00b8\u00f3\u0013\u00c1\u001f\u008dpLk\u00df~\u0099\u00af\u00d1\u0001VK\u0019\u008bJ\u009a\u008f\u00fa&\u00ce\u00e9nB\u00a4\u00db\u00e1\u00e3\u0084$N\u00c6\u00eav?>\u00aab\u0082\u00eb\u00aeiY\u00ce\u00cc\u00b5\u00d7R\u008f\u009b\u0095\u00c9k\u001c\u0084\u0098\u008f\u009aTV\t|\u0002\u00e2\u00bbR\u00de\u0019\u00c4\u00ff\u0019O\u00cc\u00a92\u00f4?\u00ac\u00d8\u00f3R*\u00a2Cx\u00f3Q\u00e3Co\u0098u\u00cb;\u00f7\u00c9\u00ed\b\u009e\u00feo\u0089^\u00ea\u0007d,\u0004*D}\u00b37\u00b8y\u009fG\u00d8\u00bflJ\u0086H\u00e2h\u00e1\u00c1`\u001c\u008e\u008b\u00b0\u001d\u00f4\u0000\u0018~\u00dd6\f:\u00c7\u00fd\u00cer)/[f\u00c9\u00e7\u00dc\u00eca\u00b2\u009c\u00b9\u00f0{\u00eaqm\u00df\\yLC@\u0004\u00c9\r\u000b\u001bu\u00e8\u00f0\u00ca\u00ac\u008e\u00e4\u001d\u00b3\u00ea\u000f\u0014lXS\u00e9;I\u00ca\u0090\u0019\u00ee\u0088\u00c3\u0093\u008d[\u0006\u00da\u00ed\u00c45\u0002\u001egY\u00e6\u00d4/\u00ae\b\u00a8\u00a6\u0006\u0085{\u00cb\u0019\u00b2(I\u0088l\u00de\u0099\u00d4}X\u00aa\u00fa4\u00bcU\u00ae\u00e0\u00fajv\u0093bX\u00b5&X\u00de\u007f\u0017\u009d\u0096\u00c0\u00ae\u00da\u00c3\u00ec+$\u00b1f\u00dar\u0095\u009e\u00c0\u00b9,\u00cc\u00dd\u00c1&\u0006\u00cfz_\u00c6\u00af\u000f\u0018\u00ff\\\u00b4\u00dcc\u00c2\u00e7\u00e3\u00cb\u0096V\u009e\u008f\u009f\u00f0nt\u00f83\u00bc\u00f5\u00fe\u0099\u0004\u00b0\u00ce\u00c2\u00cay\u0010v`(N}\u00b1\u00d7V\u00db\u00be\u0087\u00ca\u00ed\\\u00c4\u009ae\u00d9\u00afF\u00b9^\u00bfg\u00bc\u0001\u00a6\u00e1\u007fBN\u00bco~Q,\u001a\u00a9hg\u00db5\u00cb\u0005\u0081\u00c4\u00b9W9\b\u00cam:\u0092\u00b5\u00e5\"\u00f0\u001d\u001a\u0005<\u00c5i\u0017\u00d6\u00b5\u00b7\r\u0004\u00d8\u0082e|\u008e\u0099\u00b5\u0001V\u0006!{z\u0007N\u00dc\u00ce\u0084\u0017?\u00cb2],|&97L\u00d2\u00a2\u0018\u0004C.\u00f0\u00c1\u00be?".length();
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
                    var6_5 = "\u008eEZ\u0018\u00af\u009cX\u00ea}p\b-\u0082\u00de\u0019\"";
                    var7_6 = "\u008eEZ\u0018\u00af\u009cX\u00ea}p\b-\u0082\u00de\u0019\"".length();
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
        CryptographicTokenGenerator.j = var8_3;
        CryptographicTokenGenerator.l = new Integer[79];
    }

    protected boolean T(LightweightExecutionContext lightweightExecutionContext) {
        return this.v(lightweightExecutionContext);
    }

    protected int y() {
        block19: {
            double d2;
            block18: {
                block17: {
                    block16: {
                        d2 = (_Y.T() + 180.0f) % 360.0f;
                        try {
                            try {
                                if (!(d2 > 315.0) && !(d2 <= 45.0)) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            return 7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (!(d2 > 45.0) || !(d2 <= 135.0)) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                        return 8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!(d2 > 135.0) || !(d2 <= 225.0)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                    return 5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
            }
            try {
                try {
                    if (!(d2 > 225.0) || !(d2 <= 315.0)) break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                return 6;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
        }
        return 0;
    }

    protected boolean b() {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (((NetworkConnectionEstablisher)this.Z.J()).equals(this.O.w()) || ((NetworkConnectionEstablisher)this.Z.J()).equals(this.n.w())) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator.a(customSystemException);
                                }
                                if (!this.h.s().booleanValue()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            if (!this.P.d(ApplicationLifecycleManager.U().a())) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    protected void e() {
        try {
            if (this.R != null) {
                this.R.q(false);
                this.R.X(true);
                ConfigurationCalibrator.b.v(this.R);
                this.R = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
    }

    protected boolean P(double[] dArray, double[] dArray2, int n, Double d2, int n2) {
        block18: {
            block16: {
                try {
                    try {
                        if (n <= 4 || dArray[this.m(n)] == dArray2[this.m(n)]) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
            }
            try {
                block17: {
                    try {
                        try {
                            if (n < 5 && Math.abs(dArray[0] - dArray2[0]) >= 4.0) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                        if (!(Math.abs(dArray[2] - dArray2[2]) >= 4.0)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
        }
        try {
            if (dArray[1] != dArray2[1]) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        double[] dArray3 = this.j(dArray, -n2, n);
        try {
            if (_Y.X(dArray3, dArray2) > d2 + 2.0) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return false;
    }

    protected void Z() {
    }

    protected int J() {
        int n;
        block32: {
            double d2;
            double d3;
            block31: {
                block30: {
                    double d4;
                    double d5;
                    double d6;
                    double d7;
                    block29: {
                        double d8;
                        block28: {
                            double d9;
                            double d10;
                            block27: {
                                block26: {
                                    block25: {
                                        block24: {
                                            n = 0;
                                            double d11 = (_Y.T() + 180.0f) % 360.0f;
                                            d7 = Math.abs(d11 - 0.0);
                                            d6 = Math.abs(d11 - 45.0);
                                            d8 = Math.abs(d11 - 90.0);
                                            d3 = Math.abs(d11 - 135.0);
                                            d2 = Math.abs(d11 - 180.0);
                                            d10 = Math.abs(d11 - 225.0);
                                            d9 = Math.abs(d11 - 270.0);
                                            d5 = Math.abs(d11 - 315.0);
                                            d4 = Math.abs(d11 - 360.0);
                                            try {
                                                try {
                                                    if (!(d5 < d9) || !(d5 < d4)) break block24;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicTokenGenerator.a(customSystemException);
                                                }
                                                if (!(d5 < d7)) break block24;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator.a(customSystemException);
                                            }
                                            n = 1;
                                            break block32;
                                        }
                                        try {
                                            try {
                                                if (!(d6 < d7) || !(d6 < d4)) break block25;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator.a(customSystemException);
                                            }
                                            if (!(d6 < d8)) break block25;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator.a(customSystemException);
                                        }
                                        n = 2;
                                        break block32;
                                    }
                                    try {
                                        if (!(d3 < d8) || !(d3 < d2)) break block26;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTokenGenerator.a(customSystemException);
                                    }
                                    n = 3;
                                    break block32;
                                }
                                try {
                                    if (!(d10 < d2) || !(d10 < d9)) break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator.a(customSystemException);
                                }
                                n = 4;
                                break block32;
                            }
                            try {
                                if (!(d9 < d10) || !(d9 < d5)) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            n = 6;
                            break block32;
                        }
                        try {
                            if (!(d8 < d6) || !(d8 < d3)) break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                        n = 8;
                        break block32;
                    }
                    try {
                        try {
                            try {
                                if (d7 < d6 && d7 < d5) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            if (!(d4 < d6)) break block31;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                        if (!(d4 < d5)) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                }
                n = 7;
                break block32;
            }
            try {
                if (!(d2 < d3) || !(d2 < 225.0)) break block32;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
            n = 5;
        }
        return n;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTokenGenerator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTokenGenerator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTokenGenerator.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTokenGenerator.o[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTokenGenerator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    protected boolean q(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        try {
            if (!this.G.s().booleanValue()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        try {
            bl = !this.T.q(lightweightExecutionContext);
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTokenGenerator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    protected float i(float[] fArray) {
        return (float)Math.min(2.0 + this.U(_Y.T(), fArray[0]) / 8.0, 12.0);
    }

    protected boolean O() {
        return this.x.s();
    }

    protected boolean f() {
        return this.B.s();
    }

    protected double h(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        double d2 = systemConfigurationOrchestrator.V();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d2));
        try {
            if (Math.abs(bigDecimal.doubleValue() - (double)bigDecimal.intValue()) == 0.5) {
                return AdaptiveComputationEngine.Q(d2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return AdaptiveComputationEngine.Q(d2 - 1.0);
    }

    protected void Q(int n) {
        ApplicationLifecycleManager.U().l().A(n);
    }

    protected void A() {
        this.e();
        this.P();
        CryptoStreamProcessor.D();
        CryptoStreamProcessor.A();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ay" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected int z(ArrayList<Integer> arrayList) {
        try {
            if (ResourceAllocationManager.b()) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        int n = 0;
        for (Integer n2 : arrayList) {
            int n3 = n2;
            n += n3;
        }
        return n;
    }

    protected double[] j(double[] dArray, int n, int n2) {
        double d2 = dArray[0];
        double d3 = dArray[1];
        double d4 = dArray[2];
        if (n2 == 1) {
            d2 += (double)n;
            d4 += (double)n;
        } else if (n2 == 2) {
            d2 -= (double)n;
            d4 += (double)n;
        } else if (n2 == 3) {
            d2 -= (double)n;
            d4 -= (double)n;
        } else if (n2 == 4) {
            d2 += (double)n;
            d4 -= (double)n;
        } else if (n2 == 6) {
            d2 += (double)n;
        } else if (n2 == 8) {
            d2 -= (double)n;
        } else if (n2 == 7) {
            d4 += (double)n;
        } else if (n2 == 5) {
            d4 -= (double)n;
        }
        return new double[]{d2, d3, d4};
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ay" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected int m(int n) {
        int n2;
        try {
            n2 = n % 2 == 0 ? 2 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return n2;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 54;
                break;
            }
            case 1: {
                n3 = 41;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 20;
                break;
            }
            case 5: {
                n3 = 52;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 7;
                break;
            }
            case 9: {
                n3 = 6;
                break;
            }
            case 10: {
                n3 = 32;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 28;
                break;
            }
            case 14: {
                n3 = 58;
                break;
            }
            case 15: {
                n3 = 35;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 18;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 21;
                break;
            }
            case 20: {
                n3 = 14;
                break;
            }
            case 21: {
                n3 = 42;
                break;
            }
            case 22: {
                n3 = 43;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 50;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 8;
                break;
            }
            case 31: {
                n3 = 48;
                break;
            }
            case 32: {
                n3 = 55;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 31;
                break;
            }
            case 40: {
                n3 = 5;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 33;
                break;
            }
            case 46: {
                n3 = 16;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 38;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 45;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 25;
                break;
            }
            case 57: {
                n3 = 17;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 56;
                break;
            }
            case 60: {
                n3 = 12;
                break;
            }
            case 61: {
                n3 = 53;
                break;
            }
            case 62: {
                n3 = 27;
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
        CryptographicTokenGenerator.r[n4] = new String(cArray);
        return n4;
    }

    protected int f(boolean bl) {
        block12: {
            int n;
            block14: {
                LightweightExecutionContext lightweightExecutionContext;
                block13: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        if (systemConfigurationOrchestrator.Y()) {
                            return 0;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                    try {
                        if (!GameVersionEnumerator.MC_1_21_4.H()) {
                            return 0;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                    boolean bl2 = systemConfigurationOrchestrator.M().G();
                    lightweightExecutionContext = systemConfigurationOrchestrator.G(SecurityContextManager2112.e());
                    try {
                        try {
                            try {
                                if (!this.T(lightweightExecutionContext)) break block12;
                                if (bl) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            if (!bl2) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                        n = 64;
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                }
                n = lightweightExecutionContext.J();
            }
            return n;
        }
        return 0;
    }

    protected double[] T(double[] dArray, double d2, int n) {
        double d3 = dArray[0];
        double d4 = dArray[1];
        double d5 = dArray[2];
        double d6 = 0.45 + Math.random() * 0.2;
        if (n == 6) {
            d3 = new BigDecimal(String.valueOf(d3 + d6)).doubleValue();
            d5 = new BigDecimal(String.valueOf(d5 + 0.5 - d2)).doubleValue();
        } else if (n == 8) {
            d3 = new BigDecimal(String.valueOf(d3 + 1.0 - d6)).doubleValue();
            d5 = new BigDecimal(String.valueOf(d5 + 0.5 + d2)).doubleValue();
        } else if (n == 7) {
            d3 = new BigDecimal(String.valueOf(d3 + 0.5 + d2)).doubleValue();
            d5 = new BigDecimal(String.valueOf(d5 + d6)).doubleValue();
        } else if (n == 5) {
            d3 = new BigDecimal(String.valueOf(d3 + 0.5 - d2)).doubleValue();
            d5 = new BigDecimal(String.valueOf(d5 + 1.0 - d6)).doubleValue();
        }
        d4 = new BigDecimal(String.valueOf(d4 + 1.0)).doubleValue();
        return new double[]{d3, d4, d5};
    }

    private static Method d(long l, long l2) {
        int n = CryptographicTokenGenerator.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicTokenGenerator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicTokenGenerator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTokenGenerator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTokenGenerator.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTokenGenerator.b(226452782198999L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTokenGenerator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTokenGenerator.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTokenGenerator.b(226452782198999L, 0L);
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
    public String H() {
        return this.Z.p();
    }

    protected int V(int n, boolean bl) {
        int n2;
        block17: {
            n2 = this.f(bl);
            boolean bl2 = ApplicationLifecycleManager.U().M().G();
            if (n == 0) {
                int n3;
                int n4;
                block19: {
                    LightweightExecutionContext lightweightExecutionContext;
                    block18: {
                        lightweightExecutionContext = ApplicationLifecycleManager.U().a();
                        try {
                            try {
                                try {
                                    if (!this.T(lightweightExecutionContext)) break block17;
                                    n4 = n2;
                                    if (bl) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator.a(customSystemException);
                                }
                                if (!bl2) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            n3 = 64;
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                    }
                    n3 = lightweightExecutionContext.J();
                }
                n2 = n4 + n3;
            } else {
                int n5;
                try {
                    int n6 = n5 = n == 1 ? 36 : 9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                while (n5 < 45) {
                    block20: {
                        int n7;
                        int n8;
                        block22: {
                            LightweightExecutionContext lightweightExecutionContext;
                            block21: {
                                lightweightExecutionContext = ApplicationLifecycleManager.U().t().T(n5).y();
                                try {
                                    try {
                                        try {
                                            if (!this.T(lightweightExecutionContext)) break block20;
                                            n8 = n2;
                                            if (bl) break block21;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator.a(customSystemException);
                                        }
                                        if (!bl2) break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTokenGenerator.a(customSystemException);
                                    }
                                    n7 = 64;
                                    break block22;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator.a(customSystemException);
                                }
                            }
                            n7 = lightweightExecutionContext.J();
                        }
                        n2 = n8 + n7;
                    }
                    ++n5;
                }
            }
        }
        return n2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == '\u00c8' || c == 'j' || c == 'M') {
                field = CryptographicTokenGenerator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTokenGenerator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    protected int l() {
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().l().F(i);
            try {
                try {
                    if (!lightweightExecutionContext.r() || !this.v(lightweightExecutionContext)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                return i;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
        }
        return -1;
    }

    protected boolean O(double d2, double d3, double d4) {
        if (GeometryCalculator.C() == 13) {
            d3 -= 1.0;
        }
        TransactionCorrelationEngine transactionCorrelationEngine = ApplicationLifecycleManager.c().R(d2, d3, d4);
        return transactionCorrelationEngine.equals(ResourceConfigManager.D());
    }

    protected void b(float[] fArray, float f) {
        block6: {
            block5: {
                try {
                    if (this.R instanceof AuthenticationGateway) {
                        this.e();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                try {
                    if (this.R != null) break block5;
                    this.R = new Ya(fArray[0], fArray[1]);
                    this.R.L(Math.min(Math.max(2.0f, f), 12.0f));
                    this.R.F(true);
                    this.R.N(0.5f);
                    this.R.J(true);
                    this.R.q(true);
                    ConfigurationCalibrator.b.W(this.R);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
            }
            this.R.L(Math.min(Math.max(2.0f, f), 12.0f));
            this.R.v(fArray[0], fArray[1]);
        }
    }

    protected int Z(SystemConfigurationOrchestrator systemConfigurationOrchestrator, LightweightExecutionContext lightweightExecutionContext) {
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext2 = systemConfigurationOrchestrator.l().F(i);
            try {
                try {
                    if (!lightweightExecutionContext2.r() || !lightweightExecutionContext2.C().equals(lightweightExecutionContext.C())) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                return i;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
        }
        return -1;
    }

    protected void a(double[] dArray, float f, int n, double[] dArray2) {
        block14: {
            Ya ya;
            block12: {
                block13: {
                    String string;
                    block10: {
                        block11: {
                            long l = d ^ 0x57D8013EF324L;
                            string = ConnectionConfigurationResolver.d();
                            try {
                                try {
                                    ya = this.R;
                                    if (string == null) break block10;
                                    if (ya instanceof AuthenticationGateway) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator.a(customSystemException);
                                }
                                this.e();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                        }
                        ya = this.R;
                    }
                    try {
                        try {
                            try {
                                if (string == null) break block12;
                                if (ya != null) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator.a(customSystemException);
                            }
                            this.R = new ConfigurationLoader(this, dArray[0], dArray[1], dArray[2], n, dArray2);
                            this.R.L(Math.min(Math.max(2.0f, f), 12.0f));
                            this.R.F(true);
                            this.R.N(0.0f);
                            this.R.q(true);
                            this.R.J(true);
                            ConfigurationCalibrator.b.W(this.R);
                            if (string != null) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator.a(customSystemException);
                        }
                        AbstractComputationKernel.I(new String[3]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                }
                this.R.L(Math.min(Math.max(2.0f, f), 12.0f));
                ya = this.R;
            }
            ((AuthenticationGateway)ya).q(dArray[0], dArray[1], dArray[2]);
        }
    }

    protected boolean a(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (!this.h.s().booleanValue()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return this.P.d(lightweightExecutionContext);
    }

    @Override
    public void v() {
        this.b.b(this);
        GraphicalRenderingController.D(CryptographicContextManager567.class).v(this);
    }

    protected double Z() {
        return (Double)this.e.J();
    }

    protected double U(double d2, double d3) {
        double d4;
        double d5 = Math.abs(d2 - d3);
        double d6 = Math.abs(360.0 - d2 + d3);
        try {
            d4 = d5 <= d6 ? d5 : d6;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return d4;
    }

    protected boolean L(double[] dArray) {
        return this.O(dArray[0], dArray[1], dArray[2]);
    }

    @Override
    public void h() {
        GraphicalRenderingController.D(CryptographicContextManager567.class).r(this);
    }

    @Override
    public double e(double d2, boolean bl) {
        int n;
        long l;
        block13: {
            block12: {
                l = d ^ 0x1E8AE96B658CL;
                try {
                    try {
                        if (this.O() && !ApplicationLifecycleManager.U().Y()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                    return 0.0;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
            }
            n = 2;
            if (((NetworkConnectionEstablisher)this.Z.J()).equals(this.N.w())) {
                n = 0;
            } else {
                try {
                    if (!((NetworkConnectionEstablisher)this.Z.J()).equals(this.n.w()) && !((NetworkConnectionEstablisher)this.Z.J()).equals(this.O.w())) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                n = 1;
            }
        }
        int n2 = this.V(n, true);
        Color color = new Color(255, 20, 20);
        if (n2 >= 32) {
            color = new Color(2, 190, 58);
        } else if (n2 >= 16) {
            color = new Color(255, 249, 18);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().q();
        String string = String.valueOf(n2);
        double d3 = (double)ApplicationLifecycleManager.e() / 4.0 / TemporalMetadataResolver.h.a().b();
        double d4 = cryptographicParameterGenerator.l(string, true);
        double d5 = d3 - d4 / 2.0;
        if (bl) {
            string = string + " \u00a77(" + this.O() + (String)((Object)CryptographicTokenGenerator.c("E", (int)CryptographicTokenGenerator.a("l", (int)9878, (long)(0x6F21C1966E949C01L ^ l)), (long)7560210827162412724L, (long)l));
        }
        cryptographicParameterGenerator.t(string, d5 + 1.0, d2, color, true);
        return cryptographicParameterGenerator.g(string, true);
    }

    protected int k(int n) {
        int n2;
        try {
            n2 = n % 2 == 0 ? 0 : 2;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
        return n2;
    }

    protected void P() {
        try {
            if (ServiceLifecycleController.c.k() != null) {
                ServiceLifecycleController.c.I(ServiceLifecycleController.c.k());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenGenerator.a(customSystemException);
        }
    }

    protected boolean v(LightweightExecutionContext lightweightExecutionContext) {
        ProtocolInteractionController protocolInteractionController;
        block9: {
            block8: {
                try {
                    try {
                        if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
            }
            protocolInteractionController = lightweightExecutionContext.C();
            try {
                try {
                    if (!this.q(lightweightExecutionContext) && this.a(lightweightExecutionContext)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator.a(customSystemException);
            }
        }
        return protocolInteractionController.B(ReflectionMetadataResolver.YX);
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "]2W";
        objectArray[1] = Integer.TYPE;
        CryptographicTokenGenerator.r[1] = "java/lang/Integer";
        objectArray[2] = "\n\u0006P@\u0002r\u0001\tA\u000f\u007fj\u0012\u000eHF";
        objectArray[3] = "|Ks\t\u0017CwDbFvM|Of\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "<H\r\n/*7DVdu+P\u0018]\u001ap`\"\\\u0000\u001c'PiX\u0006\u0005s);\u0011T\u001c\u001e";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTokenGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptographicTokenGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

