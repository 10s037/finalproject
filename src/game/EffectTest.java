package game;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EffectTest {
    static  Effect effect;

    @BeforeEach
    void setUp() {
        int duration = 6;
        effect = new Effect(6);
    }

    @Test
    void duritationTestTrue(){
        for (int i = 0; i <7 ; i++) {
            effect.update();
        }
        org.junit.jupiter.api.Assertions.assertTrue(effect.isDone());
    }
    @Test
    void duritationTestFalse(){
        for (int i = 0; i <9 ; i++) {
            effect.update();
        }
        org.junit.jupiter.api.Assertions.assertTrue(effect.isDone());
    }
}