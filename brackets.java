// Algorithm to check if the given string has the brackets with closing brackets

public class brackets {
    public static boolean isValid(String s){
        int size=s.length();
        if(size%2!=0){
            return false;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)==')'){
                        count++;
                        s= s.substring(0, j) + s.substring(j+1);
                    }
                }
            }
            if(s.charAt(i)=='{'){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)=='}'){
                        count++;
                        s= s.substring(0, j) + s.substring(j+1);
                    }
                }
            }
            if(s.charAt(i)=='['){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)==']'){
                        count++;
                        s= s.substring(0, j) + s.substring(j+1);
                    }
                }
            }
        }
        if(count==size/2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String sj="(({{}}))";

        System.out.println(isValid(sj));
    }
}
