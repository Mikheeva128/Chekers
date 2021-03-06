import java.util.Arrays;
import java.util.Scanner;

public class RussianCheckers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String white = in.nextLine();
        String black = in.nextLine();

        Parser parser = new Parser(white, black);
        Board board = new Board(parser.getInitialPositions());

        final int operation = 2;
        Move move;
        Color color = Color.WHITE;
        while (in.hasNext()) {
            String str = in.next();
            if (str.charAt(operation) == ':') {
                move = new Move(parser.parseCoordinates(str), color, true);
            } else {
                move = new Move(parser.parseCoordinates(str), color, false);
            }
            for (Checker pos : move.getMove()) {
                System.out.println(Arrays.toString(pos.getCoordinates()) + " " + pos.getColor());
            }
//            System.out.println("moves: " + move.getMove());

            System.out.println("isCapture: " + move.getCapture());
            if (color != Color.BLACK) {
                color = Color.BLACK;
            } else {
                color = Color.WHITE;
            }
        }

//        for (int i = 0; i < initialPositions.size(); i++) {
//            System.out.print(initialPositions.get(i));
//        }
//        System.out.println('\n');
//        State[][] boardFilled;

//        parser.

//        String move;
//        while ((move = in.next()) != null) {
//            parser.parseMoves(move);
//
//        }
//        System.out.println(Arrays.deepToString(Checker.getMoves()));
//        String movements = in.black();
        in.close();
    }
}
