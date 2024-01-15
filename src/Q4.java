import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        char[] input = "helloworld".toCharArray();
        selectionSort(input);
        System.out.println(Arrays.toString(input));//test case

    }
    public static void selectionSort(char[] chars){

        for (int i = 0; i<chars.length; i++){
            int smallest = i;//sets smallest as index i.
            for (int j = i; j<chars.length; j++){
                if (Character.toLowerCase(chars[j]) < Character.toLowerCase(chars[smallest])){//if the character at index j comes before index smallest, set smallest to j
                    smallest = j;
                }
            }
            char temp = chars[i];//swaps chars[i] with chars[smallest]
            chars[i] = chars[smallest];
            chars[smallest] = temp;
        }
    }

}
