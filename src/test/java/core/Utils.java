package core;

import java.util.Random;

public class Utils {

	public static boolean fromIntToBoolean(int num){
		return num != 0;
	}
	
	private static String getCPFVerifier(String number) {  
        int v1, v2, sum, weight;
        
        sum = 0;
   		weight = 10;
        for (int i = 0; i < number.length(); i++)  
        	sum += Integer.parseInt(number.substring(i, i + 1)) * weight--;  
        if (sum % 11 == 0 | sum % 11 == 1)  
            v1 = 0;  
        else  
            v1 = 11 - (sum % 11);
        
        sum = 0;  
        weight = 11;  
        for (int i = 0; i < number.length(); i++)  
        	sum += Integer.parseInt(number.substring(i, i + 1)) * weight--;  
        sum += v1 * 2;  
        if (sum % 11 == 0 | sum % 11 == 1)  
            v2 = 0;  
        else  
            v2 = 11 - (sum % 11);
        
        return String.valueOf(v1) + String.valueOf(v2);  
    }
	
    public static String generateCPF() {  
        String cpf = "";  
        int r;
		Random gen = new Random();

        for (int i = 0; i < 9; i++) {  
            r = gen.nextInt(9);  
            cpf += String.valueOf(r);  
        }
        
        return cpf + getCPFVerifier(cpf);  
    } 
    
    public static String generateRG() {
    	String rg = "";
    	int rand = new Random().nextInt(999999999);
    	rg = String.valueOf(rand);
    	return rg;
    }
    
    public static String generateEmail() {
    	String email = "";
    	int randMail = new Random().nextInt(99999);
    	String randId = String.valueOf(randMail);
    	email = "teste" + randId + "@teste.com.br";
    	return email;
    }
    
    public static String geraCPF(){

    	 int digito1 = 0, digito2 = 0, resto = 0;
    	 String  nDigResult;
    	 String numerosContatenados;
    	 String numeroGerado;

    	 Random numeroAleatorio = new Random();

    	 int n1 = numeroAleatorio.nextInt(10);
    	 int n2 = numeroAleatorio.nextInt(10);
    	 int n3 = numeroAleatorio.nextInt(10);
    	 int n4 = numeroAleatorio.nextInt(10);
    	 int n5 = numeroAleatorio.nextInt(10);
    	 int n6 = numeroAleatorio.nextInt(10);
    	 int n7 = numeroAleatorio.nextInt(10);
    	 int n8 = numeroAleatorio.nextInt(10);
    	 int n9 = numeroAleatorio.nextInt(10);


    	 int soma = n9*2 + n8*3 + n7*4 + n6*5 + n5*6 + n4*7 + n3*8 + n2*9 + n1*10;

    	 int valor = (soma / 11)*11;

    	 digito1 = soma-valor;
    	 
    	 resto = (digito1 % 11);

    	 if(digito1 < 2){
    	  digito1 = 0;
    	 }
    	 else {
    	   digito1 = 11-resto;
    	 }

    	int soma2 = digito1 * 2 + n9*3 + n8*4 + n7*5 + n6*6 + n5*7 + n4*8 + n3*9 + n2*10 + n1*11;

    	int valor2 = (soma2 / 11)*11;

    	 digito2 = soma2-valor2;
    	 
    	 resto = (digito2 % 11);

    	 if(digito2 < 2){
    	  digito2 = 0;
    	 }
    	 else {
    	   digito2 = 11-resto;
    	 }

    	 numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) +"." + String.valueOf(n4) +
    	                       String.valueOf(n5) + String.valueOf(n6) +"."+ String.valueOf(n7) +String.valueOf(n8)  +
    	                       String.valueOf(n9)+"-";
    	 
    	  nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

    	  numeroGerado = numerosContatenados+nDigResult;

    	  System.out.println("CPF Gerado " + numeroGerado);

    	  return numeroGerado;
    	}

    	public String mostraResultado() throws Exception{

    	 String resultadoCPF = geraCPF();

    	 return resultadoCPF;
    	}
    	
    	
    	public static String generatePhoneNumber() {
        	String phoneNum = "";
        	int rand = new Random().nextInt(99999999);
        	phoneNum = "9" + String.valueOf(rand);
        	return phoneNum;
        }
    	
    	public static String generatePhoneNumberWithDDD() {
    		String phoneNumDDD = "11" + String.valueOf(generatePhoneNumber());
    		return phoneNumDDD;
    	}
    	
    	public static String generatePassword() {
        	String phoneNum = "";
        	int rand = new Random().nextInt(99999999);
        	phoneNum = String.valueOf(rand);
        	return phoneNum;
        }
}
