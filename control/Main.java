// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }


// Comparison 
// public class Main {
//     public static void main(String[] args) {
//         int x = 1;
//         int y = 1;
//         System.out.println(x == y);
//         System.out.println(x > y);
//         System.out.println(x < y);
//         System.out.println(x != y);
//         System.out.println(x <= y);
//         System.out.println(x >= y);
//     }
// }

// Logical operators

// public class Main {
//     public static void main (String[] args) {
//         int temperature = 12;
//         boolean  isWarm = temperature > 20 && temperature < 30;
//         System.out.println(isWarm);
//     }
// }

public class Main {
    public static void main (String[] args) {
       boolean hasHighIncome = true;
       boolean hasGoodCredit = true;
       boolean hasCriminalRecord = false;
       boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }
}