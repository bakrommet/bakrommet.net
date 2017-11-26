package net.bakrommet.app.controller.auth0;

import com.auth0.AuthenticationController;
import net.bakrommet.app.config.security.AppSecurityConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("unused")
@Controller
public class LoginController {

    @Autowired
    private AuthenticationController controller;
    @Autowired
    private AppSecurityConfig appSecurityConfig;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    protected String login(final HttpServletRequest req) {
        logger.debug("Performing login");

        String redirectUri = redirectHost(req) + "/callback";
        String authorizeUrl = controller.buildAuthorizeUrl(req, redirectUri)
                .withAudience(String.format("https://%s/userinfo", appSecurityConfig.getDomain()))
                .build();
        return "redirect:" + authorizeUrl;
    }

    private String redirectHost(HttpServletRequest req) {
        if ("localhost".equals(req.getServerName())) {
            return "http://localhost:" + req.getServerPort();
        } else {
            return "https://www.bakrommet.net";
        }
    }

}
