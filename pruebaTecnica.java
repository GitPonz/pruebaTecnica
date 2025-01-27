package pruebaTecnica.pruebaTecnica;


public class pruebaTecnica {
    public static void main(String[] args) {
        
      
        // System.out.println(calculoIMC(100.0, 1.50));

       // System.out.println(sumaDigitos(46));

        String[] array = {"0","0", "0", "0", "0"};
        //String[] array = {"0","a", "0", "b", "c"};
        String[] res = moviendoCeros(array);

        for (String string : res) {
            System.out.print(string);
        }
        
    }


    public static String calculoIMC(double peso, double altura){
        double IMC=0;

        if (peso > 0 && altura > 0){
                IMC = peso / (altura*altura);
            
                if (IMC <= 18.5){
                    return "Infrapeso";

                }else if(IMC > 18.5 && IMC <= 25.0){
                    return "Normal";

                }else if(IMC > 25.0 && IMC <= 30.0){
                    return "Sobrepeso";
                }else{
                    return "Obeso";
                }
            
        } 

        return "El peso no es correcto";

    }


    public static int sumaDigitos(int n){
        int total = 0;

        try {
            if (n>0){
                for (int i = 1; i <= n; i++) {
                    
                    if (n<=9){  //Si es solo un digito, solo hay que sumar
                        total += i;
                    }else{  //Al ser dos digitos hay que descomponer el numero
                        
                        String iLetra = Integer.toString(i);    //Lo convertimos a texto y en el bucle vamos caracter por caracter

                        for (int j = 0; j < iLetra.length(); j++) {
                            char caracter =  iLetra.charAt(j);
                            int digito = caracter - '0';           //Forma para pasarlo a integer
                            total += digito;
                        }
                    }

                }
            }

        } catch (Exception e) {
            
        }
        
        return total;
    }

 


    public static String[] moviendoCeros(String[] array){       //Suponemos que es no es un arrayList, si lo fuera se utilziarian los metodos .remove y .add


        for (int i = array.length-1; i >= 0; i--) { //Empezamos de atras a delante

            if(array[i] == "0" ){       //Si es cero lo borramos y sumamos uno al contador de ceros
                

                for (int j = i; j < array.length-1; j++) { //Es menos uno para evitar ArrayIndexOutOfBoundsException
                    if(array[j]!=null){
                        array[j] = array[j+1];       //Vamos pasando los valor a la izquierda
                    }      
                }
                array[array.length-1] = "0";    //Añade el cero en la ultima posicion
            }
        }
     
        return array;
    }

    
}
