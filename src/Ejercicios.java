public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		if((numero % 2)==0)
			return true;
		else
		return false;
		//si el resultado del operador es totalmente igual a cero retorna verdadero(Par)
		//De los contrario es falso (impar)
	}
	
	//devuelve "gratis" si lempiras es igual a 0
	//devuelve "barato" si lempiras es menor que 100
	//devuelve "normal" si lempiras es menor que 200
	//de lo contrario devuelve caro
	//nota: solo aceptan minusculas
	static String obtenerPrecio(int lempiras)
	{
		if(lempiras==0)
			return "gratis";
		else if(lempiras<100)
			return"barato";
		else if(lempiras<200)
		return "normal";
		return "caro";
		//primer operador si es totalmente igual a cero es gratis
		//menor que 100 es barato
		//menor que 100 normal, de lo contrario es caro
	}
	
	//devuelve el factorial de "num"
	//repaso de la serie factorial http://mathworld.wolfram.com/Factorial.html
	static int factorial(int num)
	{
		//La condicion que hace que se detenga la recursividad es cuando num==0
		if(num==0)
			return 1;
		else
		return num*(factorial(num-1));
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];
		//Retornara el arreglo arr en la posicion de pos
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		//retornara el arreblo bidimencional en la columna posicion col y fila en la posicion fila
		return arr[col][fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if(num==0)
			return 0;
			else if(num==1)
				return 1;
			else
				return fibonacci(num-1)+fibonacci(num-2); //Formula recursiva
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 1 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0)
			return 1;
		else if(num==1)
			return 2;
		else
		return funcionRecursiva(num-1)*2+1;
	}
	
	public static void main(String[] args)
	{

	}

}
