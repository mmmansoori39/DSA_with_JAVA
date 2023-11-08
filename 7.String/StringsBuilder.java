public class StringsBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("jasmine");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert char at index 0
        sb.insert(0,'s');
        System.out.println(sb);

        // delete the extra 's'
        sb.delete(0,1);
        System.out.println(sb);

        // append
        sb.append("e");
        sb.append("l");
        sb.append("g");
        System.out.println(sb);
        System.out.println(sb.length());


    }
}
