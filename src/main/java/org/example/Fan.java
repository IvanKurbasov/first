package org.example;

public class Fan {
    private final int bladeCount; // количество лопостей
    private int mode = 1; // номер режима от 1 до maxMode
    private final int maxMode; // количество режимов
    private final int energy;
    private int oborot = 2000;

    public void ModeUp(){
        mode = mode % maxMode + 1;
        oborot = 1500 + 500 * mode;
    }
    public void ModeDown(){
        if (mode == 1){
            mode = maxMode;
        } else{
            mode--;
        }
        oborot = 1500 - 500 * mode;
    }
    public Fan(int bladeCount, int maxMode, int energy){
        if (bladeCount > 0) {
            this.bladeCount = bladeCount;
        }else{
            throw new RuntimeException("jjfjfj");
        }
        this.maxMode = maxMode;
        this.energy = energy;
    }
}
