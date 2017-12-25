package wiki.conoha.javahomework.thread.thread_weather;

import com.sun.org.apache.regexp.internal.RE;

public class Weather {
    private int temperature;
    private int humidity;
    private boolean flag = false;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public synchronized void generate(int temperature,int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }
    public void read(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "温度:"+this.temperature+" 湿度: "+this.humidity;
    }
}
