import java.util.Scanner;

public class keypad {
    public int digit_count = 15;
    public int code_one,code_two,code_three,key;
    public boolean power = true; //  CMOS battery is on

    public static void main(String[] args) {
        System.out.println("WARNING: Make sure the CMOS battery is at a good level. Power loss will permantly prevent access.");
        keypad start_keypad = new keypad();
    }

    public keypad(){
        Scanner sc = new Scanner(System.in); 

        while ( power )
            {
            while ( String.valueOf(code_one).length() != 5 ){
                System.out.println("Person 1 Enter Code:");
                code_one = sc.nextInt();
                if ( String.valueOf(code_one).length() != 5 )  System.out.println("Error code must be 5 digits"); 
            }

            while ( String.valueOf(code_one).length() != 5 ){
                System.out.println("Person 1 Enter Code:");
                code_one = sc.nextInt();
                if ( String.valueOf(code_one).length() != 5 )  System.out.println("Error code must be 5 digits"); 
            }

            while ( String.valueOf(code_two).length() != 5 ){
                System.out.println("Person 2 Enter Code:");
                code_two = sc.nextInt();
                if ( String.valueOf(code_two).length() != 5 )  System.out.println("Error code must be 5 digits"); 
            }
            
            while ( String.valueOf(code_three).length() != 5 ){
                System.out.println("Person 3 Enter Code:");
                code_three = sc.nextInt();
                if ( String.valueOf(code_three).length() != 5 )  System.out.println("Error code must be 5 digits"); 
            }
            
            if ( key == key && key == generateKey( code_one, code_two, code_three ) ){
                System.out.println( "Stored key: " + key + "\n Generated Key: " + generateKey( code_one, code_two, code_three ) );
            } 

            if ( key == 0 ){
                key=generateKey( code_one, code_two, code_three );
                System.out.println( "Saved " + key + " to memory as the Key");
            } 

            code_one = 0; 
            code_two = 0;
            code_three = 0;
        }
    }

    public int generateKey(int one, int two, int three){
        
        return one + two + three;
    }
}