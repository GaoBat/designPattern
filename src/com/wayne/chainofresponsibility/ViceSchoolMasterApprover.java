package com.wayne.chainofresponsibility;

public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processApprover(ApproverRequest approverRequest) {
        if (approverRequest.getPrice()>10000 && approverRequest.getPrice() <= 30000) {
            System.out.println("请求编号 id="+approverRequest.getId()+" 被 "+this.name+" 处理");
        } else {
            next.processApprover(approverRequest);
        }
    }
}
