
public class TV {
    public int channel;
    public boolean turnedOn;

    public TV() {
        channel = 0;
        turnedOn = false;

    }

    public TV(boolean x, int c) {
        turnedOn = x;
        channel = c;
    }


    public int getChannel() {
        return channel;

    }

    public void setChannel(int c) {
        channel = c;
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

}







