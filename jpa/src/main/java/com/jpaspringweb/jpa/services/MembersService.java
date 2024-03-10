package com.jpaspringweb.jpa.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaspringweb.jpa.model.Members;
import com.jpaspringweb.jpa.repositories.MemberRepository;

@Service
public class MembersService {

    @Autowired
    private MemberRepository memberRepository;

    public MembersService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void saveMember(Members members)
    {   
        memberRepository.save(members);

    }

    public List<Members> findByMember(String name)
    {
           List<Members> memberlst= memberRepository.findByName(name);
           return memberlst;

    }

    public List<Members> findByjoinYear(int joinYear)
    {
        List<Members> memberlstbyYr=memberRepository.findByJoinYear(joinYear);
        return memberlstbyYr;
    }

    
}
