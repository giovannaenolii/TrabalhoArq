package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacoes fabricaEmail = new FabricaEmail();
        fabricaEmail.enviarNotificacao();

        FabricaNotificacoes fabricaSMS = new FabricaSMS();
        fabricaSMS.enviarNotificacao();
    }
}
