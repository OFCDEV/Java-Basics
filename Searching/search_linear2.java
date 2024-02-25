package Searching;
//Serach in a String
public class search_linear2 {
    public static void main(String[] args) {
        String name = "Debasish";
        char target = 'a';
        System.out.println(linearSearchGo2(name, target));
    }
    public static boolean linearSearchGo2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
