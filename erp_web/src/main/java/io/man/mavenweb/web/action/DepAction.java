package io.man.mavenweb.web.action;

import com.opensymphony.xwork2.ActionSupport;
import io.man.mavenweb.entity.Dep;
import io.man.mavenweb.service.DepService;
import lombok.Setter;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Setter
@Controller
@Namespace("/")
@Scope("prototype")
public class DepAction extends ActionSupport{

    @Autowired
    private DepService depService;

    @Action(value = "getList",results = {@Result(name = "list",location = "/index.jsp")})
    public String getList() {
        List<Dep> list = depService.getList();
        ServletActionContext.getRequest().setAttribute("list",list);
        return "list";
    }

}
