package hello.core.member;

import hello.core.AppConfig;
import hello.core.order.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
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
