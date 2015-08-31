package org.snow.sys.web;

import org.framework.basic.constant.Constants;
import org.framework.basic.system.BaseException;
import org.framework.basic.system.ResponseEntity;
import org.snow.sys.entity.User;
import org.snow.sys.servce.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by snow on 2015/8/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping
    public String index() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String insert(User u, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            userService.insert(u);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(User u, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            userService.update(u);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(String id, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            userService.deleteById(id);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            List<User> userList = userService.getAll();
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
            resp.setData(userList);
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }

        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public String getOne(String id, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            User u = userService.getById(id);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
            resp.setData(u);
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
    public String getOne(Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            userService.deleteAll();
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.GET)
    public String deleteByPrimaryKey(User u, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            userService.delete(u);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/queryById", method = RequestMethod.GET)
    public String queryById(String id, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            User u = userService.queryById(id);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
            resp.setData(u);
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }

    @RequestMapping(value = "/queryBitById", method = RequestMethod.GET)
    public String queryBItById(String id, Model model) {
        ResponseEntity resp = new ResponseEntity();
        try {
            User u = userService.queryBitById(id);
            resp.setStatus(Constants.System.SUCCESSS);
            resp.setMessage("添加用户成功");
            resp.setData(u);
        } catch (BaseException e) {
            resp.setStatus(Constants.System.ERROR);
            resp.setError("添加用出错，数据库操作失败");

        }
        model.addAttribute("resp", resp);
        return "add";
    }



}
