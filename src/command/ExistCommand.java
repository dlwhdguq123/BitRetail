package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command  {
	
	public ExistCommand(HttpServletRequest request,HttpServletResponse response) {
		super(request,response);
		HttpSession session = request.getSession();
		switch (Action
				.valueOf(request
				.getParameter("cmd")
				.toUpperCase())) {
		case ACCESS:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeesID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getInstance().existsEmployee(emp);
			if(exist) {
				System.out.println("접근허용");
				
			}else {
				System.out.println("접근실패");
				super.setDomain("home");
				super.setPage("main");
				super.execute();
			}
			
			break;
		case SIGNIN:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("customerID"));
			cus.setPassword(request.getParameter("password"));
			cus = CustomerServiceImpl
					.getInstance()
					.retrieveCustomers(cus);
			if(cus != null) {
				System.out.println("로그인 성공");
				session.setAttribute("customer", cus);
			}else {
				System.out.println("로그인 실패");
				super.setDomain("customer");
				super.setPage("signin");
				super.execute();
			}
				System.out.println("ExistCommand 내부:"+super.getView());
			break;
		
			default:
			break;
	}
}
}