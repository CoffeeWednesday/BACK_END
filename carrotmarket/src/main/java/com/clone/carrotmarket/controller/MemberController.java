package com.clone.carrotmarket.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clone.carrotmarket.service.MemberService;
import org.springframework.http.ResponseEntity;
import com.clone.carrotmarket.dto.MemberDto;
import com.clone.carrotmarket.domain.MemberData;
import com.clone.carrotmarket.repository.MemberRepository;

@RestController
@RequestMapping("/members")
public class MemberController {
    private MemberService memberService;
    private MemberRepository repository;
    
    public MemberController(MemberRepository repository, MemberService memberService){
        this.repository = repository;
        this.memberService = memberService;
    }

    @PostMapping("/join")
    public ResponseEntity<String> regist(@RequestBody MemberDto dto) {
        System.out.println("가입합니다.");
        try {
            memberService.registMember(dto);
            return ResponseEntity.ok("join success");
        } catch (Exception e) {
            System.out.println("에러 발생");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/all")
    public List<MemberData> findAllMembers(){
        System.out.println("조회합니다.");
        return  repository.findAll();
    }
}
