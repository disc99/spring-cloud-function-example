package com.example.demo;

public class HealthFirstMemberRequest {
    String memberId;

    public HealthFirstMemberRequest() {
    }

    public HealthFirstMemberRequest(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
