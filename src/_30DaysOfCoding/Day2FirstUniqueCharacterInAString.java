package _30DaysOfCoding;

public class Day2FirstUniqueCharacterInAString {

    public static int uniqueCharacterInAString(String input) {
        int count = 0;
        for (int pickingEachChar = 0; pickingEachChar < input.length(); pickingEachChar++){
            for (int element = 0 ; element < input.length() ; element++){
                if (input.charAt(pickingEachChar) == input.charAt(element)){
                    count++;
                }
            }
            if (count == 1){
                return pickingEachChar;
            }
            count = 0;
        }
        return -1;
    }
}
