package io.man.mavenweb.web.action;

import com.opensymphony.xwork2.ActionSupport;
import io.man.mavenweb.entity.Dep;
import io.man.mavenweb.service.DepService;
import lombok.Setter;
import org.apache.struts2.ServletActionContext;

import java.util.List;

@Setter
public class DepAction extends ActionSupport{

    private DepService depService;

    public String getList() {
        List<Dep> list = depService.getList();
        ServletActionContext.getRequest().setAttribute("list",list);
        return "list";
    }

}
