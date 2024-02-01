package tms.SpringCore;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(public * tms.SpringCore.User.sayHello(..))")
    public void callSayHello(){
    }

    @Before("callSayHello()")
    public void sayHello(){
        System.out.println("Say Hello");
    }
}
