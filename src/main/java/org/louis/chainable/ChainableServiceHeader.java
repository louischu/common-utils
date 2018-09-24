package org.louis.chainable;

/**
 * Created by luyenchu on 6/24/16.
 */
public abstract class ChainableServiceHeader<H, T> {
    private ChainableServiceHeader<H, T> successor;

    public ChainableServiceHeader() {
    }

    public ChainableServiceHeader(ChainableServiceHeader successor) {
        this.successor = successor;
    }

    public T process(H header, T body) {
        T returnValue = this.processData(header, body);
        if (successor != null) {
            successor.process(header, body);
        }
        return returnValue;
    }

    public abstract T processData(H header, T body);

    public void setSuccessor(ChainableServiceHeader successor) {
        this.successor = successor;
    }
}
