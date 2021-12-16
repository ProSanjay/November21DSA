package nov3;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        boolean flag=false;
        StringBuilder builder=new StringBuilder(s);
        for(int i=0;i<t.length();i++){
            flag=false;
            for(int j=0;j<builder.length();j++){
                if(t.charAt(i)==builder.charAt(j)){
                    builder.setCharAt(j, '$');
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return t.charAt(i);
            }
        }
        return 'a';
    }
}