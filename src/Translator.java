import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    HashMap<Integer, String> translator = new HashMap<>();

    public Translator (Integer[] numeric, String[] alphabetic){
        for (int i = 0; i < numeric.length; i++){
            translator.put(numeric[i],alphabetic[i]);
        }
    }

    public String translate(Integer number){
        return translator.get(number);
    }
}
