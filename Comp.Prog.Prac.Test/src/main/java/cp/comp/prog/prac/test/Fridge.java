/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.comp.prog.prac.test;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
//import org.apache.commons.lang.builder.EqualsBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author student
 */
public class Fridge implements Container<Food> {

    private final int fridgeCapasity;
    //can`t be list because it is abstract.... can be ArrayList like this
    private List<Food> fridge = new ArrayList<>();

    public Fridge(int fridgeCapasity) {
        this.fridgeCapasity = fridgeCapasity;
    }

    public int getFreeSpace() {
        return fridgeCapasity-getOccupiedSpace();
    }

    public int getOccupiedSpace() {
        int sizeOfTotal = 0;
        for (int i = 0; i < fridge.size(); i++) {
            sizeOfTotal += fridge.get(i).getSize();
        }
        return sizeOfTotal;
    }

    @Override
    public boolean put(Food t) {
        if(getFreeSpace()>= t.getSize()){
            return fridge.add(t);
        }
        return false;
    }

    @Override
    public boolean remove(Food t) {
        return fridge.remove(t);
    }

    @Override
    public List<Food> getAll() {
        return Collections.unmodifiableList(fridge);
    }

    /**
     * @return the fridgeCapasity
     */
    public int getFridgeCapasity() {
        return fridgeCapasity;
    }

    @Override
    public String toString() {
        // Person[name=John Doe,age=33,smoker=false] output example
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
