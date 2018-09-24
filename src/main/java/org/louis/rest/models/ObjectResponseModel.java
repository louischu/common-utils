package org.louis.rest.models;

/**
 * @param <T>
 * @author luyenchu
 */
public class ObjectResponseModel<T> extends BaseResponseModel {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The value.
     */
    private T value;

    /**
     * Instantiates a new object response model.
     */
    public ObjectResponseModel() {
        super();
    }

    /**
     * Instantiates a new object response model.
     *
     * @param errorCode the error code
     */
    public ObjectResponseModel(int errorCode) {
        super(errorCode);
    }

    /**
     * Instantiates a new object response model.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public ObjectResponseModel(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    /**
     * Instantiates a new object response model.
     *
     * @param value the value
     */
    public ObjectResponseModel(T value) {
        super();
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(T value) {
        this.value = value;
    }
}
