package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneWordInLine implements  ListConverter {

    public OneWordInLine() {

    }
    @Override
    public String listToString(String[] tiedot) {
        List<String> currentList = new ArrayList<String>(List.of(tiedot));
        String listToString = "";
        Iterator<String> itList = currentList.iterator();
        while(itList.hasNext()) {
            listToString += itList.next() + "\n";
        }

        return listToString;
    }
}
