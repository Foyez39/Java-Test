package string.problems;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWord {
    static void DuplicateWord(String str) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        String []s =str.split(" ");

        for(String tempString : s) {
            if(hm.get(tempString)!=null) {
                hm.put(tempString, hm.get(tempString)+1);
            }
            else {
                hm.put(tempString, 1);
            }
        }
        Iterator<String> tempString=hm.keySet().iterator();
        while(tempString.hasNext()) {
            String temp=tempString.next();
            if(hm.get(temp)>1) {
                System.out.println(temp + " "+ hm.get(temp));
            }
        }


    }

    public static void main(String[] args) {


        DuplicateWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

    }

}
