package com.epam.training.interf.initial.consumer;

import com.epam.training.interf.initial.queue.AbstractQueue;

public abstract class AbstractConsumer {

    private AbstractQueue queue;

    public AbstractConsumer(AbstractQueue queue) {
        this.queue = queue;
    }

    public void consumeAvailable() {
        while (!queue.isEmpty()) {
            processNext(queue.dequeue());
        }
    }

    protected abstract void processNext(Integer item);

}
