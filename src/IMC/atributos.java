package IMC;

// Classe responsável pelos atributos e cálculos
public class atributos {
 
 // Verifica se todos os dígitos do CPF são iguais
 public static boolean DigitosRepetidos(String documento) {
     char primeiroCaractere = documento.charAt(0);
     // Percorre os dígitos do CPF
     for (int indice = 1; indice < documento.length(); indice++) { 
    	 // Retorna false se encontrar um dígito diferente
         if (documento.charAt(indice) != primeiroCaractere) { 
             return false;
         }
     }
     return true; // Retorna true se todos os dígitos forem iguais
 }

 // Valida o CPF
 public static boolean validarDocumento(String documento) {
     int soma = 0;
     // Soma 9 numeros iniciais do CPF e multiplica por 10 até 2
     for (int indice = 0; indice < 9; indice++) { // Percorre os 9 primeiros dígitos
    	 // Converte e multiplica os dígitos
         soma += Character.getNumericValue(documento.charAt(indice)) * (10 - indice); 
     }
     // Calcula o digito inicial que verifica o CPF
     int primeiroVerificador = 11 - (soma % 11);
     if (primeiroVerificador >= 10) {
    	 // Define como 0 se o resultado for 10 ou maior
         primeiroVerificador = 0; 
     }
     // Reinicia a soma para fazer o cálculo do segundo dígito do CPF
     soma = 0; 
     // Soma os 10 dígitos iniciais do CPF, incluindo o primeiro dígito que verifica
     for (int indice = 0; indice < 10; indice++) {
         soma += Character.getNumericValue(documento.charAt(indice)) * (11 - indice);
     }
     // Calcula o segundo dígito que faz a verificação do CPF
     int segundoVerificador = 11 - (soma % 11);
     if (segundoVerificador >= 10) {
         segundoVerificador = 0;
     }
     // Compara os dígitos verificadores calculados com os do CPF
     return (primeiroVerificador == Character.getNumericValue(documento.charAt(9)) &&
             segundoVerificador == Character.getNumericValue(documento.charAt(10)));
 }

 // Calcula o IMC
 public static double calcularIMC(double massa, double alturaPessoa) {
	 // Cálculo do IMC: peso dividido pela altura ao quadrado
     return massa / Math.pow(alturaPessoa, 2); 
 }

 // Avalia se o aluno foi aprovado ou reprovado
 public static String avaliarDesempenho(int notaFinal, int frequencia) {
	 // Aprovado se a nota for >= 5 e a frequência >= 75
     return (notaFinal >= 5 && frequencia >= 75) ? "Aprovado" : "Reprovado";
 }
}
