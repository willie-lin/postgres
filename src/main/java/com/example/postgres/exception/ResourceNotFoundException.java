package com.example.postgres.exception;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.postgres.exception
 * @auther: YuAn
 * @Date: 2018/8/31
 * @Time: 16:24
 * @Project_name: postgres
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
