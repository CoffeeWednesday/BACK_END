package com.clone.carrotmarket.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="TBL_MEMBER")
@ToString
@Getter

public class MemberData implements UserDetails{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(unique = true, name="USERID")
   private String userId;
   @Column(name="USERPW")
   private String userPw;
   @Column(name="USERNAME")
   private String userName;

   public MemberData(String userId, String userPw, String userName){
    this.userId = userId;
    this.userPw = userPw;
    this.userName = userName;
    }
    public MemberData(){}

    @Override
    public String getPassword(){
        return this.userPw;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        // for(int i=0; i<memberAuthorities.size(); i++){
        //     list.add(new SimpleGrantedAuthority(memberAuthorities.get(i).getAuthorityNo().getAuthorityName()));
        // }
        return list;
    }
    @Override
    public String getUsername() {
        return this.userName;
    }
}
