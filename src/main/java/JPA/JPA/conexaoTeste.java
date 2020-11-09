package JPA.JPA;

import javax.persistence.EntityManager;

import util.JpaUtil;

public class conexaoTeste {

	public static void main(String[] args) {
		EntityManager ent = JpaUtil.getEntityManager();
		System.out.println(ent.isOpen());
	}

}
