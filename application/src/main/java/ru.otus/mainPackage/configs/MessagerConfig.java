package ru.otus.mainPackage.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagerConfig {

    @Bean
    public ru.otus.MessagerConfig createConfig() {
        return new ru.otus.MessagerConfig("From User config");
    }

}
