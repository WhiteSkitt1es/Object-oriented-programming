package Lesson_2.Interface;

import Lesson_2.Interface.Healers.Healer;
import Lesson_2.Interface.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {

    }

    @Override
    public void healing(Hero target) {

    }
}
