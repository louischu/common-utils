package org.louis.rest.models;

/**
 * Created by luyenchu on 4/14/16.
 */
public class ObjectRequestModel<T> extends BaseRequestModel {
    private T data;

    public ObjectRequestModel() {
    }

    public ObjectRequestModel(T data) {
        this.data = data;
    }

    public ObjectRequestModel(String sessionId, T data) {
        super(sessionId);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
