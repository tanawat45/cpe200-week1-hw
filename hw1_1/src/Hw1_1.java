/**
 * Implement countEvenNum method which receives an array of integer and return the count of even number.
 **/
public class Hw1_1 {
    public int countEvenNum(int[] inputs)
    {
        int x=0;
        for(int a=0;a<inputs.length;a++){
            if(inputs[a]%2==0) x++;
        }return x;
    }
    public static void main(String[] args) {
        Hw1_1 h = new Hw1_1();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Number of event number is %d\n", h.countEvenNum(inputs));
    }
}
