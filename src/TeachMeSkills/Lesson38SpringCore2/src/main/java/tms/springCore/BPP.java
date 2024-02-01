package tms.springCore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BPP implements BeanPostProcessor {  // процесс через который проходят все бины, можно вставить комментарий
                                                    // или дополн данные

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("user")){
            User user = (User) bean;
            user.setCode("345");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
