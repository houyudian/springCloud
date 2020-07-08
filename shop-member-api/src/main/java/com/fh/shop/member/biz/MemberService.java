package com.fh.shop.member.biz;

import com.fh.shop.common.ServerResponse;
import com.fh.shop.member.po.Member;

public interface MemberService {
    ServerResponse addMember(Member member);

    ServerResponse validateMember(String name);

    ServerResponse validateMail(String mail);

    ServerResponse validatePhone(String phone);

    ServerResponse login(String name, String pwd);

}
