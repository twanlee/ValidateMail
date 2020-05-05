public class Test {
    public static final String[] valid = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidateMail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
            ValidateMail validateEmail = new ValidateMail();
            for (String email : valid){
                Boolean isValid = validateEmail.validate(email);
                System.out.println("Email "+email+" is valid : " + isValid);
            }
            for (String email: invalidateMail){
                Boolean isValid = validateEmail.validate(email);
                System.out.println("Email "+email+" is valid : " + isValid);
            }


    }
}
