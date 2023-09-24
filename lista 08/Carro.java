public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;


    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar( double aceleracao){
        double velocimetro = 0.0;
        while (velocimetro < aceleracao) {
            this.velocidade += 1.0; 
            velocimetro++; // Aumenta a velocidade em 1 unidade a cada iteração (pode variar de acordo com a lógica desejada).

        }
    }

    public void desacelerar ( double desaceleracao){
        double velocimetro = 0.0;


        while (this.velocidade > 0 && velocimetro < desaceleracao) {
       this.velocidade -= 1.0 ; // Aumenta a velocidade em 1 unidade a cada iteração (pode variar de acordo com a lógica desejada).
       velocimetro++;

         if ( this.velocidade < 0){
            this.velocidade = 0;
             System.out.println( " Velocidade invalida");

         }
        
    }
    
    }

    
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public double getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
