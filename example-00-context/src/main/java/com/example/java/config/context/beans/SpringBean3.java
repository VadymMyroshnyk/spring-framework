package com.example.java.config.context.beans;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;

public class SpringBean3 {
    private final MessageDigest messageDigest;

    public SpringBean3(MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    public void printHash() {
        byte[] hashBytes = messageDigest.digest("test".getBytes());
        char[] hashString = Hex.encodeHex(hashBytes);
        System.out.println(hashString);
    }
}
