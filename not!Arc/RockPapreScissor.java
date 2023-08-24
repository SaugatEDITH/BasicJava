import java.util.Scanner;

class Calculation {
    String message() {
        return "If you want to play again, enter 'y'. If not, enter 'n'.";
    }

    boolean replay(Scanner sc) {
        char replayChoice = Character.toUpperCase(sc.next().charAt(0));
        return replayChoice == 'Y';
    }
}

class RockPapreScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();
        boolean replay = true;
        String result;

        while (replay) {
            int variable = 1 + (int) (3 * Math.random());
            char computerChoice = (variable == 1) ? 'R' : (variable == 2) ? 'P' : 'C';
            System.out.println("enter your chice r,p,c");
            char humanChoice = Character.toUpperCase(sc.next().charAt(0));

            if (computerChoice == humanChoice) {
                System.out.println("It's a draw. Do you want to play again? Enter 'Y' for yes and 'N' for no");
                replay = cal.replay(sc);
                continue;
            }
            
            if ((computerChoice == 'R' && humanChoice == 'P') || (computerChoice == 'P' && humanChoice == 'C')
                         || (computerChoice == 'C' && humanChoice == 'R')) {
                result = "You won!";

            } else {
                result = "Computer won!";
            }

            System.out.println(result);
            System.out.println(cal.message());
            replay = cal.replay(sc);
        }
    }
}
