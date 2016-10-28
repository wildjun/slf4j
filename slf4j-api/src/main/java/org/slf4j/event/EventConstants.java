package org.slf4j.event;

import org.slf4j.spi.LocationAwareLogger;
/**
 * 用来定义级别的事件常量值
 * 
 * 然而具体的常量并没有在这里定义，而是在LocationAwareLogger,原因可以在里面找到
 *
 * @author chenys
 * @date 2016年10月28日
 */
public class EventConstants {
    public static final int ERROR_INT = LocationAwareLogger.ERROR_INT;
    public static final int WARN_INT = LocationAwareLogger.WARN_INT;
    public static final int INFO_INT = LocationAwareLogger.INFO_INT;
    public static final int DEBUG_INT = LocationAwareLogger.DEBUG_INT;
    public static final int TRACE_INT = LocationAwareLogger.TRACE_INT;
    public static final String NA_SUBST = "NA/SubstituteLogger";

}
