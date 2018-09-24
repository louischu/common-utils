package org.louis.rest.models;

import java.io.Serializable;

/**
 * @author luyenchu
 */
public class BaseRequestModel implements Serializable {
    private static final long serialVersionUID = -8133028667758076782L;
    private String sessionId;

    public BaseRequestModel() {
    }

    public BaseRequestModel(String sessionId) {
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
