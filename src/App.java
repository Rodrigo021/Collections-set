public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidado cc = new ConjuntoConvidado();

        System.out.println("Existem "+cc.contarConvidados()+" dentro do set convidados");

        cc.adicionarConvidado("c1", 1234);
        cc.adicionarConvidado("c2", 1235);
        cc.adicionarConvidado("c3", 1235);
        cc.adicionarConvidado("c4", 1236);

        System.out.println("Existem "+cc.contarConvidados()+" dentro do set convidados");

        cc.removerConvidadoPorCodigo(1236);
        System.out.println("Existem "+cc.contarConvidados()+" dentro do set convidados");

        cc.exibirConvidados();
    }
}
