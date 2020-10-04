Proceso entrenamiento5
	//defino variables
	definir x como entero;
	definir yy como logico;
	definir c como caracter;
	
	x <- 10; yy <- falso; c <- "a";
	si x < 0 entonces 
		yy <- verdadero; //al ser x un entero se debe asignar como un valor logico
	sino 
		yy <- falso;
	FinSi
	c <- "b";
	yy <- verdadero;
	
	escribir "el valor de x es : " , x;
	escribir "el valor de yy es: " , yy;
	escribir "el valor de c es: " , c;
	
	
	
	
	
FinProceso
