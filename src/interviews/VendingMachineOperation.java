package interviews;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineOperation {

    public static void main(String[] args) {
        System.out.println(getChanges(100, 25));
    }

    public static Map <Integer, Integer> getChanges(int moneyIn, int cost) {
        int remaining = moneyIn - cost;
        System.out.println("Remaining "+remaining);
        Map <Integer, Integer> changes = new HashMap <Integer, Integer>();
        int[] centValues = {1, 5, 10, 21, 25};

        boolean isFixed = false;

        for (int i = centValues.length - 1; i > 1; i--) {
            if (remaining / centValues[i] != 0 && remaining % centValues[i] == 0) {
                changes.put(centValues[i], remaining / centValues[i]);
                isFixed = true;
                break;
            }
        }

        if (!isFixed) {
            int last = centValues.length - 1;
            if(remaining / centValues[last] != 0){
                changes.put(centValues[last], remaining / centValues[last]);
            }
            int remainder = remaining % centValues[last];
            int indicator = remainder;
            System.out.println("Remainder "+indicator);
            int prevCent = 1;
            while (indicator > 0) {
                int nextChange = centValues[last - prevCent];
                System.out.println("Next Change : "+nextChange);
                System.out.println(remainder / nextChange);
                if (remainder / nextChange != 0) {
                    changes.put(nextChange, remainder / nextChange);
                    indicator = indicator % nextChange;
                    remainder = remainder - (remainder / nextChange)*nextChange;
                    System.out.println(indicator +" "+ remainder);
                }
                prevCent++;
            }
        }
        return changes;
    }

}
