package com.iquantex.paas.nacostest.exceptions;

public class NacosTestException extends RuntimeException {

    public NacosTestException(String message) {
        super(message);
    }

    public NacosTestException(Throwable cause) {
        super(cause);
    }
}
