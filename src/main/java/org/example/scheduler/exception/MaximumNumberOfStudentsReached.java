package org.example.scheduler.exception;

public class MaximumNumberOfStudentsReached extends RuntimeException {

    public MaximumNumberOfStudentsReached(String message) {
        super(message);
    }
}
