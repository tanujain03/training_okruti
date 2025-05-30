package TanuJain.demo1.Controller;

import TanuJain.demo1.Entity.User;
import TanuJain.demo1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    //create users
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody List<User> user) {
        userService.createUsers(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Users created successfully");
    }

    //get user by ID
    @GetMapping("{id}")
    public ResponseEntity <User> getUserById(@PathVariable("id") Long id){
    User user=userService.getUserById(id);
    return ResponseEntity.ok(user);
    }

    //get all users
    @GetMapping("getUsers")
    public ResponseEntity <List<User>> getAllUSers(){
        List<User> users=userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PutMapping("updateUser/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody User user){
        user.setId(userId);
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>("user updated Successfully", HttpStatus.OK);
    }

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}
