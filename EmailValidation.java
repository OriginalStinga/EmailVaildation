import java.util.Scanner;

    /* Assignment 2 CCCS 300-765
       Question 3: Email Validation
       Brian Ngai
       Student ID: 261124429
     */
public class EmailValidation {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String email = input.nextLine().toLowerCase();

            int length = email.length();
            int lastCharacter = email.length() - 1;
            char i = email.charAt(0);
            String prefix = getPrefix(email);
            String domain = getDomain(email);

            /*while (i < lastCharacter) {
                char c = email.charAt(i);
                if (isAlphanumeric(c) && isValidPrefixChar(c) && isValidDomainChar(c)) ;
                {
                    i++;
                }
                if (isValidPrefix(prefix) && isValidDomain(domain) && exactlyOneAt(email))
                    System.out.println("Email is valid");
                else
                    System.out.println("Email is not valid");

            }*/





        }


        //1a)
        public static boolean isAlphanumeric(char x) {

            while ((x >= '0' && x <= '9') || (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') ) {
                return true;
            }
            return false;
        }

        //1b1)
        public static boolean isValidPrefixChar(char x) {
            if ((isAlphanumeric(x) == true) || (x == '-' || x == '.' || x == '_')) {
                return true;
            }
            return false;
        }

        //1b2)
        public static boolean isValidDomainChar(char x) {

            if ((isAlphanumeric(x) == true) || (x >= 'a' && x <= 'z') || (x == '-' || x == '.')) {
                return true;
            }
            return false;
        }

        //1c)
        public static boolean exactlyOneAt(String s) {
            int x = '@';
            if (s.indexOf(x) == s.lastIndexOf(x)) {
                return true;
            }
            return false;
        }

        //1d)
        public static String getPrefix(String string) {
            int i = string.indexOf("@");
            String prefix = string.substring(0, i);


            if (prefix.indexOf('.') == prefix.lastIndexOf(".")) {
                ;
                return prefix;
            } else
                return "Invalid email";
        }


        //1e)
        public static String getDomain(String string1) {
            int i = string1.indexOf("@");
            String domain = string1.substring(i + 1);
            return domain;
        }

        //1f)
        public static boolean isValidPrefix(String string2) {
            for (int i = 0; i < string2.length(); i++) {
                char c = string2.charAt(i);
                while ((string2.length() >= 1) && (isAlphanumeric(c)) && (isValidPrefixChar(c)) && (string2.indexOf('.') == string2.lastIndexOf(".")) );
                i++;
            return true;
            }
            return false;

      }
        public static boolean isValidDomain(String string3) {
            for (int i = 0; i < string3.length(); i++) {
                char c = string3.charAt(i);
                while ((string3.length() >= 1) && (isAlphanumeric(c)) && (isValidDomainChar(c)) && (string3.indexOf('.') == string3.lastIndexOf(".")) );
                i++;
                return true;
            }
            return false;

        }


    }
