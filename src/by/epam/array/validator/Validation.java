package by.epam.array.validator;

public class Validation {
    public static boolean validate(String string){
        boolean isNumeric = string.matches("^\\d+( \\d+)*$");
        if(isNumeric){
            return true;
        }
        return false;
    }
}
