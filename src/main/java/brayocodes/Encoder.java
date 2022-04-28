package brayocodes;

public class Encoder {

    // encapsulation was implimented by maintaining private properties and using getter methods for outside access

    // private keys
    private int shiftKey;
    private String userInput;

    // getter methods
    public String getUserInput(){
        return userInput;
    }
    public int getShiftKey(){
        return shiftKey;
    }

    public Encoder( String plainText, int shift){
        userInput = plainText;
        shiftKey = shift;
    }

    // input validation
    public boolean isKeyValid(){
        return shiftKey>1 && shiftKey<26;   // shift key has to be a value between 1 and 25
    }
    public boolean isNotEmpty(){
        return !userInput.trim().isEmpty();     // validation for user input
    }


    // encryption method

    public String encrypt(){
        String cipherText="";
        String cipherTextArray[]=userInput.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i < cipherTextArray.length; i++){
            if (userInput.charAt(i) ==' '){
                cipherText += " ";
            }
            else {
                int characterPosition = alphabet.indexOf(userInput.charAt(i));
                int shift = (shiftKey+characterPosition) % 26;
                cipherText += alphabet.charAt(shift);
            }

        }
        return cipherText.toUpperCase();    // Ensure application output is also in uppercase to maintain uniformity with input

    }

}
