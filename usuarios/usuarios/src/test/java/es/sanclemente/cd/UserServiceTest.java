package es.sanclemente.cd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    // Caso feliz: el usuario es válido.
    @Test
    void validTestCreateUser() {
        UserRepository userRepository = mock(UserRepository.class);  
        when(userRepository.saveUser(any(User.class))).thenReturn(true);

        UserService userService = new UserService(userRepository);
        boolean result = userService.createUser("testUser", "testcorreo@test.com");

        assertEquals(true, result);
    }

    // El nombre de usuario está vacío.
    @Test
    void emptyUserNameTestCreateUser() {
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.saveUser(any(User.class))).thenReturn(true);
        
        UserService userService = new UserService(userRepository);
        boolean result = userService.createUser(null, "testcorreo@test.com");

        assertEquals(false, result);
    }

    // El correo está vacío.
    @Test
    void emptyEmailTestCreateUser() {
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.saveUser(any(User.class))).thenReturn(true);
        
        UserService userService = new UserService(userRepository);
        boolean result = userService.createUser("testUser", null);

        assertEquals(false, result);
    }

    // Ambos: el nombre de usuario y la contraseña están vacíos.
    @Test
    void emptyUserNameAndEmailTestCreateUser() {
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.saveUser(any(User.class))).thenReturn(true);
        
        UserService userService = new UserService(userRepository);
        boolean result = userService.createUser(null, null);

        assertEquals(false, result);
    }

    @Test
    void testNullDeleteUser() {
        UserRepository userRepository = mock(UserRepository.class);
        UserService userService = new UserService(userRepository);
        
        boolean result = userService.deleteUser(null);
        
        assertEquals(false, result);
    }
    

    @Test
    void testValidDeleteUser() {
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.deleteUserByUsername("testUser")).thenReturn(true);
    
        UserService userService = new UserService(userRepository);
    
        boolean result = userService.deleteUser("testUser");
    
        assertEquals(true, result);
    }
}
