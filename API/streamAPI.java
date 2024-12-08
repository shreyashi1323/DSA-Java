package API;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class streamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,80,5,1,9);
        Stream<Integer> streamData= list.stream();

       // streamData.forEach(n-> System.out.println(n));

        /*if we want to perform some operations on our list or data but we want
        to keep it immutable-> means it data inside collections should not be affected
        therfore we use stream. we make stream and import out list there and then we
        perfrm our opertaions on it.

        *ek list/data ka stream ek baar hi bna skte hai...do baar bnane pr compilation error milta hai
         */

//        long count = streamData.count();
//        System.out.println(count);

//        Stream<Integer> filData = streamData.filter(n->n%2 ==0);
//        Stream<Integer> sortedStream = streamData.sorted();
//        Stream<Integer> mapStream = sortedStream.map(n->n*2);
//        mapStream.forEach(n-> System.out.println(n));
       // sortedStream.forEach(n-> System.out.print(n+" "));


        Predicate<Integer> pre = new Predicate<Integer>()
        {
            public boolean test(Integer i){
                if(i%2==0)
                return true;
                else
                    return false;
        }
        };


        Stream<Integer> finalStream= streamData.filter(pre).sorted().map(n->n*2);
        finalStream.forEach(n-> System.out.println(n));
    }
}
