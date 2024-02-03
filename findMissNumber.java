// public class findMissNumber {

//     public static void main(String[] args) {
//         int total = 8;
//         int[] number = new int[] {1,2,3,4,5,6,8};

//         int expected_sum = total * ((total +  1) / 2);
//         int num_sum = 0;

//         for (int i : number) {
//             num_sum += i;
//         }
//         System.out.println(expected_sum - num_sum);
//     }   
// }
// Java program to find missing Number
public class findMissNumber {
    public static void main(String[] args) {
    int total;
    
    int[] numbers = new int[]{1, 3, 4, 5, 6, 7};
    total = 7;
    int expected_sum = total * ((total + 1) / 2);
    int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;
        }
    System.out.print( expected_sum - num_sum );
    }
}
    