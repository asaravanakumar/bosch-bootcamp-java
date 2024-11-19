package com.labs.java.core.exception;

public class ExceptionDemo {
    public static void main(String[] args) {

            int a = 10;
            int b = 0;
//            int c = a / b; // throws ArithmeticException
        int c = 0;
            try {
                c = compute(a, b);
            }catch (InvalidOperationException e) {
                System.out.println("Error: " + e.getMessage());
//                e.printStackTrace();
            }catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Result: " + c);

    }

    public static int compute(int a, int b) throws InvalidOperationException {
        int c = 0;
        try {
            return c = 10 / 2;
        }catch(ArithmeticException ae) {
            throw new InvalidOperationException("Can't divide by Zero: " + ae.getMessage());
        }
        catch (Throwable ae) {
//            throw new Exception("Can't divide by Zero: " + ae.getMessage(), ae);
//            throw new InvalidOperationException("Invalid Operation - Can't divide by Zero: " + ae.getMessage());
        }
        finally {
            System.out.println("Finally invoked");
        }

        System.out.println(c);
        return c;
    }
}
