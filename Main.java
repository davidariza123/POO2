package Principal;
import java.util.ArrayList;



import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


import Atributos.Propietario;
import Atributos.TipoServicio;
import Vehiculos.Buses;
import Vehiculos.Carros;
import Vehiculos.Motos;
import Vehiculos.Vehiculos;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		  
		//Datos Vehiculo 1
		Propietario pr1 = new Propietario("Carlos Suarez");	
		TipoServicio t1 = new TipoServicio ("Particular");
		
		//Datos Vehiculo 2
		
		Propietario pr2 = new Propietario("Pepe Ramirez");	
		TipoServicio t2 = new TipoServicio ("Publico");
		
		//Datos Vehiculo 3
	
		Propietario pr3 = new Propietario("Juana de arco");	
		TipoServicio t3 = new TipoServicio(" Particular");
		
	

		//Vehiculos
		
		Vehiculos c1 = new Carros( 123, pr1, t1 );
		Vehiculos b1 = new Buses (234, pr2, t2);
		Vehiculos m1 = new Motos (456, pr3, t3);
		
		//Lista
		
		List<Vehiculos> vehiculos = new ArrayList<>();	
	
		vehiculos.add(c1);
		vehiculos.add(b1);
		vehiculos.add(m1);
		
		//Mapa
		
		HashMap<Integer,Vehiculos> mapavehiculos = new HashMap<Integer,Vehiculos>();
		
		for(Vehiculos VehiculoActual : vehiculos){
			
	           mapavehiculos.put(VehiculoActual.getPlaca(), VehiculoActual );
	         
	               
	        }
		
		//Mostrar en Pantalla
		
		System.out.println(" Su vehiculo es una 1.bus  2.carro  3.moto ");
		Integer os = scan.nextInt();

			System.out.println(" INGRESE LA PLACA");
			
			
			Integer plc = scan.nextInt();
			
		
	        Vehiculos dat = mapavehiculos.get(plc);
	        
	        System.out.println( dat.getPlaca()+  " // " +dat.getPropietario().getNombre() + " // " + dat.getTiposervicio().getTipo());
			
	      
	        
	        
	       
	        switch(os) {
	        
	        case 1:
	        
	        	b1.Consultar();
	        	
	        	
	        	break;
	        	
	        	
	        	
	        	
	        case 2:
	        	c1.Consultar();
	        	
	        	
	        	
	        	
	        	break;
	        
           case 3:
	        	
	        	
	        	m1.Consultar();
	        	
	        	
	       break;
	        
	        
	        
	        
	        
	        
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
        
        
        
        
		

	}

}
