package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerators {
    public static String randomStringGenerator() {
        return RandomStringUtils.randomAlphabetic(5);
    }
}
