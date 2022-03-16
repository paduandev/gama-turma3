package exercicio02;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        }
    }

    public void setMinuto(int novoMinuto) {
        if(novoMinuto >= 0 && novoMinuto < 60) {
            minuto = novoMinuto;
        }
    }

    public void setSegundo(int novoSegundo) {
        if(novoSegundo >= 0 && novoSegundo < 60) {
            segundo = novoSegundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHoraAtual() {
        return hora + ":" + minuto + ":" + segundo;
    }

}
