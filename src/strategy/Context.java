package strategy;

import java.util.List;

public class Context {
    private ListConverter listConverter;

    public Context(ListConverter converter) {
        this.listConverter = converter;
    }

    public String executeConverter(String[] tiedot) {
        return listConverter.listToString(tiedot);
    }
}
