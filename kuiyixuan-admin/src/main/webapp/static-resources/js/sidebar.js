/**
 * Created by 许勇进 on 2015-12-4.
 */
$(function (){
    $(".sidebar-menu").tree();
});


/**
 *用法
 *   <ul class="sidebar">
 *       <li class="active">
 *           <a href="#">博客</a>
 *           <ul class="sidebar-treemenu">
 *               <li><a href="#">汽车</a></li>
 *               <li><a href="#">飞机</a></li>
 *               <li>
 *                   <a href="#">大炮</a>
 *                   <ul>
 *                       <li><a href="#">汽车</a></li>
 *                       <li><a href="#">飞机</a></li>
 *                       <li><a href="#">大炮</a></li>
 *                   </ul>
 *               </li>
 *           </ul>
 *       </li>
 *   </ul>
 */
(function($) {
    "use strict";
    $.fn.tree = function() {
        var btn = $(this).find("a");
        btn.each(function() {
            var isActive = $(this).parent("li").hasClass("active");
            if(isActive) {
                $(this).next("ul").show();
            } else {
                $(this).next("ul").hide();
            }

            $(this).on("click",function(e) {
                if (isActive) {
                    $(this).next("ul").slideUp();
                    isActive = false;
                    $(this).parent("li").removeClass("active");
                }else {
                    $(this).next("ul").slideDown();
                    isActive = true;
                    $(this).parent("li").addClass("active");
                }
            });
        });
    }
})(jQuery);