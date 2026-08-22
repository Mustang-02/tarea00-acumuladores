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
	
	
	//-------- EJERCICIO 2 --------//
	
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
	
	//-------- FUNCION PRINCIPAL --------//
	
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		// checkeo caso borde //
		if(mat1.length == 0 || mat2.length == 0 || mat1.length != mat2.length) {
			return false;
		}
		
		boolean acum = true;
		
		for(int f = 0; f < mat1.length; f++) {
			acum = acum && hayInterseccion(mat1,mat2,f);
		}
		return acum;
	}
	
	//-------- FUNCION AUXILIAR (1)--------//
	
	public boolean hayInterseccion(int[][] mat1, int[][] mat2, int f) {
		boolean acum = false;
		
		for( int col1 = 0; col1 < mat1[f].length; col1++) {
			acum = acum || buscarMat2(mat1, mat2, f, col1);
		}
		return acum;
	}
	
	//-------- FUNCION AUXILIAR (2)--------//
	
	public boolean buscarMat2(int[][] mat1, int[][] mat2, int f, int col1) {
		boolean acum = false;
		
		for(int col2 = 0; col2 < mat2[f].length; col2++) {
			acum = acum || mat1[f][col1] == mat2[f][col2];
		}
		return acum;
	}
	
	//-------- EJERCICIO 3 --------//
	
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
		// checkeo caso borde //
		if(mat == null || mat.length == 0 || nColum < 0 || nColum >= mat[0].length) {
			return false;
		}
		
		int sumaCol = 0;
		
		for(int i = 0; i < mat.length; i++) {
			sumaCol += mat[i][nColum];
		}
		
		boolean acum = false;
		
		for(int f = 0; f < mat.length; f++) {
			acum = acum || comparacionColFila(mat,f, sumaCol);
		}
		return acum;
	}
	
	//-------- FUNCION AUXILIAR (1)--------//
	
	public boolean comparacionColFila(int[][] mat, int f, int sumaCol) {
		
		int sumaFila = 0;
		
		for(int c = 0; c < mat[f].length; c++) {
			sumaFila += mat[f][c];
		}
		return sumaFila > sumaCol;
	}
	
	//-------- EJERCICIO 4 --------//
	
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
		// checkeo caso borde //
		if(mat1.length == 0 || mat2.length == 0 || mat1[0].length != mat2[0].length) {
			return false;
		}
		
		boolean acum = true;
		
		for(int c = 0; c < mat1[0].length; c++) {
			acum = acum && hayInterseccionCol(mat1, mat2, c);
		}
		return acum;
	}
	
	//-------- FUNCION AUXILIAR (1)--------//
	
	public boolean hayInterseccionCol(int[][] mat1, int[][] mat2, int c) {
		
		boolean acum = false;
		
		for(int f1 = 0; f1 < mat1.length; f1++) {
			if(c < mat1[f1].length) {
			acum = acum || buscarFila2(mat1, mat2, c, f1);
			}
		}
		return acum;
	}
	
	//-------- FUNCION AUXILIAR (2)--------//
	
	public boolean buscarFila2(int[][] mat1, int[][] mat2, int c, int f1) {
		boolean acum = false;
		
		for(int f2 = 0; f2 < mat2.length; f2++) {
			if(c < mat2[f2].length) {
			acum = acum || mat1[f1][c] == mat2[f2][c];
			}
		}
		return acum;
	}
}
