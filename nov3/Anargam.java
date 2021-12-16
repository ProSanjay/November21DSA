package nov3;

public class Anargam {
    public boolean isAnagram(String s, String t) {
      boolean flag=false;
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2){
            return false;
        }
        StringBuilder builder=new StringBuilder(t);
        for(int i=0;i<s.length();i++){
            flag=false;
           for(int j=0;j<builder.length();j++){
               if(s.charAt(i)==builder.charAt(j)){
                   flag=true;
                   builder.deleteCharAt(j);
                   break;
               }
           }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}
