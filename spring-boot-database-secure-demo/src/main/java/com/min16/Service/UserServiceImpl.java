package com.min16.Service;

import com.min16.Mapper.UserMapper;
import com.min16.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collection;


/**
 * Created by DevNewbie on 2017-02-09.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.readUser(username);
        if(user == null) throw new UsernameNotFoundException("접속자 정보를 찾을 수 없습니다.");
        user.setAuthorities(getAuthorities(username));
        return user;
    }

    public Collection<GrantedAuthority> getAuthorities(String username) {
        Collection<GrantedAuthority> authorities = userMapper.readAuthority(username);
        for( GrantedAuthority authority: authorities) {
            System.out.println("authority: " + authority);
        }
        return authorities;
    }

}