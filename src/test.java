/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author se180663
 */
public class test {
    public static void main(String[] args) {
//       i4idol emi = new i4idol("Eimi", 58, 1.60);
//       i4idol ozawa = new i4idol("Ozawa", 60, 1.65);
       i4idol []a = new i4idol[8];
       a[0] = new i4idol("Eimi", 58, 1.60);
       a[1] = new i4idol("Ozawa", 60, 1.65);
       a[2] = new i4idol("Ochi", 62, 1.65);
       a[3] = new i4idol("Oza", 61, 1.65);
//        System.out.println(a[0]);
//        for (i4idol o : a) {
//            System.out.println(o);
//        }
        max_vong1(a);
    }
    static void max_vong1(i4idol a[]){
        int tem = a[0].vong_mot;
        for ( i4idol o : a) {
            if( o!=null &&tem < o.vong_mot)
                tem = o.vong_mot;
        }
        System.out.println(tem);
    }
}
