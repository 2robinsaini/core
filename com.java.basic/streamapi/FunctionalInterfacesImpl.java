package streamapi;

public class FunctionalInterfacesImpl {

    PrintList<String> printStringList = ((m,l) -> {
        System.out.print(m+ " ==> ");
        System.out.print(l + " ");
        System.out.println();
    });

    PrintMap<String,Long> printStringLongMap = (msg,map) -> {
        System.out.print(msg+ " ");
        map.entrySet().stream().forEach(ent -> System.out.print(ent.getKey() + ":" + ent.getValue()+ ", "));
        System.out.println();
    };

}
