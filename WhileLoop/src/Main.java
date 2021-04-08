



public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number ++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;

            if(evenNumbersFound >=5) {
                break;
            }
            System.out.println("Even Number " + number);
        }

        int count = 6;

        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count !=6);

    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed the the method is
    // an even number or not.
    // return true if an even number, otherwise return false;


    public static boolean isEvenNumber(int number){
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
