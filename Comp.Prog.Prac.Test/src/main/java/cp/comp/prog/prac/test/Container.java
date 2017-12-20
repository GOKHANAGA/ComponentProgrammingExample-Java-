/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.comp.prog.prac.test;

import java.util.List;

/**
 *
 * @author student
 * @param <Food>
 */
public interface Container<Food> {

    public boolean put(Food t);

    boolean remove(Food t);

    List<Food> getAll();
}
