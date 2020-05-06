package com.kuang.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("user")
public class User {
    @Value("袁堂波")
    private String name;
}
