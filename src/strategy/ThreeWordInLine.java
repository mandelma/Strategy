package strategy;

import java.util.ArrayList;
import java.util.List;

public class ThreeWordInLine implements ListConverter {
    @Override
    public String listToString(String[] tiedot) {
        List<String> newList = new ArrayList<>(List.of(tiedot));
        String listToString = "";
        for(int i = 1; i < newList.size(); i++) {
            if(i % 3 == 0) {
                listToString += newList.get(i) + " " + "\n";
            } else {
                listToString += newList.get(i) + " ";
            }
        }
        return listToString;
    }
}
