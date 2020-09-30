package ua.testing.demo_jpa.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.testing.demo_jpa.entity.MyUserDetails;
import ua.testing.demo_jpa.entity.User;
import ua.testing.demo_jpa.repository.UserRepository;

import java.util.Optional;
@Slf4j
@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));
        log.info("", user.get().getPassword());
        return user.map(MyUserDetails::new).get();
    }
}
