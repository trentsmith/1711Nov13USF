/**
 * 
 */

window.onload = function(){
	$('#login').on('click',login);
	$('#register').on('click',register);
	
}

function login(){
//	alert("logging in");
	var username = $('#username').val();
	var password=$('#pass').val();
//two ways to send to java:
	var toSend=[username, password];
//	var user = {
//				name: username, 
//				password: password
//	};
	
	toSend = JSON.stringify(toSend);
	console.log(toSend);
	
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange=function(){
		if(xhr.readyState == 4 && xhr.status==200){
			console.log("in xhr callback");
		}
	};
	xhr.open("POST","login", true);
	xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xhr.send(json);
	xhr.onreadstatechange = function(){
		console.log("ready state: "+ xhr.readyState);
		if(xhr.readyState == 4 && xhr.status=200){
			console.log("in xhr callback");
		}
		
	}
}

function register(){
	alert("registering");
}