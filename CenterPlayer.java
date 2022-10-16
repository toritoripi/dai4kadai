import java.util.List;

public class CenterPlayer {

    public static void main(String[] args) {
        List<String> playerList = List.of("桜木", "魚住", "赤木", "河田", "花形");
        playerList.stream().filter(player -> player.contains("木")).forEach(System.out::println);
    }
}
