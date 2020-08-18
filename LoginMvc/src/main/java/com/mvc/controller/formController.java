package com.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.model.User;
import com.mvc.service.UserService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;







@Controller
public class formController {
	@Autowired
	private UserService userService;
	

	@RequestMapping("/reg")
	public String showForm(Model m) {
		
		System.out.println("creating");
		return "newUser";
	}
	
@RequestMapping(path="/processform",method = RequestMethod.POST)
public String handleForm(@ModelAttribute User user, Model model)
{
System.out.println(user);
this.userService.createUser(user);

return"sucess";

}

@RequestMapping(value = "/login")
public String viewLogin(Model m) {
	System.out.println("creating");
	return "login";


}

@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
public String doLogin(@RequestParam("empNumber") int empNumber, Model model) {
	
User us = new User();
if(this.userService.Validate(empNumber)) {
return "LoginSuccess";
}
else
{
	return "login";
}

}


//update View
@RequestMapping("/update")
public String showUpdate(Model m) {
	
	System.out.println("Updating");
	return "update";
}
//update process

@RequestMapping(path="/updateProcess",method = RequestMethod.POST)

public String updateProcess(@ModelAttribute User user, Model model) {
	
	  this.userService.createUser(user);
	
	return "LoginSuccess";

}


@RequestMapping("/delete")
public String showdelete(Model m) {
	
	System.out.println("deleting");
	return "delete";
}


@RequestMapping("/deleteProcess")
public String delete(@RequestParam("empNumber") int empNumber,Model m) {
this.userService.deleteeUser(empNumber);
	
return "LoginSuccess";

}


// displaying all

@RequestMapping("/displayAll")
public String home(Model m) {
	List<User> user = userService.diaplayAll();
	m.addAttribute("user",user); // for getting the value and to add to 
	return "displayById";
}

@RequestMapping("/displayAllById")
public String displayById(Model m) {
	
	System.out.println("deleting");
	return "displayById";
}


// displaying by Id
@RequestMapping(path = "/displayProcess",method = RequestMethod.GET)
public String home(@RequestParam("empNumber") int empNumber,Model m) {
	User user = userService.getuserById(empNumber);
	m.addAttribute("user",user); // for getting the value and to add to 
	return "displadatabyId";
}



}
