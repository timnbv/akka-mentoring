package com.epam.akka.sample;

import java.io.Serializable;

/**
 * @author
 */
public class SomeMessage implements Serializable{
    private static final long serialVersionUID = 1L;
    private final Integer payload;

    public String getAbc() {
        return abc;
    }

    private final String abc;

    public SomeMessage(Integer payload, String abc) {
        this.payload = payload;
        this.abc = abc;
    }

    public Integer getPayload() {
        return payload;
    }
}
