package org.example.exception;

public class Main {

    public static void main(String[] args) {

        handleCheckedException();

        try {
            throwUpperCheckedExceptionV2();
        } catch (CheckedException e) {
            System.out.println("We have catch a checked exception in main method");
        }
    }

    // checked exceptions
    private static void handleCheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException ex) {
            System.out.println("We have catch a checked exception");
        }
    }

    private static void throwUpperCheckedExceptionV2() throws CheckedException {
        throwCheckedException();
    }

    private static void throwCheckedException() throws CheckedException {
        System.out.println("Exception...");
        throw new CheckedException("checked");
    }

    // unchecked exceptions
    private static void noHandlingMechanismNeededForUncheckedException() {
        throwUnCheckedException();
        throwUnCheckedExceptionV2();
    }

    private static void throwUnCheckedException() {
        System.out.println("Exception...");
        throw new UncheckedException("unchecked");
    }

    private static void throwUnCheckedExceptionV2() throws UncheckedException {
        System.out.println("Exception...");
        throw new UncheckedException("unchecked");
    }
}
