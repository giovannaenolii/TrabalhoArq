package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {
    public abstract IntNotificacoes criarNotificacoes();

    public void enviarNotificacao(){
        IntNotificacoes notificacao = criarNotificacoes();
        notificacao.enviar();
    }
}
