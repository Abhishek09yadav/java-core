package com.learning.core.day4;

class Applicant {
    private String applicationName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicationName, String postApplied, int applicantAge) {
        this.applicationName = applicationName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

