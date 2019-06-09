package tpTDA;

public class PilaEstatica implements Pila {

	private Object pila[];
	private int tope;
	
	public PilaEstatica(int size) {
		pila = new Object[size];
        tope = -1;
	}
	
	@Override
	public boolean push(Object dato) {
		if(tope == pila.length-1)
			return false;
		tope++;
		pila[tope] = dato;
		return true;
	}

	@Override
	public Object pop() { //desapila el dato apuntado por el tope de la pila
		if(tope!=-1){
			return pila[tope--];
		}		
		return null;
	}
	
	@Override
	public Object peek() {
		if(tope!=-1){
			return pila[tope];
		}		
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		return tope==-1;
	}
	
	@Override
	public void empty(){
		tope = -1;
	}
	
}
