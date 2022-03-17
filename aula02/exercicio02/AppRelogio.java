package exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(12, 34, 56);

        boolean trocou = relogio.setHora(51);
        if(trocou) {
            System.out.println("Hora atualizada");
        } else {
            System.out.println("Erro na atualização");
        }

        relogio.setMinuto(98);
        System.out.println(relogio.getHoraAtual());
    }
}
