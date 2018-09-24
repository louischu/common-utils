package org.louis.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author luyenchu
 */
public class BaseResponseModel implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 8678642337966690260L;

    /**
     * The error code.
     */
    protected int errorCode;

    /**
     * The error message.
     */
    protected String errorMessage;

    /**
     * Instantiates a new base response model.
     */
    public BaseResponseModel() {
    }

    /**
     * Instantiates a new base response model.
     *
     * @param errorCode the error code
     */
    public BaseResponseModel(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Instantiates a new base response model.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public BaseResponseModel(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Gets the error message.
     *
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the error code.
     *
     * @param errorCode the new error code
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets the error message.
     *
     * @param errorMessage the new error message
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        return builder.build();
    }
}
