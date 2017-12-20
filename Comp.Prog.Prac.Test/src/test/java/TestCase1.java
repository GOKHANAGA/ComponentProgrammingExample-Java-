/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cp.comp.prog.prac.test.Eggs;
import cp.comp.prog.prac.test.Fridge;
import cp.comp.prog.prac.test.Meat;
import cp.comp.prog.prac.test.Milk;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class TestCase1 {

    public TestCase1() {
        Fridge fridge = new Fridge(8);
        Eggs egg1 = new Eggs();
        Eggs egg2 = new Eggs();
        Meat meat = new Meat();
        Milk milk = new Milk();
    }

}
