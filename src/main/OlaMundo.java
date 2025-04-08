public class OlaMundo {
    public String imprimirMensagem() {
        return "Olá, mundo!";
    }

    public static void main(String[] args) {
        OlaMundo ola = new OlaMundo();
        System.out.println(ola.imprimirMensagem());

    }
}
