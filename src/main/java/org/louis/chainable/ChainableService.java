package org.louis.chainable;

/**
 * Created by luyenchu on 6/24/16.
 */
public abstract class ChainableService<T> {
    private ChainableService<T> successor;

    public ChainableService() {
    }

    public ChainableService(ChainableService successor) {
        this.successor = successor;
    }

    public T process(T body) {
        T returnValue = this.processData(body);
        if (successor != null) {
            returnValue = successor.process(returnValue);
        }
        return returnValue;
    }

    protected abstract T processData(T body);

    public void setSuccessor(ChainableService successor) {
        this.successor = successor;
    }
}
