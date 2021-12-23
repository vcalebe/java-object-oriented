package array;

//basico
public class Main {
    public static void main(String[] args) {
        //exp 1
        String[] times = new String[5];
        times[0] = "Palmeiras";
        times[1] = "Flamengo";
        times[2] = "Atle Min";
        times[3] = "Corinthans";
        times[4] = "Sao Paulo";

        for(String x : times){
            System.out.println(x);
        }
    }
}
