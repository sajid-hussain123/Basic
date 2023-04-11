import java.util.HashMap;

public class StringOccurence {
    public static void main(String[] args) {
        String str= "Google";
        HashMap<Character,Long> count = new HashMap<>();

        for(int i=str.length()-1;i>=0;i--){
            if(count.containsKey(str.charAt(i))){
                Long totalCount = count.get(str.charAt(i));
                count.put(str.charAt(i),++totalCount);

            }else {
                count.put(str.charAt(i),1L);
            }

        }
        System.out.println(count);
    }

}
