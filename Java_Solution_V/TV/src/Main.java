
public class Main extends TV{
    public static void main(String[] args) {
        TV telewizor = new TV();
        System.out.println("stan: " + telewizor.turnedOn);
        System.out.println("kanal: " + telewizor.channel);

        telewizor.turnOn();
        System.out.println("stan: " + telewizor.turnedOn);
        telewizor.setChannel(7);
        telewizor.channelDown();
        System.out.println("kanal: " + telewizor.channel);
        System.out.println(8);
        telewizor.channelUp();
        System.out.println("kanal: " + telewizor.channel);
    }
}
