/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.lang.reflect.Array;

/**
 *
 * @author USER
 */
public class TS_Object implements Serializable {

    private String code;
    private Array objects;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Array getObjects() {
        return objects;
    }

    public void setObjects(Array objects) {
        this.objects = objects;
    }

    public TS_Object toObject(Integer code, Array objects) {
        TS_Object ob = new TS_Object();
        ob.setCode(this.getCode());
        ob.setObjects(this.getObjects());
        return ob;
    }
}
