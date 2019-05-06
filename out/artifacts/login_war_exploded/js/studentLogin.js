$("#submit").click(function(){
   	var username=$("#username").val();
   	var password=$("#password").val();
   	$.ajax({
   		url: 'http://188.131.244.33:8080/login/Servlet',
   		type: 'POST',
   		data: {
   			name:username,
   			pwd:password,
   		},
         dataType:"json",
   		success:function(data){
   		    if(data.success==true){
               alert("报名成功");
               $(".remind").text("");
   		    	// sessionStorage.setItem('name', data.name);
   		    	// sessionStorage.setItem('isAdmin', data.isAdmin);
   		    	// window.location.href = '../allContest/allContest.html';
   		    }
          else{
            $(".remind").text(data.errMsg);
          }
   		}
   	})
})