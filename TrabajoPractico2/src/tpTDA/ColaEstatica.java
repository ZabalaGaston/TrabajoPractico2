package tpTDA;

public class ColaEstatica implements Cola {

	private Object cola[];
	private int inicio,fin;

	public ColaEstatica(int size) {
		cola = new Object[size];
        inicio = 0;
        fin = -1;
	}
	
	@Override
	public boolean offer(Object dato) {
		if((inicio == 0 && fin == cola.length-1) || (fin == inicio-1 && fin!=-1))
			return false;
		fin = fin==cola.length-1?0:fin+1;
		cola[fin] = dato;
		return true;
	}

	@Override
	public Object poll() {
		if (fin == -1)
			return null;
		Object object = new Object();
		object = cola[inicio];
		if(inicio == fin) {
			inicio = 0;
			fin = -1;
		} else if (inicio == cola.length-1)
			inicio = 0;
		else
			inicio++;
		return object;
	}

	@Override
	public Object peek() {
		if (fin == -1)
			return null;
		return cola[inicio];
	}

	@Override
	//[TODO] Agregar las validaciones correspondientes!
	public boolean isEmpty() {
		return fin == -1;
	}

	@Override
	public void empty() {
		fin = -1;
		inicio = 0;
	}
}
