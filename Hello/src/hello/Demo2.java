package hello;

import java.awt.Checkbox;
public class Demo2 {

	public static void main(String[] args) {
		Player P = new Player(99);
		Demo2 dem = new Demo2();
		 get(P);
	}
	public static void get(Player P){
		if (P.getLevel()>80) {
			System.out.println("超神玩家");
			
		}else{
			System.out.println("普通玩家");
		}
	}
}
