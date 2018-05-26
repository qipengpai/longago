package com.qpp.longago.system;

public class ActionUrl {

    // Cps用户登录
    public static final String STORY_SELECT_TEST="/crxl/qpp/story/selectAll";
    // 创建Cps用户
    public static final String CPS_CREATE_ADMIN="/crxl/qpp/comicCps/createCpsAdmin";
    // 查询所有Cps用户
    public static final String GET_ALL_CPS_ADMIN="/crxl/qpp/comicCps/getAllCpsAdmin";
    // Cps用户修改密码
    public static final String UPDATE_CPS_ADMINPWD="/crxl/qpp/comicCps/updateAdminPwd";
    // 生成平台连接
    public static final String CREATE_PTURL="/crxl/qpp/comicCps/createPtUrl";



    //（条件）分页查询用户列表
    public static final String ADMIN_GET_ALL_USER="/crxl/qpp/comicCps/admin/get/getAllUser";
    //（条件）分页查询用户订单列表
    public static final String ADMIN_GET_ALL_USER_ORDER="/crxl/qpp/comicCps/admin/get/getAllUserOrder";
    //（条件）分页查询用户反馈列表
    public static final String ADMIN_GET_ALL_FEED_BACK="/crxl/qpp/comicCps/admin/get/getAllFeedBack";



    //（条件）分页查询分销商列表
    public static final String ADMIN_GET_ALL_DISTRIBUTOR="/crxl/qpp/comicCps/get/getAllDistributor";
    // 增加分销商
    public static final String ADMIN_ADD_DISTRIBUTOR="/crxl/qpp/comicCps/addDistributor";
    // 修改分销商
    public static final String ADMIN_UPDATE_DISTRIBUTOR="/crxl/qpp/comicCps/updateDistributor";
    // 修改分销商状态为下架状态
    public static final String ADMIN_UPDATE_DISTRIBUTOR_STATE="/crxl/qpp/comicCps/updateDistributorState";
    // 根据id查询分销商
    public static final String ADMIN_GET_DISTRIBUTOR_BYID="/crxl/qpp/comicCps/getDistributorId";
    // 解除绑定Cps用户与分销商
    public static final String BINDING_CPS_DISTRIBUTOR="/crxl/qpp/comicCps/bindingCpsAndDistributor";

    // (条件)分页查看分销商结算单
    public static final String DISTRIBUTOR_WITHDRAWALS_GET="/crxl/qpp/comicCps/distributor/selectWitndrawals";
    // 付款后完成结算单
    public static final String DISTRIBUTOR_WITHDRAWALS_FINISH = "/crxl/qpp/comicCps/finish/distributor/finishWitndrawals";


    // （条件）分页咔咔豆订单查询
    public static final String SELECT_CARTOON_MALL_ORDER = "/crxl/qpp/comicCps/selectKakaBeanOrder";
    // （条件）咔咔豆收益
    public static final String SELECT_CARTOON_MALL_ORDER_TOTAL = "/crxl/qpp/comicCps/selectKakaOrderTotal";



    // 后台查询各公众号现金收益(新)
    public static final String SELECT_CARTOON_PROFIT_NEW = "/crxl/qpp/comicCps/select/cartoon/profit/new";
    // 后台统计公众号粉丝分布
    public static final String SELECT_USER_DISTRIBUTION_BYQD = "/crxl/qpp/comicCps/select/userEntityDistribution";
    // 后台统计公众号粉丝性别
    public static final String SELECT_USER_SEX = "/crxl/qpp/comicCps/select/userEntitySex";
    // 后台统计所有数据
    public static final String SELECT_DATA_STATISTICS = "/crxl/qpp/comicCps/select/dataStatisticsE";
    // 后台查看歷史每日统计数据
    public static final String SELECT_DATA_STATISTICS_EVERYDAY = "/crxl/qpp/comicCps/select/dataStatisticsEveryDay";
    // 后台查看数据趋势统计
    public static final String SELECT_DATA_TRENDMAP = "/crxl/qpp/comicCps/select/dataTrendMap";
    // 后台查看cps每日统计数据
    public static final String SELECT_CPSDATA_STATISTICS = "/crxl/qpp/comicCps/select/cpsDataStatistics";
    // 后台查看cps总统计数据
    public static final String SELECT_CPSTOTALDATA_STATISTICS = "/crxl/qpp/comicCps/select/cpsTotalDataStatistics";
    // 后台生成EXCEL
    public static final String EXPORT_EXCEL="/crxl/qpp/comicCps/exportExcel";
}
