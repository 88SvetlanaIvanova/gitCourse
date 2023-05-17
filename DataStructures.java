import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DataStructures {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(7);

        Integer a = 5;
        Integer b = 1;
        Integer c = 5;

        System.out.println("A compared to B: " + a.compareTo(b));
        System.out.println("B compared to A: " + b.compareTo(a));
        System.out.println("A compared to C: " + a.compareTo(c));
        Person p1 = new Person(20, "Pesho");
        Person p2 = new Person(21, "Pesho");
        Person p3 = new Person(20, "Pesho");
        Person p4 = new Person(20, "Ivayla");

       // (Comparator.comparing(Person::getAge));
        Set<Person> people = new TreeSet<>(
                (o1, o2)->{
                    int ageResult = o1.getAge() - o2.getAge();
                    if (ageResult != 0){
                        return ageResult;
                    }

                    int nameResult = o2.getName().compareTo(o1.getName());
                    return nameResult;

                }
        );
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people.contains(p2));

        people.forEach(el -> System.out.println(el.name +" | " + el.age));

        String x = "pesho";
        String y = "gosho";

        System.out.println(x.compareTo(y));



    }
}
class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }





}
class Person implements Comparable<Person> {
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

   public int getAge() {
        return this.age;
    }
    public String getName(){
       return this.name;
    }

    @Override
    public int compareTo(Person o) {
        int ageResult = this.getAge() - o.getAge();
        if (ageResult != 0){
            return ageResult;
        }

        return this.getName().compareTo(o.getName());

    }
}
