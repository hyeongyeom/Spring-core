package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

import static hello.core.member.Grade.VIP;

public class OrderApp {
    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId=1L;
        Member member=new Member(memberId,"memberA",Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);


    }
}
