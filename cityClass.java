package exercises.Lists;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class cityClass {
    public static void main(String[] args) {
        String[] cityNames = {"Milano", "Bari", "Napoli"};
        List<String> array = new ArrayList<>(Arrays.asList(cityNames));
        array.set(1, "Tegucigalpa");
        System.out.println(array);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));









    }


}
