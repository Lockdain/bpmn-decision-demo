package ru.neoflex.decision.bpms.stage;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.neoflex.decision.bpms.model.ApplicantBean;
import ru.neoflex.decision.bpms.model.generator.ApplicantGenerator;

@Component
public class UserProfile implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        ApplicantBean applicantBean = new ApplicantGenerator().getRandomApplicantProfile();

        delegateExecution.setVariable("sourceChannel", applicantBean.getSourceChannel());
        delegateExecution.setVariable("isApplicant", applicantBean.isApplicant());
        delegateExecution.setVariable("loanQty", applicantBean.getLoanQty());
        delegateExecution.setVariable("gender", applicantBean.getGender());
        delegateExecution.setVariable("age", applicantBean.getAge());
        delegateExecution.setVariable("maritalStatus", applicantBean.getMaritalStatus());
        delegateExecution.setVariable("education", applicantBean.getEducation());
        delegateExecution.setVariable("workExperienceYears", applicantBean.getWorkExperienceYears());
        delegateExecution.setVariable("isCreditHistoryAvailable", applicantBean.isCreditHistoryAvailable());
        delegateExecution.setVariable("noOfChildren", applicantBean.getNoOfChildren());

    }
}
