package aspect;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Around("@annotation(LogExcutionTime)")
    public Object logExcutionTime(ProcedingJinoPoint jinoPoint) throws Throwable{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object ret = jinoPoint.proceed();

        stopWatch.stop();
        logger.info(stopWatch.prettyPrint())

        return ret;
    }
}
