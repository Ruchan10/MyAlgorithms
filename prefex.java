// Algorithm to find the longest common prefex from the array

public class prefex {
    public static String longestCommonPrefex(String[] strs){
        // Sorting the array of string in albhabetical order
        for(int i=0; i<strs.length;i++){
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].compareTo(strs[j])>0){
                    String temp=strs[i];
                    strs[i]=strs[j];
                    strs[j]=temp;
                }
            }
        }
        int size=0;
        int l=strs.length;
        if(strs[0].length() > strs[l-1].length()){
            size=strs[l-1].length();
        }
        else{
            size=strs[0].length();
        }
        int count=0;
        int i=0;
        while(i<size){
            if(strs[0].charAt(i)==strs[l-1].charAt(i)){
                if(i==count)
                   count++;
            }
            i++;
        }
        if(count==0){
            return "";
        }
        else{
            return strs[0].substring(0,count);
        }
    }
    public static void main(String[] args) {
        String[] strs = {"dog","flight","flow"};
        String aans = longestCommonPrefex(strs);
        System.out.println("ans:- "+aans);
    }
}
