package ipc1.tarea3_201700952;

import java.util.Scanner;

public class IPC1Tarea3_201700952 {

   
    
    public static void main(String[] args) {   
        Scanner leer = new Scanner(System.in);
        //creando variables que se necesitaran
        int respuesta;
        int digito=0;
        int fila;
        int columna;
        int promedio=0;
        int us = 0;
        //arreglo para que pueda ingresar los usuarios en la opcion1
        String usuarios[] = new String[5];
        
        //arreglo para las notas
        int numeros[] = new int[3];
                int notas[][] = new int[6][6];
        int alumno1[] =  {1,20,80,50,30,40};
        int alumno2[] =  {2,40,39,50,80,50};
        int alumno3[] =  {3,60,30,50,30,80};
        int alumno4[] =  {4,90,34,50,80,40};
        int alumno5[] =  {5,20,36,50,30,60};
        int alumno6[] =  {6,54,96,89,63,85};
        
        do{
        //menu
        System.out.println("MENU PRINCIPAL");
        System.out.println("1] Usuarios");
        System.out.println("2] Contador de dígitos");
        System.out.println("3] Tres numero de mayor a menor");
        System.out.println("4] Promedio de notas");
        System.out.println("5] Salir\n");
        
        System.out.println("INGRESE UNA OPCION\n");
        //Ingresa una opcion para navegar en el menu
        respuesta = leer.nextInt();
        //try para capturar algun error
        try{
            //Switch para que se pueda ingresar las opciones del menu
            switch(respuesta){ 
                case 1:
                    do{
                        //opcion 1para el menu
                        System.out.println("USUARIOS");
                        System.out.println("1] Ingresar Usuarios");
                        System.out.println("2] Mostrar usuarios ascendente");
                        System.out.println("3] Mostrar usuarios descendente");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        //Se captura la opcion que el usuario eligio en el menu de usuarios
                        respuesta = leer.nextInt();
                        try{
                            //otro switch para que el usuario pueda elejir la opcion que desee dentro del menu usuarios
                            switch(respuesta){
                                case 0:
                                    break;
                                
                                case 1:
                                    for(us=0;us<usuarios.length;us++){
                                        System.out.println("Ingrese su usuario");
                                        usuarios[us]=leer.next();           
                                    }    
                                    break;
                                case 2:
                                    System.out.println("Usuarios en forma ascendente\n");
                                    //usuarios[us]=String.valueOf(us);
                                    System.out.println(usuarios[us]);
                                    break;
                                case 3:
                                    System.out.println("Usuarios en forma descendente\n");
                                    break;
                                default:
                                    System.out.println("");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    break;
                case 2:
                    do{
                        System.out.println("CONTADOR DE DIGITOS");
                        System.out.println("1] Ingresar numero");
                        System.out.println("2] Mostrar numero de digitos");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        
                        respuesta = leer.nextInt();
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Ingres un numero\n");
                                    //sentencia para que valide que el numero ingresado este
                                    //entre 0 y 100000
                                    do{
                                        digito = leer.nextInt();
                                        if(digito<0||digito>100000){
                                            System.out.println("ingrese un numero entre 0 y 100000");
                                        }   
                                    }while(digito<0 || digito>100000);
                                    break;
                                case 2:
                                    //Aca se imprime el numero de digitos que ingreso el usuario
                                    System.out.println("Mostrar el número de "
                                            + "digitos del numero ingresado\n");
                                    System.out.println("El NUMERO " + digito + " tiene " 
                                            + Integer.toString(digito).length()+" digitos\n ");
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta\n");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    break;
                case 3:
                    //menu 3 ordenar numeros de mayor a menor
                    do{
                        System.out.println("TRES NUMEROS DE MAYOR A MENOR");
                        System.out.println("1] Ingresar numeros");
                        System.out.println("2] Mostrar ordenados");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        //Ingresa una opcion para que pude elegir
                        respuesta = leer.nextInt();
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                case 1:
                                    //sentencia apra que pueda ingresar los 3 numeros que se quiere ordenar
                                    System.out.println("Ingres los numeros\n");
                                    for(int i=0;i<numeros.length;i++){
                                        numeros[i]=leer.nextInt();   
                                    }
                                    //for que recorre el arreglo y los va ordenando de mayor a menor
                                    for(int i=0; i<numeros.length;i++){
                                        for(int j=0;j<numeros.length;j++){
                                            if(numeros[i] > numeros[j]) {
                                            int aux1 = numeros[i];
                                            numeros[i] = numeros[j];
                                            numeros[j] = aux1;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    //Aca se imrpime los numero ya ordenados
                                    System.out.println("Numeros ordenados en forma descendente:");
                                    for(int i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i] + " ");
                                    }
                                    System.out.println("\n");
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta 1\n");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    
                    break;
                case 4:
                    do{
                        //caso numero 4, menu de promedio
                        System.out.println("PROMEDIO DE NOTAS(4 NOTAS 6 ESTUDIANTES)");
                        System.out.println("1] Mostrar NOTAS");
                        System.out.println("2] Calcular promedio de un alumno");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        
                        respuesta = leer.nextInt();
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                case 1:
                                    //Recorre el arreglo y los va ordenando
                                    //revisando cada arreglo que se declaro implicitamente al principio
                                    System.out.println("NOTAS\n");
                                    for(fila = 0; fila<notas.length; fila++){
                                    for(columna = 0; columna<notas.length; columna++){
                                        if(fila==0){
                                            notas[fila][columna]=alumno1[columna];
                                        }else if(fila==1){
                                            notas[fila][columna]=alumno2[columna];
                                        }else if(fila==2){
                                            notas[fila][columna]=alumno3[columna];
                                        }else if(fila ==3){
                                            notas[fila][columna]=alumno4[columna];
                                        }else if(fila ==4){
                                            notas[fila][columna]=alumno5[columna];
                                        }else if(fila ==5){
                                            notas[fila][columna]=alumno6[columna];
                                        }
                                        }
                                    }
                                    //Recorre nuevamente el for para ya poder imprimirla en pantalla
                                    for(fila = 0; fila<notas.length; fila++){
             
                                    for(columna = 0; columna<notas.length; columna++){
                                        System.out.print("\t"+notas[fila][columna]+" ");    
                                    }
                                        System.out.println("");
                                    }
                                    break;
                                case 2:
                                    //Caso 2 del menu de promedio
                                    System.out.println("Ingrese el ID del alumno a calcular el promedio");
                                    //Se pide que ingrese el ID del alumno para calcular su promedio
                                    respuesta = leer.nextByte();
                                    switch(respuesta){
                                        case 1:
                                            //for para recorrer el arreglo y que pueda enconrar los valores del alumno
                                            for(fila=0;fila<notas.length;fila++){
                                                promedio=-1;
                                                for(columna=0;columna<notas.length;columna++){
                                                    promedio = promedio + alumno1[columna];
                                                }
                                            }
                                            //Se imprime el en pantalla el resultado del promedio de las notas del alumno 1
                                                System.out.println("El promedio del primer alumno es: "+ promedio/5);
                                                System.out.println("\n");
                                            break;
                                        case 2:
                                            //Se repite el mismo procedimiento que en el caso 1, con la diferencia que ahora buscara
                                            //las notas el alumno con ID 2, o el segundo alumno
                                            for(fila=0;fila<notas.length;fila++){
                                                promedio=-2;
                                                for(columna=0;columna<notas.length;columna++){
                                                    promedio = promedio + alumno2[columna];
                                                }
                                            }
                                                System.out.println("El promedio del segundo alumno es: "+ promedio/5);
                                                System.out.println("\n");
                                            break;
                                        case 3:
                                            //Se repite el mismo procedimiento que en el caso 1, con la diferencia que ahora buscara
                                            //las notas el alumno con ID 3, o el segundo alumno
                                            for(fila=0;fila<notas.length;fila++){
                                                promedio=-3;
                                                for(columna=0;columna<notas.length;columna++){
                                                    promedio = promedio + alumno3[columna];
                                                }
                                            }
                                                System.out.println("El promedio del tercer alumno es: "+ promedio/5);
                                                System.out.println("\n");
                                            break;
                                        case 4:
                                            //Se repite el mismo procedimiento que en el caso 1, con la diferencia que ahora buscara
                                            //las notas el alumno con ID 4, o el segundo alumno
                                            for(fila=0;fila<notas.length;fila++){
                                                promedio=-4;
                                                for(columna=0;columna<notas.length;columna++){
                                                    promedio = promedio + alumno4[columna];
                                                }
                                            }
                                            System.out.println("El promedio del cuarto alumno es: "+ promedio/5);
                                            System.out.println("\n");
                                            break;            
                                        case 5:
                                            //Se repite el mismo procedimiento que en el caso 1, con la diferencia que ahora buscara
                                            //las notas el alumno con ID 5, o el segundo alumno
                                            for(fila=0;fila<notas.length;fila++){
                                                promedio=-5;
                                                for(columna=0;columna<notas.length;columna++){
                                                    promedio = promedio + alumno5[columna];
                                                }
                                            }
                                                System.out.println("El promedio del quinto alumno es: "+ promedio/5);
                                                System.out.println("\n");
                                            break;
                                        case 6:
                                            //Se repite el mismo procedimiento que en el caso 1, con la diferencia que ahora buscara
                                            //las notas el alumno con ID 6, o el segundo alumno
                                            for(fila=0;fila<notas.length;fila++){
                                                promedio=-6;
                                                for(columna=0;columna<notas.length;columna++){
                                                promedio = promedio + alumno6[columna];
                                                }
                                            }
                                                System.out.println("El promedio del sexto alumno es: "+ promedio/5);
                                                System.out.println("\n");
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta\n");
                            }
                            //intento de capturar algun error XD
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                        //Condicion del while para que el programa no se salga, pero se mantenga en el menu
                    }while(respuesta !=0);
                    break;
                case 5:
                    //caso 5 para que se pueda salir del programa
                    break;
                default:
                    break;
            }
            }catch(Exception e){
                System.out.println("Error");
                leer.next();
            }
        //condicion que hace que se pueada terminar de ejecutar el programa
        }while(respuesta !=5);
    } 
      
} 
