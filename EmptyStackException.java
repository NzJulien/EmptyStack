/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package generics;

/**
 *
 * @author dzeuf
 */
public class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        this("Stack is empty");
}
    public EmptyStackException(String exception) {
        super(exception);
}
}