
package springboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	public void  save(UserRepository userRepository);
	//public List<Course> findByTopicId(String topicId);

}
