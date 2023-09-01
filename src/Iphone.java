
public class Iphone implements Ipod, Contatos, Telefone, Safari {

    void ligarIphone() {
        System.out.println("Bem vindo ao seu Iphone");
    }

    void desligarIphone() {
        System.out.println("Até a próxima...");
    }

    // NAVEGADOR
    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página selecionada...");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Adicionar uma nova página...");
    }

    @Override
    public void atualizarPag() {
        System.out.println("Página sendo atualizada, essa operação pode demorar alguns minutos...");
    }

    @Override
    public void salvarPag() {
        System.out.println("Página salva em Favoritos!");
    }

    @Override
    public void fecharPag() {
        System.out.println("EXIT");
    }

    // APP TELEFONE
    @Override
    public void ligar(int numero) {
        System.out.println("Ligar para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciar seu Correio de Voz, essa ação poderá ser cobrada.");
    }

    // AGENDA DE CONTATOS
    @Override
    public void addContatoNovo(int numero, String nome) {
        System.out.println("Adicionar novo contato " + numero + nome);
    }

    @Override
    public void excluirContato(int numero) {
        System.out.println("Exluir o contato com número: " + numero);
    }

    // IPOD
    @Override
    public void tocarMusica() {
        System.out.println("A música desejada será executada...");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSA || ");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a música que deseja ouvir");
    }

    @Override
    public void pularMusica() {
        System.out.println("Pulando para próxima faixa...");
    }

    @Override
    public void aumentarVol() {
        System.out.println("Aumentado o volume ++++");
    }

    @Override
    public void baixarVol() {
        System.out.println("Diminuindo o volume ----");
    }

}
