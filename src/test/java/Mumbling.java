public class Mumbling {
    public static String accum(String s) {
        String[] arrS = s.split("");
        StringBuilder result = new StringBuilder();
        int n = 1;
        for (String str : arrS) {
            StringBuilder helper = new StringBuilder();
            for (int i = 0; i < n; i++) {

                if (i == 0){
                    helper.append(str.toUpperCase());
                }
                else{
                    helper.append(str.toLowerCase());
                }
            }
            n++;
            result.append(helper  + "-");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("ABCDERF"));
    }

}
