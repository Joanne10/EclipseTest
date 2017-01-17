package task7;

import javax.servlet.http.HttpServletRequest;

import task7.model.Model;

public class LoginAction extends Action {
	public LoginAction(Model model) {
		
    }
	@Override
	public String getName() {
		return "login.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		return "login.jsp";
	}
	
}
