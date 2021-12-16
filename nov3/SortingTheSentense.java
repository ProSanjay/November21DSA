package nov3;

class Solution {
    public String sortSentence(String s) {
       String[] arr=new String[10];
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            String st=str[i];
            int a=(st.charAt(st.length()-1))-'0';
            arr[a]=st.substring(0, st.length()-1);
        }
        String a="";
        for(String n:arr){
            if(n!=null){
             a=a+n+" ";   
            }
             
        }
        return a.substring(0,a.length()-1);
    } 
}
