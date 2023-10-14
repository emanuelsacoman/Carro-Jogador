public class Carro extends Partes{
    private int anoFab;
    private String cor;
    private String marca;
    private float velocidadeMax;

    public Carro(int anoFab, String cor, String marca, float velocidadeMax){
        this.anoFab = anoFab;
        this.cor = cor;
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
    }

    public int getAnoFab(){
        return anoFab;
    }

    public String getCor(){
        return cor;
    }

    public String getMarca(){
        return marca;
    } 

    public float getVelocidadeMax(){
        return velocidadeMax;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAnoFab(int anoFab){
        this.anoFab = anoFab;
    }

    public void setVelocidadeMax(float velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
}
