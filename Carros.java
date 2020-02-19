package Vehiculos;


import java.util.Scanner;

import Atributos.Propietario;
import Atributos.TipoServicio;

public class Carros extends Vehiculos {

	public Carros(Integer Placa, Propietario propietario, TipoServicio tiposervicio) {
		super(Placa, propietario, tiposervicio);
		
	}

	@Override
	public void Consultar() {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println(" Paga mensualidad?");
			System.out.println(" ");
			System.out.println("1.si          2.no?");
			
			int op = scan.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("Si ya pago su mensualidad puede salir, de lo contrario pagela en caja");
				
				break;
			
			case 2:
				System.out.println("Cuantas horas ah pasado en el estacionamiento");
				int ops = scan.nextInt();
				
				int z = 0;
				
				if(ops  > 6 ) {
					
					
					
					 z = (ops -6)* 5;
				
					
					System.out.println("Pagara un recargo de "+z+"%" );
					
				}else {
					
					System.out.println("Paga la tarifa normal por las "+ops+" horas");
				
					
				}
			 
				
				
				
				
				
				break;
			
				default:
				System.out.println("ERROR ");
				
				break;
			
			
			
			
		
			
			
			
			
			
			
		}
		
	}


	
	

	
	
	
	
	
	

}
