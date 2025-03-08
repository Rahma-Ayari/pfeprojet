/*package com.example.springback.Services;

import com.example.springback.Entite.Client;
import com.example.springback.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client = clientRepository.findByEmail(email);
        if (client == null) {
            throw new UsernameNotFoundException("Utilisateur non trouvé");
        }
        return User.withUsername(client.getEmail())
                   .password(client.getPassword())
                   .authorities("USER")  // Ajoutez des rôles ici si nécessaire
                   .build();
    }
}
*/