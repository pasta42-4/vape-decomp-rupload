/*
 * Decompiled with CFR 0.152.
 */
package com.processing.iteration;

import com.graphics.rendering.GraphicsRenderEngine;
import java.util.Iterator;
import java.util.ListIterator;

class BatchSequenceIterator
implements Iterator {
    final GraphicsRenderEngine v;
    final ListIterator K;

    @Override
    public boolean hasNext() {
        return this.K.hasPrevious();
    }

    public Object next() {
        return this.K.previous();
    }

    @Override
    public void remove() {
        this.K.remove();
    }

    BatchSequenceIterator(GraphicsRenderEngine graphicsRenderEngine, ListIterator listIterator) {
        this.v = graphicsRenderEngine;
        this.K = listIterator;
    }
}

