package oops;
class tv{
    //data fields
    int channel=1;
    int vol=1;
    boolean on= false;
    public tv(){ //this is a contructor

    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setchannel(int newChannel){
        if(on&&newChannel >=1 && newChannel<=120){
            channel = newChannel;
        }
    }
    public void setVol(int newvol){
        if(on&& newvol>=1 && newvol<=7){
            vol=newvol;
        }
    }
    public void channelUp(){
        if(on&& channel<120) channel++;
    }
    public void channeldown(){
        if(on&& channel>1) channel--;
    }
    public void volup(){
        if(on&& vol>1 ) vol++;
    }
    public void voldown(){
        if(on && vol<7) vol--;
    }
}
public class BasicImpImplementation {
    public static void main(String[] args) {
      tv tv1 = new tv();
      tv tv2 = new tv();

      tv1.turnOn();
      tv1.setchannel(69);
      tv1.channelUp();
      tv1.voldown();
      tv1.channeldown();
      tv1.setchannel(87);
      tv1.volup();

      tv1.turnOff();
      tv1.setVol(4);

      tv2.turnOn();
      tv2.setVol(5);
        tv2.setchannel(87);
        tv2.volup();
        tv2.setVol(4);
        System.out.println("tv1 channel is "+ tv1.channel+"vol level is "+ tv1.vol);
        System.out.println("tv2 channel is "+ tv2.channel+"vol level is "+ tv2.vol);
    }
}
