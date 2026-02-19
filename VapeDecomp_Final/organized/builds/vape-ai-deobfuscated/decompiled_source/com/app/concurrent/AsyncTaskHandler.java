/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrent;

import a.KB;
import com.network.configuration.NetworkConfigurationManager2657;

public class AsyncTaskHandler
extends NetworkConfigurationManager2657 {
    public static void call() {
        new KB().fire();
    }
}

