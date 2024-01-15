import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Prompts user to enter 10 animal names
        System.out.println("Enter the names of 10 different animals. Press enter after every name.");
        Scanner scanner = new Scanner(System.in);
        String[] animalNames = new String[10];
        for (int i = 0; i<10; i++){//stores the animal names in an array
            String animalName = scanner.nextLine();
            animalNames[i] = animalName;
        }
        sortNames(animalNames);//sorts the array using a method
        System.out.println("Alphabetically sorted names: " + Arrays.toString(animalNames));//prints the array
         }

    public static void sortNames(String[] names){
        for (int i = 0; i<names.length; i++){
            int smallest = i;//placeholder smallest index
            for (int j = i; j<names.length; j++){

                if (names[j].length() == 0){//Handles empty strings. All empty strings will be sorted to the front.
                    smallest = j;
                    break;
                }

                //Gets the first letter of each name in lowercase
                char firstLetterSmallest = Character.toLowerCase(names[smallest].strip().charAt(0));
                char firstLetterJ = Character.toLowerCase(names[j].strip().charAt(0));

                //Sets smallest to j if j is smaller than smallest.
                if (firstLetterSmallest >= firstLetterJ){
                    int k = 0;
                    int minChar = Math.min(names[smallest].strip().length(), names[j].strip().length());
                    while (k < minChar-1 && (Character.toLowerCase(names[smallest].strip().charAt(k)) == Character.toLowerCase(names[j].strip().charAt(k)))){//Will compare all characters in both names until there is a difference
                        k++;
                    }
                    if (Character.toLowerCase(names[smallest].strip().charAt(k)) > Character.toLowerCase(names[j].strip().charAt(k))){
                        smallest = j;
                    }
                }
            }

            //Swaps names[i] with names[smallest]
            String temp = names[i];
            names[i] = names[smallest];
            names[smallest] = temp;
        }
    }



}
