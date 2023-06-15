package javas;




public class Reflec {
    public static void main(String[] args) {
        Object test = new Object() {
    void x() {
    System.out.println("x");
    }

    void defaultMethod() {
    System.out.println("y");
    }
        };
        invokeDefault(test, "z");

    }
    public static void invokeDefault(Object object, String method) {
        try {
            java.lang.invoke.MethodHandles.Lookup lookup = java.lang.invoke.MethodHandles.lookup();
            java.lang.invoke.MethodHandle mh = lookup.findSpecial(object.getClass(), method, java.lang.invoke.MethodType.methodType(void.class), object.getClass());
            mh.invoke(object);
        } catch (NoSuchMethodException e) {
            try {
                java.lang.reflect.Method defaultMethod = object.getClass().getMethod("defaultMethod");
                if (defaultMethod.canAccess(object)) {
                    defaultMethod.setAccessible(true);
                    defaultMethod.invoke(object);
                } else {
                    // ignore the execution
                }
            } catch (NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException ex) {
                // ignore the execution
            }
        } catch (Throwable t) {
            // handle the exception
        }
    }
}
