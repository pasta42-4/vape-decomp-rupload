/*
 * Decompiled with CFR 0.152.
 */
package com.app.xml.generation;

import com.graph.structure.RecursiveNodeGraph;
import com.runtime.context.ContextualExecutionFramework;

public class XmlGenerator
extends ContextualExecutionFramework {
    @Override
    public boolean Y() {
        return true;
    }

    public XmlGenerator(String string) {
        super(string, 0, 0, RecursiveNodeGraph.K, "");
    }

    public XmlGenerator(String string, String string2) {
        super(string, 0, 0, RecursiveNodeGraph.K, string2);
    }

    public XmlGenerator(String string, RecursiveNodeGraph recursiveNodeGraph, String string2) {
        super(string, 0, 0, recursiveNodeGraph, string2);
    }
}

