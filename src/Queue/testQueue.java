/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author se180663
 */
public class testQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("karen");
        queue.offer("chad");
        queue.offer("steve");
        queue.offer("hanry");
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
