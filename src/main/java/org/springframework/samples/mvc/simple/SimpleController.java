package org.springframework.samples.mvc.simple;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @Autowired
    private TokenService tokenService;
    
	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hello world!";
	}

    /**
     * 开发者模式token校验
     *
     * @param wxAccount 开发者url后缀
     * @param response
     * @param tokenModel
     * @throws ParseException
     * @throws IOException
     */
    @RequestMapping(value = "wechat/check/{wxToken}", method = RequestMethod.GET, produces = "text/plain")
    public @ResponseBody String validate(@PathVariable("wxToken")String wxToken,CheckModel tokenModel) throws ParseException, IOException {
        return tokenService.validate(wxToken,tokenModel);
    }
    
    
    @RequestMapping(value = "wechat/receive", method = RequestMethod.POST)
    public void receive(@RequestBody String x) throws ParseException, IOException {
    	System.out.println("1");
    	System.out.println(x);
    }
    
    @RequestMapping(value = "wechat/t1", method = RequestMethod.POST)
    @ResponseBody
    public String postFoos() {
        return "Post some Foos";
    }
}
