package com.qpp.longago.tool;

import com.qpp.comiccps.exception.BusinessException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static String getdate(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date());
	}
	
	public static String getdate_yyyy_MM_dd(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		return df.format(new Date());
	}  
	public static String getdate_yyyy_MM_dd_HH_MM_SS(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date());
	}  
	public static String dateToTimeStamp(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		return df.format(date);
    }
	public static String getdate_yyyy_MM_dd_Hms(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(date);
	}
	public static Date getdate_yyyy_MM_dd_00_00_00(String startDate){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		Date date = null;
		try {
			date = df.parse(startDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String getYesterday(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
	}
	/**
	 * 将时间转化为本地星期
	 * @author Administrator
	 *
	 */

	public static void main(String[] args) throws ParseException {
	String currentTime = String.format("%tF%n", new Date(System.currentTimeMillis()));
	System.out.println("当前时间:"+currentTime);
	String result = getDayDiff("2016-02-28", currentTime);
	System.out.println("显示的时间格式:"+result);
	}
	/**
	* 得到时间差 yyyy-MM-dd 格式
	* @param time
	* @return
	* @throws ParseException
	*/
	public static String getDayDiff(String time) throws ParseException{
	String currentTime = String.format("%tF%n", new Date(System.currentTimeMillis()));
	return getDayDiff(time, currentTime);
	}
	/**
	* 得到时间差 yyyy-MM-dd 格式
	* @param fDateStr 需要计算的时间
	* @param oDateStr 应该传入当前时间
	* @return 
	* @throws ParseException
	*/
	public static String getDayDiff(String fDateStr, String oDateStr) throws ParseException{
	int result = daysOfTwo(fDateStr, oDateStr);
	String timeResult = "";
	switch (result) {
	case -1:
	timeResult = "请检查时间";
	break;
	case 0:
	timeResult = "今天";
	break;
	case 1:
	timeResult = "昨天";
	break;
	default:
	timeResult = String.format("%tA%n", getDateFormat(fDateStr));
	break;
	}
	if(Math.abs(result) > 7){//假如时间大于7天
	timeResult = fDateStr;
	}
	return timeResult;
	}
	/**
	* 判断时间相差几天
	* @return 时间为-1时，请检查代码
	* @throws ParseException 
	*/
	public static int daysOfTwo(String fDateStr, String oDateStr) throws ParseException {
	Date fDate = getDateFormat(fDateStr);
	Date oDate = getDateFormat(oDateStr);
	Calendar aCalendar = Calendar.getInstance();
	aCalendar.setTime(fDate);
	int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
	aCalendar.setTime(oDate);
	int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
	return day2 - day1;
	}


	/**
	* 将时间转换为 Date类型
	* @param time yyyy-MM-dd格式
	* @return
	* @throws ParseException 
	*/
	public static Date getDateFormat(String time) throws ParseException{
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	return sdf.parse(time);
	}

	/**
	 *    验证开始时间是否大于结束时间
	 *
	 * @author pengpai
	 * @date 2018/4/25 17:26
	 * @param startDate, endDate
	 * @return boolean
	 */
	public static boolean checkLongDate(String startDate, String endDate) {
		if (!ParaClick.clickString(startDate) && !ParaClick.clickString(endDate)) {
			Long start = 0L;
			Long end = 0L;
			start = DateUtil.getdate_yyyy_MM_dd_00_00_00(startDate + " 00:00:00").getTime();
			end = DateUtil.getdate_yyyy_MM_dd_00_00_00(endDate + " 23:59:59").getTime();
			if (start > end) {
				return false;
			}
			return true;
		}else if ((ParaClick.clickString(startDate)&&!ParaClick.clickString(endDate))
				|| (!ParaClick.clickString(startDate)&&ParaClick.clickString(endDate))) {
			return false;
		}else {
			return true;
		}
	}

	/**
	 *    检查时间 如果错误跑出异常 正确则判断是否为空 如果为空则赋值今天时间
	 *
	 * @author pengpai
	 * @date 2018/4/25 19:05
	 * @param pageInfo
	 * @return com.qpp.comiccps.tool.PageInfo
	 */
	public static PageInfo checkTodayTime(PageInfo pageInfo) {
		if (!checkLongDate(pageInfo.getStartDate(),pageInfo.getEndDate())) {
			throw new BusinessException("时间错误");
		}
		if (ParaClick.clickString(pageInfo.getStartDate()) && ParaClick.clickString(pageInfo.getEndDate())){
			pageInfo.setStartDate(DateUtil.getdate_yyyy_MM_dd());
			pageInfo.setEndDate(DateUtil.getdate_yyyy_MM_dd());
		}
		if (ParaClick.clickString(pageInfo.getCondition()) ) {
			pageInfo.setCondition(null);
		}
		return pageInfo;
	}

	/**
	 *    检查时间 如果错误跑出异常 正确则判断是否为空 如果为空则赋值昨天时间
	 *
	 * @author pengpai
	 * @date 2018/4/25 19:07
	 * @param pageInfo
	 * @return com.qpp.comiccps.tool.PageInfo
	 */
	public static PageInfo checkYesterdayTime(PageInfo pageInfo) {
		if (!checkLongDate(pageInfo.getStartDate(),pageInfo.getEndDate())) {
			throw new BusinessException("时间错误");
		}
		if (ParaClick.clickString(pageInfo.getStartDate()) && ParaClick.clickString(pageInfo.getEndDate())){
			pageInfo.setStartDate(DateUtil.getYesterday());
			pageInfo.setEndDate(DateUtil.getYesterday());
		}
		if (ParaClick.clickString(pageInfo.getCondition())){
			pageInfo.setCondition(null);
		}
		return pageInfo;
	}

	/**
	 *    检查时间 如果错误跑出异常 正确则判断是否为空 如果为空则赋值为null
	 *
	 * @author pengpai
	 * @date 2018/5/3 17:33
	 * @param pageInfo
	 * @return com.qpp.comiccps.tool.PageInfo
	 */
	public static PageInfo checkPageInfo(PageInfo pageInfo) {
		if (!checkLongDate(pageInfo.getStartDate(),pageInfo.getEndDate())) {
			throw new BusinessException("时间错误");
		}
		if (ParaClick.clickString(pageInfo.getStartDate()) && ParaClick.clickString(pageInfo.getEndDate())){
			pageInfo.setStartDate(null);
			pageInfo.setEndDate(null);
		}
		if (ParaClick.clickString(pageInfo.getCondition())){
			pageInfo.setCondition(null);
		}
		return pageInfo;
	}

	public static PageInfo checkDateByTrendMap(PageInfo pageInfo) {
		if (!checkLongDate(pageInfo.getStartDate(),pageInfo.getEndDate())) {
			throw new BusinessException("时间错误");
		}
		if (ParaClick.clickString(pageInfo.getStartDate()) && ParaClick.clickString(pageInfo.getEndDate())){
			// 获取昨天的日期
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -7);
			String thatDay = new SimpleDateFormat("yyyy-MM-dd").format(cal
					.getTime());
			pageInfo.setStartDate(thatDay);
			pageInfo.setEndDate(getdate_yyyy_MM_dd());
		}
		return pageInfo;
	}
}
