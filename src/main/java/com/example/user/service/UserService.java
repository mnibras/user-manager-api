package com.example.user.service;

import com.example.user.domain.User;
import com.example.user.domain.UserPrincipal;
import com.example.user.exception.EmailExistException;
import com.example.user.exception.EmailNotFoundException;
import com.example.user.exception.UserNotFoundException;
import com.example.user.exception.UsernameExistException;
import org.springframework.http.HttpHeaders;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email)
            throws UsernameExistException, EmailExistException, UserNotFoundException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked,
                    boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail,
                    String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

    void deleteUser(long id);

    void resetPassword(String email) throws EmailNotFoundException;

    User updateProfileImage(String username, MultipartFile newProfileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;


}
