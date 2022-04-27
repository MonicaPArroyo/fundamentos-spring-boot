package com.fundamentos.springboot.fundamentosSP.configuration;

import com.fundamentos.springboot.fundamentosSP.bean.MyBean;
import com.fundamentos.springboot.fundamentosSP.bean.MyBean2Implement;
import com.fundamentos.springboot.fundamentosSP.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }
}
