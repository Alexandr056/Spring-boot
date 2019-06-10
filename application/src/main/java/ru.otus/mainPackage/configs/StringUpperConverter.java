package ru.otus.mainPackage.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class StringUpperConverter implements Converter<String, StringUpperNumber> {
    private static final Logger logger = LoggerFactory.getLogger(StringUpperConverter.class);

    @Override
    public StringUpperNumber convert(String source) {
        logger.info("converting, string:" + source);
        return new StringUpperNumber(source.toUpperCase(), System.currentTimeMillis());
    }
}
