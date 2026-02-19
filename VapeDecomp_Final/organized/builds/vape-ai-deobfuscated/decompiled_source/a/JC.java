/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.runtime.reflection.ReflectionUtilityService;
import com.security.obfuscation.DataObfuscator;
import com.system.integration.SystemIntegrationProfile;

public class JC
extends DataObfuscator {
    public static JC Q(SystemIntegrationProfile systemIntegrationProfile) {
        return new JC(systemIntegrationProfile.K(), systemIntegrationProfile.Y, systemIntegrationProfile.W, systemIntegrationProfile.R);
    }

    public JC(int n, String string, String string2, String string3) {
        super(n, string, string2, string3);
    }

    public static JC U(int n, ReflectionUtilityService reflectionUtilityService) {
        return new JC(n, reflectionUtilityService.J().getName(), reflectionUtilityService.X(), reflectionUtilityService.K());
    }
}

