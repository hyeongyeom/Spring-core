package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberB", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        String name = findMember.getName();
        //then
        assertThat(name).isEqualTo("memberB");
    }
}
