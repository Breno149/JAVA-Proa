   package FirstAtividade;

     public class Buzao {

    int onibus;
    String sao_paulo;
    String turismo;
    int paradas;
    int capacidade_onibus;
    int pessoas_onibus;

    public Buzao(int onibus, String sao_paulo, String turismo, int paradas, int capacidade_onibus, int pessoas_onibus) {
        this.onibus = onibus;
        this.sao_paulo = sao_paulo;
        this.capacidade_onibus = capacidade_onibus;
        this.pessoas_onibus = pessoas_onibus;
        this.paradas = paradas;
        this.turismo = turismo;

    }

    public int getParadas() {
        return paradas;
    }


    public void setPessoas_onibus(int pessoas_onibus) {
        if (this.pessoas_onibus <= capacidade_onibus) {
            this.pessoas_onibus = pessoas_onibus;

        }
    }

    public void saida(int pessoas_onibus) {
        if (pessoas_onibus <= this.pessoas_onibus) {
            this.pessoas_onibus = pessoas_onibus - this.pessoas_onibus;
        }
    }

    public String parar() {

        return "O onibus parou";
    }


    public static class Exemplo_Class {


        public static void main(String[] args) {
            Buzao b1 = new Buzao(1, "Partida", "Gramado", 1, 40, 35);
            Buzao b2 = new Buzao(2, "Partida", "Porto de galinhas", 2, 35, 30);
            Buzao b3 = new Buzao(3, "Partida", "São roque", 0, 40, 38);
            System.out.println(b1.getParadas());
            System.out.println(b2.getParadas());
            System.out.println(b3.getParadas());

        }


    }
}
