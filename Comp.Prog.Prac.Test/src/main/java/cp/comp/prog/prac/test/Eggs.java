/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.comp.prog.prac.test;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author student
 */
public class Eggs extends Food {

    public Eggs(int size) {
        super(size);
    }



    /**
     * @return the eggsSize
     */

    @Override
    public String toString() {
        // Person[name=John Doe,age=33,smoker=false] output example
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
