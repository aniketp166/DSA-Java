import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer> revArr = new ArrayList<>();        
    for(int i = a.size() - 1; i >= 0; i--){
        revArr.add(a.get(i));
    }
    return revArr;
}
}
