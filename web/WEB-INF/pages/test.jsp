<%--
  Created by IntelliJ IDEA.
  User: SZK
  Date: 2018/9/3
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>抢红包页面测试</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.js"/>
    <script type="text/javascript">
        $(document).ready(function(){
            var max = 30000;
            for(var i = 1; i<=max ; i++){
                $.post({
                    url:"./userRedPacket/grabRedPacket?redPacketId=1&userId="+i,
                    success:function(result){}
                });
            }
        });
    </script>
</head>
<body>
测试抢红包页面
</body>
</html>
