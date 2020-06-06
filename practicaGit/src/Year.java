/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year;

import java.util.Arrays;
public class Year {
private static String[]
meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
private static int[] dias={ 31,28,31,30,31,30,31,31,30,31,30,31};
public static int getDiasMes(String nombre){
int indice=buscar(nombre);
return dias[indice];
}
public static int getDiasMes(int nMes){
int indice=nMes-1;
return dias[indice];
}
public static String getNombreMes(int nMes){
int indice=nMes-1;
return meses[indice];
}
private static int buscar(String mesBuscado){
for(int indice=0;indice<12;indice++){
if(mesBuscado.equals(meses[indice])){
return indice;
}
}
return -1;
}
}