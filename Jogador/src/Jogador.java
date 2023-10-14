public class Jogador{
    public String getTronco(int x) {
        if (x == 0){
            return "2.2";
        }else if(x == 1){
            return "3.1";            
        }else if(x == 2){
            return "1.8";      
        }else{
            return "error";
        }
    }

    public String getPernaDireita(int x) {
        if (x == 0){
            return "6.9";
        }else if(x == 1){
            return "8.5";            
        }else if(x == 2){
            return "7.1";      
        }else{
            return "error";
        }
    }

    public String getPernaEsquerda(int x) {
        if (x == 0){
            return "1.3";
        }else if(x == 1){
            return "2.1";            
        }else if(x == 2){
            return "4.0";      
        }else{
            return "error";
        }
    }

    public String getCabeca(int x) {
        if (x == 0){
            return "4.0";
        }else if(x == 1){
            return "8.2";            
        }else if(x == 2){
            return "8.8";      
        }else{
            return "error";
        }
    }

    public String getVelocidade(int x) {
        if (x == 0){
            return "6.3";
        }else if(x == 1){
            return "10.4";            
        }else if(x == 2){
            return "9.1";      
        }else{
            return "error";
        }
    }

    public String getSalto(int x) {
        if (x == 0){
            return "1.5";
        }else if(x == 1){
            return "2.1";            
        }else if(x == 2){
            return "1.9";      
        }else{
            return "error";
        }
    }

    public String getChute(int x) {
        if (x == 0){
            return "5";
        }else if(x == 1){
            return "6";            
        }else if(x == 2){
            return "7";      
        }else{
            return "error";
        }
    }
}
