import java.lang.reflect.Array;

public class LastWordInSentence {
    public static void main(String[] args) {
        String sentence = "Hello my name is Elhammm";
        StringBuilder reverseSentence = new StringBuilder();
        reverseSentence.append(sentence);
        reverseSentence.reverse();
//        System.out.println(reverseSentence);
        char c=0;
        int count=0;
        for (int i = 0; i < sentence.length() ; i++) {
           do {
               c = reverseSentence.charAt(i);
                count++;
           }
           while (c == ' ');}
        System.out.println(count);


    }}

//        String input = "Geeks Fo eeks";
//
//        // convert String to character array
//        // by using toCharArray
//        char[] try1 = input.toCharArray();
//
//        for (int i = try1.length - 1; i >= 0; i--)
//            System.out.print(try1[i]);
//    }
//}