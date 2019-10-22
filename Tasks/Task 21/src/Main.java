public class Main {
    public static void main(String[] args) {
    TV homeTV = new TV();
    Program music = new Program("Музыкальная программа");
    Program cooking = new Program("Кулинарная программа");
    Program news = new Program("Программа новостей");
    Program talkShow = new Program("Ток шоу");
    Program serial = new Program("Сериал");
    Channel firstChannel = new Channel("Первый");
    firstChannel.addProgram(music);
    firstChannel.addProgram(cooking);
    firstChannel.addProgram(news);
    firstChannel.addProgram(talkShow);
    firstChannel.addProgram(serial);
        Channel MTV = new Channel("MTV");
        MTV.addProgram(music);
        MTV.addProgram(cooking);
        MTV.addProgram(news);
        MTV.addProgram(talkShow);
        MTV.addProgram(serial);
        Channel TNT = new Channel("TNT");
        TNT.addProgram(music);
        TNT.addProgram(cooking);
        TNT.addProgram(news);
        TNT.addProgram(talkShow);
        TNT.addProgram(serial);
        Channel STS = new Channel("STS");
        STS.addProgram(music);
        STS.addProgram(cooking);
        STS.addProgram(news);
        STS.addProgram(talkShow);
        STS.addProgram(serial);
        Channel Russia = new Channel("Russia");
        Russia.addProgram(music);
        Russia.addProgram(cooking);
        Russia.addProgram(news);
        Russia.addProgram(talkShow);
        Russia.addProgram(serial);
        RemoteController remoteController = new RemoteController(homeTV);
        homeTV.addChannel(firstChannel);
        homeTV.addChannel(MTV);
        homeTV.addChannel(TNT);
        homeTV.addChannel(STS);
        homeTV.addChannel(Russia);
        //remoteController.pushNumberButton(3);
        //remoteController.pushButtonNext();
        //remoteController.pushButtonPrevious();
        homeTV.setRemoteController(remoteController);
       remoteController.pushOn();
       remoteController.pushOn();



    }
}
