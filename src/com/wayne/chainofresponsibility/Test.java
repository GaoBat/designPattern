package com.wayne.chainofresponsibility;
//https://blog.csdn.net/zhenghuishengq/article/details/126809945
//职责链模式:就是将链中的每一个节点看作是一个对象,每个节点处理请求均不同,且内部自动维护一个下一个节点对象
//当请求从链条的首端出发时,会沿着链的路径依次传递给每一个节点的对象,直到有对象处理这个请求为止
//就是说每个节点会处理一件事情,如果节点出现异常那么链路就会中断
//如springmvc流程、mybatis执行流程、spring的过滤器和拦截器、sentinel限流熔断都使用了责任链模式
public class Test {
    public static void main(String[] args) {
        ApproverRequest approverRequest = new ApproverRequest(1, 31000, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
        departmentApprover.setNext(collegeApprover);
        collegeApprover.setNext(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNext(schoolMasterApprover);
        //单项责任链这里可以不加
        schoolMasterApprover.setNext(departmentApprover);

        departmentApprover.processApprover(approverRequest);
        viceSchoolMasterApprover.processApprover(approverRequest);
    }
}
