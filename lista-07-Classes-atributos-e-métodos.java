public class lista07-Atividades {
    

     public class Paciente { 

    private String cod; 
    private String nome; 
    private String dataNascimento; 
    private String sexo; 
    private String planoSaude; 
    private String alergia; 
    private String tipoSanguineo; 

    
           // Construtores

    public  Paciente( String cod, String nome, String dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo) { 

        this.nome = nome; 
        this.dataNascimento = dataNascimento; 
        this.sexo = sexo; 
        this.alergia = alergia; 
        this.tipoSanguineo = tipoSanguineo; 

   
            }

// Métodos GET = pegar

    public String getCod() {
        return this.cod;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getAlergia() {
        return this.alergia;
    }

    public String getPlanoSaude() {
    return this.planoSaude;

    }

    public String getTipoSanguineo() {
        return this.tipoSanguineo;
        
    }


         // Métodos SET = Modifica

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setDataNascimento(String novaDataNascimento) {
        this.dataNascimento = novaDataNascimento;
    }    

     public void setSexo(String novoSexo) {
        this.sexo = novoSexo;
    }

    public void setPlanoSaude(String novoPlanosaude) {
        this.planoSaude = novoPlanosaude;
    }

    public void setAlergia(String novaAlergia) {
        this.alergia = novaAlergia;
    }

    public void setTipoSanguineo(String novoTipoSanguineo) {
        this.tipoSanguineo = novoTipoSanguineo;
    }

}



public class PacienteClinica {
    public static void main (String [] args){ 

        
        Paciente paciente1 = new Paciente(null, "Suri", "06/08/2010", "feminino", null, "sim", "B+");
        
        System.out.println("Dados do Paciente:");
        System.out.println("Código: " + paciente1.getCod());
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());
        System.out.println("Sexo: " + paciente1.getSexo());
        System.out.println("Plano de Saúde: " + paciente1.getPlanoSaude());
        System.out.println("Alergia: " + paciente1.getAlergia());
        System.out.println("Tipo Sanguíneo: " + paciente1.getTipoSanguineo());  
        
        
        // Passo 3: Modificar os dados do objeto com os valores correspondentes aos dados da sua mãe ou pai
        paciente1.setNome("Carol");
        paciente1.setDataNascimento(" 07/03/1980");
        paciente1.setSexo("Feminino");
        paciente1.setAlergia("não");
        paciente1.setTipoSanguineo("O+");

        // Passo 4: Imprimir os dados do objeto novamente

        System.out.println("\nDados do Paciente Após Modificação:");
        System.out.println("Código: " + paciente1.getCod());
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());
        System.out.println("Sexo: " + paciente1.getSexo());
        System.out.println("Plano de Saúde: " + paciente1.getPlanoSaude());
        System.out.println("Alergia: " + paciente1.getAlergia());
        System.out.println("Tipo Sanguíneo: " + paciente1.getTipoSanguineo());

} 
    
}

    

public class Medico {
    private String codigoMedico;
    private String nomeMedico;
    private String sexoMedico;
    private String especialidade;
    private Endereco endereco;
    
    
    public Medico( String codigo, String nome, String sexo, String especialidade, Endereco endereco1){
        this.codigoMedico = codigo;
        this.nomeMedico = nome;
        this.sexoMedico = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco1;
       
    }

        // Métodos GET = pegar

    public String getCodigoMedico() {
        return this.codigoMedico;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

    public String getSexoMedico() {
        return this.sexoMedico;
    }
       
   public String getEspecialidade() {
        return this.especialidade;
    }
           
    public Endereco getEndereco() {
        return this.endereco;
    }
       

    
     // Métodos SET = Modifica

    
    public void setNomeMedico(String novoNomeMedico) {
        this.nomeMedico = novoNomeMedico;
    }

     public void setSexoMedico(String novoSexoMedico) {
        this.sexoMedico = novoSexoMedico;
    }

     public void setEspecialidade(String novaEspecialidade) {
        this.especialidade = novaEspecialidade;
    }

     public void setEndereco(Endereco novEndereco) {
        this.endereco = novEndereco;
    }

    
}



public class MedicoClinica {
    public static void main (String [] args){ 
    Endereco endereco1 = new Endereco(" Rua nova", "25", "casa B", "janga", " Paulista", "PE", "50000-000");
    Medico medico1 = new Medico(" 001", "Fulana", "Feminino", "Pediatria", endereco1);
    
            // Exibir Dados medico
        System.out.println("Dados do Médico Original:");
        System.out.println("Código: " + medico1.getCodigoMedico());
        System.out.println("Nome: " + medico1.getNomeMedico());
        System.out.println("Sexo: " + medico1.getSexoMedico());
        System.out.println("Especialidade: " + medico1.getEspecialidade());
        System.out.println("Endereço: " + medico1.getEndereco().getRua() +" " +  
         medico1.getEndereco().getNumero() + " " + medico1.getEndereco().getComplemento() + " " 
         + medico1.getEndereco().getBairro() + " - " + medico1.getEndereco().getCidade()+ " - " + 
         medico1.getEndereco().getUf() + " " + medico1.getEndereco().getCep());
         
        
          // Passo 3: Modificar os dados dos objetos 
          // Medico
        medico1.setNomeMedico("Carol");
        medico1.setSexoMedico("Feminino");
        medico1.setEspecialidade("Car");

            // Endereço
        endereco1.setRua("O+");
        endereco1.setNumero( " 11");
        endereco1.setComplemento( " apt 234");
        endereco1.setBairro(" Beberibe");
        endereco1.setCidade( "Recife");
        endereco1.setUf( "PE");
        endereco1.setCep(" 54444-000 ");

        System.out.println( "\n ****************** \n");

        // Exibir Dados modificados medico
        System.out.println("Dados do Médico Modificado:");
        System.out.println("Código: " + medico1.getCodigoMedico());
        System.out.println("Nome: " + medico1.getNomeMedico());
        System.out.println("Sexo: " + medico1.getSexoMedico());
        System.out.println("Especialidade: " + medico1.getEspecialidade());
        System.out.println("Endereço: " + medico1.getEndereco().getRua() +" " +  
         medico1.getEndereco().getNumero() + " " + medico1.getEndereco().getComplemento() + " " 
         + medico1.getEndereco().getBairro() + " - " + medico1.getEndereco().getCidade()+ " - " + 
         medico1.getEndereco().getUf() + " " + medico1.getEndereco().getCep());
}
}
    


public class Lutador {
    private String nomeLutador;
    private int energia;
    private int forca;

    
    public Lutador ( String nomeLutador, int energia, int forca){

        this.nomeLutador = nomeLutador;
        this.energia = energia;
        this.forca = forca;


    }

    

    public void reduzirEnergia(int menosEnergia){// ( lutador i)

         
        this.energia = this.energia - menosEnergia  ;

        }
        
    public void aplicarGolpe(Lutador oposto){
       oposto.reduzirEnergia(this.forca);

    }
    public int getEnergia() {
        return this.energia;
    }
    
    public String getNomeLutador() {
        return this.nomeLutador;
    }

}




public class streetFighter{

 
    public static void main (String [] args){ 
    Lutador lutador1 = new Lutador("Ryu", 100, 10);
    Lutador lutador2 = new Lutador("Bison", 100, 12);

    int tam = 3;
    
    for( int i = 0; i < tam; i++){
        lutador1.aplicarGolpe(lutador2);

 }
 System.out.println("Energia de Bison após receber 3  golpes de Ryu: " + lutador2.getEnergia());
tam = 8;
    for( int i = 0; i < tam; i++){
        lutador2.aplicarGolpe(lutador1);

 }
  System.out.println("Energia de Ryu após receber 8  golpes de Bison: " + lutador1.getEnergia());

    }
     

 }


public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos; 
      
    public Post( String texto, String link){

    this.texto = texto;
    this.link = link;
    this.numeroCurtidas = 0;
    this.numeroCompartilhamentos = 0;
    }

  public  void curtir (){
        
        this.numeroCurtidas++;

    }
   public  void compartilhar(){
        
        this.numeroCompartilhamentos++;

    }

    public int getNumeroCurtidas(){
        return this.numeroCurtidas;

    }

     public int getNumeroCompartilhamentos(){
        return this.numeroCompartilhamentos;

    }

    public String getTexto(){
        return this.texto;
    }

    public String getLink(){
        return this.link;
    }
}



 public static void main (String [] args){ 
        Post post1 = new Post(" vamos lá ", " www.carol.com.br");
        int tam = 3;
         for (int i = 0; i < tam; i++) {
        post1.curtir();
        }
        
           System.out.println(" O texto: "  + post1.getTexto() + " e o link: " + post1.getLink() + " receberam --> "  + post1.getNumeroCurtidas() + " curtidas" );

           tam = 2;
          for (int i = 0; i < tam; i++) {
        
        post1.compartilhar();
       }
            System.out.println( " O link: " + post1.getLink() + " e o  texto: "  + post1.getTexto() + " receberam --> " + post1.getNumeroCompartilhamentos() + " compartilhamentos:");


        }
    }





}
