package org.grtsinry43.springbootquickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.grtsinry43.springbootquickstart.mapper")
public class SpringbootQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuickstartApplication.class, args);
    }

}
