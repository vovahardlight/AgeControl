import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Dav", 22);
        ages.put("Dor", 21);
        ages.put("Bob", 43);
        ages.put("Bil", 34);
        ages.put("Dot", 27);

        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        int ageLimit = sc.nextInt();

        for (String emp : nameArr) {
            if (ages.get(emp) < ageLimit) {
                ages.remove(emp);
            }
        }

        System.out.println(ages);
    }
}



