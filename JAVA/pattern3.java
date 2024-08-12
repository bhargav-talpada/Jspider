// 1.  1                         2.    1
//     1 2                             2 2
//     1 2 3                           3 3 3
//     1 2 3 4                         4 4 4 4
//     1 2 3 4 5                       5 5 5 5 5

public class pattern3 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if (i>=j) {
        //             System.out.print(j + " ");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i>=j) {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
