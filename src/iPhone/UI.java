package iPhone;

public class UI {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("****Bem-vindo ao iPhone 1!****");
        System.out.println("\n");

//Chamando funções da classe telefone
        Caller.dialNumber();
        Caller.answerCall();
        Caller.voiceMail();
        System.out.println("\n");

//Chamando funções da classe Internet
        Internet.addNewTab();
        Internet.showPage();
        Internet.refreshPage();
        System.out.println("\n");

//Chamando funções da classe player de música
        MusicPlayer.selectMusic();
        MusicPlayer.pauseMusic();
        MusicPlayer.playMusic();
        System.out.println("\n");
    }
}