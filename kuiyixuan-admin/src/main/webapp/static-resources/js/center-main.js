/**
 * Created by 许勇进 on 2015-12-6.
 */
$(function (){
    $.falseLink();
});
(function($) {
    "use strict";

    /**
     * 让class为disabled的超链接失效
     */
    $.falseLink = function() {
        $("a.disabled").click(function(){return false});
    }
})(jQuery);
