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
@Order(2) //越小越先执行
public class Myfilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("--------------------filter2-----------------------");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("--------------------filter2 return-----------------------");
    }
}
