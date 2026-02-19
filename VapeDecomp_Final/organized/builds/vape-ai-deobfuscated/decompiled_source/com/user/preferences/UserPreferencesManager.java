/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.annotations.SerializedName
 */
package com.user.preferences;

import com.deobfuscation.lifecycle.ComponentLifecyclePolicy;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.user.identity.UserIdentityManager;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UserPreferencesManager
implements ComponentLifecyclePolicy {
    @SerializedName(value="friendStates")
    private Map<Long, Boolean> a;
    @SerializedName(value="inventorySwitchMode")
    private Integer K;
    @SerializedName(value="showSelf")
    private Boolean y;
    @SerializedName(value="showInventoryKeybind")
    private JsonArray R;
    @SerializedName(value="partyShowTarget")
    private Boolean D;
    @SerializedName(value="showServer")
    private Boolean o;
    @SerializedName(value="autoLogin")
    private Boolean b;
    @SerializedName(value="shareInventory")
    private Boolean W;
    public static final UserPreferencesManager A = new UserPreferencesManager();
    @SerializedName(value="showUsername")
    private Boolean h;
    @SerializedName(value="pingKeybind")
    private JsonArray Z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Boolean j() {
        return this.o;
    }

    public Map<Long, Boolean> h() {
        return this.a;
    }

    public Boolean d() {
        return this.h;
    }

    public Boolean S() {
        return this.D;
    }

    public Boolean C() {
        try {
            if (this.W == null) {
                this.W = UserPreferencesManager.A.W;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        return this.W;
    }

    public Boolean g() {
        try {
            if (this.y == null) {
                this.y = UserPreferencesManager.A.y;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        return this.y;
    }

    public JsonArray X() {
        return this.R;
    }

    public Boolean M() {
        return this.b;
    }

    @Override
    public void S() {
        try {
            if (this.b == null) {
                this.b = (Boolean)SystemLifecycleController.C.q().f().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.a == null) {
                this.a = new LinkedHashMap<Long, Boolean>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.o == null) {
                this.o = (Boolean)SystemLifecycleController.C.q().v().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.h == null) {
                this.h = (Boolean)SystemLifecycleController.C.q().T().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.D == null) {
                this.D = (Boolean)SystemLifecycleController.C.q().P().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.W == null) {
                this.W = (Boolean)SystemLifecycleController.C.q().B().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.Z == null) {
                this.Z = SystemLifecycleController.C.q().X().w();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.R == null) {
                this.R = SystemLifecycleController.C.q().m().w();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.K == null) {
                this.K = SystemLifecycleController.C.q().t().V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
        try {
            if (this.y == null) {
                this.y = (Boolean)SystemLifecycleController.C.q().c().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserPreferencesManager.a(customSystemException);
        }
    }

    public Integer g() {
        return this.K;
    }

    static {
        A.S();
    }

    public JsonArray z() {
        return this.Z;
    }

    @Override
    public void C() {
        this.b = SystemLifecycleController.C.q().f().s();
        this.a.clear();
        for (UserIdentityManager userIdentityManager : TemporalMetadataResolver.h.M().q()) {
            try {
                if (!userIdentityManager.h()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw UserPreferencesManager.a(customSystemException);
            }
            this.a.put(userIdentityManager.s().r(), true);
        }
        this.o = SystemLifecycleController.C.q().v().s();
        this.h = SystemLifecycleController.C.q().T().s();
        this.D = SystemLifecycleController.C.q().P().s();
        this.W = SystemLifecycleController.C.q().B().s();
        this.Z = SystemLifecycleController.C.q().X().w();
        this.K = SystemLifecycleController.C.q().t().V();
        this.y = SystemLifecycleController.C.q().c().s();
        this.R = SystemLifecycleController.C.q().m().w();
    }
}

