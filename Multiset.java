package javas;


import java.util.Collection;



class Multiset<E> extends java.util.HashSet<E> implements java.util.Set<E>  {
    //private java.util.HashMap<E, Integer> elements = new java.util.HashMap<>();
    private final java.util.List<E> elements = new java.util.ArrayList<>();

    public boolean contains(Object o) {
        return elements.contains(o);
    }

    public boolean add(E e) {
        return elements.add(e);
    }

    public int size() {
        return elements.size();
    }

    public java.util.Iterator<E> iterator() {
        return elements.iterator();
    }

    public int count(E element) {
        int count = 0;
        for (E e : elements) {
            if (e.equals(element)) {
                count++;
            }
        }
        return count;
    }
}

class MultisetUtils {
    public static int  min(Multiset<Integer> mset) {
        int minWeight = Integer.MAX_VALUE;
        Integer minElement = null;
        int minCount = Integer.MAX_VALUE;

        for (Integer element : mset) {
            if (element != null) {
                int elementCount = mset.count(element);
                int weight = elementCount * element;
                if (minWeight > weight) {
                    minWeight = weight;
                    minElement = element;
                    minCount = elementCount;
                }
            }
        }
        return minWeight * minCount;
    }

    public static int minWeighted(Multiset<Integer> mset) {
        int minWeight = Integer.MAX_VALUE;
        Integer minElement = null;

        for (Integer element : mset) {
            if (element != null) {
                if (minElement == null || element.compareTo(minElement) < 0) {
                    minElement = element;
                    minWeight = mset.count(element) * element;
                }
            }
        }

        return minWeight;
    }

    public static int sum(Multiset<Integer> mset) {
        int sum = 0;
        java.util.Set<Integer> uniqueElements = new java.util.HashSet<>();

        for (Integer element : mset) {
            if (element != null) {
                uniqueElements.add(element);
            }
        }

        for (Integer element : uniqueElements) {
            sum += element;
        }

        return sum;
    }

    public static int sumWeighted(Multiset<Integer> mset) {
        int sumWeight = 0;
        for (Integer element : mset) {
            if (element != null) {
                sumWeight += element ;
            }
        }
        return sumWeight;
    }

    public static  java.util.List<Integer> toList(Multiset<Integer> mset)  {
        java.util.List<Integer> list = new java.util.ArrayList<>(mset);
        int count = 0;
        for (Integer element : mset) {
            if (element != null) {
                list.add(element);
                count++;
            }
        }
        int finalCount = count;
        list.sort( java.util.Comparator.comparingInt(e -> finalCount));
        return list;
    }

    public static void main(String[] args) {
        Multiset<Integer> mset = new Multiset<Integer>();
        mset.add(2);
        mset.add(2);
        mset.add(2);
        mset.add(2);
        mset.add(3);
        mset.add(3);



        System.out.println(MultisetUtils.minWeighted(mset));
        System.out.println(MultisetUtils.sum(mset));
        System.out.println(MultisetUtils.sumWeighted(mset));
        System.out.println(MultisetUtils.toList(mset).equals(java.util.List.of(2,2,2,2,3,3)));
    }

}

