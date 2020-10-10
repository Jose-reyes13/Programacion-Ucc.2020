Proceso Dividin_Algebrin
	definir a, b, c, d como entero;
	
	//a Es Algebrin, b es Dividin , C el hombre rico y d total de pesazos de pan
	
	a <- 5;
	b <- 3;
	c <- 0;
	d <- 0;
	//como se partieron los panes 
	a <- a*3;
	b <- b*3;
	d <- a+b; // total de pedazos de panes entre a y b 
	//como se comieron los panes 
	a <- a-8;
	b <- b-8;
	c <- a+b;
	d <-  d/3; // Cantidad de panes que se comio cada uno
	

	escribir "cantidad de panes que comio cada uno fue " , d;
	escribir "total de panes que comio c es: " , c;
	escribir "total de monedas para a es: " , a;
	escribir "total de monedas para b es: " , b;
FinProceso
