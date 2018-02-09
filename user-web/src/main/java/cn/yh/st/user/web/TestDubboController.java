package cn.yh.st.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yh.st.user.entity.Userinfo;
import cn.yh.st.user.service.PmsUserFacade;

@Controller
public class TestDubboController {
	@Autowired
	private PmsUserFacade pmsUserFacade;

	@RequestMapping("getName")
	public String getName() {
		System.out.println(11111);
		System.out.println(pmsUserFacade.findUser(1l));
		Userinfo u = new Userinfo();
		u.setPassword("1243234");
		pmsUserFacade.insert(u);
		return "ADBVDSASFA";
	}
}
