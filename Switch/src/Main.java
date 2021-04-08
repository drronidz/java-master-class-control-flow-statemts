public class Main {
    public static void main(String[] args) {
        int value = 3;

        if(value == 1) {
            System.out.println("Value was 1");
        }else if(value == 2) {
            System.out.println("Value was 3");
        }else{
            System.out.println("Was not 1 or 2");
        }


        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2: case 4: case 5:
                System.out.println("was a 3, or a 4 or a 5");
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found


        char charValue = 'G';

        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
            case 'C': case 'D': case 'E':
                System.out.println(charValue+ " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, OR  E");
        }
    }
}
