/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.user.identity;

import com.app.configuration.ConfigurationProfileManager1692;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.security.access.SecurityAccessController;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.event.management.EventDispatchProtocol;
import com.exception.system.CustomSystemException;
import com.execution.scheduling.TimedExecutionCoordinator;
import com.identifier.management.UniqueIdentifierManager1303;
import com.identity.management.UniversalIdentityManager;
import com.reflection.utils.ReflectionUtilityManager680;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.theme.ApplicationColorSchemeManager;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UserIdentityManager {
    protected String e;
    private boolean z;
    private ApplicationColorSchemeManager G = ApplicationColorSchemeManager.OFFLINE;
    private static String B;
    protected ReflectionUtilityManager680 t;
    private UUID X;
    private String p = "";
    private int u = -1;
    private boolean m = true;
    private boolean k;
    private ConfigurationProfileManager1692 w;
    private boolean i;
    @Nullable
    private String D;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String j() {
        return this.e;
    }

    public void J(UUID uUID, String string) {
        this.X = uUID;
        this.p = string;
    }

    public void A(String string) {
        this.e = string;
    }

    public void y(ApplicationColorSchemeManager applicationColorSchemeManager) {
        block14: {
            block15: {
                this.G = applicationColorSchemeManager;
                if (applicationColorSchemeManager.equals((Object)ApplicationColorSchemeManager.ONLINE)) {
                    TimedExecutionCoordinator timedExecutionCoordinator = new TimedExecutionCoordinator(CryptoConfigurationRegistry383.FRIENDS_ONLINE, "\u00a7f" + this.j() + " \u00a77is online", new SecurityAccessController("", CryptoConfigurationRegistry383.FRIENDS_ONLINE), 0.0, 0.0, 4000L);
                    boolean bl = true;
                    for (EventDispatchProtocol eventDispatchProtocol : TemporalMetadataResolver.h.c().q()) {
                        try {
                            if (!(eventDispatchProtocol instanceof TimedExecutionCoordinator) || !((TimedExecutionCoordinator)eventDispatchProtocol).U().equals(timedExecutionCoordinator.U())) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UserIdentityManager.a(customSystemException);
                        }
                        bl = false;
                        break;
                    }
                    try {
                        if (bl) {
                            TemporalMetadataResolver.h.c().h(timedExecutionCoordinator);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UserIdentityManager.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!this.i) break block14;
                        if (applicationColorSchemeManager != ApplicationColorSchemeManager.ONLINE) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UserIdentityManager.a(customSystemException);
                    }
                    TemporalMetadataResolver.h.j().p(this.w);
                    CipherTextProcessor.I();
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw UserIdentityManager.a(customSystemException);
                }
            }
            try {
                if (applicationColorSchemeManager == ApplicationColorSchemeManager.OFFLINE) {
                    TemporalMetadataResolver.h.j().y(this.w);
                    CipherTextProcessor.I();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw UserIdentityManager.a(customSystemException);
            }
        }
    }

    public UserIdentityManager(String string) {
        this(null, string);
    }

    public int hashCode() {
        return this.t.hashCode();
    }

    public void w(boolean bl) {
        this.k = bl;
    }

    public UserIdentityManager(UniqueIdentifierManager1303 uniqueIdentifierManager1303) {
        this(uniqueIdentifierManager1303.G());
        this.G = ApplicationColorSchemeManager.ONLINE;
        this.X = uniqueIdentifierManager1303.y();
        this.p = uniqueIdentifierManager1303.w();
        this.u = uniqueIdentifierManager1303.e();
    }

    public void B(@Nullable String string) {
        this.D = string;
    }

    public void f(boolean bl) {
        block5: {
            block4: {
                try {
                    try {
                        this.i = bl;
                        if (!bl) break block4;
                        if (this.G == ApplicationColorSchemeManager.OFFLINE) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UserIdentityManager.a(customSystemException);
                    }
                    TemporalMetadataResolver.h.j().p(this.w);
                    CipherTextProcessor.I();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw UserIdentityManager.a(customSystemException);
                }
            }
            TemporalMetadataResolver.h.j().y(this.w);
            CipherTextProcessor.I();
        }
    }

    public UserIdentityManager(ReflectionUtilityManager680 reflectionUtilityManager680, String string) {
        this.t = reflectionUtilityManager680;
        this.A(string);
        this.w = new ConfigurationProfileManager1692(this);
    }

    public void c(int n) {
        this.u = n;
    }

    public static String w() {
        return B;
    }

    public void n(UniversalIdentityManager universalIdentityManager) {
        this.G = ApplicationColorSchemeManager.t(universalIdentityManager.m());
        this.p = universalIdentityManager.v();
        this.X = universalIdentityManager.q();
        this.D = universalIdentityManager.u();
    }

    public String X() {
        return this.p;
    }

    public int M() {
        return this.u;
    }

    public boolean h() {
        return this.i;
    }

    public void G(boolean bl) {
        this.z = bl;
    }

    public UserIdentityManager(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this(reflectionUtilityManager680, reflectionUtilityManager680.C());
    }

    public UserIdentityManager(UniversalIdentityManager universalIdentityManager) {
        this(universalIdentityManager.d());
        this.G = ApplicationColorSchemeManager.t(universalIdentityManager.m());
        this.X = universalIdentityManager.q();
        this.p = universalIdentityManager.v();
        this.m = universalIdentityManager.d();
        this.D = universalIdentityManager.u();
    }

    public boolean W() {
        return this.m;
    }

    public boolean Z() {
        return this.k;
    }

    static {
        if (UserIdentityManager.w() != null) {
            UserIdentityManager.N("Xd9ng");
        }
    }

    public ReflectionUtilityManager680 s() {
        return this.t;
    }

    public ApplicationColorSchemeManager h() {
        return this.G;
    }

    public static void N(String string) {
        B = string;
    }

    public ConfigurationProfileManager1692 u() {
        return this.w;
    }

    public boolean B() {
        return this.z;
    }

    @Nullable
    public UUID J() {
        return this.X;
    }

    public boolean equals(Object object) {
        boolean bl;
        try {
            if (this == object) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserIdentityManager.a(customSystemException);
        }
        try {
            if (!(object instanceof UserIdentityManager)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserIdentityManager.a(customSystemException);
        }
        UserIdentityManager userIdentityManager = (UserIdentityManager)object;
        try {
            bl = this.t.r() == userIdentityManager.t.r();
        }
        catch (CustomSystemException customSystemException) {
            throw UserIdentityManager.a(customSystemException);
        }
        return bl;
    }

    public void x(boolean bl) {
        this.m = bl;
    }

    @Nullable
    public String V() {
        return this.D;
    }

    public void b(String string) {
        this.p = string;
    }
}

