import java.util.Scanner;

public class BiggestBinaryGap {   
    public static void main(String[] args) {
        int number=0, biggestGap=0, maxStringLength=31, gap=0;

        System.out.println("Please, enter a decimal number to find it's biggest binary gap");
        Scanner numbeScanner = new Scanner(System.in);
        number = Integer.parseInt(numbeScanner.nextLine());             //Scanning the decimal number from user
        numbeScanner.close();
        
        StringBuilder bString = new StringBuilder(maxStringLength);     //preparing the Binary string variable
        bString.insert(0,Integer.toBinaryString(number));       //storing the binary string of the number in its variable

        System.out.println("Your number is: " + number + " which is: " + bString + " in binary");

        
                                    /**checking for the biggest binary gap**/
                                    
        for(int i=1; i<bString.length();i++){                       //looping through the whole binary string of the number
            if(bString.charAt(i)=='0')                              //we are not interested in charAt(0) since it's always 1
                gap++;
            else{                                                   //gap has ended
                if (gap>biggestGap)                                 //checking if gap is bigger than the previous biggest gap
                    biggestGap=gap;                                 
                gap=0;                                              //reseting gap to start measuring new gap
            }        
        }
        System.out.println("The biggest binary gap is:" + biggestGap);  
    }
}
