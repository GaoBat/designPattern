package com.wayne.chainofresponsibility;

public class CollegeApprover extends Approver{
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processApprover(ApproverRequest approverRequest) {
        if (approverRequest.getPrice()>5000 && approverRequest.getPrice() <= 10000) {
            System.out.println("请求编号 id="+approverRequest.getId()+" 被 "+this.name+" 处理");
        } else {
            next.processApprover(approverRequest);
        }
    }
}
