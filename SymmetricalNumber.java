public class SymmetricalNumber {
    //    public static void main(String[] args) {
//        String Number="111";
//        int b = Number.length()/2;
//
//        String[] count = new String[b];
//        String[] count2 = new String[b];
//
//        for (int i = 0;i<b;i++){
//            count[i]=String.valueOf(Number.charAt(i))  ;
//        }
//        for (int  length - 1; i >= 0; i--) {
//            System.out.println(i);
//        }
//        for (int i = b ;i<=0;i--){
//            System.out.println(i);
//            count2[i]=String.valueOf(Number.charAt(++b))  ;
//            System.out.println(count2[i]);
//
//        }
//      if  (count2==count) {
//          System.out.println("The Number is متقارن ");
//      }else {
//          System.out.println("متقارن نیست");
//      }
//    }
//}
    public static void main(String[] args) {
        String Number = "12131";
        int b = Number.length() / 2;
        char[] count = Number.toCharArray();
       
        char[] count2 = Number.toCharArray();
        for (int i = 0; i < b; i++) {
            System.out.print(count[i]);}
            for (int j = b - 1; j >= 0; j--)
                System.out.print(count2[j]);

        }

        }


