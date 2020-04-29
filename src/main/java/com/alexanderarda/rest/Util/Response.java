package com.alexanderarda.rest.Util;

import lombok.Getter;
import lombok.Setter;

/*Generic Method*/
@Setter /*Setter*/
@Getter /*Getter*/
public class Response{
    private String service;
    private String message;
    private Object data;
}
