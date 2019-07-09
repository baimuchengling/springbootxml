function login1() {
    var name=document.getElementById("username");
    var pass=document.getElementById("password");
    document.write(name);
    if (name.value == ""||name.value == null||name.value == undefined) {

        window.alert("请输入用户名");
        // name.focus();
        return false;

    } else if (pass.value  == ""||pass.value  == null||pass.value  == undefined) {

        window.alert("请输入密码");
        // pass.focus();
        return false;

    } else {

        return true;
    }
};
