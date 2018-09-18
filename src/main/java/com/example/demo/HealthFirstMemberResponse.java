package com.example.demo;

public class HealthFirstMemberResponse {
    private String memberId;
    private Coverage coverage;

    public enum Coverage {
        MEDICAL, DENTAL, VISION, NONE
    }

    public HealthFirstMemberResponse() {
    }

    public HealthFirstMemberResponse(String memberId, Coverage coverage) {
        this.memberId = memberId;
        this.coverage = coverage;
    }

    public Coverage getCoverage() {
        return coverage;
    }

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
