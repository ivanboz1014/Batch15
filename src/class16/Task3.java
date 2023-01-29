package class16;

public class Task3 {


        void isPalindrome(String str){

            StringBuilder st = new StringBuilder(str);
            st.reverse();
            String reversed = st.toString();


            if (str.equals(reversed)) {
                System.out.println("Palindrome");

            } else {
                System.out.println("Not palindrome");
            }

        }

    public static void main(String[] args) {

            Task3 task3=new Task3();
            task3.isPalindrome("Kaya");

    }


    }