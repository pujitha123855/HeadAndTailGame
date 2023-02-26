import java.util.*;
public class CoinTossGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no.of cycles");
        int cycles = s.nextInt();
        System.out.print("enter no.of rounds:");
        int n = s.nextInt();
        int c1 = 0, c2 = 0, p1, p2;
        ArrayList<String> d = new ArrayList<>();
        d.add("no.of cycles");
        d.add("no.of rounds");
        d.add("player1");
        d.add("player2");
        System.out.println(d);
        int cycle = 1;
        int count = 0, count1 = 0, count2 = 0;
        for (int i = 1; i <= cycles; i++) {
            int round = 1;
            for (int j = 1; j <= n; j++) {
                String sc = "" + cycle;
                ArrayList<String> a = new ArrayList<>();
                a.add(sc);
                String str = "" + round;
                a.add(str);
                Random r = new Random();
                p1 = r.nextInt(2);
                if (p1 == 1)
                    a.add("head");
                else
                    a.add("tail");
                p2 = r.nextInt(2);
                if (p2 == 1)
                    a.add("head");
                else
                    a.add("tail");
                System.out.println(a);
                if ((a.get(2)).equals("head"))
                    c1 = c1 + 1;
                if ((a.get(3)).equals("head"))
                    c2 = c2 + 1;
                a.clear();
                round++;
            }
            if (c1 > c2) {
                System.out.println("The out put of cycle is: player 1 wins");
                count++;
            } else if (c1 == c2) {
                System.out.println("The output of cycle is : its a tie");
                count1++;
            } else {
                System.out.println("The output of cycle is : player 2 wins");
                count2++;
            }
            c1 = 0;
            c2 = 0;
            cycle++;
        }
        if (count > count2 && (count >= count1 || count<=count1))
            System.out.println("Final result is : player 1 wins");
        else if ((count2>=count1 || count2<=count1) && count2>count)
            System.out.println("Final result is : player 2 wins");
        else 
            System.out.println("Final result is : its a tie");
      

    }
}