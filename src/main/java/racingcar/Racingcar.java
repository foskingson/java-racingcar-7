package racingcar;

public class Racingcar {    
    private String name;
    private int moveCount;

    public Racingcar(String name) { 
        this.name = name;
        this.moveCount = 0;
    }

    public static void moveRacingcar(Racingcar racingcar){  // 전진조건에 맞아 전진할 경우 이동거리 +1
        racingcar.moveCount++;
    }
}