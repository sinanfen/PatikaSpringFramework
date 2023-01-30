package com.sinanfen.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciMainWork {

    @AroundInvoke
    public Object loglama(InvocationContext context) {
        System.out.println("ilk hali: " + context.getMethod().getName());

        //kullanıcı: giriş yapmış mı
        boolean isLogin = false; //yol kesici olacak değişken
        Object isContinue = null; //eğer yol kesilmezse devam et

        if (isLogin) {
            //önce sisteme giriş yapsın
            System.out.println("önce sisteme giriş yapınız");
            return null;
        } else {
            try {
                isContinue = context.proceed();//devam etmesini sağlamak
                System.out.println("sonraki hali: " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
