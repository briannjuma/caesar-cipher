package brayocodes;

public class Decoder {
    private int shiftKey;
    private String userInput;

    public String getUserInput(){
        return userInput;
    }
    public int getShiftKey(){
        return shiftKey;
    }

    public Decoder( String plainText, int shift){
        userInput = plainText;
        shiftKey = shift;
    }

    public boolean isKeyValid(){
        return shiftKey>1 && shiftKey<26;
    }
    public boolean isNotEmpty() {
        return !userInput.trim().isEmpty();
    }


    // The Decode Method
    public String decrypt(){
        String intialText="";
        String initialTextArray[] = userInput.split("");
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<initialTextArray.length; i++){
            if (userInput.charAt(i) ==' '){
                intialText +="";
            }
            else {
                int characterPosition = alphabet.indexOf(userInput.charAt(i));
                int shift = (shiftKey - characterPosition) % 26;
                if (shift < 0){
                    shift = alphabet.length() + shift;
                }

                char result = alphabet.charAt(shift);
                intialText += result;
            }
        }

        return intialText;
    }
}
