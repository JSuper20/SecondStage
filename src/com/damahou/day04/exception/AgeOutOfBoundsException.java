package com.damahou.day04.exception;

/**
 * @Program SecondStage
 * @ClassName AgeOutOfBoundsException
 * @Package com.damahou.day04.exception
 * @Description 自定义异常
 * @Author DaMaHou
 * @CreateDate 2023-07-16 12:51
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class AgeOutOfBoundsException extends RuntimeException {
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public AgeOutOfBoundsException() {
        super();
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
