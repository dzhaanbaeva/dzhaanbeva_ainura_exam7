package com.attractor.exam7.service;

import com.attractor.exam7.model.Client;
import com.attractor.exam7.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserAuthService implements UserDetailsService {
    @Autowired
    private ClientRepository repo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Client> user = repo.findByUsername(s);
        if (user.isPresent())
            return user.get();

        throw new UsernameNotFoundException("User does not exit");
    }
}
