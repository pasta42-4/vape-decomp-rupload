/*
 * Decompiled with CFR 0.152.
 */
package com.app.geo.mapping;

import com.app.security.AuthenticationService;
import com.reflection.metadata.ReflectionMetadataResolver933;

public class GeolocationInterpreter
extends AuthenticationService {
    char C;

    GeolocationInterpreter(char c) {
        this.C = c;
    }

    public String toString() {
        return ReflectionMetadataResolver933.B(Character.toString(this.C));
    }
}

