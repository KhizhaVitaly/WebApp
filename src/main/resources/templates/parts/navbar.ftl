<#include "security.ftl">
<#import "login.ftl" as l>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">WebApplication</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/main">Messages</a>
            </li>
            <#if isAdmin>
            <li class="nav-item">
                <a class="nav-link" href="/user">List of users</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/userInfo">User's information</a>
            </li>
            <#elseif isUser>
            <li class="nav-item">
                <a class="nav-link" href="/userInfo">User's information</a>
            </li>
            </#if>
        </ul>
        <div class="navbar-text-dark mr-3">${name}</div>
        <#if isUser>
        <@l.logout />
        </#if>
    </div>
</nav>