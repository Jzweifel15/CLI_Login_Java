package Security;

public class Secure {
    /**
     * A helper method that is used to encrypt passwords
     * @param password the password to be encrypted
     */
    public static String encrypt(String password) {
        char[] characters = password.toCharArray();
        String salted = new String();

        for (char x : characters) {
            switch(x) {
                // Alphanumeric chars
                case 'A':
                    salted += "W";
                    break;
                case 'a':
                    salted += "w";
                    break;
                case 'B':
                    salted += "V";
                    break;
                case 'b':
                    salted += "v";
                    break;
                case 'C':
                    salted += "U";
                    break;
                case 'c':
                    salted += "u";
                    break;
                case 'D':
                    salted += "T";
                    break;
                case 'd':
                    salted += "t";
                    break;
                case 'E':
                    salted += "S";
                    break;
                case 'e':
                    salted += "s";
                    break;
                case 'F':
                    salted += "R";
                    break;
                case 'f':
                    salted += "r";
                    break;
                case 'G':
                    salted += "Q";
                    break;
                case 'g':
                    salted += "q";
                    break;
                case 'H':
                    salted += "P";
                    break;
                case 'h':
                    salted += "p";
                    break;
                case 'I':
                    salted += "O";
                    break;
                case 'i':
                    salted += "o";
                    break;
                case 'J':
                    salted += "N";
                    break;
                case 'j':
                    salted += "n";
                    break;
                case 'K':
                    salted += "M";
                    break;
                case 'k':
                    salted += "m";
                    break;
                case 'L':
                    salted += "L";
                    break;
                case 'l':
                    salted += "l";
                    break;
                case 'M':
                    salted += "K";
                    break;
                case 'm':
                    salted += "k";
                    break;
                case 'N':
                    salted += "J";
                    break;
                case 'n':
                    salted += "j";
                    break;
                case 'O':
                    salted += "I";
                    break;
                case 'o':
                    salted += "i";
                    break;
                case 'P':
                    salted += "H";
                    break;
                case 'p':
                    salted += "h";
                    break;
                case 'Q':
                    salted += "G";
                    break;
                case 'q':
                    salted += "g";
                    break;
                case 'R':
                    salted += "F";
                    break;
                case 'r':
                    salted += "f";
                    break;
                case 'S':
                    salted += "E";
                    break;
                case 's':
                    salted += "e";
                    break;
                case 'T':
                    salted += "D";
                    break;
                case 't':
                    salted += "d";
                    break;
                case 'U':
                    salted += "C";
                    break;
                case 'u':
                    salted += "c";
                    break;
                case 'V':
                    salted += "B";
                    break;
                case 'v':
                    salted += "b";
                    break;
                case 'W':
                    salted += "A";
                    break;
                case 'w':
                    salted += "a";
                    break;
                case 'X':
                    salted += "Z";
                    break;
                case 'x':
                    salted += "z";
                    break;
                case 'Y':
                    salted += "Y";
                    break;
                case 'y':
                    salted += "y";
                    break;
                case 'Z':
                    salted += "X";
                    break;
                case 'z':
                    salted += "x";
                    break;

                //Numeric chars
                case '1':
                    x += 8;
                    salted += x;
                    break;
                case '2':
                    x += 5;
                    salted += x;
                    break;
                case '3':
                    x += 2;
                    salted += x;
                    break;
                case '4':
                    x += 2;
                    salted += x;
                    break;
                case '5':
                    x -= 2;
                    salted += x;
                    break;
                case '6':
                    x -= 2;
                    salted += x;
                    break;
                case '7':
                    x -= 5;
                    salted += x;
                    break;
                case '8':
                    x -= 8;
                    salted += x;
                    break;
                case '9':
                    x -= 8;
                    salted += x;
                    break;
                case '0':
                    x += 8;
                    salted += x;
                    break;

                // Symbols
                case '!':
                    salted += ']';
                    break;
                case '@':
                    salted += '}';
                    break;
                case '#':
                    salted += '>';
                    break;
                case '$':
                    salted += '{';
                    break;
                case '%':
                    salted += '[';
                    break;
                case '^':
                    salted += '/';
                    break;
                case '&':
                    salted += ')';
                    break;
                case '*':
                    salted += '(';
                    break;
                case '(':
                    salted += '*';
                    break;
                case ')':
                    salted += '&';
                    break;
                case '{':
                    salted += '$';
                    break;
                case '}':
                    salted += '@';
                    break;
                case '[':
                    salted += '%';
                    break;
                case ']':
                    salted += '!';
                    break;
                case '<':
                    salted += '?';
                    break;
                case '>':
                    salted += '#';
                    break;
                case '?':
                    salted += '<';
                    break;
                case '/':
                    salted += '^';
                    break;
                case '-':
                    salted += '=';
                    break;
                case '_':
                    salted += '+';
                    break;
                case '+':
                    salted += '_';
                    break;
                case '=':
                    salted += '-';
                    break;
            }
        }

        return salted;
    }

    /**
     * A helper method that is used to decrypt already encrypted passwords
     * @param encryptedPassword the already encrypted password to be decrypted
     */
    public static String decrypt(String encryptedPassword) {
        char[] characters = encryptedPassword.toCharArray();
        String salted = new String();

        for (char x : characters) {
            switch(x) {
                // Alphanumeric chars
                case 'W':
                    salted += "A";
                    break;
                case 'w':
                    salted += "a";
                    break;
                case 'V':
                    salted += "B";
                    break;
                case 'v':
                    salted += "b";
                    break;
                case 'U':
                    salted += "C";
                    break;
                case 'u':
                    salted += "c";
                    break;
                case 'T':
                    salted += "D";
                    break;
                case 't':
                    salted += "d";
                    break;
                case 'S':
                    salted += "E";
                    break;
                case 's':
                    salted += "e";
                    break;
                case 'R':
                    salted += "F";
                    break;
                case 'r':
                    salted += "f";
                    break;
                case 'Q':
                    salted += "G";
                    break;
                case 'q':
                    salted += "g";
                    break;
                case 'P':
                    salted += "H";
                    break;
                case 'p':
                    salted += "h";
                    break;
                case 'O':
                    salted += "I";
                    break;
                case 'o':
                    salted += "i";
                    break;
                case 'N':
                    salted += "J";
                    break;
                case 'n':
                    salted += "j";
                    break;
                case 'M':
                    salted += "K";
                    break;
                case 'm':
                    salted += "k";
                    break;
                case 'L':
                    salted += "L";
                    break;
                case 'l':
                    salted += "l";
                    break;
                case 'K':
                    salted += "M";
                    break;
                case 'k':
                    salted += "m";
                    break;
                case 'J':
                    salted += "N";
                    break;
                case 'j':
                    salted += "n";
                    break;
                case 'I':
                    salted += "O";
                    break;
                case 'i':
                    salted += "o";
                    break;
                case 'H':
                    salted += "P";
                    break;
                case 'h':
                    salted += "p";
                    break;
                case 'G':
                    salted += "Q";
                    break;
                case 'g':
                    salted += "q";
                    break;
                case 'F':
                    salted += "R";
                    break;
                case 'f':
                    salted += "r";
                    break;
                case 'E':
                    salted += "S";
                    break;
                case 'e':
                    salted += "s";
                    break;
                case 'D':
                    salted += "T";
                    break;
                case 'd':
                    salted += "t";
                    break;
                case 'C':
                    salted += "U";
                    break;
                case 'c':
                    salted += "u";
                    break;
                case 'B':
                    salted += "V";
                    break;
                case 'b':
                    salted += "v";
                    break;
                case 'A':
                    salted += "W";
                    break;
                case 'a':
                    salted += "w";
                    break;
                case 'Z':
                    salted += "X";
                    break;
                case 'z':
                    salted += "x";
                    break;
                case 'Y':
                    salted += "Y";
                    break;
                case 'y':
                    salted += "y";
                    break;
                case 'X':
                    salted += "Z";
                    break;
                case 'x':
                    salted += "z";
                    break;

                // Numeric chars
                case '1':
                    x += 8;
                    salted += x;
                    break;
                case '2':
                    x += 5;
                    salted += x;
                    break;
                case '3':
                    x += 2;
                    salted += x;
                    break;
                case '4':
                    x += 2;
                    salted += x;
                    break;
                case '5':
                    x -= 2;
                    salted += x;
                    break;
                case '6':
                    x -= 2;
                    salted += x;
                    break;
                case '7':
                    x -= 5;
                    salted += x;
                    break;
                case '8':
                    x -= 8;
                    salted += x;
                    break;
                case '9':
                    x -= 8;
                    salted += x;
                    break;
                case '0':
                    x += 8;
                    salted += x;
                    break;

                // Symbols
                case ']':
                    salted += '!';
                    break;
                case '}':
                    salted += '@';
                    break;
                case '>':
                    salted += '#';
                    break;
                case '{':
                    salted += '$';
                    break;
                case '[':
                    salted += '%';
                    break;
                case '/':
                    salted += '^';
                    break;
                case ')':
                    salted += '&';
                    break;
                case '(':
                    salted += '*';
                    break;
                case '*':
                    salted += '(';
                    break;
                case '&':
                    salted += ')';
                    break;
                case '$':
                    salted += '{';
                    break;
                case '@':
                    salted += '}';
                    break;
                case '%':
                    salted += '[';
                    break;
                case '!':
                    salted += ']';
                    break;
                case '?':
                    salted += '<';
                    break;
                case '#':
                    salted += '>';
                    break;
                case '<':
                    salted += '?';
                    break;
                case '^':
                    salted += '/';
                    break;
                case '=':
                    salted += '-';
                    break;
                case '+':
                    salted += '_';
                    break;
                case '_':
                    salted += '+';
                    break;
                case '-':
                    salted += '=';
                    break;
            }
        }

        return salted;
    }
}

