package com.example.demo.reserve.vo;

import com.example.demo.member.vo.Member;
import com.example.demo.overlap.Address;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReserveResponseDto {
    private Long id;
    private Member member;
    private LocalDate date;
    private String description;
    private String name;
    private Address address;
    private String tel;
    private String op_time;

    public ReserveResponseDto(Reserve entity) {
        this.id = entity.getId();
        this.member = getMember();
        this.date = entity.getDate();
        this.description = entity.getDescription();
        this.name = entity.getName();
        this.setAddress(entity.getAddress());
        this.tel = entity.getTel();
        this.op_time = entity.getOp_time();
    }
}
