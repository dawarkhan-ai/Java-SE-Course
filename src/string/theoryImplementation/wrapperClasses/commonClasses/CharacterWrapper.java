package string.theoryImplementation.wrapperClasses.commonClasses;

public class CharacterWrapper {
    public static void main(String[] args) {
        // Creating a Character object
        Character charObj = Character.valueOf('A');

        // Performing operations with Character class
        System.out.println("Character Object: " + charObj);
        System.out.println("Character to String: " + charObj.toString());
        System.out.println("Is 'A' a letter: " + Character.isLetter(charObj));
        System.out.println("Is '1' a digit: " + Character.isDigit('1'));
    }
}


