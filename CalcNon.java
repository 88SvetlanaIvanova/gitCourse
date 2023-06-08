package javas;



public class CalcNon {
    public static void main(String[] args) {

    }
    //The method takes an Object parameter object.
    public static int numberOfInstanceFields(Object object) {
        int count = 0;
     //   It starts by getting the Class object for the given object using the getClass() method.
        Class<?> clazz = object.getClass();
    //It then enters a loop that iterates over all the declared fields of the current class and increments the count variable if the field is not static.
        while (clazz != null) {
            for ( java.lang.reflect.Field field : clazz.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    count++;
                }
            }
            //The loop then moves up to the superclass of the current class by calling getSuperclass() on the current Class object.
            clazz = clazz.getSuperclass();
        }//The loop continues until there are no more superclasses to move up to (i.e., until the Class object is null).
         //Finally, the method returns the total count of non-static fields.
        return count;
    }
}


