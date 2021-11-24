package bsu.comp152;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listArrayConvert {

    public static void main(String[] args){
        var names = new String[]{"Cedric", "Maria", "Marcus", "James", "Devon", "Colton", "Sam"};
        List nameList = Arrays.asList(names);
        nameList = new ArrayList<String>(nameList);
        nameList.add("John");
        System.out.println(nameList);
    }
}
