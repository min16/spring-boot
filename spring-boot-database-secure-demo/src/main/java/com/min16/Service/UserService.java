package com.min16.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by DevNewbie on 2017-02-09.
 */
@Service
public interface UserService extends UserDetailsService {
    Collection<GrantedAuthority> getAuthorities(String username);
}
