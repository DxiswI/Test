class Main {
  public static void main(String[] args) {
    boolean isGreenLight = false;  // Красный свет

    int speedOfPlayer1 = 5;  // Все скорости не 0
    int speedOfPlayer2 = 3;
    int speedOfPlayer3 = 7;

    int countOfEliminatedPlayers = 0;

    if (isGreenLight == true) {
      countOfEliminatedPlayers = 0;
    } else {
      if (speedOfPlayer1 != 0) {
        countOfEliminatedPlayers = countOfEliminatedPlayers + 1;
      }
      if (speedOfPlayer2 != 0) {
        countOfEliminatedPlayers = countOfEliminatedPlayers + 1;
      }
      if (speedOfPlayer3 != 0) {
        countOfEliminatedPlayers = countOfEliminatedPlayers + 1;
      }
    }

    System.out.println(countOfEliminatedPlayers);
  }
}
