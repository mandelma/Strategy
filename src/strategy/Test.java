package strategy;

public class Test {
    public static void main(String[] args) {
        String[] lista = new String[7];
        lista[0] = "maanantai";
        lista[1] = "tiistai";
        lista[2] = "keskiviikko";
        lista[3] = "torstai";
        lista[4] = "perjantai";
        lista[5] = "lauantai";
        lista[6] = "sunnuntai";

        Context context = new Context(new OneWordInLine());

        System.out.println("Strategy 1:");
        System.out.println(context.executeConverter(lista));
        System.out.println("---------------------------------------------");

        context = new Context(new TwoWordInLine());
        System.out.println("Strategy 2:");
        System.out.println(context.executeConverter(lista));

        System.out.println("---------------------------------------------");

        context = new Context(new ThreeWordInLine());
        System.out.println("Strategy 3:");
        System.out.println(context.executeConverter(lista));
    }
}
