public class TV {
    private RemoteController remoteController;
    private boolean OnOff;
    public TV(){

        this.OnOff = false;
    }

    public boolean isOnOff() {
        return OnOff;
    }

    public void setOnOff(boolean onOff) {
        OnOff = onOff;
    }
}
