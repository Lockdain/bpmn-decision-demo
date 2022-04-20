package ru.neoflex.decision.bpms.model.generator;

import org.springframework.stereotype.Component;
import ru.neoflex.decision.bpms.model.ApplicantBean;

@Component
public class ApplicantGenerator implements RandomValues {

    public ApplicantBean getRandomApplicantProfile() {
        ApplicantBean applicantBean = new ApplicantBean();
        applicantBean.setApplicant(random.nextBoolean());
        applicantBean.setAge(random.nextInt(70) + 15);
        applicantBean.setGender(randomGender());
        applicantBean.setEducation(randomEducation());
        applicantBean.setSourceChannel(randomSourceChannel());
        applicantBean.setLoanQty(random.nextInt(5));
        applicantBean.setMaritalStatus(randomMaritalStatus());
        applicantBean.setNoOfChildren(random.nextInt(5));
        applicantBean.setWorkExperienceYears(random.nextInt(20));
        applicantBean.setCreditHistoryAvailable(random.nextBoolean());

        return applicantBean;
    }

}
