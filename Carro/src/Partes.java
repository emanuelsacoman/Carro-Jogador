public class Partes {

    public String getMotor(int x){
        if(x == 0){
            return "1.0";
        }else if (x == 1){
            return "2.0";
        }else if (x == 2){
            return "1.0";        
        }else {
            return "erro";
        }
    }

    public String getCambio(int x){
        if(x == 0){
            return "Manual";
        }else if (x == 1){
            return "Manual";
        }else if (x == 2){
            return "Manual";        
        }else {
            return "erro";
        }
    }


    public String getChassis(int x){
        if(x == 0){
            return "Tunel";
        }else if (x == 1){
            return "Tunel";
        }else if (x == 2){
            return "Tunel";        
        }else {
            return "erro";
        }
    }
    public String getBanco(int x){
        if(x == 0){
            return "Couro";
        }else if (x == 1){
            return "Tecido";
        }else if (x == 2){
            return "Tecido";        
        }else {
            return "erro";
        }
    }

    public void Liga(){
        System.out.println("Ligando");
    }

    public void Desliga(){
        System.out.println("Desligando");
    }

    public void Acelera(){
        System.out.println("vrumvrumm");
    }

    public void Freia(){
        System.out.println("Freia");
    }
}
