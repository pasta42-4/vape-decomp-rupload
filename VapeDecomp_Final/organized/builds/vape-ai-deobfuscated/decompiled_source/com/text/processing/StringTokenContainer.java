/*
 * Decompiled with CFR 0.152.
 */
package com.text.processing;

import com.configuration.resolver.ConfigurationProfileResolver;

public class StringTokenContainer
extends ConfigurationProfileResolver<String, StringTokenContainer> {
    private String y;

    public StringTokenContainer X() {
        return StringTokenContainer.F(null, this.E(), (String)this.J());
    }

    public StringTokenContainer(Object object, String string, String string2) {
        super(object, string, string2);
    }

    @Override
    public void i(String string) {
        this.H(string);
    }

    public String toString() {
        return (String)this.J();
    }

    public static StringTokenContainer F(Object object, String string, String string2) {
        StringTokenContainer stringTokenContainer = new StringTokenContainer(object, string, string2);
        stringTokenContainer.Y(string);
        return stringTokenContainer;
    }

    private void Y(String string) {
        this.y = string;
    }

    public String E() {
        return this.y;
    }
}

