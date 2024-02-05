<!DOCTYPE html>
<html>

<head>
    <title>寿司官网</title>
</head>

<body>
<h1>欢迎来到寿司官网</h1>
<ul>
    <#-- 循环渲染导航条 -->
    <#list menuItems as item>
        <li>
            <a href="${item.url}">
                ${item.label}
            </a>
        </li>
    </#list>
</ul>
<footer>
    ${currentYear} 寿司官网. All rights reserved.
</footer>
</body>

</html>