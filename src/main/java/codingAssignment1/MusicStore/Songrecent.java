package codingAssignment1.MusicStore;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Songrecent {

	static int capacity = 4;

	HashMap<String, Queue> map = new HashMap<String, Queue>();



	public void adduser(String userid, String recent) {
//
		Songrecent sc = new Songrecent();
		int flag;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter username : ");
			userid = input.next();
			System.out.println("Enter song name : ");
			recent = input.next();

			sc.recentsong(recent, userid);

			System.out.println("Do you want to add more songs : ");
			flag = input.nextInt();

		} while (flag != 0);
		sc.recentsong(recent, userid);

	}
	
	public void recentsong(String userid2, String recent) {

		Queue<String> queue = map.get(userid2);
		if (queue == null) {
			queue = new LinkedList<>();
			map.put(userid2, queue);
		}

		if (queue.size() >= capacity) {
			queue.poll();
		}

		queue.add(recent);
  
		System.out.println("~~~~~~");
		System.out.println("Current playlist of user: " + map.get(userid2));
		System.out.println("Current playlist of all users: " + map);
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Songrecent sc = new Songrecent();

		sc.adduser("User1", "S1");

	}

}
