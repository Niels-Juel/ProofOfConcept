/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author a.shalin
 */
@Named(value = "signEntity")
@SessionScoped
public class SignEntity implements Serializable {

    /**
     * Creates a new instance of SignEntity
     */
    public SignEntity() {
    }
    
}
