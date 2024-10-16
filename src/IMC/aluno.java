package IMC;

// Classe Aluno que herda atributos da classe Pessoa
public class aluno extends pessoa {
 // Atributos do aluno
 protected int desempenhoAcademico;
 protected int frequenciaAulas;

 // Construtor para inicializar as características do aluno
 public aluno(String identificacao, String documento, double massaCorporal, double estatura, int desempenhoAcademico, int frequenciaAulas) {
	 // Chama o construtor da classe Pessoa
     super(identificacao, documento, massaCorporal, estatura); 
     // Validação através do setter
     setDesempenhoAcademico(desempenhoAcademico); 
     setFrequenciaAulas(frequenciaAulas);
 }

 // Método getter para obter o desempenho acadêmico
 public int getDesempenhoAcademico() {
     return desempenhoAcademico;
 }

 // Método setter para definir o desempenho acadêmico
 public void setDesempenhoAcademico(int desempenhoAcademico) {
     if (desempenhoAcademico < 0) {
    	 // Valida que o desempenho não seja negativo
         throw new IllegalArgumentException("O desempenho acadêmico não pode ser menor que 0"); 
     }
     this.desempenhoAcademico = desempenhoAcademico;
 }

 // Método getter para obter a frequência de aulas
 public int getFrequenciaAulas() {
     return frequenciaAulas;
 }

 // Método setter para definir a frequência de aulas
 public void setFrequenciaAulas(int frequenciaAulas) {
     if (frequenciaAulas < 0) {
    	 // Valida que a frequência não seja negativa
         throw new IllegalArgumentException("A frequência de aulas não pode ser menor que 0"); 
     }
     this.frequenciaAulas = frequenciaAulas;
 }

 // Método que formata a descrição do aluno incluindo características específicas
 public String obterDescricao() {
	 // Chama a descrição da classe Pessoa e adiciona informações do aluno
     return super.obterDescricao() +  
            "\nDesempenho Acadêmico: " + desempenhoAcademico + 
            "\nFrequência nas Aulas: " + frequenciaAulas + "%" + 
            "\nEstado do aluno: " + atributos.avaliarDesempenho(getDesempenhoAcademico(), getFrequenciaAulas());
 }
}