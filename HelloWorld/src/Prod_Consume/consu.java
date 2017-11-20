package Prod_Consume;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
public class consu implements Runnable
{
	static Queue <Integer> q = new ArrayDeque(10);
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
        while (true) {
            synchronized (q) {
                if (q.isEmpty()) 
                {
                    try {
                        System.out.println("Q is empty so waiting ");
                        q.wait();
                    }catch(InterruptedException ie) {
                        ie.printStackTrace();
                    }
                } else {
                	
                    q.remove();
                    q.notifyAll();
                }
            }
        }
    }
}