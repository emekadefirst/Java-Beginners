// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int temp = 32;
//         if (temp > 30){
//             System.out.println("It's a hot day!");
//         } 
//         else if (temp  > 20) {
//             System.out.println("Beautiful day");
//         } 
//         else {
//             System.out.println("Cold day");
//         }
            
//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte temp = scanner.nextByte();
        if (temp > 24) {
            System.out.println("The weather is hot");
            System.out.println("Wear light clothes");
        }
        else if (temp < 20){
            System.out.println("the weather is cold\nwear swaeter");
        }
        else 
            System.out.println("Invalid weather type");
        
    }
}