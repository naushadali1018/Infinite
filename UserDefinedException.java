//Userdefined Exception - ValidationException created
class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

class AgeValidator {

    public void checkAge(int age) throws ValidationException {
        if (age > 19) {
            throw new ValidationException("Not eligible to be selected");
        } else {
            System.out.println("Eligible to to be selected");
        }
    }
}

class UserDefinedException {

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        int[] ageList = {15, 16, 18, 17, 19, 20, 14, 15};
        for (int index : ageList) {
            try {
                validator.checkAge(index);
            } catch (ValidationException e) {
                //e.printStackTrace();
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
