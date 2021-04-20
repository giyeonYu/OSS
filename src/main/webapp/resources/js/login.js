$(function () {
	initFunction();
});

function initFunction(){
	$('#login_btn').click(function(){
		var id = $('#id').val();
		var pwd = $('#pwd').val();
		$.ajax({
			type : "POST",
			url : "/login",
			data : "id="+id+"&pwd=" + pwd,
			success : function(data){
			if(data == 'fail'){
				$('#result').val("로그인 실패!!");
			}else{
				$('#result').val("로그인 성공!!");
			}
			},
			error : function(data){
				alert('error');
			}
		});
	});
}

