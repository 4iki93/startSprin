package ua.com.owu.dao;

import lombok.Getter;
import lombok.Setter;
import ua.com.owu.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;



@Setter
public class UserDao {

    private EntityManagerFactory entityManagerFactory;

    public void   save (User user){
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(user);

        entityManager.close();
        entityManagerFactory.close();


    }

    /*List<User> findAll (){



        return "";
    }*/
}
