public class DoWhile01 {
    public static void main(String[] args) {
        int number = 1;
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        // numberが50未満の場合、ブロックの処理をループ実行する
        // doで始まり、whileで終わる
        } while (number < 50);
    }
}

//WhileとDoWhileの違いは、変数の初期化を「int number = 100;」に変更して実行するとわかる
//Whileはnumber=100の場合、数が５０未満なので処理されない
//DoWhileはnumber=100の場合、数が５０未満なのでループ実行されずに「number = 200」が表示される