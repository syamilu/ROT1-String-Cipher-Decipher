// Assignment 2 : String Cipher & Decipher
// Name: Wan Muhammad Syamil bin W Mohd Yusof
// Matric No : 2220561
// Section : 2
// Lecturer's Name : Ts. Dr. Muhamad Sadry Abu Seman

public class StringCipherDecipher {
    private static String text;
    private static boolean isCiphered = false;
    private boolean isInvalid = false;

    // constructor
    public StringCipherDecipher(String text) {
        if (!text.matches("[A-Za-z ]*")) {
            setInvalid();
        }
        StringCipherDecipher.text = text;
    }

    // cipher method
    public String cipher() {
        if (isInvalid) {
            return "Invalid text!";
        }

        StringBuilder cipheredText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    cipheredText.append((char) ((c + 1 - 65) % 26 + 65));
                } else {
                    cipheredText.append((char) ((c + 1 - 97) % 26 + 97));
                }
            } else {
                cipheredText.append(c);
            }
        }
        setCiphered();
        StringCipherDecipher.text = cipheredText.toString();
        return cipheredText.toString();
    }

    // setter for boolean
    public void setInvalid() {
        isInvalid = true;
    }

    // setter for boolean
    public void setCiphered() {
        isCiphered = true;
    }

    // getters (to check is there any text ciphered)
    public static String getText() {
        if (isCiphered) {
            return text;
        } else {
            return "No Ciphered Text Found!";
        }
    }

    // boolean getter
    public static Boolean getIsCiphered() {
        return isCiphered;
    }

    // decipher method
    public String decipher() {
        if (!isCiphered) {
            return "Invalid!";
        }

        StringBuilder decipheredText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    decipheredText.append((char) ((c - 1 - 65) % 26 + 65));
                } else {
                    decipheredText.append((char) ((c - 1 - 97) % 26 + 97));
                }
            } else {
                decipheredText.append(c);
            }
        }
        return decipheredText.toString();
    }
}
