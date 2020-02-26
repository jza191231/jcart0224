package io.jza.jcartadministrationback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletException;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClientException extends ServletException {

    private String errCodo;

    public ClientException(String errCodo,String errMsg){
        super(errMsg);
        this.errCodo = errCodo;
    }

    public String getErrCodo(){
        return errCodo;
    }
    public void setErrCodo(String errCodo){
        this.errCodo = errCodo;
    }
}
