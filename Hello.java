public class Hello {
    public static void main(String[] args) {
        String str = "Sajid";
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    }

