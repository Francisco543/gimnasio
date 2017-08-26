package com.gym.vista;

import java.util.Scanner;

import com.gym.modelo.Boxeadores;



public class Test {
	
	public static int sociosAnadidos;
	
	public static int indiceAlumno=0;
	
	static Boxeadores[] boxeador =new Boxeadores[20];
	
	public static String salir="salir";
	
	public static void AgregoAlumno(Boxeadores boxeadores){//hola
		
		boxeador[indiceAlumno]= boxeadores;
		
		indiceAlumno++;
		
	}
	
	public static void MuestroAlumno(){
		int numeroAlumno=1;
		for(int i=0;i<sociosAnadidos;i++){
			
			System.out.println("==========" +"Socio n= " + numeroAlumno +"============");
			System.out.println("Nombre: " + boxeador[i].getNombre());
			System.out.println("Peso: " + boxeador[i].getPeso());
			System.out.println("================================");
			
			numeroAlumno++;
			
		}
	}
	
	public static void main(String args[]) {
		
		while(salir.equals("salir")){
		
		
		System.out.println("============Gimansio===========");
		System.out.println("===============================");
		System.out.println("1_Añadir un socio             =");
		System.out.println("2_Ver clases                  =");
		System.out.println("3_Ver socios                  =");
		System.out.println("===============================");
		
		Scanner scopcion=new Scanner(System.in);
		String opcion=scopcion.nextLine();
		
		if(opcion.equals("1")){
		
		System.out.println("===============================");
		System.out.println("Ingrese nombre:");
		System.out.println("Ingrese peso:");
		System.out.println("Ingrese categoria:");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
	
		Boxeadores b1=new Boxeadores(sc1.nextLine(),sc2.nextDouble(),sc1.nextLine());
		
		System.out.println(b1.getNombre()+", "+b1.getPeso()+", "+b1.getCategoria());
		
		System.out.println("===============================");
		
		System.out.println("Desea añadir al socio a la lista?");
		
		Scanner anadir=new Scanner(System.in);
		
		String agregar=anadir.nextLine();
		
		System.out.println("===============================");
		
		if(agregar.equalsIgnoreCase("SI")){
			
		AgregoAlumno(b1);	
		
		sociosAnadidos++;
		
		System.out.println("Agregado con exito.");
		
				}else{
					System.out.println("No se ha agregado el alumno a la lista.");
				}
			

		}
		
		
		if(opcion.equals("2")){
			
			
			Test.MuestroAlumno();
			
		
				
			}
		
		}
		
	}

}
