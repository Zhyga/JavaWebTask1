package by.epam.array.validator;

public class Validation {
    public static boolean lineIsNumeric(String string){
        boolean isNumeric = string.matches("^\\d+( \\d+)*$");
        return isNumeric;
    }
}
