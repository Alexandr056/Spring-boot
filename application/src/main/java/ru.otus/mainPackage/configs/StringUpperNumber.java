package ru.otus.mainPackage.configs;

public class StringUpperNumber {
    private final String uppMsgNumber;

    public StringUpperNumber(String uppMsg, long number) {
        this.uppMsgNumber = uppMsg.toUpperCase() + "_" + number;
    }


    public String getUppMsgNumber() {
        return uppMsgNumber;
    }
}
