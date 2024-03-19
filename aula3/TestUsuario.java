package aula3;

import java.util.Collections;

public class TestUsuario {
	
	public static void main(String arg[]) { 
		Usuario bababoey3003 = new Usuario("Bababoey");
		Post babaPost1 = new Post("Bababoey!!");
		Post babaPost2 = new Post("Bababo");
		Post babaPost3 = new Post("Bababo!! Bababoeyy");
		
		bababoey3003.getPosts().add(babaPost1);
		bababoey3003.getPosts().add(babaPost2);
		bababoey3003.getPosts().add(babaPost3);
		
		System.out.println(bababoey3003.getPosts());
		System.out.println(Collections.sort(Post));

	}
}
