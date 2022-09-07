import java.util.Arrays;

public class P1592 {
    public static void main(String[] args) {
        System.out.println(new P1592().reorderSpaces(" a"));
    }

    public String reorderSpaces(String text) {
        String[] strArr = Arrays.stream(text.split(" ")).filter(s -> s != null && s.length() > 0).toArray(String[]::new);
        long count = text.chars().filter(ch -> ch == ' ').count();
        int spaceCount;
        if (strArr.length == 1){
            spaceCount = (int) count;
        }else{
            spaceCount = (int) (count / (strArr.length - 1));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length - 1; i++) {
            sb.append(strArr[i]);
            for (int j = 0; j < spaceCount; j++) {
                sb.append(' ');
            }
        }
        sb.append(strArr[strArr.length - 1]);
        for (int j = 0; j < count - spaceCount * (strArr.length - 1); j++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
