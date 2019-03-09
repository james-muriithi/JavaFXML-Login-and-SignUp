/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlloginandsignup;

import java.util.regex.Pattern;

/**
 *
 * @author intel
 */
public class NewClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([a-z0-9_\\-\\.])+\\@([a-z0-9_\\-\\.])+\\.([a-z]{2,4})$");
        System.out.println(pattern.matcher("mu@gmail.com").matches());
    }
}
