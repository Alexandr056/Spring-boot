package ru.otus.mainPackage.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class YamlProps {


    private StringUpperNumber message;

    public StringUpperNumber getMessage() {
        return message;
    }

    public void setMessage(StringUpperNumber message) {
        this.message = message;
    }
}
