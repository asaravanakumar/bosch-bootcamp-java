package com.labs.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccountReflectionDemo {
    public static void main(String[] args) {
        // OPTION 1: Access Class instance using class member variable
        Class<Account> accountClass = Account.class;

        // OPTION 2: Access Class instance using Class.forName() method
        Class<?> accountClass1 = null;
        try {
            accountClass1 = Class.forName("com.labs.java.reflection.Account");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
            e.printStackTrace();
        }

        // OPTION 3: Access Class instance using getClass() method
        Account account = new Account();
        Class<?> accountClass2 = account.getClass();

        System.out.println("Class Name: " + accountClass);
        System.out.println("Class Name: " + accountClass1);
        System.out.println("Class Name: " + accountClass2);

        System.out.println(accountClass == accountClass1);
        System.out.println(accountClass == accountClass2);

        try {
            System.out.println("###### Fields #####");
            Field[] fields = accountClass1.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field Name: " + field.getName());
                field.setAccessible(true); // Enables to access private fields
                if(field.getName().equals("balance")) {
                    field.set(account, 1000.0);
                }
                System.out.println("Filed Value: " + field.get(account));
            }

            System.out.println("#### Methods #####");
            Method[] methods = accountClass1.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method Name: " + method.getName());

                if(method.getName().equals("checkBalance")) {
                    System.out.println("Method Return Type: " + method.getReturnType());
                    System.out.println("Method Return Value: " + method.invoke(account));
                }
            }



            System.out.println("#### Constructors #####");
            Constructor[] constructors = accountClass1.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Constructor Name: " + constructor.getName());
            }


            Account account1 = accountClass.getConstructor().newInstance();
            System.out.println(account1);

            accountClass.getMethod("setBalance", double.class).invoke(account1, 5000.0);

            Account account2 = accountClass.getConstructor(int.class, double.class, String.class).newInstance(100, 5000.0, "Jack");
            System.out.println(account2);

            System.out.println(account == account1);

        }catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (InstantiationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
