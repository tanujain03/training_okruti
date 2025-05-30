package TanuJain.demo1.Service;

import TanuJain.demo1.Entity.User;
import TanuJain.demo1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

   @Autowired
   public UserRepository userRepository;
//   //for one user
//   public User createUser(User user){
//       return userRepository.save(user);
//   }

   //for multiple users
    public List<User> createUsers(List<User> users){
       return userRepository.saveAll(users);
    }

    //read users
    public List<User> getAllUsers(){
       return userRepository.findAll();
    }

    //get user by id
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    //update user
    public User updateUser(User user){
       User existingUser=userRepository.findById(user.getId()).get();
       existingUser.setFirstName(user.getFirstName());
       existingUser.setLastName(user.getLastName());
       existingUser.setEmail(user.getEmail());
       User updateduser=userRepository.save(existingUser);
       return updateduser;
    }

    //delete user
    public void deleteUser(Long userId){

       userRepository.deleteById(userId);
    }
}
