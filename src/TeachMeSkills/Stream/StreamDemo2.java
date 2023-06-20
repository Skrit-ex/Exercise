package TeachMeSkills.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("Hello Java1");
        a.add("Hello Java2");
        a.add("Hello Java4");
        a.add("Hello Java5");
        a.add("Hello Java6");

//        for( String s : a){
//            if( s != "Hello Java2"){
//                System.out.println(s);
//        }
            Stream<String> stream = a.stream();
            //stream.filter(s -> !s.equals("Hello Java2")).forEach(System.out::println);
        List<String> collect = stream.filter(s -> !s.equals("Hello Java2")).sorted().collect(Collectors.toList());


    }

}
