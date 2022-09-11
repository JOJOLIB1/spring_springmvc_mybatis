var vue = new Vue({
    el:"#mydiv",
    methods:{
        sendAjax:function (event) {
            axios({
                url:event.target.href,
                method:"get",
                async:true,
                params:{
                    username:"123",
                    password:"134"
                }
            }).then(function (response) {
                alert(response.data)
            })
            event.preventDefault()
        }
    }
})