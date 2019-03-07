package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflectionMain {

    public static void main(String[] args) {

        try {
            myClass myclass = new myClass();
            Class<?> refclass = myclass.getClass();
            Method methods[] = refclass.getDeclaredMethods();

            for (int i = 0; i < methods.length; i++) {

                int modifiers = methods[i].getModifiers();
                if (Modifier.isPrivate(modifiers)) {
                    System.out.println(" " + methods[i].getName());
                }

        }

    }catch (Exception e) {

        }
}}
