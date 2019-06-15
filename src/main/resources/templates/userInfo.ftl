<#import "parts/common.ftl" as c>

<@c.page>
<div class="mb-1">User's information</div>
<form method="post" enctype="multipart/form-data">
    <div class="form-group">
        <input type="text" class="form-control" name="firstName" placeholder="First Name" />
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="lastName" placeholder="Last Name">
    </div>
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <div class="form-group">
        <button type="submit" class="btn btn-primary">Save</button>
    </div>
</form>
</@c.page>