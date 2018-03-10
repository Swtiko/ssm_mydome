package initilalizer;



import config.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebApplicationInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class<?>[]{
                    WebSecurityConfig.class,
                    RootConfig.class,
                    HttpSessionConfig.class,
                    CachingConfig.class
            };
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class<?>[]{WebConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }
}