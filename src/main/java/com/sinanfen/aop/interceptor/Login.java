package com.sinanfen.aop.interceptor;

@InterceptorYolKesici
public class Login {
    public String isLogin(String data) {
        return "is Login: " + data;
    }
}
