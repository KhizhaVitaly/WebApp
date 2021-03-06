<#assign
    session = Session.SPRING_SECURITY_CONTEXT??
>

<#if session>
    <#assign
        user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
        name = user.getUsername()
        isAdmin = user.isAdmin()
        isUser = user.isUser()
    >
<#else>
    <#assign
        name = "Guest"
        isAdmin = false
        isUser = false
    >
</#if>