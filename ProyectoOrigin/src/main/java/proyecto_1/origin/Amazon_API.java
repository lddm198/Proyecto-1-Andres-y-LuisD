package proyecto_1.origin;

import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Amazon_API {

    public static void main(String[] args) throws Exception {
        
      
    }
    //conexion con los datos de la API
    public String obtener_DataBase() throws Exception{
        HttpResponse<String> response = Unirest.get("https://covid-19-tracking.p.rapidapi.com/v1")
	.header("x-rapidapi-host", "covid-19-tracking.p.rapidapi.com")
	.header("x-rapidapi-key", "c1546fae8cmsh4af1328e729cf37p14c251jsnebf9f3fbf5a1")
	.asString();
        
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);
        //System.out.println(prettyJsonString);
        return prettyJsonString;
    }
    
    //variables que me ayudan a determinar en "obtener_valores_a" los precios de las armas
    private class obtener_variables_a{
        int indice =0,articulos_seleccionados=0;
        char stop=0;
        
        String enun = "Active Cases_text";
        char key=enun.charAt(0);
        int valores[]=new int[3];
        int enunciado=enun.length(),i=0;
    }
    //variables que me ayudan a determinar en "obtener_valores_e" los precios de los escudos
    private class obtener_variables_e{
        int indice =0,articulos_seleccionados=0;
        char stop=0;
        
        String enun = "Total Cases_text";
        char key=enun.charAt(0);
        int valores[]=new int[3];
        int enunciado=enun.length(),i=0;
    }
    //variables que me ayudan a determinar en "obtener_valores_c" los precios de los consumibles
    private class obtener_variables_c{
        int indice =0,articulos_seleccionados=0;
        char stop=0;
        
        String enun = "Total Deaths_text";
        char key=enun.charAt(0);
        int valores[]=new int[3];
        int enunciado=enun.length(),i=0;
    }
    
    //logica desarrollada para determinar los valores de las armas 
        public int[] obtener_valores_a() throws Exception{
        

            obtener_variables_a variable =new obtener_variables_a();
            char msj;
            while (variable.stop==0){
              msj =obtener_DataBase().charAt(variable.indice);
              String compara ="";
              if (msj==variable.key){
                  for(variable.i=0;variable.i!=variable.enunciado;variable.i++){
                      msj = obtener_DataBase().charAt(variable.indice);
                      compara=compara+msj;
                      variable.indice++;
                  }


                  if (compara.equals(variable.enun)){
                      int aux=variable.indice+4,x,precio=0;
                      for (x=0;x<3;x++){
                          switch (obtener_DataBase().charAt(aux)) {
                              case '1' -> precio=(precio*10)+1;
                              case '2' -> precio=(precio*10)+2;
                              case '3' -> precio=(precio*10)+3;
                              case '4' -> precio=(precio*10)+4;
                              case '5' -> precio=(precio*10)+5;
                              case '6' -> precio=(precio*10)+6;
                              case '7' -> precio=(precio*10)+7;
                              case '8' -> precio=(precio*10)+8;
                              case '9' -> precio=(precio*10)+9;
                              case ',' -> x--;
                              default -> {
                              }
                          }
                          aux++;
                      }
                      variable.indice+=aux;
                      variable.valores[variable.articulos_seleccionados]=precio;
                      if (variable.articulos_seleccionados==3){
                          break;
                      }
                      variable.articulos_seleccionados++; 
                  }
              }else{
                  variable.indice++;
              }
              if (variable.articulos_seleccionados==3){
                  break;
              }
            }
        return variable.valores;
        }
        
        //logica desarrollada para determinar los valores de los escudos
        public int[] obtener_valores_e() throws Exception{
        

            obtener_variables_e variable =new obtener_variables_e();
            char msj;
            while (variable.stop==0){
              msj =obtener_DataBase().charAt(variable.indice);
              String compara ="";
              if (msj==variable.key){
                  for(variable.i=0;variable.i!=variable.enunciado;variable.i++){
                      msj = obtener_DataBase().charAt(variable.indice);
                      compara=compara+msj;
                      variable.indice++;
                  }



                  if (compara.equals(variable.enun)){
                      int aux=variable.indice+4,x,precio=0;
                      for (x=0;x<3;x++){
                          switch (obtener_DataBase().charAt(aux)) {
                              case '1' -> precio=(precio*10)+1;
                              case '2' -> precio=(precio*10)+2;
                              case '3' -> precio=(precio*10)+3;
                              case '4' -> precio=(precio*10)+4;
                              case '5' -> precio=(precio*10)+5;
                              case '6' -> precio=(precio*10)+6;
                              case '7' -> precio=(precio*10)+7;
                              case '8' -> precio=(precio*10)+8;
                              case '9' -> precio=(precio*10)+9;
                              case ',' -> x--;
                              default -> {
                              }
                          }
                          aux++;
                      }
                      variable.indice+=aux;
                      variable.valores[variable.articulos_seleccionados]=precio;
                      if (variable.articulos_seleccionados==3){
                          break;
                      }
                      variable.articulos_seleccionados++; 
                  }
              }else{
                  variable.indice++;
              }
              if (variable.articulos_seleccionados==3){
                  break;
              }
            }
        return variable.valores;
        }
        
        //logica desarrollada para determinar los valores de los consumibles
        public int[] obtener_valores_c() throws Exception{
        

            obtener_variables_c variable =new obtener_variables_c();
            char msj;
            while (variable.stop==0){
              msj =obtener_DataBase().charAt(variable.indice);
              String compara ="";
              if (msj==variable.key){
                  for(variable.i=0;variable.i!=variable.enunciado;variable.i++){
                      msj = obtener_DataBase().charAt(variable.indice);
                      compara=compara+msj;
                      variable.indice++;
                  }


                  if (compara.equals(variable.enun)){
                      int aux=variable.indice+4,x,precio=0;
                      for (x=0;x<3;x++){
                          switch (obtener_DataBase().charAt(aux)) {
                              case '1' -> precio=(precio*10)+1;
                              case '2' -> precio=(precio*10)+2;
                              case '3' -> precio=(precio*10)+3;
                              case '4' -> precio=(precio*10)+4;
                              case '5' -> precio=(precio*10)+5;
                              case '6' -> precio=(precio*10)+6;
                              case '7' -> precio=(precio*10)+7;
                              case '8' -> precio=(precio*10)+8;
                              case '9' -> precio=(precio*10)+9;
                              case ',' -> x--;
                              default -> {
                              }
                          }
                          aux++;
                      }
                      variable.indice+=aux;
                      variable.valores[variable.articulos_seleccionados]=precio;
                      if (variable.articulos_seleccionados==3){
                          break;
                      }
                      variable.articulos_seleccionados++; 
                  }
              }else{
                  variable.indice++;
              }
              if (variable.articulos_seleccionados==3){
                  break;
              }
            }
        return variable.valores;
        }
    
}
        
    

    

