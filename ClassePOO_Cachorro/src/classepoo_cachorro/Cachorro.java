
package classepoo_cachorro;

public class Cachorro {
    private String nome;
    private double tamanho;
    private double peso;
    private String cor;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    

    void mostrar() {
 System.out.println("nome do seu cachorro e:"+ getNome()+ "qual a cor do seu cachorro" + getCor()+ "me diga o tamanho"+ getTamanho()+"qual o tamanho"+ getPeso()+"me fale o seu peso");
}
            
}
