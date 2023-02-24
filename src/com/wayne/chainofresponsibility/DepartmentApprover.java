package com.wayne.chainofresponsibility;

public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processApprover(ApproverRequest approverRequest) {
        if (approverRequest.getPrice()<=5000) {
            System.out.println("请求编号 id="+approverRequest.getId()+" 被 "+this.name+" 处理");
        } else {
            next.processApprover(approverRequest);
        }
    }
}
