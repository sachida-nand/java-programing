import java.util.*;
class ExampleAList{
    public static void main(String args[]){
        ArrayList l1 = new ArrayList(4);
        l1.add("Ram");
        l1.add("Sita");
        l1.add(1,"rajja");
        l1.removeAll(l1);
        System.out.println(l1.contains(l1));
        Iterator it = l1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}