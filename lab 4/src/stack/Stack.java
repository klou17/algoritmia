package stack;
import excepcion.ExceptionEmpty;

public interface Stack <T>{
	void push(T x);
	T pop() throws ExceptionEmpty;
	T top() throws ExceptionEmpty;
	boolean isEmpty();

}
