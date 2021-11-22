package strategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWordInLine implements ListConverter {
    @Override
    public String listToString(String[] tiedot) {
        String listToString = "";
        List<String> newList = new ArrayList<>();
        for(String item : tiedot) {
            newList.add(item);
        }
        int counter = 1;
        for(String listItem : newList) {
            if(counter % 2 == 0) {
                listToString += listItem + " "  + "\n";
            } else {
                listToString += listItem + " ";
            }
            counter++;
        }
        return listToString;
    }
}
