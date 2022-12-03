package com.codercrope.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxValidator {

    public static boolean checkRegex(String s, String task) {
        switch (s) {
            case "TXT_NAME":
                Pattern userNamePattern = Pattern.compile("^[a-z0-9]{4,}$");
                Matcher matcher = userNamePattern.matcher(task);
                return matcher.matches();
            case "TXT_EMAIL":
                Pattern emailPattern = Pattern.compile("^([a-z|0-9]{3,})[@]([a-z]{2,})\\.(com|lk)");
                Matcher emailMatcher = emailPattern.matcher(task);
                return emailMatcher.matches();
        }
        return false;
    }
}
