/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

/**
 *
 * @author menbt
 */
public class checksymbol {

    public static char[] b = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public static boolean checksymbol(String str) {
        char[] a = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(checksymbol("01254678"));
    }

}
