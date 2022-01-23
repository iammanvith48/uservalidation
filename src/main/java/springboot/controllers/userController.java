package springboot.controllers;
import springboot.entities.User;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	@Autowired
	private  UserService userService;

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable Integer id)
	{
		return userService.getUser(id);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser( @Valid @RequestBody User users )
	{
		userService.adduser(users);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateTopic(@RequestBody User users,@PathVariable Integer id) {
		userService.updateUser(id,users);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteTopic(@PathVariable Integer id)
	{
		userService.deleteUser(id);
	}
}