
// import org.hibernate.Session;
// import org.hibernate.SessionFactory;

// import com.scaleupindia.config.DatabaseConfig;
// import com.scaleupindia.owner.Pet;

// public class PetRepositoryimpl{
//     private final SessionFactory sessionFactory = DatabaseConfig.buildSessionFactory();

//     public static Pet findpetid(int petId){
//         try(Session session = sessionFactory.OpenSession()){
//             return session.get(Pet.class , petId);
//         }
//     }
// }