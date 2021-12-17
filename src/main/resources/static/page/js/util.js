const getQueryVariable = variable => {
    let query = window.location.search.substring(1);
    let vars = query.split("&");
    for (let i = 0; i < vars.length; i++) {
        let pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return '';
};
function getApplicationName(){
    return window.location.href.split("page")[0];
}
var baseUrl = getApplicationName();
const url = {
    loginUrl: './login.html',//登录页面
    orderUrl : './orderList.html',//订单页面
    productUrl: './productList.html',//产品页面
    itemUrl: './itemList.html',//明细页面
    queryList: baseUrl + 'applyinfo/querylist',//订单列表查询接口 -对应excel页签 S2订单列表
    queryDetailList: baseUrl + 'applyinfo/querydetaillist',//产品明细表查询接口 -对应excel页签 S3产品明细表
    queryItemList: baseUrl + 'applyinfo/queryitemlist',//录入记录查询接口 -对应excel页签 S4明细录入界面

}
const util = {
    methods: {
        /**
         * 错误提示框
         */
        error(msg){
            vm.$toast.fail(msg);
        },
        /**
         * 成功提示框
         */
        success(msg){
            vm.$toast.success(msg);
        },
        execAjax(url,param){
            vm.loading = true;
            axios.post(url, param).then(function (response) {
                response = response.data;
                if (response.result == 'ok') {
                    vm.success(result.msg ? result.msg : "操作成功");
                    vm.handleSubmit(null);
                    vm.loading = false;
                }else {
                    vm.error(response.result);
                    vm.loading = false;
                }
            }).catch(function (error) {
                console.log(error);
            });
        },
        queryData(url,param){
            axios.post(url, param).then(function (response) {
                response = response.data;
                if (response.result == 'ok') {
                    vm.list = response.data;
                    vm.loading = false;
                }else {
                    vm.error(response.result);
                    vm.loading = false;
                }
            }).catch(function (error) {
                console.log(error);
            });
        }
    }
}
