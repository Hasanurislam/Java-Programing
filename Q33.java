//toString--->asList()----->deepToString method
import java.util.Arrays;
public class Q33 {
    public static void main(String[] args) {
        String a[]={"hasanur","Farid","Zulfikar"};
        System.out.println("ToString() " +Arrays.toString(a));
        System.out.println("asList " +Arrays.asList(a));

        int arr[][]={{10,20},{30,40}};
        System.out.println("deeptoString() " +Arrays.deepToString(arr));
    }
    
}
