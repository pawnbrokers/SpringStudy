package com.kuang.config;
import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.kuang.pojo")
@Import(MyConfig2.class)
public class MyConfig {


//    @Bean
//    public User getUser() {
//        return new User();
//    }


}
