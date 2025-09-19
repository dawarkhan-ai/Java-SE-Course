package exceptions.theoryImplementation.types.custom;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CheckedExceptionExample {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("You must be 18 or older to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try{
            checkEligibility(16);
        } catch(InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
