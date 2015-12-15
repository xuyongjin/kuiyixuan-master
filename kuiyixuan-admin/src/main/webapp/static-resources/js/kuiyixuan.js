/**
 * Created by 许勇进 on 2015-12-8.
 */

function adduser() {
    var userName = $('#userName').val();
    var email = $('#email').val();
    var phone = $('#phone').val();
    var isAdmin = $('#isAdmin').val();
    var options = {userName:userName,email:email,phone:phone,isAdmin:isAdmin};
    $.ajax({
        url:"/user/add",
        data:options,
        type:"post",
        success:function(data,json) {
            var ajaxObject = data.ajaxObject;
            var resultMsg = ajaxObject.resultMsg;
            alert(resultMsg);
        }
    });
}
