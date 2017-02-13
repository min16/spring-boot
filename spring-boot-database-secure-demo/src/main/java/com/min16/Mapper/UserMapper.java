package com.min16.Mapper;

import java.util.List;
import com.min16.Domain.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
     User readUser(String username);
     List<GrantedAuthority> readAuthority(String username);
}