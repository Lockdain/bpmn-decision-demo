package ru.neoflex.decision.bpms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
public class ApplicantBean implements Serializable {
    private static final long serialVersionUID = -3760445487636086034L;

    private String sourceChannel;
    private boolean isApplicant;
    private int loanQty;
    private String gender;
    private int age;
    private String maritalStatus;
    private int noOfChildren;
    private String education;
    private int workExperienceYears;
    private boolean isCreditHistoryAvailable;
}
