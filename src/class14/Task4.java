package class14;

public class Task4 {
    public static void main(String[] args) {

        /*StringBuilder st=new StringBuilder("This is the sentence I want to reverse");

        System.out.println(st.reverse());

        String str=st.toString();
        str.split()*/

        String str="This is the sentence I want to reverse";

        String []arr=str.split(" ");

        for(String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");


        }

    }}

