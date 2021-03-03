package org.geektimes.projects.user.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.geektimes.web.mvc.controller.PageController;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/3/4 12:38 上午
 **/
@Path("/user")
public class RegistionController implements PageController {

    @GET
    @Path("/regist")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        //注册逻辑 todo
        return "registSuccess.jsp";
    }
}
