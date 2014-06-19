/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

/**
 * A QApi Union.
 *
 * @author shevek
 */
public abstract class QApiUnion extends QApiObject {

    /**
     * Returns true if this is a valid union.
     *
     * i.e. exactly one field is set.
     */
    public abstract boolean isUnion();
}
