package lyer.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/***
 *@Author icepan
 *@Date 2020/11/6 下午6:22
 *@Description
 *
 ***/

@Component
@Order(1)
public class Myfilter1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("--------------------filter1-----------------------");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("--------------------filter1 return-----------------------");
    }
}
