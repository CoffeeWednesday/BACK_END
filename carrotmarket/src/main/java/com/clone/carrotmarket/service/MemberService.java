package com.clone.carrotmarket.service;

import com.clone.carrotmarket.domain.MemberData;
import com.clone.carrotmarket.dto.MemberDto;
import com.clone.carrotmarket.repository.MemberRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public MemberService(MemberRepository repository, PasswordEncoder passwordEncoder){
        this.memberRepository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public Long registMember(MemberDto memberDto){
        MemberData newMember = new MemberData(memberDto.getMemberId(), passwordEncoder.encode(memberDto.getMemberPw()), memberDto.getMemberName());
        // validateDuplicateMember(newMember);
        memberRepository.save(newMember);
        return newMember.getId();
    }

    // private void validateDuplicateMember(MemberData member) {
    //     memberRepository.findByUserId(member.getUserId())
    //     .ifPresent(m -> {
    //         throw new IllegalStateException("이미 존재하는 회원입니다.");
    //     });
    // }

}
