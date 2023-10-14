public class App {
    public static void main(String[] args) throws Exception {
        Carro[] carros = new Carro[3];

        carros[0] = new Carro(2001, "Verde", "Escort", 122);
        carros[1] = new Carro(2004, "Branco", "Palio", 111);
        carros[2] = new Carro(2003, "Preto", "Gol", 113);

        veiculos(carros);
    }

    public static void veiculos(Carro[] carros) {
        for (int x = 0; x < carros.length; x++) {
            Carro carro = carros[x];
          
            System.out.println("Carro "+ x +
                               " Ano: " + carro.getAnoFab() +
                               ", Cor: " + carro.getCor() +
                               ", Modelo: " + carro.getMarca() +
                               ", Velocidade: " + carro.getVelocidadeMax() +
                               ", Cambio: "+ carro.getCambio(x)+
                               ", Chassis: "+ carro.getChassis(x)+
                               ", Banco: "+ carro.getBanco(x)+
                               ", Motor: "+ carro.getMotor(x));
            carro.Liga();
            carro.Acelera();
            carro.Freia();
            carro.Desliga();
            
            if(x < 2){
                System.out.println("\n");
            }
        }
    }
}
