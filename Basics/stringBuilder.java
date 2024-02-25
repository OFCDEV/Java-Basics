package Basics;
public class stringBuilder {
    public static void main(String[] args) {
        //System.out.printf("Hii my name is %s and I am %s","dev" , "bkl");
       // System.out.println();
       // System.out.printf("Value of Pi %.2f",Math.PI);
      /* 
       String series = "";
       for(int i=0; i<26;i++){
        char ch = (char)('a'+i);
        System.out.println(series+ch);
       }
       */
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<26;i++){
        char ch = (char)('a'+i);
        sb.append(ch);
      }
      System.out.println(sb);
    }
}
