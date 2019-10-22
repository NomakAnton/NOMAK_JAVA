public class TV {
    private int MAX_SIZE_CHANNEL = 5;
    private RemoteController remoteController;
    private boolean OnOff;
    private Channel channel[];
    private int count;
    public TV(){
        this.count = 0;
        this.OnOff = false;
        this.channel = new Channel[MAX_SIZE_CHANNEL];
    }

    public boolean isOnOff() {
        return OnOff;
    }

    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public void setOnOff(boolean onOff) {
        OnOff = onOff;
    }
    public void show(int number ){
        System.out.println("Сейчас смотрим канал - " + this.channel[number].getName());
        this.channel[number].isGoingProgram();
    }
    public void addChannel(Channel channel) {
        this.channel[count] = channel;
        count++;
    }
    public void OnOff(){
        if (isOnOff() == false){
            setOnOff(true);
            if(remoteController.getCurrent()>-1&&remoteController.getCurrent()<MAX_SIZE_CHANNEL){
                System.out.println("Включаем телевизор");
                show(remoteController.getCurrent());
                return;
            }
            else {
                System.out.println("error");
            }

        }
        if(isOnOff()== true){
            System.out.println("Выключаем телевизор");
        }

    }

    public int getCount() {
        return count;
    }
}
