package acumuladores;

public class Acumuladores {
	
	//-------- EJERCICIO 1 --------//

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	
	//-------- FUNCION PRINCIPAL --------//
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		
		//Checkeo caso borde//
		if (mat == null || num < 1) {
			return false;
		}
		
		boolean acum = false;
		
		for (int f=0; f < mat.length; f++) {
			acum = acum || esMultiplo(mat, f, num);
		}
		return acum;
	}
	
	//-------- FUNCION AUXILIAR --------//
	
	static boolean esMultiplo(int[][] mat, int f, int num) {
		boolean acum = true;
		
		for(int c=0; c < mat[f].length; c++) {
			acum = acum && (mat[f][c]) % num == 0;
		}
		return acum;
	}
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
	
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
}
