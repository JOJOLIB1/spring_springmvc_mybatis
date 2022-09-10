var vue = new Vue({
    el: "#table",
    methods: {
        sendDel : function (event) {
            $("#del").attr("action",event.target.href)
            $("#del").submit()
            event.preventDefault()
        }
    }
});