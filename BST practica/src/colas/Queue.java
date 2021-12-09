package colas;
import excepciones.ExceptionEmpty;

public interface Queue <T> { //es circular
	void enqueue(T x); //inserta el elemento x al final de la cola (encolar)
	T dequeue() throws ExceptionEmpty; // retorna el elemento que se ubica al inicio de la cola (desencolar)
	T front() throws ExceptionEmpty; // retorna el elemento del frente de la cola (frente)
	T back() throws ExceptionEmpty; //retorna el elemento del final de la cola (final)
	boolean isEmpty(); // retorna verdadero si la cola esta vacía, falso en caso contrario.

}
