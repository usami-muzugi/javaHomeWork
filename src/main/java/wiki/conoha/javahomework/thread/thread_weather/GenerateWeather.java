package wiki.conoha.javahomework.thread.thread_weather;

public class GenerateWeather implements Runnable {
    Weather weather;

    public GenerateWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        if(!weather.getFlag()){
            for (int i = 1; i <=30 ; i++) {
                System.out.println("生成天气");
                weather.setTemperature((int) (Math.random()*20));
                weather.setHumidity((int)(Math.random()*60));
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            weather.setFlag(true);
        }
    }
}
