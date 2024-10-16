package IMC;

// Classe pessoa com atributos comuns
public class pessoa {
 // Atributos comuns a pessoa
 protected String identificacao;
 protected String documento;
 protected double massaCorporal;
 protected double estatura;

 // Construtor para inicializar as características do pessoa
 public pessoa(String identificacao, String documento, double massaCorporal, double estatura) {
	 // Valida o identificador usando o setter
     setIdentificacao(identificacao); 
     setDocumento(documento);
     setMassaCorporal(massaCorporal);
     setEstatura(estatura);
 }

 // Método getter para acessar a identificação
 public String getIdentificacao() {
     return identificacao;
 }

 // Método setter para definir a identificação
 public void setIdentificacao(String identificacao) {
	 // Valida se a identificação não é nula ou vazia
     if (identificacao == null || identificacao.trim().isEmpty()) { 
         throw new IllegalArgumentException("Informe o nome da pessoa");
     }
     this.identificacao = identificacao;
 }

 // Método getter para acessar o documento (CPF)
 public String getDocumento() {
     return documento;
 }

 // Método setter para definir o documento (CPF)
 public void setDocumento(String documento) {
     // Remove caracteres não numéricos para validar o CPF
     documento = documento.replaceAll("[^0-9]", "");
     // Valida o comprimento do CPF
     if (documento.length() != 11) { 
         throw new IllegalArgumentException("O documento (CPF) deve conter 11 dígitos");
     }
     // Valida se todos os dígitos do CPF são iguais
     if (atributos.DigitosRepetidos(documento)) {
         throw new IllegalArgumentException("O documento (CPF) não pode ter todos os dígitos iguais");
     }
     // Valida se o CPF é válido
     if (!atributos.validarDocumento(documento)) {
         throw new IllegalArgumentException("O documento (CPF) é inválido");
     }

     this.documento = documento;
 }

 // Método getter para acessar a massa corporal
 public double getMassaCorporal() {
     return massaCorporal;
 }

 // Método setter para definir a massa corporal
 public void setMassaCorporal(double massaCorporal) {
	 // Valida que a massa corporal seja positiva
     if (massaCorporal <= 0) { 
         throw new IllegalArgumentException("A massa corporal deve ser maior que 0");
     }
     this.massaCorporal = massaCorporal;
 }

 // Método getter para acessar a estatura
 public double getEstatura() {
     return estatura;
 }

 // Método setter para definir a estatura
 public void setEstatura(double estatura) {
	 // Valida que a estatura seja positiva
     if (estatura <= 0) { 
         throw new IllegalArgumentException("A estatura deve ser maior que 0");
     }
     this.estatura = estatura;
 }

 // Método que formata a descrição da pessoa
 public String obterDescricao() {
     return "\nIdentificação: " + identificacao + 
            "\nDocumento (CPF): " + documento + 
            "\nMassa Corporal: " + massaCorporal + " kgs" + 
            "\nEstatura: " + estatura + " metros" + 
            "\nIMC: " + atributos.calcularIMC(massaCorporal, estatura);
 }
}