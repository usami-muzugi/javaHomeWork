package wiki.conoha.javahomework.thread.thread_weather;

public class ReadWeather implements  Runnable{
    private Weather weather;
    public ReadWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        System.out.println(weather);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
