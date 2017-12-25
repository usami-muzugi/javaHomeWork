package wiki.conoha.javahomework.thread.thread_weather;

public class Test {
    public static void main(String[] args) {
        Weather weather = new Weather();
        new Thread(new GenerateWeather(weather)).start();
        new Thread(new ReadWeather(weather)).start();
    }
}
