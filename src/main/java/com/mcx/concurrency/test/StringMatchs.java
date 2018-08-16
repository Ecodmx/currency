package com.mcx.concurrency.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatchs {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("export");
        list.add(".json");
        list.add("/message/");
        list.add("import");
        list.add("download");
        Iterator it = list.iterator();
        String path = "fdsejfoiaimportdownload";
        System.out.println(list.toString());
        Pattern.matches(".*(tree fiddy|3\\.50|three fifty).*", list.toString());
        /*
        System.out.println();
        */
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher("hello abc bbc cbc ccc");
        //find向前迭代
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
